package androidx.work.impl.foreground;

/* loaded from: classes.dex */
public class SystemForegroundDispatcher implements androidx.work.impl.constraints.WorkConstraintsCallback, androidx.work.impl.ExecutionListener {
    private static final java.lang.String ACTION_CANCEL_WORK = "ACTION_CANCEL_WORK";
    private static final java.lang.String ACTION_NOTIFY = "ACTION_NOTIFY";
    private static final java.lang.String ACTION_START_FOREGROUND = "ACTION_START_FOREGROUND";
    private static final java.lang.String ACTION_STOP_FOREGROUND = "ACTION_STOP_FOREGROUND";
    private static final java.lang.String KEY_FOREGROUND_SERVICE_TYPE = "KEY_FOREGROUND_SERVICE_TYPE";
    private static final java.lang.String KEY_NOTIFICATION = "KEY_NOTIFICATION";
    private static final java.lang.String KEY_NOTIFICATION_ID = "KEY_NOTIFICATION_ID";
    private static final java.lang.String KEY_WORKSPEC_ID = "KEY_WORKSPEC_ID";
    static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("SystemFgDispatcher");
    private androidx.work.impl.foreground.SystemForegroundDispatcher.Callback mCallback;
    final androidx.work.impl.constraints.WorkConstraintsTracker mConstraintsTracker;
    private android.content.Context mContext;
    java.lang.String mCurrentForegroundWorkSpecId;
    final java.util.Map<java.lang.String, androidx.work.ForegroundInfo> mForegroundInfoById;
    final java.lang.Object mLock;
    private final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;
    final java.util.Set<androidx.work.impl.model.WorkSpec> mTrackedWorkSpecs;
    private androidx.work.impl.WorkManagerImpl mWorkManagerImpl;
    final java.util.Map<java.lang.String, androidx.work.impl.model.WorkSpec> mWorkSpecById;

    interface Callback {
        void cancelNotification(int notificationId);

        void notify(int notificationId, android.app.Notification notification);

        void startForeground(int notificationId, int notificationType, android.app.Notification notification);

        void stop();
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(java.util.List<java.lang.String> workSpecIds) {
    }

    SystemForegroundDispatcher(android.content.Context context) {
        this.mContext = context;
        this.mLock = new java.lang.Object();
        androidx.work.impl.WorkManagerImpl workManagerImpl = androidx.work.impl.WorkManagerImpl.getInstance(this.mContext);
        this.mWorkManagerImpl = workManagerImpl;
        androidx.work.impl.utils.taskexecutor.TaskExecutor workTaskExecutor = workManagerImpl.getWorkTaskExecutor();
        this.mTaskExecutor = workTaskExecutor;
        this.mCurrentForegroundWorkSpecId = null;
        this.mForegroundInfoById = new java.util.LinkedHashMap();
        this.mTrackedWorkSpecs = new java.util.HashSet();
        this.mWorkSpecById = new java.util.HashMap();
        this.mConstraintsTracker = new androidx.work.impl.constraints.WorkConstraintsTracker(this.mContext, workTaskExecutor, this);
        this.mWorkManagerImpl.getProcessor().addExecutionListener(this);
    }

