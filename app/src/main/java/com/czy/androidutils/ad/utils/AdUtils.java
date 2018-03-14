package com.czy.androidutils.ad.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * 作者：叶应是叶
 * 时间：2018/3/14 22:38
 * 描述：
 */
public class AdUtils {

    /**
     * 打开应用市场指定应用的详情页
     *
     * @param context     上下文
     * @param packageName 包名
     */
    public static void openApplicationMarket(Context context, String packageName) {
        context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + packageName)));
    }

    /**
     * 打开京东客户端指定商铺
     *
     * @param context 上下文
     * @param shopId  商铺ID
     */
    public static void openJdShop(Context context, long shopId) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("openApp.jdMobile://virtual?params={\"category\":\"jump\",\"des\":\"jshopMain\",\"shopId\":\"" + shopId + "\",\"sourceType\":\"M_sourceFrom\",\"sourceValue\":\"dp\"}"));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    /**
     * 打开京东客户端指定商品详情页
     *
     * @param context 上下文
     * @param goodsId 商品ID
     */
    public static void openJdGoods(Context context, long goodsId) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("openApp.jdMobile://virtual?params={\"category\":\"jump\",\"des\":\"productDetail\",\"skuId\":\"" + goodsId + "\",\"sourceType\":\"JSHOP_SOURCE_TYPE\",\"sourceValue\":\"JSHOP_SOURCE_VALUE\"}"));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    /**
     * 打开淘宝客户端指定商铺
     *
     * @param context 上下文
     * @param shopId  商铺ID
     */
    public static void openTaoBaoShop(Context context, long shopId) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("taobao://shop.m.taobao.com/shop/shop_index.htm?shop_id=" + shopId));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    /**
     * 打开淘宝客户端指定商品详情页
     *
     * @param context 上下文
     * @param goodsId 商品ID
     */
    public static void openTaoBaoGoods(Context context, long goodsId) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("taobao://item.taobao.com/item.htm?id=" + goodsId));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    /**
     * 打开天猫客户端指定商铺
     *
     * @param context 上下文
     * @param shopId  商铺ID
     */
    public static void openTmallShop(Context context, long shopId) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tmall://page.tm/shop?shopId=" + shopId));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    /**
     * 打开天猫客户端指定商品详情页
     *
     * @param context 上下文
     * @param goodsId 商品ID
     */
    public static void openTmallGoods(Context context, long goodsId) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tmall://tmallclient/?{\"action\":”item:id=" + goodsId + "”}"));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

}