package com.czy.androidutils;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * 作者：叶应是叶
 * 时间：2018/3/11 12:56
 * 描述：
 */
@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {

    protected void startActivity(Class<? extends BaseActivity> cl) {
        startActivity(new Intent(this, cl));
    }

    protected void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
