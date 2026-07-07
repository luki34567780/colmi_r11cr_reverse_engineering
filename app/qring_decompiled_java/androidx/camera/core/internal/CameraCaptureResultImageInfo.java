package androidx.camera.core.internal;

/* loaded from: classes.dex */
public final class CameraCaptureResultImageInfo implements androidx.camera.core.ImageInfo {
    private final androidx.camera.core.impl.CameraCaptureResult mCameraCaptureResult;

    @Override // androidx.camera.core.ImageInfo
    public int getRotationDegrees() {
        return 0;
    }

    public CameraCaptureResultImageInfo(androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        this.mCameraCaptureResult = cameraCaptureResult;
    }

    @Override // androidx.camera.core.ImageInfo
    public androidx.camera.core.impl.TagBundle getTagBundle() {
        return this.mCameraCaptureResult.getTagBundle();
    }

    @Override // androidx.camera.core.ImageInfo
    public long getTimestamp() {
        return this.mCameraCaptureResult.getTimestamp();
    }

    @Override // androidx.camera.core.ImageInfo
    public void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder exifBuilder) {
        this.mCameraCaptureResult.populateExifData(exifBuilder);
    }

    public androidx.camera.core.impl.CameraCaptureResult getCameraCaptureResult() {
        return this.mCameraCaptureResult;
    }
}
