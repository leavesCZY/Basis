package com.czy.androidutils.sytem;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.format.Formatter;
import android.widget.TextView;

import com.czy.androidutils.BaseActivity;
import com.czy.androidutils.R;

/**
 * 作者：叶应是叶
 * 时间：2018/3/11 13:05
 * 描述：
 */
public class SystemInfoActivity extends BaseActivity {

    private static final String TAG = "SystemInfoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_info);
        showSystemInfo();
    }

    private void showSystemInfo() {
        TextView tv_systemInfo = findViewById(R.id.tv_systemInfo);
        String info = "主板：" + Build.BOARD
                + "\n" + "系统定制商：" + Build.BRAND
                + "\n" + "设备参数：" + Build.DEVICE
                + "\n" + "显示屏参数：" + Build.DISPLAY
                + "\n" + "唯一识别码：" + Build.FINGERPRINT
                + "\n" + "硬件序列号：" + Build.SERIAL
                + "\n" + "修订版本列表：" + Build.ID
                + "\n" + "硬件制造商：" + Build.MANUFACTURER
                + "\n" + "版本：" + Build.MODEL
                + "\n" + "硬件名：" + Build.HARDWARE
                + "\n" + "手机产品名：" + Build.PRODUCT
                + "\n" + "描述Build的标签：" + Build.TAGS
                + "\n" + "Builder类型：" + Build.TYPE
                + "\n" + "当前开发代号：" + Build.VERSION.CODENAME
                + "\n" + "源码控制版本号：" + Build.VERSION.INCREMENTAL
                + "\n" + "版本字符串：" + Build.VERSION.RELEASE
                + "\n" + "版本号：" + Build.VERSION.SDK_INT
                + "\n" + "Host值：" + Build.HOST
                + "\n" + "User名：" + Build.USER
                + "\n" + "编译时间：" + Build.TIME
                + "\n\n" + "OS版本：" + System.getProperty("os.version")
                + "\n" + "OS名称：" + System.getProperty("os.name")
                + "\n" + "OS架构：" + System.getProperty("os.arch")
                + "\n" + "Home属性：" + System.getProperty("user.home")
                + "\n" + "Name属性：" + System.getProperty("user.name")
                + "\n" + "Dir属性：" + System.getProperty("user.dir")
                + "\n" + "时区：" + System.getProperty("user.timezone")
                + "\n" + "路径分隔符：" + System.getProperty("path.separator")
                + "\n" + "行分隔符：" + System.getProperty("line.separator")
                + "\n" + "文件分隔符：" + System.getProperty("file.separator")
                + "\n" + "Java Vendor Url属性：" + System.getProperty("java.vendor.url")
                + "\n" + "Java Class路径：" + System.getProperty("java.class.path")
                + "\n" + "Java Class版本：" + System.getProperty("java.class.version")
                + "\n" + "Java Vendor属性：" + System.getProperty("java.vendor")
                + "\n" + "Java 版本：" + System.getProperty("java.version")
                + "\n" + "Java Home属性：" + System.getProperty("java.home")
                + "\n" + "设备总内存大小：" + Formatter.formatFileSize(this, getTotalMemory(this))
                + "\n" + "设备可用内存大小：" + Formatter.formatFileSize(this, getAvailMemory(this))
                + "\n" + "设备内存不足的阀值：" + Formatter.formatFileSize(this, getThreshold(this))
                + "\n" + "设备是否处于低内存状态（可用内存是否小于设备内存不足的阀值）：" + isLowMemory(this);
        tv_systemInfo.setText(info);
    }

    public static long getTotalMemory(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        return 0;
    }

    public static long getAvailMemory(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.availMem;
        }
        return 0;
    }

    public static long getThreshold(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.threshold;
        }
        return 0;
    }

    public static boolean isLowMemory(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.lowMemory;
        }
        return false;
    }

}
