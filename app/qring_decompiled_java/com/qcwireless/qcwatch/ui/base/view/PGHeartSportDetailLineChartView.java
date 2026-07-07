package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class PGHeartSportDetailLineChartView extends android.view.View implements skin.support.widget.SkinCompatSupportable {
    protected int bottomOffset;
    protected int colorBall;
    protected int colorBgSelected;
    protected int colorLine;
    protected int colorValue;
    protected int colorValueSelected;
    int[] colors;
    int[] colorsLine;
    private android.content.Context context;
    protected int diameterDefault;
    private android.graphics.Paint dotPaint;
    private long endTime;
    private android.graphics.Path fillPath;
    private com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView.HeartDataBean firstBean;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView.HeartDataBean> heartList;
    protected int height;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView.XTextChange> labelsList;
    private int leftRightOffset;
    protected int lineHeight;
    protected android.graphics.Paint linePaint;
    private android.graphics.Paint paint;
    private android.graphics.Paint paintBottom;
    private android.graphics.Paint paintFill;
    private android.graphics.Paint paintY;
    private android.graphics.Path path;
    float[] position;
    private long startTime;
    protected int textDownColor;
    private int textDownColorId;
    protected android.graphics.Paint textDownPaint;
    protected float textSelectedSize;
    protected float textSize;
    protected int width;
    private int xMax;
    private int xMin;
    private android.graphics.Path yLinePath;
    private int yMax;

    public PGHeartSportDetailLineChartView(android.content.Context context) {
        super(context);
        this.xMax = 1440;
        this.xMin = 0;
        this.yMax = 220;
        this.labelsList = new java.util.ArrayList();
        this.heartList = new java.util.ArrayList();
        this.leftRightOffset = 30;
        this.position = new float[]{0.1f, 0.5f, 2.0f};
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.bottomOffset = 50;
        this.diameterDefault = 30;
        this.textSize = 12.0f;
        this.textSelectedSize = 14.0f;
        this.context = context;
        init(context, null);
    }

    public PGHeartSportDetailLineChartView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.xMax = 1440;
        this.xMin = 0;
        this.yMax = 220;
        this.labelsList = new java.util.ArrayList();
        this.heartList = new java.util.ArrayList();
        this.leftRightOffset = 30;
        this.position = new float[]{0.1f, 0.5f, 2.0f};
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.bottomOffset = 50;
        this.diameterDefault = 30;
        this.textSize = 12.0f;
        this.textSelectedSize = 14.0f;
        this.context = context;
        init(context, attrs);
    }

    public PGHeartSportDetailLineChartView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.xMax = 1440;
        this.xMin = 0;
        this.yMax = 220;
        this.labelsList = new java.util.ArrayList();
        this.heartList = new java.util.ArrayList();
        this.leftRightOffset = 30;
        this.position = new float[]{0.1f, 0.5f, 2.0f};
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.bottomOffset = 50;
        this.diameterDefault = 30;
        this.textSize = 12.0f;
        this.textSelectedSize = 14.0f;
        this.context = context;
        init(context, attrs);
    }

    public PGHeartSportDetailLineChartView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.xMax = 1440;
        this.xMin = 0;
        this.yMax = 220;
        this.labelsList = new java.util.ArrayList();
        this.heartList = new java.util.ArrayList();
        this.leftRightOffset = 30;
        this.position = new float[]{0.1f, 0.5f, 2.0f};
        this.colors = new int[0];
        this.colorsLine = new int[0];
        this.bottomOffset = 50;
        this.diameterDefault = 30;
        this.textSize = 12.0f;
        this.textSelectedSize = 14.0f;
        this.context = context;
        init(context, attrs);
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        this.colors = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_sport_detail_1), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_sport_detail_2), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_sport_detail_3)};
        this.colorsLine = new int[]{androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_sport_detail_3), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_sport_detail_1), androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_sport_detail_3)};
        android.graphics.Paint paint = new android.graphics.Paint();
        this.paint = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.paint.setAntiAlias(true);
        this.paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.paint.setPathEffect(new android.graphics.CornerPathEffect(10.0f));
        this.paint.setColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.q_view_sport_detail_2));
        this.paint.setStrokeWidth(dp2px(context, 0.5f));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.paintFill = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.paintFill.setStyle(android.graphics.Paint.Style.FILL);
        this.paintFill.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.paintFill.setPathEffect(new android.graphics.CornerPathEffect(10.0f));
        this.paintFill.setAntiAlias(true);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.paintBottom = paint3;
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        this.paintBottom.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.paintBottom.setAntiAlias(true);
        this.paintBottom.setStrokeWidth(dp2px(context, 1.0f));
        this.paintBottom.setColor(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.pg_home_heart_14));
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
        applyTextColor();
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
        this.diameterDefault = (int) dp2px(this.context, 100.0f);
        filterData(this.heartList);
        initXLabels();
        postInvalidate();
    }

    private void initAttr(android.content.Context context, android.util.AttributeSet attrs) {
        if (attrs != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.qcwireless.qcwatch.R.styleable.qc_chart);
            this.colorBall = obtainStyledAttributes.getColor(1, -16777216);
            this.colorLine = obtainStyledAttributes.getColor(4, -16777216);
            this.textDownColor = obtainStyledAttributes.getColor(8, -16777216);
            this.textDownColorId = obtainStyledAttributes.getResourceId(8, 0);
            this.colorValue = obtainStyledAttributes.getColor(5, -16777216);
            this.colorValueSelected = obtainStyledAttributes.getColor(6, -1);
            this.colorBgSelected = obtainStyledAttributes.getColor(3, -16777216);
            this.lineHeight = (int) dp2px(context, obtainStyledAttributes.getInteger(7, 185));
            this.bottomOffset = (int) dp2px(context, obtainStyledAttributes.getInteger(0, 20));
            obtainStyledAttributes.recycle();
            initPublic(context, attrs);
            applyTextColor();
        }
    }

    private void applyTextColor() {
        int checkResourceId = skin.support.widget.SkinCompatHelper.checkResourceId(this.textDownColorId);
        if (checkResourceId != 0) {
            this.textDownPaint.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, checkResourceId));
        }
    }

    public void initPublic(android.content.Context context, android.util.AttributeSet attrs) {
        this.context = context;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.linePaint = paint;
        paint.setAntiAlias(true);
        this.linePaint.setStyle(android.graphics.Paint.Style.FILL);
        this.linePaint.setColor(this.colorValue);
        this.linePaint.setStrokeWidth(2.0f);
        this.linePaint.setTextSize(this.textSelectedSize);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.textDownPaint = paint2;
        paint2.setAntiAlias(true);
        this.textDownPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.textDownPaint.setStrokeWidth(2.0f);
        this.textDownPaint.setTextSize(dp2px(context, 8.0f));
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        for (com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView.XTextChange xTextChange : this.labelsList) {
            canvas.drawText(xTextChange.label, xTextChange.x, xTextChange.y, this.textDownPaint);
        }
        int i = this.width;
        this.paintFill.setShader(new android.graphics.LinearGradient(i, 0.0f, i, this.height - (this.bottomOffset * 2), this.colors, this.position, android.graphics.Shader.TileMode.CLAMP));
        canvas.drawPath(this.fillPath, this.paintFill);
        canvas.drawPath(this.path, this.paint);
        for (int i2 = 0; i2 < this.heartList.size(); i2++) {
            if (this.heartList.get(i2).isBegin()) {
                canvas.drawCircle(r1.x, r1.y, dp2px(this.context, 0.05f), this.paint);
            }
        }
        int i3 = this.leftRightOffset;
        int i4 = this.height;
        int i5 = this.bottomOffset;
        canvas.drawLine(i3, i4 - i5, this.width - i3, i4 - i5, this.paintBottom);
    }

    private void initXLabels() {
        if (this.startTime <= 0 || this.endTime <= 0) {
            return;
        }
        this.labelsList.clear();
        int i = (this.width - (this.leftRightOffset * 2)) / 8;
        com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView.XTextChange xTextChange = new com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView.XTextChange();
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("HH:mm", java.util.Locale.getDefault());
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("Asia/Shanghai"));
        xTextChange.setLabel(simpleDateFormat.format(new java.util.Date(this.startTime * 1000)));
        xTextChange.setX(this.leftRightOffset);
        xTextChange.setY(this.height);
        this.labelsList.add(xTextChange);
        com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView.XTextChange xTextChange2 = new com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView.XTextChange();
        xTextChange2.setLabel(simpleDateFormat.format(new java.util.Date(this.endTime * 1000)));
        xTextChange2.setX((this.width - getTextWidth(this.textDownPaint, "00:00")) - this.leftRightOffset);
        xTextChange2.setY(this.height);
        this.labelsList.add(xTextChange2);
    }

    public void setData(long stat, long end, java.util.List<com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView.HeartDataBean> list) {
        this.heartList = list;
        this.startTime = stat;
        this.endTime = end;
        initXLabels();
        if (list.size() > 0) {
            this.xMin = list.get(0).getMin();
            int min = list.get(list.size() - 1).getMin();
            this.xMax = min;
            if (this.xMin == min) {
                this.xMax = 2;
                this.xMin = 1;
            }
            this.path.reset();
            this.fillPath.reset();
            if (this.width > 0) {
                filterData(list);
            }
        } else {
            this.path.reset();
            this.fillPath.reset();
            this.startTime = 0L;
            this.endTime = 0L;
            this.labelsList.clear();
        }
        postInvalidate();
    }

    private void filterData(java.util.List<com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView.HeartDataBean> list) {
        for (int i = 0; i < list.size(); i++) {
            com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView.HeartDataBean heartDataBean = list.get(i);
            int min = heartDataBean.getMin();
            int i2 = this.xMin;
            int i3 = this.width;
            int i4 = this.leftRightOffset;
            heartDataBean.x = (((min - i2) * (i3 - (i4 * 2))) / (this.xMax - i2)) + i4;
            heartDataBean.y = (this.lineHeight - this.bottomOffset) - ((heartDataBean.getValue() * (this.height - this.bottomOffset)) / this.yMax);
            if (i <= 0) {
                heartDataBean.setBegin(true);
            } else if (list.get(i - 1).value == 0 && list.get(i).value > 0) {
                heartDataBean.begin = true;
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.heartList.size(); i6++) {
            com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView.HeartDataBean heartDataBean2 = this.heartList.get(0);
            com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView.HeartDataBean heartDataBean3 = this.heartList.get(i6);
            if (heartDataBean3.begin) {
                this.firstBean = heartDataBean3;
                this.path.moveTo(heartDataBean3.x, heartDataBean3.y);
                this.fillPath.moveTo(heartDataBean3.x, heartDataBean3.y);
                this.path.lineTo(heartDataBean3.x, heartDataBean3.y);
                this.fillPath.lineTo(heartDataBean3.x, heartDataBean3.y);
            } else {
                if (heartDataBean3.value > 0) {
                    this.path.lineTo(heartDataBean3.x, heartDataBean3.y);
                    this.fillPath.lineTo(heartDataBean3.x, heartDataBean3.y);
                    i5 = heartDataBean3.x;
                }
                if ((i6 > 0 && i6 < this.heartList.size() - 1 && list.get(i6 - 1).value > 0 && list.get(i6).value == 0) || i6 == this.heartList.size() - 1) {
                    int i7 = i6 - 1;
                    com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView.HeartDataBean heartDataBean4 = (list.get(i7).value <= 0 || list.get(i6).value != 0) ? heartDataBean3 : list.get(i7);
                    if (heartDataBean4.value == 0 && this.firstBean.getX() != heartDataBean2.getX()) {
                        heartDataBean4 = this.firstBean;
                        this.fillPath.lineTo(heartDataBean4.x + 5, heartDataBean4.y);
                    }
                    if (heartDataBean3.value > 0) {
                        this.fillPath.lineTo(heartDataBean4.x, this.height + this.bottomOffset);
                    } else if (heartDataBean4.x > this.firstBean.x) {
                        this.fillPath.lineTo(i5, this.height + this.bottomOffset);
                    }
                    this.fillPath.lineTo(this.firstBean.x, this.height + this.bottomOffset);
                    this.fillPath.lineTo(this.firstBean.x, heartDataBean4.y);
                    this.fillPath.close();
                }
            }
        }
    }

    public int getMySize(int defaultSize, int measureSpec) {
        int mode = android.view.View.MeasureSpec.getMode(measureSpec);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? android.view.View.MeasureSpec.getSize(measureSpec) : defaultSize;
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

    public float dp2px(android.content.Context context, float dp) {
        return (dp * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public void applySkin() {
        applyTextColor();
    }

    public static class HeartDataBean {
        private boolean begin;
        private int min;
        private int value;
        private int x;
        private int y;

        public HeartDataBean(int min, int value, boolean begin) {
            this.min = min;
            this.value = value;
            this.begin = begin;
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
