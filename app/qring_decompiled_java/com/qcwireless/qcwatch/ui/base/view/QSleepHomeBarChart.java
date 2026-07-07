package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QSleepHomeBarChart extends android.view.View {
    public static final int Type_Sleep_Awake = 3;
    public static final int Type_Sleep_Deep = 1;
    public static final int Type_Sleep_Light = 2;
    protected int bottomOffset;
    private android.content.Context context;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean> data;
    private float height;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepHomeBarChart.XTextChange> labelsList;
    private int leftRightOffset;
    private android.graphics.Paint paintBottom;
    private long sleepEnd;
    private android.graphics.Paint sleepPaint;
    private long sleepStart;
    private android.graphics.Paint textDownPaint;
    private float width;

    public QSleepHomeBarChart(android.content.Context context) {
        super(context);
        this.data = new java.util.ArrayList();
        this.leftRightOffset = 10;
        this.bottomOffset = 50;
        this.labelsList = new java.util.ArrayList();
        this.context = context;
        init(context, null);
    }

    public QSleepHomeBarChart(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.data = new java.util.ArrayList();
        this.leftRightOffset = 10;
        this.bottomOffset = 50;
        this.labelsList = new java.util.ArrayList();
        this.context = context;
        init(context, attrs);
    }

    public QSleepHomeBarChart(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.data = new java.util.ArrayList();
        this.leftRightOffset = 10;
        this.bottomOffset = 50;
        this.labelsList = new java.util.ArrayList();
        this.context = context;
        init(context, attrs);
    }

    public QSleepHomeBarChart(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.data = new java.util.ArrayList();
        this.leftRightOffset = 10;
        this.bottomOffset = 50;
        this.labelsList = new java.util.ArrayList();
        this.context = context;
        init(context, attrs);
    }

    public java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean> getData() {
        return this.data;
    }

    public void setData(long sleepStart, long sleepEnd, java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean> data) {
        if (data == null) {
            data = new java.util.ArrayList<>();
        }
        this.data = data;
        this.sleepStart = sleepStart;
        this.sleepEnd = sleepEnd;
        if (data.size() == 0) {
            initXLabels("00:00", "24:00");
        } else {
            initXLabels(new com.oudmon.ble.base.util.DateUtil(sleepStart, true).getHHmmDate(), new com.oudmon.ble.base.util.DateUtil(sleepEnd, true).getHHmmDate());
        }
        postInvalidate();
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.sleepPaint = paint;
        paint.setAntiAlias(true);
        this.sleepPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.sleepPaint.setStrokeWidth(1.5f);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.paintBottom = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.paintBottom.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.paintBottom.setAntiAlias(true);
        this.paintBottom.setStrokeWidth(dp2px(context, 1.0f));
        this.paintBottom.setColor(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.q_view_sleep_1));
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.textDownPaint = paint3;
        paint3.setAntiAlias(true);
        this.textDownPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.textDownPaint.setStrokeWidth(2.0f);
        this.textDownPaint.setTextSize(dp2px(context, 8.0f));
        this.textDownPaint.setColor(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.q_view_sleep_1));
    }

    public float dp2px(android.content.Context context, float dp) {
        return (dp * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    private void initXLabels(java.lang.String start, java.lang.String end) {
        this.labelsList.clear();
        com.qcwireless.qcwatch.ui.base.view.QSleepHomeBarChart.XTextChange xTextChange = new com.qcwireless.qcwatch.ui.base.view.QSleepHomeBarChart.XTextChange();
        xTextChange.setLabel(start);
        xTextChange.setX(this.leftRightOffset);
        xTextChange.setY(dp2px(this.context, 82.0f));
        this.labelsList.add(xTextChange);
        com.qcwireless.qcwatch.ui.base.view.QSleepHomeBarChart.XTextChange xTextChange2 = new com.qcwireless.qcwatch.ui.base.view.QSleepHomeBarChart.XTextChange();
        xTextChange2.setLabel(end);
        xTextChange2.setX((this.width - getTextWidth(this.textDownPaint, "00:00")) - this.leftRightOffset);
        xTextChange2.setY(dp2px(this.context, 82.0f));
        this.labelsList.add(xTextChange2);
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

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.width = getMySize(200, widthMeasureSpec);
        if (getLayoutParams().height == -2) {
            this.height = 100.0f;
        } else {
            this.height = getMySize(100, heightMeasureSpec);
        }
        java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean> list = this.data;
        if (list == null || list.size() == 0) {
            initXLabels("00:00", "24:00");
        } else {
            initXLabels(new com.oudmon.ble.base.util.DateUtil(this.sleepStart, true).getHHmmDate(), new com.oudmon.ble.base.util.DateUtil(this.sleepEnd, true).getHHmmDate());
        }
        postInvalidate();
    }

    public int getMySize(int defaultSize, int measureSpec) {
        int mode = android.view.View.MeasureSpec.getMode(measureSpec);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? android.view.View.MeasureSpec.getSize(measureSpec) : defaultSize;
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        for (com.qcwireless.qcwatch.ui.base.view.QSleepHomeBarChart.XTextChange xTextChange : this.labelsList) {
            canvas.drawText(xTextChange.label, xTextChange.x, xTextChange.y, this.textDownPaint);
        }
        int i = (int) ((this.height - this.bottomOffset) / 5.0f);
        for (com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean sleepDataBean : this.data) {
            if (sleepDataBean.getType() == 1) {
                this.sleepPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_sleep_1));
                float f = this.leftRightOffset;
                float sleepStart = sleepDataBean.getSleepStart() - this.sleepStart;
                float f2 = this.width;
                int i2 = this.leftRightOffset;
                long sleepEnd = sleepDataBean.getSleepEnd();
                long j = this.sleepStart;
                canvas.drawRect(f + ((sleepStart * (f2 - (i2 * 2))) / (this.sleepEnd - r8)), i, i2 + (((sleepEnd - j) * (this.width - (this.leftRightOffset * 2))) / (this.sleepEnd - j)), i * 5, this.sleepPaint);
            } else if (sleepDataBean.getType() == 2) {
                this.sleepPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_sleep_2));
                float f3 = this.leftRightOffset;
                float sleepStart2 = sleepDataBean.getSleepStart() - this.sleepStart;
                float f4 = this.width;
                int i3 = this.leftRightOffset;
                long sleepEnd2 = sleepDataBean.getSleepEnd();
                long j2 = this.sleepStart;
                canvas.drawRect(f3 + ((sleepStart2 * (f4 - (i3 * 2))) / (this.sleepEnd - r8)), i * 2, i3 + (((sleepEnd2 - j2) * (this.width - (this.leftRightOffset * 2))) / (this.sleepEnd - j2)), i * 5, this.sleepPaint);
            } else if (sleepDataBean.getType() == 3) {
                this.sleepPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_sleep_3));
                float f5 = this.leftRightOffset;
                float sleepStart3 = sleepDataBean.getSleepStart() - this.sleepStart;
                float f6 = this.width;
                int i4 = this.leftRightOffset;
                long sleepEnd3 = sleepDataBean.getSleepEnd();
                long j3 = this.sleepStart;
                canvas.drawRect(f5 + ((sleepStart3 * (f6 - (i4 * 2))) / (this.sleepEnd - r8)), i * 3, i4 + (((sleepEnd3 - j3) * (this.width - (this.leftRightOffset * 2))) / (this.sleepEnd - j3)), i * 5, this.sleepPaint);
            }
        }
        int i5 = this.leftRightOffset;
        float f7 = this.height;
        int i6 = this.bottomOffset;
        canvas.drawLine(i5, f7 - i6, this.width - i5, f7 - i6, this.paintBottom);
    }

    public long getNumberRecent(long[] intarray, long number) {
        long abs = java.lang.Math.abs(number - intarray[0]);
        long j = intarray[0];
        for (long j2 : intarray) {
            long abs2 = java.lang.Math.abs(number - j2);
            if (abs2 <= abs) {
                j = j2;
                abs = abs2;
            }
        }
        return j;
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
