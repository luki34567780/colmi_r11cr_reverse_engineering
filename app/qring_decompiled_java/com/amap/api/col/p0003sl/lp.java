package com.amap.api.col.p0003sl;

/* compiled from: StatisticsPubDataStrategy.java */
/* loaded from: classes.dex */
public final class lp extends com.amap.api.col.p0003sl.lq {
    public lp() {
    }

    public lp(com.amap.api.col.p0003sl.lq lqVar) {
        super(lqVar);
    }

    @Override // com.amap.api.col.p0003sl.lq
    protected final byte[] a(byte[] bArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(new java.text.SimpleDateFormat("yyyyMMdd HHmmss").format(new java.util.Date()));
        stringBuffer.append(" ");
        stringBuffer.append(java.util.UUID.randomUUID().toString());
        stringBuffer.append(" ");
        if (stringBuffer.length() != 53) {
            return new byte[0];
        }
        byte[] a = com.amap.api.col.p0003sl.ir.a(stringBuffer.toString());
        byte[] bArr2 = new byte[a.length + bArr.length];
        java.lang.System.arraycopy(a, 0, bArr2, 0, a.length);
        java.lang.System.arraycopy(bArr, 0, bArr2, a.length, bArr.length);
        return bArr2;
    }
}
