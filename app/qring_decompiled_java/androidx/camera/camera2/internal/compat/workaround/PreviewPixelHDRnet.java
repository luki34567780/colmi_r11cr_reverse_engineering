package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes.dex */
public class PreviewPixelHDRnet {
    private PreviewPixelHDRnet() {
    }

    public static void setHDRnet(androidx.camera.core.impl.SessionConfig.Builder sessionBuilder) {
        if (((androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk) androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk.class)) == null) {
            return;
        }
        androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
        builder.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.TONEMAP_MODE, 2);
        sessionBuilder.addImplementationOptions(builder.build());
    }
}
