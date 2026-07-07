package androidx.work.impl.background.systemalarm;

/* loaded from: classes.dex */
public class SystemAlarmService extends androidx.lifecycle.LifecycleService implements androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.CommandsCompletedListener {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("SystemAlarmService");
    private androidx.work.impl.background.systemalarm.SystemAlarmDispatcher mDispatcher;
    private boolean mIsShutdown;

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        initializeDispatcher();
        this.mIsShutdown = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mIsShutdown = true;
        this.mDispatcher.onDestroy();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(android.content.Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (this.mIsShutdown) {
            androidx.work.Logger.get().info(TAG, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new java.lang.Throwable[0]);
            this.mDispatcher.onDestroy();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        this.mDispatcher.add(intent, startId);
        return 3;
    }

    @Override // androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.CommandsCompletedListener
    public void onAllCommandsCompleted() {
        this.mIsShutdown = true;
        androidx.work.Logger.get().debug(TAG, "All commands completed in dispatcher", new java.lang.Throwable[0]);
        androidx.work.impl.utils.WakeLocks.checkWakeLocks();
        stopSelf();
    }

    private void initializeDispatcher() {
        androidx.work.impl.background.systemalarm.SystemAlarmDispatcher systemAlarmDispatcher = new androidx.work.impl.background.systemalarm.SystemAlarmDispatcher(this);
        this.mDispatcher = systemAlarmDispatcher;
        systemAlarmDispatcher.setCompletedListener(this);
    }
}
