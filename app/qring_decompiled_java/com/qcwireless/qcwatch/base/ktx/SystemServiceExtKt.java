package com.qcwireless.qcwatch.base.ktx;

/* compiled from: SystemServiceExt.kt */
@kotlin.Metadata(d1 = {"\u0000Ö\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010i\u001a\u0004\u0018\u0001Hj\"\u0006\b\u0000\u0010j\u0018\u0001*\u00020\u0002H\u0086\b¢\u0006\u0002\u0010k\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0017\u0010!\u001a\u0004\u0018\u00010\"*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0017\u0010%\u001a\u0004\u0018\u00010&*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0017\u0010)\u001a\u0004\u0018\u00010**\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0017\u0010-\u001a\u0004\u0018\u00010.*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b/\u00100\"\u0017\u00101\u001a\u0004\u0018\u000102*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0017\u00105\u001a\u0004\u0018\u000106*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b7\u00108\"\u0017\u00109\u001a\u0004\u0018\u00010:*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b;\u0010<\"\u0017\u0010=\u001a\u0004\u0018\u00010>*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b?\u0010@\"\u0017\u0010A\u001a\u0004\u0018\u00010B*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bC\u0010D\"\u0017\u0010E\u001a\u0004\u0018\u00010F*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bG\u0010H\"\u0017\u0010I\u001a\u0004\u0018\u00010J*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010L\"\u0017\u0010M\u001a\u0004\u0018\u00010N*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bO\u0010P\"\u0017\u0010Q\u001a\u0004\u0018\u00010R*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bS\u0010T\"\u0017\u0010U\u001a\u0004\u0018\u00010V*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bW\u0010X\"\u0017\u0010Y\u001a\u0004\u0018\u00010Z*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b[\u0010\\\"\u0017\u0010]\u001a\u0004\u0018\u00010^*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b_\u0010`\"\u0017\u0010a\u001a\u0004\u0018\u00010b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bc\u0010d\"\u0017\u0010e\u001a\u0004\u0018\u00010f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006l"}, d2 = {"accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "Landroid/content/Context;", "getAccessibilityManager", "(Landroid/content/Context;)Landroid/view/accessibility/AccessibilityManager;", "activityManager", "Landroid/app/ActivityManager;", "getActivityManager", "(Landroid/content/Context;)Landroid/app/ActivityManager;", "alarmManager", "Landroid/app/AlarmManager;", "getAlarmManager", "(Landroid/content/Context;)Landroid/app/AlarmManager;", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "(Landroid/content/Context;)Landroid/media/AudioManager;", "batteryManager", "Landroid/os/BatteryManager;", "getBatteryManager", "(Landroid/content/Context;)Landroid/os/BatteryManager;", "carrierConfigManager", "Landroid/telephony/CarrierConfigManager;", "getCarrierConfigManager", "(Landroid/content/Context;)Landroid/telephony/CarrierConfigManager;", "clipboardManager", "Landroid/content/ClipboardManager;", "getClipboardManager", "(Landroid/content/Context;)Landroid/content/ClipboardManager;", "connectivityManager", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "(Landroid/content/Context;)Landroid/net/ConnectivityManager;", "downloadManager", "Landroid/app/DownloadManager;", "getDownloadManager", "(Landroid/content/Context;)Landroid/app/DownloadManager;", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager", "(Landroid/content/Context;)Landroid/view/inputmethod/InputMethodManager;", "jobScheduler", "Landroid/app/job/JobScheduler;", "getJobScheduler", "(Landroid/content/Context;)Landroid/app/job/JobScheduler;", "keyguardManager", "Landroid/app/KeyguardManager;", "getKeyguardManager", "(Landroid/content/Context;)Landroid/app/KeyguardManager;", "layoutInflater", "Landroid/view/LayoutInflater;", "getLayoutInflater", "(Landroid/content/Context;)Landroid/view/LayoutInflater;", "locationManager", "Landroid/location/LocationManager;", "getLocationManager", "(Landroid/content/Context;)Landroid/location/LocationManager;", "mediaRouter", "Landroid/media/MediaRouter;", "getMediaRouter", "(Landroid/content/Context;)Landroid/media/MediaRouter;", "notificationManager", "Landroid/app/NotificationManager;", "getNotificationManager", "(Landroid/content/Context;)Landroid/app/NotificationManager;", "powerManager", "Landroid/os/PowerManager;", "getPowerManager", "(Landroid/content/Context;)Landroid/os/PowerManager;", "searchManager", "Landroid/app/SearchManager;", "getSearchManager", "(Landroid/content/Context;)Landroid/app/SearchManager;", "sensorManager", "Landroid/hardware/SensorManager;", "getSensorManager", "(Landroid/content/Context;)Landroid/hardware/SensorManager;", "storageManager", "Landroid/os/storage/StorageManager;", "getStorageManager", "(Landroid/content/Context;)Landroid/os/storage/StorageManager;", "subscriptionManager", "Landroid/telephony/SubscriptionManager;", "getSubscriptionManager", "(Landroid/content/Context;)Landroid/telephony/SubscriptionManager;", "telephonyManager", "Landroid/telephony/TelephonyManager;", "getTelephonyManager", "(Landroid/content/Context;)Landroid/telephony/TelephonyManager;", "uiModeManager", "Landroid/app/UiModeManager;", "getUiModeManager", "(Landroid/content/Context;)Landroid/app/UiModeManager;", "vibrator", "Landroid/os/Vibrator;", "getVibrator", "(Landroid/content/Context;)Landroid/os/Vibrator;", "wifiManager", "Landroid/net/wifi/WifiManager;", "getWifiManager", "(Landroid/content/Context;)Landroid/net/wifi/WifiManager;", "windowManager", "Landroid/view/WindowManager;", "getWindowManager", "(Landroid/content/Context;)Landroid/view/WindowManager;", "getSystemService", "T", "(Landroid/content/Context;)Ljava/lang/Object;", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SystemServiceExtKt {
    public static final /* synthetic */ <T> T getSystemService(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) androidx.core.content.ContextCompat.getSystemService(context, java.lang.Object.class);
    }

    public static final android.view.WindowManager getWindowManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.view.WindowManager) androidx.core.content.ContextCompat.getSystemService(context, android.view.WindowManager.class);
    }

    public static final android.content.ClipboardManager getClipboardManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.content.ClipboardManager) androidx.core.content.ContextCompat.getSystemService(context, android.content.ClipboardManager.class);
    }

    public static final android.view.LayoutInflater getLayoutInflater(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.view.LayoutInflater) androidx.core.content.ContextCompat.getSystemService(context, android.view.LayoutInflater.class);
    }

    public static final android.app.ActivityManager getActivityManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.app.ActivityManager) androidx.core.content.ContextCompat.getSystemService(context, android.app.ActivityManager.class);
    }

    public static final android.os.PowerManager getPowerManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.os.PowerManager) androidx.core.content.ContextCompat.getSystemService(context, android.os.PowerManager.class);
    }

    public static final android.app.AlarmManager getAlarmManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.app.AlarmManager) androidx.core.content.ContextCompat.getSystemService(context, android.app.AlarmManager.class);
    }

    public static final android.app.NotificationManager getNotificationManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.app.NotificationManager) androidx.core.content.ContextCompat.getSystemService(context, android.app.NotificationManager.class);
    }

    public static final android.app.KeyguardManager getKeyguardManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.app.KeyguardManager) androidx.core.content.ContextCompat.getSystemService(context, android.app.KeyguardManager.class);
    }

    public static final android.location.LocationManager getLocationManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.location.LocationManager) androidx.core.content.ContextCompat.getSystemService(context, android.location.LocationManager.class);
    }

    public static final android.app.SearchManager getSearchManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.app.SearchManager) androidx.core.content.ContextCompat.getSystemService(context, android.app.SearchManager.class);
    }

    public static final android.os.storage.StorageManager getStorageManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.os.storage.StorageManager) androidx.core.content.ContextCompat.getSystemService(context, android.os.storage.StorageManager.class);
    }

    public static final android.os.Vibrator getVibrator(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.os.Vibrator) androidx.core.content.ContextCompat.getSystemService(context, android.os.Vibrator.class);
    }

    public static final android.net.ConnectivityManager getConnectivityManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.net.ConnectivityManager) androidx.core.content.ContextCompat.getSystemService(context, android.net.ConnectivityManager.class);
    }

    public static final android.net.wifi.WifiManager getWifiManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.net.wifi.WifiManager) androidx.core.content.ContextCompat.getSystemService(context, android.net.wifi.WifiManager.class);
    }

    public static final android.media.AudioManager getAudioManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.media.AudioManager) androidx.core.content.ContextCompat.getSystemService(context, android.media.AudioManager.class);
    }

    public static final android.media.MediaRouter getMediaRouter(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.media.MediaRouter) androidx.core.content.ContextCompat.getSystemService(context, android.media.MediaRouter.class);
    }

    public static final android.telephony.TelephonyManager getTelephonyManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.telephony.TelephonyManager) androidx.core.content.ContextCompat.getSystemService(context, android.telephony.TelephonyManager.class);
    }

    public static final android.hardware.SensorManager getSensorManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.hardware.SensorManager) androidx.core.content.ContextCompat.getSystemService(context, android.hardware.SensorManager.class);
    }

    public static final android.telephony.SubscriptionManager getSubscriptionManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.telephony.SubscriptionManager) androidx.core.content.ContextCompat.getSystemService(context, android.telephony.SubscriptionManager.class);
    }

    public static final android.telephony.CarrierConfigManager getCarrierConfigManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.telephony.CarrierConfigManager) androidx.core.content.ContextCompat.getSystemService(context, android.telephony.CarrierConfigManager.class);
    }

    public static final android.view.inputmethod.InputMethodManager getInputMethodManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.view.inputmethod.InputMethodManager) androidx.core.content.ContextCompat.getSystemService(context, android.view.inputmethod.InputMethodManager.class);
    }

    public static final android.app.UiModeManager getUiModeManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.app.UiModeManager) androidx.core.content.ContextCompat.getSystemService(context, android.app.UiModeManager.class);
    }

    public static final android.app.DownloadManager getDownloadManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.app.DownloadManager) androidx.core.content.ContextCompat.getSystemService(context, android.app.DownloadManager.class);
    }

    public static final android.os.BatteryManager getBatteryManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.os.BatteryManager) androidx.core.content.ContextCompat.getSystemService(context, android.os.BatteryManager.class);
    }

    public static final android.app.job.JobScheduler getJobScheduler(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.app.job.JobScheduler) androidx.core.content.ContextCompat.getSystemService(context, android.app.job.JobScheduler.class);
    }

    public static final android.view.accessibility.AccessibilityManager getAccessibilityManager(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        return (android.view.accessibility.AccessibilityManager) androidx.core.content.ContextCompat.getSystemService(context, android.view.accessibility.AccessibilityManager.class);
    }
}
