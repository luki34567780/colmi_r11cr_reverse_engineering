package com.amap.api.col.p0003sl;

/* compiled from: SPUtil.java */
/* loaded from: classes.dex */
public final class kh {
    static byte[] a;
    static byte[] b;
    private java.lang.String c;

    public kh(java.lang.String str) {
        this.c = com.amap.api.col.p0003sl.im.b(android.text.TextUtils.isDigitsOnly(str) ? "SPUtil" : str);
    }

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (context == null || android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3)) {
            return;
        }
        try {
            android.content.SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
            edit.putString(str2, com.amap.api.col.p0003sl.ir.g(a(context, com.amap.api.col.p0003sl.ir.a(str3))));
            a(edit);
        } catch (java.lang.Throwable unused) {
        }
    }

    public static byte[] a(android.content.Context context, byte[] bArr) {
        try {
            return com.amap.api.col.p0003sl.ij.b(a(context), bArr, b(context));
        } catch (java.lang.Throwable unused) {
            return new byte[0];
        }
    }

    public static byte[] b(android.content.Context context, byte[] bArr) {
        try {
            return com.amap.api.col.p0003sl.ij.a(a(context), bArr, b(context));
        } catch (java.lang.Exception unused) {
            return new byte[0];
        }
    }

    private static byte[] a(android.content.Context context) {
        if (context == null) {
            return new byte[0];
        }
        byte[] bArr = a;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        byte[] bytes = com.amap.api.col.p0003sl.ie.f(context).getBytes();
        a = bytes;
        return bytes;
    }

    private static byte[] b(android.content.Context context) {
        byte[] bArr = b;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        int i = 0;
        if (android.os.Build.VERSION.SDK_INT >= 9) {
            b = java.util.Arrays.copyOfRange(a(context), 0, a(context).length / 2);
        } else {
            b = new byte[a(context).length / 2];
            while (true) {
                byte[] bArr2 = b;
                if (i >= bArr2.length) {
                    break;
                }
                bArr2[i] = a(context)[i];
                i++;
            }
        }
        return b;
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (context == null) {
            return "";
        }
        try {
            return com.amap.api.col.p0003sl.ir.a(b(context, com.amap.api.col.p0003sl.ir.d(context.getSharedPreferences(str, 0).getString(str2, ""))));
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public static android.content.SharedPreferences.Editor a(android.content.Context context, java.lang.String str) {
        if (context != null) {
            try {
                if (!android.text.TextUtils.isEmpty(str)) {
                    return context.getSharedPreferences(str, 0).edit();
                }
            } catch (java.lang.Throwable th) {
                com.amap.api.col.p0003sl.jr.a(th, "sp", "ge");
            }
        }
        return null;
    }

    public static void a(android.content.SharedPreferences.Editor editor) {
        if (editor == null) {
            return;
        }
        try {
            editor.apply();
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "sp", "cm");
        }
    }

    public static void a(android.content.SharedPreferences.Editor editor, java.lang.String str, boolean z) {
        try {
            editor.putBoolean(str, z);
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "csp", "setPrefsStr");
        }
    }

    public static void a(android.content.SharedPreferences.Editor editor, java.lang.String str, int i) {
        try {
            editor.putInt(str, i);
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "csp", "putPrefsInt");
        }
    }

    public static boolean a(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z) {
        try {
            return context.getSharedPreferences(str, 0).getBoolean(str2, z);
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "csp", "gbv");
            return z;
        }
    }

    public static int a(android.content.Context context, java.lang.String str, java.lang.String str2, int i) {
        try {
            return context.getSharedPreferences(str, 0).getInt(str2, i);
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "csp", "giv");
            return i;
        }
    }

    public static long a(android.content.Context context, java.lang.String str, java.lang.String str2, long j) {
        try {
            return context.getSharedPreferences(str, 0).getLong(str2, j);
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "csp", "glv");
            return j;
        }
    }

    public static void a(android.content.SharedPreferences.Editor editor, java.lang.String str, long j) {
        if (editor == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            editor.putLong(str, j);
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "csp", "plv");
        }
    }

    public static void a(android.content.SharedPreferences.Editor editor, java.lang.String str, java.lang.String str2) {
        if (editor != null) {
            try {
                if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
                    editor.putString(str, str2);
                }
            } catch (java.lang.Throwable th) {
                com.amap.api.col.p0003sl.jr.a(th, "sp", "ps");
            }
        }
    }

    public static java.lang.String b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "csp", "gsv");
            return str3;
        }
    }

    public static void a(android.content.SharedPreferences.Editor editor, java.lang.String str) {
        if (editor != null) {
            try {
                if (android.text.TextUtils.isEmpty(str)) {
                    return;
                }
                editor.remove(str);
            } catch (java.lang.Throwable th) {
                com.amap.api.col.p0003sl.jr.a(th, "sp", "rk");
            }
        }
    }
}
