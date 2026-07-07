package androidx.camera.view.internal.compat.quirk;

/* loaded from: classes.dex */
public class SurfaceViewStretchedQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.lang.String GALAXY_Z_FOLD_2 = "F2Q";
    private static final java.lang.String SAMSUNG = "SAMSUNG";

    static boolean load() {
        return SAMSUNG.equals(android.os.Build.MANUFACTURER.toUpperCase()) && GALAXY_Z_FOLD_2.equals(android.os.Build.DEVICE.toUpperCase());
    }
}
