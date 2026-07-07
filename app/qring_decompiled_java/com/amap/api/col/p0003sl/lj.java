package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.col.p0003sl.kp;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public final class lj {
    public static void a(Context context, lc lcVar, String str, int i, int i2, String str2) {
        lcVar.a = js.c(context, str);
        lcVar.d = i;
        lcVar.b = i2;
        lcVar.c = str2;
    }

    public static lc a(WeakReference<lc> weakReference) {
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference<>(new lc());
        }
        return weakReference.get();
    }

    static byte[] a(kp kpVar, String str) {
        kp.b bVar;
        byte[] bArr = new byte[0];
        InputStream inputStream = null;
        try {
            bVar = kpVar.a(str);
            if (bVar == null) {
                if (bVar != null) {
                    try {
                        bVar.close();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                return bArr;
            }
            try {
                InputStream a = bVar.a();
                if (a == null) {
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                    return bArr;
                }
                bArr = new byte[a.available()];
                a.read(bArr);
                if (a != null) {
                    try {
                        a.close();
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                    }
                }
                if (bVar != null) {
                    try {
                        bVar.close();
                    } catch (Throwable th5) {
                        th5.printStackTrace();
                    }
                }
                return bArr;
            } catch (Throwable th6) {
                th = th6;
                try {
                    ju.c(th, "sui", "rdS");
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (Throwable th7) {
                            th7.printStackTrace();
                        }
                    }
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (Throwable th8) {
                            th8.printStackTrace();
                        }
                    }
                    return bArr;
                } finally {
                }
            }
        } catch (Throwable th9) {
            th = th9;
            bVar = null;
        }
    }

    public static String a() {
        return ir.a(System.currentTimeMillis());
    }

    public static String a(Context context, iq iqVar) {
        StringBuilder sb = new StringBuilder();
        try {
            String e = ii.e();
            sb.append("\"sim\":\"");
            sb.append(e);
            sb.append("\",\"sdkversion\":\"");
            sb.append(iqVar.c());
            sb.append("\",\"product\":\"");
            sb.append(iqVar.a());
            sb.append("\",\"ed\":\"");
            sb.append(iqVar.d());
            sb.append("\",\"nt\":\"");
            sb.append(ii.c(context));
            sb.append("\",\"np\":\"");
            sb.append(ii.b(context));
            sb.append("\",\"mnc\":\"");
            sb.append(ii.d());
            sb.append("\",\"ant\":\"");
            sb.append(ii.d(context));
            sb.append("\"");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }

    public static String a(String str, String str2, int i, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(",\"timestamp\":\"");
        stringBuffer.append(str2);
        stringBuffer.append("\",\"et\":\"");
        stringBuffer.append(i);
        stringBuffer.append("\",\"classname\":\"");
        stringBuffer.append(str3);
        stringBuffer.append("\",");
        stringBuffer.append("\"detail\":\"");
        stringBuffer.append(str4);
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }

    public static String a(String str, String str2, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(",\"timestamp\":\"");
        stringBuffer.append(str2);
        stringBuffer.append("\",\"et\":\"");
        stringBuffer.append(1);
        stringBuffer.append("\",\"classname\":\"");
        stringBuffer.append(str3);
        stringBuffer.append("\",");
        stringBuffer.append("\"detail\":\"");
        stringBuffer.append(str4);
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }
}
