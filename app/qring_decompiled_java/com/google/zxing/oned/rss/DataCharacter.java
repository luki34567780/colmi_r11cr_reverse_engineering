package com.google.zxing.oned.rss;

/* loaded from: /tmp/dex/classes2.dex */
public class DataCharacter {
    private final int checksumPortion;
    private final int value;

    public DataCharacter(int i, int i2) {
        this.value = i;
        this.checksumPortion = i2;
    }

    public final int getValue() {
        return this.value;
    }

    public final int getChecksumPortion() {
        return this.checksumPortion;
    }

    public final java.lang.String toString() {
        return this.value + "(" + this.checksumPortion + ')';
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.zxing.oned.rss.DataCharacter)) {
            return false;
        }
        com.google.zxing.oned.rss.DataCharacter dataCharacter = (com.google.zxing.oned.rss.DataCharacter) obj;
        return this.value == dataCharacter.value && this.checksumPortion == dataCharacter.checksumPortion;
    }

    public final int hashCode() {
        return this.value ^ this.checksumPortion;
    }
}
