package com.bumptech.glide.load.resource.gif;

/* loaded from: /tmp/dex/classes2.dex */
public class GifDrawableResource extends com.bumptech.glide.load.resource.drawable.DrawableResource<com.bumptech.glide.load.resource.gif.GifDrawable> implements com.bumptech.glide.load.engine.Initializable {
    public GifDrawableResource(com.bumptech.glide.load.resource.gif.GifDrawable gifDrawable) {
        super(gifDrawable);
    }

    public java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> getResourceClass() {
        return com.bumptech.glide.load.resource.gif.GifDrawable.class;
    }

    public int getSize() {
        return ((com.bumptech.glide.load.resource.gif.GifDrawable) this.drawable).getSize();
    }

    public void recycle() {
        ((com.bumptech.glide.load.resource.gif.GifDrawable) this.drawable).stop();
        ((com.bumptech.glide.load.resource.gif.GifDrawable) this.drawable).recycle();
    }

    @Override // com.bumptech.glide.load.resource.drawable.DrawableResource
    public void initialize() {
        ((com.bumptech.glide.load.resource.gif.GifDrawable) this.drawable).getFirstFrame().prepareToDraw();
    }
}
