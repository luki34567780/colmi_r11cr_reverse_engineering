package com.amap.api.col.p0003sl;

/* compiled from: AmapCell.java */
/* loaded from: classes.dex */
public abstract class nh implements java.io.Serializable {
    public java.lang.String a;
    public java.lang.String b;
    public int c;
    public int d;
    public long e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;

    @Override // 
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract com.amap.api.col.p0003sl.nh clone();

    public nh() {
        this.a = "";
        this.b = "";
        this.c = 99;
        this.d = Integer.MAX_VALUE;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.i = true;
    }

    public nh(boolean z, boolean z2) {
        this.a = "";
        this.b = "";
        this.c = 99;
        this.d = Integer.MAX_VALUE;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.i = true;
        this.h = z;
        this.i = z2;
    }

    public final int b() {
        return a(this.a);
    }

    public final int c() {
        return a(this.b);
    }

    private static int a(java.lang.String str) {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.Exception e) {
            com.amap.api.col.p0003sl.nr.a(e);
            return 0;
        }
    }

    public final void a(com.amap.api.col.p0003sl.nh nhVar) {
        this.a = nhVar.a;
        this.b = nhVar.b;
        this.c = nhVar.c;
        this.d = nhVar.d;
        this.e = nhVar.e;
        this.f = nhVar.f;
        this.g = nhVar.g;
        this.h = nhVar.h;
        this.i = nhVar.i;
    }

    public java.lang.String toString() {
        return "AmapCell{mcc=" + this.a + ", mnc=" + this.b + ", signalStrength=" + this.c + ", asulevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newapi=" + this.i + '}';
    }
}
