package com.luck.picture.lib.widget;

/* loaded from: /tmp/dex/classes2.dex */
public class RoundCornerRelativeLayout extends android.widget.RelativeLayout {
    private final float cornerSize;
    private final boolean isBottomNormal;
    private final boolean isTopNormal;
    private final android.graphics.RectF mRect;
    private final android.graphics.Path path;

    public RoundCornerRelativeLayout(android.content.Context context) {
        this(context, null);
    }

    public RoundCornerRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundCornerRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRect = new android.graphics.RectF();
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.luck.picture.lib.R.styleable.PictureRoundCornerRelativeLayout, i, 0);
        this.cornerSize = obtainStyledAttributes.getDimension(com.luck.picture.lib.R.styleable.PictureRoundCornerRelativeLayout_psCorners, 0.0f);
        this.isTopNormal = obtainStyledAttributes.getBoolean(com.luck.picture.lib.R.styleable.PictureRoundCornerRelativeLayout_psTopNormal, false);
        this.isBottomNormal = obtainStyledAttributes.getBoolean(com.luck.picture.lib.R.styleable.PictureRoundCornerRelativeLayout_psBottomNormal, false);
        obtainStyledAttributes.recycle();
        this.path = new android.graphics.Path();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.path.reset();
        this.mRect.right = i;
        this.mRect.bottom = i2;
        boolean z = this.isTopNormal;
        if (!z && !this.isBottomNormal) {
            android.graphics.Path path = this.path;
            android.graphics.RectF rectF = this.mRect;
            float f = this.cornerSize;
            path.addRoundRect(rectF, f, f, android.graphics.Path.Direction.CW);
            return;
        }
        if (z) {
            float f2 = this.cornerSize;
            this.path.addRoundRect(this.mRect, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f2, f2, f2, f2}, android.graphics.Path.Direction.CW);
        }
        if (this.isBottomNormal) {
            float f3 = this.cornerSize;
            this.path.addRoundRect(this.mRect, new float[]{f3, f3, f3, f3, 0.0f, 0.0f, 0.0f, 0.0f}, android.graphics.Path.Direction.CW);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
