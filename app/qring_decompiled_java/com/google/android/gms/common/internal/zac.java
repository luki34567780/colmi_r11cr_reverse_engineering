package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zac {
    private static final androidx.collection.SimpleArrayMap<java.lang.String, java.lang.String> zaa = new androidx.collection.SimpleArrayMap<>();
    private static java.util.Locale zab;

    public static java.lang.String zaa(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        try {
            return com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException unused) {
            java.lang.String str = context.getApplicationInfo().name;
            return android.text.TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static java.lang.String zab(android.content.Context context) {
        return context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_channel_name);
    }

    public static java.lang.String zac(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(android.R.string.ok) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_button) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_button) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_button);
    }

    public static java.lang.String zad(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String zaa2 = zaa(context);
        if (i == 1) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_text, zaa2);
        }
        if (i == 2) {
            return com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(com.google.android.gms.base.R.string.common_google_play_services_wear_update_text) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_text, zaa2);
        }
        if (i == 3) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_text, zaa2);
        }
        if (i == 5) {
            return zah(context, "common_google_play_services_invalid_account_text", zaa2);
        }
        if (i == 7) {
            return zah(context, "common_google_play_services_network_error_text", zaa2);
        }
        if (i == 9) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_unsupported_text, zaa2);
        }
        if (i == 20) {
            return zah(context, "common_google_play_services_restricted_profile_text", zaa2);
        }
        switch (i) {
            case 16:
                return zah(context, "common_google_play_services_api_unavailable_text", zaa2);
            case 17:
                return zah(context, "common_google_play_services_sign_in_failed_text", zaa2);
            case 18:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_updating_text, zaa2);
            default:
                return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, zaa2);
        }
    }

    public static java.lang.String zaf(android.content.Context context, int i) {
        java.lang.String zai = i == 6 ? zai(context, "common_google_play_services_resolution_required_title") : zag(context, i);
        return zai == null ? context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker) : zai;
    }

    public static java.lang.String zag(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                android.util.Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zai(context, "common_google_play_services_invalid_account_title");
            case 7:
                android.util.Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zai(context, "common_google_play_services_network_error_title");
            case 8:
                android.util.Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                android.util.Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                android.util.Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                android.util.Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                android.util.Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                android.util.Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                android.util.Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zai(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                android.util.Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zai(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static java.lang.String zah(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String zai = zai(context, str);
        if (zai == null) {
            zai = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return java.lang.String.format(resources.getConfiguration().locale, zai, str2);
    }

    private static java.lang.String zai(android.content.Context context, java.lang.String str) {
        androidx.collection.SimpleArrayMap<java.lang.String, java.lang.String> simpleArrayMap = zaa;
        synchronized (simpleArrayMap) {
            java.util.Locale locale = androidx.core.os.ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
            if (!locale.equals(zab)) {
                simpleArrayMap.clear();
                zab = locale;
            }
            java.lang.String str2 = (java.lang.String) simpleArrayMap.get(str);
            if (str2 != null) {
                return str2;
            }
            android.content.res.Resources remoteResource = com.google.android.gms.common.GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                android.util.Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new java.lang.String("Missing resource: "));
                return null;
            }
            java.lang.String string = remoteResource.getString(identifier);
            if (android.text.TextUtils.isEmpty(string)) {
                android.util.Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new java.lang.String("Got empty resource: "));
                return null;
            }
            simpleArrayMap.put(str, string);
            return string;
        }
    }

    public static java.lang.String zae(android.content.Context context, int i) {
        return (i == 6 || i == 19) ? zah(context, "common_google_play_services_resolution_required_text", zaa(context)) : zad(context, i);
    }
}
