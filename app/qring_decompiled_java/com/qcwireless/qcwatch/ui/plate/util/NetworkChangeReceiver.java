package com.qcwireless.qcwatch.ui.plate.util;

/* compiled from: NetworkChangeReceiver.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/util/NetworkChangeReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "TAG", "", "callBackNetWork", "Lcom/qcwireless/qcwatch/ui/plate/util/NetworkChangeReceiver$CallBackNetWork;", "typeName", "", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "setCallBackNetWork", "CallBackNetWork", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class NetworkChangeReceiver extends android.content.BroadcastReceiver {
    private com.qcwireless.qcwatch.ui.plate.util.NetworkChangeReceiver.CallBackNetWork callBackNetWork;
    private final java.lang.String TAG = "NetworkChangeReceiver";
    private int typeName = 1;

    /* compiled from: NetworkChangeReceiver.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/util/NetworkChangeReceiver$CallBackNetWork;", "", "callBack", "", "str", "", "(Ljava/lang/Integer;)V", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface CallBackNetWork {
        void callBack(java.lang.Integer str);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        java.lang.Object systemService = context.getSystemService("connectivity");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            this.typeName = 0;
            com.qcwireless.qcwatch.ui.plate.util.NetworkChangeReceiver.CallBackNetWork callBackNetWork = this.callBackNetWork;
            if (callBackNetWork != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(callBackNetWork);
                callBackNetWork.callBack(java.lang.Integer.valueOf(this.typeName));
                return;
            }
            return;
        }
        if (activeNetworkInfo.getType() == 1) {
            this.typeName = 2;
        } else if (activeNetworkInfo.getType() == 0) {
            this.typeName = 3;
        }
        com.qcwireless.qcwatch.ui.plate.util.NetworkChangeReceiver.CallBackNetWork callBackNetWork2 = this.callBackNetWork;
        if (callBackNetWork2 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(callBackNetWork2);
            callBackNetWork2.callBack(java.lang.Integer.valueOf(this.typeName));
        }
    }

    public final void setCallBackNetWork(com.qcwireless.qcwatch.ui.plate.util.NetworkChangeReceiver.CallBackNetWork callBackNetWork) {
        this.callBackNetWork = callBackNetWork;
    }
}
