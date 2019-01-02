package hello.leavesc.androidutils;

import android.os.Bundle;
import android.view.View;

import hello.leavesc.androidutils.ad.AdActivity;
import hello.leavesc.androidutils.drawable.DrawableActivity;
import hello.leavesc.androidutils.sytem.AppInfoActivity;
import hello.leavesc.androidutils.sytem.ScreenInfoActivity;
import hello.leavesc.androidutils.sytem.SystemInfoActivity;

/**
 * 作者：leavesC
 * 时间：2018/3/11 12:37
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
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

    public void showAdAction(View view) {
        startActivity(AdActivity.class);
    }

    public void showDrawable(View view) {
        startActivity(DrawableActivity.class);
    }

}
