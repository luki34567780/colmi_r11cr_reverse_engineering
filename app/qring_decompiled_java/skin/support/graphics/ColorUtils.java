package skin.support.graphics;

/* loaded from: classes3.dex */
public final class ColorUtils {
    public static int setAlphaComponent(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new java.lang.IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK) | (i2 << 24);
    }
}
