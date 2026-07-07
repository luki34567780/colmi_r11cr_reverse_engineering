package androidx.camera.core.impl;

/* loaded from: classes.dex */
public final class CameraCaptureCallbacks {
    private CameraCaptureCallbacks() {
    }

    public static androidx.camera.core.impl.CameraCaptureCallback createNoOpCallback() {
        return new androidx.camera.core.impl.CameraCaptureCallbacks.NoOpCameraCaptureCallback();
    }

    static androidx.camera.core.impl.CameraCaptureCallback createComboCallback(java.util.List<androidx.camera.core.impl.CameraCaptureCallback> callbacks) {
        if (callbacks.isEmpty()) {
            return createNoOpCallback();
        }
        if (callbacks.size() == 1) {
            return callbacks.get(0);
        }
        return new androidx.camera.core.impl.CameraCaptureCallbacks.ComboCameraCaptureCallback(callbacks);
    }

    public static androidx.camera.core.impl.CameraCaptureCallback createComboCallback(androidx.camera.core.impl.CameraCaptureCallback... callbacks) {
        return createComboCallback((java.util.List<androidx.camera.core.impl.CameraCaptureCallback>) java.util.Arrays.asList(callbacks));
    }

    static final class NoOpCameraCaptureCallback extends androidx.camera.core.impl.CameraCaptureCallback {
        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(androidx.camera.core.impl.CameraCaptureFailure failure) {
        }

        NoOpCameraCaptureCallback() {
        }
    }

    public static final class ComboCameraCaptureCallback extends androidx.camera.core.impl.CameraCaptureCallback {
        private final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> mCallbacks = new java.util.ArrayList();

        ComboCameraCaptureCallback(java.util.List<androidx.camera.core.impl.CameraCaptureCallback> callbacks) {
            for (androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback : callbacks) {
                if (!(cameraCaptureCallback instanceof androidx.camera.core.impl.CameraCaptureCallbacks.NoOpCameraCaptureCallback)) {
                    this.mCallbacks.add(cameraCaptureCallback);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(androidx.camera.core.impl.CameraCaptureResult result) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCompleted(result);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(androidx.camera.core.impl.CameraCaptureFailure failure) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureFailed(failure);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled() {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCancelled();
            }
        }

        public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getCallbacks() {
            return this.mCallbacks;
        }
    }
}
