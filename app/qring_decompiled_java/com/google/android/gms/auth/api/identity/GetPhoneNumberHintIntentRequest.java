package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class GetPhoneNumberHintIntentRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest> CREATOR = new com.google.android.gms.auth.api.identity.zbe();
    private final int zba;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static final class Builder {
        private Builder() {
        }

        /* synthetic */ Builder(com.google.android.gms.auth.api.identity.zbd zbdVar) {
        }

        public com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest build() {
            return new com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest(0);
        }
    }

    GetPhoneNumberHintIntentRequest(int i) {
        this.zba = i;
    }

    public static com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest.Builder builder() {
        return new com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest.Builder(null);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest) {
            return com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zba), java.lang.Integer.valueOf(((com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest) obj).zba));
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zba));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zba);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
