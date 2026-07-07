package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzfo extends com.google.android.gms.internal.fitness.zzft {
    boolean zza;
    final /* synthetic */ java.lang.Object zzb;

    zzfo(java.lang.Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.zza) {
            throw new java.util.NoSuchElementException();
        }
        this.zza = true;
        return this.zzb;
    }
}
