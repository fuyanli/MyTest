package com.example.mypracticeproject.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * fyl
 * 常用的工具类
 */
public class CommonUtil {
    //字符串判空
    public static boolean isEmpty(String str){
        if (!str.equals("") && str != null){
            return false;
        }else {
            return true;
        }
    }

    //展示Tost
    public static void showMessage(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
