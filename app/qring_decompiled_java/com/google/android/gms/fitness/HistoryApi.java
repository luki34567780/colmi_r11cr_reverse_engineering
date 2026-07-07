package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public interface HistoryApi {

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class ViewIntentBuilder {
        private final android.content.Context zza;
        private final com.google.android.gms.fitness.data.DataType zzb;
        private com.google.android.gms.fitness.data.DataSource zzc;
        private long zzd;
        private long zze;
        private java.lang.String zzf;

        public ViewIntentBuilder(android.content.Context context, com.google.android.gms.fitness.data.DataType dataType) {
            this.zza = context;
            this.zzb = dataType;
        }

        public android.content.Intent build() {
            android.content.Intent intent;
            android.content.pm.ResolveInfo resolveActivity;
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzd > 0, "Start time must be set");
            com.google.android.gms.common.internal.Preconditions.checkState(this.zze > this.zzd, "End time must be set and after start time");
            android.content.Intent intent2 = new android.content.Intent(com.google.android.gms.fitness.Fitness.ACTION_VIEW);
            intent2.setType(com.google.android.gms.fitness.data.DataType.getMimeType(this.zzc.getDataType()));
            intent2.putExtra(com.google.android.gms.fitness.Fitness.EXTRA_START_TIME, this.zzd);
            intent2.putExtra(com.google.android.gms.fitness.Fitness.EXTRA_END_TIME, this.zze);
            com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(this.zzc, intent2, com.google.android.gms.fitness.data.DataSource.EXTRA_DATA_SOURCE);
            if (this.zzf == null || (resolveActivity = this.zza.getPackageManager().resolveActivity((intent = new android.content.Intent(intent2).setPackage(this.zzf)), 0)) == null) {
                return intent2;
            }
            intent.setComponent(new android.content.ComponentName(this.zzf, resolveActivity.activityInfo.name));
            return intent;
        }

        public com.google.android.gms.fitness.HistoryApi.ViewIntentBuilder setDataSource(com.google.android.gms.fitness.data.DataSource dataSource) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataSource.getDataType().equals(this.zzb), "Data source %s is not for the data type %s", dataSource, this.zzb);
            this.zzc = dataSource;
            return this;
        }

        public com.google.android.gms.fitness.HistoryApi.ViewIntentBuilder setPreferredApplication(java.lang.String str) {
            this.zzf = str;
            return this;
        }

        public com.google.android.gms.fitness.HistoryApi.ViewIntentBuilder setTimeInterval(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            this.zzd = timeUnit.toMillis(j);
            this.zze = timeUnit.toMillis(j2);
            return this;
        }
    }

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> deleteData(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataDeleteRequest dataDeleteRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> insertData(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataSet dataSet);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DailyTotalResult> readDailyTotal(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DailyTotalResult> readDailyTotalFromLocalDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DataReadResult> readData(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataReadRequest dataReadRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> registerDataUpdateListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unregisterDataUpdateListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> updateData(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataUpdateRequest dataUpdateRequest);
}
