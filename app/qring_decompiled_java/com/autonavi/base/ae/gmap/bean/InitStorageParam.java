package com.autonavi.base.ae.gmap.bean;

/* loaded from: classes.dex */
public class InitStorageParam {
    private static final java.lang.String DIR_NAME = "terrain_dem_files";
    private static final java.lang.String INIT_STORAGE_DIR = "mapcache";
    private int maxFileCount;
    private long maxFileSize;
    private java.lang.String path;
    private int version;

    public static class Holder {
        private static java.lang.String sPath;

        public static void initPath(java.lang.String str) {
            java.io.File file = new java.io.File(str);
            java.io.File file2 = new java.io.File(file, com.autonavi.base.ae.gmap.bean.InitStorageParam.INIT_STORAGE_DIR);
            if (file.isDirectory()) {
                if (!file2.exists()) {
                    file2.mkdir();
                }
                java.io.File file3 = new java.io.File(file2, com.autonavi.base.ae.gmap.bean.InitStorageParam.DIR_NAME);
                if (!file3.exists()) {
                    file3.mkdir();
                }
                sPath = file3.getAbsolutePath();
            }
        }
    }

    public static com.autonavi.base.ae.gmap.bean.InitStorageParam obtain() {
        return new com.autonavi.base.ae.gmap.bean.InitStorageParam();
    }

    public static com.autonavi.base.ae.gmap.bean.InitStorageParam obtain(int i, java.lang.String str, int i2, long j) {
        return new com.autonavi.base.ae.gmap.bean.InitStorageParam(i, str, i2, j);
    }

    private InitStorageParam(int i, java.lang.String str, int i2, long j) {
        this.version = i;
        this.path = str;
        this.maxFileCount = i2;
        this.maxFileSize = j;
    }

    private InitStorageParam() {
        this(1, com.autonavi.base.ae.gmap.bean.InitStorageParam.Holder.sPath, 1000, androidx.work.PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
    }

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public int getMaxFileCount() {
        return this.maxFileCount;
    }

    public void setMaxFileCount(int i) {
        this.maxFileCount = i;
    }

    public long getMaxFileSize() {
        return this.maxFileSize;
    }

    public void setMaxFileSize(long j) {
        this.maxFileSize = j;
    }

    public java.lang.String getPath() {
        return this.path;
    }

    public void setPath(java.lang.String str) {
        this.path = str;
    }

    public java.lang.String toString() {
        return "InitStorageParam{version=" + this.version + ", maxFileCount=" + this.maxFileCount + ", maxFileSize=" + this.maxFileSize + ", path='" + this.path + "'}";
    }
}
