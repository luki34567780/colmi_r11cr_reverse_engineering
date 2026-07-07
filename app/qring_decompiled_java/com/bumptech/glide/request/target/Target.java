package com.bumptech.glide.request.target;

/* loaded from: /tmp/dex/classes2.dex */
public interface Target<R> extends com.bumptech.glide.manager.LifecycleListener {
    public static final int SIZE_ORIGINAL = Integer.MIN_VALUE;

    com.bumptech.glide.request.Request getRequest();

    void getSize(com.bumptech.glide.request.target.SizeReadyCallback sizeReadyCallback);

    void onLoadCleared(android.graphics.drawable.Drawable drawable);

    void onLoadFailed(android.graphics.drawable.Drawable drawable);

    void onLoadStarted(android.graphics.drawable.Drawable drawable);

    void onResourceReady(R r, com.bumptech.glide.request.transition.Transition<? super R> transition);

    void removeCallback(com.bumptech.glide.request.target.SizeReadyCallback sizeReadyCallback);

    void setRequest(com.bumptech.glide.request.Request request);
}
