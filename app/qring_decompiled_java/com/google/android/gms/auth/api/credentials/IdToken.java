package com.google.android.gms.auth.api.credentials;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public final class IdToken extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.IdToken> CREATOR = new com.google.android.gms.auth.api.credentials.zbf();
    private final java.lang.String zba;
    private final java.lang.String zbb;

    public IdToken(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(!android.text.TextUtils.isEmpty(str), "account type string cannot be null or empty");
        com.google.android.gms.common.internal.Preconditions.checkArgument(!android.text.TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.zba = str;
        this.zbb = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.credentials.IdToken)) {
            return false;
        }
        com.google.android.gms.auth.api.credentials.IdToken idToken = (com.google.android.gms.auth.api.credentials.IdToken) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zba, idToken.zba) && com.google.android.gms.common.internal.Objects.equal(this.zbb, idToken.zbb);
    }

    public java.lang.String getAccountType() {
        return this.zba;
    }

    public java.lang.String getIdToken() {
        return this.zbb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getAccountType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getIdToken(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
