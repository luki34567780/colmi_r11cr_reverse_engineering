package androidx.camera.camera2.impl;

/* loaded from: classes.dex */
public final class CameraEventCallbacks extends androidx.camera.core.impl.MultiValueSet<androidx.camera.camera2.impl.CameraEventCallback> {
    public CameraEventCallbacks(androidx.camera.camera2.impl.CameraEventCallback... callbacks) {
        addAll(java.util.Arrays.asList(callbacks));
    }

    public androidx.camera.camera2.impl.CameraEventCallbacks.ComboCameraEventCallback createComboCallback() {
        return new androidx.camera.camera2.impl.CameraEventCallbacks.ComboCameraEventCallback(getAllItems());
    }

    public static androidx.camera.camera2.impl.CameraEventCallbacks createEmptyCallback() {
        return new androidx.camera.camera2.impl.CameraEventCallbacks(new androidx.camera.camera2.impl.CameraEventCallback[0]);
    }

    @Override // androidx.camera.core.impl.MultiValueSet
    /* renamed from: clone */
    public androidx.camera.core.impl.MultiValueSet<androidx.camera.camera2.impl.CameraEventCallback> mo2clone() {
        androidx.camera.camera2.impl.CameraEventCallbacks createEmptyCallback = createEmptyCallback();
        createEmptyCallback.addAll(getAllItems());
        return createEmptyCallback;
    }

    public static final class ComboCameraEventCallback {
        private final java.util.List<androidx.camera.camera2.impl.CameraEventCallback> mCallbacks = new java.util.ArrayList();

        ComboCameraEventCallback(java.util.List<androidx.camera.camera2.impl.CameraEventCallback> callbacks) {
            java.util.Iterator<androidx.camera.camera2.impl.CameraEventCallback> it = callbacks.iterator();
            while (it.hasNext()) {
                this.mCallbacks.add(it.next());
            }
        }

        public java.util.List<androidx.camera.core.impl.CaptureConfig> onPresetSession() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.camera.camera2.impl.CameraEventCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                androidx.camera.core.impl.CaptureConfig onPresetSession = it.next().onPresetSession();
                if (onPresetSession != null) {
                    arrayList.add(onPresetSession);
                }
            }
            return arrayList;
        }

        public java.util.List<androidx.camera.core.impl.CaptureConfig> onEnableSession() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.camera.camera2.impl.CameraEventCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                androidx.camera.core.impl.CaptureConfig onEnableSession = it.next().onEnableSession();
                if (onEnableSession != null) {
                    arrayList.add(onEnableSession);
                }
            }
            return arrayList;
        }

        public java.util.List<androidx.camera.core.impl.CaptureConfig> onRepeating() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.camera.camera2.impl.CameraEventCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                androidx.camera.core.impl.CaptureConfig onRepeating = it.next().onRepeating();
                if (onRepeating != null) {
                    arrayList.add(onRepeating);
                }
            }
            return arrayList;
        }

        public java.util.List<androidx.camera.core.impl.CaptureConfig> onDisableSession() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.camera.camera2.impl.CameraEventCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                androidx.camera.core.impl.CaptureConfig onDisableSession = it.next().onDisableSession();
                if (onDisableSession != null) {
                    arrayList.add(onDisableSession);
                }
            }
            return arrayList;
        }

        public java.util.List<androidx.camera.camera2.impl.CameraEventCallback> getCallbacks() {
            return this.mCallbacks;
        }
    }
}
