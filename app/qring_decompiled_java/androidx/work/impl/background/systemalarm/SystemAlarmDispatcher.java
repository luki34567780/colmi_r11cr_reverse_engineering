package androidx.work.impl.background.systemalarm;

/* loaded from: classes.dex */
public class SystemAlarmDispatcher implements androidx.work.impl.ExecutionListener {
    private static final int DEFAULT_START_ID = 0;
    private static final java.lang.String KEY_START_ID = "KEY_START_ID";
    private static final java.lang.String PROCESS_COMMAND_TAG = "ProcessCommand";
    static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("SystemAlarmDispatcher");
    final androidx.work.impl.background.systemalarm.CommandHandler mCommandHandler;
    private androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.CommandsCompletedListener mCompletedListener;
    final android.content.Context mContext;
    android.content.Intent mCurrentIntent;
    final java.util.List<android.content.Intent> mIntents;
    private final android.os.Handler mMainHandler;
    private final androidx.work.impl.Processor mProcessor;
    private final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;
    private final androidx.work.impl.WorkManagerImpl mWorkManager;
    private final androidx.work.impl.utils.WorkTimer mWorkTimer;

    interface CommandsCompletedListener {
        void onAllCommandsCompleted();
    }

    SystemAlarmDispatcher(android.content.Context context) {
        this(context, null, null);
    }

