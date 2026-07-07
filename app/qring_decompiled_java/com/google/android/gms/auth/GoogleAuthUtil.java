package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class GoogleAuthUtil extends com.google.android.gms.auth.zzl {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final java.lang.String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final java.lang.String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final java.lang.String WORK_ACCOUNT_TYPE = "com.google.work";

    private GoogleAuthUtil() {
    }

    public static void clearToken(android.content.Context context, java.lang.String str) throws com.google.android.gms.auth.GooglePlayServicesAvailabilityException, com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.auth.zzl.clearToken(context, str);
    }

    public static java.util.List<com.google.android.gms.auth.AccountChangeEvent> getAccountChangeEvents(android.content.Context context, int i, java.lang.String str) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        return com.google.android.gms.auth.zzl.getAccountChangeEvents(context, i, str);
    }

    public static java.lang.String getAccountId(android.content.Context context, java.lang.String str) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        return com.google.android.gms.auth.zzl.getAccountId(context, str);
    }

    public static java.lang.String getToken(android.content.Context context, android.accounts.Account account, java.lang.String str) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        return com.google.android.gms.auth.zzl.getToken(context, account, str);
    }

    public static java.lang.String getTokenWithNotification(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        bundle.putBoolean("handle_notification", true);
        return zzf(context, account, str, bundle).zza();
    }

    @java.lang.Deprecated
    public static void invalidateToken(android.content.Context context, java.lang.String str) {
        com.google.android.gms.auth.zzl.invalidateToken(context, str);
    }

    public static android.os.Bundle removeAccount(android.content.Context context, android.accounts.Account account) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        return com.google.android.gms.auth.zzl.removeAccount(context, account);
    }

    public static java.lang.Boolean requestGoogleAccountsAccess(android.content.Context context) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        return com.google.android.gms.auth.zzl.requestGoogleAccountsAccess(context);
    }

    private static com.google.android.gms.auth.TokenData zzf(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) throws java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        try {
            com.google.android.gms.auth.TokenData zza = com.google.android.gms.auth.zzl.zza(context, account, str, bundle);
            com.google.android.gms.common.GooglePlayServicesUtil.cancelAvailabilityErrorNotifications(context);
            return zza;
        } catch (com.google.android.gms.auth.GooglePlayServicesAvailabilityException e) {
            com.google.android.gms.common.GooglePlayServicesUtil.showErrorNotification(e.getConnectionStatusCode(), context);
            android.util.Log.w("GoogleAuthUtil", "Error when getting token", e);
            throw new com.google.android.gms.auth.UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        } catch (com.google.android.gms.auth.UserRecoverableAuthException e2) {
            com.google.android.gms.common.GooglePlayServicesUtil.cancelAvailabilityErrorNotifications(context);
            android.util.Log.w("GoogleAuthUtil", "Error when getting token", e2);
            throw new com.google.android.gms.auth.UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
    }

    public static java.lang.String getToken(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        return com.google.android.gms.auth.zzl.getToken(context, account, str, bundle);
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        return com.google.android.gms.auth.zzl.getToken(context, str, str2);
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        return com.google.android.gms.auth.zzl.getToken(context, str, str2, bundle);
    }

    public static java.lang.String getTokenWithNotification(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle, android.content.Intent intent) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
        zze(intent);
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        bundle.putParcelable("callback_intent", intent);
        bundle.putBoolean("handle_notification", true);
        return zzf(context, account, str, bundle).zza();
    }

    public static java.lang.String getTokenWithNotification(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle, java.lang.String str2, android.os.Bundle bundle2) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2, "Authority cannot be empty or null.");
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        if (bundle2 == null) {
            bundle2 = new android.os.Bundle();
        }
        android.content.ContentResolver.validateSyncExtrasBundle(bundle2);
        bundle.putString("authority", str2);
        bundle.putBundle("sync_extras", bundle2);
        bundle.putBoolean("handle_notification", true);
        return zzf(context, account, str, bundle).zza();
    }

    @java.lang.Deprecated
    public static java.lang.String getTokenWithNotification(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
        return getTokenWithNotification(context, new android.accounts.Account(str, "com.google"), str2, bundle);
    }

    @java.lang.Deprecated
    public static java.lang.String getTokenWithNotification(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, android.content.Intent intent) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
        return getTokenWithNotification(context, new android.accounts.Account(str, "com.google"), str2, bundle, intent);
    }

    @java.lang.Deprecated
    public static java.lang.String getTokenWithNotification(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.lang.String str3, android.os.Bundle bundle2) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
        return getTokenWithNotification(context, new android.accounts.Account(str, "com.google"), str2, bundle, str3, bundle2);
    }
}
