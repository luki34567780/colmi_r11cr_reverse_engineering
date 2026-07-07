package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class ColorPickerView extends android.view.View implements skin.support.widget.SkinCompatSupportable {
    private static final int defaultSizeLong = 420;
    private static final int defaultSizeShort = 70;
    private android.graphics.Bitmap bitmapForColor;
    private android.graphics.Bitmap bitmapForIndicator;
    private com.qcwireless.qcwatch.ui.base.view.ColorPickerView.OnColorPickerChangeListener colorPickerChangeListener;
    private int[] colors;
    private android.content.Context context;
    public int curX;
    public int curY;
    private int currentColor;
    private boolean errorFlag;
    private android.graphics.LinearGradient linearGradient;
    private int mBottom;
    private int mIndicatorColor;
    private boolean mIndicatorEnable;
    private int mLeft;
    private int mRadius;
    private int mRight;
    private int mTop;
    private boolean needReDrawColorTable;
    private boolean needReDrawIndicator;
    int newRadius;
    private com.qcwireless.qcwatch.ui.base.view.ColorPickerView.Orientation orientation;
    private final android.graphics.Paint paint;
    private final android.graphics.Paint paintForIndicator;
    int radius;
    private final android.graphics.Rect rect;
    private final android.graphics.Rect rectForIndicator;

    public interface OnColorPickerChangeListener {
        void onColorChanged(com.qcwireless.qcwatch.ui.base.view.ColorPickerView picker, int color);

        void onErrorTouch(com.qcwireless.qcwatch.ui.base.view.ColorPickerView picker);

        void onStartTrackingTouch(com.qcwireless.qcwatch.ui.base.view.ColorPickerView picker);

        void onStopTrackingTouch(com.qcwireless.qcwatch.ui.base.view.ColorPickerView picker);
    }

    public enum Orientation {
        HORIZONTAL,
        VERTICAL
    }

    public void applySkin() {
    }

    private void init() {
        this.newRadius = (int) com.qcwireless.qcwatch.ui.base.util.SizeUtilsJava.dp2px(this.context, 8.0f);
        this.radius = (int) com.qcwireless.qcwatch.ui.base.util.SizeUtilsJava.dp2px(this.context, 1.0f);
    }

    public ColorPickerView(android.content.Context context) {
        super(context);
        this.rect = new android.graphics.Rect();
        this.rectForIndicator = new android.graphics.Rect();
        this.needReDrawColorTable = true;
        this.needReDrawIndicator = true;
        this.colors = null;
        this.errorFlag = true;
        this.bitmapForColor = android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888);
        this.bitmapForIndicator = android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888);
        setLayerType(1, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.paintForIndicator = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.curY = com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.curX = com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.context = context;
        init();
    }

    public ColorPickerView(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        this.context = context;
        init();
    }

    public ColorPickerView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.rect = new android.graphics.Rect();
        this.rectForIndicator = new android.graphics.Rect();
        this.needReDrawColorTable = true;
        this.needReDrawIndicator = true;
        this.colors = null;
        this.errorFlag = true;
        this.bitmapForColor = android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888);
        this.bitmapForIndicator = android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888);
        setLayerType(1, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.paintForIndicator = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.curY = com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.curX = com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.context = context;
        init();
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.QColorView, defStyleAttr, 0);
        this.mIndicatorColor = obtainStyledAttributes.getColor(0, -1);
        this.orientation = obtainStyledAttributes.getInteger(2, 0) == 0 ? com.qcwireless.qcwatch.ui.base.view.ColorPickerView.Orientation.HORIZONTAL : com.qcwireless.qcwatch.ui.base.view.ColorPickerView.Orientation.VERTICAL;
        this.mIndicatorEnable = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = android.view.View.MeasureSpec.getMode(widthMeasureSpec);
        int size = android.view.View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = android.view.View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = android.view.View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode != 1073741824) {
            size = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        }
        if (mode2 != 1073741824) {
            size2 = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        }
        com.qcwireless.qcwatch.ui.base.view.ColorPickerView.Orientation orientation = this.orientation;
        com.qcwireless.qcwatch.ui.base.view.ColorPickerView.Orientation orientation2 = com.qcwireless.qcwatch.ui.base.view.ColorPickerView.Orientation.HORIZONTAL;
        int i = defaultSizeLong;
        int max = java.lang.Math.max(size, orientation == orientation2 ? defaultSizeLong : 70);
        if (this.orientation == com.qcwireless.qcwatch.ui.base.view.ColorPickerView.Orientation.HORIZONTAL) {
            i = 70;
        }
        setMeasuredDimension(max, java.lang.Math.max(size2, i));
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.mTop = getPaddingTop();
        this.mLeft = getPaddingLeft();
        this.mBottom = getMeasuredHeight() - getPaddingBottom();
        this.mRight = getMeasuredWidth() - getPaddingRight();
        int i = this.curX;
        int i2 = this.curY;
        if (i == i2 || i2 == Integer.MAX_VALUE) {
            this.curX = getWidth() / 2;
            this.curY = getHeight() / 2;
        }
        calcBounds();
        int[] iArr = this.colors;
        if (iArr == null) {
            setColors(createDefaultColorTable());
        } else {
            setColors(iArr);
        }
        createBitmap();
        if (this.mIndicatorEnable) {
            this.needReDrawIndicator = true;
        }
    }

    private void createBitmap() {
        int height = this.rect.height();
        int width = this.rect.width();
        int i = this.mRadius * 2;
        android.graphics.Bitmap bitmap = this.bitmapForColor;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.bitmapForColor.recycle();
            this.bitmapForColor = null;
        }
        android.graphics.Bitmap bitmap2 = this.bitmapForIndicator;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.bitmapForIndicator.recycle();
            this.bitmapForIndicator = null;
        }
        this.bitmapForColor = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        this.bitmapForIndicator = android.graphics.Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
    }

    private void calcBounds() {
        int i;
        int width;
        int i2;
        int i3;
        int i4 = this.mBottom - this.mTop;
        int i5 = this.mRight - this.mLeft;
        int min = java.lang.Math.min(i5, i4);
        if (this.orientation == com.qcwireless.qcwatch.ui.base.view.ColorPickerView.Orientation.HORIZONTAL) {
            if (i5 <= i4) {
                min = i5 / 6;
            }
        } else if (i5 >= i4) {
            min = i4 / 6;
        }
        int i6 = min / 9;
        this.mRadius = (i6 * 7) / 2;
        int i7 = (i6 * 3) / 2;
        if (this.orientation == com.qcwireless.qcwatch.ui.base.view.ColorPickerView.Orientation.HORIZONTAL) {
            int i8 = this.mLeft;
            int i9 = this.mRadius;
            i3 = i8 + i9;
            width = this.mRight - i9;
            i2 = (getHeight() / 2) - i7;
            i = (getHeight() / 2) + i7;
        } else {
            int i10 = this.mTop;
            int i11 = this.mRadius;
            int i12 = i10 + i11;
            i = this.mBottom - i11;
            int width2 = (getWidth() / 2) - i7;
            width = (getWidth() / 2) + i7;
            i2 = i12;
            i3 = width2;
        }
        this.rect.set(i3, i2, width, i);
    }

    public void setColors(int... colors) {
        this.linearGradient = null;
        this.colors = colors;
        if (this.orientation == com.qcwireless.qcwatch.ui.base.view.ColorPickerView.Orientation.HORIZONTAL) {
            this.linearGradient = new android.graphics.LinearGradient(this.rect.left, this.rect.top, this.rect.right, this.rect.top, colors, (float[]) null, android.graphics.Shader.TileMode.CLAMP);
        } else {
            this.linearGradient = new android.graphics.LinearGradient(this.rect.left, this.rect.top, this.rect.left, this.rect.bottom, colors, (float[]) null, android.graphics.Shader.TileMode.CLAMP);
        }
        this.needReDrawColorTable = true;
        invalidate();
    }

    public int[] createDefaultColorTable() {
        return new int[]{android.graphics.Color.rgb(255, 0, 0), android.graphics.Color.rgb(255, 255, 0), android.graphics.Color.rgb(0, 255, 0), android.graphics.Color.rgb(0, 255, 255), android.graphics.Color.rgb(0, 0, 255), android.graphics.Color.rgb(255, 0, 255), android.graphics.Color.rgb(255, 0, 0)};
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        if (this.needReDrawColorTable) {
            createColorTableBitmap();
        }
        canvas.drawBitmap(this.bitmapForColor, (android.graphics.Rect) null, this.rect, this.paint);
        this.paintForIndicator.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.color_FFFFFF));
        canvas.drawCircle(this.curX, this.curY, this.newRadius, this.paintForIndicator);
        this.paintForIndicator.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        canvas.drawCircle(this.curX, this.curY, this.newRadius - this.radius, this.paintForIndicator);
    }

    private void createColorTableBitmap() {
        int width;
        android.graphics.Canvas canvas = new android.graphics.Canvas(this.bitmapForColor);
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, this.bitmapForColor.getWidth(), this.bitmapForColor.getHeight());
        if (this.orientation == com.qcwireless.qcwatch.ui.base.view.ColorPickerView.Orientation.HORIZONTAL) {
            width = this.bitmapForColor.getHeight() / 2;
        } else {
            width = this.bitmapForColor.getWidth() / 2;
        }
        this.paint.setColor(-16777216);
        float f = width;
        canvas.drawRoundRect(rectF, f, f, this.paint);
        this.paint.setShader(this.linearGradient);
        canvas.drawRoundRect(rectF, f, f, this.paint);
        this.paint.setShader(null);
        this.needReDrawColorTable = false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();
        if (!inBoundOfColorTable(x, y)) {
            if (this.errorFlag) {
                this.errorFlag = false;
                if (this.colorPickerChangeListener != null) {
                    calcuColor();
                    this.colorPickerChangeListener.onColorChanged(this, this.currentColor);
                    this.colorPickerChangeListener.onErrorTouch(this);
                }
            }
            return true;
        }
        this.errorFlag = true;
        if (this.orientation == com.qcwireless.qcwatch.ui.base.view.ColorPickerView.Orientation.HORIZONTAL) {
            this.curX = x;
            this.curY = getHeight() / 2;
        } else {
            this.curX = getWidth() / 2;
            this.curY = y;
        }
        if (event.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            com.qcwireless.qcwatch.ui.base.view.ColorPickerView.OnColorPickerChangeListener onColorPickerChangeListener = this.colorPickerChangeListener;
            if (onColorPickerChangeListener != null) {
                onColorPickerChangeListener.onStartTrackingTouch(this);
                calcuColor();
                this.colorPickerChangeListener.onColorChanged(this, this.currentColor);
            }
        } else if (event.getAction() == 1) {
            com.qcwireless.qcwatch.ui.base.view.ColorPickerView.OnColorPickerChangeListener onColorPickerChangeListener2 = this.colorPickerChangeListener;
            if (onColorPickerChangeListener2 != null) {
                onColorPickerChangeListener2.onStopTrackingTouch(this);
                calcuColor();
                this.colorPickerChangeListener.onColorChanged(this, this.currentColor);
            }
        } else if (this.colorPickerChangeListener != null) {
            calcuColor();
            this.colorPickerChangeListener.onColorChanged(this, this.currentColor);
        }
        invalidate();
        return true;
    }

    public int getColor() {
        return calcuColor();
    }

    private boolean inBoundOfColorTable(int ex, int ey) {
        if (this.orientation == com.qcwireless.qcwatch.ui.base.view.ColorPickerView.Orientation.HORIZONTAL) {
            int i = this.mLeft;
            int i2 = this.mRadius;
            return ex > i + i2 && ex < this.mRight - i2;
        }
        int i3 = this.mTop;
        int i4 = this.mRadius;
        return ey > i3 + i4 && ey < this.mBottom - i4;
    }

    private int calcuColor() {
        int i;
        int i2;
        int i3 = 1;
        if (this.orientation == com.qcwireless.qcwatch.ui.base.view.ColorPickerView.Orientation.HORIZONTAL) {
            i2 = (this.rect.bottom - this.rect.top) / 2;
            if (this.curX >= this.rect.left) {
                if (this.curX > this.rect.right) {
                    i3 = this.bitmapForColor.getWidth() - 1;
                } else {
                    i3 = this.curX - this.rect.left;
                }
            }
        } else {
            int i4 = (this.rect.right - this.rect.left) / 2;
            if (this.curY < this.rect.top) {
                i3 = i4;
                i2 = 1;
            } else {
                if (this.curY > this.rect.bottom) {
                    i = this.bitmapForColor.getHeight() - 1;
                } else {
                    i = this.curY - this.rect.top;
                }
                int i5 = i;
                i3 = i4;
                i2 = i5;
            }
        }
        int pixelToColor = pixelToColor(this.bitmapForColor.getPixel(i3, i2));
        this.currentColor = pixelToColor;
        return pixelToColor;
    }

    private int pixelToColor(int pixel) {
        return android.graphics.Color.argb(android.graphics.Color.alpha(pixel), android.graphics.Color.red(pixel), android.graphics.Color.green(pixel), android.graphics.Color.blue(pixel));
    }

    public void setOnColorPickerChangeListener(com.qcwireless.qcwatch.ui.base.view.ColorPickerView.OnColorPickerChangeListener l) {
        this.colorPickerChangeListener = l;
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        com.qcwireless.qcwatch.ui.base.view.ColorPickerView.SavedState savedState = new com.qcwireless.qcwatch.ui.base.view.ColorPickerView.SavedState(super.onSaveInstanceState());
        savedState.selX = this.curX;
        savedState.selY = this.curY;
        savedState.color = this.bitmapForColor;
        if (this.mIndicatorEnable) {
            savedState.indicator = this.bitmapForIndicator;
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable state) {
        if (!(state instanceof com.qcwireless.qcwatch.ui.base.view.ColorPickerView.SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        com.qcwireless.qcwatch.ui.base.view.ColorPickerView.SavedState savedState = (com.qcwireless.qcwatch.ui.base.view.ColorPickerView.SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.curX = savedState.selX;
        this.curY = savedState.selY;
        this.colors = savedState.colors;
        this.bitmapForColor = savedState.color;
        if (this.mIndicatorEnable) {
            this.bitmapForIndicator = savedState.indicator;
            this.needReDrawIndicator = true;
        }
        this.needReDrawColorTable = true;
    }

    private class SavedState extends android.view.View.BaseSavedState {
        android.graphics.Bitmap color;
        int[] colors;
        android.graphics.Bitmap indicator;
        int selX;
        int selY;

        SavedState(android.os.Parcelable source) {
            super(source);
            this.indicator = null;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel out, int flags) {
            super.writeToParcel(out, flags);
            try {
                out.writeInt(this.selX);
                out.writeInt(this.selY);
                out.writeParcelable(this.color, flags);
                out.writeIntArray(this.colors);
                android.graphics.Bitmap bitmap = this.indicator;
                if (bitmap != null) {
                    out.writeParcelable(bitmap, flags);
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setPosition(int x, int y) {
        if (inBoundOfColorTable(x, y)) {
            this.curX = x;
            this.curY = y;
            if (this.mIndicatorEnable) {
                this.needReDrawIndicator = true;
            }
            invalidate();
        }
    }

    public void showDefaultColorTable() {
        setColors(createDefaultColorTable());
    }

    public int getIndicatorColor() {
        return this.mIndicatorColor;
    }

    public void setIndicatorColor(int color) {
        this.mIndicatorColor = color;
        this.needReDrawIndicator = true;
        invalidate();
    }

    public void setOrientation(com.qcwireless.qcwatch.ui.base.view.ColorPickerView.Orientation orientation) {
        this.orientation = orientation;
        this.needReDrawIndicator = true;
        this.needReDrawColorTable = true;
        requestLayout();
    }
}
