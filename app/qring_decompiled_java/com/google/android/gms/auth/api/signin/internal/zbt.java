package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zbt extends com.google.android.gms.auth.api.signin.internal.zbo {
    private final android.content.Context zba;

    public zbt(android.content.Context context) {
        this.zba = context;
    }

    private final void zbd() {
        if (com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(this.zba, android.os.Binder.getCallingUid())) {
            return;
        }
        throw new java.lang.SecurityException("Calling UID " + android.os.Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zbp
    public final void zbb() {
        zbd();
        com.google.android.gms.auth.api.signin.internal.zbn.zbc(this.zba).zbd();
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zbp
    public final void zbc() {
        zbd();
        com.google.android.gms.auth.api.signin.internal.Storage storage = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(this.zba);
        com.google.android.gms.auth.api.signin.GoogleSignInAccount savedDefaultGoogleSignInAccount = storage.getSavedDefaultGoogleSignInAccount();
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (savedDefaultGoogleSignInAccount != null) {
            googleSignInOptions = storage.getSavedDefaultGoogleSignInOptions();
        }
        com.google.android.gms.auth.api.signin.GoogleSignInClient client = com.google.android.gms.auth.api.signin.GoogleSignIn.getClient(this.zba, googleSignInOptions);
        if (savedDefaultGoogleSignInAccount != null) {
            client.revokeAccess();
        } else {
            client.signOut();
        }
    }
}
