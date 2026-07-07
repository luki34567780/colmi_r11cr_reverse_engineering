package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public class zzl {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final java.lang.String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final java.lang.String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final java.lang.String WORK_ACCOUNT_TYPE = "com.google.work";
    public static final java.lang.String[] zza = {"com.google", "com.google.work", "cn.google"};
    public static final java.lang.String zzb = "androidPackageName";
    private static final android.content.ComponentName zzc = new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final com.google.android.gms.common.logging.Logger zzd = com.google.android.gms.auth.zzd.zza("GoogleAuthUtil");

    zzl() {
    }

    public static void clearToken(android.content.Context context, java.lang.String str) throws com.google.android.gms.auth.GooglePlayServicesAvailabilityException, com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzj(context, 8400000);
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        java.lang.String str3 = zzb;
        if (!bundle.containsKey(str3)) {
            bundle.putString(str3, str2);
        }
        com.google.android.gms.internal.auth.zzcz.zze(context);
        if (com.google.android.gms.internal.auth.zzhj.zze() && zzm(context)) {
            com.google.android.gms.internal.auth.zzg zza2 = com.google.android.gms.internal.auth.zzh.zza(context);
            com.google.android.gms.internal.auth.zzbw zzbwVar = new com.google.android.gms.internal.auth.zzbw();
            zzbwVar.zza(str);
            try {
                zzh(zza2.zza(zzbwVar), "clear token");
                return;
            } catch (com.google.android.gms.common.api.ApiException e) {
                zzk(e, "clear token");
            }
        }
        zzg(context, zzc, new com.google.android.gms.auth.zzh(str, bundle));
    }

    public static java.util.List<com.google.android.gms.auth.AccountChangeEvent> getAccountChangeEvents(android.content.Context context, int i, java.lang.String str) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "accountName must be provided");
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzj(context, 8400000);
        com.google.android.gms.auth.AccountChangeEventsRequest accountChangeEventsRequest = new com.google.android.gms.auth.AccountChangeEventsRequest();
        accountChangeEventsRequest.setAccountName(str);
        accountChangeEventsRequest.setEventIndex(i);
        com.google.android.gms.internal.auth.zzcz.zze(context);
        if (com.google.android.gms.internal.auth.zzhj.zzd() && zzm(context)) {
            try {
                com.google.android.gms.auth.AccountChangeEventsResponse accountChangeEventsResponse = (com.google.android.gms.auth.AccountChangeEventsResponse) zzh(com.google.android.gms.internal.auth.zzh.zza(context).zzb(accountChangeEventsRequest), "account change events retrieval");
                zzi(accountChangeEventsResponse);
                return accountChangeEventsResponse.getEvents();
            } catch (com.google.android.gms.common.api.ApiException e) {
                zzk(e, "account change events retrieval");
            }
        }
        return (java.util.List) zzg(context, zzc, new com.google.android.gms.auth.zzi(accountChangeEventsRequest));
    }

    public static java.lang.String getAccountId(android.content.Context context, java.lang.String str) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "accountName must be provided");
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzj(context, 8400000);
        return getToken(context, str, "^^_account_id_^^", new android.os.Bundle());
    }

    public static java.lang.String getToken(android.content.Context context, android.accounts.Account account, java.lang.String str) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        return getToken(context, account, str, new android.os.Bundle());
    }

    @java.lang.Deprecated
    public static void invalidateToken(android.content.Context context, java.lang.String str) {
        android.accounts.AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    public static android.os.Bundle removeAccount(android.content.Context context, final android.accounts.Account account) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        zzl(account);
        zzj(context, 8400000);
        com.google.android.gms.internal.auth.zzcz.zze(context);
        if (com.google.android.gms.internal.auth.zzhj.zze() && zzm(context)) {
            try {
                android.os.Bundle bundle = (android.os.Bundle) zzh(com.google.android.gms.internal.auth.zzh.zza(context).zzd(account), "account removal");
                zzi(bundle);
                return bundle;
            } catch (com.google.android.gms.common.api.ApiException e) {
                zzk(e, "account removal");
            }
        }
        return (android.os.Bundle) zzg(context, zzc, new com.google.android.gms.auth.zzk() { // from class: com.google.android.gms.auth.zzf
            @Override // com.google.android.gms.auth.zzk
            public final java.lang.Object zza(android.os.IBinder iBinder) {
                android.os.Bundle zzf = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzf(account);
                if (zzf != null) {
                    return zzf;
                }
                throw new java.io.IOException("Service call returned null.");
            }
        });
    }

    public static java.lang.Boolean requestGoogleAccountsAccess(android.content.Context context) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        zzj(context, 11400000);
        java.lang.String str = context.getApplicationInfo().packageName;
        com.google.android.gms.internal.auth.zzcz.zze(context);
        if (com.google.android.gms.internal.auth.zzhj.zze() && zzm(context)) {
            try {
                android.os.Bundle bundle = (android.os.Bundle) zzh(com.google.android.gms.internal.auth.zzh.zza(context).zze(str), "google accounts access request");
                java.lang.String string = bundle.getString("Error");
                android.content.Intent intent = (android.content.Intent) bundle.getParcelable("userRecoveryIntent");
                com.google.android.gms.internal.auth.zzby zza2 = com.google.android.gms.internal.auth.zzby.zza(string);
                if (com.google.android.gms.internal.auth.zzby.SUCCESS.equals(zza2)) {
                    return true;
                }
                if (!com.google.android.gms.internal.auth.zzby.zzb(zza2)) {
                    throw new com.google.android.gms.auth.GoogleAuthException(string);
                }
                com.google.android.gms.common.logging.Logger logger = zzd;
                java.lang.String valueOf = java.lang.String.valueOf(zza2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 31);
                sb.append("isUserRecoverableError status: ");
                sb.append(valueOf);
                logger.w("GoogleAuthUtil", sb.toString());
                throw new com.google.android.gms.auth.UserRecoverableAuthException(string, intent);
            } catch (com.google.android.gms.common.api.ApiException e) {
                zzk(e, "google accounts access request");
            }
        }
        return (java.lang.Boolean) zzg(context, zzc, new com.google.android.gms.auth.zzj(str));
    }

    public static com.google.android.gms.auth.TokenData zza(android.content.Context context, final android.accounts.Account account, final java.lang.String str, android.os.Bundle bundle) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Scope cannot be empty or null.");
        zzl(account);
        zzj(context, 8400000);
        final android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
        java.lang.String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        java.lang.String str3 = zzb;
        if (android.text.TextUtils.isEmpty(bundle2.getString(str3))) {
            bundle2.putString(str3, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", android.os.SystemClock.elapsedRealtime());
        com.google.android.gms.internal.auth.zzcz.zze(context);
        if (com.google.android.gms.internal.auth.zzhj.zze() && zzm(context)) {
            try {
                android.os.Bundle bundle3 = (android.os.Bundle) zzh(com.google.android.gms.internal.auth.zzh.zza(context).zzc(account, str, bundle2), "token retrieval");
                zzi(bundle3);
                return zzf(bundle3);
            } catch (com.google.android.gms.common.api.ApiException e) {
                zzk(e, "token retrieval");
            }
        }
        return (com.google.android.gms.auth.TokenData) zzg(context, zzc, new com.google.android.gms.auth.zzk() { // from class: com.google.android.gms.auth.zzg
            @Override // com.google.android.gms.auth.zzk
            public final java.lang.Object zza(android.os.IBinder iBinder) {
                return com.google.android.gms.auth.zzl.zzb(account, str, bundle2, iBinder);
            }
        });
    }

    static /* synthetic */ com.google.android.gms.auth.TokenData zzb(android.accounts.Account account, java.lang.String str, android.os.Bundle bundle, android.os.IBinder iBinder) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        android.os.Bundle zze = com.google.android.gms.internal.auth.zze.zzb(iBinder).zze(account, str, bundle);
        if (zze != null) {
            return zzf(zze);
        }
        throw new java.io.IOException("Service call returned null");
    }

    static /* synthetic */ java.lang.Object zzd(java.lang.Object obj) throws java.io.IOException {
        zzi(obj);
        return obj;
    }

    private static com.google.android.gms.auth.TokenData zzf(android.os.Bundle bundle) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.auth.TokenData tokenData;
        android.os.Parcelable.Creator<com.google.android.gms.auth.TokenData> creator = com.google.android.gms.auth.TokenData.CREATOR;
        java.lang.ClassLoader classLoader = com.google.android.gms.auth.TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        android.os.Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (com.google.android.gms.auth.TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        java.lang.String string = bundle.getString("Error");
        android.content.Intent intent = (android.content.Intent) bundle.getParcelable("userRecoveryIntent");
        com.google.android.gms.internal.auth.zzby zza2 = com.google.android.gms.internal.auth.zzby.zza(string);
        if (!com.google.android.gms.internal.auth.zzby.zzb(zza2)) {
            if (com.google.android.gms.internal.auth.zzby.NETWORK_ERROR.equals(zza2) || com.google.android.gms.internal.auth.zzby.SERVICE_UNAVAILABLE.equals(zza2) || com.google.android.gms.internal.auth.zzby.INTNERNAL_ERROR.equals(zza2) || com.google.android.gms.internal.auth.zzby.AUTH_SECURITY_ERROR.equals(zza2)) {
                throw new java.io.IOException(string);
            }
            throw new com.google.android.gms.auth.GoogleAuthException(string);
        }
        com.google.android.gms.common.logging.Logger logger = zzd;
        java.lang.String valueOf = java.lang.String.valueOf(zza2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 31);
        sb.append("isUserRecoverableError status: ");
        sb.append(valueOf);
        logger.w("GoogleAuthUtil", sb.toString());
        throw new com.google.android.gms.auth.UserRecoverableAuthException(string, intent);
    }

    private static <T> T zzg(android.content.Context context, android.content.ComponentName componentName, com.google.android.gms.auth.zzk<T> zzkVar) throws java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        com.google.android.gms.common.BlockingServiceConnection blockingServiceConnection = new com.google.android.gms.common.BlockingServiceConnection();
        com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(context);
        try {
            try {
                if (!gmsClientSupervisor.bindService(componentName, blockingServiceConnection, "GoogleAuthUtil")) {
                    throw new java.io.IOException("Could not bind to service.");
                }
                try {
                    return zzkVar.zza(blockingServiceConnection.getService());
                } catch (android.os.RemoteException | java.lang.InterruptedException e) {
                    android.util.Log.i("GoogleAuthUtil", "Error on service connection.", e);
                    throw new java.io.IOException("Error on service connection.", e);
                }
            } finally {
                gmsClientSupervisor.unbindService(componentName, blockingServiceConnection, "GoogleAuthUtil");
            }
        } catch (java.lang.SecurityException e2) {
            android.util.Log.w("GoogleAuthUtil", java.lang.String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new java.io.IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    private static <ResultT> ResultT zzh(com.google.android.gms.tasks.Task<ResultT> task, java.lang.String str) throws java.io.IOException, com.google.android.gms.common.api.ApiException {
        try {
            return (ResultT) com.google.android.gms.tasks.Tasks.await(task);
        } catch (java.lang.InterruptedException e) {
            java.lang.String format = java.lang.String.format("Interrupted while waiting for the task of %s to finish.", str);
            zzd.w(format, new java.lang.Object[0]);
            throw new java.io.IOException(format, e);
        } catch (java.util.concurrent.CancellationException e2) {
            java.lang.String format2 = java.lang.String.format("Canceled while waiting for the task of %s to finish.", str);
            zzd.w(format2, new java.lang.Object[0]);
            throw new java.io.IOException(format2, e2);
        } catch (java.util.concurrent.ExecutionException e3) {
            java.lang.Throwable cause = e3.getCause();
            if (cause instanceof com.google.android.gms.common.api.ApiException) {
                throw ((com.google.android.gms.common.api.ApiException) cause);
            }
            java.lang.String format3 = java.lang.String.format("Unable to get a result for %s due to ExecutionException.", str);
            zzd.w(format3, new java.lang.Object[0]);
            throw new java.io.IOException(format3, e3);
        }
    }

    private static <T> T zzi(T t) throws java.io.IOException {
        if (t != null) {
            return t;
        }
        zzd.w("Service call returned null.", new java.lang.Object[0]);
        throw new java.io.IOException("Service unavailable.");
    }

    private static void zzj(android.content.Context context, int i) throws com.google.android.gms.auth.GoogleAuthException {
        try {
            com.google.android.gms.common.GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context.getApplicationContext(), i);
        } catch (com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException e) {
            e = e;
            throw new com.google.android.gms.auth.GoogleAuthException(e.getMessage(), e);
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException e2) {
            e = e2;
            throw new com.google.android.gms.auth.GoogleAuthException(e.getMessage(), e);
        } catch (com.google.android.gms.common.GooglePlayServicesRepairableException e3) {
            throw new com.google.android.gms.auth.GooglePlayServicesAvailabilityException(e3.getConnectionStatusCode(), e3.getMessage(), e3.getIntent());
        }
    }

    private static void zzk(com.google.android.gms.common.api.ApiException apiException, java.lang.String str) {
        zzd.w("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, android.util.Log.getStackTraceString(apiException));
    }

    private static boolean zzm(android.content.Context context) {
        if (com.google.android.gms.common.GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context, 17895000) != 0) {
            return false;
        }
        java.lang.String str = context.getApplicationInfo().packageName;
        java.util.Iterator<java.lang.String> it = com.google.android.gms.internal.auth.zzhj.zzb().zzm().iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static java.lang.String getToken(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        zzl(account);
        return zza(context, account, str, bundle).zza();
    }

    static void zze(android.content.Intent intent) {
        if (intent == null) {
            throw new java.lang.IllegalArgumentException("Callback cannot be null.");
        }
        try {
            android.content.Intent.parseUri(intent.toUri(1), 1);
        } catch (java.net.URISyntaxException unused) {
            throw new java.lang.IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
        }
    }

    private static void zzl(android.accounts.Account account) {
        if (account == null) {
            throw new java.lang.IllegalArgumentException("Account cannot be null");
        }
        if (android.text.TextUtils.isEmpty(account.name)) {
            throw new java.lang.IllegalArgumentException("Account name cannot be empty!");
        }
        java.lang.String[] strArr = zza;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(account.type)) {
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Account type not supported");
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        return getToken(context, new android.accounts.Account(str, "com.google"), str2);
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        return getToken(context, new android.accounts.Account(str, "com.google"), str2, bundle);
    }
}
