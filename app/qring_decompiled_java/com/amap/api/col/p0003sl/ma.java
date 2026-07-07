package com.amap.api.col.p0003sl;

/* compiled from: ThreadTask.java */
/* loaded from: classes.dex */
public abstract class ma implements java.lang.Runnable {
    com.amap.api.col.3sl.ma.a f;

    /* compiled from: ThreadTask.java */
    interface a {
        void a(com.amap.api.col.p0003sl.ma maVar);

        void b(com.amap.api.col.p0003sl.ma maVar);
    }

    public abstract void runTask();

    @Override // java.lang.Runnable
    public final void run() {
        com.amap.api.col.3sl.ma.a aVar;
        try {
            if (java.lang.Thread.interrupted()) {
                return;
            }
            runTask();
            if (java.lang.Thread.interrupted() || (aVar = this.f) == null) {
                return;
            }
            aVar.a(this);
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "ThreadTask", "run");
            th.printStackTrace();
        }
    }

    public final void cancelTask() {
        try {
            com.amap.api.col.3sl.ma.a aVar = this.f;
            if (aVar != null) {
                aVar.b(this);
            }
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.ju.c(th, "ThreadTask", "cancelTask");
            th.printStackTrace();
        }
    }
}
