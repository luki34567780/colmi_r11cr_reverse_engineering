package com.realsil.sdk.bbpro.internal;

/* loaded from: /tmp/dex/classes2.dex */
public class UserTask implements java.lang.Runnable {
    public boolean a;
    public boolean b;
    public int c;
    public java.util.UUID d;
    public boolean e;
    public boolean f;
    public java.lang.Object g;
    public byte h;

    public UserTask(int i) {
        this(i, java.util.UUID.randomUUID());
    }

    public java.lang.String getName() {
        return this.d.toString();
    }

    public int getOpcode() {
        return this.c;
    }

    public byte getTaskStatus() {
        return this.h;
    }

    public java.util.UUID getUuid() {
        return this.d;
    }

    public boolean isLastAction() {
        return this.f;
    }

    public boolean isProcessing() {
        return this.e;
    }

    public void notiyTaskUpdate(byte b) {
        synchronized (this.g) {
            this.e = false;
            this.h = b;
            this.g.notifyAll();
            com.realsil.sdk.core.logger.ZLogger.v(this.b, java.lang.String.format("task %s update", getName()));
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.realsil.sdk.core.logger.ZLogger.v(this.b, java.lang.String.format("task:%s is running", getName()));
    }

    public void startSubTask(boolean z) {
        this.e = true;
        this.f = z;
        com.realsil.sdk.core.logger.ZLogger.v(this.b, java.lang.String.format("task %s start", getName()));
    }

    public void stopSubTask() {
        this.e = false;
        com.realsil.sdk.core.logger.ZLogger.v(this.b, java.lang.String.format("task %s stop", getName()));
    }

    public void waitTaskComplete() {
        waitTaskComplete(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.LOCATION_UPDATE_INTERVAL);
    }

    public UserTask(int i, java.util.UUID uuid) {
        this.a = com.realsil.sdk.core.RtkCore.DEBUG;
        this.b = false;
        this.e = false;
        this.f = false;
        this.g = new java.lang.Object();
        this.h = (byte) 0;
        this.c = i;
        this.d = uuid;
    }

    public void waitTaskComplete(long j) {
        try {
            synchronized (this.g) {
                if (this.e) {
                    com.realsil.sdk.core.logger.ZLogger.v(this.b, java.lang.String.format(java.util.Locale.US, "task %s wait %d ms", getName(), java.lang.Long.valueOf(j)));
                    this.g.wait(j);
                }
            }
        } catch (java.lang.InterruptedException e) {
            com.realsil.sdk.core.logger.ZLogger.w(e.getMessage());
        }
    }
}
