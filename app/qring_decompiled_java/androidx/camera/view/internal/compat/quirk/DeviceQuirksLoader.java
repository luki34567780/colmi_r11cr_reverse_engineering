package androidx.camera.view.internal.compat.quirk;

/* loaded from: classes.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
    }

    static java.util.List<androidx.camera.core.impl.Quirk> loadQuirks() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (androidx.camera.view.internal.compat.quirk.PreviewOneThirdWiderQuirk.load()) {
            arrayList.add(new androidx.camera.view.internal.compat.quirk.PreviewOneThirdWiderQuirk());
        }
        if (androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk.load()) {
            arrayList.add(new androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk());
        }
        if (androidx.camera.view.internal.compat.quirk.TextureViewRotationQuirk.load()) {
            arrayList.add(new androidx.camera.view.internal.compat.quirk.TextureViewRotationQuirk());
        }
        return arrayList;
    }
}
