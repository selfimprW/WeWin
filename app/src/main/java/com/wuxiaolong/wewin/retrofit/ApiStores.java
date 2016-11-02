package com.wuxiaolong.wewin.retrofit;


import com.wuxiaolong.wewin.model.TngouGirlModel;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by WuXiaolong
 * on 2016/3/24.
 * github:https://github.com/WuXiaolong/
 * weibo:http://weibo.com/u/2175011601
 * 微信公众号：吴小龙同学
 * 个人博客：http://wuxiaolong.me/
 */
public interface ApiStores {
    //baseUrl
    String API_SERVER_URL = "http://wuxiaolong.me/";

    @GET("http://wuxiaolong.me/")
    Call<ResponseBody> loadMyBlog();

    @GET("page/{page}")
    Call<ResponseBody> loadMyBlog(@Path("page") int page);

    @GET("http://www.tngou.net/tnfs/api/list")
    Call<TngouGirlModel> loadTngouGirl(@Query("page") int page, @Query("rows") int rows);

    @GET("http://www.juzimi.com/meitumeiju/{type}")
    Call<ResponseBody> loadMainData(@Path("type") String type, @Query("page") int page);

    @GET("http://www.juzimi.com/meitumeiju?/page")
    Call<ResponseBody> loadMainData(@Query("page") int page);

}
