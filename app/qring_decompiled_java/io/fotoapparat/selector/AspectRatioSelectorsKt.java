package io.fotoapparat.selector;

/* compiled from: AspectRatioSelectors.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\\\u0010\u0002\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006¢\u0006\u0002\b\u00072\u0006\u0010\u0002\u001a\u00020\b2#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006¢\u0006\u0002\b\u00072\b\b\u0003\u0010\n\u001a\u00020\u0001H\u0007\u001aT\u0010\u000b\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006¢\u0006\u0002\b\u00072#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006¢\u0006\u0002\b\u00072\b\b\u0003\u0010\n\u001a\u00020\u0001H\u0007\u001aT\u0010\f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006¢\u0006\u0002\b\u00072#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006¢\u0006\u0002\b\u00072\b\b\u0003\u0010\n\u001a\u00020\u0001H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"ASPECT_RATIO_EPSILON", "", "aspectRatio", "Lkotlin/Function1;", "", "Lio/fotoapparat/parameter/Resolution;", "Lio/fotoapparat/selector/ResolutionSelector;", "Lkotlin/ExtensionFunctionType;", "", "selector", "tolerance", "standardRatio", "wideRatio", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class AspectRatioSelectorsKt {
    private static final double ASPECT_RATIO_EPSILON = 1.0E-4d;

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.Resolution>, io.fotoapparat.parameter.Resolution> aspectRatio(float f, kotlin.jvm.functions.Function1<? super java.lang.Iterable<io.fotoapparat.parameter.Resolution>, io.fotoapparat.parameter.Resolution> function1) {
        return aspectRatio$default(f, function1, 0.0d, 4, null);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.Resolution>, io.fotoapparat.parameter.Resolution> standardRatio(kotlin.jvm.functions.Function1<? super java.lang.Iterable<io.fotoapparat.parameter.Resolution>, io.fotoapparat.parameter.Resolution> function1) {
        return standardRatio$default(function1, 0.0d, 2, null);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.Resolution>, io.fotoapparat.parameter.Resolution> wideRatio(kotlin.jvm.functions.Function1<? super java.lang.Iterable<io.fotoapparat.parameter.Resolution>, io.fotoapparat.parameter.Resolution> function1) {
        return wideRatio$default(function1, 0.0d, 2, null);
    }

    public static /* synthetic */ kotlin.jvm.functions.Function1 standardRatio$default(kotlin.jvm.functions.Function1 function1, double d, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            d = 0.0d;
        }
        return standardRatio(function1, d);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.Resolution>, io.fotoapparat.parameter.Resolution> standardRatio(kotlin.jvm.functions.Function1<? super java.lang.Iterable<io.fotoapparat.parameter.Resolution>, io.fotoapparat.parameter.Resolution> selector, double d) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(selector, "selector");
        return aspectRatio(1.3333334f, selector, d);
    }

    public static /* synthetic */ kotlin.jvm.functions.Function1 wideRatio$default(kotlin.jvm.functions.Function1 function1, double d, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            d = 0.0d;
        }
        return wideRatio(function1, d);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.Resolution>, io.fotoapparat.parameter.Resolution> wideRatio(kotlin.jvm.functions.Function1<? super java.lang.Iterable<io.fotoapparat.parameter.Resolution>, io.fotoapparat.parameter.Resolution> selector, double d) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(selector, "selector");
        return aspectRatio(1.7777778f, selector, d);
    }

    public static /* synthetic */ kotlin.jvm.functions.Function1 aspectRatio$default(float f, kotlin.jvm.functions.Function1 function1, double d, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            d = 0.0d;
        }
        return aspectRatio(f, function1, d);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.Resolution>, io.fotoapparat.parameter.Resolution> aspectRatio(final float f, kotlin.jvm.functions.Function1<? super java.lang.Iterable<io.fotoapparat.parameter.Resolution>, io.fotoapparat.parameter.Resolution> selector, double d) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(selector, "selector");
        if (d < 0.0d || d > 1.0d) {
            throw new java.lang.IllegalArgumentException("Tolerance must be between 0.0 and 1.0.");
        }
        final double d2 = (f * d) + 1.0E-4d;
        return io.fotoapparat.selector.SelectorsKt.filtered(selector, new kotlin.jvm.functions.Function1<io.fotoapparat.parameter.Resolution, java.lang.Boolean>() { // from class: io.fotoapparat.selector.AspectRatioSelectorsKt$aspectRatio$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(io.fotoapparat.parameter.Resolution resolution) {
                return java.lang.Boolean.valueOf(invoke2(resolution));
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(io.fotoapparat.parameter.Resolution it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return ((double) java.lang.Math.abs(f - it.getAspectRatio())) <= d2;
            }
        });
    }
}
