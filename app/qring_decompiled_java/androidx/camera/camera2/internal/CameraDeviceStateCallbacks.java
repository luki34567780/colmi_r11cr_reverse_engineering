package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
public final class CameraDeviceStateCallbacks {
    private CameraDeviceStateCallbacks() {
    }

    public static android.hardware.camera2.CameraDevice.StateCallback createNoOpCallback() {
        return new androidx.camera.camera2.internal.CameraDeviceStateCallbacks.NoOpDeviceStateCallback();
    }

    public static android.hardware.camera2.CameraDevice.StateCallback createComboCallback(java.util.List<android.hardware.camera2.CameraDevice.StateCallback> callbacks) {
        if (callbacks.isEmpty()) {
            return createNoOpCallback();
        }
        if (callbacks.size() == 1) {
            return callbacks.get(0);
        }
        return new androidx.camera.camera2.internal.CameraDeviceStateCallbacks.ComboDeviceStateCallback(callbacks);
    }

    public static android.hardware.camera2.CameraDevice.StateCallback createComboCallback(android.hardware.camera2.CameraDevice.StateCallback... callbacks) {
        return createComboCallback((java.util.List<android.hardware.camera2.CameraDevice.StateCallback>) java.util.Arrays.asList(callbacks));
    }

    static final class NoOpDeviceStateCallback extends android.hardware.camera2.CameraDevice.StateCallback {
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(android.hardware.camera2.CameraDevice cameraDevice, int error) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(android.hardware.camera2.CameraDevice cameraDevice) {
        }

        NoOpDeviceStateCallback() {
        }
    }

    private static final class ComboDeviceStateCallback extends android.hardware.camera2.CameraDevice.StateCallback {
        private final java.util.List<android.hardware.camera2.CameraDevice.StateCallback> mCallbacks = new java.util.ArrayList();

        ComboDeviceStateCallback(java.util.List<android.hardware.camera2.CameraDevice.StateCallback> callbacks) {
            for (android.hardware.camera2.CameraDevice.StateCallback stateCallback : callbacks) {
                if (!(stateCallback instanceof androidx.camera.camera2.internal.CameraDeviceStateCallbacks.NoOpDeviceStateCallback)) {
                    this.mCallbacks.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(android.hardware.camera2.CameraDevice cameraDevice) {
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onOpened(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(android.hardware.camera2.CameraDevice cameraDevice, int error) {
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onError(cameraDevice, error);
            }
        }
    }
}
