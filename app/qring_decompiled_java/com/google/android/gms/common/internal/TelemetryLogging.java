package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public class TelemetryLogging {
    private TelemetryLogging() {
    }

    public static com.google.android.gms.common.internal.TelemetryLoggingClient getClient(android.content.Context context) {
        return getClient(context, com.google.android.gms.common.internal.TelemetryLoggingOptions.zaa);
    }

    public static com.google.android.gms.common.internal.TelemetryLoggingClient getClient(android.content.Context context, com.google.android.gms.common.internal.TelemetryLoggingOptions telemetryLoggingOptions) {
        return new com.google.android.gms.common.internal.service.zao(context, telemetryLoggingOptions);
    }
}
