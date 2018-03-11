package com.czy.androidutils.sytem.model;

import android.graphics.drawable.Drawable;

/**
 * 作者：叶应是叶
 * 时间：2018/3/11 13:33
 * 描述：
 */
public class Application {

    //应用名
    private String applicationName;

    //应用包名
    private String packageName;

    //应用图标
    private Drawable applicationIcon;

    //版本号
    private String version;

    public Application(String applicationName, String packageName, Drawable applicationIcon, String version) {
        this.applicationName = applicationName;
        this.packageName = packageName;
        this.applicationIcon = applicationIcon;
        this.version = version;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Drawable getApplicationIcon() {
        return applicationIcon;
    }

    public void setApplicationIcon(Drawable applicationIcon) {
        this.applicationIcon = applicationIcon;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "应用名：" + applicationName + "\n应用包名：" + packageName + "\n版本号：" + version;
    }

}
