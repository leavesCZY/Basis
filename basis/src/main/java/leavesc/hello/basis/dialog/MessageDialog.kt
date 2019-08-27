package leavesc.hello.basis.dialog

import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import leavesc.hello.basis.R
import leavesc.hello.basis.dialog.base.BaseDialogFragment

/**
 * 作者：leavesC
 * 时间：2019/6/20 17:43
 * 描述：
 */
class MessageDialog : BaseDialogFragment() {

    var content = ""

    override fun getContentView(): View? {
        var view: View? = null
        if (content.isNotEmpty()) {
            view = LayoutInflater.from(activity).inflate(R.layout.dialog_message, null)
            val tvContent = view.findViewById<TextView>(R.id.tvContent)
            tvContent.text = content
        }
        return view
    }

}