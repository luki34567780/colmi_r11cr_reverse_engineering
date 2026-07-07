package com.frank.ffmpeg;

/* compiled from: LrcLine.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0000H\u0096\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/frank/ffmpeg/LrcLine;", "", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", "startTime", "getStartTime", "setStartTime", "timeString", "getTimeString", "setTimeString", "compareTo", "", "another", "libmp3_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class LrcLine implements java.lang.Comparable<com.frank.ffmpeg.LrcLine> {
    private java.lang.String content;
    private long endTime;
    private long startTime;
    private java.lang.String timeString;

    public final java.lang.String getTimeString() {
        return this.timeString;
    }

    public final void setTimeString(java.lang.String str) {
        this.timeString = str;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final java.lang.String getContent() {
        return this.content;
    }

    public final void setContent(java.lang.String str) {
        this.content = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.frank.ffmpeg.LrcLine another) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(another, "another");
        return (int) (this.startTime - another.startTime);
    }
}
