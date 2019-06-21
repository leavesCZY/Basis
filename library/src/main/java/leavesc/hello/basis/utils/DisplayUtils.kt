package leavesc.hello.basis.utils

import android.content.Context

/**
 * 作者：leavesC
 * 时间：2019/6/21 10:46
 * 描述：
 */
object DisplayUtils {

    /**
     * dp值转换为px值
     */
    fun dp2px(context: Context, dpValue: Float): Int {
        return (dpValue * context.resources.displayMetrics.density + 0.5f).toInt()
    }

    /**
     * px值转换为dp值
     */
    fun px2dp(context: Context, pxValue: Float): Int {
        return (pxValue / context.resources.displayMetrics.density + 0.5f).toInt()
    }

    /**
     * px值转换为sp值
     */
    fun px2sp(context: Context, pxValue: Float): Int {
        return (pxValue / context.resources.displayMetrics.scaledDensity + 0.5f).toInt()
    }

    /**
     * sp值转换为px值
     */
    fun sp2px(context: Context, spValue: Float): Int {
        return (spValue * context.resources.displayMetrics.scaledDensity + 0.5f).toInt()
    }

}
