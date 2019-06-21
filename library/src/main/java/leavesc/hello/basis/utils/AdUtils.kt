package leavesc.hello.basis.utils

import android.content.Context
import android.content.Intent
import android.net.Uri

/**
 * 作者：leavesC
 * 时间：2019/6/21 10:45
 * 描述：
 */
object AdUtils {

    /**
     * 打开应用市场指定应用的详情页
     *
     * @param context     上下文
     * @param packageName 包名
     */
    fun openApplicationMarket(context: Context, packageName: String) {
        context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$packageName")))
    }

    /**
     * 打开京东客户端指定商铺
     *
     * @param context 上下文
     * @param shopId  商铺ID
     */
    fun openJdShop(context: Context, shopId: Long) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("openApp.jdMobile://virtual?params={\"category\":\"jump\",\"des\":\"jshopMain\",\"shopId\":\"$shopId\",\"sourceType\":\"M_sourceFrom\",\"sourceValue\":\"dp\"}"))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }

    /**
     * 打开京东客户端指定商品详情页
     *
     * @param context 上下文
     * @param goodsId 商品ID
     */
    fun openJdGoods(context: Context, goodsId: Long) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("openApp.jdMobile://virtual?params={\"category\":\"jump\",\"des\":\"productDetail\",\"skuId\":\"$goodsId\",\"sourceType\":\"JSHOP_SOURCE_TYPE\",\"sourceValue\":\"JSHOP_SOURCE_VALUE\"}"))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }

    /**
     * 打开淘宝客户端指定商铺
     *
     * @param context 上下文
     * @param shopId  商铺ID
     */
    fun openTaoBaoShop(context: Context, shopId: Long) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("taobao://shop.m.taobao.com/shop/shop_index.htm?shop_id=$shopId"))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }

    /**
     * 打开淘宝客户端指定商品详情页
     *
     * @param context 上下文
     * @param goodsId 商品ID
     */
    fun openTaoBaoGoods(context: Context, goodsId: Long) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("taobao://item.taobao.com/item.htm?id=$goodsId"))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }

    /**
     * 打开天猫客户端指定商铺
     *
     * @param context 上下文
     * @param shopId  商铺ID
     */
    fun openTmallShop(context: Context, shopId: Long) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("tmall://page.tm/shop?shopId=$shopId"))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }

    /**
     * 打开天猫客户端指定商品详情页
     *
     * @param context 上下文
     * @param goodsId 商品ID
     */
    fun openTmallGoods(context: Context, goodsId: Long) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("tmall://tmallclient/?{\"action\":”item:id=$goodsId”}"))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }

}