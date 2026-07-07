package androidx.work.impl.background.systemalarm;

/* loaded from: classes.dex */
public class CommandHandler implements androidx.work.impl.ExecutionListener {
    static final java.lang.String ACTION_CONSTRAINTS_CHANGED = "ACTION_CONSTRAINTS_CHANGED";
    static final java.lang.String ACTION_DELAY_MET = "ACTION_DELAY_MET";
    static final java.lang.String ACTION_EXECUTION_COMPLETED = "ACTION_EXECUTION_COMPLETED";
    static final java.lang.String ACTION_RESCHEDULE = "ACTION_RESCHEDULE";
    static final java.lang.String ACTION_SCHEDULE_WORK = "ACTION_SCHEDULE_WORK";
    static final java.lang.String ACTION_STOP_WORK = "ACTION_STOP_WORK";
    private static final java.lang.String KEY_NEEDS_RESCHEDULE = "KEY_NEEDS_RESCHEDULE";
    private static final java.lang.String KEY_WORKSPEC_ID = "KEY_WORKSPEC_ID";
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("CommandHandler");
    static final long WORK_PROCESSING_TIME_IN_MS = 600000;
    private final android.content.Context mContext;
    private final java.util.Map<java.lang.String, androidx.work.impl.ExecutionListener> mPendingDelayMet = new java.util.HashMap();
    private final java.lang.Object mLock = new java.lang.Object();

