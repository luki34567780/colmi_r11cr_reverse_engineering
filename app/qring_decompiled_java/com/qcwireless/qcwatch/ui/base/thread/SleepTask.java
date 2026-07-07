package com.qcwireless.qcwatch.ui.base.thread;

/* loaded from: /tmp/dex/classes2.dex */
public class SleepTask implements com.qcwireless.qcwatch.ui.base.thread.IDo {
    private java.util.concurrent.locks.Condition mCondition;
    private java.util.concurrent.locks.Lock mLock;

    public SleepTask(java.util.concurrent.locks.Lock lock, java.util.concurrent.locks.Condition condition) {
        this.mLock = lock;
        this.mCondition = condition;
    }

    @Override // com.qcwireless.qcwatch.ui.base.thread.IDo
    public void iDo() {
        java.util.concurrent.locks.Lock lock = this.mLock;
        if (lock == null || this.mCondition == null) {
            return;
        }
        lock.lock();
        try {
            try {
                this.mCondition.await();
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            this.mLock.unlock();
        }
    }
}
