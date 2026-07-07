package com.oudmon.ble.base.communication.schedule;

/* loaded from: /tmp/dex/classes2.dex */
public class ScheduleEntity {
    public int mDetail;
    public java.util.List<java.lang.Integer> mDetails = new java.util.ArrayList();
    public int mEndTime;
    public int mRepeatType;
    public int mStartTime;
    public java.lang.String mTitle;

    public ScheduleEntity() {
    }

    public ScheduleEntity(java.lang.String str, int i, int i2, int i3, int i4) {
        this.mTitle = str;
        this.mStartTime = i;
        this.mEndTime = i2;
        this.mRepeatType = i3;
        this.mDetail = i4;
    }
}
