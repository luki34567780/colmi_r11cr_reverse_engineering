package com.google.android.gms.fitness.result;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class SessionStopResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.SessionStopResult> CREATOR = new com.google.android.gms.fitness.result.zzi();
    private final com.google.android.gms.common.api.Status zza;
    private final java.util.List zzb;

    public SessionStopResult(com.google.android.gms.common.api.Status status, java.util.List list) {
        this.zza = status;
        this.zzb = java.util.Collections.unmodifiableList(list);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.result.SessionStopResult)) {
            return false;
        }
        com.google.android.gms.fitness.result.SessionStopResult sessionStopResult = (com.google.android.gms.fitness.result.SessionStopResult) obj;
        return this.zza.equals(sessionStopResult.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, sessionStopResult.zzb);
    }

    public java.util.List<com.google.android.gms.fitness.data.Session> getSessions() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zza).add("sessions", this.zzb).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, getSessions(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
