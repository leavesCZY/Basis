package leavesc.hello.basisdemo

import android.os.Bundle
import android.view.View
import leavesc.hello.basis.utils.AdUtils
import leavesc.hello.basis.utils.AppInfoUtils
import leavesc.hello.basis.view.BaseActivity

/**
 * 作者：leavesC
 * 时间：2019/4/30 22:18
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
class AdActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ad)
    }

    fun openApplicationMarket(view: View) {
        try {
            AdUtils.openApplicationMarket(this, "com.tencent.mobileqq")
        } catch (e: Exception) {
            showToast(e.message ?: "")
        }

    }

    fun openJdShop(view: View) {
        if (AppInfoUtils.appExist(this, "com.jingdong.app.mall")) {
            AdUtils.openJdShop(this, 1000004123)
        } else {
            showToast("没有安装京东客户端")
        }
    }

    fun openJdGoods(view: View) {
        if (AppInfoUtils.appExist(this, "com.jingdong.app.mall")) {
            AdUtils.openJdGoods(this, 6703337)
        } else {
            showToast("没有安装京东客户端")
        }
    }

    fun openTaoBaoShop(view: View) {
        if (AppInfoUtils.appExist(this, "com.taobao.taobao")) {
            AdUtils.openTaoBaoShop(this, 104736810)
        } else {
            showToast("没有安装淘宝客户端")
        }
    }

    fun openTaoBaoGoods(view: View) {
        if (AppInfoUtils.appExist(this, "com.taobao.taobao")) {
            AdUtils.openTaoBaoGoods(this, 547630642483L)
        } else {
            showToast("没有安装淘宝客户端")
        }
    }

    fun openTmallShop(view: View) {
        if (AppInfoUtils.appExist(this, "com.tmall.wireless")) {
            AdUtils.openTmallShop(this, 104736810)
        } else {
            showToast("没有安装天猫客户端")
        }
    }

    fun openTmallGoods(view: View) {
        if (AppInfoUtils.appExist(this, "com.tmall.wireless")) {
            AdUtils.openTmallGoods(this, 547630642483L)
        } else {
            showToast("没有安装天猫客户端")
        }
    }

}
