package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzca extends android.database.ContentObserver {
    zzca(android.os.Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        atomicBoolean = com.google.android.gms.internal.auth.zzcb.zzk;
        atomicBoolean.set(true);
    }
}
