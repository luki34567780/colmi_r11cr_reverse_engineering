package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QHeartLineChartView extends com.qcwireless.qcwatch.ui.base.view.BaseChartView {
    int[] colors;
    int[] colorsLine;
    private com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean currBean;
    private android.graphics.Paint dotPaint;
    private android.graphics.Path fillPath;
    private com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean firstBean;
    private java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> hashData;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> heartList;
    private int interval;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.BaseChartView.XTextChange> labelsList;
    private int leftRightOffset;
    private com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.OnSelectedListener listener;
    private android.graphics.Paint paint;
    private android.graphics.Paint paintFill;
    private android.graphics.Paint paintY;
    private android.graphics.Path path;
    float[] position;
    private int[] timeArray;
    private java.util.List<java.lang.Integer> timeArrayList;
    private boolean today;
    private int xMax;
    private android.graphics.Path yLinePath;
    private int yMax;

    public interface OnSelectedListener {
        void onSelected(com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean bean);
    }

    private void initTimeStamp() {
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public void setSelectedListener(com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.OnSelectedListener listener) {
        this.listener = listener;
    }

    public QHeartLineChartView(android.content.Context context) {
        super(context);
        this.xMax = 1440;
        this.yMax = 240;
        this.timeArray = new int[288];
        this.timeArrayList = new java.util.ArrayList();
        this.labelsList = new java.util.ArrayList();
        this.heartList = new java.util.ArrayList();
        this.leftRightOffset = 100;
        this.position = new float[]{0.1f, 0.1f, 2.0f};
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.hashData = new androidx.collection.ArrayMap();
        this.interval = 5;
        init(context, null);
    }

    public QHeartLineChartView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.xMax = 1440;
        this.yMax = 240;
        this.timeArray = new int[288];
        this.timeArrayList = new java.util.ArrayList();
        this.labelsList = new java.util.ArrayList();
        this.heartList = new java.util.ArrayList();
        this.leftRightOffset = 100;
        this.position = new float[]{0.1f, 0.1f, 2.0f};
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.hashData = new androidx.collection.ArrayMap();
        this.interval = 5;
        init(context, attrs);
    }

    public QHeartLineChartView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.xMax = 1440;
        this.yMax = 240;
        this.timeArray = new int[288];
        this.timeArrayList = new java.util.ArrayList();
        this.labelsList = new java.util.ArrayList();
        this.heartList = new java.util.ArrayList();
        this.leftRightOffset = 100;
        this.position = new float[]{0.1f, 0.1f, 2.0f};
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.hashData = new androidx.collection.ArrayMap();
        this.interval = 5;
        init(context, attrs);
    }

    public QHeartLineChartView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.xMax = 1440;
        this.yMax = 240;
        this.timeArray = new int[288];
        this.timeArrayList = new java.util.ArrayList();
        this.labelsList = new java.util.ArrayList();
        this.heartList = new java.util.ArrayList();
        this.leftRightOffset = 100;
        this.position = new float[]{0.1f, 0.1f, 2.0f};
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.hashData = new androidx.collection.ArrayMap();
        this.interval = 5;
        init(context, attrs);
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        this.colors = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_heart_4), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_heart_5), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_heart_6)};
        this.colorsLine = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_heart_6), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_heart_4), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_heart_6)};
        android.graphics.Paint paint = new android.graphics.Paint();
        this.paint = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.paint.setAntiAlias(true);
        this.paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.paint.setPathEffect(new android.graphics.CornerPathEffect(10.0f));
        this.paint.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_heart_7));
        this.paint.setStrokeWidth(dp2px(context, 0.5f));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.paintFill = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.paintFill.setAntiAlias(true);
        this.paintFill.setPathEffect(new android.graphics.CornerPathEffect(10.0f));
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.paintY = paint3;
        paint3.setAntiAlias(true);
        this.paintY.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_heart_8));
        this.paintY.setStrokeWidth(dp2px(context, 0.05f));
        this.paintY.setPathEffect(new android.graphics.DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
        this.paintY.setStyle(android.graphics.Paint.Style.STROKE);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.dotPaint = paint4;
        paint4.setAntiAlias(true);
        this.dotPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.dotPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.path = new android.graphics.Path();
        this.fillPath = new android.graphics.Path();
        this.yLinePath = new android.graphics.Path();
        initAttr(context, attrs);
        initPublic(context, attrs);
        initTimeStamp();
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
        setData(this.heartList, this.today);
        initXLabels();
        postInvalidate();
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
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.mPaddingStart = getPaddingStart();
        this.mPaddingEnd = getPaddingEnd();
        this.mPaddingTop = getPaddingTop();
        this.mPaddingBottom = getPaddingBottom();
        this.bezierHeight = 0.0f;
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
        this.paintFill.setShader(new android.graphics.LinearGradient(this.width, 0.0f, this.width, this.height - (this.bottomOffset * 2), this.colors, this.position, android.graphics.Shader.TileMode.CLAMP));
        if (this.heartList.size() > 1) {
            canvas.drawPath(this.fillPath, this.paintFill);
            canvas.drawPath(this.path, this.paint);
        }
        for (int i = 0; i < this.heartList.size(); i++) {
            if (this.heartList.get(i).isBegin()) {
                canvas.drawCircle(r2.x, r2.y, dp2px(this.context, 0.1f), this.paint);
            }
        }
        this.linePaint.setShader(new android.graphics.LinearGradient(this.fingerX, this.lineHeight - this.bottomOffset, this.fingerX, 60.0f, this.colorsLine, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        this.linePaint.setStrokeWidth(3.0f);
        canvas.drawPath(this.yLinePath, this.paintY);
        this.textDownPaint.setTextSize(dp2px(this.context, 10.0f));
        canvas.drawText("40", this.leftRightOffset - getTextWidth(this.textDownPaint, "000"), ((this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 40) / this.yMax)) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
        canvas.drawText("85", this.leftRightOffset - getTextWidth(this.textDownPaint, "000"), ((this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 85) / this.yMax)) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
        canvas.drawText("130", this.leftRightOffset - getTextWidth(this.textDownPaint, "0000"), ((this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 130) / this.yMax)) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
        canvas.drawText("175", this.leftRightOffset - getTextWidth(this.textDownPaint, "0000"), ((this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 175) / this.yMax)) + (getTextHeight(this.textDownPaint, "00") / 2.0f), this.textDownPaint);
        canvas.drawLine(this.fingerX, this.lineHeight - this.bottomOffset, this.fingerX, 60.0f, this.linePaint);
        if (this.currBean != null) {
            this.dotPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.color_FFFFFF));
            canvas.drawCircle(this.currBean.x, this.currBean.y + dp2px(this.context, 2.0f), dp2px(this.context, 4.0f), this.dotPaint);
            this.dotPaint.setColor(androidx.core.content.ContextCompat.getColor(this.context, com.qcwireless.qcwatch.R.color.q_view_heart_2));
            canvas.drawCircle(this.currBean.x, this.currBean.y + dp2px(this.context, 2.0f), dp2px(this.context, 3.0f), this.dotPaint);
        }
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
        xTextChange5.setX((this.leftRightOffset + (i * 8)) - (getTextWidth(this.textDownPaint, "00:00") / 2.0f));
        xTextChange5.setY(this.lineHeight - (this.textSize / 2.0f));
        xTextChange5.setMin(this.leftRightOffset + i4);
        xTextChange5.setMax(this.leftRightOffset + (i * 9));
        this.labelsList.add(xTextChange5);
    }

    public void setData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> list, boolean today) {
        this.today = today;
        initTimeStamp();
        this.heartList = list;
        this.currBean = null;
        this.timeArrayList.clear();
        this.path.reset();
        this.fillPath.reset();
        this.hashData.clear();
        if (this.width > 0) {
            filterData(list, today);
        }
        postInvalidate();
    }

    private void filterData(java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> list, boolean today) {
        for (int i = 0; i < 288; i++) {
            this.timeArrayList.add(java.lang.Integer.valueOf(i * 5));
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean = list.get(i2);
            this.timeArrayList.add(java.lang.Integer.valueOf(heartDataBean.getMin()));
            int min = heartDataBean.getMin();
            int i3 = this.width;
            int i4 = this.leftRightOffset;
            heartDataBean.x = ((min * (i3 - (i4 * 2))) / this.xMax) + i4;
            heartDataBean.y = (this.lineHeight - this.bottomOffset) - ((heartDataBean.getValue() * (this.height - this.bottomOffset)) / this.yMax);
            if (i2 <= 0) {
                heartDataBean.setBegin(true);
            }
            this.hashData.put(heartDataBean.getMin() + "", heartDataBean);
        }
        this.timeArray = new int[this.timeArrayList.size()];
        for (int i5 = 0; i5 < this.timeArrayList.size(); i5++) {
            this.timeArray[i5] = this.timeArrayList.get(i5).intValue();
        }
        for (int i6 = 0; i6 < this.heartList.size(); i6++) {
            com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean2 = this.heartList.get(i6);
            if (heartDataBean2.value > 35 && heartDataBean2.value < 220) {
                this.hashData.put(heartDataBean2.getMin() + "", heartDataBean2);
                if (heartDataBean2.isBegin()) {
                    this.firstBean = heartDataBean2;
                    this.path.moveTo(heartDataBean2.x, heartDataBean2.y);
                    this.fillPath.moveTo(heartDataBean2.x, heartDataBean2.y);
                    this.path.lineTo(heartDataBean2.x, heartDataBean2.y);
                    this.fillPath.lineTo(heartDataBean2.x, heartDataBean2.y);
                } else {
                    this.path.lineTo(heartDataBean2.x, heartDataBean2.y);
                    this.fillPath.lineTo(heartDataBean2.x, heartDataBean2.y);
                    if ((i6 < this.heartList.size() - 1 && this.heartList.get(i6 + 1).isBegin()) || i6 == this.heartList.size() - 1) {
                        this.fillPath.lineTo(heartDataBean2.x, this.height - this.bottomOffset);
                        this.fillPath.lineTo(this.firstBean.x, this.height - this.bottomOffset);
                        this.fillPath.lineTo(this.firstBean.x, heartDataBean2.y);
                        this.fillPath.close();
                    }
                }
            }
        }
        this.yLinePath.moveTo(this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 40) / this.yMax));
        this.yLinePath.lineTo(this.width - this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 40) / this.yMax));
        this.yLinePath.moveTo(this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 85) / this.yMax));
        this.yLinePath.lineTo(this.width - this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 85) / this.yMax));
        this.yLinePath.moveTo(this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 130) / this.yMax));
        this.yLinePath.lineTo(this.width - this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 130) / this.yMax));
        this.yLinePath.moveTo(this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 175) / this.yMax));
        this.yLinePath.lineTo(this.width - this.leftRightOffset, (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 175) / this.yMax));
        if (this.heartList.size() > 0) {
            if (today) {
                try {
                    if (this.heartList.size() == 1) {
                        int min2 = this.heartList.get(0).getMin();
                        int i7 = this.width;
                        int i8 = this.leftRightOffset;
                        this.fingerX = ((min2 * (i7 - (i8 * 2))) / 1440) + i8;
                        com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean3 = this.heartList.get(0);
                        this.currBean = heartDataBean3;
                        com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.OnSelectedListener onSelectedListener = this.listener;
                        if (onSelectedListener != null) {
                            onSelectedListener.onSelected(heartDataBean3);
                        }
                    } else {
                        java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> list2 = this.heartList;
                        this.fingerXDefault = list2.get(list2.size() - 1).x;
                        int[] iArr = this.timeArray;
                        java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> list3 = this.heartList;
                        int intValue = getNumberThree(iArr, java.lang.Integer.valueOf(list3.get(list3.size() - 1).min)).intValue();
                        int i9 = this.width;
                        int i10 = this.leftRightOffset;
                        this.fingerX = (((i9 - (i10 * 2)) * intValue) / 1440) + i10;
                        if (this.listener != null) {
                            com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean4 = this.hashData.get(intValue + "");
                            this.currBean = heartDataBean4;
                            this.listener.onSelected(heartDataBean4);
                        }
                    }
                } catch (java.lang.Exception e) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, e.getMessage());
                }
            } else {
                this.fingerXDefault = 720.0f;
                int intValue2 = getNumberThree(this.timeArray, java.lang.Integer.valueOf((int) this.fingerXDefault)).intValue();
                int i11 = this.width;
                int i12 = this.leftRightOffset;
                this.fingerX = (((i11 - (i12 * 2)) * intValue2) / 1440) + i12;
                if (this.listener != null) {
                    com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean5 = this.hashData.get(intValue2 + "");
                    this.currBean = heartDataBean5;
                    this.listener.onSelected(heartDataBean5);
                }
            }
        } else if (today) {
            if (this.listener != null) {
                int todayMinNoPlus = new com.oudmon.ble.base.util.DateUtil().getTodayMinNoPlus();
                com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean6 = new com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean(todayMinNoPlus, 0, false, 5);
                this.currBean = heartDataBean6;
                int i13 = this.width;
                int i14 = this.leftRightOffset;
                heartDataBean6.x = (((i13 - (i14 * 2)) * todayMinNoPlus) / this.xMax) + i14;
                this.currBean.y = (this.lineHeight - this.bottomOffset) - ((todayMinNoPlus * (this.height - this.bottomOffset)) / this.yMax);
                this.fingerX = this.currBean.x;
                this.listener.onSelected(this.currBean);
            }
        } else if (this.listener != null) {
            com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean7 = new com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean(720, 0, false, 5);
            this.currBean = heartDataBean7;
            int i15 = this.width;
            int i16 = this.leftRightOffset;
            heartDataBean7.x = (((i15 - (i16 * 2)) * 720) / this.xMax) + i16;
            this.currBean.y = (this.lineHeight - this.bottomOffset) - (((this.height - this.bottomOffset) * 720) / this.yMax);
            this.fingerX = this.currBean.x;
            this.listener.onSelected(this.currBean);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            this.fingerX = event.getX();
            getParent().requestDisallowInterceptTouchEvent(true);
            this.animatorFingerIn.start();
            this.valueSelected = (int) ((this.fingerX * 1440.0f) / this.width);
            int intValue = getNumberThree(this.timeArray, java.lang.Integer.valueOf(this.valueSelected)).intValue();
            int i = this.width;
            int i2 = this.leftRightOffset;
            this.fingerX = (((i - (i2 * 2)) * intValue) / 1440) + i2;
            com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean = this.hashData.get(intValue + "");
            this.currBean = heartDataBean;
            com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.OnSelectedListener onSelectedListener = this.listener;
            if (onSelectedListener != null) {
                if (heartDataBean == null) {
                    onSelectedListener.onSelected(new com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean(intValue, 0, false, 5));
                } else {
                    onSelectedListener.onSelected(heartDataBean);
                }
            }
            postInvalidate();
        } else if (action == 1) {
            this.animatorFingerOut.start();
        } else if (action == 2) {
            this.fingerX = event.getX();
            this.valueSelected = (int) ((this.fingerX * 1440.0f) / this.width);
            int intValue2 = getNumberThree(this.timeArray, java.lang.Integer.valueOf(this.valueSelected)).intValue();
            int i3 = this.width;
            int i4 = this.leftRightOffset;
            this.fingerX = (((i3 - (i4 * 2)) * intValue2) / 1440) + i4;
            com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean2 = this.hashData.get(intValue2 + "");
            this.currBean = heartDataBean2;
            com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.OnSelectedListener onSelectedListener2 = this.listener;
            if (onSelectedListener2 != null) {
                if (heartDataBean2 == null) {
                    onSelectedListener2.onSelected(new com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean(intValue2, 0, false, 5));
                } else {
                    onSelectedListener2.onSelected(heartDataBean2);
                }
            }
            postInvalidate();
        }
        return true;
    }

    public static class HeartDataBean {
        private boolean begin;
        private int min;
        private int range;
        private long unixTime;
        private int value;
        public int x;
        public int y;

        public HeartDataBean(int min, int value, boolean begin, int range) {
            this.min = min;
            this.value = value;
            this.begin = begin;
            this.range = range;
        }

        public long getUnixTime() {
            return this.unixTime;
        }

        public void setUnixTime(long unixTime) {
            this.unixTime = unixTime;
        }

        public int getMin() {
            return this.min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getValue() {
            return this.value;
        }

        public void setValue(int value) {
            this.value = value;
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

        public boolean isBegin() {
            return this.begin;
        }

        public void setBegin(boolean begin) {
            this.begin = begin;
        }

        public int getRange() {
            return this.range;
        }

        public void setRange(int range) {
            this.range = range;
        }
    }
}
