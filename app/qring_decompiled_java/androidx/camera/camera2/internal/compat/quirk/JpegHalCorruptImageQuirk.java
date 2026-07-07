package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes.dex */
public final class JpegHalCorruptImageQuirk implements androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk {
    private static final java.util.Set<java.lang.String> KNOWN_AFFECTED_DEVICES = new java.util.HashSet(java.util.Arrays.asList("heroqltevzw", "heroqltetmo"));
    private static final java.util.Set<java.lang.Integer> SUPPORTED_HARDWARE_LEVELS;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        SUPPORTED_HARDWARE_LEVELS = hashSet;
        hashSet.add(1);
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            hashSet.add(3);
        }
    }

    static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat characteristicsCompat) {
        return KNOWN_AFFECTED_DEVICES.contains(android.os.Build.DEVICE.toLowerCase(java.util.Locale.US)) && SUPPORTED_HARDWARE_LEVELS.contains(java.lang.Integer.valueOf(((java.lang.Integer) androidx.core.util.Preconditions.checkNotNull((java.lang.Integer) characteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL))).intValue()));
    }
}
