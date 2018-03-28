package com.czy.androidutils.drawable;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.czy.androidutils.BaseActivity;
import com.czy.androidutils.R;

/**
 * 作者：叶应是叶
 * 时间：2018/3/27 22:32
 * 描述：
 */
public class DrawableActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable);
        final ImageView imageView = findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionDrawable drawable = (TransitionDrawable) imageView.getBackground();
                drawable.startTransition(3000);
            }
        });
    }

}
