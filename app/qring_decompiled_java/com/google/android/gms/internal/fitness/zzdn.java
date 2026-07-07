package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzdn extends com.google.android.gms.internal.fitness.zzae {
    final /* synthetic */ com.google.android.gms.fitness.request.DataReadRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdn(com.google.android.gms.internal.fitness.zzds zzdsVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataReadRequest dataReadRequest) {
        super(googleApiClient);
        this.zza = dataReadRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        java.util.List<com.google.android.gms.fitness.data.DataType> dataTypes = this.zza.getDataTypes();
        java.util.List<com.google.android.gms.fitness.data.DataSource> dataSources = this.zza.getDataSources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.google.android.gms.fitness.data.DataSource> it = dataSources.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.android.gms.fitness.data.DataSet.builder(it.next()).build());
        }
        for (com.google.android.gms.fitness.data.DataType dataType : dataTypes) {
            com.google.android.gms.fitness.data.DataSource.Builder builder = new com.google.android.gms.fitness.data.DataSource.Builder();
            builder.setType(1);
            builder.setDataType(dataType);
            builder.setStreamName("Default");
            arrayList.add(com.google.android.gms.fitness.data.DataSet.builder(builder.build()).build());
        }
        return new com.google.android.gms.fitness.result.DataReadResult(arrayList, java.util.Collections.emptyList(), status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzca) ((com.google.android.gms.internal.fitness.zzaj) anyClient).getService()).zzg(new com.google.android.gms.fitness.request.DataReadRequest(this.zza, new com.google.android.gms.internal.fitness.zzdr(this, null)));
    }
}
