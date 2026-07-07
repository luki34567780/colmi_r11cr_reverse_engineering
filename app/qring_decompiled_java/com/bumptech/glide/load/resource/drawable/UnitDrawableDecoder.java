package com.bumptech.glide.load.resource.drawable;

/* loaded from: /tmp/dex/classes2.dex */
public class UnitDrawableDecoder implements com.bumptech.glide.load.ResourceDecoder<android.graphics.drawable.Drawable, android.graphics.drawable.Drawable> {
    public boolean handles(android.graphics.drawable.Drawable drawable, com.bumptech.glide.load.Options options) {
        return true;
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> decode(android.graphics.drawable.Drawable drawable, int i, int i2, com.bumptech.glide.load.Options options) {
        return com.bumptech.glide.load.resource.drawable.NonOwnedDrawableResource.newInstance(drawable);
    }
}
