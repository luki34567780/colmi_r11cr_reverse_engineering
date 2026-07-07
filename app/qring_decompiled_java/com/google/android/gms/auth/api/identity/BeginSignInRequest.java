package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class BeginSignInRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest> CREATOR = new com.google.android.gms.auth.api.identity.zba();
    private final com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions zba;
    private final com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions zbb;
    private final java.lang.String zbc;
    private final boolean zbd;
    private final int zbe;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static final class Builder {
        private com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions zba;
        private com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions zbb;
        private java.lang.String zbc;
        private boolean zbd;
        private int zbe;

        public Builder() {
            com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.Builder builder = com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.builder();
            builder.setSupported(false);
            this.zba = builder.build();
            com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder builder2 = com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.builder();
            builder2.setSupported(false);
            this.zbb = builder2.build();
        }

        public com.google.android.gms.auth.api.identity.BeginSignInRequest build() {
            return new com.google.android.gms.auth.api.identity.BeginSignInRequest(this.zba, this.zbb, this.zbc, this.zbd, this.zbe);
        }

        public com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder setAutoSelectEnabled(boolean z) {
            this.zbd = z;
            return this;
        }

        public com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder setGoogleIdTokenRequestOptions(com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.zbb = (com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(googleIdTokenRequestOptions);
            return this;
        }

        public com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder setPasswordRequestOptions(com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions passwordRequestOptions) {
            this.zba = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(passwordRequestOptions);
            return this;
        }

        public final com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder zba(java.lang.String str) {
            this.zbc = str;
            return this;
        }

        public final com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder zbb(int i) {
            this.zbe = i;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static final class GoogleIdTokenRequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions> CREATOR = new com.google.android.gms.auth.api.identity.zbg();
        private final boolean zba;
        private final java.lang.String zbb;
        private final java.lang.String zbc;
        private final boolean zbd;
        private final java.lang.String zbe;
        private final java.util.List zbf;
        private final boolean zbg;

        /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
        public static final class Builder {
            private boolean zba = false;
            private java.lang.String zbb = null;
            private java.lang.String zbc = null;
            private boolean zbd = true;
            private java.lang.String zbe = null;
            private java.util.List zbf = null;

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder associateLinkedAccounts(java.lang.String str, java.util.List<java.lang.String> list) {
                this.zbe = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "linkedServiceId must be provided if you want to associate linked accounts.");
                this.zbf = list;
                return this;
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions build() {
                return new com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, false);
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setFilterByAuthorizedAccounts(boolean z) {
                this.zbd = z;
                return this;
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setNonce(java.lang.String str) {
                this.zbc = str;
                return this;
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setServerClientId(java.lang.String str) {
                this.zbb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                return this;
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder setSupported(boolean z) {
                this.zba = z;
                return this;
            }
        }

        GoogleIdTokenRequestOptions(boolean z, java.lang.String str, java.lang.String str2, boolean z2, java.lang.String str3, java.util.List list, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.zba = z;
            if (z) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.zbb = str;
            this.zbc = str2;
            this.zbd = z2;
            android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest> creator = com.google.android.gms.auth.api.identity.BeginSignInRequest.CREATOR;
            java.util.ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new java.util.ArrayList(list);
                java.util.Collections.sort(arrayList);
            }
            this.zbf = arrayList;
            this.zbe = str3;
            this.zbg = z3;
        }

        public static com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder builder() {
            return new com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions)) {
                return false;
            }
            com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions) obj;
            return this.zba == googleIdTokenRequestOptions.zba && com.google.android.gms.common.internal.Objects.equal(this.zbb, googleIdTokenRequestOptions.zbb) && com.google.android.gms.common.internal.Objects.equal(this.zbc, googleIdTokenRequestOptions.zbc) && this.zbd == googleIdTokenRequestOptions.zbd && com.google.android.gms.common.internal.Objects.equal(this.zbe, googleIdTokenRequestOptions.zbe) && com.google.android.gms.common.internal.Objects.equal(this.zbf, googleIdTokenRequestOptions.zbf) && this.zbg == googleIdTokenRequestOptions.zbg;
        }

        public boolean filterByAuthorizedAccounts() {
            return this.zbd;
        }

        public java.util.List<java.lang.String> getIdTokenDepositionScopes() {
            return this.zbf;
        }

        public java.lang.String getLinkedServiceId() {
            return this.zbe;
        }

        public java.lang.String getNonce() {
            return this.zbc;
        }

        public java.lang.String getServerClientId() {
            return this.zbb;
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zba), this.zbb, this.zbc, java.lang.Boolean.valueOf(this.zbd), this.zbe, this.zbf, java.lang.Boolean.valueOf(this.zbg));
        }

        public boolean isSupported() {
            return this.zba;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getServerClientId(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getNonce(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, filterByAuthorizedAccounts());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getLinkedServiceId(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 6, getIdTokenDepositionScopes(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, this.zbg);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static final class PasswordRequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions> CREATOR = new com.google.android.gms.auth.api.identity.zbh();
        private final boolean zba;

        /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
        public static final class Builder {
            private boolean zba = false;

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions build() {
                return new com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions(this.zba);
            }

            public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.Builder setSupported(boolean z) {
                this.zba = z;
                return this;
            }
        }

        PasswordRequestOptions(boolean z) {
            this.zba = z;
        }

        public static com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.Builder builder() {
            return new com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions) && this.zba == ((com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions) obj).zba;
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zba));
        }

        public boolean isSupported() {
            return this.zba;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    BeginSignInRequest(com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions passwordRequestOptions, com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions, java.lang.String str, boolean z, int i) {
        this.zba = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(passwordRequestOptions);
        this.zbb = (com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(googleIdTokenRequestOptions);
        this.zbc = str;
        this.zbd = z;
        this.zbe = i;
    }

    public static com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder builder() {
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder();
    }

    public static com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder zba(com.google.android.gms.auth.api.identity.BeginSignInRequest beginSignInRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(beginSignInRequest);
        com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder builder = builder();
        builder.setGoogleIdTokenRequestOptions(beginSignInRequest.getGoogleIdTokenRequestOptions());
        builder.setPasswordRequestOptions(beginSignInRequest.getPasswordRequestOptions());
        builder.setAutoSelectEnabled(beginSignInRequest.zbd);
        builder.zbb(beginSignInRequest.zbe);
        java.lang.String str = beginSignInRequest.zbc;
        if (str != null) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.identity.BeginSignInRequest)) {
            return false;
        }
        com.google.android.gms.auth.api.identity.BeginSignInRequest beginSignInRequest = (com.google.android.gms.auth.api.identity.BeginSignInRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zba, beginSignInRequest.zba) && com.google.android.gms.common.internal.Objects.equal(this.zbb, beginSignInRequest.zbb) && com.google.android.gms.common.internal.Objects.equal(this.zbc, beginSignInRequest.zbc) && this.zbd == beginSignInRequest.zbd && this.zbe == beginSignInRequest.zbe;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions getGoogleIdTokenRequestOptions() {
        return this.zbb;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions getPasswordRequestOptions() {
        return this.zba;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zba, this.zbb, this.zbc, java.lang.Boolean.valueOf(this.zbd));
    }

    public boolean isAutoSelectEnabled() {
        return this.zbd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getPasswordRequestOptions(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getGoogleIdTokenRequestOptions(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, isAutoSelectEnabled());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zbe);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
