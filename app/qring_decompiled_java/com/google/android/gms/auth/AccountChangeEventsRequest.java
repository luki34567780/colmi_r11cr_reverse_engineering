package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public class AccountChangeEventsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.AccountChangeEventsRequest> CREATOR = new com.google.android.gms.auth.zzb();
    final int zza;
    int zzb;

    @java.lang.Deprecated
    java.lang.String zzc;
    android.accounts.Account zzd;

    public AccountChangeEventsRequest() {
        this.zza = 1;
    }

    public android.accounts.Account getAccount() {
        return this.zzd;
    }

    @java.lang.Deprecated
    public java.lang.String getAccountName() {
        return this.zzc;
    }

    public int getEventIndex() {
        return this.zzb;
    }

    public com.google.android.gms.auth.AccountChangeEventsRequest setAccount(android.accounts.Account account) {
        this.zzd = account;
        return this;
    }

    @java.lang.Deprecated
    public com.google.android.gms.auth.AccountChangeEventsRequest setAccountName(java.lang.String str) {
        this.zzc = str;
        return this;
    }

    public com.google.android.gms.auth.AccountChangeEventsRequest setEventIndex(int i) {
        this.zzb = i;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    AccountChangeEventsRequest(int i, int i2, java.lang.String str, android.accounts.Account account) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        if (account != null || android.text.TextUtils.isEmpty(str)) {
            this.zzd = account;
        } else {
            this.zzd = new android.accounts.Account(str, "com.google");
        }
    }
}
