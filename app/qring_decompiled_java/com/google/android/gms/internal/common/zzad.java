package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzad<E> extends com.google.android.gms.internal.common.zzaa<E> {
    public zzad() {
        super(4);
    }

    public final com.google.android.gms.internal.common.zzad<E> zzb(E e) {
        super.zza(e);
        return this;
    }

    public final com.google.android.gms.internal.common.zzad<E> zzc(java.util.Iterator<? extends E> it) {
        while (it.hasNext()) {
            super.zza(it.next());
        }
        return this;
    }

    zzad(int i) {
        super(4);
    }
}
