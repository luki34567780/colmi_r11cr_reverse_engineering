package com.google.android.gms.signin;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zad {
    public static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.signin.internal.SignInClientImpl> zaa;
    public static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.signin.internal.SignInClientImpl> zab;
    public static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.signin.internal.SignInClientImpl, com.google.android.gms.signin.SignInOptions> zac;
    static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.signin.internal.SignInClientImpl, com.google.android.gms.signin.zac> zad;
    public static final com.google.android.gms.common.api.Scope zae;
    public static final com.google.android.gms.common.api.Scope zaf;
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.signin.SignInOptions> zag;
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.signin.zac> zah;

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.signin.internal.SignInClientImpl> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        zaa = clientKey;
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.signin.internal.SignInClientImpl> clientKey2 = new com.google.android.gms.common.api.Api.ClientKey<>();
        zab = clientKey2;
        com.google.android.gms.signin.zaa zaaVar = new com.google.android.gms.signin.zaa();
        zac = zaaVar;
        com.google.android.gms.signin.zab zabVar = new com.google.android.gms.signin.zab();
        zad = zabVar;
        zae = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.PROFILE);
        zaf = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.EMAIL);
        zag = new com.google.android.gms.common.api.Api<>("SignIn.API", zaaVar, clientKey);
        zah = new com.google.android.gms.common.api.Api<>("SignIn.INTERNAL_API", zabVar, clientKey2);
    }
}
