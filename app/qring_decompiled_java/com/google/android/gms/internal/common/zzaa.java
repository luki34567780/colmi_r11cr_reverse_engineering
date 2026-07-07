package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
class zzaa<E> extends com.google.android.gms.internal.common.zzab<E> {
    java.lang.Object[] zza = new java.lang.Object[4];
    int zzb = 0;
    boolean zzc;

    zzaa(int i) {
    }

    private final void zzb(int i) {
        java.lang.Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i) {
            if (this.zzc) {
                this.zza = (java.lang.Object[]) objArr.clone();
                this.zzc = false;
                return;
            }
            return;
        }
        int i2 = length + (length >> 1) + 1;
        if (i2 < i) {
            int highestOneBit = java.lang.Integer.highestOneBit(i - 1);
            i2 = highestOneBit + highestOneBit;
        }
        if (i2 < 0) {
            i2 = com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.zza = java.util.Arrays.copyOf(objArr, i2);
        this.zzc = false;
    }

    public final com.google.android.gms.internal.common.zzaa<E> zza(E e) {
        java.util.Objects.requireNonNull(e);
        zzb(this.zzb + 1);
        java.lang.Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = e;
        return this;
    }
}
