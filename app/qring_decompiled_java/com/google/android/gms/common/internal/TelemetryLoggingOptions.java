package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public class TelemetryLoggingOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    public static final com.google.android.gms.common.internal.TelemetryLoggingOptions zaa = builder().build();
    private final java.lang.String zab;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class Builder {
        private java.lang.String zaa;

        private Builder() {
        }

        /* synthetic */ Builder(com.google.android.gms.common.internal.zaac zaacVar) {
        }

        public com.google.android.gms.common.internal.TelemetryLoggingOptions build() {
            return new com.google.android.gms.common.internal.TelemetryLoggingOptions(this.zaa, null);
        }

        public com.google.android.gms.common.internal.TelemetryLoggingOptions.Builder setApi(java.lang.String str) {
            this.zaa = str;
            return this;
        }
    }

    /* synthetic */ TelemetryLoggingOptions(java.lang.String str, com.google.android.gms.common.internal.zaad zaadVar) {
        this.zab = str;
    }

    public static com.google.android.gms.common.internal.TelemetryLoggingOptions.Builder builder() {
        return new com.google.android.gms.common.internal.TelemetryLoggingOptions.Builder(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.common.internal.TelemetryLoggingOptions) {
            return com.google.android.gms.common.internal.Objects.equal(this.zab, ((com.google.android.gms.common.internal.TelemetryLoggingOptions) obj).zab);
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zab);
    }

    public final android.os.Bundle zaa() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = this.zab;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
