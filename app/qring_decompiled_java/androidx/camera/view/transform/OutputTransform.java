package androidx.camera.view.transform;

/* loaded from: classes.dex */
public final class OutputTransform {
    final android.graphics.Matrix mMatrix;
    final android.util.Size mViewPortSize;

    public OutputTransform(android.graphics.Matrix matrix, android.util.Size viewPortSize) {
        this.mMatrix = matrix;
        this.mViewPortSize = viewPortSize;
    }

    android.graphics.Matrix getMatrix() {
        return this.mMatrix;
    }

    android.util.Size getViewPortSize() {
        return this.mViewPortSize;
    }
}
