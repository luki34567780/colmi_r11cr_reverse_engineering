package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzv implements java.lang.Iterable<java.lang.String> {
    final /* synthetic */ java.lang.CharSequence zza;
    final /* synthetic */ com.google.android.gms.internal.common.zzx zzb;

    zzv(com.google.android.gms.internal.common.zzx zzxVar, java.lang.CharSequence charSequence) {
        this.zzb = zzxVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.lang.String> iterator() {
        java.util.Iterator<java.lang.String> zzh;
        zzh = this.zzb.zzh(this.zza);
        return zzh;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('[');
        java.util.Iterator<java.lang.String> it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(com.google.android.gms.internal.common.zzq.zza(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append((java.lang.CharSequence) ", ");
                    sb.append(com.google.android.gms.internal.common.zzq.zza(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
