package com.amap.api.col.p0003sl;

/* compiled from: ResourcesUtil.java */
/* loaded from: classes.dex */
public final class dr {
    private static boolean a = new java.io.File("/system/framework/amap.jar").exists();

    public static android.content.res.AssetManager a(android.content.Context context) {
        if (context == null) {
            return null;
        }
        android.content.res.AssetManager assets = context.getAssets();
        if (a) {
            try {
                assets.getClass().getDeclaredMethod("addAssetPath", java.lang.String.class).invoke(assets, "/system/framework/amap.jar");
            } catch (java.lang.Throwable th) {
                com.amap.api.col.p0003sl.ju.c(th, "ResourcesUtil", "getSelfAssets");
            }
        }
        return assets;
    }

    public static int a(android.content.Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
