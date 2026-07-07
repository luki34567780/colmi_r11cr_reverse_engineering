package androidx.camera.view;

/* loaded from: classes.dex */
final class PreviewTransformation {
    private static final androidx.camera.view.PreviewView.ScaleType DEFAULT_SCALE_TYPE = androidx.camera.view.PreviewView.ScaleType.FILL_CENTER;
    private static final java.lang.String TAG = "PreviewTransform";
    private boolean mIsFrontCamera;
    private int mPreviewRotationDegrees;
    private android.util.Size mResolution;
    private androidx.camera.view.PreviewView.ScaleType mScaleType = DEFAULT_SCALE_TYPE;
    private android.graphics.Rect mSurfaceCropRect;
    private int mTargetRotation;
    private android.graphics.Rect mViewportRect;

    PreviewTransformation() {
    }

    void setTransformationInfo(androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo, android.util.Size resolution, boolean isFrontCamera) {
        androidx.camera.core.Logger.d(TAG, "Transformation info set: " + transformationInfo + " " + resolution + " " + isFrontCamera);
        this.mSurfaceCropRect = getCorrectedCropRect(transformationInfo.getCropRect());
        this.mViewportRect = transformationInfo.getCropRect();
        this.mPreviewRotationDegrees = transformationInfo.getRotationDegrees();
        this.mTargetRotation = transformationInfo.getTargetRotation();
        this.mResolution = resolution;
        this.mIsFrontCamera = isFrontCamera;
    }

