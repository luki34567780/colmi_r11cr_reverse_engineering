package io.fotoapparat.parameter.camera.convert;

/* compiled from: FlashConverter.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"toCode", "", "Lio/fotoapparat/parameter/Flash;", "toFlash", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class FlashConverterKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final io.fotoapparat.parameter.Flash toFlash(java.lang.String receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        switch (receiver$0.hashCode()) {
            case 3551:
                if (receiver$0.equals(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_ON)) {
                    return io.fotoapparat.parameter.Flash.On.INSTANCE;
                }
                return null;
            case 109935:
                if (receiver$0.equals(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                    return io.fotoapparat.parameter.Flash.Off.INSTANCE;
                }
                return null;
            case 3005871:
                if (receiver$0.equals(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                    return io.fotoapparat.parameter.Flash.Auto.INSTANCE;
                }
                return null;
            case 110547964:
                if (receiver$0.equals("torch")) {
                    return io.fotoapparat.parameter.Flash.Torch.INSTANCE;
                }
                return null;
            case 1081542389:
                if (receiver$0.equals("red-eye")) {
                    return io.fotoapparat.parameter.Flash.AutoRedEye.INSTANCE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final java.lang.String toCode(io.fotoapparat.parameter.Flash receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.parameter.Flash.On.INSTANCE)) {
            return kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_ON;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.parameter.Flash.Off.INSTANCE)) {
            return kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.parameter.Flash.Auto.INSTANCE)) {
            return kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.parameter.Flash.Torch.INSTANCE)) {
            return "torch";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.parameter.Flash.AutoRedEye.INSTANCE)) {
            return "red-eye";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
