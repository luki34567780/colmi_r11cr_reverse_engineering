package androidx.work;

/* loaded from: classes.dex */
public class DelegatingWorkerFactory extends androidx.work.WorkerFactory {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("DelegatingWkrFctry");
    private final java.util.List<androidx.work.WorkerFactory> mFactories = new java.util.concurrent.CopyOnWriteArrayList();

    java.util.List<androidx.work.WorkerFactory> getFactories() {
        return this.mFactories;
    }

    public final void addFactory(androidx.work.WorkerFactory workerFactory) {
        this.mFactories.add(workerFactory);
    }

    @Override // androidx.work.WorkerFactory
    public final androidx.work.ListenableWorker createWorker(android.content.Context appContext, java.lang.String workerClassName, androidx.work.WorkerParameters workerParameters) {
        java.util.Iterator<androidx.work.WorkerFactory> it = this.mFactories.iterator();
        while (it.hasNext()) {
            try {
                androidx.work.ListenableWorker createWorker = it.next().createWorker(appContext, workerClassName, workerParameters);
                if (createWorker != null) {
                    return createWorker;
                }
            } catch (java.lang.Throwable th) {
                androidx.work.Logger.get().error(TAG, java.lang.String.format("Unable to instantiate a ListenableWorker (%s)", workerClassName), th);
                throw th;
            }
        }
        return null;
    }
}
