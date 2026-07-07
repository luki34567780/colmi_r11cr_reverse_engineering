package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class DataDeleteRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.DataDeleteRequest> CREATOR = new com.google.android.gms.fitness.request.zzj();
    private final long zza;
    private final long zzb;
    private final java.util.List zzc;
    private final java.util.List zzd;
    private final java.util.List zze;
    private final boolean zzf;
    private final boolean zzg;
    private final com.google.android.gms.internal.fitness.zzcp zzh;
    private final boolean zzi;
    private final boolean zzj;

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class Builder {
        private long zza;
        private long zzb;
        private final java.util.List zzc = new java.util.ArrayList();
        private final java.util.List zzd = new java.util.ArrayList();
        private final java.util.List zze = new java.util.ArrayList();
        private boolean zzf = false;
        private boolean zzg = false;

        public com.google.android.gms.fitness.request.DataDeleteRequest.Builder addDataSource(com.google.android.gms.fitness.data.DataSource dataSource) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(!this.zzf, "All data is already marked for deletion.  addDataSource() cannot be combined with deleteAllData()");
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataSource != null, "Must specify a valid data source");
            if (!this.zzc.contains(dataSource)) {
                this.zzc.add(dataSource);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.DataDeleteRequest.Builder addDataType(com.google.android.gms.fitness.data.DataType dataType) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(!this.zzf, "All data is already marked for deletion.  addDataType() cannot be combined with deleteAllData()");
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataType != null, "Must specify a valid data type");
            if (!this.zzd.contains(dataType)) {
                this.zzd.add(dataType);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.DataDeleteRequest.Builder addSession(com.google.android.gms.fitness.data.Session session) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(!this.zzg, "All sessions already marked for deletion.  addSession() cannot be combined with deleteAllSessions()");
            com.google.android.gms.common.internal.Preconditions.checkArgument(session != null, "Must specify a valid session");
            com.google.android.gms.common.internal.Preconditions.checkArgument(session.getEndTime(java.util.concurrent.TimeUnit.MILLISECONDS) > 0, "Cannot delete an ongoing session. Please stop the session prior to deleting it");
            this.zze.add(session);
            return this;
        }

        public com.google.android.gms.fitness.request.DataDeleteRequest build() {
            long j = this.zza;
            com.google.android.gms.common.internal.Preconditions.checkState(j > 0 && this.zzb > j, "Must specify a valid time interval");
            com.google.android.gms.common.internal.Preconditions.checkState((this.zzf || !this.zzc.isEmpty() || !this.zzd.isEmpty()) || (this.zzg || !this.zze.isEmpty()), "No data or session marked for deletion");
            if (!this.zze.isEmpty()) {
                for (com.google.android.gms.fitness.data.Session session : this.zze) {
                    com.google.android.gms.common.internal.Preconditions.checkState(session.getStartTime(java.util.concurrent.TimeUnit.MILLISECONDS) >= this.zza && session.getEndTime(java.util.concurrent.TimeUnit.MILLISECONDS) <= this.zzb, "Session %s is outside the time interval [%d, %d]", session, java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(this.zzb));
                }
            }
            return new com.google.android.gms.fitness.request.DataDeleteRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, false, false, (com.google.android.gms.internal.fitness.zzcp) null);
        }

        public com.google.android.gms.fitness.request.DataDeleteRequest.Builder deleteAllData() {
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zzd.isEmpty(), "Specific data type already added for deletion. deleteAllData() will delete all data types and cannot be combined with addDataType()");
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zzc.isEmpty(), "Specific data source already added for deletion. deleteAllData() will delete all data sources and cannot be combined with addDataSource()");
            this.zzf = true;
            return this;
        }

        public com.google.android.gms.fitness.request.DataDeleteRequest.Builder deleteAllSessions() {
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zze.isEmpty(), "Specific session already added for deletion. deleteAllData() will delete all sessions and cannot be combined with addSession()");
            this.zzg = true;
            return this;
        }

        public com.google.android.gms.fitness.request.DataDeleteRequest.Builder setTimeInterval(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0, "Invalid start time: %d", java.lang.Long.valueOf(j));
            com.google.android.gms.common.internal.Preconditions.checkArgument(j2 > j, "Invalid end time: %d", java.lang.Long.valueOf(j2));
            this.zza = timeUnit.toMillis(j);
            this.zzb = timeUnit.toMillis(j2);
            return this;
        }
    }

    DataDeleteRequest(long j, long j2, java.util.List list, java.util.List list2, java.util.List list3, boolean z, boolean z2, boolean z3, boolean z4, android.os.IBinder iBinder) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = java.util.Collections.unmodifiableList(list);
        this.zzd = java.util.Collections.unmodifiableList(list2);
        this.zze = list3;
        this.zzf = z;
        this.zzg = z2;
        this.zzi = z3;
        this.zzj = z4;
        this.zzh = iBinder == null ? null : com.google.android.gms.internal.fitness.zzco.zzb(iBinder);
    }

    public boolean deleteAllData() {
        return this.zzf;
    }

    public boolean deleteAllSessions() {
        return this.zzg;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.request.DataDeleteRequest)) {
            return false;
        }
        com.google.android.gms.fitness.request.DataDeleteRequest dataDeleteRequest = (com.google.android.gms.fitness.request.DataDeleteRequest) obj;
        return this.zza == dataDeleteRequest.zza && this.zzb == dataDeleteRequest.zzb && com.google.android.gms.common.internal.Objects.equal(this.zzc, dataDeleteRequest.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, dataDeleteRequest.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, dataDeleteRequest.zze) && this.zzf == dataDeleteRequest.zzf && this.zzg == dataDeleteRequest.zzg && this.zzi == dataDeleteRequest.zzi && this.zzj == dataDeleteRequest.zzj;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSource> getDataSources() {
        return this.zzc;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataType> getDataTypes() {
        return this.zzd;
    }

    public long getEndTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzb, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public java.util.List<com.google.android.gms.fitness.data.Session> getSessions() {
        return this.zze;
    }

    public long getStartTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zza, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(this.zzb));
    }

    public java.lang.String toString() {
        com.google.android.gms.common.internal.Objects.ToStringHelper add = com.google.android.gms.common.internal.Objects.toStringHelper(this).add("startTimeMillis", java.lang.Long.valueOf(this.zza)).add("endTimeMillis", java.lang.Long.valueOf(this.zzb)).add("dataSources", this.zzc).add("dateTypes", this.zzd).add("sessions", this.zze).add("deleteAllData", java.lang.Boolean.valueOf(this.zzf)).add("deleteAllSessions", java.lang.Boolean.valueOf(this.zzg));
        if (this.zzi) {
            add.add("deleteByTimeRange", true);
        }
        return add.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, getDataSources(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 4, getDataTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, getSessions(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, deleteAllData());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, deleteAllSessions());
        com.google.android.gms.internal.fitness.zzcp zzcpVar = this.zzh;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 8, zzcpVar == null ? null : zzcpVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public DataDeleteRequest(long j, long j2, java.util.List list, java.util.List list2, java.util.List list3, boolean z, boolean z2, boolean z3, boolean z4, com.google.android.gms.internal.fitness.zzcp zzcpVar) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = java.util.Collections.unmodifiableList(list);
        this.zzd = java.util.Collections.unmodifiableList(list2);
        this.zze = list3;
        this.zzf = z;
        this.zzg = z2;
        this.zzi = z3;
        this.zzj = z4;
        this.zzh = zzcpVar;
    }

    public DataDeleteRequest(com.google.android.gms.fitness.request.DataDeleteRequest dataDeleteRequest, com.google.android.gms.internal.fitness.zzcp zzcpVar) {
        this(dataDeleteRequest.zza, dataDeleteRequest.zzb, dataDeleteRequest.zzc, dataDeleteRequest.zzd, dataDeleteRequest.zze, dataDeleteRequest.zzf, dataDeleteRequest.zzg, dataDeleteRequest.zzi, dataDeleteRequest.zzj, zzcpVar);
    }
}
