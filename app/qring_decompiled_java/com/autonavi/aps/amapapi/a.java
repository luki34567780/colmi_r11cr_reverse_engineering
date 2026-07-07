package com.autonavi.aps.amapapi;

/* compiled from: AMapLocationStaticsEntity.java */
/* loaded from: classes.dex */
public final class a implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.autonavi.aps.amapapi.a> CREATOR = new android.os.Parcelable.Creator<com.autonavi.aps.amapapi.a>() { // from class: com.autonavi.aps.amapapi.a.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.autonavi.aps.amapapi.a createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.autonavi.aps.amapapi.a[] newArray(int i) {
            return a(i);
        }

        private static com.autonavi.aps.amapapi.a a(android.os.Parcel parcel) {
            com.autonavi.aps.amapapi.a aVar = new com.autonavi.aps.amapapi.a();
            aVar.c(parcel.readString());
            aVar.d(parcel.readString());
            aVar.e(parcel.readString());
            aVar.f(parcel.readString());
            aVar.b(parcel.readString());
            aVar.c(parcel.readLong());
            aVar.d(parcel.readLong());
            aVar.a(parcel.readLong());
            aVar.b(parcel.readLong());
            aVar.a(parcel.readString());
            return aVar;
        }

        private static com.autonavi.aps.amapapi.a[] a(int i) {
            return new com.autonavi.aps.amapapi.a[i];
        }
    };
    private java.lang.String e;
    private java.lang.String f;
    private long a = 0;
    private long b = 0;
    private long c = 0;
    private long d = 0;
    private java.lang.String g = "first";
    private java.lang.String h = "";
    private java.lang.String i = "";
    private java.lang.String j = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long a() {
        long j = this.d;
        long j2 = this.c;
        if (j - j2 <= 0) {
            return 0L;
        }
        return j - j2;
    }

    public final java.lang.String b() {
        return this.i;
    }

    public final void a(java.lang.String str) {
        this.i = str;
    }

    public final void a(long j) {
        this.c = j;
    }

    public final void b(long j) {
        this.d = j;
    }

    public final void c(long j) {
        this.a = j;
    }

    public final void d(long j) {
        this.b = j;
    }

    public final java.lang.String c() {
        return this.j;
    }

    public final void b(java.lang.String str) {
        this.j = str;
    }

    public final java.lang.String d() {
        return this.e;
    }

    public final void c(java.lang.String str) {
        this.e = str;
    }

    public final java.lang.String e() {
        return this.f;
    }

    public final void d(java.lang.String str) {
        this.f = str;
    }

    public final java.lang.String f() {
        return this.g;
    }

    public final void e(java.lang.String str) {
        this.g = str;
    }

    public final java.lang.String g() {
        return this.h;
    }

    public final void f(java.lang.String str) {
        this.h = str;
    }

    public final long h() {
        long j = this.b;
        long j2 = this.a;
        if (j <= j2) {
            return 0L;
        }
        return j - j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        try {
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.j);
            parcel.writeLong(this.a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
            parcel.writeLong(this.d);
            parcel.writeString(this.i);
        } catch (java.lang.Throwable unused) {
        }
    }
}
