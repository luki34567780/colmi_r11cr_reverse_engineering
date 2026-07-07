package androidx.camera.view;

/* loaded from: classes.dex */
public class TransformUtils {
    public static final android.graphics.RectF NORMALIZED_RECT = new android.graphics.RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    private TransformUtils() {
    }

    public static android.util.Size rectToSize(android.graphics.Rect rect) {
        return new android.util.Size(rect.width(), rect.height());
    }

    public static android.graphics.RectF verticesToRect(float[] vertices) {
        return new android.graphics.RectF(min(vertices[0], vertices[2], vertices[4], vertices[6]), min(vertices[1], vertices[3], vertices[5], vertices[7]), max(vertices[0], vertices[2], vertices[4], vertices[6]), max(vertices[1], vertices[3], vertices[5], vertices[7]));
    }

    public static float max(float value1, float value2, float value3, float value4) {
        return java.lang.Math.max(java.lang.Math.max(value1, value2), java.lang.Math.max(value3, value4));
    }

    public static float min(float value1, float value2, float value3, float value4) {
        return java.lang.Math.min(java.lang.Math.min(value1, value2), java.lang.Math.min(value3, value4));
    }

    public static int surfaceRotationToRotationDegrees(int rotationValue) {
        if (rotationValue == 0) {
            return 0;
        }
        if (rotationValue == 1) {
            return 90;
        }
        if (rotationValue == 2) {
            return 180;
        }
        if (rotationValue == 3) {
            return 270;
        }
        throw new java.lang.IllegalStateException("Unexpected rotation value " + rotationValue);
    }

    public static boolean is90or270(int rotationDegrees) {
        if (rotationDegrees == 90 || rotationDegrees == 270) {
            return true;
        }
        if (rotationDegrees == 0 || rotationDegrees == 180) {
            return false;
        }
        throw new java.lang.IllegalArgumentException("Invalid rotation degrees: " + rotationDegrees);
    }

    public static float[] sizeToVertices(android.util.Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static float[] rectToVertices(android.graphics.RectF rectF) {
        return new float[]{rectF.left, rectF.top, rectF.right, rectF.top, rectF.right, rectF.bottom, rectF.left, rectF.bottom};
    }

    public static boolean isAspectRatioMatchingWithRoundingError(android.util.Size size1, boolean isAccurate1, android.util.Size size2, boolean isAccurate2) {
        float width;
        float width2;
        float width3;
        float width4;
        if (isAccurate1) {
            width = size1.getWidth() / size1.getHeight();
            width2 = width;
        } else {
            width = (size1.getWidth() + 1.0f) / (size1.getHeight() - 1.0f);
            width2 = (size1.getWidth() - 1.0f) / (size1.getHeight() + 1.0f);
        }
        if (isAccurate2) {
            width3 = size2.getWidth() / size2.getHeight();
            width4 = width3;
        } else {
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
        }
        return width >= width3 && width4 >= width2;
    }

    public static android.graphics.Matrix getRectToRect(android.graphics.RectF source, android.graphics.RectF target, int rotationDegrees) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRectToRect(source, NORMALIZED_RECT, android.graphics.Matrix.ScaleToFit.FILL);
        matrix.postRotate(rotationDegrees);
        matrix.postConcat(getNormalizedToBuffer(target));
        return matrix;
    }

    public static android.graphics.Matrix getNormalizedToBuffer(android.graphics.Rect viewPortRect) {
        return getNormalizedToBuffer(new android.graphics.RectF(viewPortRect));
    }

    private static android.graphics.Matrix getNormalizedToBuffer(android.graphics.RectF viewPortRect) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRectToRect(NORMALIZED_RECT, viewPortRect, android.graphics.Matrix.ScaleToFit.FILL);
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static android.graphics.Matrix getExifTransform(int exifOrientation, int width, int height) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f = width;
        float f2 = height;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, f, f2);
        android.graphics.RectF rectF2 = NORMALIZED_RECT;
        matrix.setRectToRect(rectF, rectF2, android.graphics.Matrix.ScaleToFit.FILL);
        boolean z = true;
        switch (exifOrientation) {
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                z = false;
                break;
            case 3:
                matrix.postRotate(180.0f);
                z = false;
                break;
            case 4:
                matrix.postScale(1.0f, -1.0f);
                z = false;
                break;
            case 5:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(270.0f);
                break;
            case 6:
                matrix.postRotate(90.0f);
                break;
            case 7:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(90.0f);
                break;
            case 8:
                matrix.postRotate(270.0f);
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            rectF = new android.graphics.RectF(0.0f, 0.0f, f2, f);
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.setRectToRect(rectF2, rectF, android.graphics.Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }
}
