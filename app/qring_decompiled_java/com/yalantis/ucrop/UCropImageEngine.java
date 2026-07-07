package com.yalantis.ucrop;

/* loaded from: classes3.dex */
public interface UCropImageEngine {

    public interface OnCallbackListener<T> {
        void onCall(T t);
    }

    void loadImage(android.content.Context context, android.net.Uri uri, int i, int i2, com.yalantis.ucrop.UCropImageEngine.OnCallbackListener<android.graphics.Bitmap> onCallbackListener);

    void loadImage(android.content.Context context, java.lang.String str, android.widget.ImageView imageView);
}
