package leavesc.hello.basisdemo

import android.os.Bundle
import android.widget.TextView
import leavesc.hello.basis.utils.ScreenUtils
import leavesc.hello.basis.view.BaseActivity

/**
 * 作者：leavesC
 * 时间：2019/4/30 22:14
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
class ScreenInfoActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_info)
        getScreenInfo()
    }

    private fun getScreenInfo() {
        val tv_screenInfo = findViewById<TextView>(R.id.tv_screenInfo)
        val log = ("标题栏高度：" + ScreenUtils.getTitleHeight(this)
                + "\n" + "状态栏高度: " + ScreenUtils.getStatusBarHeight(this)
                + "\n" + "屏幕宽度：" + ScreenUtils.getScreenWidth2(this)
                + "\n" + "虚拟按键的高度：" + ScreenUtils.getNavigationBarHeight(this)
                + "\n" + "虚拟按键的高度（如果有显示的话）：" + ScreenUtils.getNavigationBarHeightIfRoom(this)
                + "\n" + "包括虚拟键在内的总的屏幕高度：" + ScreenUtils.getTotalScreenHeight(this)
                + "\n" + "不包括虚拟按键在内的屏幕高度：" + ScreenUtils.getAvailableScreenHeight(this.applicationContext)
                + "\n" + "不包括虚拟按键在内的屏幕高度：" + ScreenUtils.getAvailableScreenHeight(this))
        tv_screenInfo.text = log
    }

}