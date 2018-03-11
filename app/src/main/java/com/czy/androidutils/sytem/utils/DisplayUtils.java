package com.czy.androidutils.sytem.utils;

import android.content.Context;

/**
 * 作者：叶应是叶
 * 时间：2018/3/11 16:30
 * 描述：
 */
public class DisplayUtils {

    /**
     * dp值转换为px值
     */
    public static int dp2px(Context context, float dpValue) {
        return (int) (dpValue * context.getResources().getDisplayMetrics().density + 0.5f);
    }

    /**
     * px值转换为dp值
     */
    public static int px2dp(Context context, float pxValue) {
        return (int) (pxValue / context.getResources().getDisplayMetrics().density + 0.5f);
    }

    /**
     * px值转换为sp值
     */
    public static int px2sp(Context context, float pxValue) {
        return (int) (pxValue / context.getResources().getDisplayMetrics().scaledDensity + 0.5f);
    }

    /**
     * sp值转换为px值
     */
    public static int sp2px(Context context, float spValue) {
        return (int) (spValue * context.getResources().getDisplayMetrics().scaledDensity + 0.5f);
    }

}
