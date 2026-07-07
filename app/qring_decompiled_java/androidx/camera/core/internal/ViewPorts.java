package androidx.camera.core.internal;

/* loaded from: classes.dex */
public class ViewPorts {
    private static float flipX(float x, float flipLineX) {
        return (flipLineX + flipLineX) - x;
    }

    private static float flipY(float y, float flipLineY) {
        return (flipLineY + flipLineY) - y;
    }

    private static boolean shouldMirrorStartAndEnd(boolean isFrontCamera, int layoutDirection) {
        return isFrontCamera ^ (layoutDirection == 1);
    }

    private ViewPorts() {
    }

    public static java.util.Map<androidx.camera.core.UseCase, android.graphics.Rect> calculateViewPortRects(android.graphics.Rect fullSensorRect, boolean isFrontCamera, android.util.Rational viewPortAspectRatio, int outputRotationDegrees, int scaleType, int layoutDirection, java.util.Map<androidx.camera.core.UseCase, android.util.Size> useCaseSizes) {
        androidx.core.util.Preconditions.checkArgument(fullSensorRect.width() > 0 && fullSensorRect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        android.graphics.RectF rectF = new android.graphics.RectF(fullSensorRect);
        java.util.HashMap hashMap = new java.util.HashMap();
        android.graphics.RectF rectF2 = new android.graphics.RectF(fullSensorRect);
        for (java.util.Map.Entry<androidx.camera.core.UseCase, android.util.Size> entry : useCaseSizes.entrySet()) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            android.graphics.RectF rectF3 = new android.graphics.RectF(0.0f, 0.0f, entry.getValue().getWidth(), entry.getValue().getHeight());
            matrix.setRectToRect(rectF3, rectF, android.graphics.Matrix.ScaleToFit.CENTER);
            hashMap.put(entry.getKey(), matrix);
            android.graphics.RectF rectF4 = new android.graphics.RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        android.graphics.RectF scaledRect = getScaledRect(rectF2, androidx.camera.core.internal.utils.ImageUtil.getRotatedAspectRatio(outputRotationDegrees, viewPortAspectRatio), scaleType, isFrontCamera, layoutDirection, outputRotationDegrees);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        android.graphics.RectF rectF5 = new android.graphics.RectF();
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
            ((android.graphics.Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, scaledRect);
            android.graphics.Rect rect = new android.graphics.Rect();
            rectF5.round(rect);
            hashMap2.put((androidx.camera.core.UseCase) entry2.getKey(), rect);
        }
        return hashMap2;
    }

    public static android.graphics.RectF getScaledRect(android.graphics.RectF fittingRect, android.util.Rational containerAspectRatio, int scaleType, boolean isFrontCamera, int layoutDirection, int rotationDegrees) {
        if (scaleType == 3) {
            return fittingRect;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, containerAspectRatio.getNumerator(), containerAspectRatio.getDenominator());
        if (scaleType == 0) {
            matrix.setRectToRect(rectF, fittingRect, android.graphics.Matrix.ScaleToFit.START);
        } else if (scaleType == 1) {
            matrix.setRectToRect(rectF, fittingRect, android.graphics.Matrix.ScaleToFit.CENTER);
        } else if (scaleType == 2) {
            matrix.setRectToRect(rectF, fittingRect, android.graphics.Matrix.ScaleToFit.END);
        } else {
            throw new java.lang.IllegalStateException("Unexpected scale type: " + scaleType);
        }
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        matrix.mapRect(rectF2, rectF);
        return correctStartOrEnd(shouldMirrorStartAndEnd(isFrontCamera, layoutDirection), rotationDegrees, fittingRect, rectF2);
    }

    private static android.graphics.RectF correctStartOrEnd(boolean isMirrored, int rotationDegrees, android.graphics.RectF containerRect, android.graphics.RectF cropRect) {
        boolean z = rotationDegrees == 0 && !isMirrored;
        boolean z2 = rotationDegrees == 90 && isMirrored;
        if (z || z2) {
            return cropRect;
        }
        boolean z3 = rotationDegrees == 0 && isMirrored;
        boolean z4 = rotationDegrees == 270 && !isMirrored;
        if (z3 || z4) {
            return flipHorizontally(cropRect, containerRect.centerX());
        }
        boolean z5 = rotationDegrees == 90 && !isMirrored;
        boolean z6 = rotationDegrees == 180 && isMirrored;
        if (z5 || z6) {
            return flipVertically(cropRect, containerRect.centerY());
        }
        boolean z7 = rotationDegrees == 180 && !isMirrored;
        boolean z8 = rotationDegrees == 270 && isMirrored;
        if (z7 || z8) {
            return flipHorizontally(flipVertically(cropRect, containerRect.centerY()), containerRect.centerX());
        }
        throw new java.lang.IllegalArgumentException("Invalid argument: mirrored " + isMirrored + " rotation " + rotationDegrees);
    }

    private static android.graphics.RectF flipHorizontally(android.graphics.RectF original, float flipLineX) {
        return new android.graphics.RectF(flipX(original.right, flipLineX), original.top, flipX(original.left, flipLineX), original.bottom);
    }

    private static android.graphics.RectF flipVertically(android.graphics.RectF original, float flipLineY) {
        return new android.graphics.RectF(original.left, flipY(original.bottom, flipLineY), original.right, flipY(original.top, flipLineY));
    }
}
