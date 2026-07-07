package kotlin.collections;

/* compiled from: UArraySorting.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UArraySortingKt {
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m1539partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte m1166getw2LRezQ = kotlin.UByteArray.m1166getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = m1166getw2LRezQ & 255;
                if (kotlin.jvm.internal.Intrinsics.compare(kotlin.UByteArray.m1166getw2LRezQ(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (kotlin.jvm.internal.Intrinsics.compare(kotlin.UByteArray.m1166getw2LRezQ(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte m1166getw2LRezQ2 = kotlin.UByteArray.m1166getw2LRezQ(bArr, i);
                kotlin.UByteArray.m1171setVurrAj0(bArr, i, kotlin.UByteArray.m1166getw2LRezQ(bArr, i2));
                kotlin.UByteArray.m1171setVurrAj0(bArr, i2, m1166getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m1543quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int m1539partition4UcCI2c = m1539partition4UcCI2c(bArr, i, i2);
        int i3 = m1539partition4UcCI2c - 1;
        if (i < i3) {
            m1543quickSort4UcCI2c(bArr, i, i3);
        }
        if (m1539partition4UcCI2c < i2) {
            m1543quickSort4UcCI2c(bArr, m1539partition4UcCI2c, i2);
        }
    }

    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m1540partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short m1426getMh2AYeg = kotlin.UShortArray.m1426getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = m1426getMh2AYeg & 65535;
                if (kotlin.jvm.internal.Intrinsics.compare(kotlin.UShortArray.m1426getMh2AYeg(sArr, i) & 65535, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (kotlin.jvm.internal.Intrinsics.compare(kotlin.UShortArray.m1426getMh2AYeg(sArr, i2) & 65535, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short m1426getMh2AYeg2 = kotlin.UShortArray.m1426getMh2AYeg(sArr, i);
                kotlin.UShortArray.m1431set01HTLdE(sArr, i, kotlin.UShortArray.m1426getMh2AYeg(sArr, i2));
                kotlin.UShortArray.m1431set01HTLdE(sArr, i2, m1426getMh2AYeg2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m1544quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int m1540partitionAa5vz7o = m1540partitionAa5vz7o(sArr, i, i2);
        int i3 = m1540partitionAa5vz7o - 1;
        if (i < i3) {
            m1544quickSortAa5vz7o(sArr, i, i3);
        }
        if (m1540partitionAa5vz7o < i2) {
            m1544quickSortAa5vz7o(sArr, m1540partitionAa5vz7o, i2);
        }
    }

    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m1541partitionoBK06Vg(int[] iArr, int i, int i2) {
        int m1244getpVg5ArA = kotlin.UIntArray.m1244getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (kotlin.UnsignedKt.uintCompare(kotlin.UIntArray.m1244getpVg5ArA(iArr, i), m1244getpVg5ArA) < 0) {
                i++;
            }
            while (kotlin.UnsignedKt.uintCompare(kotlin.UIntArray.m1244getpVg5ArA(iArr, i2), m1244getpVg5ArA) > 0) {
                i2--;
            }
            if (i <= i2) {
                int m1244getpVg5ArA2 = kotlin.UIntArray.m1244getpVg5ArA(iArr, i);
                kotlin.UIntArray.m1249setVXSXFK8(iArr, i, kotlin.UIntArray.m1244getpVg5ArA(iArr, i2));
                kotlin.UIntArray.m1249setVXSXFK8(iArr, i2, m1244getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m1545quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int m1541partitionoBK06Vg = m1541partitionoBK06Vg(iArr, i, i2);
        int i3 = m1541partitionoBK06Vg - 1;
        if (i < i3) {
            m1545quickSortoBK06Vg(iArr, i, i3);
        }
        if (m1541partitionoBK06Vg < i2) {
            m1545quickSortoBK06Vg(iArr, m1541partitionoBK06Vg, i2);
        }
    }

    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m1538partitionnroSd4(long[] jArr, int i, int i2) {
        long m1322getsVKNKU = kotlin.ULongArray.m1322getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (kotlin.UnsignedKt.ulongCompare(kotlin.ULongArray.m1322getsVKNKU(jArr, i), m1322getsVKNKU) < 0) {
                i++;
            }
            while (kotlin.UnsignedKt.ulongCompare(kotlin.ULongArray.m1322getsVKNKU(jArr, i2), m1322getsVKNKU) > 0) {
                i2--;
            }
            if (i <= i2) {
                long m1322getsVKNKU2 = kotlin.ULongArray.m1322getsVKNKU(jArr, i);
                kotlin.ULongArray.m1327setk8EXiF4(jArr, i, kotlin.ULongArray.m1322getsVKNKU(jArr, i2));
                kotlin.ULongArray.m1327setk8EXiF4(jArr, i2, m1322getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m1542quickSortnroSd4(long[] jArr, int i, int i2) {
        int m1538partitionnroSd4 = m1538partitionnroSd4(jArr, i, i2);
        int i3 = m1538partitionnroSd4 - 1;
        if (i < i3) {
            m1542quickSortnroSd4(jArr, i, i3);
        }
        if (m1538partitionnroSd4 < i2) {
            m1542quickSortnroSd4(jArr, m1538partitionnroSd4, i2);
        }
    }

    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m1547sortArray4UcCI2c(byte[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        m1543quickSort4UcCI2c(array, i, i2 - 1);
    }

    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m1548sortArrayAa5vz7o(short[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        m1544quickSortAa5vz7o(array, i, i2 - 1);
    }

    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m1549sortArrayoBK06Vg(int[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        m1545quickSortoBK06Vg(array, i, i2 - 1);
    }

    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m1546sortArraynroSd4(long[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        m1542quickSortnroSd4(array, i, i2 - 1);
    }
}
