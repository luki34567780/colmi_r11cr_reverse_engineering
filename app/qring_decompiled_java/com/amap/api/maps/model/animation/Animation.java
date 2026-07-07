package com.amap.api.maps.model.animation;

/* loaded from: classes.dex */
public abstract class Animation {
    public static final int FILL_MODE_BACKWARDS = 1;
    public static final int FILL_MODE_FORWARDS = 0;
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    protected java.lang.String animationType;
    public com.autonavi.amap.mapcore.animation.GLAnimation glAnimation;
    private com.amap.api.maps.model.animation.Animation.AnimationListener mListener;
    private int fillMode = 0;
    private long duration = 500;
    private android.view.animation.Interpolator interpolator = null;
    private boolean mFillBefore = true;
    private boolean mFillAfter = false;
    private boolean mFillEnabled = false;
    private int mRepeatCount = 0;
    private int mRepeatMode = 1;
    private com.amap.api.maps.model.animation.Animation.AnimationUpdateFlags updateFlags = new com.amap.api.maps.model.animation.Animation.AnimationUpdateFlags();

    public interface AnimationListener {
        void onAnimationEnd();

        void onAnimationStart();
    }

    protected abstract java.lang.String getAnimationType();

    public Animation() {
        this.animationType = "typeAnimtionBase";
        this.glAnimation = null;
        this.glAnimation = new com.autonavi.amap.mapcore.animation.GLAnimation();
        this.animationType = getAnimationType();
    }

    public void setAnimationListener(com.amap.api.maps.model.animation.Animation.AnimationListener animationListener) {
        this.mListener = new com.amap.api.maps.model.animation.Animation.a(this, animationListener, (byte) 0);
        this.glAnimation.setAnimationListener(animationListener);
        this.updateFlags.mListenerUpdate = true;
    }

    public void setDuration(long j) {
        this.duration = j;
        com.autonavi.amap.mapcore.animation.GLAnimation gLAnimation = this.glAnimation;
        if (gLAnimation != null) {
            gLAnimation.setDuration(j);
        }
        this.updateFlags.durationUpdate = true;
    }

    public void setInterpolator(android.view.animation.Interpolator interpolator) {
        this.interpolator = interpolator;
        com.autonavi.amap.mapcore.animation.GLAnimation gLAnimation = this.glAnimation;
        if (gLAnimation != null) {
            gLAnimation.setInterpolator(interpolator);
        }
        this.updateFlags.interpolatorUpdate = true;
    }

    public void setFillMode(int i) {
        this.fillMode = i;
        if (i == 0) {
            b(true);
            c(false);
            a(false);
        } else {
            b(false);
            a(true);
            c(true);
        }
        this.updateFlags.fillModeUpdate = true;
    }

    public int getFillMode() {
        return this.fillMode;
    }

    private void a(boolean z) {
        this.mFillEnabled = z;
        com.autonavi.amap.mapcore.animation.GLAnimation gLAnimation = this.glAnimation;
        if (gLAnimation != null) {
            gLAnimation.setFillEnabled(z);
        }
        this.updateFlags.mFillEnabledUpdate = true;
    }

    private void b(boolean z) {
        this.mFillAfter = z;
        com.autonavi.amap.mapcore.animation.GLAnimation gLAnimation = this.glAnimation;
        if (gLAnimation != null) {
            gLAnimation.setFillAfter(z);
        }
        this.updateFlags.mFillAfterUpdate = true;
    }

    private void c(boolean z) {
        this.mFillBefore = z;
        com.autonavi.amap.mapcore.animation.GLAnimation gLAnimation = this.glAnimation;
        if (gLAnimation != null) {
            gLAnimation.setFillBefore(z);
        }
        this.updateFlags.mFillBeforeUpdate = true;
    }

    public void setRepeatCount(int i) {
        this.mRepeatCount = i;
        com.autonavi.amap.mapcore.animation.GLAnimation gLAnimation = this.glAnimation;
        if (gLAnimation != null) {
            gLAnimation.setRepeatCount(i);
        }
        this.updateFlags.mRepeatCountUpdate = true;
    }

