package com.google.zxing.oned.rss;

/* loaded from: /tmp/dex/classes2.dex */
public final class FinderPattern {
    private final com.google.zxing.ResultPoint[] resultPoints;
    private final int[] startEnd;
    private final int value;

    public FinderPattern(int i, int[] iArr, int i2, int i3, int i4) {
        this.value = i;
        this.startEnd = iArr;
        float f = i4;
        this.resultPoints = new com.google.zxing.ResultPoint[]{new com.google.zxing.ResultPoint(i2, f), new com.google.zxing.ResultPoint(i3, f)};
    }

    public int getValue() {
        return this.value;
    }

    public int[] getStartEnd() {
        return this.startEnd;
    }

    public com.google.zxing.ResultPoint[] getResultPoints() {
        return this.resultPoints;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.zxing.oned.rss.FinderPattern) && this.value == ((com.google.zxing.oned.rss.FinderPattern) obj).value;
    }

    public int hashCode() {
        return this.value;
    }
}
