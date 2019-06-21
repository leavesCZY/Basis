package leavesc.hello.basisdemo

import android.os.Bundle
import android.view.View
import leavesc.hello.basis.view.BaseActivity

/**
 * 作者：leavesC
 * 时间：2019/4/22 15:59
 * 描述：
 */
class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDialog(view: View) {
        startActivity(DialogActivity::class.java)
    }

    fun showSystemInfo(view: View) {
        startActivity(SystemInfoActivity::class.java)
    }

    fun showAppInfo(view: View) {
        startActivity(AppInfoActivity::class.java)
    }

    fun showScreenInfo(view: View) {
        startActivity(ScreenInfoActivity::class.java)
    }

    fun showAdAction(view: View) {
        startActivity(AdActivity::class.java)
    }

}