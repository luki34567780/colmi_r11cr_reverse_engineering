package com.google.android.gms.fitness.result;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class DataReadResponse extends com.google.android.gms.common.api.Response<com.google.android.gms.fitness.result.DataReadResult> {
    public java.util.List<com.google.android.gms.fitness.data.Bucket> getBuckets() {
        return getResult().getBuckets();
    }

    public com.google.android.gms.fitness.data.DataSet getDataSet(com.google.android.gms.fitness.data.DataSource dataSource) {
        return getResult().getDataSet(dataSource);
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSet> getDataSets() {
        return getResult().getDataSets();
    }

    public com.google.android.gms.common.api.Status getStatus() {
        return getResult().getStatus();
    }

    public com.google.android.gms.fitness.data.DataSet getDataSet(com.google.android.gms.fitness.data.DataType dataType) {
        return getResult().getDataSet(dataType);
    }
}
