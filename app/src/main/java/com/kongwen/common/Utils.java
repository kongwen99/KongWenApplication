package com.kongwen.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

/**
 * 好用的方法工具
 */

public class Utils {
    /**
     * 获取应用的UID:系统给每一个应用分配一个不同的UID，UID相同的应用之间可以共享数据
     * @param context
     * @return
     */
    public static String getUid(Context context){
        try {
            PackageManager pm = context.getPackageManager();
            ApplicationInfo ai = pm.getApplicationInfo("com.kongwen", 0);
            Log.i("kongwen", Integer.toString(ai.uid));
            return Integer.toString(ai.uid);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 返回一个list数组的长度
     * @param list
     * @return
     */
    public static int size(List list) {
        if (list == null)
            return 0;
        if (list.isEmpty())
            return 0;
        return list.size();
    }

    /**
     * 给TextView赋值
     * @param textView
     * @param text
     * @param def
     */
    public static void injectTextDefalut(TextView textView, String text, String def) {
        if (textView == null)
            return;
        textView.setText(TextUtils.isEmpty(text) ? def : text);
    }
}
