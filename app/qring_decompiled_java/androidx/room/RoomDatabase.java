package androidx.room;

/* loaded from: classes.dex */
public abstract class RoomDatabase {
    private static final java.lang.String DB_IMPL_SUFFIX = "_Impl";
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean mAllowMainThreadQueries;
    private androidx.room.AutoCloser mAutoCloser;

    @java.lang.Deprecated
    protected java.util.List<androidx.room.RoomDatabase.Callback> mCallbacks;

    @java.lang.Deprecated
    protected volatile androidx.sqlite.db.SupportSQLiteDatabase mDatabase;
    private androidx.sqlite.db.SupportSQLiteOpenHelper mOpenHelper;
    private java.util.concurrent.Executor mQueryExecutor;
    private java.util.concurrent.Executor mTransactionExecutor;
    boolean mWriteAheadLoggingEnabled;
    private final java.util.concurrent.locks.ReentrantReadWriteLock mCloseLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    private final java.lang.ThreadLocal<java.lang.Integer> mSuspendingTransactionId = new java.lang.ThreadLocal<>();
    private final java.util.Map<java.lang.String, java.lang.Object> mBackingFieldMap = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private final androidx.room.InvalidationTracker mInvalidationTracker = createInvalidationTracker();
    private final java.util.Map<java.lang.Class<?>, java.lang.Object> mTypeConverters = new java.util.HashMap();
    protected java.util.Map<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>, androidx.room.migration.AutoMigrationSpec> mAutoMigrationSpecs = new java.util.HashMap();

