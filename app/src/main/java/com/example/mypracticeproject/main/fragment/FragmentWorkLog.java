package com.example.mypracticeproject.main.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mypracticeproject.R;

/**
 * fyl
 * 工作日志
 */
public class FragmentWorkLog extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_work_log,container,false);
        initView(view);
        return view;
    }
    private void initView(View view) {
        //设置标题栏
        view.findViewById(R.id.img_back).setVisibility(View.GONE);
        TextView title = view.findViewById(R.id.txt_title);
        title.setText("工作日志");

    }
}
