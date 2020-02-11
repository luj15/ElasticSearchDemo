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
public class Track {

    private float pay_amount_sum0;
    private long add_to_wishlist_uv_sum1;
    private float pay_amount_sum1;
    private String dt;
    private long add_to_bag_quantity_sum1;
    private long add_to_bag_quantity_sum0;
    private String sku;
    private long add_to_wishlist_uv_sum0;
    private String country_site;
    private long detail_page_uv_sum1;
    private float user_click_rate_sum0;
    private long pay_times_sum1;
    private long pay_times_sum0;
    private long detail_page_uv_sum0;
    private float user_click_rate_sum1;
    private long exposure_uv_sum0;
    private float order_amount_sum0;
    private long exposure_uv_sum1;
    private float order_amount_sum1;
    private long add_to_wishlist_times_sum1;

    public float getPay_amount_sum0() {
        return pay_amount_sum0;
    }

    public void setPay_amount_sum0(float pay_amount_sum0) {
        this.pay_amount_sum0 = pay_amount_sum0;
    }

    public long getAdd_to_wishlist_uv_sum1() {
        return add_to_wishlist_uv_sum1;
    }

    public void setAdd_to_wishlist_uv_sum1(long add_to_wishlist_uv_sum1) {
        this.add_to_wishlist_uv_sum1 = add_to_wishlist_uv_sum1;
    }

    public float getPay_amount_sum1() {
        return pay_amount_sum1;
    }

