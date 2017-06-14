package com.baidu.administrator.geihubdome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("YXJDSB");
        for (int i = 0; i < 1000; i++) {
            Log.d("LYM","ZDSB");
        }
    }
}
