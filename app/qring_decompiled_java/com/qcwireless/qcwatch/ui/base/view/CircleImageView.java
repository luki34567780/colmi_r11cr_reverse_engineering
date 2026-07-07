package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class CircleImageView extends android.widget.ImageView {
    private static final int COLORDRAWABLE_DIMENSION = 2;
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final boolean DEFAULT_BORDER_OVERLAY = false;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private android.graphics.Bitmap mBitmap;
    private int mBitmapHeight;
    private final android.graphics.Paint mBitmapPaint;
    private android.graphics.BitmapShader mBitmapShader;
    private int mBitmapWidth;
    private int mBorderColor;
    private boolean mBorderOverlay;
    private final android.graphics.Paint mBorderPaint;
    private float mBorderRadius;
    private final android.graphics.RectF mBorderRect;
    private int mBorderWidth;
    private android.graphics.ColorFilter mColorFilter;
    private float mDrawableRadius;
    private final android.graphics.RectF mDrawableRect;
    private boolean mReady;
    private boolean mSetupPending;
    private final android.graphics.Matrix mShaderMatrix;
    private static final android.widget.ImageView.ScaleType SCALE_TYPE = android.widget.ImageView.ScaleType.CENTER_CROP;
    private static final android.graphics.Bitmap.Config BITMAP_CONFIG = android.graphics.Bitmap.Config.ARGB_8888;

    public CircleImageView(android.content.Context context) {
        super(context);
        this.mDrawableRect = new android.graphics.RectF();
        this.mBorderRect = new android.graphics.RectF();
        this.mShaderMatrix = new android.graphics.Matrix();
        this.mBitmapPaint = new android.graphics.Paint();
        this.mBorderPaint = new android.graphics.Paint();
        this.mBorderColor = DEFAULT_BORDER_COLOR;
        this.mBorderWidth = 0;
        init();
    }

    public CircleImageView(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CircleImageView(android.content.Context context, android.util.AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.mDrawableRect = new android.graphics.RectF();
        this.mBorderRect = new android.graphics.RectF();
        this.mShaderMatrix = new android.graphics.Matrix();
        this.mBitmapPaint = new android.graphics.Paint();
        this.mBorderPaint = new android.graphics.Paint();
        this.mBorderColor = DEFAULT_BORDER_COLOR;
        this.mBorderWidth = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.CircleImageView, defStyle, 0);
        this.mBorderWidth = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.mBorderColor = obtainStyledAttributes.getColor(0, DEFAULT_BORDER_COLOR);
        this.mBorderOverlay = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        init();
    }

    private void init() {
        super.setScaleType(SCALE_TYPE);
        this.mReady = true;
        if (this.mSetupPending) {
            setup();
            this.mSetupPending = false;
        }
    }

    @Override // android.widget.ImageView
    public android.widget.ImageView.ScaleType getScaleType() {
        return SCALE_TYPE;
    }

    @Override // android.widget.ImageView
    public void setScaleType(android.widget.ImageView.ScaleType scaleType) {
        if (scaleType != SCALE_TYPE) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("ScaleType %s not supported.", scaleType));
        }
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean adjustViewBounds) {
        if (adjustViewBounds) {
            throw new java.lang.IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.mDrawableRadius, this.mBitmapPaint);
        if (this.mBorderWidth != 0) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.mBorderRadius, this.mBorderPaint);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        setup();
    }

    public int getBorderColor() {
        return this.mBorderColor;
    }

    public void setBorderColor(int borderColor) {
        if (borderColor == this.mBorderColor) {
            return;
        }
        this.mBorderColor = borderColor;
        this.mBorderPaint.setColor(borderColor);
        invalidate();
    }

    public void setBorderColorResource(int borderColorRes) {
        setBorderColor(getContext().getResources().getColor(borderColorRes));
    }

    public int getBorderWidth() {
        return this.mBorderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        if (borderWidth == this.mBorderWidth) {
            return;
        }
        this.mBorderWidth = borderWidth;
        setup();
    }

    public boolean isBorderOverlay() {
        return this.mBorderOverlay;
    }

    public void setBorderOverlay(boolean borderOverlay) {
        if (borderOverlay == this.mBorderOverlay) {
            return;
        }
        this.mBorderOverlay = borderOverlay;
        setup();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bm) {
        super.setImageBitmap(bm);
        this.mBitmap = bm;
        setup();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        super.setImageDrawable(drawable);
        this.mBitmap = getBitmapFromDrawable(drawable);
        setup();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int resId) {
        super.setImageResource(resId);
        this.mBitmap = getBitmapFromDrawable(getDrawable());
        setup();
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        this.mBitmap = getBitmapFromDrawable(getDrawable());
        setup();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(android.graphics.ColorFilter cf) {
        if (cf == this.mColorFilter) {
            return;
        }
        this.mColorFilter = cf;
        this.mBitmapPaint.setColorFilter(cf);
        invalidate();
    }

    private android.graphics.Bitmap getBitmapFromDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.Bitmap createBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof android.graphics.drawable.ColorDrawable) {
                createBitmap = android.graphics.Bitmap.createBitmap(2, 2, BITMAP_CONFIG);
            } else {
                createBitmap = android.graphics.Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), BITMAP_CONFIG);
            }
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (java.lang.OutOfMemoryError unused) {
            return null;
        }
    }

    private void setup() {
        if (!this.mReady) {
            this.mSetupPending = true;
            return;
        }
        if (this.mBitmap == null) {
            return;
        }
        this.mBitmapShader = new android.graphics.BitmapShader(this.mBitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        this.mBitmapPaint.setAntiAlias(true);
        this.mBitmapPaint.setShader(this.mBitmapShader);
        this.mBorderPaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.mBorderPaint.setAntiAlias(true);
        this.mBorderPaint.setColor(this.mBorderColor);
        this.mBorderPaint.setStrokeWidth(this.mBorderWidth);
        this.mBitmapHeight = this.mBitmap.getHeight();
        this.mBitmapWidth = this.mBitmap.getWidth();
        this.mBorderRect.set(0.0f, 0.0f, getWidth(), getHeight());
        this.mBorderRadius = java.lang.Math.min((this.mBorderRect.height() - this.mBorderWidth) / 2.0f, (this.mBorderRect.width() - this.mBorderWidth) / 2.0f);
        this.mDrawableRect.set(this.mBorderRect);
        if (!this.mBorderOverlay) {
            android.graphics.RectF rectF = this.mDrawableRect;
            int i = this.mBorderWidth;
            rectF.inset(i, i);
        }
        this.mDrawableRadius = java.lang.Math.min(this.mDrawableRect.height() / 2.0f, this.mDrawableRect.width() / 2.0f);
        updateShaderMatrix();
        invalidate();
    }

    private void updateShaderMatrix() {
        float width;
        float height;
        this.mShaderMatrix.set(null);
        float f = 0.0f;
        if (this.mBitmapWidth * this.mDrawableRect.height() > this.mDrawableRect.width() * this.mBitmapHeight) {
            width = this.mDrawableRect.height() / this.mBitmapHeight;
            f = (this.mDrawableRect.width() - (this.mBitmapWidth * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = this.mDrawableRect.width() / this.mBitmapWidth;
            height = (this.mDrawableRect.height() - (this.mBitmapHeight * width)) * 0.5f;
        }
        this.mShaderMatrix.setScale(width, width);
        this.mShaderMatrix.postTranslate(((int) (f + 0.5f)) + this.mDrawableRect.left, ((int) (height + 0.5f)) + this.mDrawableRect.top);
        this.mBitmapShader.setLocalMatrix(this.mShaderMatrix);
    }
}
