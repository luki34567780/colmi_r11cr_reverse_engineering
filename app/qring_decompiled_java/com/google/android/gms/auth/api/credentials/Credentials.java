package com.google.android.gms.auth.api.credentials;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class Credentials {
    public static com.google.android.gms.auth.api.credentials.CredentialsClient getClient(android.app.Activity activity) {
        return new com.google.android.gms.auth.api.credentials.CredentialsClient(activity, (com.google.android.gms.auth.api.Auth.AuthCredentialsOptions) com.google.android.gms.auth.api.credentials.CredentialsOptions.DEFAULT);
    }

    public static com.google.android.gms.auth.api.credentials.CredentialsClient getClient(android.app.Activity activity, com.google.android.gms.auth.api.credentials.CredentialsOptions credentialsOptions) {
        return new com.google.android.gms.auth.api.credentials.CredentialsClient(activity, (com.google.android.gms.auth.api.Auth.AuthCredentialsOptions) credentialsOptions);
    }

    public static com.google.android.gms.auth.api.credentials.CredentialsClient getClient(android.content.Context context) {
        return new com.google.android.gms.auth.api.credentials.CredentialsClient(context, com.google.android.gms.auth.api.credentials.CredentialsOptions.DEFAULT);
    }

    public static com.google.android.gms.auth.api.credentials.CredentialsClient getClient(android.content.Context context, com.google.android.gms.auth.api.credentials.CredentialsOptions credentialsOptions) {
        return new com.google.android.gms.auth.api.credentials.CredentialsClient(context, credentialsOptions);
    }
}
