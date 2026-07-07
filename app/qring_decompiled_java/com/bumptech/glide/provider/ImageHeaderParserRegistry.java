package com.bumptech.glide.provider;

/* loaded from: /tmp/dex/classes2.dex */
public final class ImageHeaderParserRegistry {
    private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> parsers = new java.util.ArrayList();

    public synchronized java.util.List<com.bumptech.glide.load.ImageHeaderParser> getParsers() {
        return this.parsers;
    }

    public synchronized void add(com.bumptech.glide.load.ImageHeaderParser imageHeaderParser) {
        this.parsers.add(imageHeaderParser);
    }
}
