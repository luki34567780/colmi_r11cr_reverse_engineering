package io.fotoapparat.selector;

/* compiled from: ResolutionSelectors.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a#\u0010\u0006\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005*<\u0010\u0007\"\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0002\b\u00052\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0002\b\u0005¨\u0006\b"}, d2 = {"highestResolution", "Lkotlin/Function1;", "", "Lio/fotoapparat/parameter/Resolution;", "Lio/fotoapparat/selector/ResolutionSelector;", "Lkotlin/ExtensionFunctionType;", "lowestResolution", "ResolutionSelector", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class ResolutionSelectorsKt {
    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.Resolution>, io.fotoapparat.parameter.Resolution> highestResolution() {
        return new kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.Resolution>, io.fotoapparat.parameter.Resolution>() { // from class: io.fotoapparat.selector.ResolutionSelectorsKt$highestResolution$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ io.fotoapparat.parameter.Resolution invoke(java.lang.Iterable<? extends io.fotoapparat.parameter.Resolution> iterable) {
                return invoke2((java.lang.Iterable<io.fotoapparat.parameter.Resolution>) iterable);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final io.fotoapparat.parameter.Resolution invoke2(java.lang.Iterable<io.fotoapparat.parameter.Resolution> receiver$0) {
                io.fotoapparat.parameter.Resolution resolution;
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
                java.util.Iterator<io.fotoapparat.parameter.Resolution> it = receiver$0.iterator();
                if (it.hasNext()) {
                    io.fotoapparat.parameter.Resolution next = it.next();
                    int area = next.getArea();
                    while (it.hasNext()) {
                        io.fotoapparat.parameter.Resolution next2 = it.next();
                        int area2 = next2.getArea();
                        if (area < area2) {
                            next = next2;
                            area = area2;
                        }
                    }
                    resolution = next;
                } else {
                    resolution = null;
                }
                return resolution;
            }
        };
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Iterable<io.fotoapparat.parameter.Resolution>, io.fotoapparat.parameter.Resolution> lowestResolution() {
        return new kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.parameter.Resolution>, io.fotoapparat.parameter.Resolution>() { // from class: io.fotoapparat.selector.ResolutionSelectorsKt$lowestResolution$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ io.fotoapparat.parameter.Resolution invoke(java.lang.Iterable<? extends io.fotoapparat.parameter.Resolution> iterable) {
                return invoke2((java.lang.Iterable<io.fotoapparat.parameter.Resolution>) iterable);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final io.fotoapparat.parameter.Resolution invoke2(java.lang.Iterable<io.fotoapparat.parameter.Resolution> receiver$0) {
                io.fotoapparat.parameter.Resolution resolution;
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
                java.util.Iterator<io.fotoapparat.parameter.Resolution> it = receiver$0.iterator();
                if (it.hasNext()) {
                    io.fotoapparat.parameter.Resolution next = it.next();
                    int area = next.getArea();
                    while (it.hasNext()) {
                        io.fotoapparat.parameter.Resolution next2 = it.next();
                        int area2 = next2.getArea();
                        if (area > area2) {
                            next = next2;
                            area = area2;
                        }
                    }
                    resolution = next;
                } else {
                    resolution = null;
                }
                return resolution;
            }
        };
    }
}
