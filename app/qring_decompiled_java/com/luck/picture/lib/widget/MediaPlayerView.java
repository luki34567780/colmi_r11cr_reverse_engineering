package com.luck.picture.lib.widget;

/* loaded from: /tmp/dex/classes2.dex */
public class MediaPlayerView extends android.widget.FrameLayout implements android.view.SurfaceHolder.Callback {
    private android.media.MediaPlayer mediaPlayer;
    private com.luck.picture.lib.widget.MediaPlayerView.VideoSurfaceView surfaceView;

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
    }

    public MediaPlayerView(android.content.Context context) {
        super(context);
        init();
    }

    public MediaPlayerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public MediaPlayerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        this.surfaceView = new com.luck.picture.lib.widget.MediaPlayerView.VideoSurfaceView(getContext());
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        this.surfaceView.setLayoutParams(layoutParams);
        addView(this.surfaceView);
        android.view.SurfaceHolder holder = this.surfaceView.getHolder();
        holder.setFormat(-2);
        holder.addCallback(this);
    }

    public android.media.MediaPlayer initMediaPlayer() {
        if (this.mediaPlayer == null) {
            this.mediaPlayer = new android.media.MediaPlayer();
        }
        this.mediaPlayer.setOnVideoSizeChangedListener(new android.media.MediaPlayer.OnVideoSizeChangedListener() { // from class: com.luck.picture.lib.widget.MediaPlayerView.1
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i, int i2) {
                com.luck.picture.lib.widget.MediaPlayerView.this.surfaceView.adjustVideoSize(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
            }
        });
        return this.mediaPlayer;
    }

    public android.media.MediaPlayer getMediaPlayer() {
        return this.mediaPlayer;
    }

    public com.luck.picture.lib.widget.MediaPlayerView.VideoSurfaceView getSurfaceView() {
        return this.surfaceView;
    }

    public void start(java.lang.String str) {
        try {
            if (com.luck.picture.lib.config.PictureMimeType.isContent(str)) {
                this.mediaPlayer.setDataSource(getContext(), android.net.Uri.parse(str));
            } else {
                this.mediaPlayer.setDataSource(str);
            }
            this.mediaPlayer.prepareAsync();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        this.mediaPlayer.setAudioStreamType(3);
        this.mediaPlayer.setDisplay(surfaceHolder);
    }

    public void clearCanvas() {
        this.surfaceView.getHolder().setFormat(-1);
        this.surfaceView.getHolder().setFormat(-2);
    }

    public static class VideoSurfaceView extends android.view.SurfaceView {
        private int videoHeight;
        private int videoWidth;

        public VideoSurfaceView(android.content.Context context) {
            this(context, null);
        }

        public VideoSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public VideoSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public void adjustVideoSize(int i, int i2) {
            if (i == 0 || i2 == 0) {
                return;
            }
            this.videoWidth = i;
            this.videoHeight = i2;
            getHolder().setFixedSize(i, i2);
            requestLayout();
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
        
            if (r1 > r6) goto L27;
         */
        @Override // android.view.SurfaceView, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected void onMeasure(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.videoWidth
                int r0 = getDefaultSize(r0, r6)
                int r1 = r5.videoHeight
                int r1 = getDefaultSize(r1, r7)
                int r2 = r5.videoWidth
                if (r2 <= 0) goto L7f
                int r2 = r5.videoHeight
                if (r2 <= 0) goto L7f
                int r0 = android.view.View.MeasureSpec.getMode(r6)
                int r6 = android.view.View.MeasureSpec.getSize(r6)
                int r1 = android.view.View.MeasureSpec.getMode(r7)
                int r7 = android.view.View.MeasureSpec.getSize(r7)
                r2 = 1073741824(0x40000000, float:2.0)
                if (r0 != r2) goto L43
                if (r1 != r2) goto L43
                int r0 = r5.videoWidth
                int r1 = r0 * r7
                int r2 = r5.videoHeight
                int r3 = r6 * r2
                if (r1 >= r3) goto L38
                int r0 = r0 * r7
                int r0 = r0 / r2
                goto L66
            L38:
                int r1 = r0 * r7
                int r3 = r6 * r2
                if (r1 <= r3) goto L63
                int r2 = r2 * r6
                int r1 = r2 / r0
                goto L54
            L43:
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 != r2) goto L56
                int r0 = r5.videoHeight
                int r0 = r0 * r6
                int r2 = r5.videoWidth
                int r0 = r0 / r2
                if (r1 != r3) goto L53
                if (r0 <= r7) goto L53
                goto L63
            L53:
                r1 = r0
            L54:
                r0 = r6
                goto L7f
            L56:
                if (r1 != r2) goto L68
                int r1 = r5.videoWidth
                int r1 = r1 * r7
                int r2 = r5.videoHeight
                int r1 = r1 / r2
                if (r0 != r3) goto L65
                if (r1 <= r6) goto L65
            L63:
                r0 = r6
                goto L66
            L65:
                r0 = r1
            L66:
                r1 = r7
                goto L7f
            L68:
                int r2 = r5.videoWidth
                int r4 = r5.videoHeight
                if (r1 != r3) goto L74
                if (r4 <= r7) goto L74
                int r1 = r7 * r2
                int r1 = r1 / r4
                goto L76
            L74:
                r1 = r2
                r7 = r4
            L76:
                if (r0 != r3) goto L65
                if (r1 <= r6) goto L65
                int r4 = r4 * r6
                int r1 = r4 / r2
                goto L54
            L7f:
                r5.setMeasuredDimension(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.widget.MediaPlayerView.VideoSurfaceView.onMeasure(int, int):void");
        }
    }

    public void release() {
        android.media.MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.mediaPlayer.setOnPreparedListener(null);
            this.mediaPlayer.setOnCompletionListener(null);
            this.mediaPlayer.setOnErrorListener(null);
            this.mediaPlayer = null;
        }
    }
}
