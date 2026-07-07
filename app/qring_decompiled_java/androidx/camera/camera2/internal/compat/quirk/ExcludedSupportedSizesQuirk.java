package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes.dex */
public class ExcludedSupportedSizesQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.lang.String TAG = "ExcludedSupportedSizesQuirk";

    static boolean load() {
        return isOnePlus6() || isOnePlus6T();
    }

    private static boolean isOnePlus6() {
        return "OnePlus".equalsIgnoreCase(android.os.Build.BRAND) && "OnePlus6".equalsIgnoreCase(android.os.Build.DEVICE);
    }

    private static boolean isOnePlus6T() {
        return "OnePlus".equalsIgnoreCase(android.os.Build.BRAND) && "OnePlus6T".equalsIgnoreCase(android.os.Build.DEVICE);
    }

    public java.util.List<android.util.Size> getExcludedSizes(java.lang.String cameraId, int imageFormat) {
        if (isOnePlus6()) {
            return getOnePlus6ExcludedSizes(cameraId, imageFormat);
        }
        if (isOnePlus6T()) {
            return getOnePlus6TExcludedSizes(cameraId, imageFormat);
        }
        androidx.camera.core.Logger.w(TAG, "Cannot retrieve list of supported sizes to exclude on this device.");
        return java.util.Collections.emptyList();
    }

    private java.util.List<android.util.Size> getOnePlus6ExcludedSizes(java.lang.String cameraId, int imageFormat) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (cameraId.equals("0") && imageFormat == 256) {
            arrayList.add(new android.util.Size(4160, 3120));
            arrayList.add(new android.util.Size(com.amap.api.services.core.AMapException.CODE_AMAP_SHARE_LICENSE_IS_EXPIRED, 3000));
        }
        return arrayList;
    }

    private java.util.List<android.util.Size> getOnePlus6TExcludedSizes(java.lang.String cameraId, int imageFormat) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (cameraId.equals("0") && imageFormat == 256) {
            arrayList.add(new android.util.Size(4160, 3120));
            arrayList.add(new android.util.Size(com.amap.api.services.core.AMapException.CODE_AMAP_SHARE_LICENSE_IS_EXPIRED, 3000));
        }
        return arrayList;
    }
}
