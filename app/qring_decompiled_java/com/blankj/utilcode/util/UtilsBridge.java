package com.blankj.utilcode.util;

/* loaded from: classes.dex */
class UtilsBridge {
    UtilsBridge() {
    }

    static void init(android.app.Application application) {
        com.blankj.utilcode.util.UtilsActivityLifecycleImpl.INSTANCE.init(application);
    }

    static void unInit(android.app.Application application) {
        com.blankj.utilcode.util.UtilsActivityLifecycleImpl.INSTANCE.unInit(application);
    }

    static void preLoad() {
        preLoad(com.blankj.utilcode.util.AdaptScreenUtils.getPreLoadRunnable());
    }

    static android.app.Activity getTopActivity() {
        return com.blankj.utilcode.util.UtilsActivityLifecycleImpl.INSTANCE.getTopActivity();
    }

    static void addOnAppStatusChangedListener(com.blankj.utilcode.util.Utils.OnAppStatusChangedListener onAppStatusChangedListener) {
        com.blankj.utilcode.util.UtilsActivityLifecycleImpl.INSTANCE.addOnAppStatusChangedListener(onAppStatusChangedListener);
    }

    static void removeOnAppStatusChangedListener(com.blankj.utilcode.util.Utils.OnAppStatusChangedListener onAppStatusChangedListener) {
        com.blankj.utilcode.util.UtilsActivityLifecycleImpl.INSTANCE.removeOnAppStatusChangedListener(onAppStatusChangedListener);
    }

