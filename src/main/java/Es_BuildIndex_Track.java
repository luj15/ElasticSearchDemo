import org.elasticsearch.action.admin.indices.alias.IndicesAliasesRequestBuilder;
import org.elasticsearch.action.admin.indices.alias.exists.AliasesExistRequestBuilder;
import org.elasticsearch.action.admin.indices.alias.exists.AliasesExistResponse;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequestBuilder;
import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 小和尚
 * @version 1.0.0
 * @ClassName ElasticSearch.Es_BuildIndex_Briefing
 * @Description TODO
 * @createTime 2019年11月25日 18:54:00
 */
public class Es_BuildIndex_Track {

    static final String index_name = "sku_platform_wind_track";
    static final String type_name = "platform_wind_track";
    static final String aliases = "luyupeng_test";

    /**
     * 索引的mapping
     * <p>
     * 预定义一个索引的mapping,使用mapping的好处是可以个性的设置某个字段等的属性
     * Es_Setting.INDEX_DEMO_01类似于数据库
     * mapping 类似于预设某个表的字段类型
     * <p>
     * Mapping,就是对索引库中索引的字段名及其数据类型进行定义，类似于关系数据库中表建立时要定义字段名及其数据类型那样，
     * 不过es的 mapping比数据库灵活很多，它可以动态添加字段。
     * 一般不需要要指定mapping都可以，因为es会自动根据数据格式定义它的类型，
     * 如果你需要对某 些字段添加特殊属性（如：定义使用其它分词器、是否分词、是否存储等），就必须手动添加mapping。
     * 有两种添加mapping的方法，一种是定义在配 置文件中，一种是运行时手动提交mapping，两种选一种就行了。
     *
     * @throws Exception Exception
     */
    protected static void buildIndexMapping(String index_name,String type_name) throws Exception {
        Map<String, Object> settings = new HashMap<>();
        settings.put("number_of_shards", 4);//分片数量
        settings.put("number_of_replicas", 0);//复制数量
        settings.put("refresh_interval", "10s");//刷新时间

        //在本例中主要得注意,ttl及timestamp如何用java ,这些字段的具体含义,请去到es官网查看
        CreateIndexRequestBuilder cib = Es_Utils.client.admin().indices().prepareCreate(index_name);
        cib.setSettings(settings);

        XContentBuilder mapping = XContentFactory.jsonBuilder()
                .startObject()
                .startObject(type_name)//
                .startObject("properties")
                .startObject("@timestamp")
                .field("type", "long")
                .endObject()
                .startObject("name")
                .field("type", "string").field("store", "yes").endObject()
                .startObject("home")
                .field("type", "string").field("index", "not_analyzed")
                .endObject()
                .startObject("now_home")
                .field("type", "string").field("index", "not_analyzed")
                .endObject()
                .startObject("height")
                .field("type", "double")
                .endObject()
                .startObject("age")
                .field("type", "integer")
                .endObject()
                .startObject("birthday")
                .field("type", "string")
                .endObject()
                .startObject("isRealMen")
                .field("type", "boolean")
                .endObject()
                .startObject("lat")
                .field("type","double")
                .endObject()
                .startObject("lon")
                .field("type", "double")
                .endObject()
                .endObject()
                .endObject()
                .endObject();
        cib.addMapping(type_name, mapping);
        cib.execute().actionGet();
    }

    /**
     * 给 []index 创建别名
     * 重载方法可以按照过滤器或者Query 作为一个别名
     *
     * @param aliases aliases别名
     * @param indices 多个 index
     * @return 是否完成
     */
    protected static boolean createAliases(String aliases, String... indices) {
        IndicesAliasesRequestBuilder builder = Es_Utils.client.admin().indices().prepareAliases();
        return builder.addAlias(indices, aliases).execute().isDone();
    }

    /**
     * 查询此别名是否存在
     *
     * @param aliases aliases
     * @return 是否存在
     */
    protected static boolean aliasesExist(String... aliases) {
        AliasesExistRequestBuilder builder =
                Es_Utils.client.admin().indices().prepareAliasesExist(aliases);
        AliasesExistResponse response = builder.execute().actionGet();
        return response.isExists();
    }

    /**
     * 添加记录到es
     * <p>
     * 增加索引记录
     *
     * @param track 添加的记录
     * @throws Exception Exception
     */
    protected static void buildIndex(Track track,String index_name,String type_name) throws Exception {
        // INDEX_DEMO_01_MAPPING为上个方法中定义的索引,prindextype为类型.jk8231为id,以此可以代替memchche来进行数据的缓存
        IndexResponse response = Es_Utils.client.prepareIndex(index_name, type_name)
                .setSource(
                        Track.getXContentBuilder(track)
                )
//                .setTTL(8000)//这样就等于单独设定了该条记录的失效时间,单位是毫秒,必须在mapping中打开_ttl的设置开关
                .execute()
                .actionGet();
        System.out.println("status:"+response.status().getStatus());
    }

    /**
     * 批量添加记录到索引
     *
     * @param list 批量添加数据
     * @throws IOException IOException
     */
    protected static void buildBulkIndex(List<Track> list) throws IOException {
        BulkRequestBuilder bulkRequest = Es_Utils.client.prepareBulk();
        // either use Es_Setting.client#prepare, or use Requests# to directly build index/delete requests

        for (Track track : list) {
            //通过add批量添加
            bulkRequest.add(Es_Utils.client.prepareIndex(index_name, type_name)
                    .setSource(
                            Track.getXContentBuilder(track)
                    )
            );
        }

        BulkResponse bulkResponse = bulkRequest.execute().actionGet();
        //如果失败
        if (bulkResponse.hasFailures()) {
            // process failures by iterating through each bulk response item
            System.out.println("buildFailureMessage:" + bulkResponse.buildFailureMessage());
        }
    }

    public static void main(String[] args) throws Exception {

        Es_Utils.startupClient();

//        Set allIndices = Es_Utils.getAllIndices();
//        if (!allIndices.contains(index_name)){
//            System.out.println(String.format("创建索引 %s", aliases));
//            buildIndexMapping(index_name,type_name);
//        }else {
//            System.out.println(String.format("包含索引%s", index_name));
//        }
//
//        boolean flag = aliasesExist(aliases);
//        if (!flag){
//            System.out.println(String.format("创建aliases %s", aliases));
//            createAliases(aliases,index_name);
//        }else {
//            System.out.println(String.format("包含aliases %s", index_name));
//        }
//        User user = new User("卢宇鹏", "绵阳", "南山", 178, 28, new Date(), true, new Location(108.0, 108.0));
//        for (int i = 0; i <1000 ; i++) {
//            Briefing oneRandomBrief = Briefing.getOneRandomBrief();
//
//            buildIndex(oneRandomBrief,index_name,type_name);
//        }
        List<Track> randomTracks = Track.getRandomTracks(2000);

        buildBulkIndex(randomTracks);
        Es_Utils.shutDownClient();
    }


}