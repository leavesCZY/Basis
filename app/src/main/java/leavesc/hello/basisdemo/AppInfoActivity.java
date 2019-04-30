package leavesc.hello.basisdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import leavesc.hello.basis.model.ApplicationInfo;
import leavesc.hello.basis.utils.AppInfoUtils;
import leavesc.hello.basis.view.BaseActivity;

/**
 * 作者：leavesC
 * 时间：2019/4/30 22:15
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
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
        List<ApplicationInfo> ApplicationInfoList = AppInfoUtils.getAllApplication(this);
        for (ApplicationInfo ApplicationInfo : ApplicationInfoList) {
            tv_appInfo.append(ApplicationInfo.toString() + "\n\n");
        }
    }

    public void showSystemAppInfo(View view) {
        TextView tv_appInfo = findViewById(R.id.tv_appInfo);
        tv_appInfo.setText(null);
        List<ApplicationInfo> ApplicationInfoList = AppInfoUtils.getAllSystemApplication(this);
        for (ApplicationInfo ApplicationInfo : ApplicationInfoList) {
            tv_appInfo.append(ApplicationInfo.toString() + "\n\n");
        }
    }

    public void showNonSystemAppInfo(View view) {
        TextView tv_appInfo = findViewById(R.id.tv_appInfo);
        tv_appInfo.setText(null);
        List<ApplicationInfo> ApplicationInfoList = AppInfoUtils.getAllNonSystemApplication(this);
        for (ApplicationInfo ApplicationInfo : ApplicationInfoList) {
            tv_appInfo.append(ApplicationInfo.toString() + "\n\n");
        }
    }

}