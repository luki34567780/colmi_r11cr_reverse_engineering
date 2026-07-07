package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class SignInPassword extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.SignInPassword> CREATOR = new com.google.android.gms.auth.api.identity.zbo();
    private final java.lang.String zba;
    private final java.lang.String zbb;

    public SignInPassword(java.lang.String str, java.lang.String str2) {
        this.zba = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.zbb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.identity.SignInPassword)) {
            return false;
        }
        com.google.android.gms.auth.api.identity.SignInPassword signInPassword = (com.google.android.gms.auth.api.identity.SignInPassword) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zba, signInPassword.zba) && com.google.android.gms.common.internal.Objects.equal(this.zbb, signInPassword.zbb);
    }

    public java.lang.String getId() {
        return this.zba;
    }

    public java.lang.String getPassword() {
        return this.zbb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zba, this.zbb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getPassword(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
