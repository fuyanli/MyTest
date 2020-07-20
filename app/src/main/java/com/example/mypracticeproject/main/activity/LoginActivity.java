package com.example.mypracticeproject.main.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mypracticeproject.R;
import com.example.mypracticeproject.app.BaseActivity;

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private EditText edt_userName;
    private EditText edt_password;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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
                startActivity(new Intent(this,MainActivity.class));
                break;
        }
    }
}
