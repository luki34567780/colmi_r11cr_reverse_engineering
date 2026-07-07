package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class RootTelemetryConfigManager {
    private static com.google.android.gms.common.internal.RootTelemetryConfigManager zza;
    private static final com.google.android.gms.common.internal.RootTelemetryConfiguration zzb = new com.google.android.gms.common.internal.RootTelemetryConfiguration(0, false, false, 0, 0);
    private com.google.android.gms.common.internal.RootTelemetryConfiguration zzc;

    private RootTelemetryConfigManager() {
    }

    public static synchronized com.google.android.gms.common.internal.RootTelemetryConfigManager getInstance() {
        com.google.android.gms.common.internal.RootTelemetryConfigManager rootTelemetryConfigManager;
        synchronized (com.google.android.gms.common.internal.RootTelemetryConfigManager.class) {
            if (zza == null) {
                zza = new com.google.android.gms.common.internal.RootTelemetryConfigManager();
            }
            rootTelemetryConfigManager = zza;
        }
        return rootTelemetryConfigManager;
    }

    public com.google.android.gms.common.internal.RootTelemetryConfiguration getConfig() {
        return this.zzc;
    }

    public final synchronized void zza(com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.zzc = zzb;
            return;
        }
        com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration2 = this.zzc;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.getVersion() < rootTelemetryConfiguration.getVersion()) {
            this.zzc = rootTelemetryConfiguration;
        }
    }
}