    static android.content.Intent createScheduleWorkIntent(android.content.Context context, java.lang.String workSpecId) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction(ACTION_SCHEDULE_WORK);
        intent.putExtra(KEY_WORKSPEC_ID, workSpecId);
        return intent;
    }

    static android.content.Intent createDelayMetIntent(android.content.Context context, java.lang.String workSpecId) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction(ACTION_DELAY_MET);
        intent.putExtra(KEY_WORKSPEC_ID, workSpecId);
        return intent;
    }

    static android.content.Intent createStopWorkIntent(android.content.Context context, java.lang.String workSpecId) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction(ACTION_STOP_WORK);
        intent.putExtra(KEY_WORKSPEC_ID, workSpecId);
        return intent;
    }

    static android.content.Intent createConstraintsChangedIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction(ACTION_CONSTRAINTS_CHANGED);
        return intent;
    }

    static android.content.Intent createRescheduleIntent(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction(ACTION_RESCHEDULE);
        return intent;
    }

    static android.content.Intent createExecutionCompletedIntent(android.content.Context context, java.lang.String workSpecId, boolean needsReschedule) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction(ACTION_EXECUTION_COMPLETED);
        intent.putExtra(KEY_WORKSPEC_ID, workSpecId);
        intent.putExtra(KEY_NEEDS_RESCHEDULE, needsReschedule);
        return intent;
    }

    CommandHandler(android.content.Context context) {
        this.mContext = context;
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(java.lang.String workSpecId, boolean needsReschedule) {
        synchronized (this.mLock) {
            androidx.work.impl.ExecutionListener remove = this.mPendingDelayMet.remove(workSpecId);
            if (remove != null) {
                remove.onExecuted(workSpecId, needsReschedule);
            }
        }
    }

    boolean hasPendingCommands() {
        boolean z;
        synchronized (this.mLock) {
            z = !this.mPendingDelayMet.isEmpty();
        }
        return z;
    }

    void onHandleIntent(android.content.Intent intent, int startId, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher) {
        java.lang.String action = intent.getAction();
        if (ACTION_CONSTRAINTS_CHANGED.equals(action)) {
            handleConstraintsChanged(intent, startId, dispatcher);
            return;
        }
        if (ACTION_RESCHEDULE.equals(action)) {
            handleReschedule(intent, startId, dispatcher);
            return;
        }
        if (!hasKeys(intent.getExtras(), KEY_WORKSPEC_ID)) {
            androidx.work.Logger.get().error(TAG, java.lang.String.format("Invalid request for %s, requires %s.", action, KEY_WORKSPEC_ID), new java.lang.Throwable[0]);
            return;
        }
        if (ACTION_SCHEDULE_WORK.equals(action)) {
            handleScheduleWorkIntent(intent, startId, dispatcher);
            return;
        }
        if (ACTION_DELAY_MET.equals(action)) {
            handleDelayMet(intent, startId, dispatcher);
            return;
        }
        if (ACTION_STOP_WORK.equals(action)) {
            handleStopWork(intent, dispatcher);
        } else if (ACTION_EXECUTION_COMPLETED.equals(action)) {
            handleExecutionCompleted(intent, startId);
        } else {
            androidx.work.Logger.get().warning(TAG, java.lang.String.format("Ignoring intent %s", intent), new java.lang.Throwable[0]);
        }
    }

    private void handleScheduleWorkIntent(android.content.Intent intent, int startId, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher) {
        java.lang.String string = intent.getExtras().getString(KEY_WORKSPEC_ID);
        androidx.work.Logger logger = androidx.work.Logger.get();
        java.lang.String str = TAG;
        logger.debug(str, java.lang.String.format("Handling schedule work for %s", string), new java.lang.Throwable[0]);
        androidx.work.impl.WorkDatabase workDatabase = dispatcher.getWorkManager().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            androidx.work.impl.model.WorkSpec workSpec = workDatabase.workSpecDao().getWorkSpec(string);
            if (workSpec == null) {
                androidx.work.Logger.get().warning(str, "Skipping scheduling " + string + " because it's no longer in the DB", new java.lang.Throwable[0]);
                return;
            }
            if (workSpec.state.isFinished()) {
                androidx.work.Logger.get().warning(str, "Skipping scheduling " + string + "because it is finished.", new java.lang.Throwable[0]);
                return;
            }
            long calculateNextRunTime = workSpec.calculateNextRunTime();
            if (!workSpec.hasConstraints()) {
                androidx.work.Logger.get().debug(str, java.lang.String.format("Setting up Alarms for %s at %s", string, java.lang.Long.valueOf(calculateNextRunTime)), new java.lang.Throwable[0]);
                androidx.work.impl.background.systemalarm.Alarms.setAlarm(this.mContext, dispatcher.getWorkManager(), string, calculateNextRunTime);
            } else {
                androidx.work.Logger.get().debug(str, java.lang.String.format("Opportunistically setting an alarm for %s at %s", string, java.lang.Long.valueOf(calculateNextRunTime)), new java.lang.Throwable[0]);
                androidx.work.impl.background.systemalarm.Alarms.setAlarm(this.mContext, dispatcher.getWorkManager(), string, calculateNextRunTime);
                dispatcher.postOnMainThread(new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.AddRunnable(dispatcher, createConstraintsChangedIntent(this.mContext), startId));
            }
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
        }
    }

    private void handleDelayMet(android.content.Intent intent, int startId, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher) {
        android.os.Bundle extras = intent.getExtras();
        synchronized (this.mLock) {
            java.lang.String string = extras.getString(KEY_WORKSPEC_ID);
            androidx.work.Logger logger = androidx.work.Logger.get();
            java.lang.String str = TAG;
            logger.debug(str, java.lang.String.format("Handing delay met for %s", string), new java.lang.Throwable[0]);
            if (!this.mPendingDelayMet.containsKey(string)) {
                androidx.work.impl.background.systemalarm.DelayMetCommandHandler delayMetCommandHandler = new androidx.work.impl.background.systemalarm.DelayMetCommandHandler(this.mContext, startId, string, dispatcher);
                this.mPendingDelayMet.put(string, delayMetCommandHandler);
                delayMetCommandHandler.handleProcessWork();
            } else {
                androidx.work.Logger.get().debug(str, java.lang.String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new java.lang.Throwable[0]);
            }
        }
    }

    private void handleStopWork(android.content.Intent intent, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher) {
        java.lang.String string = intent.getExtras().getString(KEY_WORKSPEC_ID);
        androidx.work.Logger.get().debug(TAG, java.lang.String.format("Handing stopWork work for %s", string), new java.lang.Throwable[0]);
        dispatcher.getWorkManager().stopWork(string);
        androidx.work.impl.background.systemalarm.Alarms.cancelAlarm(this.mContext, dispatcher.getWorkManager(), string);
        dispatcher.onExecuted(string, false);
    }

    private void handleConstraintsChanged(android.content.Intent intent, int startId, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher) {
        androidx.work.Logger.get().debug(TAG, java.lang.String.format("Handling constraints changed %s", intent), new java.lang.Throwable[0]);
        new androidx.work.impl.background.systemalarm.ConstraintsCommandHandler(this.mContext, startId, dispatcher).handleConstraintsChanged();
    }

    private void handleReschedule(android.content.Intent intent, int startId, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher) {
        androidx.work.Logger.get().debug(TAG, java.lang.String.format("Handling reschedule %s, %s", intent, java.lang.Integer.valueOf(startId)), new java.lang.Throwable[0]);
        dispatcher.getWorkManager().rescheduleEligibleWork();
    }

    private void handleExecutionCompleted(android.content.Intent intent, int startId) {
        android.os.Bundle extras = intent.getExtras();
        java.lang.String string = extras.getString(KEY_WORKSPEC_ID);
        boolean z = extras.getBoolean(KEY_NEEDS_RESCHEDULE);
        androidx.work.Logger.get().debug(TAG, java.lang.String.format("Handling onExecutionCompleted %s, %s", intent, java.lang.Integer.valueOf(startId)), new java.lang.Throwable[0]);
        onExecuted(string, z);
    }

    private static boolean hasKeys(android.os.Bundle bundle, java.lang.String... keys) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (java.lang.String str : keys) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }
}
