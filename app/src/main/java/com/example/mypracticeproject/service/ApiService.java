package com.example.mypracticeproject.service;


import com.example.mypracticeproject.iml.LoginService;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * fyl
 * API初始化类
 */
public class ApiService {

    public static String BASE_URL = "http://117.187.128.230:30080/";//测试地址
    //    public static String BASE_URL = "http://117.187.128.230:20080/";//正式地址

    // 初始化okhttp
    OkHttpClient client = new OkHttpClient.Builder()
            .build();

    // 初始化Retrofit
    Retrofit retrofit = new Retrofit.Builder()
            .client(client)
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    LoginService loginService = retrofit.create(LoginService.class);

}
