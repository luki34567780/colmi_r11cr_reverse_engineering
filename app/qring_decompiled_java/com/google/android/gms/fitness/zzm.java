package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final /* synthetic */ class zzm implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    public static final /* synthetic */ com.google.android.gms.fitness.zzm zza = new com.google.android.gms.fitness.zzm();

    private /* synthetic */ zzm() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final java.lang.Object convert(com.google.android.gms.common.api.Result result) {
        return ((com.google.android.gms.fitness.result.ListSubscriptionsResult) result).getSubscriptions();
    }
}
