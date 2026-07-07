package androidx.camera.core.impl.utils.executor;

/* loaded from: classes.dex */
final class DirectExecutor implements java.util.concurrent.Executor {
    private static volatile androidx.camera.core.impl.utils.executor.DirectExecutor sDirectExecutor;

    DirectExecutor() {
    }

    static java.util.concurrent.Executor getInstance() {
        if (sDirectExecutor != null) {
            return sDirectExecutor;
        }
        synchronized (androidx.camera.core.impl.utils.executor.DirectExecutor.class) {
            if (sDirectExecutor == null) {
                sDirectExecutor = new androidx.camera.core.impl.utils.executor.DirectExecutor();
            }
        }
        return sDirectExecutor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        command.run();
    }
}
