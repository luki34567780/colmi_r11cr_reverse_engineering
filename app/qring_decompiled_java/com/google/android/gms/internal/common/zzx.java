package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzx {
    private final com.google.android.gms.internal.common.zzo zza;
    private final boolean zzb;
    private final com.google.android.gms.internal.common.zzu zzc;

    private zzx(com.google.android.gms.internal.common.zzu zzuVar, boolean z, com.google.android.gms.internal.common.zzo zzoVar, int i, byte[] bArr) {
        this.zzc = zzuVar;
        this.zzb = z;
        this.zza = zzoVar;
    }

    public static com.google.android.gms.internal.common.zzx zzc(com.google.android.gms.internal.common.zzo zzoVar) {
        return new com.google.android.gms.internal.common.zzx(new com.google.android.gms.internal.common.zzu(zzoVar), false, com.google.android.gms.internal.common.zzn.zza, com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Iterator<java.lang.String> zzh(java.lang.CharSequence charSequence) {
        return new com.google.android.gms.internal.common.zzt(this.zzc, this, charSequence);
    }

    public final com.google.android.gms.internal.common.zzx zzb() {
        return new com.google.android.gms.internal.common.zzx(this.zzc, true, this.zza, com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER, null);
    }

    public final java.lang.Iterable<java.lang.String> zzd(java.lang.CharSequence charSequence) {
        return new com.google.android.gms.internal.common.zzv(this, charSequence);
    }

    public final java.util.List<java.lang.String> zzf(java.lang.CharSequence charSequence) {
        java.util.Objects.requireNonNull(charSequence);
        java.util.Iterator<java.lang.String> zzh = zzh(charSequence);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (zzh.hasNext()) {
            arrayList.add(zzh.next());
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }
}
