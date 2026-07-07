package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public class AvailabilityException extends java.lang.Exception {
    private final androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> zaa;

    public AvailabilityException(androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> arrayMap) {
        this.zaa = arrayMap;
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.GoogleApi<? extends com.google.android.gms.common.api.Api.ApiOptions> googleApi) {
        com.google.android.gms.common.api.internal.ApiKey<? extends com.google.android.gms.common.api.Api.ApiOptions> apiKey = googleApi.getApiKey();
        boolean z = this.zaa.get(apiKey) != null;
        java.lang.String zab = apiKey.zab();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zab).length() + 58);
        sb.append("The given API (");
        sb.append(zab);
        sb.append(") was not part of the availability request.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, sb.toString());
        return (com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.ConnectionResult) this.zaa.get(apiKey));
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = true;
        for (com.google.android.gms.common.api.internal.ApiKey apiKey : this.zaa.keySet()) {
            com.google.android.gms.common.ConnectionResult connectionResult = (com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.ConnectionResult) this.zaa.get(apiKey));
            z &= !connectionResult.isSuccess();
            java.lang.String zab = apiKey.zab();
            java.lang.String valueOf = java.lang.String.valueOf(connectionResult);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zab).length() + 2 + java.lang.String.valueOf(valueOf).length());
            sb.append(zab);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(android.text.TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.HasApiKey<? extends com.google.android.gms.common.api.Api.ApiOptions> hasApiKey) {
        com.google.android.gms.common.api.internal.ApiKey<? extends com.google.android.gms.common.api.Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        boolean z = this.zaa.get(apiKey) != null;
        java.lang.String zab = apiKey.zab();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zab).length() + 58);
        sb.append("The given API (");
        sb.append(zab);
        sb.append(") was not part of the availability request.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, sb.toString());
        return (com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.ConnectionResult) this.zaa.get(apiKey));
    }
}
