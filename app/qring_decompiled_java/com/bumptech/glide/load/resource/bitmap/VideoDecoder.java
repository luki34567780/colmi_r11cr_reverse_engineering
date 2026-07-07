package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public class VideoDecoder<T> implements com.bumptech.glide.load.ResourceDecoder<T, android.graphics.Bitmap> {
    public static final long DEFAULT_FRAME = -1;
    static final int DEFAULT_FRAME_OPTION = 2;
    private static final java.lang.String TAG = "VideoDecoder";
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverFactory factory;
    private final com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer<T> initializer;
    public static final com.bumptech.glide.load.Option<java.lang.Long> TARGET_FRAME = com.bumptech.glide.load.Option.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new com.bumptech.glide.load.Option.CacheKeyUpdater<java.lang.Long>() { // from class: com.bumptech.glide.load.resource.bitmap.VideoDecoder.1
        private final java.nio.ByteBuffer buffer = java.nio.ByteBuffer.allocate(8);

        public void update(byte[] bArr, java.lang.Long l, java.security.MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.buffer) {
                this.buffer.position(0);
                messageDigest.update(this.buffer.putLong(l.longValue()).array());
            }
        }
    });
    public static final com.bumptech.glide.load.Option<java.lang.Integer> FRAME_OPTION = com.bumptech.glide.load.Option.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new com.bumptech.glide.load.Option.CacheKeyUpdater<java.lang.Integer>() { // from class: com.bumptech.glide.load.resource.bitmap.VideoDecoder.2
        private final java.nio.ByteBuffer buffer = java.nio.ByteBuffer.allocate(4);

        public void update(byte[] bArr, java.lang.Integer num, java.security.MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.buffer) {
                this.buffer.position(0);
                messageDigest.update(this.buffer.putInt(num.intValue()).array());
            }
        }
    });
    private static final com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverFactory DEFAULT_FACTORY = new com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverFactory();

    interface MediaMetadataRetrieverInitializer<T> {
        void initialize(android.media.MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    public boolean handles(T t, com.bumptech.glide.load.Options options) {
        return true;
    }

    public static com.bumptech.glide.load.ResourceDecoder<android.content.res.AssetFileDescriptor, android.graphics.Bitmap> asset(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool) {
        return new com.bumptech.glide.load.resource.bitmap.VideoDecoder(bitmapPool, new com.bumptech.glide.load.resource.bitmap.VideoDecoder.AssetFileDescriptorInitializer());
    }

    public static com.bumptech.glide.load.ResourceDecoder<android.os.ParcelFileDescriptor, android.graphics.Bitmap> parcel(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool) {
        return new com.bumptech.glide.load.resource.bitmap.VideoDecoder(bitmapPool, new com.bumptech.glide.load.resource.bitmap.VideoDecoder.ParcelFileDescriptorInitializer());
    }

    public static com.bumptech.glide.load.ResourceDecoder<java.nio.ByteBuffer, android.graphics.Bitmap> byteBuffer(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool) {
        return new com.bumptech.glide.load.resource.bitmap.VideoDecoder(bitmapPool, new com.bumptech.glide.load.resource.bitmap.VideoDecoder.ByteBufferInitializer());
    }

    VideoDecoder(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer<T> mediaMetadataRetrieverInitializer) {
        this(bitmapPool, mediaMetadataRetrieverInitializer, DEFAULT_FACTORY);
    }

    VideoDecoder(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer<T> mediaMetadataRetrieverInitializer, com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverFactory mediaMetadataRetrieverFactory) {
        this.bitmapPool = bitmapPool;
        this.initializer = mediaMetadataRetrieverInitializer;
        this.factory = mediaMetadataRetrieverFactory;
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(T t, int i, int i2, com.bumptech.glide.load.Options options) throws java.io.IOException {
        long longValue = ((java.lang.Long) options.get(TARGET_FRAME)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new java.lang.IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        java.lang.Integer num = (java.lang.Integer) options.get(FRAME_OPTION);
        if (num == null) {
            num = 2;
        }
        com.bumptech.glide.load.resource.bitmap.DownsampleStrategy downsampleStrategy = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy) options.get(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.OPTION);
        if (downsampleStrategy == null) {
            downsampleStrategy = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.DEFAULT;
        }
        com.bumptech.glide.load.resource.bitmap.DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        android.media.MediaMetadataRetriever build = this.factory.build();
        try {
            this.initializer.initialize(build, t);
            android.graphics.Bitmap decodeFrame = decodeFrame(build, longValue, num.intValue(), i, i2, downsampleStrategy2);
            build.release();
            return com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(decodeFrame, this.bitmapPool);
        } catch (java.lang.Throwable th) {
            build.release();
            throw th;
        }
    }

    private static android.graphics.Bitmap decodeFrame(android.media.MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy downsampleStrategy) {
        android.graphics.Bitmap decodeScaledFrame = (android.os.Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || downsampleStrategy == com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.NONE) ? null : decodeScaledFrame(mediaMetadataRetriever, j, i, i2, i3, downsampleStrategy);
        if (decodeScaledFrame == null) {
            decodeScaledFrame = decodeOriginalFrame(mediaMetadataRetriever, j, i);
        }
        if (decodeScaledFrame != null) {
            return decodeScaledFrame;
        }
        throw new com.bumptech.glide.load.resource.bitmap.VideoDecoder.VideoDecoderException();
    }

    private static android.graphics.Bitmap decodeScaledFrame(android.media.MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy downsampleStrategy) {
        try {
            int parseInt = java.lang.Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = java.lang.Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = java.lang.Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float scaleFactor = downsampleStrategy.getScaleFactor(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, java.lang.Math.round(parseInt * scaleFactor), java.lang.Math.round(scaleFactor * parseInt2));
        } catch (java.lang.Throwable th) {
            if (!android.util.Log.isLoggable(TAG, 3)) {
                return null;
            }
            android.util.Log.d(TAG, "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
            return null;
        }
    }

    private static android.graphics.Bitmap decodeOriginalFrame(android.media.MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    static class MediaMetadataRetrieverFactory {
        MediaMetadataRetrieverFactory() {
        }

        public android.media.MediaMetadataRetriever build() {
            return new android.media.MediaMetadataRetriever();
        }
    }

    private static final class AssetFileDescriptorInitializer implements com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer<android.content.res.AssetFileDescriptor> {
        private AssetFileDescriptorInitializer() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer
        public void initialize(android.media.MediaMetadataRetriever mediaMetadataRetriever, android.content.res.AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    static final class ParcelFileDescriptorInitializer implements com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer<android.os.ParcelFileDescriptor> {
        ParcelFileDescriptorInitializer() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer
        public void initialize(android.media.MediaMetadataRetriever mediaMetadataRetriever, android.os.ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    static final class ByteBufferInitializer implements com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer<java.nio.ByteBuffer> {
        ByteBufferInitializer() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaMetadataRetrieverInitializer
        public void initialize(android.media.MediaMetadataRetriever mediaMetadataRetriever, final java.nio.ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new android.media.MediaDataSource() { // from class: com.bumptech.glide.load.resource.bitmap.VideoDecoder.ByteBufferInitializer.1
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }

                @Override // android.media.MediaDataSource
                public int readAt(long j, byte[] bArr, int i, int i2) {
                    if (j >= byteBuffer.limit()) {
                        return -1;
                    }
                    byteBuffer.position((int) j);
                    int min = java.lang.Math.min(i2, byteBuffer.remaining());
                    byteBuffer.get(bArr, i, min);
                    return min;
                }

                @Override // android.media.MediaDataSource
                public long getSize() {
                    return byteBuffer.limit();
                }
            });
        }
    }

    private static final class VideoDecoderException extends java.lang.RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }
}
