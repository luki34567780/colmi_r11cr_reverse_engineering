package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public interface SessionsApi {

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class ViewIntentBuilder {
        private final android.content.Context zza;
        private com.google.android.gms.fitness.data.Session zzb;
        private java.lang.String zzc;
        private boolean zzd = false;

        public ViewIntentBuilder(android.content.Context context) {
            this.zza = context;
        }

        public android.content.Intent build() {
            android.content.Intent intent;
            android.content.pm.ResolveInfo resolveActivity;
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzb != null, "Session must be set");
            android.content.Intent intent2 = new android.content.Intent(com.google.android.gms.fitness.Fitness.ACTION_VIEW);
            intent2.setType(com.google.android.gms.fitness.data.Session.getMimeType(this.zzb.getActivity()));
            com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(this.zzb, intent2, com.google.android.gms.fitness.data.Session.EXTRA_SESSION);
            if (!this.zzd) {
                this.zzc = this.zzb.getAppPackageName();
            }
            java.lang.String str = this.zzc;
            if (str == null || (resolveActivity = this.zza.getPackageManager().resolveActivity((intent = new android.content.Intent(intent2).setPackage(str)), 0)) == null) {
                return intent2;
            }
            intent.setComponent(new android.content.ComponentName(str, resolveActivity.activityInfo.name));
            return intent;
        }

        public com.google.android.gms.fitness.SessionsApi.ViewIntentBuilder setPreferredApplication(java.lang.String str) {
            this.zzc = str;
            this.zzd = true;
            return this;
        }

        public com.google.android.gms.fitness.SessionsApi.ViewIntentBuilder setSession(com.google.android.gms.fitness.data.Session session) {
            this.zzb = session;
            return this;
        }
    }

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> insertSession(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SessionInsertRequest sessionInsertRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.SessionReadResult> readSession(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SessionReadRequest sessionReadRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> registerForSessions(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> startSession(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.Session session);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.SessionStopResult> stopSession(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unregisterForSessions(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent);
}
