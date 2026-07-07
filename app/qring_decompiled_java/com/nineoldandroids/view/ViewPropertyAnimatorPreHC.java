package com.nineoldandroids.view;

/* loaded from: /tmp/dex/classes2.dex */
class ViewPropertyAnimatorPreHC extends com.nineoldandroids.view.ViewPropertyAnimator {
    private static final int ALPHA = 512;
    private static final int NONE = 0;
    private static final int ROTATION = 16;
    private static final int ROTATION_X = 32;
    private static final int ROTATION_Y = 64;
    private static final int SCALE_X = 4;
    private static final int SCALE_Y = 8;
    private static final int TRANSFORM_MASK = 511;
    private static final int TRANSLATION_X = 1;
    private static final int TRANSLATION_Y = 2;
    private static final int X = 128;
    private static final int Y = 256;
    private long mDuration;
    private android.view.animation.Interpolator mInterpolator;
    private final com.nineoldandroids.view.animation.AnimatorProxy mProxy;
    private final java.lang.ref.WeakReference<android.view.View> mView;
    private boolean mDurationSet = false;
    private long mStartDelay = 0;
    private boolean mStartDelaySet = false;
    private boolean mInterpolatorSet = false;
    private com.nineoldandroids.animation.Animator.AnimatorListener mListener = null;
    private com.nineoldandroids.view.ViewPropertyAnimatorPreHC.AnimatorEventListener mAnimatorEventListener = new com.nineoldandroids.view.ViewPropertyAnimatorPreHC.AnimatorEventListener();
    java.util.ArrayList<com.nineoldandroids.view.ViewPropertyAnimatorPreHC.NameValuesHolder> mPendingAnimations = new java.util.ArrayList<>();
    private java.lang.Runnable mAnimationStarter = new java.lang.Runnable() { // from class: com.nineoldandroids.view.ViewPropertyAnimatorPreHC.1
        @Override // java.lang.Runnable
        public void run() {
            com.nineoldandroids.view.ViewPropertyAnimatorPreHC.this.startAnimation();
        }
    };
    private java.util.HashMap<com.nineoldandroids.animation.Animator, com.nineoldandroids.view.ViewPropertyAnimatorPreHC.PropertyBundle> mAnimatorMap = new java.util.HashMap<>();

    private static class PropertyBundle {
        java.util.ArrayList<com.nineoldandroids.view.ViewPropertyAnimatorPreHC.NameValuesHolder> mNameValuesHolder;
        int mPropertyMask;

        PropertyBundle(int i, java.util.ArrayList<com.nineoldandroids.view.ViewPropertyAnimatorPreHC.NameValuesHolder> arrayList) {
            this.mPropertyMask = i;
            this.mNameValuesHolder = arrayList;
        }

