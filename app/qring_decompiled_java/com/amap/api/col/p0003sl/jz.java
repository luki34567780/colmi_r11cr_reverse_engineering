package com.amap.api.col.p0003sl;

/* compiled from: SPConfig.java */
/* loaded from: classes.dex */
public final class jz {
    private static java.util.HashMap<java.lang.String, java.lang.String> a = new java.util.HashMap<>();

    public static void a(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar, java.lang.String str, java.lang.String str2) {
        if (iqVar == null || android.text.TextUtils.isEmpty(iqVar.a())) {
            return;
        }
        java.lang.String str3 = str + iqVar.a();
        a.put(iqVar.a() + str, str2);
        if (context == null || android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty("d7afbc6a38848a6801f6e449f3ec8e53") || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        java.lang.String g = com.amap.api.col.p0003sl.ir.g(com.amap.api.col.p0003sl.ic.a(com.amap.api.col.p0003sl.ir.a(str2)));
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences("d7afbc6a38848a6801f6e449f3ec8e53", 0).edit();
        edit.putString(str3, g);
        edit.commit();
    }

    public static java.lang.String a(android.content.Context context, com.amap.api.col.p0003sl.iq iqVar, java.lang.String str) {
        if (iqVar == null || android.text.TextUtils.isEmpty(iqVar.a())) {
            return null;
        }
        java.lang.String str2 = a.get(iqVar.a() + str);
        if (!android.text.TextUtils.isEmpty(str2)) {
            return str2;
        }
        java.lang.String str3 = str + iqVar.a();
        return (context == null || android.text.TextUtils.isEmpty(str3)) ? "" : com.amap.api.col.p0003sl.ir.a(com.amap.api.col.p0003sl.ic.b(com.amap.api.col.p0003sl.ir.d(context.getSharedPreferences("d7afbc6a38848a6801f6e449f3ec8e53", 0).getString(str3, ""))));
    }
}
