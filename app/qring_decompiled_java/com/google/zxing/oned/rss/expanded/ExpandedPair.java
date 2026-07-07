package com.google.zxing.oned.rss.expanded;

/* loaded from: /tmp/dex/classes2.dex */
final class ExpandedPair {
    private final com.google.zxing.oned.rss.FinderPattern finderPattern;
    private final com.google.zxing.oned.rss.DataCharacter leftChar;
    private final boolean mayBeLast;
    private final com.google.zxing.oned.rss.DataCharacter rightChar;

    ExpandedPair(com.google.zxing.oned.rss.DataCharacter dataCharacter, com.google.zxing.oned.rss.DataCharacter dataCharacter2, com.google.zxing.oned.rss.FinderPattern finderPattern, boolean z) {
        this.leftChar = dataCharacter;
        this.rightChar = dataCharacter2;
        this.finderPattern = finderPattern;
        this.mayBeLast = z;
    }

    boolean mayBeLast() {
        return this.mayBeLast;
    }

    com.google.zxing.oned.rss.DataCharacter getLeftChar() {
        return this.leftChar;
    }

    com.google.zxing.oned.rss.DataCharacter getRightChar() {
        return this.rightChar;
    }

    com.google.zxing.oned.rss.FinderPattern getFinderPattern() {
        return this.finderPattern;
    }

    public boolean mustBeLast() {
        return this.rightChar == null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[ ");
        sb.append(this.leftChar);
        sb.append(" , ");
        sb.append(this.rightChar);
        sb.append(" : ");
        com.google.zxing.oned.rss.FinderPattern finderPattern = this.finderPattern;
        sb.append(finderPattern == null ? "null" : java.lang.Integer.valueOf(finderPattern.getValue()));
        sb.append(" ]");
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.zxing.oned.rss.expanded.ExpandedPair)) {
            return false;
        }
        com.google.zxing.oned.rss.expanded.ExpandedPair expandedPair = (com.google.zxing.oned.rss.expanded.ExpandedPair) obj;
        return equalsOrNull(this.leftChar, expandedPair.leftChar) && equalsOrNull(this.rightChar, expandedPair.rightChar) && equalsOrNull(this.finderPattern, expandedPair.finderPattern);
    }

    private static boolean equalsOrNull(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public int hashCode() {
        return (hashNotNull(this.leftChar) ^ hashNotNull(this.rightChar)) ^ hashNotNull(this.finderPattern);
    }

    private static int hashNotNull(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
