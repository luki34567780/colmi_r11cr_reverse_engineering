package com.google.android.gms.auth.api;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class Auth {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.Auth.AuthCredentialsOptions> CREDENTIALS_API;
    public static final com.google.android.gms.auth.api.credentials.CredentialsApi CredentialsApi;
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.signin.GoogleSignInOptions> GOOGLE_SIGN_IN_API;
    public static final com.google.android.gms.auth.api.signin.GoogleSignInApi GoogleSignInApi;

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.AuthProxyOptions> PROXY_API;

    @java.lang.Deprecated
    public static final com.google.android.gms.auth.api.proxy.ProxyApi ProxyApi;
    public static final com.google.android.gms.common.api.Api.ClientKey zba;
    public static final com.google.android.gms.common.api.Api.ClientKey zbb;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zbc;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zbd;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    @java.lang.Deprecated
    public static class AuthCredentialsOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
        public static final com.google.android.gms.auth.api.Auth.AuthCredentialsOptions zba = new com.google.android.gms.auth.api.Auth.AuthCredentialsOptions(new com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder());
        private final java.lang.String zbb = null;
        private final boolean zbc;
        private final java.lang.String zbd;

        /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
        @java.lang.Deprecated
        public static class Builder {
            protected java.lang.Boolean zba;
            protected java.lang.String zbb;

            public Builder() {
                this.zba = false;
            }

            public com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder forceEnableSaveDialog() {
                this.zba = true;
                return this;
            }

            public final com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder zba(java.lang.String str) {
                this.zbb = str;
                return this;
            }

            public Builder(com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authCredentialsOptions) {
                this.zba = false;
                com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.zbb(authCredentialsOptions);
                this.zba = java.lang.Boolean.valueOf(authCredentialsOptions.zbc);
                this.zbb = authCredentialsOptions.zbd;
            }
        }

        public AuthCredentialsOptions(com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder builder) {
            this.zbc = builder.zba.booleanValue();
            this.zbd = builder.zbb;
        }

        static /* bridge */ /* synthetic */ java.lang.String zbb(com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authCredentialsOptions) {
            java.lang.String str = authCredentialsOptions.zbb;
            return null;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.auth.api.Auth.AuthCredentialsOptions)) {
                return false;
            }
            com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authCredentialsOptions = (com.google.android.gms.auth.api.Auth.AuthCredentialsOptions) obj;
            java.lang.String str = authCredentialsOptions.zbb;
            return com.google.android.gms.common.internal.Objects.equal(null, null) && this.zbc == authCredentialsOptions.zbc && com.google.android.gms.common.internal.Objects.equal(this.zbd, authCredentialsOptions.zbd);
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.Objects.hashCode(null, java.lang.Boolean.valueOf(this.zbc), this.zbd);
        }

        public final android.os.Bundle zba() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.zbc);
            bundle.putString("log_session_id", this.zbd);
            return bundle;
        }

        public final java.lang.String zbd() {
            return this.zbd;
        }
    }

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zba = clientKey;
        com.google.android.gms.common.api.Api.ClientKey clientKey2 = new com.google.android.gms.common.api.Api.ClientKey();
        zbb = clientKey2;
        com.google.android.gms.auth.api.zba zbaVar = new com.google.android.gms.auth.api.zba();
        zbc = zbaVar;
        com.google.android.gms.auth.api.zbb zbbVar = new com.google.android.gms.auth.api.zbb();
        zbd = zbbVar;
        PROXY_API = com.google.android.gms.auth.api.AuthProxy.API;
        CREDENTIALS_API = new com.google.android.gms.common.api.Api<>("Auth.CREDENTIALS_API", zbaVar, clientKey);
        GOOGLE_SIGN_IN_API = new com.google.android.gms.common.api.Api<>("Auth.GOOGLE_SIGN_IN_API", zbbVar, clientKey2);
        ProxyApi = com.google.android.gms.auth.api.AuthProxy.ProxyApi;
        CredentialsApi = new com.google.android.gms.internal.p000authapi.zbl();
        GoogleSignInApi = new com.google.android.gms.auth.api.signin.internal.zbd();
    }

    private Auth() {
    }
}
