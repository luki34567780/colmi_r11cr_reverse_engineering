package io.fotoapparat.selector;

/* compiled from: ExposureCompensationSelectors.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0000\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u0005\u001a%\u0010\b\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0002\b\u00052\u0006\u0010\t\u001a\u00020\u0003*0\u0010\n\"\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0002\b\u00052\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0002\b\u0005¨\u0006\u000b"}, d2 = {"defaultExposure", "Lkotlin/Function1;", "Lkotlin/ranges/IntRange;", "", "Lio/fotoapparat/selector/ExposureSelector;", "Lkotlin/ExtensionFunctionType;", "highestExposure", "lowestExposure", "manualExposure", "exposure", "ExposureSelector", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class ExposureCompensationSelectorsKt {
    public static final kotlin.jvm.functions.Function1<kotlin.ranges.IntRange, java.lang.Integer> manualExposure(int i) {
        return io.fotoapparat.selector.SelectorsKt.single(java.lang.Integer.valueOf(i));
    }

    public static final kotlin.jvm.functions.Function1<kotlin.ranges.IntRange, java.lang.Integer> highestExposure() {
        return io.fotoapparat.selector.SelectorsKt.highest();
    }

    public static final kotlin.jvm.functions.Function1<kotlin.ranges.IntRange, java.lang.Integer> lowestExposure() {
        return io.fotoapparat.selector.SelectorsKt.lowest();
    }

    public static final kotlin.jvm.functions.Function1<kotlin.ranges.IntRange, java.lang.Integer> defaultExposure() {
        return io.fotoapparat.selector.SelectorsKt.single(0);
    }
}
