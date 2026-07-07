package androidx.work.impl.background.systemalarm;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends android.content.BroadcastReceiver {
    static final java.lang.String ACTION = "androidx.work.impl.background.systemalarm.UpdateProxies";
    static final java.lang.String KEY_BATTERY_CHARGING_PROXY_ENABLED = "KEY_BATTERY_CHARGING_PROXY_ENABLED";
    static final java.lang.String KEY_BATTERY_NOT_LOW_PROXY_ENABLED = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";
    static final java.lang.String KEY_NETWORK_STATE_PROXY_ENABLED = "KEY_NETWORK_STATE_PROXY_ENABLED";
    static final java.lang.String KEY_STORAGE_NOT_LOW_PROXY_ENABLED = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";
    static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("ConstrntProxyUpdtRecvr");

    public static android.content.Intent newConstraintProxyUpdateIntent(android.content.Context context, boolean batteryNotLowProxyEnabled, boolean batteryChargingProxyEnabled, boolean storageNotLowProxyEnabled, boolean networkStateProxyEnabled) {
        android.content.Intent intent = new android.content.Intent(ACTION);
        intent.setComponent(new android.content.ComponentName(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.class));
        intent.putExtra(KEY_BATTERY_NOT_LOW_PROXY_ENABLED, batteryNotLowProxyEnabled).putExtra(KEY_BATTERY_CHARGING_PROXY_ENABLED, batteryChargingProxyEnabled).putExtra(KEY_STORAGE_NOT_LOW_PROXY_ENABLED, storageNotLowProxyEnabled).putExtra(KEY_NETWORK_STATE_PROXY_ENABLED, networkStateProxyEnabled);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final android.content.Context context, final android.content.Intent intent) {
        java.lang.String action = intent != null ? intent.getAction() : null;
        if (!ACTION.equals(action)) {
            androidx.work.Logger.get().debug(TAG, java.lang.String.format("Ignoring unknown action %s", action), new java.lang.Throwable[0]);
        } else {
            final android.content.BroadcastReceiver.PendingResult goAsync = goAsync();
            androidx.work.impl.WorkManagerImpl.getInstance(context).getWorkTaskExecutor().executeOnBackgroundThread(new java.lang.Runnable() { // from class: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        boolean booleanExtra = intent.getBooleanExtra(androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.KEY_BATTERY_NOT_LOW_PROXY_ENABLED, false);
                        boolean booleanExtra2 = intent.getBooleanExtra(androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.KEY_BATTERY_CHARGING_PROXY_ENABLED, false);
                        boolean booleanExtra3 = intent.getBooleanExtra(androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.KEY_STORAGE_NOT_LOW_PROXY_ENABLED, false);
                        boolean booleanExtra4 = intent.getBooleanExtra(androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.KEY_NETWORK_STATE_PROXY_ENABLED, false);
                        androidx.work.Logger.get().debug(androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.TAG, java.lang.String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(booleanExtra2), java.lang.Boolean.valueOf(booleanExtra3), java.lang.Boolean.valueOf(booleanExtra4)), new java.lang.Throwable[0]);
                        androidx.work.impl.utils.PackageManagerHelper.setComponentEnabled(context, androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                        androidx.work.impl.utils.PackageManagerHelper.setComponentEnabled(context, androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                        androidx.work.impl.utils.PackageManagerHelper.setComponentEnabled(context, androidx.work.impl.background.systemalarm.ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                        androidx.work.impl.utils.PackageManagerHelper.setComponentEnabled(context, androidx.work.impl.background.systemalarm.ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
                    } finally {
                        goAsync.finish();
                    }
                }
            });
        }
    }
}
