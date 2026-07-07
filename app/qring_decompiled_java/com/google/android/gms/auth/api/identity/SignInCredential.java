package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class SignInCredential extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.SignInCredential> CREATOR = new com.google.android.gms.auth.api.identity.zbm();
    private final java.lang.String zba;
    private final java.lang.String zbb;
    private final java.lang.String zbc;
    private final java.lang.String zbd;
    private final android.net.Uri zbe;
    private final java.lang.String zbf;
    private final java.lang.String zbg;
    private final java.lang.String zbh;

    public SignInCredential(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.zba = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = str4;
        this.zbe = uri;
        this.zbf = str5;
        this.zbg = str6;
        this.zbh = str7;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.identity.SignInCredential)) {
            return false;
        }
        com.google.android.gms.auth.api.identity.SignInCredential signInCredential = (com.google.android.gms.auth.api.identity.SignInCredential) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zba, signInCredential.zba) && com.google.android.gms.common.internal.Objects.equal(this.zbb, signInCredential.zbb) && com.google.android.gms.common.internal.Objects.equal(this.zbc, signInCredential.zbc) && com.google.android.gms.common.internal.Objects.equal(this.zbd, signInCredential.zbd) && com.google.android.gms.common.internal.Objects.equal(this.zbe, signInCredential.zbe) && com.google.android.gms.common.internal.Objects.equal(this.zbf, signInCredential.zbf) && com.google.android.gms.common.internal.Objects.equal(this.zbg, signInCredential.zbg) && com.google.android.gms.common.internal.Objects.equal(this.zbh, signInCredential.zbh);
    }

    public java.lang.String getDisplayName() {
        return this.zbb;
    }

    public java.lang.String getFamilyName() {
        return this.zbd;
    }

    public java.lang.String getGivenName() {
        return this.zbc;
    }

    public java.lang.String getGoogleIdToken() {
        return this.zbg;
    }

    public java.lang.String getId() {
        return this.zba;
    }

    public java.lang.String getPassword() {
        return this.zbf;
    }

    public android.net.Uri getProfilePictureUri() {
        return this.zbe;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getGivenName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getFamilyName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, getProfilePictureUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getPassword(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, getGoogleIdToken(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zbh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
