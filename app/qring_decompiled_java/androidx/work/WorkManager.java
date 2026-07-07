package androidx.work;

/* loaded from: classes.dex */
public abstract class WorkManager {
    public abstract androidx.work.WorkContinuation beginUniqueWork(java.lang.String uniqueWorkName, androidx.work.ExistingWorkPolicy existingWorkPolicy, java.util.List<androidx.work.OneTimeWorkRequest> work);

    public abstract androidx.work.WorkContinuation beginWith(java.util.List<androidx.work.OneTimeWorkRequest> work);

    public abstract androidx.work.Operation cancelAllWork();

    public abstract androidx.work.Operation cancelAllWorkByTag(java.lang.String tag);

    public abstract androidx.work.Operation cancelUniqueWork(java.lang.String uniqueWorkName);

    public abstract androidx.work.Operation cancelWorkById(java.util.UUID id);

    public abstract android.app.PendingIntent createCancelPendingIntent(java.util.UUID id);

    public abstract androidx.work.Operation enqueue(java.util.List<? extends androidx.work.WorkRequest> requests);

    public abstract androidx.work.Operation enqueueUniquePeriodicWork(java.lang.String uniqueWorkName, androidx.work.ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, androidx.work.PeriodicWorkRequest periodicWork);

    public abstract androidx.work.Operation enqueueUniqueWork(java.lang.String uniqueWorkName, androidx.work.ExistingWorkPolicy existingWorkPolicy, java.util.List<androidx.work.OneTimeWorkRequest> work);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Long> getLastCancelAllTimeMillis();

    public abstract androidx.lifecycle.LiveData<java.lang.Long> getLastCancelAllTimeMillisLiveData();

    public abstract com.google.common.util.concurrent.ListenableFuture<androidx.work.WorkInfo> getWorkInfoById(java.util.UUID id);

    public abstract androidx.lifecycle.LiveData<androidx.work.WorkInfo> getWorkInfoByIdLiveData(java.util.UUID id);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfos(androidx.work.WorkQuery workQuery);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfosByTag(java.lang.String tag);

    public abstract androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosByTagLiveData(java.lang.String tag);

    public abstract com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfosForUniqueWork(java.lang.String uniqueWorkName);

    public abstract androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosForUniqueWorkLiveData(java.lang.String uniqueWorkName);

    public abstract androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosLiveData(androidx.work.WorkQuery workQuery);

    public abstract androidx.work.Operation pruneWork();

    @java.lang.Deprecated
    public static androidx.work.WorkManager getInstance() {
        androidx.work.impl.WorkManagerImpl workManagerImpl = androidx.work.impl.WorkManagerImpl.getInstance();
        if (workManagerImpl != null) {
            return workManagerImpl;
        }
        throw new java.lang.IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    public static androidx.work.WorkManager getInstance(android.content.Context context) {
        return androidx.work.impl.WorkManagerImpl.getInstance(context);
    }

    public static void initialize(android.content.Context context, androidx.work.Configuration configuration) {
        androidx.work.impl.WorkManagerImpl.initialize(context, configuration);
    }

    public final androidx.work.Operation enqueue(androidx.work.WorkRequest workRequest) {
        return enqueue(java.util.Collections.singletonList(workRequest));
    }

    public final androidx.work.WorkContinuation beginWith(androidx.work.OneTimeWorkRequest work) {
        return beginWith(java.util.Collections.singletonList(work));
    }

    public final androidx.work.WorkContinuation beginUniqueWork(java.lang.String uniqueWorkName, androidx.work.ExistingWorkPolicy existingWorkPolicy, androidx.work.OneTimeWorkRequest work) {
        return beginUniqueWork(uniqueWorkName, existingWorkPolicy, java.util.Collections.singletonList(work));
    }

    public androidx.work.Operation enqueueUniqueWork(java.lang.String uniqueWorkName, androidx.work.ExistingWorkPolicy existingWorkPolicy, androidx.work.OneTimeWorkRequest work) {
        return enqueueUniqueWork(uniqueWorkName, existingWorkPolicy, java.util.Collections.singletonList(work));
    }

    protected WorkManager() {
    }
}
