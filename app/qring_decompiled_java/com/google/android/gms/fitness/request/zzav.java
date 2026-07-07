package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzav extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzav> CREATOR = new com.google.android.gms.fitness.request.zzaw();
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.fitness.zzcm zzc;

    zzav(java.lang.String str, java.lang.String str2, android.os.IBinder iBinder) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = iBinder == null ? null : com.google.android.gms.internal.fitness.zzcl.zzb(iBinder);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.request.zzav)) {
            return false;
        }
        com.google.android.gms.fitness.request.zzav zzavVar = (com.google.android.gms.fitness.request.zzav) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, zzavVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzavVar.zzb);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("name", this.zza).add("identifier", this.zzb).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.internal.fitness.zzcm zzcmVar = this.zzc;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzcmVar == null ? null : zzcmVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzav(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.fitness.zzcm zzcmVar) {
        this.zza = null;
        this.zzb = str2;
        this.zzc = zzcmVar;
    }
}
