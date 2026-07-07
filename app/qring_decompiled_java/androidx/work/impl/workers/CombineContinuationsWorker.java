package androidx.work.impl.workers;

/* loaded from: classes.dex */
public class CombineContinuationsWorker extends androidx.work.Worker {
    public CombineContinuationsWorker(android.content.Context context, androidx.work.WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @Override // androidx.work.Worker
    public androidx.work.ListenableWorker.Result doWork() {
        return androidx.work.ListenableWorker.Result.success(getInputData());
    }
}
