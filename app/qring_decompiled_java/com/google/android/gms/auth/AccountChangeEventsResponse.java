package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public class AccountChangeEventsResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.AccountChangeEventsResponse> CREATOR = new com.google.android.gms.auth.zzc();
    final int zza;
    final java.util.List<com.google.android.gms.auth.AccountChangeEvent> zzb;

    AccountChangeEventsResponse(int i, java.util.List<com.google.android.gms.auth.AccountChangeEvent> list) {
        this.zza = i;
        this.zzb = (java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
    }

    public java.util.List<com.google.android.gms.auth.AccountChangeEvent> getEvents() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AccountChangeEventsResponse(java.util.List<com.google.android.gms.auth.AccountChangeEvent> list) {
        this.zza = 1;
        this.zzb = (java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
    }
}
