package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes.dex */
public class AeFpsRangeLegacyQuirk implements androidx.camera.core.impl.Quirk {
    private final android.util.Range<java.lang.Integer> mAeFpsRange;

    public AeFpsRangeLegacyQuirk(final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mAeFpsRange = pickSuitableFpsRange((android.util.Range[]) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    static boolean load(final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        java.lang.Integer num = (java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public android.util.Range<java.lang.Integer> getRange() {
        return this.mAeFpsRange;
    }

    private android.util.Range<java.lang.Integer> pickSuitableFpsRange(final android.util.Range<java.lang.Integer>[] availableFpsRanges) {
        android.util.Range<java.lang.Integer> range = null;
        if (availableFpsRanges != null && availableFpsRanges.length != 0) {
            for (android.util.Range<java.lang.Integer> range2 : availableFpsRanges) {
                android.util.Range<java.lang.Integer> correctedFpsRange = getCorrectedFpsRange(range2);
                if (correctedFpsRange.getUpper().intValue() == 30 && (range == null || correctedFpsRange.getLower().intValue() < range.getLower().intValue())) {
                    range = correctedFpsRange;
                }
            }
        }
        return range;
    }

    private android.util.Range<java.lang.Integer> getCorrectedFpsRange(final android.util.Range<java.lang.Integer> fpsRange) {
        int intValue = fpsRange.getUpper().intValue();
        int intValue2 = fpsRange.getLower().intValue();
        if (fpsRange.getUpper().intValue() >= 1000) {
            intValue = fpsRange.getUpper().intValue() / 1000;
        }
        if (fpsRange.getLower().intValue() >= 1000) {
            intValue2 = fpsRange.getLower().intValue() / 1000;
        }
        return new android.util.Range<>(java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(intValue));
    }
}
