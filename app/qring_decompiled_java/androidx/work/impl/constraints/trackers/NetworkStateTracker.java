package androidx.work.impl.constraints.trackers;

/* loaded from: classes.dex */
public class NetworkStateTracker extends androidx.work.impl.constraints.trackers.ConstraintTracker<androidx.work.impl.constraints.NetworkState> {
    static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("NetworkStateTracker");
    private androidx.work.impl.constraints.trackers.NetworkStateTracker.NetworkStateBroadcastReceiver mBroadcastReceiver;
    private final android.net.ConnectivityManager mConnectivityManager;
    private androidx.work.impl.constraints.trackers.NetworkStateTracker.NetworkStateCallback mNetworkCallback;

    public NetworkStateTracker(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        this.mConnectivityManager = (android.net.ConnectivityManager) this.mAppContext.getSystemService("connectivity");
        if (isNetworkCallbackSupported()) {
            this.mNetworkCallback = new androidx.work.impl.constraints.trackers.NetworkStateTracker.NetworkStateCallback();
        } else {
            this.mBroadcastReceiver = new androidx.work.impl.constraints.trackers.NetworkStateTracker.NetworkStateBroadcastReceiver();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public androidx.work.impl.constraints.NetworkState getInitialState() {
        return getActiveNetworkState();
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        if (isNetworkCallbackSupported()) {
            try {
                androidx.work.Logger.get().debug(TAG, "Registering network callback", new java.lang.Throwable[0]);
                this.mConnectivityManager.registerDefaultNetworkCallback(this.mNetworkCallback);
                return;
            } catch (java.lang.IllegalArgumentException | java.lang.SecurityException e) {
                androidx.work.Logger.get().error(TAG, "Received exception while registering network callback", e);
                return;
            }
        }
        androidx.work.Logger.get().debug(TAG, "Registering broadcast receiver", new java.lang.Throwable[0]);
        this.mAppContext.registerReceiver(this.mBroadcastReceiver, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        if (isNetworkCallbackSupported()) {
            try {
                androidx.work.Logger.get().debug(TAG, "Unregistering network callback", new java.lang.Throwable[0]);
                this.mConnectivityManager.unregisterNetworkCallback(this.mNetworkCallback);
                return;
            } catch (java.lang.IllegalArgumentException | java.lang.SecurityException e) {
                androidx.work.Logger.get().error(TAG, "Received exception while unregistering network callback", e);
                return;
            }
        }
        androidx.work.Logger.get().debug(TAG, "Unregistering broadcast receiver", new java.lang.Throwable[0]);
        this.mAppContext.unregisterReceiver(this.mBroadcastReceiver);
    }

    private static boolean isNetworkCallbackSupported() {
        return android.os.Build.VERSION.SDK_INT >= 24;
    }

    androidx.work.impl.constraints.NetworkState getActiveNetworkState() {
        android.net.NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
        return new androidx.work.impl.constraints.NetworkState(activeNetworkInfo != null && activeNetworkInfo.isConnected(), isActiveNetworkValidated(), androidx.core.net.ConnectivityManagerCompat.isActiveNetworkMetered(this.mConnectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }

    boolean isActiveNetworkValidated() {
        if (android.os.Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            android.net.NetworkCapabilities networkCapabilities = this.mConnectivityManager.getNetworkCapabilities(this.mConnectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (java.lang.SecurityException e) {
            androidx.work.Logger.get().error(TAG, "Unable to validate active network", e);
            return false;
        }
    }

    private class NetworkStateCallback extends android.net.ConnectivityManager.NetworkCallback {
        NetworkStateCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities capabilities) {
            androidx.work.Logger.get().debug(androidx.work.impl.constraints.trackers.NetworkStateTracker.TAG, java.lang.String.format("Network capabilities changed: %s", capabilities), new java.lang.Throwable[0]);
            androidx.work.impl.constraints.trackers.NetworkStateTracker networkStateTracker = androidx.work.impl.constraints.trackers.NetworkStateTracker.this;
            networkStateTracker.setState(networkStateTracker.getActiveNetworkState());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            androidx.work.Logger.get().debug(androidx.work.impl.constraints.trackers.NetworkStateTracker.TAG, "Network connection lost", new java.lang.Throwable[0]);
            androidx.work.impl.constraints.trackers.NetworkStateTracker networkStateTracker = androidx.work.impl.constraints.trackers.NetworkStateTracker.this;
            networkStateTracker.setState(networkStateTracker.getActiveNetworkState());
        }
    }

    private class NetworkStateBroadcastReceiver extends android.content.BroadcastReceiver {
        NetworkStateBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            androidx.work.Logger.get().debug(androidx.work.impl.constraints.trackers.NetworkStateTracker.TAG, "Network broadcast received", new java.lang.Throwable[0]);
            androidx.work.impl.constraints.trackers.NetworkStateTracker networkStateTracker = androidx.work.impl.constraints.trackers.NetworkStateTracker.this;
            networkStateTracker.setState(networkStateTracker.getActiveNetworkState());
        }
    }
}
