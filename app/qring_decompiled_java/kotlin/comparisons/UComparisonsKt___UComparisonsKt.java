package kotlin.comparisons;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _UComparisons.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a&\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\n\u0010\t\u001a\u00020\u0012\"\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u001a\"\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\"\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a&\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\n\u0010\t\u001a\u00020\"\"\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\"\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0005\u001a+\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\b\u001a&\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010\f\u001a\"\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010\u000f\u001a+\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0011\u001a&\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\n\u0010\t\u001a\u00020\u0012\"\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0014\u001a\"\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010\u0017\u001a+\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\bø\u0001\u0000¢\u0006\u0004\b-\u0010\u0019\u001a&\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u001a\"\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010\u001c\u001a\"\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u001f\u001a+\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b0\u0010!\u001a&\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\n\u0010\t\u001a\u00020\"\"\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"maxOf", "Lkotlin/UByte;", "a", "b", "maxOf-Kr8caGY", "(BB)B", "c", "maxOf-b33U2AM", "(BBB)B", com.google.android.gms.fitness.FitnessActivities.OTHER, "Lkotlin/UByteArray;", "maxOf-Wr6uiD8", "(B[B)B", "Lkotlin/UInt;", "maxOf-J1ME1BU", "(II)I", "maxOf-WZ9TVnA", "(III)I", "Lkotlin/UIntArray;", "maxOf-Md2H83M", "(I[I)I", "Lkotlin/ULong;", "maxOf-eb3DHEI", "(JJ)J", "maxOf-sambcqE", "(JJJ)J", "Lkotlin/ULongArray;", "maxOf-R03FKyM", "(J[J)J", "Lkotlin/UShort;", "maxOf-5PvTz6A", "(SS)S", "maxOf-VKSA0NQ", "(SSS)S", "Lkotlin/UShortArray;", "maxOf-t1qELG4", "(S[S)S", "minOf", "minOf-Kr8caGY", "minOf-b33U2AM", "minOf-Wr6uiD8", "minOf-J1ME1BU", "minOf-WZ9TVnA", "minOf-Md2H83M", "minOf-eb3DHEI", "minOf-sambcqE", "minOf-R03FKyM", "minOf-5PvTz6A", "minOf-VKSA0NQ", "minOf-t1qELG4", "kotlin-stdlib"}, k = 5, mv = {1, 6, 0}, xi = 49, xs = "kotlin/comparisons/UComparisonsKt")
/* loaded from: classes3.dex */
public class UComparisonsKt___UComparisonsKt {
    /* renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static final int m2255maxOfJ1ME1BU(int i, int i2) {
        return kotlin.UnsignedKt.uintCompare(i, i2) >= 0 ? i : i2;
    }

    /* renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static final long m2263maxOfeb3DHEI(long j, long j2) {
        return kotlin.UnsignedKt.ulongCompare(j, j2) >= 0 ? j : j2;
    }

    /* renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m2256maxOfKr8caGY(byte b, byte b2) {
        return kotlin.jvm.internal.Intrinsics.compare(b & 255, b2 & 255) >= 0 ? b : b2;
    }

    /* renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m2254maxOf5PvTz6A(short s, short s2) {
        return kotlin.jvm.internal.Intrinsics.compare(s & 65535, 65535 & s2) >= 0 ? s : s2;
    }

    /* renamed from: maxOf-WZ9TVnA, reason: not valid java name */
    private static final int m2260maxOfWZ9TVnA(int i, int i2, int i3) {
        return kotlin.comparisons.UComparisonsKt.m2255maxOfJ1ME1BU(i, kotlin.comparisons.UComparisonsKt.m2255maxOfJ1ME1BU(i2, i3));
    }

    /* renamed from: maxOf-sambcqE, reason: not valid java name */
    private static final long m2264maxOfsambcqE(long j, long j2, long j3) {
        return kotlin.comparisons.UComparisonsKt.m2263maxOfeb3DHEI(j, kotlin.comparisons.UComparisonsKt.m2263maxOfeb3DHEI(j2, j3));
    }

    /* renamed from: maxOf-b33U2AM, reason: not valid java name */
    private static final byte m2262maxOfb33U2AM(byte b, byte b2, byte b3) {
        return kotlin.comparisons.UComparisonsKt.m2256maxOfKr8caGY(b, kotlin.comparisons.UComparisonsKt.m2256maxOfKr8caGY(b2, b3));
    }

    /* renamed from: maxOf-VKSA0NQ, reason: not valid java name */
    private static final short m2259maxOfVKSA0NQ(short s, short s2, short s3) {
        return kotlin.comparisons.UComparisonsKt.m2254maxOf5PvTz6A(s, kotlin.comparisons.UComparisonsKt.m2254maxOf5PvTz6A(s2, s3));
    }

    /* renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m2257maxOfMd2H83M(int i, int... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int m1245getSizeimpl = kotlin.UIntArray.m1245getSizeimpl(other);
        for (int i2 = 0; i2 < m1245getSizeimpl; i2++) {
            i = kotlin.comparisons.UComparisonsKt.m2255maxOfJ1ME1BU(i, kotlin.UIntArray.m1244getpVg5ArA(other, i2));
        }
        return i;
    }

    /* renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m2258maxOfR03FKyM(long j, long... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int m1323getSizeimpl = kotlin.ULongArray.m1323getSizeimpl(other);
        for (int i = 0; i < m1323getSizeimpl; i++) {
            j = kotlin.comparisons.UComparisonsKt.m2263maxOfeb3DHEI(j, kotlin.ULongArray.m1322getsVKNKU(other, i));
        }
        return j;
    }

    /* renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m2261maxOfWr6uiD8(byte b, byte... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int m1167getSizeimpl = kotlin.UByteArray.m1167getSizeimpl(other);
        for (int i = 0; i < m1167getSizeimpl; i++) {
            b = kotlin.comparisons.UComparisonsKt.m2256maxOfKr8caGY(b, kotlin.UByteArray.m1166getw2LRezQ(other, i));
        }
        return b;
    }

    /* renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m2265maxOft1qELG4(short s, short... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int m1427getSizeimpl = kotlin.UShortArray.m1427getSizeimpl(other);
        for (int i = 0; i < m1427getSizeimpl; i++) {
            s = kotlin.comparisons.UComparisonsKt.m2254maxOf5PvTz6A(s, kotlin.UShortArray.m1426getMh2AYeg(other, i));
        }
        return s;
    }

    /* renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static final int m2267minOfJ1ME1BU(int i, int i2) {
        return kotlin.UnsignedKt.uintCompare(i, i2) <= 0 ? i : i2;
    }

    /* renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static final long m2275minOfeb3DHEI(long j, long j2) {
        return kotlin.UnsignedKt.ulongCompare(j, j2) <= 0 ? j : j2;
    }

    /* renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m2268minOfKr8caGY(byte b, byte b2) {
        return kotlin.jvm.internal.Intrinsics.compare(b & 255, b2 & 255) <= 0 ? b : b2;
    }

    /* renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m2266minOf5PvTz6A(short s, short s2) {
        return kotlin.jvm.internal.Intrinsics.compare(s & 65535, 65535 & s2) <= 0 ? s : s2;
    }

    /* renamed from: minOf-WZ9TVnA, reason: not valid java name */
    private static final int m2272minOfWZ9TVnA(int i, int i2, int i3) {
        return kotlin.comparisons.UComparisonsKt.m2267minOfJ1ME1BU(i, kotlin.comparisons.UComparisonsKt.m2267minOfJ1ME1BU(i2, i3));
    }

    /* renamed from: minOf-sambcqE, reason: not valid java name */
    private static final long m2276minOfsambcqE(long j, long j2, long j3) {
        return kotlin.comparisons.UComparisonsKt.m2275minOfeb3DHEI(j, kotlin.comparisons.UComparisonsKt.m2275minOfeb3DHEI(j2, j3));
    }

    /* renamed from: minOf-b33U2AM, reason: not valid java name */
    private static final byte m2274minOfb33U2AM(byte b, byte b2, byte b3) {
        return kotlin.comparisons.UComparisonsKt.m2268minOfKr8caGY(b, kotlin.comparisons.UComparisonsKt.m2268minOfKr8caGY(b2, b3));
    }

    /* renamed from: minOf-VKSA0NQ, reason: not valid java name */
    private static final short m2271minOfVKSA0NQ(short s, short s2, short s3) {
        return kotlin.comparisons.UComparisonsKt.m2266minOf5PvTz6A(s, kotlin.comparisons.UComparisonsKt.m2266minOf5PvTz6A(s2, s3));
    }

    /* renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m2269minOfMd2H83M(int i, int... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int m1245getSizeimpl = kotlin.UIntArray.m1245getSizeimpl(other);
        for (int i2 = 0; i2 < m1245getSizeimpl; i2++) {
            i = kotlin.comparisons.UComparisonsKt.m2267minOfJ1ME1BU(i, kotlin.UIntArray.m1244getpVg5ArA(other, i2));
        }
        return i;
    }

    /* renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m2270minOfR03FKyM(long j, long... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int m1323getSizeimpl = kotlin.ULongArray.m1323getSizeimpl(other);
        for (int i = 0; i < m1323getSizeimpl; i++) {
            j = kotlin.comparisons.UComparisonsKt.m2275minOfeb3DHEI(j, kotlin.ULongArray.m1322getsVKNKU(other, i));
        }
        return j;
    }

    /* renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m2273minOfWr6uiD8(byte b, byte... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int m1167getSizeimpl = kotlin.UByteArray.m1167getSizeimpl(other);
        for (int i = 0; i < m1167getSizeimpl; i++) {
            b = kotlin.comparisons.UComparisonsKt.m2268minOfKr8caGY(b, kotlin.UByteArray.m1166getw2LRezQ(other, i));
        }
        return b;
    }

    /* renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m2277minOft1qELG4(short s, short... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int m1427getSizeimpl = kotlin.UShortArray.m1427getSizeimpl(other);
        for (int i = 0; i < m1427getSizeimpl; i++) {
            s = kotlin.comparisons.UComparisonsKt.m2266minOf5PvTz6A(s, kotlin.UShortArray.m1426getMh2AYeg(other, i));
        }
        return s;
    }
}
