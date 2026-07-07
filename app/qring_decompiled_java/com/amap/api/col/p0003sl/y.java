package com.amap.api.col.p0003sl;

/* compiled from: GLTextureView.java */
/* loaded from: classes.dex */
public class y extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener {
    private static final com.amap.api.col.3sl.y.j a = new com.amap.api.col.3sl.y.j(0);
    private final java.lang.ref.WeakReference<com.amap.api.col.p0003sl.y> b;
    private com.amap.api.col.3sl.y.i c;
    private android.opengl.GLSurfaceView.Renderer d;
    private boolean e;
    private com.amap.api.col.3sl.y.e f;
    private com.amap.api.col.3sl.y.f g;
    private com.amap.api.col.3sl.y.g h;
    private com.amap.api.col.3sl.y.k i;
    private int j;
    private int k;
    private boolean l;

    /* compiled from: GLTextureView.java */
    public interface e {
        javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay);
    }

    /* compiled from: GLTextureView.java */
    public interface f {
        javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig);

        void destroyContext(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLContext eGLContext);
    }

    /* compiled from: GLTextureView.java */
    public interface g {
        javax.microedition.khronos.egl.EGLSurface a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, java.lang.Object obj);

        void a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLSurface eGLSurface);
    }

    /* compiled from: GLTextureView.java */
    public interface k {
        javax.microedition.khronos.opengles.GL a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public y(android.content.Context context) {
        super(context, null);
        this.b = new java.lang.ref.WeakReference<>(this);
        a();
    }

    protected void finalize() throws java.lang.Throwable {
        try {
            com.amap.api.col.3sl.y.i iVar = this.c;
            if (iVar != null) {
                iVar.g();
            }
        } finally {
            super.finalize();
        }
    }

    private void a() {
        setSurfaceTextureListener(this);
    }

    public void setRenderer(android.opengl.GLSurfaceView.Renderer renderer) {
        e();
        if (this.f == null) {
            this.f = new com.amap.api.col.3sl.y.m();
        }
        byte b2 = 0;
        if (this.g == null) {
            this.g = new com.amap.api.col.3sl.y.c(this, b2);
        }
        if (this.h == null) {
            this.h = new com.amap.api.col.3sl.y.d(b2);
        }
        this.d = renderer;
        com.amap.api.col.3sl.y.i iVar = new com.amap.api.col.3sl.y.i(this.b);
        this.c = iVar;
        iVar.start();
    }

    public final void a(com.amap.api.col.3sl.y.f fVar) {
        e();
        this.g = fVar;
    }

    public final void a(com.amap.api.col.3sl.y.e eVar) {
        e();
        this.f = eVar;
    }

    public void setRenderMode(int i2) {
        this.c.a(i2);
    }

    public void requestRender() {
        this.c.b();
    }

    public int getRenderMode() {
        return this.c.a();
    }

    public void b() {
        this.c.e();
    }

    public void c() {
        this.c.f();
    }

    public void queueEvent(java.lang.Runnable runnable) {
        this.c.a(runnable);
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e && this.d != null) {
            com.amap.api.col.3sl.y.i iVar = this.c;
            int a2 = iVar != null ? iVar.a() : 1;
            com.amap.api.col.3sl.y.i iVar2 = new com.amap.api.col.3sl.y.i(this.b);
            this.c = iVar2;
            if (a2 != 1) {
                iVar2.a(a2);
            }
            this.c.start();
        }
        this.e = false;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        com.amap.api.col.3sl.y.i iVar = this.c;
        if (iVar != null) {
            iVar.g();
        }
        this.e = true;
        super.onDetachedFromWindow();
    }

    /* compiled from: GLTextureView.java */
    private class c implements com.amap.api.col.3sl.y.f {
        private c() {
        }

        /* synthetic */ c(com.amap.api.col.p0003sl.y yVar, byte b) {
            this();
        }

        @Override // com.amap.api.col.3sl.y.f
        public final javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
            int[] iArr = {12440, com.amap.api.col.p0003sl.y.this.k, 12344};
            javax.microedition.khronos.egl.EGLContext eGLContext = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
            if (com.amap.api.col.p0003sl.y.this.k == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        @Override // com.amap.api.col.3sl.y.f
        public final void destroyContext(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            android.util.Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            com.amap.api.col.3sl.y.h.a("eglDestroyContex", egl10.eglGetError());
        }
    }

    /* compiled from: GLTextureView.java */
    private static class d implements com.amap.api.col.3sl.y.g {
        private d() {
        }

        /* synthetic */ d(byte b) {
            this();
        }

        @Override // com.amap.api.col.3sl.y.g
        public final javax.microedition.khronos.egl.EGLSurface a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, java.lang.Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (java.lang.IllegalArgumentException e) {
                android.util.Log.e("GLSurfaceView", "eglCreateWindowSurface", e);
                return null;
            }
        }

        @Override // com.amap.api.col.3sl.y.g
        public final void a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* compiled from: GLTextureView.java */
    private abstract class a implements com.amap.api.col.3sl.y.e {
        protected int[] a;

        abstract javax.microedition.khronos.egl.EGLConfig a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr);

        public a(int[] iArr) {
            this.a = a(iArr);
        }

        @Override // com.amap.api.col.3sl.y.e
        public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.a, null, 0, iArr)) {
                throw new java.lang.IllegalArgumentException("eglChooseConfig failed");
            }
            int i = iArr[0];
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("No configs match configSpec");
            }
            javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.a, eGLConfigArr, i, iArr)) {
                throw new java.lang.IllegalArgumentException("eglChooseConfig#2 failed");
            }
            javax.microedition.khronos.egl.EGLConfig a = a(egl10, eGLDisplay, eGLConfigArr);
            if (a != null) {
                return a;
            }
            throw new java.lang.IllegalArgumentException("No config chosen");
        }

        private int[] a(int[] iArr) {
            if (com.amap.api.col.p0003sl.y.this.k != 2 && com.amap.api.col.p0003sl.y.this.k != 3) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i = length - 1;
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            if (com.amap.api.col.p0003sl.y.this.k == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            return iArr2;
        }
    }

    /* compiled from: GLTextureView.java */
    private class b extends com.amap.api.col.3sl.y.a {
        protected int c;
        protected int d;
        protected int e;
        protected int f;
        protected int g;
        protected int h;
        private int[] j;

        public b() {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 16, 12326, 0, 12344});
            this.j = new int[1];
            this.c = 8;
            this.d = 8;
            this.e = 8;
            this.f = 0;
            this.g = 16;
            this.h = 0;
        }

        @Override // com.amap.api.col.3sl.y.a
        public final javax.microedition.khronos.egl.EGLConfig a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr) {
            for (javax.microedition.khronos.egl.EGLConfig eGLConfig : eGLConfigArr) {
                int a = a(egl10, eGLDisplay, eGLConfig, 12325);
                int a2 = a(egl10, eGLDisplay, eGLConfig, 12326);
                if (a >= this.g && a2 >= this.h) {
                    int a3 = a(egl10, eGLDisplay, eGLConfig, 12324);
                    int a4 = a(egl10, eGLDisplay, eGLConfig, 12323);
                    int a5 = a(egl10, eGLDisplay, eGLConfig, 12322);
                    int a6 = a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (a3 == this.c && a4 == this.d && a5 == this.e && a6 == this.f) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.j)) {
                return this.j[0];
            }
            return 0;
        }
    }

    /* compiled from: GLTextureView.java */
    private class m extends com.amap.api.col.3sl.y.b {
        public m() {
            super();
        }
    }

    /* compiled from: GLTextureView.java */
    private static class h {
        javax.microedition.khronos.egl.EGL10 a;
        javax.microedition.khronos.egl.EGLDisplay b;
        javax.microedition.khronos.egl.EGLSurface c;
        javax.microedition.khronos.egl.EGLConfig d;
        javax.microedition.khronos.egl.EGLContext e;
        private java.lang.ref.WeakReference<com.amap.api.col.p0003sl.y> f;

        public h(java.lang.ref.WeakReference<com.amap.api.col.p0003sl.y> weakReference) {
            this.f = weakReference;
        }

        public final void a() {
            javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
            this.a = egl10;
            javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
            this.b = eglGetDisplay;
            if (eglGetDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
                throw new java.lang.RuntimeException("eglGetDisplay failed");
            }
            if (!this.a.eglInitialize(this.b, new int[2])) {
                throw new java.lang.RuntimeException("eglInitialize failed");
            }
            com.amap.api.col.p0003sl.y yVar = this.f.get();
            if (yVar != null) {
                this.d = yVar.f.chooseConfig(this.a, this.b);
                this.e = yVar.g.createContext(this.a, this.b, this.d);
            } else {
                this.d = null;
                this.e = null;
            }
            javax.microedition.khronos.egl.EGLContext eGLContext = this.e;
            if (eGLContext == null || eGLContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
                this.e = null;
                a("createContext");
            }
            this.c = null;
        }

        public final boolean b() {
            if (this.a == null) {
                throw new java.lang.RuntimeException("egl not initialized");
            }
            if (this.b == null) {
                throw new java.lang.RuntimeException("eglDisplay not initialized");
            }
            if (this.d == null) {
                throw new java.lang.RuntimeException("mEglConfig not initialized");
            }
            g();
            com.amap.api.col.p0003sl.y yVar = this.f.get();
            if (yVar != null) {
                this.c = yVar.h.a(this.a, this.b, this.d, yVar.getSurfaceTexture());
            } else {
                this.c = null;
            }
            javax.microedition.khronos.egl.EGLSurface eGLSurface = this.c;
            if (eGLSurface == null || eGLSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
                if (this.a.eglGetError() == 12299) {
                    android.util.Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            javax.microedition.khronos.egl.EGL10 egl10 = this.a;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.b;
            javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.c;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.e)) {
                return true;
            }
            a("EGLHelper", "eglMakeCurrent", this.a.eglGetError());
            return false;
        }

        final javax.microedition.khronos.opengles.GL c() {
            javax.microedition.khronos.opengles.GL gl = this.e.getGL();
            com.amap.api.col.p0003sl.y yVar = this.f.get();
            if (yVar == null) {
                return gl;
            }
            if (yVar.i != null) {
                gl = yVar.i.a();
            }
            if ((yVar.j & 3) != 0) {
                return android.opengl.GLDebugHelper.wrap(gl, (yVar.j & 1) != 0 ? 1 : 0, (yVar.j & 2) != 0 ? new com.amap.api.col.3sl.y.l() : null);
            }
            return gl;
        }

        public final int d() {
            if (this.a.eglSwapBuffers(this.b, this.c)) {
                return 12288;
            }
            return this.a.eglGetError();
        }

        public final void e() {
            g();
        }

        private void g() {
            javax.microedition.khronos.egl.EGLSurface eGLSurface = this.c;
            if (eGLSurface == null || eGLSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
                return;
            }
            javax.microedition.khronos.egl.EGL10 egl10 = this.a;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.b;
            javax.microedition.khronos.egl.EGLSurface eGLSurface2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
            com.amap.api.col.p0003sl.y yVar = this.f.get();
            if (yVar != null) {
                yVar.h.a(this.a, this.b, this.c);
            }
            this.c = null;
        }

        public final void f() {
            if (this.e != null) {
                com.amap.api.col.p0003sl.y yVar = this.f.get();
                if (yVar != null) {
                    yVar.g.destroyContext(this.a, this.b, this.e);
                }
                this.e = null;
            }
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.b;
            if (eGLDisplay != null) {
                this.a.eglTerminate(eGLDisplay);
                this.b = null;
            }
        }

        private void a(java.lang.String str) {
            a(str, this.a.eglGetError());
        }

        public static void a(java.lang.String str, int i) {
            throw new java.lang.RuntimeException(b(str, i));
        }

        public static void a(java.lang.String str, java.lang.String str2, int i) {
            android.util.Log.w(str, b(str2, i));
        }

        private static java.lang.String b(java.lang.String str, int i) {
            return str + " failed: " + i;
        }
    }

    /* compiled from: GLTextureView.java */
    static class i extends java.lang.Thread {
        private boolean a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean p;
        private com.amap.api.col.3sl.y.h s;
        private java.lang.ref.WeakReference<com.amap.api.col.p0003sl.y> t;
        private java.util.ArrayList<java.lang.Runnable> q = new java.util.ArrayList<>();
        private boolean r = true;
        private int l = 0;
        private int m = 0;
        private boolean o = true;
        private int n = 1;

        static /* synthetic */ boolean a(com.amap.api.col.3sl.y.i iVar) {
            iVar.b = true;
            return true;
        }

        i(java.lang.ref.WeakReference<com.amap.api.col.p0003sl.y> weakReference) {
            this.t = weakReference;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            setName("GLThread " + getId());
            try {
                m();
            } catch (java.lang.InterruptedException unused) {
            } catch (java.lang.Throwable th) {
                com.amap.api.col.p0003sl.y.a.a(this);
                throw th;
            }
            com.amap.api.col.p0003sl.y.a.a(this);
        }

        private void k() {
            if (this.i) {
                this.i = false;
                this.s.e();
            }
        }

        private void l() {
            if (this.h) {
                this.s.f();
                this.h = false;
                com.amap.api.col.p0003sl.y.a.c(this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:177:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m() throws java.lang.InterruptedException {
            /*
                Method dump skipped, instructions count: 557
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.3sl.y.i.m():void");
        }

        private boolean n() {
            return this.h && this.i && o();
        }

        private boolean o() {
            if (this.d || !this.e || this.f || this.l <= 0 || this.m <= 0) {
                return false;
            }
            return this.o || this.n == 1;
        }

        public final void a(int i) {
            if (i >= 0 && i <= 1) {
                synchronized (com.amap.api.col.p0003sl.y.a) {
                    this.n = i;
                    com.amap.api.col.p0003sl.y.a.notifyAll();
                }
                return;
            }
            throw new java.lang.IllegalArgumentException("renderMode");
        }

        public final int a() {
            int i;
            synchronized (com.amap.api.col.p0003sl.y.a) {
                i = this.n;
            }
            return i;
        }

        public final void b() {
            synchronized (com.amap.api.col.p0003sl.y.a) {
                this.o = true;
                com.amap.api.col.p0003sl.y.a.notifyAll();
            }
        }

        public final void c() {
            synchronized (com.amap.api.col.p0003sl.y.a) {
                this.e = true;
                this.j = false;
                com.amap.api.col.p0003sl.y.a.notifyAll();
                while (this.g && !this.j && !this.b) {
                    try {
                        com.amap.api.col.p0003sl.y.a.wait();
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void d() {
            synchronized (com.amap.api.col.p0003sl.y.a) {
                this.e = false;
                com.amap.api.col.p0003sl.y.a.notifyAll();
                while (!this.g && !this.b) {
                    try {
                        if (com.amap.api.maps.MapsInitializer.getTextureViewDestorySync()) {
                            com.amap.api.col.p0003sl.y.a.wait();
                        } else {
                            com.amap.api.col.p0003sl.y.a.wait(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL);
                        }
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void e() {
            synchronized (com.amap.api.col.p0003sl.y.a) {
                this.c = true;
                com.amap.api.col.p0003sl.y.a.notifyAll();
                while (!this.b && !this.d) {
                    try {
                        if (com.amap.api.maps.MapsInitializer.getTextureViewDestorySync()) {
                            com.amap.api.col.p0003sl.y.a.wait();
                        } else {
                            com.amap.api.col.p0003sl.y.a.wait(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL);
                        }
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void f() {
            synchronized (com.amap.api.col.p0003sl.y.a) {
                this.c = false;
                this.o = true;
                this.p = false;
                com.amap.api.col.p0003sl.y.a.notifyAll();
                while (!this.b && this.d && !this.p) {
                    try {
                        com.amap.api.col.p0003sl.y.a.wait();
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void a(int i, int i2) {
            synchronized (com.amap.api.col.p0003sl.y.a) {
                this.l = i;
                this.m = i2;
                this.r = true;
                this.o = true;
                this.p = false;
                com.amap.api.col.p0003sl.y.a.notifyAll();
                while (!this.b && !this.d && !this.p && n()) {
                    try {
                        com.amap.api.col.p0003sl.y.a.wait();
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void g() {
            synchronized (com.amap.api.col.p0003sl.y.a) {
                this.a = true;
                com.amap.api.col.p0003sl.y.a.notifyAll();
                while (!this.b) {
                    try {
                        com.amap.api.col.p0003sl.y.a.wait();
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void h() {
            this.k = true;
            com.amap.api.col.p0003sl.y.a.notifyAll();
        }

        public final void a(java.lang.Runnable runnable) {
            if (runnable != null) {
                synchronized (com.amap.api.col.p0003sl.y.a) {
                    this.q.add(runnable);
                    com.amap.api.col.p0003sl.y.a.notifyAll();
                }
                return;
            }
            throw new java.lang.IllegalArgumentException("r must not be null");
        }

        public final int i() {
            int i;
            synchronized (com.amap.api.col.p0003sl.y.a) {
                i = this.l;
            }
            return i;
        }

        public final int j() {
            int i;
            synchronized (com.amap.api.col.p0003sl.y.a) {
                i = this.m;
            }
            return i;
        }
    }

    /* compiled from: GLTextureView.java */
    static class l extends java.io.Writer {
        private java.lang.StringBuilder a = new java.lang.StringBuilder();

        l() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            a();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    a();
                } else {
                    this.a.append(c);
                }
            }
        }

        private void a() {
            if (this.a.length() > 0) {
                android.util.Log.v("GLSurfaceView", this.a.toString());
                java.lang.StringBuilder sb = this.a;
                sb.delete(0, sb.length());
            }
        }
    }

    private void e() {
        if (this.c != null) {
            throw new java.lang.IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* compiled from: GLTextureView.java */
    private static class j {
        private static java.lang.String a = "GLThreadManager";
        private boolean b;
        private int c;
        private boolean d;
        private boolean e;
        private boolean f;
        private com.amap.api.col.3sl.y.i g;

        private j() {
        }

        /* synthetic */ j(byte b) {
            this();
        }

        public final synchronized void a(com.amap.api.col.3sl.y.i iVar) {
            com.amap.api.col.3sl.y.i.a(iVar);
            if (this.g == iVar) {
                this.g = null;
            }
            notifyAll();
        }

        public final boolean b(com.amap.api.col.3sl.y.i iVar) {
            com.amap.api.col.3sl.y.i iVar2 = this.g;
            if (iVar2 == iVar || iVar2 == null) {
                this.g = iVar;
                notifyAll();
                return true;
            }
            c();
            if (this.e) {
                return true;
            }
            com.amap.api.col.3sl.y.i iVar3 = this.g;
            if (iVar3 == null) {
                return false;
            }
            iVar3.h();
            return false;
        }

        public final void c(com.amap.api.col.3sl.y.i iVar) {
            if (this.g == iVar) {
                this.g = null;
            }
            notifyAll();
        }

        public final synchronized boolean a() {
            return this.f;
        }

        public final synchronized boolean b() {
            c();
            return !this.e;
        }

        public final synchronized void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (!this.d && gl10 != null) {
                c();
                java.lang.String glGetString = gl10.glGetString(7937);
                if (this.c < 131072) {
                    this.e = !glGetString.startsWith("Q3Dimension MSM7500 ");
                    notifyAll();
                }
                this.f = this.e ? false : true;
                this.d = true;
            }
        }

        private void c() {
            if (this.b) {
                return;
            }
            this.c = 131072;
            this.e = true;
            this.b = true;
        }
    }

    private static boolean f() {
        return android.os.Build.VERSION.SDK_INT < 23;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i2, int i3) {
        this.c.c();
        if (f() || com.amap.api.maps.MapsInitializer.getTextureSizeChangedInvoked()) {
            onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        } else {
            if (this.c.i() == i2 && this.c.j() == i3) {
                return;
            }
            onSurfaceTextureSizeChanged(surfaceTexture, i2, i3);
        }
    }

    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        this.c.d();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i2, int i3) {
        this.c.a(i2, i3);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        onSurfaceTextureSizeChanged(getSurfaceTexture(), i4 - i2, i5 - i3);
        super.onLayout(z, i2, i3, i4, i5);
    }
}
