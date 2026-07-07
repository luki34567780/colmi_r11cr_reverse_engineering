package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public final class ExifInterfaceImageHeaderParser implements com.bumptech.glide.load.ImageHeaderParser {
    public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(java.io.InputStream inputStream) {
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN;
    }

    public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(java.nio.ByteBuffer byteBuffer) {
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN;
    }

    public int getOrientation(java.io.InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool) throws java.io.IOException {
        int attributeInt = new androidx.exifinterface.media.ExifInterface(inputStream).getAttributeInt("Orientation", 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    public int getOrientation(java.nio.ByteBuffer byteBuffer, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool) throws java.io.IOException {
        return getOrientation(com.bumptech.glide.util.ByteBufferUtil.toStream(byteBuffer), arrayPool);
    }
}
