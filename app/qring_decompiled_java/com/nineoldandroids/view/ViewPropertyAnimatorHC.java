package com.nineoldandroids.view;

/* loaded from: /tmp/dex/classes2.dex */
class ViewPropertyAnimatorHC extends com.nineoldandroids.view.ViewPropertyAnimator {
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
    private final java.lang.ref.WeakReference<android.view.View> mView;
    private boolean mDurationSet = false;
    private long mStartDelay = 0;
    private boolean mStartDelaySet = false;
    private boolean mInterpolatorSet = false;
    private com.nineoldandroids.animation.Animator.AnimatorListener mListener = null;
    private com.nineoldandroids.view.ViewPropertyAnimatorHC.AnimatorEventListener mAnimatorEventListener = new com.nineoldandroids.view.ViewPropertyAnimatorHC.AnimatorEventListener();
    java.util.ArrayList<com.nineoldandroids.view.ViewPropertyAnimatorHC.NameValuesHolder> mPendingAnimations = new java.util.ArrayList<>();
    private java.lang.Runnable mAnimationStarter = new java.lang.Runnable() { // from class: com.nineoldandroids.view.ViewPropertyAnimatorHC.1
        @Override // java.lang.Runnable
        public void run() {
            com.nineoldandroids.view.ViewPropertyAnimatorHC.this.startAnimation();
        }
    };
    private java.util.HashMap<com.nineoldandroids.animation.Animator, com.nineoldandroids.view.ViewPropertyAnimatorHC.PropertyBundle> mAnimatorMap = new java.util.HashMap<>();

    private static class PropertyBundle {
        java.util.ArrayList<com.nineoldandroids.view.ViewPropertyAnimatorHC.NameValuesHolder> mNameValuesHolder;
        int mPropertyMask;

        PropertyBundle(int i, java.util.ArrayList<com.nineoldandroids.view.ViewPropertyAnimatorHC.NameValuesHolder> arrayList) {
            this.mPropertyMask = i;
            this.mNameValuesHolder = arrayList;
        }

        boolean cancel(int i) {
            java.util.ArrayList<com.nineoldandroids.view.ViewPropertyAnimatorHC.NameValuesHolder> arrayList;
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

    ViewPropertyAnimatorHC(android.view.View view) {
        this.mView = new java.lang.ref.WeakReference<>(view);
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
            i |= ((com.nineoldandroids.view.ViewPropertyAnimatorHC.NameValuesHolder) arrayList.get(i2)).mNameConstant;
        }
        this.mAnimatorMap.put(ofFloat, new com.nineoldandroids.view.ViewPropertyAnimatorHC.PropertyBundle(i, arrayList));
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
                com.nineoldandroids.view.ViewPropertyAnimatorHC.PropertyBundle propertyBundle = this.mAnimatorMap.get(next);
                if (propertyBundle.cancel(i) && propertyBundle.mPropertyMask == 0) {
                    animator = next;
                    break;
                }
            }
            if (animator != null) {
                animator.cancel();
            }
        }
        this.mPendingAnimations.add(new com.nineoldandroids.view.ViewPropertyAnimatorHC.NameValuesHolder(i, f, f2));
        android.view.View view = this.mView.get();
        if (view != null) {
            view.removeCallbacks(this.mAnimationStarter);
            view.post(this.mAnimationStarter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i, float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            if (i == 1) {
                view.setTranslationX(f);
                return;
            }
            if (i == 2) {
                view.setTranslationY(f);
                return;
            }
            if (i == 4) {
                view.setScaleX(f);
                return;
            }
            if (i == 8) {
                view.setScaleY(f);
                return;
            }
            if (i == 16) {
                view.setRotation(f);
                return;
            }
            if (i == 32) {
                view.setRotationX(f);
                return;
            }
            if (i == 64) {
                view.setRotationY(f);
                return;
            }
            if (i == 128) {
                view.setX(f);
            } else if (i == 256) {
                view.setY(f);
            } else {
                if (i != 512) {
                    return;
                }
                view.setAlpha(f);
            }
        }
    }

