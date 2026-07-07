package com.google.zxing.oned.rss.expanded;

/* loaded from: /tmp/dex/classes2.dex */
final class ExpandedRow {
    private final java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> pairs;
    private final int rowNumber;
    private final boolean wasReversed;

    ExpandedRow(java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> list, int i, boolean z) {
        this.pairs = new java.util.ArrayList(list);
        this.rowNumber = i;
        this.wasReversed = z;
    }

    java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> getPairs() {
        return this.pairs;
    }

    int getRowNumber() {
        return this.rowNumber;
    }

    boolean isReversed() {
        return this.wasReversed;
    }

    boolean isEquivalent(java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> list) {
        return this.pairs.equals(list);
    }

    public java.lang.String toString() {
        return "{ " + this.pairs + " }";
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.zxing.oned.rss.expanded.ExpandedRow)) {
            return false;
        }
        com.google.zxing.oned.rss.expanded.ExpandedRow expandedRow = (com.google.zxing.oned.rss.expanded.ExpandedRow) obj;
        return this.pairs.equals(expandedRow.getPairs()) && this.wasReversed == expandedRow.wasReversed;
    }

    public int hashCode() {
        return this.pairs.hashCode() ^ java.lang.Boolean.valueOf(this.wasReversed).hashCode();
    }
}
