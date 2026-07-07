package androidx.camera.view.internal.compat.quirk;

/* loaded from: classes.dex */
public class DeviceQuirks {
    private static final androidx.camera.core.impl.Quirks QUIRKS = new androidx.camera.core.impl.Quirks(androidx.camera.view.internal.compat.quirk.DeviceQuirksLoader.loadQuirks());

    private DeviceQuirks() {
    }

    public static <T extends androidx.camera.core.impl.Quirk> T get(java.lang.Class<T> cls) {
        return (T) QUIRKS.get(cls);
    }
}
