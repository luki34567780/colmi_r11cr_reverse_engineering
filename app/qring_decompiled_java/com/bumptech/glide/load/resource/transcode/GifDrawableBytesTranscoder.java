package com.bumptech.glide.load.resource.transcode;

/* loaded from: /tmp/dex/classes2.dex */
public class GifDrawableBytesTranscoder implements com.bumptech.glide.load.resource.transcode.ResourceTranscoder<com.bumptech.glide.load.resource.gif.GifDrawable, byte[]> {
    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public com.bumptech.glide.load.engine.Resource<byte[]> transcode(com.bumptech.glide.load.engine.Resource<com.bumptech.glide.load.resource.gif.GifDrawable> resource, com.bumptech.glide.load.Options options) {
        return new com.bumptech.glide.load.resource.bytes.BytesResource(com.bumptech.glide.util.ByteBufferUtil.toBytes(((com.bumptech.glide.load.resource.gif.GifDrawable) resource.get()).getBuffer()));
    }
}
