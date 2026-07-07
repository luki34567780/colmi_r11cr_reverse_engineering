package com.qcwireless.qcwatch.ui.base.view.pullrefresh;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class PaintDrawable extends android.graphics.drawable.Drawable {
    protected android.graphics.Paint mPaint;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    protected PaintDrawable() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.mPaint = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.mPaint.setAntiAlias(true);
        this.mPaint.setColor(-5592406);
    }

    public void setColor(int color) {
        this.mPaint.setColor(color);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.mPaint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter cf) {
        this.mPaint.setColorFilter(cf);
    }
}
