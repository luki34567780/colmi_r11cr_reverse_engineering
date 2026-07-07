package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: /tmp/dex/classes2.dex */
final class AI013103decoder extends com.google.zxing.oned.rss.expanded.decoders.AI013x0xDecoder {
    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    protected int checkWeight(int i) {
        return i;
    }

    AI013103decoder(com.google.zxing.common.BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder
    protected void addWeightCode(java.lang.StringBuilder sb, int i) {
        sb.append("(3103)");
    }
}