    public void setPay_amount_sum1(float pay_amount_sum1) {
        this.pay_amount_sum1 = pay_amount_sum1;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public long getAdd_to_bag_quantity_sum1() {
        return add_to_bag_quantity_sum1;
    }

    public void setAdd_to_bag_quantity_sum1(long add_to_bag_quantity_sum1) {
        this.add_to_bag_quantity_sum1 = add_to_bag_quantity_sum1;
    }

    public long getAdd_to_bag_quantity_sum0() {
        return add_to_bag_quantity_sum0;
    }

    public void setAdd_to_bag_quantity_sum0(long add_to_bag_quantity_sum0) {
        this.add_to_bag_quantity_sum0 = add_to_bag_quantity_sum0;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public long getAdd_to_wishlist_uv_sum0() {
        return add_to_wishlist_uv_sum0;
    }

    public void setAdd_to_wishlist_uv_sum0(long add_to_wishlist_uv_sum0) {
        this.add_to_wishlist_uv_sum0 = add_to_wishlist_uv_sum0;
    }

    public String getCountry_site() {
        return country_site;
    }

    public void setCountry_site(String country_site) {
        this.country_site = country_site;
    }

    public long getDetail_page_uv_sum1() {
        return detail_page_uv_sum1;
    }

    public void setDetail_page_uv_sum1(long detail_page_uv_sum1) {
        this.detail_page_uv_sum1 = detail_page_uv_sum1;
    }

    public float getUser_click_rate_sum0() {
        return user_click_rate_sum0;
    }

    public void setUser_click_rate_sum0(float user_click_rate_sum0) {
        this.user_click_rate_sum0 = user_click_rate_sum0;
    }

    public long getPay_times_sum1() {
        return pay_times_sum1;
    }

    public void setPay_times_sum1(long pay_times_sum1) {
        this.pay_times_sum1 = pay_times_sum1;
    }

    public long getPay_times_sum0() {
        return pay_times_sum0;
    }

    public void setPay_times_sum0(long pay_times_sum0) {
        this.pay_times_sum0 = pay_times_sum0;
    }

    public long getDetail_page_uv_sum0() {
        return detail_page_uv_sum0;
    }

    public void setDetail_page_uv_sum0(long detail_page_uv_sum0) {
        this.detail_page_uv_sum0 = detail_page_uv_sum0;
    }

    public float getUser_click_rate_sum1() {
        return user_click_rate_sum1;
    }

    public void setUser_click_rate_sum1(float user_click_rate_sum1) {
        this.user_click_rate_sum1 = user_click_rate_sum1;
    }

    public long getExposure_uv_sum0() {
        return exposure_uv_sum0;
    }

    public void setExposure_uv_sum0(long exposure_uv_sum0) {
        this.exposure_uv_sum0 = exposure_uv_sum0;
    }

    public float getOrder_amount_sum0() {
        return order_amount_sum0;
    }

    public void setOrder_amount_sum0(float order_amount_sum0) {
        this.order_amount_sum0 = order_amount_sum0;
    }

    public long getExposure_uv_sum1() {
        return exposure_uv_sum1;
    }

    public void setExposure_uv_sum1(long exposure_uv_sum1) {
        this.exposure_uv_sum1 = exposure_uv_sum1;
    }

    public float getOrder_amount_sum1() {
        return order_amount_sum1;
    }

    public void setOrder_amount_sum1(float order_amount_sum1) {
        this.order_amount_sum1 = order_amount_sum1;
    }

    public long getAdd_to_wishlist_times_sum1() {
        return add_to_wishlist_times_sum1;
    }

    public void setAdd_to_wishlist_times_sum1(long add_to_wishlist_times_sum1) {
        this.add_to_wishlist_times_sum1 = add_to_wishlist_times_sum1;
    }

    public long getAdd_to_wishlist_times_sum0() {
        return add_to_wishlist_times_sum0;
    }

    public void setAdd_to_wishlist_times_sum0(long add_to_wishlist_times_sum0) {
        this.add_to_wishlist_times_sum0 = add_to_wishlist_times_sum0;
    }

    public float getExposure_single_price_sum1() {
        return exposure_single_price_sum1;
    }

    public void setExposure_single_price_sum1(float exposure_single_price_sum1) {
        this.exposure_single_price_sum1 = exposure_single_price_sum1;
    }

    public float getExposure_single_price_sum0() {
        return exposure_single_price_sum0;
    }

    public void setExposure_single_price_sum0(float exposure_single_price_sum0) {
        this.exposure_single_price_sum0 = exposure_single_price_sum0;
    }

    public float getF_transform_rate_sum1() {
        return f_transform_rate_sum1;
    }

    public void setF_transform_rate_sum1(float f_transform_rate_sum1) {
        this.f_transform_rate_sum1 = f_transform_rate_sum1;
    }

    public long getClick_times_sum1() {
        return click_times_sum1;
    }

    public void setClick_times_sum1(long click_times_sum1) {
        this.click_times_sum1 = click_times_sum1;
    }

    public float getF_transform_rate_sum0() {
        return f_transform_rate_sum0;
    }

    public void setF_transform_rate_sum0(float f_transform_rate_sum0) {
        this.f_transform_rate_sum0 = f_transform_rate_sum0;
    }

    public long getClick_times_sum0() {
        return click_times_sum0;
    }

    public void setClick_times_sum0(long click_times_sum0) {
        this.click_times_sum0 = click_times_sum0;
    }

    public long getPay_uv_sum1() {
        return pay_uv_sum1;
    }

    public void setPay_uv_sum1(long pay_uv_sum1) {
        this.pay_uv_sum1 = pay_uv_sum1;
    }

    public long getPay_uv_sum0() {
        return pay_uv_sum0;
    }

    public void setPay_uv_sum0(long pay_uv_sum0) {
        this.pay_uv_sum0 = pay_uv_sum0;
    }

    public long getAdd_to_bag_uv_sum0() {
        return add_to_bag_uv_sum0;
    }

    public void setAdd_to_bag_uv_sum0(long add_to_bag_uv_sum0) {
        this.add_to_bag_uv_sum0 = add_to_bag_uv_sum0;
    }

    public long getAdd_to_bag_uv_sum1() {
        return add_to_bag_uv_sum1;
    }

    public void setAdd_to_bag_uv_sum1(long add_to_bag_uv_sum1) {
        this.add_to_bag_uv_sum1 = add_to_bag_uv_sum1;
    }

    public long getTotal_stock_sum1() {
        return total_stock_sum1;
    }

    public void setTotal_stock_sum1(long total_stock_sum1) {
        this.total_stock_sum1 = total_stock_sum1;
    }

    public long getTotal_stock_sum0() {
        return total_stock_sum0;
    }

    public void setTotal_stock_sum0(long total_stock_sum0) {
        this.total_stock_sum0 = total_stock_sum0;
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

    public long getReal_stock_sum1() {
        return real_stock_sum1;
    }

    public void setReal_stock_sum1(long real_stock_sum1) {
        this.real_stock_sum1 = real_stock_sum1;
    }

    public long getOrder_times_sum1() {
        return order_times_sum1;
    }

    public void setOrder_times_sum1(long order_times_sum1) {
        this.order_times_sum1 = order_times_sum1;
    }

    public long getOrder_times_sum0() {
        return order_times_sum0;
    }

    public void setOrder_times_sum0(long order_times_sum0) {
        this.order_times_sum0 = order_times_sum0;
    }

    public long getReal_stock_sum0() {
        return real_stock_sum0;
    }

    public void setReal_stock_sum0(long real_stock_sum0) {
        this.real_stock_sum0 = real_stock_sum0;
    }

    public float getDetail_page_single_price_sum1() {
        return detail_page_single_price_sum1;
    }

    public void setDetail_page_single_price_sum1(float detail_page_single_price_sum1) {
        this.detail_page_single_price_sum1 = detail_page_single_price_sum1;
    }

    public long getDetail_page_times_sum1() {
        return detail_page_times_sum1;
    }

    public void setDetail_page_times_sum1(long detail_page_times_sum1) {
        this.detail_page_times_sum1 = detail_page_times_sum1;
    }

    public float getDetail_page_single_price_sum0() {
        return detail_page_single_price_sum0;
    }

    public void setDetail_page_single_price_sum0(float detail_page_single_price_sum0) {
        this.detail_page_single_price_sum0 = detail_page_single_price_sum0;
    }

    public long getDetail_page_times_sum0() {
        return detail_page_times_sum0;
    }

    public void setDetail_page_times_sum0(long detail_page_times_sum0) {
        this.detail_page_times_sum0 = detail_page_times_sum0;
    }

    public long getClick_uv_sum1() {
        return click_uv_sum1;
    }

    public void setClick_uv_sum1(long click_uv_sum1) {
        this.click_uv_sum1 = click_uv_sum1;
    }

    public long getClick_uv_sum0() {
        return click_uv_sum0;
    }

    public void setClick_uv_sum0(long click_uv_sum0) {
        this.click_uv_sum0 = click_uv_sum0;
    }

    public float getExposure_click_rate_sum1() {
        return exposure_click_rate_sum1;
    }

    public void setExposure_click_rate_sum1(float exposure_click_rate_sum1) {
        this.exposure_click_rate_sum1 = exposure_click_rate_sum1;
    }

    public float getExposure_click_rate_sum0() {
        return exposure_click_rate_sum0;
    }

    public void setExposure_click_rate_sum0(float exposure_click_rate_sum0) {
        this.exposure_click_rate_sum0 = exposure_click_rate_sum0;
    }

    public long getExposure_times_sum0() {
        return exposure_times_sum0;
    }

    public void setExposure_times_sum0(long exposure_times_sum0) {
        this.exposure_times_sum0 = exposure_times_sum0;
    }

    public long getExposure_times_sum1() {
        return exposure_times_sum1;
    }

    public void setExposure_times_sum1(long exposure_times_sum1) {
        this.exposure_times_sum1 = exposure_times_sum1;
    }

    public long getAdd_to_bag_times_sum0() {
        return add_to_bag_times_sum0;
    }

    public void setAdd_to_bag_times_sum0(long add_to_bag_times_sum0) {
        this.add_to_bag_times_sum0 = add_to_bag_times_sum0;
    }

    public long getOrder_uv_sum1() {
        return order_uv_sum1;
    }

    public void setOrder_uv_sum1(long order_uv_sum1) {
        this.order_uv_sum1 = order_uv_sum1;
    }

    public long getOrder_uv_sum0() {
        return order_uv_sum0;
    }

    public void setOrder_uv_sum0(long order_uv_sum0) {
        this.order_uv_sum0 = order_uv_sum0;
    }

    public long getAdd_to_bag_times_sum1() {
        return add_to_bag_times_sum1;
    }

    public void setAdd_to_bag_times_sum1(long add_to_bag_times_sum1) {
        this.add_to_bag_times_sum1 = add_to_bag_times_sum1;
    }

    public long getVitual_stock_sum1() {
        return vitual_stock_sum1;
    }

    public void setVitual_stock_sum1(long vitual_stock_sum1) {
        this.vitual_stock_sum1 = vitual_stock_sum1;
    }

    public long getVitual_stock_sum0() {
        return vitual_stock_sum0;
    }

    public void setVitual_stock_sum0(long vitual_stock_sum0) {
        this.vitual_stock_sum0 = vitual_stock_sum0;
    }

    private long add_to_wishlist_times_sum0;
    private float exposure_single_price_sum1;
    private float exposure_single_price_sum0;
    private float f_transform_rate_sum1;
    private long click_times_sum1;
    private float f_transform_rate_sum0;
    private long click_times_sum0;
    private long pay_uv_sum1;
    private long pay_uv_sum0;
    private long add_to_bag_uv_sum0;
    private long add_to_bag_uv_sum1;
    private long total_stock_sum1;
    private long total_stock_sum0;
    private String site_code;
    private String platform;
    private long real_stock_sum1;
    private long order_times_sum1;
    private long order_times_sum0;
    private long real_stock_sum0;
    private float detail_page_single_price_sum1;
    private long detail_page_times_sum1;
    private float detail_page_single_price_sum0;
    private long detail_page_times_sum0;
    private long click_uv_sum1;
    private long click_uv_sum0;
    private float exposure_click_rate_sum1;
    private float exposure_click_rate_sum0;
    private long exposure_times_sum0;
    private long exposure_times_sum1;
    private long add_to_bag_times_sum0;
    private long order_uv_sum1;
    private long order_uv_sum0;
    private long add_to_bag_times_sum1;
    private long vitual_stock_sum1;
    private long vitual_stock_sum0;

    static SimpleDateFormat ft = new SimpleDateFormat("YYYYMMdd");

    public Track() {
    }

    public Track(float pay_amount_sum0, long add_to_wishlist_uv_sum1, float pay_amount_sum1, String dt
            , long add_to_bag_quantity_sum1, long add_to_bag_quantity_sum0, String sku
            , long add_to_wishlist_uv_sum0, String country_site, long detail_page_uv_sum1
            , float user_click_rate_sum0, long pay_times_sum1, long pay_times_sum0
            , long detail_page_uv_sum0, float user_click_rate_sum1, long exposure_uv_sum0
            , float order_amount_sum0, long exposure_uv_sum1, float order_amount_sum1
            , long add_to_wishlist_times_sum1, long add_to_wishlist_times_sum0
            , float exposure_single_price_sum1, float exposure_single_price_sum0
            , float f_transform_rate_sum1, long click_times_sum1, float f_transform_rate_sum0
            , long click_times_sum0, long pay_uv_sum1, long pay_uv_sum0, long add_to_bag_uv_sum0
            , long add_to_bag_uv_sum1, long total_stock_sum1, long total_stock_sum0
            , String site_code, String platform, long real_stock_sum1, long order_times_sum1
            , long order_times_sum0, long real_stock_sum0, float detail_page_single_price_sum1
            , long detail_page_times_sum1, float detail_page_single_price_sum0
            , long detail_page_times_sum0, long click_uv_sum1, long click_uv_sum0
            , float exposure_click_rate_sum1, float exposure_click_rate_sum0
            , long exposure_times_sum0, long exposure_times_sum1, long add_to_bag_times_sum0, long order_uv_sum1
            , long order_uv_sum0, long add_to_bag_times_sum1, long vitual_stock_sum1, long vitual_stock_sum0) {
        this.pay_amount_sum0 = pay_amount_sum0;
        this.add_to_wishlist_uv_sum1 = add_to_wishlist_uv_sum1;
        this.pay_amount_sum1 = pay_amount_sum1;
        this.dt = dt;
        this.add_to_bag_quantity_sum1 = add_to_bag_quantity_sum1;
        this.add_to_bag_quantity_sum0 = add_to_bag_quantity_sum0;
        this.sku = sku;
        this.add_to_wishlist_uv_sum0 = add_to_wishlist_uv_sum0;
        this.country_site = country_site;
        this.detail_page_uv_sum1 = detail_page_uv_sum1;
        this.user_click_rate_sum0 = user_click_rate_sum0;
        this.pay_times_sum1 = pay_times_sum1;
        this.pay_times_sum0 = pay_times_sum0;
        this.detail_page_uv_sum0 = detail_page_uv_sum0;
        this.user_click_rate_sum1 = user_click_rate_sum1;
        this.exposure_uv_sum0 = exposure_uv_sum0;
        this.order_amount_sum0 = order_amount_sum0;
        this.order_amount_sum1 = order_amount_sum1;
        this.add_to_wishlist_times_sum1 = add_to_wishlist_times_sum1;
        this.add_to_wishlist_times_sum0 = add_to_wishlist_times_sum0;
        this.exposure_single_price_sum1 = exposure_single_price_sum1;
        this.exposure_single_price_sum0 = exposure_single_price_sum0;
        this.f_transform_rate_sum1 = f_transform_rate_sum1;
        this.click_times_sum1 = click_times_sum1;
        this.f_transform_rate_sum0 = f_transform_rate_sum0;
        this.click_times_sum0 = click_times_sum0;
        this.pay_uv_sum1 = pay_uv_sum1;
        this.pay_uv_sum0 = pay_uv_sum0;
        this.add_to_bag_uv_sum0 = add_to_bag_uv_sum0;
        this.add_to_bag_uv_sum1 = add_to_bag_uv_sum1;
        this.total_stock_sum1 = total_stock_sum1;
        this.total_stock_sum0 = total_stock_sum0;
        this.site_code = site_code;
        this.platform = platform;
        this.real_stock_sum1 = real_stock_sum1;
        this.order_times_sum1 = order_times_sum1;
        this.order_times_sum0 = order_times_sum0;
        this.real_stock_sum0 = real_stock_sum0;
        this.detail_page_single_price_sum1 = detail_page_single_price_sum1;
        this.detail_page_times_sum1 = detail_page_times_sum1;
        this.detail_page_single_price_sum0 = detail_page_single_price_sum0;
        this.detail_page_times_sum0 = detail_page_times_sum0;
        this.click_uv_sum1 = click_uv_sum1;
        this.click_uv_sum0 = click_uv_sum0;
        this.exposure_click_rate_sum1 = exposure_click_rate_sum1;
        this.exposure_click_rate_sum0 = exposure_click_rate_sum0;
        this.exposure_times_sum0 = exposure_times_sum0;
        this.exposure_times_sum1 = exposure_times_sum1;
        this.add_to_bag_times_sum0 = add_to_bag_times_sum0;
        this.order_uv_sum1 = order_uv_sum1;
        this.order_uv_sum0 = order_uv_sum0;
        this.add_to_bag_times_sum1 = add_to_bag_times_sum1;
        this.vitual_stock_sum1 = vitual_stock_sum1;
        this.vitual_stock_sum0 = vitual_stock_sum0;
    }

    /**
     * 随机生成一个用户信息
     *
     * @return User
     */
    public static Track getOneRandomBrief() throws ParseException {
        Random random = new Random();
        Date date = new Date(System.currentTimeMillis() - 24 * 60 * 60 * 1000);
        String dt = ft.format(date);
        String platform = random.nextBoolean() ? "ios" : "android";
        return new Track(random.nextFloat(), random.nextLong(), random.nextFloat(), dt, random.nextLong()
                , random.nextLong(), "sku" + random.nextInt(100), random.nextLong(), "country" + random.nextInt(100)
                , random.nextLong(), random.nextFloat(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextFloat()
                , random.nextLong(), random.nextFloat(), random.nextLong(), random.nextFloat(), random.nextLong(), random.nextLong()
                , random.nextFloat(), random.nextFloat(), random.nextFloat(), random.nextLong(), random.nextFloat(), random.nextLong()
                , random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong()
                , "gearbest", platform, random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextFloat()
                , random.nextLong(), random.nextFloat(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextFloat(), random.nextFloat()
                , random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong());
    }

    /**
     * 随机生成num个用户信息
     *
     * @param num 生成数量
     * @return List User
     */
    public static List<Track> getRandomTracks(int num) {
        List<Track> tracks = new ArrayList<>();
        Date date = new Date(System.currentTimeMillis()-24*60*60*1000);
        String dt = ft.format(date);
        if (num < 0) num = 10;
        for (int i = 0; i < num; i++) {
            Random random = new Random();
            String platform = random.nextBoolean() ? "ios" : "android";
            tracks.add(new Track(random.nextFloat(), random.nextLong(), random.nextFloat(), dt, random.nextLong()
                    , random.nextLong(), "sku" + random.nextInt(100), random.nextLong(), "country" + random.nextInt(100)
                    , random.nextLong(), random.nextFloat(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextFloat()
                    , random.nextLong(), random.nextFloat(), random.nextLong(), random.nextFloat(), random.nextLong(), random.nextLong()
                    , random.nextFloat(), random.nextFloat(), random.nextFloat(), random.nextLong(), random.nextFloat(), random.nextLong()
                    , random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong()
                    , "gearbest", platform, random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextFloat()
                    , random.nextLong(), random.nextFloat(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextFloat(), random.nextFloat()
                    , random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong(), random.nextLong()));
        }

        return tracks;
    }

    /**
     * 封装对象的Json信息
     *
     * @param track
     * @return XContentBuilder
     * @throws IOException IOException
     */
    static XContentBuilder getXContentBuilder(Track track) throws IOException {
        return XContentFactory.jsonBuilder()
                .startObject()
                .field("pay_amount_sum0", track.getPay_amount_sum0())
                .field("add_to_wishlist_uv_sum1", track.getAdd_to_wishlist_uv_sum1())
                .field("pay_amount_sum1", track.getPay_amount_sum1())
                .field("dt", track.getDt())
                .field("add_to_bag_quantity_sum1", track.getAdd_to_bag_quantity_sum0())
                .field("add_to_bag_quantity_sum0", track.getAdd_to_bag_quantity_sum0())
                .field("sku", track.getSku())
                .field("add_to_wishlist_uv_sum0", track.getAdd_to_wishlist_uv_sum0())
                .field("country_site", track.getCountry_site())
                .field("detail_page_uv_sum1", track.getDetail_page_uv_sum1())
                .field("user_click_rate_sum0", track.getUser_click_rate_sum0())
                .field("pay_times_sum1", track.getPay_times_sum1())
                .field("pay_times_sum0", track.getPay_times_sum0())
                .field("detail_page_uv_sum0", track.getDetail_page_uv_sum0())
                .field("user_click_rate_sum1", track.getUser_click_rate_sum1())
                .field("exposure_uv_sum0", track.getExposure_uv_sum0())
                .field("order_amount_sum0", track.getOrder_amount_sum0())
                .field("exposure_uv_sum1", track.getExposure_uv_sum1())
                .field("order_amount_sum1", track.getOrder_amount_sum1())
                .field("add_to_wishlist_times_sum1", track.getAdd_to_wishlist_times_sum1())
                .field("add_to_wishlist_times_sum0", track.getAdd_to_wishlist_times_sum0())
                .field("exposure_single_price_sum1", track.getExposure_single_price_sum1())
                .field("exposure_single_price_sum0", track.getExposure_single_price_sum0())
                .field("f_transform_rate_sum1", track.getF_transform_rate_sum1())
                .field("click_times_sum1", track.getClick_times_sum1())
                .field("f_transform_rate_sum0", track.getF_transform_rate_sum0())
                .field("click_times_sum0", track.getClick_times_sum0())
                .field("pay_uv_sum1", track.getPay_uv_sum1())
                .field("pay_uv_sum0", track.getPay_uv_sum0())
                .field("add_to_bag_uv_sum0", track.getAdd_to_bag_uv_sum0())
                .field("add_to_bag_uv_sum1", track.getAdd_to_bag_uv_sum1())
                .field("total_stock_sum1", track.getTotal_stock_sum1())
                .field("total_stock_sum0", track.getTotal_stock_sum0())
                .field("site_code", track.getSite_code())
                .field("platform", track.getPlatform())
                .field("real_stock_sum1", track.getReal_stock_sum1())
                .field("order_times_sum1", track.getOrder_times_sum1())
                .field("order_times_sum0", track.getOrder_times_sum0())
                .field("real_stock_sum0", track.getReal_stock_sum0())
                .field("detail_page_single_price_sum1", track.getDetail_page_single_price_sum1())
                .field("detail_page_times_sum1", track.getDetail_page_times_sum1())
                .field("detail_page_single_price_sum0", track.getDetail_page_single_price_sum0())
                .field("detail_page_times_sum0", track.getDetail_page_times_sum0())
                .field("click_uv_sum1", track.getClick_uv_sum1())
                .field("click_uv_sum0", track.getClick_uv_sum0())
                .field("exposure_click_rate_sum1", track.getExposure_click_rate_sum1())
                .field("exposure_click_rate_sum0", track.getExposure_click_rate_sum0())
                .field("exposure_times_sum0", track.getExposure_times_sum0())
                .field("exposure_times_sum1", track.getExposure_times_sum1())
                .field("add_to_bag_times_sum0", track.getAdd_to_bag_times_sum0())
                .field("order_uv_sum1", track.getOrder_uv_sum1())
                .field("order_uv_sum0", track.getOrder_uv_sum0())
                .field("add_to_bag_times_sum1", track.getAdd_to_bag_times_sum1())
                .field("vitual_stock_sum1", track.getVitual_stock_sum1())
                .field("vitual_stock_sum0", track.getVitual_stock_sum0())
                .endObject();
    }
}