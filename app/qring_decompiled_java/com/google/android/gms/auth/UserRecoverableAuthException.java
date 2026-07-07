package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public class UserRecoverableAuthException extends com.google.android.gms.auth.GoogleAuthException {
    private final android.content.Intent zza;

    public UserRecoverableAuthException(java.lang.String str, android.content.Intent intent) {
        super(str);
        this.zza = intent;
    }

    public android.content.Intent getIntent() {
        android.content.Intent intent = this.zza;
        if (intent == null) {
            return null;
        }
        return new android.content.Intent(intent);
    }
}
