package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public final class zzp extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzp> CREATOR = new com.google.android.gms.fitness.request.zzq();
    private final java.lang.String zza;
    private final com.google.android.gms.internal.fitness.zzbt zzb;

    zzp(java.lang.String str, android.os.IBinder iBinder) {
        this.zza = str;
        this.zzb = com.google.android.gms.internal.fitness.zzbs.zzb(iBinder);
    }

    public final boolean equals(java.lang.Object obj) {
        return obj == this || ((obj instanceof com.google.android.gms.fitness.request.zzp) && com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.fitness.request.zzp) obj).zza));
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("name", this.zza).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, this.zzb.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzp(java.lang.String str, com.google.android.gms.internal.fitness.zzbt zzbtVar) {
        this.zza = str;
        this.zzb = zzbtVar;
    }
}
