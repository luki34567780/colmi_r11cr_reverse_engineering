package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzae<E> extends com.google.android.gms.internal.common.zzz<E> {
    private final com.google.android.gms.internal.common.zzag<E> zza;

    zzae(com.google.android.gms.internal.common.zzag<E> zzagVar, int i) {
        super(zzagVar.size(), i);
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    protected final E zza(int i) {
        return this.zza.get(i);
    }
}
