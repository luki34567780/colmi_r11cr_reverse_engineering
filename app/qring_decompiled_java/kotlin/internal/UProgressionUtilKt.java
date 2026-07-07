package kotlin.internal;

/* compiled from: UProgressionUtil.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u001a*\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m2279differenceModuloWZ9TVnA(int i, int i2, int i3) {
        int m1439uintRemainderJ1ME1BU = kotlin.UnsignedKt.m1439uintRemainderJ1ME1BU(i, i3);
        int m1439uintRemainderJ1ME1BU2 = kotlin.UnsignedKt.m1439uintRemainderJ1ME1BU(i2, i3);
        int uintCompare = kotlin.UnsignedKt.uintCompare(m1439uintRemainderJ1ME1BU, m1439uintRemainderJ1ME1BU2);
        int m1185constructorimpl = kotlin.UInt.m1185constructorimpl(m1439uintRemainderJ1ME1BU - m1439uintRemainderJ1ME1BU2);
        return uintCompare >= 0 ? m1185constructorimpl : kotlin.UInt.m1185constructorimpl(m1185constructorimpl + i3);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m2280differenceModulosambcqE(long j, long j2, long j3) {
        long m1441ulongRemaindereb3DHEI = kotlin.UnsignedKt.m1441ulongRemaindereb3DHEI(j, j3);
        long m1441ulongRemaindereb3DHEI2 = kotlin.UnsignedKt.m1441ulongRemaindereb3DHEI(j2, j3);
        int ulongCompare = kotlin.UnsignedKt.ulongCompare(m1441ulongRemaindereb3DHEI, m1441ulongRemaindereb3DHEI2);
        long m1263constructorimpl = kotlin.ULong.m1263constructorimpl(m1441ulongRemaindereb3DHEI - m1441ulongRemaindereb3DHEI2);
        return ulongCompare >= 0 ? m1263constructorimpl : kotlin.ULong.m1263constructorimpl(m1263constructorimpl + j3);
    }

    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m2282getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        if (i3 > 0) {
            return kotlin.UnsignedKt.uintCompare(i, i2) >= 0 ? i2 : kotlin.UInt.m1185constructorimpl(i2 - m2279differenceModuloWZ9TVnA(i2, i, kotlin.UInt.m1185constructorimpl(i3)));
        }
        if (i3 < 0) {
            return kotlin.UnsignedKt.uintCompare(i, i2) <= 0 ? i2 : kotlin.UInt.m1185constructorimpl(i2 + m2279differenceModuloWZ9TVnA(i, i2, kotlin.UInt.m1185constructorimpl(-i3)));
        }
        throw new java.lang.IllegalArgumentException("Step is zero.");
    }

    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m2281getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        if (j3 > 0) {
            return kotlin.UnsignedKt.ulongCompare(j, j2) >= 0 ? j2 : kotlin.ULong.m1263constructorimpl(j2 - m2280differenceModulosambcqE(j2, j, kotlin.ULong.m1263constructorimpl(j3)));
        }
        if (j3 < 0) {
            return kotlin.UnsignedKt.ulongCompare(j, j2) <= 0 ? j2 : kotlin.ULong.m1263constructorimpl(j2 + m2280differenceModulosambcqE(j, j2, kotlin.ULong.m1263constructorimpl(-j3)));
        }
        throw new java.lang.IllegalArgumentException("Step is zero.");
    }
}
