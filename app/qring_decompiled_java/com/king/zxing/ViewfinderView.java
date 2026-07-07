package com.king.zxing;

/* loaded from: /tmp/dex/classes2.dex */
public class ViewfinderView extends android.view.View {
    private static final int CURRENT_POINT_OPACITY = 160;
    private static final int MAX_RESULT_POINTS = 20;
    private static final int POINT_SIZE = 30;
    private int cornerColor;
    private int cornerRectHeight;
    private int cornerRectWidth;
    private android.graphics.Rect frame;
    private int frameColor;
    private com.king.zxing.ViewfinderView.FrameGravity frameGravity;
    private int frameHeight;
    private int frameLineWidth;
    private float framePaddingBottom;
    private float framePaddingLeft;
    private float framePaddingRight;
    private float framePaddingTop;
    private float frameRatio;
    private int frameWidth;
    private int gridColumn;
    private int gridHeight;
    private java.lang.String labelText;
    private int labelTextColor;
    private com.king.zxing.ViewfinderView.TextLocation labelTextLocation;
    private float labelTextPadding;
    private float labelTextSize;
    private int labelTextWidth;
    private int laserColor;
    private com.king.zxing.ViewfinderView.LaserStyle laserStyle;
    private int maskColor;
    private android.graphics.Paint paint;
    private android.graphics.Point point;
    private int pointColor;
    private float pointRadius;
    private int pointStrokeColor;
    private float pointStrokeRatio;
    private int scannerAnimationDelay;
    public int scannerEnd;
    private int scannerLineHeight;
    private int scannerLineMoveDistance;
    public int scannerStart;
    private android.text.TextPaint textPaint;

    public enum LaserStyle {
        NONE(0),
        LINE(1),
        GRID(2);

        private int mValue;

        LaserStyle(int i) {
            this.mValue = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.king.zxing.ViewfinderView.LaserStyle getFromInt(int i) {
            for (com.king.zxing.ViewfinderView.LaserStyle laserStyle : values()) {
                if (laserStyle.mValue == i) {
                    return laserStyle;
                }
            }
            return LINE;
        }
    }

    public enum TextLocation {
        TOP(0),
        BOTTOM(1);

        private int mValue;

        TextLocation(int i) {
            this.mValue = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.king.zxing.ViewfinderView.TextLocation getFromInt(int i) {
            for (com.king.zxing.ViewfinderView.TextLocation textLocation : values()) {
                if (textLocation.mValue == i) {
                    return textLocation;
                }
            }
            return TOP;
        }
    }

    public enum FrameGravity {
        CENTER(0),
        LEFT(1),
        TOP(2),
        RIGHT(3),
        BOTTOM(4);

        private int mValue;

        FrameGravity(int i) {
            this.mValue = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.king.zxing.ViewfinderView.FrameGravity getFromInt(int i) {
            for (com.king.zxing.ViewfinderView.FrameGravity frameGravity : values()) {
                if (frameGravity.mValue == i) {
                    return frameGravity;
                }
            }
            return CENTER;
        }
    }

    public ViewfinderView(android.content.Context context) {
        this(context, null);
    }

    public ViewfinderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewfinderView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.scannerStart = 0;
        this.scannerEnd = 0;
        this.pointStrokeRatio = 1.2f;
        init(context, attributeSet);
    }

