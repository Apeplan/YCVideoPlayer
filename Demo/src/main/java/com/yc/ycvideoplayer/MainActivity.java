package com.yc.ycvideoplayer;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.yc.ycvideoplayer.R;

import com.yc.ycvideoplayer.demo.DemoActivity;
import com.yc.ycvideoplayer.newPlayer.activity.TypeActivity;
import com.yc.ycvideoplayer.oldPlayer.OldActivity;

import cn.ycbjie.ycstatusbarlib.bar.StateAppBar;

/**
 * ================================================
 * 作    者：杨充
 * 版    本：1.0
 * 创建日期：2017/11/18
 * 描    述：Main主页面
 * 修订历史：
 * ================================================
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTv1;
    private TextView mTv2;
    private TextView mTv3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StateAppBar.setStatusBarLightMode(this, Color.WHITE);
        initView();
    }

    private void initView() {
        mTv1 = (TextView) findViewById(R.id.tv_1);
        mTv2 = (TextView) findViewById(R.id.tv_2);
        mTv3 = (TextView) findViewById(R.id.tv_3);

        mTv1.setOnClickListener(this);
        mTv2.setOnClickListener(this);
        mTv3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_1:
                startActivity(DemoActivity.class);
                break;
            case R.id.tv_2:
                startActivity(TypeActivity.class);
                break;
            case R.id.tv_3:
                startActivity(OldActivity.class);
                break;
        }
    }

    private void startActivity(Class c){
        startActivity(new Intent(this,c));
    }
}
