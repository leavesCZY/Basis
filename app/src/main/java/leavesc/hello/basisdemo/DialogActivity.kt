package leavesc.hello.basisdemo

import android.graphics.Color
import android.os.Bundle
import android.view.View
import leavesc.hello.basis.view.BaseActivity
import leavesc.hello.basis.widget.dialog.MessageDialog
import leavesc.hello.basis.widget.dialog.base.BaseDialogFragment

/**
 * 作者：leavesC
 * 时间：2019/6/21 10:27
 * 描述：
 */
class DialogActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)
    }

    fun showLoadingDialog(view: View) {
        showLoadingDialog(true)
    }

    fun showMessageDialog(view: View) {
        val messageDialog = MessageDialog()
        messageDialog.title = "桃花源记"
        messageDialog.content = "晋太元中，武陵人捕鱼为业。缘溪行，忘路之远近。忽逢桃花林，夹岸数百步，中无杂树，芳草鲜美，落英缤纷。渔人甚异之，复前行，欲穷其林。"
        messageDialog.positiveTextColor = Color.parseColor("#008577")
        messageDialog.onPositiveClickListener = object : BaseDialogFragment.OnClickListener {
            override fun onClick() {
                showToast("点了就消失")
            }
        }
        messageDialog.onNegativeWithoutDismissClickListener = object : BaseDialogFragment.OnClickListener {
            override fun onClick() {
                showToast("点了也不消失")
            }
        }
        messageDialog.onDismissListener = object : BaseDialogFragment.OnDismissListener {
            override fun onDismiss() {
                showToast("onDismiss")
            }
        }
        showDialog(messageDialog)
    }

    fun showMessageDialog2(view: View) {
        val messageDialog = MessageDialog()
        messageDialog.content = "确定删除此记录吗？"
        messageDialog.positiveText = "删除"
        messageDialog.onPositiveClickListener = object : BaseDialogFragment.OnClickListener {
            override fun onClick() {
                showToast("点了就消失")
            }
        }
        messageDialog.onNegativeWithoutDismissClickListener = object : BaseDialogFragment.OnClickListener {
            override fun onClick() {
                showToast("点了也不消失")
            }
        }
        messageDialog.onDismissListener = object : BaseDialogFragment.OnDismissListener {
            override fun onDismiss() {
                showToast("onDismiss")
            }
        }
        showDialog(messageDialog)
    }

}