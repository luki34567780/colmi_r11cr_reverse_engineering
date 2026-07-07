package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzan extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzan> CREATOR = new com.google.android.gms.fitness.request.zzao();
    private final com.google.android.gms.fitness.data.zzv zza;
    private final android.app.PendingIntent zzb;
    private final com.google.android.gms.internal.fitness.zzcp zzc;

    zzan(android.os.IBinder iBinder, android.app.PendingIntent pendingIntent, android.os.IBinder iBinder2) {
        this.zza = iBinder == null ? null : com.google.android.gms.fitness.data.zzu.zzb(iBinder);
        this.zzb = pendingIntent;
        this.zzc = iBinder2 != null ? com.google.android.gms.internal.fitness.zzco.zzb(iBinder2) : null;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("SensorUnregistrationRequest{%s}", this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.fitness.data.zzv zzvVar = this.zza;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, zzvVar == null ? null : zzvVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.internal.fitness.zzcp zzcpVar = this.zzc;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzcpVar != null ? zzcpVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzan(com.google.android.gms.fitness.data.zzv zzvVar, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.fitness.zzcp zzcpVar) {
        this.zza = zzvVar;
        this.zzb = pendingIntent;
        this.zzc = zzcpVar;
    }
}
