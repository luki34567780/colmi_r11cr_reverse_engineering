package com.bumptech.glide.provider;

/* loaded from: /tmp/dex/classes2.dex */
public class EncoderRegistry {
    private final java.util.List<com.bumptech.glide.provider.EncoderRegistry.Entry<?>> encoders = new java.util.ArrayList();

    public synchronized <T> com.bumptech.glide.load.Encoder<T> getEncoder(java.lang.Class<T> cls) {
        for (com.bumptech.glide.provider.EncoderRegistry.Entry<?> entry : this.encoders) {
            if (entry.handles(cls)) {
                return (com.bumptech.glide.load.Encoder<T>) entry.encoder;
            }
        }
        return null;
    }

    public synchronized <T> void append(java.lang.Class<T> cls, com.bumptech.glide.load.Encoder<T> encoder) {
        this.encoders.add(new com.bumptech.glide.provider.EncoderRegistry.Entry<>(cls, encoder));
    }

    public synchronized <T> void prepend(java.lang.Class<T> cls, com.bumptech.glide.load.Encoder<T> encoder) {
        this.encoders.add(0, new com.bumptech.glide.provider.EncoderRegistry.Entry<>(cls, encoder));
    }

    private static final class Entry<T> {
        private final java.lang.Class<T> dataClass;
        final com.bumptech.glide.load.Encoder<T> encoder;

        Entry(java.lang.Class<T> cls, com.bumptech.glide.load.Encoder<T> encoder) {
            this.dataClass = cls;
            this.encoder = encoder;
        }

        boolean handles(java.lang.Class<?> cls) {
            return this.dataClass.isAssignableFrom(cls);
        }
    }
}
