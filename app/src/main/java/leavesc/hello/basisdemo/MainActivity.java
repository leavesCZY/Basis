package leavesc.hello.basisdemo;

import android.os.Bundle;
import android.view.View;

import leavesc.hello.basis.view.BaseActivity;

/**
 * 作者：leavesC
 * 时间：2019/4/22 15:59
 * 描述：
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showLoadingDialog(View view) {
        showLoadingDialog("正在加载", true);
    }

    public void dismissLoadingDialog(View view) {
        dismissLoadingDialog();
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

    public void showAdAction(View view) {
        startActivity(AdActivity.class);
    }

}