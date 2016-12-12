package com.talnews.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ThinkPad on 2016/11/21.
 */

public class ToastUtil {

    public ToastUtil() {
        super();
    }

    public static void showToast(Context context, String toast){
        Toast.makeText(context, toast, Toast.LENGTH_SHORT).show();
    }
}
