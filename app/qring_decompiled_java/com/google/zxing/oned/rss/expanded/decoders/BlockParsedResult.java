package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: /tmp/dex/classes2.dex */
final class BlockParsedResult {
    private final com.google.zxing.oned.rss.expanded.decoders.DecodedInformation decodedInformation;
    private final boolean finished;

    BlockParsedResult(boolean z) {
        this(null, z);
    }

    BlockParsedResult(com.google.zxing.oned.rss.expanded.decoders.DecodedInformation decodedInformation, boolean z) {
        this.finished = z;
        this.decodedInformation = decodedInformation;
    }

    com.google.zxing.oned.rss.expanded.decoders.DecodedInformation getDecodedInformation() {
        return this.decodedInformation;
    }

    boolean isFinished() {
        return this.finished;
    }
}
