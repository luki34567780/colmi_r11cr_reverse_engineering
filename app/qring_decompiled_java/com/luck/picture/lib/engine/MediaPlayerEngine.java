package com.luck.picture.lib.engine;

/* loaded from: /tmp/dex/classes2.dex */
public class MediaPlayerEngine implements com.luck.picture.lib.engine.VideoPlayerEngine<com.luck.picture.lib.widget.MediaPlayerView> {
    private final java.util.concurrent.CopyOnWriteArrayList<com.luck.picture.lib.interfaces.OnPlayerListener> listeners = new java.util.concurrent.CopyOnWriteArrayList<>();

    @Override // com.luck.picture.lib.engine.VideoPlayerEngine
    public android.view.View onCreateVideoPlayer(android.content.Context context) {
        return new com.luck.picture.lib.widget.MediaPlayerView(context);
    }

    @Override // com.luck.picture.lib.engine.VideoPlayerEngine
    public void onStarPlayer(com.luck.picture.lib.widget.MediaPlayerView mediaPlayerView, com.luck.picture.lib.entity.LocalMedia localMedia) {
        java.lang.String availablePath = localMedia.getAvailablePath();
        android.media.MediaPlayer mediaPlayer = mediaPlayerView.getMediaPlayer();
        mediaPlayerView.getSurfaceView().setZOrderOnTop(com.luck.picture.lib.config.PictureMimeType.isHasHttp(availablePath));
        mediaPlayer.setLooping(com.luck.picture.lib.config.SelectorProviders.getInstance().getSelectorConfig().isLoopAutoPlay);
        mediaPlayerView.start(availablePath);
    }

    @Override // com.luck.picture.lib.engine.VideoPlayerEngine
    public void onResume(com.luck.picture.lib.widget.MediaPlayerView mediaPlayerView) {
        android.media.MediaPlayer mediaPlayer = mediaPlayerView.getMediaPlayer();
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    @Override // com.luck.picture.lib.engine.VideoPlayerEngine
    public void onPause(com.luck.picture.lib.widget.MediaPlayerView mediaPlayerView) {
        android.media.MediaPlayer mediaPlayer = mediaPlayerView.getMediaPlayer();
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    @Override // com.luck.picture.lib.engine.VideoPlayerEngine
    public boolean isPlaying(com.luck.picture.lib.widget.MediaPlayerView mediaPlayerView) {
        android.media.MediaPlayer mediaPlayer = mediaPlayerView.getMediaPlayer();
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    @Override // com.luck.picture.lib.engine.VideoPlayerEngine
    public void addPlayListener(com.luck.picture.lib.interfaces.OnPlayerListener onPlayerListener) {
        if (this.listeners.contains(onPlayerListener)) {
            return;
        }
        this.listeners.add(onPlayerListener);
    }

    @Override // com.luck.picture.lib.engine.VideoPlayerEngine
    public void removePlayListener(com.luck.picture.lib.interfaces.OnPlayerListener onPlayerListener) {
        if (onPlayerListener != null) {
            this.listeners.remove(onPlayerListener);
        } else {
            this.listeners.clear();
        }
    }

    @Override // com.luck.picture.lib.engine.VideoPlayerEngine
    public void onPlayerAttachedToWindow(final com.luck.picture.lib.widget.MediaPlayerView mediaPlayerView) {
        android.media.MediaPlayer initMediaPlayer = mediaPlayerView.initMediaPlayer();
        initMediaPlayer.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() { // from class: com.luck.picture.lib.engine.MediaPlayerEngine.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(android.media.MediaPlayer mediaPlayer) {
                mediaPlayer.start();
                for (int i = 0; i < com.luck.picture.lib.engine.MediaPlayerEngine.this.listeners.size(); i++) {
                    ((com.luck.picture.lib.interfaces.OnPlayerListener) com.luck.picture.lib.engine.MediaPlayerEngine.this.listeners.get(i)).onPlayerReady();
                }
            }
        });
        initMediaPlayer.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() { // from class: com.luck.picture.lib.engine.MediaPlayerEngine.2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(android.media.MediaPlayer mediaPlayer) {
                mediaPlayer.reset();
                for (int i = 0; i < com.luck.picture.lib.engine.MediaPlayerEngine.this.listeners.size(); i++) {
                    ((com.luck.picture.lib.interfaces.OnPlayerListener) com.luck.picture.lib.engine.MediaPlayerEngine.this.listeners.get(i)).onPlayerEnd();
                }
                mediaPlayerView.clearCanvas();
            }
        });
        initMediaPlayer.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() { // from class: com.luck.picture.lib.engine.MediaPlayerEngine.3
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
                for (int i3 = 0; i3 < com.luck.picture.lib.engine.MediaPlayerEngine.this.listeners.size(); i3++) {
                    ((com.luck.picture.lib.interfaces.OnPlayerListener) com.luck.picture.lib.engine.MediaPlayerEngine.this.listeners.get(i3)).onPlayerError();
                }
                return false;
            }
        });
    }

    @Override // com.luck.picture.lib.engine.VideoPlayerEngine
    public void onPlayerDetachedFromWindow(com.luck.picture.lib.widget.MediaPlayerView mediaPlayerView) {
        mediaPlayerView.release();
    }

    @Override // com.luck.picture.lib.engine.VideoPlayerEngine
    public void destroy(com.luck.picture.lib.widget.MediaPlayerView mediaPlayerView) {
        mediaPlayerView.release();
    }
}
