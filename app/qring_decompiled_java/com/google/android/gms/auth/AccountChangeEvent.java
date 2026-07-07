package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public class AccountChangeEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.AccountChangeEvent> CREATOR = new com.google.android.gms.auth.zza();
    final int zza;
    final long zzb;
    final java.lang.String zzc;
    final int zzd;
    final int zze;
    final java.lang.String zzf;

    AccountChangeEvent(int i, long j, java.lang.String str, int i2, int i3, java.lang.String str2) {
        this.zza = i;
        this.zzb = j;
        this.zzc = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.google.android.gms.auth.AccountChangeEvent accountChangeEvent = (com.google.android.gms.auth.AccountChangeEvent) obj;
        return this.zza == accountChangeEvent.zza && this.zzb == accountChangeEvent.zzb && com.google.android.gms.common.internal.Objects.equal(this.zzc, accountChangeEvent.zzc) && this.zzd == accountChangeEvent.zzd && this.zze == accountChangeEvent.zze && com.google.android.gms.common.internal.Objects.equal(this.zzf, accountChangeEvent.zzf);
    }

    public java.lang.String getAccountName() {
        return this.zzc;
    }

    public java.lang.String getChangeData() {
        return this.zzf;
    }

    public int getChangeType() {
        return this.zzd;
    }

    public int getEventIndex() {
        return this.zze;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Long.valueOf(this.zzb), this.zzc, java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zze), this.zzf);
    }

    public java.lang.String toString() {
        int i = this.zzd;
        java.lang.String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        java.lang.String str2 = this.zzc;
        java.lang.String str3 = this.zzf;
        int i2 = this.zze;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 91 + str.length() + java.lang.String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AccountChangeEvent(long j, java.lang.String str, int i, int i2, java.lang.String str2) {
        this.zza = 1;
        this.zzb = j;
        this.zzc = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzd = i;
        this.zze = i2;
        this.zzf = str2;
    }
}
