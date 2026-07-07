package io.fotoapparat.characteristic;

/* compiled from: LensPositionCharacteristic.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0003\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"CAMERA_FACING_EXTERNAL", "", "toCameraId", "Lio/fotoapparat/characteristic/LensPosition;", "toLensPosition", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class LensPositionCharacteristicKt {
    private static final int CAMERA_FACING_EXTERNAL = 2;

    public static final io.fotoapparat.characteristic.LensPosition toLensPosition(int i) {
        if (i == 0) {
            return io.fotoapparat.characteristic.LensPosition.Back.INSTANCE;
        }
        if (i == 1) {
            return io.fotoapparat.characteristic.LensPosition.Front.INSTANCE;
        }
        if (i == 2) {
            return io.fotoapparat.characteristic.LensPosition.External.INSTANCE;
        }
        throw new java.lang.IllegalArgumentException("Lens position " + i + " is not supported.");
    }

    public static final int toCameraId(io.fotoapparat.characteristic.LensPosition receiver$0) {
        java.lang.Integer num;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        java.util.Iterator<java.lang.Integer> it = kotlin.ranges.RangesKt.until(0, android.hardware.Camera.getNumberOfCameras()).iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.characteristic.CameraInfoProviderKt.getCharacteristics(num.intValue()).getLensPosition())) {
                break;
            }
        }
        java.lang.Integer num2 = num;
        if (num2 != null) {
            return num2.intValue();
        }
        throw new io.fotoapparat.exception.camera.CameraException("Device has no camera for the desired lens position(s).", null, 2, null);
    }
}
