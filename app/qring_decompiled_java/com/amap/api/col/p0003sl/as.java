package com.amap.api.col.p0003sl;

/* compiled from: ScaleRotateGestureDetector.java */
/* loaded from: classes.dex */
public final class as extends com.amap.api.col.p0003sl.ar {

    /* compiled from: ScaleRotateGestureDetector.java */
    public static abstract class a implements com.amap.api.col.3sl.ar.a {
        public abstract boolean a(com.amap.api.col.p0003sl.as asVar);

        public abstract boolean b(com.amap.api.col.p0003sl.as asVar);

        public abstract void c(com.amap.api.col.p0003sl.as asVar);

        @Override // com.amap.api.col.3sl.ar.a
        public final boolean a(com.amap.api.col.p0003sl.ar arVar) {
            return a((com.amap.api.col.p0003sl.as) arVar);
        }

        @Override // com.amap.api.col.3sl.ar.a
        public final boolean b(com.amap.api.col.p0003sl.ar arVar) {
            return b((com.amap.api.col.p0003sl.as) arVar);
        }

        @Override // com.amap.api.col.3sl.ar.a
        public final void c(com.amap.api.col.p0003sl.ar arVar) {
            c((com.amap.api.col.p0003sl.as) arVar);
        }
    }

    public as(android.content.Context context, com.amap.api.col.3sl.as.a aVar) {
        super(context, aVar);
    }

    public final float j() {
        return (float) (((java.lang.Math.atan2(g(), f()) - java.lang.Math.atan2(e(), d())) * 180.0d) / 3.141592653589793d);
    }
}
