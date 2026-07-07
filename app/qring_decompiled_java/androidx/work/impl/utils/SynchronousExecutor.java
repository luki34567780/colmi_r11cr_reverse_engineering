package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class SynchronousExecutor implements java.util.concurrent.Executor {
    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        command.run();
    }
}
