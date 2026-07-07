package com.bumptech.glide.load.resource.drawable;

/* loaded from: /tmp/dex/classes2.dex */
public final class DrawableTransitionOptions extends com.bumptech.glide.TransitionOptions<com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions, android.graphics.drawable.Drawable> {
    public static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions withCrossFade() {
        return new com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions().crossFade();
    }

    public static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions withCrossFade(int i) {
        return new com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions().crossFade(i);
    }

    public static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions withCrossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory drawableCrossFadeFactory) {
        return new com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions().crossFade(drawableCrossFadeFactory);
    }

    public static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions withCrossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder builder) {
        return new com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions().crossFade(builder);
    }

    public static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions with(com.bumptech.glide.request.transition.TransitionFactory<android.graphics.drawable.Drawable> transitionFactory) {
        return (com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions) new com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions().transition(transitionFactory);
    }

    public com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions crossFade() {
        return crossFade(new com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder());
    }

    public com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions crossFade(int i) {
        return crossFade(new com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder(i));
    }

    public com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions crossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory drawableCrossFadeFactory) {
        return (com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions) transition(drawableCrossFadeFactory);
    }

    public com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions crossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder builder) {
        return crossFade(builder.build());
    }
}
