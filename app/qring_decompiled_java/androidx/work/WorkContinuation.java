package androidx.work;

/* loaded from: classes.dex */
public abstract class WorkContinuation {
    protected abstract androidx.work.WorkContinuation combineInternal(java.util.List<androidx.work.WorkContinuation> continuations);

    public abstract androidx.work.Operation enqueue();

    public abstract com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfos();

    public abstract androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosLiveData();

    public abstract androidx.work.WorkContinuation then(java.util.List<androidx.work.OneTimeWorkRequest> work);

    public final androidx.work.WorkContinuation then(androidx.work.OneTimeWorkRequest work) {
        return then(java.util.Collections.singletonList(work));
    }

    public static androidx.work.WorkContinuation combine(java.util.List<androidx.work.WorkContinuation> continuations) {
        return continuations.get(0).combineInternal(continuations);
    }
}
