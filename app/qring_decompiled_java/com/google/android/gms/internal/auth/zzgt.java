package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzgt implements java.util.Iterator<java.lang.String> {
    final java.util.Iterator<java.lang.String> zza;
    final /* synthetic */ com.google.android.gms.internal.auth.zzgu zzb;

    zzgt(com.google.android.gms.internal.auth.zzgu zzguVar) {
        com.google.android.gms.internal.auth.zzfa zzfaVar;
        this.zzb = zzguVar;
        zzfaVar = zzguVar.zza;
        this.zza = zzfaVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.String next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
