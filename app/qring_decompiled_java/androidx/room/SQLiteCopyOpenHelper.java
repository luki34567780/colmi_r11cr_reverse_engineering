package androidx.room;

/* loaded from: classes.dex */
class SQLiteCopyOpenHelper implements androidx.sqlite.db.SupportSQLiteOpenHelper, androidx.room.DelegatingOpenHelper {
    private final android.content.Context mContext;
    private final java.lang.String mCopyFromAssetPath;
    private final java.io.File mCopyFromFile;
    private final java.util.concurrent.Callable<java.io.InputStream> mCopyFromInputStream;
    private androidx.room.DatabaseConfiguration mDatabaseConfiguration;
    private final int mDatabaseVersion;
    private final androidx.sqlite.db.SupportSQLiteOpenHelper mDelegate;
    private boolean mVerified;

    SQLiteCopyOpenHelper(android.content.Context context, java.lang.String str, java.io.File file, java.util.concurrent.Callable<java.io.InputStream> callable, int i, androidx.sqlite.db.SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        this.mContext = context;
        this.mCopyFromAssetPath = str;
        this.mCopyFromFile = file;
        this.mCopyFromInputStream = callable;
        this.mDatabaseVersion = i;
        this.mDelegate = supportSQLiteOpenHelper;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public java.lang.String getDatabaseName() {
        return this.mDelegate.getDatabaseName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.mDelegate.setWriteAheadLoggingEnabled(z);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public synchronized androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase() {
        if (!this.mVerified) {
            verifyDatabaseFile(true);
            this.mVerified = true;
        }
        return this.mDelegate.getWritableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public synchronized androidx.sqlite.db.SupportSQLiteDatabase getReadableDatabase() {
        if (!this.mVerified) {
            verifyDatabaseFile(false);
            this.mVerified = true;
        }
        return this.mDelegate.getReadableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.mDelegate.close();
        this.mVerified = false;
    }

    @Override // androidx.room.DelegatingOpenHelper
    public androidx.sqlite.db.SupportSQLiteOpenHelper getDelegate() {
        return this.mDelegate;
    }

    void setDatabaseConfiguration(androidx.room.DatabaseConfiguration databaseConfiguration) {
        this.mDatabaseConfiguration = databaseConfiguration;
    }

    private void verifyDatabaseFile(boolean z) {
        java.lang.String databaseName = getDatabaseName();
        java.io.File databasePath = this.mContext.getDatabasePath(databaseName);
        androidx.room.DatabaseConfiguration databaseConfiguration = this.mDatabaseConfiguration;
        androidx.room.util.CopyLock copyLock = new androidx.room.util.CopyLock(databaseName, this.mContext.getFilesDir(), databaseConfiguration == null || databaseConfiguration.multiInstanceInvalidation);
        try {
            copyLock.lock();
            if (!databasePath.exists()) {
                try {
                    copyDatabaseFile(databasePath, z);
                    copyLock.unlock();
                    return;
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException("Unable to copy database file.", e);
                }
            }
            if (this.mDatabaseConfiguration == null) {
                copyLock.unlock();
                return;
            }
            try {
                int readVersion = androidx.room.util.DBUtil.readVersion(databasePath);
                int i = this.mDatabaseVersion;
                if (readVersion == i) {
                    copyLock.unlock();
                    return;
                }
                if (this.mDatabaseConfiguration.isMigrationRequired(readVersion, i)) {
                    copyLock.unlock();
                    return;
                }
                if (this.mContext.deleteDatabase(databaseName)) {
                    try {
                        copyDatabaseFile(databasePath, z);
                    } catch (java.io.IOException e2) {
                        android.util.Log.w("ROOM", "Unable to copy database file.", e2);
                    }
                } else {
                    android.util.Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                copyLock.unlock();
                return;
            } catch (java.io.IOException e3) {
                android.util.Log.w("ROOM", "Unable to read database version.", e3);
                copyLock.unlock();
                return;
            }
        } catch (java.lang.Throwable th) {
            copyLock.unlock();
            throw th;
        }
        copyLock.unlock();
        throw th;
    }

    private void copyDatabaseFile(java.io.File file, boolean z) throws java.io.IOException {
        java.nio.channels.ReadableByteChannel newChannel;
        if (this.mCopyFromAssetPath != null) {
            newChannel = java.nio.channels.Channels.newChannel(this.mContext.getAssets().open(this.mCopyFromAssetPath));
        } else if (this.mCopyFromFile != null) {
            newChannel = new java.io.FileInputStream(this.mCopyFromFile).getChannel();
        } else {
            java.util.concurrent.Callable<java.io.InputStream> callable = this.mCopyFromInputStream;
            if (callable != null) {
                try {
                    newChannel = java.nio.channels.Channels.newChannel(callable.call());
                } catch (java.lang.Exception e) {
                    throw new java.io.IOException("inputStreamCallable exception on call", e);
                }
            } else {
                throw new java.lang.IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        java.io.File createTempFile = java.io.File.createTempFile("room-copy-helper", ".tmp", this.mContext.getCacheDir());
        createTempFile.deleteOnExit();
        androidx.room.util.FileUtil.copy(newChannel, new java.io.FileOutputStream(createTempFile).getChannel());
        java.io.File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new java.io.IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        dispatchOnOpenPrepackagedDatabase(createTempFile, z);
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new java.io.IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private void dispatchOnOpenPrepackagedDatabase(java.io.File file, boolean z) {
        androidx.sqlite.db.SupportSQLiteDatabase readableDatabase;
        androidx.room.DatabaseConfiguration databaseConfiguration = this.mDatabaseConfiguration;
        if (databaseConfiguration == null || databaseConfiguration.prepackagedDatabaseCallback == null) {
            return;
        }
        androidx.sqlite.db.SupportSQLiteOpenHelper createFrameworkOpenHelper = createFrameworkOpenHelper(file);
        try {
            if (z) {
                readableDatabase = createFrameworkOpenHelper.getWritableDatabase();
            } else {
                readableDatabase = createFrameworkOpenHelper.getReadableDatabase();
            }
            this.mDatabaseConfiguration.prepackagedDatabaseCallback.onOpenPrepackagedDatabase(readableDatabase);
        } finally {
            createFrameworkOpenHelper.close();
        }
    }

    private androidx.sqlite.db.SupportSQLiteOpenHelper createFrameworkOpenHelper(java.io.File file) {
        try {
            return new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory().create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.builder(this.mContext).name(file.getAbsolutePath()).callback(new androidx.sqlite.db.SupportSQLiteOpenHelper.Callback(java.lang.Math.max(androidx.room.util.DBUtil.readVersion(file), 1)) { // from class: androidx.room.SQLiteCopyOpenHelper.1
                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onCreate(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onUpgrade(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onOpen(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
                    if (this.version < 1) {
                        supportSQLiteDatabase.setVersion(this.version);
                    }
                }
            }).build());
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Malformed database file, unable to read version.", e);
        }
    }
}
