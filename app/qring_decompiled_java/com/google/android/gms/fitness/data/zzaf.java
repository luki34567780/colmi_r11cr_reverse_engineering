package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzaf {
    private com.google.android.gms.fitness.data.DataSource zza;
    private com.google.android.gms.fitness.data.DataType zzb;

    public final com.google.android.gms.fitness.data.zzaf zza(com.google.android.gms.fitness.data.DataSource dataSource) {
        this.zza = dataSource;
        return this;
    }

    public final com.google.android.gms.fitness.data.zzaf zzb(com.google.android.gms.fitness.data.DataType dataType) {
        this.zzb = dataType;
        return this;
    }

    public final com.google.android.gms.fitness.data.Subscription zzc() {
        com.google.android.gms.fitness.data.DataSource dataSource;
        com.google.android.gms.common.internal.Preconditions.checkState((this.zza == null && this.zzb == null) ? false : true, "Must call setDataSource() or setDataType()");
        com.google.android.gms.fitness.data.DataType dataType = this.zzb;
        com.google.android.gms.common.internal.Preconditions.checkState(dataType == null || (dataSource = this.zza) == null || dataType.equals(dataSource.getDataType()), "Specified data type is incompatible with specified data source");
        return new com.google.android.gms.fitness.data.Subscription(this.zza, this.zzb, -1L, 2, 0);
    }
}
