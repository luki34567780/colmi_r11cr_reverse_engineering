package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes.dex */
public final class ImageCaptureRotationOptionQuirk implements androidx.camera.core.impl.Quirk {
    static boolean load() {
        return isHuaweiMate20Lite() || isHonor9X();
    }

    private static boolean isHuaweiMate20Lite() {
        return "HUAWEI".equalsIgnoreCase(android.os.Build.BRAND) && "SNE-LX1".equalsIgnoreCase(android.os.Build.MODEL);
    }

    private static boolean isHonor9X() {
        return "HONOR".equalsIgnoreCase(android.os.Build.BRAND) && "STK-LX1".equalsIgnoreCase(android.os.Build.MODEL);
    }

    public boolean isSupported(androidx.camera.core.impl.Config.Option<?> option) {
        return option != androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION;
    }
}
