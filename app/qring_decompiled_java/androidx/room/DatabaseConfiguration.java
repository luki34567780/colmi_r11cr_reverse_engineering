package androidx.room;

/* loaded from: classes.dex */
public class DatabaseConfiguration {
    public final boolean allowDestructiveMigrationOnDowngrade;
    public final boolean allowMainThreadQueries;
    public final java.util.List<androidx.room.migration.AutoMigrationSpec> autoMigrationSpecs;
    public final java.util.List<androidx.room.RoomDatabase.Callback> callbacks;
    public final android.content.Context context;
    public final java.lang.String copyFromAssetPath;
    public final java.io.File copyFromFile;
    public final java.util.concurrent.Callable<java.io.InputStream> copyFromInputStream;
    public final androidx.room.RoomDatabase.JournalMode journalMode;
    private final java.util.Set<java.lang.Integer> mMigrationNotRequiredFrom;
    public final androidx.room.RoomDatabase.MigrationContainer migrationContainer;
    public final boolean multiInstanceInvalidation;
    public final android.content.Intent multiInstanceInvalidationServiceIntent;
    public final java.lang.String name;
    public final androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;
    public final java.util.concurrent.Executor queryExecutor;
    public final boolean requireMigration;
    public final androidx.sqlite.db.SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;
    public final java.util.concurrent.Executor transactionExecutor;
    public final java.util.List<java.lang.Object> typeConverters;

    @java.lang.Deprecated
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, boolean z2, java.util.Set<java.lang.Integer> set) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor, false, z2, false, set, (java.lang.String) null, (java.io.File) null, (java.util.concurrent.Callable<java.io.InputStream>) null, (androidx.room.RoomDatabase.PrepackagedDatabaseCallback) null, (java.util.List<java.lang.Object>) null, (java.util.List<androidx.room.migration.AutoMigrationSpec>) null);
    }

    @java.lang.Deprecated
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, boolean z2, boolean z3, boolean z4, java.util.Set<java.lang.Integer> set) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2, z3, z4, set, (java.lang.String) null, (java.io.File) null, (java.util.concurrent.Callable<java.io.InputStream>) null, (androidx.room.RoomDatabase.PrepackagedDatabaseCallback) null, (java.util.List<java.lang.Object>) null, (java.util.List<androidx.room.migration.AutoMigrationSpec>) null);
    }

    @java.lang.Deprecated
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, boolean z2, boolean z3, boolean z4, java.util.Set<java.lang.Integer> set, java.lang.String str2, java.io.File file) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2, z3, z4, set, str2, file, (java.util.concurrent.Callable<java.io.InputStream>) null, (androidx.room.RoomDatabase.PrepackagedDatabaseCallback) null, (java.util.List<java.lang.Object>) null, (java.util.List<androidx.room.migration.AutoMigrationSpec>) null);
    }

    @java.lang.Deprecated
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, boolean z2, boolean z3, boolean z4, java.util.Set<java.lang.Integer> set, java.lang.String str2, java.io.File file, java.util.concurrent.Callable<java.io.InputStream> callable) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2, z3, z4, set, str2, file, callable, (androidx.room.RoomDatabase.PrepackagedDatabaseCallback) null, (java.util.List<java.lang.Object>) null, (java.util.List<androidx.room.migration.AutoMigrationSpec>) null);
    }

    @java.lang.Deprecated
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, boolean z2, boolean z3, boolean z4, java.util.Set<java.lang.Integer> set, java.lang.String str2, java.io.File file, java.util.concurrent.Callable<java.io.InputStream> callable, androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2, z3, z4, set, str2, file, callable, prepackagedDatabaseCallback, (java.util.List<java.lang.Object>) null, (java.util.List<androidx.room.migration.AutoMigrationSpec>) null);
    }

    @java.lang.Deprecated
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, boolean z2, boolean z3, boolean z4, java.util.Set<java.lang.Integer> set, java.lang.String str2, java.io.File file, java.util.concurrent.Callable<java.io.InputStream> callable, androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, java.util.List<java.lang.Object> list2) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2, z3, z4, set, str2, file, callable, prepackagedDatabaseCallback, list2, (java.util.List<androidx.room.migration.AutoMigrationSpec>) null);
    }

    @java.lang.Deprecated
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, boolean z2, boolean z3, boolean z4, java.util.Set<java.lang.Integer> set, java.lang.String str2, java.io.File file, java.util.concurrent.Callable<java.io.InputStream> callable, androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, java.util.List<java.lang.Object> list2, java.util.List<androidx.room.migration.AutoMigrationSpec> list3) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new android.content.Intent(context, (java.lang.Class<?>) androidx.room.MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, prepackagedDatabaseCallback, list2, list3);
    }

    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, android.content.Intent intent, boolean z2, boolean z3, java.util.Set<java.lang.Integer> set, java.lang.String str2, java.io.File file, java.util.concurrent.Callable<java.io.InputStream> callable, androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, java.util.List<java.lang.Object> list2, java.util.List<androidx.room.migration.AutoMigrationSpec> list3) {
        this.sqliteOpenHelperFactory = factory;
        this.context = context;
        this.name = str;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z;
        this.journalMode = journalMode;
        this.queryExecutor = executor;
        this.transactionExecutor = executor2;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.multiInstanceInvalidation = intent != null;
        this.requireMigration = z2;
        this.allowDestructiveMigrationOnDowngrade = z3;
        this.mMigrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
        this.typeConverters = list2 == null ? java.util.Collections.emptyList() : list2;
        this.autoMigrationSpecs = list3 == null ? java.util.Collections.emptyList() : list3;
    }

    @java.lang.Deprecated
    public boolean isMigrationRequiredFrom(int i) {
        return isMigrationRequired(i, i + 1);
    }

    public boolean isMigrationRequired(int i, int i2) {
        java.util.Set<java.lang.Integer> set;
        return !((i > i2) && this.allowDestructiveMigrationOnDowngrade) && this.requireMigration && ((set = this.mMigrationNotRequiredFrom) == null || !set.contains(java.lang.Integer.valueOf(i)));
    }
}
