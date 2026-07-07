package io.fotoapparat.parameter.camera.convert;

/* compiled from: FpsRangeConverter.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toFpsRange", "Lio/fotoapparat/parameter/FpsRange;", "", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class FpsRangeConverterKt {
    public static final io.fotoapparat.parameter.FpsRange toFpsRange(int[] receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return new io.fotoapparat.parameter.FpsRange(receiver$0[0], receiver$0[1]);
    }
}
