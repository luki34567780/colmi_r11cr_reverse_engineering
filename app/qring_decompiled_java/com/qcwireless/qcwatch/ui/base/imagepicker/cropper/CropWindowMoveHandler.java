package com.qcwireless.qcwatch.ui.base.imagepicker.cropper;

/* loaded from: /tmp/dex/classes2.dex */
final class CropWindowMoveHandler {
    private static final android.graphics.Matrix MATRIX = new android.graphics.Matrix();
    private final float mMaxCropHeight;
    private final float mMaxCropWidth;
    private final float mMinCropHeight;
    private final float mMinCropWidth;
    private final android.graphics.PointF mTouchOffset = new android.graphics.PointF();
    private final com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type mType;

    public enum Type {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    private static float calculateAspectRatio(float left, float top, float right, float bottom) {
        return (right - left) / (bottom - top);
    }

    public CropWindowMoveHandler(com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type type, com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowHandler cropWindowHandler, float touchX, float touchY) {
        this.mType = type;
        this.mMinCropWidth = cropWindowHandler.getMinCropWidth();
        this.mMinCropHeight = cropWindowHandler.getMinCropHeight();
        this.mMaxCropWidth = cropWindowHandler.getMaxCropWidth();
        this.mMaxCropHeight = cropWindowHandler.getMaxCropHeight();
        calculateTouchOffset(cropWindowHandler.getRect(), touchX, touchY);
    }

    public void move(android.graphics.RectF rect, float x, float y, android.graphics.RectF bounds, int viewWidth, int viewHeight, float snapMargin, boolean fixedAspectRatio, float aspectRatio) {
        float f = x + this.mTouchOffset.x;
        float f2 = y + this.mTouchOffset.y;
        if (this.mType == com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.CENTER) {
            moveCenter(rect, f, f2, bounds, viewWidth, viewHeight, snapMargin);
        } else if (fixedAspectRatio) {
            moveSizeWithFixedAspectRatio(rect, f, f2, bounds, viewWidth, viewHeight, snapMargin, aspectRatio);
        } else {
            moveSizeWithFreeAspectRatio(rect, f, f2, bounds, viewWidth, viewHeight, snapMargin);
        }
    }

