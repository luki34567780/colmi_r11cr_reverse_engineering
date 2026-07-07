package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes.dex */
public abstract class BaseKeyframeAnimation<K, A> {
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper<K> keyframesWrapper;
    protected com.airbnb.lottie.value.LottieValueCallback<A> valueCallback;
    final java.util.List<com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener> listeners = new java.util.ArrayList(1);
    private boolean isDiscrete = false;
    protected float progress = 0.0f;
    private A cachedGetValue = null;
    private float cachedStartDelayProgress = -1.0f;
    private float cachedEndProgress = -1.0f;

    public interface AnimationListener {
        void onValueChanged();
    }

    private interface KeyframesWrapper<T> {
        com.airbnb.lottie.value.Keyframe<T> getCurrentKeyframe();

        float getEndProgress();

        float getStartDelayProgress();

        boolean isCachedValueEnabled(float f);

        boolean isEmpty();

        boolean isValueChanged(float f);
    }

    abstract A getValue(com.airbnb.lottie.value.Keyframe<K> keyframe, float f);

    BaseKeyframeAnimation(java.util.List<? extends com.airbnb.lottie.value.Keyframe<K>> list) {
        this.keyframesWrapper = wrap(list);
    }

    public void setIsDiscrete() {
        this.isDiscrete = true;
    }

    public void addUpdateListener(com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener animationListener) {
        this.listeners.add(animationListener);
    }

    public void setProgress(float f) {
        if (this.keyframesWrapper.isEmpty()) {
            return;
        }
        if (f < getStartDelayProgress()) {
            f = getStartDelayProgress();
        } else if (f > getEndProgress()) {
            f = getEndProgress();
        }
        if (f == this.progress) {
            return;
        }
        this.progress = f;
        if (this.keyframesWrapper.isValueChanged(f)) {
            notifyListeners();
        }
    }

    public void notifyListeners() {
        for (int i = 0; i < this.listeners.size(); i++) {
            this.listeners.get(i).onValueChanged();
        }
    }

    protected com.airbnb.lottie.value.Keyframe<K> getCurrentKeyframe() {
        com.airbnb.lottie.L.beginSection("BaseKeyframeAnimation#getCurrentKeyframe");
        com.airbnb.lottie.value.Keyframe<K> currentKeyframe = this.keyframesWrapper.getCurrentKeyframe();
        com.airbnb.lottie.L.endSection("BaseKeyframeAnimation#getCurrentKeyframe");
        return currentKeyframe;
    }

