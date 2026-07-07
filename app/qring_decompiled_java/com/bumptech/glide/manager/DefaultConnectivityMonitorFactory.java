package com.bumptech.glide.manager;

/* loaded from: /tmp/dex/classes2.dex */
public class DefaultConnectivityMonitorFactory implements com.bumptech.glide.manager.ConnectivityMonitorFactory {
    private static final java.lang.String NETWORK_PERMISSION = "android.permission.ACCESS_NETWORK_STATE";
    private static final java.lang.String TAG = "ConnectivityMonitor";

    @Override // com.bumptech.glide.manager.ConnectivityMonitorFactory
    public com.bumptech.glide.manager.ConnectivityMonitor build(android.content.Context context, com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener connectivityListener) {
        boolean z = androidx.core.content.ContextCompat.checkSelfPermission(context, NETWORK_PERMISSION) == 0;
        if (android.util.Log.isLoggable(TAG, 3)) {
            android.util.Log.d(TAG, z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        if (z) {
            return new com.bumptech.glide.manager.DefaultConnectivityMonitor(context, connectivityListener);
        }
        return new com.bumptech.glide.manager.NullConnectivityMonitor();
    }
}