    android.graphics.Matrix getTextureViewCorrectionMatrix() {
        androidx.core.util.Preconditions.checkState(isTransformationInfoReady());
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, this.mResolution.getWidth(), this.mResolution.getHeight());
        int i = -androidx.camera.view.TransformUtils.surfaceRotationToRotationDegrees(this.mTargetRotation);
        androidx.camera.view.internal.compat.quirk.TextureViewRotationQuirk textureViewRotationQuirk = (androidx.camera.view.internal.compat.quirk.TextureViewRotationQuirk) androidx.camera.view.internal.compat.quirk.DeviceQuirks.get(androidx.camera.view.internal.compat.quirk.TextureViewRotationQuirk.class);
        if (textureViewRotationQuirk != null) {
            i += textureViewRotationQuirk.getCorrectionRotation(this.mIsFrontCamera);
        }
        return androidx.camera.view.TransformUtils.getRectToRect(rectF, rectF, i);
    }

    void transformView(android.util.Size previewViewSize, int layoutDirection, android.view.View preview) {
        if (previewViewSize.getHeight() == 0 || previewViewSize.getWidth() == 0) {
            androidx.camera.core.Logger.w(TAG, "Transform not applied due to PreviewView size: " + previewViewSize);
            return;
        }
        if (isTransformationInfoReady()) {
            if (preview instanceof android.view.TextureView) {
                ((android.view.TextureView) preview).setTransform(getTextureViewCorrectionMatrix());
            } else {
                android.view.Display display = preview.getDisplay();
                if (display != null && display.getRotation() != this.mTargetRotation) {
                    androidx.camera.core.Logger.e(TAG, "Non-display rotation not supported with SurfaceView / PERFORMANCE mode.");
                }
            }
            android.graphics.RectF transformedSurfaceRect = getTransformedSurfaceRect(previewViewSize, layoutDirection);
            preview.setPivotX(0.0f);
            preview.setPivotY(0.0f);
            preview.setScaleX(transformedSurfaceRect.width() / this.mResolution.getWidth());
            preview.setScaleY(transformedSurfaceRect.height() / this.mResolution.getHeight());
            preview.setTranslationX(transformedSurfaceRect.left - preview.getLeft());
            preview.setTranslationY(transformedSurfaceRect.top - preview.getTop());
        }
    }

    void setScaleType(androidx.camera.view.PreviewView.ScaleType scaleType) {
        this.mScaleType = scaleType;
    }

    androidx.camera.view.PreviewView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    private android.graphics.RectF getTransformedSurfaceRect(android.util.Size previewViewSize, int layoutDirection) {
        androidx.core.util.Preconditions.checkState(isTransformationInfoReady());
        android.graphics.Matrix surfaceToPreviewViewMatrix = getSurfaceToPreviewViewMatrix(previewViewSize, layoutDirection);
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, this.mResolution.getWidth(), this.mResolution.getHeight());
        surfaceToPreviewViewMatrix.mapRect(rectF);
        return rectF;
    }

    android.graphics.Matrix getSurfaceToPreviewViewMatrix(android.util.Size previewViewSize, int layoutDirection) {
        android.graphics.RectF previewViewViewportRectForMismatchedAspectRatios;
        androidx.core.util.Preconditions.checkState(isTransformationInfoReady());
        if (isViewportAspectRatioMatchPreviewView(previewViewSize)) {
            previewViewViewportRectForMismatchedAspectRatios = new android.graphics.RectF(0.0f, 0.0f, previewViewSize.getWidth(), previewViewSize.getHeight());
        } else {
            previewViewViewportRectForMismatchedAspectRatios = getPreviewViewViewportRectForMismatchedAspectRatios(previewViewSize, layoutDirection);
        }
        android.graphics.Matrix rectToRect = androidx.camera.view.TransformUtils.getRectToRect(new android.graphics.RectF(this.mSurfaceCropRect), previewViewViewportRectForMismatchedAspectRatios, this.mPreviewRotationDegrees);
        if (this.mIsFrontCamera) {
            if (androidx.camera.view.TransformUtils.is90or270(this.mPreviewRotationDegrees)) {
                rectToRect.preScale(1.0f, -1.0f, this.mSurfaceCropRect.centerX(), this.mSurfaceCropRect.centerY());
            } else {
                rectToRect.preScale(-1.0f, 1.0f, this.mSurfaceCropRect.centerX(), this.mSurfaceCropRect.centerY());
            }
        }
        return rectToRect;
    }

    private android.graphics.Rect getCorrectedCropRect(android.graphics.Rect surfaceCropRect) {
        androidx.camera.view.internal.compat.quirk.PreviewOneThirdWiderQuirk previewOneThirdWiderQuirk = (androidx.camera.view.internal.compat.quirk.PreviewOneThirdWiderQuirk) androidx.camera.view.internal.compat.quirk.DeviceQuirks.get(androidx.camera.view.internal.compat.quirk.PreviewOneThirdWiderQuirk.class);
        if (previewOneThirdWiderQuirk == null) {
            return surfaceCropRect;
        }
        android.graphics.RectF rectF = new android.graphics.RectF(surfaceCropRect);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(previewOneThirdWiderQuirk.getCropRectScaleX(), 1.0f, surfaceCropRect.centerX(), surfaceCropRect.centerY());
        matrix.mapRect(rectF);
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF.round(rect);
        return rect;
    }

    android.graphics.RectF getPreviewViewViewportRectForMismatchedAspectRatios(android.util.Size previewViewSize, int layoutDirection) {
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, previewViewSize.getWidth(), previewViewSize.getHeight());
        android.util.Size rotatedViewportSize = getRotatedViewportSize();
        android.graphics.RectF rectF2 = new android.graphics.RectF(0.0f, 0.0f, rotatedViewportSize.getWidth(), rotatedViewportSize.getHeight());
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        setMatrixRectToRect(matrix, rectF2, rectF, this.mScaleType);
        matrix.mapRect(rectF2);
        return layoutDirection == 1 ? flipHorizontally(rectF2, previewViewSize.getWidth() / 2.0f) : rectF2;
    }

    /* renamed from: androidx.camera.view.PreviewTransformation$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$view$PreviewView$ScaleType;

        static {
            int[] iArr = new int[androidx.camera.view.PreviewView.ScaleType.values().length];
            $SwitchMap$androidx$camera$view$PreviewView$ScaleType = iArr;
            try {
                iArr[androidx.camera.view.PreviewView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$view$PreviewView$ScaleType[androidx.camera.view.PreviewView.ScaleType.FILL_CENTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$view$PreviewView$ScaleType[androidx.camera.view.PreviewView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$camera$view$PreviewView$ScaleType[androidx.camera.view.PreviewView.ScaleType.FILL_END.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$camera$view$PreviewView$ScaleType[androidx.camera.view.PreviewView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$camera$view$PreviewView$ScaleType[androidx.camera.view.PreviewView.ScaleType.FILL_START.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    private static void setMatrixRectToRect(android.graphics.Matrix matrix, android.graphics.RectF source, android.graphics.RectF destination, androidx.camera.view.PreviewView.ScaleType scaleType) {
        android.graphics.Matrix.ScaleToFit scaleToFit;
        switch (androidx.camera.view.PreviewTransformation.AnonymousClass1.$SwitchMap$androidx$camera$view$PreviewView$ScaleType[scaleType.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = android.graphics.Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = android.graphics.Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = android.graphics.Matrix.ScaleToFit.START;
                break;
            default:
                androidx.camera.core.Logger.e(TAG, "Unexpected crop rect: " + scaleType);
                scaleToFit = android.graphics.Matrix.ScaleToFit.FILL;
                break;
        }
        if (scaleType == androidx.camera.view.PreviewView.ScaleType.FIT_CENTER || scaleType == androidx.camera.view.PreviewView.ScaleType.FIT_START || scaleType == androidx.camera.view.PreviewView.ScaleType.FIT_END) {
            matrix.setRectToRect(source, destination, scaleToFit);
        } else {
            matrix.setRectToRect(destination, source, scaleToFit);
            matrix.invert(matrix);
        }
    }

    private static android.graphics.RectF flipHorizontally(android.graphics.RectF original, float flipLineX) {
        float f = flipLineX + flipLineX;
        return new android.graphics.RectF(f - original.right, original.top, f - original.left, original.bottom);
    }

    private android.util.Size getRotatedViewportSize() {
        if (androidx.camera.view.TransformUtils.is90or270(this.mPreviewRotationDegrees)) {
            return new android.util.Size(this.mViewportRect.height(), this.mViewportRect.width());
        }
        return new android.util.Size(this.mViewportRect.width(), this.mViewportRect.height());
    }

    boolean isViewportAspectRatioMatchPreviewView(android.util.Size previewViewSize) {
        return androidx.camera.view.TransformUtils.isAspectRatioMatchingWithRoundingError(previewViewSize, true, getRotatedViewportSize(), false);
    }

    android.graphics.Rect getSurfaceCropRect() {
        return this.mSurfaceCropRect;
    }

    android.graphics.Bitmap createTransformedBitmap(android.graphics.Bitmap original, android.util.Size previewViewSize, int layoutDirection) {
        if (!isTransformationInfoReady()) {
            return original;
        }
        android.graphics.Matrix textureViewCorrectionMatrix = getTextureViewCorrectionMatrix();
        android.graphics.RectF transformedSurfaceRect = getTransformedSurfaceRect(previewViewSize, layoutDirection);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(previewViewSize.getWidth(), previewViewSize.getHeight(), original.getConfig());
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postConcat(textureViewCorrectionMatrix);
        matrix.postScale(transformedSurfaceRect.width() / this.mResolution.getWidth(), transformedSurfaceRect.height() / this.mResolution.getHeight());
        matrix.postTranslate(transformedSurfaceRect.left, transformedSurfaceRect.top);
        canvas.drawBitmap(original, matrix, new android.graphics.Paint(7));
        return createBitmap;
    }

    android.graphics.Matrix getPreviewViewToNormalizedSurfaceMatrix(android.util.Size previewViewSize, int layoutDirection) {
        if (!isTransformationInfoReady()) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        getSurfaceToPreviewViewMatrix(previewViewSize, layoutDirection).invert(matrix);
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.setRectToRect(new android.graphics.RectF(0.0f, 0.0f, this.mResolution.getWidth(), this.mResolution.getHeight()), new android.graphics.RectF(0.0f, 0.0f, 1.0f, 1.0f), android.graphics.Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    private boolean isTransformationInfoReady() {
        return (this.mSurfaceCropRect == null || this.mResolution == null) ? false : true;
    }
}
