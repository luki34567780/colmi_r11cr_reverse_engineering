package io.fotoapparat.selector;

/* compiled from: FlashSelectors.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0000\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\u0006\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\u0007\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\b\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005*<\u0010\n\"\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0002\b\u00052\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0002\b\u0005¨\u0006\u000b"}, d2 = {"autoFlash", "Lkotlin/Function1;", "", "Lio/fotoapparat/parameter/Flash;", "Lio/fotoapparat/selector/FlashSelector;", "Lkotlin/ExtensionFunctionType;", "autoRedEye", kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF, kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_ON, "torch", "FlashSelector", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class FlashSelectorsKt {
    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.Flash>, io.fotoapparat.parameter.Flash> off() {
        return io.fotoapparat.selector.SelectorsKt.single(io.fotoapparat.parameter.Flash.Off.INSTANCE);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.Flash>, io.fotoapparat.parameter.Flash> on() {
        return io.fotoapparat.selector.SelectorsKt.single(io.fotoapparat.parameter.Flash.On.INSTANCE);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.Flash>, io.fotoapparat.parameter.Flash> autoFlash() {
        return io.fotoapparat.selector.SelectorsKt.single(io.fotoapparat.parameter.Flash.Auto.INSTANCE);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.Flash>, io.fotoapparat.parameter.Flash> autoRedEye() {
        return io.fotoapparat.selector.SelectorsKt.single(io.fotoapparat.parameter.Flash.AutoRedEye.INSTANCE);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.Flash>, io.fotoapparat.parameter.Flash> torch() {
        return io.fotoapparat.selector.SelectorsKt.single(io.fotoapparat.parameter.Flash.Torch.INSTANCE);
    }
}
