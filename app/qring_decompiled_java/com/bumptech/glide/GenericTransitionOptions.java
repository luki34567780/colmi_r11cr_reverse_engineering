package com.bumptech.glide;

/* loaded from: classes.dex */
public final class GenericTransitionOptions<TranscodeType> extends com.bumptech.glide.TransitionOptions<com.bumptech.glide.GenericTransitionOptions<TranscodeType>, TranscodeType> {
    public static <TranscodeType> com.bumptech.glide.GenericTransitionOptions<TranscodeType> withNoTransition() {
        return new com.bumptech.glide.GenericTransitionOptions().dontTransition();
    }

    public static <TranscodeType> com.bumptech.glide.GenericTransitionOptions<TranscodeType> with(int i) {
        return new com.bumptech.glide.GenericTransitionOptions().transition(i);
    }

    public static <TranscodeType> com.bumptech.glide.GenericTransitionOptions<TranscodeType> with(com.bumptech.glide.request.transition.ViewPropertyTransition.Animator animator) {
        return new com.bumptech.glide.GenericTransitionOptions().transition(animator);
    }

    public static <TranscodeType> com.bumptech.glide.GenericTransitionOptions<TranscodeType> with(com.bumptech.glide.request.transition.TransitionFactory<? super TranscodeType> transitionFactory) {
        return new com.bumptech.glide.GenericTransitionOptions().transition(transitionFactory);
    }
}
