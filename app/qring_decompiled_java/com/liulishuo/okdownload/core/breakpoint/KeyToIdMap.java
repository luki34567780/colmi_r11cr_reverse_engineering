package com.liulishuo.okdownload.core.breakpoint;

/* loaded from: /tmp/dex/classes2.dex */
public class KeyToIdMap {
    private final android.util.SparseArray<java.lang.String> idToKeyMap;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> keyToIdMap;

    KeyToIdMap() {
        this(new java.util.HashMap(), new android.util.SparseArray());
    }

    KeyToIdMap(java.util.HashMap<java.lang.String, java.lang.Integer> hashMap, android.util.SparseArray<java.lang.String> sparseArray) {
        this.keyToIdMap = hashMap;
        this.idToKeyMap = sparseArray;
    }

    public java.lang.Integer get(com.liulishuo.okdownload.DownloadTask downloadTask) {
        java.lang.Integer num = this.keyToIdMap.get(generateKey(downloadTask));
        if (num != null) {
            return num;
        }
        return null;
    }

    public void remove(int i) {
        java.lang.String str = this.idToKeyMap.get(i);
        if (str != null) {
            this.keyToIdMap.remove(str);
            this.idToKeyMap.remove(i);
        }
    }

    public void add(com.liulishuo.okdownload.DownloadTask downloadTask, int i) {
        java.lang.String generateKey = generateKey(downloadTask);
        this.keyToIdMap.put(generateKey, java.lang.Integer.valueOf(i));
        this.idToKeyMap.put(i, generateKey);
    }

    java.lang.String generateKey(com.liulishuo.okdownload.DownloadTask downloadTask) {
        return downloadTask.getUrl() + downloadTask.getUri() + downloadTask.getFilename();
    }
}