    /* renamed from: com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$qcwireless$qcwatch$ui$base$imagepicker$cropper$CropWindowMoveHandler$Type;

        static {
            int[] iArr = new int[com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.values().length];
            $SwitchMap$com$qcwireless$qcwatch$ui$base$imagepicker$cropper$CropWindowMoveHandler$Type = iArr;
            try {
                iArr[com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.TOP_LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$qcwireless$qcwatch$ui$base$imagepicker$cropper$CropWindowMoveHandler$Type[com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.TOP_RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$qcwireless$qcwatch$ui$base$imagepicker$cropper$CropWindowMoveHandler$Type[com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.BOTTOM_LEFT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$qcwireless$qcwatch$ui$base$imagepicker$cropper$CropWindowMoveHandler$Type[com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$qcwireless$qcwatch$ui$base$imagepicker$cropper$CropWindowMoveHandler$Type[com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.LEFT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$qcwireless$qcwatch$ui$base$imagepicker$cropper$CropWindowMoveHandler$Type[com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.TOP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$qcwireless$qcwatch$ui$base$imagepicker$cropper$CropWindowMoveHandler$Type[com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.RIGHT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$qcwireless$qcwatch$ui$base$imagepicker$cropper$CropWindowMoveHandler$Type[com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.BOTTOM.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$qcwireless$qcwatch$ui$base$imagepicker$cropper$CropWindowMoveHandler$Type[com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.Type.CENTER.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    private void calculateTouchOffset(android.graphics.RectF rect, float touchX, float touchY) {
        float f;
        float f2;
        float f3;
        float f4 = 0.0f;
        switch (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.AnonymousClass1.$SwitchMap$com$qcwireless$qcwatch$ui$base$imagepicker$cropper$CropWindowMoveHandler$Type[this.mType.ordinal()]) {
            case 1:
                f4 = rect.left - touchX;
                f = rect.top;
                f3 = f - touchY;
                break;
            case 2:
                f4 = rect.right - touchX;
                f = rect.top;
                f3 = f - touchY;
                break;
            case 3:
                f4 = rect.left - touchX;
                f = rect.bottom;
                f3 = f - touchY;
                break;
            case 4:
                f4 = rect.right - touchX;
                f = rect.bottom;
                f3 = f - touchY;
                break;
            case 5:
                f2 = rect.left;
                f4 = f2 - touchX;
                f3 = 0.0f;
                break;
            case 6:
                f = rect.top;
                f3 = f - touchY;
                break;
            case 7:
                f2 = rect.right;
                f4 = f2 - touchX;
                f3 = 0.0f;
                break;
            case 8:
                f = rect.bottom;
                f3 = f - touchY;
                break;
            case 9:
                f4 = rect.centerX() - touchX;
                f = rect.centerY();
                f3 = f - touchY;
                break;
            default:
                f3 = 0.0f;
                break;
        }
        this.mTouchOffset.x = f4;
        this.mTouchOffset.y = f3;
    }

    private void moveCenter(android.graphics.RectF rect, float x, float y, android.graphics.RectF bounds, int viewWidth, int viewHeight, float snapRadius) {
        float centerX = x - rect.centerX();
        float centerY = y - rect.centerY();
        if (rect.left + centerX < 0.0f || rect.right + centerX > viewWidth || rect.left + centerX < bounds.left || rect.right + centerX > bounds.right) {
            centerX /= 1.05f;
            this.mTouchOffset.x -= centerX / 2.0f;
        }
        if (rect.top + centerY < 0.0f || rect.bottom + centerY > viewHeight || rect.top + centerY < bounds.top || rect.bottom + centerY > bounds.bottom) {
            centerY /= 1.05f;
            this.mTouchOffset.y -= centerY / 2.0f;
        }
        rect.offset(centerX, centerY);
        snapEdgesToBounds(rect, bounds, snapRadius);
    }

    private void moveSizeWithFreeAspectRatio(android.graphics.RectF rect, float x, float y, android.graphics.RectF bounds, int viewWidth, int viewHeight, float snapMargin) {
        switch (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.AnonymousClass1.$SwitchMap$com$qcwireless$qcwatch$ui$base$imagepicker$cropper$CropWindowMoveHandler$Type[this.mType.ordinal()]) {
            case 1:
                adjustTop(rect, y, bounds, snapMargin, 0.0f, false, false);
                adjustLeft(rect, x, bounds, snapMargin, 0.0f, false, false);
                break;
            case 2:
                adjustTop(rect, y, bounds, snapMargin, 0.0f, false, false);
                adjustRight(rect, x, bounds, viewWidth, snapMargin, 0.0f, false, false);
                break;
            case 3:
                adjustBottom(rect, y, bounds, viewHeight, snapMargin, 0.0f, false, false);
                adjustLeft(rect, x, bounds, snapMargin, 0.0f, false, false);
                break;
            case 4:
                adjustBottom(rect, y, bounds, viewHeight, snapMargin, 0.0f, false, false);
                adjustRight(rect, x, bounds, viewWidth, snapMargin, 0.0f, false, false);
                break;
            case 5:
                adjustLeft(rect, x, bounds, snapMargin, 0.0f, false, false);
                break;
            case 6:
                adjustTop(rect, y, bounds, snapMargin, 0.0f, false, false);
                break;
            case 7:
                adjustRight(rect, x, bounds, viewWidth, snapMargin, 0.0f, false, false);
                break;
            case 8:
                adjustBottom(rect, y, bounds, viewHeight, snapMargin, 0.0f, false, false);
                break;
        }
    }

    private void moveSizeWithFixedAspectRatio(android.graphics.RectF rect, float x, float y, android.graphics.RectF bounds, int viewWidth, int viewHeight, float snapMargin, float aspectRatio) {
        switch (com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropWindowMoveHandler.AnonymousClass1.$SwitchMap$com$qcwireless$qcwatch$ui$base$imagepicker$cropper$CropWindowMoveHandler$Type[this.mType.ordinal()]) {
            case 1:
                if (calculateAspectRatio(x, y, rect.right, rect.bottom) < aspectRatio) {
                    adjustTop(rect, y, bounds, snapMargin, aspectRatio, true, false);
                    adjustLeftByAspectRatio(rect, aspectRatio);
                    break;
                } else {
                    adjustLeft(rect, x, bounds, snapMargin, aspectRatio, true, false);
                    adjustTopByAspectRatio(rect, aspectRatio);
                    break;
                }
            case 2:
                if (calculateAspectRatio(rect.left, y, x, rect.bottom) < aspectRatio) {
                    adjustTop(rect, y, bounds, snapMargin, aspectRatio, false, true);
                    adjustRightByAspectRatio(rect, aspectRatio);
                    break;
                } else {
                    adjustRight(rect, x, bounds, viewWidth, snapMargin, aspectRatio, true, false);
                    adjustTopByAspectRatio(rect, aspectRatio);
                    break;
                }
            case 3:
                if (calculateAspectRatio(x, rect.top, rect.right, y) < aspectRatio) {
                    adjustBottom(rect, y, bounds, viewHeight, snapMargin, aspectRatio, true, false);
                    adjustLeftByAspectRatio(rect, aspectRatio);
                    break;
                } else {
                    adjustLeft(rect, x, bounds, snapMargin, aspectRatio, false, true);
                    adjustBottomByAspectRatio(rect, aspectRatio);
                    break;
                }
            case 4:
                if (calculateAspectRatio(rect.left, rect.top, x, y) < aspectRatio) {
                    adjustBottom(rect, y, bounds, viewHeight, snapMargin, aspectRatio, false, true);
                    adjustRightByAspectRatio(rect, aspectRatio);
                    break;
                } else {
                    adjustRight(rect, x, bounds, viewWidth, snapMargin, aspectRatio, false, true);
                    adjustBottomByAspectRatio(rect, aspectRatio);
                    break;
                }
            case 5:
                adjustLeft(rect, x, bounds, snapMargin, aspectRatio, true, true);
                adjustTopBottomByAspectRatio(rect, bounds, aspectRatio);
                break;
            case 6:
                adjustTop(rect, y, bounds, snapMargin, aspectRatio, true, true);
                adjustLeftRightByAspectRatio(rect, bounds, aspectRatio);
                break;
            case 7:
                adjustRight(rect, x, bounds, viewWidth, snapMargin, aspectRatio, true, true);
                adjustTopBottomByAspectRatio(rect, bounds, aspectRatio);
                break;
            case 8:
                adjustBottom(rect, y, bounds, viewHeight, snapMargin, aspectRatio, true, true);
                adjustLeftRightByAspectRatio(rect, bounds, aspectRatio);
                break;
        }
    }

    private void snapEdgesToBounds(android.graphics.RectF edges, android.graphics.RectF bounds, float margin) {
        if (edges.left < bounds.left + margin) {
            edges.offset(bounds.left - edges.left, 0.0f);
        }
        if (edges.top < bounds.top + margin) {
            edges.offset(0.0f, bounds.top - edges.top);
        }
        if (edges.right > bounds.right - margin) {
            edges.offset(bounds.right - edges.right, 0.0f);
        }
        if (edges.bottom > bounds.bottom - margin) {
            edges.offset(0.0f, bounds.bottom - edges.bottom);
        }
    }

    private void adjustLeft(android.graphics.RectF rect, float left, android.graphics.RectF bounds, float snapMargin, float aspectRatio, boolean topMoves, boolean bottomMoves) {
        if (left < 0.0f) {
            left /= 1.05f;
            this.mTouchOffset.x -= left / 1.1f;
        }
        if (left < bounds.left) {
            this.mTouchOffset.x -= (left - bounds.left) / 2.0f;
        }
        if (left - bounds.left < snapMargin) {
            left = bounds.left;
        }
        if (rect.right - left < this.mMinCropWidth) {
            left = rect.right - this.mMinCropWidth;
        }
        if (rect.right - left > this.mMaxCropWidth) {
            left = rect.right - this.mMaxCropWidth;
        }
        if (left - bounds.left < snapMargin) {
            left = bounds.left;
        }
        if (aspectRatio > 0.0f) {
            float f = (rect.right - left) / aspectRatio;
            if (f < this.mMinCropHeight) {
                left = java.lang.Math.max(bounds.left, rect.right - (this.mMinCropHeight * aspectRatio));
                f = (rect.right - left) / aspectRatio;
            }
            if (f > this.mMaxCropHeight) {
                left = java.lang.Math.max(bounds.left, rect.right - (this.mMaxCropHeight * aspectRatio));
                f = (rect.right - left) / aspectRatio;
            }
            if (topMoves && bottomMoves) {
                left = java.lang.Math.max(left, java.lang.Math.max(bounds.left, rect.right - (bounds.height() * aspectRatio)));
            } else {
                if (topMoves && rect.bottom - f < bounds.top) {
                    left = java.lang.Math.max(bounds.left, rect.right - ((rect.bottom - bounds.top) * aspectRatio));
                    f = (rect.right - left) / aspectRatio;
                }
                if (bottomMoves && rect.top + f > bounds.bottom) {
                    left = java.lang.Math.max(left, java.lang.Math.max(bounds.left, rect.right - ((bounds.bottom - rect.top) * aspectRatio)));
                }
            }
        }
        rect.left = left;
    }

    private void adjustRight(android.graphics.RectF rect, float right, android.graphics.RectF bounds, int viewWidth, float snapMargin, float aspectRatio, boolean topMoves, boolean bottomMoves) {
        float f = viewWidth;
        if (right > f) {
            right = ((right - f) / 1.05f) + f;
            this.mTouchOffset.x -= (right - f) / 1.1f;
        }
        if (right > bounds.right) {
            this.mTouchOffset.x -= (right - bounds.right) / 2.0f;
        }
        if (bounds.right - right < snapMargin) {
            right = bounds.right;
        }
        if (right - rect.left < this.mMinCropWidth) {
            right = rect.left + this.mMinCropWidth;
        }
        if (right - rect.left > this.mMaxCropWidth) {
            right = rect.left + this.mMaxCropWidth;
        }
        if (bounds.right - right < snapMargin) {
            right = bounds.right;
        }
        if (aspectRatio > 0.0f) {
            float f2 = (right - rect.left) / aspectRatio;
            if (f2 < this.mMinCropHeight) {
                right = java.lang.Math.min(bounds.right, rect.left + (this.mMinCropHeight * aspectRatio));
                f2 = (right - rect.left) / aspectRatio;
            }
            if (f2 > this.mMaxCropHeight) {
                right = java.lang.Math.min(bounds.right, rect.left + (this.mMaxCropHeight * aspectRatio));
                f2 = (right - rect.left) / aspectRatio;
            }
            if (topMoves && bottomMoves) {
                right = java.lang.Math.min(right, java.lang.Math.min(bounds.right, rect.left + (bounds.height() * aspectRatio)));
            } else {
                if (topMoves && rect.bottom - f2 < bounds.top) {
                    right = java.lang.Math.min(bounds.right, rect.left + ((rect.bottom - bounds.top) * aspectRatio));
                    f2 = (right - rect.left) / aspectRatio;
                }
                if (bottomMoves && rect.top + f2 > bounds.bottom) {
                    right = java.lang.Math.min(right, java.lang.Math.min(bounds.right, rect.left + ((bounds.bottom - rect.top) * aspectRatio)));
                }
            }
        }
        rect.right = right;
    }

    private void adjustTop(android.graphics.RectF rect, float top, android.graphics.RectF bounds, float snapMargin, float aspectRatio, boolean leftMoves, boolean rightMoves) {
        if (top < 0.0f) {
            top /= 1.05f;
            this.mTouchOffset.y -= top / 1.1f;
        }
        if (top < bounds.top) {
            this.mTouchOffset.y -= (top - bounds.top) / 2.0f;
        }
        if (top - bounds.top < snapMargin) {
            top = bounds.top;
        }
        if (rect.bottom - top < this.mMinCropHeight) {
            top = rect.bottom - this.mMinCropHeight;
        }
        if (rect.bottom - top > this.mMaxCropHeight) {
            top = rect.bottom - this.mMaxCropHeight;
        }
        if (top - bounds.top < snapMargin) {
            top = bounds.top;
        }
        if (aspectRatio > 0.0f) {
            float f = (rect.bottom - top) * aspectRatio;
            if (f < this.mMinCropWidth) {
                top = java.lang.Math.max(bounds.top, rect.bottom - (this.mMinCropWidth / aspectRatio));
                f = (rect.bottom - top) * aspectRatio;
            }
            if (f > this.mMaxCropWidth) {
                top = java.lang.Math.max(bounds.top, rect.bottom - (this.mMaxCropWidth / aspectRatio));
                f = (rect.bottom - top) * aspectRatio;
            }
            if (leftMoves && rightMoves) {
                top = java.lang.Math.max(top, java.lang.Math.max(bounds.top, rect.bottom - (bounds.width() / aspectRatio)));
            } else {
                if (leftMoves && rect.right - f < bounds.left) {
                    top = java.lang.Math.max(bounds.top, rect.bottom - ((rect.right - bounds.left) / aspectRatio));
                    f = (rect.bottom - top) * aspectRatio;
                }
                if (rightMoves && rect.left + f > bounds.right) {
                    top = java.lang.Math.max(top, java.lang.Math.max(bounds.top, rect.bottom - ((bounds.right - rect.left) / aspectRatio)));
                }
            }
        }
        rect.top = top;
    }

    private void adjustBottom(android.graphics.RectF rect, float bottom, android.graphics.RectF bounds, int viewHeight, float snapMargin, float aspectRatio, boolean leftMoves, boolean rightMoves) {
        float f = viewHeight;
        if (bottom > f) {
            bottom = ((bottom - f) / 1.05f) + f;
            this.mTouchOffset.y -= (bottom - f) / 1.1f;
        }
        if (bottom > bounds.bottom) {
            this.mTouchOffset.y -= (bottom - bounds.bottom) / 2.0f;
        }
        if (bounds.bottom - bottom < snapMargin) {
            bottom = bounds.bottom;
        }
        if (bottom - rect.top < this.mMinCropHeight) {
            bottom = rect.top + this.mMinCropHeight;
        }
        if (bottom - rect.top > this.mMaxCropHeight) {
            bottom = rect.top + this.mMaxCropHeight;
        }
        if (bounds.bottom - bottom < snapMargin) {
            bottom = bounds.bottom;
        }
        if (aspectRatio > 0.0f) {
            float f2 = (bottom - rect.top) * aspectRatio;
            if (f2 < this.mMinCropWidth) {
                bottom = java.lang.Math.min(bounds.bottom, rect.top + (this.mMinCropWidth / aspectRatio));
                f2 = (bottom - rect.top) * aspectRatio;
            }
            if (f2 > this.mMaxCropWidth) {
                bottom = java.lang.Math.min(bounds.bottom, rect.top + (this.mMaxCropWidth / aspectRatio));
                f2 = (bottom - rect.top) * aspectRatio;
            }
            if (leftMoves && rightMoves) {
                bottom = java.lang.Math.min(bottom, java.lang.Math.min(bounds.bottom, rect.top + (bounds.width() / aspectRatio)));
            } else {
                if (leftMoves && rect.right - f2 < bounds.left) {
                    bottom = java.lang.Math.min(bounds.bottom, rect.top + ((rect.right - bounds.left) / aspectRatio));
                    f2 = (bottom - rect.top) * aspectRatio;
                }
                if (rightMoves && rect.left + f2 > bounds.right) {
                    bottom = java.lang.Math.min(bottom, java.lang.Math.min(bounds.bottom, rect.top + ((bounds.right - rect.left) / aspectRatio)));
                }
            }
        }
        rect.bottom = bottom;
    }

    private void adjustLeftByAspectRatio(android.graphics.RectF rect, float aspectRatio) {
        rect.left = rect.right - (rect.height() * aspectRatio);
    }

    private void adjustTopByAspectRatio(android.graphics.RectF rect, float aspectRatio) {
        rect.top = rect.bottom - (rect.width() / aspectRatio);
    }

    private void adjustRightByAspectRatio(android.graphics.RectF rect, float aspectRatio) {
        rect.right = rect.left + (rect.height() * aspectRatio);
    }

    private void adjustBottomByAspectRatio(android.graphics.RectF rect, float aspectRatio) {
        rect.bottom = rect.top + (rect.width() / aspectRatio);
    }

    private void adjustLeftRightByAspectRatio(android.graphics.RectF rect, android.graphics.RectF bounds, float aspectRatio) {
        rect.inset((rect.width() - (rect.height() * aspectRatio)) / 2.0f, 0.0f);
        if (rect.left < bounds.left) {
            rect.offset(bounds.left - rect.left, 0.0f);
        }
        if (rect.right > bounds.right) {
            rect.offset(bounds.right - rect.right, 0.0f);
        }
    }

    private void adjustTopBottomByAspectRatio(android.graphics.RectF rect, android.graphics.RectF bounds, float aspectRatio) {
        rect.inset(0.0f, (rect.height() - (rect.width() / aspectRatio)) / 2.0f);
        if (rect.top < bounds.top) {
            rect.offset(0.0f, bounds.top - rect.top);
        }
        if (rect.bottom > bounds.bottom) {
            rect.offset(0.0f, bounds.bottom - rect.bottom);
        }
    }
}
