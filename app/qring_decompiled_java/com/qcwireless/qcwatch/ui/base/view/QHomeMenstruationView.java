package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class QHomeMenstruationView extends android.view.View {
    private android.content.Context context;
    private int height;
    private int maxHeight;
    private int moveX;
    private android.graphics.Paint paint;
    private int type;
    private int width;

    public QHomeMenstruationView(android.content.Context context) {
        super(context);
        this.type = -1;
        this.context = context;
        initView();
    }

    public QHomeMenstruationView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.type = -1;
        this.context = context;
        initView();
    }

    public QHomeMenstruationView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.type = -1;
        this.context = context;
        initView();
    }

    public QHomeMenstruationView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.type = -1;
        this.context = context;
        initView();
    }

    private void initView() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.paint.setStyle(android.graphics.Paint.Style.FILL);
        this.paint.setStrokeWidth(dp2px(this.context, 12.0f));
        this.maxHeight = (int) dp2px(this.context, 30.0f);
    }

    public void setType(int type) {
        int i = (this.width - 40) / 30;
        this.type = type;
        if (type != 0) {
            if (type == 1) {
                this.moveX = ((i * 11) + (i / 2)) - 20;
            } else if (type == 2 || type == 3) {
                this.moveX = ((i * 4) + (i / 2)) - 20;
            } else if (type != 4) {
                this.moveX = -20;
            }
            postInvalidate();
        }
        this.moveX = ((i * 23) + (i / 2)) - 20;
        postInvalidate();
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int i = (this.width - 40) / 30;
        this.paint.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.menstruation_show_2));
        float f = i * 8;
        canvas.drawRect(new android.graphics.RectF(40.0f, 40.0f, f, this.maxHeight), this.paint);
        this.paint.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.menstruation_show_4));
        float f2 = i * 15;
        canvas.drawRect(new android.graphics.RectF(f2, 40.0f, i * 26, this.maxHeight), this.paint);
        this.paint.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.menstruation_show_3));
        canvas.drawRect(new android.graphics.RectF(f, 40.0f, f2, this.maxHeight), this.paint);
        this.paint.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.menstruation_show_2));
        canvas.drawRoundRect(new android.graphics.RectF(20.0f, 40.0f, i * 6, this.maxHeight), 10.0f, 10.0f, this.paint);
        this.paint.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.menstruation_show_4));
        canvas.drawRoundRect(new android.graphics.RectF(i * 20, 40.0f, i * 30, this.maxHeight), 10.0f, 10.0f, this.paint);
        if (this.moveX > 0) {
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource(getResources(), com.qcwireless.qcwatch.R.mipmap.menstruation_move);
            int i2 = this.moveX;
            canvas.drawBitmap(decodeResource, (android.graphics.Rect) null, new android.graphics.Rect(i2, 0, decodeResource.getWidth() + i2, decodeResource.getHeight()), this.paint);
            return;
        }
        setType(this.type);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.width = getMySize(200, widthMeasureSpec);
        if (getLayoutParams().height == -2) {
            this.height = (int) dp2px(this.context, 20.0f);
        } else {
            this.height = getMySize(200, heightMeasureSpec);
        }
        setMeasuredDimension(this.width, this.height);
        postInvalidate();
    }

    public float dp2px(android.content.Context context, float dp) {
        return (dp * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public int getMySize(int defaultSize, int measureSpec) {
        int mode = android.view.View.MeasureSpec.getMode(measureSpec);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? android.view.View.MeasureSpec.getSize(measureSpec) : defaultSize;
    }
}
