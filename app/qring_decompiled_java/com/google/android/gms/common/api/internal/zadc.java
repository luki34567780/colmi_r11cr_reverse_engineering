package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zadc {
    public static final com.google.android.gms.common.api.Status zaa = new com.google.android.gms.common.api.Status(8, "The connection to Google Play services was lost");
    final java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> zab = java.util.Collections.synchronizedSet(java.util.Collections.newSetFromMap(new java.util.WeakHashMap()));
    private final com.google.android.gms.common.api.internal.zadb zac = new com.google.android.gms.common.api.internal.zadb(this);

    final void zaa(com.google.android.gms.common.api.internal.BasePendingResult<? extends com.google.android.gms.common.api.Result> basePendingResult) {
        this.zab.add(basePendingResult);
        basePendingResult.zan(this.zac);
    }

    public final void zab() {
        for (com.google.android.gms.common.api.internal.BasePendingResult basePendingResult : (com.google.android.gms.common.api.internal.BasePendingResult[]) this.zab.toArray(new com.google.android.gms.common.api.internal.BasePendingResult[0])) {
            basePendingResult.zan(null);
            if (basePendingResult.zam()) {
                this.zab.remove(basePendingResult);
            }
        }
    }
}
