package leavesc.hello.basis.widget;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.StringRes;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import leavesc.hello.basis.R;

/**
 * 作者：leavesC
 * 时间：2019/3/23 11:43
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class LoadingDialog extends Dialog {

    private ImageView iv_loading;

    private TextView tv_hint;

    private Animation animation;

    public LoadingDialog(Context context) {
        super(context, R.style.LoadingDialogTheme);
        setContentView(R.layout.dialog_loading);
        iv_loading = findViewById(R.id.iv_loading);
        tv_hint = findViewById(R.id.tv_hint);
        animation = AnimationUtils.loadAnimation(context, R.anim.loading_dialog);
    }

    public void show(String hintText, boolean cancelable, boolean canceledOnTouchOutside) {
        setCancelable(cancelable);
        setCanceledOnTouchOutside(canceledOnTouchOutside);
        tv_hint.setText(hintText);
        iv_loading.clearAnimation();
        iv_loading.startAnimation(animation);
        show();
    }

    public void show(@StringRes int hintTextRes, boolean cancelable, boolean canceledOnTouchOutside) {
        show(getContext().getString(hintTextRes), cancelable, canceledOnTouchOutside);
    }

    @Override
    public void cancel() {
        super.cancel();
        animation.cancel();
        iv_loading.clearAnimation();
    }

    @Override
    public void dismiss() {
        super.dismiss();
        animation.cancel();
        iv_loading.clearAnimation();
    }

}