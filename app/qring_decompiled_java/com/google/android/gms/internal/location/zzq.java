package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzq extends com.google.android.gms.internal.location.zzan {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ java.util.concurrent.CountDownLatch zzb;

    zzq(com.google.android.gms.internal.location.zzz zzzVar, java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.CountDownLatch countDownLatch) {
        this.zza = atomicReference;
        this.zzb = countDownLatch;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(com.google.android.gms.common.api.Status status, android.location.Location location) {
        if (status.isSuccess()) {
            this.zza.set(location);
        }
        this.zzb.countDown();
    }
}
