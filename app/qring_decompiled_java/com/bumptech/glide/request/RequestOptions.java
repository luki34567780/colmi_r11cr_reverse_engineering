package com.bumptech.glide.request;

/* loaded from: /tmp/dex/classes2.dex */
public class RequestOptions extends com.bumptech.glide.request.BaseRequestOptions<com.bumptech.glide.request.RequestOptions> {
    private static com.bumptech.glide.request.RequestOptions centerCropOptions;
    private static com.bumptech.glide.request.RequestOptions centerInsideOptions;
    private static com.bumptech.glide.request.RequestOptions circleCropOptions;
    private static com.bumptech.glide.request.RequestOptions fitCenterOptions;
    private static com.bumptech.glide.request.RequestOptions noAnimationOptions;
    private static com.bumptech.glide.request.RequestOptions noTransformOptions;
    private static com.bumptech.glide.request.RequestOptions skipMemoryCacheFalseOptions;
    private static com.bumptech.glide.request.RequestOptions skipMemoryCacheTrueOptions;

    public static com.bumptech.glide.request.RequestOptions sizeMultiplierOf(float f) {
        return new com.bumptech.glide.request.RequestOptions().sizeMultiplier(f);
    }

    public static com.bumptech.glide.request.RequestOptions diskCacheStrategyOf(com.bumptech.glide.load.engine.DiskCacheStrategy diskCacheStrategy) {
        return new com.bumptech.glide.request.RequestOptions().diskCacheStrategy(diskCacheStrategy);
    }

    public static com.bumptech.glide.request.RequestOptions priorityOf(com.bumptech.glide.Priority priority) {
        return new com.bumptech.glide.request.RequestOptions().priority(priority);
    }

    public static com.bumptech.glide.request.RequestOptions placeholderOf(android.graphics.drawable.Drawable drawable) {
        return new com.bumptech.glide.request.RequestOptions().placeholder(drawable);
    }

    public static com.bumptech.glide.request.RequestOptions placeholderOf(int i) {
        return new com.bumptech.glide.request.RequestOptions().placeholder(i);
    }

    public static com.bumptech.glide.request.RequestOptions errorOf(android.graphics.drawable.Drawable drawable) {
        return new com.bumptech.glide.request.RequestOptions().error(drawable);
    }

    public static com.bumptech.glide.request.RequestOptions errorOf(int i) {
        return new com.bumptech.glide.request.RequestOptions().error(i);
    }

    public static com.bumptech.glide.request.RequestOptions skipMemoryCacheOf(boolean z) {
        if (z) {
            if (skipMemoryCacheTrueOptions == null) {
                skipMemoryCacheTrueOptions = new com.bumptech.glide.request.RequestOptions().skipMemoryCache(true).autoClone();
            }
            return skipMemoryCacheTrueOptions;
        }
        if (skipMemoryCacheFalseOptions == null) {
            skipMemoryCacheFalseOptions = new com.bumptech.glide.request.RequestOptions().skipMemoryCache(false).autoClone();
        }
        return skipMemoryCacheFalseOptions;
    }

    public static com.bumptech.glide.request.RequestOptions overrideOf(int i, int i2) {
        return new com.bumptech.glide.request.RequestOptions().override(i, i2);
    }

    public static com.bumptech.glide.request.RequestOptions overrideOf(int i) {
        return overrideOf(i, i);
    }

    public static com.bumptech.glide.request.RequestOptions signatureOf(com.bumptech.glide.load.Key key) {
        return new com.bumptech.glide.request.RequestOptions().signature(key);
    }

    public static com.bumptech.glide.request.RequestOptions fitCenterTransform() {
        if (fitCenterOptions == null) {
            fitCenterOptions = new com.bumptech.glide.request.RequestOptions().fitCenter().autoClone();
        }
        return fitCenterOptions;
    }

    public static com.bumptech.glide.request.RequestOptions centerInsideTransform() {
        if (centerInsideOptions == null) {
            centerInsideOptions = new com.bumptech.glide.request.RequestOptions().centerInside().autoClone();
        }
        return centerInsideOptions;
    }

    public static com.bumptech.glide.request.RequestOptions centerCropTransform() {
        if (centerCropOptions == null) {
            centerCropOptions = new com.bumptech.glide.request.RequestOptions().centerCrop().autoClone();
        }
        return centerCropOptions;
    }

    public static com.bumptech.glide.request.RequestOptions circleCropTransform() {
        if (circleCropOptions == null) {
            circleCropOptions = new com.bumptech.glide.request.RequestOptions().circleCrop().autoClone();
        }
        return circleCropOptions;
    }

    public static com.bumptech.glide.request.RequestOptions bitmapTransform(com.bumptech.glide.load.Transformation<android.graphics.Bitmap> transformation) {
        return new com.bumptech.glide.request.RequestOptions().transform(transformation);
    }

    public static com.bumptech.glide.request.RequestOptions noTransformation() {
        if (noTransformOptions == null) {
            noTransformOptions = new com.bumptech.glide.request.RequestOptions().dontTransform().autoClone();
        }
        return noTransformOptions;
    }

    public static <T> com.bumptech.glide.request.RequestOptions option(com.bumptech.glide.load.Option<T> option, T t) {
        return new com.bumptech.glide.request.RequestOptions().set(option, t);
    }

    public static com.bumptech.glide.request.RequestOptions decodeTypeOf(java.lang.Class<?> cls) {
        return new com.bumptech.glide.request.RequestOptions().decode(cls);
    }

    public static com.bumptech.glide.request.RequestOptions formatOf(com.bumptech.glide.load.DecodeFormat decodeFormat) {
        return new com.bumptech.glide.request.RequestOptions().format(decodeFormat);
    }

    public static com.bumptech.glide.request.RequestOptions frameOf(long j) {
        return new com.bumptech.glide.request.RequestOptions().frame(j);
    }

    public static com.bumptech.glide.request.RequestOptions downsampleOf(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy downsampleStrategy) {
        return new com.bumptech.glide.request.RequestOptions().downsample(downsampleStrategy);
    }

    public static com.bumptech.glide.request.RequestOptions timeoutOf(int i) {
        return new com.bumptech.glide.request.RequestOptions().timeout(i);
    }

    public static com.bumptech.glide.request.RequestOptions encodeQualityOf(int i) {
        return new com.bumptech.glide.request.RequestOptions().encodeQuality(i);
    }

    public static com.bumptech.glide.request.RequestOptions encodeFormatOf(android.graphics.Bitmap.CompressFormat compressFormat) {
        return new com.bumptech.glide.request.RequestOptions().encodeFormat(compressFormat);
    }

    public static com.bumptech.glide.request.RequestOptions noAnimation() {
        if (noAnimationOptions == null) {
            noAnimationOptions = new com.bumptech.glide.request.RequestOptions().dontAnimate().autoClone();
        }
        return noAnimationOptions;
    }
}
