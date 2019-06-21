package leavesc.hello.basis.view;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;

import leavesc.hello.basis.widget.LoadingDialog;

/**
 * 作者：leavesC
 * 时间：2019/3/23 12:07
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
 */
public class BaseActivity extends AppCompatActivity implements IBaseViewAction {

    protected LoadingDialog loadingDialog;

    @Override
    public void showLoadingDialog(String message, boolean cancelable) {
        if (loadingDialog == null) {
            loadingDialog = new LoadingDialog(getContext());
        }
        loadingDialog.show(message, cancelable, false);
    }

    @Override
    public void dismissLoadingDialog() {
        if (loadingDialog != null && loadingDialog.isShowing()) {
            loadingDialog.dismiss();
        }
    }

    @Override
    public Context getContext() {
        return this;
    }

}