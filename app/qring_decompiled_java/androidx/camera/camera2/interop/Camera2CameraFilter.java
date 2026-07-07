package androidx.camera.camera2.interop;

/* loaded from: classes.dex */
public final class Camera2CameraFilter {

    public interface Camera2Filter {
        java.util.List<androidx.camera.camera2.interop.Camera2CameraInfo> filter(java.util.List<androidx.camera.camera2.interop.Camera2CameraInfo> cameraInfos);
    }

    public static androidx.camera.core.CameraFilter createCameraFilter(final androidx.camera.camera2.interop.Camera2CameraFilter.Camera2Filter filter) {
        return new androidx.camera.core.CameraFilter() { // from class: androidx.camera.camera2.interop.Camera2CameraFilter$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.CameraFilter
            public final java.util.List filter(java.util.List list) {
                return androidx.camera.camera2.interop.Camera2CameraFilter.lambda$createCameraFilter$0(androidx.camera.camera2.interop.Camera2CameraFilter.Camera2Filter.this, list);
            }
        };
    }

    static /* synthetic */ java.util.List lambda$createCameraFilter$0(androidx.camera.camera2.interop.Camera2CameraFilter.Camera2Filter camera2Filter, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.camera.camera2.interop.Camera2CameraInfo.from((androidx.camera.core.CameraInfo) it.next()));
        }
        java.util.List<androidx.camera.camera2.interop.Camera2CameraInfo> filter = camera2Filter.filter(java.util.Collections.unmodifiableList(arrayList));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            androidx.camera.core.CameraInfo cameraInfo = (androidx.camera.core.CameraInfo) it2.next();
            if (filter.contains(androidx.camera.camera2.interop.Camera2CameraInfo.from(cameraInfo))) {
                arrayList2.add(cameraInfo);
            }
        }
        return arrayList2;
    }

    private Camera2CameraFilter() {
    }
}
