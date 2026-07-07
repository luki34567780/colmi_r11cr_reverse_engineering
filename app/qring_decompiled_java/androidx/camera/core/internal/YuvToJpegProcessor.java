package androidx.camera.core.internal;

/* loaded from: classes.dex */
public class YuvToJpegProcessor implements androidx.camera.core.impl.CaptureProcessor {
    private static final java.lang.String TAG = "YuvToJpegProcessor";
    private static final android.graphics.Rect UNINITIALIZED_RECT = new android.graphics.Rect(0, 0, 0, 0);
    private android.media.ImageWriter mImageWriter;
    private final int mMaxImages;
    private final int mQuality;
    private final java.lang.Object mLock = new java.lang.Object();
    private boolean mClosed = false;
    private int mProcessingImages = 0;
    private android.graphics.Rect mImageRect = UNINITIALIZED_RECT;

    public YuvToJpegProcessor(int quality, int maxImages) {
        this.mQuality = quality;
        this.mMaxImages = maxImages;
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void onOutputSurface(android.view.Surface surface, int imageFormat) {
        androidx.core.util.Preconditions.checkState(imageFormat == 256, "YuvToJpegProcessor only supports JPEG output format.");
        synchronized (this.mLock) {
            if (!this.mClosed) {
                if (this.mImageWriter != null) {
                    throw new java.lang.IllegalStateException("Output surface already set.");
                }
                this.mImageWriter = androidx.camera.core.internal.compat.ImageWriterCompat.newInstance(surface, this.mMaxImages, imageFormat);
            } else {
                androidx.camera.core.Logger.w(TAG, "Cannot set output surface. Processor is closed.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b A[Catch: all -> 0x015e, TRY_ENTER, TRY_LEAVE, TryCatch #18 {all -> 0x015e, blocks: (B:50:0x00e3, B:73:0x013b), top: B:15:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0162  */
    @Override // androidx.camera.core.impl.CaptureProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void process(androidx.camera.core.impl.ImageProxyBundle r18) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.YuvToJpegProcessor.process(androidx.camera.core.impl.ImageProxyBundle):void");
    }

    public void close() {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                this.mClosed = true;
                if (this.mProcessingImages == 0 && this.mImageWriter != null) {
                    androidx.camera.core.Logger.d(TAG, "No processing in progress. Closing immediately.");
                    this.mImageWriter.close();
                } else {
                    androidx.camera.core.Logger.d(TAG, "close() called while processing. Will close after completion.");
                }
            }
        }
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void onResolutionUpdate(android.util.Size size) {
        synchronized (this.mLock) {
            this.mImageRect = new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    private static androidx.camera.core.impl.utils.ExifData getExifData(androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.impl.utils.ExifData.Builder builderForDevice = androidx.camera.core.impl.utils.ExifData.builderForDevice();
        imageProxy.getImageInfo().populateExifData(builderForDevice);
        return builderForDevice.setImageWidth(imageProxy.getWidth()).setImageHeight(imageProxy.getHeight()).build();
    }

    private static final class ByteBufferOutputStream extends java.io.OutputStream {
        private final java.nio.ByteBuffer mByteBuffer;

        ByteBufferOutputStream(java.nio.ByteBuffer buf) {
            this.mByteBuffer = buf;
        }

        @Override // java.io.OutputStream
        public void write(int b) throws java.io.IOException {
            if (!this.mByteBuffer.hasRemaining()) {
                throw new java.io.EOFException("Output ByteBuffer has no bytes remaining.");
            }
            this.mByteBuffer.put((byte) b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b, int off, int len) throws java.io.IOException {
            int i;
            java.util.Objects.requireNonNull(b);
            if (off < 0 || off > b.length || len < 0 || (i = off + len) > b.length || i < 0) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (len == 0) {
                return;
            }
            if (this.mByteBuffer.remaining() < len) {
                throw new java.io.EOFException("Output ByteBuffer has insufficient bytes remaining.");
            }
            this.mByteBuffer.put(b, off, len);
        }
    }
}
