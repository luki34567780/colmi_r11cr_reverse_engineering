package com.amap.api.col.p0003sl;

/* compiled from: MoveGestureDetector.java */
/* loaded from: classes.dex */
public final class aq extends com.amap.api.col.p0003sl.ao {
    private static final android.graphics.PointF a = new android.graphics.PointF();
    private final com.amap.api.col.3sl.aq.a b;
    private android.graphics.PointF c;
    private android.graphics.PointF d;
    private android.graphics.PointF n;
    private android.graphics.PointF o;

    /* compiled from: MoveGestureDetector.java */
    public interface a {
        boolean a(com.amap.api.col.p0003sl.aq aqVar);

        boolean b(com.amap.api.col.p0003sl.aq aqVar);

        void c(com.amap.api.col.p0003sl.aq aqVar);
    }

    public aq(android.content.Context context, com.amap.api.col.3sl.aq.a aVar) {
        super(context);
        this.n = new android.graphics.PointF();
        this.o = new android.graphics.PointF();
        this.b = aVar;
    }

    @Override // com.amap.api.col.p0003sl.ao
    protected final void a(int i, android.view.MotionEvent motionEvent, int i2, int i3) {
        if (i == 0) {
            a();
            this.g = android.view.MotionEvent.obtain(motionEvent);
            this.k = 0L;
            a(motionEvent);
            return;
        }
        if (i == 2) {
            this.f = this.b.b(this);
        } else {
            if (i != 5) {
                return;
            }
            if (this.g != null) {
                this.g.recycle();
            }
            this.g = android.view.MotionEvent.obtain(motionEvent);
            a(motionEvent);
        }
    }

    @Override // com.amap.api.col.p0003sl.ao
    protected final void a(int i, android.view.MotionEvent motionEvent) {
        if (i != 1) {
            if (i == 2) {
                a(motionEvent);
                if (this.i / this.j <= 0.67f || motionEvent.getPointerCount() > 1 || !this.b.a(this)) {
                    return;
                }
                this.g.recycle();
                this.g = android.view.MotionEvent.obtain(motionEvent);
                return;
            }
            if (i != 3) {
                return;
            }
        }
        this.b.c(this);
        a();
    }

    @Override // com.amap.api.col.p0003sl.ao
    protected final void a(android.view.MotionEvent motionEvent) {
        android.graphics.PointF pointF;
        super.a(motionEvent);
        android.view.MotionEvent motionEvent2 = this.g;
        this.c = b(motionEvent);
        this.d = b(motionEvent2);
        boolean z = this.g.getPointerCount() != motionEvent.getPointerCount();
        if (z) {
            pointF = a;
        } else {
            pointF = new android.graphics.PointF(this.c.x - this.d.x, this.c.y - this.d.y);
        }
        this.o = pointF;
        if (z) {
            this.g.recycle();
            this.g = android.view.MotionEvent.obtain(motionEvent);
        }
        this.n.x += this.o.x;
        this.n.y += this.o.y;
    }

    public final android.graphics.PointF d() {
        return this.o;
    }
}
