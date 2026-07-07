package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public interface SignInClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.auth.api.identity.zbn> {
    com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.BeginSignInResult> beginSignIn(com.google.android.gms.auth.api.identity.BeginSignInRequest beginSignInRequest);

    java.lang.String getPhoneNumberFromIntent(android.content.Intent intent) throws com.google.android.gms.common.api.ApiException;

    com.google.android.gms.tasks.Task<android.app.PendingIntent> getPhoneNumberHintIntent(com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest);

    com.google.android.gms.auth.api.identity.SignInCredential getSignInCredentialFromIntent(android.content.Intent intent) throws com.google.android.gms.common.api.ApiException;

    com.google.android.gms.tasks.Task<android.app.PendingIntent> getSignInIntent(com.google.android.gms.auth.api.identity.GetSignInIntentRequest getSignInIntentRequest);

    com.google.android.gms.tasks.Task<java.lang.Void> signOut();
}
