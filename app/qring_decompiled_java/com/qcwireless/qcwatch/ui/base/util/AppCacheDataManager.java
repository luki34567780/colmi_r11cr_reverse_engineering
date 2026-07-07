package com.qcwireless.qcwatch.ui.base.util;

/* loaded from: /tmp/dex/classes2.dex */
public class AppCacheDataManager {
    public static void cleanInternalCache(android.content.Context context) {
        deleteFilesByDirectory(context.getCacheDir());
    }

    public static void cleanDatabases(android.content.Context context) {
        deleteFilesByDirectory(new java.io.File("/data/data/" + context.getPackageName() + "/databases"));
    }

    public static void cleanAppFiles(android.content.Context context) {
        deleteFilesByDirectory(new java.io.File("/data/data/" + context.getPackageName() + "/"));
    }

    public static void cleanSharedPreference(android.content.Context context) {
        deleteFilesByDirectory(new java.io.File("/data/data/" + context.getPackageName() + "/shared_prefs"));
    }

    public static void cleanDatabaseByName(android.content.Context context, java.lang.String dbName) {
        context.deleteDatabase(dbName);
    }

    public static void cleanFiles(android.content.Context context) {
        deleteFilesByDirectory(context.getFilesDir());
    }

    public static void cleanExternalCache(android.content.Context context) {
        if (android.os.Environment.getExternalStorageState().equals("mounted")) {
            deleteFilesByDirectory(context.getExternalCacheDir());
        }
    }

    public static void cleanCustomCache(java.lang.String filePath) {
        deleteFilesByDirectory(new java.io.File(filePath));
    }

    public static void cleanApplicationData(android.content.Context context, java.lang.String... filepath) {
        try {
            cleanInternalCache(context);
            cleanExternalCache(context);
            cleanDatabases(context);
            cleanSharedPreference(context);
            cleanFiles(context);
            for (java.lang.String str : filepath) {
                cleanCustomCache(str);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteFilesByDirectory(java.io.File directory) {
        if (directory != null && directory.exists() && directory.isDirectory()) {
            for (java.io.File file : directory.listFiles()) {
                file.delete();
            }
        }
    }

    public static java.lang.String getTotalCacheSize(android.content.Context context) throws java.lang.Exception {
        long folderSize = getFolderSize(context.getCacheDir());
        if (android.os.Environment.getExternalStorageState().equals("mounted")) {
            folderSize += getFolderSize(context.getExternalCacheDir());
        }
        return getFormatSize(folderSize);
    }

    public static void clearAllCache(android.content.Context context) {
        deleteDir(context.getCacheDir());
        if (android.os.Environment.getExternalStorageState().equals("mounted")) {
            deleteDir(context.getExternalCacheDir());
        }
    }

    private static boolean deleteDir(java.io.File dir) {
        if (dir != null && dir.isDirectory()) {
            for (java.lang.String str : dir.list()) {
                if (!deleteDir(new java.io.File(dir, str))) {
                    return false;
                }
            }
        }
        return dir.delete();
    }

    public static long getFolderSize(java.io.File file) throws java.lang.Exception {
        long length;
        long j = 0;
        try {
            java.io.File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    length = getFolderSize(listFiles[i]);
                } else {
                    length = listFiles[i].length();
                }
                j += length;
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return j;
    }

    public static java.lang.String getFormatSize(double size) {
        double d = size / 1024.0d;
        if (d < 1.0d) {
            return "0K";
        }
        double d2 = d / 1024.0d;
        if (d2 < 1.0d) {
            return new java.math.BigDecimal(java.lang.Double.toString(d)).setScale(2, 4).toPlainString() + "KB";
        }
        double d3 = d2 / 1024.0d;
        if (d3 < 1.0d) {
            return new java.math.BigDecimal(java.lang.Double.toString(d2)).setScale(2, 4).toPlainString() + "MB";
        }
        double d4 = d3 / 1024.0d;
        if (d4 < 1.0d) {
            return new java.math.BigDecimal(java.lang.Double.toString(d3)).setScale(2, 4).toPlainString() + "GB";
        }
        return new java.math.BigDecimal(d4).setScale(2, 4).toPlainString() + "TB";
    }
}
