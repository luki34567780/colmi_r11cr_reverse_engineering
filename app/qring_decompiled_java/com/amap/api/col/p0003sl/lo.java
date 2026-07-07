package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Build;
import java.io.ByteArrayOutputStream;

/* compiled from: StatisticsHeaderDataStrategy.java */
/* loaded from: classes.dex */
public final class lo extends lq {
    public static int a = 13;
    public static int b = 6;
    private Context e;

    public lo(Context context, lq lqVar) {
        super(lqVar);
        this.e = context;
    }

    @Override // com.amap.api.col.p0003sl.lq
    protected final byte[] a(byte[] bArr) {
        byte[] a2 = a(this.e);
        byte[] bArr2 = new byte[a2.length + bArr.length];
        System.arraycopy(a2, 0, bArr2, 0, a2.length);
        System.arraycopy(bArr, 0, bArr2, a2.length, bArr.length);
        return bArr2;
    }

    private static byte[] a(Context context) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[0];
        try {
            try {
                ir.a(byteArrayOutputStream, "1.2." + a + "." + b);
                ir.a(byteArrayOutputStream, "Android");
                ir.a(byteArrayOutputStream, ii.k());
                ir.a(byteArrayOutputStream, ii.h());
                ir.a(byteArrayOutputStream, ii.f(context));
                ir.a(byteArrayOutputStream, Build.MANUFACTURER);
                ir.a(byteArrayOutputStream, Build.MODEL);
                ir.a(byteArrayOutputStream, Build.DEVICE);
                ir.a(byteArrayOutputStream, ii.n());
                ir.a(byteArrayOutputStream, ie.c(context));
                ir.a(byteArrayOutputStream, ie.d(context));
                ir.a(byteArrayOutputStream, ie.f(context));
                byteArrayOutputStream.write(new byte[]{0});
                bArr = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            try {
                ju.c(th2, "sm", "gh");
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
                throw th3;
            }
        }
        return bArr;
    }
}
