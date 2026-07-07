package androidx.work;

/* loaded from: classes.dex */
public abstract class WorkerFactory {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("WorkerFactory");

    public abstract androidx.work.ListenableWorker createWorker(android.content.Context appContext, java.lang.String workerClassName, androidx.work.WorkerParameters workerParameters);

    public final androidx.work.ListenableWorker createWorkerWithDefaultFallback(android.content.Context appContext, java.lang.String workerClassName, androidx.work.WorkerParameters workerParameters) {
        androidx.work.ListenableWorker createWorker = createWorker(appContext, workerClassName, workerParameters);
        if (createWorker == null) {
            java.lang.Class cls = null;
            try {
                cls = java.lang.Class.forName(workerClassName).asSubclass(androidx.work.ListenableWorker.class);
            } catch (java.lang.Throwable th) {
                androidx.work.Logger.get().error(TAG, "Invalid class: " + workerClassName, th);
            }
            if (cls != null) {
                try {
                    createWorker = (androidx.work.ListenableWorker) cls.getDeclaredConstructor(android.content.Context.class, androidx.work.WorkerParameters.class).newInstance(appContext, workerParameters);
                } catch (java.lang.Throwable th2) {
                    androidx.work.Logger.get().error(TAG, "Could not instantiate " + workerClassName, th2);
                }
            }
        }
        if (createWorker == null || !createWorker.isUsed()) {
            return createWorker;
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), workerClassName));
    }

    public static androidx.work.WorkerFactory getDefaultWorkerFactory() {
        return new androidx.work.WorkerFactory() { // from class: androidx.work.WorkerFactory.1
            @Override // androidx.work.WorkerFactory
            public androidx.work.ListenableWorker createWorker(android.content.Context appContext, java.lang.String workerClassName, androidx.work.WorkerParameters workerParameters) {
                return null;
            }
        };
    }
}
