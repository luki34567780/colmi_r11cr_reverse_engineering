package me.pqpo.librarylog4a;

/* loaded from: classes3.dex */
public class LogBuffer {
    private static final java.lang.String TAG = "LogBuffer";
    private java.lang.String bufferPath;
    private int bufferSize;
    private boolean compress;
    private java.lang.String logPath;
    private long ptr;

    private native void changeLogPathNative(long j, java.lang.String str);

    private native void flushAsyncNative(long j);

    private static native long initNative(java.lang.String str, int i, java.lang.String str2, boolean z);

    private native void releaseNative(long j);

    private native void writeNative(long j, java.lang.String str);

    public LogBuffer(java.lang.String str, int i, java.lang.String str2, boolean z) {
        this.ptr = 0L;
        this.bufferPath = str;
        this.bufferSize = i;
        this.logPath = str2;
        this.compress = z;
        try {
            this.ptr = initNative(str, i, str2, z);
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "LogBuffer Initialization Exception", e);
        }
    }

    public void changeLogPath(java.lang.String str) {
        long j = this.ptr;
        if (j != 0) {
            try {
                changeLogPathNative(j, str);
                this.logPath = str;
            } catch (java.lang.Exception e) {
                android.util.Log.e(TAG, e.getMessage(), e);
            }
        }
    }

    public boolean isCompress() {
        return this.compress;
    }

    public java.lang.String getLogPath() {
        return this.logPath;
    }

    public java.lang.String getBufferPath() {
        return this.bufferPath;
    }

    public int getBufferSize() {
        return this.bufferSize;
    }

    public void write(java.lang.String str) {
        long j = this.ptr;
        if (j != 0) {
            try {
                writeNative(j, str);
            } catch (java.lang.Exception e) {
                android.util.Log.e(TAG, e.getMessage(), e);
            }
        }
    }

    public void flushAsync() {
        long j = this.ptr;
        if (j != 0) {
            try {
                flushAsyncNative(j);
            } catch (java.lang.Exception e) {
                android.util.Log.e(TAG, e.getMessage(), e);
            }
        }
    }

    public void release() {
        long j = this.ptr;
        if (j != 0) {
            try {
                releaseNative(j);
            } catch (java.lang.Exception e) {
                android.util.Log.e(TAG, e.getMessage(), e);
            }
            this.ptr = 0L;
        }
    }

    static {
        java.lang.System.loadLibrary("log4a-lib");
    }
}
