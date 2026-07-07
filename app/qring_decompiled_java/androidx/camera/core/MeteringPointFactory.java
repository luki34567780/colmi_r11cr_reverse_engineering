package androidx.camera.core;

/* loaded from: classes.dex */
public abstract class MeteringPointFactory {
    private android.util.Rational mSurfaceAspectRatio;

    public static float getDefaultPointSize() {
        return 0.15f;
    }

    protected abstract android.graphics.PointF convertPoint(float x, float y);

    public MeteringPointFactory() {
        this(null);
    }

    public MeteringPointFactory(android.util.Rational surfaceAspectRatio) {
        this.mSurfaceAspectRatio = surfaceAspectRatio;
    }

    public final androidx.camera.core.MeteringPoint createPoint(float x, float y) {
        return createPoint(x, y, getDefaultPointSize());
    }

    public final androidx.camera.core.MeteringPoint createPoint(float x, float y, float size) {
        android.graphics.PointF convertPoint = convertPoint(x, y);
        return new androidx.camera.core.MeteringPoint(convertPoint.x, convertPoint.y, size, this.mSurfaceAspectRatio);
    }
}
