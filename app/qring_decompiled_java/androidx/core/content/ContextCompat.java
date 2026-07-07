package androidx.core.content;

/* loaded from: classes.dex */
public class ContextCompat {
    private static final java.lang.String TAG = "ContextCompat";
    private static final java.lang.Object sLock = new java.lang.Object();
    private static final java.lang.Object sSync = new java.lang.Object();
    private static android.util.TypedValue sTempValue;

    protected ContextCompat() {
    }

    public static java.lang.String getAttributionTag(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.content.ContextCompat.Api30Impl.getAttributionTag(context);
        }
        return null;
    }

    public static boolean startActivities(android.content.Context context, android.content.Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static boolean startActivities(android.content.Context context, android.content.Intent[] intentArr, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            androidx.core.content.ContextCompat.Api16Impl.startActivities(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static void startActivity(android.content.Context context, android.content.Intent intent, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            androidx.core.content.ContextCompat.Api16Impl.startActivity(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static java.io.File getDataDir(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.content.ContextCompat.Api24Impl.getDataDir(context);
        }
        java.lang.String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new java.io.File(str);
        }
        return null;
    }

    public static java.io.File[] getObbDirs(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 19 ? androidx.core.content.ContextCompat.Api19Impl.getObbDirs(context) : new java.io.File[]{context.getObbDir()};
    }

    public static java.io.File[] getExternalFilesDirs(android.content.Context context, java.lang.String str) {
        return android.os.Build.VERSION.SDK_INT >= 19 ? androidx.core.content.ContextCompat.Api19Impl.getExternalFilesDirs(context, str) : new java.io.File[]{context.getExternalFilesDir(str)};
    }

    public static java.io.File[] getExternalCacheDirs(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 19 ? androidx.core.content.ContextCompat.Api19Impl.getExternalCacheDirs(context) : new java.io.File[]{context.getExternalCacheDir()};
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context context, int i) {
        int i2;
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return androidx.core.content.ContextCompat.Api21Impl.getDrawable(context, i);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (sLock) {
            if (sTempValue == null) {
                sTempValue = new android.util.TypedValue();
            }
            context.getResources().getValue(i, sTempValue, true);
            i2 = sTempValue.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context context, int i) {
        return androidx.core.content.res.ResourcesCompat.getColorStateList(context.getResources(), i, context.getTheme());
    }

    public static int getColor(android.content.Context context, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return androidx.core.content.ContextCompat.Api23Impl.getColor(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static int checkSelfPermission(android.content.Context context, java.lang.String str) {
        androidx.core.util.ObjectsCompat.requireNonNull(str, "permission must be non-null");
        return context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid());
    }

    public static java.io.File getNoBackupFilesDir(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return androidx.core.content.ContextCompat.Api21Impl.getNoBackupFilesDir(context);
        }
        return createFilesDir(new java.io.File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    public static java.io.File getCodeCacheDir(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return androidx.core.content.ContextCompat.Api21Impl.getCodeCacheDir(context);
        }
        return createFilesDir(new java.io.File(context.getApplicationInfo().dataDir, "code_cache"));
    }

    private static java.io.File createFilesDir(java.io.File file) {
        synchronized (sSync) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                android.util.Log.w(TAG, "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    public static android.content.Context createDeviceProtectedStorageContext(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.content.ContextCompat.Api24Impl.createDeviceProtectedStorageContext(context);
        }
        return null;
    }

    public static boolean isDeviceProtectedStorage(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.content.ContextCompat.Api24Impl.isDeviceProtectedStorage(context);
        }
        return false;
    }

    public static java.util.concurrent.Executor getMainExecutor(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.content.ContextCompat.Api28Impl.getMainExecutor(context);
        }
        return androidx.core.os.ExecutorCompat.create(new android.os.Handler(context.getMainLooper()));
    }

    public static void startForegroundService(android.content.Context context, android.content.Intent intent) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.content.ContextCompat.Api26Impl.startForegroundService(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static <T> T getSystemService(android.content.Context context, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return (T) androidx.core.content.ContextCompat.Api23Impl.getSystemService(context, cls);
        }
        java.lang.String systemServiceName = getSystemServiceName(context, cls);
        if (systemServiceName != null) {
            return (T) context.getSystemService(systemServiceName);
        }
        return null;
    }

    public static java.lang.String getSystemServiceName(android.content.Context context, java.lang.Class<?> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return androidx.core.content.ContextCompat.Api23Impl.getSystemServiceName(context, cls);
        }
        return androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES.get(cls);
    }

    private static final class LegacyServiceMapHolder {
        static final java.util.HashMap<java.lang.Class<?>, java.lang.String> SERVICES;

        private LegacyServiceMapHolder() {
        }

        static {
            java.util.HashMap<java.lang.Class<?>, java.lang.String> hashMap = new java.util.HashMap<>();
            SERVICES = hashMap;
            if (android.os.Build.VERSION.SDK_INT >= 22) {
                hashMap.put(android.telephony.SubscriptionManager.class, "telephony_subscription_service");
                hashMap.put(android.app.usage.UsageStatsManager.class, "usagestats");
            }
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                hashMap.put(android.appwidget.AppWidgetManager.class, "appwidget");
                hashMap.put(android.os.BatteryManager.class, "batterymanager");
                hashMap.put(android.hardware.camera2.CameraManager.class, "camera");
                hashMap.put(android.app.job.JobScheduler.class, "jobscheduler");
                hashMap.put(android.content.pm.LauncherApps.class, "launcherapps");
                hashMap.put(android.media.projection.MediaProjectionManager.class, "media_projection");
                hashMap.put(android.media.session.MediaSessionManager.class, "media_session");
                hashMap.put(android.content.RestrictionsManager.class, "restrictions");
                hashMap.put(android.telecom.TelecomManager.class, "telecom");
                hashMap.put(android.media.tv.TvInputManager.class, "tv_input");
            }
            if (android.os.Build.VERSION.SDK_INT >= 19) {
                hashMap.put(android.app.AppOpsManager.class, "appops");
                hashMap.put(android.view.accessibility.CaptioningManager.class, "captioning");
                hashMap.put(android.hardware.ConsumerIrManager.class, "consumer_ir");
                hashMap.put(android.print.PrintManager.class, "print");
            }
            if (android.os.Build.VERSION.SDK_INT >= 18) {
                hashMap.put(android.bluetooth.BluetoothManager.class, "bluetooth");
            }
            if (android.os.Build.VERSION.SDK_INT >= 17) {
                hashMap.put(android.hardware.display.DisplayManager.class, "display");
                hashMap.put(android.os.UserManager.class, "user");
            }
            if (android.os.Build.VERSION.SDK_INT >= 16) {
                hashMap.put(android.hardware.input.InputManager.class, "input");
                hashMap.put(android.media.MediaRouter.class, "media_router");
                hashMap.put(android.net.nsd.NsdManager.class, "servicediscovery");
            }
            hashMap.put(android.view.accessibility.AccessibilityManager.class, "accessibility");
            hashMap.put(android.accounts.AccountManager.class, "account");
            hashMap.put(android.app.ActivityManager.class, "activity");
            hashMap.put(android.app.AlarmManager.class, androidx.core.app.NotificationCompat.CATEGORY_ALARM);
            hashMap.put(android.media.AudioManager.class, com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO);
            hashMap.put(android.content.ClipboardManager.class, "clipboard");
            hashMap.put(android.net.ConnectivityManager.class, "connectivity");
            hashMap.put(android.app.admin.DevicePolicyManager.class, "device_policy");
            hashMap.put(android.app.DownloadManager.class, "download");
            hashMap.put(android.os.DropBoxManager.class, "dropbox");
            hashMap.put(android.view.inputmethod.InputMethodManager.class, "input_method");
            hashMap.put(android.app.KeyguardManager.class, "keyguard");
            hashMap.put(android.view.LayoutInflater.class, "layout_inflater");
            hashMap.put(android.location.LocationManager.class, "location");
            hashMap.put(android.nfc.NfcManager.class, "nfc");
            hashMap.put(android.app.NotificationManager.class, "notification");
            hashMap.put(android.os.PowerManager.class, "power");
            hashMap.put(android.app.SearchManager.class, "search");
            hashMap.put(android.hardware.SensorManager.class, "sensor");
            hashMap.put(android.os.storage.StorageManager.class, "storage");
            hashMap.put(android.telephony.TelephonyManager.class, "phone");
            hashMap.put(android.view.textservice.TextServicesManager.class, "textservices");
            hashMap.put(android.app.UiModeManager.class, "uimode");
            hashMap.put(android.hardware.usb.UsbManager.class, "usb");
            hashMap.put(android.os.Vibrator.class, "vibrator");
            hashMap.put(android.app.WallpaperManager.class, "wallpaper");
            hashMap.put(android.net.wifi.p2p.WifiP2pManager.class, "wifip2p");
            hashMap.put(android.net.wifi.WifiManager.class, "wifi");
            hashMap.put(android.view.WindowManager.class, "window");
        }
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static void startActivities(android.content.Context context, android.content.Intent[] intentArr, android.os.Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        static void startActivity(android.content.Context context, android.content.Intent intent, android.os.Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static java.io.File[] getExternalCacheDirs(android.content.Context context) {
            return context.getExternalCacheDirs();
        }

        static java.io.File[] getExternalFilesDirs(android.content.Context context, java.lang.String str) {
            return context.getExternalFilesDirs(str);
        }

        static java.io.File[] getObbDirs(android.content.Context context) {
            return context.getObbDirs();
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static android.graphics.drawable.Drawable getDrawable(android.content.Context context, int i) {
            return context.getDrawable(i);
        }

        static java.io.File getNoBackupFilesDir(android.content.Context context) {
            return context.getNoBackupFilesDir();
        }

        static java.io.File getCodeCacheDir(android.content.Context context) {
            return context.getCodeCacheDir();
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static int getColor(android.content.Context context, int i) {
            return context.getColor(i);
        }

        static <T> T getSystemService(android.content.Context context, java.lang.Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static java.lang.String getSystemServiceName(android.content.Context context, java.lang.Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static java.io.File getDataDir(android.content.Context context) {
            return context.getDataDir();
        }

        static android.content.Context createDeviceProtectedStorageContext(android.content.Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static boolean isDeviceProtectedStorage(android.content.Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static android.content.ComponentName startForegroundService(android.content.Context context, android.content.Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static java.util.concurrent.Executor getMainExecutor(android.content.Context context) {
            return context.getMainExecutor();
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static java.lang.String getAttributionTag(android.content.Context context) {
            return context.getAttributionTag();
        }
    }
}
