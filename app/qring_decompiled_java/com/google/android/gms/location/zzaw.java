package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
abstract class zzaw implements com.google.android.gms.common.api.internal.RemoteCall {
    private boolean zza = true;

    protected zzaw() {
    }

    final void zza(boolean z) {
        this.zza = false;
    }

    protected final boolean zzb() {
        return this.zza;
    }
}
