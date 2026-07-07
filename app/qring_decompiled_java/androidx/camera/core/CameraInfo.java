package androidx.camera.core;

/* loaded from: classes.dex */
public interface CameraInfo {
    public static final java.lang.String IMPLEMENTATION_TYPE_CAMERA2 = "androidx.camera.camera2";
    public static final java.lang.String IMPLEMENTATION_TYPE_CAMERA2_LEGACY = "androidx.camera.camera2.legacy";
    public static final java.lang.String IMPLEMENTATION_TYPE_FAKE = "androidx.camera.fake";
    public static final java.lang.String IMPLEMENTATION_TYPE_UNKNOWN = "<unknown>";

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ImplementationType {
    }

    androidx.camera.core.ExposureState getExposureState();

    java.lang.String getImplementationType();

    int getSensorRotationDegrees();

    int getSensorRotationDegrees(int relativeRotation);

    androidx.lifecycle.LiveData<java.lang.Integer> getTorchState();

    androidx.lifecycle.LiveData<androidx.camera.core.ZoomState> getZoomState();

    boolean hasFlashUnit();
}
