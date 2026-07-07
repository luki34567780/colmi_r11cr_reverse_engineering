package androidx.camera.core;

/* loaded from: classes.dex */
final class CaptureBundles {
    static androidx.camera.core.impl.CaptureBundle singleDefaultCaptureBundle() {
        return createCaptureBundle(new androidx.camera.core.impl.CaptureStage.DefaultCaptureStage());
    }

    static androidx.camera.core.impl.CaptureBundle createCaptureBundle(androidx.camera.core.impl.CaptureStage... captureStages) {
        return new androidx.camera.core.CaptureBundles.CaptureBundleImpl(java.util.Arrays.asList(captureStages));
    }

    static androidx.camera.core.impl.CaptureBundle createCaptureBundle(java.util.List<androidx.camera.core.impl.CaptureStage> captureStageList) {
        return new androidx.camera.core.CaptureBundles.CaptureBundleImpl(captureStageList);
    }

    static final class CaptureBundleImpl implements androidx.camera.core.impl.CaptureBundle {
        final java.util.List<androidx.camera.core.impl.CaptureStage> mCaptureStageList;

        CaptureBundleImpl(java.util.List<androidx.camera.core.impl.CaptureStage> captureStageList) {
            if (captureStageList != null && !captureStageList.isEmpty()) {
                this.mCaptureStageList = java.util.Collections.unmodifiableList(new java.util.ArrayList(captureStageList));
                return;
            }
            throw new java.lang.IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }

        @Override // androidx.camera.core.impl.CaptureBundle
        public java.util.List<androidx.camera.core.impl.CaptureStage> getCaptureStages() {
            return this.mCaptureStageList;
        }
    }

    private CaptureBundles() {
    }
}
