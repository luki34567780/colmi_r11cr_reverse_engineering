package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzx {
    private java.lang.String zza = null;
    private long zzb = -1;
    private com.google.android.gms.internal.common.zzag<byte[]> zzc = com.google.android.gms.internal.common.zzag.zzl();
    private com.google.android.gms.internal.common.zzag<byte[]> zzd = com.google.android.gms.internal.common.zzag.zzl();

    zzx() {
    }

    final com.google.android.gms.common.zzx zza(long j) {
        this.zzb = j;
        return this;
    }

    final com.google.android.gms.common.zzx zzb(java.util.List<byte[]> list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        this.zzd = com.google.android.gms.internal.common.zzag.zzk(list);
        return this;
    }

    final com.google.android.gms.common.zzx zzc(java.util.List<byte[]> list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        this.zzc = com.google.android.gms.internal.common.zzag.zzk(list);
        return this;
    }

    final com.google.android.gms.common.zzx zzd(java.lang.String str) {
        this.zza = str;
        return this;
    }

    final com.google.android.gms.common.zzz zze() {
        if (this.zza == null) {
            throw new java.lang.IllegalStateException("packageName must be defined");
        }
        if (this.zzb < 0) {
            throw new java.lang.IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.zzc.isEmpty() && this.zzd.isEmpty()) {
            throw new java.lang.IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new com.google.android.gms.common.zzz(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
