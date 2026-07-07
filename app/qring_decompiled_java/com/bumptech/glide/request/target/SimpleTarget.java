package com.bumptech.glide.request.target;

@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public abstract class SimpleTarget<Z> extends com.bumptech.glide.request.target.BaseTarget<Z> {
    private final int height;
    private final int width;

    @Override // com.bumptech.glide.request.target.Target
    public void removeCallback(com.bumptech.glide.request.target.SizeReadyCallback sizeReadyCallback) {
    }

    public SimpleTarget() {
        this(com.bumptech.glide.request.target.Target.SIZE_ORIGINAL, com.bumptech.glide.request.target.Target.SIZE_ORIGINAL);
    }

    public SimpleTarget(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(com.bumptech.glide.request.target.SizeReadyCallback sizeReadyCallback) {
        if (!com.bumptech.glide.util.Util.isValidDimensions(this.width, this.height)) {
            throw new java.lang.IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.width + " and height: " + this.height + ", either provide dimensions in the constructor or call override()");
        }
        sizeReadyCallback.onSizeReady(this.width, this.height);
    }
}
