package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzbd extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzbd> CREATOR = new com.google.android.gms.fitness.request.zzbe();
    private final com.google.android.gms.fitness.data.Subscription zza;
    private final boolean zzb;
    private final com.google.android.gms.internal.fitness.zzcp zzc;

    zzbd(com.google.android.gms.fitness.data.Subscription subscription, boolean z, android.os.IBinder iBinder) {
        this.zza = subscription;
        this.zzb = z;
        this.zzc = iBinder == null ? null : com.google.android.gms.internal.fitness.zzco.zzb(iBinder);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("subscription", this.zza).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        com.google.android.gms.internal.fitness.zzcp zzcpVar = this.zzc;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzcpVar == null ? null : zzcpVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzbd(com.google.android.gms.fitness.data.Subscription subscription, boolean z, com.google.android.gms.internal.fitness.zzcp zzcpVar) {
        this.zza = subscription;
        this.zzb = false;
        this.zzc = zzcpVar;
    }
}
