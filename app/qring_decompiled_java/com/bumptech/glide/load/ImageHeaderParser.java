package com.bumptech.glide.load;

/* loaded from: classes.dex */
public interface ImageHeaderParser {
    public static final int UNKNOWN_ORIENTATION = -1;

    int getOrientation(java.io.InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool) throws java.io.IOException;

    int getOrientation(java.nio.ByteBuffer byteBuffer, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool) throws java.io.IOException;

    com.bumptech.glide.load.ImageHeaderParser.ImageType getType(java.io.InputStream inputStream) throws java.io.IOException;

    com.bumptech.glide.load.ImageHeaderParser.ImageType getType(java.nio.ByteBuffer byteBuffer) throws java.io.IOException;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }
}
