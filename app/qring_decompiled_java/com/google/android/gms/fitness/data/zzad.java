package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzad extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.zzad> CREATOR = new com.google.android.gms.fitness.data.zzae();
    private final com.google.android.gms.fitness.data.Session zza;
    private final com.google.android.gms.fitness.data.DataSet zzb;

    public zzad(com.google.android.gms.fitness.data.Session session, com.google.android.gms.fitness.data.DataSet dataSet) {
        this.zza = session;
        this.zzb = dataSet;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.zzad)) {
            return false;
        }
        com.google.android.gms.fitness.data.zzad zzadVar = (com.google.android.gms.fitness.data.zzad) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, zzadVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzadVar.zzb);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("session", this.zza).add("dataSet", this.zzb).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.fitness.data.DataSet zza() {
        return this.zzb;
    }

    public final com.google.android.gms.fitness.data.Session zzb() {
        return this.zza;
    }
}
