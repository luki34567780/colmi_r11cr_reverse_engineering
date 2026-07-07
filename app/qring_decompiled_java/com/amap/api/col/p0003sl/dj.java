package com.amap.api.col.p0003sl;

/* compiled from: GlesUtility.java */
/* loaded from: classes.dex */
public final class dj {
    public static void a(com.autonavi.base.amap.api.mapcore.IGLSurfaceView iGLSurfaceView) {
        iGLSurfaceView.setEGLContextFactory(new com.amap.api.col.3sl.dj.b());
        iGLSurfaceView.setEGLConfigChooser(new com.amap.api.col.3sl.dj.a());
    }

    /* compiled from: GlesUtility.java */
    public static class b extends com.amap.api.col.p0003sl.di {
        @Override // com.amap.api.col.p0003sl.di, android.opengl.GLSurfaceView.EGLContextFactory, com.amap.api.col.3sl.y.f
        public final javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
            try {
                return egl10.eglCreateContext(eGLDisplay, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        @Override // com.amap.api.col.p0003sl.di, android.opengl.GLSurfaceView.EGLContextFactory, com.amap.api.col.3sl.y.f
        public final void destroyContext(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLContext eGLContext) {
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }

    /* compiled from: GlesUtility.java */
    private static class c {
        public int[] a;
        public int[] b;

        private c() {
            this.a = null;
            this.b = new int[1];
        }

        /* synthetic */ c(byte b) {
            this();
        }
    }

    /* compiled from: GlesUtility.java */
    public static class a extends com.amap.api.col.p0003sl.dh {
        private static int g = 4;
        private int[] h = new int[1];
        protected int a = 5;
        protected int b = 6;
        protected int c = 5;
        protected int d = 0;
        protected int e = 16;
        protected int f = 8;

        private int[] a(boolean z) {
            return new int[]{12324, this.a, 12323, this.b, 12322, this.c, 12321, this.d, 12325, this.e, 12326, this.f, 12338, z ? 1 : 0, 12352, g, 12344};
        }

        private com.amap.api.col.3sl.dj.c a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay) {
            com.amap.api.col.3sl.dj.c cVar = new com.amap.api.col.3sl.dj.c((byte) 0);
            cVar.a = a(true);
            egl10.eglChooseConfig(eGLDisplay, cVar.a, null, 0, cVar.b);
            if (cVar.b[0] <= 0) {
                cVar.a = a(false);
                egl10.eglChooseConfig(eGLDisplay, cVar.a, null, 0, cVar.b);
                if (cVar.b[0] <= 0) {
                    return null;
                }
            }
            return cVar;
        }

        @Override // com.amap.api.col.p0003sl.dh, android.opengl.GLSurfaceView.EGLConfigChooser, com.amap.api.col.3sl.y.e
        public final javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay) {
            com.amap.api.col.3sl.dj.c a = a(egl10, eGLDisplay);
            if (a == null || a.a == null) {
                return null;
            }
            javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[a.b[0]];
            egl10.eglChooseConfig(eGLDisplay, a.a, eGLConfigArr, a.b[0], a.b);
            javax.microedition.khronos.egl.EGLConfig a2 = a(egl10, eGLDisplay, eGLConfigArr);
            if (a2 != null) {
                return a2;
            }
            this.a = 8;
            this.b = 8;
            this.c = 8;
            com.amap.api.col.3sl.dj.c a3 = a(egl10, eGLDisplay);
            if (a3 == null || a3.a == null) {
                return a2;
            }
            javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr2 = new javax.microedition.khronos.egl.EGLConfig[a3.b[0]];
            egl10.eglChooseConfig(eGLDisplay, a3.a, eGLConfigArr2, a3.b[0], a3.b);
            return a(egl10, eGLDisplay, eGLConfigArr2);
        }

        private javax.microedition.khronos.egl.EGLConfig a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr) {
            for (javax.microedition.khronos.egl.EGLConfig eGLConfig : eGLConfigArr) {
                int a = a(egl10, eGLDisplay, eGLConfig, 12325);
                int a2 = a(egl10, eGLDisplay, eGLConfig, 12326);
                if (a >= this.e && a2 >= this.f) {
                    int a3 = a(egl10, eGLDisplay, eGLConfig, 12324);
                    int a4 = a(egl10, eGLDisplay, eGLConfig, 12323);
                    int a5 = a(egl10, eGLDisplay, eGLConfig, 12322);
                    int a6 = a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (a3 == this.a && a4 == this.b && a5 == this.c && a6 == this.d) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.h)) {
                return this.h[0];
            }
            return 0;
        }
    }
}
