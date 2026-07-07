package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes.dex */
public class StillCaptureFlow {
    private final boolean mShouldStopRepeatingBeforeStillCapture;

    public StillCaptureFlow() {
        this.mShouldStopRepeatingBeforeStillCapture = ((androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk) androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk.class)) != null;
    }

    public boolean shouldStopRepeatingBeforeCapture(java.util.List<android.hardware.camera2.CaptureRequest> captureRequests, boolean isStillCapture) {
        if (this.mShouldStopRepeatingBeforeStillCapture && isStillCapture) {
            java.util.Iterator<android.hardware.camera2.CaptureRequest> it = captureRequests.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Integer) it.next().get(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (intValue == 2 || intValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
