package me.zhouzhuo.zzhorizontalprogressbar;

/* loaded from: classes3.dex */
public class ZzHorizontalProgressBar extends android.view.View {
    public static final int SHAPE_LINE = 1;
    public static final int SHAPE_POINT = 0;
    public static final int SHOW_MODE_RECT = 1;
    public static final int SHOW_MODE_ROUND = 0;
    public static final int SHOW_MODE_ROUND_RECT = 2;
    private int mBgColor;
    private android.graphics.Paint mBgPaint;
    private int mBorderColor;
    private android.graphics.Paint mBorderPaint;
    private int mBorderWidth;
    private boolean mDrawBorder;
    private int mGradientFrom;
    private android.graphics.Paint mGradientPaint;
    private int mGradientTo;
    private int mMax;
    private me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar.OnProgressChangedListener mOnProgressChangedListener;
    private boolean mOpenGradient;
    private boolean mOpenSecondGradient;
    private int mPadding;
    private int mProgress;
    private int mProgressColor;
    private android.graphics.Paint mProgressPaint;
    private int mRadius;
    private int mSecondGradientFrom;
    private android.graphics.Paint mSecondGradientPaint;
    private int mSecondGradientTo;
    private int mSecondProgress;
    private int mSecondProgressColor;
    private android.graphics.Paint mSecondProgressPaint;
    private int mSecondProgressShape;
    private int mShowMode;
    private boolean mShowSecondProgress;
    private boolean mShowZeroPoint;

    public interface OnProgressChangedListener {
        void onProgressChanged(me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar zzHorizontalProgressBar, int i, int i2);

        void onSecondProgressChanged(me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar zzHorizontalProgressBar, int i, int i2);
    }

    public ZzHorizontalProgressBar(android.content.Context context) {
        super(context);
        this.mDrawBorder = false;
        this.mShowMode = 0;
        init(context, null);
    }

