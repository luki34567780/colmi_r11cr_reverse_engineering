package com.realsil.sdk.core.base;

/* loaded from: classes3.dex */
public abstract class DaemonService extends com.realsil.sdk.core.base.BaseService {
    @Override // com.realsil.sdk.core.base.BaseService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        if (android.os.Build.VERSION.SDK_INT < 18) {
            startService(new android.content.Intent(getApplicationContext(), (java.lang.Class<?>) com.realsil.sdk.core.base.DaemonService.class));
            return;
        }
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(this.notificationId);
        }
    }

    @Override // com.realsil.sdk.core.base.BaseService, android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        return 1;
    }
}
