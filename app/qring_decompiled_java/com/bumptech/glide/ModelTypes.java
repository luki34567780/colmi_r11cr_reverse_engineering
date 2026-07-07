package com.bumptech.glide;

/* loaded from: classes.dex */
interface ModelTypes<T> {
    T load(android.graphics.Bitmap bitmap);

    T load(android.graphics.drawable.Drawable drawable);

    T load(android.net.Uri uri);

    T load(java.io.File file);

    T load(java.lang.Integer num);

    T load(java.lang.Object obj);

    T load(java.lang.String str);

    @java.lang.Deprecated
    T load(java.net.URL url);

    T load(byte[] bArr);
}
