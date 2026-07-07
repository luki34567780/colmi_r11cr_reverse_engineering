package androidx.work.impl.background.systemalarm;

/* loaded from: classes.dex */
abstract class ConstraintProxy extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("ConstraintProxy");

    ConstraintProxy() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        androidx.work.Logger.get().debug(TAG, java.lang.String.format("onReceive : %s", intent), new java.lang.Throwable[0]);
        context.startService(androidx.work.impl.background.systemalarm.CommandHandler.createConstraintsChangedIntent(context));
    }

    public static class BatteryNotLowProxy extends androidx.work.impl.background.systemalarm.ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(android.content.Context context, android.content.Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class BatteryChargingProxy extends androidx.work.impl.background.systemalarm.ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(android.content.Context context, android.content.Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends androidx.work.impl.background.systemalarm.ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(android.content.Context context, android.content.Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends androidx.work.impl.background.systemalarm.ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(android.content.Context context, android.content.Intent intent) {
            super.onReceive(context, intent);
        }
    }

    static void updateAll(android.content.Context context, java.util.List<androidx.work.impl.model.WorkSpec> workSpecs) {
        java.util.Iterator<androidx.work.impl.model.WorkSpec> it = workSpecs.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (it.hasNext()) {
            androidx.work.Constraints constraints = it.next().constraints;
            z |= constraints.requiresBatteryNotLow();
            z2 |= constraints.requiresCharging();
            z3 |= constraints.requiresStorageNotLow();
            z4 |= constraints.getRequiredNetworkType() != androidx.work.NetworkType.NOT_REQUIRED;
            if (z && z2 && z3 && z4) {
                break;
            }
        }
        context.sendBroadcast(androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.newConstraintProxyUpdateIntent(context, z, z2, z3, z4));
    }
}
