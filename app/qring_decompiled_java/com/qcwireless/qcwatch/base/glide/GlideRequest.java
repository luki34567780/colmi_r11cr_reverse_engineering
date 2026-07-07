package com.qcwireless.qcwatch.base.glide;

/* loaded from: /tmp/dex/classes2.dex */
public class GlideRequest<TranscodeType> extends com.bumptech.glide.RequestBuilder<TranscodeType> implements java.lang.Cloneable {
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestBuilder apply(com.bumptech.glide.request.BaseRequestOptions options) {
        return m122apply((com.bumptech.glide.request.BaseRequestOptions<?>) options);
    }

    /* renamed from: apply, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions m121apply(com.bumptech.glide.request.BaseRequestOptions baseRequestOptions) {
        return m122apply((com.bumptech.glide.request.BaseRequestOptions<?>) baseRequestOptions);
    }

    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions decode(java.lang.Class cls) {
        return m130decode((java.lang.Class<?>) cls);
    }

    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions optionalTransform(com.bumptech.glide.load.Transformation transformation) {
        return m173optionalTransform((com.bumptech.glide.load.Transformation<android.graphics.Bitmap>) transformation);
    }

    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions set(com.bumptech.glide.load.Option option, java.lang.Object obj) {
        return m180set((com.bumptech.glide.load.Option<com.bumptech.glide.load.Option>) option, (com.bumptech.glide.load.Option) obj);
    }

    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions transform(com.bumptech.glide.load.Transformation transformation) {
        return m190transform((com.bumptech.glide.load.Transformation<android.graphics.Bitmap>) transformation);
    }

    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions transform(com.bumptech.glide.load.Transformation[] transformationArr) {
        return m192transform((com.bumptech.glide.load.Transformation<android.graphics.Bitmap>[]) transformationArr);
    }

    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.BaseRequestOptions transforms(com.bumptech.glide.load.Transformation[] transformationArr) {
        return m193transforms((com.bumptech.glide.load.Transformation<android.graphics.Bitmap>[]) transformationArr);
    }

    GlideRequest(java.lang.Class<TranscodeType> transcodeClass, com.bumptech.glide.RequestBuilder<?> other) {
        super(transcodeClass, other);
    }

    GlideRequest(com.bumptech.glide.Glide glide, com.bumptech.glide.RequestManager requestManager, java.lang.Class<TranscodeType> transcodeClass, android.content.Context context) {
        super(glide, requestManager, transcodeClass, context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<java.io.File> getDownloadOnlyRequest() {
        return new com.qcwireless.qcwatch.base.glide.GlideRequest(java.io.File.class, this).m122apply((com.bumptech.glide.request.BaseRequestOptions<?>) DOWNLOAD_ONLY_OPTIONS);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> sizeMultiplier(float value) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.sizeMultiplier(value);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> useUnlimitedSourceGeneratorsPool(boolean flag) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.useUnlimitedSourceGeneratorsPool(flag);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> useAnimationPool(boolean flag) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.useAnimationPool(flag);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> onlyRetrieveFromCache(boolean flag) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.onlyRetrieveFromCache(flag);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy strategy) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.diskCacheStrategy(strategy);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> priority(com.bumptech.glide.Priority priority) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.priority(priority);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> placeholder(android.graphics.drawable.Drawable drawable) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.placeholder(drawable);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> placeholder(int id) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.placeholder(id);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> fallback(android.graphics.drawable.Drawable drawable) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.fallback(drawable);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> fallback(int id) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.fallback(id);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> error(android.graphics.drawable.Drawable drawable) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.error(drawable);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> error(int id) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.error(id);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> theme(android.content.res.Resources.Theme theme) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.theme(theme);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> skipMemoryCache(boolean skip) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.skipMemoryCache(skip);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> override(int width, int height) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.override(width, height);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> override(int size) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.override(size);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> signature(com.bumptech.glide.load.Key key) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.signature(key);
    }

    /* renamed from: set, reason: collision with other method in class */
    public <Y> com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m180set(com.bumptech.glide.load.Option<Y> option, Y y) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.set(option, y);
    }

    /* renamed from: decode, reason: collision with other method in class */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m130decode(java.lang.Class<?> clazz) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.decode(clazz);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> encodeFormat(android.graphics.Bitmap.CompressFormat format) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.encodeFormat(format);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> encodeQuality(int value) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.encodeQuality(value);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> frame(long value) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.frame(value);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> format(com.bumptech.glide.load.DecodeFormat format) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.format(format);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> disallowHardwareConfig() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.disallowHardwareConfig();
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> downsample(com.bumptech.glide.load.resource.bitmap.DownsampleStrategy strategy) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.downsample(strategy);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> timeout(int value) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.timeout(value);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> optionalCenterCrop() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.optionalCenterCrop();
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> centerCrop() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.centerCrop();
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> optionalFitCenter() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.optionalFitCenter();
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> fitCenter() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.fitCenter();
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> optionalCenterInside() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.optionalCenterInside();
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> centerInside() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.centerInside();
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> optionalCircleCrop() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.optionalCircleCrop();
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> circleCrop() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.circleCrop();
    }

    /* renamed from: transform, reason: collision with other method in class */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m190transform(com.bumptech.glide.load.Transformation<android.graphics.Bitmap> transformation) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.transform(transformation);
    }

    /* renamed from: transform, reason: collision with other method in class */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m192transform(com.bumptech.glide.load.Transformation<android.graphics.Bitmap>... transformations) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.transform(transformations);
    }

    @java.lang.Deprecated
    /* renamed from: transforms, reason: collision with other method in class */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m193transforms(com.bumptech.glide.load.Transformation<android.graphics.Bitmap>... transformations) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.transforms(transformations);
    }

    /* renamed from: optionalTransform, reason: collision with other method in class */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m173optionalTransform(com.bumptech.glide.load.Transformation<android.graphics.Bitmap> transformation) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.optionalTransform(transformation);
    }

    public <Y> com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> optionalTransform(java.lang.Class<Y> clazz, com.bumptech.glide.load.Transformation<Y> transformation) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.optionalTransform(clazz, transformation);
    }

    public <Y> com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> transform(java.lang.Class<Y> clazz, com.bumptech.glide.load.Transformation<Y> transformation) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.transform(clazz, transformation);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> dontTransform() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.dontTransform();
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> dontAnimate() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.dontAnimate();
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> lock() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.lock();
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> autoClone() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.autoClone();
    }

    /* renamed from: apply, reason: collision with other method in class */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m122apply(com.bumptech.glide.request.BaseRequestOptions<?> options) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.apply(options);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> transition(com.bumptech.glide.TransitionOptions<?, ? super TranscodeType> options) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.transition(options);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> listener(com.bumptech.glide.request.RequestListener<TranscodeType> listener) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.listener(listener);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> addListener(com.bumptech.glide.request.RequestListener<TranscodeType> listener) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.addListener(listener);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> error(com.bumptech.glide.RequestBuilder<TranscodeType> builder) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.error(builder);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> error(java.lang.Object o) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.error(o);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> thumbnail(com.bumptech.glide.RequestBuilder<TranscodeType> builder) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.thumbnail(builder);
    }

    @java.lang.SafeVarargs
    public final com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> thumbnail(com.bumptech.glide.RequestBuilder<TranscodeType>... builders) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.thumbnail(builders);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> thumbnail(java.util.List<com.bumptech.glide.RequestBuilder<TranscodeType>> list) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.thumbnail(list);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> thumbnail(float sizeMultiplier) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.thumbnail(sizeMultiplier);
    }

    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m163load(java.lang.Object o) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(o);
    }

    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m158load(android.graphics.Bitmap bitmap) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(bitmap);
    }

    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m159load(android.graphics.drawable.Drawable drawable) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(drawable);
    }

    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m164load(java.lang.String string) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(string);
    }

    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m160load(android.net.Uri uri) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(uri);
    }

    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m161load(java.io.File file) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(file);
    }

    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m162load(java.lang.Integer id) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(id);
    }

    @java.lang.Deprecated
    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m165load(java.net.URL url) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(url);
    }

    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m166load(byte[] bytes) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(bytes);
    }

    /* renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<TranscodeType> m129clone() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.clone();
    }
}
