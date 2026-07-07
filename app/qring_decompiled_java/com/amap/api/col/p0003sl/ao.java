package com.amap.api.col.p0003sl;

/* compiled from: BaseGestureDetector.java */
/* loaded from: classes.dex */
public abstract class ao {
    protected final android.content.Context e;
    protected boolean f;
    protected android.view.MotionEvent g;
    protected android.view.MotionEvent h;
    protected float i;
    protected float j;
    protected long k;
    protected int l = 0;
    protected int m = 0;

    protected abstract void a(int i, android.view.MotionEvent motionEvent);

    protected abstract void a(int i, android.view.MotionEvent motionEvent, int i2, int i3);

    public final void a(int i, int i2) {
        this.l = i;
        this.m = i2;
    }

    public ao(android.content.Context context) {
        this.e = context;
    }

    public final boolean b(android.view.MotionEvent motionEvent, int i, int i2) {
        int action = motionEvent.getAction() & 255;
        if (!this.f) {
            a(action, motionEvent, i, i2);
            return true;
        }
        a(action, motionEvent);
        return true;
    }

    protected void a(android.view.MotionEvent motionEvent) {
        android.view.MotionEvent motionEvent2 = this.g;
        android.view.MotionEvent motionEvent3 = this.h;
        if (motionEvent3 != null) {
            motionEvent3.recycle();
            this.h = null;
        }
        this.h = android.view.MotionEvent.obtain(motionEvent);
        this.k = motionEvent.getEventTime() - motionEvent2.getEventTime();
        if (android.os.Build.VERSION.SDK_INT >= 8) {
            this.i = motionEvent.getPressure(motionEvent.getActionIndex());
            this.j = motionEvent2.getPressure(motionEvent2.getActionIndex());
        } else {
            this.i = motionEvent.getPressure(0);
            this.j = motionEvent2.getPressure(0);
        }
    }

    protected void a() {
        android.view.MotionEvent motionEvent = this.g;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.g = null;
        }
        android.view.MotionEvent motionEvent2 = this.h;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.h = null;
        }
        this.f = false;
    }

    public final long b() {
        return this.k;
    }

    public static android.graphics.PointF b(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            f += motionEvent.getX(i);
            f2 += motionEvent.getY(i);
        }
        float f3 = pointerCount;
        return new android.graphics.PointF(f / f3, f2 / f3);
    }

    public final android.view.MotionEvent c() {
        return this.h;
    }
}
