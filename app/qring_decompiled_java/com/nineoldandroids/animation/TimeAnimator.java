package com.nineoldandroids.animation;

/* loaded from: /tmp/dex/classes2.dex */
public class TimeAnimator extends com.nineoldandroids.animation.ValueAnimator {
    private com.nineoldandroids.animation.TimeAnimator.TimeListener mListener;
    private long mPreviousTime = -1;

    public interface TimeListener {
        void onTimeUpdate(com.nineoldandroids.animation.TimeAnimator timeAnimator, long j, long j2);
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    void animateValue(float f) {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    void initAnimation() {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    boolean animationFrame(long j) {
        if (this.mPlayingState == 0) {
            this.mPlayingState = 1;
            if (this.mSeekTime < 0) {
                this.mStartTime = j;
            } else {
                this.mStartTime = j - this.mSeekTime;
                this.mSeekTime = -1L;
            }
        }
        if (this.mListener == null) {
            return false;
        }
        long j2 = j - this.mStartTime;
        long j3 = this.mPreviousTime;
        long j4 = j3 >= 0 ? j - j3 : 0L;
        this.mPreviousTime = j;
        this.mListener.onTimeUpdate(this, j2, j4);
        return false;
    }

    public void setTimeListener(com.nineoldandroids.animation.TimeAnimator.TimeListener timeListener) {
        this.mListener = timeListener;
    }
}