        boolean cancel(int i) {
            java.util.ArrayList<com.nineoldandroids.view.ViewPropertyAnimatorPreHC.NameValuesHolder> arrayList;
            if ((this.mPropertyMask & i) != 0 && (arrayList = this.mNameValuesHolder) != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.mNameValuesHolder.get(i2).mNameConstant == i) {
                        this.mNameValuesHolder.remove(i2);
                        this.mPropertyMask = (~i) & this.mPropertyMask;
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private static class NameValuesHolder {
        float mDeltaValue;
        float mFromValue;
        int mNameConstant;

        NameValuesHolder(int i, float f, float f2) {
            this.mNameConstant = i;
            this.mFromValue = f;
            this.mDeltaValue = f2;
        }
    }

    ViewPropertyAnimatorPreHC(android.view.View view) {
        this.mView = new java.lang.ref.WeakReference<>(view);
        this.mProxy = com.nineoldandroids.view.animation.AnimatorProxy.wrap(view);
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator setDuration(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Animators cannot have negative duration: " + j);
        }
        this.mDurationSet = true;
        this.mDuration = j;
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public long getDuration() {
        if (this.mDurationSet) {
            return this.mDuration;
        }
        return new com.nineoldandroids.animation.ValueAnimator().getDuration();
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public long getStartDelay() {
        if (this.mStartDelaySet) {
            return this.mStartDelay;
        }
        return 0L;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator setStartDelay(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Animators cannot have negative duration: " + j);
        }
        this.mStartDelaySet = true;
        this.mStartDelay = j;
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator setInterpolator(android.view.animation.Interpolator interpolator) {
        this.mInterpolatorSet = true;
        this.mInterpolator = interpolator;
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator setListener(com.nineoldandroids.animation.Animator.AnimatorListener animatorListener) {
        this.mListener = animatorListener;
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public void start() {
        startAnimation();
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public void cancel() {
        if (this.mAnimatorMap.size() > 0) {
            java.util.Iterator it = ((java.util.HashMap) this.mAnimatorMap.clone()).keySet().iterator();
            while (it.hasNext()) {
                ((com.nineoldandroids.animation.Animator) it.next()).cancel();
            }
        }
        this.mPendingAnimations.clear();
        android.view.View view = this.mView.get();
        if (view != null) {
            view.removeCallbacks(this.mAnimationStarter);
        }
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator x(float f) {
        animateProperty(128, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator xBy(float f) {
        animatePropertyBy(128, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator y(float f) {
        animateProperty(256, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator yBy(float f) {
        animatePropertyBy(256, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator rotation(float f) {
        animateProperty(16, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator rotationBy(float f) {
        animatePropertyBy(16, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator rotationX(float f) {
        animateProperty(32, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator rotationXBy(float f) {
        animatePropertyBy(32, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator rotationY(float f) {
        animateProperty(64, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator rotationYBy(float f) {
        animatePropertyBy(64, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator translationX(float f) {
        animateProperty(1, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator translationXBy(float f) {
        animatePropertyBy(1, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator translationY(float f) {
        animateProperty(2, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator translationYBy(float f) {
        animatePropertyBy(2, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator scaleX(float f) {
        animateProperty(4, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator scaleXBy(float f) {
        animatePropertyBy(4, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator scaleY(float f) {
        animateProperty(8, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator scaleYBy(float f) {
        animatePropertyBy(8, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator alpha(float f) {
        animateProperty(512, f);
        return this;
    }

    @Override // com.nineoldandroids.view.ViewPropertyAnimator
    public com.nineoldandroids.view.ViewPropertyAnimator alphaBy(float f) {
        animatePropertyBy(512, f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startAnimation() {
        com.nineoldandroids.animation.ValueAnimator ofFloat = com.nineoldandroids.animation.ValueAnimator.ofFloat(1.0f);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.mPendingAnimations.clone();
        this.mPendingAnimations.clear();
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i |= ((com.nineoldandroids.view.ViewPropertyAnimatorPreHC.NameValuesHolder) arrayList.get(i2)).mNameConstant;
        }
        this.mAnimatorMap.put(ofFloat, new com.nineoldandroids.view.ViewPropertyAnimatorPreHC.PropertyBundle(i, arrayList));
        ofFloat.addUpdateListener(this.mAnimatorEventListener);
        ofFloat.addListener(this.mAnimatorEventListener);
        if (this.mStartDelaySet) {
            ofFloat.setStartDelay(this.mStartDelay);
        }
        if (this.mDurationSet) {
            ofFloat.setDuration(this.mDuration);
        }
        if (this.mInterpolatorSet) {
            ofFloat.setInterpolator(this.mInterpolator);
        }
        ofFloat.start();
    }

    private void animateProperty(int i, float f) {
        float value = getValue(i);
        animatePropertyBy(i, value, f - value);
    }

    private void animatePropertyBy(int i, float f) {
        animatePropertyBy(i, getValue(i), f);
    }

    private void animatePropertyBy(int i, float f, float f2) {
        if (this.mAnimatorMap.size() > 0) {
            com.nineoldandroids.animation.Animator animator = null;
            java.util.Iterator<com.nineoldandroids.animation.Animator> it = this.mAnimatorMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.nineoldandroids.animation.Animator next = it.next();
                com.nineoldandroids.view.ViewPropertyAnimatorPreHC.PropertyBundle propertyBundle = this.mAnimatorMap.get(next);
                if (propertyBundle.cancel(i) && propertyBundle.mPropertyMask == 0) {
                    animator = next;
                    break;
                }
            }
            if (animator != null) {
                animator.cancel();
            }
        }
        this.mPendingAnimations.add(new com.nineoldandroids.view.ViewPropertyAnimatorPreHC.NameValuesHolder(i, f, f2));
        android.view.View view = this.mView.get();
        if (view != null) {
            view.removeCallbacks(this.mAnimationStarter);
            view.post(this.mAnimationStarter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i, float f) {
        if (i == 1) {
            this.mProxy.setTranslationX(f);
            return;
        }
        if (i == 2) {
            this.mProxy.setTranslationY(f);
            return;
        }
        if (i == 4) {
            this.mProxy.setScaleX(f);
            return;
        }
        if (i == 8) {
            this.mProxy.setScaleY(f);
            return;
        }
        if (i == 16) {
            this.mProxy.setRotation(f);
            return;
        }
        if (i == 32) {
            this.mProxy.setRotationX(f);
            return;
        }
        if (i == 64) {
            this.mProxy.setRotationY(f);
            return;
        }
        if (i == 128) {
            this.mProxy.setX(f);
        } else if (i == 256) {
            this.mProxy.setY(f);
        } else {
            if (i != 512) {
                return;
            }
            this.mProxy.setAlpha(f);
        }
    }

    private float getValue(int i) {
        if (i == 1) {
            return this.mProxy.getTranslationX();
        }
        if (i == 2) {
            return this.mProxy.getTranslationY();
        }
        if (i == 4) {
            return this.mProxy.getScaleX();
        }
        if (i == 8) {
            return this.mProxy.getScaleY();
        }
        if (i == 16) {
            return this.mProxy.getRotation();
        }
        if (i == 32) {
            return this.mProxy.getRotationX();
        }
        if (i == 64) {
            return this.mProxy.getRotationY();
        }
        if (i == 128) {
            return this.mProxy.getX();
        }
        if (i == 256) {
            return this.mProxy.getY();
        }
        if (i != 512) {
            return 0.0f;
        }
        return this.mProxy.getAlpha();
    }

    private class AnimatorEventListener implements com.nineoldandroids.animation.Animator.AnimatorListener, com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener {
        private AnimatorEventListener() {
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationStart(com.nineoldandroids.animation.Animator animator) {
            if (com.nineoldandroids.view.ViewPropertyAnimatorPreHC.this.mListener != null) {
                com.nineoldandroids.view.ViewPropertyAnimatorPreHC.this.mListener.onAnimationStart(animator);
            }
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationCancel(com.nineoldandroids.animation.Animator animator) {
            if (com.nineoldandroids.view.ViewPropertyAnimatorPreHC.this.mListener != null) {
                com.nineoldandroids.view.ViewPropertyAnimatorPreHC.this.mListener.onAnimationCancel(animator);
            }
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationRepeat(com.nineoldandroids.animation.Animator animator) {
            if (com.nineoldandroids.view.ViewPropertyAnimatorPreHC.this.mListener != null) {
                com.nineoldandroids.view.ViewPropertyAnimatorPreHC.this.mListener.onAnimationRepeat(animator);
            }
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationEnd(com.nineoldandroids.animation.Animator animator) {
            if (com.nineoldandroids.view.ViewPropertyAnimatorPreHC.this.mListener != null) {
                com.nineoldandroids.view.ViewPropertyAnimatorPreHC.this.mListener.onAnimationEnd(animator);
            }
            com.nineoldandroids.view.ViewPropertyAnimatorPreHC.this.mAnimatorMap.remove(animator);
            if (com.nineoldandroids.view.ViewPropertyAnimatorPreHC.this.mAnimatorMap.isEmpty()) {
                com.nineoldandroids.view.ViewPropertyAnimatorPreHC.this.mListener = null;
            }
        }

        @Override // com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(com.nineoldandroids.animation.ValueAnimator valueAnimator) {
            android.view.View view;
            float animatedFraction = valueAnimator.getAnimatedFraction();
            com.nineoldandroids.view.ViewPropertyAnimatorPreHC.PropertyBundle propertyBundle = (com.nineoldandroids.view.ViewPropertyAnimatorPreHC.PropertyBundle) com.nineoldandroids.view.ViewPropertyAnimatorPreHC.this.mAnimatorMap.get(valueAnimator);
            if ((propertyBundle.mPropertyMask & com.nineoldandroids.view.ViewPropertyAnimatorPreHC.TRANSFORM_MASK) != 0 && (view = (android.view.View) com.nineoldandroids.view.ViewPropertyAnimatorPreHC.this.mView.get()) != null) {
                view.invalidate();
            }
            java.util.ArrayList<com.nineoldandroids.view.ViewPropertyAnimatorPreHC.NameValuesHolder> arrayList = propertyBundle.mNameValuesHolder;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    com.nineoldandroids.view.ViewPropertyAnimatorPreHC.NameValuesHolder nameValuesHolder = arrayList.get(i);
                    com.nineoldandroids.view.ViewPropertyAnimatorPreHC.this.setValue(nameValuesHolder.mNameConstant, nameValuesHolder.mFromValue + (nameValuesHolder.mDeltaValue * animatedFraction));
                }
            }
            android.view.View view2 = (android.view.View) com.nineoldandroids.view.ViewPropertyAnimatorPreHC.this.mView.get();
            if (view2 != null) {
                view2.invalidate();
            }
        }
    }
}
