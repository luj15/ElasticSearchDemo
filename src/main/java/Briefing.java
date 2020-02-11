import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author 小和尚
 * @version 1.0.0
 * @ClassName ElasticSearch.Briefing
 * @Description TODO
 * @createTime 2019年12月20日 14:15:00
 */
public class Briefing {

    private float pay_amount;
    private long pay_times;
    private String site_code;
    private String platform;
    private String rnk;
    private float user_click_rate;

    public float getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(float pay_amount) {
        this.pay_amount = pay_amount;
    }

    public long getPay_times() {
        return pay_times;
    }

    public void setPay_times(long pay_times) {
        this.pay_times = pay_times;
    }

    public String getSite_code() {
        return site_code;
    }

    public void setSite_code(String site_code) {
        this.site_code = site_code;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getRnk() {
        return rnk;
    }

    public void setRnk(String rnk) {
        this.rnk = rnk;
    }

    public float getUser_click_rate() {
        return user_click_rate;
    }

    public void setUser_click_rate(float user_click_rate) {
        this.user_click_rate = user_click_rate;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public long getClick_times() {
        return click_times;
    }

    public void setClick_times(long click_times) {
        this.click_times = click_times;
    }

    public long getExposure_times() {
        return exposure_times;
    }

    public void setExposure_times(long exposure_times) {
        this.exposure_times = exposure_times;
    }

    public long getOrder_times() {
        return order_times;
    }

    public void setOrder_times(long order_times) {
        this.order_times = order_times;
    }

    public long getAdd_to_bag_times() {
        return add_to_bag_times;
    }

    public void setAdd_to_bag_times(long add_to_bag_times) {
        this.add_to_bag_times = add_to_bag_times;
    }

    public String getSku_name() {
        return sku_name;
    }

    public void setSku_name(String sku_name) {
        this.sku_name = sku_name;
    }

    public float getExposure_single_price() {
        return exposure_single_price;
    }

    public void setExposure_single_price(float exposure_single_price) {
        this.exposure_single_price = exposure_single_price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getCountry_site() {
        return country_site;
    }

    public void setCountry_site(String country_site) {
        this.country_site = country_site;
    }

    public float getF_transform_rate() {
        return f_transform_rate;
    }

    public void setF_transform_rate(float f_transform_rate) {
        this.f_transform_rate = f_transform_rate;
    }

    private String dt;
    private String country_code;
    private long click_times;
    private long exposure_times;
    private long order_times;
    private long add_to_bag_times;
    private String sku_name;
    private float exposure_single_price;
    private String sku;
    private String items;
    private String country_site;
    private float f_transform_rate;
    static SimpleDateFormat ft = new SimpleDateFormat("YYYYMMdd");

    public Briefing() {
    }

    public Briefing(float pay_amount, long pay_times, String site_code, String platform, String rnk, float user_click_rate, String dt, String country_code, long click_times, long exposure_times, long order_times, long add_to_bag_times, String sku_name
            , float exposure_single_price, String sku, String items, String country_site, float f_transform_rate) {
        this.pay_amount = pay_amount;
        this.pay_times = pay_times;
        this.site_code = site_code;
        this.platform = platform;
        this.rnk = rnk;
        this.user_click_rate = user_click_rate;
        this.dt = dt;
        this.country_code = country_code;
        this.click_times = click_times;
        this.exposure_times = exposure_times;
        this.order_times = order_times;
        this.add_to_bag_times = add_to_bag_times;
        this.sku_name = sku_name;
        this.exposure_single_price = exposure_single_price;
        this.sku = sku;
        this.items = items;
        this.country_site = country_site;
        this.f_transform_rate = f_transform_rate;
    }

    /**
     * 随机生成一个用户信息
     *
     * @return User
     */
    public static Briefing getOneRandomBrief() throws ParseException {
        Random random = new Random();
        Date date = new Date(System.currentTimeMillis()-24*60*60*1000);
        String dt = ft.format(date);
        String platform = random.nextBoolean() ? "ios" : "android";
        return new Briefing(random.nextFloat(), random.nextLong(), "gearbest", platform
                , "rnk" + random.nextInt(100), random.nextFloat()
                , dt, "country" + random.nextInt(100), random.nextLong()
                , random.nextLong(), random.nextLong(), random.nextLong()
                , "sku" + random.nextInt(100), random.nextFloat()
                , "sku" + random.nextInt(100)
                , "item" + random.nextInt(100), "country_site" + random.nextInt(100)
                , random.nextFloat());
    }

    /**
     * 随机生成num个用户信息
     *
     * @param num 生成数量
     * @return List User
     */
    public static List<Briefing> getRandomBriefs(int num) {
        List<Briefing> users = new ArrayList<>();
        Date date = new Date(System.currentTimeMillis()-24*60*60*1000);
        String dt = ft.format(date);
        if (num < 0) num = 10;
        for (int i = 0; i < num; i++) {
            Random random = new Random();
            String platform = random.nextBoolean() ? "ios" : "android";
            users.add(new Briefing(random.nextFloat(), random.nextLong(), "gearbest", platform
                    , "rnk" + random.nextInt(100), random.nextFloat()
                    , dt, "country" + random.nextInt(100), random.nextLong()
                    , random.nextLong(), random.nextLong(), random.nextLong()
                    , "sku" + random.nextInt(100), random.nextFloat()
                    , "sku" + random.nextInt(100)
                    , "item" + random.nextInt(100), "country_site" + random.nextInt(100)
                    , random.nextFloat()));
        }

        return users;
    }

    /**
     * 封装对象的Json信息
     *
     * @param  briefing
     * @return XContentBuilder
     * @throws IOException IOException
     */
    static XContentBuilder getXContentBuilder(Briefing briefing) throws IOException {
        return XContentFactory.jsonBuilder()
                .startObject()
                .field("pay_amount", briefing.getPay_amount())
                .field("pay_times", briefing.getPay_times())
                .field("site_code", briefing.getSite_code())
                .field("platform", briefing.getPlatform())
                .field("rnk", briefing.getRnk())
                .field("user_click_rate", briefing.getUser_click_rate())
                .field("dt", briefing.getDt())
                .field("country_code", briefing.getCountry_code())
                .field("click_times", briefing.getClick_times())
                .field("exposure_times", briefing.getExposure_times())
                .field("order_times", briefing.getOrder_times())
                .field("add_to_bag_times", briefing.getAdd_to_bag_times())
                .field("sku_name", briefing.getSku_name())
                .field("exposure_single_price", briefing.getExposure_single_price())
                .field("sku", briefing.getSku())
                .field("items", briefing.getItems())
                .field("country_site", briefing.getCountry_site())
                .field("f_transform_rate", briefing.getF_transform_rate())
                .endObject();
    }
}