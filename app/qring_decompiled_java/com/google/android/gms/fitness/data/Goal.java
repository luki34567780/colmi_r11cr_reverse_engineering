package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class Goal extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Goal> CREATOR = new com.google.android.gms.fitness.data.zzs();
    public static final int OBJECTIVE_TYPE_DURATION = 2;
    public static final int OBJECTIVE_TYPE_FREQUENCY = 3;
    public static final int OBJECTIVE_TYPE_METRIC = 1;
    private final long zza;
    private final long zzb;
    private final java.util.List zzc;
    private final com.google.android.gms.fitness.data.Goal.Recurrence zzd;
    private final int zze;
    private final com.google.android.gms.fitness.data.Goal.MetricObjective zzf;
    private final com.google.android.gms.fitness.data.Goal.DurationObjective zzg;
    private final com.google.android.gms.fitness.data.Goal.FrequencyObjective zzh;

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class DurationObjective extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Goal.DurationObjective> CREATOR = new com.google.android.gms.fitness.data.zzp();
        private final long zza;

        DurationObjective(long j) {
            this.zza = j;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof com.google.android.gms.fitness.data.Goal.DurationObjective) && this.zza == ((com.google.android.gms.fitness.data.Goal.DurationObjective) obj).zza;
        }

        public long getDuration(java.util.concurrent.TimeUnit timeUnit) {
            return timeUnit.convert(this.zza, java.util.concurrent.TimeUnit.NANOSECONDS);
        }

        public int hashCode() {
            return (int) this.zza;
        }

        public java.lang.String toString() {
            return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("duration", java.lang.Long.valueOf(this.zza)).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zza);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        public DurationObjective(long j, java.util.concurrent.TimeUnit timeUnit) {
            this.zza = timeUnit.toNanos(j);
        }
    }

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class FrequencyObjective extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Goal.FrequencyObjective> CREATOR = new com.google.android.gms.fitness.data.zzr();
        private final int zza;

        public FrequencyObjective(int i) {
            this.zza = i;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof com.google.android.gms.fitness.data.Goal.FrequencyObjective) && this.zza == ((com.google.android.gms.fitness.data.Goal.FrequencyObjective) obj).zza;
        }

        public int getFrequency() {
            return this.zza;
        }

        public int hashCode() {
            return this.zza;
        }

        public java.lang.String toString() {
            return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("frequency", java.lang.Integer.valueOf(this.zza)).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getFrequency());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class MetricObjective extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Goal.MetricObjective> CREATOR = new com.google.android.gms.fitness.data.zzx();
        private final java.lang.String zza;
        private final double zzb;
        private final double zzc;

        public MetricObjective(java.lang.String str, double d) {
            this(str, d, 0.0d);
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.fitness.data.Goal.MetricObjective)) {
                return false;
            }
            com.google.android.gms.fitness.data.Goal.MetricObjective metricObjective = (com.google.android.gms.fitness.data.Goal.MetricObjective) obj;
            return com.google.android.gms.common.internal.Objects.equal(this.zza, metricObjective.zza) && this.zzb == metricObjective.zzb && this.zzc == metricObjective.zzc;
        }

        public java.lang.String getDataTypeName() {
            return this.zza;
        }

        public double getValue() {
            return this.zzb;
        }

        public int hashCode() {
            return this.zza.hashCode();
        }

        public java.lang.String toString() {
            return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataTypeName", this.zza).add("value", java.lang.Double.valueOf(this.zzb)).add("initialValue", java.lang.Double.valueOf(this.zzc)).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getDataTypeName(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 2, getValue());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 3, this.zzc);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        public MetricObjective(java.lang.String str, double d, double d2) {
            this.zza = str;
            this.zzb = d;
            this.zzc = d2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class MismatchedGoalException extends java.lang.IllegalStateException {
        public MismatchedGoalException(java.lang.String str) {
            super(str);
        }
    }

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ObjectiveType {
    }

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class Recurrence extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Goal.Recurrence> CREATOR = new com.google.android.gms.fitness.data.zzab();
        public static final int UNIT_DAY = 1;
        public static final int UNIT_MONTH = 3;
        public static final int UNIT_WEEK = 2;
        private final int zza;
        private final int zzb;

        /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface RecurrenceUnit {
        }

        public Recurrence(int i, int i2) {
            this.zza = i;
            boolean z = false;
            if (i2 > 0 && i2 <= 3) {
                z = true;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z);
            this.zzb = i2;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.fitness.data.Goal.Recurrence)) {
                return false;
            }
            com.google.android.gms.fitness.data.Goal.Recurrence recurrence = (com.google.android.gms.fitness.data.Goal.Recurrence) obj;
            return this.zza == recurrence.zza && this.zzb == recurrence.zzb;
        }

        public int getCount() {
            return this.zza;
        }

        public int getUnit() {
            return this.zzb;
        }

        public int hashCode() {
            return this.zzb;
        }

        public java.lang.String toString() {
            java.lang.String str;
            com.google.android.gms.common.internal.Objects.ToStringHelper add = com.google.android.gms.common.internal.Objects.toStringHelper(this).add("count", java.lang.Integer.valueOf(this.zza));
            int i = this.zzb;
            if (i == 1) {
                str = "day";
            } else if (i == 2) {
                str = "week";
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalArgumentException("invalid unit value");
                }
                str = "month";
            }
            return add.add("unit", str).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getCount());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getUnit());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    Goal(long j, long j2, java.util.List list, com.google.android.gms.fitness.data.Goal.Recurrence recurrence, int i, com.google.android.gms.fitness.data.Goal.MetricObjective metricObjective, com.google.android.gms.fitness.data.Goal.DurationObjective durationObjective, com.google.android.gms.fitness.data.Goal.FrequencyObjective frequencyObjective) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = list;
        this.zzd = recurrence;
        this.zze = i;
        this.zzf = metricObjective;
        this.zzg = durationObjective;
        this.zzh = frequencyObjective;
    }

    private static java.lang.String zza(int i) {
        if (i == 0) {
            return com.google.android.gms.fitness.FitnessActivities.UNKNOWN;
        }
        if (i == 1) {
            return "metric";
        }
        if (i == 2) {
            return "duration";
        }
        if (i == 3) {
            return "frequency";
        }
        throw new java.lang.IllegalArgumentException("invalid objective type value");
    }

    private final void zzb(int i) {
        int i2 = this.zze;
        if (i != i2) {
            throw new com.google.android.gms.fitness.data.Goal.MismatchedGoalException(java.lang.String.format("%s goal does not have %s objective", zza(i2), zza(i)));
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.Goal)) {
            return false;
        }
        com.google.android.gms.fitness.data.Goal goal = (com.google.android.gms.fitness.data.Goal) obj;
        return this.zza == goal.zza && this.zzb == goal.zzb && com.google.android.gms.common.internal.Objects.equal(this.zzc, goal.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, goal.zzd) && this.zze == goal.zze && com.google.android.gms.common.internal.Objects.equal(this.zzf, goal.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzg, goal.zzg) && com.google.android.gms.common.internal.Objects.equal(this.zzh, goal.zzh);
    }

    public java.lang.String getActivityName() {
        if (this.zzc.isEmpty() || this.zzc.size() > 1) {
            return null;
        }
        return com.google.android.gms.internal.fitness.zzfv.zzb(((java.lang.Integer) this.zzc.get(0)).intValue());
    }

    public long getCreateTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zza, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public com.google.android.gms.fitness.data.Goal.DurationObjective getDurationObjective() {
        zzb(2);
        return this.zzg;
    }

    public long getEndTime(java.util.Calendar calendar, java.util.concurrent.TimeUnit timeUnit) {
        if (this.zzd == null) {
            return timeUnit.convert(this.zzb, java.util.concurrent.TimeUnit.NANOSECONDS);
        }
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTime(calendar.getTime());
        int i = this.zzd.zzb;
        if (i == 1) {
            calendar2.add(5, 1);
            calendar2.set(11, 0);
            return timeUnit.convert(calendar2.getTimeInMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        if (i == 2) {
            calendar2.add(4, 1);
            calendar2.set(7, 2);
            calendar2.set(11, 0);
            return timeUnit.convert(calendar2.getTimeInMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        if (i == 3) {
            calendar2.add(2, 1);
            calendar2.set(5, 1);
            calendar2.set(11, 0);
            return timeUnit.convert(calendar2.getTimeInMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        throw new java.lang.IllegalArgumentException("Invalid unit " + this.zzd.zzb);
    }

    public com.google.android.gms.fitness.data.Goal.FrequencyObjective getFrequencyObjective() {
        zzb(3);
        return this.zzh;
    }

    public com.google.android.gms.fitness.data.Goal.MetricObjective getMetricObjective() {
        zzb(1);
        return this.zzf;
    }

    public int getObjectiveType() {
        return this.zze;
    }

    public com.google.android.gms.fitness.data.Goal.Recurrence getRecurrence() {
        return this.zzd;
    }

    public long getStartTime(java.util.Calendar calendar, java.util.concurrent.TimeUnit timeUnit) {
        if (this.zzd == null) {
            return timeUnit.convert(this.zza, java.util.concurrent.TimeUnit.NANOSECONDS);
        }
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTime(calendar.getTime());
        int i = this.zzd.zzb;
        if (i == 1) {
            calendar2.set(11, 0);
            return timeUnit.convert(calendar2.getTimeInMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        if (i == 2) {
            calendar2.set(7, 2);
            calendar2.set(11, 0);
            return timeUnit.convert(calendar2.getTimeInMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        if (i == 3) {
            calendar2.set(5, 1);
            calendar2.set(11, 0);
            return timeUnit.convert(calendar2.getTimeInMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        throw new java.lang.IllegalArgumentException("Invalid unit " + this.zzd.zzb);
    }

    public int hashCode() {
        return this.zze;
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("activity", getActivityName()).add("recurrence", this.zzd).add("metricObjective", this.zzf).add("durationObjective", this.zzg).add("frequencyObjective", this.zzh).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeList(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getRecurrence(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, getObjectiveType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
