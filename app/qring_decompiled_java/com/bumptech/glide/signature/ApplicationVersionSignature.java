package com.bumptech.glide.signature;

/* loaded from: /tmp/dex/classes2.dex */
public final class ApplicationVersionSignature {
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, com.bumptech.glide.load.Key> PACKAGE_NAME_TO_KEY = new java.util.concurrent.ConcurrentHashMap();
    private static final java.lang.String TAG = "AppVersionSignature";

    public static com.bumptech.glide.load.Key obtain(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        java.util.concurrent.ConcurrentMap<java.lang.String, com.bumptech.glide.load.Key> concurrentMap = PACKAGE_NAME_TO_KEY;
        com.bumptech.glide.load.Key key = concurrentMap.get(packageName);
        if (key != null) {
            return key;
        }
        com.bumptech.glide.load.Key obtainVersionSignature = obtainVersionSignature(context);
        com.bumptech.glide.load.Key putIfAbsent = concurrentMap.putIfAbsent(packageName, obtainVersionSignature);
        return putIfAbsent == null ? obtainVersionSignature : putIfAbsent;
    }

    static void reset() {
        PACKAGE_NAME_TO_KEY.clear();
    }

    private static com.bumptech.glide.load.Key obtainVersionSignature(android.content.Context context) {
        return new com.bumptech.glide.signature.ObjectKey(getVersionCode(getPackageInfo(context)));
    }

    private static java.lang.String getVersionCode(android.content.pm.PackageInfo packageInfo) {
        if (packageInfo != null) {
            return java.lang.String.valueOf(packageInfo.versionCode);
        }
        return java.util.UUID.randomUUID().toString();
    }

    private static android.content.pm.PackageInfo getPackageInfo(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.e(TAG, "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }

    private ApplicationVersionSignature() {
    }
}
