package leavesc.hello.basis.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import leavesc.hello.basis.dialog.LoadingDialog

/**
 * 作者：leavesC
 * 时间：2019/6/21 10:47
 * 描述：
 */
open class BaseActivity : AppCompatActivity(), IBaseViewAction {

    override val context: Context
        get() = this

    private var loadingDialog: LoadingDialog? = null

    override fun showLoadingDialog(cancelable: Boolean) {
        if (loadingDialog == null) {
            loadingDialog = LoadingDialog(context)
        }
        loadingDialog?.start(cancelable, cancelable)
    }

    override fun dismissLoadingDialog() {
        loadingDialog?.apply {
            if (isShowing) {
                dismiss()
            }
        }
    }

    protected fun showDialog(dialogFragment: DialogFragment) {
        dialogFragment.show(supportFragmentManager, dialogFragment.javaClass.canonicalName)
    }

}