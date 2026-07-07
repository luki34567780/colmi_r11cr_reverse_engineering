package com.amap.api.col.p0003sl;

/* compiled from: DownloadManager.java */
/* loaded from: classes.dex */
public class ku {
    private com.amap.api.col.p0003sl.kw a;
    private com.amap.api.col.p0003sl.kz b;
    private long c;
    private long d;

    /* compiled from: DownloadManager.java */
    public interface a {
        void onDownload(byte[] bArr, long j);

        void onException(java.lang.Throwable th);

        void onFinish();

        void onStop();
    }

    public ku(com.amap.api.col.p0003sl.kz kzVar) {
        this(kzVar, (byte) 0);
    }

    private ku(com.amap.api.col.p0003sl.kz kzVar, byte b) {
        this(kzVar, 0L, -1L, false);
    }

    public ku(com.amap.api.col.p0003sl.kz kzVar, long j, long j2, boolean z) {
        this.b = kzVar;
        this.c = j;
        this.d = j2;
        kzVar.setHttpProtocol(z ? com.amap.api.col.3sl.kz.c.HTTPS : com.amap.api.col.3sl.kz.c.HTTP);
        this.b.setDegradeAbility(com.amap.api.col.3sl.kz.a.SINGLE);
    }

    public final void a(com.amap.api.col.3sl.ku.a aVar) {
        try {
            com.amap.api.col.p0003sl.kw kwVar = new com.amap.api.col.p0003sl.kw();
            this.a = kwVar;
            kwVar.b(this.d);
            this.a.a(this.c);
            com.amap.api.col.p0003sl.ks.a();
            if (com.amap.api.col.p0003sl.ks.b(this.b)) {
                this.b.setDegradeType(com.amap.api.col.3sl.kz.b.NEVER_GRADE);
                this.a.a(this.b, aVar);
            } else {
                this.b.setDegradeType(com.amap.api.col.3sl.kz.b.DEGRADE_ONLY);
                this.a.a(this.b, aVar);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public final void a() {
        com.amap.api.col.p0003sl.kw kwVar = this.a;
        if (kwVar != null) {
            kwVar.a();
        }
    }
}
