package com.bumptech.glide.util;

/* loaded from: /tmp/dex/classes2.dex */
public class ViewPreloadSizeProvider<T> implements com.bumptech.glide.ListPreloader.PreloadSizeProvider<T>, com.bumptech.glide.request.target.SizeReadyCallback {
    private int[] size;
    private com.bumptech.glide.util.ViewPreloadSizeProvider.SizeViewTarget viewTarget;

    public ViewPreloadSizeProvider() {
    }

    public ViewPreloadSizeProvider(android.view.View view) {
        com.bumptech.glide.util.ViewPreloadSizeProvider.SizeViewTarget sizeViewTarget = new com.bumptech.glide.util.ViewPreloadSizeProvider.SizeViewTarget(view);
        this.viewTarget = sizeViewTarget;
        sizeViewTarget.getSize(this);
    }

    public int[] getPreloadSize(T t, int i, int i2) {
        int[] iArr = this.size;
        if (iArr == null) {
            return null;
        }
        return java.util.Arrays.copyOf(iArr, iArr.length);
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public void onSizeReady(int i, int i2) {
        this.size = new int[]{i, i2};
        this.viewTarget = null;
    }

    public void setView(android.view.View view) {
        if (this.size == null && this.viewTarget == null) {
            com.bumptech.glide.util.ViewPreloadSizeProvider.SizeViewTarget sizeViewTarget = new com.bumptech.glide.util.ViewPreloadSizeProvider.SizeViewTarget(view);
            this.viewTarget = sizeViewTarget;
            sizeViewTarget.getSize(this);
        }
    }

    static final class SizeViewTarget extends com.bumptech.glide.request.target.CustomViewTarget<android.view.View, java.lang.Object> {
        @Override // com.bumptech.glide.request.target.Target
        public void onLoadFailed(android.graphics.drawable.Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.CustomViewTarget
        protected void onResourceCleared(android.graphics.drawable.Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(java.lang.Object obj, com.bumptech.glide.request.transition.Transition<? super java.lang.Object> transition) {
        }

        SizeViewTarget(android.view.View view) {
            super(view);
        }
    }
}
