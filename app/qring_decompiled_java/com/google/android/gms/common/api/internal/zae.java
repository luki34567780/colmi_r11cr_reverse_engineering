package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zae<A extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Api.AnyClient>> extends com.google.android.gms.common.api.internal.zai {
    protected final A zaa;

    public zae(int i, A a) {
        super(i);
        this.zaa = (A) com.google.android.gms.common.internal.Preconditions.checkNotNull(a, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(com.google.android.gms.common.api.Status status) {
        try {
            this.zaa.setFailedResult(status);
        } catch (java.lang.IllegalStateException e) {
            android.util.Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(java.lang.Exception exc) {
        java.lang.String simpleName = exc.getClass().getSimpleName();
        java.lang.String localizedMessage = exc.getLocalizedMessage();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(simpleName).length() + 2 + java.lang.String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.zaa.setFailedResult(new com.google.android.gms.common.api.Status(10, sb.toString()));
        } catch (java.lang.IllegalStateException e) {
            android.util.Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(com.google.android.gms.common.api.internal.zabq<?> zabqVar) throws android.os.DeadObjectException {
        try {
            this.zaa.run(zabqVar.zaf());
        } catch (java.lang.RuntimeException e) {
            zae(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(com.google.android.gms.common.api.internal.zaad zaadVar, boolean z) {
        zaadVar.zac(this.zaa, z);
    }
}
