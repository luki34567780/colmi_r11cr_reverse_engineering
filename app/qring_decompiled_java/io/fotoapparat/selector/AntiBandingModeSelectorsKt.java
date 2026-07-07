package io.fotoapparat.selector;

/* compiled from: AntiBandingModeSelectors.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0000\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\u0006\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\u0007\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\b\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005*<\u0010\t\"\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0002\b\u00052\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0002\b\u0005¨\u0006\n"}, d2 = {kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "Lkotlin/Function1;", "", "Lio/fotoapparat/parameter/AntiBandingMode;", "Lio/fotoapparat/selector/AntiBandingModeSelector;", "Lkotlin/ExtensionFunctionType;", "hz50", "hz60", io.reactivex.annotations.SchedulerSupport.NONE, "AntiBandingModeSelector", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class AntiBandingModeSelectorsKt {
    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.AntiBandingMode>, io.fotoapparat.parameter.AntiBandingMode> auto() {
        return io.fotoapparat.selector.SelectorsKt.single(io.fotoapparat.parameter.AntiBandingMode.Auto.INSTANCE);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.AntiBandingMode>, io.fotoapparat.parameter.AntiBandingMode> hz50() {
        return io.fotoapparat.selector.SelectorsKt.single(io.fotoapparat.parameter.AntiBandingMode.HZ50.INSTANCE);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.AntiBandingMode>, io.fotoapparat.parameter.AntiBandingMode> hz60() {
        return io.fotoapparat.selector.SelectorsKt.single(io.fotoapparat.parameter.AntiBandingMode.HZ60.INSTANCE);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.AntiBandingMode>, io.fotoapparat.parameter.AntiBandingMode> none() {
        return io.fotoapparat.selector.SelectorsKt.single(io.fotoapparat.parameter.AntiBandingMode.None.INSTANCE);
    }
}
