package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: AAIDManager.java */
/* loaded from: classes.dex */
public class iw {
    private static iw a;
    private static boolean b;
    private static boolean c;
    private Context d;

    private iw(Context context) {
        this.d = context;
    }

    public static iw a(Context context) {
        if (a == null) {
            synchronized (iw.class) {
                if (a == null) {
                    a = new iw(context);
                }
            }
        }
        return a;
    }

    public final String a() {
        String str = "";
        try {
            if (it.d) {
                str = is.c(this.d);
                long d = is.d(this.d);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (TextUtils.isEmpty(str)) {
                    lz.a().a(new ma() { // from class: com.amap.api.col.3sl.iw.1
                        @Override // com.amap.api.col.p0003sl.ma
                        public final void runTask() {
                            iw.this.b();
                        }
                    });
                } else if (elapsedRealtime - d > it.b) {
                    lz.a().a(new ma() { // from class: com.amap.api.col.3sl.iw.2
                        @Override // com.amap.api.col.p0003sl.ma
                        public final void runTask() {
                            iw.this.c();
                        }
                    });
                }
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            if (!b) {
                b = true;
                iu iuVar = new iu(this.d);
                new ks();
                la a2 = ks.a(iuVar);
                if (a2 != null) {
                    JSONObject jSONObject = new JSONObject(ir.a(iv.a(a2.a, ir.c("YWDR1a2R2WEd0M3RXdHRocg==").getBytes())));
                    if (jSONObject.optBoolean("suc")) {
                        is.f(this.d, iuVar.a);
                        is.g(this.d, iuVar.b);
                        is.h(this.d, iuVar.c);
                        is.i(this.d, iuVar.d);
                        is.j(this.d, iuVar.e);
                        is.k(this.d, iuVar.f);
                        is.l(this.d, iuVar.g);
                        is.b(this.d, iuVar.i);
                        is.m(this.d, iuVar.h);
                        is.a(this.d, SystemClock.elapsedRealtime());
                        String optString = jSONObject.optString("aaid", "");
                        String optString2 = jSONObject.optString("resetToken", "");
                        String optString3 = jSONObject.optString("uabc", "");
                        if (!TextUtils.isEmpty(optString)) {
                            is.c(this.d, optString);
                        }
                        if (!TextUtils.isEmpty(optString2)) {
                            is.e(this.d, optString2);
                        }
                        if (!TextUtils.isEmpty(optString3)) {
                            is.d(this.d, optString3);
                        }
                    }
                }
                b = false;
                return;
            }
            b = false;
        } catch (Throwable unused) {
            b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            if (!c) {
                c = true;
                ix ixVar = new ix(this.d);
                new ks();
                la a2 = ks.a(ixVar);
                if (a2 != null) {
                    JSONObject jSONObject = new JSONObject(ir.a(iv.a(a2.a, ir.c("YWDR1a2R2WEd0M3RXdHRocg==").getBytes())));
                    if (jSONObject.optBoolean("suc")) {
                        is.f(this.d, ixVar.a);
                        is.g(this.d, ixVar.b);
                        is.h(this.d, ixVar.c);
                        is.i(this.d, ixVar.d);
                        is.j(this.d, ixVar.e);
                        is.k(this.d, ixVar.f);
                        is.l(this.d, ixVar.g);
                        is.b(this.d, ixVar.i);
                        is.m(this.d, ixVar.h);
                        is.a(this.d, SystemClock.elapsedRealtime());
                        String optString = jSONObject.optString("aaid", "");
                        String optString2 = jSONObject.optString("resetToken", "");
                        String optString3 = jSONObject.optString("uabc", "");
                        if (!TextUtils.isEmpty(optString)) {
                            is.c(this.d, optString);
                        }
                        if (!TextUtils.isEmpty(optString2)) {
                            is.e(this.d, optString2);
                        }
                        if (!TextUtils.isEmpty(optString3)) {
                            is.d(this.d, optString3);
                        }
                    }
                }
                c = false;
                return;
            }
            c = false;
        } catch (Throwable unused) {
            c = false;
        }
    }
}
