package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import coil.disk.DiskLruCache;
import com.amap.api.col.p0003sl.jv;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* compiled from: AMapLogManager.java */
/* loaded from: classes.dex */
public final class jb {
    private Context a;
    private iq b;
    private boolean c = true;
    private boolean d = false;
    private boolean e = true;
    private boolean f = false;
    private List<String> g = new ArrayList();
    private jd h = new jd((byte) 0);
    private jd i = new jd();
    private jv.a j = new jv.a() { // from class: com.amap.api.col.3sl.jb.1
        @Override // com.amap.api.col.3sl.jv.a
        public final void a(int i) {
            if (i > 0 && jb.a(jb.this) != null) {
                ((jc) jb.this.c().f).a(i);
                jb.a(jb.this, "error", String.valueOf(((jc) jb.this.c().f).b()));
                jb.a(jb.this).postDelayed(new Runnable() { // from class: com.amap.api.col.3sl.jb.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        jb.this.c(false);
                    }
                }, 660000L);
            }
        }
    };
    private jv.a k = new jv.a() { // from class: com.amap.api.col.3sl.jb.2
        @Override // com.amap.api.col.3sl.jv.a
        public final void a(int i) {
            if (i <= 0) {
                return;
            }
            ((jc) jb.this.e().f).a(i);
            jb.a(jb.this, "info", String.valueOf(((jc) jb.this.e().f).b()));
            if (jb.a(jb.this) == null) {
                return;
            }
            jb.a(jb.this).postDelayed(new Runnable() { // from class: com.amap.api.col.3sl.jb.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    jb.this.d(false);
                }
            }, 660000L);
        }
    };
    private Handler l = null;
    private lc m = null;
    private lc n = null;

    /* compiled from: AMapLogManager.java */
    static class a {
        public static Map<String, jb> a = new HashMap();
    }

    public static jb a(iq iqVar) {
        if (iqVar == null || TextUtils.isEmpty(iqVar.a())) {
            return null;
        }
        if (a.a.get(iqVar.a()) == null) {
            a.a.put(iqVar.a(), new jb(iqVar));
        }
        return a.a.get(iqVar.a());
    }

    private jb(iq iqVar) {
        this.b = iqVar;
    }

    public final void a(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void a(boolean z, boolean z2, boolean z3, boolean z4, List<String> list) {
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = list;
        d();
        f();
    }

    public final void a(boolean z) {
        if (b()) {
            b(z);
        }
    }

    public final void a(ja jaVar) {
        if (b() && this.c && ja.a(jaVar)) {
            boolean z = true;
            if (jaVar != null) {
                List<String> list = this.g;
                if (list != null && list.size() != 0) {
                    for (int i = 0; i < this.g.size(); i++) {
                        if (!TextUtils.isEmpty(this.g.get(i)) && jaVar.b().contains(this.g.get(i))) {
                            break;
                        }
                    }
                }
                z = false;
            }
            if (z) {
                return;
            }
            if (this.e || jaVar.a() != ja.a) {
                jd b = b(jaVar.a());
                if (b.a(jaVar.b())) {
                    String a2 = ja.a(b.a());
                    if (this.a == null || TextUtils.isEmpty(a2) || HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(a2)) {
                        return;
                    }
                    jv.a(this.a, this.b, jaVar.c(), c(jaVar.a()), a2);
                    b(false);
                    b.b();
                }
                b.a(jaVar);
            }
        }
    }

    public final void a() {
        if (b()) {
            a(ja.b);
            a(ja.a);
        }
    }

    private void a(int i) {
        Context context;
        jd b = b(i);
        String a2 = ja.a(b.a());
        if (TextUtils.isEmpty(a2) || HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(a2) || (context = this.a) == null) {
            return;
        }
        jv.a(context, this.b, ja.a(i), c(i), a2);
        b.b();
    }

    private boolean b() {
        return this.a != null;
    }

    private jd b(int i) {
        if (i == ja.b) {
            return this.i;
        }
        return this.h;
    }

    private void b(boolean z) {
        c(z);
        d(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        lc c = c(ja.b);
        if (z) {
            ((jc) c.f).a(z);
        }
        Context context = this.a;
        if (context == null) {
            return;
        }
        jv.a(context, c, this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        lc c = c(ja.a);
        if (z) {
            ((jc) c.f).a(z);
        }
        Context context = this.a;
        if (context == null) {
            return;
        }
        jv.a(context, c, this.k);
    }

    private lc c(int i) {
        if (i == ja.b) {
            if (this.n == null) {
                this.n = c();
            }
            return this.n;
        }
        if (this.m == null) {
            this.m = e();
        }
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public lc c() {
        lc lcVar = this.n;
        if (lcVar != null) {
            return lcVar;
        }
        d();
        return this.n;
    }

    private lc d() {
        if (this.a == null) {
            return null;
        }
        lc lcVar = new lc();
        this.n = lcVar;
        lcVar.a = h();
        this.n.b = 512000000L;
        this.n.d = GoogleSignInStatusCodes.SIGN_IN_FAILED;
        this.n.c = DiskLruCache.VERSION;
        this.n.h = -1;
        this.n.i = "elkey";
        long a2 = a("error");
        this.n.f = new jc(true, new lx(this.a, this.d), a2, 10000000);
        this.n.g = null;
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public lc e() {
        lc lcVar = this.m;
        if (lcVar != null) {
            return lcVar;
        }
        f();
        return this.m;
    }

    private long a(String str) {
        try {
            String format = new SimpleDateFormat("yyyyMMdd").format(new Date());
            return Long.parseLong(je.a(this.b).a(this.a, "", "", format + str));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private lc f() {
        if (this.a == null) {
            return null;
        }
        lc lcVar = new lc();
        this.m = lcVar;
        lcVar.a = g();
        this.m.b = 512000000L;
        this.m.d = GoogleSignInStatusCodes.SIGN_IN_FAILED;
        this.m.c = DiskLruCache.VERSION;
        this.m.h = -1;
        this.m.i = "inlkey";
        long a2 = a("info");
        this.m.f = new jc(this.f, new lx(this.a, this.d), a2, 30000000);
        this.m.g = null;
        return this.m;
    }

    private String g() {
        Context context = this.a;
        if (context == null) {
            return null;
        }
        return a(context, "CAF9B6B99962BF5C2264824231D7A40C", this.b);
    }

    private String h() {
        Context context = this.a;
        if (context == null) {
            return null;
        }
        return a(context, "CB5E100E5A9A3E7F6D1FD97512215282", this.b);
    }

    private static String a(Context context, String str, iq iqVar) {
        String b;
        if (context == null) {
            return null;
        }
        if (iqVar != null) {
            try {
                if (!TextUtils.isEmpty(iqVar.a())) {
                    b = im.b(iqVar.a());
                    return context.getFilesDir().getAbsolutePath() + File.separator + "EBDEC84EF205FEA2DF0719DEB822869E" + File.separator + str + File.separator + b;
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        b = "a";
        return context.getFilesDir().getAbsolutePath() + File.separator + "EBDEC84EF205FEA2DF0719DEB822869E" + File.separator + str + File.separator + b;
    }

    static /* synthetic */ Handler a(jb jbVar) {
        Context context = jbVar.a;
        if (context == null || context == null) {
            return null;
        }
        if (jbVar.l == null) {
            jbVar.l = new Handler(jbVar.a.getMainLooper());
        }
        return jbVar.l;
    }

    static /* synthetic */ void a(jb jbVar, String str, String str2) {
        try {
            String format = new SimpleDateFormat("yyyyMMdd").format(new Date());
            je.a(jbVar.b).a(jbVar.a, "", "", format + str, str2);
        } catch (Throwable unused) {
        }
    }
}
