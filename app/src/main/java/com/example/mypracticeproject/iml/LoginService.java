package com.example.mypracticeproject.iml;

import com.example.mypracticeproject.request.LoginRequestVO;
import com.example.mypracticeproject.response.LoginResponseVO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginService {
    /**
     * 登录
     * @return
     */
    @POST("fupin-user/oauth/token")
    Call<LoginResponseVO> postLogin(@Body LoginRequestVO requestVO);
}