    private float getValue(int i) {
        android.view.View view = this.mView.get();
        if (view == null) {
            return 0.0f;
        }
        if (i == 1) {
            return view.getTranslationX();
        }
        if (i == 2) {
            return view.getTranslationY();
        }
        if (i == 4) {
            return view.getScaleX();
        }
        if (i == 8) {
            return view.getScaleY();
        }
        if (i == 16) {
            return view.getRotation();
        }
        if (i == 32) {
            return view.getRotationX();
        }
        if (i == 64) {
            return view.getRotationY();
        }
        if (i == 128) {
            return view.getX();
        }
        if (i == 256) {
            return view.getY();
        }
        if (i != 512) {
            return 0.0f;
        }
        return view.getAlpha();
    }

    private class AnimatorEventListener implements com.nineoldandroids.animation.Animator.AnimatorListener, com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener {
        private AnimatorEventListener() {
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationStart(com.nineoldandroids.animation.Animator animator) {
            if (com.nineoldandroids.view.ViewPropertyAnimatorHC.this.mListener != null) {
                com.nineoldandroids.view.ViewPropertyAnimatorHC.this.mListener.onAnimationStart(animator);
            }
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationCancel(com.nineoldandroids.animation.Animator animator) {
            if (com.nineoldandroids.view.ViewPropertyAnimatorHC.this.mListener != null) {
                com.nineoldandroids.view.ViewPropertyAnimatorHC.this.mListener.onAnimationCancel(animator);
            }
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationRepeat(com.nineoldandroids.animation.Animator animator) {
            if (com.nineoldandroids.view.ViewPropertyAnimatorHC.this.mListener != null) {
                com.nineoldandroids.view.ViewPropertyAnimatorHC.this.mListener.onAnimationRepeat(animator);
            }
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationEnd(com.nineoldandroids.animation.Animator animator) {
            if (com.nineoldandroids.view.ViewPropertyAnimatorHC.this.mListener != null) {
                com.nineoldandroids.view.ViewPropertyAnimatorHC.this.mListener.onAnimationEnd(animator);
            }
            com.nineoldandroids.view.ViewPropertyAnimatorHC.this.mAnimatorMap.remove(animator);
            if (com.nineoldandroids.view.ViewPropertyAnimatorHC.this.mAnimatorMap.isEmpty()) {
                com.nineoldandroids.view.ViewPropertyAnimatorHC.this.mListener = null;
            }
        }

        @Override // com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(com.nineoldandroids.animation.ValueAnimator valueAnimator) {
            android.view.View view;
            float animatedFraction = valueAnimator.getAnimatedFraction();
            com.nineoldandroids.view.ViewPropertyAnimatorHC.PropertyBundle propertyBundle = (com.nineoldandroids.view.ViewPropertyAnimatorHC.PropertyBundle) com.nineoldandroids.view.ViewPropertyAnimatorHC.this.mAnimatorMap.get(valueAnimator);
            if ((propertyBundle.mPropertyMask & com.nineoldandroids.view.ViewPropertyAnimatorHC.TRANSFORM_MASK) != 0 && (view = (android.view.View) com.nineoldandroids.view.ViewPropertyAnimatorHC.this.mView.get()) != null) {
                view.invalidate();
            }
            java.util.ArrayList<com.nineoldandroids.view.ViewPropertyAnimatorHC.NameValuesHolder> arrayList = propertyBundle.mNameValuesHolder;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    com.nineoldandroids.view.ViewPropertyAnimatorHC.NameValuesHolder nameValuesHolder = arrayList.get(i);
                    com.nineoldandroids.view.ViewPropertyAnimatorHC.this.setValue(nameValuesHolder.mNameConstant, nameValuesHolder.mFromValue + (nameValuesHolder.mDeltaValue * animatedFraction));
                }
            }
            android.view.View view2 = (android.view.View) com.nineoldandroids.view.ViewPropertyAnimatorHC.this.mView.get();
            if (view2 != null) {
                view2.invalidate();
            }
        }
    }
}
