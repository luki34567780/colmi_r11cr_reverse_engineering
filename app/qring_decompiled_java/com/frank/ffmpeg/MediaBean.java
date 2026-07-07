package com.frank.ffmpeg;

/* compiled from: MediaBean.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/frank/ffmpeg/MediaBean;", "", "()V", "audioBean", "Lcom/frank/ffmpeg/AudioBean;", "getAudioBean", "()Lcom/frank/ffmpeg/AudioBean;", "setAudioBean", "(Lcom/frank/ffmpeg/AudioBean;)V", "bitRate", "", "getBitRate", "()I", "setBitRate", "(I)V", "duration", "", "getDuration", "()J", "setDuration", "(J)V", "formatName", "", "getFormatName", "()Ljava/lang/String;", "setFormatName", "(Ljava/lang/String;)V", "size", "getSize", "setSize", "streamNum", "getStreamNum", "setStreamNum", "videoBean", "Lcom/frank/ffmpeg/VideoBean;", "getVideoBean", "()Lcom/frank/ffmpeg/VideoBean;", "setVideoBean", "(Lcom/frank/ffmpeg/VideoBean;)V", "libmp3_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MediaBean {
    private com.frank.ffmpeg.AudioBean audioBean;
    private int bitRate;
    private long duration;
    private java.lang.String formatName;
    private long size;
    private int streamNum;
    private com.frank.ffmpeg.VideoBean videoBean;

    public final com.frank.ffmpeg.VideoBean getVideoBean() {
        return this.videoBean;
    }

    public final void setVideoBean(com.frank.ffmpeg.VideoBean videoBean) {
        this.videoBean = videoBean;
    }

    public final com.frank.ffmpeg.AudioBean getAudioBean() {
        return this.audioBean;
    }

    public final void setAudioBean(com.frank.ffmpeg.AudioBean audioBean) {
        this.audioBean = audioBean;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final long getSize() {
        return this.size;
    }

    public final void setSize(long j) {
        this.size = j;
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final void setBitRate(int i) {
        this.bitRate = i;
    }

    public final java.lang.String getFormatName() {
        return this.formatName;
    }

    public final void setFormatName(java.lang.String str) {
        this.formatName = str;
    }

    public final int getStreamNum() {
        return this.streamNum;
    }

    public final void setStreamNum(int i) {
        this.streamNum = i;
    }
}
