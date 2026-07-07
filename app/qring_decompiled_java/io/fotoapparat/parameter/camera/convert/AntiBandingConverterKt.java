package io.fotoapparat.parameter.camera.convert;

/* compiled from: AntiBandingConverter.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"toAntiBandingMode", "Lio/fotoapparat/parameter/AntiBandingMode;", "", "toCode", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class AntiBandingConverterKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final io.fotoapparat.parameter.AntiBandingMode toAntiBandingMode(java.lang.String receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        switch (receiver$0.hashCode()) {
            case 109935:
                if (receiver$0.equals(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                    return io.fotoapparat.parameter.AntiBandingMode.None.INSTANCE;
                }
                return null;
            case 1628397:
                if (receiver$0.equals("50hz")) {
                    return io.fotoapparat.parameter.AntiBandingMode.HZ50.INSTANCE;
                }
                return null;
            case 1658188:
                if (receiver$0.equals("60hz")) {
                    return io.fotoapparat.parameter.AntiBandingMode.HZ60.INSTANCE;
                }
                return null;
            case 3005871:
                if (receiver$0.equals(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                    return io.fotoapparat.parameter.AntiBandingMode.Auto.INSTANCE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final java.lang.String toCode(io.fotoapparat.parameter.AntiBandingMode receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.parameter.AntiBandingMode.Auto.INSTANCE)) {
            return kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.parameter.AntiBandingMode.HZ50.INSTANCE)) {
            return "50hz";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.parameter.AntiBandingMode.HZ60.INSTANCE)) {
            return "60hz";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(receiver$0, io.fotoapparat.parameter.AntiBandingMode.None.INSTANCE)) {
            return kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
