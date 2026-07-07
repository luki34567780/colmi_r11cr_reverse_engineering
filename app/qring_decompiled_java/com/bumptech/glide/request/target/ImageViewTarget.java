package com.bumptech.glide.request.target;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class ImageViewTarget<Z> extends com.bumptech.glide.request.target.ViewTarget<android.widget.ImageView, Z> implements com.bumptech.glide.request.transition.Transition.ViewAdapter {
    private android.graphics.drawable.Animatable animatable;

    protected abstract void setResource(Z z);

    public ImageViewTarget(android.widget.ImageView imageView) {
        super(imageView);
    }

    @java.lang.Deprecated
    public ImageViewTarget(android.widget.ImageView imageView, boolean z) {
        super(imageView, z);
    }

    @Override // com.bumptech.glide.request.transition.Transition.ViewAdapter
    public android.graphics.drawable.Drawable getCurrentDrawable() {
        return ((android.widget.ImageView) this.view).getDrawable();
    }

    @Override // com.bumptech.glide.request.transition.Transition.ViewAdapter
    public void setDrawable(android.graphics.drawable.Drawable drawable) {
        ((android.widget.ImageView) this.view).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadStarted(android.graphics.drawable.Drawable drawable) {
        super.onLoadStarted(drawable);
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadFailed(android.graphics.drawable.Drawable drawable) {
        super.onLoadFailed(drawable);
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadCleared(android.graphics.drawable.Drawable drawable) {
        super.onLoadCleared(drawable);
        android.graphics.drawable.Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.stop();
        }
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onResourceReady(Z z, com.bumptech.glide.request.transition.Transition<? super Z> transition) {
        if (transition == null || !transition.transition(z, this)) {
            setResourceInternal(z);
        } else {
            maybeUpdateAnimatable(z);
        }
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
        android.graphics.drawable.Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
        android.graphics.drawable.Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.stop();
        }
    }

    private void setResourceInternal(Z z) {
        setResource(z);
        maybeUpdateAnimatable(z);
    }

    private void maybeUpdateAnimatable(Z z) {
        if (z instanceof android.graphics.drawable.Animatable) {
            android.graphics.drawable.Animatable animatable = (android.graphics.drawable.Animatable) z;
            this.animatable = animatable;
            animatable.start();
            return;
        }
        this.animatable = null;
    }
}
