package com.amap.api.col.p0003sl;

/* compiled from: TaskManager.java */
/* loaded from: classes.dex */
public final class bh {
    private static com.amap.api.col.p0003sl.bh a;
    private com.amap.api.col.p0003sl.lz b;
    private java.util.LinkedHashMap<java.lang.String, com.amap.api.col.p0003sl.ma> c = new java.util.LinkedHashMap<>();
    private boolean d = true;

    public static com.amap.api.col.p0003sl.bh a() {
        return c();
    }

    private static synchronized com.amap.api.col.p0003sl.bh c() {
        com.amap.api.col.p0003sl.bh bhVar;
        synchronized (com.amap.api.col.p0003sl.bh.class) {
            try {
                com.amap.api.col.p0003sl.bh bhVar2 = a;
                if (bhVar2 == null) {
                    a = new com.amap.api.col.p0003sl.bh();
                } else if (bhVar2.b == null) {
                    bhVar2.b = com.amap.api.col.p0003sl.lz.b();
                }
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
            bhVar = a;
        }
        return bhVar;
    }

    private bh() {
        try {
            if (this.b == null) {
                this.b = com.amap.api.col.p0003sl.lz.c();
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    private void d() {
        synchronized (this.c) {
            if (this.c.size() <= 0) {
                return;
            }
            for (java.util.Map.Entry<java.lang.String, com.amap.api.col.p0003sl.ma> entry : this.c.entrySet()) {
                entry.getKey();
                ((com.amap.api.col.p0003sl.bd) entry.getValue()).a();
            }
            this.c.clear();
        }
    }

    public final void a(com.amap.api.col.p0003sl.bg bgVar) {
        synchronized (this.c) {
            com.amap.api.col.p0003sl.bd bdVar = (com.amap.api.col.p0003sl.bd) this.c.get(bgVar.b());
            if (bdVar == null) {
                return;
            }
            bdVar.a();
            this.c.remove(bgVar.b());
        }
    }

    public final void a(com.amap.api.col.p0003sl.bg bgVar, android.content.Context context) throws com.amap.api.col.p0003sl.id {
        if (!this.c.containsKey(bgVar.b())) {
            com.amap.api.col.p0003sl.bd bdVar = new com.amap.api.col.p0003sl.bd((com.amap.api.col.p0003sl.bx) bgVar, context.getApplicationContext(), (byte) 0);
            synchronized (this.c) {
                this.c.put(bgVar.b(), bdVar);
            }
        }
        this.b.a(this.c.get(bgVar.b()));
    }

    public final void b() {
        d();
        this.b.e();
        this.b = null;
        e();
    }

    private static void e() {
        a = null;
    }

    public final void b(com.amap.api.col.p0003sl.bg bgVar) {
        com.amap.api.col.p0003sl.bd bdVar = (com.amap.api.col.p0003sl.bd) this.c.get(bgVar.b());
        if (bdVar != null) {
            synchronized (this.c) {
                bdVar.b();
                this.c.remove(bgVar.b());
            }
        }
    }
}
