package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class CacheDiskUtils implements com.blankj.utilcode.constant.CacheConstants {
    private static final java.util.Map<java.lang.String, com.blankj.utilcode.util.CacheDiskUtils> CACHE_MAP = new java.util.HashMap();
    private static final java.lang.String CACHE_PREFIX = "cdu_";
    private static final int DEFAULT_MAX_COUNT = Integer.MAX_VALUE;
    private static final long DEFAULT_MAX_SIZE = Long.MAX_VALUE;
    private static final java.lang.String TYPE_BITMAP = "bi_";
    private static final java.lang.String TYPE_BYTE = "by_";
    private static final java.lang.String TYPE_DRAWABLE = "dr_";
    private static final java.lang.String TYPE_JSON_ARRAY = "ja_";
    private static final java.lang.String TYPE_JSON_OBJECT = "jo_";
    private static final java.lang.String TYPE_PARCELABLE = "pa_";
    private static final java.lang.String TYPE_SERIALIZABLE = "se_";
    private static final java.lang.String TYPE_STRING = "st_";
    private final java.io.File mCacheDir;
    private final java.lang.String mCacheKey;
    private com.blankj.utilcode.util.CacheDiskUtils.DiskCacheManager mDiskCacheManager;
    private final int mMaxCount;
    private final long mMaxSize;

    public static com.blankj.utilcode.util.CacheDiskUtils getInstance() {
        return getInstance("", Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public static com.blankj.utilcode.util.CacheDiskUtils getInstance(java.lang.String str) {
        return getInstance(str, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public static com.blankj.utilcode.util.CacheDiskUtils getInstance(long j, int i) {
        return getInstance("", j, i);
    }

    public static com.blankj.utilcode.util.CacheDiskUtils getInstance(java.lang.String str, long j, int i) {
        if (com.blankj.utilcode.util.UtilsBridge.isSpace(str)) {
            str = "cacheUtils";
        }
        return getInstance(new java.io.File(com.blankj.utilcode.util.Utils.getApp().getCacheDir(), str), j, i);
    }

    public static com.blankj.utilcode.util.CacheDiskUtils getInstance(java.io.File file) {
        java.util.Objects.requireNonNull(file, "Argument 'cacheDir' of type File (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getInstance(file, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public static com.blankj.utilcode.util.CacheDiskUtils getInstance(java.io.File file, long j, int i) {
        java.util.Objects.requireNonNull(file, "Argument 'cacheDir' of type File (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.lang.String str = file.getAbsoluteFile() + "_" + j + "_" + i;
        java.util.Map<java.lang.String, com.blankj.utilcode.util.CacheDiskUtils> map = CACHE_MAP;
        com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils = map.get(str);
        if (cacheDiskUtils == null) {
            synchronized (com.blankj.utilcode.util.CacheDiskUtils.class) {
                cacheDiskUtils = map.get(str);
                if (cacheDiskUtils == null) {
                    com.blankj.utilcode.util.CacheDiskUtils cacheDiskUtils2 = new com.blankj.utilcode.util.CacheDiskUtils(str, file, j, i);
                    map.put(str, cacheDiskUtils2);
                    cacheDiskUtils = cacheDiskUtils2;
                }
            }
        }
        return cacheDiskUtils;
    }

    private CacheDiskUtils(java.lang.String str, java.io.File file, long j, int i) {
        this.mCacheKey = str;
        this.mCacheDir = file;
        this.mMaxSize = j;
        this.mMaxCount = i;
    }

    private com.blankj.utilcode.util.CacheDiskUtils.DiskCacheManager getDiskCacheManager() {
        if (this.mCacheDir.exists()) {
            if (this.mDiskCacheManager == null) {
                this.mDiskCacheManager = new com.blankj.utilcode.util.CacheDiskUtils.DiskCacheManager(this.mCacheDir, this.mMaxSize, this.mMaxCount);
            }
        } else if (this.mCacheDir.mkdirs()) {
            this.mDiskCacheManager = new com.blankj.utilcode.util.CacheDiskUtils.DiskCacheManager(this.mCacheDir, this.mMaxSize, this.mMaxCount);
        } else {
            android.util.Log.e("CacheDiskUtils", "can't make dirs in " + this.mCacheDir.getAbsolutePath());
        }
        return this.mDiskCacheManager;
    }

    public java.lang.String toString() {
        return this.mCacheKey + "@" + java.lang.Integer.toHexString(hashCode());
    }

    public void put(java.lang.String str, byte[] bArr) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, bArr, -1);
    }

    public void put(java.lang.String str, byte[] bArr, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        realPutBytes(TYPE_BYTE + str, bArr, i);
    }

    private void realPutBytes(java.lang.String str, byte[] bArr, int i) {
        com.blankj.utilcode.util.CacheDiskUtils.DiskCacheManager diskCacheManager;
        if (bArr == null || (diskCacheManager = getDiskCacheManager()) == null) {
            return;
        }
        if (i >= 0) {
            bArr = com.blankj.utilcode.util.CacheDiskUtils.DiskCacheHelper.newByteArrayWithTime(i, bArr);
        }
        java.io.File fileBeforePut = diskCacheManager.getFileBeforePut(str);
        com.blankj.utilcode.util.UtilsBridge.writeFileFromBytes(fileBeforePut, bArr);
        diskCacheManager.updateModify(fileBeforePut);
        diskCacheManager.put(fileBeforePut);
    }

    public byte[] getBytes(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getBytes(str, null);
    }

    public byte[] getBytes(java.lang.String str, byte[] bArr) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return realGetBytes(TYPE_BYTE + str, bArr);
    }

    private byte[] realGetBytes(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return realGetBytes(str, null);
    }

    private byte[] realGetBytes(java.lang.String str, byte[] bArr) {
        java.io.File fileIfExists;
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        com.blankj.utilcode.util.CacheDiskUtils.DiskCacheManager diskCacheManager = getDiskCacheManager();
        if (diskCacheManager == null || (fileIfExists = diskCacheManager.getFileIfExists(str)) == null) {
            return bArr;
        }
        byte[] readFile2Bytes = com.blankj.utilcode.util.UtilsBridge.readFile2Bytes(fileIfExists);
        if (com.blankj.utilcode.util.CacheDiskUtils.DiskCacheHelper.isDue(readFile2Bytes)) {
            diskCacheManager.removeByKey(str);
            return bArr;
        }
        diskCacheManager.updateModify(fileIfExists);
        return com.blankj.utilcode.util.CacheDiskUtils.DiskCacheHelper.getDataWithoutDueTime(readFile2Bytes);
    }

    public void put(java.lang.String str, java.lang.String str2) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, str2, -1);
    }

    public void put(java.lang.String str, java.lang.String str2, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        realPutBytes(TYPE_STRING + str, com.blankj.utilcode.util.UtilsBridge.string2Bytes(str2), i);
    }

    public java.lang.String getString(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getString(str, null);
    }

    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        byte[] realGetBytes = realGetBytes(TYPE_STRING + str);
        return realGetBytes == null ? str2 : com.blankj.utilcode.util.UtilsBridge.bytes2String(realGetBytes);
    }

    public void put(java.lang.String str, org.json.JSONObject jSONObject) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, jSONObject, -1);
    }

    public void put(java.lang.String str, org.json.JSONObject jSONObject, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        realPutBytes(TYPE_JSON_OBJECT + str, com.blankj.utilcode.util.UtilsBridge.jsonObject2Bytes(jSONObject), i);
    }

    public org.json.JSONObject getJSONObject(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getJSONObject(str, null);
    }

    public org.json.JSONObject getJSONObject(java.lang.String str, org.json.JSONObject jSONObject) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        byte[] realGetBytes = realGetBytes(TYPE_JSON_OBJECT + str);
        return realGetBytes == null ? jSONObject : com.blankj.utilcode.util.UtilsBridge.bytes2JSONObject(realGetBytes);
    }

    public void put(java.lang.String str, org.json.JSONArray jSONArray) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, jSONArray, -1);
    }

    public void put(java.lang.String str, org.json.JSONArray jSONArray, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        realPutBytes(TYPE_JSON_ARRAY + str, com.blankj.utilcode.util.UtilsBridge.jsonArray2Bytes(jSONArray), i);
    }

    public org.json.JSONArray getJSONArray(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getJSONArray(str, null);
    }

    public org.json.JSONArray getJSONArray(java.lang.String str, org.json.JSONArray jSONArray) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        byte[] realGetBytes = realGetBytes(TYPE_JSON_ARRAY + str);
        return realGetBytes == null ? jSONArray : com.blankj.utilcode.util.UtilsBridge.bytes2JSONArray(realGetBytes);
    }

    public void put(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, bitmap, -1);
    }

    public void put(java.lang.String str, android.graphics.Bitmap bitmap, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        realPutBytes(TYPE_BITMAP + str, com.blankj.utilcode.util.UtilsBridge.bitmap2Bytes(bitmap), i);
    }

    public android.graphics.Bitmap getBitmap(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getBitmap(str, null);
    }

    public android.graphics.Bitmap getBitmap(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        byte[] realGetBytes = realGetBytes(TYPE_BITMAP + str);
        return realGetBytes == null ? bitmap : com.blankj.utilcode.util.UtilsBridge.bytes2Bitmap(realGetBytes);
    }

    public void put(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, drawable, -1);
    }

    public void put(java.lang.String str, android.graphics.drawable.Drawable drawable, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        realPutBytes(TYPE_DRAWABLE + str, com.blankj.utilcode.util.UtilsBridge.drawable2Bytes(drawable), i);
    }

    public android.graphics.drawable.Drawable getDrawable(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getDrawable(str, null);
    }

    public android.graphics.drawable.Drawable getDrawable(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        byte[] realGetBytes = realGetBytes(TYPE_DRAWABLE + str);
        return realGetBytes == null ? drawable : com.blankj.utilcode.util.UtilsBridge.bytes2Drawable(realGetBytes);
    }

    public void put(java.lang.String str, android.os.Parcelable parcelable) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, parcelable, -1);
    }

    public void put(java.lang.String str, android.os.Parcelable parcelable, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        realPutBytes(TYPE_PARCELABLE + str, com.blankj.utilcode.util.UtilsBridge.parcelable2Bytes(parcelable), i);
    }

    public <T> T getParcelable(java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(creator, "Argument 'creator' of type Parcelable.Creator<T> (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return (T) getParcelable(str, creator, null);
    }

    public <T> T getParcelable(java.lang.String str, android.os.Parcelable.Creator<T> creator, T t) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(creator, "Argument 'creator' of type Parcelable.Creator<T> (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        byte[] realGetBytes = realGetBytes(TYPE_PARCELABLE + str);
        return realGetBytes == null ? t : (T) com.blankj.utilcode.util.UtilsBridge.bytes2Parcelable(realGetBytes, creator);
    }

    public void put(java.lang.String str, java.io.Serializable serializable) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, serializable, -1);
    }

    public void put(java.lang.String str, java.io.Serializable serializable, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        realPutBytes(TYPE_SERIALIZABLE + str, com.blankj.utilcode.util.UtilsBridge.serializable2Bytes(serializable), i);
    }

    public java.lang.Object getSerializable(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return getSerializable(str, null);
    }

    public java.lang.Object getSerializable(java.lang.String str, java.lang.Object obj) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        byte[] realGetBytes = realGetBytes(TYPE_SERIALIZABLE + str);
        return realGetBytes == null ? obj : com.blankj.utilcode.util.UtilsBridge.bytes2Object(realGetBytes);
    }

    public long getCacheSize() {
        com.blankj.utilcode.util.CacheDiskUtils.DiskCacheManager diskCacheManager = getDiskCacheManager();
        if (diskCacheManager == null) {
            return 0L;
        }
        return diskCacheManager.getCacheSize();
    }

    public int getCacheCount() {
        com.blankj.utilcode.util.CacheDiskUtils.DiskCacheManager diskCacheManager = getDiskCacheManager();
        if (diskCacheManager == null) {
            return 0;
        }
        return diskCacheManager.getCacheCount();
    }

    public boolean remove(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        com.blankj.utilcode.util.CacheDiskUtils.DiskCacheManager diskCacheManager = getDiskCacheManager();
        if (diskCacheManager == null) {
            return true;
        }
        if (diskCacheManager.removeByKey(TYPE_BYTE + str)) {
            if (diskCacheManager.removeByKey(TYPE_STRING + str)) {
                if (diskCacheManager.removeByKey(TYPE_JSON_OBJECT + str)) {
                    if (diskCacheManager.removeByKey(TYPE_JSON_ARRAY + str)) {
                        if (diskCacheManager.removeByKey(TYPE_BITMAP + str)) {
                            if (diskCacheManager.removeByKey(TYPE_DRAWABLE + str)) {
                                if (diskCacheManager.removeByKey(TYPE_PARCELABLE + str)) {
                                    if (diskCacheManager.removeByKey(TYPE_SERIALIZABLE + str)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean clear() {
        com.blankj.utilcode.util.CacheDiskUtils.DiskCacheManager diskCacheManager = getDiskCacheManager();
        if (diskCacheManager == null) {
            return true;
        }
        return diskCacheManager.clear();
    }

    private static final class DiskCacheManager {
        private final java.util.concurrent.atomic.AtomicInteger cacheCount;
        private final java.io.File cacheDir;
        private final java.util.concurrent.atomic.AtomicLong cacheSize;
        private final int countLimit;
        private final java.util.Map<java.io.File, java.lang.Long> lastUsageDates;
        private final java.lang.Thread mThread;
        private final long sizeLimit;

        private DiskCacheManager(final java.io.File file, long j, int i) {
            this.lastUsageDates = java.util.Collections.synchronizedMap(new java.util.HashMap());
            this.cacheDir = file;
            this.sizeLimit = j;
            this.countLimit = i;
            this.cacheSize = new java.util.concurrent.atomic.AtomicLong();
            this.cacheCount = new java.util.concurrent.atomic.AtomicInteger();
            java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: com.blankj.utilcode.util.CacheDiskUtils.DiskCacheManager.1
                @Override // java.lang.Runnable
                public void run() {
                    java.io.File[] listFiles = file.listFiles(new java.io.FilenameFilter() { // from class: com.blankj.utilcode.util.CacheDiskUtils.DiskCacheManager.1.1
                        @Override // java.io.FilenameFilter
                        public boolean accept(java.io.File file2, java.lang.String str) {
                            return str.startsWith(com.blankj.utilcode.util.CacheDiskUtils.CACHE_PREFIX);
                        }
                    });
                    if (listFiles != null) {
                        int i2 = 0;
                        int i3 = 0;
                        for (java.io.File file2 : listFiles) {
                            i2 = (int) (i2 + file2.length());
                            i3++;
                            com.blankj.utilcode.util.CacheDiskUtils.DiskCacheManager.this.lastUsageDates.put(file2, java.lang.Long.valueOf(file2.lastModified()));
                        }
                        com.blankj.utilcode.util.CacheDiskUtils.DiskCacheManager.this.cacheSize.getAndAdd(i2);
                        com.blankj.utilcode.util.CacheDiskUtils.DiskCacheManager.this.cacheCount.getAndAdd(i3);
                    }
                }
            });
            this.mThread = thread;
            thread.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getCacheSize() {
            wait2InitOk();
            return this.cacheSize.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getCacheCount() {
            wait2InitOk();
            return this.cacheCount.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.io.File getFileBeforePut(java.lang.String str) {
            wait2InitOk();
            java.io.File file = new java.io.File(this.cacheDir, getCacheNameByKey(str));
            if (file.exists()) {
                this.cacheCount.addAndGet(-1);
                this.cacheSize.addAndGet(-file.length());
            }
            return file;
        }

        private void wait2InitOk() {
            try {
                this.mThread.join();
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.io.File getFileIfExists(java.lang.String str) {
            java.io.File file = new java.io.File(this.cacheDir, getCacheNameByKey(str));
            if (file.exists()) {
                return file;
            }
            return null;
        }

        private java.lang.String getCacheNameByKey(java.lang.String str) {
            return com.blankj.utilcode.util.CacheDiskUtils.CACHE_PREFIX + str.substring(0, 3) + str.substring(3).hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void put(java.io.File file) {
            this.cacheCount.addAndGet(1);
            this.cacheSize.addAndGet(file.length());
            while (true) {
                if (this.cacheCount.get() <= this.countLimit && this.cacheSize.get() <= this.sizeLimit) {
                    return;
                }
                this.cacheSize.addAndGet(-removeOldest());
                this.cacheCount.addAndGet(-1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateModify(java.io.File file) {
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            file.setLastModified(valueOf.longValue());
            this.lastUsageDates.put(file, valueOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean removeByKey(java.lang.String str) {
            java.io.File fileIfExists = getFileIfExists(str);
            if (fileIfExists == null) {
                return true;
            }
            if (!fileIfExists.delete()) {
                return false;
            }
            this.cacheSize.addAndGet(-fileIfExists.length());
            this.cacheCount.addAndGet(-1);
            this.lastUsageDates.remove(fileIfExists);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean clear() {
            java.io.File[] listFiles = this.cacheDir.listFiles(new java.io.FilenameFilter() { // from class: com.blankj.utilcode.util.CacheDiskUtils.DiskCacheManager.2
                @Override // java.io.FilenameFilter
                public boolean accept(java.io.File file, java.lang.String str) {
                    return str.startsWith(com.blankj.utilcode.util.CacheDiskUtils.CACHE_PREFIX);
                }
            });
            boolean z = true;
            if (listFiles != null && listFiles.length > 0) {
                for (java.io.File file : listFiles) {
                    if (file.delete()) {
                        this.cacheSize.addAndGet(-file.length());
                        this.cacheCount.addAndGet(-1);
                        this.lastUsageDates.remove(file);
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    this.lastUsageDates.clear();
                    this.cacheSize.set(0L);
                    this.cacheCount.set(0);
                }
            }
            return z;
        }

        private long removeOldest() {
            if (this.lastUsageDates.isEmpty()) {
                return 0L;
            }
            java.lang.Long l = Long.MAX_VALUE;
            java.io.File file = null;
            java.util.Set<java.util.Map.Entry<java.io.File, java.lang.Long>> entrySet = this.lastUsageDates.entrySet();
            synchronized (this.lastUsageDates) {
                for (java.util.Map.Entry<java.io.File, java.lang.Long> entry : entrySet) {
                    java.lang.Long value = entry.getValue();
                    if (value.longValue() < l.longValue()) {
                        file = entry.getKey();
                        l = value;
                    }
                }
            }
            if (file == null) {
                return 0L;
            }
            long length = file.length();
            if (!file.delete()) {
                return 0L;
            }
            this.lastUsageDates.remove(file);
            return length;
        }
    }

    private static final class DiskCacheHelper {
        static final int TIME_INFO_LEN = 14;

        private DiskCacheHelper() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] newByteArrayWithTime(int i, byte[] bArr) {
            byte[] bytes = createDueTime(i).getBytes();
            byte[] bArr2 = new byte[bytes.length + bArr.length];
            java.lang.System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            java.lang.System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            return bArr2;
        }

        private static java.lang.String createDueTime(int i) {
            return java.lang.String.format(java.util.Locale.getDefault(), "_$%010d$_", java.lang.Long.valueOf((java.lang.System.currentTimeMillis() / 1000) + i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isDue(byte[] bArr) {
            long dueTime = getDueTime(bArr);
            return dueTime != -1 && java.lang.System.currentTimeMillis() > dueTime;
        }

        private static long getDueTime(byte[] bArr) {
            if (hasTimeInfo(bArr)) {
                try {
                    return java.lang.Long.parseLong(new java.lang.String(copyOfRange(bArr, 2, 12))) * 1000;
                } catch (java.lang.NumberFormatException unused) {
                }
            }
            return -1L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] getDataWithoutDueTime(byte[] bArr) {
            return hasTimeInfo(bArr) ? copyOfRange(bArr, 14, bArr.length) : bArr;
        }

        private static byte[] copyOfRange(byte[] bArr, int i, int i2) {
            int i3 = i2 - i;
            if (i3 < 0) {
                throw new java.lang.IllegalArgumentException(i + " > " + i2);
            }
            byte[] bArr2 = new byte[i3];
            java.lang.System.arraycopy(bArr, i, bArr2, 0, java.lang.Math.min(bArr.length - i, i3));
            return bArr2;
        }

        private static boolean hasTimeInfo(byte[] bArr) {
            return bArr != null && bArr.length >= 14 && bArr[0] == 95 && bArr[1] == 36 && bArr[12] == 36 && bArr[13] == 95;
        }
    }
}
