package com.amap.api.col.p0003sl;

/* compiled from: ScaleGestureDetector.java */
/* loaded from: classes.dex */
public class ar {
    private final android.content.Context a;
    private final com.amap.api.col.3sl.ar.a b;
    private boolean c;
    private android.view.MotionEvent d;
    private android.view.MotionEvent e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private long q;
    private final float r;
    private float s;
    private float t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private boolean y;
    private int z = 0;
    private int A = 0;

    /* compiled from: ScaleGestureDetector.java */
    public interface a {
        boolean a(com.amap.api.col.p0003sl.ar arVar);

        boolean b(com.amap.api.col.p0003sl.ar arVar);

        void c(com.amap.api.col.p0003sl.ar arVar);
    }

    public final android.view.MotionEvent a() {
        return this.e;
    }

    public ar(android.content.Context context, com.amap.api.col.3sl.ar.a aVar) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.a = context;
        this.b = aVar;
        this.r = viewConfiguration.getScaledEdgeSlop();
    }

    public final void a(int i, int i2) {
        this.z = i;
        this.A = i2;
    }

    public final boolean a(android.view.MotionEvent motionEvent) {
        int a2;
        int a3;
        int i;
        int i2;
        int i3;
        int a4;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            j();
        }
        boolean z = false;
        if (this.v) {
            return false;
        }
        if (this.c) {
            if (action == 1) {
                j();
            } else if (action == 2) {
                b(motionEvent);
                if (this.o / this.p > 0.67f && this.b.a(this)) {
                    this.d.recycle();
                    this.d = android.view.MotionEvent.obtain(motionEvent);
                }
            } else if (action == 3) {
                this.b.c(this);
                j();
            } else if (action == 5) {
                this.b.c(this);
                int i4 = this.w;
                int i5 = this.x;
                j();
                this.d = android.view.MotionEvent.obtain(motionEvent);
                if (!this.y) {
                    i4 = i5;
                }
                this.w = i4;
                if (android.os.Build.VERSION.SDK_INT >= 8) {
                    this.x = motionEvent.getPointerId(motionEvent.getActionIndex());
                } else {
                    this.x = motionEvent.getPointerId(1);
                }
                this.y = false;
                int findPointerIndex = motionEvent.findPointerIndex(this.w);
                if (findPointerIndex < 0 || this.w == this.x) {
                    int i6 = this.w;
                    int i7 = this.x;
                    this.w = motionEvent.getPointerId(a(motionEvent, i6 != i7 ? i7 : -1, findPointerIndex));
                }
                b(motionEvent);
                this.c = this.b.b(this);
            } else if (action == 6) {
                int pointerCount = motionEvent.getPointerCount();
                int actionIndex = android.os.Build.VERSION.SDK_INT >= 8 ? motionEvent.getActionIndex() : 0;
                int pointerId = motionEvent.getPointerId(actionIndex);
                if (pointerCount > 2) {
                    int i8 = this.w;
                    if (pointerId == i8) {
                        int a5 = a(motionEvent, this.x, actionIndex);
                        if (a5 >= 0) {
                            this.b.c(this);
                            this.w = motionEvent.getPointerId(a5);
                            this.y = true;
                            this.d = android.view.MotionEvent.obtain(motionEvent);
                            b(motionEvent);
                            this.c = this.b.b(this);
                            this.d.recycle();
                            this.d = android.view.MotionEvent.obtain(motionEvent);
                            b(motionEvent);
                        }
                        z = true;
                        this.d.recycle();
                        this.d = android.view.MotionEvent.obtain(motionEvent);
                        b(motionEvent);
                    } else {
                        if (pointerId == this.x) {
                            int a6 = a(motionEvent, i8, actionIndex);
                            if (a6 >= 0) {
                                this.b.c(this);
                                this.x = motionEvent.getPointerId(a6);
                                this.y = false;
                                this.d = android.view.MotionEvent.obtain(motionEvent);
                                b(motionEvent);
                                this.c = this.b.b(this);
                            }
                            z = true;
                        }
                        this.d.recycle();
                        this.d = android.view.MotionEvent.obtain(motionEvent);
                        b(motionEvent);
                    }
                } else {
                    z = true;
                }
                if (z) {
                    b(motionEvent);
                    int i9 = this.w;
                    if (pointerId == i9) {
                        i9 = this.x;
                    }
                    int findPointerIndex2 = motionEvent.findPointerIndex(i9);
                    this.f = motionEvent.getX(findPointerIndex2);
                    this.g = motionEvent.getY(findPointerIndex2);
                    this.b.c(this);
                    j();
                    this.w = i9;
                    this.y = true;
                }
            }
        } else if (action == 0) {
            this.w = motionEvent.getPointerId(0);
            this.y = true;
        } else if (action == 1) {
            j();
        } else if (action != 2) {
            if (action == 5) {
                int i10 = this.z;
                if (i10 == 0 || (i3 = this.A) == 0) {
                    android.util.DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
                    this.s = displayMetrics.widthPixels - this.r;
                    this.t = displayMetrics.heightPixels - this.r;
                } else {
                    float f = this.r;
                    this.s = i10 - f;
                    this.t = i3 - f;
                }
                android.view.MotionEvent motionEvent2 = this.d;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.d = android.view.MotionEvent.obtain(motionEvent);
                this.q = 0L;
                if (android.os.Build.VERSION.SDK_INT >= 8) {
                    i = motionEvent.getActionIndex();
                    i2 = motionEvent.findPointerIndex(this.w);
                    int pointerId2 = motionEvent.getPointerId(i);
                    this.x = pointerId2;
                    if (i2 < 0 || i2 == i) {
                        i2 = a(motionEvent, i2 != i ? pointerId2 : -1, i2);
                        this.w = motionEvent.getPointerId(i2);
                    }
                } else if (motionEvent.getPointerCount() > 0) {
                    i = motionEvent.findPointerIndex(1);
                    i2 = motionEvent.findPointerIndex(this.w);
                    this.x = motionEvent.getPointerId(i);
                } else {
                    i = 0;
                    i2 = 0;
                }
                this.y = false;
                b(motionEvent);
                float f2 = this.r;
                float f3 = this.s;
                float f4 = this.t;
                float a7 = a(motionEvent, i2);
                float b = b(motionEvent, i2);
                float a8 = a(motionEvent, i);
                float b2 = b(motionEvent, i);
                boolean z2 = a7 < f2 || b < f2 || a7 > f3 || b > f4;
                boolean z3 = a8 < f2 || b2 < f2 || a8 > f3 || b2 > f4;
                if (z2 && z3) {
                    this.f = -1.0f;
                    this.g = -1.0f;
                    this.u = true;
                } else if (z2) {
                    this.f = motionEvent.getX(i);
                    this.g = motionEvent.getY(i);
                    this.u = true;
                } else if (z3) {
                    this.f = motionEvent.getX(i2);
                    this.g = motionEvent.getY(i2);
                    this.u = true;
                } else {
                    this.u = false;
                    this.c = this.b.b(this);
                }
            } else if (action == 6 && this.u) {
                int pointerCount2 = motionEvent.getPointerCount();
                int actionIndex2 = android.os.Build.VERSION.SDK_INT >= 8 ? motionEvent.getActionIndex() : 0;
                int pointerId3 = motionEvent.getPointerId(actionIndex2);
                if (pointerCount2 > 2) {
                    int i11 = this.w;
                    if (pointerId3 == i11) {
                        int a9 = a(motionEvent, this.x, actionIndex2);
                        if (a9 >= 0) {
                            this.w = motionEvent.getPointerId(a9);
                        }
                    } else if (pointerId3 == this.x && (a4 = a(motionEvent, i11, actionIndex2)) >= 0) {
                        this.x = motionEvent.getPointerId(a4);
                    }
                } else {
                    int i12 = this.w;
                    if (pointerId3 == i12) {
                        i12 = this.x;
                    }
                    int findPointerIndex3 = motionEvent.findPointerIndex(i12);
                    if (findPointerIndex3 < 0) {
                        this.v = true;
                        if (this.c) {
                            this.b.c(this);
                        }
                        return false;
                    }
                    this.w = motionEvent.getPointerId(findPointerIndex3);
                    this.y = true;
                    this.x = -1;
                    this.f = motionEvent.getX(findPointerIndex3);
                    this.g = motionEvent.getY(findPointerIndex3);
                }
            }
        } else if (this.u) {
            float f5 = this.r;
            float f6 = this.s;
            float f7 = this.t;
            int findPointerIndex4 = motionEvent.findPointerIndex(this.w);
            int findPointerIndex5 = motionEvent.findPointerIndex(this.x);
            float a10 = a(motionEvent, findPointerIndex4);
            float b3 = b(motionEvent, findPointerIndex4);
            float a11 = a(motionEvent, findPointerIndex5);
            float b4 = b(motionEvent, findPointerIndex5);
            boolean z4 = a10 < f5 || b3 < f5 || a10 > f6 || b3 > f7;
            boolean z5 = a11 < f5 || b4 < f5 || a11 > f6 || b4 > f7;
            if (z4 && (a3 = a(motionEvent, this.x, findPointerIndex4)) >= 0) {
                this.w = motionEvent.getPointerId(a3);
                a(motionEvent, a3);
                b(motionEvent, a3);
                findPointerIndex4 = a3;
                z4 = false;
            }
            if (z5 && (a2 = a(motionEvent, this.w, findPointerIndex5)) >= 0) {
                this.x = motionEvent.getPointerId(a2);
                a(motionEvent, a2);
                b(motionEvent, a2);
                findPointerIndex5 = a2;
                z5 = false;
            }
            if (z4 && z5) {
                this.f = -1.0f;
                this.g = -1.0f;
            } else if (z4) {
                this.f = motionEvent.getX(findPointerIndex5);
                this.g = motionEvent.getY(findPointerIndex5);
            } else if (z5) {
                this.f = motionEvent.getX(findPointerIndex4);
                this.g = motionEvent.getY(findPointerIndex4);
            } else {
                this.u = false;
                this.c = this.b.b(this);
            }
        }
        return true;
    }

    private int a(android.view.MotionEvent motionEvent, int i, int i2) {
        int pointerCount = motionEvent.getPointerCount();
        int findPointerIndex = motionEvent.findPointerIndex(i);
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (i3 != i2 && i3 != findPointerIndex) {
                float f = this.r;
                float f2 = this.s;
                float f3 = this.t;
                float a2 = a(motionEvent, i3);
                float b = b(motionEvent, i3);
                if (a2 >= f && b >= f && a2 <= f2 && b <= f3) {
                    return i3;
                }
            }
        }
        return -1;
    }

    private static float a(android.view.MotionEvent motionEvent, int i) {
        if (i < 0) {
            return Float.MIN_VALUE;
        }
        if (i == 0) {
            return motionEvent.getRawX();
        }
        return motionEvent.getX(i) + (motionEvent.getRawX() - motionEvent.getX());
    }

    private static float b(android.view.MotionEvent motionEvent, int i) {
        if (i < 0) {
            return Float.MIN_VALUE;
        }
        if (i == 0) {
            return motionEvent.getRawY();
        }
        return motionEvent.getY(i) + (motionEvent.getRawY() - motionEvent.getY());
    }

    private void b(android.view.MotionEvent motionEvent) {
        android.view.MotionEvent motionEvent2 = this.e;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.e = android.view.MotionEvent.obtain(motionEvent);
        this.l = -1.0f;
        this.m = -1.0f;
        this.n = -1.0f;
        android.view.MotionEvent motionEvent3 = this.d;
        int findPointerIndex = motionEvent3.findPointerIndex(this.w);
        int findPointerIndex2 = motionEvent3.findPointerIndex(this.x);
        int findPointerIndex3 = motionEvent.findPointerIndex(this.w);
        int findPointerIndex4 = motionEvent.findPointerIndex(this.x);
        if (findPointerIndex < 0 || findPointerIndex2 < 0 || findPointerIndex3 < 0 || findPointerIndex4 < 0) {
            this.v = true;
            if (this.c) {
                this.b.c(this);
                return;
            }
            return;
        }
        float x = motionEvent3.getX(findPointerIndex);
        float y = motionEvent3.getY(findPointerIndex);
        float x2 = motionEvent3.getX(findPointerIndex2);
        float y2 = motionEvent3.getY(findPointerIndex2);
        float x3 = motionEvent.getX(findPointerIndex3);
        float y3 = motionEvent.getY(findPointerIndex3);
        float x4 = motionEvent.getX(findPointerIndex4) - x3;
        float y4 = motionEvent.getY(findPointerIndex4) - y3;
        this.h = x2 - x;
        this.i = y2 - y;
        this.j = x4;
        this.k = y4;
        this.f = x3 + (x4 * 0.5f);
        this.g = y3 + (y4 * 0.5f);
        this.q = motionEvent.getEventTime() - motionEvent3.getEventTime();
        this.o = motionEvent.getPressure(findPointerIndex3) + motionEvent.getPressure(findPointerIndex4);
        this.p = motionEvent3.getPressure(findPointerIndex) + motionEvent3.getPressure(findPointerIndex2);
    }

    private void j() {
        android.view.MotionEvent motionEvent = this.d;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.d = null;
        }
        android.view.MotionEvent motionEvent2 = this.e;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.e = null;
        }
        this.u = false;
        this.c = false;
        this.w = -1;
        this.x = -1;
        this.v = false;
    }

    public final float b() {
        return this.f;
    }

    public final float c() {
        return this.g;
    }

    private float k() {
        if (this.l == -1.0f) {
            float f = this.j;
            float f2 = this.k;
            this.l = (float) java.lang.Math.sqrt((f * f) + (f2 * f2));
        }
        return this.l;
    }

    public final float d() {
        return this.j;
    }

    public final float e() {
        return this.k;
    }

    private float l() {
        if (this.m == -1.0f) {
            float f = this.h;
            float f2 = this.i;
            this.m = (float) java.lang.Math.sqrt((f * f) + (f2 * f2));
        }
        return this.m;
    }

    public final float f() {
        return this.h;
    }

    public final float g() {
        return this.i;
    }

    public final float h() {
        if (this.n == -1.0f) {
            this.n = k() / l();
        }
        return this.n;
    }

    public final long i() {
        return this.q;
    }
}
