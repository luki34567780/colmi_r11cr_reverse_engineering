package com.google.android.gms.auth.api.credentials;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public final class HintRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.HintRequest> CREATOR = new com.google.android.gms.auth.api.credentials.zbe();
    final int zba;
    private final com.google.android.gms.auth.api.credentials.CredentialPickerConfig zbb;
    private final boolean zbc;
    private final boolean zbd;
    private final java.lang.String[] zbe;
    private final boolean zbf;
    private final java.lang.String zbg;
    private final java.lang.String zbh;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static final class Builder {
        private boolean zba;
        private boolean zbb;
        private java.lang.String[] zbc;
        private com.google.android.gms.auth.api.credentials.CredentialPickerConfig zbd = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder().build();
        private boolean zbe = false;
        private java.lang.String zbf;
        private java.lang.String zbg;

        public com.google.android.gms.auth.api.credentials.HintRequest build() {
            if (this.zbc == null) {
                this.zbc = new java.lang.String[0];
            }
            if (this.zba || this.zbb || this.zbc.length != 0) {
                return new com.google.android.gms.auth.api.credentials.HintRequest(2, this.zbd, this.zba, this.zbb, this.zbc, this.zbe, this.zbf, this.zbg);
            }
            throw new java.lang.IllegalStateException("At least one authentication method must be specified");
        }

        public com.google.android.gms.auth.api.credentials.HintRequest.Builder setAccountTypes(java.lang.String... strArr) {
            if (strArr == null) {
                strArr = new java.lang.String[0];
            }
            this.zbc = strArr;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.HintRequest.Builder setEmailAddressIdentifierSupported(boolean z) {
            this.zba = z;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.HintRequest.Builder setHintPickerConfig(com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig) {
            this.zbd = (com.google.android.gms.auth.api.credentials.CredentialPickerConfig) com.google.android.gms.common.internal.Preconditions.checkNotNull(credentialPickerConfig);
            return this;
        }

        public com.google.android.gms.auth.api.credentials.HintRequest.Builder setIdTokenNonce(java.lang.String str) {
            this.zbg = str;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.HintRequest.Builder setIdTokenRequested(boolean z) {
            this.zbe = z;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.HintRequest.Builder setPhoneNumberIdentifierSupported(boolean z) {
            this.zbb = z;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.HintRequest.Builder setServerClientId(java.lang.String str) {
            this.zbf = str;
            return this;
        }
    }

    HintRequest(int i, com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, java.lang.String[] strArr, boolean z3, java.lang.String str, java.lang.String str2) {
        this.zba = i;
        this.zbb = (com.google.android.gms.auth.api.credentials.CredentialPickerConfig) com.google.android.gms.common.internal.Preconditions.checkNotNull(credentialPickerConfig);
        this.zbc = z;
        this.zbd = z2;
        this.zbe = (java.lang.String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        if (i < 2) {
            this.zbf = true;
            this.zbg = null;
            this.zbh = null;
        } else {
            this.zbf = z3;
            this.zbg = str;
            this.zbh = str2;
        }
    }

    public java.lang.String[] getAccountTypes() {
        return this.zbe;
    }

    public com.google.android.gms.auth.api.credentials.CredentialPickerConfig getHintPickerConfig() {
        return this.zbb;
    }

    public java.lang.String getIdTokenNonce() {
        return this.zbh;
    }

    public java.lang.String getServerClientId() {
        return this.zbg;
    }

    public boolean isEmailAddressIdentifierSupported() {
        return this.zbc;
    }

    public boolean isIdTokenRequested() {
        return this.zbf;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getHintPickerConfig(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, isEmailAddressIdentifierSupported());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zbd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 4, getAccountTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zba);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
