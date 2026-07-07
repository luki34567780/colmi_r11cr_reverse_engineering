package androidx.camera.core.internal.utils;

/* loaded from: classes.dex */
public final class ImageUtil {
    private static final java.lang.String TAG = "ImageUtil";

    private ImageUtil() {
    }

    public static float[] sizeToVertexes(android.util.Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static float min(float value1, float value2, float value3, float value4) {
        return java.lang.Math.min(java.lang.Math.min(value1, value2), java.lang.Math.min(value3, value4));
    }

    public static android.util.Rational getRotatedAspectRatio(int rotationDegrees, android.util.Rational aspectRatio) {
        if (rotationDegrees == 90 || rotationDegrees == 270) {
            return inverseRational(aspectRatio);
        }
        return new android.util.Rational(aspectRatio.getNumerator(), aspectRatio.getDenominator());
    }

    public static byte[] imageToJpegByteArray(androidx.camera.core.ImageProxy image) throws androidx.camera.core.internal.utils.ImageUtil.CodecFailedException {
        if (image.getFormat() == 256) {
            return jpegImageToJpegByteArray(image);
        }
        if (image.getFormat() == 35) {
            return yuvImageToJpegByteArray(image);
        }
        androidx.camera.core.Logger.w(TAG, "Unrecognized image format: " + image.getFormat());
        return null;
    }

    public static byte[] yuv_420_888toNv21(androidx.camera.core.ImageProxy image) {
        androidx.camera.core.ImageProxy.PlaneProxy planeProxy = image.getPlanes()[0];
        androidx.camera.core.ImageProxy.PlaneProxy planeProxy2 = image.getPlanes()[1];
        androidx.camera.core.ImageProxy.PlaneProxy planeProxy3 = image.getPlanes()[2];
        java.nio.ByteBuffer buffer = planeProxy.getBuffer();
        java.nio.ByteBuffer buffer2 = planeProxy2.getBuffer();
        java.nio.ByteBuffer buffer3 = planeProxy3.getBuffer();
        buffer.rewind();
        buffer2.rewind();
        buffer3.rewind();
        int remaining = buffer.remaining();
        byte[] bArr = new byte[((image.getWidth() * image.getHeight()) / 2) + remaining];
        int i = 0;
        for (int i2 = 0; i2 < image.getHeight(); i2++) {
            buffer.get(bArr, i, image.getWidth());
            i += image.getWidth();
            buffer.position(java.lang.Math.min(remaining, (buffer.position() - image.getWidth()) + planeProxy.getRowStride()));
        }
        int height = image.getHeight() / 2;
        int width = image.getWidth() / 2;
        int rowStride = planeProxy3.getRowStride();
        int rowStride2 = planeProxy2.getRowStride();
        int pixelStride = planeProxy3.getPixelStride();
        int pixelStride2 = planeProxy2.getPixelStride();
        byte[] bArr2 = new byte[rowStride];
        byte[] bArr3 = new byte[rowStride2];
        for (int i3 = 0; i3 < height; i3++) {
            buffer3.get(bArr2, 0, java.lang.Math.min(rowStride, buffer3.remaining()));
            buffer2.get(bArr3, 0, java.lang.Math.min(rowStride2, buffer2.remaining()));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < width; i6++) {
                int i7 = i + 1;
                bArr[i] = bArr2[i4];
                i = i7 + 1;
                bArr[i7] = bArr3[i5];
                i4 += pixelStride;
                i5 += pixelStride2;
            }
        }
        return bArr;
    }

    public static byte[] cropByteArray(byte[] data, android.graphics.Rect cropRect) throws androidx.camera.core.internal.utils.ImageUtil.CodecFailedException {
        if (cropRect == null) {
            return data;
        }
        try {
            android.graphics.BitmapRegionDecoder newInstance = android.graphics.BitmapRegionDecoder.newInstance(data, 0, data.length, false);
            android.graphics.Bitmap decodeRegion = newInstance.decodeRegion(cropRect, new android.graphics.BitmapFactory.Options());
            newInstance.recycle();
            if (decodeRegion == null) {
                throw new androidx.camera.core.internal.utils.ImageUtil.CodecFailedException("Decode byte array failed.", androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED);
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            if (!decodeRegion.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream)) {
                throw new androidx.camera.core.internal.utils.ImageUtil.CodecFailedException("Encode bitmap failed.", androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.ENCODE_FAILED);
            }
            decodeRegion.recycle();
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException unused) {
            throw new androidx.camera.core.internal.utils.ImageUtil.CodecFailedException("Decode byte array failed.", androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED);
        } catch (java.lang.IllegalArgumentException e) {
            throw new androidx.camera.core.internal.utils.ImageUtil.CodecFailedException("Decode byte array failed with illegal argument." + e, androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED);
        }
    }

