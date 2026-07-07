package io.fotoapparat.characteristic;

/* compiled from: CameraInfoProvider.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"getCharacteristics", "Lio/fotoapparat/characteristic/Characteristics;", "cameraId", "", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class CameraInfoProviderKt {
    public static final io.fotoapparat.characteristic.Characteristics getCharacteristics(int i) {
        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
        android.hardware.Camera.getCameraInfo(i, cameraInfo);
        io.fotoapparat.characteristic.LensPosition lensPosition = io.fotoapparat.characteristic.LensPositionCharacteristicKt.toLensPosition(cameraInfo.facing);
        return new io.fotoapparat.characteristic.Characteristics(i, lensPosition, io.fotoapparat.hardware.orientation.OrientationKt.toOrientation(cameraInfo.orientation), kotlin.jvm.internal.Intrinsics.areEqual(lensPosition, io.fotoapparat.characteristic.LensPosition.Front.INSTANCE));
    }
}
