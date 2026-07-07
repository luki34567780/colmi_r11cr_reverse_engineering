package androidx.camera.view.internal.compat.quirk;

/* loaded from: classes.dex */
public class TextureViewRotationQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.lang.String FAIRPHONE = "Fairphone";
    private static final java.lang.String FAIRPHONE_2_MODEL = "FP2";

    static boolean load() {
        return isFairphone2();
    }

    public int getCorrectionRotation(boolean isFrontCamera) {
        return (isFairphone2() && isFrontCamera) ? 180 : 0;
    }

    private static boolean isFairphone2() {
        return FAIRPHONE.equalsIgnoreCase(android.os.Build.MANUFACTURER) && FAIRPHONE_2_MODEL.equalsIgnoreCase(android.os.Build.MODEL);
    }
}
