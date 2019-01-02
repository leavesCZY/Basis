package hello.leavesc.androidutils.sytem;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import hello.leavesc.androidutils.BaseActivity;
import hello.leavesc.androidutils.R;
import hello.leavesc.androidutils.sytem.model.Application;
import hello.leavesc.androidutils.sytem.utils.AppInfoUtils;

/**
 * 作者：leavesC
 * 时间：2018/3/11 13:31
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
