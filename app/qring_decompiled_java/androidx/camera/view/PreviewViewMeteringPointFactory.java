package androidx.camera.view;

/* loaded from: classes.dex */
class PreviewViewMeteringPointFactory extends androidx.camera.core.MeteringPointFactory {
    static final android.graphics.PointF INVALID_POINT = new android.graphics.PointF(2.0f, 2.0f);
    private android.graphics.Matrix mMatrix;
    private final androidx.camera.view.PreviewTransformation mPreviewTransformation;

    PreviewViewMeteringPointFactory(androidx.camera.view.PreviewTransformation previewTransformation) {
        this.mPreviewTransformation = previewTransformation;
    }

    @Override // androidx.camera.core.MeteringPointFactory
    protected android.graphics.PointF convertPoint(float x, float y) {
        float[] fArr = {x, y};
        synchronized (this) {
            android.graphics.Matrix matrix = this.mMatrix;
            if (matrix == null) {
                return INVALID_POINT;
            }
            matrix.mapPoints(fArr);
            return new android.graphics.PointF(fArr[0], fArr[1]);
        }
    }

    void recalculate(android.util.Size previewViewSize, int layoutDirection) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        synchronized (this) {
            if (previewViewSize.getWidth() != 0 && previewViewSize.getHeight() != 0) {
                this.mMatrix = this.mPreviewTransformation.getPreviewViewToNormalizedSurfaceMatrix(previewViewSize, layoutDirection);
                return;
            }
            this.mMatrix = null;
        }
    }
}
