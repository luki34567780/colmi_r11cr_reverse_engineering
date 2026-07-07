package com.qcwireless.qcwatch.ui.base.thread;

/* loaded from: /tmp/dex/classes2.dex */
public class WorkThread extends java.lang.Thread {
    private static final int SLEEP_INTERVAL_MAX = 120;
    private static final int SLEEP_INTERVAL_MIN = 30;
    private long lastConnectTime;
    private java.util.concurrent.locks.Condition mCondition;
    private java.util.concurrent.locks.Lock mLock;
    private java.util.concurrent.atomic.AtomicInteger sleepTime;

    public WorkThread(java.lang.String name, java.util.concurrent.locks.Lock lock, java.util.concurrent.locks.Condition condition) {
        super(name);
        this.sleepTime = new java.util.concurrent.atomic.AtomicInteger(30);
        this.mLock = lock;
        this.mCondition = condition;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                if (!com.qcwireless.qc_utils.bluetooth.BluetoothUtils.isEnabledBluetooth(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()) || android.text.TextUtils.isEmpty(com.qcwireless.qcwatch.base.pref.PreUtil.getSharedString(com.qcwireless.qcwatch.base.pref.PreUtil.Action_Device_Address, null))) {
                    needLock();
                }
                if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                    this.sleepTime.getAndSet(30);
                    this.lastConnectTime = 0L;
                    needLock();
                } else if (this.sleepTime.get() <= 120) {
                    android.os.SystemClock.sleep(this.sleepTime.get() * 1000);
                    if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                        this.sleepTime.getAndSet(30);
                        this.lastConnectTime = 0L;
                        needLock();
                    }
                    this.sleepTime.incrementAndGet();
                    com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setReConnectMac(com.qcwireless.qcwatch.base.pref.PreUtil.getSharedString(com.qcwireless.qcwatch.base.pref.PreUtil.Action_Device_Address, null));
                    com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().connectWithScan(com.qcwireless.qcwatch.base.pref.PreUtil.getSharedString(com.qcwireless.qcwatch.base.pref.PreUtil.Action_Device_Address, null));
                } else {
                    long unixTimestamp = new com.oudmon.ble.base.util.DateUtil().getUnixTimestamp();
                    if (this.lastConnectTime <= unixTimestamp) {
                        android.os.SystemClock.sleep(300000L);
                        this.lastConnectTime = unixTimestamp + 300;
                        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setReConnectMac(com.qcwireless.qcwatch.base.pref.PreUtil.getSharedString(com.qcwireless.qcwatch.base.pref.PreUtil.Action_Device_Address, null));
                        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().connectWithScan(com.qcwireless.qcwatch.base.pref.PreUtil.getSharedString(com.qcwireless.qcwatch.base.pref.PreUtil.Action_Device_Address, null));
                    }
                    needLock();
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
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

    private void needLock() {
        if (this.mCondition == null) {
            return;
        }
        this.mLock.lock();
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

    public void wakeUp() {
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            this.sleepTime.getAndSet(30);
            return;
        }
        try {
            try {
                this.mLock.lock();
                this.mCondition.signalAll();
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            this.mLock.unlock();
            com.qcwireless.qcwatch.QJavaApplication.trySetupNotifyService(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication());
        } catch (java.lang.Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    public void wakeUpNoSleep() {
        try {
            this.sleepTime.getAndSet(0);
            this.mLock.lock();
            this.mCondition.signalAll();
        } finally {
            this.mLock.unlock();
        }
    }

    public void setSleepTimeMin() {
        this.sleepTime.getAndSet(30);
    }

    public void setLastConnectTime(long lastConnectTime) {
        this.lastConnectTime = lastConnectTime;
    }
}
