package com.autonavi.aps.amapapi.utils;

/* compiled from: SPUtil.java */
/* loaded from: classes.dex */
public final class i {
    public static android.content.SharedPreferences.Editor a(android.content.Context context, java.lang.String str) {
        return context.getSharedPreferences(str, 0).edit();
    }

    public static void a(android.content.SharedPreferences.Editor editor) {
        if (editor == null) {
            return;
        }
        editor.apply();
    }

    public static void a(android.content.SharedPreferences.Editor editor, java.lang.String str) {
        try {
            editor.remove(str);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "SpUtil", "setPrefsLong");
        }
    }

    public static void a(android.content.SharedPreferences.Editor editor, java.lang.String str, long j) {
        try {
            editor.putLong(str, j);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "SpUtil", "setPrefsLong");
        }
    }

    public static void a(android.content.SharedPreferences.Editor editor, java.lang.String str, boolean z) {
        try {
            editor.putBoolean(str, z);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "SpUtil", "updatePrefsBoolean");
        }
    }

    public static void a(android.content.SharedPreferences.Editor editor, java.lang.String str, java.lang.String str2) {
        try {
            editor.putString(str, str2);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "SpUtil", "setPrefsStr");
        }
    }

    public static void a(android.content.SharedPreferences.Editor editor, java.lang.String str, int i) {
        try {
            editor.putInt(str, i);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "SpUtil", "setPrefsInt");
        }
    }

    public static long a(android.content.Context context, java.lang.String str, java.lang.String str2, long j) {
        try {
            return context.getSharedPreferences(str, 0).getLong(str2, j);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "SpUtil", "getPrefsLong");
            return j;
        }
    }

    public static int a(android.content.Context context, java.lang.String str, java.lang.String str2, int i) {
        try {
            return context.getSharedPreferences(str, 0).getInt(str2, i);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "SpUtil", "getPrefsInt");
            return i;
        }
    }

    public static boolean a(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z) {
        try {
            return context.getSharedPreferences(str, 0).getBoolean(str2, z);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "SpUtil", "getPrefsBoolean");
            return z;
        }
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "SpUtil", "getPrefsInt");
            return str3;
        }
    }

    public static java.lang.String a(android.content.Context context) {
        return context == null ? "00:00:00:00:00:00" : a(context, "pref", "smac", "00:00:00:00:00:00");
    }
}