    public static abstract class Callback {
        public void onCreate(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public void onDestructiveMigration(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public void onOpen(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        }
    }

    public static abstract class PrepackagedDatabaseCallback {
        public void onOpenPrepackagedDatabase(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        }
    }

    public interface QueryCallback {
        void onQuery(java.lang.String str, java.util.List<java.lang.Object> list);
    }

    public abstract void clearAllTables();

    protected abstract androidx.room.InvalidationTracker createInvalidationTracker();

    protected abstract androidx.sqlite.db.SupportSQLiteOpenHelper createOpenHelper(androidx.room.DatabaseConfiguration databaseConfiguration);

    java.util.concurrent.locks.Lock getCloseLock() {
        return this.mCloseLock.readLock();
    }

    java.lang.ThreadLocal<java.lang.Integer> getSuspendingTransactionId() {
        return this.mSuspendingTransactionId;
    }

    java.util.Map<java.lang.String, java.lang.Object> getBackingFieldMap() {
        return this.mBackingFieldMap;
    }

    public <T> T getTypeConverter(java.lang.Class<T> cls) {
        return (T) this.mTypeConverters.get(cls);
    }

    public void init(androidx.room.DatabaseConfiguration databaseConfiguration) {
        boolean z;
        this.mOpenHelper = createOpenHelper(databaseConfiguration);
        java.util.Set<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        java.util.BitSet bitSet = new java.util.BitSet();
        java.util.Iterator<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i = -1;
            if (it.hasNext()) {
                java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec> next = it.next();
                int size = databaseConfiguration.autoMigrationSpecs.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (next.isAssignableFrom(databaseConfiguration.autoMigrationSpecs.get(size).getClass())) {
                        bitSet.set(size);
                        i = size;
                        break;
                    }
                    size--;
                }
                if (i < 0) {
                    throw new java.lang.IllegalArgumentException("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.");
                }
                this.mAutoMigrationSpecs.put(next, databaseConfiguration.autoMigrationSpecs.get(i));
            } else {
                for (int size2 = databaseConfiguration.autoMigrationSpecs.size() - 1; size2 >= 0; size2--) {
                    if (!bitSet.get(size2)) {
                        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                }
                java.util.Iterator<androidx.room.migration.Migration> it2 = getAutoMigrations(this.mAutoMigrationSpecs).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    androidx.room.migration.Migration next2 = it2.next();
                    if (!databaseConfiguration.migrationContainer.getMigrations().containsKey(java.lang.Integer.valueOf(next2.startVersion))) {
                        databaseConfiguration.migrationContainer.addMigrations(next2);
                    }
                }
                androidx.room.SQLiteCopyOpenHelper sQLiteCopyOpenHelper = (androidx.room.SQLiteCopyOpenHelper) unwrapOpenHelper(androidx.room.SQLiteCopyOpenHelper.class, this.mOpenHelper);
                if (sQLiteCopyOpenHelper != null) {
                    sQLiteCopyOpenHelper.setDatabaseConfiguration(databaseConfiguration);
                }
                androidx.room.AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (androidx.room.AutoClosingRoomOpenHelper) unwrapOpenHelper(androidx.room.AutoClosingRoomOpenHelper.class, this.mOpenHelper);
                if (autoClosingRoomOpenHelper != null) {
                    androidx.room.AutoCloser autoCloser = autoClosingRoomOpenHelper.getAutoCloser();
                    this.mAutoCloser = autoCloser;
                    this.mInvalidationTracker.setAutoCloser(autoCloser);
                }
                if (android.os.Build.VERSION.SDK_INT >= 16) {
                    z = databaseConfiguration.journalMode == androidx.room.RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
                    this.mOpenHelper.setWriteAheadLoggingEnabled(z);
                }
                this.mCallbacks = databaseConfiguration.callbacks;
                this.mQueryExecutor = databaseConfiguration.queryExecutor;
                this.mTransactionExecutor = new androidx.room.TransactionExecutor(databaseConfiguration.transactionExecutor);
                this.mAllowMainThreadQueries = databaseConfiguration.allowMainThreadQueries;
                this.mWriteAheadLoggingEnabled = z;
                if (databaseConfiguration.multiInstanceInvalidationServiceIntent != null) {
                    this.mInvalidationTracker.startMultiInstanceInvalidation(databaseConfiguration.context, databaseConfiguration.name, databaseConfiguration.multiInstanceInvalidationServiceIntent);
                }
                java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                java.util.BitSet bitSet2 = new java.util.BitSet();
                for (java.util.Map.Entry<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    java.lang.Class<?> key = entry.getKey();
                    for (java.lang.Class<?> cls : entry.getValue()) {
                        int size3 = databaseConfiguration.typeConverters.size() - 1;
                        while (true) {
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            } else {
                                if (cls.isAssignableFrom(databaseConfiguration.typeConverters.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                }
                                size3--;
                            }
                        }
                        if (size3 < 0) {
                            throw new java.lang.IllegalArgumentException("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.");
                        }
                        this.mTypeConverters.put(cls, databaseConfiguration.typeConverters.get(size3));
                    }
                }
                for (int size4 = databaseConfiguration.typeConverters.size() - 1; size4 >= 0; size4--) {
                    if (!bitSet2.get(size4)) {
                        throw new java.lang.IllegalArgumentException("Unexpected type converter " + databaseConfiguration.typeConverters.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
                return;
            }
        }
    }

    public java.util.List<androidx.room.migration.Migration> getAutoMigrations(java.util.Map<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>, androidx.room.migration.AutoMigrationSpec> map) {
        return java.util.Collections.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T unwrapOpenHelper(java.lang.Class<T> cls, androidx.sqlite.db.SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof androidx.room.DelegatingOpenHelper) {
            return (T) unwrapOpenHelper(cls, ((androidx.room.DelegatingOpenHelper) supportSQLiteOpenHelper).getDelegate());
        }
        return null;
    }

    public androidx.sqlite.db.SupportSQLiteOpenHelper getOpenHelper() {
        return this.mOpenHelper;
    }

    protected java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> getRequiredTypeConverters() {
        return java.util.Collections.emptyMap();
    }

    public java.util.Set<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return java.util.Collections.emptySet();
    }

    public boolean isOpen() {
        androidx.room.AutoCloser autoCloser = this.mAutoCloser;
        if (autoCloser != null) {
            return autoCloser.isActive();
        }
        androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    public void close() {
        if (isOpen()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.mCloseLock.writeLock();
            writeLock.lock();
            try {
                this.mInvalidationTracker.stopMultiInstanceInvalidation();
                this.mOpenHelper.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public void assertNotMainThread() {
        if (!this.mAllowMainThreadQueries && isMainThread()) {
            throw new java.lang.IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.mSuspendingTransactionId.get() != null) {
            throw new java.lang.IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public android.database.Cursor query(java.lang.String str, java.lang.Object[] objArr) {
        return this.mOpenHelper.getWritableDatabase().query(new androidx.sqlite.db.SimpleSQLiteQuery(str, objArr));
    }

    public android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery) {
        return query(supportSQLiteQuery, (android.os.CancellationSignal) null);
    }

    public android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery, android.os.CancellationSignal cancellationSignal) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null && android.os.Build.VERSION.SDK_INT >= 16) {
            return this.mOpenHelper.getWritableDatabase().query(supportSQLiteQuery, cancellationSignal);
        }
        return this.mOpenHelper.getWritableDatabase().query(supportSQLiteQuery);
    }

    public androidx.sqlite.db.SupportSQLiteStatement compileStatement(java.lang.String str) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.mOpenHelper.getWritableDatabase().compileStatement(str);
    }

    @java.lang.Deprecated
    public void beginTransaction() {
        assertNotMainThread();
        androidx.room.AutoCloser autoCloser = this.mAutoCloser;
        if (autoCloser == null) {
            internalBeginTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.RoomDatabase$$ExternalSyntheticLambda0
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.room.RoomDatabase.this.m175lambda$beginTransaction$0$androidxroomRoomDatabase((androidx.sqlite.db.SupportSQLiteDatabase) obj);
                }
            });
        }
    }

