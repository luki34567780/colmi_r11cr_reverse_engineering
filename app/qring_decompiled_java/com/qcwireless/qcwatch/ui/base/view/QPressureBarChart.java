package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QPressureBarChart extends com.qcwireless.qcwatch.ui.base.view.BaseChartView {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean currBean;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean> data;
    java.text.DecimalFormat df;
    private java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean> hashData;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange> labelsList;
    private int leftRightOffset;
    protected com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.OnSelectedListener listener;
    private com.qcwireless.qcwatch.ui.base.view.animator.ChartAnimator mAnimator;
    private int max;
    private int maxPressure;
    private int[] timeArray;

    public interface OnSelectedListener {
        void onSelected(com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean bean);
    }

    public QPressureBarChart(android.content.Context context) {
        super(context);
        this.data = new java.util.ArrayList();
        this.hashData = new androidx.collection.ArrayMap();
        this.labelsList = new java.util.ArrayList();
        this.max = 110;
        this.maxPressure = 100;
        this.timeArray = new int[48];
        this.leftRightOffset = 100;
        init(context, null);
    }

    public QPressureBarChart(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.data = new java.util.ArrayList();
        this.hashData = new androidx.collection.ArrayMap();
        this.labelsList = new java.util.ArrayList();
        this.max = 110;
        this.maxPressure = 100;
        this.timeArray = new int[48];
        this.leftRightOffset = 100;
        init(context, attrs);
    }

    public QPressureBarChart(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.data = new java.util.ArrayList();
        this.hashData = new androidx.collection.ArrayMap();
        this.labelsList = new java.util.ArrayList();
        this.max = 110;
        this.maxPressure = 100;
        this.timeArray = new int[48];
        this.leftRightOffset = 100;
        init(context, attrs);
    }

    public QPressureBarChart(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.data = new java.util.ArrayList();
        this.hashData = new androidx.collection.ArrayMap();
        this.labelsList = new java.util.ArrayList();
        this.max = 110;
        this.maxPressure = 100;
        this.timeArray = new int[48];
        this.leftRightOffset = 100;
        init(context, attrs);
    }

    public com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.OnSelectedListener getListener() {
        return this.listener;
    }

    public void setListener(com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.OnSelectedListener listener) {
        this.listener = listener;
    }

    public java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean> getData() {
        return this.data;
    }

    public void setData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean> data) {
        this.data = data;
        this.maxPressure = 100;
        for (int i = 0; i < data.size(); i++) {
            this.hashData.put(data.get(i).getTimeStamp() + "", data.get(i));
        }
        this.fingerXDefault = new com.qcwireless.qc_utils.date.DateUtil().getTodayMin() * 60;
        int intValue = getNumberThree(this.timeArray, java.lang.Integer.valueOf((int) this.fingerXDefault)).intValue();
        int i2 = this.width;
        int i3 = this.leftRightOffset;
        this.fingerX = (((i2 - (i3 * 2)) * intValue) / 86400) + i3;
        if (this.hashData.get(intValue + "") != null) {
            com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean pressureDataBean = this.hashData.get(intValue + "");
            this.currBean = pressureDataBean;
            this.valueSelected = pressureDataBean.getSteps();
        } else {
            this.currBean = new com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean(43200L, 0);
            this.valueSelected = 0;
        }
        com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.OnSelectedListener onSelectedListener = this.listener;
        if (onSelectedListener != null) {
            onSelectedListener.onSelected(this.currBean);
        }
        postInvalidate();
        this.mAnimator.animateY(1000);
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.0", new java.text.DecimalFormatSymbols(java.util.Locale.US));
        this.df = decimalFormat;
        decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
        for (int i = 0; i < 48; i++) {
            int i2 = i * 1800;
            this.timeArray[i] = i2;
            this.hashData.put(i2 + "", new com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean(i2, 0));
        }
        initAttr(context, attrs);
        this.mAnimator = new com.qcwireless.qcwatch.ui.base.view.animator.ChartAnimator(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator animation) {
                com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.this.postInvalidate();
            }
        });
    }

    private void initXLabels() {
        this.labelsList.clear();
        int i = (this.width - (this.leftRightOffset * 2)) / 8;
        com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange xTextChange = new com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange();
        xTextChange.setLabel("00:00");
        xTextChange.setX(this.leftRightOffset - (getTextWidth(this.textDownPaint, "00:00") / 2.0f));
        xTextChange.setY(this.lineHeight - (this.textSize / 2.0f));
        xTextChange.setMin(1);
        xTextChange.setMax(this.leftRightOffset + i);
        this.labelsList.add(xTextChange);
        com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange xTextChange2 = new com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange();
        xTextChange2.setLabel("06:00");
        xTextChange2.setX((this.leftRightOffset + (i * 2)) - (getTextWidth(this.textDownPaint, "00:00") / 2.0f));
        xTextChange2.setY(this.lineHeight - (this.textSize / 2.0f));
        xTextChange2.setMin(this.leftRightOffset + i);
        int i2 = i * 3;
        xTextChange2.setMax(this.leftRightOffset + i2);
        this.labelsList.add(xTextChange2);
        com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange xTextChange3 = new com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange();
        xTextChange3.setLabel("12:00");
        xTextChange3.setX((this.leftRightOffset + (i * 4)) - (getTextWidth(this.textDownPaint, "00:00") / 2.0f));
        xTextChange3.setY(this.lineHeight - (this.textSize / 2.0f));
        xTextChange3.setMin(this.leftRightOffset + i2);
        int i3 = i * 5;
        xTextChange3.setMax(this.leftRightOffset + i3);
        this.labelsList.add(xTextChange3);
        com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange xTextChange4 = new com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange();
        xTextChange4.setLabel("18:00");
        xTextChange4.setX((this.leftRightOffset + (i * 6)) - (getTextWidth(this.textDownPaint, "00:00") / 2.0f));
        xTextChange4.setY(this.lineHeight - (this.textSize / 2.0f));
        xTextChange4.setMin(this.leftRightOffset + i3);
        int i4 = i * 7;
        xTextChange4.setMax(this.leftRightOffset + i4);
        this.labelsList.add(xTextChange4);
        com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange xTextChange5 = new com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange();
        xTextChange5.setLabel("00:00");
        xTextChange5.setX((this.leftRightOffset + r0) - (getTextWidth(this.textDownPaint, "00:00") / 2.0f));
        xTextChange5.setY(this.lineHeight - (this.textSize / 2.0f));
        xTextChange5.setMin(this.leftRightOffset + i4);
        xTextChange5.setMax(this.leftRightOffset + (i * 8));
        this.labelsList.add(xTextChange5);
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
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
        this.fingerXDefault = dateUtil.getHour() * 3600;
        int intValue = getNumberThree(this.timeArray, java.lang.Integer.valueOf((int) this.fingerXDefault)).intValue();
        int i = this.width;
        int i2 = this.leftRightOffset;
        this.fingerX = (((i - (i2 * 2)) * intValue) / 86400) + i2;
        if (this.hashData.get(intValue + "") != null) {
            com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean pressureDataBean = this.hashData.get(intValue + "");
            this.currBean = pressureDataBean;
            this.valueSelected = pressureDataBean.getSteps();
        } else {
            this.currBean = new com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean(dateUtil.getHour() * 3600, 0);
            this.valueSelected = 0;
        }
        initXLabels();
        this.fingerXMax = (this.width - this.circleRadiusMin) - getTextWidth(this.avgLinePaint, "000");
        if (this.data.size() > 0) {
            setData(this.data);
        }
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
            this.valueSelected = obtainStyledAttributes.getInteger(12, 43200);
            this.lineHeight = (int) dp2px(context, obtainStyledAttributes.getInteger(7, 185));
            this.bottomOffset = (int) dp2px(context, obtainStyledAttributes.getInteger(0, 20));
            obtainStyledAttributes.recycle();
            initPublic(context, attrs);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.view.BaseChartView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        java.util.Iterator<com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean> it;
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
        java.lang.String str = this.valueSelected + "";
        float textWidth = this.fingerX - (getTextWidth(this.textPaint, str) / 2.0f);
        float textWidth2 = this.fingerX + (getTextWidth(this.textPaint, str) / 2.0f);
        if (textWidth <= 0.0f) {
            textWidth2 = getTextWidth(this.textPaint, str);
            textWidth = 0.0f;
        }
        if (textWidth2 >= this.width) {
            textWidth = this.width - getTextWidth(this.textPaint, str);
        }
        float f = textWidth;
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
        java.util.Iterator<com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean> it2 = this.data.iterator();
        while (true) {
            if (it2.hasNext()) {
                com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean next = it2.next();
                if (next.getSteps() != 0) {
                    this.stepPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                    int phaseY = (int) (((next.getSteps() * (this.lineHeight - this.bottomOffset)) / this.max >= 1 ? r3 : 1) * this.mAnimator.getPhaseY());
                    long timeStamp = next.getTimeStamp();
                    int i = this.width;
                    int i2 = this.leftRightOffset;
                    if (((timeStamp * (i - (i2 * 2))) / 86400) + i2 == this.fingerX) {
                        long timeStamp2 = next.getTimeStamp();
                        int i3 = this.width;
                        float f2 = ((timeStamp2 * (i3 - (r6 * 2))) / 86400) + this.leftRightOffset;
                        float f3 = this.lineHeight - this.bottomOffset;
                        long timeStamp3 = next.getTimeStamp();
                        int i4 = this.width;
                        int i5 = this.leftRightOffset;
                        it = it2;
                        canvas.drawLine(f2, f3, ((timeStamp3 * (i4 - (i5 * 2))) / 86400) + i5, (this.lineHeight - this.bottomOffset) - phaseY, this.linePaint);
                    } else {
                        it = it2;
                        long timeStamp4 = next.getTimeStamp();
                        int i6 = this.width;
                        float f4 = ((timeStamp4 * (i6 - (r6 * 2))) / 86400) + this.leftRightOffset;
                        float f5 = this.lineHeight - this.bottomOffset;
                        long timeStamp5 = next.getTimeStamp();
                        int i7 = this.width;
                        int i8 = this.leftRightOffset;
                        canvas.drawLine(f4, f5, ((timeStamp5 * (i7 - (i8 * 2))) / 86400) + i8, (this.lineHeight - this.bottomOffset) - phaseY, this.stepPaint);
                    }
                    it2 = it;
                }
            } else {
                this.textPaint.setColor(this.colorValueSelected);
                canvas.drawText(str, f, 50.0f, this.textPaint);
                this.textPaint.setStrokeWidth(6.0f);
                this.textPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                this.linePaint.setShader(new android.graphics.LinearGradient(this.fingerX, this.lineHeight - this.bottomOffset, this.fingerX, 60.0f, new int[]{androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_step_3), androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_step_4), androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_step_3)}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
                this.linePaint.setStrokeWidth(6.0f);
                canvas.drawLine(this.fingerX, this.lineHeight - this.bottomOffset, this.fingerX, 60.0f, this.linePaint);
                return;
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.fingerX = event.getX();
            float f = this.fingerX;
            int i = this.leftRightOffset;
            if (f < i) {
                this.fingerX = i;
            }
            if (this.fingerX > this.fingerXMax) {
                this.fingerX = this.fingerXMax;
            }
            this.animatorFingerIn.start();
            this.valueSelected = (int) (((this.fingerX - this.leftRightOffset) * 86400.0f) / (this.width - (this.leftRightOffset * 2)));
            int intValue = getNumberThree(this.timeArray, java.lang.Integer.valueOf(this.valueSelected)).intValue();
            int i2 = this.width;
            int i3 = this.leftRightOffset;
            this.fingerX = (((i2 - (i3 * 2)) * intValue) / 86400) + i3;
            if (this.hashData.get(intValue + "") != null) {
                com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean pressureDataBean = this.hashData.get(intValue + "");
                this.currBean = pressureDataBean;
                this.valueSelected = pressureDataBean.getSteps();
            } else {
                this.valueSelected = 0;
            }
            postInvalidate();
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            this.animatorFingerOut.start();
        } else if (action == 2) {
            this.fingerX = event.getX();
            if (this.fingerX < this.fingerXmin) {
                this.fingerX = this.fingerXmin;
            }
            if (this.fingerX > this.fingerXMax) {
                this.fingerX = this.fingerXMax;
            }
            this.valueSelected = (int) (((this.fingerX - this.leftRightOffset) * 86400.0f) / (this.width - (this.leftRightOffset * 2)));
            int intValue2 = getNumberThree(this.timeArray, java.lang.Integer.valueOf(this.valueSelected)).intValue();
            int i4 = this.width;
            int i5 = this.leftRightOffset;
            this.fingerX = (((i4 - (i5 * 2)) * intValue2) / 86400) + i5;
            if (this.hashData.get(intValue2 + "") != null) {
                com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean pressureDataBean2 = this.hashData.get(intValue2 + "");
                this.currBean = pressureDataBean2;
                this.valueSelected = pressureDataBean2.getSteps();
            } else {
                this.valueSelected = 0;
            }
            postInvalidate();
        }
        com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.OnSelectedListener onSelectedListener = this.listener;
        if (onSelectedListener != null) {
            onSelectedListener.onSelected(this.currBean);
        }
        return true;
    }

    public static class PressureDataBean {
        private int steps;
        private long timeStamp;

        public PressureDataBean(long timeStamp, int steps) {
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
}
