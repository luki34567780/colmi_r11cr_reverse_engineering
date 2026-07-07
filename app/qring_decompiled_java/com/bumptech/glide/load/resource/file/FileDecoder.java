package com.bumptech.glide.load.resource.file;

/* loaded from: /tmp/dex/classes2.dex */
public class FileDecoder implements com.bumptech.glide.load.ResourceDecoder<java.io.File, java.io.File> {
    public boolean handles(java.io.File file, com.bumptech.glide.load.Options options) {
        return true;
    }

    public com.bumptech.glide.load.engine.Resource<java.io.File> decode(java.io.File file, int i, int i2, com.bumptech.glide.load.Options options) {
        return new com.bumptech.glide.load.resource.file.FileResource(file);
    }
}
