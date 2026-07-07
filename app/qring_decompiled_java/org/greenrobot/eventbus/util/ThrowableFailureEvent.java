package org.greenrobot.eventbus.util;

/* loaded from: classes3.dex */
public class ThrowableFailureEvent implements org.greenrobot.eventbus.util.HasExecutionScope {
    private java.lang.Object executionContext;
    protected final boolean suppressErrorUi;
    protected final java.lang.Throwable throwable;

    public ThrowableFailureEvent(java.lang.Throwable th) {
        this.throwable = th;
        this.suppressErrorUi = false;
    }

    public ThrowableFailureEvent(java.lang.Throwable th, boolean z) {
        this.throwable = th;
        this.suppressErrorUi = z;
    }

    public java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    public boolean isSuppressErrorUi() {
        return this.suppressErrorUi;
    }

    @Override // org.greenrobot.eventbus.util.HasExecutionScope
    public java.lang.Object getExecutionScope() {
        return this.executionContext;
    }

    @Override // org.greenrobot.eventbus.util.HasExecutionScope
    public void setExecutionScope(java.lang.Object obj) {
        this.executionContext = obj;
    }
}
