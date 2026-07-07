package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class Session extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Session> CREATOR = new com.google.android.gms.fitness.data.zzac();
    public static final java.lang.String EXTRA_SESSION = "vnd.google.fitness.session";
    public static final java.lang.String MIME_TYPE_PREFIX = "vnd.google.fitness.session/";
    private final long zza;
    private final long zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final int zzf;
    private final com.google.android.gms.fitness.data.zzb zzg;
    private final java.lang.Long zzh;

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class Builder {
        private java.lang.String zzd;
        private java.lang.Long zzg;
        private long zza = 0;
        private long zzb = 0;
        private java.lang.String zzc = null;
        private java.lang.String zze = "";
        private int zzf = 4;

        public com.google.android.gms.fitness.data.Session build() {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zza > 0, "Start time should be specified.");
            long j = this.zzb;
            com.google.android.gms.common.internal.Preconditions.checkState(j == 0 || j > this.zza, "End time should be later than start time.");
            if (this.zzd == null) {
                java.lang.String str = this.zzc;
                if (str == null) {
                    str = "";
                }
                this.zzd = str + this.zza;
            }
            return new com.google.android.gms.fitness.data.Session(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null, this.zzg);
        }

        public com.google.android.gms.fitness.data.Session.Builder setActiveTime(long j, java.util.concurrent.TimeUnit timeUnit) {
            this.zzg = java.lang.Long.valueOf(timeUnit.toMillis(j));
            return this;
        }

        public com.google.android.gms.fitness.data.Session.Builder setActivity(java.lang.String str) {
            int zza = com.google.android.gms.internal.fitness.zzfv.zza(str);
            com.google.android.gms.internal.fitness.zzfw zza2 = com.google.android.gms.internal.fitness.zzfw.zza(zza, com.google.android.gms.internal.fitness.zzfw.UNKNOWN);
            com.google.android.gms.common.internal.Preconditions.checkArgument(!(zza2.zzb() && !zza2.equals(com.google.android.gms.internal.fitness.zzfw.SLEEP)), "Unsupported session activity type %s.", java.lang.Integer.valueOf(zza));
            this.zzf = zza;
            return this;
        }

        public com.google.android.gms.fitness.data.Session.Builder setDescription(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(str.length() <= 1000, "Session description cannot exceed %d characters", 1000);
            this.zze = str;
            return this;
        }

        public com.google.android.gms.fitness.data.Session.Builder setEndTime(long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkState(j >= 0, "End time should be positive.");
            this.zzb = timeUnit.toMillis(j);
            return this;
        }

        public com.google.android.gms.fitness.data.Session.Builder setIdentifier(java.lang.String str) {
            boolean z = false;
            if (str != null && android.text.TextUtils.getTrimmedLength(str) > 0) {
                z = true;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z);
            this.zzd = str;
            return this;
        }

        public com.google.android.gms.fitness.data.Session.Builder setName(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(str.length() <= 100, "Session name cannot exceed %d characters", 100);
            this.zzc = str;
            return this;
        }

        public com.google.android.gms.fitness.data.Session.Builder setStartTime(long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkState(j > 0, "Start time should be positive.");
            this.zza = timeUnit.toMillis(j);
            return this;
        }
    }

    public Session(long j, long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, com.google.android.gms.fitness.data.zzb zzbVar, java.lang.Long l) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = str;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = i;
        this.zzg = zzbVar;
        this.zzh = l;
    }

    public static com.google.android.gms.fitness.data.Session extract(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        return (com.google.android.gms.fitness.data.Session) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, EXTRA_SESSION, CREATOR);
    }

    public static java.lang.String getMimeType(java.lang.String str) {
        return MIME_TYPE_PREFIX.concat(java.lang.String.valueOf(str));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.Session)) {
            return false;
        }
        com.google.android.gms.fitness.data.Session session = (com.google.android.gms.fitness.data.Session) obj;
        return this.zza == session.zza && this.zzb == session.zzb && com.google.android.gms.common.internal.Objects.equal(this.zzc, session.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, session.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, session.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzg, session.zzg) && this.zzf == session.zzf;
    }

    public long getActiveTime(java.util.concurrent.TimeUnit timeUnit) {
        java.lang.Long l = this.zzh;
        if (l != null) {
            return timeUnit.convert(l.longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        throw new java.lang.IllegalStateException("Active time is not set");
    }

    public java.lang.String getActivity() {
        return com.google.android.gms.internal.fitness.zzfv.zzb(this.zzf);
    }

    public java.lang.String getAppPackageName() {
        com.google.android.gms.fitness.data.zzb zzbVar = this.zzg;
        if (zzbVar == null) {
            return null;
        }
        return zzbVar.zzb();
    }

    public java.lang.String getDescription() {
        return this.zze;
    }

    public long getEndTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzb, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public java.lang.String getIdentifier() {
        return this.zzd;
    }

    public java.lang.String getName() {
        return this.zzc;
    }

    public long getStartTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zza, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public boolean hasActiveTime() {
        return this.zzh != null;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(this.zzb), this.zzd);
    }

    public boolean isOngoing() {
        return this.zzb == 0;
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("startTime", java.lang.Long.valueOf(this.zza)).add("endTime", java.lang.Long.valueOf(this.zzb)).add("name", this.zzc).add("identifier", this.zzd).add("description", this.zze).add("activity", java.lang.Integer.valueOf(this.zzf)).add("application", this.zzg).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getIdentifier(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getDescription(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(parcel, 9, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
