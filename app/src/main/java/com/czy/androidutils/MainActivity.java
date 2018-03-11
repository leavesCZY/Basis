package com.czy.androidutils;

import android.os.Bundle;
import android.view.View;

import com.czy.androidutils.sytem.AppInfoActivity;
import com.czy.androidutils.sytem.ScreenInfoActivity;
import com.czy.androidutils.sytem.SystemInfoActivity;

/**
 * 作者：叶应是叶
 * 时间：2018/3/11 12:37
 * 描述：
 */
public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showSystemInfo(View view) {
        startActivity(SystemInfoActivity.class);
    }

    public void showAppInfo(View view) {
        startActivity(AppInfoActivity.class);
    }

    public void showScreenInfo(View view) {
        startActivity(ScreenInfoActivity.class);
    }
}
