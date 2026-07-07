package com.liulishuo.okdownload.core.breakpoint;

/* loaded from: /tmp/dex/classes2.dex */
public class BreakpointStoreOnCache implements com.liulishuo.okdownload.core.breakpoint.DownloadStore {
    public static final int FIRST_ID = 1;
    private final java.util.List<java.lang.Integer> fileDirtyList;
    private final com.liulishuo.okdownload.core.breakpoint.KeyToIdMap keyToIdMap;
    private final java.util.HashMap<java.lang.String, java.lang.String> responseFilenameMap;
    private final java.util.List<java.lang.Integer> sortedOccupiedIds;
    private final android.util.SparseArray<com.liulishuo.okdownload.core.breakpoint.BreakpointInfo> storedInfos;
    private final android.util.SparseArray<com.liulishuo.okdownload.core.IdentifiedTask> unStoredTasks;

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo getAfterCompleted(int i) {
        return null;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public boolean isOnlyMemoryCache() {
        return true;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public void onTaskStart(int i) {
    }

    public BreakpointStoreOnCache() {
        this(new android.util.SparseArray(), new java.util.ArrayList(), new java.util.HashMap());
    }

    BreakpointStoreOnCache(android.util.SparseArray<com.liulishuo.okdownload.core.breakpoint.BreakpointInfo> sparseArray, java.util.List<java.lang.Integer> list, java.util.HashMap<java.lang.String, java.lang.String> hashMap, android.util.SparseArray<com.liulishuo.okdownload.core.IdentifiedTask> sparseArray2, java.util.List<java.lang.Integer> list2, com.liulishuo.okdownload.core.breakpoint.KeyToIdMap keyToIdMap) {
        this.unStoredTasks = sparseArray2;
        this.fileDirtyList = list;
        this.storedInfos = sparseArray;
        this.responseFilenameMap = hashMap;
        this.sortedOccupiedIds = list2;
        this.keyToIdMap = keyToIdMap;
    }

    public BreakpointStoreOnCache(android.util.SparseArray<com.liulishuo.okdownload.core.breakpoint.BreakpointInfo> sparseArray, java.util.List<java.lang.Integer> list, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        this.unStoredTasks = new android.util.SparseArray<>();
        this.storedInfos = sparseArray;
        this.fileDirtyList = list;
        this.responseFilenameMap = hashMap;
        this.keyToIdMap = new com.liulishuo.okdownload.core.breakpoint.KeyToIdMap();
        int size = sparseArray.size();
        this.sortedOccupiedIds = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.sortedOccupiedIds.add(java.lang.Integer.valueOf(sparseArray.valueAt(i).id));
        }
        java.util.Collections.sort(this.sortedOccupiedIds);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo get(int i) {
        return this.storedInfos.get(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo createAndInsert(com.liulishuo.okdownload.DownloadTask downloadTask) {
        int id = downloadTask.getId();
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo = new com.liulishuo.okdownload.core.breakpoint.BreakpointInfo(id, downloadTask.getUrl(), downloadTask.getParentFile(), downloadTask.getFilename());
        synchronized (this) {
            this.storedInfos.put(id, breakpointInfo);
            this.unStoredTasks.remove(id);
        }
        return breakpointInfo;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public void onSyncToFilesystemSuccess(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, int i, long j) throws java.io.IOException {
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo2 = this.storedInfos.get(breakpointInfo.id);
        if (breakpointInfo != breakpointInfo2) {
            throw new java.io.IOException("Info not on store!");
        }
        breakpointInfo2.getBlock(i).increaseCurrentOffset(j);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public boolean update(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        java.lang.String filename = breakpointInfo.getFilename();
        if (breakpointInfo.isTaskOnlyProvidedParentPath() && filename != null) {
            this.responseFilenameMap.put(breakpointInfo.getUrl(), filename);
        }
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo2 = this.storedInfos.get(breakpointInfo.id);
        if (breakpointInfo2 == null) {
            return false;
        }
        if (breakpointInfo2 == breakpointInfo) {
            return true;
        }
        synchronized (this) {
            this.storedInfos.put(breakpointInfo.id, breakpointInfo.copy());
        }
        return true;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public void onTaskEnd(int i, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc) {
        if (endCause == com.liulishuo.okdownload.core.cause.EndCause.COMPLETED) {
            remove(i);
        }
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public boolean markFileDirty(int i) {
        if (this.fileDirtyList.contains(java.lang.Integer.valueOf(i))) {
            return false;
        }
        synchronized (this.fileDirtyList) {
            if (this.fileDirtyList.contains(java.lang.Integer.valueOf(i))) {
                return false;
            }
            this.fileDirtyList.add(java.lang.Integer.valueOf(i));
            return true;
        }
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.DownloadStore
    public boolean markFileClear(int i) {
        boolean remove;
        synchronized (this.fileDirtyList) {
            remove = this.fileDirtyList.remove(java.lang.Integer.valueOf(i));
        }
        return remove;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public synchronized void remove(int i) {
        this.storedInfos.remove(i);
        if (this.unStoredTasks.get(i) == null) {
            this.sortedOccupiedIds.remove(java.lang.Integer.valueOf(i));
        }
        this.keyToIdMap.remove(i);
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public synchronized int findOrCreateId(com.liulishuo.okdownload.DownloadTask downloadTask) {
        java.lang.Integer num = this.keyToIdMap.get(downloadTask);
        if (num != null) {
            return num.intValue();
        }
        int size = this.storedInfos.size();
        for (int i = 0; i < size; i++) {
            com.liulishuo.okdownload.core.breakpoint.BreakpointInfo valueAt = this.storedInfos.valueAt(i);
            if (valueAt != null && valueAt.isSameFrom(downloadTask)) {
                return valueAt.id;
            }
        }
        int size2 = this.unStoredTasks.size();
        for (int i2 = 0; i2 < size2; i2++) {
            com.liulishuo.okdownload.core.IdentifiedTask valueAt2 = this.unStoredTasks.valueAt(i2);
            if (valueAt2 != null && valueAt2.compareIgnoreId(downloadTask)) {
                return valueAt2.getId();
            }
        }
        int allocateId = allocateId();
        this.unStoredTasks.put(allocateId, downloadTask.mock(allocateId));
        this.keyToIdMap.add(downloadTask, allocateId);
        return allocateId;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo findAnotherInfoFromCompare(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        android.util.SparseArray<com.liulishuo.okdownload.core.breakpoint.BreakpointInfo> clone;
        synchronized (this) {
            clone = this.storedInfos.clone();
        }
        int size = clone.size();
        for (int i = 0; i < size; i++) {
            com.liulishuo.okdownload.core.breakpoint.BreakpointInfo valueAt = clone.valueAt(i);
            if (valueAt != breakpointInfo && valueAt.isSameFrom(downloadTask)) {
                return valueAt;
            }
        }
        return null;
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public boolean isFileDirty(int i) {
        return this.fileDirtyList.contains(java.lang.Integer.valueOf(i));
    }

    @Override // com.liulishuo.okdownload.core.breakpoint.BreakpointStore
    public java.lang.String getResponseFilename(java.lang.String str) {
        return this.responseFilenameMap.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r1 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    synchronized int allocateId() {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = 0
            r2 = 0
        L4:
            java.util.List<java.lang.Integer> r3 = r5.sortedOccupiedIds     // Catch: java.lang.Throwable -> L5f
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L5f
            r4 = 1
            if (r1 >= r3) goto L2e
            java.util.List<java.lang.Integer> r3 = r5.sortedOccupiedIds     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L5f
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L5f
            if (r3 != 0) goto L1a
            int r0 = r2 + 1
            goto L2f
        L1a:
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto L24
            if (r3 == r4) goto L2a
            r0 = 1
            goto L2e
        L24:
            int r2 = r2 + 1
            if (r3 == r2) goto L2a
            r0 = r2
            goto L2f
        L2a:
            int r1 = r1 + 1
            r2 = r3
            goto L4
        L2e:
            r1 = 0
        L2f:
            if (r0 != 0) goto L53
            java.util.List<java.lang.Integer> r0 = r5.sortedOccupiedIds     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L3a
            goto L54
        L3a:
            java.util.List<java.lang.Integer> r0 = r5.sortedOccupiedIds     // Catch: java.lang.Throwable -> L5f
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L5f
            int r1 = r1 - r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L5f
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L5f
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L5f
            int r4 = r4 + r0
            java.util.List<java.lang.Integer> r0 = r5.sortedOccupiedIds     // Catch: java.lang.Throwable -> L5f
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L5f
            goto L54
        L53:
            r4 = r0
        L54:
            java.util.List<java.lang.Integer> r0 = r5.sortedOccupiedIds     // Catch: java.lang.Throwable -> L5f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L5f
            r0.add(r1, r2)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r5)
            return r4
        L5f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.okdownload.core.breakpoint.BreakpointStoreOnCache.allocateId():int");
    }
}
