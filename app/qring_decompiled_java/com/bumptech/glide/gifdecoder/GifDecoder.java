package com.bumptech.glide.gifdecoder;

/* loaded from: classes.dex */
public interface GifDecoder {
    public static final int STATUS_FORMAT_ERROR = 1;
    public static final int STATUS_OK = 0;
    public static final int STATUS_OPEN_ERROR = 2;
    public static final int STATUS_PARTIAL_DECODE = 3;
    public static final int TOTAL_ITERATION_COUNT_FOREVER = 0;

    public interface BitmapProvider {
        android.graphics.Bitmap obtain(int i, int i2, android.graphics.Bitmap.Config config);

        byte[] obtainByteArray(int i);

        int[] obtainIntArray(int i);

        void release(android.graphics.Bitmap bitmap);

        void release(byte[] bArr);

        void release(int[] iArr);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface GifDecodeStatus {
    }

    void advance();

    void clear();

    int getByteSize();

    int getCurrentFrameIndex();

    java.nio.ByteBuffer getData();

    int getDelay(int i);

    int getFrameCount();

    int getHeight();

    @java.lang.Deprecated
    int getLoopCount();

    int getNetscapeLoopCount();

    int getNextDelay();

    android.graphics.Bitmap getNextFrame();

    int getStatus();

    int getTotalIterationCount();

    int getWidth();

    int read(java.io.InputStream inputStream, int i);

    int read(byte[] bArr);

    void resetFrameIndex();

    void setData(com.bumptech.glide.gifdecoder.GifHeader gifHeader, java.nio.ByteBuffer byteBuffer);

    void setData(com.bumptech.glide.gifdecoder.GifHeader gifHeader, java.nio.ByteBuffer byteBuffer, int i);

    void setData(com.bumptech.glide.gifdecoder.GifHeader gifHeader, byte[] bArr);

    void setDefaultBitmapConfig(android.graphics.Bitmap.Config config);
}
