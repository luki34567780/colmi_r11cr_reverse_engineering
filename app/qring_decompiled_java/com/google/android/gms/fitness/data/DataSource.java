package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class DataSource extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final java.lang.String EXTRA_DATA_SOURCE = "vnd.google.fitness.data_source";
    public static final int TYPE_DERIVED = 1;
    public static final int TYPE_RAW = 0;
    private final com.google.android.gms.fitness.data.DataType zzc;
    private final int zzd;
    private final com.google.android.gms.fitness.data.Device zze;
    private final com.google.android.gms.fitness.data.zzb zzf;
    private final java.lang.String zzg;
    private final java.lang.String zzh;
    private static final java.lang.String zza = "RAW".toLowerCase(java.util.Locale.ROOT);
    private static final java.lang.String zzb = "DERIVED".toLowerCase(java.util.Locale.ROOT);
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.DataSource> CREATOR = new com.google.android.gms.fitness.data.zzj();

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static final class Builder {
        private com.google.android.gms.fitness.data.DataType zza;
        private com.google.android.gms.fitness.data.Device zzc;
        private com.google.android.gms.fitness.data.zzb zzd;
        private int zzb = -1;
        private java.lang.String zze = "";

        public com.google.android.gms.fitness.data.DataSource build() {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zza != null, "Must set data type");
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzb >= 0, "Must set data source type");
            return new com.google.android.gms.fitness.data.DataSource(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        public com.google.android.gms.fitness.data.DataSource.Builder setAppPackageName(android.content.Context context) {
            setAppPackageName(context.getPackageName());
            return this;
        }

        public com.google.android.gms.fitness.data.DataSource.Builder setDataType(com.google.android.gms.fitness.data.DataType dataType) {
            this.zza = dataType;
            return this;
        }

        public com.google.android.gms.fitness.data.DataSource.Builder setDevice(com.google.android.gms.fitness.data.Device device) {
            this.zzc = device;
            return this;
        }

        public com.google.android.gms.fitness.data.DataSource.Builder setStreamName(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(str != null, "Must specify a valid stream name");
            this.zze = str;
            return this;
        }

        public com.google.android.gms.fitness.data.DataSource.Builder setType(int i) {
            this.zzb = i;
            return this;
        }

        public com.google.android.gms.fitness.data.DataSource.Builder setAppPackageName(java.lang.String str) {
            this.zzd = com.google.android.gms.fitness.data.zzb.zza(str);
            return this;
        }
    }

    public DataSource(com.google.android.gms.fitness.data.DataType dataType, int i, com.google.android.gms.fitness.data.Device device, com.google.android.gms.fitness.data.zzb zzbVar, java.lang.String str) {
        this.zzc = dataType;
        this.zzd = i;
        this.zze = device;
        this.zzf = zzbVar;
        this.zzg = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(zzc(i));
        sb.append(":");
        sb.append(dataType.getName());
        if (zzbVar != null) {
            sb.append(":");
            sb.append(zzbVar.zzb());
        }
        if (device != null) {
            sb.append(":");
            sb.append(device.zza());
        }
        if (str != null) {
            sb.append(":");
            sb.append(str);
        }
        this.zzh = sb.toString();
    }

    public static com.google.android.gms.fitness.data.DataSource extract(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        return (com.google.android.gms.fitness.data.DataSource) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, EXTRA_DATA_SOURCE, CREATOR);
    }

    private static java.lang.String zzc(int i) {
        return i != 0 ? i != 1 ? zzb : zzb : zza;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.fitness.data.DataSource) {
            return this.zzh.equals(((com.google.android.gms.fitness.data.DataSource) obj).zzh);
        }
        return false;
    }

    public java.lang.String getAppPackageName() {
        com.google.android.gms.fitness.data.zzb zzbVar = this.zzf;
        if (zzbVar == null) {
            return null;
        }
        return zzbVar.zzb();
    }

    public com.google.android.gms.fitness.data.DataType getDataType() {
        return this.zzc;
    }

    public com.google.android.gms.fitness.data.Device getDevice() {
        return this.zze;
    }

    public java.lang.String getStreamIdentifier() {
        return this.zzh;
    }

    public java.lang.String getStreamName() {
        return this.zzg;
    }

    public int getType() {
        return this.zzd;
    }

    public int hashCode() {
        return this.zzh.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataSource{");
        sb.append(zzc(this.zzd));
        if (this.zzf != null) {
            sb.append(":");
            sb.append(this.zzf);
        }
        if (this.zze != null) {
            sb.append(":");
            sb.append(this.zze);
        }
        if (this.zzg != null) {
            sb.append(":");
            sb.append(this.zzg);
        }
        sb.append(":");
        sb.append(this.zzc);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getDataType(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getDevice(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getStreamName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.fitness.data.zzb zza() {
        return this.zzf;
    }

    public final java.lang.String zzb() {
        java.lang.String str;
        int i = this.zzd;
        java.lang.String str2 = i != 0 ? i != 1 ? "?" : "d" : "r";
        java.lang.String zzc = this.zzc.zzc();
        com.google.android.gms.fitness.data.zzb zzbVar = this.zzf;
        java.lang.String concat = zzbVar == null ? "" : zzbVar.equals(com.google.android.gms.fitness.data.zzb.zza) ? ":gms" : ":".concat(java.lang.String.valueOf(this.zzf.zzb()));
        com.google.android.gms.fitness.data.Device device = this.zze;
        if (device != null) {
            str = ":" + device.getModel() + ":" + device.getUid();
        } else {
            str = "";
        }
        java.lang.String str3 = this.zzg;
        return str2 + ":" + zzc + concat + str + (str3 != null ? ":".concat(str3) : "");
    }
}
