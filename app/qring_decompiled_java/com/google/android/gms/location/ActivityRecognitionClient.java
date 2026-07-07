package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class ActivityRecognitionClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    public static final /* synthetic */ int zza = 0;

    public ActivityRecognitionClient(android.app.Activity activity) {
        super(activity, com.google.android.gms.location.LocationServices.API, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeActivityTransitionUpdates(final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzd
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                android.app.PendingIntent pendingIntent2 = pendingIntent;
                int i = com.google.android.gms.location.ActivityRecognitionClient.zza;
                com.google.android.gms.location.zzj zzjVar = new com.google.android.gms.location.zzj((com.google.android.gms.tasks.TaskCompletionSource) obj2);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjVar, "ResultHolder not provided.");
                ((com.google.android.gms.internal.location.zzam) ((com.google.android.gms.internal.location.zzbe) obj).getService()).zzk(pendingIntent2, new com.google.android.gms.common.api.internal.StatusCallback(zzjVar));
            }
        }).setMethodKey(2406).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeActivityUpdates(final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zze
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                android.app.PendingIntent pendingIntent2 = pendingIntent;
                int i = com.google.android.gms.location.ActivityRecognitionClient.zza;
                ((com.google.android.gms.internal.location.zzbe) obj).zzv(pendingIntent2);
                ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(2402).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeSleepSegmentUpdates(final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzf
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                android.app.PendingIntent pendingIntent2 = pendingIntent;
                int i = com.google.android.gms.location.ActivityRecognitionClient.zza;
                com.google.android.gms.location.zzj zzjVar = new com.google.android.gms.location.zzj((com.google.android.gms.tasks.TaskCompletionSource) obj2);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent2, "PendingIntent must be specified.");
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjVar, "ResultHolder not provided.");
                ((com.google.android.gms.internal.location.zzam) ((com.google.android.gms.internal.location.zzbe) obj).getService()).zzp(pendingIntent2, new com.google.android.gms.common.api.internal.StatusCallback(zzjVar));
            }
        }).setMethodKey(2411).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> requestActivityTransitionUpdates(final com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, final android.app.PendingIntent pendingIntent) {
        activityTransitionRequest.zza(getContextAttributionTag());
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzc
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest2 = com.google.android.gms.location.ActivityTransitionRequest.this;
                android.app.PendingIntent pendingIntent2 = pendingIntent;
                int i = com.google.android.gms.location.ActivityRecognitionClient.zza;
                com.google.android.gms.location.zzj zzjVar = new com.google.android.gms.location.zzj((com.google.android.gms.tasks.TaskCompletionSource) obj2);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(activityTransitionRequest2, "activityTransitionRequest must be specified.");
                com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent2, "PendingIntent must be specified.");
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjVar, "ResultHolder not provided.");
                ((com.google.android.gms.internal.location.zzam) ((com.google.android.gms.internal.location.zzbe) obj).getService()).zzq(activityTransitionRequest2, pendingIntent2, new com.google.android.gms.common.api.internal.StatusCallback(zzjVar));
            }
        }).setMethodKey(2405).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> requestActivityUpdates(long j, final android.app.PendingIntent pendingIntent) {
        com.google.android.gms.location.zzk zzkVar = new com.google.android.gms.location.zzk();
        zzkVar.zza(j);
        final com.google.android.gms.location.zzl zzb = zzkVar.zzb();
        zzb.zza(getContextAttributionTag());
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzh
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.location.zzl zzlVar = com.google.android.gms.location.zzl.this;
                android.app.PendingIntent pendingIntent2 = pendingIntent;
                int i = com.google.android.gms.location.ActivityRecognitionClient.zza;
                com.google.android.gms.location.zzj zzjVar = new com.google.android.gms.location.zzj((com.google.android.gms.tasks.TaskCompletionSource) obj2);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzlVar, "ActivityRecognitionRequest can't be null.");
                com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent2, "PendingIntent must be specified.");
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjVar, "ResultHolder not provided.");
                ((com.google.android.gms.internal.location.zzam) ((com.google.android.gms.internal.location.zzbe) obj).getService()).zzs(zzlVar, pendingIntent2, new com.google.android.gms.common.api.internal.StatusCallback(zzjVar));
            }
        }).setMethodKey(2401).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> requestSleepSegmentUpdates(final android.app.PendingIntent pendingIntent, final com.google.android.gms.location.SleepSegmentRequest sleepSegmentRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.location.zzg
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.location.ActivityRecognitionClient activityRecognitionClient = com.google.android.gms.location.ActivityRecognitionClient.this;
                ((com.google.android.gms.internal.location.zzam) ((com.google.android.gms.internal.location.zzbe) obj).getService()).zzt(pendingIntent, sleepSegmentRequest, new com.google.android.gms.location.zzi(activityRecognitionClient, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setFeatures(com.google.android.gms.location.zzy.zzb).setMethodKey(2410).build());
    }

    public ActivityRecognitionClient(android.content.Context context) {
        super(context, com.google.android.gms.location.LocationServices.API, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
