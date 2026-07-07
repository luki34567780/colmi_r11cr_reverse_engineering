package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class SessionReadRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.SessionReadRequest> CREATOR = new com.google.android.gms.fitness.request.zzaq();
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final long zzc;
    private final long zzd;
    private final java.util.List zze;
    private final java.util.List zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final java.util.List zzi;
    private final com.google.android.gms.internal.fitness.zzcj zzj;
    private final boolean zzk;
    private final boolean zzl;

    /* JADX WARN: Multi-variable type inference failed */
    public SessionReadRequest(com.google.android.gms.fitness.request.SessionReadRequest sessionReadRequest, com.google.android.gms.internal.fitness.zzcj zzcjVar) {
        this(sessionReadRequest.zza, sessionReadRequest.zzb, sessionReadRequest.zzc, sessionReadRequest.zzd, sessionReadRequest.zze, sessionReadRequest.zzf, sessionReadRequest.zzg, sessionReadRequest.zzh, sessionReadRequest.zzi, zzcjVar, sessionReadRequest.zzk, sessionReadRequest.zzl);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.request.SessionReadRequest)) {
            return false;
        }
        com.google.android.gms.fitness.request.SessionReadRequest sessionReadRequest = (com.google.android.gms.fitness.request.SessionReadRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, sessionReadRequest.zza) && this.zzb.equals(sessionReadRequest.zzb) && this.zzc == sessionReadRequest.zzc && this.zzd == sessionReadRequest.zzd && com.google.android.gms.common.internal.Objects.equal(this.zze, sessionReadRequest.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, sessionReadRequest.zzf) && this.zzg == sessionReadRequest.zzg && this.zzi.equals(sessionReadRequest.zzi) && this.zzh == sessionReadRequest.zzh && this.zzk == sessionReadRequest.zzk && this.zzl == sessionReadRequest.zzl;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSource> getDataSources() {
        return this.zzf;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataType> getDataTypes() {
        return this.zze;
    }

    public long getEndTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzd, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public java.util.List<java.lang.String> getExcludedPackages() {
        return this.zzi;
    }

    public java.lang.String getSessionId() {
        return this.zzb;
    }

    public java.lang.String getSessionName() {
        return this.zza;
    }

    public long getStartTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzc, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, java.lang.Long.valueOf(this.zzc), java.lang.Long.valueOf(this.zzd));
    }

    public boolean includeSessionsFromAllApps() {
        return this.zzg;
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("sessionName", this.zza).add("sessionId", this.zzb).add("startTimeMillis", java.lang.Long.valueOf(this.zzc)).add("endTimeMillis", java.lang.Long.valueOf(this.zzd)).add("dataTypes", this.zze).add("dataSources", this.zzf).add("sessionsFromAllApps", java.lang.Boolean.valueOf(this.zzg)).add("excludedPackages", this.zzi).add("useServer", java.lang.Boolean.valueOf(this.zzh)).add("activitySessionsIncluded", java.lang.Boolean.valueOf(this.zzk)).add("sleepSessionsIncluded", java.lang.Boolean.valueOf(this.zzl)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getSessionName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getSessionId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, getDataTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 6, getDataSources(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, includeSessionsFromAllApps());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 9, getExcludedPackages(), false);
        com.google.android.gms.internal.fitness.zzcj zzcjVar = this.zzj;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 10, zzcjVar == null ? null : zzcjVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class Builder {
        private java.lang.String zza;
        private java.lang.String zzb;
        private long zzc = 0;
        private long zzd = 0;
        private final java.util.List zze = new java.util.ArrayList();
        private final java.util.List zzf = new java.util.ArrayList();
        private boolean zzg = false;
        private boolean zzh = false;
        private final java.util.List zzi = new java.util.ArrayList();
        private boolean zzj = false;
        private boolean zzk = false;
        private boolean zzl = false;

        public com.google.android.gms.fitness.request.SessionReadRequest build() {
            long j = this.zzc;
            com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0, "Invalid start time: %s", java.lang.Long.valueOf(j));
            long j2 = this.zzd;
            com.google.android.gms.common.internal.Preconditions.checkArgument(j2 > 0 && j2 > this.zzc, "Invalid end time: %s", java.lang.Long.valueOf(j2));
            if (!this.zzl) {
                this.zzj = true;
            }
            return new com.google.android.gms.fitness.request.SessionReadRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, null, this.zzj, this.zzk);
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder enableServerQueries() {
            this.zzh = true;
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder excludePackage(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Attempting to use a null package name");
            if (!this.zzi.contains(str)) {
                this.zzi.add(str);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder includeActivitySessions() {
            this.zzj = true;
            this.zzl = true;
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder includeSleepSessions() {
            this.zzk = true;
            this.zzl = true;
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder read(com.google.android.gms.fitness.data.DataSource dataSource) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource, "Attempting to add a null data source");
            if (!this.zzf.contains(dataSource)) {
                this.zzf.add(dataSource);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder readSessionsFromAllApps() {
            this.zzg = true;
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder setSessionId(java.lang.String str) {
            this.zzb = str;
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder setSessionName(java.lang.String str) {
            this.zza = str;
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder setTimeInterval(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            this.zzc = timeUnit.toMillis(j);
            this.zzd = timeUnit.toMillis(j2);
            return this;
        }

        public com.google.android.gms.fitness.request.SessionReadRequest.Builder read(com.google.android.gms.fitness.data.DataType dataType) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataType, "Attempting to use a null data type");
            if (!this.zze.contains(dataType)) {
                this.zze.add(dataType);
            }
            return this;
        }
    }

    SessionReadRequest(java.lang.String str, java.lang.String str2, long j, long j2, java.util.List list, java.util.List list2, boolean z, boolean z2, java.util.List list3, android.os.IBinder iBinder, boolean z3, boolean z4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = list;
        this.zzf = list2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = list3;
        this.zzj = iBinder == null ? null : com.google.android.gms.internal.fitness.zzci.zzb(iBinder);
        this.zzk = z3;
        this.zzl = z4;
    }
}
