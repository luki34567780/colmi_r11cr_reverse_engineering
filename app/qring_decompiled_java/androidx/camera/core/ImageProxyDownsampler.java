package androidx.camera.core;

/* loaded from: classes.dex */
final class ImageProxyDownsampler {

    enum DownsamplingMethod {
        NEAREST_NEIGHBOR,
        AVERAGING
    }

    private ImageProxyDownsampler() {
    }

    static androidx.camera.core.ForwardingImageProxy downsample(androidx.camera.core.ImageProxy image, int downsampledWidth, int downsampledHeight, androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod downsamplingMethod) {
        byte[] bArr;
        if (image.getFormat() != 35) {
            throw new java.lang.UnsupportedOperationException("Only YUV_420_888 format is currently supported.");
        }
        if (image.getWidth() < downsampledWidth || image.getHeight() < downsampledHeight) {
            throw new java.lang.IllegalArgumentException("Downsampled dimension " + new android.util.Size(downsampledWidth, downsampledHeight) + " is not <= original dimension " + new android.util.Size(image.getWidth(), image.getHeight()) + ".");
        }
        if (image.getWidth() == downsampledWidth && image.getHeight() == downsampledHeight) {
            return new androidx.camera.core.ImageProxyDownsampler.ForwardingImageProxyImpl(image, image.getPlanes(), downsampledWidth, downsampledHeight);
        }
        int[] iArr = {image.getWidth(), image.getWidth() / 2, image.getWidth() / 2};
        int[] iArr2 = {image.getHeight(), image.getHeight() / 2, image.getHeight() / 2};
        int i = downsampledWidth / 2;
        int[] iArr3 = {downsampledWidth, i, i};
        int i2 = downsampledHeight / 2;
        int[] iArr4 = {downsampledHeight, i2, i2};
        androidx.camera.core.ImageProxy.PlaneProxy[] planeProxyArr = new androidx.camera.core.ImageProxy.PlaneProxy[3];
        for (int i3 = 0; i3 < 3; i3++) {
            androidx.camera.core.ImageProxy.PlaneProxy planeProxy = image.getPlanes()[i3];
            java.nio.ByteBuffer buffer = planeProxy.getBuffer();
            byte[] bArr2 = new byte[iArr3[i3] * iArr4[i3]];
            int i4 = androidx.camera.core.ImageProxyDownsampler.AnonymousClass2.$SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod[downsamplingMethod.ordinal()];
            if (i4 == 1) {
                bArr = bArr2;
                resizeNearestNeighbor(buffer, iArr[i3], planeProxy.getPixelStride(), planeProxy.getRowStride(), iArr2[i3], bArr, iArr3[i3], iArr4[i3]);
            } else if (i4 != 2) {
                bArr = bArr2;
            } else {
                bArr = bArr2;
                resizeAveraging(buffer, iArr[i3], planeProxy.getPixelStride(), planeProxy.getRowStride(), iArr2[i3], bArr, iArr3[i3], iArr4[i3]);
            }
            planeProxyArr[i3] = createPlaneProxy(iArr3[i3], 1, bArr);
        }
        return new androidx.camera.core.ImageProxyDownsampler.ForwardingImageProxyImpl(image, planeProxyArr, downsampledWidth, downsampledHeight);
    }

