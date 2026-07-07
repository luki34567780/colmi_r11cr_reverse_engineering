package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzgu extends java.util.AbstractList<java.lang.String> implements java.util.RandomAccess, com.google.android.gms.internal.auth.zzfa {
    private final com.google.android.gms.internal.auth.zzfa zza;

    public zzgu(com.google.android.gms.internal.auth.zzfa zzfaVar) {
        this.zza = zzfaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return ((com.google.android.gms.internal.auth.zzez) this.zza).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<java.lang.String> iterator() {
        return new com.google.android.gms.internal.auth.zzgt(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<java.lang.String> listIterator(int i) {
        return new com.google.android.gms.internal.auth.zzgs(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.auth.zzfa
    public final com.google.android.gms.internal.auth.zzfa zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.auth.zzfa
    public final java.util.List<?> zzg() {
        return this.zza.zzg();
    }
}
