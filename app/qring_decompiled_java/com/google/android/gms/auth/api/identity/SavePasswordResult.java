package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class SavePasswordResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.SavePasswordResult> CREATOR = new com.google.android.gms.auth.api.identity.zbl();
    private final android.app.PendingIntent zba;

    public SavePasswordResult(android.app.PendingIntent pendingIntent) {
        this.zba = (android.app.PendingIntent) com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.auth.api.identity.SavePasswordResult) {
            return com.google.android.gms.common.internal.Objects.equal(this.zba, ((com.google.android.gms.auth.api.identity.SavePasswordResult) obj).zba);
        }
        return false;
    }

    public android.app.PendingIntent getPendingIntent() {
        return this.zba;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zba);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
