package com.bumptech.glide.load.engine.executor;

/* loaded from: /tmp/dex/classes2.dex */
final class RuntimeCompat {
    private static final java.lang.String CPU_LOCATION = "/sys/devices/system/cpu/";
    private static final java.lang.String CPU_NAME_REGEX = "cpu[0-9]+";
    private static final java.lang.String TAG = "GlideRuntimeCompat";

    private RuntimeCompat() {
    }

    static int availableProcessors() {
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        return android.os.Build.VERSION.SDK_INT < 17 ? java.lang.Math.max(getCoreCountPre17(), availableProcessors) : availableProcessors;
    }

    private static int getCoreCountPre17() {
        java.io.File[] fileArr;
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            java.io.File file = new java.io.File(CPU_LOCATION);
            final java.util.regex.Pattern compile = java.util.regex.Pattern.compile(CPU_NAME_REGEX);
            fileArr = file.listFiles(new java.io.FilenameFilter() { // from class: com.bumptech.glide.load.engine.executor.RuntimeCompat.1
                @Override // java.io.FilenameFilter
                public boolean accept(java.io.File file2, java.lang.String str) {
                    return compile.matcher(str).matches();
                }
            });
        } catch (java.lang.Throwable th) {
            try {
                if (android.util.Log.isLoggable(TAG, 6)) {
                    android.util.Log.e(TAG, "Failed to calculate accurate cpu count", th);
                }
                android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                fileArr = null;
            } finally {
                android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        return java.lang.Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
