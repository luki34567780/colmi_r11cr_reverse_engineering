package com.bumptech.glide.load.model;

/* loaded from: /tmp/dex/classes2.dex */
public class ByteBufferEncoder implements com.bumptech.glide.load.Encoder<java.nio.ByteBuffer> {
    private static final java.lang.String TAG = "ByteBufferEncoder";

    public boolean encode(java.nio.ByteBuffer byteBuffer, java.io.File file, com.bumptech.glide.load.Options options) {
        try {
            com.bumptech.glide.util.ByteBufferUtil.toFile(byteBuffer, file);
            return true;
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable(TAG, 3)) {
                android.util.Log.d(TAG, "Failed to write data", e);
            }
            return false;
        }
    }
}
