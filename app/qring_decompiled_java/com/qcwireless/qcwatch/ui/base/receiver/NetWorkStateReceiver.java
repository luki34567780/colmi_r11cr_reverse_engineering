package com.qcwireless.qcwatch.ui.base.receiver;

/* compiled from: NetWorkStateReceiver.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/receiver/NetWorkStateReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class NetWorkStateReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Object systemService = context.getSystemService("connectivity");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
        if (android.os.Build.VERSION.SDK_INT < 23) {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.getType() == 1) {
                    if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                        return;
                    }
                    com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUp();
                    return;
                } else {
                    if (activeNetworkInfo.getType() != 0 || com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                        return;
                    }
                    com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUp();
                    return;
                }
            }
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                return;
            }
            com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUp();
            return;
        }
        android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null) {
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1) || !networkCapabilities.hasTransport(0) || com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                    return;
                }
                com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUp();
                return;
            }
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                return;
            }
            com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUp();
            return;
        }
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            return;
        }
        com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUp();
    }
}
