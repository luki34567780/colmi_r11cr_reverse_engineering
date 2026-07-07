package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class SaveAccountLinkingTokenRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest> CREATOR = new com.google.android.gms.auth.api.identity.zbi();
    public static final java.lang.String EXTRA_TOKEN = "extra_token";
    public static final java.lang.String TOKEN_TYPE_AUTH_CODE = "auth_code";
    private final android.app.PendingIntent zba;
    private final java.lang.String zbb;
    private final java.lang.String zbc;
    private final java.util.List zbd;
    private final java.lang.String zbe;
    private final int zbf;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static final class Builder {
        private android.app.PendingIntent zba;
        private java.lang.String zbb;
        private java.lang.String zbc;
        private java.util.List zbd = new java.util.ArrayList();
        private java.lang.String zbe;
        private int zbf;

        public com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zba != null, "Consent PendingIntent cannot be null");
            com.google.android.gms.common.internal.Preconditions.checkArgument(com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.TOKEN_TYPE_AUTH_CODE.equals(this.zbb), "Invalid tokenType");
            com.google.android.gms.common.internal.Preconditions.checkArgument(!android.text.TextUtils.isEmpty(this.zbc), "serviceId cannot be null or empty");
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zbd != null, "scopes cannot be null");
            return new com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf);
        }

        public com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder setConsentPendingIntent(android.app.PendingIntent pendingIntent) {
            this.zba = pendingIntent;
            return this;
        }

        public com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder setScopes(java.util.List<java.lang.String> list) {
            this.zbd = list;
            return this;
        }

        public com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder setServiceId(java.lang.String str) {
            this.zbc = str;
            return this;
        }

        public com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder setTokenType(java.lang.String str) {
            this.zbb = str;
            return this;
        }

        public final com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder zba(java.lang.String str) {
            this.zbe = str;
            return this;
        }

        public final com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder zbb(int i) {
            this.zbf = i;
            return this;
        }
    }

    SaveAccountLinkingTokenRequest(android.app.PendingIntent pendingIntent, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, int i) {
        this.zba = pendingIntent;
        this.zbb = str;
        this.zbc = str2;
        this.zbd = list;
        this.zbe = str3;
        this.zbf = i;
    }

    public static com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder builder() {
        return new com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder();
    }

    public static com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder zba(com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(saveAccountLinkingTokenRequest);
        com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder builder = builder();
        builder.setScopes(saveAccountLinkingTokenRequest.getScopes());
        builder.setServiceId(saveAccountLinkingTokenRequest.getServiceId());
        builder.setConsentPendingIntent(saveAccountLinkingTokenRequest.getConsentPendingIntent());
        builder.setTokenType(saveAccountLinkingTokenRequest.getTokenType());
        builder.zbb(saveAccountLinkingTokenRequest.zbf);
        java.lang.String str = saveAccountLinkingTokenRequest.zbe;
        if (!android.text.TextUtils.isEmpty(str)) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest)) {
            return false;
        }
        com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest) obj;
        return this.zbd.size() == saveAccountLinkingTokenRequest.zbd.size() && this.zbd.containsAll(saveAccountLinkingTokenRequest.zbd) && com.google.android.gms.common.internal.Objects.equal(this.zba, saveAccountLinkingTokenRequest.zba) && com.google.android.gms.common.internal.Objects.equal(this.zbb, saveAccountLinkingTokenRequest.zbb) && com.google.android.gms.common.internal.Objects.equal(this.zbc, saveAccountLinkingTokenRequest.zbc) && com.google.android.gms.common.internal.Objects.equal(this.zbe, saveAccountLinkingTokenRequest.zbe) && this.zbf == saveAccountLinkingTokenRequest.zbf;
    }

    public android.app.PendingIntent getConsentPendingIntent() {
        return this.zba;
    }

    public java.util.List<java.lang.String> getScopes() {
        return this.zbd;
    }

    public java.lang.String getServiceId() {
        return this.zbc;
    }

    public java.lang.String getTokenType() {
        return this.zbb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zba, this.zbb, this.zbc, this.zbd, this.zbe);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getConsentPendingIntent(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getTokenType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getServiceId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 4, getScopes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zbe, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zbf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
