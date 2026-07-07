package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
public final class CameraOrientationUtil {
    private static final java.lang.String TAG = "CameraOrientationUtil";

    private CameraOrientationUtil() {
    }

    public static int getRelativeImageRotation(int destRotationDegrees, int sourceRotationDegrees, boolean isOppositeFacing) {
        int i;
        if (isOppositeFacing) {
            i = ((sourceRotationDegrees - destRotationDegrees) + com.amap.api.maps.utils.SpatialRelationUtil.A_CIRCLE_DEGREE) % com.amap.api.maps.utils.SpatialRelationUtil.A_CIRCLE_DEGREE;
        } else {
            i = (sourceRotationDegrees + destRotationDegrees) % com.amap.api.maps.utils.SpatialRelationUtil.A_CIRCLE_DEGREE;
        }
        if (androidx.camera.core.Logger.isDebugEnabled(TAG)) {
            androidx.camera.core.Logger.d(TAG, java.lang.String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", java.lang.Integer.valueOf(destRotationDegrees), java.lang.Integer.valueOf(sourceRotationDegrees), java.lang.Boolean.valueOf(isOppositeFacing), java.lang.Integer.valueOf(i)));
        }
        return i;
    }

    public static int surfaceRotationToDegrees(int rotation) {
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return 180;
        }
        if (rotation == 3) {
            return 270;
        }
        throw new java.lang.IllegalArgumentException("Unsupported surface rotation: " + rotation);
    }

    public static int degreesToSurfaceRotation(int degrees) {
        if (degrees == 0) {
            return 0;
        }
        if (degrees == 90) {
            return 1;
        }
        if (degrees == 180) {
            return 2;
        }
        if (degrees == 270) {
            return 3;
        }
        throw new java.lang.IllegalStateException("Invalid sensor rotation: " + degrees);
    }
}
