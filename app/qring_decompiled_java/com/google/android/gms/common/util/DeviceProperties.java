package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class DeviceProperties {
    private static java.lang.Boolean zza;
    private static java.lang.Boolean zzb;
    private static java.lang.Boolean zzc;
    private static java.lang.Boolean zzd;
    private static java.lang.Boolean zze;
    private static java.lang.Boolean zzf;
    private static java.lang.Boolean zzg;
    private static java.lang.Boolean zzh;
    private static java.lang.Boolean zzi;
    private static java.lang.Boolean zzj;
    private static java.lang.Boolean zzk;
    private static java.lang.Boolean zzl;

    private DeviceProperties() {
    }

    public static boolean isAuto(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (zzi == null) {
            boolean z = false;
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            zzi = java.lang.Boolean.valueOf(z);
        }
        return zzi.booleanValue();
    }

    public static boolean isBstar(android.content.Context context) {
        if (zzl == null) {
            boolean z = false;
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            zzl = java.lang.Boolean.valueOf(z);
        }
        return zzl.booleanValue();
    }

    public static boolean isLatchsky(android.content.Context context) {
        if (zzf == null) {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            zzf = java.lang.Boolean.valueOf(z);
        }
        return zzf.booleanValue();
    }

    public static boolean isPhone(android.content.Context context) {
        if (zza == null) {
            boolean z = false;
            if (!isTablet(context) && !isWearable(context) && !zzb(context)) {
                if (zzh == null) {
                    zzh = java.lang.Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
                }
                if (!zzh.booleanValue() && !isAuto(context) && !isTv(context)) {
                    if (zzk == null) {
                        zzk = java.lang.Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                    }
                    if (!zzk.booleanValue() && !isBstar(context)) {
                        z = true;
                    }
                }
            }
            zza = java.lang.Boolean.valueOf(z);
        }
        return zza.booleanValue();
    }

    public static boolean isSevenInchTablet(android.content.Context context) {
        return zzc(context.getResources());
    }

    public static boolean isSidewinder(android.content.Context context) {
        return zza(context);
    }

    public static boolean isTablet(android.content.Context context) {
        return isTablet(context.getResources());
    }

    public static boolean isTv(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (zzj == null) {
            boolean z = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            zzj = java.lang.Boolean.valueOf(z);
        }
        return zzj.booleanValue();
    }

    public static boolean isUserBuild() {
        int i = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(android.os.Build.TYPE);
    }

    public static boolean isWearable(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (zzd == null) {
            boolean z = false;
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKatWatch() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            zzd = java.lang.Boolean.valueOf(z);
        }
        return zzd.booleanValue();
    }

    public static boolean isWearableWithoutPlayStore(android.content.Context context) {
        if (isWearable(context)) {
            if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastN()) {
                return true;
            }
            if (zza(context) && !com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
                return true;
            }
        }
        return false;
    }

    public static boolean zza(android.content.Context context) {
        if (zze == null) {
            boolean z = false;
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            zze = java.lang.Boolean.valueOf(z);
        }
        return zze.booleanValue();
    }

    public static boolean zzb(android.content.Context context) {
        if (zzg == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            zzg = java.lang.Boolean.valueOf(z);
        }
        return zzg.booleanValue();
    }

    public static boolean zzc(android.content.res.Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (zzc == null) {
            android.content.res.Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            zzc = java.lang.Boolean.valueOf(z);
        }
        return zzc.booleanValue();
    }

    public static boolean isTablet(android.content.res.Resources resources) {
        if (resources == null) {
            return false;
        }
        if (zzb == null) {
            zzb = java.lang.Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || zzc(resources));
        }
        return zzb.booleanValue();
    }
}
