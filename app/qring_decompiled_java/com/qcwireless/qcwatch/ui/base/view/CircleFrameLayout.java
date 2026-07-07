package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class CircleFrameLayout extends android.widget.FrameLayout {
    private android.graphics.Paint imagePaint;
    private int mBorderColor;
    private float mBorderWidth;
    private float mRadius;
    private android.graphics.Paint roundPaint;

    public CircleFrameLayout(android.content.Context context) {
        this(context, null);
    }

    public CircleFrameLayout(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CircleFrameLayout(android.content.Context context, android.util.AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (attrs != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.CircleFrameLayout);
            this.mRadius = obtainStyledAttributes.getDimension(2, 0.0f);
            this.mBorderWidth = obtainStyledAttributes.getDimension(1, 0.0f);
            this.mBorderColor = obtainStyledAttributes.getColor(0, -1);
            obtainStyledAttributes.recycle();
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        this.roundPaint = paint;
        paint.setColor(-65536);
        this.roundPaint.setAntiAlias(true);
        this.roundPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.roundPaint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.imagePaint = paint2;
        paint2.setXfermode(null);
    }

    public void setRadius(int radius) {
        this.mRadius = radius;
        postInvalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        canvas.saveLayer(new android.graphics.RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), this.imagePaint, 31);
        super.dispatchDraw(canvas);
        drawBorder(canvas);
        drawTopLeft(canvas);
        drawTopRight(canvas);
        drawBottomLeft(canvas);
        drawBottomRight(canvas);
        canvas.restore();
    }

    private void drawBorder(android.graphics.Canvas canvas) {
        if (this.mBorderWidth != 0.0f && getWidth() == getHeight() && this.mRadius == getWidth() / 2) {
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.mBorderWidth);
            paint.setColor(this.mBorderColor);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2, paint);
        }
    }

    private void drawTopLeft(android.graphics.Canvas canvas) {
        if (this.mRadius > 0.0f) {
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(0.0f, this.mRadius);
            path.lineTo(0.0f, 0.0f);
            path.lineTo(this.mRadius, 0.0f);
            float f = this.mRadius;
            path.arcTo(new android.graphics.RectF(0.0f, 0.0f, f * 2.0f, f * 2.0f), -90.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.roundPaint);
        }
    }

    private void drawTopRight(android.graphics.Canvas canvas) {
        if (this.mRadius > 0.0f) {
            int width = getWidth();
            android.graphics.Path path = new android.graphics.Path();
            float f = width;
            path.moveTo(f - this.mRadius, 0.0f);
            path.lineTo(f, 0.0f);
            path.lineTo(f, this.mRadius);
            float f2 = this.mRadius;
            path.arcTo(new android.graphics.RectF(f - (f2 * 2.0f), 0.0f, f, f2 * 2.0f), 0.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.roundPaint);
        }
    }

    private void drawBottomLeft(android.graphics.Canvas canvas) {
        if (this.mRadius > 0.0f) {
            int height = getHeight();
            android.graphics.Path path = new android.graphics.Path();
            float f = height;
            path.moveTo(0.0f, f - this.mRadius);
            path.lineTo(0.0f, f);
            path.lineTo(this.mRadius, f);
            float f2 = this.mRadius;
            path.arcTo(new android.graphics.RectF(0.0f, f - (f2 * 2.0f), f2 * 2.0f, f), 90.0f, 90.0f);
            path.close();
            canvas.drawPath(path, this.roundPaint);
        }
    }

    private void drawBottomRight(android.graphics.Canvas canvas) {
        if (this.mRadius > 0.0f) {
            int height = getHeight();
            int width = getWidth();
            android.graphics.Path path = new android.graphics.Path();
            float f = width;
            float f2 = height;
            path.moveTo(f - this.mRadius, f2);
            path.lineTo(f, f2);
            path.lineTo(f, f2 - this.mRadius);
            float f3 = this.mRadius;
            path.arcTo(new android.graphics.RectF(f - (f3 * 2.0f), f2 - (f3 * 2.0f), f, f2), 0.0f, 90.0f);
            path.close();
            canvas.drawPath(path, this.roundPaint);
        }
    }
}
