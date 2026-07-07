package com.liulishuo.okdownload.core.breakpoint;

/* loaded from: /tmp/dex/classes2.dex */
public class BreakpointStoreOnSQLite implements com.liulishuo.okdownload.core.breakpoint.DownloadStore {
    private static final java.lang.String TAG = "BreakpointStoreOnSQLite";
    protected final com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteHelper helper;
    protected final com.liulishuo.okdownload.core.breakpoint.BreakpointStoreOnCache onCache;

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo getAfterCompleted(int i) {
        return null;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public boolean isOnlyMemoryCache() {
        return false;
    }

    BreakpointStoreOnSQLite(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteHelper breakpointSQLiteHelper, com.liulishuo.okdownload.core.breakpoint.BreakpointStoreOnCache breakpointStoreOnCache) {
        this.helper = breakpointSQLiteHelper;
        this.onCache = breakpointStoreOnCache;
    }

    public BreakpointStoreOnSQLite(android.content.Context context) {
        com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteHelper breakpointSQLiteHelper = new com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteHelper(context.getApplicationContext());
        this.helper = breakpointSQLiteHelper;
        this.onCache = new com.liulishuo.okdownload.core.breakpoint.BreakpointStoreOnCache(breakpointSQLiteHelper.loadToCache(), breakpointSQLiteHelper.loadDirtyFileList(), breakpointSQLiteHelper.loadResponseFilenameToMap());
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo get(int i) {
        return this.onCache.get(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo createAndInsert(com.liulishuo.okdownload.DownloadTask downloadTask) throws java.io.IOException {
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo createAndInsert = this.onCache.createAndInsert(downloadTask);
        this.helper.insert(createAndInsert);
        return createAndInsert;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public void onTaskStart(int i) {
        this.onCache.onTaskStart(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public void onSyncToFilesystemSuccess(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, int i, long j) throws java.io.IOException {
        this.onCache.onSyncToFilesystemSuccess(breakpointInfo, i, j);
        this.helper.updateBlockIncrease(breakpointInfo, i, breakpointInfo.getBlock(i).getCurrentOffset());
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public boolean update(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) throws java.io.IOException {
        boolean update = this.onCache.update(breakpointInfo);
        this.helper.updateInfo(breakpointInfo);
        java.lang.String filename = breakpointInfo.getFilename();
        com.liulishuo.okdownload.core.Util.d(TAG, "update " + breakpointInfo);
        if (breakpointInfo.isTaskOnlyProvidedParentPath() && filename != null) {
            this.helper.updateFilename(breakpointInfo.getUrl(), filename);
        }
        return update;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public void onTaskEnd(int i, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc) {
        this.onCache.onTaskEnd(i, endCause, exc);
        if (endCause == com.liulishuo.okdownload.core.cause.EndCause.COMPLETED) {
            this.helper.removeInfo(i);
        }
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public boolean markFileDirty(int i) {
        if (!this.onCache.markFileDirty(i)) {
            return false;
        }
        this.helper.markFileDirty(i);
        return true;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public boolean markFileClear(int i) {
        if (!this.onCache.markFileClear(i)) {
            return false;
        }
        this.helper.markFileClear(i);
        return true;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public void remove(int i) {
        this.onCache.remove(i);
        this.helper.removeInfo(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public int findOrCreateId(com.liulishuo.okdownload.DownloadTask downloadTask) {
        return this.onCache.findOrCreateId(downloadTask);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo findAnotherInfoFromCompare(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        return this.onCache.findAnotherInfoFromCompare(downloadTask, breakpointInfo);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public boolean isFileDirty(int i) {
        return this.onCache.isFileDirty(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public java.lang.String getResponseFilename(java.lang.String str) {
        return this.onCache.getResponseFilename(str);
    }

    void close() {
        this.helper.close();
    }

    public com.liulishuo.okdownload.core.breakpoint.DownloadStore createRemitSelf() {
        return new com.liulishuo.okdownload.core.breakpoint.RemitStoreOnSQLite(this);
    }
}
