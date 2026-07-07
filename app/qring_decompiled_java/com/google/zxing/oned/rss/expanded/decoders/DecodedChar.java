package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: /tmp/dex/classes2.dex */
final class DecodedChar extends com.google.zxing.oned.rss.expanded.decoders.DecodedObject {
    static final char FNC1 = '$';
    private final char value;

    DecodedChar(int i, char c) {
        super(i);
        this.value = c;
    }

    char getValue() {
        return this.value;
    }

    boolean isFNC1() {
        return this.value == '$';
    }
}
