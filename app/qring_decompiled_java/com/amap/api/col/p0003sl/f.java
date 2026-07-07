package com.amap.api.col.p0003sl;

/* compiled from: ApsServiceCore.java */
/* loaded from: classes.dex */
public final class f {
    com.amap.api.col.p0003sl.e a;
    android.content.Context b;
    android.os.Messenger c = null;

    public f(android.content.Context context) {
        this.a = null;
        this.b = null;
        this.b = context.getApplicationContext();
        this.a = new com.amap.api.col.p0003sl.e(this.b);
    }

    public final android.os.IBinder a(android.content.Intent intent) {
        this.a.b(intent);
        this.a.a(intent);
        android.os.Messenger messenger = new android.os.Messenger(this.a.b());
        this.c = messenger;
        return messenger.getBinder();
    }

    public final void a() {
        try {
            com.amap.api.col.p0003sl.e.d();
            this.a.j = com.autonavi.aps.amapapi.utils.j.b();
            this.a.k = com.autonavi.aps.amapapi.utils.j.a();
            this.a.a();
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "ApsServiceCore", "onCreate");
        }
    }

    public final int b() {
        com.amap.api.col.p0003sl.e eVar = this.a;
        return (eVar == null || eVar.n.isSelfStartServiceEnable()) ? 0 : 2;
    }

    public final void c() {
        try {
            com.amap.api.col.p0003sl.e eVar = this.a;
            if (eVar != null) {
                eVar.b().sendEmptyMessage(11);
            }
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "ApsServiceCore", "onDestroy");
        }
    }
}
