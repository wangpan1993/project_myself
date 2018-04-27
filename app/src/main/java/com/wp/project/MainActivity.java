package com.wp.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 目录
 * Created by WangPan on 2018/4/27.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void viewpage_card(View view) {
        startActivity(new Intent(MainActivity.this, Activity_ViewPager_1.class));
    }
}
