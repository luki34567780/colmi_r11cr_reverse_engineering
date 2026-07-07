package com.liulishuo.okdownload.core;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class NamedRunnable implements java.lang.Runnable {
    protected final java.lang.String name;

    protected abstract void execute() throws java.lang.InterruptedException;

    protected abstract void finished();

    protected abstract void interrupted(java.lang.InterruptedException interruptedException);

    public NamedRunnable(java.lang.String str) {
        this.name = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String name = java.lang.Thread.currentThread().getName();
        java.lang.Thread.currentThread().setName(this.name);
        try {
            try {
                execute();
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
                interrupted(e);
            }
        } finally {
            java.lang.Thread.currentThread().setName(name);
            finished();
        }
    }
}
