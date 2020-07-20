package com.example.mypracticeproject.main.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mypracticeproject.R;
import com.example.mypracticeproject.app.BaseFragment;

/**
 * fyl
 * 首页
 */
public class FragmentHome extends BaseFragment implements View.OnClickListener {

    private TextView txt_daolujianshe;
    private TextView txt_yidibanqian;
    private TextView txt_shucaichanye;
    private TextView txt_jiaoyubaozhang;
    private TextView txt_wentifanying;
    private TextView txt_yiliaobaozhang;
    private TextView txt_zhufangbaozhang;
    private TextView txt_jiuyeqingkuang;
    private TextView txt_yinshuianquan;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        initView(view);
        initListener();
        return view;
    }

    private void initListener() {
        txt_daolujianshe.setOnClickListener(this);
        txt_yidibanqian.setOnClickListener(this);
        txt_shucaichanye.setOnClickListener(this);
        txt_jiaoyubaozhang.setOnClickListener(this);
        txt_wentifanying.setOnClickListener(this);
        txt_yiliaobaozhang.setOnClickListener(this);
        txt_zhufangbaozhang.setOnClickListener(this);
        txt_jiuyeqingkuang.setOnClickListener(this);
        txt_yinshuianquan.setOnClickListener(this);
    }

    private void initView(View view) {
        txt_daolujianshe = view.findViewById(R.id.txt_daolujianshe);
        txt_yidibanqian = view.findViewById(R.id.txt_yidibanqian);
        txt_shucaichanye = view.findViewById(R.id.txt_shucaichanye);
        txt_jiaoyubaozhang = view.findViewById(R.id.txt_jiaoyubaozhang);
        txt_wentifanying = view.findViewById(R.id.txt_wentifanying);
        txt_yiliaobaozhang = view.findViewById(R.id.txt_yiliaobaozhang);
        txt_zhufangbaozhang = view.findViewById(R.id.txt_zhufangbaozhang);
        txt_jiuyeqingkuang = view.findViewById(R.id.txt_jiuyeqingkuang);
        txt_yinshuianquan = view.findViewById(R.id.txt_yinshuianquan);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.txt_daolujianshe://道路建设
                break;
            case R.id.txt_yidibanqian://易地搬迁
                break;
            case R.id.txt_shucaichanye://蔬菜产业
                break;
            case R.id.txt_jiaoyubaozhang://教育保障
                break;
            case R.id.txt_wentifanying://问题反映
                break;
            case R.id.txt_yiliaobaozhang://医疗保障
                break;
            case R.id.txt_zhufangbaozhang://住房保障
                break;
            case R.id.txt_jiuyeqingkuang://就业情况
                break;
            case R.id.txt_yinshuianquan://饮水安全
                break;
        }
    }
}
