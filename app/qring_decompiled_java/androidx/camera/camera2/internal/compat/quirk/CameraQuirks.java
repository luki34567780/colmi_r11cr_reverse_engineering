package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes.dex */
public class CameraQuirks {
    private CameraQuirks() {
    }

    public static androidx.camera.core.impl.Quirks get(final java.lang.String cameraId, final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk.load(cameraCharacteristicsCompat)) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk(cameraCharacteristicsCompat));
        }
        if (androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk.load(cameraCharacteristicsCompat)) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk());
        }
        if (androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk.load(cameraCharacteristicsCompat)) {
            arrayList.add(new androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk());
        }
        return new androidx.camera.core.impl.Quirks(arrayList);
    }
}
