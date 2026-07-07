package io.fotoapparat.parameter.camera.convert;

/* compiled from: FocusModeConverter.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"toCode", "", "Lio/fotoapparat/parameter/FocusMode;", "toFocusMode", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class FocusModeConverterKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final io.fotoapparat.parameter.FocusMode toFocusMode(java.lang.String receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        switch (receiver$0.hashCode()) {
            case -194628547:
                if (receiver$0.equals("continuous-video")) {
                    return io.fotoapparat.parameter.FocusMode.ContinuousFocusVideo.INSTANCE;
                }
                return null;
            case 3005871:
                if (receiver$0.equals(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                    return io.fotoapparat.parameter.FocusMode.Auto.INSTANCE;
                }
                return null;
            case 3108534:
                if (receiver$0.equals("edof")) {
                    return io.fotoapparat.parameter.FocusMode.Edof.INSTANCE;
                }
                return null;
            case 97445748:
                if (receiver$0.equals("fixed")) {
                    return io.fotoapparat.parameter.FocusMode.Fixed.INSTANCE;
                }
                return null;
            case 103652300:
                if (receiver$0.equals("macro")) {
                    return io.fotoapparat.parameter.FocusMode.Macro.INSTANCE;
                }
                return null;
            case 173173288:
                if (receiver$0.equals("infinity")) {
                    return io.fotoapparat.parameter.FocusMode.Infinity.INSTANCE;
                }
                return null;
            case 910005312:
                if (receiver$0.equals("continuous-picture")) {
                    return io.fotoapparat.parameter.FocusMode.ContinuousFocusPicture.INSTANCE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final java.lang.String toCode(io.fotoapparat.parameter.FocusMode receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.parameter.FocusMode.Edof.INSTANCE)) {
            return "edof";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.parameter.FocusMode.Auto.INSTANCE)) {
            return kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.parameter.FocusMode.Macro.INSTANCE)) {
            return "macro";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.parameter.FocusMode.Fixed.INSTANCE)) {
            return "fixed";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.parameter.FocusMode.Infinity.INSTANCE)) {
            return "infinity";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.parameter.FocusMode.ContinuousFocusVideo.INSTANCE)) {
            return "continuous-video";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.parameter.FocusMode.ContinuousFocusPicture.INSTANCE)) {
            return "continuous-picture";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
