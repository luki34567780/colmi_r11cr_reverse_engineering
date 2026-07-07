package com.frank.ffmpeg;

/* loaded from: /tmp/dex/classes2.dex */
public class FFmpegCmd {
    private static final int RESULT_ERROR = 0;
    private static final int RESULT_SUCCESS = 1;
    private static final int STATE_ERROR = 3;
    private static final int STATE_FINISH = 2;
    private static final int STATE_INIT = 0;
    private static final int STATE_RUNNING = 1;
    private static final java.lang.String TAG;
    private static com.frank.ffmpeg.OnHandleListener mProgressListener;

    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FFmpegState {
    }

    private static native void cancelTaskJni(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int handle(java.lang.String[] strArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native java.lang.String handleProbe(java.lang.String[] strArr);

    static {
        java.lang.System.loadLibrary("media-handle");
        TAG = "FFmpegCmd";
    }

    public static void execute(final java.lang.String[] strArr, final com.frank.ffmpeg.OnHandleListener onHandleListener) {
        mProgressListener = onHandleListener;
        com.frank.ffmpeg.ThreadPoolUtil.INSTANCE.executeSingleThreadPool(new java.lang.Runnable() { // from class: com.frank.ffmpeg.FFmpegCmd.1
            @Override // java.lang.Runnable
            public void run() {
                com.frank.ffmpeg.OnHandleListener onHandleListener2 = com.frank.ffmpeg.OnHandleListener.this;
                if (onHandleListener2 != null) {
                    onHandleListener2.onBegin();
                }
                int handle = com.frank.ffmpeg.FFmpegCmd.handle(strArr);
                com.frank.ffmpeg.OnHandleListener onHandleListener3 = com.frank.ffmpeg.OnHandleListener.this;
                if (onHandleListener3 != null) {
                    onHandleListener3.onEnd(handle, "");
                }
                com.frank.ffmpeg.OnHandleListener unused = com.frank.ffmpeg.FFmpegCmd.mProgressListener = null;
            }
        });
    }

    public static int executeSync(java.lang.String[] strArr) {
        return handle(strArr);
    }

    public static void execute(final java.util.List<java.lang.String[]> list, final com.frank.ffmpeg.OnHandleListener onHandleListener) {
        mProgressListener = onHandleListener;
        com.frank.ffmpeg.ThreadPoolUtil.INSTANCE.executeSingleThreadPool(new java.lang.Runnable() { // from class: com.frank.ffmpeg.FFmpegCmd.2
            @Override // java.lang.Runnable
            public void run() {
                com.frank.ffmpeg.OnHandleListener onHandleListener2 = com.frank.ffmpeg.OnHandleListener.this;
                if (onHandleListener2 != null) {
                    onHandleListener2.onBegin();
                }
                java.util.Iterator it = list.iterator();
                int i = 0;
                int i2 = 0;
                while (it.hasNext()) {
                    i2 = com.frank.ffmpeg.FFmpegCmd.handle((java.lang.String[]) it.next());
                    i++;
                    android.util.Log.i(com.frank.ffmpeg.FFmpegCmd.TAG, i + " result=" + i2);
                }
                com.frank.ffmpeg.OnHandleListener onHandleListener3 = com.frank.ffmpeg.OnHandleListener.this;
                if (onHandleListener3 != null) {
                    onHandleListener3.onEnd(i2, "");
                }
                com.frank.ffmpeg.OnHandleListener unused = com.frank.ffmpeg.FFmpegCmd.mProgressListener = null;
            }
        });
    }

    public static void cancelTask(boolean z) {
        cancelTaskJni(z ? 1 : 0);
    }

    public static void executeProbe(final java.lang.String[] strArr, final com.frank.ffmpeg.OnHandleListener onHandleListener) {
        com.frank.ffmpeg.ThreadPoolUtil.INSTANCE.executeSingleThreadPool(new java.lang.Runnable() { // from class: com.frank.ffmpeg.FFmpegCmd.3
            @Override // java.lang.Runnable
            public void run() {
                com.frank.ffmpeg.OnHandleListener onHandleListener2 = com.frank.ffmpeg.OnHandleListener.this;
                if (onHandleListener2 != null) {
                    onHandleListener2.onBegin();
                }
                java.lang.String handleProbe = com.frank.ffmpeg.FFmpegCmd.handleProbe(strArr);
                int i = !android.text.TextUtils.isEmpty(handleProbe) ? 1 : 0;
                com.frank.ffmpeg.OnHandleListener onHandleListener3 = com.frank.ffmpeg.OnHandleListener.this;
                if (onHandleListener3 != null) {
                    onHandleListener3.onEnd(i, handleProbe);
                }
            }
        });
    }

    public static java.lang.String executeProbeSynchronize(java.lang.String[] strArr) {
        return handleProbe(strArr);
    }

    public static void onProgressCallback(int i, int i2, int i3) {
        com.frank.ffmpeg.OnHandleListener onHandleListener;
        android.util.Log.e(TAG, "onProgress position=" + i + "--duration=" + i2 + "--state=" + i3);
        if ((i <= i2 || i2 <= 0) && (onHandleListener = mProgressListener) != null) {
            if (i > 0 && i2 > 0) {
                int i4 = (i * 100) / i2;
                if (i4 < 100) {
                    onHandleListener.onProgress(i4, i2);
                    return;
                }
                return;
            }
            onHandleListener.onProgress(i, i2);
        }
    }

    public static void onMsgCallback(java.lang.String str, int i) {
        com.frank.ffmpeg.OnHandleListener onHandleListener;
        if (str == null || str.isEmpty()) {
            return;
        }
        android.util.Log.e(TAG, "from native msg=" + str);
        if (!str.startsWith("silence") || (onHandleListener = mProgressListener) == null) {
            return;
        }
        onHandleListener.onMsg(str);
    }
}
