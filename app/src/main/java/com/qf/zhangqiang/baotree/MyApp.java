package com.qf.zhangqiang.baotree;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by zhangqiang on 16-1-11.
 */
public class MyApp extends Application {
    private  static MyApp app;
    private RequestQueue requestQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

        //初始化volley
        initVolley();

        //初始化UIL
        initUIL();
    }

    private void initUIL() {
        ImageLoaderConfiguration configuration = ImageLoaderConfiguration.createDefault(this);
        ImageLoader.getInstance().init(configuration);
    }

    private void initVolley() {
        requestQueue = Volley.newRequestQueue(this);
    }

    public static MyApp getInstance(){
        return app;
    }

    public RequestQueue getRequestQueue(){
        return requestQueue;
    }


}
