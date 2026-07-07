package com.qcwireless.qcwatch.ui.base.imagepicker.cropper;

/* loaded from: /tmp/dex/classes2.dex */
final class CropImageAnimation extends android.view.animation.Animation implements android.view.animation.Animation.AnimationListener {
    private final com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView mCropOverlayView;
    private final android.widget.ImageView mImageView;
    private final float[] mStartBoundPoints = new float[8];
    private final float[] mEndBoundPoints = new float[8];
    private final android.graphics.RectF mStartCropWindowRect = new android.graphics.RectF();
    private final android.graphics.RectF mEndCropWindowRect = new android.graphics.RectF();
    private final float[] mStartImageMatrix = new float[9];
    private final float[] mEndImageMatrix = new float[9];
    private final android.graphics.RectF mAnimRect = new android.graphics.RectF();
    private final float[] mAnimPoints = new float[8];
    private final float[] mAnimMatrix = new float[9];

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }

    public CropImageAnimation(android.widget.ImageView cropImageView, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropOverlayView cropOverlayView) {
        this.mImageView = cropImageView;
        this.mCropOverlayView = cropOverlayView;
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    public void setStartState(float[] boundPoints, android.graphics.Matrix imageMatrix) {
        reset();
        java.lang.System.arraycopy(boundPoints, 0, this.mStartBoundPoints, 0, 8);
        this.mStartCropWindowRect.set(this.mCropOverlayView.getCropWindowRect());
        imageMatrix.getValues(this.mStartImageMatrix);
    }

    public void setEndState(float[] boundPoints, android.graphics.Matrix imageMatrix) {
        java.lang.System.arraycopy(boundPoints, 0, this.mEndBoundPoints, 0, 8);
        this.mEndCropWindowRect.set(this.mCropOverlayView.getCropWindowRect());
        imageMatrix.getValues(this.mEndImageMatrix);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float interpolatedTime, android.view.animation.Transformation t) {
        float[] fArr;
        this.mAnimRect.left = this.mStartCropWindowRect.left + ((this.mEndCropWindowRect.left - this.mStartCropWindowRect.left) * interpolatedTime);
        this.mAnimRect.top = this.mStartCropWindowRect.top + ((this.mEndCropWindowRect.top - this.mStartCropWindowRect.top) * interpolatedTime);
        this.mAnimRect.right = this.mStartCropWindowRect.right + ((this.mEndCropWindowRect.right - this.mStartCropWindowRect.right) * interpolatedTime);
        this.mAnimRect.bottom = this.mStartCropWindowRect.bottom + ((this.mEndCropWindowRect.bottom - this.mStartCropWindowRect.bottom) * interpolatedTime);
        this.mCropOverlayView.setCropWindowRect(this.mAnimRect);
        int i = 0;
        int i2 = 0;
        while (true) {
            fArr = this.mAnimPoints;
            if (i2 >= fArr.length) {
                break;
            }
            float[] fArr2 = this.mStartBoundPoints;
            fArr[i2] = fArr2[i2] + ((this.mEndBoundPoints[i2] - fArr2[i2]) * interpolatedTime);
            i2++;
        }
        this.mCropOverlayView.setBounds(fArr, this.mImageView.getWidth(), this.mImageView.getHeight());
        while (true) {
            float[] fArr3 = this.mAnimMatrix;
            if (i < fArr3.length) {
                float[] fArr4 = this.mStartImageMatrix;
                fArr3[i] = fArr4[i] + ((this.mEndImageMatrix[i] - fArr4[i]) * interpolatedTime);
                i++;
            } else {
                android.graphics.Matrix imageMatrix = this.mImageView.getImageMatrix();
                imageMatrix.setValues(this.mAnimMatrix);
                this.mImageView.setImageMatrix(imageMatrix);
                this.mImageView.invalidate();
                this.mCropOverlayView.invalidate();
                return;
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.mImageView.clearAnimation();
    }
}
