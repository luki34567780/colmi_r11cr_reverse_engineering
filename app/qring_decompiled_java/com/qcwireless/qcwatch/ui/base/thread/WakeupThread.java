package com.qcwireless.qcwatch.ui.base.thread;

/* loaded from: /tmp/dex/classes2.dex */
public class WakeupThread extends java.lang.Thread {
    private final java.util.concurrent.locks.Condition mCondition;
    private java.util.concurrent.locks.Lock mLock;
    private com.qcwireless.qcwatch.ui.base.thread.Queue<com.qcwireless.qcwatch.ui.base.thread.IDo> queue;

    public WakeupThread(java.lang.String threadName, com.qcwireless.qcwatch.ui.base.thread.Queue<com.qcwireless.qcwatch.ui.base.thread.IDo> queue) {
        super(threadName);
        this.queue = queue;
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.mLock = reentrantLock;
        this.mCondition = reentrantLock.newCondition();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                if (!java.lang.Thread.interrupted()) {
                    com.qcwireless.qcwatch.ui.base.thread.IDo remove = this.queue.remove();
                    if (remove == null) {
                        lockThread();
                    } else {
                        remove.iDo();
                        needWait(6L);
                    }
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }

    private void needWait(long seconds) {
        if (seconds > 0) {
            this.mLock.lock();
            try {
                try {
                    this.mCondition.await(seconds, java.util.concurrent.TimeUnit.SECONDS);
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
            } finally {
                this.mLock.unlock();
            }
        }
    }

    public java.util.concurrent.locks.Lock getLock() {
        return this.mLock;
    }

    public void setLock(java.util.concurrent.locks.Lock lock) {
        this.mLock = lock;
    }

    public java.util.concurrent.locks.Condition getCondition() {
        return this.mCondition;
    }

    public void wakeUp() {
        this.mLock.lock();
        try {
            this.mCondition.signalAll();
        } finally {
            this.mLock.unlock();
        }
    }

    private void lockThread() {
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
