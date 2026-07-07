package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zaaf {
    private final com.google.android.gms.common.api.internal.ApiKey<?> zaa;
    private final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> zab = new com.google.android.gms.tasks.TaskCompletionSource<>();

    public zaaf(com.google.android.gms.common.api.internal.ApiKey<?> apiKey) {
        this.zaa = apiKey;
    }

    public final com.google.android.gms.common.api.internal.ApiKey<?> zaa() {
        return this.zaa;
    }

    public final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> zab() {
        return this.zab;
    }
}
