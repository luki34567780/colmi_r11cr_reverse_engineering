package androidx.room;

/* loaded from: classes.dex */
final class AutoCloser {
    final long mAutoCloseTimeoutInMs;
    androidx.sqlite.db.SupportSQLiteDatabase mDelegateDatabase;
    final java.util.concurrent.Executor mExecutor;
    private androidx.sqlite.db.SupportSQLiteOpenHelper mDelegateOpenHelper = null;
    private final android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    java.lang.Runnable mOnAutoCloseCallback = null;
    final java.lang.Object mLock = new java.lang.Object();
    int mRefCount = 0;
    long mLastDecrementRefCountTimeStamp = android.os.SystemClock.uptimeMillis();
    private boolean mManuallyClosed = false;
    private final java.lang.Runnable mExecuteAutoCloser = new java.lang.Runnable() { // from class: androidx.room.AutoCloser.1
        @Override // java.lang.Runnable
        public void run() {
            androidx.room.AutoCloser.this.mExecutor.execute(androidx.room.AutoCloser.this.mAutoCloser);
        }
    };
    final java.lang.Runnable mAutoCloser = new java.lang.Runnable() { // from class: androidx.room.AutoCloser.2
        @Override // java.lang.Runnable
        public void run() {
            synchronized (androidx.room.AutoCloser.this.mLock) {
                if (android.os.SystemClock.uptimeMillis() - androidx.room.AutoCloser.this.mLastDecrementRefCountTimeStamp < androidx.room.AutoCloser.this.mAutoCloseTimeoutInMs) {
                    return;
                }
                if (androidx.room.AutoCloser.this.mRefCount != 0) {
                    return;
                }
                if (androidx.room.AutoCloser.this.mOnAutoCloseCallback != null) {
                    androidx.room.AutoCloser.this.mOnAutoCloseCallback.run();
                    if (androidx.room.AutoCloser.this.mDelegateDatabase != null && androidx.room.AutoCloser.this.mDelegateDatabase.isOpen()) {
                        try {
                            androidx.room.AutoCloser.this.mDelegateDatabase.close();
                        } catch (java.io.IOException e) {
                            androidx.room.util.SneakyThrow.reThrow(e);
                        }
                        androidx.room.AutoCloser.this.mDelegateDatabase = null;
                    }
                    return;
                }
                throw new java.lang.IllegalStateException("mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
        }
    };

    AutoCloser(long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.Executor executor) {
        this.mAutoCloseTimeoutInMs = timeUnit.toMillis(j);
        this.mExecutor = executor;
    }

    public void init(androidx.sqlite.db.SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (this.mDelegateOpenHelper != null) {
            android.util.Log.e("ROOM", "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        } else {
            this.mDelegateOpenHelper = supportSQLiteOpenHelper;
        }
    }

    public <V> V executeRefCountingFunction(androidx.arch.core.util.Function<androidx.sqlite.db.SupportSQLiteDatabase, V> function) {
        try {
            return function.apply(incrementCountAndEnsureDbIsOpen());
        } finally {
            decrementCountAndScheduleClose();
        }
    }

    public androidx.sqlite.db.SupportSQLiteDatabase incrementCountAndEnsureDbIsOpen() {
        synchronized (this.mLock) {
            this.mHandler.removeCallbacks(this.mExecuteAutoCloser);
            this.mRefCount++;
            if (this.mManuallyClosed) {
                throw new java.lang.IllegalStateException("Attempting to open already closed database.");
            }
            androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase = this.mDelegateDatabase;
            if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                return this.mDelegateDatabase;
            }
            androidx.sqlite.db.SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.mDelegateOpenHelper;
            if (supportSQLiteOpenHelper != null) {
                androidx.sqlite.db.SupportSQLiteDatabase writableDatabase = supportSQLiteOpenHelper.getWritableDatabase();
                this.mDelegateDatabase = writableDatabase;
                return writableDatabase;
            }
            throw new java.lang.IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        }
    }

    public void decrementCountAndScheduleClose() {
        synchronized (this.mLock) {
            int i = this.mRefCount;
            if (i <= 0) {
                throw new java.lang.IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
            }
            int i2 = i - 1;
            this.mRefCount = i2;
            if (i2 == 0) {
                if (this.mDelegateDatabase == null) {
                } else {
                    this.mHandler.postDelayed(this.mExecuteAutoCloser, this.mAutoCloseTimeoutInMs);
                }
            }
        }
    }

    public androidx.sqlite.db.SupportSQLiteDatabase getDelegateDatabase() {
        androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase;
        synchronized (this.mLock) {
            supportSQLiteDatabase = this.mDelegateDatabase;
        }
        return supportSQLiteDatabase;
    }

    public void closeDatabaseIfOpen() throws java.io.IOException {
        synchronized (this.mLock) {
            this.mManuallyClosed = true;
            androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase = this.mDelegateDatabase;
            if (supportSQLiteDatabase != null) {
                supportSQLiteDatabase.close();
            }
            this.mDelegateDatabase = null;
        }
    }

    public boolean isActive() {
        return !this.mManuallyClosed;
    }

    public int getRefCountForTest() {
        int i;
        synchronized (this.mLock) {
            i = this.mRefCount;
        }
        return i;
    }

    public void setAutoCloseCallback(java.lang.Runnable runnable) {
        this.mOnAutoCloseCallback = runnable;
    }
}
