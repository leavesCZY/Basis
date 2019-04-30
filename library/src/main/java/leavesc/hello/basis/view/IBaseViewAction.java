package leavesc.hello.basis.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.StringRes;
import android.widget.Toast;

/**
 * 作者：leavesC
 * 时间：2019/4/23 9:27
 * 描述：
 */
public interface IBaseViewAction {

    Context getContext();

    void showLoadingDialog(String message, boolean cancelable);

    default void showLoadingDialog(String message) {
        showLoadingDialog(message, false);
    }

    void dismissLoadingDialog();

    default <T extends Activity> void startActivity(Class<T> clazz) {
        getContext().startActivity(new Intent(getContext(), clazz));
    }

    default void showToast(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }

    default void showToast(@StringRes int id) {
        showToast(getContext().getString(id));
    }

}