package com.qcwireless.qcwatch.base.glide;

/* loaded from: /tmp/dex/classes2.dex */
public class GlideRequests extends com.bumptech.glide.RequestManager {
    public /* bridge */ /* synthetic */ com.bumptech.glide.RequestManager addDefaultRequestListener(com.bumptech.glide.request.RequestListener listener) {
        return m197addDefaultRequestListener((com.bumptech.glide.request.RequestListener<java.lang.Object>) listener);
    }

    public GlideRequests(com.bumptech.glide.Glide glide, com.bumptech.glide.manager.Lifecycle lifecycle, com.bumptech.glide.manager.RequestManagerTreeNode treeNode, android.content.Context context) {
        super(glide, lifecycle, treeNode, context);
    }

    public <ResourceType> com.qcwireless.qcwatch.base.glide.GlideRequest<ResourceType> as(java.lang.Class<ResourceType> resourceClass) {
        return new com.qcwireless.qcwatch.base.glide.GlideRequest<>(this.glide, this, resourceClass, this.context);
    }

    public synchronized com.qcwireless.qcwatch.base.glide.GlideRequests applyDefaultRequestOptions(com.bumptech.glide.request.RequestOptions options) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequests) super.applyDefaultRequestOptions(options);
    }

    public synchronized com.qcwireless.qcwatch.base.glide.GlideRequests setDefaultRequestOptions(com.bumptech.glide.request.RequestOptions options) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequests) super.setDefaultRequestOptions(options);
    }

    /* renamed from: addDefaultRequestListener, reason: collision with other method in class */
    public com.qcwireless.qcwatch.base.glide.GlideRequests m197addDefaultRequestListener(com.bumptech.glide.request.RequestListener<java.lang.Object> listener) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequests) super.addDefaultRequestListener(listener);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<android.graphics.Bitmap> asBitmap() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.asBitmap();
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<com.bumptech.glide.load.resource.gif.GifDrawable> asGif() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.asGif();
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<android.graphics.drawable.Drawable> asDrawable() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.asDrawable();
    }

    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<android.graphics.drawable.Drawable> m215load(android.graphics.Bitmap bitmap) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(bitmap);
    }

    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<android.graphics.drawable.Drawable> m216load(android.graphics.drawable.Drawable drawable) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(drawable);
    }

    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<android.graphics.drawable.Drawable> m221load(java.lang.String string) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(string);
    }

    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<android.graphics.drawable.Drawable> m217load(android.net.Uri uri) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(uri);
    }

    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<android.graphics.drawable.Drawable> m218load(java.io.File file) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(file);
    }

    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<android.graphics.drawable.Drawable> m219load(java.lang.Integer id) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(id);
    }

    @java.lang.Deprecated
    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<android.graphics.drawable.Drawable> m222load(java.net.URL url) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(url);
    }

    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<android.graphics.drawable.Drawable> m223load(byte[] bytes) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(bytes);
    }

    /* renamed from: load, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.base.glide.GlideRequest<android.graphics.drawable.Drawable> m220load(java.lang.Object o) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.load(o);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<java.io.File> downloadOnly() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.downloadOnly();
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<java.io.File> download(java.lang.Object o) {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.download(o);
    }

    public com.qcwireless.qcwatch.base.glide.GlideRequest<java.io.File> asFile() {
        return (com.qcwireless.qcwatch.base.glide.GlideRequest) super.asFile();
    }

    protected void setRequestOptions(com.bumptech.glide.request.RequestOptions toSet) {
        if (toSet instanceof com.qcwireless.qcwatch.base.glide.GlideOptions) {
            super.setRequestOptions(toSet);
        } else {
            super.setRequestOptions(new com.qcwireless.qcwatch.base.glide.GlideOptions().apply2((com.bumptech.glide.request.BaseRequestOptions<?>) toSet));
        }
    }
}
