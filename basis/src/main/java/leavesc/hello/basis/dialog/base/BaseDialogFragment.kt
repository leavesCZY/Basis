package leavesc.hello.basis.dialog.base

import android.app.Dialog
import android.content.DialogInterface
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment

/**
 * 作者：leavesC
 * 时间：2019/6/20 16:26
 * 描述：
 */
abstract class BaseDialogFragment : DialogFragment() {

    companion object {

        val NEGATIVE_TEXT_COLOR = Color.parseColor("#0064E6")

        val POSITIVE_TEXT_COLOR = Color.parseColor("#E54767")

    }

    interface OnClickListener {
        fun onClick()
    }

    interface OnDismissListener {

        fun onDismiss()

    }

    var title: String = ""

    var positiveText: String = "确定"

    var positiveTextColor: Int = POSITIVE_TEXT_COLOR

    var negativeText: String = "取消"

    var negativeTextColor: Int = NEGATIVE_TEXT_COLOR

    var onPositiveClickListener: OnClickListener? = null

    var onNegativeClickListener: OnClickListener? = null

    var onPositiveWithoutDismissClickListener: OnClickListener? = null

    var onNegativeWithoutDismissClickListener: OnClickListener? = null

    var onDismissListener: OnDismissListener? = null

    var isOutsideTouchable = true

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = BaseDialog.Builder(activity!!)
            .setContentView(getContentView())
            .setTitle(title)
            .setPositiveText(positiveText)
            .setNegativeText(negativeText)
            .setPositiveTextColor(positiveTextColor)
            .setNegativeTextColor(negativeTextColor)
            .setDialogClickListener(object : BaseDialog.OnDialogClickListener {
                override fun onPositiveClick() {
                    if (onPositiveWithoutDismissClickListener == null) {
                        onPositiveClickListener?.onClick()
                        dismiss()
                    } else {
                        onPositiveWithoutDismissClickListener?.onClick()
                    }
                }

                override fun onNegativeClick() {
                    if (onNegativeWithoutDismissClickListener == null) {
                        onNegativeClickListener?.onClick()
                        dismiss()
                    } else {
                        onNegativeWithoutDismissClickListener?.onClick()
                    }
                }
            })
        val dialog = builder.create()
        dialog.setCanceledOnTouchOutside(isOutsideTouchable)
        return dialog
    }

    override fun onStart() {
        super.onStart()
        val layoutParams = dialog.window?.attributes
        layoutParams?.apply {
            width = ViewGroup.LayoutParams.MATCH_PARENT
            height = ViewGroup.LayoutParams.WRAP_CONTENT
            gravity = Gravity.CENTER
            dialog.window?.attributes = layoutParams
        }
    }

    override fun onDismiss(dialog: DialogInterface?) {
        super.onDismiss(dialog)
        onDismissListener?.onDismiss()
    }

    abstract fun getContentView(): View?

}