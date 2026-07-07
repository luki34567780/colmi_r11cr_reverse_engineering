package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzk {
    private long zza = Long.MIN_VALUE;

    public final com.google.android.gms.location.zzk zza(long j) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "intervalMillis can't be negative.");
        this.zza = j;
        return this;
    }

    public final com.google.android.gms.location.zzl zzb() {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zza != Long.MIN_VALUE, "Must set intervalMillis.");
        return new com.google.android.gms.location.zzl(this.zza, true, null, null, null, false, null, 0L, null);
    }
}