    static void addActivityLifecycleCallbacks(com.blankj.utilcode.util.Utils.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        com.blankj.utilcode.util.UtilsActivityLifecycleImpl.INSTANCE.addActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    static void removeActivityLifecycleCallbacks(com.blankj.utilcode.util.Utils.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        com.blankj.utilcode.util.UtilsActivityLifecycleImpl.INSTANCE.removeActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    static void addActivityLifecycleCallbacks(android.app.Activity activity, com.blankj.utilcode.util.Utils.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        com.blankj.utilcode.util.UtilsActivityLifecycleImpl.INSTANCE.addActivityLifecycleCallbacks(activity, activityLifecycleCallbacks);
    }

    static void removeActivityLifecycleCallbacks(android.app.Activity activity) {
        com.blankj.utilcode.util.UtilsActivityLifecycleImpl.INSTANCE.removeActivityLifecycleCallbacks(activity);
    }

    static void removeActivityLifecycleCallbacks(android.app.Activity activity, com.blankj.utilcode.util.Utils.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        com.blankj.utilcode.util.UtilsActivityLifecycleImpl.INSTANCE.removeActivityLifecycleCallbacks(activity, activityLifecycleCallbacks);
    }

    static java.util.List<android.app.Activity> getActivityList() {
        return com.blankj.utilcode.util.UtilsActivityLifecycleImpl.INSTANCE.getActivityList();
    }

    static android.app.Application getApplicationByReflect() {
        return com.blankj.utilcode.util.UtilsActivityLifecycleImpl.INSTANCE.getApplicationByReflect();
    }

    static boolean isAppForeground() {
        return com.blankj.utilcode.util.UtilsActivityLifecycleImpl.INSTANCE.isAppForeground();
    }

    static boolean isActivityAlive(android.app.Activity activity) {
        return com.blankj.utilcode.util.ActivityUtils.isActivityAlive(activity);
    }

    static java.lang.String getLauncherActivity(java.lang.String str) {
        return com.blankj.utilcode.util.ActivityUtils.getLauncherActivity(str);
    }

    static android.app.Activity getActivityByContext(android.content.Context context) {
        return com.blankj.utilcode.util.ActivityUtils.getActivityByContext(context);
    }

    static void startHomeActivity() {
        com.blankj.utilcode.util.ActivityUtils.startHomeActivity();
    }

    static void finishAllActivities() {
        com.blankj.utilcode.util.ActivityUtils.finishAllActivities();
    }

    static boolean isAppRunning(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'pkgName' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return com.blankj.utilcode.util.AppUtils.isAppRunning(str);
    }

    static boolean isAppInstalled(java.lang.String str) {
        return com.blankj.utilcode.util.AppUtils.isAppInstalled(str);
    }

    static boolean isAppDebug() {
        return com.blankj.utilcode.util.AppUtils.isAppDebug();
    }

    static void relaunchApp() {
        com.blankj.utilcode.util.AppUtils.relaunchApp();
    }

    static int getStatusBarHeight() {
        return com.blankj.utilcode.util.BarUtils.getStatusBarHeight();
    }

    static int getNavBarHeight() {
        return com.blankj.utilcode.util.BarUtils.getNavBarHeight();
    }

    static java.lang.String bytes2HexString(byte[] bArr) {
        return com.blankj.utilcode.util.ConvertUtils.bytes2HexString(bArr);
    }

    static byte[] hexString2Bytes(java.lang.String str) {
        return com.blankj.utilcode.util.ConvertUtils.hexString2Bytes(str);
    }

    static byte[] string2Bytes(java.lang.String str) {
        return com.blankj.utilcode.util.ConvertUtils.string2Bytes(str);
    }

    static java.lang.String bytes2String(byte[] bArr) {
        return com.blankj.utilcode.util.ConvertUtils.bytes2String(bArr);
    }

    static byte[] jsonObject2Bytes(org.json.JSONObject jSONObject) {
        return com.blankj.utilcode.util.ConvertUtils.jsonObject2Bytes(jSONObject);
    }

    static org.json.JSONObject bytes2JSONObject(byte[] bArr) {
        return com.blankj.utilcode.util.ConvertUtils.bytes2JSONObject(bArr);
    }

    static byte[] jsonArray2Bytes(org.json.JSONArray jSONArray) {
        return com.blankj.utilcode.util.ConvertUtils.jsonArray2Bytes(jSONArray);
    }

    static org.json.JSONArray bytes2JSONArray(byte[] bArr) {
        return com.blankj.utilcode.util.ConvertUtils.bytes2JSONArray(bArr);
    }

    static byte[] parcelable2Bytes(android.os.Parcelable parcelable) {
        return com.blankj.utilcode.util.ConvertUtils.parcelable2Bytes(parcelable);
    }

    static <T> T bytes2Parcelable(byte[] bArr, android.os.Parcelable.Creator<T> creator) {
        return (T) com.blankj.utilcode.util.ConvertUtils.bytes2Parcelable(bArr, creator);
    }

    static byte[] serializable2Bytes(java.io.Serializable serializable) {
        return com.blankj.utilcode.util.ConvertUtils.serializable2Bytes(serializable);
    }

    static java.lang.Object bytes2Object(byte[] bArr) {
        return com.blankj.utilcode.util.ConvertUtils.bytes2Object(bArr);
    }

    static java.lang.String byte2FitMemorySize(long j) {
        return com.blankj.utilcode.util.ConvertUtils.byte2FitMemorySize(j);
    }

    static byte[] inputStream2Bytes(java.io.InputStream inputStream) {
        return com.blankj.utilcode.util.ConvertUtils.inputStream2Bytes(inputStream);
    }

    static java.io.ByteArrayOutputStream input2OutputStream(java.io.InputStream inputStream) {
        return com.blankj.utilcode.util.ConvertUtils.input2OutputStream(inputStream);
    }

    static java.util.List<java.lang.String> inputStream2Lines(java.io.InputStream inputStream, java.lang.String str) {
        return com.blankj.utilcode.util.ConvertUtils.inputStream2Lines(inputStream, str);
    }

    static boolean isValid(android.view.View view, long j) {
        java.util.Objects.requireNonNull(view, "Argument 'view' of type View (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return com.blankj.utilcode.util.DebouncingUtils.isValid(view, j);
    }

    static byte[] base64Encode(byte[] bArr) {
        return com.blankj.utilcode.util.EncodeUtils.base64Encode(bArr);
    }

    static byte[] base64Decode(byte[] bArr) {
        return com.blankj.utilcode.util.EncodeUtils.base64Decode(bArr);
    }

    static byte[] hashTemplate(byte[] bArr, java.lang.String str) {
        return com.blankj.utilcode.util.EncryptUtils.hashTemplate(bArr, str);
    }

    static boolean writeFileFromBytes(java.io.File file, byte[] bArr) {
        return com.blankj.utilcode.util.FileIOUtils.writeFileFromBytesByChannel(file, bArr, true);
    }

    static byte[] readFile2Bytes(java.io.File file) {
        return com.blankj.utilcode.util.FileIOUtils.readFile2BytesByChannel(file);
    }

    static boolean writeFileFromString(java.lang.String str, java.lang.String str2, boolean z) {
        return com.blankj.utilcode.util.FileIOUtils.writeFileFromString(str, str2, z);
    }

    static boolean writeFileFromIS(java.lang.String str, java.io.InputStream inputStream) {
        return com.blankj.utilcode.util.FileIOUtils.writeFileFromIS(str, inputStream);
    }

    static boolean isFileExists(java.io.File file) {
        return com.blankj.utilcode.util.FileUtils.isFileExists(file);
    }

    static java.io.File getFileByPath(java.lang.String str) {
        return com.blankj.utilcode.util.FileUtils.getFileByPath(str);
    }

    static boolean deleteAllInDir(java.io.File file) {
        return com.blankj.utilcode.util.FileUtils.deleteAllInDir(file);
    }

    static boolean createOrExistsFile(java.io.File file) {
        return com.blankj.utilcode.util.FileUtils.createOrExistsFile(file);
    }

    static boolean createOrExistsDir(java.io.File file) {
        return com.blankj.utilcode.util.FileUtils.createOrExistsDir(file);
    }

    static boolean createFileByDeleteOldFile(java.io.File file) {
        return com.blankj.utilcode.util.FileUtils.createFileByDeleteOldFile(file);
    }

    static long getFsTotalSize(java.lang.String str) {
        return com.blankj.utilcode.util.FileUtils.getFsTotalSize(str);
    }

    static long getFsAvailableSize(java.lang.String str) {
        return com.blankj.utilcode.util.FileUtils.getFsAvailableSize(str);
    }

    static void notifySystemToScan(java.io.File file) {
        com.blankj.utilcode.util.FileUtils.notifySystemToScan(file);
    }

    static java.lang.String toJson(java.lang.Object obj) {
        return com.blankj.utilcode.util.GsonUtils.toJson(obj);
    }

    static <T> T fromJson(java.lang.String str, java.lang.reflect.Type type) {
        return (T) com.blankj.utilcode.util.GsonUtils.fromJson(str, type);
    }

    static com.google.gson.Gson getGson4LogUtils() {
        return com.blankj.utilcode.util.GsonUtils.getGson4LogUtils();
    }

    static byte[] bitmap2Bytes(android.graphics.Bitmap bitmap) {
        return com.blankj.utilcode.util.ImageUtils.bitmap2Bytes(bitmap);
    }

    static byte[] bitmap2Bytes(android.graphics.Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressFormat, int i) {
        return com.blankj.utilcode.util.ImageUtils.bitmap2Bytes(bitmap, compressFormat, i);
    }

    static android.graphics.Bitmap bytes2Bitmap(byte[] bArr) {
        return com.blankj.utilcode.util.ImageUtils.bytes2Bitmap(bArr);
    }

    static byte[] drawable2Bytes(android.graphics.drawable.Drawable drawable) {
        return com.blankj.utilcode.util.ImageUtils.drawable2Bytes(drawable);
    }

    static byte[] drawable2Bytes(android.graphics.drawable.Drawable drawable, android.graphics.Bitmap.CompressFormat compressFormat, int i) {
        return com.blankj.utilcode.util.ImageUtils.drawable2Bytes(drawable, compressFormat, i);
    }

    static android.graphics.drawable.Drawable bytes2Drawable(byte[] bArr) {
        return com.blankj.utilcode.util.ImageUtils.bytes2Drawable(bArr);
    }

    static android.graphics.Bitmap view2Bitmap(android.view.View view) {
        return com.blankj.utilcode.util.ImageUtils.view2Bitmap(view);
    }

    static android.graphics.Bitmap drawable2Bitmap(android.graphics.drawable.Drawable drawable) {
        return com.blankj.utilcode.util.ImageUtils.drawable2Bitmap(drawable);
    }

    static android.graphics.drawable.Drawable bitmap2Drawable(android.graphics.Bitmap bitmap) {
        return com.blankj.utilcode.util.ImageUtils.bitmap2Drawable(bitmap);
    }

    static boolean isIntentAvailable(android.content.Intent intent) {
        return com.blankj.utilcode.util.IntentUtils.isIntentAvailable(intent);
    }

    static android.content.Intent getLaunchAppIntent(java.lang.String str) {
        return com.blankj.utilcode.util.IntentUtils.getLaunchAppIntent(str);
    }

    static android.content.Intent getInstallAppIntent(java.io.File file) {
        return com.blankj.utilcode.util.IntentUtils.getInstallAppIntent(file);
    }

    static android.content.Intent getInstallAppIntent(android.net.Uri uri) {
        return com.blankj.utilcode.util.IntentUtils.getInstallAppIntent(uri);
    }

    static android.content.Intent getUninstallAppIntent(java.lang.String str) {
        return com.blankj.utilcode.util.IntentUtils.getUninstallAppIntent(str);
    }

    static android.content.Intent getDialIntent(java.lang.String str) {
        return com.blankj.utilcode.util.IntentUtils.getDialIntent(str);
    }

    static android.content.Intent getCallIntent(java.lang.String str) {
        return com.blankj.utilcode.util.IntentUtils.getCallIntent(str);
    }

    static android.content.Intent getSendSmsIntent(java.lang.String str, java.lang.String str2) {
        return com.blankj.utilcode.util.IntentUtils.getSendSmsIntent(str, str2);
    }

    static android.content.Intent getLaunchAppDetailsSettingsIntent(java.lang.String str, boolean z) {
        return com.blankj.utilcode.util.IntentUtils.getLaunchAppDetailsSettingsIntent(str, z);
    }

    static java.lang.String formatJson(java.lang.String str) {
        return com.blankj.utilcode.util.JsonUtils.formatJson(str);
    }

    static void fixSoftInputLeaks(android.app.Activity activity) {
        com.blankj.utilcode.util.KeyboardUtils.fixSoftInputLeaks(activity);
    }

    static android.app.Notification getNotification(com.blankj.utilcode.util.NotificationUtils.ChannelConfig channelConfig, com.blankj.utilcode.util.Utils.Consumer<androidx.core.app.NotificationCompat.Builder> consumer) {
        return com.blankj.utilcode.util.NotificationUtils.getNotification(channelConfig, consumer);
    }

    static boolean isGranted(java.lang.String... strArr) {
        return com.blankj.utilcode.util.PermissionUtils.isGranted(strArr);
    }

    static boolean isGrantedDrawOverlays() {
        return com.blankj.utilcode.util.PermissionUtils.isGrantedDrawOverlays();
    }

    static boolean isMainProcess() {
        return com.blankj.utilcode.util.ProcessUtils.isMainProcess();
    }

    static java.lang.String getForegroundProcessName() {
        return com.blankj.utilcode.util.ProcessUtils.getForegroundProcessName();
    }

    static java.lang.String getCurrentProcessName() {
        return com.blankj.utilcode.util.ProcessUtils.getCurrentProcessName();
    }

    static boolean isSamsung() {
        return com.blankj.utilcode.util.RomUtils.isSamsung();
    }

    static int getAppScreenWidth() {
        return com.blankj.utilcode.util.ScreenUtils.getAppScreenWidth();
    }

    static boolean isSDCardEnableByEnvironment() {
        return com.blankj.utilcode.util.SDCardUtils.isSDCardEnableByEnvironment();
    }

    static boolean isServiceRunning(java.lang.String str) {
        return com.blankj.utilcode.util.ServiceUtils.isServiceRunning(str);
    }

    static com.blankj.utilcode.util.ShellUtils.CommandResult execCmd(java.lang.String str, boolean z) {
        return com.blankj.utilcode.util.ShellUtils.execCmd(str, z);
    }

    static int dp2px(float f) {
        return com.blankj.utilcode.util.SizeUtils.dp2px(f);
    }

    static int px2dp(float f) {
        return com.blankj.utilcode.util.SizeUtils.px2dp(f);
    }

    static int sp2px(float f) {
        return com.blankj.utilcode.util.SizeUtils.sp2px(f);
    }

    static int px2sp(float f) {
        return com.blankj.utilcode.util.SizeUtils.px2sp(f);
    }

    static com.blankj.utilcode.util.SPUtils getSpUtils4Utils() {
        return com.blankj.utilcode.util.SPUtils.getInstance("Utils");
    }

    static boolean isSpace(java.lang.String str) {
        return com.blankj.utilcode.util.StringUtils.isSpace(str);
    }

    static boolean equals(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        return com.blankj.utilcode.util.StringUtils.equals(charSequence, charSequence2);
    }

    static java.lang.String getString(int i) {
        return com.blankj.utilcode.util.StringUtils.getString(i);
    }

    static java.lang.String getString(int i, java.lang.Object... objArr) {
        return com.blankj.utilcode.util.StringUtils.getString(i, objArr);
    }

    static java.lang.String format(java.lang.String str, java.lang.Object... objArr) {
        return com.blankj.utilcode.util.StringUtils.format(str, objArr);
    }

    static <T> com.blankj.utilcode.util.Utils.Task<T> doAsync(com.blankj.utilcode.util.Utils.Task<T> task) {
        com.blankj.utilcode.util.ThreadUtils.getCachedPool().execute(task);
        return task;
    }

    static void runOnUiThread(java.lang.Runnable runnable) {
        com.blankj.utilcode.util.ThreadUtils.runOnUiThread(runnable);
    }

    static void runOnUiThreadDelayed(java.lang.Runnable runnable, long j) {
        com.blankj.utilcode.util.ThreadUtils.runOnUiThreadDelayed(runnable, j);
    }

    static java.lang.String getFullStackTrace(java.lang.Throwable th) {
        return com.blankj.utilcode.util.ThrowableUtils.getFullStackTrace(th);
    }

    static java.lang.String millis2FitTimeSpan(long j, int i) {
        return com.blankj.utilcode.util.TimeUtils.millis2FitTimeSpan(j, i);
    }

    static void toastShowShort(java.lang.CharSequence charSequence) {
        com.blankj.utilcode.util.ToastUtils.showShort(charSequence);
    }

    static void toastCancel() {
        com.blankj.utilcode.util.ToastUtils.cancel();
    }

    private static void preLoad(java.lang.Runnable... runnableArr) {
        for (java.lang.Runnable runnable : runnableArr) {
            com.blankj.utilcode.util.ThreadUtils.getCachedPool().execute(runnable);
        }
    }

    static android.net.Uri file2Uri(java.io.File file) {
        return com.blankj.utilcode.util.UriUtils.file2Uri(file);
    }

    static java.io.File uri2File(android.net.Uri uri) {
        return com.blankj.utilcode.util.UriUtils.uri2File(uri);
    }

    static android.view.View layoutId2View(int i) {
        return com.blankj.utilcode.util.ViewUtils.layoutId2View(i);
    }

    static boolean isLayoutRtl() {
        return com.blankj.utilcode.util.ViewUtils.isLayoutRtl();
    }

    static final class FileHead {
        private java.util.LinkedHashMap<java.lang.String, java.lang.String> mFirst = new java.util.LinkedHashMap<>();
        private java.util.LinkedHashMap<java.lang.String, java.lang.String> mLast = new java.util.LinkedHashMap<>();
        private java.lang.String mName;

        FileHead(java.lang.String str) {
            this.mName = str;
        }

        void addFirst(java.lang.String str, java.lang.String str2) {
            append2Host(this.mFirst, str, str2);
        }

        void append(java.util.Map<java.lang.String, java.lang.String> map) {
            append2Host(this.mLast, map);
        }

        void append(java.lang.String str, java.lang.String str2) {
            append2Host(this.mLast, str, str2);
        }

        private void append2Host(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2) {
            if (map2 == null || map2.isEmpty()) {
                return;
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map2.entrySet()) {
                append2Host(map, entry.getKey(), entry.getValue());
            }
        }

        private void append2Host(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.String str2) {
            if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
                return;
            }
            int length = 19 - str.length();
            if (length > 0) {
                str = str + "                   ".substring(0, length);
            }
            map.put(str, str2);
        }

        public java.lang.String getAppended() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.mLast.entrySet()) {
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
                sb.append("\n");
            }
            return sb.toString();
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = "************* " + this.mName + " Head ****************\n";
            sb.append(str);
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.mFirst.entrySet()) {
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
                sb.append("\n");
            }
            sb.append("Rom Info           : ");
            sb.append(com.blankj.utilcode.util.RomUtils.getRomInfo());
            sb.append("\n");
            sb.append("Device Manufacturer: ");
            sb.append(android.os.Build.MANUFACTURER);
            sb.append("\n");
            sb.append("Device Model       : ");
            sb.append(android.os.Build.MODEL);
            sb.append("\n");
            sb.append("Android Version    : ");
            sb.append(android.os.Build.VERSION.RELEASE);
            sb.append("\n");
            sb.append("Android SDK        : ");
            sb.append(android.os.Build.VERSION.SDK_INT);
            sb.append("\n");
            sb.append("App VersionName    : ");
            sb.append(com.blankj.utilcode.util.AppUtils.getAppVersionName());
            sb.append("\n");
            sb.append("App VersionCode    : ");
            sb.append(com.blankj.utilcode.util.AppUtils.getAppVersionCode());
            sb.append("\n");
            sb.append(getAppended());
            sb.append(str);
            sb.append("\n");
            return sb.toString();
        }
    }
}
