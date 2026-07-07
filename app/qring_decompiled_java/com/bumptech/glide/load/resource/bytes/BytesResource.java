package com.bumptech.glide.load.resource.bytes;

/* loaded from: /tmp/dex/classes2.dex */
public class BytesResource implements com.bumptech.glide.load.engine.Resource<byte[]> {
    private final byte[] bytes;

    public void recycle() {
    }

    public BytesResource(byte[] bArr) {
        this.bytes = (byte[]) com.bumptech.glide.util.Preconditions.checkNotNull(bArr);
    }

    public java.lang.Class<byte[]> getResourceClass() {
        return byte[].class;
    }

    public byte[] get() {
        return this.bytes;
    }

    public int getSize() {
        return this.bytes.length;
    }
}
