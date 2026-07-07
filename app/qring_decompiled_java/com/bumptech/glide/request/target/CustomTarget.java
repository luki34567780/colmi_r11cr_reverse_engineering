package com.bumptech.glide.request.target;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class CustomTarget<T> implements com.bumptech.glide.request.target.Target<T> {
    private final int height;
    private com.bumptech.glide.request.Request request;
    private final int width;

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadFailed(android.graphics.drawable.Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadStarted(android.graphics.drawable.Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void removeCallback(com.bumptech.glide.request.target.SizeReadyCallback sizeReadyCallback) {
    }

    public CustomTarget() {
        this(com.bumptech.glide.request.target.Target.SIZE_ORIGINAL, com.bumptech.glide.request.target.Target.SIZE_ORIGINAL);
    }

    public CustomTarget(int i, int i2) {
        if (!com.bumptech.glide.util.Util.isValidDimensions(i, i2)) {
            throw new java.lang.IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
        }
        this.width = i;
        this.height = i2;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(com.bumptech.glide.request.target.SizeReadyCallback sizeReadyCallback) {
        sizeReadyCallback.onSizeReady(this.width, this.height);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void setRequest(com.bumptech.glide.request.Request request) {
        this.request = request;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final com.bumptech.glide.request.Request getRequest() {
        return this.request;
    }
}
