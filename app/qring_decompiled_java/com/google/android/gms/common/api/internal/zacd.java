package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zacd<T> implements com.google.android.gms.tasks.OnCompleteListener<T> {
    private final com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final int zab;
    private final com.google.android.gms.common.api.internal.ApiKey<?> zac;
    private final long zad;
    private final long zae;

    zacd(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, int i, com.google.android.gms.common.api.internal.ApiKey<?> apiKey, long j, long j2, java.lang.String str, java.lang.String str2) {
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j;
        this.zae = j2;
    }

    static <T> com.google.android.gms.common.api.internal.zacd<T> zaa(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, int i, com.google.android.gms.common.api.internal.ApiKey<?> apiKey) {
        boolean z;
        if (!googleApiManager.zaF()) {
            return null;
        }
        com.google.android.gms.common.internal.RootTelemetryConfiguration config = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().getConfig();
        if (config == null) {
            z = true;
        } else {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            z = config.getMethodTimingTelemetryEnabled();
            com.google.android.gms.common.api.internal.zabq zak = googleApiManager.zak(apiKey);
            if (zak != null) {
                if (!(zak.zaf() instanceof com.google.android.gms.common.internal.BaseGmsClient)) {
                    return null;
                }
                com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = (com.google.android.gms.common.internal.BaseGmsClient) zak.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    com.google.android.gms.common.internal.ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, i);
                    if (zab == null) {
                        return null;
                    }
                    zak.zaq();
                    z = zab.getMethodTimingTelemetryEnabled();
                }
            }
        }
        return new com.google.android.gms.common.api.internal.zacd<>(googleApiManager, i, apiKey, z ? java.lang.System.currentTimeMillis() : 0L, z ? android.os.SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration zab(com.google.android.gms.common.api.internal.zabq<?> zabqVar, com.google.android.gms.common.internal.BaseGmsClient<?> baseGmsClient, int i) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        com.google.android.gms.common.internal.ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !com.google.android.gms.common.util.ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !com.google.android.gms.common.util.ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i))) || zabqVar.zac() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(com.google.android.gms.tasks.Task<T> task) {
        com.google.android.gms.common.api.internal.zabq zak;
        int i;
        int i2;
        int i3;
        int i4;
        int errorCode;
        long j;
        long j2;
        int i5;
        if (this.zaa.zaF()) {
            com.google.android.gms.common.internal.RootTelemetryConfiguration config = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zak = this.zaa.zak(this.zac)) != null && (zak.zaf() instanceof com.google.android.gms.common.internal.BaseGmsClient)) {
                com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = (com.google.android.gms.common.internal.BaseGmsClient) zak.zaf();
                boolean z = this.zad > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                if (config != null) {
                    z &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        com.google.android.gms.common.internal.ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, this.zab);
                        if (zab == null) {
                            return;
                        }
                        boolean z2 = zab.getMethodTimingTelemetryEnabled() && this.zad > 0;
                        maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                        z = z2;
                    }
                    i2 = batchPeriodMillis;
                    i3 = maxMethodInvocationsInBatch;
                } else {
                    i = 0;
                    i2 = com.google.android.gms.fitness.FitnessStatusCodes.NEEDS_OAUTH_PERMISSIONS;
                    i3 = 100;
                }
                com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
                if (task.isSuccessful()) {
                    i4 = 0;
                    errorCode = 0;
                } else {
                    if (task.isCanceled()) {
                        i4 = 100;
                    } else {
                        java.lang.Exception exception = task.getException();
                        if (exception instanceof com.google.android.gms.common.api.ApiException) {
                            com.google.android.gms.common.api.Status status = ((com.google.android.gms.common.api.ApiException) exception).getStatus();
                            int statusCode = status.getStatusCode();
                            com.google.android.gms.common.ConnectionResult connectionResult = status.getConnectionResult();
                            errorCode = connectionResult == null ? -1 : connectionResult.getErrorCode();
                            i4 = statusCode;
                        } else {
                            i4 = 101;
                        }
                    }
                    errorCode = -1;
                }
                if (z) {
                    long j3 = this.zad;
                    j2 = java.lang.System.currentTimeMillis();
                    j = j3;
                    i5 = (int) (android.os.SystemClock.elapsedRealtime() - this.zae);
                } else {
                    j = 0;
                    j2 = 0;
                    i5 = -1;
                }
                googleApiManager.zay(new com.google.android.gms.common.internal.MethodInvocation(this.zab, i4, errorCode, j, j2, null, null, gCoreServiceId, i5), i, i2, i3);
            }
        }
    }
}
