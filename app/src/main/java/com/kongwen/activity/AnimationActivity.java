package com.kongwen.activity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

import com.kongwen.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * android动画
 * 1、view动画：平移动画，所放动画，旋转动画，透明度动画；
 * 2、帧动画：按顺序播放一系列图片
 * 3、属性动画：动态改变对象的属性
 */
public class AnimationActivity extends AppCompatActivity {

    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        ButterKnife.bind(this);

        initViewAnimation();
        initFrameAnimation();
    }

    /**
     * 帧动画
     */
    private void initFrameAnimation() {
        btn2.setBackgroundResource(R.drawable.frame_animation);
        AnimationDrawable drawable = (AnimationDrawable) btn2.getBackground();
        drawable.start();
    }

    /**
     * view动画
     */
    private void initViewAnimation() {
        //通过xml应用动画
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.view_animation);
//        btn1.startAnimation(animation);
        //通过代码应用动画
        AlphaAnimation animation = new AlphaAnimation(0, 1);
        animation.setDuration(3000);
        btn1.startAnimation(animation);
    }
}
