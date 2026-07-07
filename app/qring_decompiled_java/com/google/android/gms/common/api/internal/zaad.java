package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zaad {
    private final java.util.Map<com.google.android.gms.common.api.internal.BasePendingResult<?>, java.lang.Boolean> zaa = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
    private final java.util.Map<com.google.android.gms.tasks.TaskCompletionSource<?>, java.lang.Boolean> zab = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());

    private final void zah(boolean z, com.google.android.gms.common.api.Status status) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        synchronized (this.zaa) {
            hashMap = new java.util.HashMap(this.zaa);
        }
        synchronized (this.zab) {
            hashMap2 = new java.util.HashMap(this.zab);
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (z || ((java.lang.Boolean) entry.getValue()).booleanValue()) {
                ((com.google.android.gms.common.api.internal.BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((java.lang.Boolean) entry2.getValue()).booleanValue()) {
                ((com.google.android.gms.tasks.TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.ApiException(status));
            }
        }
    }

    final void zac(com.google.android.gms.common.api.internal.BasePendingResult<? extends com.google.android.gms.common.api.Result> basePendingResult, boolean z) {
        this.zaa.put(basePendingResult, java.lang.Boolean.valueOf(z));
        basePendingResult.addStatusListener(new com.google.android.gms.common.api.internal.zaab(this, basePendingResult));
    }

    final <TResult> void zad(com.google.android.gms.tasks.TaskCompletionSource<TResult> taskCompletionSource, boolean z) {
        this.zab.put(taskCompletionSource, java.lang.Boolean.valueOf(z));
        taskCompletionSource.getTask().addOnCompleteListener(new com.google.android.gms.common.api.internal.zaac(this, taskCompletionSource));
    }

    final void zae(int i, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        zah(true, new com.google.android.gms.common.api.Status(20, sb.toString()));
    }

    public final void zaf() {
        zah(false, com.google.android.gms.common.api.internal.GoogleApiManager.zaa);
    }

    final boolean zag() {
        return (this.zaa.isEmpty() && this.zab.isEmpty()) ? false : true;
    }
}
