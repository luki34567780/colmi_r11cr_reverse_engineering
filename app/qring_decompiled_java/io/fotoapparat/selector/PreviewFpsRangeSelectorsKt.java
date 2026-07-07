package io.fotoapparat.selector;

/* compiled from: PreviewFpsRangeSelectors.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a+\u0010\b\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\n\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\u000b\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a%\u0010\f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005H\u0002\u001a#\u0010\r\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\u000e\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\u000f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a%\u0010\u0010\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005H\u0002\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0007H\u0002*<\u0010\u0013\"\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0002\b\u00052\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0002\b\u0005¨\u0006\u0014"}, d2 = {"containsFps", "Lkotlin/Function1;", "", "Lio/fotoapparat/parameter/FpsRange;", "Lio/fotoapparat/selector/FpsRangeSelector;", "Lkotlin/ExtensionFunctionType;", "fps", "", "exactFixedFps", "highestFixedFps", "highestFps", "highestNonFixedFps", "highestRangeFps", "lowestFixedFps", "lowestFps", "lowestNonFixedFps", "lowestRangeFps", "toFpsIntRepresentation", "", "FpsRangeSelector", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class PreviewFpsRangeSelectorsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int toFpsIntRepresentation(float f) {
        return (int) (f * 1000);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.FpsRange>, io.fotoapparat.parameter.FpsRange> containsFps(final float f) {
        return io.fotoapparat.selector.SelectorsKt.firstAvailable(exactFixedFps(f), io.fotoapparat.selector.SelectorsKt.filtered(highestNonFixedFps(), new kotlin.jvm.functions.Function1<io.fotoapparat.parameter.FpsRange, java.lang.Boolean>() { // from class: io.fotoapparat.selector.PreviewFpsRangeSelectorsKt$containsFps$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(io.fotoapparat.parameter.FpsRange fpsRange) {
                return java.lang.Boolean.valueOf(invoke2(fpsRange));
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(io.fotoapparat.parameter.FpsRange range) {
                int fpsIntRepresentation;
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(range, "range");
                fpsIntRepresentation = io.fotoapparat.selector.PreviewFpsRangeSelectorsKt.toFpsIntRepresentation(f);
                return range.contains(fpsIntRepresentation);
            }
        }));
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.FpsRange>, io.fotoapparat.parameter.FpsRange> exactFixedFps(final float f) {
        return io.fotoapparat.selector.SelectorsKt.filtered(highestFixedFps(), new kotlin.jvm.functions.Function1<io.fotoapparat.parameter.FpsRange, java.lang.Boolean>() { // from class: io.fotoapparat.selector.PreviewFpsRangeSelectorsKt$exactFixedFps$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(io.fotoapparat.parameter.FpsRange fpsRange) {
                return java.lang.Boolean.valueOf(invoke2(fpsRange));
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(io.fotoapparat.parameter.FpsRange it) {
                int fpsIntRepresentation;
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                int min = it.getMin();
                fpsIntRepresentation = io.fotoapparat.selector.PreviewFpsRangeSelectorsKt.toFpsIntRepresentation(f);
                return min == fpsIntRepresentation;
            }
        });
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.FpsRange>, io.fotoapparat.parameter.FpsRange> highestFps() {
        return io.fotoapparat.selector.SelectorsKt.firstAvailable(highestNonFixedFps(), highestFixedFps());
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.FpsRange>, io.fotoapparat.parameter.FpsRange> highestNonFixedFps() {
        return io.fotoapparat.selector.SelectorsKt.filtered(highestRangeFps(), new kotlin.jvm.functions.Function1<io.fotoapparat.parameter.FpsRange, java.lang.Boolean>() { // from class: io.fotoapparat.selector.PreviewFpsRangeSelectorsKt$highestNonFixedFps$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(io.fotoapparat.parameter.FpsRange fpsRange) {
                return java.lang.Boolean.valueOf(invoke2(fpsRange));
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(io.fotoapparat.parameter.FpsRange it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return !it.isFixed();
            }
        });
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.FpsRange>, io.fotoapparat.parameter.FpsRange> highestFixedFps() {
        return io.fotoapparat.selector.SelectorsKt.filtered(highestRangeFps(), new kotlin.jvm.functions.Function1<io.fotoapparat.parameter.FpsRange, java.lang.Boolean>() { // from class: io.fotoapparat.selector.PreviewFpsRangeSelectorsKt$highestFixedFps$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(io.fotoapparat.parameter.FpsRange fpsRange) {
                return java.lang.Boolean.valueOf(invoke2(fpsRange));
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(io.fotoapparat.parameter.FpsRange it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.isFixed();
            }
        });
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.FpsRange>, io.fotoapparat.parameter.FpsRange> lowestFps() {
        return io.fotoapparat.selector.SelectorsKt.firstAvailable(lowestNonFixedFps(), lowestFixedFps());
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.FpsRange>, io.fotoapparat.parameter.FpsRange> lowestNonFixedFps() {
        return io.fotoapparat.selector.SelectorsKt.filtered(lowestRangeFps(), new kotlin.jvm.functions.Function1<io.fotoapparat.parameter.FpsRange, java.lang.Boolean>() { // from class: io.fotoapparat.selector.PreviewFpsRangeSelectorsKt$lowestNonFixedFps$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(io.fotoapparat.parameter.FpsRange fpsRange) {
                return java.lang.Boolean.valueOf(invoke2(fpsRange));
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(io.fotoapparat.parameter.FpsRange it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return !it.isFixed();
            }
        });
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.FpsRange>, io.fotoapparat.parameter.FpsRange> lowestFixedFps() {
        return io.fotoapparat.selector.SelectorsKt.filtered(lowestRangeFps(), new kotlin.jvm.functions.Function1<io.fotoapparat.parameter.FpsRange, java.lang.Boolean>() { // from class: io.fotoapparat.selector.PreviewFpsRangeSelectorsKt$lowestFixedFps$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(io.fotoapparat.parameter.FpsRange fpsRange) {
                return java.lang.Boolean.valueOf(invoke2(fpsRange));
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(io.fotoapparat.parameter.FpsRange it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.isFixed();
            }
        });
    }

    private static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.FpsRange>, io.fotoapparat.parameter.FpsRange> highestRangeFps() {
        return new kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.FpsRange>, io.fotoapparat.parameter.FpsRange>() { // from class: io.fotoapparat.selector.PreviewFpsRangeSelectorsKt$highestRangeFps$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ io.fotoapparat.parameter.FpsRange invoke(java.lang.Iterable<? extends io.fotoapparat.parameter.FpsRange> iterable) {
                return invoke2((java.lang.Iterable<io.fotoapparat.parameter.FpsRange>) iterable);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final io.fotoapparat.parameter.FpsRange invoke2(java.lang.Iterable<io.fotoapparat.parameter.FpsRange> receiver$0) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
                return (io.fotoapparat.parameter.FpsRange) kotlin.collections.CollectionsKt.maxWith(receiver$0, io.fotoapparat.util.CompareFpsRangeByBounds.INSTANCE);
            }
        };
    }

    private static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.FpsRange>, io.fotoapparat.parameter.FpsRange> lowestRangeFps() {
        return new kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.FpsRange>, io.fotoapparat.parameter.FpsRange>() { // from class: io.fotoapparat.selector.PreviewFpsRangeSelectorsKt$lowestRangeFps$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ io.fotoapparat.parameter.FpsRange invoke(java.lang.Iterable<? extends io.fotoapparat.parameter.FpsRange> iterable) {
                return invoke2((java.lang.Iterable<io.fotoapparat.parameter.FpsRange>) iterable);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final io.fotoapparat.parameter.FpsRange invoke2(java.lang.Iterable<io.fotoapparat.parameter.FpsRange> receiver$0) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
                return (io.fotoapparat.parameter.FpsRange) kotlin.collections.CollectionsKt.minWith(receiver$0, io.fotoapparat.util.CompareFpsRangeByBounds.INSTANCE);
            }
        };
    }
}
