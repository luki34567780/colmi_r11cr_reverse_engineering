package com.bumptech.glide.load.resource.transcode;

/* loaded from: /tmp/dex/classes2.dex */
public class UnitTranscoder<Z> implements com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, Z> {
    private static final com.bumptech.glide.load.resource.transcode.UnitTranscoder<?> UNIT_TRANSCODER = new com.bumptech.glide.load.resource.transcode.UnitTranscoder<>();

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public com.bumptech.glide.load.engine.Resource<Z> transcode(com.bumptech.glide.load.engine.Resource<Z> resource, com.bumptech.glide.load.Options options) {
        return resource;
    }

    public static <Z> com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, Z> get() {
        return UNIT_TRANSCODER;
    }
}
