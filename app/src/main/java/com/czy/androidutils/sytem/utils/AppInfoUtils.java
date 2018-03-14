package com.czy.androidutils.sytem.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import com.czy.androidutils.sytem.model.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：叶应是叶
 * 时间：2018/3/11 13:31
 * 描述：
 */
public class AppInfoUtils {

    private enum ApplicationType {
        //所有应用、非系统应用、系统应用
        allApplication, nonSystemApplication, systemApplication
    }

    /**
     * 获取设备的应用信息
     */
    private static List<Application> getApplicationInfo(Context context, ApplicationType applicationType) {
        List<Application> applicationList = new ArrayList<>();
        List<PackageInfo> packageInfoList = context.getPackageManager().getInstalledPackages(0);
        for (PackageInfo packageInfo : packageInfoList) {
            Application application = new Application(packageInfo.applicationInfo.loadLabel(context.getPackageManager()).toString(), packageInfo.packageName,
                    packageInfo.applicationInfo.loadIcon(context.getPackageManager()), packageInfo.versionName);
            switch (applicationType) {
                case allApplication:
                    applicationList.add(application);
                    break;
                case systemApplication:
                    if (isSystemApplication(packageInfo)) {
                        applicationList.add(application);
                    }
                    break;
                case nonSystemApplication:
                    if (!isSystemApplication(packageInfo)) {
                        applicationList.add(application);
                    }
                    break;
            }
        }
        return applicationList;
    }

    /**
     * 判断是否是系统应用
     */
    private static Boolean isSystemApplication(PackageInfo packageInfo) {
        return (packageInfo.applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) != 0;
    }

    /**
     * 获取设备所有的应用
     */
    public static List<Application> getAllApplication(Context context) {
        return getApplicationInfo(context, ApplicationType.allApplication);
    }

    /**
     * 获取设备所有的系统应用
     */
    public static List<Application> getAllSystemApplication(Context context) {
        return getApplicationInfo(context, ApplicationType.systemApplication);
    }

    /**
     * 获取设备所有的非系统应用
     */
    public static List<Application> getAllNonSystemApplication(Context context) {
        return getApplicationInfo(context, ApplicationType.nonSystemApplication);
    }

    /**
     * 根据应用包名获取应用名
     */
    public static String getApplicationNameByPackageName(Context context, String packageName) {
        PackageManager pm = context.getPackageManager();
        try {
            return pm.getApplicationLabel(pm.getApplicationInfo(packageName, PackageManager.GET_META_DATA)).toString();
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /**
     * 判断指定包名的应用是否存在
     */
    public static boolean appExist(Context context, String packageName) {
        List<PackageInfo> packageInfoList = context.getPackageManager().getInstalledPackages(0);
        for (PackageInfo packageInfo : packageInfoList) {
            if (packageInfo.packageName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

}
