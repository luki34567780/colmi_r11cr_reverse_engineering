package androidx.work.impl.constraints.trackers;

/* loaded from: classes.dex */
public class BatteryNotLowTracker extends androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker<java.lang.Boolean> {
    static final float BATTERY_LOW_THRESHOLD = 0.15f;
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("BatteryNotLowTracker");

    public BatteryNotLowTracker(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        super(context, taskExecutor);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public java.lang.Boolean getInitialState() {
        android.content.Intent registerReceiver = this.mAppContext.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            androidx.work.Logger.get().error(TAG, "getInitialState - null intent received", new java.lang.Throwable[0]);
            return null;
        }
        return java.lang.Boolean.valueOf(registerReceiver.getIntExtra(androidx.core.app.NotificationCompat.CATEGORY_STATUS, -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > BATTERY_LOW_THRESHOLD);
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public android.content.IntentFilter getIntentFilter() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
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
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            setState(true);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            setState(false);
        }
    }
}
