package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class Fitness {
    public static final java.lang.String ACTION_TRACK = "vnd.google.fitness.TRACK";
    public static final java.lang.String ACTION_VIEW = "vnd.google.fitness.VIEW";
    public static final java.lang.String ACTION_VIEW_GOAL = "vnd.google.fitness.VIEW_GOAL";

    @java.lang.Deprecated
    public static final java.lang.Void API = null;

    @java.lang.Deprecated
    public static final com.google.android.gms.fitness.BleApi BleApi;
    public static final java.lang.String EXTRA_END_TIME = "vnd.google.fitness.end_time";
    public static final java.lang.String EXTRA_START_TIME = "vnd.google.fitness.start_time";
    public static final com.google.android.gms.common.api.Scope SCOPE_ACTIVITY_READ;
    public static final com.google.android.gms.common.api.Scope SCOPE_ACTIVITY_READ_WRITE;
    public static final com.google.android.gms.common.api.Scope SCOPE_BODY_READ;
    public static final com.google.android.gms.common.api.Scope SCOPE_BODY_READ_WRITE;
    public static final com.google.android.gms.common.api.Scope SCOPE_LOCATION_READ;
    public static final com.google.android.gms.common.api.Scope SCOPE_LOCATION_READ_WRITE;
    public static final com.google.android.gms.common.api.Scope SCOPE_NUTRITION_READ;
    public static final com.google.android.gms.common.api.Scope SCOPE_NUTRITION_READ_WRITE;
    public static final com.google.android.gms.common.api.Scope zza;
    public static final com.google.android.gms.common.api.Scope zzb;
    public static final com.google.android.gms.common.api.Scope zzc;
    public static final com.google.android.gms.common.api.Scope zzd;
    public static final com.google.android.gms.common.api.Scope zze;
    public static final com.google.android.gms.common.api.Scope zzf;
    public static final com.google.android.gms.auth.api.signin.GoogleSignInAccount zzg;

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> SENSORS_API = com.google.android.gms.internal.fitness.zzaz.zzf;

    @java.lang.Deprecated
    public static final com.google.android.gms.fitness.SensorsApi SensorsApi = new com.google.android.gms.internal.fitness.zzee();

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> RECORDING_API = com.google.android.gms.internal.fitness.zzar.zzf;

    @java.lang.Deprecated
    public static final com.google.android.gms.fitness.RecordingApi RecordingApi = new com.google.android.gms.internal.fitness.zzea();

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> SESSIONS_API = com.google.android.gms.internal.fitness.zzbh.zzf;

    @java.lang.Deprecated
    public static final com.google.android.gms.fitness.SessionsApi SessionsApi = new com.google.android.gms.internal.fitness.zzep();

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> HISTORY_API = com.google.android.gms.internal.fitness.zzaj.zzf;

    @java.lang.Deprecated
    public static final com.google.android.gms.fitness.HistoryApi HistoryApi = new com.google.android.gms.internal.fitness.zzds();

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> GOALS_API = com.google.android.gms.internal.fitness.zzab.zzf;

    @java.lang.Deprecated
    public static final com.google.android.gms.fitness.GoalsApi GoalsApi = new com.google.android.gms.internal.fitness.zzdh();

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> CONFIG_API = com.google.android.gms.internal.fitness.zzu.zzf;

    @java.lang.Deprecated
    public static final com.google.android.gms.fitness.ConfigApi ConfigApi = new com.google.android.gms.internal.fitness.zzde();

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> BLE_API = com.google.android.gms.internal.fitness.zzm.zzf;

    static {
        BleApi = android.os.Build.VERSION.SDK_INT >= 18 ? new com.google.android.gms.internal.fitness.zzcy() : new com.google.android.gms.internal.fitness.zzet();
        SCOPE_ACTIVITY_READ = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/fitness.activity.read");
        SCOPE_ACTIVITY_READ_WRITE = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/fitness.activity.write");
        SCOPE_LOCATION_READ = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/fitness.location.read");
        SCOPE_LOCATION_READ_WRITE = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/fitness.location.write");
        SCOPE_BODY_READ = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/fitness.body.read");
        SCOPE_BODY_READ_WRITE = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/fitness.body.write");
        SCOPE_NUTRITION_READ = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/fitness.nutrition.read");
        SCOPE_NUTRITION_READ_WRITE = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/fitness.nutrition.write");
        zza = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/fitness.heart_rate.read");
        zzb = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/fitness.heart_rate.write");
        zzc = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/fitness.respiratory_rate.read");
        zzd = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/fitness.respiratory_rate.write");
        zze = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/fitness.sleep.read");
        zzf = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/fitness.sleep.write");
        zzg = com.google.android.gms.auth.api.signin.GoogleSignInAccount.fromAccount(new android.accounts.Account("none", "com.google"));
    }

    private Fitness() {
    }

    @java.lang.Deprecated
    public static com.google.android.gms.fitness.BleClient getBleClient(android.app.Activity activity, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        return new com.google.android.gms.fitness.BleClient(activity, (com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) new com.google.android.gms.fitness.zzi(activity, googleSignInAccount));
    }

    @java.lang.Deprecated
    public static com.google.android.gms.fitness.ConfigClient getConfigClient(android.app.Activity activity, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        return new com.google.android.gms.fitness.ConfigClient(activity, (com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) new com.google.android.gms.fitness.zzi(activity, googleSignInAccount));
    }

    public static long getEndTime(android.content.Intent intent, java.util.concurrent.TimeUnit timeUnit) {
        long longExtra = intent.getLongExtra(EXTRA_END_TIME, -1L);
        if (longExtra == -1) {
            return -1L;
        }
        return timeUnit.convert(longExtra, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @java.lang.Deprecated
    public static com.google.android.gms.fitness.GoalsClient getGoalsClient(android.app.Activity activity, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        return new com.google.android.gms.fitness.GoalsClient(activity, (com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) new com.google.android.gms.fitness.zzi(activity, googleSignInAccount));
    }

    @java.lang.Deprecated
    public static com.google.android.gms.fitness.HistoryClient getHistoryClient(android.app.Activity activity, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        return new com.google.android.gms.fitness.HistoryClient(activity, (com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) new com.google.android.gms.fitness.zzi(activity, googleSignInAccount));
    }

    public static com.google.android.gms.fitness.RecordingClient getRecordingClient(android.app.Activity activity, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        return new com.google.android.gms.fitness.RecordingClient(activity, (com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) new com.google.android.gms.fitness.zzi(activity, googleSignInAccount));
    }

    @java.lang.Deprecated
    public static com.google.android.gms.fitness.SensorsClient getSensorsClient(android.app.Activity activity, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        return new com.google.android.gms.fitness.SensorsClient(activity, (com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) new com.google.android.gms.fitness.zzi(activity, googleSignInAccount));
    }

    @java.lang.Deprecated
    public static com.google.android.gms.fitness.SessionsClient getSessionsClient(android.app.Activity activity, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        return new com.google.android.gms.fitness.SessionsClient(activity, (com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) new com.google.android.gms.fitness.zzi(activity, googleSignInAccount));
    }

    public static long getStartTime(android.content.Intent intent, java.util.concurrent.TimeUnit timeUnit) {
        long longExtra = intent.getLongExtra(EXTRA_START_TIME, -1L);
        if (longExtra == -1) {
            return -1L;
        }
        return timeUnit.convert(longExtra, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @java.lang.Deprecated
    public static com.google.android.gms.fitness.BleClient getBleClient(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        return new com.google.android.gms.fitness.BleClient(context, new com.google.android.gms.fitness.zzi(context, googleSignInAccount));
    }

    @java.lang.Deprecated
    public static com.google.android.gms.fitness.ConfigClient getConfigClient(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        return new com.google.android.gms.fitness.ConfigClient(context, new com.google.android.gms.fitness.zzi(context, googleSignInAccount));
    }

    @java.lang.Deprecated
    public static com.google.android.gms.fitness.GoalsClient getGoalsClient(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        return new com.google.android.gms.fitness.GoalsClient(context, new com.google.android.gms.fitness.zzi(context, googleSignInAccount));
    }

    @java.lang.Deprecated
    public static com.google.android.gms.fitness.HistoryClient getHistoryClient(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        return new com.google.android.gms.fitness.HistoryClient(context, new com.google.android.gms.fitness.zzi(context, googleSignInAccount));
    }

    public static com.google.android.gms.fitness.RecordingClient getRecordingClient(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        return new com.google.android.gms.fitness.RecordingClient(context, new com.google.android.gms.fitness.zzi(context, googleSignInAccount));
    }

    @java.lang.Deprecated
    public static com.google.android.gms.fitness.SensorsClient getSensorsClient(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        return new com.google.android.gms.fitness.SensorsClient(context, new com.google.android.gms.fitness.zzi(context, googleSignInAccount));
    }

    @java.lang.Deprecated
    public static com.google.android.gms.fitness.SessionsClient getSessionsClient(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        return new com.google.android.gms.fitness.SessionsClient(context, new com.google.android.gms.fitness.zzi(context, googleSignInAccount));
    }
}
