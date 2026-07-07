package androidx.camera.view.transform;

/* loaded from: classes.dex */
public final class ImageProxyTransformFactory {
    private boolean mUsingCropRect;
    private boolean mUsingRotationDegrees;

    public void setUsingCropRect(boolean usingCropRect) {
        this.mUsingCropRect = usingCropRect;
    }

    public boolean isUsingCropRect() {
        return this.mUsingCropRect;
    }

    public void setUsingRotationDegrees(boolean usingRotationDegrees) {
        this.mUsingRotationDegrees = usingRotationDegrees;
    }

    public boolean isUsingRotationDegrees() {
        return this.mUsingRotationDegrees;
    }

    public androidx.camera.view.transform.OutputTransform getOutputTransform(androidx.camera.core.ImageProxy imageProxy) {
        int rotationDegrees = getRotationDegrees(imageProxy);
        android.graphics.RectF cropRect = getCropRect(imageProxy);
        android.graphics.Matrix rectToRect = androidx.camera.view.TransformUtils.getRectToRect(cropRect, getRotatedCropRect(cropRect, rotationDegrees), rotationDegrees);
        rectToRect.preConcat(androidx.camera.view.TransformUtils.getNormalizedToBuffer(imageProxy.getCropRect()));
        return new androidx.camera.view.transform.OutputTransform(rectToRect, androidx.camera.view.TransformUtils.rectToSize(imageProxy.getCropRect()));
    }

    private android.graphics.RectF getCropRect(androidx.camera.core.ImageProxy imageProxy) {
        if (this.mUsingCropRect) {
            return new android.graphics.RectF(imageProxy.getCropRect());
        }
        return new android.graphics.RectF(0.0f, 0.0f, imageProxy.getWidth(), imageProxy.getHeight());
    }

    private int getRotationDegrees(androidx.camera.core.ImageProxy imageProxy) {
        if (this.mUsingRotationDegrees) {
            return imageProxy.getImageInfo().getRotationDegrees();
        }
        return 0;
    }

    static android.graphics.RectF getRotatedCropRect(android.graphics.RectF rect, int rotationDegrees) {
        if (androidx.camera.view.TransformUtils.is90or270(rotationDegrees)) {
            return new android.graphics.RectF(0.0f, 0.0f, rect.height(), rect.width());
        }
        return new android.graphics.RectF(0.0f, 0.0f, rect.width(), rect.height());
    }
}
