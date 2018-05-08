package com.kongwen.common;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.kongwen.R;

/**
 * Created by PEO on 2017/2/25.
 * 图片加载库
 */
public final class GlideLoader {

    //小图
    public static void displayTmb(Context context, ImageView imageView, String path) {
        int placeholder = R.drawable.rc_image_error;
        Glide.with(context)
                .load(path)//加载图片地址
                .placeholder(placeholder)//设置占位符
                .error(placeholder)//发生错误时显示的图片
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)//设置缓存策略,原始图片和压缩过的图片都缓存
                .dontAnimate()//跳过加载动画
                .skipMemoryCache(true)//跳过内存缓存
                .into(imageView);//将图片放到指定imageview上
    }

    //原图
    public static void displayImg(Context context, ImageView imageView, String path) {
        int placeholder = R.drawable.rc_image_error;
        Glide.with(context)
                .load(path)//加载图片地址
                .error(placeholder)//发生错误时显示的图片
                .fitCenter()
                .diskCacheStrategy(DiskCacheStrategy.ALL)//设置缓存策略,原始图片和压缩过的图片都缓存
                .dontAnimate()//跳过加载动画
                .skipMemoryCache(true)//跳过内存缓存
                .into(imageView);//将图片放到指定imageview上
    }

}
