package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QSleepMonthBarView extends com.qcwireless.qcwatch.ui.base.view.BaseChartView {
    private com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean currBean;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean> data;
    private java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean> hashData;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange> labelsList;
    private int leftRightOffset;
    private com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.OnSelectedListener listener;
    private int maxSleepTime;
    private android.graphics.Paint sleepPaint;
    private int[] timeArray;

    public interface OnSelectedListener {
        void onSelected(com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean bean);
    }

    public com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.OnSelectedListener getListener() {
        return this.listener;
    }

    public void setListener(com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.OnSelectedListener listener) {
        this.listener = listener;
    }

    public QSleepMonthBarView(android.content.Context context) {
        super(context);
        this.leftRightOffset = 100;
        this.maxSleepTime = 540;
        this.data = new java.util.ArrayList();
        this.labelsList = new java.util.ArrayList();
        this.timeArray = new int[32];
        this.hashData = new androidx.collection.ArrayMap();
        this.context = context;
        initPaint(context, null);
    }

    public QSleepMonthBarView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.leftRightOffset = 100;
        this.maxSleepTime = 540;
        this.data = new java.util.ArrayList();
        this.labelsList = new java.util.ArrayList();
        this.timeArray = new int[32];
        this.hashData = new androidx.collection.ArrayMap();
        this.context = context;
        initPaint(context, attrs);
    }

    public QSleepMonthBarView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.leftRightOffset = 100;
        this.maxSleepTime = 540;
        this.data = new java.util.ArrayList();
        this.labelsList = new java.util.ArrayList();
        this.timeArray = new int[32];
        this.hashData = new androidx.collection.ArrayMap();
        this.context = context;
        initPaint(context, attrs);
    }

    public QSleepMonthBarView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.leftRightOffset = 100;
        this.maxSleepTime = 540;
        this.data = new java.util.ArrayList();
        this.labelsList = new java.util.ArrayList();
        this.timeArray = new int[32];
        this.hashData = new androidx.collection.ArrayMap();
        this.context = context;
        initPaint(context, attrs);
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
        for (int i = 0; i < this.data.size(); i++) {
            com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean sleepDataBean = this.data.get(i);
            float totalTime = (sleepDataBean.getTotalTime() * (this.lineHeight - this.bottomOffset)) / this.maxSleepTime;
            int deepScale = (int) (sleepDataBean.getDeepScale() * totalTime);
            int lightScale = (int) (sleepDataBean.getLightScale() * totalTime);
            int awakeScale = (int) (sleepDataBean.getAwakeScale() * totalTime);
            this.sleepPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_sleep_1));
            canvas.drawLine(sleepDataBean.getX(), this.lineHeight - this.bottomOffset, sleepDataBean.getX(), (this.lineHeight - this.bottomOffset) - deepScale, this.sleepPaint);
            this.sleepPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_sleep_2));
            canvas.drawLine(sleepDataBean.getX(), (this.lineHeight - this.bottomOffset) - deepScale, sleepDataBean.getX(), ((this.lineHeight - this.bottomOffset) - deepScale) - lightScale, this.sleepPaint);
            this.sleepPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_sleep_3));
            canvas.drawLine(sleepDataBean.getX(), ((this.lineHeight - this.bottomOffset) - deepScale) - lightScale, sleepDataBean.getX(), (((this.lineHeight - this.bottomOffset) - deepScale) - lightScale) - awakeScale, this.sleepPaint);
        }
        this.linePaint.setShader(new android.graphics.LinearGradient(this.fingerX, this.lineHeight - this.bottomOffset, this.fingerX, 60.0f, new int[]{androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_sleep_5), androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_sleep_4), androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_sleep_5)}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        this.linePaint.setStrokeWidth(dp2px(this.context, 1.0f));
        canvas.drawLine(this.fingerX, this.lineHeight - this.bottomOffset, this.fingerX, 60.0f, this.linePaint);
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
        setMeasuredDimension(this.width, this.height);
        this.fingerXMax = this.width - this.circleRadiusMin;
        this.fingerX = this.width / 2;
        setData(this.data);
        if (this.data.size() > 0) {
            initXLabel(this.data, com.qcwireless.qc_utils.date.DateUtil.getDaysOfMonth(new com.qcwireless.qc_utils.date.DateUtil(this.data.get(0).getUnixTime(), true).toDate()));
        }
        setData(this.data);
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

    public void initPaint(android.content.Context context, android.util.AttributeSet attrs) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.sleepPaint = paint;
        paint.setAntiAlias(true);
        this.sleepPaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.sleepPaint.setStrokeWidth(10.0f);
        initAttr(context, attrs);
    }

    public void initXLabel(java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean> data, int days) {
        if (this.width == 0) {
            this.width = 1080;
        }
        int i = (this.width - (this.leftRightOffset * 2)) / (days - 1);
        this.labelsList.clear();
        for (int i2 = 0; i2 < data.size(); i2++) {
            if (i2 % 6 == 0 || i2 == data.size() - 1) {
                com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange xTextChange = new com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange();
                xTextChange.setLabel(new com.qcwireless.qc_utils.date.DateUtil(data.get(i2).getUnixTime(), true).getMMddDate());
                if (new com.qcwireless.qc_utils.date.DateUtil(data.get(i2).getUnixTime(), true).getDay() == 28) {
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
            int intValue = getNumberThree(this.timeArray, java.lang.Integer.valueOf((int) this.fingerX)).intValue();
            if (this.hashData.get(intValue + "") != null) {
                this.currBean = this.hashData.get(intValue + "");
                this.fingerX = this.hashData.get(intValue + "").x;
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
                this.fingerX = this.hashData.get(intValue2 + "").x;
            }
            postInvalidate();
        }
        com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.OnSelectedListener onSelectedListener = this.listener;
        if (onSelectedListener != null) {
            onSelectedListener.onSelected(this.currBean);
        }
        return true;
    }

    public void setData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean> data) {
        this.data.clear();
        this.data.addAll(data);
        for (com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean sleepDataBean : data) {
            if (sleepDataBean.getTotalTime() >= this.maxSleepTime) {
                this.maxSleepTime = sleepDataBean.getTotalTime();
            }
        }
        this.maxSleepTime += 60;
        int i = 31;
        if (data.size() > 0) {
            i = com.qcwireless.qc_utils.date.DateUtil.getDaysOfMonth(new com.qcwireless.qc_utils.date.DateUtil(data.get(0).getUnixTime(), true).toDate());
            this.hashData.clear();
        }
        int i2 = (this.width - (this.leftRightOffset * 2)) / (i - 1);
        for (int i3 = 0; i3 < data.size(); i3++) {
            com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean sleepDataBean2 = data.get(i3);
            int i4 = i3 * i2;
            sleepDataBean2.setX(this.leftRightOffset + i4);
            this.timeArray[i3] = this.leftRightOffset + i4;
            this.hashData.put((this.leftRightOffset + i4) + "", sleepDataBean2);
        }
        initXLabel(data, i);
        this.fingerXDefault = this.leftRightOffset + (com.qcwireless.qc_utils.date.DateUtil.getDayOfMonth() * i2);
        this.fingerX = this.fingerXDefault;
        int intValue = getNumberThree(this.timeArray, java.lang.Integer.valueOf((int) this.fingerX)).intValue();
        if (this.hashData.get(intValue + "") != null) {
            this.fingerX = this.hashData.get(intValue + "").x;
            this.currBean = this.hashData.get(intValue + "");
        }
        com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.OnSelectedListener onSelectedListener = this.listener;
        if (onSelectedListener != null) {
            onSelectedListener.onSelected(this.currBean);
        }
        postInvalidate();
    }

    public static class SleepDataBean {
        private int awake;
        private float awakeScale;
        private float deepScale;
        private int deepTime;
        private float lightScale;
        private int lightTime;
        private int totalTime;
        private long unixTime;
        private float x;
        private float y;

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

        public SleepDataBean(long unixTime, int totalTime, int deepTime, int lightTime, int awake, float deepScale, float lightScale, float awakeScale) {
            this.unixTime = unixTime;
            this.totalTime = totalTime;
            this.deepTime = deepTime;
            this.lightTime = lightTime;
            this.awake = awake;
            this.deepScale = deepScale;
            this.lightScale = lightScale;
            this.awakeScale = awakeScale;
        }

        public float getDeepScale() {
            return this.deepScale;
        }

        public void setDeepScale(float deepScale) {
            this.deepScale = deepScale;
        }

        public float getLightScale() {
            return this.lightScale;
        }

        public void setLightScale(float lightScale) {
            this.lightScale = lightScale;
        }

        public float getAwakeScale() {
            return this.awakeScale;
        }

        public void setAwakeScale(float awakeScale) {
            this.awakeScale = awakeScale;
        }

        public long getUnixTime() {
            return this.unixTime;
        }

        public void setUnixTime(long unixTime) {
            this.unixTime = unixTime;
        }

        public int getTotalTime() {
            return this.totalTime;
        }

        public void setTotalTime(int totalTime) {
            this.totalTime = totalTime;
        }

        public int getDeepTime() {
            return this.deepTime;
        }

        public void setDeepTime(int deepTime) {
            this.deepTime = deepTime;
        }

        public int getLightTime() {
            return this.lightTime;
        }

        public void setLightTime(int lightTime) {
            this.lightTime = lightTime;
        }

        public int getAwake() {
            return this.awake;
        }

        public void setAwake(int awake) {
            this.awake = awake;
        }
    }
}
