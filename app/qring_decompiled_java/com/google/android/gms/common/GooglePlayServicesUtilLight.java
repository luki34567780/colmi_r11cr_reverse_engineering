package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class GooglePlayServicesUtilLight {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final java.lang.String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";

    @java.lang.Deprecated
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @java.lang.Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final java.lang.String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static boolean zza;
    private static boolean zzb;
    static final java.util.concurrent.atomic.AtomicBoolean sCanceledAvailabilityNotification = new java.util.concurrent.atomic.AtomicBoolean();
    private static final java.util.concurrent.atomic.AtomicBoolean zzc = new java.util.concurrent.atomic.AtomicBoolean();

    GooglePlayServicesUtilLight() {
    }

    @java.lang.Deprecated
    public static void cancelAvailabilityErrorNotifications(android.content.Context context) {
        if (sCanceledAvailabilityNotification.getAndSet(true)) {
            return;
        }
        try {
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
            }
        } catch (java.lang.SecurityException unused) {
        }
    }

    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    @java.lang.Deprecated
    public static void ensurePlayServicesAvailable(android.content.Context context, int i) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        int isGooglePlayServicesAvailable = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i);
        if (isGooglePlayServicesAvailable != 0) {
            android.content.Intent errorResolutionIntent = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context, isGooglePlayServicesAvailable, "e");
            java.lang.StringBuilder sb = new java.lang.StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(isGooglePlayServicesAvailable);
            android.util.Log.e("GooglePlayServicesUtil", sb.toString());
            if (errorResolutionIntent != null) {
                throw new com.google.android.gms.common.GooglePlayServicesRepairableException(isGooglePlayServicesAvailable, "Google Play Services not available", errorResolutionIntent);
            }
            throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
    }

    @java.lang.Deprecated
    public static int getApkVersion(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            android.util.Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @java.lang.Deprecated
    public static int getClientVersion(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkState(true);
        return com.google.android.gms.common.util.ClientLibraryUtils.getClientVersion(context, context.getPackageName());
    }

    @java.lang.Deprecated
    public static android.app.PendingIntent getErrorPendingIntent(int i, android.content.Context context, int i2) {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i, i2);
    }

    @java.lang.Deprecated
    public static java.lang.String getErrorString(int i) {
        return com.google.android.gms.common.ConnectionResult.zza(i);
    }

    @java.lang.Deprecated
    public static android.content.Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i) {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(null, i, null);
    }

    public static android.content.Context getRemoteContext(android.content.Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static android.content.res.Resources getRemoteResource(android.content.Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean honorsDebugCertificates(android.content.Context context) {
        try {
            if (!zza) {
                android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo("com.google.android.gms", 64);
                com.google.android.gms.common.GoogleSignatureVerifier.getInstance(context);
                if (packageInfo == null || com.google.android.gms.common.GoogleSignatureVerifier.zzb(packageInfo, false) || !com.google.android.gms.common.GoogleSignatureVerifier.zzb(packageInfo, true)) {
                    zzb = false;
                } else {
                    zzb = true;
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            zza = true;
        }
        return zzb || !com.google.android.gms.common.util.DeviceProperties.isUserBuild();
    }

    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(android.content.Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @java.lang.Deprecated
    public static boolean isGooglePlayServicesUid(android.content.Context context, int i) {
        return com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(context, i);
    }

    @java.lang.Deprecated
    public static boolean isPlayServicesPossiblyUpdating(android.content.Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }

    @java.lang.Deprecated
    public static boolean isPlayStorePossiblyUpdating(android.content.Context context, int i) {
        if (i == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    public static boolean isRestrictedUserProfile(android.content.Context context) {
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()) {
            return false;
        }
        java.lang.Object systemService = context.getSystemService("user");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(systemService);
        android.os.Bundle applicationRestrictions = ((android.os.UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @java.lang.Deprecated
    public static boolean isSidewinderDevice(android.content.Context context) {
        return com.google.android.gms.common.util.DeviceProperties.isSidewinder(context);
    }

    @java.lang.Deprecated
    public static boolean isUserRecoverableError(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @java.lang.Deprecated
    public static boolean uidHasPackageName(android.content.Context context, int i, java.lang.String str) {
        return com.google.android.gms.common.util.UidVerifier.uidHasPackageName(context, i, str);
    }

    static boolean zza(android.content.Context context, java.lang.String str) {
        android.content.pm.ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()) {
            try {
                java.util.Iterator<android.content.pm.PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (java.lang.Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !isRestrictedUserProfile(context);
    }

    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(android.content.Context context, int i) {
        android.content.pm.PackageInfo packageInfo;
        try {
            context.getResources().getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        } catch (java.lang.Throwable unused) {
            android.util.Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !zzc.get()) {
            int zza2 = com.google.android.gms.common.internal.zzag.zza(context);
            if (zza2 == 0) {
                throw new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException();
            }
            if (zza2 != GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                throw new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException(zza2);
            }
        }
        boolean z = (com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(context) || com.google.android.gms.common.util.DeviceProperties.zzb(context)) ? false : true;
        com.google.android.gms.common.internal.Preconditions.checkArgument(i >= 0);
        java.lang.String packageName = context.getPackageName();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            android.content.pm.PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            com.google.android.gms.common.GoogleSignatureVerifier.getInstance(context);
            if (com.google.android.gms.common.GoogleSignatureVerifier.zzb(packageInfo2, true)) {
                if (z) {
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(packageInfo);
                    if (!com.google.android.gms.common.GoogleSignatureVerifier.zzb(packageInfo, true)) {
                        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    if (com.google.android.gms.common.util.zza.zza(packageInfo2.versionCode) >= com.google.android.gms.common.util.zza.zza(i)) {
                        android.content.pm.ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                                android.util.Log.wtf("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e);
                                return 1;
                            }
                        }
                        return !applicationInfo.enabled ? 3 : 0;
                    }
                    int i2 = packageInfo2.versionCode;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 82);
                    sb.append("Google Play services out of date for ");
                    sb.append(packageName);
                    sb.append(".  Requires ");
                    sb.append(i);
                    sb.append(" but found ");
                    sb.append(i2);
                    android.util.Log.w("GooglePlayServicesUtil", sb.toString());
                    return 2;
                }
                android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
            } else {
                android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            }
            return 9;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
            android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }
}
