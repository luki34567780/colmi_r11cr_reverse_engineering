package androidx.work.multiprocess;

/* loaded from: classes.dex */
public abstract class RemoteWorkContinuation {
    protected abstract androidx.work.multiprocess.RemoteWorkContinuation combineInternal(java.util.List<androidx.work.multiprocess.RemoteWorkContinuation> continuations);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueue();

    public abstract androidx.work.multiprocess.RemoteWorkContinuation then(java.util.List<androidx.work.OneTimeWorkRequest> work);

    protected RemoteWorkContinuation() {
    }

    public final androidx.work.multiprocess.RemoteWorkContinuation then(androidx.work.OneTimeWorkRequest work) {
        return then(java.util.Collections.singletonList(work));
    }

    public static androidx.work.multiprocess.RemoteWorkContinuation combine(java.util.List<androidx.work.multiprocess.RemoteWorkContinuation> continuations) {
        return continuations.get(0).combineInternal(continuations);
    }
}