    SystemForegroundDispatcher(android.content.Context context, androidx.work.impl.WorkManagerImpl workManagerImpl, androidx.work.impl.constraints.WorkConstraintsTracker tracker) {
        this.mContext = context;
        this.mLock = new java.lang.Object();
        this.mWorkManagerImpl = workManagerImpl;
        this.mTaskExecutor = workManagerImpl.getWorkTaskExecutor();
        this.mCurrentForegroundWorkSpecId = null;
        this.mForegroundInfoById = new java.util.LinkedHashMap();
        this.mTrackedWorkSpecs = new java.util.HashSet();
        this.mWorkSpecById = new java.util.HashMap();
        this.mConstraintsTracker = tracker;
        this.mWorkManagerImpl.getProcessor().addExecutionListener(this);
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(java.lang.String workSpecId, boolean needsReschedule) {
        java.util.Map.Entry<java.lang.String, androidx.work.ForegroundInfo> entry;
        synchronized (this.mLock) {
            androidx.work.impl.model.WorkSpec remove = this.mWorkSpecById.remove(workSpecId);
            if (remove != null ? this.mTrackedWorkSpecs.remove(remove) : false) {
                this.mConstraintsTracker.replace(this.mTrackedWorkSpecs);
            }
        }
        androidx.work.ForegroundInfo remove2 = this.mForegroundInfoById.remove(workSpecId);
        if (workSpecId.equals(this.mCurrentForegroundWorkSpecId) && this.mForegroundInfoById.size() > 0) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, androidx.work.ForegroundInfo>> it = this.mForegroundInfoById.entrySet().iterator();
            java.util.Map.Entry<java.lang.String, androidx.work.ForegroundInfo> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.mCurrentForegroundWorkSpecId = entry.getKey();
            if (this.mCallback != null) {
                androidx.work.ForegroundInfo value = entry.getValue();
                this.mCallback.startForeground(value.getNotificationId(), value.getForegroundServiceType(), value.getNotification());
                this.mCallback.cancelNotification(value.getNotificationId());
            }
        }
        androidx.work.impl.foreground.SystemForegroundDispatcher.Callback callback = this.mCallback;
        if (remove2 == null || callback == null) {
            return;
        }
        androidx.work.Logger.get().debug(TAG, java.lang.String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", java.lang.Integer.valueOf(remove2.getNotificationId()), workSpecId, java.lang.Integer.valueOf(remove2.getForegroundServiceType())), new java.lang.Throwable[0]);
        callback.cancelNotification(remove2.getNotificationId());
    }

    void setCallback(androidx.work.impl.foreground.SystemForegroundDispatcher.Callback callback) {
        if (this.mCallback != null) {
            androidx.work.Logger.get().error(TAG, "A callback already exists.", new java.lang.Throwable[0]);
        } else {
            this.mCallback = callback;
        }
    }

    androidx.work.impl.WorkManagerImpl getWorkManager() {
        return this.mWorkManagerImpl;
    }

    void onStartCommand(android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (ACTION_START_FOREGROUND.equals(action)) {
            handleStartForeground(intent);
            handleNotify(intent);
        } else if (ACTION_NOTIFY.equals(action)) {
            handleNotify(intent);
        } else if (ACTION_CANCEL_WORK.equals(action)) {
            handleCancelWork(intent);
        } else if (ACTION_STOP_FOREGROUND.equals(action)) {
            handleStop(intent);
        }
    }

    void onDestroy() {
        this.mCallback = null;
        synchronized (this.mLock) {
            this.mConstraintsTracker.reset();
        }
        this.mWorkManagerImpl.getProcessor().removeExecutionListener(this);
    }

    private void handleStartForeground(android.content.Intent intent) {
        androidx.work.Logger.get().info(TAG, java.lang.String.format("Started foreground service %s", intent), new java.lang.Throwable[0]);
        final java.lang.String stringExtra = intent.getStringExtra(KEY_WORKSPEC_ID);
        final androidx.work.impl.WorkDatabase workDatabase = this.mWorkManagerImpl.getWorkDatabase();
        this.mTaskExecutor.executeOnBackgroundThread(new java.lang.Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundDispatcher.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.work.impl.model.WorkSpec workSpec = workDatabase.workSpecDao().getWorkSpec(stringExtra);
                if (workSpec == null || !workSpec.hasConstraints()) {
                    return;
                }
                synchronized (androidx.work.impl.foreground.SystemForegroundDispatcher.this.mLock) {
                    androidx.work.impl.foreground.SystemForegroundDispatcher.this.mWorkSpecById.put(stringExtra, workSpec);
                    androidx.work.impl.foreground.SystemForegroundDispatcher.this.mTrackedWorkSpecs.add(workSpec);
                    androidx.work.impl.foreground.SystemForegroundDispatcher.this.mConstraintsTracker.replace(androidx.work.impl.foreground.SystemForegroundDispatcher.this.mTrackedWorkSpecs);
                }
            }
        });
    }

