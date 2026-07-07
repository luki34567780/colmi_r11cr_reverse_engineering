package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class SavePasswordRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.SavePasswordRequest> CREATOR = new com.google.android.gms.auth.api.identity.zbk();
    private final com.google.android.gms.auth.api.identity.SignInPassword zba;
    private final java.lang.String zbb;
    private final int zbc;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static final class Builder {
        private com.google.android.gms.auth.api.identity.SignInPassword zba;
        private java.lang.String zbb;
        private int zbc;

        public com.google.android.gms.auth.api.identity.SavePasswordRequest build() {
            return new com.google.android.gms.auth.api.identity.SavePasswordRequest(this.zba, this.zbb, this.zbc);
        }

        public com.google.android.gms.auth.api.identity.SavePasswordRequest.Builder setSignInPassword(com.google.android.gms.auth.api.identity.SignInPassword signInPassword) {
            this.zba = signInPassword;
            return this;
        }

        public final com.google.android.gms.auth.api.identity.SavePasswordRequest.Builder zba(java.lang.String str) {
            this.zbb = str;
            return this;
        }

        public final com.google.android.gms.auth.api.identity.SavePasswordRequest.Builder zbb(int i) {
            this.zbc = i;
            return this;
        }
    }

    SavePasswordRequest(com.google.android.gms.auth.api.identity.SignInPassword signInPassword, java.lang.String str, int i) {
        this.zba = (com.google.android.gms.auth.api.identity.SignInPassword) com.google.android.gms.common.internal.Preconditions.checkNotNull(signInPassword);
        this.zbb = str;
        this.zbc = i;
    }

    public static com.google.android.gms.auth.api.identity.SavePasswordRequest.Builder builder() {
        return new com.google.android.gms.auth.api.identity.SavePasswordRequest.Builder();
    }

    public static com.google.android.gms.auth.api.identity.SavePasswordRequest.Builder zba(com.google.android.gms.auth.api.identity.SavePasswordRequest savePasswordRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(savePasswordRequest);
        com.google.android.gms.auth.api.identity.SavePasswordRequest.Builder builder = builder();
        builder.setSignInPassword(savePasswordRequest.getSignInPassword());
        builder.zbb(savePasswordRequest.zbc);
        java.lang.String str = savePasswordRequest.zbb;
        if (str != null) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.identity.SavePasswordRequest)) {
            return false;
        }
        com.google.android.gms.auth.api.identity.SavePasswordRequest savePasswordRequest = (com.google.android.gms.auth.api.identity.SavePasswordRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zba, savePasswordRequest.zba) && com.google.android.gms.common.internal.Objects.equal(this.zbb, savePasswordRequest.zbb) && this.zbc == savePasswordRequest.zbc;
    }

    public com.google.android.gms.auth.api.identity.SignInPassword getSignInPassword() {
        return this.zba;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zba, this.zbb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getSignInPassword(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zbb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zbc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
