package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public class UtilsTransActivity4MainProcess extends com.blankj.utilcode.util.UtilsTransActivity {
    public static void start(com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate) {
        start(null, null, transActivityDelegate, com.blankj.utilcode.util.UtilsTransActivity4MainProcess.class);
    }

    public static void start(com.blankj.utilcode.util.Utils.Consumer<android.content.Intent> consumer, com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate) {
        start(null, consumer, transActivityDelegate, com.blankj.utilcode.util.UtilsTransActivity4MainProcess.class);
    }

    public static void start(android.app.Activity activity, com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate) {
        start(activity, null, transActivityDelegate, com.blankj.utilcode.util.UtilsTransActivity4MainProcess.class);
    }

    public static void start(android.app.Activity activity, com.blankj.utilcode.util.Utils.Consumer<android.content.Intent> consumer, com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate transActivityDelegate) {
        start(activity, consumer, transActivityDelegate, com.blankj.utilcode.util.UtilsTransActivity4MainProcess.class);
    }
}
