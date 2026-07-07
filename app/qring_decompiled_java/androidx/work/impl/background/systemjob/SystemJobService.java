package androidx.work.impl.background.systemjob;

/* loaded from: classes.dex */
public class SystemJobService extends android.app.job.JobService implements androidx.work.impl.ExecutionListener {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("SystemJobService");
    private final java.util.Map<java.lang.String, android.app.job.JobParameters> mJobParameters = new java.util.HashMap();
    private androidx.work.impl.WorkManagerImpl mWorkManagerImpl;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            androidx.work.impl.WorkManagerImpl workManagerImpl = androidx.work.impl.WorkManagerImpl.getInstance(getApplicationContext());
            this.mWorkManagerImpl = workManagerImpl;
            workManagerImpl.getProcessor().addExecutionListener(this);
        } catch (java.lang.IllegalStateException unused) {
            if (!android.app.Application.class.equals(getApplication().getClass())) {
                throw new java.lang.IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            androidx.work.Logger.get().warning(TAG, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new java.lang.Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        androidx.work.impl.WorkManagerImpl workManagerImpl = this.mWorkManagerImpl;
        if (workManagerImpl != null) {
            workManagerImpl.getProcessor().removeExecutionListener(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(android.app.job.JobParameters params) {
        if (this.mWorkManagerImpl == null) {
            androidx.work.Logger.get().debug(TAG, "WorkManager is not initialized; requesting retry.", new java.lang.Throwable[0]);
            jobFinished(params, true);
            return false;
        }
        java.lang.String workSpecIdFromJobParameters = getWorkSpecIdFromJobParameters(params);
        if (android.text.TextUtils.isEmpty(workSpecIdFromJobParameters)) {
            androidx.work.Logger.get().error(TAG, "WorkSpec id not found!", new java.lang.Throwable[0]);
            return false;
        }
        synchronized (this.mJobParameters) {
            if (this.mJobParameters.containsKey(workSpecIdFromJobParameters)) {
                androidx.work.Logger.get().debug(TAG, java.lang.String.format("Job is already being executed by SystemJobService: %s", workSpecIdFromJobParameters), new java.lang.Throwable[0]);
                return false;
            }
            androidx.work.Logger.get().debug(TAG, java.lang.String.format("onStartJob for %s", workSpecIdFromJobParameters), new java.lang.Throwable[0]);
            this.mJobParameters.put(workSpecIdFromJobParameters, params);
            androidx.work.WorkerParameters.RuntimeExtras runtimeExtras = null;
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                runtimeExtras = new androidx.work.WorkerParameters.RuntimeExtras();
                if (params.getTriggeredContentUris() != null) {
                    runtimeExtras.triggeredContentUris = java.util.Arrays.asList(params.getTriggeredContentUris());
                }
                if (params.getTriggeredContentAuthorities() != null) {
                    runtimeExtras.triggeredContentAuthorities = java.util.Arrays.asList(params.getTriggeredContentAuthorities());
                }
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    runtimeExtras.network = params.getNetwork();
                }
            }
            this.mWorkManagerImpl.startWork(workSpecIdFromJobParameters, runtimeExtras);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters params) {
        if (this.mWorkManagerImpl == null) {
            androidx.work.Logger.get().debug(TAG, "WorkManager is not initialized; requesting retry.", new java.lang.Throwable[0]);
            return true;
        }
        java.lang.String workSpecIdFromJobParameters = getWorkSpecIdFromJobParameters(params);
        if (android.text.TextUtils.isEmpty(workSpecIdFromJobParameters)) {
            androidx.work.Logger.get().error(TAG, "WorkSpec id not found!", new java.lang.Throwable[0]);
            return false;
        }
        androidx.work.Logger.get().debug(TAG, java.lang.String.format("onStopJob for %s", workSpecIdFromJobParameters), new java.lang.Throwable[0]);
        synchronized (this.mJobParameters) {
            this.mJobParameters.remove(workSpecIdFromJobParameters);
        }
        this.mWorkManagerImpl.stopWork(workSpecIdFromJobParameters);
        return !this.mWorkManagerImpl.getProcessor().isCancelled(workSpecIdFromJobParameters);
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(java.lang.String workSpecId, boolean needsReschedule) {
        android.app.job.JobParameters remove;
        androidx.work.Logger.get().debug(TAG, java.lang.String.format("%s executed on JobScheduler", workSpecId), new java.lang.Throwable[0]);
        synchronized (this.mJobParameters) {
            remove = this.mJobParameters.remove(workSpecId);
        }
        if (remove != null) {
            jobFinished(remove, needsReschedule);
        }
    }

    private static java.lang.String getWorkSpecIdFromJobParameters(android.app.job.JobParameters parameters) {
        try {
            android.os.PersistableBundle extras = parameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (java.lang.NullPointerException unused) {
            return null;
        }
    }
}
