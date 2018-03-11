package com.czy.androidutils.sytem;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.czy.androidutils.BaseActivity;
import com.czy.androidutils.R;
import com.czy.androidutils.sytem.model.Application;
import com.czy.androidutils.sytem.utils.AppInfoUtils;

import java.util.List;

/**
 * 作者：叶应是叶
 * 时间：2018/3/11 13:31
 * 描述：
 */
public class AppInfoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_info);
    }

    public void showAllAppInfo(View view) {
        TextView tv_appInfo = findViewById(R.id.tv_appInfo);
        tv_appInfo.setText(null);
        List<Application> applicationList = AppInfoUtils.getAllApplication(this);
        for (Application application : applicationList) {
            tv_appInfo.append(application.toString() + "\n\n");
        }
    }

    public void showSystemAppInfo(View view) {
        TextView tv_appInfo = findViewById(R.id.tv_appInfo);
        tv_appInfo.setText(null);
        List<Application> applicationList = AppInfoUtils.getAllSystemApplication(this);
        for (Application application : applicationList) {
            tv_appInfo.append(application.toString() + "\n\n");
        }
    }

    public void showNonSystemAppInfo(View view) {
        TextView tv_appInfo = findViewById(R.id.tv_appInfo);
        tv_appInfo.setText(null);
        List<Application> applicationList = AppInfoUtils.getAllNonSystemApplication(this);
        for (Application application : applicationList) {
            tv_appInfo.append(application.toString() + "\n\n");
        }
    }

}
