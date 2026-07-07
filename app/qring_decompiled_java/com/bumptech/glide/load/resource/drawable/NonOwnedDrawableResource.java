package com.bumptech.glide.load.resource.drawable;

/* loaded from: /tmp/dex/classes2.dex */
final class NonOwnedDrawableResource extends com.bumptech.glide.load.resource.drawable.DrawableResource<android.graphics.drawable.Drawable> {
    public void recycle() {
    }

    static com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> newInstance(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            return new com.bumptech.glide.load.resource.drawable.NonOwnedDrawableResource(drawable);
        }
        return null;
    }

    private NonOwnedDrawableResource(android.graphics.drawable.Drawable drawable) {
        super(drawable);
    }

    public java.lang.Class<android.graphics.drawable.Drawable> getResourceClass() {
        return this.drawable.getClass();
    }

    public int getSize() {
        return java.lang.Math.max(1, this.drawable.getIntrinsicWidth() * this.drawable.getIntrinsicHeight() * 4);
    }
}