    /* renamed from: lambda$beginTransaction$0$androidx-room-RoomDatabase, reason: not valid java name */
    public /* synthetic */ java.lang.Object m175lambda$beginTransaction$0$androidxroomRoomDatabase(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        internalBeginTransaction();
        return null;
    }

    private void internalBeginTransaction() {
        assertNotMainThread();
        androidx.sqlite.db.SupportSQLiteDatabase writableDatabase = this.mOpenHelper.getWritableDatabase();
        this.mInvalidationTracker.syncTriggers(writableDatabase);
        if (android.os.Build.VERSION.SDK_INT >= 16 && writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    @java.lang.Deprecated
    public void endTransaction() {
        androidx.room.AutoCloser autoCloser = this.mAutoCloser;
        if (autoCloser == null) {
            internalEndTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.RoomDatabase$$ExternalSyntheticLambda1
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.room.RoomDatabase.this.m176lambda$endTransaction$1$androidxroomRoomDatabase((androidx.sqlite.db.SupportSQLiteDatabase) obj);
                }
            });
        }
    }

    /* renamed from: lambda$endTransaction$1$androidx-room-RoomDatabase, reason: not valid java name */
    public /* synthetic */ java.lang.Object m176lambda$endTransaction$1$androidxroomRoomDatabase(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        internalEndTransaction();
        return null;
    }

    private void internalEndTransaction() {
        this.mOpenHelper.getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        this.mInvalidationTracker.refreshVersionsAsync();
    }

    public java.util.concurrent.Executor getQueryExecutor() {
        return this.mQueryExecutor;
    }

    public java.util.concurrent.Executor getTransactionExecutor() {
        return this.mTransactionExecutor;
    }

    @java.lang.Deprecated
    public void setTransactionSuccessful() {
        this.mOpenHelper.getWritableDatabase().setTransactionSuccessful();
    }

    public void runInTransaction(java.lang.Runnable runnable) {
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public <V> V runInTransaction(java.util.concurrent.Callable<V> callable) {
        beginTransaction();
        try {
            try {
                V call = callable.call();
                setTransactionSuccessful();
                endTransaction();
                return call;
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                androidx.room.util.SneakyThrow.reThrow(e2);
                endTransaction();
                return null;
            }
        } catch (java.lang.Throwable th) {
            endTransaction();
            throw th;
        }
    }

    protected void internalInitInvalidationTracker(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        this.mInvalidationTracker.internalInit(supportSQLiteDatabase);
    }

    public androidx.room.InvalidationTracker getInvalidationTracker() {
        return this.mInvalidationTracker;
    }

    public boolean inTransaction() {
        return this.mOpenHelper.getWritableDatabase().inTransaction();
    }

    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        androidx.room.RoomDatabase.JournalMode resolve(android.content.Context context) {
            android.app.ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (android.os.Build.VERSION.SDK_INT >= 16 && (activityManager = (android.app.ActivityManager) context.getSystemService("activity")) != null && !isLowRamDevice(activityManager)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }

        private static boolean isLowRamDevice(android.app.ActivityManager activityManager) {
            if (android.os.Build.VERSION.SDK_INT >= 19) {
                return androidx.sqlite.db.SupportSQLiteCompat.Api19Impl.isLowRamDevice(activityManager);
            }
            return false;
        }
    }

    public static class Builder<T extends androidx.room.RoomDatabase> {
        private boolean mAllowDestructiveMigrationOnDowngrade;
        private boolean mAllowMainThreadQueries;
        private java.util.concurrent.TimeUnit mAutoCloseTimeUnit;
        private java.util.List<androidx.room.migration.AutoMigrationSpec> mAutoMigrationSpecs;
        private java.util.ArrayList<androidx.room.RoomDatabase.Callback> mCallbacks;
        private final android.content.Context mContext;
        private java.lang.String mCopyFromAssetPath;
        private java.io.File mCopyFromFile;
        private java.util.concurrent.Callable<java.io.InputStream> mCopyFromInputStream;
        private final java.lang.Class<T> mDatabaseClass;
        private androidx.sqlite.db.SupportSQLiteOpenHelper.Factory mFactory;
        private java.util.Set<java.lang.Integer> mMigrationStartAndEndVersions;
        private java.util.Set<java.lang.Integer> mMigrationsNotRequiredFrom;
        private android.content.Intent mMultiInstanceInvalidationIntent;
        private final java.lang.String mName;
        private androidx.room.RoomDatabase.PrepackagedDatabaseCallback mPrepackagedDatabaseCallback;
        private androidx.room.RoomDatabase.QueryCallback mQueryCallback;
        private java.util.concurrent.Executor mQueryCallbackExecutor;
        private java.util.concurrent.Executor mQueryExecutor;
        private java.util.concurrent.Executor mTransactionExecutor;
        private java.util.List<java.lang.Object> mTypeConverters;
        private long mAutoCloseTimeout = -1;
        private androidx.room.RoomDatabase.JournalMode mJournalMode = androidx.room.RoomDatabase.JournalMode.AUTOMATIC;
        private boolean mRequireMigration = true;
        private final androidx.room.RoomDatabase.MigrationContainer mMigrationContainer = new androidx.room.RoomDatabase.MigrationContainer();

        Builder(android.content.Context context, java.lang.Class<T> cls, java.lang.String str) {
            this.mContext = context;
            this.mDatabaseClass = cls;
            this.mName = str;
        }

        public androidx.room.RoomDatabase.Builder<T> createFromAsset(java.lang.String str) {
            this.mCopyFromAssetPath = str;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> createFromAsset(java.lang.String str, androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
            this.mPrepackagedDatabaseCallback = prepackagedDatabaseCallback;
            this.mCopyFromAssetPath = str;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> createFromFile(java.io.File file) {
            this.mCopyFromFile = file;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> createFromFile(java.io.File file, androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
            this.mPrepackagedDatabaseCallback = prepackagedDatabaseCallback;
            this.mCopyFromFile = file;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> createFromInputStream(java.util.concurrent.Callable<java.io.InputStream> callable) {
            this.mCopyFromInputStream = callable;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> createFromInputStream(java.util.concurrent.Callable<java.io.InputStream> callable, androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
            this.mPrepackagedDatabaseCallback = prepackagedDatabaseCallback;
            this.mCopyFromInputStream = callable;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> openHelperFactory(androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory) {
            this.mFactory = factory;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> addMigrations(androidx.room.migration.Migration... migrationArr) {
            if (this.mMigrationStartAndEndVersions == null) {
                this.mMigrationStartAndEndVersions = new java.util.HashSet();
            }
            for (androidx.room.migration.Migration migration : migrationArr) {
                this.mMigrationStartAndEndVersions.add(java.lang.Integer.valueOf(migration.startVersion));
                this.mMigrationStartAndEndVersions.add(java.lang.Integer.valueOf(migration.endVersion));
            }
            this.mMigrationContainer.addMigrations(migrationArr);
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> addAutoMigrationSpec(androidx.room.migration.AutoMigrationSpec autoMigrationSpec) {
            if (this.mAutoMigrationSpecs == null) {
                this.mAutoMigrationSpecs = new java.util.ArrayList();
            }
            this.mAutoMigrationSpecs.add(autoMigrationSpec);
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> allowMainThreadQueries() {
            this.mAllowMainThreadQueries = true;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> setJournalMode(androidx.room.RoomDatabase.JournalMode journalMode) {
            this.mJournalMode = journalMode;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> setQueryExecutor(java.util.concurrent.Executor executor) {
            this.mQueryExecutor = executor;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> setTransactionExecutor(java.util.concurrent.Executor executor) {
            this.mTransactionExecutor = executor;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> enableMultiInstanceInvalidation() {
            this.mMultiInstanceInvalidationIntent = this.mName != null ? new android.content.Intent(this.mContext, (java.lang.Class<?>) androidx.room.MultiInstanceInvalidationService.class) : null;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> setMultiInstanceInvalidationServiceIntent(android.content.Intent intent) {
            if (this.mName == null) {
                intent = null;
            }
            this.mMultiInstanceInvalidationIntent = intent;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> fallbackToDestructiveMigration() {
            this.mRequireMigration = false;
            this.mAllowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.mRequireMigration = true;
            this.mAllowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> fallbackToDestructiveMigrationFrom(int... iArr) {
            if (this.mMigrationsNotRequiredFrom == null) {
                this.mMigrationsNotRequiredFrom = new java.util.HashSet(iArr.length);
            }
            for (int i : iArr) {
                this.mMigrationsNotRequiredFrom.add(java.lang.Integer.valueOf(i));
            }
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> addCallback(androidx.room.RoomDatabase.Callback callback) {
            if (this.mCallbacks == null) {
                this.mCallbacks = new java.util.ArrayList<>();
            }
            this.mCallbacks.add(callback);
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> setQueryCallback(androidx.room.RoomDatabase.QueryCallback queryCallback, java.util.concurrent.Executor executor) {
            this.mQueryCallback = queryCallback;
            this.mQueryCallbackExecutor = executor;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> addTypeConverter(java.lang.Object obj) {
            if (this.mTypeConverters == null) {
                this.mTypeConverters = new java.util.ArrayList();
            }
            this.mTypeConverters.add(obj);
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> setAutoCloseTimeout(long j, java.util.concurrent.TimeUnit timeUnit) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("autoCloseTimeout must be >= 0");
            }
            this.mAutoCloseTimeout = j;
            this.mAutoCloseTimeUnit = timeUnit;
            return this;
        }

        public T build() {
            java.util.concurrent.Executor executor;
            if (this.mContext == null) {
                throw new java.lang.IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.mDatabaseClass == null) {
                throw new java.lang.IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            java.util.concurrent.Executor executor2 = this.mQueryExecutor;
            if (executor2 == null && this.mTransactionExecutor == null) {
                java.util.concurrent.Executor iOThreadExecutor = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor();
                this.mTransactionExecutor = iOThreadExecutor;
                this.mQueryExecutor = iOThreadExecutor;
            } else if (executor2 != null && this.mTransactionExecutor == null) {
                this.mTransactionExecutor = executor2;
            } else if (executor2 == null && (executor = this.mTransactionExecutor) != null) {
                this.mQueryExecutor = executor;
            }
            java.util.Set<java.lang.Integer> set = this.mMigrationStartAndEndVersions;
            if (set != null && this.mMigrationsNotRequiredFrom != null) {
                for (java.lang.Integer num : set) {
                    if (this.mMigrationsNotRequiredFrom.contains(num)) {
                        throw new java.lang.IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                    }
                }
            }
            androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory = this.mFactory;
            if (factory == null) {
                factory = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory();
            }
            long j = this.mAutoCloseTimeout;
            if (j > 0) {
                if (this.mName == null) {
                    throw new java.lang.IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                }
                factory = new androidx.room.AutoClosingRoomOpenHelperFactory(factory, new androidx.room.AutoCloser(j, this.mAutoCloseTimeUnit, this.mTransactionExecutor));
            }
            java.lang.String str = this.mCopyFromAssetPath;
            if (str != null || this.mCopyFromFile != null || this.mCopyFromInputStream != null) {
                if (this.mName == null) {
                    throw new java.lang.IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                }
                int i = str == null ? 0 : 1;
                java.io.File file = this.mCopyFromFile;
                int i2 = i + (file == null ? 0 : 1);
                java.util.concurrent.Callable<java.io.InputStream> callable = this.mCopyFromInputStream;
                if (i2 + (callable != null ? 1 : 0) != 1) {
                    throw new java.lang.IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                }
                factory = new androidx.room.SQLiteCopyOpenHelperFactory(str, file, callable, factory);
            }
            androidx.room.RoomDatabase.QueryCallback queryCallback = this.mQueryCallback;
            androidx.sqlite.db.SupportSQLiteOpenHelper.Factory queryInterceptorOpenHelperFactory = queryCallback != null ? new androidx.room.QueryInterceptorOpenHelperFactory(factory, queryCallback, this.mQueryCallbackExecutor) : factory;
            android.content.Context context = this.mContext;
            androidx.room.DatabaseConfiguration databaseConfiguration = new androidx.room.DatabaseConfiguration(context, this.mName, queryInterceptorOpenHelperFactory, this.mMigrationContainer, this.mCallbacks, this.mAllowMainThreadQueries, this.mJournalMode.resolve(context), this.mQueryExecutor, this.mTransactionExecutor, this.mMultiInstanceInvalidationIntent, this.mRequireMigration, this.mAllowDestructiveMigrationOnDowngrade, this.mMigrationsNotRequiredFrom, this.mCopyFromAssetPath, this.mCopyFromFile, this.mCopyFromInputStream, this.mPrepackagedDatabaseCallback, this.mTypeConverters, this.mAutoMigrationSpecs);
            T t = (T) androidx.room.Room.getGeneratedImplementation(this.mDatabaseClass, androidx.room.RoomDatabase.DB_IMPL_SUFFIX);
            t.init(databaseConfiguration);
            return t;
        }
    }

    public static class MigrationContainer {
        private java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> mMigrations = new java.util.HashMap<>();

        public void addMigrations(androidx.room.migration.Migration... migrationArr) {
            for (androidx.room.migration.Migration migration : migrationArr) {
                addMigration(migration);
            }
        }

        public void addMigrations(java.util.List<androidx.room.migration.Migration> list) {
            java.util.Iterator<androidx.room.migration.Migration> it = list.iterator();
            while (it.hasNext()) {
                addMigration(it.next());
            }
        }

        private void addMigration(androidx.room.migration.Migration migration) {
            int i = migration.startVersion;
            int i2 = migration.endVersion;
            java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration> treeMap = this.mMigrations.get(java.lang.Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new java.util.TreeMap<>();
                this.mMigrations.put(java.lang.Integer.valueOf(i), treeMap);
            }
            androidx.room.migration.Migration migration2 = treeMap.get(java.lang.Integer.valueOf(i2));
            if (migration2 != null) {
                android.util.Log.w("ROOM", "Overriding migration " + migration2 + " with " + migration);
            }
            treeMap.put(java.lang.Integer.valueOf(i2), migration);
        }

        public java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, androidx.room.migration.Migration>> getMigrations() {
            return java.util.Collections.unmodifiableMap(this.mMigrations);
        }

        public java.util.List<androidx.room.migration.Migration> findMigrationPath(int i, int i2) {
            if (i == i2) {
                return java.util.Collections.emptyList();
            }
            return findUpMigrationPath(new java.util.ArrayList(), i2 > i, i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.util.List<androidx.room.migration.Migration> findUpMigrationPath(java.util.List<androidx.room.migration.Migration> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L5a
                goto L7
            L5:
                if (r9 <= r10) goto L5a
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> r0 = r6.mMigrations
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L56
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = 1
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                androidx.room.migration.Migration r9 = (androidx.room.migration.Migration) r9
                r7.add(r9)
                r9 = r3
                goto L57
            L56:
                r4 = 0
            L57:
                if (r4 != 0) goto L0
                return r1
            L5a:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.MigrationContainer.findUpMigrationPath(java.util.List, boolean, int, int):java.util.List");
        }
    }

    private static boolean isMainThread() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }
}
