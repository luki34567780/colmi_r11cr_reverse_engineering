package androidx.camera.core.impl;

/* loaded from: classes.dex */
public interface CameraCaptureResult {
    androidx.camera.core.impl.CameraCaptureMetaData.AeState getAeState();

    androidx.camera.core.impl.CameraCaptureMetaData.AfMode getAfMode();

    androidx.camera.core.impl.CameraCaptureMetaData.AfState getAfState();

    androidx.camera.core.impl.CameraCaptureMetaData.AwbState getAwbState();

    androidx.camera.core.impl.CameraCaptureMetaData.FlashState getFlashState();

    androidx.camera.core.impl.TagBundle getTagBundle();

    long getTimestamp();

    void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder exifBuilder);

    /* renamed from: androidx.camera.core.impl.CameraCaptureResult$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$populateExifData(androidx.camera.core.impl.CameraCaptureResult _this, androidx.camera.core.impl.utils.ExifData.Builder exifBuilder) {
            exifBuilder.setFlashState(_this.getFlashState());
        }
    }

    public static final class EmptyCameraCaptureResult implements androidx.camera.core.impl.CameraCaptureResult {
        @Override // androidx.camera.core.impl.CameraCaptureResult
        public long getTimestamp() {
            return -1L;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public /* synthetic */ void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder builder) {
            androidx.camera.core.impl.CameraCaptureResult.CC.$default$populateExifData(this, builder);
        }

        public static androidx.camera.core.impl.CameraCaptureResult create() {
            return new androidx.camera.core.impl.CameraCaptureResult.EmptyCameraCaptureResult();
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public androidx.camera.core.impl.CameraCaptureMetaData.AfMode getAfMode() {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public androidx.camera.core.impl.CameraCaptureMetaData.AfState getAfState() {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfState.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public androidx.camera.core.impl.CameraCaptureMetaData.AeState getAeState() {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public androidx.camera.core.impl.CameraCaptureMetaData.AwbState getAwbState() {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public androidx.camera.core.impl.CameraCaptureMetaData.FlashState getFlashState() {
            return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        public androidx.camera.core.impl.TagBundle getTagBundle() {
            return androidx.camera.core.impl.TagBundle.emptyBundle();
        }
    }
}
