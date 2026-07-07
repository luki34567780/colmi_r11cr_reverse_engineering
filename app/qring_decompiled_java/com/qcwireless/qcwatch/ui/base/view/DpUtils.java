package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class DpUtils {
    public static float px2dp(android.content.Context context, float px) {
        return (px / context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static float dp2px(android.content.Context context, float dp) {
        return (dp * context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}
