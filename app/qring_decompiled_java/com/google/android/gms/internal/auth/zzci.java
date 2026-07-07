package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final /* synthetic */ class zzci {
    public static <V> V zza(com.google.android.gms.internal.auth.zzcj<V> zzcjVar) {
        try {
            return zzcjVar.zza();
        } catch (java.lang.SecurityException unused) {
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                return zzcjVar.zza();
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
