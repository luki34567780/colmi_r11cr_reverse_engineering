package androidx.work.impl;

/* loaded from: classes.dex */
public class WorkDatabasePathHelper {
    private static final java.lang.String WORK_DATABASE_NAME = "androidx.work.workdb";
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("WrkDbPathHelper");
    private static final java.lang.String[] DATABASE_EXTRA_FILES = {"-journal", "-shm", "-wal"};

    public static java.lang.String getWorkDatabaseName() {
        return WORK_DATABASE_NAME;
    }

    private WorkDatabasePathHelper() {
    }

    public static void migrateDatabase(android.content.Context context) {
        java.lang.String format;
        java.io.File defaultDatabasePath = getDefaultDatabasePath(context);
        if (android.os.Build.VERSION.SDK_INT < 23 || !defaultDatabasePath.exists()) {
            return;
        }
        androidx.work.Logger.get().debug(TAG, "Migrating WorkDatabase to the no-backup directory", new java.lang.Throwable[0]);
        java.util.Map<java.io.File, java.io.File> migrationPaths = migrationPaths(context);
        for (java.io.File file : migrationPaths.keySet()) {
            java.io.File file2 = migrationPaths.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    androidx.work.Logger.get().warning(TAG, java.lang.String.format("Over-writing contents of %s", file2), new java.lang.Throwable[0]);
                }
                if (file.renameTo(file2)) {
                    format = java.lang.String.format("Migrated %s to %s", file, file2);
                } else {
                    format = java.lang.String.format("Renaming %s to %s failed", file, file2);
                }
                androidx.work.Logger.get().debug(TAG, format, new java.lang.Throwable[0]);
            }
        }
    }

    public static java.util.Map<java.io.File, java.io.File> migrationPaths(android.content.Context context) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            java.io.File defaultDatabasePath = getDefaultDatabasePath(context);
            java.io.File databasePath = getDatabasePath(context);
            hashMap.put(defaultDatabasePath, databasePath);
            for (java.lang.String str : DATABASE_EXTRA_FILES) {
                hashMap.put(new java.io.File(defaultDatabasePath.getPath() + str), new java.io.File(databasePath.getPath() + str));
            }
        }
        return hashMap;
    }

    public static java.io.File getDefaultDatabasePath(android.content.Context context) {
        return context.getDatabasePath(WORK_DATABASE_NAME);
    }

    public static java.io.File getDatabasePath(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT < 23) {
            return getDefaultDatabasePath(context);
        }
        return getNoBackupPath(context, WORK_DATABASE_NAME);
    }

    private static java.io.File getNoBackupPath(android.content.Context context, java.lang.String filePath) {
        return new java.io.File(context.getNoBackupFilesDir(), filePath);
    }
}
