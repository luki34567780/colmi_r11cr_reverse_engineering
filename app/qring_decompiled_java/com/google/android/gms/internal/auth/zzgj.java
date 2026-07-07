package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzgj implements java.util.Iterator<java.util.Map.Entry> {
    final /* synthetic */ com.google.android.gms.internal.auth.zzgl zza;
    private int zzb = -1;
    private boolean zzc;
    private java.util.Iterator<java.util.Map.Entry> zzd;

    /* synthetic */ zzgj(com.google.android.gms.internal.auth.zzgl zzglVar, com.google.android.gms.internal.auth.zzge zzgeVar) {
        this.zza = zzglVar;
    }

    private final java.util.Iterator<java.util.Map.Entry> zza() {
        java.util.Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        java.util.List list;
        java.util.Map map;
        int i = this.zzb + 1;
        list = this.zza.zzb;
        if (i < list.size()) {
            return true;
        }
        map = this.zza.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.util.Map.Entry next() {
        java.util.List list;
        java.util.List list2;
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        list = this.zza.zzb;
        if (i >= list.size()) {
            return zza().next();
        }
        list2 = this.zza.zzb;
        return (java.util.Map.Entry) list2.get(this.zzb);
    }

    @Override // java.util.Iterator
    public final void remove() {
        java.util.List list;
        if (!this.zzc) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzn();
        int i = this.zzb;
        list = this.zza.zzb;
        if (i >= list.size()) {
            zza().remove();
            return;
        }
        com.google.android.gms.internal.auth.zzgl zzglVar = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 - 1;
        zzglVar.zzl(i2);
    }
}
