package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class ShapeLoadingView extends android.view.View {
    private static final float genhao3 = 1.7320508f;
    private static final float mMagicNumber = 0.5522848f;
    private static final float mTriangle2Circle = 0.25555554f;
    private float mAnimPercent;
    private android.animation.ArgbEvaluator mArgbEvaluator;
    private int mCircleColor;
    private float mControlX;
    private float mControlY;
    public boolean mIsLoading;
    private android.graphics.Paint mPaint;
    private int mRectColor;
    private com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape mShape;
    private int mTriangleColor;

    public enum Shape {
        SHAPE_TRIANGLE,
        SHAPE_RECT,
        SHAPE_CIRCLE
    }

    public ShapeLoadingView(android.content.Context context) {
        super(context);
        this.mShape = com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape.SHAPE_CIRCLE;
        this.mArgbEvaluator = new android.animation.ArgbEvaluator();
        this.mIsLoading = false;
        this.mControlX = 0.0f;
        this.mControlY = 0.0f;
        init(context);
    }

    public ShapeLoadingView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mShape = com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape.SHAPE_CIRCLE;
        this.mArgbEvaluator = new android.animation.ArgbEvaluator();
        this.mIsLoading = false;
        this.mControlX = 0.0f;
        this.mControlY = 0.0f;
        init(context);
    }

    public ShapeLoadingView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mShape = com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape.SHAPE_CIRCLE;
        this.mArgbEvaluator = new android.animation.ArgbEvaluator();
        this.mIsLoading = false;
        this.mControlX = 0.0f;
        this.mControlY = 0.0f;
        init(context);
    }

    public ShapeLoadingView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.mShape = com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape.SHAPE_CIRCLE;
        this.mArgbEvaluator = new android.animation.ArgbEvaluator();
        this.mIsLoading = false;
        this.mControlX = 0.0f;
        this.mControlY = 0.0f;
        init(context);
    }

    private void init(android.content.Context context) {
        this.mTriangleColor = skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.load_view_3);
        this.mCircleColor = skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00);
        this.mRectColor = skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.load_view_4);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.mPaint = paint;
        paint.setColor(this.mTriangleColor);
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (getVisibility() == 8) {
            return;
        }
        int i = com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.AnonymousClass1.$SwitchMap$com$qcwireless$qcwatch$ui$base$view$ShapeLoadingView$Shape[this.mShape.ordinal()];
        if (i == 1) {
            if (this.mIsLoading) {
                float f = (float) (this.mAnimPercent + 0.1611113d);
                this.mAnimPercent = f;
                this.mPaint.setColor(((java.lang.Integer) this.mArgbEvaluator.evaluate(f, java.lang.Integer.valueOf(this.mTriangleColor), java.lang.Integer.valueOf(this.mCircleColor))).intValue());
                android.graphics.Path path = new android.graphics.Path();
                path.moveTo(relativeXFromView(0.5f), relativeYFromView(0.0f));
                if (this.mAnimPercent >= 1.0f) {
                    this.mShape = com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape.SHAPE_CIRCLE;
                    this.mIsLoading = false;
                    this.mAnimPercent = 1.0f;
                }
                float relativeXFromView = this.mControlX - (relativeXFromView(this.mAnimPercent * mTriangle2Circle) * genhao3);
                float relativeYFromView = this.mControlY - relativeYFromView(this.mAnimPercent * mTriangle2Circle);
                path.quadTo(relativeXFromView(1.0f) - relativeXFromView, relativeYFromView, relativeXFromView(0.9330127f), relativeYFromView(0.75f));
                path.quadTo(relativeXFromView(0.5f), relativeYFromView((this.mAnimPercent * 2.0f * mTriangle2Circle) + 0.75f), relativeXFromView(0.066987306f), relativeYFromView(0.75f));
                path.quadTo(relativeXFromView, relativeYFromView, relativeXFromView(0.5f), relativeYFromView(0.0f));
                path.close();
                canvas.drawPath(path, this.mPaint);
                invalidate();
                return;
            }
            android.graphics.Path path2 = new android.graphics.Path();
            this.mPaint.setColor(this.mTriangleColor);
            path2.moveTo(relativeXFromView(0.5f), relativeYFromView(0.0f));
            path2.lineTo(relativeXFromView(1.0f), relativeYFromView(0.8660254f));
            path2.lineTo(relativeXFromView(0.0f), relativeYFromView(0.8660254f));
            this.mControlX = relativeXFromView(0.28349364f);
            this.mControlY = relativeYFromView(0.375f);
            this.mAnimPercent = 0.0f;
            path2.close();
            canvas.drawPath(path2, this.mPaint);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            if (this.mIsLoading) {
                float f2 = (float) (this.mAnimPercent + 0.15d);
                this.mAnimPercent = f2;
                if (f2 >= 1.0f) {
                    this.mShape = com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape.SHAPE_TRIANGLE;
                    this.mIsLoading = false;
                    this.mAnimPercent = 1.0f;
                }
                this.mPaint.setColor(((java.lang.Integer) this.mArgbEvaluator.evaluate(this.mAnimPercent, java.lang.Integer.valueOf(this.mRectColor), java.lang.Integer.valueOf(this.mTriangleColor))).intValue());
                android.graphics.Path path3 = new android.graphics.Path();
                path3.moveTo(relativeXFromView(this.mAnimPercent * 0.5f), 0.0f);
                path3.lineTo(relativeYFromView(1.0f - (this.mAnimPercent * 0.5f)), 0.0f);
                float f3 = this.mControlX * this.mAnimPercent;
                float relativeYFromView2 = (relativeYFromView(1.0f) - this.mControlY) * this.mAnimPercent;
                path3.lineTo(relativeXFromView(1.0f) - f3, relativeYFromView(1.0f) - relativeYFromView2);
                path3.lineTo(relativeXFromView(0.0f) + f3, relativeYFromView(1.0f) - relativeYFromView2);
                path3.close();
                canvas.drawPath(path3, this.mPaint);
                invalidate();
                return;
            }
            this.mPaint.setColor(this.mRectColor);
            this.mControlX = relativeXFromView(0.066987306f);
            this.mControlY = relativeYFromView(0.75f);
            android.graphics.Path path4 = new android.graphics.Path();
            path4.moveTo(relativeXFromView(0.0f), relativeYFromView(0.0f));
            path4.lineTo(relativeXFromView(1.0f), relativeYFromView(0.0f));
            path4.lineTo(relativeXFromView(1.0f), relativeYFromView(1.0f));
            path4.lineTo(relativeXFromView(0.0f), relativeYFromView(1.0f));
            path4.close();
            this.mAnimPercent = 0.0f;
            canvas.drawPath(path4, this.mPaint);
            return;
        }
        if (this.mIsLoading) {
            float f4 = this.mAnimPercent;
            float f5 = mMagicNumber + f4;
            float f6 = (float) (f4 + 0.12d);
            this.mAnimPercent = f6;
            if (f6 + f5 >= 1.9f) {
                this.mShape = com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape.SHAPE_RECT;
                this.mIsLoading = false;
            }
            this.mPaint.setColor(((java.lang.Integer) this.mArgbEvaluator.evaluate(this.mAnimPercent, java.lang.Integer.valueOf(this.mCircleColor), java.lang.Integer.valueOf(this.mRectColor))).intValue());
            android.graphics.Path path5 = new android.graphics.Path();
            path5.moveTo(relativeXFromView(0.5f), relativeYFromView(0.0f));
            float f7 = f5 / 2.0f;
            float f8 = f7 + 0.5f;
            float f9 = 0.5f - f7;
            path5.cubicTo(relativeXFromView(f8), relativeYFromView(0.0f), relativeXFromView(1.0f), relativeYFromView(f9), relativeXFromView(1.0f), relativeYFromView(0.5f));
            path5.cubicTo(relativeXFromView(1.0f), relativeXFromView(f8), relativeXFromView(f8), relativeYFromView(1.0f), relativeXFromView(0.5f), relativeYFromView(1.0f));
            path5.cubicTo(relativeXFromView(f9), relativeXFromView(1.0f), relativeXFromView(0.0f), relativeYFromView(f8), relativeXFromView(0.0f), relativeYFromView(0.5f));
            path5.cubicTo(relativeXFromView(0.0f), relativeXFromView(f9), relativeXFromView(f9), relativeYFromView(0.0f), relativeXFromView(0.5f), relativeYFromView(0.0f));
            path5.close();
            canvas.drawPath(path5, this.mPaint);
            invalidate();
            return;
        }
        this.mPaint.setColor(this.mCircleColor);
        android.graphics.Path path6 = new android.graphics.Path();
        path6.moveTo(relativeXFromView(0.5f), relativeYFromView(0.0f));
        path6.cubicTo(relativeXFromView(0.77614236f), 0.0f, relativeXFromView(1.0f), relativeYFromView(0.2761424f), relativeXFromView(1.0f), relativeYFromView(0.5f));
        path6.cubicTo(relativeXFromView(1.0f), relativeXFromView(0.77614236f), relativeXFromView(0.77614236f), relativeYFromView(1.0f), relativeXFromView(0.5f), relativeYFromView(1.0f));
        path6.cubicTo(relativeXFromView(0.22385761f), relativeXFromView(1.0f), relativeXFromView(0.0f), relativeYFromView(0.77614236f), relativeXFromView(0.0f), relativeYFromView(0.5f));
        path6.cubicTo(relativeXFromView(0.0f), relativeXFromView(0.22385761f), relativeXFromView(0.22385761f), relativeYFromView(0.0f), relativeXFromView(0.5f), relativeYFromView(0.0f));
        this.mAnimPercent = 0.0f;
        path6.close();
        canvas.drawPath(path6, this.mPaint);
    }

    /* renamed from: com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$qcwireless$qcwatch$ui$base$view$ShapeLoadingView$Shape;

        static {
            int[] iArr = new int[com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape.values().length];
            $SwitchMap$com$qcwireless$qcwatch$ui$base$view$ShapeLoadingView$Shape = iArr;
            try {
                iArr[com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape.SHAPE_TRIANGLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$qcwireless$qcwatch$ui$base$view$ShapeLoadingView$Shape[com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape.SHAPE_CIRCLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$qcwireless$qcwatch$ui$base$view$ShapeLoadingView$Shape[com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape.SHAPE_RECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private float relativeXFromView(float percent) {
        return getWidth() * percent;
    }

    private float relativeYFromView(float percent) {
        return getHeight() * percent;
    }

    public void changeShape() {
        this.mIsLoading = true;
        invalidate();
    }

    public void setShape(com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape shape) {
        this.mIsLoading = true;
        this.mShape = shape;
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        if (visibility == 0) {
            invalidate();
        }
    }

    public com.qcwireless.qcwatch.ui.base.view.ShapeLoadingView.Shape getShape() {
        return this.mShape;
    }

    private int getColor(android.content.Context context, int id) {
        return androidx.core.content.ContextCompat.getColor(context, id);
    }
}
