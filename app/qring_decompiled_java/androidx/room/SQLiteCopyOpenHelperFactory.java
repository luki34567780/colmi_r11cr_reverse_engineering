package androidx.room;

/* loaded from: classes.dex */
class SQLiteCopyOpenHelperFactory implements androidx.sqlite.db.SupportSQLiteOpenHelper.Factory {
    private final java.lang.String mCopyFromAssetPath;
    private final java.io.File mCopyFromFile;
    private final java.util.concurrent.Callable<java.io.InputStream> mCopyFromInputStream;
    private final androidx.sqlite.db.SupportSQLiteOpenHelper.Factory mDelegate;

    SQLiteCopyOpenHelperFactory(java.lang.String str, java.io.File file, java.util.concurrent.Callable<java.io.InputStream> callable, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory) {
        this.mCopyFromAssetPath = str;
        this.mCopyFromFile = file;
        this.mCopyFromInputStream = callable;
        this.mDelegate = factory;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public androidx.sqlite.db.SupportSQLiteOpenHelper create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration configuration) {
        return new androidx.room.SQLiteCopyOpenHelper(configuration.context, this.mCopyFromAssetPath, this.mCopyFromFile, this.mCopyFromInputStream, configuration.callback.version, this.mDelegate.create(configuration));
    }
}
