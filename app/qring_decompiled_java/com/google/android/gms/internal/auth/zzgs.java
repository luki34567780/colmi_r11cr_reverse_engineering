package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzgs implements java.util.ListIterator<java.lang.String> {
    final java.util.ListIterator<java.lang.String> zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ com.google.android.gms.internal.auth.zzgu zzc;

    zzgs(com.google.android.gms.internal.auth.zzgu zzguVar, int i) {
        com.google.android.gms.internal.auth.zzfa zzfaVar;
        this.zzc = zzguVar;
        this.zzb = i;
        zzfaVar = zzguVar.zza;
        this.zza = zzfaVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return this.zza.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ java.lang.String previous() {
        return this.zza.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }
}
