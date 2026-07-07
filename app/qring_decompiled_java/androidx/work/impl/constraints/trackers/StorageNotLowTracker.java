package androidx.work.impl.constraints.trackers;

/* loaded from: classes.dex */
public class StorageNotLowTracker extends androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker<java.lang.Boolean> {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("StorageNotLowTracker");

    public StorageNotLowTracker(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        super(context, taskExecutor);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public java.lang.Boolean getInitialState() {
        android.content.Intent registerReceiver = this.mAppContext.registerReceiver(null, getIntentFilter());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return true;
        }
        java.lang.String action = registerReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return false;
        }
        return !action.equals("android.intent.action.DEVICE_STORAGE_OK") ? null : true;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public android.content.IntentFilter getIntentFilter() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void onBroadcastReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        androidx.work.Logger.get().debug(TAG, java.lang.String.format("Received %s", intent.getAction()), new java.lang.Throwable[0]);
        java.lang.String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            setState(false);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            setState(true);
        }
    }
}
