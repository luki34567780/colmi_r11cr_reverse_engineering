package com.autonavi.amap.mapcore;

/* loaded from: classes.dex */
public class MsgProcessor {
    private static com.amap.api.col.p0003sl.jx mDelegate = new com.amap.api.col.p0003sl.jx();

    public static native int nativeInit(android.content.Context context);

    public static void nativeInitInfo(android.content.Context context, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        mDelegate.a(context, z, str, str2, str3, strArr);
        nativeInit(context);
    }

    public static void nativeMsgProcessor(java.lang.String str, java.lang.String str2) {
        mDelegate.a(str, str2);
    }
}
