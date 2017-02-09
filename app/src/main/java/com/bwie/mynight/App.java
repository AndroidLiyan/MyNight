package com.bwie.mynight;

import android.app.Application;

import java.util.HashMap;
import java.util.Map;

/**
 * 类的用途：
 * @author 李岩
 * @date
 */
public class App extends Application{
    public static Map<String, Integer> list = new HashMap<>();

    @Override
    public void onCreate() {
        super.onCreate();
    }
    public static void swichclior(int tag){
//        switch ()
    }
}
