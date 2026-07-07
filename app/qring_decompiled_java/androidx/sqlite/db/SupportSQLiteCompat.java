package androidx.sqlite.db;

/* loaded from: classes.dex */
public final class SupportSQLiteCompat {
    private SupportSQLiteCompat() {
    }

    public static final class Api16Impl {
        public static void cancel(android.os.CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        public static android.os.CancellationSignal createCancellationSignal() {
            return new android.os.CancellationSignal();
        }

        public static boolean deleteDatabase(java.io.File file) {
            return android.database.sqlite.SQLiteDatabase.deleteDatabase(file);
        }

        public static android.database.Cursor rawQueryWithFactory(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, android.os.CancellationSignal cancellationSignal, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory) {
            return sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
        }

        public static void setForeignKeyConstraintsEnabled(android.database.sqlite.SQLiteDatabase sQLiteDatabase, boolean z) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(z);
        }

        public static void disableWriteAheadLogging(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.disableWriteAheadLogging();
        }

        public static boolean isWriteAheadLoggingEnabled(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }

        public static void setWriteAheadLoggingEnabled(android.database.sqlite.SQLiteOpenHelper sQLiteOpenHelper, boolean z) {
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
        }

        private Api16Impl() {
        }
    }

    public static final class Api19Impl {
        public static android.net.Uri getNotificationUri(android.database.Cursor cursor) {
            return cursor.getNotificationUri();
        }

        public static boolean isLowRamDevice(android.app.ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        private Api19Impl() {
        }
    }

    public static final class Api21Impl {
        public static java.io.File getNoBackupFilesDir(android.content.Context context) {
            return context.getNoBackupFilesDir();
        }

        private Api21Impl() {
        }
    }

    public static final class Api23Impl {
        public static void setExtras(android.database.Cursor cursor, android.os.Bundle bundle) {
            cursor.setExtras(bundle);
        }

        private Api23Impl() {
        }
    }

    public static final class Api29Impl {
        public static void setNotificationUris(android.database.Cursor cursor, android.content.ContentResolver contentResolver, java.util.List<android.net.Uri> list) {
            cursor.setNotificationUris(contentResolver, list);
        }

        public static java.util.List<android.net.Uri> getNotificationUris(android.database.Cursor cursor) {
            return cursor.getNotificationUris();
        }

        private Api29Impl() {
        }
    }
}
