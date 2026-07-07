package com.google.android.gms.fitness.result;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class SessionReadResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.SessionReadResult> CREATOR = new com.google.android.gms.fitness.result.zzh();
    private final java.util.List zza;
    private final java.util.List zzb;
    private final com.google.android.gms.common.api.Status zzc;

    public SessionReadResult(java.util.List list, java.util.List list2, com.google.android.gms.common.api.Status status) {
        this.zza = list;
        this.zzb = java.util.Collections.unmodifiableList(list2);
        this.zzc = status;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.result.SessionReadResult)) {
            return false;
        }
        com.google.android.gms.fitness.result.SessionReadResult sessionReadResult = (com.google.android.gms.fitness.result.SessionReadResult) obj;
        return this.zzc.equals(sessionReadResult.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zza, sessionReadResult.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, sessionReadResult.zzb);
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSet> getDataSet(com.google.android.gms.fitness.data.Session session) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(this.zza.contains(session), "Attempting to read data for session %s which was not returned", session);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.fitness.data.zzad zzadVar : this.zzb) {
            if (com.google.android.gms.common.internal.Objects.equal(session, zzadVar.zzb())) {
                arrayList.add(zzadVar.zza());
            }
        }
        return arrayList;
    }

    public java.util.List<com.google.android.gms.fitness.data.Session> getSessions() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zzc;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzc, this.zza, this.zzb);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zzc).add("sessions", this.zza).add("sessionDataSets", this.zzb).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getSessions(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSet> getDataSet(com.google.android.gms.fitness.data.Session session, com.google.android.gms.fitness.data.DataType dataType) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(this.zza.contains(session), "Attempting to read data for session %s which was not returned", session);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.fitness.data.zzad zzadVar : this.zzb) {
            if (com.google.android.gms.common.internal.Objects.equal(session, zzadVar.zzb()) && dataType.equals(zzadVar.zza().getDataType())) {
                arrayList.add(zzadVar.zza());
            }
        }
        return arrayList;
    }
}
