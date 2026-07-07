package com.google.android.gms.auth.api.credentials;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public final class CredentialsOptions extends com.google.android.gms.auth.api.Auth.AuthCredentialsOptions {
    public static final com.google.android.gms.auth.api.credentials.CredentialsOptions DEFAULT = new com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder().build();

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static final class Builder extends com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder {
        public com.google.android.gms.auth.api.credentials.CredentialsOptions build() {
            return new com.google.android.gms.auth.api.credentials.CredentialsOptions(this, null);
        }

        @Override // com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder
        public final /* bridge */ /* synthetic */ com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder forceEnableSaveDialog() {
            forceEnableSaveDialog();
            return this;
        }

        @Override // com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder
        public com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder forceEnableSaveDialog() {
            this.zba = true;
            return this;
        }
    }

    /* synthetic */ CredentialsOptions(com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder builder, com.google.android.gms.auth.api.credentials.zbd zbdVar) {
        super(builder);
    }
}
