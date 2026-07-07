package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zac extends com.google.android.gms.internal.base.zaq {
    final /* synthetic */ com.google.android.gms.common.GoogleApiAvailability zaa;
    private final android.content.Context zab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zac(com.google.android.gms.common.GoogleApiAvailability googleApiAvailability, android.content.Context context) {
        super(android.os.Looper.myLooper() == null ? android.os.Looper.getMainLooper() : android.os.Looper.myLooper());
        this.zaa = googleApiAvailability;
        this.zab = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (message.what == 1) {
            int isGooglePlayServicesAvailable = this.zaa.isGooglePlayServicesAvailable(this.zab);
            if (this.zaa.isUserResolvableError(isGooglePlayServicesAvailable)) {
                this.zaa.showErrorNotification(this.zab, isGooglePlayServicesAvailable);
                return;
            }
            return;
        }
        int i = message.what;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(50);
        sb.append("Don't know how to handle this message: ");
        sb.append(i);
        android.util.Log.w("GoogleApiAvailability", sb.toString());
    }
}
