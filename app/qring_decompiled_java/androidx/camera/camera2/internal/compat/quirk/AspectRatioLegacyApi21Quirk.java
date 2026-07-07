package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes.dex */
public class AspectRatioLegacyApi21Quirk implements androidx.camera.core.impl.Quirk {
    public int getCorrectedAspectRatio() {
        return 2;
    }

    static boolean load(final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        java.lang.Integer num = (java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2 && android.os.Build.VERSION.SDK_INT == 21;
    }
}
