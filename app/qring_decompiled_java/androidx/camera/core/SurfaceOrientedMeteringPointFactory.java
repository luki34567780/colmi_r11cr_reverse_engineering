package androidx.camera.core;

/* loaded from: classes.dex */
public class SurfaceOrientedMeteringPointFactory extends androidx.camera.core.MeteringPointFactory {
    private final float mHeight;
    private final float mWidth;

    public SurfaceOrientedMeteringPointFactory(float width, float height) {
        this.mWidth = width;
        this.mHeight = height;
    }

    public SurfaceOrientedMeteringPointFactory(float width, float height, androidx.camera.core.UseCase useCaseForAspectRatio) {
        super(getUseCaseAspectRatio(useCaseForAspectRatio));
        this.mWidth = width;
        this.mHeight = height;
    }

    private static android.util.Rational getUseCaseAspectRatio(androidx.camera.core.UseCase useCase) {
        if (useCase == null) {
            return null;
        }
        android.util.Size attachedSurfaceResolution = useCase.getAttachedSurfaceResolution();
        if (attachedSurfaceResolution == null) {
            throw new java.lang.IllegalStateException("UseCase " + useCase + " is not bound.");
        }
        return new android.util.Rational(attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
    }

    @Override // androidx.camera.core.MeteringPointFactory
    protected android.graphics.PointF convertPoint(float x, float y) {
        return new android.graphics.PointF(x / this.mWidth, y / this.mHeight);
    }
}
