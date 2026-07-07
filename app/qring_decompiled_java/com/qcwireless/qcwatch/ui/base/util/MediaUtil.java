package com.qcwireless.qcwatch.ui.base.util;

/* loaded from: /tmp/dex/classes2.dex */
public class MediaUtil {
    private static final int MIN_TIME_OUT = 2000;
    private static android.media.MediaPlayer mediaPlayer = new android.media.MediaPlayer();
    private android.app.Application application;
    protected android.media.AudioManager audioManager;
    long lastNotificationTime;
    private android.media.Ringtone ringtone;
    protected android.os.Vibrator vibrator;

    public MediaUtil(android.app.Application application) {
        this.application = application;
        this.audioManager = (android.media.AudioManager) application.getSystemService(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO);
        this.vibrator = (android.os.Vibrator) application.getSystemService("vibrator");
    }

    private void initMediaPlayer() {
        try {
            android.media.MediaPlayer create = android.media.MediaPlayer.create(this.application, com.qcwireless.qcwatch.R.raw.find);
            mediaPlayer = create;
            create.setLooping(true);
            mediaPlayer.start();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void setMediaSourceMp3(android.content.Context context, final java.lang.String path) {
        try {
            android.media.MediaPlayer mediaPlayer2 = new android.media.MediaPlayer();
            mediaPlayer = mediaPlayer2;
            mediaPlayer2.setDataSource(path);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, path.toString());
            mediaPlayer.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() { // from class: com.qcwireless.qcwatch.ui.base.util.MediaUtil.1
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(android.media.MediaPlayer mp) {
                    com.qcwireless.qcwatch.ui.base.util.MediaUtil.mediaPlayer.start();
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "-----start" + path);
                }
            });
            mediaPlayer.prepare();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static android.net.Uri getMediaUriFromPath(android.content.Context context, java.lang.String path) {
        android.net.Uri uri = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        android.database.Cursor query = context.getContentResolver().query(uri, null, "_display_name= ?", new java.lang.String[]{path.substring(path.lastIndexOf("/") + 1)}, null);
        android.net.Uri withAppendedId = query.moveToFirst() ? android.content.ContentUris.withAppendedId(uri, query.getLong(query.getColumnIndex("_id"))) : null;
        query.close();
        return withAppendedId;
    }

    public void vibrateAndPlayTone() {
        initMediaPlayer();
    }

    public void stopRing() {
        try {
            android.media.MediaPlayer mediaPlayer2 = mediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.reset();
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (java.lang.IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
