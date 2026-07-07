package com.amap.api.col.p0003sl;

/* compiled from: CityObject.java */
/* loaded from: classes.dex */
public final class ax extends com.amap.api.maps.offlinemap.OfflineMapCity implements com.amap.api.col.p0003sl.bg, com.amap.api.col.p0003sl.bx {
    public static final android.os.Parcelable.Creator<com.amap.api.col.p0003sl.ax> CREATOR = new android.os.Parcelable.Creator<com.amap.api.col.p0003sl.ax>() { // from class: com.amap.api.col.3sl.ax.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.col.p0003sl.ax createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.col.p0003sl.ax[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.col.p0003sl.ax a(android.os.Parcel parcel) {
            return new com.amap.api.col.p0003sl.ax(parcel);
        }

        private static com.amap.api.col.p0003sl.ax[] a(int i) {
            return new com.amap.api.col.p0003sl.ax[i];
        }
    };
    public final com.amap.api.col.p0003sl.cb a;
    public final com.amap.api.col.p0003sl.cb b;
    public final com.amap.api.col.p0003sl.cb c;
    public final com.amap.api.col.p0003sl.cb d;
    public final com.amap.api.col.p0003sl.cb e;
    public final com.amap.api.col.p0003sl.cb f;
    public final com.amap.api.col.p0003sl.cb g;
    public final com.amap.api.col.p0003sl.cb h;
    public final com.amap.api.col.p0003sl.cb i;
    public final com.amap.api.col.p0003sl.cb j;
    public final com.amap.api.col.p0003sl.cb k;
    com.amap.api.col.p0003sl.cb l;
    android.content.Context m;
    boolean n;
    private java.lang.String o;
    private java.lang.String p;
    private long q;

    @Override // com.amap.api.maps.offlinemap.OfflineMapCity, com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void a(java.lang.String str) {
        this.p = str;
    }

    public final java.lang.String a() {
        return this.p;
    }

    @Override // com.amap.api.col.p0003sl.bg
    public final java.lang.String b() {
        return getUrl();
    }

    public ax(android.content.Context context, com.amap.api.maps.offlinemap.OfflineMapCity offlineMapCity) {
        this(context, offlineMapCity.getState());
        setCity(offlineMapCity.getCity());
        setUrl(offlineMapCity.getUrl());
        setState(offlineMapCity.getState());
        setCompleteCode(offlineMapCity.getcompleteCode());
        setAdcode(offlineMapCity.getAdcode());
        setVersion(offlineMapCity.getVersion());
        setSize(offlineMapCity.getSize());
        setCode(offlineMapCity.getCode());
        setJianpin(offlineMapCity.getJianpin());
        setPinyin(offlineMapCity.getPinyin());
        s();
    }

    private ax(android.content.Context context, int i) {
        this.a = new com.amap.api.col.p0003sl.cd(this);
        this.b = new com.amap.api.col.p0003sl.ck(this);
        this.c = new com.amap.api.col.p0003sl.cg(this);
        this.d = new com.amap.api.col.p0003sl.ci(this);
        this.e = new com.amap.api.col.p0003sl.cj(this);
        this.f = new com.amap.api.col.p0003sl.cc(this);
        this.g = new com.amap.api.col.p0003sl.ch(this);
        this.h = new com.amap.api.col.p0003sl.ce(-1, this);
        this.i = new com.amap.api.col.p0003sl.ce(101, this);
        this.j = new com.amap.api.col.p0003sl.ce(102, this);
        this.k = new com.amap.api.col.p0003sl.ce(103, this);
        this.o = null;
        this.p = "";
        this.n = false;
        this.q = 0L;
        this.m = context;
        a(i);
    }

    public final void a(int i) {
        if (i == -1) {
            this.l = this.h;
        } else if (i == 0) {
            this.l = this.c;
        } else if (i == 1) {
            this.l = this.e;
        } else if (i == 2) {
            this.l = this.b;
        } else if (i == 3) {
            this.l = this.d;
        } else if (i == 4) {
            this.l = this.f;
        } else if (i == 6) {
            this.l = this.a;
        } else if (i == 7) {
            this.l = this.g;
        } else {
            switch (i) {
                case 101:
                    this.l = this.i;
                    break;
                case 102:
                    this.l = this.j;
                    break;
                case 103:
                    this.l = this.k;
                    break;
                default:
                    if (i < 0) {
                        this.l = this.h;
                        break;
                    }
                    break;
            }
        }
        setState(i);
    }

    public final void a(com.amap.api.col.p0003sl.cb cbVar) {
        this.l = cbVar;
        setState(cbVar.b());
    }

    public final com.amap.api.col.p0003sl.cb c() {
        return this.l;
    }

    public final void d() {
        com.amap.api.col.p0003sl.ay a = com.amap.api.col.p0003sl.ay.a(this.m);
        if (a != null) {
            a.c(this);
        }
    }

    public final void e() {
        com.amap.api.col.p0003sl.ay a = com.amap.api.col.p0003sl.ay.a(this.m);
        if (a != null) {
            a.e(this);
            d();
        }
    }

    public final void f() {
        c().b();
        if (this.l.equals(this.d)) {
            this.l.d();
            return;
        }
        if (this.l.equals(this.c)) {
            this.l.e();
            return;
        }
        if (this.l.equals(this.g) || this.l.equals(this.h)) {
            z();
            this.n = true;
        } else if (this.l.equals(this.j) || this.l.equals(this.i) || this.l.a(this.k)) {
            this.l.c();
        } else {
            c().h();
        }
    }

    public final void g() {
        this.l.e();
    }

    public final void h() {
        this.l.a(this.k.b());
    }

    public final void i() {
        this.l.a();
        if (this.n) {
            this.l.h();
        }
        this.n = false;
    }

    public final void j() {
        this.l.equals(this.f);
        this.l.f();
    }

    private void z() {
        com.amap.api.col.p0003sl.ay a = com.amap.api.col.p0003sl.ay.a(this.m);
        if (a != null) {
            a.a(this);
        }
    }

    public final void k() {
        com.amap.api.col.p0003sl.ay a = com.amap.api.col.p0003sl.ay.a(this.m);
        if (a != null) {
            a.b(this);
        }
    }

    public final void l() {
        com.amap.api.col.p0003sl.ay a = com.amap.api.col.p0003sl.ay.a(this.m);
        if (a != null) {
            a.d(this);
        }
    }

    @Override // com.amap.api.col.p0003sl.by
    public final void m() {
        this.q = 0L;
        this.l.equals(this.b);
        this.l.c();
    }

    @Override // com.amap.api.col.p0003sl.by
    public final void a(long j, long j2) {
        int i = (int) ((j2 * 100) / j);
        if (i != getcompleteCode()) {
            setCompleteCode(i);
            d();
        }
    }

    @Override // com.amap.api.col.p0003sl.by
    public final void n() {
        this.l.equals(this.c);
        this.l.g();
    }

    /* compiled from: CityObject.java */
    /* renamed from: com.amap.api.col.3sl.ax$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amap.api.col.3sl.by.a.values().length];
            a = iArr;
            try {
                iArr[com.amap.api.col.3sl.by.a.amap_exception.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                a[com.amap.api.col.3sl.by.a.file_io_exception.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                a[com.amap.api.col.3sl.by.a.network_exception.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.amap.api.col.p0003sl.by
    public final void a(com.amap.api.col.3sl.by.a aVar) {
        int b;
        int i = com.amap.api.col.p0003sl.ax.AnonymousClass3.a[aVar.ordinal()];
        if (i == 1) {
            b = this.j.b();
        } else if (i == 2) {
            b = this.k.b();
        } else {
            b = i != 3 ? 6 : this.i.b();
        }
        if (this.l.equals(this.c) || this.l.equals(this.b)) {
            this.l.a(b);
        }
    }

    @Override // com.amap.api.col.p0003sl.by
    public final void o() {
        e();
    }

    @Override // com.amap.api.col.p0003sl.bq
    public final void p() {
        this.q = 0L;
        setCompleteCode(0);
        this.l.equals(this.e);
        this.l.c();
    }

    @Override // com.amap.api.col.p0003sl.bq
    public final void q() {
        this.l.equals(this.e);
        this.l.a(this.h.b());
    }

    @Override // com.amap.api.col.p0003sl.bq
    public final void a(long j) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.q > 500) {
            int i = (int) j;
            if (i > getcompleteCode()) {
                setCompleteCode(i);
                d();
            }
            this.q = currentTimeMillis;
        }
    }

    @Override // com.amap.api.col.p0003sl.bq
    public final void b(java.lang.String str) {
        this.l.equals(this.e);
        this.p = str;
        java.lang.String A = A();
        java.lang.String B = B();
        if (android.text.TextUtils.isEmpty(A) || android.text.TextUtils.isEmpty(B)) {
            q();
            return;
        }
        java.io.File file = new java.io.File(B + "/");
        java.io.File file2 = new java.io.File(com.amap.api.col.p0003sl.dx.a(this.m) + java.io.File.separator + "map/");
        java.io.File file3 = new java.io.File(com.amap.api.col.p0003sl.dx.a(this.m));
        if (file3.exists() || file3.mkdir()) {
            if (file2.exists() || file2.mkdir()) {
                a(file, file2, A);
            }
        }
    }

    @Override // com.amap.api.col.p0003sl.bq
    public final void r() {
        e();
    }

    protected final void s() {
        java.lang.String str = com.amap.api.col.p0003sl.ay.a;
        java.lang.String b = com.amap.api.col.p0003sl.bv.b(getUrl());
        if (b != null) {
            this.o = str + b + ".zip.tmp";
            return;
        }
        this.o = str + getPinyin() + ".zip.tmp";
    }

    private java.lang.String A() {
        if (android.text.TextUtils.isEmpty(this.o)) {
            return null;
        }
        java.lang.String str = this.o;
        return str.substring(0, str.lastIndexOf("."));
    }

    private java.lang.String B() {
        if (android.text.TextUtils.isEmpty(this.o)) {
            return null;
        }
        java.lang.String A = A();
        return A.substring(0, A.lastIndexOf(46));
    }

    private void a(final java.io.File file, java.io.File file2, final java.lang.String str) {
        new com.amap.api.col.p0003sl.bp().a(file, file2, -1L, com.amap.api.col.p0003sl.bv.a(file), new com.amap.api.col.3sl.bp.a() { // from class: com.amap.api.col.3sl.ax.1
            @Override // com.amap.api.col.3sl.bp.a
            public final void a(float f) {
                int i = (int) ((f * 0.39d) + 60.0d);
                if (i - com.amap.api.col.p0003sl.ax.this.getcompleteCode() <= 0 || java.lang.System.currentTimeMillis() - com.amap.api.col.p0003sl.ax.this.q <= 1000) {
                    return;
                }
                com.amap.api.col.p0003sl.ax.this.setCompleteCode(i);
                com.amap.api.col.p0003sl.ax.this.q = java.lang.System.currentTimeMillis();
            }

            @Override // com.amap.api.col.3sl.bp.a
            public final void a() {
                try {
                    if (new java.io.File(str).delete()) {
                        com.amap.api.col.p0003sl.bv.b(file);
                        com.amap.api.col.p0003sl.ax.this.setCompleteCode(100);
                        com.amap.api.col.p0003sl.ax.this.l.g();
                    }
                } catch (java.lang.Exception unused) {
                    com.amap.api.col.p0003sl.ax.this.l.a(com.amap.api.col.p0003sl.ax.this.k.b());
                }
            }

            @Override // com.amap.api.col.3sl.bp.a
            public final void b() {
                com.amap.api.col.p0003sl.ax.this.l.a(com.amap.api.col.p0003sl.ax.this.k.b());
            }
        });
    }

    private boolean C() {
        com.amap.api.col.p0003sl.bv.a();
        getSize();
        getcompleteCode();
        getSize();
        return false;
    }

    public final com.amap.api.col.p0003sl.bi t() {
        setState(this.l.b());
        com.amap.api.col.p0003sl.bi biVar = new com.amap.api.col.p0003sl.bi(this, this.m);
        biVar.a(a());
        a();
        return biVar;
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapCity, com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.p);
    }

    public ax(android.os.Parcel parcel) {
        super(parcel);
        this.a = new com.amap.api.col.p0003sl.cd(this);
        this.b = new com.amap.api.col.p0003sl.ck(this);
        this.c = new com.amap.api.col.p0003sl.cg(this);
        this.d = new com.amap.api.col.p0003sl.ci(this);
        this.e = new com.amap.api.col.p0003sl.cj(this);
        this.f = new com.amap.api.col.p0003sl.cc(this);
        this.g = new com.amap.api.col.p0003sl.ch(this);
        this.h = new com.amap.api.col.p0003sl.ce(-1, this);
        this.i = new com.amap.api.col.p0003sl.ce(101, this);
        this.j = new com.amap.api.col.p0003sl.ce(102, this);
        this.k = new com.amap.api.col.p0003sl.ce(103, this);
        this.o = null;
        this.p = "";
        this.n = false;
        this.q = 0L;
        this.p = parcel.readString();
    }

    @Override // com.amap.api.col.p0003sl.bx
    public final boolean u() {
        return C();
    }

    @Override // com.amap.api.col.p0003sl.bx
    public final java.lang.String v() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.String b = com.amap.api.col.p0003sl.bv.b(getUrl());
        if (b != null) {
            stringBuffer.append(b);
        } else {
            stringBuffer.append(getPinyin());
        }
        stringBuffer.append(".zip");
        return stringBuffer.toString();
    }

    @Override // com.amap.api.col.p0003sl.bx
    public final java.lang.String w() {
        return getAdcode();
    }

    @Override // com.amap.api.col.p0003sl.br
    public final java.lang.String x() {
        return A();
    }

    @Override // com.amap.api.col.p0003sl.br
    public final java.lang.String y() {
        return B();
    }

    public final com.amap.api.col.p0003sl.cb b(int i) {
        switch (i) {
            case 101:
                return this.i;
            case 102:
                return this.j;
            case 103:
                return this.k;
            default:
                return this.h;
        }
    }
}
