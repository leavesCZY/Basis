package leavesc.hello.basis.model

import android.graphics.drawable.Drawable
import android.text.TextUtils
import java.io.File

/**
 * 作者：leavesC
 * 时间：2019/6/21 10:53
 * 描述：
 */
class ApplicationInfo {

    //应用名
    var applicationName: String? = null

    //应用包名
    var packageName: String? = null

    //应用图标
    var applicationIcon: Drawable? = null

    //版本号
    var version: String? = null

    //最后更新时间
    var lastUpdateTime: Long = 0

    //apk路径
    var sourceDir: String? = null

    //apk大小 MB
    val apkSize: Long
        get() {
            if (TextUtils.isEmpty(sourceDir)) {
                return 0
            }
            val apkFile = File(sourceDir)
            return apkFile.length() / 1024 / 1024
        }

    override fun toString(): String {
        return "ApplicationInfo{" +
                "applicationName='" + applicationName + '\''.toString() +
                ", packageName='" + packageName + '\''.toString() +
                ", applicationIcon=" + applicationIcon +
                ", version='" + version + '\''.toString() +
                ", lastUpdateTime=" + lastUpdateTime +
                ", sourceDir='" + sourceDir + '\''.toString() +
                '}'.toString()
    }

}
