package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QSleepBarChart extends com.qcwireless.qcwatch.ui.base.view.BaseChartView {
    public static final int Type_Sleep_Awake = 3;
    public static final int Type_Sleep_Deep = 1;
    public static final int Type_Sleep_Light = 2;
    public static final int Type_Sleep_No_Data = 4;
    private com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean currBean;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean> data;
    private java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean> hashData;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange> labelsList;
    private int leftRightOffset;
    protected com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.OnSelectedListener listener;
    private long sleepEnd;
    private android.graphics.Paint sleepPaint;
    private long sleepStart;
    private long[] startTimeArray;

    public interface OnSelectedListener {
        void onSelected(com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean value);
    }

    public com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.OnSelectedListener getListener() {
        return this.listener;
    }

    public void setListener(com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.OnSelectedListener listener) {
        this.listener = listener;
    }

    public QSleepBarChart(android.content.Context context) {
        super(context);
        this.data = new java.util.ArrayList();
        this.hashData = new androidx.collection.ArrayMap();
        this.labelsList = new java.util.ArrayList();
        this.leftRightOffset = 100;
        init(context, null);
    }

    public QSleepBarChart(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.data = new java.util.ArrayList();
        this.hashData = new androidx.collection.ArrayMap();
        this.labelsList = new java.util.ArrayList();
        this.leftRightOffset = 100;
        init(context, attrs);
    }

    public QSleepBarChart(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.data = new java.util.ArrayList();
        this.hashData = new androidx.collection.ArrayMap();
        this.labelsList = new java.util.ArrayList();
        this.leftRightOffset = 100;
        init(context, attrs);
    }

    public QSleepBarChart(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.data = new java.util.ArrayList();
        this.hashData = new androidx.collection.ArrayMap();
        this.labelsList = new java.util.ArrayList();
        this.leftRightOffset = 100;
        init(context, attrs);
    }

    public java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean> getData() {
        return this.data;
    }

    public void setData(long sleepStart, long sleepEnd, java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean> data) {
        long j = sleepStart;
        this.data = data;
        this.sleepStart = j;
        this.sleepEnd = sleepEnd;
        if (this.width == 0) {
            this.width = getDisplay().getWidth();
        }
        int i = 0;
        if (data.size() > 0) {
            this.startTimeArray = new long[data.size()];
        } else {
            this.startTimeArray = new long[]{this.width / 2};
            this.fingerX = this.width / 2;
        }
        this.hashData.clear();
        this.currBean = null;
        long j2 = sleepEnd - j;
        this.fingerXDefault = (j2 / 2) + j;
        while (i < data.size()) {
            long j3 = this.leftRightOffset;
            long sleepEnd2 = data.get(i).getSleepEnd() - j;
            int i2 = this.width;
            long sleepStart2 = this.leftRightOffset + (((data.get(i).getSleepStart() - j) * (this.width - (this.leftRightOffset * 2))) / j2);
            long j4 = sleepStart2 + (((j3 + ((sleepEnd2 * (i2 - (r15 * 2))) / j2)) - sleepStart2) / 2);
            this.startTimeArray[i] = j4;
            this.hashData.put(j4 + "", data.get(i));
            i++;
            j = sleepStart;
        }
        long numberRecent = getNumberRecent(this.startTimeArray, this.width / 2);
        this.fingerX = numberRecent;
        if (this.hashData.get(numberRecent + "") != null) {
            com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean sleepDataBean = this.hashData.get(numberRecent + "");
            this.currBean = sleepDataBean;
            com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.OnSelectedListener onSelectedListener = this.listener;
            if (onSelectedListener != null) {
                onSelectedListener.onSelected(sleepDataBean);
            }
        }
        initXLabels();
        postInvalidate();
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.sleepPaint = paint;
        paint.setAntiAlias(true);
        this.sleepPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.sleepPaint.setStrokeWidth(1.5f);
        initAttr(context, attrs);
    }

    private void initXLabels() {
        this.labelsList.clear();
        int i = (this.width - (this.leftRightOffset * 2)) / 8;
        com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange xTextChange = new com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange();
        xTextChange.setLabel(new com.qcwireless.qc_utils.date.DateUtil(this.sleepStart, true).getHHmmDate());
        xTextChange.setX(this.leftRightOffset - (getTextWidth(this.textDownPaint, "00:00") / 2.0f));
        xTextChange.setY(this.lineHeight - (this.textSize / 2.0f));
        xTextChange.setMin(1);
        xTextChange.setMax(this.leftRightOffset + i);
        this.labelsList.add(xTextChange);
        com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange xTextChange2 = new com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange();
        xTextChange2.setLabel(new com.qcwireless.qc_utils.date.DateUtil(this.sleepEnd, true).getHHmmDate());
        xTextChange2.setX((this.leftRightOffset + r3) - (getTextWidth(this.textDownPaint, "00:00") / 2.0f));
        xTextChange2.setY(this.lineHeight - (this.textSize / 2.0f));
        xTextChange2.setMin(this.leftRightOffset + (i * 7));
        xTextChange2.setMax(this.leftRightOffset + (i * 8) + 10);
        this.labelsList.add(xTextChange2);
        this.fingerXmin = this.leftRightOffset;
        this.fingerXMax = this.width - this.leftRightOffset;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.width = getMySize(this.diameterDefault, widthMeasureSpec);
        if (getLayoutParams().height == -2) {
            this.height = this.diameterDefault;
        } else {
            this.height = getMySize(this.diameterDefault, heightMeasureSpec);
        }
        this.diameterDefault = (int) dp2px(this.context, 200.0f);
        setMeasuredDimension(this.width, this.height);
        this.fingerXMax = this.width - this.circleRadiusMin;
        this.fingerX = this.width / 2;
        postInvalidate();
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.BaseChartView, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.mPaddingStart = getPaddingStart();
        this.mPaddingEnd = getPaddingEnd();
        this.mPaddingTop = getPaddingTop();
        this.mPaddingBottom = getPaddingBottom();
        this.bezierHeight = 0.0f;
        initXLabels();
    }

    private void initAttr(android.content.Context context, android.util.AttributeSet attrs) {
        if (attrs != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.qc_chart);
            this.colorBall = obtainStyledAttributes.getColor(1, -16777216);
            this.colorLine = obtainStyledAttributes.getColor(4, -16777216);
            this.textDownColor = obtainStyledAttributes.getColor(8, -16777216);
            this.colorValue = obtainStyledAttributes.getColor(5, -16777216);
            this.colorValueSelected = obtainStyledAttributes.getColor(6, -1);
            this.colorBgSelected = obtainStyledAttributes.getColor(3, -16777216);
            this.valueMin = obtainStyledAttributes.getInteger(11, this.offset);
            this.valueMax = obtainStyledAttributes.getInteger(10, 86400);
            this.valueSelected = obtainStyledAttributes.getInteger(12, 43200);
            this.lineHeight = (int) dp2px(context, obtainStyledAttributes.getInteger(7, 185));
            this.bottomOffset = (int) dp2px(context, obtainStyledAttributes.getInteger(0, 30));
            obtainStyledAttributes.recycle();
            initPublic(context, attrs);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.BaseChartView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        this.bezierHeight = (this.circleRadiusMax * 2.0f) + 5.0f;
        this.circleRadius = this.circleRadiusMin + (this.circleRadiusMax - this.circleRadiusMin);
        this.spaceToLine = this.circleRadiusMin * 2.0f;
        for (com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange xTextChange : this.labelsList) {
            if (android.text.TextUtils.isEmpty(xTextChange.getLabel())) {
                break;
            }
            if (this.fingerX > xTextChange.getMin() && this.fingerX <= xTextChange.getMax()) {
                canvas.drawText(xTextChange.label, xTextChange.x, this.lineHeight - this.spaceToLine, this.textDownPaint);
            } else {
                canvas.drawText(xTextChange.label, xTextChange.x, xTextChange.y, this.textDownPaint);
            }
        }
        int i = (this.height - this.bottomOffset) / 5;
        for (com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean sleepDataBean : this.data) {
            this.stepPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            if (sleepDataBean.getType() == 1) {
                this.sleepPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_sleep_1));
                long j = this.leftRightOffset;
                long sleepStart = sleepDataBean.getSleepStart() - this.sleepStart;
                int i2 = this.width;
                int i3 = this.leftRightOffset;
                canvas.drawRect(j + ((sleepStart * (i2 - (i3 * 2))) / (this.sleepEnd - this.sleepStart)), i, i3 + (((sleepDataBean.getSleepEnd() - this.sleepStart) * (this.width - (this.leftRightOffset * 2))) / (this.sleepEnd - this.sleepStart)), i * 5, this.sleepPaint);
            } else if (sleepDataBean.getType() == 2) {
                this.sleepPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_sleep_2));
                long j2 = this.leftRightOffset;
                long sleepStart2 = sleepDataBean.getSleepStart() - this.sleepStart;
                int i4 = this.width;
                int i5 = this.leftRightOffset;
                canvas.drawRect(j2 + ((sleepStart2 * (i4 - (i5 * 2))) / (this.sleepEnd - this.sleepStart)), i * 2, i5 + (((sleepDataBean.getSleepEnd() - this.sleepStart) * (this.width - (this.leftRightOffset * 2))) / (this.sleepEnd - this.sleepStart)), i * 5, this.sleepPaint);
            } else if (sleepDataBean.getType() == 3) {
                this.sleepPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_sleep_3));
                long j3 = this.leftRightOffset;
                long sleepStart3 = sleepDataBean.getSleepStart() - this.sleepStart;
                int i6 = this.width;
                int i7 = this.leftRightOffset;
                canvas.drawRect(j3 + ((sleepStart3 * (i6 - (i7 * 2))) / (this.sleepEnd - this.sleepStart)), i * 3, i7 + (((sleepDataBean.getSleepEnd() - this.sleepStart) * (this.width - (this.leftRightOffset * 2))) / (this.sleepEnd - this.sleepStart)), i * 5, this.sleepPaint);
            } else if (sleepDataBean.type == 4) {
                this.sleepPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.color_F9F9F9));
                long j4 = this.leftRightOffset;
                long sleepStart4 = sleepDataBean.getSleepStart() - this.sleepStart;
                int i8 = this.width;
                int i9 = this.leftRightOffset;
                canvas.drawRect(j4 + ((sleepStart4 * (i8 - (i9 * 2))) / (this.sleepEnd - this.sleepStart)), i * 4, i9 + (((sleepDataBean.getSleepEnd() - this.sleepStart) * (this.width - (this.leftRightOffset * 2))) / (this.sleepEnd - this.sleepStart)), i * 5, this.sleepPaint);
            }
        }
        this.linePaint.setShader(new android.graphics.LinearGradient(this.fingerX, this.lineHeight - this.bottomOffset, this.fingerX, 60.0f, new int[]{androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_sleep_5), androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_sleep_4), androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_sleep_5)}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        this.linePaint.setStrokeWidth(dp2px(this.context, 1.0f));
        canvas.drawLine(this.fingerX, this.lineHeight - this.bottomOffset, this.fingerX, 60.0f, this.linePaint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.fingerX = event.getX();
            if (this.fingerX < this.fingerXmin) {
                this.fingerX = this.fingerXmin;
            }
            if (this.fingerX > this.fingerXMax) {
                this.fingerX = this.fingerXMax;
            }
            this.animatorFingerIn.start();
            if (this.data.size() <= 0) {
                this.startTimeArray = new long[]{this.width / 2};
                this.fingerX = this.width / 2;
            } else {
                if (this.fingerX < this.fingerXmin) {
                    this.fingerX = this.fingerXmin;
                }
                if (this.fingerX > this.fingerXMax) {
                    this.fingerX = this.fingerXMax;
                }
                long numberRecent = getNumberRecent(this.startTimeArray, (long) this.fingerX);
                this.fingerX = numberRecent;
                if (this.hashData.get(numberRecent + "") != null) {
                    this.currBean = this.hashData.get(numberRecent + "");
                }
            }
            postInvalidate();
        } else if (action == 1) {
            this.animatorFingerOut.start();
        } else if (action == 2) {
            this.fingerX = event.getX();
            if (this.fingerX < this.fingerXmin) {
                this.fingerX = this.fingerXmin;
            }
            if (this.fingerX > this.fingerXMax) {
                this.fingerX = this.fingerXMax;
            }
            long numberRecent2 = getNumberRecent(this.startTimeArray, (long) this.fingerX);
            this.fingerX = numberRecent2;
            if (this.hashData.get(numberRecent2 + "") != null) {
                this.currBean = this.hashData.get(numberRecent2 + "");
            }
            postInvalidate();
        }
        com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.OnSelectedListener onSelectedListener = this.listener;
        if (onSelectedListener != null) {
            onSelectedListener.onSelected(this.currBean);
        }
        return true;
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

    public static class SleepDataBean {
        private long sleepEnd;
        private long sleepStart;
        private int type;

        public SleepDataBean() {
        }

        public SleepDataBean(long sleepStart, long sleepEnd, int type) {
            this.sleepStart = sleepStart;
            this.sleepEnd = sleepEnd;
            this.type = type;
        }

        public long getSleepStart() {
            return this.sleepStart;
        }

        public void setSleepStart(long sleepStart) {
            this.sleepStart = sleepStart;
        }

        public long getSleepEnd() {
            return this.sleepEnd;
        }

        public void setSleepEnd(long sleepEnd) {
            this.sleepEnd = sleepEnd;
        }

        public int getType() {
            return this.type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
