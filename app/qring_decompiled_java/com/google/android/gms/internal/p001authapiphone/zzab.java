package com.google.android.gms.internal.p001authapiphone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzab extends com.google.android.gms.auth.api.phone.SmsRetrieverClient {
    public zzab(android.app.Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverClient, com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public final com.google.android.gms.tasks.Task<java.lang.Void> startSmsRetriever() {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.p001authapiphone.zzh) ((com.google.android.gms.internal.p001authapiphone.zzw) obj).getService()).zzg(new com.google.android.gms.internal.p001authapiphone.zzz(com.google.android.gms.internal.p001authapiphone.zzab.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setFeatures(com.google.android.gms.internal.p001authapiphone.zzac.zzc).setMethodKey(1567).build());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverClient, com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public final com.google.android.gms.tasks.Task<java.lang.Void> startSmsUserConsent(final java.lang.String str) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p001authapiphone.zzab zzabVar = com.google.android.gms.internal.p001authapiphone.zzab.this;
                ((com.google.android.gms.internal.p001authapiphone.zzh) ((com.google.android.gms.internal.p001authapiphone.zzw) obj).getService()).zzh(str, new com.google.android.gms.internal.p001authapiphone.zzaa(zzabVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setFeatures(com.google.android.gms.internal.p001authapiphone.zzac.zzd).setMethodKey(1568).build());
    }

    public zzab(android.content.Context context) {
        super(context);
    }
}
