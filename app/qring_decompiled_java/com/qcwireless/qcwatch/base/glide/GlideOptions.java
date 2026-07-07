package com.qcwireless.qcwatch.base.glide;

/* loaded from: /tmp/dex/classes2.dex */
public final class GlideOptions extends com.bumptech.glide.request.RequestOptions implements java.lang.Cloneable {
    private static com.qcwireless.qcwatch.base.glide.GlideOptions centerCropTransform2;
    private static com.qcwireless.qcwatch.base.glide.GlideOptions centerInsideTransform1;
    private static com.qcwireless.qcwatch.base.glide.GlideOptions circleCropTransform3;
    private static com.qcwireless.qcwatch.base.glide.GlideOptions fitCenterTransform0;
    private static com.qcwireless.qcwatch.base.glide.GlideOptions noAnimation5;
    private static com.qcwireless.qcwatch.base.glide.GlideOptions noTransformation4;

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.RequestOptions apply(com.bumptech.glide.request.BaseRequestOptions options) {
        return apply2((com.bumptech.glide.request.BaseRequestOptions<?>) options);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.RequestOptions decode(java.lang.Class clazz) {
        return decode2((java.lang.Class<?>) clazz);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.RequestOptions optionalTransform(com.bumptech.glide.load.Transformation transformation) {
        return optionalTransform2((com.bumptech.glide.load.Transformation<android.graphics.Bitmap>) transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.RequestOptions set(com.bumptech.glide.load.Option option, java.lang.Object y) {
        return set2((com.bumptech.glide.load.Option<com.bumptech.glide.load.Option>) option, (com.bumptech.glide.load.Option) y);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.RequestOptions transform(com.bumptech.glide.load.Transformation transformation) {
        return transform2((com.bumptech.glide.load.Transformation<android.graphics.Bitmap>) transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @java.lang.SafeVarargs
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.RequestOptions transform(com.bumptech.glide.load.Transformation[] transformations) {
        return transform2((com.bumptech.glide.load.Transformation<android.graphics.Bitmap>[]) transformations);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @java.lang.SafeVarargs
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.RequestOptions transforms(com.bumptech.glide.load.Transformation[] transformations) {
        return transforms2((com.bumptech.glide.load.Transformation<android.graphics.Bitmap>[]) transformations);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions sizeMultiplierOf(float value) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().sizeMultiplier(value);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions diskCacheStrategyOf(com.bumptech.glide.load.engine.DiskCacheStrategy strategy) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().diskCacheStrategy(strategy);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions priorityOf(com.bumptech.glide.Priority priority) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().priority(priority);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions placeholderOf(android.graphics.drawable.Drawable drawable) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().placeholder(drawable);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions placeholderOf(int id) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().placeholder(id);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions errorOf(android.graphics.drawable.Drawable drawable) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().error(drawable);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions errorOf(int id) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().error(id);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions skipMemoryCacheOf(boolean skipMemoryCache) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().skipMemoryCache(skipMemoryCache);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions overrideOf(int width, int height) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().override(width, height);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions overrideOf(int size) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().override(size);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions signatureOf(com.bumptech.glide.load.Key key) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().signature(key);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions fitCenterTransform() {
        if (fitCenterTransform0 == null) {
            fitCenterTransform0 = new com.qcwireless.qcwatch.base.glide.GlideOptions().fitCenter().autoClone();
        }
        return fitCenterTransform0;
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions centerInsideTransform() {
        if (centerInsideTransform1 == null) {
            centerInsideTransform1 = new com.qcwireless.qcwatch.base.glide.GlideOptions().centerInside().autoClone();
        }
        return centerInsideTransform1;
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions centerCropTransform() {
        if (centerCropTransform2 == null) {
            centerCropTransform2 = new com.qcwireless.qcwatch.base.glide.GlideOptions().centerCrop().autoClone();
        }
        return centerCropTransform2;
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions circleCropTransform() {
        if (circleCropTransform3 == null) {
            circleCropTransform3 = new com.qcwireless.qcwatch.base.glide.GlideOptions().circleCrop().autoClone();
        }
        return circleCropTransform3;
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions bitmapTransform(com.bumptech.glide.load.Transformation<android.graphics.Bitmap> transformation) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().transform2(transformation);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions noTransformation() {
        if (noTransformation4 == null) {
            noTransformation4 = new com.qcwireless.qcwatch.base.glide.GlideOptions().dontTransform().autoClone();
        }
        return noTransformation4;
    }

    public static <T> com.qcwireless.qcwatch.base.glide.GlideOptions option(com.bumptech.glide.load.Option<T> option, T t) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().set2((com.bumptech.glide.load.Option<com.bumptech.glide.load.Option<T>>) option, (com.bumptech.glide.load.Option<T>) t);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions decodeTypeOf(java.lang.Class<?> clazz) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().decode2(clazz);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions formatOf(com.bumptech.glide.load.DecodeFormat format) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().format(format);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions frameOf(long value) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().frame(value);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions downsampleOf(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy strategy) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().downsample(strategy);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions timeoutOf(int value) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().timeout(value);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions encodeQualityOf(int value) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().encodeQuality(value);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions encodeFormatOf(android.graphics.Bitmap.CompressFormat format) {
        return new com.qcwireless.qcwatch.base.glide.GlideOptions().encodeFormat(format);
    }

    public static com.qcwireless.qcwatch.base.glide.GlideOptions noAnimation() {
        if (noAnimation5 == null) {
            noAnimation5 = new com.qcwireless.qcwatch.base.glide.GlideOptions().dontAnimate().autoClone();
        }
        return noAnimation5;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions sizeMultiplier(float value) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.sizeMultiplier(value);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions useUnlimitedSourceGeneratorsPool(boolean flag) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.useUnlimitedSourceGeneratorsPool(flag);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions useAnimationPool(boolean flag) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.useAnimationPool(flag);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions onlyRetrieveFromCache(boolean flag) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.onlyRetrieveFromCache(flag);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy strategy) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.diskCacheStrategy(strategy);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions priority(com.bumptech.glide.Priority priority) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.priority(priority);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions placeholder(android.graphics.drawable.Drawable drawable) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.placeholder(drawable);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions placeholder(int id) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.placeholder(id);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions fallback(android.graphics.drawable.Drawable drawable) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.fallback(drawable);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions fallback(int id) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.fallback(id);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions error(android.graphics.drawable.Drawable drawable) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.error(drawable);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions error(int id) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.error(id);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions theme(android.content.res.Resources.Theme theme) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.theme(theme);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions skipMemoryCache(boolean skip) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.skipMemoryCache(skip);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions override(int width, int height) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.override(width, height);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions override(int size) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.override(size);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions signature(com.bumptech.glide.load.Key key) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.signature(key);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* renamed from: clone, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.request.RequestOptions mo6clone() {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.mo6clone();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* renamed from: set, reason: avoid collision after fix types in other method */
    public <Y> com.bumptech.glide.request.RequestOptions set2(com.bumptech.glide.load.Option<Y> option, Y y) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.set((com.bumptech.glide.load.Option<com.bumptech.glide.load.Option<Y>>) option, (com.bumptech.glide.load.Option<Y>) y);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* renamed from: decode, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.request.RequestOptions decode2(java.lang.Class<?> clazz) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.decode(clazz);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions encodeFormat(android.graphics.Bitmap.CompressFormat format) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.encodeFormat(format);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions encodeQuality(int value) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.encodeQuality(value);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions frame(long value) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.frame(value);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions format(com.bumptech.glide.load.DecodeFormat format) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.format(format);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions disallowHardwareConfig() {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.disallowHardwareConfig();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions downsample(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy strategy) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.downsample(strategy);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions timeout(int value) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.timeout(value);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions optionalCenterCrop() {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.optionalCenterCrop();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions centerCrop() {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.centerCrop();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions optionalFitCenter() {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.optionalFitCenter();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions fitCenter() {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.fitCenter();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions optionalCenterInside() {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.optionalCenterInside();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions centerInside() {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.centerInside();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions optionalCircleCrop() {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.optionalCircleCrop();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions circleCrop() {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.circleCrop();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* renamed from: transform, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.request.RequestOptions transform2(com.bumptech.glide.load.Transformation<android.graphics.Bitmap> transformation) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.transform(transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @java.lang.SafeVarargs
    /* renamed from: transform, reason: avoid collision after fix types in other method */
    public final com.bumptech.glide.request.RequestOptions transform2(com.bumptech.glide.load.Transformation<android.graphics.Bitmap>... transformations) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.transform(transformations);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @java.lang.SafeVarargs
    @java.lang.Deprecated
    /* renamed from: transforms, reason: avoid collision after fix types in other method */
    public final com.bumptech.glide.request.RequestOptions transforms2(com.bumptech.glide.load.Transformation<android.graphics.Bitmap>... transformations) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.transforms(transformations);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* renamed from: optionalTransform, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.request.RequestOptions optionalTransform2(com.bumptech.glide.load.Transformation<android.graphics.Bitmap> transformation) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.optionalTransform(transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public <Y> com.bumptech.glide.request.RequestOptions optionalTransform(java.lang.Class<Y> clazz, com.bumptech.glide.load.Transformation<Y> transformation) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.optionalTransform((java.lang.Class) clazz, (com.bumptech.glide.load.Transformation) transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public <Y> com.bumptech.glide.request.RequestOptions transform(java.lang.Class<Y> clazz, com.bumptech.glide.load.Transformation<Y> transformation) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.transform((java.lang.Class) clazz, (com.bumptech.glide.load.Transformation) transformation);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions dontTransform() {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.dontTransform();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions dontAnimate() {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.dontAnimate();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.request.RequestOptions apply2(com.bumptech.glide.request.BaseRequestOptions<?> options) {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.apply(options);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions lock() {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.lock();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public com.bumptech.glide.request.RequestOptions autoClone() {
        return (com.qcwireless.qcwatch.base.glide.GlideOptions) super.autoClone();
    }
}
