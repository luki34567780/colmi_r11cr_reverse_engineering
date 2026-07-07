package com.bumptech.glide.manager;

/* loaded from: /tmp/dex/classes2.dex */
final class DefaultConnectivityMonitor implements com.bumptech.glide.manager.ConnectivityMonitor {
    private static final java.lang.String TAG = "ConnectivityMonitor";
    private final android.content.BroadcastReceiver connectivityReceiver = new android.content.BroadcastReceiver() { // from class: com.bumptech.glide.manager.DefaultConnectivityMonitor.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            boolean z = com.bumptech.glide.manager.DefaultConnectivityMonitor.this.isConnected;
            com.bumptech.glide.manager.DefaultConnectivityMonitor defaultConnectivityMonitor = com.bumptech.glide.manager.DefaultConnectivityMonitor.this;
            defaultConnectivityMonitor.isConnected = defaultConnectivityMonitor.isConnected(context);
            if (z != com.bumptech.glide.manager.DefaultConnectivityMonitor.this.isConnected) {
                if (android.util.Log.isLoggable(com.bumptech.glide.manager.DefaultConnectivityMonitor.TAG, 3)) {
                    android.util.Log.d(com.bumptech.glide.manager.DefaultConnectivityMonitor.TAG, "connectivity changed, isConnected: " + com.bumptech.glide.manager.DefaultConnectivityMonitor.this.isConnected);
                }
                com.bumptech.glide.manager.DefaultConnectivityMonitor.this.listener.onConnectivityChanged(com.bumptech.glide.manager.DefaultConnectivityMonitor.this.isConnected);
            }
        }
    };
    private final android.content.Context context;
    boolean isConnected;
    private boolean isRegistered;
    final com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener listener;

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    DefaultConnectivityMonitor(android.content.Context context, com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener connectivityListener) {
        this.context = context.getApplicationContext();
        this.listener = connectivityListener;
    }

    private void register() {
        if (this.isRegistered) {
            return;
        }
        this.isConnected = isConnected(this.context);
        try {
            this.context.registerReceiver(this.connectivityReceiver, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.isRegistered = true;
        } catch (java.lang.SecurityException e) {
            if (android.util.Log.isLoggable(TAG, 5)) {
                android.util.Log.w(TAG, "Failed to register", e);
            }
        }
    }

    private void unregister() {
        if (this.isRegistered) {
            this.context.unregisterReceiver(this.connectivityReceiver);
            this.isRegistered = false;
        }
    }

    boolean isConnected(android.content.Context context) {
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) com.bumptech.glide.util.Preconditions.checkNotNull((android.net.ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (java.lang.RuntimeException e) {
            if (android.util.Log.isLoggable(TAG, 5)) {
                android.util.Log.w(TAG, "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
        register();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
        unregister();
    }
}
