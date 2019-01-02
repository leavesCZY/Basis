package hello.leavesc.androidutils.drawable;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import hello.leavesc.androidutils.BaseActivity;
import hello.leavesc.androidutils.R;

/**
 * 作者：leavesC
 * 时间：2018/3/27 22:32
 * 描述：
 * GitHub：https://github.com/leavesC
 * Blog：https://www.jianshu.com/u/9df45b87cfdf
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
