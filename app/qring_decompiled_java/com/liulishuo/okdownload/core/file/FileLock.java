package com.liulishuo.okdownload.core.file;

/* loaded from: /tmp/dex/classes2.dex */
public class FileLock {
    private static final java.lang.String TAG = "FileLock";
    private static final long WAIT_RELEASE_LOCK_NANO = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(100);
    private final java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicInteger> fileLockCountMap;
    private final java.util.Map<java.lang.String, java.lang.Thread> waitThreadForFileLockMap;

    FileLock(java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicInteger> map, java.util.Map<java.lang.String, java.lang.Thread> map2) {
        this.fileLockCountMap = map;
        this.waitThreadForFileLockMap = map2;
    }

    FileLock() {
        this(new java.util.HashMap(), new java.util.HashMap());
    }

    public void increaseLock(java.lang.String str) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        synchronized (this.fileLockCountMap) {
            atomicInteger = this.fileLockCountMap.get(str);
        }
        if (atomicInteger == null) {
            atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
            synchronized (this.fileLockCountMap) {
                this.fileLockCountMap.put(str, atomicInteger);
            }
        }
        com.liulishuo.okdownload.core.Util.d(TAG, "increaseLock increase lock-count to " + atomicInteger.incrementAndGet() + str);
    }

    public void decreaseLock(java.lang.String str) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        java.lang.Thread thread;
        synchronized (this.fileLockCountMap) {
            atomicInteger = this.fileLockCountMap.get(str);
        }
        if (atomicInteger == null || atomicInteger.decrementAndGet() != 0) {
            return;
        }
        com.liulishuo.okdownload.core.Util.d(TAG, "decreaseLock decrease lock-count to 0 " + str);
        synchronized (this.waitThreadForFileLockMap) {
            thread = this.waitThreadForFileLockMap.get(str);
            if (thread != null) {
                this.waitThreadForFileLockMap.remove(str);
            }
        }
        if (thread != null) {
            com.liulishuo.okdownload.core.Util.d(TAG, "decreaseLock " + str + " unpark locked thread " + atomicInteger);
            unpark(thread);
        }
        synchronized (this.fileLockCountMap) {
            this.fileLockCountMap.remove(str);
        }
    }

    public void waitForRelease(java.lang.String str) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        synchronized (this.fileLockCountMap) {
            atomicInteger = this.fileLockCountMap.get(str);
        }
        if (atomicInteger == null || atomicInteger.get() <= 0) {
            return;
        }
        synchronized (this.waitThreadForFileLockMap) {
            this.waitThreadForFileLockMap.put(str, java.lang.Thread.currentThread());
        }
        com.liulishuo.okdownload.core.Util.d(TAG, "waitForRelease start " + str);
        while (!isNotLocked(atomicInteger)) {
            park();
        }
        com.liulishuo.okdownload.core.Util.d(TAG, "waitForRelease finish " + str);
    }

    boolean isNotLocked(java.util.concurrent.atomic.AtomicInteger atomicInteger) {
        return atomicInteger.get() <= 0;
    }

    void park() {
        java.util.concurrent.locks.LockSupport.park(java.lang.Long.valueOf(WAIT_RELEASE_LOCK_NANO));
    }

    void unpark(java.lang.Thread thread) {
        java.util.concurrent.locks.LockSupport.unpark(thread);
    }
}
