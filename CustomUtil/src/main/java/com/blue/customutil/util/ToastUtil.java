package com.blue.customutil.util;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;

/**
 * @author: Administrator
 * @date: 2018/6/5 0005 23:08
 */
public class ToastUtil {
    private static Toast mToast;
    private static Handler mHandler = new Handler();
    private static Runnable r = new Runnable() {
        @Override
        public void run() {
            ToastUtil.mToast.cancel();
        }
    };

    public ToastUtil() {
    }

    public static void showToastNotRepeat(Context context, String text, int duration) {
        mHandler.removeCallbacks(r);
        if (mToast != null) {
            mToast.setText(text);
        } else {
            mToast = Toast.makeText(context.getApplicationContext(), text, 0);
        }

        mHandler.postDelayed(r, (long)duration);
        mToast.show();
    }

    public static void showToastNotRepeat(Context context, int resourceId, int duration) {
        showToastNotRepeat(context, context.getResources().getString(resourceId), duration);
    }

    public static void DefaultToast(Context context, String text, int duration) {
        Toast.makeText(context, text, duration).show();
    }

    public static void DefaultToast(Context context, String text, int duration, int gravity, int xOffset, int yOffset) {
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(gravity, xOffset, yOffset);
        toast.show();
    }

    public static void DefaultToast(Context context, int resourceId, int duration) {
        Toast.makeText(context, context.getResources().getString(resourceId), duration).show();
    }

    public static void DefaultToast(Context context, int resourceId, int duration, int gravity, int xOffset, int yOffset) {
        Toast toast = Toast.makeText(context, context.getResources().getString(resourceId), duration);
        toast.setGravity(gravity, xOffset, yOffset);
        toast.show();
    }
}
