package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzge extends com.google.android.gms.internal.auth.zzgl {
    zzge(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgl
    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzb(); i++) {
                java.util.Map.Entry zzg = zzg(i);
                if (((com.google.android.gms.internal.auth.zzek) zzg.getKey()).zzc()) {
                    zzg.setValue(java.util.Collections.unmodifiableList((java.util.List) zzg.getValue()));
                }
            }
            for (java.util.Map.Entry entry : zzc()) {
                if (((com.google.android.gms.internal.auth.zzek) entry.getKey()).zzc()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
