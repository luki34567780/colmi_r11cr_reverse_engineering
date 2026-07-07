package androidx.work.impl;

/* loaded from: classes.dex */
public interface ExecutionListener {
    void onExecuted(java.lang.String workSpecId, boolean needsReschedule);
}
