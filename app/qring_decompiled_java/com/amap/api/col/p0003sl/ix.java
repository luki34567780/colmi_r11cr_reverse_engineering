package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Build;
import org.json.JSONObject;

/* compiled from: AAIDRemapRequest.java */
/* loaded from: classes.dex */
public final class ix extends iz {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    protected byte[] j;

    public ix(Context context) {
        super(context);
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final byte[] getEntityBytes() {
        byte[] bArr = this.j;
        if (bArr != null) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", "remap");
            jSONObject.put("package_name", ie.c(this.k));
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_type", "Android");
            jSONObject.put("sdk_version", "4.3.6");
            String a = iv.a();
            this.a = a;
            jSONObject.put("t1", a);
            jSONObject.put("old_t1", is.g(this.k));
            String b = iv.b();
            this.b = b;
            jSONObject.put("t2", b);
            jSONObject.put("old_t2", is.h(this.k));
            String c = iv.c();
            this.c = c;
            jSONObject.put("t3", c);
            jSONObject.put("old_t3", is.i(this.k));
            String d = iv.d();
            this.d = d;
            jSONObject.put("s1", d);
            jSONObject.put("old_s1", is.j(this.k));
            String e = iv.e();
            this.e = e;
            jSONObject.put("s2", e);
            jSONObject.put("old_s2", is.k(this.k));
            String f = iv.f();
            this.f = f;
            jSONObject.put("s3", f);
            jSONObject.put("old_s3", is.l(this.k));
            String g = iv.g();
            this.g = g;
            jSONObject.put("s4", g);
            jSONObject.put("old_s4", is.m(this.k));
            jSONObject.put("uuid", iv.a(this.k));
            jSONObject.put("android_id", ii.g());
            jSONObject.put("hostname", iv.h());
            String t = ii.t(this.k);
            this.h = t;
            jSONObject.put("gaid", t);
            jSONObject.put("old_gaid", is.n(this.k));
            String e2 = ii.e(this.k);
            this.i = e2;
            jSONObject.put("oaid", e2);
            jSONObject.put("old_oaid", is.b(this.k));
            jSONObject.put("aaid", is.c(this.k));
            jSONObject.put("resetToken", is.f(this.k));
            jSONObject.put("uabc", is.e(this.k));
            this.j = iv.a(ir.d(jSONObject.toString().getBytes("utf-8")), ir.c("YWDR1a2R2WEd0M3RXdHRocg==").getBytes());
        } catch (Throwable unused) {
        }
        return this.j;
    }
}
