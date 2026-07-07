package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzax extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzax> CREATOR = new com.google.android.gms.fitness.request.zzay();
    private final android.app.PendingIntent zza;
    private final com.google.android.gms.internal.fitness.zzcp zzb;

    zzax(android.app.PendingIntent pendingIntent, android.os.IBinder iBinder) {
        this.zza = pendingIntent;
        this.zzb = iBinder == null ? null : com.google.android.gms.internal.fitness.zzco.zzb(iBinder);
    }

    public final boolean equals(java.lang.Object obj) {
        return this == obj || ((obj instanceof com.google.android.gms.fitness.request.zzax) && com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.fitness.request.zzax) obj).zza));
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add(com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, this.zza).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.internal.fitness.zzcp zzcpVar = this.zzb;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzcpVar == null ? null : zzcpVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzax(android.app.PendingIntent pendingIntent, com.google.android.gms.internal.fitness.zzcp zzcpVar) {
        this.zza = pendingIntent;
        this.zzb = zzcpVar;
    }
}
