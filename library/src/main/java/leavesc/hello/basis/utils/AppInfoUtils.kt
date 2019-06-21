package leavesc.hello.basis.utils

import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import leavesc.hello.basis.model.ApplicationInfo
import java.util.*

/**
 * 作者：leavesC
 * 时间：2019/6/21 10:46
 * 描述：
 */
object AppInfoUtils {

    private enum class ApplicationType {
        //所有应用、非系统应用、系统应用
        AllApplication,
        NonSystemApplication, SystemApplication
    }

    /**
     * 获取设备的应用信息
     */
    private fun getApplicationInfo(context: Context, applicationType: ApplicationType): List<ApplicationInfo> {
        val applicationInfoList = ArrayList<ApplicationInfo>()
        val packageInfoList = context.packageManager.getInstalledPackages(0)
        for (packageInfo in packageInfoList) {
            val applicationInfo = ApplicationInfo()
            applicationInfo.applicationName = packageInfo.applicationInfo.loadLabel(context.packageManager).toString()
            applicationInfo.packageName = packageInfo.packageName
            applicationInfo.applicationIcon = packageInfo.applicationInfo.loadIcon(context.packageManager)
            applicationInfo.version = packageInfo.versionName
            applicationInfo.sourceDir = packageInfo.applicationInfo.sourceDir
            applicationInfo.lastUpdateTime = packageInfo.lastUpdateTime
            when (applicationType) {
                AppInfoUtils.ApplicationType.AllApplication -> applicationInfoList.add(applicationInfo)
                AppInfoUtils.ApplicationType.SystemApplication -> if (isSystemApplication(packageInfo)) {
                    applicationInfoList.add(applicationInfo)
                }
                AppInfoUtils.ApplicationType.NonSystemApplication -> if (!isSystemApplication(packageInfo)) {
                    applicationInfoList.add(applicationInfo)
                }
            }
        }
        return applicationInfoList
    }

    /**
     * 判断是否是系统应用
     */
    private fun isSystemApplication(packageInfo: PackageInfo): Boolean {
        return packageInfo.applicationInfo.flags and android.content.pm.ApplicationInfo.FLAG_SYSTEM != 0
    }

    /**
     * 获取设备所有的应用
     */
    fun getAllApplication(context: Context): List<ApplicationInfo> {
        return getApplicationInfo(context, ApplicationType.AllApplication)
    }

    /**
     * 获取设备所有的系统应用
     */
    fun getAllSystemApplication(context: Context): List<ApplicationInfo> {
        return getApplicationInfo(context, ApplicationType.SystemApplication)
    }

    /**
     * 获取设备所有的非系统应用
     */
    fun getAllNonSystemApplication(context: Context): List<ApplicationInfo> {
        return getApplicationInfo(context, ApplicationType.NonSystemApplication)
    }

    /**
     * 根据应用包名获取应用名
     */
    fun getApplicationNameByPackageName(context: Context, packageName: String): String? {
        val pm = context.packageManager
        return try {
            pm.getApplicationLabel(pm.getApplicationInfo(packageName, PackageManager.GET_META_DATA)).toString()
        } catch (e: PackageManager.NameNotFoundException) {
            null
        }

    }

    /**
     * 判断指定包名的应用是否存在
     */
    fun appExist(context: Context, packageName: String): Boolean {
        val packageInfoList = context.packageManager.getInstalledPackages(0)
        for (packageInfo in packageInfoList) {
            if (packageInfo.packageName == packageName) {
                return true
            }
        }
        return false
    }

}