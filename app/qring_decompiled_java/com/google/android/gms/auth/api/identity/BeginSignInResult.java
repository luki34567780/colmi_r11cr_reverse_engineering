package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class BeginSignInResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInResult> CREATOR = new com.google.android.gms.auth.api.identity.zbb();
    private final android.app.PendingIntent zba;

    public BeginSignInResult(android.app.PendingIntent pendingIntent) {
        this.zba = (android.app.PendingIntent) com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
    }

    public android.app.PendingIntent getPendingIntent() {
        return this.zba;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
