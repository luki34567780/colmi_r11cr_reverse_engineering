package androidx.camera.core.impl;

/* loaded from: classes.dex */
public class LensFacingConverter {
    private LensFacingConverter() {
    }

    public static java.lang.Integer[] values() {
        return new java.lang.Integer[]{0, 1};
    }

    public static int valueOf(final java.lang.String name) {
        java.util.Objects.requireNonNull(name, "name cannot be null");
        name.hashCode();
        if (name.equals("BACK")) {
            return 1;
        }
        if (name.equals("FRONT")) {
            return 0;
        }
        throw new java.lang.IllegalArgumentException("Unknown len facing name " + name);
    }

    public static java.lang.String nameOf(final int lensFacing) {
        if (lensFacing == 0) {
            return "FRONT";
        }
        if (lensFacing == 1) {
            return "BACK";
        }
        throw new java.lang.IllegalArgumentException("Unknown lens facing " + lensFacing);
    }
}
