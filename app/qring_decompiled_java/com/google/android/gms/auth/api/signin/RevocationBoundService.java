package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class RevocationBoundService extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) && !"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            android.util.Log.w("RevocationService", "Unknown action sent to RevocationBoundService: ".concat(java.lang.String.valueOf(intent.getAction())));
            return null;
        }
        if (android.util.Log.isLoggable("RevocationService", 2)) {
            android.util.Log.v("RevocationService", "RevocationBoundService handling ".concat(java.lang.String.valueOf(intent.getAction())));
        }
        return new com.google.android.gms.auth.api.signin.internal.zbt(this);
    }
}
