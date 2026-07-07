package androidx.camera.core;

/* loaded from: classes.dex */
public class MeteringPoint {
    private float mNormalizedX;
    private float mNormalizedY;
    private float mSize;
    private android.util.Rational mSurfaceAspectRatio;

    MeteringPoint(float normalizedX, float normalizedY, float size, android.util.Rational surfaceAspectRatio) {
        this.mNormalizedX = normalizedX;
        this.mNormalizedY = normalizedY;
        this.mSize = size;
        this.mSurfaceAspectRatio = surfaceAspectRatio;
    }

    public float getX() {
        return this.mNormalizedX;
    }

    public float getY() {
        return this.mNormalizedY;
    }

    public float getSize() {
        return this.mSize;
    }

    public android.util.Rational getSurfaceAspectRatio() {
        return this.mSurfaceAspectRatio;
    }
}