    /* renamed from: androidx.camera.core.ImageProxyDownsampler$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod;

        static {
            int[] iArr = new int[androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.values().length];
            $SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod = iArr;
            try {
                iArr[androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.NEAREST_NEIGHBOR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod[androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.AVERAGING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    private static void resizeNearestNeighbor(java.nio.ByteBuffer input, int inputWidth, int inputPixelStride, int inputRowStride, int inputHeight, byte[] output, int outputWidth, int outputHeight) {
        float f = inputWidth / outputWidth;
        float f2 = inputHeight / outputHeight;
        byte[] bArr = new byte[inputRowStride];
        int[] iArr = new int[outputWidth];
        for (int i = 0; i < outputWidth; i++) {
            iArr[i] = ((int) (i * f)) * inputPixelStride;
        }
        synchronized (input) {
            input.rewind();
            for (int i2 = 0; i2 < outputHeight; i2++) {
                int i3 = i2 * outputWidth;
                input.position(java.lang.Math.min((int) (i2 * f2), inputHeight - 1) * inputRowStride);
                input.get(bArr, 0, java.lang.Math.min(inputRowStride, input.remaining()));
                for (int i4 = 0; i4 < outputWidth; i4++) {
                    output[i3 + i4] = bArr[iArr[i4]];
                }
            }
        }
    }

    private static void resizeAveraging(java.nio.ByteBuffer input, int inputWidth, int inputPixelStride, int inputRowStride, int inputHeight, byte[] output, int outputWidth, int outputHeight) {
        float f = inputWidth / outputWidth;
        float f2 = inputHeight / outputHeight;
        byte[] bArr = new byte[inputRowStride];
        byte[] bArr2 = new byte[inputRowStride];
        int[] iArr = new int[outputWidth];
        int i = 0;
        for (int i2 = 0; i2 < outputWidth; i2++) {
            iArr[i2] = ((int) (i2 * f)) * inputPixelStride;
        }
        synchronized (input) {
            input.rewind();
            int i3 = 0;
            while (i3 < outputHeight) {
                int i4 = (int) (i3 * f2);
                int i5 = inputHeight - 1;
                int min = java.lang.Math.min(i4, i5) * inputRowStride;
                int min2 = java.lang.Math.min(i4 + 1, i5) * inputRowStride;
                int i6 = i3 * outputWidth;
                input.position(min);
                input.get(bArr, i, java.lang.Math.min(inputRowStride, input.remaining()));
                input.position(min2);
                input.get(bArr2, i, java.lang.Math.min(inputRowStride, input.remaining()));
                for (int i7 = 0; i7 < outputWidth; i7++) {
                    output[i6 + i7] = (byte) ((((((bArr[iArr[i7]] & 255) + (bArr[iArr[i7] + inputPixelStride] & 255)) + (bArr2[iArr[i7]] & 255)) + (bArr2[iArr[i7] + inputPixelStride] & 255)) / 4) & 255);
                }
                i3++;
                i = 0;
            }
        }
    }

    private static androidx.camera.core.ImageProxy.PlaneProxy createPlaneProxy(final int rowStride, final int pixelStride, final byte[] data) {
        return new androidx.camera.core.ImageProxy.PlaneProxy(data, rowStride, pixelStride) { // from class: androidx.camera.core.ImageProxyDownsampler.1
            final java.nio.ByteBuffer mBuffer;
            final /* synthetic */ byte[] val$data;
            final /* synthetic */ int val$pixelStride;
            final /* synthetic */ int val$rowStride;

            {
                this.val$data = data;
                this.val$rowStride = rowStride;
                this.val$pixelStride = pixelStride;
                this.mBuffer = java.nio.ByteBuffer.wrap(data);
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getRowStride() {
                return this.val$rowStride;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getPixelStride() {
                return this.val$pixelStride;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public java.nio.ByteBuffer getBuffer() {
                return this.mBuffer;
            }
        };
    }

    private static final class ForwardingImageProxyImpl extends androidx.camera.core.ForwardingImageProxy {
        private final int mDownsampledHeight;
        private final androidx.camera.core.ImageProxy.PlaneProxy[] mDownsampledPlanes;
        private final int mDownsampledWidth;

        ForwardingImageProxyImpl(androidx.camera.core.ImageProxy originalImage, androidx.camera.core.ImageProxy.PlaneProxy[] downsampledPlanes, int downsampledWidth, int downsampledHeight) {
            super(originalImage);
            this.mDownsampledPlanes = downsampledPlanes;
            this.mDownsampledWidth = downsampledWidth;
            this.mDownsampledHeight = downsampledHeight;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public synchronized int getWidth() {
            return this.mDownsampledWidth;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public synchronized int getHeight() {
            return this.mDownsampledHeight;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public synchronized androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes() {
            return this.mDownsampledPlanes;
        }
    }
}
