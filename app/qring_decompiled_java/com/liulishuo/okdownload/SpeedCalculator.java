package com.liulishuo.okdownload;

/* loaded from: /tmp/dex/classes2.dex */
public class SpeedCalculator {
    long allIncreaseBytes;
    long beginTimestamp;
    long bytesPerSecond;
    long endTimestamp;
    long increaseBytes;
    long timestamp;

    public synchronized void reset() {
        this.timestamp = 0L;
        this.increaseBytes = 0L;
        this.bytesPerSecond = 0L;
        this.beginTimestamp = 0L;
        this.endTimestamp = 0L;
        this.allIncreaseBytes = 0L;
    }

    long nowMillis() {
        return android.os.SystemClock.uptimeMillis();
    }

    public synchronized void downloading(long j) {
        if (this.timestamp == 0) {
            long nowMillis = nowMillis();
            this.timestamp = nowMillis;
            this.beginTimestamp = nowMillis;
        }
        this.increaseBytes += j;
        this.allIncreaseBytes += j;
    }

    public synchronized void flush() {
        long nowMillis = nowMillis();
        long j = this.increaseBytes;
        long max = java.lang.Math.max(1L, nowMillis - this.timestamp);
        this.increaseBytes = 0L;
        this.timestamp = nowMillis;
        this.bytesPerSecond = (long) ((j / max) * 1000.0f);
    }

    public long getInstantBytesPerSecondAndFlush() {
        flush();
        return this.bytesPerSecond;
    }

    public synchronized long getBytesPerSecondAndFlush() {
        long nowMillis = nowMillis() - this.timestamp;
        if (nowMillis < 1000) {
            long j = this.bytesPerSecond;
            if (j != 0) {
                return j;
            }
        }
        if (this.bytesPerSecond == 0 && nowMillis < 500) {
            return 0L;
        }
        return getInstantBytesPerSecondAndFlush();
    }

    public synchronized long getBytesPerSecondFromBegin() {
        long j;
        j = this.endTimestamp;
        if (j == 0) {
            j = nowMillis();
        }
        return (long) ((this.allIncreaseBytes / java.lang.Math.max(1L, j - this.beginTimestamp)) * 1000.0f);
    }

    public synchronized void endTask() {
        this.endTimestamp = nowMillis();
    }

    public java.lang.String instantSpeed() {
        return getSpeedWithSIAndFlush();
    }

    public java.lang.String speed() {
        return humanReadableSpeed(getBytesPerSecondAndFlush(), true);
    }

    public java.lang.String lastSpeed() {
        return humanReadableSpeed(this.bytesPerSecond, true);
    }

    public synchronized long getInstantSpeedDurationMillis() {
        return nowMillis() - this.timestamp;
    }

    public java.lang.String getSpeedWithBinaryAndFlush() {
        return humanReadableSpeed(getInstantBytesPerSecondAndFlush(), false);
    }

    public java.lang.String getSpeedWithSIAndFlush() {
        return humanReadableSpeed(getInstantBytesPerSecondAndFlush(), true);
    }

    public java.lang.String averageSpeed() {
        return speedFromBegin();
    }

    public java.lang.String speedFromBegin() {
        return humanReadableSpeed(getBytesPerSecondFromBegin(), true);
    }

    private static java.lang.String humanReadableSpeed(long j, boolean z) {
        return com.liulishuo.okdownload.core.Util.humanReadableBytes(j, z) + "/s";
    }
}
