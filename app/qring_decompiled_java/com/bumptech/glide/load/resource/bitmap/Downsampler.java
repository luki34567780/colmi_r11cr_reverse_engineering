package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public final class Downsampler {
    static final java.lang.String TAG = "Downsampler";
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;
    private final android.util.DisplayMetrics displayMetrics;
    private final com.bumptech.glide.load.resource.bitmap.HardwareConfigState hardwareConfigState = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.getInstance();
    private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> parsers;
    public static final com.bumptech.glide.load.Option<com.bumptech.glide.load.DecodeFormat> DECODE_FORMAT = com.bumptech.glide.load.Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", com.bumptech.glide.load.DecodeFormat.DEFAULT);
    public static final com.bumptech.glide.load.Option<com.bumptech.glide.load.PreferredColorSpace> PREFERRED_COLOR_SPACE = com.bumptech.glide.load.Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", com.bumptech.glide.load.PreferredColorSpace.SRGB);

    @java.lang.Deprecated
    public static final com.bumptech.glide.load.Option<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> DOWNSAMPLE_STRATEGY = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.OPTION;
    public static final com.bumptech.glide.load.Option<java.lang.Boolean> FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS = com.bumptech.glide.load.Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);
    public static final com.bumptech.glide.load.Option<java.lang.Boolean> ALLOW_HARDWARE_CONFIG = com.bumptech.glide.load.Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);
    private static final java.lang.String WBMP_MIME_TYPE = "image/vnd.wap.wbmp";
    private static final java.lang.String ICO_MIME_TYPE = "image/x-ico";
    private static final java.util.Set<java.lang.String> NO_DOWNSAMPLE_PRE_N_MIME_TYPES = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(WBMP_MIME_TYPE, ICO_MIME_TYPE)));
    private static final com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks EMPTY_CALLBACKS = new com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks() { // from class: com.bumptech.glide.load.resource.bitmap.Downsampler.1
        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public void onDecodeComplete(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, android.graphics.Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public void onObtainBounds() {
        }
    };
    private static final java.util.Set<com.bumptech.glide.load.ImageHeaderParser.ImageType> TYPES_THAT_USE_POOL_PRE_KITKAT = java.util.Collections.unmodifiableSet(java.util.EnumSet.of(com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG, com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A, com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG));
    private static final java.util.Queue<android.graphics.BitmapFactory.Options> OPTIONS_QUEUE = com.bumptech.glide.util.Util.createQueue(0);

    public interface DecodeCallbacks {
        void onDecodeComplete(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, android.graphics.Bitmap bitmap) throws java.io.IOException;

        void onObtainBounds();
    }

    private static boolean isRotationRequired(int i) {
        return i == 90 || i == 270;
    }

    private static int round(double d) {
        return (int) (d + 0.5d);
    }

    public boolean handles(java.io.InputStream inputStream) {
        return true;
    }

    public boolean handles(java.nio.ByteBuffer byteBuffer) {
        return true;
    }

    public Downsampler(java.util.List<com.bumptech.glide.load.ImageHeaderParser> list, android.util.DisplayMetrics displayMetrics, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool) {
        this.parsers = list;
        this.displayMetrics = (android.util.DisplayMetrics) com.bumptech.glide.util.Preconditions.checkNotNull(displayMetrics);
        this.bitmapPool = (com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool) com.bumptech.glide.util.Preconditions.checkNotNull(bitmapPool);
        this.byteArrayPool = (com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool) com.bumptech.glide.util.Preconditions.checkNotNull(arrayPool);
    }

    public boolean handles(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        return com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.isSupported();
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(java.io.InputStream inputStream, int i, int i2, com.bumptech.glide.load.Options options) throws java.io.IOException {
        return decode(inputStream, i, i2, options, EMPTY_CALLBACKS);
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(java.io.InputStream inputStream, int i, int i2, com.bumptech.glide.load.Options options, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks decodeCallbacks) throws java.io.IOException {
        return decode(new com.bumptech.glide.load.resource.bitmap.ImageReader.InputStreamImageReader(inputStream, this.parsers, this.byteArrayPool), i, i2, options, decodeCallbacks);
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(android.os.ParcelFileDescriptor parcelFileDescriptor, int i, int i2, com.bumptech.glide.load.Options options) throws java.io.IOException {
        return decode(new com.bumptech.glide.load.resource.bitmap.ImageReader.ParcelFileDescriptorImageReader(parcelFileDescriptor, this.parsers, this.byteArrayPool), i, i2, options, EMPTY_CALLBACKS);
    }

    private com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(com.bumptech.glide.load.resource.bitmap.ImageReader imageReader, int i, int i2, com.bumptech.glide.load.Options options, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks decodeCallbacks) throws java.io.IOException {
        byte[] bArr = (byte[]) this.byteArrayPool.get(com.liulishuo.okdownload.DownloadTask.Builder.DEFAULT_SYNC_BUFFER_SIZE, byte[].class);
        android.graphics.BitmapFactory.Options defaultOptions = getDefaultOptions();
        defaultOptions.inTempStorage = bArr;
        com.bumptech.glide.load.DecodeFormat decodeFormat = (com.bumptech.glide.load.DecodeFormat) options.get(DECODE_FORMAT);
        com.bumptech.glide.load.PreferredColorSpace preferredColorSpace = (com.bumptech.glide.load.PreferredColorSpace) options.get(PREFERRED_COLOR_SPACE);
        com.bumptech.glide.load.resource.bitmap.DownsampleStrategy downsampleStrategy = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy) options.get(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.OPTION);
        boolean booleanValue = ((java.lang.Boolean) options.get(FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS)).booleanValue();
        com.bumptech.glide.load.Option<java.lang.Boolean> option = ALLOW_HARDWARE_CONFIG;
        try {
            return com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(decodeFromWrappedStreams(imageReader, defaultOptions, downsampleStrategy, decodeFormat, preferredColorSpace, options.get(option) != null && ((java.lang.Boolean) options.get(option)).booleanValue(), i, i2, booleanValue, decodeCallbacks), this.bitmapPool);
        } finally {
            releaseOptions(defaultOptions);
            this.byteArrayPool.put(bArr);
        }
    }

    private android.graphics.Bitmap decodeFromWrappedStreams(com.bumptech.glide.load.resource.bitmap.ImageReader imageReader, android.graphics.BitmapFactory.Options options, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy downsampleStrategy, com.bumptech.glide.load.DecodeFormat decodeFormat, com.bumptech.glide.load.PreferredColorSpace preferredColorSpace, boolean z, int i, int i2, boolean z2, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks decodeCallbacks) throws java.io.IOException {
        int i3;
        int i4;
        int i5;
        com.bumptech.glide.load.resource.bitmap.Downsampler downsampler;
        int round;
        int round2;
        int i6;
        long logTime = com.bumptech.glide.util.LogTime.getLogTime();
        int[] dimensions = getDimensions(imageReader, options, decodeCallbacks, this.bitmapPool);
        boolean z3 = false;
        int i7 = dimensions[0];
        int i8 = dimensions[1];
        java.lang.String str = options.outMimeType;
        boolean z4 = (i7 == -1 || i8 == -1) ? false : z;
        int imageOrientation = imageReader.getImageOrientation();
        int exifOrientationDegrees = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getExifOrientationDegrees(imageOrientation);
        boolean isExifOrientationRequired = com.bumptech.glide.load.resource.bitmap.TransformationUtils.isExifOrientationRequired(imageOrientation);
        if (i == Integer.MIN_VALUE) {
            i3 = i2;
            i4 = isRotationRequired(exifOrientationDegrees) ? i8 : i7;
        } else {
            i3 = i2;
            i4 = i;
        }
        if (i3 == Integer.MIN_VALUE) {
            i5 = isRotationRequired(exifOrientationDegrees) ? i7 : i8;
        } else {
            i5 = i3;
        }
        com.bumptech.glide.load.ImageHeaderParser.ImageType imageType = imageReader.getImageType();
        calculateScaling(imageType, imageReader, decodeCallbacks, this.bitmapPool, downsampleStrategy, exifOrientationDegrees, i7, i8, i4, i5, options);
        calculateConfig(imageReader, decodeFormat, z4, isExifOrientationRequired, options, i4, i5);
        boolean z5 = android.os.Build.VERSION.SDK_INT >= 19;
        if (options.inSampleSize == 1 || z5) {
            downsampler = this;
            if (downsampler.shouldUsePool(imageType)) {
                if (i7 < 0 || i8 < 0 || !z2 || !z5) {
                    float f = isScaling(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                    int i9 = options.inSampleSize;
                    float f2 = i9;
                    int ceil = (int) java.lang.Math.ceil(i7 / f2);
                    int ceil2 = (int) java.lang.Math.ceil(i8 / f2);
                    round = java.lang.Math.round(ceil * f);
                    round2 = java.lang.Math.round(ceil2 * f);
                    if (android.util.Log.isLoggable(TAG, 2)) {
                        android.util.Log.v(TAG, "Calculated target [" + round + "x" + round2 + "] for source [" + i7 + "x" + i8 + "], sampleSize: " + i9 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f);
                    }
                } else {
                    round = i4;
                    round2 = i5;
                }
                if (round > 0 && round2 > 0) {
                    setInBitmap(options, downsampler.bitmapPool, round, round2);
                }
            }
        } else {
            downsampler = this;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            if (preferredColorSpace == com.bumptech.glide.load.PreferredColorSpace.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) {
                z3 = true;
            }
            options.inPreferredColorSpace = android.graphics.ColorSpace.get(z3 ? android.graphics.ColorSpace.Named.DISPLAY_P3 : android.graphics.ColorSpace.Named.SRGB);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB);
        }
        android.graphics.Bitmap decodeStream = decodeStream(imageReader, options, decodeCallbacks, downsampler.bitmapPool);
        decodeCallbacks.onDecodeComplete(downsampler.bitmapPool, decodeStream);
        if (android.util.Log.isLoggable(TAG, 2)) {
            i6 = imageOrientation;
            logDecode(i7, i8, str, options, decodeStream, i, i2, logTime);
        } else {
            i6 = imageOrientation;
        }
        android.graphics.Bitmap bitmap = null;
        if (decodeStream != null) {
            decodeStream.setDensity(downsampler.displayMetrics.densityDpi);
            bitmap = com.bumptech.glide.load.resource.bitmap.TransformationUtils.rotateImageExif(downsampler.bitmapPool, decodeStream, i6);
            if (!decodeStream.equals(bitmap)) {
                downsampler.bitmapPool.put(decodeStream);
            }
        }
        return bitmap;
    }

    private static void calculateScaling(com.bumptech.glide.load.ImageHeaderParser.ImageType imageType, com.bumptech.glide.load.resource.bitmap.ImageReader imageReader, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks decodeCallbacks, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy downsampleStrategy, int i, int i2, int i3, int i4, int i5, android.graphics.BitmapFactory.Options options) throws java.io.IOException {
        int i6;
        int i7;
        int min;
        int max;
        int floor;
        double floor2;
        int i8;
        if (i2 <= 0 || i3 <= 0) {
            if (android.util.Log.isLoggable(TAG, 3)) {
                android.util.Log.d(TAG, "Unable to determine dimensions for: " + imageType + " with target [" + i4 + "x" + i5 + "]");
                return;
            }
            return;
        }
        if (isRotationRequired(i)) {
            i7 = i2;
            i6 = i3;
        } else {
            i6 = i2;
            i7 = i3;
        }
        float scaleFactor = downsampleStrategy.getScaleFactor(i6, i7, i4, i5);
        if (scaleFactor <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Cannot scale with factor: " + scaleFactor + " from: " + downsampleStrategy + ", source: [" + i2 + "x" + i3 + "], target: [" + i4 + "x" + i5 + "]");
        }
        com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding sampleSizeRounding = downsampleStrategy.getSampleSizeRounding(i6, i7, i4, i5);
        if (sampleSizeRounding == null) {
            throw new java.lang.IllegalArgumentException("Cannot round with null rounding");
        }
        float f = i6;
        float f2 = i7;
        int round = i6 / round(scaleFactor * f);
        int round2 = i7 / round(scaleFactor * f2);
        if (sampleSizeRounding == com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.MEMORY) {
            min = java.lang.Math.max(round, round2);
        } else {
            min = java.lang.Math.min(round, round2);
        }
        if (android.os.Build.VERSION.SDK_INT > 23 || !NO_DOWNSAMPLE_PRE_N_MIME_TYPES.contains(options.outMimeType)) {
            max = java.lang.Math.max(1, java.lang.Integer.highestOneBit(min));
            if (sampleSizeRounding == com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.MEMORY && max < 1.0f / scaleFactor) {
                max <<= 1;
            }
        } else {
            max = 1;
        }
        options.inSampleSize = max;
        if (imageType == com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG) {
            float min2 = java.lang.Math.min(max, 8);
            floor = (int) java.lang.Math.ceil(f / min2);
            i8 = (int) java.lang.Math.ceil(f2 / min2);
            int i9 = max / 8;
            if (i9 > 0) {
                floor /= i9;
                i8 /= i9;
            }
        } else {
            if (imageType == com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG || imageType == com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A) {
                float f3 = max;
                floor = (int) java.lang.Math.floor(f / f3);
                floor2 = java.lang.Math.floor(f2 / f3);
            } else if (imageType == com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP || imageType == com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A) {
                if (android.os.Build.VERSION.SDK_INT >= 24) {
                    float f4 = max;
                    floor = java.lang.Math.round(f / f4);
                    i8 = java.lang.Math.round(f2 / f4);
                } else {
                    float f5 = max;
                    floor = (int) java.lang.Math.floor(f / f5);
                    floor2 = java.lang.Math.floor(f2 / f5);
                }
            } else if (i6 % max != 0 || i7 % max != 0) {
                int[] dimensions = getDimensions(imageReader, options, decodeCallbacks, bitmapPool);
                floor = dimensions[0];
                i8 = dimensions[1];
            } else {
                floor = i6 / max;
                i8 = i7 / max;
            }
            i8 = (int) floor2;
        }
        double scaleFactor2 = downsampleStrategy.getScaleFactor(floor, i8, i4, i5);
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            options.inTargetDensity = adjustTargetDensityForError(scaleFactor2);
            options.inDensity = getDensityMultiplier(scaleFactor2);
        }
        if (isScaling(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (android.util.Log.isLoggable(TAG, 2)) {
            android.util.Log.v(TAG, "Calculate scaling, source: [" + i2 + "x" + i3 + "], degreesToRotate: " + i + ", target: [" + i4 + "x" + i5 + "], power of two scaled: [" + floor + "x" + i8 + "], exact scale factor: " + scaleFactor + ", power of 2 sample size: " + max + ", adjusted scale factor: " + scaleFactor2 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private static int adjustTargetDensityForError(double d) {
        return round((d / (r1 / r0)) * round(getDensityMultiplier(d) * d));
    }

    private static int getDensityMultiplier(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) java.lang.Math.round(d * 2.147483647E9d);
    }

    private boolean shouldUsePool(com.bumptech.glide.load.ImageHeaderParser.ImageType imageType) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return TYPES_THAT_USE_POOL_PRE_KITKAT.contains(imageType);
    }

    private void calculateConfig(com.bumptech.glide.load.resource.bitmap.ImageReader imageReader, com.bumptech.glide.load.DecodeFormat decodeFormat, boolean z, boolean z2, android.graphics.BitmapFactory.Options options, int i, int i2) {
        if (this.hardwareConfigState.setHardwareConfigIfAllowed(i, i2, options, z, z2)) {
            return;
        }
        if (decodeFormat == com.bumptech.glide.load.DecodeFormat.PREFER_ARGB_8888 || android.os.Build.VERSION.SDK_INT == 16) {
            options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
            return;
        }
        boolean z3 = false;
        try {
            z3 = imageReader.getImageType().hasAlpha();
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable(TAG, 3)) {
                android.util.Log.d(TAG, "Cannot determine whether the image has alpha or not from header, format " + decodeFormat, e);
            }
        }
        options.inPreferredConfig = z3 ? android.graphics.Bitmap.Config.ARGB_8888 : android.graphics.Bitmap.Config.RGB_565;
        if (options.inPreferredConfig == android.graphics.Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static int[] getDimensions(com.bumptech.glide.load.resource.bitmap.ImageReader imageReader, android.graphics.BitmapFactory.Options options, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks decodeCallbacks, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool) throws java.io.IOException {
        options.inJustDecodeBounds = true;
        decodeStream(imageReader, options, decodeCallbacks, bitmapPool);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap decodeStream(com.bumptech.glide.load.resource.bitmap.ImageReader r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r7, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.onObtainBounds()
            r5.stopGrowingBuffers()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r4.lock()
            android.graphics.Bitmap r5 = r5.decodeBitmap(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L52
        L27:
            r4 = move-exception
            java.io.IOException r1 = newIoExceptionForInBitmapAssertion(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L51
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            r8.put(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            android.graphics.Bitmap r5 = decodeStream(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r6.unlock()
            return r5
        L50:
            throw r1     // Catch: java.lang.Throwable -> L25
        L51:
            throw r1     // Catch: java.lang.Throwable -> L25
        L52:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.TransformationUtils.getBitmapDrawableLock()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.Downsampler.decodeStream(com.bumptech.glide.load.resource.bitmap.ImageReader, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool):android.graphics.Bitmap");
    }

    private static boolean isScaling(android.graphics.BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static void logDecode(int i, int i2, java.lang.String str, android.graphics.BitmapFactory.Options options, android.graphics.Bitmap bitmap, int i3, int i4, long j) {
        android.util.Log.v(TAG, "Decoded " + getBitmapString(bitmap) + " from [" + i + "x" + i2 + "] " + str + " with inBitmap " + getInBitmapString(options) + " for [" + i3 + "x" + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + java.lang.Thread.currentThread().getName() + ", duration: " + com.bumptech.glide.util.LogTime.getElapsedMillis(j));
    }

    private static java.lang.String getInBitmapString(android.graphics.BitmapFactory.Options options) {
        return getBitmapString(options.inBitmap);
    }

    private static java.lang.String getBitmapString(android.graphics.Bitmap bitmap) {
        java.lang.String str;
        if (bitmap == null) {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    private static java.io.IOException newIoExceptionForInBitmapAssertion(java.lang.IllegalArgumentException illegalArgumentException, int i, int i2, java.lang.String str, android.graphics.BitmapFactory.Options options) {
        return new java.io.IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + getInBitmapString(options), illegalArgumentException);
    }

    private static void setInBitmap(android.graphics.BitmapFactory.Options options, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, int i, int i2) {
        android.graphics.Bitmap.Config config;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == android.graphics.Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = bitmapPool.getDirty(i, i2, config);
    }

    private static synchronized android.graphics.BitmapFactory.Options getDefaultOptions() {
        android.graphics.BitmapFactory.Options poll;
        synchronized (com.bumptech.glide.load.resource.bitmap.Downsampler.class) {
            java.util.Queue<android.graphics.BitmapFactory.Options> queue = OPTIONS_QUEUE;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new android.graphics.BitmapFactory.Options();
                resetOptions(poll);
            }
        }
        return poll;
    }

    private static void releaseOptions(android.graphics.BitmapFactory.Options options) {
        resetOptions(options);
        java.util.Queue<android.graphics.BitmapFactory.Options> queue = OPTIONS_QUEUE;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void resetOptions(android.graphics.BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }
}
