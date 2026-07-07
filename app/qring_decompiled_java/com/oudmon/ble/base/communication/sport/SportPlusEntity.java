package com.oudmon.ble.base.communication.sport;

/* loaded from: /tmp/dex/classes2.dex */
public class SportPlusEntity {
    public float mCalories;
    public int mDistance;
    public int mDownhill;
    public int mDuration;
    public int mElevation;
    public java.util.List<com.oudmon.ble.base.communication.sport.SportLocation> mLocations = new java.util.ArrayList();
    public int mRateAvg;
    public int mRateMax;
    public int mRateMin;
    public int mSpeedAvg;
    public int mSpeedMax;
    public int mSportCount;
    public int mSportType;
    public int mStartTime;
    public int mStepRate;
    public int mUphill;
    public int steps;

    public java.lang.String toString() {
        return "SportPlusEntity{mSportType=" + this.mSportType + ", mStartTime=" + this.mStartTime + ", mDuration=" + this.mDuration + ", mDistance=" + this.mDistance + ", mCalories=" + this.mCalories + ", mSpeedAvg=" + this.mSpeedAvg + ", mSpeedMax=" + this.mSpeedMax + ", mRateAvg=" + this.mRateAvg + ", mRateMin=" + this.mRateMin + ", mRateMax=" + this.mRateMax + ", mElevation=" + this.mElevation + ", mUphill=" + this.mUphill + ", mDownhill=" + this.mDownhill + ", mStepRate=" + this.mStepRate + ", mSportCount=" + this.mSportCount + ", mLocations=" + this.mLocations + ", steps=" + this.steps + '}';
    }
}
