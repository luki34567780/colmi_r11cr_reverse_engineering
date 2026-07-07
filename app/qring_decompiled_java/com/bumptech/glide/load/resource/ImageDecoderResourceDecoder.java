package com.bumptech.glide.load.resource;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class ImageDecoderResourceDecoder<T> implements com.bumptech.glide.load.ResourceDecoder<android.graphics.ImageDecoder.Source, T> {
    private static final java.lang.String TAG = "ImageDecoder";
    final com.bumptech.glide.load.resource.bitmap.HardwareConfigState hardwareConfigState = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.getInstance();

    protected abstract com.bumptech.glide.load.engine.Resource<T> decode(android.graphics.ImageDecoder.Source source, int i, int i2, android.graphics.ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws java.io.IOException;

    public final boolean handles(android.graphics.ImageDecoder.Source source, com.bumptech.glide.load.Options options) {
        return true;
    }

    public final com.bumptech.glide.load.engine.Resource<T> decode(android.graphics.ImageDecoder.Source source, final int i, final int i2, com.bumptech.glide.load.Options options) throws java.io.IOException {
        final com.bumptech.glide.load.DecodeFormat decodeFormat = (com.bumptech.glide.load.DecodeFormat) options.get(com.bumptech.glide.load.resource.bitmap.Downsampler.DECODE_FORMAT);
        final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy downsampleStrategy = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy) options.get(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.OPTION);
        final boolean z = options.get(com.bumptech.glide.load.resource.bitmap.Downsampler.ALLOW_HARDWARE_CONFIG) != null && ((java.lang.Boolean) options.get(com.bumptech.glide.load.resource.bitmap.Downsampler.ALLOW_HARDWARE_CONFIG)).booleanValue();
        final com.bumptech.glide.load.PreferredColorSpace preferredColorSpace = (com.bumptech.glide.load.PreferredColorSpace) options.get(com.bumptech.glide.load.resource.bitmap.Downsampler.PREFERRED_COLOR_SPACE);
        return decode(source, i, i2, new android.graphics.ImageDecoder.OnHeaderDecodedListener() { // from class: com.bumptech.glide.load.resource.ImageDecoderResourceDecoder.1
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source2) {
                boolean z2 = false;
                if (com.bumptech.glide.load.resource.ImageDecoderResourceDecoder.this.hardwareConfigState.isHardwareConfigAllowed(i, i2, z, false)) {
                    imageDecoder.setAllocator(3);
                } else {
                    imageDecoder.setAllocator(1);
                }
                if (decodeFormat == com.bumptech.glide.load.DecodeFormat.PREFER_RGB_565) {
                    imageDecoder.setMemorySizePolicy(0);
                }
                imageDecoder.setOnPartialImageListener(new android.graphics.ImageDecoder.OnPartialImageListener() { // from class: com.bumptech.glide.load.resource.ImageDecoderResourceDecoder.1.1
                    @Override // android.graphics.ImageDecoder.OnPartialImageListener
                    public boolean onPartialImage(android.graphics.ImageDecoder.DecodeException decodeException) {
                        return false;
                    }
                });
                android.util.Size size = imageInfo.getSize();
                int i3 = i;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = size.getWidth();
                }
                int i4 = i2;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = size.getHeight();
                }
                float scaleFactor = downsampleStrategy.getScaleFactor(size.getWidth(), size.getHeight(), i3, i4);
                int round = java.lang.Math.round(size.getWidth() * scaleFactor);
                int round2 = java.lang.Math.round(size.getHeight() * scaleFactor);
                if (android.util.Log.isLoggable(com.bumptech.glide.load.resource.ImageDecoderResourceDecoder.TAG, 2)) {
                    android.util.Log.v(com.bumptech.glide.load.resource.ImageDecoderResourceDecoder.TAG, "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + scaleFactor);
                }
                imageDecoder.setTargetSize(round, round2);
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    if (preferredColorSpace == com.bumptech.glide.load.PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                        z2 = true;
                    }
                    imageDecoder.setTargetColorSpace(android.graphics.ColorSpace.get(z2 ? android.graphics.ColorSpace.Named.DISPLAY_P3 : android.graphics.ColorSpace.Named.SRGB));
                    return;
                }
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    imageDecoder.setTargetColorSpace(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB));
                }
            }
        });
    }
}