    private void handleNotify(android.content.Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra(KEY_NOTIFICATION_ID, 0);
        int intExtra2 = intent.getIntExtra(KEY_FOREGROUND_SERVICE_TYPE, 0);
        java.lang.String stringExtra = intent.getStringExtra(KEY_WORKSPEC_ID);
        android.app.Notification notification = (android.app.Notification) intent.getParcelableExtra(KEY_NOTIFICATION);
        androidx.work.Logger.get().debug(TAG, java.lang.String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", java.lang.Integer.valueOf(intExtra), stringExtra, java.lang.Integer.valueOf(intExtra2)), new java.lang.Throwable[0]);
        if (notification == null || this.mCallback == null) {
            return;
        }
        this.mForegroundInfoById.put(stringExtra, new androidx.work.ForegroundInfo(intExtra, notification, intExtra2));
        if (android.text.TextUtils.isEmpty(this.mCurrentForegroundWorkSpecId)) {
            this.mCurrentForegroundWorkSpecId = stringExtra;
            this.mCallback.startForeground(intExtra, intExtra2, notification);
            return;
        }
        this.mCallback.notify(intExtra, notification);
        if (intExtra2 == 0 || android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.String, androidx.work.ForegroundInfo>> it = this.mForegroundInfoById.entrySet().iterator();
        while (it.hasNext()) {
            i |= it.next().getValue().getForegroundServiceType();
        }
        androidx.work.ForegroundInfo foregroundInfo = this.mForegroundInfoById.get(this.mCurrentForegroundWorkSpecId);
        if (foregroundInfo != null) {
            this.mCallback.startForeground(foregroundInfo.getNotificationId(), i, foregroundInfo.getNotification());
        }
    }

    void handleStop(android.content.Intent intent) {
        androidx.work.Logger.get().info(TAG, "Stopping foreground service", new java.lang.Throwable[0]);
        androidx.work.impl.foreground.SystemForegroundDispatcher.Callback callback = this.mCallback;
        if (callback != null) {
            callback.stop();
        }
    }

    private void handleCancelWork(android.content.Intent intent) {
        androidx.work.Logger.get().info(TAG, java.lang.String.format("Stopping foreground work for %s", intent), new java.lang.Throwable[0]);
        java.lang.String stringExtra = intent.getStringExtra(KEY_WORKSPEC_ID);
        if (stringExtra == null || android.text.TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.mWorkManagerImpl.cancelWorkById(java.util.UUID.fromString(stringExtra));
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(java.util.List<java.lang.String> workSpecIds) {
        if (workSpecIds.isEmpty()) {
            return;
        }
        for (java.lang.String str : workSpecIds) {
            androidx.work.Logger.get().debug(TAG, java.lang.String.format("Constraints unmet for WorkSpec %s", str), new java.lang.Throwable[0]);
            this.mWorkManagerImpl.stopForegroundWork(str);
        }
    }

    public static android.content.Intent createStartForegroundIntent(android.content.Context context, java.lang.String workSpecId, androidx.work.ForegroundInfo info) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
        intent.setAction(ACTION_START_FOREGROUND);
        intent.putExtra(KEY_WORKSPEC_ID, workSpecId);
        intent.putExtra(KEY_NOTIFICATION_ID, info.getNotificationId());
        intent.putExtra(KEY_FOREGROUND_SERVICE_TYPE, info.getForegroundServiceType());
        intent.putExtra(KEY_NOTIFICATION, info.getNotification());
        intent.putExtra(KEY_WORKSPEC_ID, workSpecId);
        return intent;
    }

    public static android.content.Intent createCancelWorkIntent(android.content.Context context, java.lang.String workSpecId) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
        intent.setAction(ACTION_CANCEL_WORK);
        intent.setData(android.net.Uri.parse(java.lang.String.format("workspec://%s", workSpecId)));
        intent.putExtra(KEY_WORKSPEC_ID, workSpecId);
        return intent;
    }

    public static android.content.Intent createNotifyIntent(android.content.Context context, java.lang.String workSpecId, androidx.work.ForegroundInfo info) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
        intent.setAction(ACTION_NOTIFY);
        intent.putExtra(KEY_NOTIFICATION_ID, info.getNotificationId());
        intent.putExtra(KEY_FOREGROUND_SERVICE_TYPE, info.getForegroundServiceType());
        intent.putExtra(KEY_NOTIFICATION, info.getNotification());
        intent.putExtra(KEY_WORKSPEC_ID, workSpecId);
        return intent;
    }

    public static android.content.Intent createStopForegroundIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
        intent.setAction(ACTION_STOP_FOREGROUND);
        return intent;
    }
}
