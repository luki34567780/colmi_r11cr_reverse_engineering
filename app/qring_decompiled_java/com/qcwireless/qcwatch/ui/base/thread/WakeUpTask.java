package com.qcwireless.qcwatch.ui.base.thread;

/* loaded from: /tmp/dex/classes2.dex */
public class WakeUpTask implements com.qcwireless.qcwatch.ui.base.thread.IDo {
    private boolean noWait;
    private com.qcwireless.qcwatch.ui.base.thread.WorkThread workThread;

    public WakeUpTask(com.qcwireless.qcwatch.ui.base.thread.WorkThread workThread) {
        this.workThread = workThread;
    }

    @Override // com.qcwireless.qcwatch.ui.base.thread.IDo
    public void iDo() {
        if (this.noWait) {
            this.workThread.wakeUpNoSleep();
        } else {
            this.workThread.wakeUp();
        }
    }

    public boolean isNoWait() {
        return this.noWait;
    }

    public void setNoWait(boolean noWait) {
        this.noWait = noWait;
    }
}
