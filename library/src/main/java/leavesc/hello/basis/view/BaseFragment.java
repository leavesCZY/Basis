package leavesc.hello.basis.view;

import android.content.Context;
import android.support.v4.app.Fragment;

import leavesc.hello.basis.widget.LoadingDialog;

/**
 * 作者：leavesC
 * 时间：2019/4/23 9:26
 * 描述：
 */
public class BaseFragment extends Fragment implements IBaseViewAction {

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
        return getActivity();
    }

}