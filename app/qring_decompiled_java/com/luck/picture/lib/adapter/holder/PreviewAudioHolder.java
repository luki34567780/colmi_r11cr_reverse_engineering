package com.luck.picture.lib.adapter.holder;

/* loaded from: /tmp/dex/classes2.dex */
public class PreviewAudioHolder extends com.luck.picture.lib.adapter.holder.BasePreviewHolder {
    private static final long MAX_BACK_FAST_MS = 3000;
    private static final long MAX_UPDATE_INTERVAL_MS = 1000;
    private static final long MIN_CURRENT_POSITION = 1000;
    private boolean isPausePlayer;
    public android.widget.ImageView ivPlayBack;
    public android.widget.ImageView ivPlayButton;
    public android.widget.ImageView ivPlayFast;
    private final android.os.Handler mHandler;
    private final android.media.MediaPlayer.OnCompletionListener mPlayCompletionListener;
    private final android.media.MediaPlayer.OnErrorListener mPlayErrorListener;
    private final android.media.MediaPlayer.OnPreparedListener mPlayPreparedListener;
    private android.media.MediaPlayer mPlayer;
    public java.lang.Runnable mTickerRunnable;
    public android.widget.SeekBar seekBar;
    public android.widget.TextView tvAudioName;
    public android.widget.TextView tvCurrentTime;
    public android.widget.TextView tvTotalDuration;

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    protected void findViews(android.view.View view) {
    }

