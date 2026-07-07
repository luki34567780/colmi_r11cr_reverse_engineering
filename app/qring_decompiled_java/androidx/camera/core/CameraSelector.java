package androidx.camera.core;

/* loaded from: classes.dex */
public final class CameraSelector {
    public static final int LENS_FACING_BACK = 1;
    public static final int LENS_FACING_FRONT = 0;
    private java.util.LinkedHashSet<androidx.camera.core.CameraFilter> mCameraFilterSet;
    public static final androidx.camera.core.CameraSelector DEFAULT_FRONT_CAMERA = new androidx.camera.core.CameraSelector.Builder().requireLensFacing(0).build();
    public static final androidx.camera.core.CameraSelector DEFAULT_BACK_CAMERA = new androidx.camera.core.CameraSelector.Builder().requireLensFacing(1).build();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LensFacing {
    }

    CameraSelector(java.util.LinkedHashSet<androidx.camera.core.CameraFilter> cameraFilterSet) {
        this.mCameraFilterSet = cameraFilterSet;
    }

    public androidx.camera.core.impl.CameraInternal select(java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> cameras) {
        return filter(cameras).iterator().next();
    }

    public java.util.List<androidx.camera.core.CameraInfo> filter(java.util.List<androidx.camera.core.CameraInfo> cameraInfos) {
        java.util.ArrayList arrayList = new java.util.ArrayList(cameraInfos);
        java.util.List<androidx.camera.core.CameraInfo> arrayList2 = new java.util.ArrayList<>(cameraInfos);
        java.util.Iterator<androidx.camera.core.CameraFilter> it = this.mCameraFilterSet.iterator();
        while (it.hasNext()) {
            arrayList2 = it.next().filter(java.util.Collections.unmodifiableList(arrayList2));
            if (arrayList2.isEmpty()) {
                throw new java.lang.IllegalArgumentException("No available camera can be found.");
            }
            if (!arrayList.containsAll(arrayList2)) {
                throw new java.lang.IllegalArgumentException("The output isn't contained in the input.");
            }
            arrayList.retainAll(arrayList2);
        }
        return arrayList2;
    }

    public java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> filter(java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> cameras) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.camera.core.impl.CameraInternal> it = cameras.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCameraInfo());
        }
        java.util.List<androidx.camera.core.CameraInfo> filter = filter(arrayList);
        java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> linkedHashSet = new java.util.LinkedHashSet<>();
        java.util.Iterator<androidx.camera.core.impl.CameraInternal> it2 = cameras.iterator();
        while (it2.hasNext()) {
            androidx.camera.core.impl.CameraInternal next = it2.next();
            if (filter.contains(next.getCameraInfo())) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    public java.util.LinkedHashSet<androidx.camera.core.CameraFilter> getCameraFilterSet() {
        return this.mCameraFilterSet;
    }

    public java.lang.Integer getLensFacing() {
        java.util.Iterator<androidx.camera.core.CameraFilter> it = this.mCameraFilterSet.iterator();
        java.lang.Integer num = null;
        while (it.hasNext()) {
            androidx.camera.core.CameraFilter next = it.next();
            if (next instanceof androidx.camera.core.impl.LensFacingCameraFilter) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(((androidx.camera.core.impl.LensFacingCameraFilter) next).getLensFacing());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new java.lang.IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public static final class Builder {
        private final java.util.LinkedHashSet<androidx.camera.core.CameraFilter> mCameraFilterSet;

        public Builder() {
            this.mCameraFilterSet = new java.util.LinkedHashSet<>();
        }

        private Builder(java.util.LinkedHashSet<androidx.camera.core.CameraFilter> cameraFilterSet) {
            this.mCameraFilterSet = new java.util.LinkedHashSet<>(cameraFilterSet);
        }

        public androidx.camera.core.CameraSelector.Builder requireLensFacing(int lensFacing) {
            this.mCameraFilterSet.add(new androidx.camera.core.impl.LensFacingCameraFilter(lensFacing));
            return this;
        }

        public androidx.camera.core.CameraSelector.Builder addCameraFilter(androidx.camera.core.CameraFilter cameraFilter) {
            this.mCameraFilterSet.add(cameraFilter);
            return this;
        }

        public static androidx.camera.core.CameraSelector.Builder fromSelector(androidx.camera.core.CameraSelector cameraSelector) {
            return new androidx.camera.core.CameraSelector.Builder(cameraSelector.getCameraFilterSet());
        }

        public androidx.camera.core.CameraSelector build() {
            return new androidx.camera.core.CameraSelector(this.mCameraFilterSet);
        }
    }
}
