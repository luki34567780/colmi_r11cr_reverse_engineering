package com.liulishuo.okdownload.core.breakpoint;

/* loaded from: /tmp/dex/classes2.dex */
class RemitSyncToDBHelper {
    long delayMillis;
    private final com.liulishuo.okdownload.core.breakpoint.RemitSyncExecutor executor;

    RemitSyncToDBHelper(com.liulishuo.okdownload.core.breakpoint.RemitSyncExecutor.RemitAgent remitAgent) {
        this(new com.liulishuo.okdownload.core.breakpoint.RemitSyncExecutor(remitAgent));
    }

    RemitSyncToDBHelper(com.liulishuo.okdownload.core.breakpoint.RemitSyncExecutor remitSyncExecutor) {
        this.executor = remitSyncExecutor;
        this.delayMillis = 1500L;
    }

    void shutdown() {
        this.executor.shutdown();
    }

    boolean isNotFreeToDatabase(int i) {
        return !this.executor.isFreeToDatabase(i);
    }

    void onTaskStart(int i) {
        this.executor.removePostWithId(i);
        this.executor.postSyncInfoDelay(i, this.delayMillis);
    }

    void endAndEnsureToDB(int i) {
        this.executor.removePostWithId(i);
        try {
            if (this.executor.isFreeToDatabase(i)) {
                return;
            }
            this.executor.postSync(i);
        } finally {
            this.executor.postRemoveFreeId(i);
        }
    }

    void discard(int i) {
        this.executor.removePostWithId(i);
        this.executor.postRemoveInfo(i);
    }
}
