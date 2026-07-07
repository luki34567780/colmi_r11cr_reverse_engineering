package com.google.android.gms.auth.api.credentials;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public final class CredentialRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.CredentialRequest> CREATOR = new com.google.android.gms.auth.api.credentials.zbc();
    final int zba;
    private final boolean zbb;
    private final java.lang.String[] zbc;
    private final com.google.android.gms.auth.api.credentials.CredentialPickerConfig zbd;
    private final com.google.android.gms.auth.api.credentials.CredentialPickerConfig zbe;
    private final boolean zbf;
    private final java.lang.String zbg;
    private final java.lang.String zbh;
    private final boolean zbi;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static final class Builder {
        private boolean zba;
        private java.lang.String[] zbb;
        private com.google.android.gms.auth.api.credentials.CredentialPickerConfig zbc;
        private com.google.android.gms.auth.api.credentials.CredentialPickerConfig zbd;
        private boolean zbe = false;
        private java.lang.String zbf = null;
        private java.lang.String zbg;

        public com.google.android.gms.auth.api.credentials.CredentialRequest build() {
            if (this.zbb == null) {
                this.zbb = new java.lang.String[0];
            }
            if (this.zba || this.zbb.length != 0) {
                return new com.google.android.gms.auth.api.credentials.CredentialRequest(4, this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, false);
            }
            throw new java.lang.IllegalStateException("At least one authentication method must be specified");
        }

        public com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setAccountTypes(java.lang.String... strArr) {
            if (strArr == null) {
                strArr = new java.lang.String[0];
            }
            this.zbb = strArr;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setCredentialHintPickerConfig(com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig) {
            this.zbd = credentialPickerConfig;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setCredentialPickerConfig(com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig) {
            this.zbc = credentialPickerConfig;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setIdTokenNonce(java.lang.String str) {
            this.zbg = str;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setIdTokenRequested(boolean z) {
            this.zbe = z;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setPasswordLoginSupported(boolean z) {
            this.zba = z;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setServerClientId(java.lang.String str) {
            this.zbf = str;
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.gms.auth.api.credentials.CredentialRequest.Builder setSupportsPasswordLogin(boolean z) {
            setPasswordLoginSupported(z);
            return this;
        }
    }

    CredentialRequest(int i, boolean z, java.lang.String[] strArr, com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig, com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig2, boolean z2, java.lang.String str, java.lang.String str2, boolean z3) {
        this.zba = i;
        this.zbb = z;
        this.zbc = (java.lang.String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        this.zbd = credentialPickerConfig == null ? new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder().build() : credentialPickerConfig;
        this.zbe = credentialPickerConfig2 == null ? new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder().build() : credentialPickerConfig2;
        if (i < 3) {
            this.zbf = true;
            this.zbg = null;
            this.zbh = null;
        } else {
            this.zbf = z2;
            this.zbg = str;
            this.zbh = str2;
        }
        this.zbi = z3;
    }

    public java.lang.String[] getAccountTypes() {
        return this.zbc;
    }

    public java.util.Set<java.lang.String> getAccountTypesSet() {
        return new java.util.HashSet(java.util.Arrays.asList(this.zbc));
    }

    public com.google.android.gms.auth.api.credentials.CredentialPickerConfig getCredentialHintPickerConfig() {
        return this.zbe;
    }

    public com.google.android.gms.auth.api.credentials.CredentialPickerConfig getCredentialPickerConfig() {
        return this.zbd;
    }

    public java.lang.String getIdTokenNonce() {
        return this.zbh;
    }

    public java.lang.String getServerClientId() {
        return this.zbg;
    }

    @java.lang.Deprecated
    public boolean getSupportsPasswordLogin() {
        return isPasswordLoginSupported();
    }

    public boolean isIdTokenRequested() {
        return this.zbf;
    }

    public boolean isPasswordLoginSupported() {
        return this.zbb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, isPasswordLoginSupported());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 2, getAccountTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getCredentialPickerConfig(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getCredentialHintPickerConfig(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zbi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zba);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
