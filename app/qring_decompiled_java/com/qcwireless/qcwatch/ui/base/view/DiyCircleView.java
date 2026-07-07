package com.qcwireless.qcwatch.ui.base.view;

/* loaded from: /tmp/dex/classes2.dex */
public class DiyCircleView extends android.widget.FrameLayout {
    private float mRadius;

    public DiyCircleView(android.content.Context context) {
        super(context);
    }

    public DiyCircleView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
    }

    public DiyCircleView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        android.graphics.Path path = new android.graphics.Path();
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f = this.mRadius;
        path.addRoundRect(rectF, f, f, android.graphics.Path.Direction.CW);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            canvas.clipPath(path);
        } else {
            canvas.clipPath(path, android.graphics.Region.Op.REPLACE);
        }
        super.dispatchDraw(canvas);
    }

    public void setRadius(int radius) {
        this.mRadius = radius;
        postInvalidate();
    }
}
