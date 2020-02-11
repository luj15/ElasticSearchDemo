import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;

import java.io.IOException;

/**
 * @author 小和尚
 * @version 1.0.0
 * @ClassName ElasticSearch.Sketch
 * @Description TODO
 * @createTime 2019年12月27日 10:49:00
 */
public class Sketch {
    private String  user_ids;
    private String tag_id;
    private String tag;
    private String tag_level;
    private String tag_property;

    public String getUser_ids() {
        return user_ids;
    }

    public void setUser_ids(String user_ids) {
        this.user_ids = user_ids;
    }

    public String getTag_id() {
        return tag_id;
    }

    public void setTag_id(String tag_id) {
        this.tag_id = tag_id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag_level() {
        return tag_level;
    }

    public void setTag_level(String tag_level) {
        this.tag_level = tag_level;
    }

    public String getTag_property() {
        return tag_property;
    }

    public void setTag_property(String tag_property) {
        this.tag_property = tag_property;
    }

    static XContentBuilder getXContentBuilder(Sketch sketch) throws IOException {
        return XContentFactory.jsonBuilder()
                .startObject()
                .field("user_ids", sketch.getUser_ids())
                .field("tag_id", sketch.getTag_id())
                .field("tag", sketch.getTag())
                .field("tag_level", sketch.getTag_level())
                .field("tag_property", sketch.getTag_property())

                .endObject();
    }
}