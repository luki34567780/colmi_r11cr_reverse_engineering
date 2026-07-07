package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzbv extends com.google.android.gms.internal.location.zzbt {
    private final com.google.android.gms.internal.location.zzbx zza;

    zzbv(com.google.android.gms.internal.location.zzbx zzbxVar, int i) {
        super(zzbxVar.size(), i);
        this.zza = zzbxVar;
    }

    @Override // com.google.android.gms.internal.location.zzbt
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
