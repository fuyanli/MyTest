package com.example.mypracticeproject.main.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.mypracticeproject.R;
import com.example.mypracticeproject.main.fragment.FragmentHelpPeople;
import com.example.mypracticeproject.main.fragment.FragmentHome;
import com.example.mypracticeproject.main.fragment.FragmentPersonalCenter;
import com.example.mypracticeproject.main.fragment.FragmentPoorPeople;
import com.example.mypracticeproject.main.fragment.FragmentWorkLog;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup radioGroup_main;
    private RadioButton radio_home;
    private RadioButton radio_poorPeople;
    private RadioButton radio_workLog;
    private RadioButton radio_helpPeople;
    private RadioButton radio_personalCenter;
    private FragmentHome fragmentHome;
    private FragmentPoorPeople fragmentPoorPeople;
    private FragmentWorkLog fragmentWorkLog;
    private FragmentHelpPeople fragmentHelpPeople;
    private FragmentPersonalCenter fragmentPersonalCenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initListener() {
        radioGroup_main.setOnCheckedChangeListener(this);
    }

    private void initView() {
        radioGroup_main = findViewById(R.id.radioGroup_main);
        radio_home = findViewById(R.id.radio_home);
        radio_poorPeople = findViewById(R.id.radio_poorPeople);
        radio_workLog = findViewById(R.id.radio_workLog);
        radio_helpPeople = findViewById(R.id.radio_helpPeople);
        radio_personalCenter = findViewById(R.id.radio_personalCenter);
        //设置默认显示首页
        radio_home.setChecked(true);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (fragmentHome == null){
            fragmentHome = new FragmentHome();
            transaction.add(R.id.fragment_container,fragmentHome);
        }else {
            transaction.show(fragmentHome);
        }
        transaction.commit();

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFragment(transaction);
        switch (i){
            case R.id.radio_home:
                if (fragmentHome == null){
                    fragmentHome = new FragmentHome();
                    transaction.add(R.id.fragment_container,fragmentHome);
                }else {
                    transaction.show(fragmentHome);
                }

                break;
            case R.id.radio_poorPeople:
                if (fragmentPoorPeople == null){
                    fragmentPoorPeople = new FragmentPoorPeople();
                    transaction.add(R.id.fragment_container,fragmentPoorPeople);
                }else {
                    transaction.show(fragmentPoorPeople);
                }
                break;
            case R.id.radio_workLog:
                if (fragmentWorkLog == null){
                    fragmentWorkLog = new FragmentWorkLog();
                    transaction.add(R.id.fragment_container,fragmentWorkLog);
                }else {
                    transaction.show(fragmentWorkLog);
                }
                break;
            case R.id.radio_helpPeople:
                if (fragmentHelpPeople == null){
                    fragmentHelpPeople = new FragmentHelpPeople();
                    transaction.add(R.id.fragment_container,fragmentHelpPeople);
                }else {
                    transaction.show(fragmentHelpPeople);
                }
                break;
            case R.id.radio_personalCenter:
                if (fragmentPersonalCenter == null){
                    fragmentPersonalCenter = new FragmentPersonalCenter();
                    transaction.add(R.id.fragment_container,fragmentPersonalCenter);
                }else {
                    transaction.show(fragmentPersonalCenter);
                }
                break;
        }
        transaction.commit();
    }

    public void hideAllFragment(FragmentTransaction transaction){
        if (fragmentHome!=null){
            transaction.hide(fragmentHome);
        }
        if (fragmentPoorPeople!=null){
            transaction.hide(fragmentPoorPeople);
        }
        if (fragmentWorkLog!=null){
            transaction.hide(fragmentWorkLog);
        }
        if (fragmentHelpPeople!=null){
            transaction.hide(fragmentHelpPeople);
        }
        if (fragmentPersonalCenter!=null){
            transaction.hide(fragmentPersonalCenter);
        }
    }
}
