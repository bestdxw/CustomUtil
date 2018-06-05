package com.blue.customutil.util;

import android.app.Activity;

import com.blue.customutil.R;

/**
 * @author: Administrator
 * @date: 2018/6/3 0003 15:18
 */
public class ActivityUtil {
    public static void in(Activity activity){
        activity.overridePendingTransition(R.anim.image_in,R.anim.image_out);
    }
    public static void out(Activity activity){
        activity.overridePendingTransition(R.anim.image_in_left,R.anim.image_out_left);
    }
}
