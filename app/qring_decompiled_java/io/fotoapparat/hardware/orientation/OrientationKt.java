package io.fotoapparat.hardware.orientation;

/* compiled from: Orientation.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000*\n\u0010\u0003\"\u00020\u00012\u00020\u0001*\n\u0010\u0004\"\u00020\u00012\u00020\u0001¨\u0006\u0005"}, d2 = {"toOrientation", "Lio/fotoapparat/hardware/orientation/Orientation;", "", "DeviceOrientation", "ScreenOrientation", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class OrientationKt {
    public static final io.fotoapparat.hardware.orientation.Orientation toOrientation(int i) {
        if (i != 0) {
            if (i == 90) {
                return io.fotoapparat.hardware.orientation.Orientation.Horizontal.Landscape.INSTANCE;
            }
            if (i == 180) {
                return io.fotoapparat.hardware.orientation.Orientation.Vertical.ReversePortrait.INSTANCE;
            }
            if (i == 270) {
                return io.fotoapparat.hardware.orientation.Orientation.Horizontal.ReverseLandscape.INSTANCE;
            }
            if (i != 360) {
                throw new java.lang.IllegalArgumentException("Cannot convert " + i + " to absolute Orientation.");
            }
        }
        return io.fotoapparat.hardware.orientation.Orientation.Vertical.Portrait.INSTANCE;
    }
}
