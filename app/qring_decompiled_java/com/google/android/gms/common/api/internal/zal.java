package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zal {
    private int zad;
    private final androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String> zab = new androidx.collection.ArrayMap<>();
    private final com.google.android.gms.tasks.TaskCompletionSource<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> zac = new com.google.android.gms.tasks.TaskCompletionSource<>();
    private boolean zae = false;
    private final androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> zaa = new androidx.collection.ArrayMap<>();

    public zal(java.lang.Iterable<? extends com.google.android.gms.common.api.HasApiKey<?>> iterable) {
        java.util.Iterator<? extends com.google.android.gms.common.api.HasApiKey<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(it.next().getApiKey(), (java.lang.Object) null);
        }
        this.zad = this.zaa.keySet().size();
    }

    public final com.google.android.gms.tasks.Task<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> zaa() {
        return this.zac.getTask();
    }

    public final java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>> zab() {
        return this.zaa.keySet();
    }

    public final void zac(com.google.android.gms.common.api.internal.ApiKey<?> apiKey, com.google.android.gms.common.ConnectionResult connectionResult, java.lang.String str) {
        this.zaa.put(apiKey, connectionResult);
        this.zab.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (!this.zae) {
                this.zac.setResult(this.zab);
            } else {
                this.zac.setException(new com.google.android.gms.common.api.AvailabilityException(this.zaa));
            }
        }
    }
}