    public ZzHorizontalProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDrawBorder = false;
        this.mShowMode = 0;
        init(context, attributeSet);
    }

    public ZzHorizontalProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDrawBorder = false;
        this.mShowMode = 0;
        init(context, attributeSet);
    }

    private void init(android.content.Context context, android.util.AttributeSet attributeSet) {
        initAttrs(context, attributeSet);
        initPaths();
    }

    private void initAttrs(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar);
        this.mMax = obtainStyledAttributes.getInteger(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_max, 100);
        this.mProgress = obtainStyledAttributes.getInteger(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_progress, 0);
        this.mBgColor = obtainStyledAttributes.getColor(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_bg_color, -12627531);
        this.mProgressColor = obtainStyledAttributes.getColor(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_pb_color, -49023);
        this.mSecondProgressColor = obtainStyledAttributes.getColor(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_second_pb_color, -49023);
        this.mPadding = obtainStyledAttributes.getDimensionPixelSize(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_padding, 0);
        this.mShowZeroPoint = obtainStyledAttributes.getBoolean(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_show_zero_point, false);
        this.mShowSecondProgress = obtainStyledAttributes.getBoolean(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_show_second_progress, false);
        this.mSecondProgress = obtainStyledAttributes.getInteger(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_second_progress, 0);
        this.mSecondProgressShape = obtainStyledAttributes.getInteger(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_show_second_point_shape, 0);
        this.mOpenGradient = obtainStyledAttributes.getBoolean(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_open_gradient, false);
        this.mGradientFrom = obtainStyledAttributes.getColor(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_gradient_from, -49023);
        this.mGradientTo = obtainStyledAttributes.getColor(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_gradient_to, -49023);
        this.mOpenSecondGradient = obtainStyledAttributes.getBoolean(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_open_second_gradient, false);
        this.mShowMode = obtainStyledAttributes.getInt(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_show_mode, 0);
        this.mSecondGradientFrom = obtainStyledAttributes.getColor(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_second_gradient_from, -49023);
        this.mSecondGradientTo = obtainStyledAttributes.getColor(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_second_gradient_to, -49023);
        this.mRadius = obtainStyledAttributes.getDimensionPixelSize(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_round_rect_radius, 20);
        this.mDrawBorder = obtainStyledAttributes.getBoolean(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_draw_border, false);
        this.mBorderWidth = obtainStyledAttributes.getDimensionPixelSize(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_border_width, 1);
        this.mBorderColor = obtainStyledAttributes.getColor(me.zhouzhuo.zzhorizontalprogressbar.R.styleable.ZzHorizontalProgressBar_zpb_border_color, -65505);
        obtainStyledAttributes.recycle();
    }

    private void initPaths() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.mProgressPaint = paint;
        paint.setColor(this.mProgressColor);
        this.mProgressPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mProgressPaint.setAntiAlias(true);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.mSecondProgressPaint = paint2;
        paint2.setColor(this.mSecondProgressColor);
        this.mSecondProgressPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mSecondProgressPaint.setAntiAlias(true);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.mGradientPaint = paint3;
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        this.mGradientPaint.setAntiAlias(true);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.mSecondGradientPaint = paint4;
        paint4.setStyle(android.graphics.Paint.Style.FILL);
        this.mSecondGradientPaint.setAntiAlias(true);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.mBgPaint = paint5;
        paint5.setColor(this.mBgColor);
        this.mBgPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mBgPaint.setAntiAlias(true);
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.mBorderPaint = paint6;
        paint6.setColor(this.mBorderColor);
        this.mBorderPaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.mBorderPaint.setStrokeWidth(this.mBorderWidth);
        this.mBorderPaint.setAntiAlias(true);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int i = this.mShowMode;
        if (i == 0) {
            drawBackgroundCircleMode(canvas);
            drawProgressCircleMode(canvas);
            drawBorderCircleMode(canvas);
        } else if (i == 1) {
            drawBackgroundRectMode(canvas);
            drawProgressRectMode(canvas);
            drawBorderRectMode(canvas);
        } else {
            if (i != 2) {
                return;
            }
            drawBackgroundRoundRectMode(canvas);
            drawProgressRoundRectMode(canvas);
            drawBorderRoundRect(canvas);
        }
    }

    private void drawProgressCircleMode(android.graphics.Canvas canvas) {
        int width = getWidth();
        int i = this.mMax;
        float f = i != 0 ? (this.mProgress * 1.0f) / i : 0.0f;
        int height = getHeight() - (this.mPadding * 2);
        if (this.mOpenGradient) {
            float f2 = (width - (r7 * 2)) * f;
            int[] iArr = {this.mGradientFrom, this.mGradientTo};
            int i2 = this.mPadding;
            float f3 = height / 2.0f;
            this.mGradientPaint.setShader(new android.graphics.LinearGradient(i2 + f3, i2, i2 + f3 + f2, i2 + height, iArr, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.MIRROR));
            int height2 = width > getHeight() ? getHeight() / 2 : width / 2;
            if (f2 < getHeight()) {
                if (this.mProgress == 0) {
                    if (this.mShowZeroPoint) {
                        int i3 = this.mPadding;
                        canvas.drawCircle(i3 + f3, i3 + f3, f3, this.mGradientPaint);
                    }
                } else {
                    int i4 = this.mPadding;
                    canvas.drawCircle(i4 + f3, i4 + f3, f3, this.mGradientPaint);
                }
            } else {
                int i5 = this.mPadding;
                android.graphics.RectF rectF = new android.graphics.RectF(i5, i5, i5 + f2, i5 + height);
                float f4 = height2;
                canvas.drawRoundRect(rectF, f4, f4, this.mGradientPaint);
            }
        } else {
            float f5 = ((width - (r7 * 2)) - height) * f;
            this.mProgressPaint.setColor(this.mProgressColor);
            float f6 = height / 2.0f;
            float f7 = this.mPadding + f6;
            if (this.mProgress == 0) {
                if (this.mShowZeroPoint) {
                    canvas.drawCircle(f7, f7, f6, this.mProgressPaint);
                }
            } else {
                canvas.drawCircle(f7, f7, f6, this.mProgressPaint);
            }
            if (this.mProgress == 0) {
                if (this.mShowZeroPoint) {
                    canvas.drawCircle(f7 + f5, f7, f6, this.mProgressPaint);
                }
            } else {
                canvas.drawCircle(f7 + f5, f7, f6, this.mProgressPaint);
            }
            canvas.drawRect(new android.graphics.RectF(f7, this.mPadding, f5 + f7, r7 + height), this.mProgressPaint);
        }
        if (this.mShowSecondProgress) {
            int i6 = this.mMax;
            float f8 = i6 != 0 ? (this.mSecondProgress * 1.0f) / i6 : 0.0f;
            int height3 = getHeight();
            int i7 = this.mPadding;
            int i8 = height3 - (i7 * 2);
            if (this.mOpenSecondGradient) {
                float f9 = (width - (i7 * 2)) * f8;
                int[] iArr2 = {this.mSecondGradientFrom, this.mSecondGradientTo};
                int i9 = this.mPadding;
                float f10 = i8 / 2.0f;
                this.mSecondGradientPaint.setShader(new android.graphics.LinearGradient(i9 + f10, i9, i9 + f10 + f9, i9 + i8, iArr2, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.MIRROR));
                if (width > getHeight()) {
                    width = getHeight();
                }
                int i10 = width / 2;
                if (f9 < getHeight()) {
                    if (this.mSecondProgress == 0) {
                        if (this.mShowZeroPoint) {
                            int i11 = this.mPadding;
                            canvas.drawCircle(i11 + f10, i11 + f10, f10, this.mSecondGradientPaint);
                            return;
                        }
                        return;
                    }
                    int i12 = this.mPadding;
                    canvas.drawCircle(i12 + f10, i12 + f10, f10, this.mSecondGradientPaint);
                    return;
                }
                int i13 = this.mPadding;
                float f11 = i10;
                canvas.drawRoundRect(new android.graphics.RectF(i13, i13, i13 + f9, i13 + i8), f11, f11, this.mSecondGradientPaint);
                return;
            }
            if (this.mSecondProgressShape == 0) {
                float f12 = i8;
                float f13 = f12 / 2.0f;
                float f14 = i7 + f13 + ((width - (i7 * 2)) * f8);
                if (f14 < (width - i7) - f13) {
                    if (this.mSecondProgress == 0) {
                        if (this.mShowZeroPoint) {
                            canvas.drawCircle(f14, i7 + f13, f13, this.mSecondProgressPaint);
                            return;
                        }
                        return;
                    }
                    canvas.drawCircle(f14, i7 + f13, f13, this.mSecondProgressPaint);
                    return;
                }
                canvas.drawCircle(f14 - f12, i7 + f13, f13, this.mSecondProgressPaint);
                return;
            }
            float f15 = ((width - (i7 * 2)) - i8) * f8;
            this.mSecondProgressPaint.setColor(this.mSecondProgressColor);
            if (this.mSecondProgress == 0) {
                if (this.mShowZeroPoint) {
                    int i14 = this.mPadding;
                    float f16 = i8 / 2.0f;
                    canvas.drawCircle(i14 + f16, i14 + f16, f16, this.mSecondProgressPaint);
                }
            } else {
                int i15 = this.mPadding;
                float f17 = i8 / 2.0f;
                canvas.drawCircle(i15 + f17, i15 + f17, f17, this.mSecondProgressPaint);
            }
            if (this.mSecondProgress == 0) {
                if (this.mShowZeroPoint) {
                    int i16 = this.mPadding;
                    float f18 = i8 / 2.0f;
                    canvas.drawCircle(i16 + f18 + f15, i16 + f18, f18, this.mSecondProgressPaint);
                }
            } else {
                int i17 = this.mPadding;
                float f19 = i8 / 2.0f;
                canvas.drawCircle(i17 + f19 + f15, i17 + f19, f19, this.mSecondProgressPaint);
            }
            int i18 = this.mPadding;
            float f20 = i8 / 2.0f;
            canvas.drawRect(new android.graphics.RectF(i18 + f20, i18, i18 + f20 + f15, i18 + i8), this.mSecondProgressPaint);
        }
    }

    private void drawProgressRectMode(android.graphics.Canvas canvas) {
        int width = getWidth();
        int i = this.mMax;
        float f = i != 0 ? (this.mProgress * 1.0f) / i : 0.0f;
        int height = getHeight() - (this.mPadding * 2);
        if (this.mOpenGradient) {
            float f2 = (width - (r7 * 2)) * f;
            int[] iArr = {this.mGradientFrom, this.mGradientTo};
            int i2 = this.mPadding;
            float f3 = height / 2.0f;
            this.mGradientPaint.setShader(new android.graphics.LinearGradient(i2 + f3, i2, i2 + f3 + f2, i2 + height, iArr, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.MIRROR));
            int i3 = this.mPadding;
            canvas.drawRect(new android.graphics.RectF(i3, i3, i3 + f2, i3 + height), this.mGradientPaint);
        } else {
            float f4 = (width - (r7 * 2)) * f;
            this.mProgressPaint.setColor(this.mProgressColor);
            int i4 = this.mPadding;
            canvas.drawRect(new android.graphics.RectF(i4, i4, i4 + f4, i4 + height), this.mProgressPaint);
        }
        if (this.mShowSecondProgress) {
            int i5 = this.mMax;
            float f5 = i5 != 0 ? (this.mSecondProgress * 1.0f) / i5 : 0.0f;
            int height2 = getHeight() - (this.mPadding * 2);
            if (this.mOpenSecondGradient) {
                float f6 = (width - (r4 * 2)) * f5;
                int[] iArr2 = {this.mSecondGradientFrom, this.mSecondGradientTo};
                int i6 = this.mPadding;
                float f7 = height2 / 2.0f;
                this.mSecondGradientPaint.setShader(new android.graphics.LinearGradient(i6 + f7, i6, i6 + f7 + f6, i6 + height2, iArr2, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.MIRROR));
                int i7 = this.mPadding;
                canvas.drawRect(new android.graphics.RectF(i7, i7, i7 + f6, i7 + height2), this.mSecondGradientPaint);
                return;
            }
            float f8 = (width - (r4 * 2)) * f5;
            this.mSecondProgressPaint.setColor(this.mSecondProgressColor);
            int i8 = this.mPadding;
            canvas.drawRect(new android.graphics.RectF(i8, i8, i8 + f8, i8 + height2), this.mSecondProgressPaint);
        }
    }

    private void drawProgressRoundRectMode(android.graphics.Canvas canvas) {
        int width = getWidth();
        int i = this.mMax;
        float f = i != 0 ? (this.mProgress * 1.0f) / i : 0.0f;
        int height = getHeight();
        int i2 = this.mPadding;
        int i3 = height - (i2 * 2);
        float f2 = ((width - (i2 * 2)) - this.mBorderWidth) * f;
        if (this.mOpenGradient) {
            int[] iArr = {this.mGradientFrom, this.mGradientTo};
            float f3 = i2 + (i3 / 2.0f);
            this.mGradientPaint.setShader(new android.graphics.LinearGradient(f3, this.mPadding, f3 + f2, r13 + i3, iArr, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.MIRROR));
            int i4 = this.mPadding;
            int i5 = this.mBorderWidth;
            float f4 = i4 + (i5 / 2.0f);
            float f5 = i4 + (i5 / 2.0f);
            android.graphics.RectF rectF = new android.graphics.RectF(f4, f5, f2 + f4, getHeight() - f5);
            int i6 = this.mRadius;
            canvas.drawRoundRect(rectF, i6, i6, this.mGradientPaint);
        } else {
            this.mProgressPaint.setColor(this.mProgressColor);
            int i7 = this.mPadding;
            int i8 = this.mBorderWidth;
            float f6 = i7 + (i8 / 2.0f);
            float f7 = i7 + (i8 / 2.0f);
            android.graphics.RectF rectF2 = new android.graphics.RectF(f6, f7, f2 + f6, getHeight() - f7);
            int i9 = this.mRadius;
            canvas.drawRoundRect(rectF2, i9, i9, this.mProgressPaint);
        }
        if (this.mShowSecondProgress) {
            int i10 = this.mMax;
            float f8 = i10 != 0 ? (this.mSecondProgress * 1.0f) / i10 : 0.0f;
            int height2 = getHeight();
            int i11 = this.mPadding;
            int i12 = height2 - (i11 * 2);
            float f9 = ((width - (i11 * 2)) - this.mBorderWidth) * f8;
            if (this.mOpenSecondGradient) {
                int[] iArr2 = {this.mSecondGradientFrom, this.mSecondGradientTo};
                float f10 = i11 + (i12 / 2.0f);
                this.mSecondGradientPaint.setShader(new android.graphics.LinearGradient(f10, this.mPadding, f10 + f9, r7 + i12, iArr2, new float[]{0.0f, 1.0f}, android.graphics.Shader.TileMode.MIRROR));
                int i13 = this.mPadding;
                int i14 = this.mBorderWidth;
                float f11 = i13 + (i14 / 2.0f);
                float f12 = i13 + (i14 / 2.0f);
                android.graphics.RectF rectF3 = new android.graphics.RectF(f11, f12, f9 + f11, getHeight() - f12);
                int i15 = this.mRadius;
                canvas.drawRoundRect(rectF3, i15, i15, this.mSecondGradientPaint);
                return;
            }
            this.mSecondProgressPaint.setColor(this.mSecondProgressColor);
            int i16 = this.mPadding;
            int i17 = this.mBorderWidth;
            float f13 = i16 + (i17 / 2.0f);
            float f14 = i16 + (i17 / 2.0f);
            android.graphics.RectF rectF4 = new android.graphics.RectF(f13, f14, f9 + f13, getHeight() - f14);
            int i18 = this.mRadius;
            canvas.drawRoundRect(rectF4, i18, i18, this.mSecondProgressPaint);
        }
    }

    private void drawBackgroundCircleMode(android.graphics.Canvas canvas) {
        int height = getHeight();
        int width = getWidth();
        float f = height;
        float f2 = f / 2.0f;
        canvas.drawCircle(f2, f2, f2, this.mBgPaint);
        float f3 = width - f2;
        canvas.drawCircle(f3, f2, f2, this.mBgPaint);
        canvas.drawRect(new android.graphics.RectF(f2, 0.0f, f3, f), this.mBgPaint);
    }

    private void drawBorderCircleMode(android.graphics.Canvas canvas) {
        if (this.mDrawBorder) {
            float height = getHeight();
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), height);
            float f = height / 2.0f;
            canvas.drawRoundRect(rectF, f, f, this.mBorderPaint);
        }
    }

    private void drawBorderRectMode(android.graphics.Canvas canvas) {
        if (this.mDrawBorder) {
            canvas.drawRect(new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight()), this.mBorderPaint);
        }
    }

    private void drawBorderRoundRect(android.graphics.Canvas canvas) {
        if (this.mDrawBorder) {
            int height = getHeight();
            int width = getWidth();
            int i = this.mBorderWidth;
            android.graphics.RectF rectF = new android.graphics.RectF(i / 2.0f, i / 2.0f, width - (i / 2.0f), height - (i / 2.0f));
            int i2 = this.mRadius;
            canvas.drawRoundRect(rectF, i2, i2, this.mBorderPaint);
        }
    }

    private void drawBackgroundRectMode(android.graphics.Canvas canvas) {
        canvas.drawRect(new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight()), this.mBgPaint);
    }

    private void drawBackgroundRoundRectMode(android.graphics.Canvas canvas) {
        int height = getHeight();
        int width = getWidth();
        int i = this.mBorderWidth;
        android.graphics.RectF rectF = new android.graphics.RectF(i / 2.0f, i / 2.0f, width - (i / 2.0f), height - (i / 2.0f));
        int i2 = this.mRadius;
        canvas.drawRoundRect(rectF, i2, i2, this.mBgPaint);
    }

    public int getMax() {
        return this.mMax;
    }

    public void setMax(int i) {
        this.mMax = i;
        invalidate();
    }

    public int getProgress() {
        return this.mProgress;
    }

    public void setProgress(int i) {
        if (i < 0) {
            this.mProgress = 0;
        } else {
            int i2 = this.mMax;
            if (i > i2) {
                this.mProgress = i2;
            } else {
                this.mProgress = i;
            }
        }
        invalidate();
        me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar.OnProgressChangedListener onProgressChangedListener = this.mOnProgressChangedListener;
        if (onProgressChangedListener != null) {
            onProgressChangedListener.onProgressChanged(this, this.mMax, this.mProgress);
        }
    }

    public boolean isShowSecondProgress() {
        return this.mShowSecondProgress;
    }

    public void setShowSecondProgress(boolean z) {
        this.mShowSecondProgress = z;
        invalidate();
    }

    public int getSecondProgress() {
        return this.mSecondProgress;
    }

    public void setSecondProgress(int i) {
        if (i < 0) {
            this.mSecondProgress = 0;
        } else {
            int i2 = this.mMax;
            if (i > i2) {
                this.mSecondProgress = i2;
            } else {
                this.mSecondProgress = i;
            }
        }
        invalidate();
        me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar.OnProgressChangedListener onProgressChangedListener = this.mOnProgressChangedListener;
        if (onProgressChangedListener != null) {
            onProgressChangedListener.onSecondProgressChanged(this, this.mMax, this.mSecondProgress);
        }
    }

    public int getSecondProgressShape() {
        return this.mSecondProgressShape;
    }

    public void setSecondProgressShape(int i) {
        this.mSecondProgressShape = i;
        invalidate();
    }

    public int getBgColor() {
        return this.mBgColor;
    }

    public void setBgColor(int i) {
        this.mBgColor = i;
        this.mBgPaint.setColor(i);
        invalidate();
    }

    public boolean isOpenSecondGradient() {
        return this.mOpenSecondGradient;
    }

    public void setOpenSecondGradient(boolean z) {
        this.mOpenSecondGradient = z;
        invalidate();
    }

    public int getSecondGradientFrom() {
        return this.mSecondGradientFrom;
    }

    public int getSecondGradientTo() {
        return this.mSecondGradientTo;
    }

    public int getSecondProgressColor() {
        return this.mSecondProgressColor;
    }

    public void setSecondProgressColor(int i) {
        this.mSecondProgressColor = i;
        this.mSecondProgressPaint.setColor(i);
        invalidate();
    }

    public int getProgressColor() {
        return this.mProgressColor;
    }

    public void setProgressColor(int i) {
        this.mProgressColor = i;
        this.mProgressPaint.setColor(i);
        invalidate();
    }

    public int getPadding() {
        return this.mPadding;
    }

    public void setPadding(int i) {
        this.mPadding = i;
        invalidate();
    }

    public void setShowMode(int i) {
        if (i == 0) {
            this.mShowMode = 0;
        } else if (i == 1) {
            this.mShowMode = 1;
        } else if (i == 2) {
            this.mShowMode = 2;
        }
        invalidate();
    }

    public int getPercentage() {
        int i = this.mMax;
        if (i == 0) {
            return 0;
        }
        return (int) (((this.mProgress * 100.0f) / i) + 0.5f);
    }

    public float getPercentageFloat() {
        int i = this.mMax;
        if (i == 0) {
            return 0.0f;
        }
        return (this.mProgress * 100.0f) / i;
    }

    public boolean isOpenGradient() {
        return this.mOpenGradient;
    }

    public void setOpenGradient(boolean z) {
        this.mOpenGradient = z;
        invalidate();
    }

    public int getGradientFrom() {
        return this.mGradientFrom;
    }

    public int getGradientTo() {
        return this.mGradientTo;
    }

    public void setBorderColor(int i) {
        this.mBorderColor = i;
        this.mBorderPaint.setColor(i);
        invalidate();
    }

    public void setGradientColor(int i, int i2) {
        this.mGradientFrom = i;
        this.mGradientTo = i2;
        invalidate();
    }

    public void setSecondGradientColor(int i, int i2) {
        this.mSecondGradientFrom = i;
        this.mSecondGradientTo = i2;
        invalidate();
    }

    public void setGradientColorAndBorderColor(int i, int i2, int i3) {
        this.mGradientFrom = i;
        this.mGradientTo = i2;
        this.mBorderColor = i3;
        this.mBorderPaint.setColor(i3);
        invalidate();
    }

    public int getBorderColor() {
        return this.mBorderColor;
    }

    public void setOnProgressChangedListener(me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar.OnProgressChangedListener onProgressChangedListener) {
        this.mOnProgressChangedListener = onProgressChangedListener;
    }
}
