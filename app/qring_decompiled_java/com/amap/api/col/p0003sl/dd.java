package com.amap.api.col.p0003sl;

/* compiled from: AuthLogUtil.java */
/* loaded from: classes.dex */
public final class dd {
    static java.lang.String a;

    static {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < 80; i++) {
            sb.append("=");
        }
        a = sb.toString();
    }

    public static void a() {
        c(a);
        c("当前使用的自定义地图样式文件和目前版本不匹配，请到官网(lbs.amap.com)更新新版样式文件");
        c(a);
    }

    public static void a(java.lang.String str) {
        c(a);
        c(str);
        c(a);
    }

    public static void a(android.content.Context context, java.lang.String str) {
        c(a);
        if (context != null) {
            b("key:" + com.amap.api.col.p0003sl.ie.f(context));
        }
        c(str);
        c(a);
    }

    private static void b(java.lang.String str) {
        if (str.length() < 78) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.king.zxing.util.LogUtils.VERTICAL);
            sb.append(str);
            for (int i = 0; i < 78 - str.length(); i++) {
                sb.append(" ");
            }
            sb.append(com.king.zxing.util.LogUtils.VERTICAL);
            c(sb.toString());
            return;
        }
        c(com.king.zxing.util.LogUtils.VERTICAL + str.substring(0, 78) + com.king.zxing.util.LogUtils.VERTICAL);
        b(str.substring(78));
    }

    private static void c(java.lang.String str) {
        android.util.Log.i("authErrLog", str);
    }
}
