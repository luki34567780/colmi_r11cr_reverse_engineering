package androidx.camera.view.internal.compat.quirk;

/* loaded from: classes.dex */
public class PreviewOneThirdWiderQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.lang.String SAMSUNG_A3_2017 = "A3Y17LTE";
    private static final java.lang.String SAMSUNG_J5_PRIME = "ON5XELTE";

    public float getCropRectScaleX() {
        return 0.75f;
    }

    static boolean load() {
        return (SAMSUNG_J5_PRIME.equals(android.os.Build.DEVICE.toUpperCase()) && android.os.Build.VERSION.SDK_INT >= 26) || SAMSUNG_A3_2017.equals(android.os.Build.DEVICE.toUpperCase());
    }
}
