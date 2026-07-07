package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class SpUtils {
    private static android.content.SharedPreferences pictureSpUtils;

    private static android.content.SharedPreferences getSp(android.content.Context context) {
        if (pictureSpUtils == null) {
            pictureSpUtils = context.getSharedPreferences(com.luck.picture.lib.config.PictureConfig.SP_NAME, 0);
        }
        return pictureSpUtils;
    }

    public static void putString(android.content.Context context, java.lang.String str, java.lang.String str2) {
        getSp(context).edit().putString(str, str2).apply();
    }

    public static void putBoolean(android.content.Context context, java.lang.String str, boolean z) {
        getSp(context).edit().putBoolean(str, z).apply();
    }

    public static boolean getBoolean(android.content.Context context, java.lang.String str, boolean z) {
        return getSp(context).getBoolean(str, z);
    }
}
