package org.koin.core.time;

/* compiled from: Measure.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a&\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005¨\u0006\b"}, d2 = {"measureDuration", "Lkotlin/Pair;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "", "code", "Lkotlin/Function0;", "measureDurationOnly", "", "koin-core"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class MeasureKt {
    public static final double measureDurationOnly(kotlin.jvm.functions.Function0<kotlin.Unit> code) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(code, "code");
        long nanoTime = java.lang.System.nanoTime();
        code.invoke();
        return (java.lang.System.nanoTime() - nanoTime) / 1000000.0d;
    }

    public static final <T> kotlin.Pair<T, java.lang.Double> measureDuration(kotlin.jvm.functions.Function0<? extends T> code) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(code, "code");
        return new kotlin.Pair<>(code.invoke(), java.lang.Double.valueOf((java.lang.System.nanoTime() - java.lang.System.nanoTime()) / 1000000.0d));
    }
}
