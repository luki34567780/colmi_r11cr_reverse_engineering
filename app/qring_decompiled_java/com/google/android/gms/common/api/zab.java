package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zab implements com.google.android.gms.common.api.PendingResult.StatusListener {
    final /* synthetic */ com.google.android.gms.common.api.Batch zaa;

    zab(com.google.android.gms.common.api.Batch batch) {
        this.zaa = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(com.google.android.gms.common.api.Status status) {
        java.lang.Object obj;
        int i;
        int i2;
        boolean z;
        boolean z2;
        com.google.android.gms.common.api.PendingResult[] pendingResultArr;
        obj = this.zaa.zai;
        synchronized (obj) {
            if (this.zaa.isCanceled()) {
                return;
            }
            if (status.isCanceled()) {
                this.zaa.zag = true;
            } else if (!status.isSuccess()) {
                this.zaa.zaf = true;
            }
            com.google.android.gms.common.api.Batch batch = this.zaa;
            i = batch.zae;
            batch.zae = i - 1;
            com.google.android.gms.common.api.Batch batch2 = this.zaa;
            i2 = batch2.zae;
            if (i2 == 0) {
                z = batch2.zag;
                if (z) {
                    super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                } else {
                    z2 = batch2.zaf;
                    com.google.android.gms.common.api.Status status2 = z2 ? new com.google.android.gms.common.api.Status(13) : com.google.android.gms.common.api.Status.RESULT_SUCCESS;
                    com.google.android.gms.common.api.Batch batch3 = this.zaa;
                    pendingResultArr = batch3.zah;
                    batch3.setResult(new com.google.android.gms.common.api.BatchResult(status2, pendingResultArr));
                }
            }
        }
    }
}
