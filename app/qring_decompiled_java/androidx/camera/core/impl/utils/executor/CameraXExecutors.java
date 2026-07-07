package androidx.camera.core.impl.utils.executor;

/* loaded from: classes.dex */
public final class CameraXExecutors {
    private CameraXExecutors() {
    }

    public static java.util.concurrent.ScheduledExecutorService mainThreadExecutor() {
        return androidx.camera.core.impl.utils.executor.MainThreadExecutor.getInstance();
    }

    public static java.util.concurrent.Executor ioExecutor() {
        return androidx.camera.core.impl.utils.executor.IoExecutor.getInstance();
    }

    public static java.util.concurrent.Executor directExecutor() {
        return androidx.camera.core.impl.utils.executor.DirectExecutor.getInstance();
    }

    public static java.util.concurrent.Executor newSequentialExecutor(java.util.concurrent.Executor delegate) {
        return new androidx.camera.core.impl.utils.executor.SequentialExecutor(delegate);
    }

    public static boolean isSequentialExecutor(java.util.concurrent.Executor executor) {
        return executor instanceof androidx.camera.core.impl.utils.executor.SequentialExecutor;
    }

    public static java.util.concurrent.ScheduledExecutorService myLooperExecutor() {
        return androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.currentThreadExecutor();
    }

    public static java.util.concurrent.ScheduledExecutorService newHandlerExecutor(android.os.Handler handler) {
        return new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService(handler);
    }

    public static java.util.concurrent.Executor highPriorityExecutor() {
        return androidx.camera.core.impl.utils.executor.HighPriorityExecutor.getInstance();
    }
}