    float getLinearCurrentKeyframeProgress() {
        if (this.isDiscrete) {
            return 0.0f;
        }
        com.airbnb.lottie.value.Keyframe<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.isStatic()) {
            return 0.0f;
        }
        return (this.progress - currentKeyframe.getStartProgress()) / (currentKeyframe.getEndProgress() - currentKeyframe.getStartProgress());
    }

    protected float getInterpolatedCurrentKeyframeProgress() {
        com.airbnb.lottie.value.Keyframe<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.isStatic()) {
            return 0.0f;
        }
        return currentKeyframe.interpolator.getInterpolation(getLinearCurrentKeyframeProgress());
    }

    private float getStartDelayProgress() {
        if (this.cachedStartDelayProgress == -1.0f) {
            this.cachedStartDelayProgress = this.keyframesWrapper.getStartDelayProgress();
        }
        return this.cachedStartDelayProgress;
    }

    float getEndProgress() {
        if (this.cachedEndProgress == -1.0f) {
            this.cachedEndProgress = this.keyframesWrapper.getEndProgress();
        }
        return this.cachedEndProgress;
    }

    public A getValue() {
        A value;
        float linearCurrentKeyframeProgress = getLinearCurrentKeyframeProgress();
        if (this.valueCallback == null && this.keyframesWrapper.isCachedValueEnabled(linearCurrentKeyframeProgress)) {
            return this.cachedGetValue;
        }
        com.airbnb.lottie.value.Keyframe<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.xInterpolator != null && currentKeyframe.yInterpolator != null) {
            value = getValue(currentKeyframe, linearCurrentKeyframeProgress, currentKeyframe.xInterpolator.getInterpolation(linearCurrentKeyframeProgress), currentKeyframe.yInterpolator.getInterpolation(linearCurrentKeyframeProgress));
        } else {
            value = getValue(currentKeyframe, getInterpolatedCurrentKeyframeProgress());
        }
        this.cachedGetValue = value;
        return value;
    }

    public float getProgress() {
        return this.progress;
    }

    public void setValueCallback(com.airbnb.lottie.value.LottieValueCallback<A> lottieValueCallback) {
        com.airbnb.lottie.value.LottieValueCallback<A> lottieValueCallback2 = this.valueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.valueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }

    protected A getValue(com.airbnb.lottie.value.Keyframe<K> keyframe, float f, float f2, float f3) {
        throw new java.lang.UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper<T> wrap(java.util.List<? extends com.airbnb.lottie.value.Keyframe<T>> list) {
        if (list.isEmpty()) {
            return new com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.EmptyKeyframeWrapper();
        }
        if (list.size() == 1) {
            return new com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.SingleKeyframeWrapper(list);
        }
        return new com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapperImpl(list);
    }

    private static final class EmptyKeyframeWrapper<T> implements com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper<T> {
        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getEndProgress() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getStartDelayProgress() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isEmpty() {
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isValueChanged(float f) {
            return false;
        }

        private EmptyKeyframeWrapper() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public com.airbnb.lottie.value.Keyframe<T> getCurrentKeyframe() {
            throw new java.lang.IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isCachedValueEnabled(float f) {
            throw new java.lang.IllegalStateException("not implemented");
        }
    }

    private static final class SingleKeyframeWrapper<T> implements com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper<T> {
        private float cachedInterpolatedProgress = -1.0f;
        private final com.airbnb.lottie.value.Keyframe<T> keyframe;

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isEmpty() {
            return false;
        }

        SingleKeyframeWrapper(java.util.List<? extends com.airbnb.lottie.value.Keyframe<T>> list) {
            this.keyframe = list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isValueChanged(float f) {
            return !this.keyframe.isStatic();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public com.airbnb.lottie.value.Keyframe<T> getCurrentKeyframe() {
            return this.keyframe;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getStartDelayProgress() {
            return this.keyframe.getStartProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getEndProgress() {
            return this.keyframe.getEndProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isCachedValueEnabled(float f) {
            if (this.cachedInterpolatedProgress == f) {
                return true;
            }
            this.cachedInterpolatedProgress = f;
            return false;
        }
    }

    private static final class KeyframesWrapperImpl<T> implements com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper<T> {
        private com.airbnb.lottie.value.Keyframe<T> cachedCurrentKeyframe = null;
        private float cachedInterpolatedProgress = -1.0f;
        private com.airbnb.lottie.value.Keyframe<T> currentKeyframe = findKeyframe(0.0f);
        private final java.util.List<? extends com.airbnb.lottie.value.Keyframe<T>> keyframes;

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isEmpty() {
            return false;
        }

        KeyframesWrapperImpl(java.util.List<? extends com.airbnb.lottie.value.Keyframe<T>> list) {
            this.keyframes = list;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isValueChanged(float f) {
            if (this.currentKeyframe.containsProgress(f)) {
                return !this.currentKeyframe.isStatic();
            }
            this.currentKeyframe = findKeyframe(f);
            return true;
        }

        private com.airbnb.lottie.value.Keyframe<T> findKeyframe(float f) {
            java.util.List<? extends com.airbnb.lottie.value.Keyframe<T>> list = this.keyframes;
            com.airbnb.lottie.value.Keyframe<T> keyframe = list.get(list.size() - 1);
            if (f >= keyframe.getStartProgress()) {
                return keyframe;
            }
            for (int size = this.keyframes.size() - 2; size >= 1; size--) {
                com.airbnb.lottie.value.Keyframe<T> keyframe2 = this.keyframes.get(size);
                if (this.currentKeyframe != keyframe2 && keyframe2.containsProgress(f)) {
                    return keyframe2;
                }
            }
            return this.keyframes.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public com.airbnb.lottie.value.Keyframe<T> getCurrentKeyframe() {
            return this.currentKeyframe;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getStartDelayProgress() {
            return this.keyframes.get(0).getStartProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getEndProgress() {
            return this.keyframes.get(r0.size() - 1).getEndProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isCachedValueEnabled(float f) {
            com.airbnb.lottie.value.Keyframe<T> keyframe = this.cachedCurrentKeyframe;
            com.airbnb.lottie.value.Keyframe<T> keyframe2 = this.currentKeyframe;
            if (keyframe == keyframe2 && this.cachedInterpolatedProgress == f) {
                return true;
            }
            this.cachedCurrentKeyframe = keyframe2;
            this.cachedInterpolatedProgress = f;
            return false;
        }
    }
}
