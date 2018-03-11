package com.czy.androidutils.sytem;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.czy.androidutils.BaseActivity;
import com.czy.androidutils.R;
import com.czy.androidutils.sytem.utils.ScreenUtils;

/**
 * 作者：叶应是叶
 * 时间：2018/3/11 14:19
 * 描述：
 */
public class ScreenInfoActivity extends BaseActivity {

    private static final String TAG = "ScreenInfoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_info);
        getScreenInfo();
    }

    private void getScreenInfo() {
        TextView tv_screenInfo = findViewById(R.id.tv_screenInfo);
        String log = "标题栏高度：" + ScreenUtils.getTitleHeight(this)
                + "\n" + "状态栏高度: " + ScreenUtils.getStatusBarHeight(this)
                + "\n" + "屏幕宽度：" + ScreenUtils.getScreenWidth2(this)
                + "\n" + "虚拟按键的高度：" + ScreenUtils.getNavigationBarHeight(this)
                + "\n" + "虚拟按键的高度（如果有显示的话）：" + ScreenUtils.getNavigationBarHeightIfRoom(this)
                + "\n" + "包括虚拟键在内的总的屏幕高度：" + ScreenUtils.getTotalScreenHeight(this)
                + "\n" + "不包括虚拟按键在内的屏幕高度：" + ScreenUtils.getAvailableScreenHeight(this.getApplicationContext())
                + "\n" + "不包括虚拟按键在内的屏幕高度：" + ScreenUtils.getAvailableScreenHeight(this);
        Log.e(TAG, log);
        tv_screenInfo.setText(log);
    }

}
