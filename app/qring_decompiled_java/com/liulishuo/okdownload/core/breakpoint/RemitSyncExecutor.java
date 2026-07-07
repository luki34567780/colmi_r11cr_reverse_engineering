package com.liulishuo.okdownload.core.breakpoint;

/* loaded from: /tmp/dex/classes2.dex */
public class RemitSyncExecutor implements android.os.Handler.Callback {
    private static final java.lang.String TAG = "RemitSyncExecutor";
    static final int WHAT_REMOVE_FREE_BUNCH_ID = -1;
    static final int WHAT_REMOVE_FREE_ID = -2;
    static final int WHAT_REMOVE_INFO = -3;
    static final int WHAT_SYNC_BUNCH_ID = 0;
    private final com.liulishuo.okdownload.core.breakpoint.RemitSyncExecutor.RemitAgent agent;
    private final java.util.Set<java.lang.Integer> freeToDBIdList;
    private final android.os.Handler handler;

    interface RemitAgent {
        void removeInfo(int i);

        void syncCacheToDB(int i) throws java.io.IOException;

        void syncCacheToDB(java.util.List<java.lang.Integer> list) throws java.io.IOException;
    }

    RemitSyncExecutor(com.liulishuo.okdownload.core.breakpoint.RemitSyncExecutor.RemitAgent remitAgent) {
        this.agent = remitAgent;
        this.freeToDBIdList = new java.util.HashSet();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("OkDownload RemitHandoverToDB");
        handlerThread.start();
        this.handler = new android.os.Handler(handlerThread.getLooper(), this);
    }

    RemitSyncExecutor(com.liulishuo.okdownload.core.breakpoint.RemitSyncExecutor.RemitAgent remitAgent, android.os.Handler handler, java.util.Set<java.lang.Integer> set) {
        this.agent = remitAgent;
        this.handler = handler;
        this.freeToDBIdList = set;
    }

    void shutdown() {
        this.handler.getLooper().quit();
    }

    boolean isFreeToDatabase(int i) {
        return this.freeToDBIdList.contains(java.lang.Integer.valueOf(i));
    }

    public void postSyncInfoDelay(int i, long j) {
        this.handler.sendEmptyMessageDelayed(i, j);
    }

    public void postSync(int i) {
        this.handler.sendEmptyMessage(i);
    }

    public void postSync(java.util.List<java.lang.Integer> list) {
        android.os.Message obtainMessage = this.handler.obtainMessage(0);
        obtainMessage.obj = list;
        this.handler.sendMessage(obtainMessage);
    }

    public void postRemoveInfo(int i) {
        android.os.Message obtainMessage = this.handler.obtainMessage(-3);
        obtainMessage.arg1 = i;
        this.handler.sendMessage(obtainMessage);
    }

    public void postRemoveFreeIds(java.util.List<java.lang.Integer> list) {
        android.os.Message obtainMessage = this.handler.obtainMessage(-1);
        obtainMessage.obj = list;
        this.handler.sendMessage(obtainMessage);
    }

    public void postRemoveFreeId(int i) {
        android.os.Message obtainMessage = this.handler.obtainMessage(-2);
        obtainMessage.arg1 = i;
        this.handler.sendMessage(obtainMessage);
    }

    void removePostWithId(int i) {
        this.handler.removeMessages(i);
    }

    void removePostWithIds(int[] iArr) {
        for (int i : iArr) {
            this.handler.removeMessages(i);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == -3) {
            int i2 = message.arg1;
            this.freeToDBIdList.remove(java.lang.Integer.valueOf(i2));
            this.agent.removeInfo(i2);
            com.liulishuo.okdownload.core.Util.d(TAG, "remove info " + i2);
            return true;
        }
        if (i == -2) {
            int i3 = message.arg1;
            this.freeToDBIdList.remove(java.lang.Integer.valueOf(i3));
            com.liulishuo.okdownload.core.Util.d(TAG, "remove free bunch id " + i3);
            return true;
        }
        if (i == -1) {
            java.util.List list = (java.util.List) message.obj;
            this.freeToDBIdList.removeAll(list);
            com.liulishuo.okdownload.core.Util.d(TAG, "remove free bunch ids " + list);
            return true;
        }
        if (i == 0) {
            java.util.List<java.lang.Integer> list2 = (java.util.List) message.obj;
            try {
                this.agent.syncCacheToDB(list2);
                this.freeToDBIdList.addAll(list2);
                com.liulishuo.okdownload.core.Util.d(TAG, "sync bunch info with ids: " + list2);
                return true;
            } catch (java.io.IOException unused) {
                com.liulishuo.okdownload.core.Util.w(TAG, "sync info to db failed for ids: " + list2);
                return true;
            }
        }
        int i4 = message.what;
        try {
            this.agent.syncCacheToDB(i4);
            this.freeToDBIdList.add(java.lang.Integer.valueOf(i4));
            com.liulishuo.okdownload.core.Util.d(TAG, "sync info with id: " + i4);
            return true;
        } catch (java.io.IOException unused2) {
            com.liulishuo.okdownload.core.Util.w(TAG, "sync cache to db failed for id: " + i4);
            return true;
        }
    }
}
