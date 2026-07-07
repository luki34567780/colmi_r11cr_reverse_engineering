package com.frank.ffmpeg;

/* loaded from: /tmp/dex/classes2.dex */
public class FFmpegHandler {
    public static final int MSG_BEGIN = 9012;
    public static final int MSG_CONTINUE = 2012;
    public static final int MSG_FINISH = 1112;
    public static final int MSG_INFO = 2222;
    public static final int MSG_PROGRESS = 1002;
    public static final int MSG_TOAST = 5432;
    private static final java.lang.String TAG = "FFmpegHandler";
    private final android.os.Handler mHandler;
    private boolean isContinue = false;
    private long startTimestamp = 0;

    public FFmpegHandler(android.os.Handler handler) {
        this.mHandler = handler;
    }

    public void isContinue(boolean z) {
        this.isContinue = z;
    }

    public void executeFFmpegCmd(java.lang.String[] strArr) {
        if (strArr == null) {
            return;
        }
        com.frank.ffmpeg.FFmpegCmd.execute(strArr, new com.frank.ffmpeg.OnHandleListener() { // from class: com.frank.ffmpeg.FFmpegHandler.1
            @Override // com.frank.ffmpeg.OnHandleListener
            public void onBegin() {
                android.util.Log.i(com.frank.ffmpeg.FFmpegHandler.TAG, "handle onBegin...");
                com.frank.ffmpeg.FFmpegHandler.this.mHandler.obtainMessage(com.frank.ffmpeg.FFmpegHandler.MSG_BEGIN).sendToTarget();
                com.frank.ffmpeg.FFmpegHandler.this.startTimestamp = java.lang.System.currentTimeMillis();
            }

            @Override // com.frank.ffmpeg.OnHandleListener
            public void onMsg(java.lang.String str) {
                com.frank.ffmpeg.FFmpegHandler.this.mHandler.obtainMessage(com.frank.ffmpeg.FFmpegHandler.MSG_INFO, str).sendToTarget();
            }

            @Override // com.frank.ffmpeg.OnHandleListener
            public void onProgress(int i, int i2) {
                com.frank.ffmpeg.FFmpegHandler.this.mHandler.obtainMessage(1002, i, i2).sendToTarget();
            }

            @Override // com.frank.ffmpeg.OnHandleListener
            public void onEnd(int i, java.lang.String str) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - com.frank.ffmpeg.FFmpegHandler.this.startTimestamp;
                long j = currentTimeMillis / 1000;
                long j2 = j / 60;
                long j3 = j % 60;
                long j4 = currentTimeMillis % 1000;
                if (j2 > 0) {
                    android.util.Log.i(com.frank.ffmpeg.FFmpegHandler.TAG, "handle onEnd time=" + j2 + ":" + j3 + "." + j4);
                } else {
                    android.util.Log.i(com.frank.ffmpeg.FFmpegHandler.TAG, "handle onEnd time=" + j3 + "." + j4);
                }
                if (com.frank.ffmpeg.FFmpegHandler.this.isContinue) {
                    com.frank.ffmpeg.FFmpegHandler.this.mHandler.obtainMessage(com.frank.ffmpeg.FFmpegHandler.MSG_CONTINUE).sendToTarget();
                } else {
                    com.frank.ffmpeg.FFmpegHandler.this.mHandler.removeMessages(1002);
                    com.frank.ffmpeg.FFmpegHandler.this.mHandler.obtainMessage(com.frank.ffmpeg.FFmpegHandler.MSG_FINISH).sendToTarget();
                }
            }
        });
    }

    public void cancelExecute(boolean z) {
        com.frank.ffmpeg.FFmpegCmd.cancelTask(z);
    }

    public void executeFFmpegCmds(java.util.List<java.lang.String[]> list) {
        if (list == null) {
            return;
        }
        com.frank.ffmpeg.FFmpegCmd.execute(list, new com.frank.ffmpeg.OnHandleListener() { // from class: com.frank.ffmpeg.FFmpegHandler.2
            @Override // com.frank.ffmpeg.OnHandleListener
            public void onMsg(java.lang.String str) {
            }

            @Override // com.frank.ffmpeg.OnHandleListener
            public void onBegin() {
                android.util.Log.i(com.frank.ffmpeg.FFmpegHandler.TAG, "handle onBegin...");
                com.frank.ffmpeg.FFmpegHandler.this.mHandler.obtainMessage(com.frank.ffmpeg.FFmpegHandler.MSG_BEGIN).sendToTarget();
            }

            @Override // com.frank.ffmpeg.OnHandleListener
            public void onProgress(int i, int i2) {
                com.frank.ffmpeg.FFmpegHandler.this.mHandler.obtainMessage(1002, i, i2).sendToTarget();
            }

            @Override // com.frank.ffmpeg.OnHandleListener
            public void onEnd(int i, java.lang.String str) {
                android.util.Log.i(com.frank.ffmpeg.FFmpegHandler.TAG, "handle onEnd...");
                if (com.frank.ffmpeg.FFmpegHandler.this.isContinue) {
                    com.frank.ffmpeg.FFmpegHandler.this.mHandler.obtainMessage(com.frank.ffmpeg.FFmpegHandler.MSG_CONTINUE).sendToTarget();
                } else {
                    com.frank.ffmpeg.FFmpegHandler.this.mHandler.obtainMessage(com.frank.ffmpeg.FFmpegHandler.MSG_FINISH).sendToTarget();
                }
            }
        });
    }

    public void executeFFprobeCmd(java.lang.String[] strArr) {
        if (strArr == null) {
            return;
        }
        com.frank.ffmpeg.FFmpegCmd.executeProbe(strArr, new com.frank.ffmpeg.OnHandleListener() { // from class: com.frank.ffmpeg.FFmpegHandler.3
            @Override // com.frank.ffmpeg.OnHandleListener
            public void onMsg(java.lang.String str) {
            }

            @Override // com.frank.ffmpeg.OnHandleListener
            public void onProgress(int i, int i2) {
            }

            @Override // com.frank.ffmpeg.OnHandleListener
            public void onBegin() {
                android.util.Log.i(com.frank.ffmpeg.FFmpegHandler.TAG, "handle ffprobe onBegin...");
                com.frank.ffmpeg.FFmpegHandler.this.mHandler.obtainMessage(com.frank.ffmpeg.FFmpegHandler.MSG_BEGIN).sendToTarget();
            }

            @Override // com.frank.ffmpeg.OnHandleListener
            public void onEnd(int i, java.lang.String str) {
                android.util.Log.i(com.frank.ffmpeg.FFmpegHandler.TAG, "handle ffprobe onEnd result=" + str);
                com.frank.ffmpeg.FFmpegHandler.this.mHandler.obtainMessage(com.frank.ffmpeg.FFmpegHandler.MSG_FINISH, (str == null || str.isEmpty()) ? null : com.frank.ffmpeg.JsonParseTool.INSTANCE.parseMediaFormat(str)).sendToTarget();
            }
        });
    }
}
