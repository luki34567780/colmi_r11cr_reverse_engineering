package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QPressureMonthHistoryBarChart extends com.qcwireless.qcwatch.ui.base.view.BaseChartView {
    private int[] colors;
    private com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean currBean;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean> data;
    java.text.DecimalFormat df;
    private java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean> hashData;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange> labelsList;
    private int leftRightOffset;
    protected com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.OnSelectedListener listener;
    private int max;
    private int maxPressure;
    private int[] timeArray;

    public interface OnSelectedListener {
        void onSelected(com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean bean);
    }

    public QPressureMonthHistoryBarChart(android.content.Context context) {
        super(context);
        this.data = new java.util.ArrayList();
        this.hashData = new androidx.collection.ArrayMap();
        this.labelsList = new java.util.ArrayList();
        this.max = 110;
        this.maxPressure = 100;
        this.timeArray = new int[31];
        this.leftRightOffset = 100;
        init(context, null);
    }

    public QPressureMonthHistoryBarChart(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.data = new java.util.ArrayList();
        this.hashData = new androidx.collection.ArrayMap();
        this.labelsList = new java.util.ArrayList();
        this.max = 110;
        this.maxPressure = 100;
        this.timeArray = new int[31];
        this.leftRightOffset = 100;
        init(context, attrs);
    }

    public QPressureMonthHistoryBarChart(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.data = new java.util.ArrayList();
        this.hashData = new androidx.collection.ArrayMap();
        this.labelsList = new java.util.ArrayList();
        this.max = 110;
        this.maxPressure = 100;
        this.timeArray = new int[31];
        this.leftRightOffset = 100;
        init(context, attrs);
    }

    public QPressureMonthHistoryBarChart(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.data = new java.util.ArrayList();
        this.hashData = new androidx.collection.ArrayMap();
        this.labelsList = new java.util.ArrayList();
        this.max = 110;
        this.maxPressure = 100;
        this.timeArray = new int[31];
        this.leftRightOffset = 100;
        init(context, attrs);
    }

    public java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean> getData() {
        return this.data;
    }

    public void setData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean> data) {
        this.maxPressure = 100;
        this.data.clear();
        this.data = data;
        if (this.width > 0) {
            filterData(this.data);
        }
    }

    public com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.OnSelectedListener getListener() {
        return this.listener;
    }

    public void setListener(com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.OnSelectedListener listener) {
        this.listener = listener;
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.0", new java.text.DecimalFormatSymbols(java.util.Locale.US));
        this.df = decimalFormat;
        decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
        this.colors = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_step_3), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_step_2), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_step_3)};
        initAttr(context, attrs);
    }

    public void initXLabel(java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean> data, int days) {
        if (this.width == 0) {
            this.width = getDisplay().getWidth();
        }
        int i = (this.width - (this.leftRightOffset * 2)) / (days - 1);
        this.labelsList.clear();
        for (int i2 = 0; i2 < data.size(); i2++) {
            if (i2 % 6 == 0 || i2 == data.size() - 1) {
                com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange xTextChange = new com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange();
                xTextChange.setLabel(new com.qcwireless.qc_utils.date.DateUtil(data.get(i2).getTimeStamp(), true).getMMddDate());
                if (new com.qcwireless.qc_utils.date.DateUtil(data.get(i2).getTimeStamp(), true).getDay() == 28) {
                    xTextChange.setX((((i * i2) + this.leftRightOffset) - (getTextWidth(this.textDownPaint, "00:00") / 2.0f)) + dp2px(this.context, 8.0f));
                } else {
                    xTextChange.setX(((i * i2) + this.leftRightOffset) - (getTextWidth(this.textDownPaint, "00:00") / 2.0f));
                }
                xTextChange.setY(this.lineHeight - (this.textSize / 2.0f));
                if (i2 == 0) {
                    xTextChange.setMin(1);
                    xTextChange.setMax((this.leftRightOffset + (i * 5)) - 30);
                } else {
                    xTextChange.setMin(this.leftRightOffset + ((i2 - 5) * i) + 30);
                    xTextChange.setMax((this.leftRightOffset + ((i2 + 5) * i)) - 30);
                }
                this.labelsList.add(xTextChange);
            }
        }
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
        setMeasuredDimension(this.width, this.height);
        this.diameterDefault = (int) dp2px(this.context, 200.0f);
        this.fingerXDefault = this.width / 2;
        this.fingerX = this.fingerXDefault;
        int intValue = getNumberThree(this.timeArray, java.lang.Integer.valueOf((int) this.fingerX)).intValue();
        if (this.hashData.get(intValue + "") != null) {
            java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean> map = this.hashData;
            this.fingerX = map.get(intValue + "").x;
            this.currBean = this.hashData.get(intValue + "");
        }
        if (this.data.size() > 0) {
            initXLabel(this.data, com.qcwireless.qc_utils.date.DateUtil.getDaysOfMonth(new com.qcwireless.qc_utils.date.DateUtil(this.data.get(0).getTimeStamp(), true).toDate()));
            setData(this.data);
        }
        this.fingerXMax = this.width - this.circleRadiusMin;
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
            if (this.fingerX > xTextChange.getMin() && this.fingerX <= xTextChange.getMax()) {
                canvas.drawText(xTextChange.label, xTextChange.x, this.lineHeight - this.spaceToLine, this.textDownPaint);
            } else {
                canvas.drawText(xTextChange.label, xTextChange.x, xTextChange.y, this.textDownPaint);
            }
        }
        canvas.drawLine(this.leftRightOffset, (this.lineHeight - this.bottomOffset) + 2, this.width - this.leftRightOffset, (this.lineHeight - this.bottomOffset) + 2, this.avgLinePaint);
        canvas.drawText("0", this.width - getTextWidth(this.avgLinePaint, "000"), (this.lineHeight - this.bottomOffset) + 8, this.textDownPaint);
        canvas.drawLine(this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.maxPressure / 5) * (this.lineHeight - this.bottomOffset)) / this.max), this.width - this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.maxPressure / 5) * (this.lineHeight - this.bottomOffset)) / this.max), this.avgLinePaint);
        canvas.drawLine(this.leftRightOffset, (this.lineHeight - this.bottomOffset) - ((((this.maxPressure / 5) * 2) * (this.lineHeight - this.bottomOffset)) / this.max), this.width - this.leftRightOffset, (this.lineHeight - this.bottomOffset) - ((((this.maxPressure / 5) * 2) * (this.lineHeight - this.bottomOffset)) / this.max), this.avgLinePaint);
        canvas.drawLine(this.leftRightOffset, (this.lineHeight - this.bottomOffset) - ((((this.maxPressure / 5) * 3) * (this.lineHeight - this.bottomOffset)) / this.max), this.width - this.leftRightOffset, (this.lineHeight - this.bottomOffset) - ((((this.maxPressure / 5) * 3) * (this.lineHeight - this.bottomOffset)) / this.max), this.avgLinePaint);
        canvas.drawLine(this.leftRightOffset, (this.lineHeight - this.bottomOffset) - ((((this.maxPressure / 5) * 4) * (this.lineHeight - this.bottomOffset)) / this.max), this.width - this.leftRightOffset, (this.lineHeight - this.bottomOffset) - ((((this.maxPressure / 5) * 4) * (this.lineHeight - this.bottomOffset)) / this.max), this.avgLinePaint);
        canvas.drawLine(this.leftRightOffset, (this.lineHeight - this.bottomOffset) - ((((this.maxPressure / 5) * 5) * (this.lineHeight - this.bottomOffset)) / this.max), this.width - this.leftRightOffset, (this.lineHeight - this.bottomOffset) - ((((this.maxPressure / 5) * 5) * (this.lineHeight - this.bottomOffset)) / this.max), this.avgLinePaint);
        canvas.drawText("20", this.width - getTextWidth(this.avgLinePaint, "0000"), (this.lineHeight - this.bottomOffset) - (((this.maxPressure / 5) * (this.lineHeight - this.bottomOffset)) / this.max), this.textDownPaint);
        canvas.drawText("40", this.width - getTextWidth(this.avgLinePaint, "0000"), (this.lineHeight - this.bottomOffset) - ((((this.maxPressure / 5) * 2) * (this.lineHeight - this.bottomOffset)) / this.max), this.textDownPaint);
        canvas.drawText("60", this.width - getTextWidth(this.avgLinePaint, "0000"), (this.lineHeight - this.bottomOffset) - ((((this.maxPressure / 5) * 3) * (this.lineHeight - this.bottomOffset)) / this.max), this.textDownPaint);
        canvas.drawText("80", this.width - getTextWidth(this.avgLinePaint, "0000"), (this.lineHeight - this.bottomOffset) - ((((this.maxPressure / 5) * 4) * (this.lineHeight - this.bottomOffset)) / this.max), this.textDownPaint);
        canvas.drawText("100", this.width - getTextWidth(this.avgLinePaint, "0000"), (this.lineHeight - this.bottomOffset) - ((((this.maxPressure / 5) * 5) * (this.lineHeight - this.bottomOffset)) / this.max), this.textDownPaint);
        this.stepPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.stepPaint.setStrokeWidth(dp2px(this.context, 2.0f));
        this.linePaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.linePaint.setStrokeWidth(dp2px(this.context, 2.0f));
        for (com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean stepDataBean : this.data) {
            if (stepDataBean.getX() == this.fingerX) {
                if (stepDataBean.getSteps() > 0) {
                    canvas.drawLine(stepDataBean.getX(), stepDataBean.getY(), stepDataBean.getX(), this.lineHeight - this.bottomOffset, this.linePaint);
                }
            } else if (stepDataBean.getSteps() > 0) {
                canvas.drawLine(stepDataBean.getX(), stepDataBean.getY(), stepDataBean.getX(), this.lineHeight - this.bottomOffset, this.stepPaint);
            }
        }
        this.linePaint.setShader(new android.graphics.LinearGradient(this.fingerX, this.lineHeight - this.bottomOffset, this.fingerX, 60.0f, this.colors, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        this.linePaint.setStrokeWidth(6.0f);
        canvas.drawLine(this.fingerX, this.lineHeight - this.bottomOffset, this.fingerX, 60.0f, this.linePaint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            this.fingerX = event.getX();
            if (this.fingerX < this.fingerXmin) {
                this.fingerX = this.fingerXmin;
            }
            if (this.fingerX > this.fingerXMax) {
                this.fingerX = this.fingerXMax;
            }
            this.animatorFingerIn.start();
            int intValue = getNumberThree(this.timeArray, java.lang.Integer.valueOf((int) this.fingerX)).intValue();
            if (this.hashData.get(intValue + "") != null) {
                this.currBean = this.hashData.get(intValue + "");
                java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean> map = this.hashData;
                this.fingerX = map.get(intValue + "").x;
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
            int intValue2 = getNumberThree(this.timeArray, java.lang.Integer.valueOf((int) this.fingerX)).intValue();
            if (this.hashData.get(intValue2 + "") != null) {
                this.currBean = this.hashData.get(intValue2 + "");
                java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean> map2 = this.hashData;
                this.fingerX = map2.get(intValue2 + "").x;
            }
            postInvalidate();
        }
        com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.OnSelectedListener onSelectedListener = this.listener;
        if (onSelectedListener != null) {
            onSelectedListener.onSelected(this.currBean);
        }
        return true;
    }

    public static class StepDataBean {
        private int calorie;
        private int distance;
        private int steps;
        private long timeStamp;
        private int x;
        private int y;

        public int getDistance() {
            return this.distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public int getCalorie() {
            return this.calorie;
        }

        public void setCalorie(int calorie) {
            this.calorie = calorie;
        }

        public int getX() {
            return this.x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return this.y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public StepDataBean(long timeStamp, int steps) {
            this.timeStamp = timeStamp;
            this.steps = steps;
        }

        public long getTimeStamp() {
            return this.timeStamp;
        }

        public void setTimeStamp(long timeStamp) {
            this.timeStamp = timeStamp;
        }

        public int getSteps() {
            return this.steps;
        }

        public void setSteps(int steps) {
            this.steps = steps;
        }
    }

    private void filterData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean> data) {
        for (com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean stepDataBean : data) {
            if (stepDataBean.steps > this.maxPressure) {
                this.maxPressure = stepDataBean.getSteps();
            }
        }
        int i = 31;
        if (data.size() > 0) {
            i = com.qcwireless.qc_utils.date.DateUtil.getDaysOfMonth(new com.qcwireless.qc_utils.date.DateUtil(data.get(0).getTimeStamp(), true).toDate());
            this.hashData.clear();
            this.timeArray = new int[i];
        }
        int textWidth = ((this.width - (this.leftRightOffset * 2)) - ((int) getTextWidth(this.avgLinePaint, "0"))) / (i - 1);
        for (int i2 = 0; i2 < data.size(); i2++) {
            com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean stepDataBean2 = data.get(i2);
            int i3 = i2 * textWidth;
            stepDataBean2.setX(this.leftRightOffset + i3);
            this.timeArray[i2] = this.leftRightOffset + i3;
            stepDataBean2.setY((this.lineHeight - this.bottomOffset) - ((stepDataBean2.getSteps() * (this.lineHeight - this.bottomOffset)) / this.max));
            this.hashData.put((this.leftRightOffset + i3) + "", stepDataBean2);
        }
        initXLabel(data, i);
        this.fingerXDefault = this.leftRightOffset + (com.qcwireless.qc_utils.date.DateUtil.getDayOfMonth() * textWidth);
        this.fingerX = this.fingerXDefault;
        int intValue = getNumberThree(this.timeArray, java.lang.Integer.valueOf((int) this.fingerX)).intValue();
        if (this.hashData.get(intValue + "") != null) {
            java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean> map = this.hashData;
            this.fingerX = map.get(intValue + "").x;
            this.currBean = this.hashData.get(intValue + "");
        }
        com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.OnSelectedListener onSelectedListener = this.listener;
        if (onSelectedListener != null) {
            onSelectedListener.onSelected(this.currBean);
        }
        postInvalidate();
    }
}
