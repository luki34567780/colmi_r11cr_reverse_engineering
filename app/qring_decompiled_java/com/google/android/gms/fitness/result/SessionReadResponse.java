package com.google.android.gms.fitness.result;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class SessionReadResponse extends com.google.android.gms.common.api.Response<com.google.android.gms.fitness.result.SessionReadResult> {
    public java.util.List<com.google.android.gms.fitness.data.DataSet> getDataSet(com.google.android.gms.fitness.data.Session session) {
        return getResult().getDataSet(session);
    }

    public java.util.List<com.google.android.gms.fitness.data.Session> getSessions() {
        return getResult().getSessions();
    }

    public com.google.android.gms.common.api.Status getStatus() {
        return getResult().getStatus();
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSet> getDataSet(com.google.android.gms.fitness.data.Session session, com.google.android.gms.fitness.data.DataType dataType) {
        return getResult().getDataSet(session, dataType);
    }
}
