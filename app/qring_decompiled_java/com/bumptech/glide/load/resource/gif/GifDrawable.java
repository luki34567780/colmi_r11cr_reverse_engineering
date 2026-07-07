package com.bumptech.glide.load.resource.gif;

/* loaded from: /tmp/dex/classes2.dex */
public class GifDrawable extends android.graphics.drawable.Drawable implements com.bumptech.glide.load.resource.gif.GifFrameLoader.FrameCallback, android.graphics.drawable.Animatable, androidx.vectordrawable.graphics.drawable.Animatable2Compat {
    private static final int GRAVITY = 119;
    public static final int LOOP_FOREVER = -1;
    public static final int LOOP_INTRINSIC = 0;
    private java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> animationCallbacks;
    private boolean applyGravity;
    private android.graphics.Rect destRect;
    private boolean isRecycled;
    private boolean isRunning;
    private boolean isStarted;
    private boolean isVisible;
    private int loopCount;
    private int maxLoopCount;
    private android.graphics.Paint paint;
    private final com.bumptech.glide.load.resource.gif.GifDrawable.GifState state;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @java.lang.Deprecated
    public GifDrawable(android.content.Context context, com.bumptech.glide.gifdecoder.GifDecoder gifDecoder, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, com.bumptech.glide.load.Transformation<android.graphics.Bitmap> transformation, int i, int i2, android.graphics.Bitmap bitmap) {
        this(context, gifDecoder, transformation, i, i2, bitmap);
    }

    public GifDrawable(android.content.Context context, com.bumptech.glide.gifdecoder.GifDecoder gifDecoder, com.bumptech.glide.load.Transformation<android.graphics.Bitmap> transformation, int i, int i2, android.graphics.Bitmap bitmap) {
        this(new com.bumptech.glide.load.resource.gif.GifDrawable.GifState(new com.bumptech.glide.load.resource.gif.GifFrameLoader(com.bumptech.glide.Glide.get(context), gifDecoder, i, i2, transformation, bitmap)));
    }

    GifDrawable(com.bumptech.glide.load.resource.gif.GifDrawable.GifState gifState) {
        this.isVisible = true;
        this.maxLoopCount = -1;
        this.state = (com.bumptech.glide.load.resource.gif.GifDrawable.GifState) com.bumptech.glide.util.Preconditions.checkNotNull(gifState);
    }

    GifDrawable(com.bumptech.glide.load.resource.gif.GifFrameLoader gifFrameLoader, android.graphics.Paint paint) {
        this(new com.bumptech.glide.load.resource.gif.GifDrawable.GifState(gifFrameLoader));
        this.paint = paint;
    }

    public int getSize() {
        return this.state.frameLoader.getSize();
    }

    public android.graphics.Bitmap getFirstFrame() {
        return this.state.frameLoader.getFirstFrame();
    }

    public void setFrameTransformation(com.bumptech.glide.load.Transformation<android.graphics.Bitmap> transformation, android.graphics.Bitmap bitmap) {
        this.state.frameLoader.setFrameTransformation(transformation, bitmap);
    }

    public com.bumptech.glide.load.Transformation<android.graphics.Bitmap> getFrameTransformation() {
        return this.state.frameLoader.getFrameTransformation();
    }

    public java.nio.ByteBuffer getBuffer() {
        return this.state.frameLoader.getBuffer();
    }

    public int getFrameCount() {
        return this.state.frameLoader.getFrameCount();
    }

    public int getFrameIndex() {
        return this.state.frameLoader.getCurrentIndex();
    }

    private void resetLoopCount() {
        this.loopCount = 0;
    }

    public void startFromFirstFrame() {
        com.bumptech.glide.util.Preconditions.checkArgument(!this.isRunning, "You cannot restart a currently running animation.");
        this.state.frameLoader.setNextStartFromFirstFrame();
        start();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.isStarted = true;
        resetLoopCount();
        if (this.isVisible) {
            startRunning();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.isStarted = false;
        stopRunning();
    }

    private void startRunning() {
        com.bumptech.glide.util.Preconditions.checkArgument(!this.isRecycled, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.state.frameLoader.getFrameCount() == 1) {
            invalidateSelf();
        } else {
            if (this.isRunning) {
                return;
            }
            this.isRunning = true;
            this.state.frameLoader.subscribe(this);
            invalidateSelf();
        }
    }

    private void stopRunning() {
        this.isRunning = false;
        this.state.frameLoader.unsubscribe(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        com.bumptech.glide.util.Preconditions.checkArgument(!this.isRecycled, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.isVisible = z;
        if (!z) {
            stopRunning();
        } else if (this.isStarted) {
            startRunning();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.state.frameLoader.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.state.frameLoader.getHeight();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.isRunning;
    }

    void setIsRunning(boolean z) {
        this.isRunning = z;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.applyGravity = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.isRecycled) {
            return;
        }
        if (this.applyGravity) {
            android.view.Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), getDestRect());
            this.applyGravity = false;
        }
        canvas.drawBitmap(this.state.frameLoader.getCurrentFrame(), (android.graphics.Rect) null, getDestRect(), getPaint());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        getPaint().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        getPaint().setColorFilter(colorFilter);
    }

    private android.graphics.Rect getDestRect() {
        if (this.destRect == null) {
            this.destRect = new android.graphics.Rect();
        }
        return this.destRect;
    }

    private android.graphics.Paint getPaint() {
        if (this.paint == null) {
            this.paint = new android.graphics.Paint(2);
        }
        return this.paint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private android.graphics.drawable.Drawable.Callback findCallback() {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        while (callback instanceof android.graphics.drawable.Drawable) {
            callback = ((android.graphics.drawable.Drawable) callback).getCallback();
        }
        return callback;
    }

    @Override // com.bumptech.glide.load.resource.gif.GifFrameLoader.FrameCallback
    public void onFrameReady() {
        if (findCallback() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (getFrameIndex() == getFrameCount() - 1) {
            this.loopCount++;
        }
        int i = this.maxLoopCount;
        if (i == -1 || this.loopCount < i) {
            return;
        }
        notifyAnimationEndToListeners();
        stop();
    }

    private void notifyAnimationEndToListeners() {
        java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> list = this.animationCallbacks;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.animationCallbacks.get(i).onAnimationEnd(this);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return this.state;
    }

    public void recycle() {
        this.isRecycled = true;
        this.state.frameLoader.clear();
    }

    boolean isRecycled() {
        return this.isRecycled;
    }

    public void setLoopCount(int i) {
        if (i <= 0 && i != -1 && i != 0) {
            throw new java.lang.IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i == 0) {
            int loopCount = this.state.frameLoader.getLoopCount();
            this.maxLoopCount = loopCount != 0 ? loopCount : -1;
        } else {
            this.maxLoopCount = i;
        }
    }

    public void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.animationCallbacks == null) {
            this.animationCallbacks = new java.util.ArrayList();
        }
        this.animationCallbacks.add(animationCallback);
    }

    public boolean unregisterAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> list = this.animationCallbacks;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    public void clearAnimationCallbacks() {
        java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> list = this.animationCallbacks;
        if (list != null) {
            list.clear();
        }
    }

    static final class GifState extends android.graphics.drawable.Drawable.ConstantState {
        final com.bumptech.glide.load.resource.gif.GifFrameLoader frameLoader;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        GifState(com.bumptech.glide.load.resource.gif.GifFrameLoader gifFrameLoader) {
            this.frameLoader = gifFrameLoader;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            return new com.bumptech.glide.load.resource.gif.GifDrawable(this);
        }
    }
}
