package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zacx implements com.google.android.gms.tasks.Continuation<java.lang.Boolean, java.lang.Void> {
    zacx() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ java.lang.Void then(com.google.android.gms.tasks.Task<java.lang.Boolean> task) throws java.lang.Exception {
        if (task.getResult().booleanValue()) {
            return null;
        }
        throw new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(13, "listener already unregistered"));
    }
}
