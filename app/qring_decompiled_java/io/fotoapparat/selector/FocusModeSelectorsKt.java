package io.fotoapparat.selector;

/* compiled from: FocusModeSelectors.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0000\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\u0006\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\u0007\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\b\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\n\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\u000b\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005*<\u0010\f\"\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0002\b\u00052\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0002\b\u0005¨\u0006\r"}, d2 = {"autoFocus", "Lkotlin/Function1;", "", "Lio/fotoapparat/parameter/FocusMode;", "Lio/fotoapparat/selector/FocusModeSelector;", "Lkotlin/ExtensionFunctionType;", "continuousFocusPicture", "continuousFocusVideo", "edof", "fixed", "infinity", "macro", "FocusModeSelector", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class FocusModeSelectorsKt {
    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.FocusMode>, io.fotoapparat.parameter.FocusMode> fixed() {
        return io.fotoapparat.selector.SelectorsKt.single(io.fotoapparat.parameter.FocusMode.Fixed.INSTANCE);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.FocusMode>, io.fotoapparat.parameter.FocusMode> infinity() {
        return io.fotoapparat.selector.SelectorsKt.single(io.fotoapparat.parameter.FocusMode.Infinity.INSTANCE);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.FocusMode>, io.fotoapparat.parameter.FocusMode> macro() {
        return io.fotoapparat.selector.SelectorsKt.single(io.fotoapparat.parameter.FocusMode.Macro.INSTANCE);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.FocusMode>, io.fotoapparat.parameter.FocusMode> autoFocus() {
        return io.fotoapparat.selector.SelectorsKt.single(io.fotoapparat.parameter.FocusMode.Auto.INSTANCE);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.FocusMode>, io.fotoapparat.parameter.FocusMode> continuousFocusPicture() {
        return io.fotoapparat.selector.SelectorsKt.single(io.fotoapparat.parameter.FocusMode.ContinuousFocusPicture.INSTANCE);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.FocusMode>, io.fotoapparat.parameter.FocusMode> continuousFocusVideo() {
        return io.fotoapparat.selector.SelectorsKt.single(io.fotoapparat.parameter.FocusMode.ContinuousFocusVideo.INSTANCE);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.FocusMode>, io.fotoapparat.parameter.FocusMode> edof() {
        return io.fotoapparat.selector.SelectorsKt.single(io.fotoapparat.parameter.FocusMode.Edof.INSTANCE);
    }
}
