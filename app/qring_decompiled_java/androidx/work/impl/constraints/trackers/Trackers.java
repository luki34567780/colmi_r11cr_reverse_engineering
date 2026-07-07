package androidx.work.impl.constraints.trackers;

/* loaded from: classes.dex */
public class Trackers {
    private static androidx.work.impl.constraints.trackers.Trackers sInstance;
    private androidx.work.impl.constraints.trackers.BatteryChargingTracker mBatteryChargingTracker;
    private androidx.work.impl.constraints.trackers.BatteryNotLowTracker mBatteryNotLowTracker;
    private androidx.work.impl.constraints.trackers.NetworkStateTracker mNetworkStateTracker;
    private androidx.work.impl.constraints.trackers.StorageNotLowTracker mStorageNotLowTracker;

    public static synchronized androidx.work.impl.constraints.trackers.Trackers getInstance(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        androidx.work.impl.constraints.trackers.Trackers trackers;
        synchronized (androidx.work.impl.constraints.trackers.Trackers.class) {
            if (sInstance == null) {
                sInstance = new androidx.work.impl.constraints.trackers.Trackers(context, taskExecutor);
            }
            trackers = sInstance;
        }
        return trackers;
    }

    public static synchronized void setInstance(androidx.work.impl.constraints.trackers.Trackers trackers) {
        synchronized (androidx.work.impl.constraints.trackers.Trackers.class) {
            sInstance = trackers;
        }
    }

    private Trackers(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.mBatteryChargingTracker = new androidx.work.impl.constraints.trackers.BatteryChargingTracker(applicationContext, taskExecutor);
        this.mBatteryNotLowTracker = new androidx.work.impl.constraints.trackers.BatteryNotLowTracker(applicationContext, taskExecutor);
        this.mNetworkStateTracker = new androidx.work.impl.constraints.trackers.NetworkStateTracker(applicationContext, taskExecutor);
        this.mStorageNotLowTracker = new androidx.work.impl.constraints.trackers.StorageNotLowTracker(applicationContext, taskExecutor);
    }

    public androidx.work.impl.constraints.trackers.BatteryChargingTracker getBatteryChargingTracker() {
        return this.mBatteryChargingTracker;
    }

    public androidx.work.impl.constraints.trackers.BatteryNotLowTracker getBatteryNotLowTracker() {
        return this.mBatteryNotLowTracker;
    }

    public androidx.work.impl.constraints.trackers.NetworkStateTracker getNetworkStateTracker() {
        return this.mNetworkStateTracker;
    }

    public androidx.work.impl.constraints.trackers.StorageNotLowTracker getStorageNotLowTracker() {
        return this.mStorageNotLowTracker;
    }
}
