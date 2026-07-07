package com.frank.ffmpeg;

/* compiled from: VideoBean.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000e¨\u0006!"}, d2 = {"Lcom/frank/ffmpeg/VideoBean;", "", "()V", "displayAspectRatio", "", "getDisplayAspectRatio", "()Ljava/lang/String;", "setDisplayAspectRatio", "(Ljava/lang/String;)V", "frameRate", "", "getFrameRate", "()I", "setFrameRate", "(I)V", "height", "getHeight", "setHeight", "level", "getLevel", "setLevel", "pixelFormat", "getPixelFormat", "setPixelFormat", com.google.android.gms.common.Scopes.PROFILE, "getProfile", "setProfile", "videoCodec", "getVideoCodec", "setVideoCodec", "width", "getWidth", "setWidth", "libmp3_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class VideoBean {
    private java.lang.String displayAspectRatio;
    private int frameRate;
    private int height;
    private int level;
    private java.lang.String pixelFormat;
    private java.lang.String profile;
    private java.lang.String videoCodec;
    private int width;

    public final void setVideoCodec(java.lang.String str) {
        this.videoCodec = str;
    }

    public final java.lang.String getVideoCodec() {
        if (kotlin.jvm.internal.Intrinsics.areEqual("[0][0][0][0]", this.videoCodec)) {
            return null;
        }
        return this.videoCodec;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final int getHeight() {
        return this.height;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final java.lang.String getDisplayAspectRatio() {
        return this.displayAspectRatio;
    }

    public final void setDisplayAspectRatio(java.lang.String str) {
        this.displayAspectRatio = str;
    }

    public final java.lang.String getPixelFormat() {
        return this.pixelFormat;
    }

    public final void setPixelFormat(java.lang.String str) {
        this.pixelFormat = str;
    }

    public final java.lang.String getProfile() {
        return this.profile;
    }

    public final void setProfile(java.lang.String str) {
        this.profile = str;
    }

    public final int getLevel() {
        return this.level;
    }

    public final void setLevel(int i) {
        this.level = i;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final void setFrameRate(int i) {
        this.frameRate = i;
    }
}
