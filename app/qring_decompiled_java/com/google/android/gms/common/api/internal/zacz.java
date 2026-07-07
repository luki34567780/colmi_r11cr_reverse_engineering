package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zacz extends com.google.android.gms.internal.base.zaq {
    final /* synthetic */ com.google.android.gms.common.api.internal.zada zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacz(com.google.android.gms.common.api.internal.zada zadaVar, android.os.Looper looper) {
        super(looper);
        this.zaa = zadaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        java.lang.Object obj;
        com.google.android.gms.common.api.internal.zada zadaVar;
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) message.obj;
                java.lang.String valueOf = java.lang.String.valueOf(runtimeException.getMessage());
                android.util.Log.e("TransformedResultImpl", valueOf.length() != 0 ? "Runtime exception on the transformation worker thread: ".concat(valueOf) : new java.lang.String("Runtime exception on the transformation worker thread: "));
                throw runtimeException;
            }
            int i2 = message.what;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(70);
            sb.append("TransformationResultHandler received unknown message type: ");
            sb.append(i2);
            android.util.Log.e("TransformedResultImpl", sb.toString());
            return;
        }
        com.google.android.gms.common.api.PendingResult<?> pendingResult = (com.google.android.gms.common.api.PendingResult) message.obj;
        obj = this.zaa.zae;
        synchronized (obj) {
            zadaVar = this.zaa.zab;
            com.google.android.gms.common.api.internal.zada zadaVar2 = (com.google.android.gms.common.api.internal.zada) com.google.android.gms.common.internal.Preconditions.checkNotNull(zadaVar);
            if (pendingResult == null) {
                zadaVar2.zaj(new com.google.android.gms.common.api.Status(13, "Transform returned null"));
            } else if (pendingResult instanceof com.google.android.gms.common.api.internal.zacp) {
                zadaVar2.zaj(((com.google.android.gms.common.api.internal.zacp) pendingResult).zaa());
            } else {
                zadaVar2.zai(pendingResult);
            }
        }
    }
}
