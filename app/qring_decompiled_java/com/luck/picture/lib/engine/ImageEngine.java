package com.luck.picture.lib.engine;

/* loaded from: /tmp/dex/classes2.dex */
public interface ImageEngine {
    void loadAlbumCover(android.content.Context context, java.lang.String str, android.widget.ImageView imageView);

    void loadGridImage(android.content.Context context, java.lang.String str, android.widget.ImageView imageView);

    void loadImage(android.content.Context context, android.widget.ImageView imageView, java.lang.String str, int i, int i2);

    void loadImage(android.content.Context context, java.lang.String str, android.widget.ImageView imageView);

    void pauseRequests(android.content.Context context);

    void resumeRequests(android.content.Context context);
}
