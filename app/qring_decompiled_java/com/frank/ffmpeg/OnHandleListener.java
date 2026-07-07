package com.frank.ffmpeg;

/* compiled from: OnHandleListener.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H&¨\u0006\u000e"}, d2 = {"Lcom/frank/ffmpeg/OnHandleListener;", "", "onBegin", "", "onEnd", "resultCode", "", "resultMsg", "", "onMsg", "msg", "onProgress", "progress", "duration", "libmp3_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public interface OnHandleListener {
    void onBegin();

    void onEnd(int resultCode, java.lang.String resultMsg);

    void onMsg(java.lang.String msg);

    void onProgress(int progress, int duration);
}
