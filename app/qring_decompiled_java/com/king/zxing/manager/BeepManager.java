package com.king.zxing.manager;

/* loaded from: /tmp/dex/classes2.dex */
public final class BeepManager implements android.media.MediaPlayer.OnErrorListener, java.io.Closeable {
    private static final long VIBRATE_DURATION = 200;
    private final android.content.Context context;
    private android.media.MediaPlayer mediaPlayer = null;
    private boolean playBeep;
    private boolean vibrate;
    private android.os.Vibrator vibrator;

    public BeepManager(android.content.Context context) {
        this.context = context;
        updatePrefs();
    }

    public void setVibrate(boolean z) {
        this.vibrate = z;
    }

    public void setPlayBeep(boolean z) {
        this.playBeep = z;
    }

    private synchronized void updatePrefs() {
        if (this.mediaPlayer == null) {
            this.mediaPlayer = buildMediaPlayer(this.context);
        }
        if (this.vibrator == null) {
            this.vibrator = (android.os.Vibrator) this.context.getSystemService("vibrator");
        }
    }

    public synchronized void playBeepSoundAndVibrate() {
        android.media.MediaPlayer mediaPlayer;
        if (this.playBeep && (mediaPlayer = this.mediaPlayer) != null) {
            mediaPlayer.start();
        }
        if (this.vibrate) {
            this.vibrator.vibrate(VIBRATE_DURATION);
        }
    }

    private android.media.MediaPlayer buildMediaPlayer(android.content.Context context) {
        android.media.MediaPlayer mediaPlayer = new android.media.MediaPlayer();
        try {
            android.content.res.AssetFileDescriptor openRawResourceFd = context.getResources().openRawResourceFd(com.king.zxing.R.raw.zxl_beep);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setAudioStreamType(3);
            mediaPlayer.setLooping(false);
            mediaPlayer.prepare();
            return mediaPlayer;
        } catch (java.lang.Exception e) {
            com.king.zxing.util.LogUtils.w(e);
            mediaPlayer.release();
            return null;
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public synchronized boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        close();
        updatePrefs();
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            android.media.MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                this.mediaPlayer = null;
            }
        } catch (java.lang.Exception e) {
            com.king.zxing.util.LogUtils.e(e);
        }
    }
}
