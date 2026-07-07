package io.fotoapparat.parameter.camera.convert;

/* compiled from: ResolutionConverter.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003¨\u0006\u0004"}, d2 = {"toResolution", "Lio/fotoapparat/parameter/Resolution;", "Landroid/hardware/Camera$Size;", "Landroid/hardware/Camera;", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class ResolutionConverterKt {
    public static final io.fotoapparat.parameter.Resolution toResolution(android.hardware.Camera.Size receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return new io.fotoapparat.parameter.Resolution(receiver$0.width, receiver$0.height);
    }
}
