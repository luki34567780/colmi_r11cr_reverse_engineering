package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class BaseChartView extends android.view.View implements skin.support.widget.SkinCompatSupportable {
    protected android.animation.ValueAnimator animatorFingerIn;
    protected android.animation.ValueAnimator animatorFingerOut;
    protected android.graphics.Paint avgLinePaint;
    protected android.graphics.Paint ballPaint;
    protected float bezierHeight;
    protected android.graphics.Paint bezierPaint;
    protected android.graphics.Path bezierPath;
    private int bgColorId;
    protected int bottomOffset;
    protected float circleRadius;
    protected float circleRadiusMax;
    protected float circleRadiusMin;
    protected int clickX;
    protected int colorBall;
    protected int colorBgSelected;
    protected int colorLine;
    protected int colorValue;
    protected int colorValueSelected;
    protected android.content.Context context;
    private int dataLineColorId;
    protected java.text.DecimalFormat decimalFormat;
    protected int diameterDefault;
    protected float fingerX;
    protected float fingerXDefault;
    protected float fingerXMax;
    protected float fingerXmin;
    protected int height;
    private int lineColorId;
    protected int lineHeight;
    protected android.graphics.Paint linePaint;
    protected int mPaddingBottom;
    protected int mPaddingEnd;
    protected int mPaddingStart;
    protected int mPaddingTop;
    protected int offset;
    android.graphics.Path path;
    android.graphics.Path path1;
    protected int radius;
    protected float spaceToLine;
    protected android.graphics.Paint stepPaint;
    protected int textDownColor;
    private int textDownColorId;
    protected android.graphics.Paint textDownPaint;
    protected android.graphics.Paint textPaint;
    protected float textSelectedSize;
    protected float textSize;
    protected android.graphics.Paint txtSelectedBgPaint;
    protected int valueMax;
    protected int valueMin;
    protected int valueSelected;
    protected int width;

    public BaseChartView(android.content.Context context) {
        super(context);
        this.diameterDefault = 30;
        this.bezierHeight = 10.0f;
        this.circleRadiusMin = 8.0f;
        this.circleRadiusMax = 1.5f * 8.0f;
        this.circleRadius = 8.0f;
        this.spaceToLine = 10.0f;
        this.fingerXmin = 8.0f * 2.0f;
        this.textSelectedSize = 14.0f;
        this.textSize = 12.0f;
        this.offset = 80;
        this.bottomOffset = 50;
        this.radius = 24;
        this.path = new android.graphics.Path();
        this.path1 = new android.graphics.Path();
        initBase(context);
        initPublic(context, null);
    }

    public BaseChartView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.diameterDefault = 30;
        this.bezierHeight = 10.0f;
        this.circleRadiusMin = 8.0f;
        this.circleRadiusMax = 1.5f * 8.0f;
        this.circleRadius = 8.0f;
        this.spaceToLine = 10.0f;
        this.fingerXmin = 8.0f * 2.0f;
        this.textSelectedSize = 14.0f;
        this.textSize = 12.0f;
        this.offset = 80;
        this.bottomOffset = 50;
        this.radius = 24;
        this.path = new android.graphics.Path();
        this.path1 = new android.graphics.Path();
        initBase(context);
        initPublic(context, attrs);
    }

    public BaseChartView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.diameterDefault = 30;
        this.bezierHeight = 10.0f;
        this.circleRadiusMin = 8.0f;
        this.circleRadiusMax = 1.5f * 8.0f;
        this.circleRadius = 8.0f;
        this.spaceToLine = 10.0f;
        this.fingerXmin = 8.0f * 2.0f;
        this.textSelectedSize = 14.0f;
        this.textSize = 12.0f;
        this.offset = 80;
        this.bottomOffset = 50;
        this.radius = 24;
        this.path = new android.graphics.Path();
        this.path1 = new android.graphics.Path();
        initBase(context);
        initPublic(context, attrs);
    }

    public BaseChartView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.diameterDefault = 30;
        this.bezierHeight = 10.0f;
        this.circleRadiusMin = 8.0f;
        this.circleRadiusMax = 1.5f * 8.0f;
        this.circleRadius = 8.0f;
        this.spaceToLine = 10.0f;
        this.fingerXmin = 8.0f * 2.0f;
        this.textSelectedSize = 14.0f;
        this.textSize = 12.0f;
        this.offset = 80;
        this.bottomOffset = 50;
        this.radius = 24;
        this.path = new android.graphics.Path();
        this.path1 = new android.graphics.Path();
        initBase(context);
        initPublic(context, attrs);
    }

    private void initBase(android.content.Context context) {
        this.context = context;
        this.decimalFormat = new java.text.DecimalFormat("#");
        this.textSelectedSize = dp2px(context, 14.0f);
        this.textSize = dp2px(context, 12.0f);
        this.valueMax = 86400;
        int dp2px = (int) dp2px(context, 60.0f);
        this.offset = dp2px;
        this.valueMin = dp2px;
        this.colorValue = -16777216;
        this.colorLine = -16777216;
        this.colorBall = -16777216;
        this.colorValueSelected = -1;
        this.fingerX = 100.0f;
    }

    public void initPublic(android.content.Context context, android.util.AttributeSet attrs) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.qc_chart);
        this.textDownColorId = obtainStyledAttributes.getResourceId(8, 0);
        this.bgColorId = obtainStyledAttributes.getResourceId(3, 0);
        this.lineColorId = obtainStyledAttributes.getResourceId(2, 0);
        this.dataLineColorId = obtainStyledAttributes.getResourceId(4, 0);
        this.context = context;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.bezierPaint = paint;
        paint.setAntiAlias(true);
        this.bezierPaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.bezierPaint.setColor(this.colorLine);
        this.bezierPaint.setStrokeWidth(2.0f);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.stepPaint = paint2;
        paint2.setAntiAlias(true);
        this.stepPaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.stepPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.stepPaint.setColor(this.colorLine);
        this.stepPaint.setStrokeWidth(8.0f);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.textPaint = paint3;
        paint3.setAntiAlias(true);
        this.textPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.textPaint.setColor(this.colorValue);
        this.textPaint.setStrokeWidth(2.0f);
        this.textPaint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, 0));
        this.textPaint.setTextSize(this.textSelectedSize);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.avgLinePaint = paint4;
        paint4.setAntiAlias(true);
        this.avgLinePaint.setStyle(android.graphics.Paint.Style.FILL);
        this.avgLinePaint.setColor(this.textDownColor);
        this.avgLinePaint.setStrokeWidth(1.5f);
        this.avgLinePaint.setTextSize(this.textSelectedSize);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.linePaint = paint5;
        paint5.setAntiAlias(true);
        this.linePaint.setStyle(android.graphics.Paint.Style.FILL);
        this.linePaint.setColor(this.colorValue);
        this.linePaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.linePaint.setStrokeWidth(2.0f);
        this.linePaint.setTextSize(this.textSelectedSize);
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.txtSelectedBgPaint = paint6;
        paint6.setAntiAlias(true);
        this.txtSelectedBgPaint.setColor(this.colorBgSelected);
        this.txtSelectedBgPaint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint7 = new android.graphics.Paint();
        this.textDownPaint = paint7;
        paint7.setAntiAlias(true);
        this.textDownPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.textDownPaint.setColor(this.colorValue);
        this.textDownPaint.setStrokeWidth(2.0f);
        this.textDownPaint.setTextSize(dp2px(context, 10.0f));
        android.graphics.Paint paint8 = new android.graphics.Paint();
        this.ballPaint = paint8;
        paint8.setAntiAlias(true);
        this.ballPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.ballPaint.setColor(this.colorBall);
        android.graphics.Path path = new android.graphics.Path();
        this.bezierPath = path;
        this.fingerXDefault = 200.0f;
        path.moveTo(this.fingerX, 100.0f);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animatorFingerIn = ofFloat;
        ofFloat.setDuration(200L);
        this.animatorFingerIn.setInterpolator(new android.view.animation.LinearInterpolator());
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        this.animatorFingerOut = ofFloat2;
        ofFloat2.setDuration(200L);
        this.animatorFingerOut.setInterpolator(new android.view.animation.LinearInterpolator());
        this.animatorFingerIn.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.qcwireless.qcwatch.ui.base.view.BaseChartView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator animation) {
                float floatValue = ((java.lang.Float) animation.getAnimatedValue()).floatValue();
                com.qcwireless.qcwatch.ui.base.view.BaseChartView.this.txtSelectedBgPaint.setAlpha((int) ((floatValue - 0.15f) * 255.0f));
                if (floatValue >= 0.95f) {
                    com.qcwireless.qcwatch.ui.base.view.BaseChartView.this.textPaint.setColor(com.qcwireless.qcwatch.ui.base.view.BaseChartView.this.colorValueSelected);
                } else {
                    com.qcwireless.qcwatch.ui.base.view.BaseChartView.this.textPaint.setColor(com.qcwireless.qcwatch.ui.base.view.BaseChartView.this.colorValue);
                }
                com.qcwireless.qcwatch.ui.base.view.BaseChartView baseChartView = com.qcwireless.qcwatch.ui.base.view.BaseChartView.this;
                baseChartView.bezierHeight = baseChartView.circleRadiusMax * 1.5f * floatValue;
                com.qcwireless.qcwatch.ui.base.view.BaseChartView baseChartView2 = com.qcwireless.qcwatch.ui.base.view.BaseChartView.this;
                baseChartView2.circleRadius = baseChartView2.circleRadiusMin + ((com.qcwireless.qcwatch.ui.base.view.BaseChartView.this.circleRadiusMax - com.qcwireless.qcwatch.ui.base.view.BaseChartView.this.circleRadiusMin) * floatValue);
                com.qcwireless.qcwatch.ui.base.view.BaseChartView baseChartView3 = com.qcwireless.qcwatch.ui.base.view.BaseChartView.this;
                baseChartView3.spaceToLine = baseChartView3.circleRadiusMin * 2.0f * (1.0f - floatValue);
                com.qcwireless.qcwatch.ui.base.view.BaseChartView.this.postInvalidate();
            }
        });
        this.animatorFingerOut.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.qcwireless.qcwatch.ui.base.view.BaseChartView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator animation) {
                float floatValue = ((java.lang.Float) animation.getAnimatedValue()).floatValue();
                com.qcwireless.qcwatch.ui.base.view.BaseChartView.this.txtSelectedBgPaint.setAlpha((int) ((floatValue - 0.15f) * 255.0f));
                if (floatValue >= 0.95f) {
                    com.qcwireless.qcwatch.ui.base.view.BaseChartView.this.textPaint.setColor(com.qcwireless.qcwatch.ui.base.view.BaseChartView.this.colorValueSelected);
                } else {
                    com.qcwireless.qcwatch.ui.base.view.BaseChartView.this.textPaint.setColor(com.qcwireless.qcwatch.ui.base.view.BaseChartView.this.colorValue);
                }
                com.qcwireless.qcwatch.ui.base.view.BaseChartView baseChartView = com.qcwireless.qcwatch.ui.base.view.BaseChartView.this;
                baseChartView.bezierHeight = baseChartView.circleRadiusMax * 1.5f * floatValue;
                com.qcwireless.qcwatch.ui.base.view.BaseChartView baseChartView2 = com.qcwireless.qcwatch.ui.base.view.BaseChartView.this;
                baseChartView2.circleRadius = baseChartView2.circleRadiusMin + ((com.qcwireless.qcwatch.ui.base.view.BaseChartView.this.circleRadiusMax - com.qcwireless.qcwatch.ui.base.view.BaseChartView.this.circleRadiusMin) * floatValue);
                com.qcwireless.qcwatch.ui.base.view.BaseChartView baseChartView3 = com.qcwireless.qcwatch.ui.base.view.BaseChartView.this;
                baseChartView3.spaceToLine = baseChartView3.circleRadiusMin * 2.0f * (1.0f - floatValue);
                com.qcwireless.qcwatch.ui.base.view.BaseChartView.this.postInvalidate();
            }
        });
        this.circleRadius = dp2px(context, 8.0f);
        float dp2px = dp2px(context, 8.0f);
        this.circleRadiusMin = dp2px;
        this.circleRadiusMax = dp2px * 1.2f;
        applyTextColor();
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.mPaddingStart = getPaddingStart();
        this.mPaddingEnd = getPaddingEnd();
        this.mPaddingTop = getPaddingTop();
        this.mPaddingBottom = getPaddingBottom();
        this.bezierHeight = 0.0f;
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        float f = this.circleRadiusMax;
        this.bezierHeight = (f * 1.0f) + 5.0f;
        float f2 = this.circleRadiusMin;
        this.circleRadius = (f - f2) + f2;
        this.spaceToLine = f2 * 2.0f;
        this.bezierPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.path.reset();
        this.path1.reset();
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, this.lineHeight, this.radius * 2, 0.0f);
        android.graphics.RectF rectF2 = new android.graphics.RectF(r5 - (this.radius * 2), 0.0f, this.width, this.lineHeight);
        android.graphics.Path path = this.path;
        int i = this.radius;
        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i}, android.graphics.Path.Direction.CW);
        canvas.drawPath(this.path, this.bezierPaint);
        android.graphics.Path path2 = this.path1;
        int i2 = this.radius;
        path2.addRoundRect(rectF2, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2}, android.graphics.Path.Direction.CW);
        canvas.drawPath(this.path1, this.bezierPaint);
        this.bezierPath.reset();
        this.bezierPath.moveTo(this.radius, 0.0f);
        this.bezierPath.lineTo(this.radius, this.lineHeight);
        this.bezierPath.lineTo(this.fingerX - ((this.circleRadiusMax * 1.1f) * 3.0f), this.lineHeight);
        android.graphics.Path path3 = this.bezierPath;
        float f3 = this.fingerX;
        float f4 = this.circleRadiusMax;
        int i3 = this.lineHeight;
        float f5 = this.bezierHeight;
        path3.cubicTo(f3 - (f4 * 1.1f), i3, f3 - ((f4 * 1.1f) * 1.0f), i3 - f5, f3, i3 - f5);
        this.bezierPath.moveTo(this.fingerX, this.lineHeight - this.bezierHeight);
        android.graphics.Path path4 = this.bezierPath;
        float f6 = this.fingerX;
        float f7 = this.circleRadiusMax;
        int i4 = this.lineHeight;
        path4.cubicTo(f6 + (f7 * 1.1f), i4 - this.bezierHeight, f6 + (f7 * 1.1f), i4, f6 + (f7 * 1.1f * 3.0f), i4);
        this.bezierPath.lineTo(this.width - this.radius, this.lineHeight);
        this.bezierPath.lineTo(this.width - this.radius, 0.0f);
        this.bezierPath.lineTo(this.radius, 0.0f);
        this.bezierPath.close();
        this.bezierPaint.setStyle(android.graphics.Paint.Style.FILL);
        canvas.drawPath(this.bezierPath, this.bezierPaint);
        canvas.drawCircle(this.fingerX, this.lineHeight + 5, this.circleRadius, this.ballPaint);
    }

    public int getMySize(int defaultSize, int measureSpec) {
        int mode = android.view.View.MeasureSpec.getMode(measureSpec);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? android.view.View.MeasureSpec.getSize(measureSpec) : defaultSize;
    }

    public float px2dp(android.content.Context context, float px) {
        return (px / context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public float dp2px(android.content.Context context, float dp) {
        return (dp * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public float getTextWidth(android.graphics.Paint paint, java.lang.String str) {
        float f = 0.0f;
        if (str != null && str.length() > 0) {
            int length = str.length();
            paint.getTextWidths(str, new float[length]);
            for (int i = 0; i < length; i++) {
                f += (float) java.lang.Math.ceil(r2[i]);
            }
        }
        return f;
    }

    public float getTextHeight(android.graphics.Paint paint, java.lang.String str) {
        paint.getTextBounds(str, 0, str.length(), new android.graphics.Rect());
        return r0.height();
    }

    public void setValueMax(int valueMax) {
        this.valueMax = valueMax;
    }

    public void setValueMin(int valueMin) {
        this.valueMin = valueMin;
    }

    public int getValueMax() {
        return this.valueMax;
    }

    public int getValueMin() {
        return this.valueMin;
    }

    public int getColorValue() {
        return this.colorValue;
    }

    public void setColorValue(int colorValue) {
        this.colorValue = colorValue;
        this.textDownPaint.setColor(colorValue);
    }

    public int getColorValueSelected() {
        return this.colorValueSelected;
    }

    public void setColorValueSelected(int colorValueSelected) {
        this.colorValueSelected = colorValueSelected;
        this.textPaint.setColor(this.colorValue);
    }

    public int getColorLine() {
        return this.colorLine;
    }

    public void setColorLine(int colorLine) {
        this.colorLine = colorLine;
        this.bezierPaint.setColor(colorLine);
    }

    public int getColorBall() {
        return this.colorBall;
    }

    public void setColorBgSelected(int colorBgSelected) {
        this.colorBgSelected = colorBgSelected;
        this.txtSelectedBgPaint.setColor(colorBgSelected);
    }

    public void setColorBall(int colorBall) {
        this.colorBall = colorBall;
        this.ballPaint.setColor(colorBall);
    }

    public int getValueSelected() {
        return this.valueSelected;
    }

    private void applyTextColor() {
        int checkResourceId = skin.support.widget.SkinCompatHelper.checkResourceId(this.textDownColorId);
        if (checkResourceId != 0) {
            this.textDownPaint.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, checkResourceId));
        }
        int checkResourceId2 = skin.support.widget.SkinCompatHelper.checkResourceId(this.bgColorId);
        if (checkResourceId2 != 0) {
            int color = skin.support.content.res.SkinCompatResources.getColor(this.context, checkResourceId2);
            this.txtSelectedBgPaint.setColor(color);
            this.bezierPaint.setColor(color);
        }
        int checkResourceId3 = skin.support.widget.SkinCompatHelper.checkResourceId(this.lineColorId);
        if (checkResourceId3 != 0) {
            this.avgLinePaint.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, checkResourceId3));
        }
        int checkResourceId4 = skin.support.widget.SkinCompatHelper.checkResourceId(this.dataLineColorId);
        if (checkResourceId4 != 0) {
            this.stepPaint.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, checkResourceId4));
        }
    }

    public java.lang.Integer getNumberThree(int[] intarray, java.lang.Integer number) {
        int abs = java.lang.Math.abs(number.intValue() - intarray[0]);
        int i = intarray[0];
        for (int i2 : intarray) {
            int abs2 = java.lang.Math.abs(number.intValue() - i2);
            if (abs2 <= abs) {
                i = i2;
                abs = abs2;
            }
        }
        return java.lang.Integer.valueOf(i);
    }

    public void applySkin() {
        applyTextColor();
    }

    public class XTextChange {
        public java.lang.String label;
        public int max;
        public int min;
        public float x;
        public float y;

        public XTextChange() {
        }

        public int getMin() {
            return this.min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return this.max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public java.lang.String getLabel() {
            return this.label;
        }

        public void setLabel(java.lang.String label) {
            this.label = label;
        }

        public float getX() {
            return this.x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return this.y;
        }

        public void setY(float y) {
            this.y = y;
        }
    }
}
