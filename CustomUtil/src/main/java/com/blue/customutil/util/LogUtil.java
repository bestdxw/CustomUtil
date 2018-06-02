package com.blue.customutil.util;

import android.util.Log;

import com.blue.customutil.BuildConfig;

/**
 * 通用log日志
 *
 * @author Blue
 * @date 2018/6/2 12:11
 */
public class LogUtil {
    public static void d(String tag, String message) {
        if (BuildConfig.LOGE_DEBUG) {
            Log.d(tag, message);
        }
    }
}
