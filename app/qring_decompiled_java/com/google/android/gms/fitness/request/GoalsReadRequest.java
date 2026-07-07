package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class GoalsReadRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.GoalsReadRequest> CREATOR = new com.google.android.gms.fitness.request.zzy();
    private final com.google.android.gms.internal.fitness.zzbw zza;
    private final java.util.List zzb;
    private final java.util.List zzc;
    private final java.util.List zzd;

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class Builder {
        private final java.util.List zza = new java.util.ArrayList();
        private final java.util.List zzb = new java.util.ArrayList();
        private final java.util.List zzc = new java.util.ArrayList();

        public com.google.android.gms.fitness.request.GoalsReadRequest.Builder addActivity(java.lang.String str) {
            int zza = com.google.android.gms.internal.fitness.zzfv.zza(str);
            com.google.android.gms.common.internal.Preconditions.checkState(zza != 4, "Attempting to add an unknown activity");
            com.google.android.gms.internal.fitness.zzd.zza(java.lang.Integer.valueOf(zza), this.zzc);
            return this;
        }

        public com.google.android.gms.fitness.request.GoalsReadRequest.Builder addDataType(com.google.android.gms.fitness.data.DataType dataType) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataType, "Attempting to use a null data type");
            if (!this.zza.contains(dataType)) {
                this.zza.add(dataType);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.GoalsReadRequest.Builder addObjectiveType(int i) {
            boolean z = true;
            if (i != 1 && i != 2) {
                if (i == 3) {
                    i = 3;
                } else {
                    z = false;
                }
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z, "Attempting to add an invalid objective type");
            java.util.List list = this.zzb;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
            if (!list.contains(valueOf)) {
                this.zzb.add(valueOf);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.GoalsReadRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zza.isEmpty(), "At least one data type should be specified.");
            return new com.google.android.gms.fitness.request.GoalsReadRequest(this);
        }
    }

    GoalsReadRequest(android.os.IBinder iBinder, java.util.List list, java.util.List list2, java.util.List list3) {
        this.zza = iBinder == null ? null : com.google.android.gms.internal.fitness.zzbv.zzb(iBinder);
        this.zzb = list;
        this.zzc = list2;
        this.zzd = list3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.request.GoalsReadRequest)) {
            return false;
        }
        com.google.android.gms.fitness.request.GoalsReadRequest goalsReadRequest = (com.google.android.gms.fitness.request.GoalsReadRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzb, goalsReadRequest.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, goalsReadRequest.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, goalsReadRequest.zzd);
    }

    public java.util.List<java.lang.String> getActivityNames() {
        if (this.zzd.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.android.gms.internal.fitness.zzfv.zzb(((java.lang.Integer) it.next()).intValue()));
        }
        return arrayList;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataType> getDataTypes() {
        return this.zzb;
    }

    public java.util.List<java.lang.Integer> getObjectiveTypes() {
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, this.zzc, getActivityNames());
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataTypes", this.zzb).add("objectiveTypes", this.zzc).add("activities", getActivityNames()).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.internal.fitness.zzbw zzbwVar = this.zza;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, zzbwVar == null ? null : zzbwVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeList(parcel, 2, getDataTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeList(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeList(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    private GoalsReadRequest(com.google.android.gms.internal.fitness.zzbw zzbwVar, java.util.List list, java.util.List list2, java.util.List list3) {
        this((android.os.IBinder) (zzbwVar == null ? 0 : zzbwVar), list, list2, list3);
    }

    public GoalsReadRequest(com.google.android.gms.fitness.request.GoalsReadRequest goalsReadRequest, com.google.android.gms.internal.fitness.zzbw zzbwVar) {
        this(zzbwVar, goalsReadRequest.getDataTypes(), goalsReadRequest.zzc, goalsReadRequest.zzd);
    }
}