    public static boolean isAspectRatioValid(android.util.Rational aspectRatio) {
        return (aspectRatio == null || aspectRatio.floatValue() <= 0.0f || aspectRatio.isNaN()) ? false : true;
    }

    public static boolean isAspectRatioValid(android.util.Size sourceSize, android.util.Rational aspectRatio) {
        return aspectRatio != null && aspectRatio.floatValue() > 0.0f && isCropAspectRatioHasEffect(sourceSize, aspectRatio) && !aspectRatio.isNaN();
    }

    public static android.graphics.Rect computeCropRectFromAspectRatio(android.util.Size sourceSize, android.util.Rational aspectRatio) {
        int i;
        if (!isAspectRatioValid(aspectRatio)) {
            androidx.camera.core.Logger.w(TAG, "Invalid view ratio.");
            return null;
        }
        int width = sourceSize.getWidth();
        int height = sourceSize.getHeight();
        float f = width;
        float f2 = height;
        float f3 = f / f2;
        int numerator = aspectRatio.getNumerator();
        int denominator = aspectRatio.getDenominator();
        int i2 = 0;
        if (aspectRatio.floatValue() > f3) {
            int round = java.lang.Math.round((f / numerator) * denominator);
            i = (height - round) / 2;
            height = round;
        } else {
            int round2 = java.lang.Math.round((f2 / denominator) * numerator);
            i2 = (width - round2) / 2;
            width = round2;
            i = 0;
        }
        return new android.graphics.Rect(i2, i, width + i2, height + i);
    }

    private static byte[] nv21ToJpeg(byte[] nv21, int width, int height, android.graphics.Rect cropRect) throws androidx.camera.core.internal.utils.ImageUtil.CodecFailedException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(nv21, 17, width, height, null);
        if (cropRect == null) {
            cropRect = new android.graphics.Rect(0, 0, width, height);
        }
        if (!yuvImage.compressToJpeg(cropRect, 100, byteArrayOutputStream)) {
            throw new androidx.camera.core.internal.utils.ImageUtil.CodecFailedException("YuvImage failed to encode jpeg.", androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.ENCODE_FAILED);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static boolean isCropAspectRatioHasEffect(android.util.Size sourceSize, android.util.Rational aspectRatio) {
        int width = sourceSize.getWidth();
        int height = sourceSize.getHeight();
        float numerator = aspectRatio.getNumerator();
        float denominator = aspectRatio.getDenominator();
        return (height == java.lang.Math.round((((float) width) / numerator) * denominator) && width == java.lang.Math.round((((float) height) / denominator) * numerator)) ? false : true;
    }

    private static android.util.Rational inverseRational(android.util.Rational rational) {
        return rational == null ? rational : new android.util.Rational(rational.getDenominator(), rational.getNumerator());
    }

    private static boolean shouldCropImage(androidx.camera.core.ImageProxy image) {
        return !new android.util.Size(image.getCropRect().width(), image.getCropRect().height()).equals(new android.util.Size(image.getWidth(), image.getHeight()));
    }

    private static byte[] jpegImageToJpegByteArray(androidx.camera.core.ImageProxy image) throws androidx.camera.core.internal.utils.ImageUtil.CodecFailedException {
        java.nio.ByteBuffer buffer = image.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return shouldCropImage(image) ? cropByteArray(bArr, image.getCropRect()) : bArr;
    }

    private static byte[] yuvImageToJpegByteArray(androidx.camera.core.ImageProxy image) throws androidx.camera.core.internal.utils.ImageUtil.CodecFailedException {
        return nv21ToJpeg(yuv_420_888toNv21(image), image.getWidth(), image.getHeight(), shouldCropImage(image) ? image.getCropRect() : null);
    }

    public static final class CodecFailedException extends java.lang.Exception {
        private androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType mFailureType;

        public enum FailureType {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        CodecFailedException(java.lang.String message) {
            super(message);
            this.mFailureType = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.UNKNOWN;
        }

        CodecFailedException(java.lang.String message, androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType failureType) {
            super(message);
            this.mFailureType = failureType;
        }

        public androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType getFailureType() {
            return this.mFailureType;
        }
    }
}
