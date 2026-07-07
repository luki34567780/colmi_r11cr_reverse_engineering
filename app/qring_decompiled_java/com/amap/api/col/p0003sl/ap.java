package com.amap.api.col.p0003sl;

/* compiled from: HoverGestureDetectorAbstract.java */
/* loaded from: classes.dex */
public final class ap extends com.amap.api.col.p0003sl.an {
    private static final android.graphics.PointF n = new android.graphics.PointF();
    private final com.amap.api.col.3sl.ap.a o;
    private boolean p;
    private android.graphics.PointF q;
    private android.graphics.PointF r;
    private android.graphics.PointF s;
    private android.graphics.PointF t;

    /* compiled from: HoverGestureDetectorAbstract.java */
    public interface a {
        boolean a(com.amap.api.col.p0003sl.ap apVar);

        boolean b(com.amap.api.col.p0003sl.ap apVar);

        void c(com.amap.api.col.p0003sl.ap apVar);
    }

    public ap(android.content.Context context, com.amap.api.col.3sl.ap.a aVar) {
        super(context);
        this.s = new android.graphics.PointF();
        this.t = new android.graphics.PointF();
        this.o = aVar;
    }

    @Override // com.amap.api.col.p0003sl.ao
    protected final void a(int i, android.view.MotionEvent motionEvent, int i2, int i3) {
        if (i == 2) {
            if (this.p) {
                boolean a2 = a(motionEvent, i2, i3);
                this.p = a2;
                if (a2) {
                    return;
                }
                this.f = this.o.b(this);
                return;
            }
            return;
        }
        if (i != 5) {
            return;
        }
        a();
        this.g = android.view.MotionEvent.obtain(motionEvent);
        this.k = 0L;
        a(motionEvent);
        boolean a3 = a(motionEvent, i2, i3);
        this.p = a3;
        if (a3) {
            return;
        }
        this.f = this.o.b(this);
    }

    @Override // com.amap.api.col.p0003sl.ao
    protected final void a(int i, android.view.MotionEvent motionEvent) {
        if (i == 2) {
            a(motionEvent);
            if (this.i / this.j <= 0.67f || !this.o.a(this)) {
                return;
            }
            this.g.recycle();
            this.g = android.view.MotionEvent.obtain(motionEvent);
            return;
        }
        if (i == 3) {
            if (!this.p) {
                this.o.c(this);
            }
            a();
        } else {
            if (i != 6) {
                return;
            }
            a(motionEvent);
            if (!this.p) {
                this.o.c(this);
            }
            a();
        }
    }

    @Override // com.amap.api.col.p0003sl.ao
    protected final void a() {
        super.a();
        this.p = false;
    }

    @Override // com.amap.api.col.p0003sl.an, com.amap.api.col.p0003sl.ao
    protected final void a(android.view.MotionEvent motionEvent) {
        android.graphics.PointF pointF;
        super.a(motionEvent);
        android.view.MotionEvent motionEvent2 = this.g;
        this.q = b(motionEvent);
        this.r = b(motionEvent2);
        if (this.g.getPointerCount() != motionEvent.getPointerCount()) {
            pointF = n;
        } else {
            pointF = new android.graphics.PointF(this.q.x - this.r.x, this.q.y - this.r.y);
        }
        this.t = pointF;
        this.s.x += this.t.x;
        this.s.y += this.t.y;
    }

    public final android.graphics.PointF d() {
        return this.t;
    }
}
