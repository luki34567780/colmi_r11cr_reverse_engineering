package com.bumptech.glide.load.resource.transcode;

/* loaded from: /tmp/dex/classes2.dex */
public class TranscoderRegistry {
    private final java.util.List<com.bumptech.glide.load.resource.transcode.TranscoderRegistry.Entry<?, ?>> transcoders = new java.util.ArrayList();

    public synchronized <Z, R> void register(java.lang.Class<Z> cls, java.lang.Class<R> cls2, com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, R> resourceTranscoder) {
        this.transcoders.add(new com.bumptech.glide.load.resource.transcode.TranscoderRegistry.Entry<>(cls, cls2, resourceTranscoder));
    }

    public synchronized <Z, R> com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, R> get(java.lang.Class<Z> cls, java.lang.Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return com.bumptech.glide.load.resource.transcode.UnitTranscoder.get();
        }
        for (com.bumptech.glide.load.resource.transcode.TranscoderRegistry.Entry<?, ?> entry : this.transcoders) {
            if (entry.handles(cls, cls2)) {
                return (com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, R>) entry.transcoder;
            }
        }
        throw new java.lang.IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> java.util.List<java.lang.Class<R>> getTranscodeClasses(java.lang.Class<Z> cls, java.lang.Class<R> cls2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        java.util.Iterator<com.bumptech.glide.load.resource.transcode.TranscoderRegistry.Entry<?, ?>> it = this.transcoders.iterator();
        while (it.hasNext()) {
            if (it.next().handles(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    private static final class Entry<Z, R> {
        private final java.lang.Class<Z> fromClass;
        private final java.lang.Class<R> toClass;
        final com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, R> transcoder;

        Entry(java.lang.Class<Z> cls, java.lang.Class<R> cls2, com.bumptech.glide.load.resource.transcode.ResourceTranscoder<Z, R> resourceTranscoder) {
            this.fromClass = cls;
            this.toClass = cls2;
            this.transcoder = resourceTranscoder;
        }

        public boolean handles(java.lang.Class<?> cls, java.lang.Class<?> cls2) {
            return this.fromClass.isAssignableFrom(cls) && cls2.isAssignableFrom(this.toClass);
        }
    }
}
