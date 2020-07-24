package com.example.mypracticeproject.main.activity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mypracticeproject.R;
import com.example.mypracticeproject.app.BaseActivity;
import com.example.mypracticeproject.iml.LoginService;
import com.example.mypracticeproject.request.LoginRequestVO;
import com.example.mypracticeproject.service.ApiService;
import com.example.mypracticeproject.utils.CommonUtil;

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private EditText edt_userName;
    private EditText edt_password;
    private Button btn_login;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mContext = LoginActivity.this;
        initView();
        initListener();
    }

    private void initListener() {
        btn_login.setOnClickListener(this);
    }

    private void initView() {
        edt_userName = findViewById(R.id.edt_userName);
        edt_password = findViewById(R.id.edt_password);
        btn_login = findViewById(R.id.btn_login);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login://登录
                String userName = edt_userName.getText().toString();
                String password = edt_password.getText().toString();
                if (CommonUtil.isEmpty(userName)){
                    CommonUtil.showMessage(mContext,"用户名不能为空");
                    return;
                }
                if (CommonUtil.isEmpty(password)){
                    CommonUtil.showMessage(mContext,"密码不能为空");
                    return;
                }

                LoginRequestVO requestVO = new LoginRequestVO();
                requestVO.setUsername(userName);
                requestVO.setPassword(password);


                startActivity(new Intent(this,MainActivity.class));
                break;
        }
    }
}
