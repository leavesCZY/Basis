package com.czy.androidutils.ad;

import android.os.Bundle;
import android.view.View;

import com.czy.androidutils.BaseActivity;
import com.czy.androidutils.R;
import com.czy.androidutils.ad.utils.AdUtils;

import static com.czy.androidutils.sytem.utils.AppInfoUtils.appExist;

/**
 * 作者：叶应是叶
 * 时间：2018/3/14 22:39
 * 描述：
 */
public class AdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad);
    }

    public void openApplicationMarket(View view) {
        AdUtils.openApplicationMarket(this, "com.tencent.mobileqq");
    }

    public void openJdShop(View view) {
        if (appExist(this, "com.jingdong.app.mall")) {
            AdUtils.openJdShop(this, 1000004123);
        } else {
            showToast("没有安装京东客户端");
        }
    }

    public void openJdGoods(View view) {
        if (appExist(this, "com.jingdong.app.mall")) {
            AdUtils.openJdGoods(this, 6703337);
        } else {
            showToast("没有安装京东客户端");
        }
    }

    public void openTaoBaoShop(View view) {
        if (appExist(this, "com.taobao.taobao")) {
            AdUtils.openTaoBaoShop(this, 104736810);
        } else {
            showToast("没有安装淘宝客户端");
        }
    }

    public void openTaoBaoGoods(View view) {
        if (appExist(this, "com.taobao.taobao")) {
            AdUtils.openTaoBaoGoods(this, 547630642483L);
        } else {
            showToast("没有安装淘宝客户端");
        }
    }

    public void openTmallShop(View view) {
        if (appExist(this, "com.tmall.wireless")) {
            AdUtils.openTmallShop(this, 104736810);
        } else {
            showToast("没有安装天猫客户端");
        }
    }

    public void openTmallGoods(View view) {
        if (appExist(this, "com.tmall.wireless")) {
            AdUtils.openTmallGoods(this, 547630642483L);
        } else {
            showToast("没有安装天猫客户端");
        }
    }

}