    private void init(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.king.zxing.R.styleable.ViewfinderView);
        this.maskColor = obtainStyledAttributes.getColor(com.king.zxing.R.styleable.ViewfinderView_maskColor, androidx.core.content.ContextCompat.getColor(context, com.king.zxing.R.color.viewfinder_mask));
        this.frameColor = obtainStyledAttributes.getColor(com.king.zxing.R.styleable.ViewfinderView_frameColor, androidx.core.content.ContextCompat.getColor(context, com.king.zxing.R.color.viewfinder_frame));
        this.cornerColor = obtainStyledAttributes.getColor(com.king.zxing.R.styleable.ViewfinderView_cornerColor, androidx.core.content.ContextCompat.getColor(context, com.king.zxing.R.color.viewfinder_corner));
        this.laserColor = obtainStyledAttributes.getColor(com.king.zxing.R.styleable.ViewfinderView_laserColor, androidx.core.content.ContextCompat.getColor(context, com.king.zxing.R.color.viewfinder_laser));
        this.labelText = obtainStyledAttributes.getString(com.king.zxing.R.styleable.ViewfinderView_labelText);
        this.labelTextColor = obtainStyledAttributes.getColor(com.king.zxing.R.styleable.ViewfinderView_labelTextColor, androidx.core.content.ContextCompat.getColor(context, com.king.zxing.R.color.viewfinder_text_color));
        this.labelTextSize = obtainStyledAttributes.getDimension(com.king.zxing.R.styleable.ViewfinderView_labelTextSize, android.util.TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics()));
        this.labelTextPadding = obtainStyledAttributes.getDimension(com.king.zxing.R.styleable.ViewfinderView_labelTextPadding, android.util.TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()));
        this.labelTextWidth = obtainStyledAttributes.getDimensionPixelSize(com.king.zxing.R.styleable.ViewfinderView_labelTextWidth, 0);
        this.labelTextLocation = com.king.zxing.ViewfinderView.TextLocation.getFromInt(obtainStyledAttributes.getInt(com.king.zxing.R.styleable.ViewfinderView_labelTextLocation, 0));
        this.frameWidth = obtainStyledAttributes.getDimensionPixelSize(com.king.zxing.R.styleable.ViewfinderView_frameWidth, 0);
        this.frameHeight = obtainStyledAttributes.getDimensionPixelSize(com.king.zxing.R.styleable.ViewfinderView_frameHeight, 0);
        this.laserStyle = com.king.zxing.ViewfinderView.LaserStyle.getFromInt(obtainStyledAttributes.getInt(com.king.zxing.R.styleable.ViewfinderView_laserStyle, com.king.zxing.ViewfinderView.LaserStyle.LINE.mValue));
        this.gridColumn = obtainStyledAttributes.getInt(com.king.zxing.R.styleable.ViewfinderView_gridColumn, 20);
        this.gridHeight = (int) obtainStyledAttributes.getDimension(com.king.zxing.R.styleable.ViewfinderView_gridHeight, android.util.TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics()));
        this.cornerRectWidth = (int) obtainStyledAttributes.getDimension(com.king.zxing.R.styleable.ViewfinderView_cornerRectWidth, android.util.TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
        this.cornerRectHeight = (int) obtainStyledAttributes.getDimension(com.king.zxing.R.styleable.ViewfinderView_cornerRectHeight, android.util.TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        this.scannerLineMoveDistance = (int) obtainStyledAttributes.getDimension(com.king.zxing.R.styleable.ViewfinderView_scannerLineMoveDistance, android.util.TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        this.scannerLineHeight = (int) obtainStyledAttributes.getDimension(com.king.zxing.R.styleable.ViewfinderView_scannerLineHeight, android.util.TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()));
        this.frameLineWidth = (int) obtainStyledAttributes.getDimension(com.king.zxing.R.styleable.ViewfinderView_frameLineWidth, android.util.TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics()));
        this.scannerAnimationDelay = obtainStyledAttributes.getInteger(com.king.zxing.R.styleable.ViewfinderView_scannerAnimationDelay, 20);
        this.frameRatio = obtainStyledAttributes.getFloat(com.king.zxing.R.styleable.ViewfinderView_frameRatio, 0.625f);
        this.framePaddingLeft = obtainStyledAttributes.getDimension(com.king.zxing.R.styleable.ViewfinderView_framePaddingLeft, 0.0f);
        this.framePaddingTop = obtainStyledAttributes.getDimension(com.king.zxing.R.styleable.ViewfinderView_framePaddingTop, 0.0f);
        this.framePaddingRight = obtainStyledAttributes.getDimension(com.king.zxing.R.styleable.ViewfinderView_framePaddingRight, 0.0f);
        this.framePaddingBottom = obtainStyledAttributes.getDimension(com.king.zxing.R.styleable.ViewfinderView_framePaddingBottom, 0.0f);
        this.frameGravity = com.king.zxing.ViewfinderView.FrameGravity.getFromInt(obtainStyledAttributes.getInt(com.king.zxing.R.styleable.ViewfinderView_frameGravity, com.king.zxing.ViewfinderView.FrameGravity.CENTER.mValue));
        obtainStyledAttributes.recycle();
        this.pointColor = this.laserColor;
        this.pointStrokeColor = -1;
        this.pointRadius = android.util.TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        this.paint = new android.graphics.Paint(1);
        this.textPaint = new android.text.TextPaint(1);
    }

    private android.util.DisplayMetrics getDisplayMetrics() {
        return getResources().getDisplayMetrics();
    }

    public void setLabelText(java.lang.String str) {
        this.labelText = str;
    }

    public void setLabelTextColor(int i) {
        this.labelTextColor = i;
    }

    public void setLabelTextColorResource(int i) {
        this.labelTextColor = androidx.core.content.ContextCompat.getColor(getContext(), i);
    }

    public void setLabelTextSize(float f) {
        this.labelTextSize = f;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        initFrame(i, i2);
    }

    private void initFrame(int i, int i2) {
        int min = (int) (java.lang.Math.min(i, i2) * this.frameRatio);
        int i3 = this.frameWidth;
        if (i3 <= 0 || i3 > i) {
            this.frameWidth = min;
        }
        int i4 = this.frameHeight;
        if (i4 <= 0 || i4 > i2) {
            this.frameHeight = min;
        }
        if (this.labelTextWidth <= 0) {
            this.labelTextWidth = (i - getPaddingLeft()) - getPaddingRight();
        }
        float f = (((i - this.frameWidth) / 2) + this.framePaddingLeft) - this.framePaddingRight;
        float f2 = (((i2 - this.frameHeight) / 2) + this.framePaddingTop) - this.framePaddingBottom;
        int i5 = com.king.zxing.ViewfinderView.AnonymousClass1.$SwitchMap$com$king$zxing$ViewfinderView$FrameGravity[this.frameGravity.ordinal()];
        if (i5 == 1) {
            f = this.framePaddingLeft;
        } else if (i5 == 2) {
            f2 = this.framePaddingTop;
        } else if (i5 == 3) {
            f = (i - this.frameWidth) + this.framePaddingRight;
        } else if (i5 == 4) {
            f2 = (i2 - this.frameHeight) + this.framePaddingBottom;
        }
        int i6 = (int) f;
        int i7 = (int) f2;
        this.frame = new android.graphics.Rect(i6, i7, this.frameWidth + i6, this.frameHeight + i7);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Rect rect = this.frame;
        if (rect == null) {
            return;
        }
        if (this.scannerStart == 0 || this.scannerEnd == 0) {
            this.scannerStart = rect.top;
            this.scannerEnd = this.frame.bottom - this.scannerLineHeight;
        }
        drawExterior(canvas, this.frame, canvas.getWidth(), canvas.getHeight());
        drawLaserScanner(canvas, this.frame);
        drawFrame(canvas, this.frame);
        drawCorner(canvas, this.frame);
        drawTextInfo(canvas, this.frame);
        postInvalidateDelayed(this.scannerAnimationDelay, this.frame.left, this.frame.top, this.frame.right, this.frame.bottom);
    }

    private void drawTextInfo(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        if (android.text.TextUtils.isEmpty(this.labelText)) {
            return;
        }
        this.textPaint.setColor(this.labelTextColor);
        this.textPaint.setTextSize(this.labelTextSize);
        this.textPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(this.labelText, this.textPaint, this.labelTextWidth, android.text.Layout.Alignment.ALIGN_NORMAL, 1.2f, 0.0f, true);
        if (this.labelTextLocation == com.king.zxing.ViewfinderView.TextLocation.BOTTOM) {
            canvas.translate(rect.left + (rect.width() / 2), rect.bottom + this.labelTextPadding);
        } else {
            canvas.translate(rect.left + (rect.width() / 2), (rect.top - this.labelTextPadding) - staticLayout.getHeight());
        }
        staticLayout.draw(canvas);
    }

    private void drawCorner(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        this.paint.setColor(this.cornerColor);
        canvas.drawRect(rect.left, rect.top, rect.left + this.cornerRectWidth, rect.top + this.cornerRectHeight, this.paint);
        canvas.drawRect(rect.left, rect.top, rect.left + this.cornerRectHeight, rect.top + this.cornerRectWidth, this.paint);
        canvas.drawRect(rect.right - this.cornerRectWidth, rect.top, rect.right, rect.top + this.cornerRectHeight, this.paint);
        canvas.drawRect(rect.right - this.cornerRectHeight, rect.top, rect.right, rect.top + this.cornerRectWidth, this.paint);
        canvas.drawRect(rect.left, rect.bottom - this.cornerRectWidth, rect.left + this.cornerRectHeight, rect.bottom, this.paint);
        canvas.drawRect(rect.left, rect.bottom - this.cornerRectHeight, rect.left + this.cornerRectWidth, rect.bottom, this.paint);
        canvas.drawRect(rect.right - this.cornerRectWidth, rect.bottom - this.cornerRectHeight, rect.right, rect.bottom, this.paint);
        canvas.drawRect(rect.right - this.cornerRectHeight, rect.bottom - this.cornerRectWidth, rect.right, rect.bottom, this.paint);
    }

    private void drawLaserScanner(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        if (this.laserStyle != null) {
            this.paint.setColor(this.laserColor);
            int i = com.king.zxing.ViewfinderView.AnonymousClass1.$SwitchMap$com$king$zxing$ViewfinderView$LaserStyle[this.laserStyle.ordinal()];
            if (i == 1) {
                drawLineScanner(canvas, rect);
            } else if (i == 2) {
                drawGridScanner(canvas, rect);
            }
            this.paint.setShader(null);
        }
    }

    /* renamed from: com.king.zxing.ViewfinderView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$king$zxing$ViewfinderView$FrameGravity;
        static final /* synthetic */ int[] $SwitchMap$com$king$zxing$ViewfinderView$LaserStyle;

        static {
            int[] iArr = new int[com.king.zxing.ViewfinderView.LaserStyle.values().length];
            $SwitchMap$com$king$zxing$ViewfinderView$LaserStyle = iArr;
            try {
                iArr[com.king.zxing.ViewfinderView.LaserStyle.LINE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$king$zxing$ViewfinderView$LaserStyle[com.king.zxing.ViewfinderView.LaserStyle.GRID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.king.zxing.ViewfinderView.FrameGravity.values().length];
            $SwitchMap$com$king$zxing$ViewfinderView$FrameGravity = iArr2;
            try {
                iArr2[com.king.zxing.ViewfinderView.FrameGravity.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$king$zxing$ViewfinderView$FrameGravity[com.king.zxing.ViewfinderView.FrameGravity.TOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$king$zxing$ViewfinderView$FrameGravity[com.king.zxing.ViewfinderView.FrameGravity.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$king$zxing$ViewfinderView$FrameGravity[com.king.zxing.ViewfinderView.FrameGravity.BOTTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    private void drawLineScanner(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        this.paint.setShader(new android.graphics.LinearGradient(rect.left, this.scannerStart, rect.left, this.scannerStart + this.scannerLineHeight, shadeColor(this.laserColor), this.laserColor, android.graphics.Shader.TileMode.MIRROR));
        if (this.scannerStart <= this.scannerEnd) {
            float f = rect.left + (this.scannerLineHeight * 2);
            float f2 = this.scannerStart;
            int i = rect.right;
            int i2 = this.scannerLineHeight;
            canvas.drawOval(new android.graphics.RectF(f, f2, i - (i2 * 2), this.scannerStart + i2), this.paint);
            this.scannerStart += this.scannerLineMoveDistance;
            return;
        }
        this.scannerStart = rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        if (r0 > r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099 A[LOOP:1: B:16:0x0092->B:18:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4 A[EDGE_INSN: B:19:0x00b4->B:20:0x00b4 BREAK  A[LOOP:1: B:16:0x0092->B:18:0x0099], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0064 A[LOOP:0: B:7:0x0060->B:9:0x0064, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void drawGridScanner(android.graphics.Canvas r14, android.graphics.Rect r15) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.king.zxing.ViewfinderView.drawGridScanner(android.graphics.Canvas, android.graphics.Rect):void");
    }

    public int shadeColor(int i) {
        return java.lang.Integer.valueOf("01" + java.lang.Integer.toHexString(i).substring(2), 16).intValue();
    }

    private void drawFrame(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        this.paint.setColor(this.frameColor);
        canvas.drawRect(rect.left, rect.top, rect.right, rect.top + this.frameLineWidth, this.paint);
        canvas.drawRect(rect.left, rect.top, rect.left + this.frameLineWidth, rect.bottom, this.paint);
        canvas.drawRect(rect.right - this.frameLineWidth, rect.top, rect.right, rect.bottom, this.paint);
        canvas.drawRect(rect.left, rect.bottom - this.frameLineWidth, rect.right, rect.bottom, this.paint);
    }

    private void drawExterior(android.graphics.Canvas canvas, android.graphics.Rect rect, int i, int i2) {
        int i3 = this.maskColor;
        if (i3 != 0) {
            this.paint.setColor(i3);
            float f = i;
            canvas.drawRect(0.0f, 0.0f, f, rect.top, this.paint);
            canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom, this.paint);
            canvas.drawRect(rect.right, rect.top, f, rect.bottom, this.paint);
            canvas.drawRect(0.0f, rect.bottom, f, i2, this.paint);
        }
    }

    public void drawViewfinder() {
        invalidate();
    }

    public void setLaserStyle(com.king.zxing.ViewfinderView.LaserStyle laserStyle) {
        this.laserStyle = laserStyle;
    }
}
