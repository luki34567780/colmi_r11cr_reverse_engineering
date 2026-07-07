package com.frank.ffmpeg;

/* compiled from: AudioBean.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\u001a\u0010+\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010\u001aR\u001c\u0010.\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\b¨\u00061"}, d2 = {"Lcom/frank/ffmpeg/AudioBean;", "", "()V", "album", "", "getAlbum", "()Ljava/lang/String;", "setAlbum", "(Ljava/lang/String;)V", "albumArtist", "getAlbumArtist", "setAlbumArtist", "artist", "getArtist", "setArtist", "audioCodec", "getAudioCodec", "setAudioCodec", "channelLayout", "getChannelLayout", "setChannelLayout", "channels", "", "getChannels", "()I", "setChannels", "(I)V", "composer", "getComposer", "setComposer", "genre", "getGenre", "setGenre", "lrcLineList", "", "Lcom/frank/ffmpeg/LrcLine;", "getLrcLineList", "()Ljava/util/List;", "setLrcLineList", "(Ljava/util/List;)V", "lyrics", "getLyrics", "setLyrics", "sampleRate", "getSampleRate", "setSampleRate", "title", "getTitle", "setTitle", "libmp3_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class AudioBean {
    private java.lang.String album;
    private java.lang.String albumArtist;
    private java.lang.String artist;
    private java.lang.String audioCodec;
    private java.lang.String channelLayout;
    private int channels;
    private java.lang.String composer;
    private java.lang.String genre;
    private java.util.List<com.frank.ffmpeg.LrcLine> lrcLineList;
    private java.util.List<java.lang.String> lyrics;
    private int sampleRate;
    private java.lang.String title;

    public final void setAudioCodec(java.lang.String str) {
        this.audioCodec = str;
    }

    public final java.lang.String getAudioCodec() {
        if (kotlin.jvm.internal.Intrinsics.areEqual("[0][0][0][0]", this.audioCodec)) {
            return null;
        }
        return this.audioCodec;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }

    public final void setSampleRate(int i) {
        this.sampleRate = i;
    }

    public final int getChannels() {
        return this.channels;
    }

    public final void setChannels(int i) {
        this.channels = i;
    }

    public final java.lang.String getChannelLayout() {
        return this.channelLayout;
    }

    public final void setChannelLayout(java.lang.String str) {
        this.channelLayout = str;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final void setTitle(java.lang.String str) {
        this.title = str;
    }

    public final java.lang.String getArtist() {
        return this.artist;
    }

    public final void setArtist(java.lang.String str) {
        this.artist = str;
    }

    public final java.lang.String getAlbum() {
        return this.album;
    }

    public final void setAlbum(java.lang.String str) {
        this.album = str;
    }

    public final java.lang.String getAlbumArtist() {
        return this.albumArtist;
    }

    public final void setAlbumArtist(java.lang.String str) {
        this.albumArtist = str;
    }

    public final java.lang.String getComposer() {
        return this.composer;
    }

    public final void setComposer(java.lang.String str) {
        this.composer = str;
    }

    public final java.lang.String getGenre() {
        return this.genre;
    }

    public final void setGenre(java.lang.String str) {
        this.genre = str;
    }

    public final java.util.List<java.lang.String> getLyrics() {
        return this.lyrics;
    }

    public final void setLyrics(java.util.List<java.lang.String> list) {
        this.lyrics = list;
    }

    public final java.util.List<com.frank.ffmpeg.LrcLine> getLrcLineList() {
        return this.lrcLineList;
    }

    public final void setLrcLineList(java.util.List<com.frank.ffmpeg.LrcLine> list) {
        this.lrcLineList = list;
    }
}
