package leavesc.hello.basis.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import java.util.ArrayList;
import java.util.List;

import leavesc.hello.basis.model.ApplicationInfo;

/**
 * 作者：leavesC
 * 时间：2018/3/11 13:31
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class AppInfoUtils {

    private enum ApplicationType {
        //所有应用、非系统应用、系统应用
        AllApplication, NonSystemApplication, SystemApplication
    }

    /**
     * 获取设备的应用信息
     */
    private static List<ApplicationInfo> getApplicationInfo(Context context, ApplicationType applicationType) {
        List<ApplicationInfo> applicationInfoList = new ArrayList<>();
        List<PackageInfo> packageInfoList = context.getPackageManager().getInstalledPackages(0);
        for (PackageInfo packageInfo : packageInfoList) {
            ApplicationInfo applicationInfo = new ApplicationInfo();
            applicationInfo.setApplicationName(packageInfo.applicationInfo.loadLabel(context.getPackageManager()).toString());
            applicationInfo.setPackageName(packageInfo.packageName);
            applicationInfo.setApplicationIcon(packageInfo.applicationInfo.loadIcon(context.getPackageManager()));
            applicationInfo.setVersion(packageInfo.versionName);
            applicationInfo.setSourceDir(packageInfo.applicationInfo.sourceDir);
            applicationInfo.setLastUpdateTime(packageInfo.lastUpdateTime);
            switch (applicationType) {
                case AllApplication:
                    applicationInfoList.add(applicationInfo);
                    break;
                case SystemApplication:
                    if (isSystemApplication(packageInfo)) {
                        applicationInfoList.add(applicationInfo);
                    }
                    break;
                case NonSystemApplication:
                    if (!isSystemApplication(packageInfo)) {
                        applicationInfoList.add(applicationInfo);
                    }
                    break;
            }
        }
        return applicationInfoList;
    }

    /**
     * 判断是否是系统应用
     */
    private static Boolean isSystemApplication(PackageInfo packageInfo) {
        return (packageInfo.applicationInfo.flags & android.content.pm.ApplicationInfo.FLAG_SYSTEM) != 0;
    }

    /**
     * 获取设备所有的应用
     */
    public static List<ApplicationInfo> getAllApplication(Context context) {
        return getApplicationInfo(context, ApplicationType.AllApplication);
    }

    /**
     * 获取设备所有的系统应用
     */
    public static List<ApplicationInfo> getAllSystemApplication(Context context) {
        return getApplicationInfo(context, ApplicationType.SystemApplication);
    }

    /**
     * 获取设备所有的非系统应用
     */
    public static List<ApplicationInfo> getAllNonSystemApplication(Context context) {
        return getApplicationInfo(context, ApplicationType.NonSystemApplication);
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
