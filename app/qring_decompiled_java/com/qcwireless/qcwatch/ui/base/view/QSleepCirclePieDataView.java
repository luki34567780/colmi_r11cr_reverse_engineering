package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QSleepCirclePieDataView extends android.view.View {
    private int a;
    private android.graphics.Paint awakePaint;
    private android.content.Context context;
    private android.graphics.Paint deepPaint;
    private int height;
    private android.graphics.Paint lightPaint;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieDataView.CakeValue> mPieItems;
    private int mSweep;
    private int pieCenterX;
    private int pieCenterY;
    private android.graphics.RectF pieOval;
    private android.graphics.RectF pieOvalIn;
    private android.graphics.RectF pieOvalLine;
    private android.graphics.RectF pieOvalLineIn;
    private android.graphics.Paint piePaint;
    private android.graphics.Paint piePaintIn;
    private android.graphics.Paint piePaintLine;
    private int pieRadius;
    private int sweep;
    private float totalValue;
    private int width;

    public QSleepCirclePieDataView(android.content.Context context) {
        super(context);
        this.a = 0;
        this.mSweep = 0;
        this.sweep = 0;
        this.context = context;
        init(context);
    }

    public QSleepCirclePieDataView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.a = 0;
        this.mSweep = 0;
        this.sweep = 0;
        this.context = context;
        init(context);
    }

    public QSleepCirclePieDataView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.a = 0;
        this.mSweep = 0;
        this.sweep = 0;
        this.context = context;
        init(context);
    }

    public QSleepCirclePieDataView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.a = 0;
        this.mSweep = 0;
        this.sweep = 0;
        this.context = context;
        init(context);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.width = getMySize((int) dp2px(this.context, 150.0f), widthMeasureSpec);
        if (getLayoutParams().height == -2) {
            this.height = (int) dp2px(this.context, 150.0f);
        } else {
            this.height = getMySize((int) dp2px(this.context, 150.0f), heightMeasureSpec);
        }
        setMeasuredDimension(this.width, this.height);
        init(this.context);
    }

    private void init(android.content.Context context) {
        int dp2px = (int) dp2px(context, 20.0f);
        int dp2px2 = (int) dp2px(context, 5.0f);
        this.pieRadius = (int) dp2px(context, 40.0f);
        int dp2px3 = (int) dp2px(context, 40.0f);
        this.pieCenterX = this.width / 2;
        this.pieCenterY = this.height / 2;
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.pieOval = rectF;
        rectF.left = this.pieCenterX - this.pieRadius;
        this.pieOval.top = this.pieCenterY - this.pieRadius;
        this.pieOval.right = this.pieCenterX + this.pieRadius;
        this.pieOval.bottom = this.pieCenterY + this.pieRadius;
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        this.pieOvalLineIn = rectF2;
        rectF2.left = (this.pieCenterX - this.pieRadius) + dp2px2;
        this.pieOvalLineIn.top = (this.pieCenterY - this.pieRadius) + dp2px2;
        this.pieOvalLineIn.right = (this.pieCenterX + this.pieRadius) - dp2px2;
        this.pieOvalLineIn.bottom = (this.pieCenterY + this.pieRadius) - dp2px2;
        android.graphics.RectF rectF3 = new android.graphics.RectF();
        this.pieOvalLine = rectF3;
        rectF3.left = this.pieCenterX - dp2px3;
        this.pieOvalLine.top = this.pieCenterY - dp2px3;
        this.pieOvalLine.right = this.pieCenterX + dp2px3;
        this.pieOvalLine.bottom = this.pieCenterY + dp2px3;
        android.graphics.RectF rectF4 = new android.graphics.RectF();
        this.pieOvalIn = rectF4;
        float f = dp2px;
        rectF4.left = this.pieOval.left + f;
        this.pieOvalIn.top = this.pieOval.top + f;
        this.pieOvalIn.right = this.pieOval.right - f;
        this.pieOvalIn.bottom = this.pieOval.bottom - f;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.piePaint = paint;
        paint.setAntiAlias(true);
        this.piePaint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.piePaintIn = paint2;
        paint2.setAntiAlias(true);
        this.piePaintIn.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.piePaintLine = paint3;
        paint3.setAntiAlias(true);
        this.piePaintLine.setStyle(android.graphics.Paint.Style.STROKE);
        this.piePaintLine.setStrokeWidth(3.0f);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.awakePaint = paint4;
        paint4.setAntiAlias(true);
        this.awakePaint.setStyle(android.graphics.Paint.Style.FILL);
        this.awakePaint.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.pubu_sleep_1));
        this.awakePaint.setStrokeWidth(2.0f);
        this.awakePaint.setTextSize(dp2px(context, 10.0f));
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.lightPaint = paint5;
        paint5.setAntiAlias(true);
        this.lightPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.lightPaint.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.pubu_sleep_2));
        this.lightPaint.setStrokeWidth(2.0f);
        this.lightPaint.setTextSize(dp2px(context, 10.0f));
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.deepPaint = paint6;
        paint6.setAntiAlias(true);
        this.deepPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.deepPaint.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.pubu_sleep_3));
        this.deepPaint.setStrokeWidth(2.0f);
        this.deepPaint.setTextSize(dp2px(context, 10.0f));
    }

    public int getMySize(int defaultSize, int measureSpec) {
        int mode = android.view.View.MeasureSpec.getMode(measureSpec);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? android.view.View.MeasureSpec.getSize(measureSpec) : defaultSize;
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieDataView.CakeValue> list = this.mPieItems;
        if (list != null && list.size() > 0) {
            this.mSweep = this.sweep + this.a;
            for (int i = 0; i < this.mPieItems.size(); i++) {
                this.mPieItems.get(i);
                this.piePaint.setColor(this.mPieItems.get(i).getColors());
                this.piePaintLine.setColor(this.mPieItems.get(i).getLineColors());
                if (this.mPieItems.get(i).getItemType() == 1) {
                    canvas.drawArc(this.pieOval, this.mSweep, this.mPieItems.get(i).getSw(), true, this.piePaint);
                } else {
                    canvas.drawArc(this.pieOvalLineIn, this.mSweep, this.mPieItems.get(i).getSw(), true, this.piePaint);
                }
                this.mSweep = this.mSweep + this.mPieItems.get(i).getSw() + this.a;
            }
            return;
        }
        java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieDataView.CakeValue> list2 = this.mPieItems;
        if (list2 != null) {
            list2.size();
            this.piePaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.pubu_sleep_4));
            canvas.drawArc(this.pieOval, 0.0f, 360.0f, true, this.piePaint);
        }
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

    private void drawSliceLabel(android.graphics.Canvas canvas, float angle, int mSweep, java.lang.String label, int type) {
        float width;
        int i = (int) (angle + (mSweep / 2));
        float min = (java.lang.Math.min(getWidth(), getHeight()) / 2.0f) * 0.6f;
        int textWidth = (int) getTextWidth(this.awakePaint, label);
        if (i >= 90 && i <= 270) {
            width = ((getWidth() / 2.0f) + (((float) java.lang.Math.cos(java.lang.Math.toRadians(i))) * min)) - textWidth;
        } else {
            width = (getWidth() / 2.0f) + (((float) java.lang.Math.cos(java.lang.Math.toRadians(i))) * min) + (textWidth / 4);
        }
        double d = i;
        float height = (getHeight() / 2.0f) + (((float) java.lang.Math.sin(java.lang.Math.toRadians(d))) * min);
        float textHeight = (getTextHeight(this.awakePaint, "0") / 2.0f) + (getHeight() / 2.0f) + (((float) java.lang.Math.sin(java.lang.Math.toRadians(d))) * min);
        if (type == 1) {
            canvas.drawLine(this.pieCenterX, this.pieCenterY, width, height, this.deepPaint);
            canvas.drawText(label, width, textHeight, this.deepPaint);
        } else if (type == 2) {
            canvas.drawLine(this.pieCenterX, this.pieCenterY, (int) ((getWidth() / 2.0f) + (min * ((float) java.lang.Math.cos(java.lang.Math.toRadians(d))))), height, this.lightPaint);
            canvas.drawText(label, width, textHeight, this.lightPaint);
        } else if (type == 3) {
            canvas.drawLine(this.pieCenterX, this.pieCenterY, width, height, this.awakePaint);
            canvas.drawText(label, width, textHeight, this.awakePaint);
        }
    }

    public void setData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieDataView.CakeValue> pieItems) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.totalValue = 0.0f;
        java.util.Iterator<com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieDataView.CakeValue> it = pieItems.iterator();
        while (it.hasNext()) {
            this.totalValue = (float) (this.totalValue + it.next().getItemValue());
        }
        for (int i = 0; i < pieItems.size(); i++) {
            if (pieItems.get(i).getItemValue() != 0.0d) {
                arrayList.add(pieItems.get(i));
            }
        }
        this.mPieItems = arrayList;
        int size = arrayList.size() > 1 ? this.a * this.mPieItems.size() : 0;
        for (int i2 = 0; i2 < this.mPieItems.size(); i2++) {
            this.piePaint.setColor(this.mPieItems.get(i2).getColors());
            this.piePaintLine.setColor(this.mPieItems.get(i2).getLineColors());
            this.mPieItems.get(i2).setSw(java.lang.Integer.parseInt(new java.text.DecimalFormat("0").format((this.mPieItems.get(i2).getItemValue() / this.totalValue) * (360 - size))));
        }
        invalidate();
    }

    public class CakeValue {
        private int colors;
        private int itemType;
        private int lineColors;
        private int sw;
        private double value;

        public CakeValue(int itemType, double itemValue, int color, int lineColors) {
            this.itemType = itemType;
            this.value = itemValue;
            this.colors = color;
            this.lineColors = lineColors;
        }

        public int getLineColors() {
            return this.lineColors;
        }

        public void setLineColors(int lineColors) {
            this.lineColors = lineColors;
        }

        public int getItemType() {
            return this.itemType;
        }

        public void setItemType(int itemType) {
            this.itemType = itemType;
        }

        public double getItemValue() {
            return this.value;
        }

        public void setItemValue(double itemValue) {
            this.value = itemValue;
        }

        public int getColors() {
            return this.colors;
        }

        public void setColors(int color) {
            this.colors = color;
        }

        public int getSw() {
            return this.sw;
        }

        public void setSw(int sw) {
            this.sw = sw;
        }
    }

    public float px2dp(android.content.Context context, float px) {
        return (px / context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public float dp2px(android.content.Context context, float dp) {
        return (dp * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public void dataInit(int[] data) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieDataView.CakeValue(1, data[0], androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.pubu_sleep_3), androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.pubu_sleep_3)));
        arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieDataView.CakeValue(2, data[1], androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.pubu_sleep_2), androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.pubu_sleep_2)));
        arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieDataView.CakeValue(3, data[2], androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.pubu_sleep_1), androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.pubu_sleep_1)));
        arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieDataView.CakeValue(4, data[3], androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_circle_pie_8), androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_circle_pie_9)));
        arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieDataView.CakeValue(5, data[4], androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_circle_pie_10), androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_circle_pie_11)));
        setData(arrayList);
    }
}
