package com.qcwireless.qcwatch.ui.base.imagepicker.cropper;

/* loaded from: /tmp/dex/classes2.dex */
final class CropWindowHandler {
    private float mMaxCropResultHeight;
    private float mMaxCropResultWidth;
    private float mMaxCropWindowHeight;
    private float mMaxCropWindowWidth;
    private float mMinCropResultHeight;
    private float mMinCropResultWidth;
    private float mMinCropWindowHeight;
    private float mMinCropWindowWidth;
    private final android.graphics.RectF mEdges = new android.graphics.RectF();
    private final android.graphics.RectF mGetEdges = new android.graphics.RectF();
    private float mScaleFactorWidth = 1.0f;
    private float mScaleFactorHeight = 1.0f;

    private static boolean isInCenterTargetZone(float x, float y, float left, float top, float right, float bottom) {
        return x > left && x < right && y > top && y < bottom;
    }

    CropWindowHandler() {
    }

    public android.graphics.RectF getRect() {
        this.mGetEdges.set(this.mEdges);
        return this.mGetEdges;
    }

    public float getMinCropWidth() {
        return java.lang.Math.max(this.mMinCropWindowWidth, this.mMinCropResultWidth / this.mScaleFactorWidth);
    }

    public float getMinCropHeight() {
        return java.lang.Math.max(this.mMinCropWindowHeight, this.mMinCropResultHeight / this.mScaleFactorHeight);
    }

    public float getMaxCropWidth() {
        return java.lang.Math.min(this.mMaxCropWindowWidth, this.mMaxCropResultWidth / this.mScaleFactorWidth);
    }

    public float getMaxCropHeight() {
        return java.lang.Math.min(this.mMaxCropWindowHeight, this.mMaxCropResultHeight / this.mScaleFactorHeight);
    }

    public float getScaleFactorWidth() {
        return this.mScaleFactorWidth;
    }

    public float getScaleFactorHeight() {
        return this.mScaleFactorHeight;
    }

    public void setMinCropResultSize(int minCropResultWidth, int minCropResultHeight) {
        this.mMinCropResultWidth = minCropResultWidth;
        this.mMinCropResultHeight = minCropResultHeight;
    }

    public void setMaxCropResultSize(int maxCropResultWidth, int maxCropResultHeight) {
        this.mMaxCropResultWidth = maxCropResultWidth;
        this.mMaxCropResultHeight = maxCropResultHeight;
    }

    public void setCropWindowLimits(float maxWidth, float maxHeight, float scaleFactorWidth, float scaleFactorHeight) {
        this.mMaxCropWindowWidth = maxWidth;
        this.mMaxCropWindowHeight = maxHeight;
        this.mScaleFactorWidth = scaleFactorWidth;
        this.mScaleFactorHeight = scaleFactorHeight;
    }

    public void setInitialAttributeValues(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageOptions options) {
        this.mMinCropWindowWidth = options.minCropWindowWidth;
        this.mMinCropWindowHeight = options.minCropWindowHeight;
        this.mMinCropResultWidth = options.minCropResultWidth;
        this.mMinCropResultHeight = options.minCropResultHeight;
        this.mMaxCropResultWidth = options.maxCropResultWidth;
        this.mMaxCropResultHeight = options.maxCropResultHeight;
    }

    public void setRect(android.graphics.RectF rect) {
        this.mEdges.set(rect);
    }

    public boolean showGuidelines() {
        return this.mEdges.width() >= 100.0f && this.mEdges.height() >= 100.0f;
    }

    public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler getMoveHandler(float x, float y, float targetRadius, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape cropShape) {
        com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type rectanglePressedMoveType;
        if (cropShape == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape.OVAL) {
            rectanglePressedMoveType = getOvalPressedMoveType(x, y);
        } else {
            rectanglePressedMoveType = getRectanglePressedMoveType(x, y, targetRadius);
        }
        if (rectanglePressedMoveType != null) {
            return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler(rectanglePressedMoveType, this, x, y);
        }
        return null;
    }

    private com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type getRectanglePressedMoveType(float x, float y, float targetRadius) {
        if (isInCornerTargetZone(x, y, this.mEdges.left, this.mEdges.top, targetRadius)) {
            return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.TOP_LEFT;
        }
        if (isInCornerTargetZone(x, y, this.mEdges.right, this.mEdges.top, targetRadius)) {
            return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.TOP_RIGHT;
        }
        if (isInCornerTargetZone(x, y, this.mEdges.left, this.mEdges.bottom, targetRadius)) {
            return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.BOTTOM_LEFT;
        }
        if (isInCornerTargetZone(x, y, this.mEdges.right, this.mEdges.bottom, targetRadius)) {
            return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.BOTTOM_RIGHT;
        }
        if (isInCenterTargetZone(x, y, this.mEdges.left, this.mEdges.top, this.mEdges.right, this.mEdges.bottom) && focusCenter()) {
            return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.CENTER;
        }
        if (isInHorizontalTargetZone(x, y, this.mEdges.left, this.mEdges.right, this.mEdges.top, targetRadius)) {
            return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.TOP;
        }
        if (isInHorizontalTargetZone(x, y, this.mEdges.left, this.mEdges.right, this.mEdges.bottom, targetRadius)) {
            return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.BOTTOM;
        }
        if (isInVerticalTargetZone(x, y, this.mEdges.left, this.mEdges.top, this.mEdges.bottom, targetRadius)) {
            return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.LEFT;
        }
        if (isInVerticalTargetZone(x, y, this.mEdges.right, this.mEdges.top, this.mEdges.bottom, targetRadius)) {
            return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.RIGHT;
        }
        if (!isInCenterTargetZone(x, y, this.mEdges.left, this.mEdges.top, this.mEdges.right, this.mEdges.bottom) || focusCenter()) {
            return null;
        }
        return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.CENTER;
    }

    private com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type getOvalPressedMoveType(float x, float y) {
        float width = this.mEdges.width() / 6.0f;
        float f = this.mEdges.left + width;
        float f2 = this.mEdges.left + (width * 5.0f);
        float height = this.mEdges.height() / 6.0f;
        float f3 = this.mEdges.top + height;
        float f4 = this.mEdges.top + (height * 5.0f);
        if (x < f) {
            if (y < f3) {
                return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.TOP_LEFT;
            }
            if (y < f4) {
                return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.LEFT;
            }
            return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.BOTTOM_LEFT;
        }
        if (x < f2) {
            if (y < f3) {
                return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.TOP;
            }
            if (y < f4) {
                return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.CENTER;
            }
            return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.BOTTOM;
        }
        if (y < f3) {
            return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.TOP_RIGHT;
        }
        if (y < f4) {
            return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.RIGHT;
        }
        return com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.BOTTOM_RIGHT;
    }

    private static boolean isInCornerTargetZone(float x, float y, float handleX, float handleY, float targetRadius) {
        return java.lang.Math.abs(x - handleX) <= targetRadius && java.lang.Math.abs(y - handleY) <= targetRadius;
    }

    private static boolean isInHorizontalTargetZone(float x, float y, float handleXStart, float handleXEnd, float handleY, float targetRadius) {
        return x > handleXStart && x < handleXEnd && java.lang.Math.abs(y - handleY) <= targetRadius;
    }

    private static boolean isInVerticalTargetZone(float x, float y, float handleX, float handleYStart, float handleYEnd, float targetRadius) {
        return java.lang.Math.abs(x - handleX) <= targetRadius && y > handleYStart && y < handleYEnd;
    }

    private boolean focusCenter() {
        return !showGuidelines();
    }
}
