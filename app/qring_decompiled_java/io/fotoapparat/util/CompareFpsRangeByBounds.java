package io.fotoapparat.util;

/* compiled from: CompareFpsRangeByBounds.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lio/fotoapparat/util/CompareFpsRangeByBounds;", "Ljava/util/Comparator;", "Lio/fotoapparat/parameter/FpsRange;", "()V", "compare", "", "fpsRange1", "fpsRange2", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class CompareFpsRangeByBounds implements java.util.Comparator<io.fotoapparat.parameter.FpsRange> {
    public static final io.fotoapparat.util.CompareFpsRangeByBounds INSTANCE = new io.fotoapparat.util.CompareFpsRangeByBounds();

    private CompareFpsRangeByBounds() {
    }

    @Override // java.util.Comparator
    public int compare(io.fotoapparat.parameter.FpsRange fpsRange1, io.fotoapparat.parameter.FpsRange fpsRange2) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fpsRange1, "fpsRange1");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fpsRange2, "fpsRange2");
        int compare = kotlin.jvm.internal.Intrinsics.compare(fpsRange1.getMin(), fpsRange2.getMin());
        return compare != 0 ? compare : kotlin.jvm.internal.Intrinsics.compare(fpsRange1.getMax(), fpsRange2.getMax());
    }
}
