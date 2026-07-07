package com.amap.api.col.p0003sl;

/* compiled from: MsgProcessorDelegate.java */
/* loaded from: classes.dex */
public final class jx {
    private android.content.Context a;
    private com.amap.api.col.p0003sl.iq b;
    private boolean c = true;
    private java.lang.String d = "40C27E38DCAD404B5465362914090908";
    private com.amap.api.col.p0003sl.ka e = new com.amap.api.col.p0003sl.ka("40C27E38DCAD404B5465362914090908");

    public final void a(android.content.Context context, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        try {
            com.amap.api.col.p0003sl.iq a = new com.amap.api.col.3sl.iq.a(str, str2, str).a(strArr).a(str3).a();
            if (context != null) {
                android.content.Context applicationContext = context.getApplicationContext();
                this.a = applicationContext;
                this.b = a;
                this.c = z;
                this.e.a(applicationContext, a);
            }
        } catch (com.amap.api.col.p0003sl.id unused) {
        }
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        java.util.List<com.amap.api.col.p0003sl.iq> a = this.e.a(this.a);
        com.amap.api.col.p0003sl.jy jyVar = com.amap.api.col.3sl.jy.a.a;
        com.amap.api.col.p0003sl.jy.a(this.a, str, str2, a, this.c, this.b);
    }
}
