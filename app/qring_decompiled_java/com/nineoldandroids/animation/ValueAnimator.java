package com.nineoldandroids.animation;

/* loaded from: /tmp/dex/classes2.dex */
public class ValueAnimator extends com.nineoldandroids.animation.Animator {
    static final int ANIMATION_FRAME = 1;
    static final int ANIMATION_START = 0;
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    static final int RUNNING = 1;
    static final int SEEKED = 2;
    static final int STOPPED = 0;
    private long mDelayStartTime;
    long mStartTime;
    com.nineoldandroids.animation.PropertyValuesHolder[] mValues;
    java.util.HashMap<java.lang.String, com.nineoldandroids.animation.PropertyValuesHolder> mValuesMap;
    private static java.lang.ThreadLocal<com.nineoldandroids.animation.ValueAnimator.AnimationHandler> sAnimationHandler = new java.lang.ThreadLocal<>();
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator>> sAnimations = new java.lang.ThreadLocal<java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator>>() { // from class: com.nineoldandroids.animation.ValueAnimator.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator> initialValue() {
            return new java.util.ArrayList<>();
        }
    };
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator>> sPendingAnimations = new java.lang.ThreadLocal<java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator>>() { // from class: com.nineoldandroids.animation.ValueAnimator.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator> initialValue() {
            return new java.util.ArrayList<>();
        }
    };
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator>> sDelayedAnims = new java.lang.ThreadLocal<java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator>>() { // from class: com.nineoldandroids.animation.ValueAnimator.3
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator> initialValue() {
            return new java.util.ArrayList<>();
        }
    };
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator>> sEndingAnims = new java.lang.ThreadLocal<java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator>>() { // from class: com.nineoldandroids.animation.ValueAnimator.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator> initialValue() {
            return new java.util.ArrayList<>();
        }
    };
    private static final java.lang.ThreadLocal<java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator>> sReadyAnims = new java.lang.ThreadLocal<java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator>>() { // from class: com.nineoldandroids.animation.ValueAnimator.5
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator> initialValue() {
            return new java.util.ArrayList<>();
        }
    };
    private static final android.view.animation.Interpolator sDefaultInterpolator = new android.view.animation.AccelerateDecelerateInterpolator();
    private static final com.nineoldandroids.animation.TypeEvaluator sIntEvaluator = new com.nineoldandroids.animation.IntEvaluator();
    private static final com.nineoldandroids.animation.TypeEvaluator sFloatEvaluator = new com.nineoldandroids.animation.FloatEvaluator();
    private static final long DEFAULT_FRAME_DELAY = 10;
    private static long sFrameDelay = DEFAULT_FRAME_DELAY;
    long mSeekTime = -1;
    private boolean mPlayingBackwards = false;
    private int mCurrentIteration = 0;
    private float mCurrentFraction = 0.0f;
    private boolean mStartedDelay = false;
    int mPlayingState = 0;
    private boolean mRunning = false;
    private boolean mStarted = false;
    boolean mInitialized = false;
    private long mDuration = 300;
    private long mStartDelay = 0;
    private int mRepeatCount = 0;
    private int mRepeatMode = 1;
    private android.view.animation.Interpolator mInterpolator = sDefaultInterpolator;
    private java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener> mUpdateListeners = null;

    public interface AnimatorUpdateListener {
        void onAnimationUpdate(com.nineoldandroids.animation.ValueAnimator valueAnimator);
    }

    public static com.nineoldandroids.animation.ValueAnimator ofInt(int... iArr) {
        com.nineoldandroids.animation.ValueAnimator valueAnimator = new com.nineoldandroids.animation.ValueAnimator();
        valueAnimator.setIntValues(iArr);
        return valueAnimator;
    }

    public static com.nineoldandroids.animation.ValueAnimator ofFloat(float... fArr) {
        com.nineoldandroids.animation.ValueAnimator valueAnimator = new com.nineoldandroids.animation.ValueAnimator();
        valueAnimator.setFloatValues(fArr);
        return valueAnimator;
    }

    public static com.nineoldandroids.animation.ValueAnimator ofPropertyValuesHolder(com.nineoldandroids.animation.PropertyValuesHolder... propertyValuesHolderArr) {
        com.nineoldandroids.animation.ValueAnimator valueAnimator = new com.nineoldandroids.animation.ValueAnimator();
        valueAnimator.setValues(propertyValuesHolderArr);
        return valueAnimator;
    }

    public static com.nineoldandroids.animation.ValueAnimator ofObject(com.nineoldandroids.animation.TypeEvaluator typeEvaluator, java.lang.Object... objArr) {
        com.nineoldandroids.animation.ValueAnimator valueAnimator = new com.nineoldandroids.animation.ValueAnimator();
        valueAnimator.setObjectValues(objArr);
        valueAnimator.setEvaluator(typeEvaluator);
        return valueAnimator;
    }

    public void setIntValues(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        com.nineoldandroids.animation.PropertyValuesHolder[] propertyValuesHolderArr = this.mValues;
        if (propertyValuesHolderArr == null || propertyValuesHolderArr.length == 0) {
            setValues(com.nineoldandroids.animation.PropertyValuesHolder.ofInt("", iArr));
        } else {
            propertyValuesHolderArr[0].setIntValues(iArr);
        }
        this.mInitialized = false;
    }

    public void setFloatValues(float... fArr) {
        if (fArr == null || fArr.length == 0) {
            return;
        }
        com.nineoldandroids.animation.PropertyValuesHolder[] propertyValuesHolderArr = this.mValues;
        if (propertyValuesHolderArr == null || propertyValuesHolderArr.length == 0) {
            setValues(com.nineoldandroids.animation.PropertyValuesHolder.ofFloat("", fArr));
        } else {
            propertyValuesHolderArr[0].setFloatValues(fArr);
        }
        this.mInitialized = false;
    }

    public void setObjectValues(java.lang.Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        com.nineoldandroids.animation.PropertyValuesHolder[] propertyValuesHolderArr = this.mValues;
        if (propertyValuesHolderArr == null || propertyValuesHolderArr.length == 0) {
            setValues(com.nineoldandroids.animation.PropertyValuesHolder.ofObject("", (com.nineoldandroids.animation.TypeEvaluator) null, objArr));
        } else {
            propertyValuesHolderArr[0].setObjectValues(objArr);
        }
        this.mInitialized = false;
    }

    public void setValues(com.nineoldandroids.animation.PropertyValuesHolder... propertyValuesHolderArr) {
        int length = propertyValuesHolderArr.length;
        this.mValues = propertyValuesHolderArr;
        this.mValuesMap = new java.util.HashMap<>(length);
        for (com.nineoldandroids.animation.PropertyValuesHolder propertyValuesHolder : propertyValuesHolderArr) {
            this.mValuesMap.put(propertyValuesHolder.getPropertyName(), propertyValuesHolder);
        }
        this.mInitialized = false;
    }

    public com.nineoldandroids.animation.PropertyValuesHolder[] getValues() {
        return this.mValues;
    }

    void initAnimation() {
        if (this.mInitialized) {
            return;
        }
        int length = this.mValues.length;
        for (int i = 0; i < length; i++) {
            this.mValues[i].init();
        }
        this.mInitialized = true;
    }

    @Override // com.nineoldandroids.animation.Animator
    public com.nineoldandroids.animation.ValueAnimator setDuration(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Animators cannot have negative duration: " + j);
        }
        this.mDuration = j;
        return this;
    }

    @Override // com.nineoldandroids.animation.Animator
    public long getDuration() {
        return this.mDuration;
    }

    public void setCurrentPlayTime(long j) {
        initAnimation();
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        if (this.mPlayingState != 1) {
            this.mSeekTime = j;
            this.mPlayingState = 2;
        }
        this.mStartTime = currentAnimationTimeMillis - j;
        animationFrame(currentAnimationTimeMillis);
    }

    public long getCurrentPlayTime() {
        if (!this.mInitialized || this.mPlayingState == 0) {
            return 0L;
        }
        return android.view.animation.AnimationUtils.currentAnimationTimeMillis() - this.mStartTime;
    }

    private static class AnimationHandler extends android.os.Handler {
        private AnimationHandler() {
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            boolean z;
            java.util.ArrayList arrayList = (java.util.ArrayList) com.nineoldandroids.animation.ValueAnimator.sAnimations.get();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) com.nineoldandroids.animation.ValueAnimator.sDelayedAnims.get();
            int i = message.what;
            if (i == 0) {
                java.util.ArrayList arrayList3 = (java.util.ArrayList) com.nineoldandroids.animation.ValueAnimator.sPendingAnimations.get();
                z = arrayList.size() <= 0 && arrayList2.size() <= 0;
                while (arrayList3.size() > 0) {
                    java.util.ArrayList arrayList4 = (java.util.ArrayList) arrayList3.clone();
                    arrayList3.clear();
                    int size = arrayList4.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        com.nineoldandroids.animation.ValueAnimator valueAnimator = (com.nineoldandroids.animation.ValueAnimator) arrayList4.get(i2);
                        if (valueAnimator.mStartDelay == 0) {
                            valueAnimator.startAnimation();
                        } else {
                            arrayList2.add(valueAnimator);
                        }
                    }
                }
            } else if (i != 1) {
                return;
            } else {
                z = true;
            }
            long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
            java.util.ArrayList arrayList5 = (java.util.ArrayList) com.nineoldandroids.animation.ValueAnimator.sReadyAnims.get();
            java.util.ArrayList arrayList6 = (java.util.ArrayList) com.nineoldandroids.animation.ValueAnimator.sEndingAnims.get();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                com.nineoldandroids.animation.ValueAnimator valueAnimator2 = (com.nineoldandroids.animation.ValueAnimator) arrayList2.get(i3);
                if (valueAnimator2.delayedAnimationFrame(currentAnimationTimeMillis)) {
                    arrayList5.add(valueAnimator2);
                }
            }
            int size3 = arrayList5.size();
            if (size3 > 0) {
                for (int i4 = 0; i4 < size3; i4++) {
                    com.nineoldandroids.animation.ValueAnimator valueAnimator3 = (com.nineoldandroids.animation.ValueAnimator) arrayList5.get(i4);
                    valueAnimator3.startAnimation();
                    valueAnimator3.mRunning = true;
                    arrayList2.remove(valueAnimator3);
                }
                arrayList5.clear();
            }
            int size4 = arrayList.size();
            int i5 = 0;
            while (i5 < size4) {
                com.nineoldandroids.animation.ValueAnimator valueAnimator4 = (com.nineoldandroids.animation.ValueAnimator) arrayList.get(i5);
                if (valueAnimator4.animationFrame(currentAnimationTimeMillis)) {
                    arrayList6.add(valueAnimator4);
                }
                if (arrayList.size() == size4) {
                    i5++;
                } else {
                    size4--;
                    arrayList6.remove(valueAnimator4);
                }
            }
            if (arrayList6.size() > 0) {
                for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                    ((com.nineoldandroids.animation.ValueAnimator) arrayList6.get(i6)).endAnimation();
                }
                arrayList6.clear();
            }
            if (z) {
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    return;
                }
                sendEmptyMessageDelayed(1, java.lang.Math.max(0L, com.nineoldandroids.animation.ValueAnimator.sFrameDelay - (android.view.animation.AnimationUtils.currentAnimationTimeMillis() - currentAnimationTimeMillis)));
            }
        }
    }

    @Override // com.nineoldandroids.animation.Animator
    public long getStartDelay() {
        return this.mStartDelay;
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setStartDelay(long j) {
        this.mStartDelay = j;
    }

    public static long getFrameDelay() {
        return sFrameDelay;
    }

    public static void setFrameDelay(long j) {
        sFrameDelay = j;
    }

    public java.lang.Object getAnimatedValue() {
        com.nineoldandroids.animation.PropertyValuesHolder[] propertyValuesHolderArr = this.mValues;
        if (propertyValuesHolderArr == null || propertyValuesHolderArr.length <= 0) {
            return null;
        }
        return propertyValuesHolderArr[0].getAnimatedValue();
    }

    public java.lang.Object getAnimatedValue(java.lang.String str) {
        com.nineoldandroids.animation.PropertyValuesHolder propertyValuesHolder = this.mValuesMap.get(str);
        if (propertyValuesHolder != null) {
            return propertyValuesHolder.getAnimatedValue();
        }
        return null;
    }

    public void setRepeatCount(int i) {
        this.mRepeatCount = i;
    }

    public int getRepeatCount() {
        return this.mRepeatCount;
    }

    public void setRepeatMode(int i) {
        this.mRepeatMode = i;
    }

    public int getRepeatMode() {
        return this.mRepeatMode;
    }

    public void addUpdateListener(com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        if (this.mUpdateListeners == null) {
            this.mUpdateListeners = new java.util.ArrayList<>();
        }
        this.mUpdateListeners.add(animatorUpdateListener);
    }

    public void removeAllUpdateListeners() {
        java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener> arrayList = this.mUpdateListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
        this.mUpdateListeners = null;
    }

    public void removeUpdateListener(com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener> arrayList = this.mUpdateListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorUpdateListener);
        if (this.mUpdateListeners.size() == 0) {
            this.mUpdateListeners = null;
        }
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setInterpolator(android.view.animation.Interpolator interpolator) {
        if (interpolator != null) {
            this.mInterpolator = interpolator;
        } else {
            this.mInterpolator = new android.view.animation.LinearInterpolator();
        }
    }

    public android.view.animation.Interpolator getInterpolator() {
        return this.mInterpolator;
    }

    public void setEvaluator(com.nineoldandroids.animation.TypeEvaluator typeEvaluator) {
        com.nineoldandroids.animation.PropertyValuesHolder[] propertyValuesHolderArr;
        if (typeEvaluator == null || (propertyValuesHolderArr = this.mValues) == null || propertyValuesHolderArr.length <= 0) {
            return;
        }
        propertyValuesHolderArr[0].setEvaluator(typeEvaluator);
    }

    private void start(boolean z) {
        if (android.os.Looper.myLooper() == null) {
            throw new android.util.AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        this.mPlayingBackwards = z;
        this.mCurrentIteration = 0;
        this.mPlayingState = 0;
        this.mStarted = true;
        this.mStartedDelay = false;
        sPendingAnimations.get().add(this);
        if (this.mStartDelay == 0) {
            setCurrentPlayTime(getCurrentPlayTime());
            this.mPlayingState = 0;
            this.mRunning = true;
            if (this.mListeners != null) {
                java.util.ArrayList arrayList = (java.util.ArrayList) this.mListeners.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((com.nineoldandroids.animation.Animator.AnimatorListener) arrayList.get(i)).onAnimationStart(this);
                }
            }
        }
        com.nineoldandroids.animation.ValueAnimator.AnimationHandler animationHandler = sAnimationHandler.get();
        if (animationHandler == null) {
            animationHandler = new com.nineoldandroids.animation.ValueAnimator.AnimationHandler();
            sAnimationHandler.set(animationHandler);
        }
        animationHandler.sendEmptyMessage(0);
    }

    @Override // com.nineoldandroids.animation.Animator
    public void start() {
        start(false);
    }

    @Override // com.nineoldandroids.animation.Animator
    public void cancel() {
        if (this.mPlayingState != 0 || sPendingAnimations.get().contains(this) || sDelayedAnims.get().contains(this)) {
            if (this.mRunning && this.mListeners != null) {
                java.util.Iterator it = ((java.util.ArrayList) this.mListeners.clone()).iterator();
                while (it.hasNext()) {
                    ((com.nineoldandroids.animation.Animator.AnimatorListener) it.next()).onAnimationCancel(this);
                }
            }
            endAnimation();
        }
    }

    @Override // com.nineoldandroids.animation.Animator
    public void end() {
        if (!sAnimations.get().contains(this) && !sPendingAnimations.get().contains(this)) {
            this.mStartedDelay = false;
            startAnimation();
        } else if (!this.mInitialized) {
            initAnimation();
        }
        int i = this.mRepeatCount;
        if (i > 0 && (i & 1) == 1) {
            animateValue(0.0f);
        } else {
            animateValue(1.0f);
        }
        endAnimation();
    }

    @Override // com.nineoldandroids.animation.Animator
    public boolean isRunning() {
        return this.mPlayingState == 1 || this.mRunning;
    }

    @Override // com.nineoldandroids.animation.Animator
    public boolean isStarted() {
        return this.mStarted;
    }

    public void reverse() {
        this.mPlayingBackwards = !this.mPlayingBackwards;
        if (this.mPlayingState == 1) {
            long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
            this.mStartTime = currentAnimationTimeMillis - (this.mDuration - (currentAnimationTimeMillis - this.mStartTime));
            return;
        }
        start(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endAnimation() {
        sAnimations.get().remove(this);
        sPendingAnimations.get().remove(this);
        sDelayedAnims.get().remove(this);
        this.mPlayingState = 0;
        if (this.mRunning && this.mListeners != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.mListeners.clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((com.nineoldandroids.animation.Animator.AnimatorListener) arrayList.get(i)).onAnimationEnd(this);
            }
        }
        this.mRunning = false;
        this.mStarted = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startAnimation() {
        initAnimation();
        sAnimations.get().add(this);
        if (this.mStartDelay <= 0 || this.mListeners == null) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.mListeners.clone();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((com.nineoldandroids.animation.Animator.AnimatorListener) arrayList.get(i)).onAnimationStart(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean delayedAnimationFrame(long j) {
        if (!this.mStartedDelay) {
            this.mStartedDelay = true;
            this.mDelayStartTime = j;
            return false;
        }
        long j2 = j - this.mDelayStartTime;
        long j3 = this.mStartDelay;
        if (j2 <= j3) {
            return false;
        }
        this.mStartTime = j - (j2 - j3);
        this.mPlayingState = 1;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean animationFrame(long r10) {
        /*
            r9 = this;
            int r0 = r9.mPlayingState
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L1a
            r9.mPlayingState = r3
            long r4 = r9.mSeekTime
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L12
            r9.mStartTime = r10
            goto L1a
        L12:
            long r4 = r10 - r4
            r9.mStartTime = r4
            r4 = -1
            r9.mSeekTime = r4
        L1a:
            int r0 = r9.mPlayingState
            r4 = 2
            r5 = 0
            if (r0 == r3) goto L23
            if (r0 == r4) goto L23
            goto L84
        L23:
            long r6 = r9.mDuration
            r0 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 <= 0) goto L32
            long r1 = r9.mStartTime
            long r10 = r10 - r1
            float r10 = (float) r10
            float r11 = (float) r6
            float r10 = r10 / r11
            goto L34
        L32:
            r10 = 1065353216(0x3f800000, float:1.0)
        L34:
            int r11 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r11 < 0) goto L79
            int r11 = r9.mCurrentIteration
            int r1 = r9.mRepeatCount
            if (r11 < r1) goto L47
            r11 = -1
            if (r1 != r11) goto L42
            goto L47
        L42:
            float r10 = java.lang.Math.min(r10, r0)
            goto L7a
        L47:
            java.util.ArrayList<com.nineoldandroids.animation.Animator$AnimatorListener> r11 = r9.mListeners
            if (r11 == 0) goto L62
            java.util.ArrayList<com.nineoldandroids.animation.Animator$AnimatorListener> r11 = r9.mListeners
            int r11 = r11.size()
            r1 = 0
        L52:
            if (r1 >= r11) goto L62
            java.util.ArrayList<com.nineoldandroids.animation.Animator$AnimatorListener> r2 = r9.mListeners
            java.lang.Object r2 = r2.get(r1)
            com.nineoldandroids.animation.Animator$AnimatorListener r2 = (com.nineoldandroids.animation.Animator.AnimatorListener) r2
            r2.onAnimationRepeat(r9)
            int r1 = r1 + 1
            goto L52
        L62:
            int r11 = r9.mRepeatMode
            if (r11 != r4) goto L6b
            boolean r11 = r9.mPlayingBackwards
            r11 = r11 ^ r3
            r9.mPlayingBackwards = r11
        L6b:
            int r11 = r9.mCurrentIteration
            int r1 = (int) r10
            int r11 = r11 + r1
            r9.mCurrentIteration = r11
            float r10 = r10 % r0
            long r1 = r9.mStartTime
            long r3 = r9.mDuration
            long r1 = r1 + r3
            r9.mStartTime = r1
        L79:
            r3 = 0
        L7a:
            boolean r11 = r9.mPlayingBackwards
            if (r11 == 0) goto L80
            float r10 = r0 - r10
        L80:
            r9.animateValue(r10)
            r5 = r3
        L84:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nineoldandroids.animation.ValueAnimator.animationFrame(long):boolean");
    }

    public float getAnimatedFraction() {
        return this.mCurrentFraction;
    }

    void animateValue(float f) {
        float interpolation = this.mInterpolator.getInterpolation(f);
        this.mCurrentFraction = interpolation;
        int length = this.mValues.length;
        for (int i = 0; i < length; i++) {
            this.mValues[i].calculateValue(interpolation);
        }
        java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener> arrayList = this.mUpdateListeners;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mUpdateListeners.get(i2).onAnimationUpdate(this);
            }
        }
    }

    @Override // com.nineoldandroids.animation.Animator
    /* renamed from: clone */
    public com.nineoldandroids.animation.ValueAnimator mo106clone() {
        com.nineoldandroids.animation.ValueAnimator valueAnimator = (com.nineoldandroids.animation.ValueAnimator) super.mo106clone();
        java.util.ArrayList<com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener> arrayList = this.mUpdateListeners;
        if (arrayList != null) {
            valueAnimator.mUpdateListeners = new java.util.ArrayList<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                valueAnimator.mUpdateListeners.add(arrayList.get(i));
            }
        }
        valueAnimator.mSeekTime = -1L;
        valueAnimator.mPlayingBackwards = false;
        valueAnimator.mCurrentIteration = 0;
        valueAnimator.mInitialized = false;
        valueAnimator.mPlayingState = 0;
        valueAnimator.mStartedDelay = false;
        com.nineoldandroids.animation.PropertyValuesHolder[] propertyValuesHolderArr = this.mValues;
        if (propertyValuesHolderArr != null) {
            int length = propertyValuesHolderArr.length;
            valueAnimator.mValues = new com.nineoldandroids.animation.PropertyValuesHolder[length];
            valueAnimator.mValuesMap = new java.util.HashMap<>(length);
            for (int i2 = 0; i2 < length; i2++) {
                com.nineoldandroids.animation.PropertyValuesHolder mo110clone = propertyValuesHolderArr[i2].mo110clone();
                valueAnimator.mValues[i2] = mo110clone;
                valueAnimator.mValuesMap.put(mo110clone.getPropertyName(), mo110clone);
            }
        }
        return valueAnimator;
    }

    public static int getCurrentAnimationsCount() {
        return sAnimations.get().size();
    }

    public static void clearAllAnimations() {
        sAnimations.get().clear();
        sPendingAnimations.get().clear();
        sDelayedAnims.get().clear();
    }

    public java.lang.String toString() {
        java.lang.String str = "ValueAnimator@" + java.lang.Integer.toHexString(hashCode());
        if (this.mValues != null) {
            for (int i = 0; i < this.mValues.length; i++) {
                str = str + "\n    " + this.mValues[i].toString();
            }
        }
        return str;
    }
}
