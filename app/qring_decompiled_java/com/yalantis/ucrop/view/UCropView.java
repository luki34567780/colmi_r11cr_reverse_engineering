package com.yalantis.ucrop.view;

/* loaded from: classes3.dex */
public class UCropView extends android.widget.FrameLayout {
    private com.yalantis.ucrop.view.GestureCropImageView mGestureCropImageView;
    private final com.yalantis.ucrop.view.OverlayView mViewOverlay;

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public UCropView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UCropView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.view.LayoutInflater.from(context).inflate(com.yalantis.ucrop.R.layout.ucrop_view, (android.view.ViewGroup) this, true);
        this.mGestureCropImageView = (com.yalantis.ucrop.view.GestureCropImageView) findViewById(com.yalantis.ucrop.R.id.image_view_crop);
        com.yalantis.ucrop.view.OverlayView overlayView = (com.yalantis.ucrop.view.OverlayView) findViewById(com.yalantis.ucrop.R.id.view_overlay);
        this.mViewOverlay = overlayView;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.yalantis.ucrop.R.styleable.ucrop_UCropView);
        overlayView.processStyledAttributes(obtainStyledAttributes);
        this.mGestureCropImageView.processStyledAttributes(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        setListenersToViews();
    }

    private void setListenersToViews() {
        this.mGestureCropImageView.setCropBoundsChangeListener(new com.yalantis.ucrop.callback.CropBoundsChangeListener() { // from class: com.yalantis.ucrop.view.UCropView.1
            @Override // com.yalantis.ucrop.callback.CropBoundsChangeListener
            public void onCropAspectRatioChanged(float f) {
                com.yalantis.ucrop.view.UCropView.this.mViewOverlay.setTargetAspectRatio(f);
            }
        });
        this.mViewOverlay.setOverlayViewChangeListener(new com.yalantis.ucrop.callback.OverlayViewChangeListener() { // from class: com.yalantis.ucrop.view.UCropView.2
            @Override // com.yalantis.ucrop.callback.OverlayViewChangeListener
            public void onCropRectUpdated(android.graphics.RectF rectF) {
                com.yalantis.ucrop.view.UCropView.this.mGestureCropImageView.setCropRect(rectF);
            }

            @Override // com.yalantis.ucrop.callback.OverlayViewChangeListener
            public void postTranslate(float f, float f2) {
                com.yalantis.ucrop.view.UCropView.this.mGestureCropImageView.postTranslate(f, f2);
            }
        });
    }

    public com.yalantis.ucrop.view.GestureCropImageView getCropImageView() {
        return this.mGestureCropImageView;
    }

    public com.yalantis.ucrop.view.OverlayView getOverlayView() {
        return this.mViewOverlay;
    }

    public void resetCropImageView() {
        removeView(this.mGestureCropImageView);
        this.mGestureCropImageView = new com.yalantis.ucrop.view.GestureCropImageView(getContext());
        setListenersToViews();
        this.mGestureCropImageView.setCropRect(getOverlayView().getCropViewRect());
        addView(this.mGestureCropImageView, 0);
    }
}