    public void setRepeatMode(int i) {
        this.mRepeatMode = i;
        com.autonavi.amap.mapcore.animation.GLAnimation gLAnimation = this.glAnimation;
        if (gLAnimation != null) {
            gLAnimation.setRepeatMode(i);
        }
        this.updateFlags.mRepeatModeUpdate = true;
    }

    public int getRepeatMode() {
        com.autonavi.amap.mapcore.animation.GLAnimation gLAnimation = this.glAnimation;
        if (gLAnimation != null) {
            return gLAnimation.getRepeatMode();
        }
        return 1;
    }

    public int getRepeatCount() {
        com.autonavi.amap.mapcore.animation.GLAnimation gLAnimation = this.glAnimation;
        if (gLAnimation != null) {
            return gLAnimation.getRepeatCount();
        }
        return 0;
    }

    public void resetUpdateFlags() {
        this.updateFlags.reset();
    }

    public com.amap.api.maps.model.animation.Animation.AnimationUpdateFlags getUpdateFlags() {
        return this.updateFlags;
    }

    protected static class AnimationUpdateFlags extends com.amap.api.maps.model.BaseOptions.BaseUpdateFlags {
        protected boolean mListenerUpdate = false;
        protected boolean durationUpdate = false;
        protected boolean interpolatorUpdate = false;
        protected boolean fillModeUpdate = false;
        protected boolean mFillEnabledUpdate = false;
        protected boolean mFillAfterUpdate = false;
        protected boolean mFillBeforeUpdate = false;
        protected boolean mRepeatCountUpdate = false;
        protected boolean mRepeatModeUpdate = false;

        protected AnimationUpdateFlags() {
        }

        @Override // com.amap.api.maps.model.BaseOptions.BaseUpdateFlags
        public void reset() {
            super.reset();
            this.mListenerUpdate = false;
            this.durationUpdate = false;
            this.interpolatorUpdate = false;
            this.fillModeUpdate = false;
            this.mFillEnabledUpdate = false;
            this.mFillAfterUpdate = false;
            this.mFillBeforeUpdate = false;
            this.mRepeatCountUpdate = false;
            this.mRepeatModeUpdate = false;
        }
    }

    private class a implements com.amap.api.maps.model.animation.Animation.AnimationListener {
        private final com.amap.api.col.p0003sl.ma b;
        private final com.amap.api.col.p0003sl.ma c;

        /* synthetic */ a(com.amap.api.maps.model.animation.Animation animation, com.amap.api.maps.model.animation.Animation.AnimationListener animationListener, byte b) {
            this(animationListener);
        }

        private a(final com.amap.api.maps.model.animation.Animation.AnimationListener animationListener) {
            this.b = new com.amap.api.col.p0003sl.ma() { // from class: com.amap.api.maps.model.animation.Animation.a.1
                @Override // com.amap.api.col.p0003sl.ma
                public final void runTask() {
                    try {
                        com.amap.api.maps.model.animation.Animation.AnimationListener animationListener2 = animationListener;
                        if (animationListener2 != null) {
                            animationListener2.onAnimationStart();
                        }
                    } catch (java.lang.Throwable th) {
                        th.printStackTrace();
                    }
                }
            };
            this.c = new com.amap.api.col.p0003sl.ma() { // from class: com.amap.api.maps.model.animation.Animation.a.2
                @Override // com.amap.api.col.p0003sl.ma
                public final void runTask() {
                    try {
                        com.amap.api.maps.model.animation.Animation.AnimationListener animationListener2 = animationListener;
                        if (animationListener2 != null) {
                            animationListener2.onAnimationEnd();
                        }
                    } catch (java.lang.Throwable th) {
                        th.printStackTrace();
                    }
                }
            };
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public final void onAnimationStart() {
            com.amap.api.col.p0003sl.dv.a().a(this.b);
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public final void onAnimationEnd() {
            com.amap.api.col.p0003sl.dv.a().a(this.c);
        }
    }
}
