package com.amap.api.col.p0003sl;

/* compiled from: OfflineMapDownloadTask.java */
/* loaded from: classes.dex */
public final class bd extends com.amap.api.col.p0003sl.ma implements com.amap.api.col.3sl.bs.a {
    private com.amap.api.col.p0003sl.bs a;
    private com.amap.api.col.p0003sl.bu b;
    private com.amap.api.col.p0003sl.bx c;
    private android.content.Context d;
    private android.os.Bundle e;
    private boolean g;

    private bd(com.amap.api.col.p0003sl.bx bxVar, android.content.Context context) {
        this.e = new android.os.Bundle();
        this.g = false;
        this.c = bxVar;
        this.d = context;
    }

    public bd(com.amap.api.col.p0003sl.bx bxVar, android.content.Context context, byte b) {
        this(bxVar, context);
    }

    @Override // com.amap.api.col.p0003sl.ma
    public final void runTask() {
        if (this.c.u()) {
            this.c.a(com.amap.api.col.3sl.by.a.file_io_exception);
            return;
        }
        try {
            e();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public final void a() {
        this.g = true;
        com.amap.api.col.p0003sl.bs bsVar = this.a;
        if (bsVar != null) {
            bsVar.b();
        } else {
            cancelTask();
        }
        com.amap.api.col.p0003sl.bu buVar = this.b;
        if (buVar != null) {
            buVar.a();
        }
    }

    private java.lang.String d() {
        return com.amap.api.col.p0003sl.dx.c(this.d);
    }

    private void e() throws java.io.IOException {
        com.amap.api.col.p0003sl.bs bsVar = new com.amap.api.col.p0003sl.bs(new com.amap.api.col.p0003sl.bt(this.c.getUrl(), d(), this.c.v(), this.c.w()), this.c.getUrl(), this.d, this.c);
        this.a = bsVar;
        bsVar.a(this);
        com.amap.api.col.p0003sl.bx bxVar = this.c;
        this.b = new com.amap.api.col.p0003sl.bu(bxVar, bxVar);
        if (this.g) {
            return;
        }
        this.a.a();
    }

    public final void b() {
        android.os.Bundle bundle = this.e;
        if (bundle != null) {
            bundle.clear();
            this.e = null;
        }
    }

    @Override // com.amap.api.col.3sl.bs.a
    public final void c() {
        com.amap.api.col.p0003sl.bu buVar = this.b;
        if (buVar != null) {
            buVar.b();
        }
    }
}
