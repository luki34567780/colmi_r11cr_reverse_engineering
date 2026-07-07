package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class MetaDataUtils {
    private MetaDataUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static java.lang.String getMetaDataInApp(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        try {
            return java.lang.String.valueOf(com.blankj.utilcode.util.Utils.getApp().getPackageManager().getApplicationInfo(com.blankj.utilcode.util.Utils.getApp().getPackageName(), 128).metaData.get(str));
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static java.lang.String getMetaDataInActivity(android.app.Activity activity, java.lang.String str) {
        java.util.Objects.requireNonNull(activity, "Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getMetaDataInActivity((java.lang.Class<? extends android.app.Activity>) activity.getClass(), str);
    }

    public static java.lang.String getMetaDataInActivity(java.lang.Class<? extends android.app.Activity> cls, java.lang.String str) {
        java.util.Objects.requireNonNull(cls, "Argument 'clz' of type Class<? extends Activity> (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        try {
            return java.lang.String.valueOf(com.blankj.utilcode.util.Utils.getApp().getPackageManager().getActivityInfo(new android.content.ComponentName(com.blankj.utilcode.util.Utils.getApp(), cls), 128).metaData.get(str));
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static java.lang.String getMetaDataInService(android.app.Service service, java.lang.String str) {
        java.util.Objects.requireNonNull(service, "Argument 'service' of type Service (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getMetaDataInService((java.lang.Class<? extends android.app.Service>) service.getClass(), str);
    }

    public static java.lang.String getMetaDataInService(java.lang.Class<? extends android.app.Service> cls, java.lang.String str) {
        java.util.Objects.requireNonNull(cls, "Argument 'clz' of type Class<? extends Service> (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        try {
            return java.lang.String.valueOf(com.blankj.utilcode.util.Utils.getApp().getPackageManager().getServiceInfo(new android.content.ComponentName(com.blankj.utilcode.util.Utils.getApp(), cls), 128).metaData.get(str));
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static java.lang.String getMetaDataInReceiver(android.content.BroadcastReceiver broadcastReceiver, java.lang.String str) {
        java.util.Objects.requireNonNull(broadcastReceiver, "Argument 'receiver' of type BroadcastReceiver (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getMetaDataInReceiver(broadcastReceiver, str);
    }

    public static java.lang.String getMetaDataInReceiver(java.lang.Class<? extends android.content.BroadcastReceiver> cls, java.lang.String str) {
        java.util.Objects.requireNonNull(cls, "Argument 'clz' of type Class<? extends BroadcastReceiver> (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        try {
            return java.lang.String.valueOf(com.blankj.utilcode.util.Utils.getApp().getPackageManager().getReceiverInfo(new android.content.ComponentName(com.blankj.utilcode.util.Utils.getApp(), cls), 128).metaData.get(str));
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }
}
