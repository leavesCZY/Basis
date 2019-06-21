package leavesc.hello.basis.widget.dialog.base

import android.app.Dialog
import android.content.Context
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import leavesc.hello.basis.R

/**
 * 作者：leavesC
 * 时间：2019/6/20 17:40
 * 描述：
 */
class BaseDialog internal constructor(context: Context, theme: Int) : Dialog(context, theme) {

    interface OnDialogClickListener {

        fun onPositiveClick()

        fun onNegativeClick()

    }

    class Builder(private val context: Context) {

        private var title: String? = null

        private var positiveText: String? = null

        private var positiveTextColor: Int = 0

        private var negativeText: String? = null

        private var negativeTextColor: Int = 0

        private var dialogClickListener: OnDialogClickListener? = null

        protected lateinit var titleTv: TextView
            private set

        protected lateinit var negativeTV: TextView
            private set

        protected lateinit var positiveTV: TextView
            private set

        private var contentView: View? = null

        fun create(): BaseDialog {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.dialog_base, null)
            val dialog = BaseDialog(context, R.style.AlertDialogStyle)
            dialog.addContentView(
                view,
                ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            )
            titleTv = view.findViewById(R.id.tvTitle)
            if (TextUtils.isEmpty(title)) {
                titleTv.visibility = View.GONE
            } else {
                titleTv.text = title
            }
            negativeTV = view.findViewById(R.id.tvNegative)
            positiveTV = view.findViewById(R.id.tvPositive)
            if (TextUtils.isEmpty(negativeText)) {
                negativeTV.visibility = View.GONE
            } else {
                negativeTV.text = negativeText
                negativeTV.setTextColor(negativeTextColor)
                negativeTV.setOnClickListener {
                    dialogClickListener?.onNegativeClick()
                }
            }
            if (TextUtils.isEmpty(positiveText)) {
                positiveTV.visibility = View.GONE
            } else {
                positiveTV.text = positiveText
                positiveTV.setTextColor(positiveTextColor)
                positiveTV.setOnClickListener {
                    dialogClickListener?.onPositiveClick()
                }
            }
            if (contentView != null) {
                val fl_contentView = view.findViewById<FrameLayout>(R.id.fl_contentView)
                fl_contentView.addView(
                    contentView,
                    ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
                )
            }
            dialog.setContentView(view)
            return dialog
        }

        fun setTitle(title: String): Builder {
            this.title = title
            return this
        }

        fun setContentView(v: View?): Builder {
            this.contentView = v
            return this
        }

        fun setPositiveText(positiveText: String): Builder {
            this.positiveText = positiveText
            return this
        }

        fun setPositiveTextColor(positiveTextColor: Int): Builder {
            this.positiveTextColor = positiveTextColor
            return this
        }

        fun setNegativeText(negativeText: String): Builder {
            this.negativeText = negativeText
            return this
        }

        fun setNegativeTextColor(negativeTextColor: Int): Builder {
            this.negativeTextColor = negativeTextColor
            return this
        }

        fun setDialogClickListener(dialogClickListener: OnDialogClickListener): Builder {
            this.dialogClickListener = dialogClickListener
            return this
        }

    }

}