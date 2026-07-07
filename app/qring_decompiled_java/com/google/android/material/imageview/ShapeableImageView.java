package com.google.android.material.imageview;

/* loaded from: /tmp/dex/classes2.dex */
public class ShapeableImageView extends androidx.appcompat.widget.AppCompatImageView implements com.google.android.material.shape.Shapeable {
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_ShapeableImageView;
    private final android.graphics.Paint borderPaint;
    private final android.graphics.Paint clearPaint;
    private final android.graphics.RectF destination;
    private android.graphics.Path maskPath;
    private final android.graphics.RectF maskRect;
    private final android.graphics.Path path;
    private final com.google.android.material.shape.ShapeAppearancePathProvider pathProvider;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private android.content.res.ColorStateList strokeColor;
    private float strokeWidth;

    public ShapeableImageView(android.content.Context context) {
        this(context, null, 0);
    }

    public ShapeableImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShapeableImageView(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            int r0 = com.google.android.material.imageview.ShapeableImageView.DEF_STYLE_RES
            android.content.Context r6 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r6, r7, r8, r0)
            r5.<init>(r6, r7, r8)
            com.google.android.material.shape.ShapeAppearancePathProvider r6 = new com.google.android.material.shape.ShapeAppearancePathProvider
            r6.<init>()
            r5.pathProvider = r6
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r5.path = r6
            android.content.Context r6 = r5.getContext()
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.clearPaint = r1
            r2 = 1
            r1.setAntiAlias(r2)
            r3 = -1
            r1.setColor(r3)
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.DST_OUT
            r3.<init>(r4)
            r1.setXfermode(r3)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r5.destination = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r5.maskRect = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r5.maskPath = r1
            int[] r1 = com.google.android.material.R.styleable.ShapeableImageView
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r7, r1, r8, r0)
            int r3 = com.google.android.material.R.styleable.ShapeableImageView_strokeColor
            android.content.res.ColorStateList r3 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r1, r3)
            r5.strokeColor = r3
            int r3 = com.google.android.material.R.styleable.ShapeableImageView_strokeWidth
            r4 = 0
            int r1 = r1.getDimensionPixelSize(r3, r4)
            float r1 = (float) r1
            r5.strokeWidth = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.borderPaint = r1
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r3)
            r1.setAntiAlias(r2)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r6 = com.google.android.material.shape.ShapeAppearanceModel.builder(r6, r7, r8, r0)
            com.google.android.material.shape.ShapeAppearanceModel r6 = r6.build()
            r5.shapeAppearanceModel = r6
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 21
            if (r6 < r7) goto L88
            com.google.android.material.imageview.ShapeableImageView$OutlineProvider r6 = new com.google.android.material.imageview.ShapeableImageView$OutlineProvider
            r6.<init>()
            r5.setOutlineProvider(r6)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    protected void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.maskPath, this.clearPaint);
        drawStroke(canvas);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        updateShapeMask(i, i2);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        updateShapeMask(getWidth(), getHeight());
        invalidate();
    }

    @Override // com.google.android.material.shape.Shapeable
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    private void updateShapeMask(int i, int i2) {
        this.destination.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.pathProvider.calculatePath(this.shapeAppearanceModel, 1.0f, this.destination, this.path);
        this.maskPath.rewind();
        this.maskPath.addPath(this.path);
        this.maskRect.set(0.0f, 0.0f, i, i2);
        this.maskPath.addRect(this.maskRect, android.graphics.Path.Direction.CCW);
    }

    private void drawStroke(android.graphics.Canvas canvas) {
        if (this.strokeColor == null) {
            return;
        }
        this.borderPaint.setStrokeWidth(this.strokeWidth);
        int colorForState = this.strokeColor.getColorForState(getDrawableState(), this.strokeColor.getDefaultColor());
        if (this.strokeWidth <= 0.0f || colorForState == 0) {
            return;
        }
        this.borderPaint.setColor(colorForState);
        canvas.drawPath(this.path, this.borderPaint);
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(androidx.appcompat.content.res.AppCompatResources.getColorStateList(getContext(), i));
    }

    public android.content.res.ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    public void setStrokeWidth(float f) {
        if (this.strokeWidth != f) {
            this.strokeWidth = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public void setStrokeColor(android.content.res.ColorStateList colorStateList) {
        this.strokeColor = colorStateList;
        invalidate();
    }

    class OutlineProvider extends android.view.ViewOutlineProvider {
        private android.graphics.Rect rect = new android.graphics.Rect();

        OutlineProvider() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, android.graphics.Outline outline) {
            if (com.google.android.material.imageview.ShapeableImageView.this.shapeAppearanceModel == null || !com.google.android.material.imageview.ShapeableImageView.this.shapeAppearanceModel.isRoundRect(com.google.android.material.imageview.ShapeableImageView.this.destination)) {
                return;
            }
            com.google.android.material.imageview.ShapeableImageView.this.destination.round(this.rect);
            outline.setRoundRect(this.rect, com.google.android.material.imageview.ShapeableImageView.this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(com.google.android.material.imageview.ShapeableImageView.this.destination));
        }
    }
}
