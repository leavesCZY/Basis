package com.czy.androidutils.sytem.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.WindowManager;

/**
 * 作者：叶应是叶
 * 时间：2018/3/11 14:13
 * 描述：
 */
public class ScreenUtils {

    /**
     * 获取标题栏高度
     */
    public static int getTitleHeight(Activity activity) {
        TypedValue tv = new TypedValue();
        if (activity.getTheme().resolveAttribute(android.R.attr.actionBarSize, tv, true)) {
            Resources resources = activity.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            return TypedValue.complexToDimensionPixelSize(tv.data, displayMetrics);
        }
        return 0;
    }

    /**
     * 状态栏高度
     */
    public static int getStatusBarHeight(Context context) {
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return resourceId == 0 ? 0 : context.getResources().getDimensionPixelSize(resourceId);
    }

    /**
     * 获取屏幕宽度
     */
    public static int getScreenWidth(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /**
     * 获取屏幕宽度
     */
    public static int getScreenWidth(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        if (windowManager != null) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            return point.x;
        }
        return 0;
    }

    /**
     * 获取屏幕宽度
     */
    public static int getScreenWidth2(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Log.e("TAG", "" + displayMetrics.heightPixels);
        return displayMetrics.widthPixels;
    }

    /**
     * 获取虚拟按键的高度，不论虚拟按键是否显示都会返回其固定高度
     */
    public static int getNavigationBarHeight(Context context) {
        int resourceId = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId != 0) {
            return context.getResources().getDimensionPixelSize(resourceId);
        }
        return 0;
    }

    /**
     * 获取虚拟按键的高度
     * 会根据当前是否有显示虚拟按键来返回相应的值
     * 即如果隐藏了虚拟按键，则返回零
     */
    public static int getNavigationBarHeightIfRoom(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int usableHeight = displayMetrics.heightPixels;
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        int realHeight = displayMetrics.heightPixels;
        return realHeight - usableHeight;
    }

    /**
     * 返回包括虚拟键在内的总的屏幕高度
     */
    public static int getTotalScreenHeight(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /**
     * 获取不包括虚拟按键在内的屏幕高度
     */
    public static int getAvailableScreenHeight(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return displayMetrics.heightPixels;
    }

    /**
     * 获取不包括虚拟按键在内的屏幕高度
     */
    public static int getAvailableScreenHeight(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

}
