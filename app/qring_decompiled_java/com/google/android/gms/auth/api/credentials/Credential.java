package com.google.android.gms.auth.api.credentials;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class Credential extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.Credential> CREATOR = new com.google.android.gms.auth.api.credentials.zba();
    public static final java.lang.String EXTRA_KEY = "com.google.android.gms.credentials.Credential";

    @javax.annotation.Nonnull
    private final java.lang.String zba;
    private final java.lang.String zbb;
    private final android.net.Uri zbc;

    @javax.annotation.Nonnull
    private final java.util.List zbd;
    private final java.lang.String zbe;
    private final java.lang.String zbf;
    private final java.lang.String zbg;
    private final java.lang.String zbh;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    @java.lang.Deprecated
    public static class Builder {
        private final java.lang.String zba;
        private java.lang.String zbb;
        private android.net.Uri zbc;
        private java.util.List zbd;
        private java.lang.String zbe;
        private java.lang.String zbf;
        private java.lang.String zbg;
        private java.lang.String zbh;

        public Builder(com.google.android.gms.auth.api.credentials.Credential credential) {
            this.zba = credential.zba;
            this.zbb = credential.zbb;
            this.zbc = credential.zbc;
            this.zbd = credential.zbd;
            this.zbe = credential.zbe;
            this.zbf = credential.zbf;
            this.zbg = credential.zbg;
            this.zbh = credential.zbh;
        }

        public Builder(java.lang.String str) {
            this.zba = str;
        }

        public com.google.android.gms.auth.api.credentials.Credential build() {
            return new com.google.android.gms.auth.api.credentials.Credential(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh);
        }

        public com.google.android.gms.auth.api.credentials.Credential.Builder setAccountType(java.lang.String str) {
            this.zbf = str;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.Credential.Builder setName(java.lang.String str) {
            this.zbb = str;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.Credential.Builder setPassword(java.lang.String str) {
            this.zbe = str;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.Credential.Builder setProfilePictureUri(android.net.Uri uri) {
            this.zbc = uri;
            return this;
        }
    }

    Credential(java.lang.String str, java.lang.String str2, android.net.Uri uri, java.util.List list, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        java.lang.Boolean bool;
        java.lang.String trim = ((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "credential identifier cannot be null")).trim();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(trim, "credential identifier cannot be empty");
        if (str3 != null && android.text.TextUtils.isEmpty(str3)) {
            throw new java.lang.IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            if (android.text.TextUtils.isEmpty(str4)) {
                bool = false;
            } else {
                android.net.Uri parse = android.net.Uri.parse(str4);
                if (!parse.isAbsolute() || !parse.isHierarchical() || android.text.TextUtils.isEmpty(parse.getScheme()) || android.text.TextUtils.isEmpty(parse.getAuthority())) {
                    bool = false;
                } else {
                    bool = java.lang.Boolean.valueOf("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()));
                }
            }
            if (!bool.booleanValue()) {
                throw new java.lang.IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!android.text.TextUtils.isEmpty(str4) && !android.text.TextUtils.isEmpty(str3)) {
            throw new java.lang.IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && android.text.TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.zbb = str2;
        this.zbc = uri;
        this.zbd = list == null ? java.util.Collections.emptyList() : java.util.Collections.unmodifiableList(list);
        this.zba = trim;
        this.zbe = str3;
        this.zbf = str4;
        this.zbg = str5;
        this.zbh = str6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.credentials.Credential)) {
            return false;
        }
        com.google.android.gms.auth.api.credentials.Credential credential = (com.google.android.gms.auth.api.credentials.Credential) obj;
        return android.text.TextUtils.equals(this.zba, credential.zba) && android.text.TextUtils.equals(this.zbb, credential.zbb) && com.google.android.gms.common.internal.Objects.equal(this.zbc, credential.zbc) && android.text.TextUtils.equals(this.zbe, credential.zbe) && android.text.TextUtils.equals(this.zbf, credential.zbf);
    }

    public java.lang.String getAccountType() {
        return this.zbf;
    }

    public java.lang.String getFamilyName() {
        return this.zbh;
    }

    public java.lang.String getGivenName() {
        return this.zbg;
    }

    @javax.annotation.Nonnull
    public java.lang.String getId() {
        return this.zba;
    }

    @javax.annotation.Nonnull
    public java.util.List<com.google.android.gms.auth.api.credentials.IdToken> getIdTokens() {
        return this.zbd;
    }

    public java.lang.String getName() {
        return this.zbb;
    }

    public java.lang.String getPassword() {
        return this.zbe;
    }

    public android.net.Uri getProfilePictureUri() {
        return this.zbc;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zba, this.zbb, this.zbc, this.zbe, this.zbf);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getProfilePictureUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 4, getIdTokens(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getPassword(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getAccountType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, getGivenName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, getFamilyName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
