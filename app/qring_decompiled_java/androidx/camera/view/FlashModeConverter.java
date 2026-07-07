package androidx.camera.view;

/* loaded from: classes.dex */
final class FlashModeConverter {
    private FlashModeConverter() {
    }

    public static int valueOf(final java.lang.String name) {
        java.util.Objects.requireNonNull(name, "name cannot be null");
        name.hashCode();
        switch (name) {
            case "ON":
                return 1;
            case "OFF":
                return 2;
            case "AUTO":
                return 0;
            default:
                throw new java.lang.IllegalArgumentException("Unknown flash mode name " + name);
        }
    }

    public static java.lang.String nameOf(final int flashMode) {
        if (flashMode == 0) {
            return "AUTO";
        }
        if (flashMode == 1) {
            return "ON";
        }
        if (flashMode == 2) {
            return "OFF";
        }
        throw new java.lang.IllegalArgumentException("Unknown flash mode " + flashMode);
    }
}
