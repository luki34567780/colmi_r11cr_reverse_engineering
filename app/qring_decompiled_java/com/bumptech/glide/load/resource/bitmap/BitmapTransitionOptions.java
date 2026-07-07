package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public final class BitmapTransitionOptions extends com.bumptech.glide.TransitionOptions<com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions, android.graphics.Bitmap> {
    public static com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions withCrossFade() {
        return new com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions().crossFade();
    }

    public static com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions withCrossFade(int i) {
        return new com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions().crossFade(i);
    }

    public static com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions withCrossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory drawableCrossFadeFactory) {
        return new com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions().crossFade(drawableCrossFadeFactory);
    }

    public static com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions withCrossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder builder) {
        return new com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions().crossFade(builder);
    }

    public static com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions withWrapped(com.bumptech.glide.request.transition.TransitionFactory<android.graphics.drawable.Drawable> transitionFactory) {
        return new com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions().transitionUsing(transitionFactory);
    }

    public static com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions with(com.bumptech.glide.request.transition.TransitionFactory<android.graphics.Bitmap> transitionFactory) {
        return (com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions) new com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions().transition(transitionFactory);
    }

    public com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions crossFade() {
        return crossFade(new com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder());
    }

    public com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions crossFade(int i) {
        return crossFade(new com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder(i));
    }

    public com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions crossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory drawableCrossFadeFactory) {
        return transitionUsing(drawableCrossFadeFactory);
    }

    public com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions transitionUsing(com.bumptech.glide.request.transition.TransitionFactory<android.graphics.drawable.Drawable> transitionFactory) {
        return (com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions) transition(new com.bumptech.glide.request.transition.BitmapTransitionFactory(transitionFactory));
    }

    public com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions crossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder builder) {
        return transitionUsing(builder.build());
    }
}
