package com.luck.picture.lib.engine;

/* loaded from: /tmp/dex/classes2.dex */
public interface VideoPlayerEngine<T> {
    void addPlayListener(com.luck.picture.lib.interfaces.OnPlayerListener onPlayerListener);

    void destroy(T t);

    boolean isPlaying(T t);

    android.view.View onCreateVideoPlayer(android.content.Context context);

    void onPause(T t);

    void onPlayerAttachedToWindow(T t);

    void onPlayerDetachedFromWindow(T t);

    void onResume(T t);

    void onStarPlayer(T t, com.luck.picture.lib.entity.LocalMedia localMedia);

    void removePlayListener(com.luck.picture.lib.interfaces.OnPlayerListener onPlayerListener);
}
