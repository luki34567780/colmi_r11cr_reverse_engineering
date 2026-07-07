package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
    }

    static java.util.List<androidx.camera.core.impl.Quirk> loadQuirks() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (androidx.camera.core.internal.compat.quirk.IncompleteCameraListQuirk.load()) {
            arrayList.add(new androidx.camera.core.internal.compat.quirk.IncompleteCameraListQuirk());
        }
        if (androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk.load()) {
            arrayList.add(new androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk());
        }
        if (androidx.camera.core.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.load()) {
            arrayList.add(new androidx.camera.core.internal.compat.quirk.ImageCaptureWashedOutImageQuirk());
        }
        return arrayList;
    }
}
