package com.oudmon.ble.base.communication.dfu_temperature;

/* loaded from: /tmp/dex/classes2.dex */
public class TemperatureEntity {
    public int mIndex;
    public int mTimeSpan;
    public float[] mValues;

    public void clear() {
        this.mIndex = 0;
        this.mTimeSpan = 0;
        this.mValues = null;
    }

    public java.lang.String toString() {
        return "TemperatureEntity{mIndex=" + this.mIndex + ", mTimeSpan=" + this.mTimeSpan + ", mValues=" + java.util.Arrays.toString(this.mValues) + '}';
    }
}
