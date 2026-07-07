package com.amap.api.col.p0003sl;

/* compiled from: ZoomOutGestureDetectorAbstract.java */
/* loaded from: classes.dex */
public final class at extends com.amap.api.col.p0003sl.an {
    private static final android.graphics.PointF p = new android.graphics.PointF();
    private final com.amap.api.col.3sl.at.a n;
    private boolean o;
    private android.graphics.PointF q;
    private android.graphics.PointF r;
    private android.graphics.PointF s;
    private android.graphics.PointF t;

    /* compiled from: ZoomOutGestureDetectorAbstract.java */
    public interface a {
        void a(com.amap.api.col.p0003sl.at atVar);
    }

    /* compiled from: ZoomOutGestureDetectorAbstract.java */
    public static class b implements com.amap.api.col.3sl.at.a {
        @Override // com.amap.api.col.3sl.at.a
        public void a(com.amap.api.col.p0003sl.at atVar) {
        }
    }

    public at(android.content.Context context, com.amap.api.col.3sl.at.a aVar) {
        super(context);
        this.s = new android.graphics.PointF();
        this.t = new android.graphics.PointF();
        this.n = aVar;
    }

    @Override // com.amap.api.col.p0003sl.ao
    protected final void a(int i, android.view.MotionEvent motionEvent, int i2, int i3) {
        if (i != 5) {
            return;
        }
        a();
        this.g = android.view.MotionEvent.obtain(motionEvent);
        this.k = 0L;
        a(motionEvent);
        boolean a2 = a(motionEvent, i2, i3);
        this.o = a2;
        if (a2) {
            return;
        }
        this.f = true;
    }

    @Override // com.amap.api.col.p0003sl.ao
    protected final void a(int i, android.view.MotionEvent motionEvent) {
        if (i == 3) {
            a();
        } else {
            if (i != 6) {
                return;
            }
            a(motionEvent);
            if (!this.o) {
                this.n.a(this);
            }
            a();
        }
    }

    @Override // com.amap.api.col.p0003sl.ao
    protected final void a() {
        super.a();
        this.o = false;
        this.s.x = 0.0f;
        this.t.x = 0.0f;
        this.s.y = 0.0f;
        this.t.y = 0.0f;
    }

    @Override // com.amap.api.col.p0003sl.an, com.amap.api.col.p0003sl.ao
    protected final void a(android.view.MotionEvent motionEvent) {
        android.graphics.PointF pointF;
        super.a(motionEvent);
        android.view.MotionEvent motionEvent2 = this.g;
        this.q = b(motionEvent);
        this.r = b(motionEvent2);
        if (this.g.getPointerCount() != motionEvent.getPointerCount()) {
            pointF = p;
        } else {
            pointF = new android.graphics.PointF(this.q.x - this.r.x, this.q.y - this.r.y);
        }
        this.t = pointF;
        this.s.x += this.t.x;
        this.s.y += this.t.y;
    }

    public final float d() {
        return this.s.x;
    }

    public final float e() {
        return this.s.y;
    }
}
