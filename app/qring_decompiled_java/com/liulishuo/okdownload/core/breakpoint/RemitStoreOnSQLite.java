package com.liulishuo.okdownload.core.breakpoint;

/* loaded from: /tmp/dex/classes2.dex */
public class RemitStoreOnSQLite implements com.liulishuo.okdownload.core.breakpoint.RemitSyncExecutor.RemitAgent, com.liulishuo.okdownload.core.breakpoint.DownloadStore {
    private static final java.lang.String TAG = "RemitStoreOnSQLite";
    private final com.liulishuo.okdownload.core.breakpoint.BreakpointStoreOnSQLite onSQLiteWrapper;
    private final com.liulishuo.okdownload.core.breakpoint.RemitSyncToDBHelper remitHelper;
    private final com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteHelper sqLiteHelper;
    private final com.liulishuo.okdownload.core.breakpoint.DownloadStore sqliteCache;

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo getAfterCompleted(int i) {
        return null;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public boolean isOnlyMemoryCache() {
        return false;
    }

    RemitStoreOnSQLite(com.liulishuo.okdownload.core.breakpoint.BreakpointStoreOnSQLite breakpointStoreOnSQLite) {
        this.remitHelper = new com.liulishuo.okdownload.core.breakpoint.RemitSyncToDBHelper(this);
        this.onSQLiteWrapper = breakpointStoreOnSQLite;
        this.sqliteCache = breakpointStoreOnSQLite.onCache;
        this.sqLiteHelper = breakpointStoreOnSQLite.helper;
    }

    RemitStoreOnSQLite(com.liulishuo.okdownload.core.breakpoint.RemitSyncToDBHelper remitSyncToDBHelper, com.liulishuo.okdownload.core.breakpoint.BreakpointStoreOnSQLite breakpointStoreOnSQLite, com.liulishuo.okdownload.core.breakpoint.DownloadStore downloadStore, com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteHelper breakpointSQLiteHelper) {
        this.remitHelper = remitSyncToDBHelper;
        this.onSQLiteWrapper = breakpointStoreOnSQLite;
        this.sqliteCache = downloadStore;
        this.sqLiteHelper = breakpointSQLiteHelper;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo get(int i) {
        return this.onSQLiteWrapper.get(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo createAndInsert(com.liulishuo.okdownload.DownloadTask downloadTask) throws java.io.IOException {
        return this.remitHelper.isNotFreeToDatabase(downloadTask.getId()) ? this.sqliteCache.createAndInsert(downloadTask) : this.onSQLiteWrapper.createAndInsert(downloadTask);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public void onTaskStart(int i) {
        this.onSQLiteWrapper.onTaskStart(i);
        this.remitHelper.onTaskStart(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public void onSyncToFilesystemSuccess(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, int i, long j) throws java.io.IOException {
        if (this.remitHelper.isNotFreeToDatabase(breakpointInfo.getId())) {
            this.sqliteCache.onSyncToFilesystemSuccess(breakpointInfo, i, j);
        } else {
            this.onSQLiteWrapper.onSyncToFilesystemSuccess(breakpointInfo, i, j);
        }
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public boolean update(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) throws java.io.IOException {
        return this.remitHelper.isNotFreeToDatabase(breakpointInfo.getId()) ? this.sqliteCache.update(breakpointInfo) : this.onSQLiteWrapper.update(breakpointInfo);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public void onTaskEnd(int i, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc) {
        this.sqliteCache.onTaskEnd(i, endCause, exc);
        if (endCause == com.liulishuo.okdownload.core.cause.EndCause.COMPLETED) {
            this.remitHelper.discard(i);
        } else {
            this.remitHelper.endAndEnsureToDB(i);
        }
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public boolean markFileDirty(int i) {
        return this.onSQLiteWrapper.markFileDirty(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public boolean markFileClear(int i) {
        return this.onSQLiteWrapper.markFileClear(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public void remove(int i) {
        this.sqliteCache.remove(i);
        this.remitHelper.discard(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public int findOrCreateId(com.liulishuo.okdownload.DownloadTask downloadTask) {
        return this.onSQLiteWrapper.findOrCreateId(downloadTask);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo findAnotherInfoFromCompare(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        return this.onSQLiteWrapper.findAnotherInfoFromCompare(downloadTask, breakpointInfo);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public boolean isFileDirty(int i) {
        return this.onSQLiteWrapper.isFileDirty(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public java.lang.String getResponseFilename(java.lang.String str) {
        return this.onSQLiteWrapper.getResponseFilename(str);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.RemitSyncExecutor.RemitAgent
    public void syncCacheToDB(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        android.database.sqlite.SQLiteDatabase writableDatabase = this.sqLiteHelper.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            java.util.Iterator<java.lang.Integer> it = list.iterator();
            while (it.hasNext()) {
                syncCacheToDB(it.next().intValue());
            }
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.RemitSyncExecutor.RemitAgent
    public void syncCacheToDB(int i) throws java.io.IOException {
        this.sqLiteHelper.removeInfo(i);
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo = this.sqliteCache.get(i);
        if (breakpointInfo == null || breakpointInfo.getFilename() == null || breakpointInfo.getTotalOffset() <= 0) {
            return;
        }
        this.sqLiteHelper.insert(breakpointInfo);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.RemitSyncExecutor.RemitAgent
    public void removeInfo(int i) {
        this.sqLiteHelper.removeInfo(i);
    }

    public static void setRemitToDBDelayMillis(int i) {
        com.liulishuo.okdownload.core.breakpoint.BreakpointStore breakpointStore = com.liulishuo.okdownload.OkDownload.with().breakpointStore();
        if (!(breakpointStore instanceof com.liulishuo.okdownload.core.breakpoint.RemitStoreOnSQLite)) {
            throw new java.lang.IllegalStateException("The current store is " + breakpointStore + " not RemitStoreOnSQLite!");
        }
        ((com.liulishuo.okdownload.core.breakpoint.RemitStoreOnSQLite) breakpointStore).remitHelper.delayMillis = java.lang.Math.max(0, i);
    }
}
