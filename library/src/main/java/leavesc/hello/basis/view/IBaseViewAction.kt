package leavesc.hello.basis.view

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.annotation.StringRes

/**
 * 作者：leavesC
 * 时间：2019/6/21 10:48
 * 描述：
 */
interface IBaseViewAction {

    val context: Context

    fun showLoadingDialog(message: String, cancelable: Boolean)

    fun showLoadingDialog(message: String) {
        showLoadingDialog(message, false)
    }

    fun dismissLoadingDialog()

    fun <T : Activity> startActivity(clazz: Class<T>) {
        context.startActivity(Intent(context, clazz))
    }

    fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun showToast(@StringRes id: Int) {
        showToast(context.getString(id))
    }

}
