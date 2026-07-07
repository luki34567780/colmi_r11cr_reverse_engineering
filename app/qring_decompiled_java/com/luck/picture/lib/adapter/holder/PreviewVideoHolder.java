package com.luck.picture.lib.adapter.holder;

/* loaded from: /tmp/dex/classes2.dex */
public class PreviewVideoHolder extends com.luck.picture.lib.adapter.holder.BasePreviewHolder {
    private boolean isPlayed;
    public android.widget.ImageView ivPlayButton;
    private final com.luck.picture.lib.interfaces.OnPlayerListener mPlayerListener;
    public android.widget.ProgressBar progress;
    public android.view.View videoPlayer;

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    protected void findViews(android.view.View view) {
    }

    public PreviewVideoHolder(android.view.View view) {
        super(view);
        this.isPlayed = false;
        this.mPlayerListener = new com.luck.picture.lib.interfaces.OnPlayerListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewVideoHolder.5
            @Override // com.luck.picture.lib.interfaces.OnPlayerListener
            public void onPlayerError() {
                com.luck.picture.lib.adapter.holder.PreviewVideoHolder.this.playerDefaultUI();
            }

            @Override // com.luck.picture.lib.interfaces.OnPlayerListener
            public void onPlayerReady() {
                com.luck.picture.lib.adapter.holder.PreviewVideoHolder.this.playerIngUI();
            }

            @Override // com.luck.picture.lib.interfaces.OnPlayerListener
            public void onPlayerLoading() {
                com.luck.picture.lib.adapter.holder.PreviewVideoHolder.this.progress.setVisibility(0);
            }

            @Override // com.luck.picture.lib.interfaces.OnPlayerListener
            public void onPlayerEnd() {
                com.luck.picture.lib.adapter.holder.PreviewVideoHolder.this.playerDefaultUI();
            }
        };
        this.ivPlayButton = (android.widget.ImageView) view.findViewById(com.luck.picture.lib.R.id.iv_play_video);
        this.progress = (android.widget.ProgressBar) view.findViewById(com.luck.picture.lib.R.id.progress);
        this.ivPlayButton.setVisibility(this.selectorConfig.isPreviewZoomEffect ? 8 : 0);
        if (this.selectorConfig.videoPlayerEngine == null) {
            this.selectorConfig.videoPlayerEngine = new com.luck.picture.lib.engine.MediaPlayerEngine();
        }
        android.view.View onCreateVideoPlayer = this.selectorConfig.videoPlayerEngine.onCreateVideoPlayer(view.getContext());
        this.videoPlayer = onCreateVideoPlayer;
        if (onCreateVideoPlayer == null) {
            throw new java.lang.NullPointerException("onCreateVideoPlayer cannot be empty,Please implement " + com.luck.picture.lib.engine.VideoPlayerEngine.class);
        }
        if (onCreateVideoPlayer.getLayoutParams() == null) {
            this.videoPlayer.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        if (viewGroup.indexOfChild(this.videoPlayer) != -1) {
            viewGroup.removeView(this.videoPlayer);
        }
        viewGroup.addView(this.videoPlayer, 0);
        this.videoPlayer.setVisibility(8);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    protected void loadImage(com.luck.picture.lib.entity.LocalMedia localMedia, int i, int i2) {
        if (this.selectorConfig.imageEngine != null) {
            java.lang.String availablePath = localMedia.getAvailablePath();
            if (i == -1 && i2 == -1) {
                this.selectorConfig.imageEngine.loadImage(this.itemView.getContext(), availablePath, this.coverImageView);
            } else {
                this.selectorConfig.imageEngine.loadImage(this.itemView.getContext(), this.coverImageView, availablePath, i, i2);
            }
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    protected void onClickBackPressed() {
        this.coverImageView.setOnViewTapListener(new com.luck.picture.lib.photoview.OnViewTapListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewVideoHolder.1
            @Override // com.luck.picture.lib.photoview.OnViewTapListener
            public void onViewTap(android.view.View view, float f, float f2) {
                if (com.luck.picture.lib.adapter.holder.PreviewVideoHolder.this.mPreviewEventListener != null) {
                    com.luck.picture.lib.adapter.holder.PreviewVideoHolder.this.mPreviewEventListener.onBackPressed();
                }
            }
        });
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    protected void onLongPressDownload(final com.luck.picture.lib.entity.LocalMedia localMedia) {
        this.coverImageView.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewVideoHolder.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(android.view.View view) {
                if (com.luck.picture.lib.adapter.holder.PreviewVideoHolder.this.mPreviewEventListener == null) {
                    return false;
                }
                com.luck.picture.lib.adapter.holder.PreviewVideoHolder.this.mPreviewEventListener.onLongPressDownload(localMedia);
                return false;
            }
        });
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void bindData(com.luck.picture.lib.entity.LocalMedia localMedia, int i) {
        super.bindData(localMedia, i);
        setScaleDisplaySize(localMedia);
        this.ivPlayButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewVideoHolder.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.luck.picture.lib.adapter.holder.PreviewVideoHolder.this.selectorConfig.isPauseResumePlay) {
                    com.luck.picture.lib.adapter.holder.PreviewVideoHolder.this.dispatchPlay();
                } else {
                    com.luck.picture.lib.adapter.holder.PreviewVideoHolder.this.startPlay();
                }
            }
        });
        this.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewVideoHolder.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.luck.picture.lib.adapter.holder.PreviewVideoHolder.this.selectorConfig.isPauseResumePlay) {
                    com.luck.picture.lib.adapter.holder.PreviewVideoHolder.this.dispatchPlay();
                } else if (com.luck.picture.lib.adapter.holder.PreviewVideoHolder.this.mPreviewEventListener != null) {
                    com.luck.picture.lib.adapter.holder.PreviewVideoHolder.this.mPreviewEventListener.onBackPressed();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchPlay() {
        if (this.isPlayed) {
            if (isPlaying()) {
                onPause();
                return;
            } else {
                onResume();
                return;
            }
        }
        startPlay();
    }

    private void onResume() {
        this.ivPlayButton.setVisibility(8);
        if (this.selectorConfig.videoPlayerEngine != null) {
            this.selectorConfig.videoPlayerEngine.onResume(this.videoPlayer);
        }
    }

    public void onPause() {
        this.ivPlayButton.setVisibility(0);
        if (this.selectorConfig.videoPlayerEngine != null) {
            this.selectorConfig.videoPlayerEngine.onPause(this.videoPlayer);
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public boolean isPlaying() {
        return this.selectorConfig.videoPlayerEngine != null && this.selectorConfig.videoPlayerEngine.isPlaying(this.videoPlayer);
    }

    public void startPlay() {
        if (this.selectorConfig.isUseSystemVideoPlayer) {
            com.luck.picture.lib.utils.IntentUtils.startSystemPlayerVideo(this.itemView.getContext(), this.media.getAvailablePath());
            return;
        }
        if (this.videoPlayer == null) {
            throw new java.lang.NullPointerException("VideoPlayer cannot be empty,Please implement " + com.luck.picture.lib.engine.VideoPlayerEngine.class);
        }
        if (this.selectorConfig.videoPlayerEngine != null) {
            this.progress.setVisibility(0);
            this.ivPlayButton.setVisibility(8);
            this.mPreviewEventListener.onPreviewVideoTitle(this.media.getFileName());
            this.isPlayed = true;
            this.selectorConfig.videoPlayerEngine.onStarPlayer(this.videoPlayer, this.media);
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    protected void setScaleDisplaySize(com.luck.picture.lib.entity.LocalMedia localMedia) {
        super.setScaleDisplaySize(localMedia);
        if (this.selectorConfig.isPreviewZoomEffect || this.screenWidth >= this.screenHeight) {
            return;
        }
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = this.videoPlayer.getLayoutParams();
        if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = this.screenWidth;
            layoutParams2.height = this.screenAppInHeight;
            layoutParams2.gravity = 17;
            return;
        }
        if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams3.width = this.screenWidth;
            layoutParams3.height = this.screenAppInHeight;
            layoutParams3.addRule(13);
            return;
        }
        if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            layoutParams4.width = this.screenWidth;
            layoutParams4.height = this.screenAppInHeight;
            layoutParams4.gravity = 17;
            return;
        }
        if (layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams5 = layoutParams;
            layoutParams5.width = this.screenWidth;
            layoutParams5.height = this.screenAppInHeight;
            layoutParams5.topToTop = 0;
            layoutParams5.bottomToBottom = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playerDefaultUI() {
        this.isPlayed = false;
        this.ivPlayButton.setVisibility(0);
        this.progress.setVisibility(8);
        this.coverImageView.setVisibility(0);
        this.videoPlayer.setVisibility(8);
        if (this.mPreviewEventListener != null) {
            this.mPreviewEventListener.onPreviewVideoTitle(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playerIngUI() {
        this.progress.setVisibility(8);
        this.ivPlayButton.setVisibility(8);
        this.coverImageView.setVisibility(8);
        this.videoPlayer.setVisibility(0);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void onViewAttachedToWindow() {
        if (this.selectorConfig.videoPlayerEngine != null) {
            this.selectorConfig.videoPlayerEngine.onPlayerAttachedToWindow(this.videoPlayer);
            this.selectorConfig.videoPlayerEngine.addPlayListener(this.mPlayerListener);
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void onViewDetachedFromWindow() {
        if (this.selectorConfig.videoPlayerEngine != null) {
            this.selectorConfig.videoPlayerEngine.onPlayerDetachedFromWindow(this.videoPlayer);
            this.selectorConfig.videoPlayerEngine.removePlayListener(this.mPlayerListener);
        }
        playerDefaultUI();
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void resumePausePlay() {
        if (isPlaying()) {
            onPause();
        } else {
            onResume();
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void release() {
        if (this.selectorConfig.videoPlayerEngine != null) {
            this.selectorConfig.videoPlayerEngine.removePlayListener(this.mPlayerListener);
            this.selectorConfig.videoPlayerEngine.destroy(this.videoPlayer);
        }
    }
}
