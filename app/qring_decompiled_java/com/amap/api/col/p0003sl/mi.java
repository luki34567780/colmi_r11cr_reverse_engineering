package com.amap.api.col.p0003sl;

import android.os.SystemClock;
import com.amap.api.col.p0003sl.mh;
import java.util.List;

/* compiled from: FpsCollector.java */
/* loaded from: classes.dex */
public final class mi {
    private static volatile mi g;
    private static Object h = new Object();
    private long c;
    private nn d;
    private nn f = new nn();
    private mh a = new mh();
    private mj b = new mj();
    private me e = new me();

    /* compiled from: FpsCollector.java */
    public static class a {
        public nn a;
        public List<no> b;
        public long c;
        public long d;
        public boolean e;
        public long f;
        public byte g;
        public String h;
        public List<nh> i;
        public boolean j;
    }

    public static mi a() {
        if (g == null) {
            synchronized (h) {
                if (g == null) {
                    g = new mi();
                }
            }
        }
        return g;
    }

    private mi() {
    }

    public final mk a(a aVar) {
        mk mkVar = null;
        if (aVar == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.d == null || aVar.a.a(this.d) >= 10.0d) {
            mh.a a2 = this.a.a(aVar.a, aVar.j, aVar.g, aVar.h, aVar.i);
            List<no> a3 = this.b.a(aVar.a, aVar.b, aVar.e, aVar.d, currentTimeMillis);
            if (a2 != null || a3 != null) {
                nf.a(this.f, aVar.a, aVar.f, currentTimeMillis);
                mkVar = new mk(0, this.e.a(this.f, a2, aVar.c, a3));
            }
            this.d = aVar.a;
            this.c = elapsedRealtime;
        }
        return mkVar;
    }
}
