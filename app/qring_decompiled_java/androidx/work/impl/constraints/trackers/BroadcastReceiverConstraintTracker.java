package androidx.work.impl.constraints.trackers;

/* loaded from: classes.dex */
public abstract class BroadcastReceiverConstraintTracker<T> extends androidx.work.impl.constraints.trackers.ConstraintTracker<T> {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("BrdcstRcvrCnstrntTrckr");
    private final android.content.BroadcastReceiver mBroadcastReceiver;

    public abstract android.content.IntentFilter getIntentFilter();

    public abstract void onBroadcastReceive(android.content.Context context, android.content.Intent intent);

    public BroadcastReceiverConstraintTracker(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        this.mBroadcastReceiver = new android.content.BroadcastReceiver() { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                if (intent != null) {
                    androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker.this.onBroadcastReceive(context2, intent);
                }
            }
        };
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        androidx.work.Logger.get().debug(TAG, java.lang.String.format("%s: registering receiver", getClass().getSimpleName()), new java.lang.Throwable[0]);
        this.mAppContext.registerReceiver(this.mBroadcastReceiver, getIntentFilter());
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        androidx.work.Logger.get().debug(TAG, java.lang.String.format("%s: unregistering receiver", getClass().getSimpleName()), new java.lang.Throwable[0]);
        this.mAppContext.unregisterReceiver(this.mBroadcastReceiver);
    }
}
