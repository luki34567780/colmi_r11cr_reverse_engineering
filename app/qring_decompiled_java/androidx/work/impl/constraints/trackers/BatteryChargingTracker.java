package androidx.work.impl.constraints.trackers;

/* loaded from: classes.dex */
public class BatteryChargingTracker extends androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker<java.lang.Boolean> {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("BatteryChrgTracker");

    public BatteryChargingTracker(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        super(context, taskExecutor);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public java.lang.Boolean getInitialState() {
        android.content.Intent registerReceiver = this.mAppContext.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            androidx.work.Logger.get().error(TAG, "getInitialState - null intent received", new java.lang.Throwable[0]);
            return null;
        }
        return java.lang.Boolean.valueOf(isBatteryChangedIntentCharging(registerReceiver));
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public android.content.IntentFilter getIntentFilter() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void onBroadcastReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (action == null) {
        }
        androidx.work.Logger.get().debug(TAG, java.lang.String.format("Received %s", action), new java.lang.Throwable[0]);
        action.hashCode();
        switch (action) {
            case "android.intent.action.ACTION_POWER_DISCONNECTED":
                setState(false);
                break;
            case "android.os.action.DISCHARGING":
                setState(false);
                break;
            case "android.os.action.CHARGING":
                setState(true);
                break;
            case "android.intent.action.ACTION_POWER_CONNECTED":
                setState(true);
                break;
        }
    }

    private boolean isBatteryChangedIntentCharging(android.content.Intent intent) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra(androidx.core.app.NotificationCompat.CATEGORY_STATUS, -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }
}
