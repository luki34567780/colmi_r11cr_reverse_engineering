package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QCircleBloodOxygenPieView extends android.view.View {
    private int a;
    private android.content.Context context;
    private int height;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.QCircleBloodOxygenPieView.CakeValue> mPieItems;
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
    private int sweep;
    private float totalValue;
    private int width;

    public QCircleBloodOxygenPieView(android.content.Context context) {
        super(context);
        this.a = 3;
        this.mSweep = 0;
        this.sweep = 0;
        this.context = context;
        init(context);
    }

    public QCircleBloodOxygenPieView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.a = 3;
        this.mSweep = 0;
        this.sweep = 0;
        this.context = context;
        init(context);
    }

    public QCircleBloodOxygenPieView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.a = 3;
        this.mSweep = 0;
        this.sweep = 0;
        this.context = context;
        init(context);
    }

    public QCircleBloodOxygenPieView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.a = 3;
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
        int dp2px = (int) dp2px(context, 18.0f);
        int dp2px2 = (int) dp2px(context, 50.0f);
        int dp2px3 = (int) dp2px(context, 50.5f);
        this.pieCenterX = this.width / 2;
        this.pieCenterY = this.height / 2;
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.pieOval = rectF;
        rectF.left = this.pieCenterX - dp2px2;
        this.pieOval.top = this.pieCenterY - dp2px2;
        this.pieOval.right = this.pieCenterX + dp2px2;
        this.pieOval.bottom = this.pieCenterY + dp2px2;
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        this.pieOvalLine = rectF2;
        rectF2.left = this.pieCenterX - dp2px3;
        this.pieOvalLine.top = this.pieCenterY - dp2px3;
        this.pieOvalLine.right = this.pieCenterX + dp2px3;
        this.pieOvalLine.bottom = this.pieCenterY + dp2px3;
        android.graphics.RectF rectF3 = new android.graphics.RectF();
        this.pieOvalIn = rectF3;
        float f = dp2px;
        rectF3.left = this.pieOval.left + f;
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
    }

    public int getMySize(int defaultSize, int measureSpec) {
        int mode = android.view.View.MeasureSpec.getMode(measureSpec);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? android.view.View.MeasureSpec.getSize(measureSpec) : defaultSize;
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        java.util.List<com.qcwireless.qcwatch.ui.base.view.QCircleBloodOxygenPieView.CakeValue> list = this.mPieItems;
        if (list != null && list.size() > 0) {
            this.mSweep = this.sweep + this.a;
            for (int i = 0; i < this.mPieItems.size(); i++) {
                this.piePaint.setColor(this.mPieItems.get(i).getColors());
                this.piePaintLine.setColor(this.mPieItems.get(i).getLineColors());
                canvas.drawArc(this.pieOvalLine, this.mSweep, this.mPieItems.get(i).getSw(), true, this.piePaintLine);
                canvas.drawArc(this.pieOval, this.mSweep, this.mPieItems.get(i).getSw(), true, this.piePaint);
                canvas.drawArc(this.pieOvalIn, this.mSweep, this.mPieItems.get(i).getSw(), true, this.piePaintLine);
                this.mSweep = this.mSweep + this.mPieItems.get(i).getSw() + this.a;
            }
        } else {
            java.util.List<com.qcwireless.qcwatch.ui.base.view.QCircleBloodOxygenPieView.CakeValue> list2 = this.mPieItems;
            if (list2 != null && list2.size() == 0) {
                this.piePaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_circle_pie_1));
                canvas.drawArc(this.pieOval, 0.0f, 360.0f, true, this.piePaint);
            }
        }
        this.piePaintIn.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_circle_pie_12));
        canvas.drawArc(this.pieOvalIn, 0.0f, 360.0f, true, this.piePaintIn);
    }

    public void setData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QCircleBloodOxygenPieView.CakeValue> pieItems) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.totalValue = 0.0f;
        java.util.Iterator<com.qcwireless.qcwatch.ui.base.view.QCircleBloodOxygenPieView.CakeValue> it = pieItems.iterator();
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
        arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QCircleBloodOxygenPieView.CakeValue(1, data[0], androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_circle_pie_2), androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_circle_pie_3)));
        arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QCircleBloodOxygenPieView.CakeValue(2, data[1], androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_circle_pie_4), androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_circle_pie_5)));
        arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QCircleBloodOxygenPieView.CakeValue(3, data[2], androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_circle_pie_6), androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_circle_pie_7)));
        arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QCircleBloodOxygenPieView.CakeValue(4, data[3], androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_circle_pie_8), androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_circle_pie_9)));
        arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QCircleBloodOxygenPieView.CakeValue(5, data[4], androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_circle_pie_10), androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_circle_pie_11)));
        setData(arrayList);
    }
}
