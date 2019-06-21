package leavesc.hello.basis.widget.dialog

import android.app.Dialog
import android.content.Context
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.StringRes
import leavesc.hello.basis.R

/**
 * 作者：leavesC
 * 时间：2019/6/21 10:51
 * 描述：
 */
class LoadingDialog(context: Context) : Dialog(context, R.style.LoadingDialogTheme) {

    private val iv_loading: ImageView

    private val tv_hint: TextView

    private val animation: Animation

    init {
        setContentView(R.layout.dialog_loading)
        iv_loading = findViewById(R.id.iv_loading)
        tv_hint = findViewById(R.id.tv_hint)
        animation = AnimationUtils.loadAnimation(context, R.anim.loading_dialog)
    }

    fun show(hintText: String, cancelable: Boolean, canceledOnTouchOutside: Boolean) {
        setCancelable(cancelable)
        setCanceledOnTouchOutside(canceledOnTouchOutside)
        tv_hint.text = hintText
        iv_loading.clearAnimation()
        iv_loading.startAnimation(animation)
        show()
    }

    fun show(@StringRes hintTextRes: Int, cancelable: Boolean, canceledOnTouchOutside: Boolean) {
        show(context.getString(hintTextRes), cancelable, canceledOnTouchOutside)
    }

    override fun cancel() {
        super.cancel()
        animation.cancel()
        iv_loading.clearAnimation()
    }

    override fun dismiss() {
        super.dismiss()
        animation.cancel()
        iv_loading.clearAnimation()
    }

}