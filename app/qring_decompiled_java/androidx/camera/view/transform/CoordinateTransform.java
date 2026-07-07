package androidx.camera.view.transform;

/* loaded from: classes.dex */
public final class CoordinateTransform {
    private static final java.lang.String MISMATCH_MSG = "The source viewport (%s) does not match the target viewport (%s). Please make sure they are associated with the same Viewport.";
    private static final java.lang.String TAG = "CoordinateTransform";
    private final android.graphics.Matrix mMatrix;

    public CoordinateTransform(androidx.camera.view.transform.OutputTransform source, androidx.camera.view.transform.OutputTransform target) {
        if (!androidx.camera.view.TransformUtils.isAspectRatioMatchingWithRoundingError(source.getViewPortSize(), false, target.getViewPortSize(), false)) {
            androidx.camera.core.Logger.w(TAG, java.lang.String.format(MISMATCH_MSG, source.getViewPortSize(), target.getViewPortSize()));
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.mMatrix = matrix;
        androidx.core.util.Preconditions.checkState(source.getMatrix().invert(matrix), "The source transform cannot be inverted");
        matrix.postConcat(target.getMatrix());
    }

    public void transform(android.graphics.Matrix outMatrix) {
        outMatrix.set(this.mMatrix);
    }

    public void mapPoints(float[] points) {
        this.mMatrix.mapPoints(points);
    }

    public void mapPoint(android.graphics.PointF point) {
        float[] fArr = {point.x, point.y};
        this.mMatrix.mapPoints(fArr);
        point.x = fArr[0];
        point.y = fArr[1];
    }

    public void mapRect(android.graphics.RectF rect) {
        this.mMatrix.mapRect(rect);
    }
}
