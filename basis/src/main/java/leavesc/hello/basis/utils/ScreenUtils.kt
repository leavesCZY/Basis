package leavesc.hello.basis.utils

import android.app.Activity
import android.content.Context
import android.graphics.Point
import android.util.DisplayMetrics
import android.util.Log
import android.util.TypedValue
import android.view.WindowManager

/**
 * 作者：leavesC
 * 时间：2019/6/21 10:46
 * 描述：
 */
object ScreenUtils {

    /**
     * 获取标题栏高度
     */
    fun getTitleHeight(activity: Activity): Int {
        val tv = TypedValue()
        if (activity.theme.resolveAttribute(android.R.attr.actionBarSize, tv, true)) {
            val resources = activity.resources
            val displayMetrics = resources.displayMetrics
            return TypedValue.complexToDimensionPixelSize(tv.data, displayMetrics)
        }
        return 0
    }

    /**
     * 状态栏高度
     */
    fun getStatusBarHeight(context: Context): Int {
        val resourceId = context.resources.getIdentifier("status_bar_height", "dimen", "android")
        return if (resourceId == 0) 0 else context.resources.getDimensionPixelSize(resourceId)
    }

    /**
     * 获取屏幕宽度
     */
    fun getScreenWidth(activity: Activity): Int {
        val displayMetrics = DisplayMetrics()
        activity.windowManager.defaultDisplay.getRealMetrics(displayMetrics)
        return displayMetrics.widthPixels
    }

    /**
     * 获取屏幕宽度
     */
    fun getScreenWidth(context: Context): Int {
        val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val point = Point()
        windowManager.defaultDisplay.getSize(point)
        return point.x
    }

    /**
     * 获取屏幕宽度
     */
    fun getScreenWidth2(context: Context): Int {
        val resources = context.resources
        val displayMetrics = resources.displayMetrics
        Log.e("TAG", "" + displayMetrics.heightPixels)
        return displayMetrics.widthPixels
    }

    /**
     * 获取虚拟按键的高度，不论虚拟按键是否显示都会返回其固定高度
     */
    fun getNavigationBarHeight(context: Context): Int {
        val resourceId = context.resources.getIdentifier("navigation_bar_height", "dimen", "android")
        return if (resourceId != 0) {
            context.resources.getDimensionPixelSize(resourceId)
        } else 0
    }

    /**
     * 获取虚拟按键的高度
     * 会根据当前是否有显示虚拟按键来返回相应的值
     * 即如果隐藏了虚拟按键，则返回零
     */
    fun getNavigationBarHeightIfRoom(activity: Activity): Int {
        val displayMetrics = DisplayMetrics()
        activity.windowManager.defaultDisplay.getMetrics(displayMetrics)
        val usableHeight = displayMetrics.heightPixels
        activity.windowManager.defaultDisplay.getRealMetrics(displayMetrics)
        val realHeight = displayMetrics.heightPixels
        return realHeight - usableHeight
    }

    /**
     * 返回包括虚拟键在内的总的屏幕高度
     */
    fun getTotalScreenHeight(activity: Activity): Int {
        val displayMetrics = DisplayMetrics()
        activity.windowManager.defaultDisplay.getRealMetrics(displayMetrics)
        return displayMetrics.heightPixels
    }

    /**
     * 获取不包括虚拟按键在内的屏幕高度
     */
    fun getAvailableScreenHeight(context: Context): Int {
        val resources = context.resources
        val displayMetrics = resources.displayMetrics
        return displayMetrics.heightPixels
    }

    /**
     * 获取不包括虚拟按键在内的屏幕高度
     */
    fun getAvailableScreenHeight(activity: Activity): Int {
        val displayMetrics = DisplayMetrics()
        activity.windowManager.defaultDisplay.getMetrics(displayMetrics)
        return displayMetrics.heightPixels
    }

}