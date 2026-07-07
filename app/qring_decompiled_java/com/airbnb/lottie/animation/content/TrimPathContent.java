package com.airbnb.lottie.animation.content;

/* loaded from: classes.dex */
public class TrimPathContent implements com.airbnb.lottie.animation.content.Content, com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener {
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> endAnimation;
    private final boolean hidden;
    private final java.util.List<com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener> listeners = new java.util.ArrayList();
    private final java.lang.String name;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> offsetAnimation;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> startAnimation;
    private final com.airbnb.lottie.model.content.ShapeTrimPath.Type type;

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> list, java.util.List<com.airbnb.lottie.animation.content.Content> list2) {
    }

    public TrimPathContent(com.airbnb.lottie.model.layer.BaseLayer baseLayer, com.airbnb.lottie.model.content.ShapeTrimPath shapeTrimPath) {
        this.name = shapeTrimPath.getName();
        this.hidden = shapeTrimPath.isHidden();
        this.type = shapeTrimPath.getType();
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> createAnimation = shapeTrimPath.getStart().createAnimation();
        this.startAnimation = createAnimation;
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> createAnimation2 = shapeTrimPath.getEnd().createAnimation();
        this.endAnimation = createAnimation2;
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> createAnimation3 = shapeTrimPath.getOffset().createAnimation();
        this.offsetAnimation = createAnimation3;
        baseLayer.addAnimation(createAnimation);
        baseLayer.addAnimation(createAnimation2);
        baseLayer.addAnimation(createAnimation3);
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
        createAnimation3.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        for (int i = 0; i < this.listeners.size(); i++) {
            this.listeners.get(i).onValueChanged();
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.name;
    }

    void addListener(com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener animationListener) {
        this.listeners.add(animationListener);
    }

    com.airbnb.lottie.model.content.ShapeTrimPath.Type getType() {
        return this.type;
    }

    public com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getStart() {
        return this.startAnimation;
    }

    public com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getEnd() {
        return this.endAnimation;
    }

    public com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getOffset() {
        return this.offsetAnimation;
    }

    public boolean isHidden() {
        return this.hidden;
    }
}
