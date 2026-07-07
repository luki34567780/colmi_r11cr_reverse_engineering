package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzat extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzat> CREATOR = new com.google.android.gms.fitness.request.zzau();
    private final com.google.android.gms.fitness.data.Session zza;
    private final com.google.android.gms.internal.fitness.zzcp zzb;

    zzat(com.google.android.gms.fitness.data.Session session, android.os.IBinder iBinder) {
        this.zza = session;
        this.zzb = iBinder == null ? null : com.google.android.gms.internal.fitness.zzco.zzb(iBinder);
    }

    public final boolean equals(java.lang.Object obj) {
        return obj == this || ((obj instanceof com.google.android.gms.fitness.request.zzat) && com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.fitness.request.zzat) obj).zza));
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("session", this.zza).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.internal.fitness.zzcp zzcpVar = this.zzb;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzcpVar == null ? null : zzcpVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzat(com.google.android.gms.fitness.data.Session session, com.google.android.gms.internal.fitness.zzcp zzcpVar) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(session.getStartTime(java.util.concurrent.TimeUnit.MILLISECONDS) <= java.lang.System.currentTimeMillis(), "Cannot start a session in the future");
        com.google.android.gms.common.internal.Preconditions.checkArgument(session.isOngoing(), "Cannot start a session which has already ended");
        this.zza = session;
        this.zzb = zzcpVar;
    }
}
