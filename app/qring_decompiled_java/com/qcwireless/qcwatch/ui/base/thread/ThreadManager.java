package com.qcwireless.qcwatch.ui.base.thread;

/* loaded from: /tmp/dex/classes2.dex */
public class ThreadManager {
    private static com.qcwireless.qcwatch.ui.base.thread.ThreadManager instance;
    private java.util.concurrent.locks.Condition mCondition;
    private java.util.concurrent.locks.Lock mLock;
    private com.qcwireless.qcwatch.ui.base.thread.Queue<com.qcwireless.qcwatch.ui.base.thread.IDo> queue;
    private com.qcwireless.qcwatch.ui.base.thread.WakeupThread wakeupThread;
    private com.qcwireless.qcwatch.ui.base.thread.WorkThread workThread;

    private ThreadManager() {
        try {
            this.queue = new com.qcwireless.qcwatch.ui.base.thread.Queue<>();
            java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
            this.mLock = reentrantLock;
            this.mCondition = reentrantLock.newCondition();
            if (this.workThread == null) {
                com.qcwireless.qcwatch.ui.base.thread.WorkThread workThread = new com.qcwireless.qcwatch.ui.base.thread.WorkThread("ble-background-thread-1", this.mLock, this.mCondition);
                this.workThread = workThread;
                workThread.start();
            }
            if (this.wakeupThread == null) {
                com.qcwireless.qcwatch.ui.base.thread.WakeupThread wakeupThread = new com.qcwireless.qcwatch.ui.base.thread.WakeupThread("ble-background-wakeup-thread-1", this.queue);
                this.wakeupThread = wakeupThread;
                wakeupThread.start();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static com.qcwireless.qcwatch.ui.base.thread.ThreadManager getInstance() {
        com.qcwireless.qcwatch.ui.base.thread.ThreadManager threadManager;
        com.qcwireless.qcwatch.ui.base.thread.ThreadManager threadManager2 = instance;
        if (threadManager2 != null) {
            return threadManager2;
        }
        synchronized (com.qcwireless.qcwatch.ui.base.thread.ThreadManager.class) {
            if (instance == null) {
                instance = new com.qcwireless.qcwatch.ui.base.thread.ThreadManager();
            }
            threadManager = instance;
        }
        return threadManager;
    }

    public void wakeUp() {
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            this.queue.clear();
            needWait();
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "已经连接上，清除队列里的唤醒重连操作");
        } else {
            removeAllWait();
            addTask(new com.qcwireless.qcwatch.ui.base.thread.WakeUpTask(this.workThread));
            wakeupThreadWakeUp();
        }
    }

    public void wakeUpNotWait() {
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            this.queue.clear();
            needWait();
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "已经连接上，清除队列里的唤醒重连操作");
        } else {
            removeAllWait();
            com.qcwireless.qcwatch.ui.base.thread.WakeUpTask wakeUpTask = new com.qcwireless.qcwatch.ui.base.thread.WakeUpTask(this.workThread);
            wakeUpTask.setNoWait(true);
            addTask(wakeUpTask);
            wakeupThreadWakeUp();
        }
    }

    public void addTask(com.qcwireless.qcwatch.ui.base.thread.IDo task) {
        this.queue.addTail(task);
    }

    public void needWait() {
        if (this.queue.size() > 0) {
            if (this.queue.get() instanceof com.qcwireless.qcwatch.ui.base.thread.SleepTask) {
                return;
            }
            this.queue.addFirst(new com.qcwireless.qcwatch.ui.base.thread.SleepTask(this.wakeupThread.getLock(), this.wakeupThread.getCondition()));
            return;
        }
        this.queue.addFirst(new com.qcwireless.qcwatch.ui.base.thread.SleepTask(this.wakeupThread.getLock(), this.wakeupThread.getCondition()));
    }

    public void removeAllWait() {
        java.util.LinkedList<com.qcwireless.qcwatch.ui.base.thread.IDo> allTask = this.queue.getAllTask();
        if (allTask == null || allTask.size() == 0) {
            return;
        }
        synchronized (allTask) {
            if (allTask.size() == 0) {
                return;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator<com.qcwireless.qcwatch.ui.base.thread.IDo> it = allTask.iterator();
            while (it.hasNext()) {
                com.qcwireless.qcwatch.ui.base.thread.IDo next = it.next();
                if (next instanceof com.qcwireless.qcwatch.ui.base.thread.SleepTask) {
                    linkedList.add(next);
                }
            }
            java.util.Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                this.queue.remove((com.qcwireless.qcwatch.ui.base.thread.IDo) it2.next());
            }
        }
    }

    private void wakeupThreadWakeUp() {
        this.wakeupThread.wakeUp();
    }

    public void setSleepMin() {
        this.workThread.setSleepTimeMin();
    }

    public void reSetLastConnectTime(int time) {
        this.workThread.setLastConnectTime(time);
    }
}