    SystemAlarmDispatcher(android.content.Context context, androidx.work.impl.Processor processor, androidx.work.impl.WorkManagerImpl workManager) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mCommandHandler = new androidx.work.impl.background.systemalarm.CommandHandler(applicationContext);
        this.mWorkTimer = new androidx.work.impl.utils.WorkTimer();
        workManager = workManager == null ? androidx.work.impl.WorkManagerImpl.getInstance(context) : workManager;
        this.mWorkManager = workManager;
        processor = processor == null ? workManager.getProcessor() : processor;
        this.mProcessor = processor;
        this.mTaskExecutor = workManager.getWorkTaskExecutor();
        processor.addExecutionListener(this);
        this.mIntents = new java.util.ArrayList();
        this.mCurrentIntent = null;
        this.mMainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    void onDestroy() {
        androidx.work.Logger.get().debug(TAG, "Destroying SystemAlarmDispatcher", new java.lang.Throwable[0]);
        this.mProcessor.removeExecutionListener(this);
        this.mWorkTimer.onDestroy();
        this.mCompletedListener = null;
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(java.lang.String workSpecId, boolean needsReschedule) {
        postOnMainThread(new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.AddRunnable(this, androidx.work.impl.background.systemalarm.CommandHandler.createExecutionCompletedIntent(this.mContext, workSpecId, needsReschedule), 0));
    }

    public boolean add(final android.content.Intent intent, final int startId) {
        androidx.work.Logger logger = androidx.work.Logger.get();
        java.lang.String str = TAG;
        logger.debug(str, java.lang.String.format("Adding command %s (%s)", intent, java.lang.Integer.valueOf(startId)), new java.lang.Throwable[0]);
        assertMainThread();
        java.lang.String action = intent.getAction();
        if (android.text.TextUtils.isEmpty(action)) {
            androidx.work.Logger.get().warning(str, "Unknown command. Ignoring", new java.lang.Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && hasIntentWithAction("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra(KEY_START_ID, startId);
        synchronized (this.mIntents) {
            boolean z = this.mIntents.isEmpty() ? false : true;
            this.mIntents.add(intent);
            if (!z) {
                processCommand();
            }
        }
        return true;
    }

    void setCompletedListener(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.CommandsCompletedListener listener) {
        if (this.mCompletedListener != null) {
            androidx.work.Logger.get().error(TAG, "A completion listener for SystemAlarmDispatcher already exists.", new java.lang.Throwable[0]);
        } else {
            this.mCompletedListener = listener;
        }
    }

    androidx.work.impl.Processor getProcessor() {
        return this.mProcessor;
    }

    androidx.work.impl.utils.WorkTimer getWorkTimer() {
        return this.mWorkTimer;
    }

    androidx.work.impl.WorkManagerImpl getWorkManager() {
        return this.mWorkManager;
    }

    androidx.work.impl.utils.taskexecutor.TaskExecutor getTaskExecutor() {
        return this.mTaskExecutor;
    }

    void postOnMainThread(java.lang.Runnable runnable) {
        this.mMainHandler.post(runnable);
    }

    void dequeueAndCheckForCompletion() {
        androidx.work.Logger logger = androidx.work.Logger.get();
        java.lang.String str = TAG;
        logger.debug(str, "Checking if commands are complete.", new java.lang.Throwable[0]);
        assertMainThread();
        synchronized (this.mIntents) {
            if (this.mCurrentIntent != null) {
                androidx.work.Logger.get().debug(str, java.lang.String.format("Removing command %s", this.mCurrentIntent), new java.lang.Throwable[0]);
                if (!this.mIntents.remove(0).equals(this.mCurrentIntent)) {
                    throw new java.lang.IllegalStateException("Dequeue-d command is not the first.");
                }
                this.mCurrentIntent = null;
            }
            androidx.work.impl.utils.SerialExecutor backgroundExecutor = this.mTaskExecutor.getBackgroundExecutor();
            if (!this.mCommandHandler.hasPendingCommands() && this.mIntents.isEmpty() && !backgroundExecutor.hasPendingTasks()) {
                androidx.work.Logger.get().debug(str, "No more commands & intents.", new java.lang.Throwable[0]);
                androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.CommandsCompletedListener commandsCompletedListener = this.mCompletedListener;
                if (commandsCompletedListener != null) {
                    commandsCompletedListener.onAllCommandsCompleted();
                }
            } else if (!this.mIntents.isEmpty()) {
                processCommand();
            }
        }
    }

    private void processCommand() {
        assertMainThread();
        android.os.PowerManager.WakeLock newWakeLock = androidx.work.impl.utils.WakeLocks.newWakeLock(this.mContext, PROCESS_COMMAND_TAG);
        try {
            newWakeLock.acquire();
            this.mWorkManager.getWorkTaskExecutor().executeOnBackgroundThread(new java.lang.Runnable() { // from class: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.1
                @Override // java.lang.Runnable
                public void run() {
                    androidx.work.impl.background.systemalarm.SystemAlarmDispatcher systemAlarmDispatcher;
                    androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.DequeueAndCheckForCompletion dequeueAndCheckForCompletion;
                    synchronized (androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mIntents) {
                        androidx.work.impl.background.systemalarm.SystemAlarmDispatcher systemAlarmDispatcher2 = androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this;
                        systemAlarmDispatcher2.mCurrentIntent = systemAlarmDispatcher2.mIntents.get(0);
                    }
                    if (androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mCurrentIntent != null) {
                        java.lang.String action = androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mCurrentIntent.getAction();
                        int intExtra = androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mCurrentIntent.getIntExtra(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.KEY_START_ID, 0);
                        androidx.work.Logger.get().debug(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG, java.lang.String.format("Processing command %s, %s", androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mCurrentIntent, java.lang.Integer.valueOf(intExtra)), new java.lang.Throwable[0]);
                        android.os.PowerManager.WakeLock newWakeLock2 = androidx.work.impl.utils.WakeLocks.newWakeLock(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mContext, java.lang.String.format("%s (%s)", action, java.lang.Integer.valueOf(intExtra)));
                        try {
                            androidx.work.Logger.get().debug(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG, java.lang.String.format("Acquiring operation wake lock (%s) %s", action, newWakeLock2), new java.lang.Throwable[0]);
                            newWakeLock2.acquire();
                            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mCommandHandler.onHandleIntent(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this.mCurrentIntent, intExtra, androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this);
                            androidx.work.Logger.get().debug(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG, java.lang.String.format("Releasing operation wake lock (%s) %s", action, newWakeLock2), new java.lang.Throwable[0]);
                            newWakeLock2.release();
                            systemAlarmDispatcher = androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this;
                            dequeueAndCheckForCompletion = new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.DequeueAndCheckForCompletion(systemAlarmDispatcher);
                        } catch (java.lang.Throwable th) {
                            try {
                                androidx.work.Logger.get().error(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG, "Unexpected error in onHandleIntent", th);
                                androidx.work.Logger.get().debug(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG, java.lang.String.format("Releasing operation wake lock (%s) %s", action, newWakeLock2), new java.lang.Throwable[0]);
                                newWakeLock2.release();
                                systemAlarmDispatcher = androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this;
                                dequeueAndCheckForCompletion = new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.DequeueAndCheckForCompletion(systemAlarmDispatcher);
                            } catch (java.lang.Throwable th2) {
                                androidx.work.Logger.get().debug(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.TAG, java.lang.String.format("Releasing operation wake lock (%s) %s", action, newWakeLock2), new java.lang.Throwable[0]);
                                newWakeLock2.release();
                                androidx.work.impl.background.systemalarm.SystemAlarmDispatcher systemAlarmDispatcher3 = androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.this;
                                systemAlarmDispatcher3.postOnMainThread(new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.DequeueAndCheckForCompletion(systemAlarmDispatcher3));
                                throw th2;
                            }
                        }
                        systemAlarmDispatcher.postOnMainThread(dequeueAndCheckForCompletion);
                    }
                }
            });
        } finally {
            newWakeLock.release();
        }
    }

    private boolean hasIntentWithAction(java.lang.String action) {
        assertMainThread();
        synchronized (this.mIntents) {
            java.util.Iterator<android.content.Intent> it = this.mIntents.iterator();
            while (it.hasNext()) {
                if (action.equals(it.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void assertMainThread() {
        if (this.mMainHandler.getLooper().getThread() != java.lang.Thread.currentThread()) {
            throw new java.lang.IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    static class DequeueAndCheckForCompletion implements java.lang.Runnable {
        private final androidx.work.impl.background.systemalarm.SystemAlarmDispatcher mDispatcher;

        DequeueAndCheckForCompletion(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher) {
            this.mDispatcher = dispatcher;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mDispatcher.dequeueAndCheckForCompletion();
        }
    }

    static class AddRunnable implements java.lang.Runnable {
        private final androidx.work.impl.background.systemalarm.SystemAlarmDispatcher mDispatcher;
        private final android.content.Intent mIntent;
        private final int mStartId;

        AddRunnable(androidx.work.impl.background.systemalarm.SystemAlarmDispatcher dispatcher, android.content.Intent intent, int startId) {
            this.mDispatcher = dispatcher;
            this.mIntent = intent;
            this.mStartId = startId;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mDispatcher.add(this.mIntent, this.mStartId);
        }
    }
}
