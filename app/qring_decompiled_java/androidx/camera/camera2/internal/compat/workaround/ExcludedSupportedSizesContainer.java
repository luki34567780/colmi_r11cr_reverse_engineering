package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes.dex */
public class ExcludedSupportedSizesContainer {
    private final java.lang.String mCameraId;

    public ExcludedSupportedSizesContainer(java.lang.String cameraId) {
        this.mCameraId = cameraId;
    }

    public java.util.List<android.util.Size> get(int imageFormat) {
        androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk = (androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk) androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk.class);
        if (excludedSupportedSizesQuirk == null) {
            return new java.util.ArrayList();
        }
        return excludedSupportedSizesQuirk.getExcludedSizes(this.mCameraId, imageFormat);
    }
}
