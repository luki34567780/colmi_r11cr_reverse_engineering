package com.luck.picture.lib.widget;

/* loaded from: /tmp/dex/classes2.dex */
public class MediumBoldTextView extends androidx.appcompat.widget.AppCompatTextView {
    private float mStrokeWidth;

    public MediumBoldTextView(android.content.Context context) {
        this(context, null);
    }

    public MediumBoldTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediumBoldTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mStrokeWidth = 0.6f;
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.luck.picture.lib.R.styleable.PictureMediumBoldTextView, i, 0);
        this.mStrokeWidth = obtainStyledAttributes.getFloat(com.luck.picture.lib.R.styleable.PictureMediumBoldTextView_stroke_Width, this.mStrokeWidth);
        obtainStyledAttributes.recycle();
    }

    protected void onDraw(android.graphics.Canvas canvas) {
        android.text.TextPaint paint = getPaint();
        float strokeWidth = paint.getStrokeWidth();
        float f = this.mStrokeWidth;
        if (strokeWidth != f) {
            paint.setStrokeWidth(f);
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        super.onDraw(canvas);
    }

    public void setStrokeWidth(float f) {
        this.mStrokeWidth = f;
        invalidate();
    }
}