    public PreviewAudioHolder(android.view.View view) {
        super(view);
        this.mHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.mPlayer = new android.media.MediaPlayer();
        this.isPausePlayer = false;
        this.mTickerRunnable = new java.lang.Runnable() { // from class: com.luck.picture.lib.adapter.holder.PreviewAudioHolder.1
            @Override // java.lang.Runnable
            public void run() {
                long currentPosition = com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.mPlayer.getCurrentPosition();
                java.lang.String formatDurationTime = com.luck.picture.lib.utils.DateUtils.formatDurationTime(currentPosition);
                if (!android.text.TextUtils.equals(formatDurationTime, com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.tvCurrentTime.getText())) {
                    com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.tvCurrentTime.setText(formatDurationTime);
                    if (com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.mPlayer.getDuration() - currentPosition <= 1000) {
                        com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.seekBar.setProgress(com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.mPlayer.getDuration());
                    } else {
                        com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.seekBar.setProgress((int) currentPosition);
                    }
                }
                com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.mHandler.postDelayed(this, 1000 - (currentPosition % 1000));
            }
        };
        this.mPlayCompletionListener = new android.media.MediaPlayer.OnCompletionListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewAudioHolder.10
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(android.media.MediaPlayer mediaPlayer) {
                com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.stopUpdateProgress();
                com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.resetMediaPlayer();
                com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.playerDefaultUI(true);
            }
        };
        this.mPlayErrorListener = new android.media.MediaPlayer.OnErrorListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewAudioHolder.11
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
                com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.resetMediaPlayer();
                com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.playerDefaultUI(true);
                return false;
            }
        };
        this.mPlayPreparedListener = new android.media.MediaPlayer.OnPreparedListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewAudioHolder.12
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(android.media.MediaPlayer mediaPlayer) {
                if (!mediaPlayer.isPlaying()) {
                    com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.stopUpdateProgress();
                    com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.resetMediaPlayer();
                    com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.playerDefaultUI(true);
                } else {
                    com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.seekBar.setMax(mediaPlayer.getDuration());
                    com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.startUpdateProgress();
                    com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.playerIngUI();
                }
            }
        };
        this.ivPlayButton = (android.widget.ImageView) view.findViewById(com.luck.picture.lib.R.id.iv_play_video);
        this.tvAudioName = (android.widget.TextView) view.findViewById(com.luck.picture.lib.R.id.tv_audio_name);
        this.tvCurrentTime = (android.widget.TextView) view.findViewById(com.luck.picture.lib.R.id.tv_current_time);
        this.tvTotalDuration = (android.widget.TextView) view.findViewById(com.luck.picture.lib.R.id.tv_total_duration);
        this.seekBar = (android.widget.SeekBar) view.findViewById(com.luck.picture.lib.R.id.music_seek_bar);
        this.ivPlayBack = (android.widget.ImageView) view.findViewById(com.luck.picture.lib.R.id.iv_play_back);
        this.ivPlayFast = (android.widget.ImageView) view.findViewById(com.luck.picture.lib.R.id.iv_play_fast);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    protected void loadImage(com.luck.picture.lib.entity.LocalMedia localMedia, int i, int i2) {
        this.tvAudioName.setCompoundDrawablesRelativeWithIntrinsicBounds(0, com.luck.picture.lib.R.drawable.ps_ic_audio_play_cover, 0, 0);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    protected void onClickBackPressed() {
        this.coverImageView.setOnViewTapListener(new com.luck.picture.lib.photoview.OnViewTapListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewAudioHolder.2
            @Override // com.luck.picture.lib.photoview.OnViewTapListener
            public void onViewTap(android.view.View view, float f, float f2) {
                if (com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.mPreviewEventListener != null) {
                    com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.mPreviewEventListener.onBackPressed();
                }
            }
        });
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    protected void onLongPressDownload(final com.luck.picture.lib.entity.LocalMedia localMedia) {
        this.coverImageView.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewAudioHolder.3
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(android.view.View view) {
                if (com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.mPreviewEventListener == null) {
                    return false;
                }
                com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.mPreviewEventListener.onLongPressDownload(localMedia);
                return false;
            }
        });
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void bindData(final com.luck.picture.lib.entity.LocalMedia localMedia, int i) {
        final java.lang.String availablePath = localMedia.getAvailablePath();
        java.lang.String yearDataFormat = com.luck.picture.lib.utils.DateUtils.getYearDataFormat(localMedia.getDateAddedTime());
        java.lang.String formatAccurateUnitFileSize = com.luck.picture.lib.utils.PictureFileUtils.formatAccurateUnitFileSize(localMedia.getSize());
        loadImage(localMedia, -1, -1);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(localMedia.getFileName());
        sb.append("\n");
        sb.append(yearDataFormat);
        sb.append(" - ");
        sb.append(formatAccurateUnitFileSize);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(sb.toString());
        java.lang.String str = yearDataFormat + " - " + formatAccurateUnitFileSize;
        int indexOf = sb.indexOf(str);
        int length = str.length() + indexOf;
        spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan(com.luck.picture.lib.utils.DensityUtil.dip2px(this.itemView.getContext(), 12.0f)), indexOf, length, 17);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(-10132123), indexOf, length, 17);
        this.tvAudioName.setText(spannableStringBuilder);
        this.tvTotalDuration.setText(com.luck.picture.lib.utils.DateUtils.formatDurationTime(localMedia.getDuration()));
        this.seekBar.setMax((int) localMedia.getDuration());
        setBackFastUI(false);
        this.ivPlayBack.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewAudioHolder.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.slowAudioPlay();
            }
        });
        this.ivPlayFast.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewAudioHolder.5
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.fastAudioPlay();
            }
        });
        this.seekBar.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewAudioHolder.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(android.widget.SeekBar seekBar, int i2, boolean z) {
                if (z) {
                    seekBar.setProgress(i2);
                    com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.setCurrentPlayTime(i2);
                    if (com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.isPlaying()) {
                        com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.mPlayer.seekTo(seekBar.getProgress());
                    }
                }
            }
        });
        this.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewAudioHolder.7
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.mPreviewEventListener != null) {
                    com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.mPreviewEventListener.onBackPressed();
                }
            }
        });
        this.ivPlayButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewAudioHolder.8
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                try {
                    if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
                        return;
                    }
                    com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.mPreviewEventListener.onPreviewVideoTitle(localMedia.getFileName());
                    if (com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.isPlaying()) {
                        com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.pausePlayer();
                    } else if (com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.isPausePlayer) {
                        com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.resumePlayer();
                    } else {
                        com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.startPlayer(availablePath);
                    }
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.itemView.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewAudioHolder.9
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(android.view.View view) {
                if (com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.mPreviewEventListener == null) {
                    return false;
                }
                com.luck.picture.lib.adapter.holder.PreviewAudioHolder.this.mPreviewEventListener.onLongPressDownload(localMedia);
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPlayer(java.lang.String str) {
        try {
            if (com.luck.picture.lib.config.PictureMimeType.isContent(str)) {
                this.mPlayer.setDataSource(this.itemView.getContext(), android.net.Uri.parse(str));
            } else {
                this.mPlayer.setDataSource(str);
            }
            this.mPlayer.prepare();
            this.mPlayer.seekTo(this.seekBar.getProgress());
            this.mPlayer.start();
            this.isPausePlayer = false;
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public boolean isPlaying() {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pausePlayer() {
        this.mPlayer.pause();
        this.isPausePlayer = true;
        playerDefaultUI(false);
        stopUpdateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumePlayer() {
        this.mPlayer.seekTo(this.seekBar.getProgress());
        this.mPlayer.start();
        startUpdateProgress();
        playerIngUI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetMediaPlayer() {
        this.isPausePlayer = false;
        this.mPlayer.stop();
        this.mPlayer.reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentPlayTime(int i) {
        this.tvCurrentTime.setText(com.luck.picture.lib.utils.DateUtils.formatDurationTime(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fastAudioPlay() {
        long progress = this.seekBar.getProgress() + MAX_BACK_FAST_MS;
        if (progress >= this.seekBar.getMax()) {
            android.widget.SeekBar seekBar = this.seekBar;
            seekBar.setProgress(seekBar.getMax());
        } else {
            this.seekBar.setProgress((int) progress);
        }
        setCurrentPlayTime(this.seekBar.getProgress());
        this.mPlayer.seekTo(this.seekBar.getProgress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void slowAudioPlay() {
        long progress = this.seekBar.getProgress() - MAX_BACK_FAST_MS;
        if (progress <= 0) {
            this.seekBar.setProgress(0);
        } else {
            this.seekBar.setProgress((int) progress);
        }
        setCurrentPlayTime(this.seekBar.getProgress());
        this.mPlayer.seekTo(this.seekBar.getProgress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startUpdateProgress() {
        this.mHandler.post(this.mTickerRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopUpdateProgress() {
        this.mHandler.removeCallbacks(this.mTickerRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playerDefaultUI(boolean z) {
        stopUpdateProgress();
        if (z) {
            this.seekBar.setProgress(0);
            this.tvCurrentTime.setText("00:00");
        }
        setBackFastUI(false);
        this.ivPlayButton.setImageResource(com.luck.picture.lib.R.drawable.ps_ic_audio_play);
        if (this.mPreviewEventListener != null) {
            this.mPreviewEventListener.onPreviewVideoTitle(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playerIngUI() {
        startUpdateProgress();
        setBackFastUI(true);
        this.ivPlayButton.setImageResource(com.luck.picture.lib.R.drawable.ps_ic_audio_stop);
    }

    private void setBackFastUI(boolean z) {
        this.ivPlayBack.setEnabled(z);
        this.ivPlayFast.setEnabled(z);
        if (z) {
            this.ivPlayBack.setAlpha(1.0f);
            this.ivPlayFast.setAlpha(1.0f);
        } else {
            this.ivPlayBack.setAlpha(0.5f);
            this.ivPlayFast.setAlpha(0.5f);
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void onViewAttachedToWindow() {
        this.isPausePlayer = false;
        setMediaPlayerListener();
        playerDefaultUI(true);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void onViewDetachedFromWindow() {
        this.isPausePlayer = false;
        this.mHandler.removeCallbacks(this.mTickerRunnable);
        setNullMediaPlayerListener();
        resetMediaPlayer();
        playerDefaultUI(true);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void resumePausePlay() {
        if (isPlaying()) {
            pausePlayer();
        } else {
            resumePlayer();
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void release() {
        this.mHandler.removeCallbacks(this.mTickerRunnable);
        if (this.mPlayer != null) {
            setNullMediaPlayerListener();
            this.mPlayer.release();
            this.mPlayer = null;
        }
    }

    private void setMediaPlayerListener() {
        this.mPlayer.setOnCompletionListener(this.mPlayCompletionListener);
        this.mPlayer.setOnErrorListener(this.mPlayErrorListener);
        this.mPlayer.setOnPreparedListener(this.mPlayPreparedListener);
    }

    private void setNullMediaPlayerListener() {
        this.mPlayer.setOnCompletionListener(null);
        this.mPlayer.setOnErrorListener(null);
        this.mPlayer.setOnPreparedListener(null);
    }
}
