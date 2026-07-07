package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class LoadSendView extends android.view.View implements skin.support.widget.SkinCompatSupportable {
    private static final java.lang.String TAG = "LoadSendView";
    private android.content.Context context;
    private android.graphics.RectF mCrop;
    private float mDegree;
    private float mDesti;
    private android.graphics.Paint mPaint;
    private android.graphics.RectF mRect;
    private float mStart;

    public LoadSendView(android.content.Context context) {
        super(context);
        this.mStart = 15.0f;
        this.context = context;
        init(context);
    }

    public LoadSendView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mStart = 15.0f;
        this.context = context;
        init(context);
    }

    public LoadSendView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mStart = 15.0f;
        this.context = context;
        init(context);
    }

    private void init(android.content.Context context) {
        this.mDesti = context.getResources().getDisplayMetrics().density;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setColor(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.watch_face_send_progressbar));
        this.mPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mPaint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        android.util.Log.i(TAG, "onSizeChanged.. width: " + getWidth());
        this.mRect = new android.graphics.RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        float f = this.mStart;
        float f2 = this.mDesti;
        this.mCrop = new android.graphics.RectF(f * f2, f * f2, getWidth() - (this.mStart * this.mDesti), getHeight() - (this.mStart * this.mDesti));
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipRect(this.mCrop);
        android.graphics.RectF rectF = this.mRect;
        float f = this.mDegree;
        canvas.drawArc(rectF, f - 90.0f, 360.0f - f, true, this.mPaint);
        canvas.restore();
    }

    public void updateUI(float degree) {
        this.mDegree = degree;
        postInvalidate();
    }

    public void applySkin() {
        this.mPaint.setColor(skin.support.content.res.SkinCompatResources.getColor(this.context, com.qcwireless.qcwatch.R.color.watch_face_send_progressbar));
    }
}
