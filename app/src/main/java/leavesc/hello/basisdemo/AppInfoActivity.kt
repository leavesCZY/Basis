package leavesc.hello.basisdemo

import android.os.Bundle
import android.view.View
import android.widget.TextView
import leavesc.hello.basis.utils.AppInfoUtils
import leavesc.hello.basis.view.BaseActivity

/**
 * 作者：leavesC
 * 时间：2019/4/30 22:15
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
class AppInfoActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_info)
    }

    fun showAllAppInfo(view: View) {
        val tv_appInfo = findViewById<TextView>(R.id.tv_appInfo)
        tv_appInfo.text = null
        val ApplicationInfoList = AppInfoUtils.getAllApplication(this)
        for (ApplicationInfo in ApplicationInfoList) {
            tv_appInfo.append(ApplicationInfo.toString() + "\n\n")
        }
    }

    fun showSystemAppInfo(view: View) {
        val tv_appInfo = findViewById<TextView>(R.id.tv_appInfo)
        tv_appInfo.text = null
        val ApplicationInfoList = AppInfoUtils.getAllSystemApplication(this)
        for (ApplicationInfo in ApplicationInfoList) {
            tv_appInfo.append(ApplicationInfo.toString() + "\n\n")
        }
    }

    fun showNonSystemAppInfo(view: View) {
        val tv_appInfo = findViewById<TextView>(R.id.tv_appInfo)
        tv_appInfo.text = null
        val ApplicationInfoList = AppInfoUtils.getAllNonSystemApplication(this)
        for (ApplicationInfo in ApplicationInfoList) {
            tv_appInfo.append(ApplicationInfo.toString() + "\n\n")
        }
    }

}