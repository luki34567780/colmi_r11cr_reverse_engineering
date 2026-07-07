package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class Identity {
    private Identity() {
    }

    public static com.google.android.gms.auth.api.identity.CredentialSavingClient getCredentialSavingClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.p000authapi.zbao((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(activity), new com.google.android.gms.auth.api.identity.zbc());
    }

    public static com.google.android.gms.auth.api.identity.SignInClient getSignInClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.p000authapi.zbay((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(activity), new com.google.android.gms.auth.api.identity.zbn());
    }

    public static com.google.android.gms.auth.api.identity.CredentialSavingClient getCredentialSavingClient(android.content.Context context) {
        return new com.google.android.gms.internal.p000authapi.zbao((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context), new com.google.android.gms.auth.api.identity.zbc());
    }

    public static com.google.android.gms.auth.api.identity.SignInClient getSignInClient(android.content.Context context) {
        return new com.google.android.gms.internal.p000authapi.zbay((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context), new com.google.android.gms.auth.api.identity.zbn());
    }
}
