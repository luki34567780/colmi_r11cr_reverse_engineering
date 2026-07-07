package androidx.camera.camera2.impl;

/* loaded from: classes.dex */
public final class Camera2ImplConfig extends androidx.camera.camera2.interop.CaptureRequestOptions {
    public static final java.lang.String CAPTURE_REQUEST_ID_STEM = "camera2.captureRequest.option.";
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> TEMPLATE_TYPE_OPTION = androidx.camera.core.impl.Config.Option.create("camera2.captureRequest.templateType", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<android.hardware.camera2.CameraDevice.StateCallback> DEVICE_STATE_CALLBACK_OPTION = androidx.camera.core.impl.Config.Option.create("camera2.cameraDevice.stateCallback", android.hardware.camera2.CameraDevice.StateCallback.class);
    public static final androidx.camera.core.impl.Config.Option<android.hardware.camera2.CameraCaptureSession.StateCallback> SESSION_STATE_CALLBACK_OPTION = androidx.camera.core.impl.Config.Option.create("camera2.cameraCaptureSession.stateCallback", android.hardware.camera2.CameraCaptureSession.StateCallback.class);
    public static final androidx.camera.core.impl.Config.Option<android.hardware.camera2.CameraCaptureSession.CaptureCallback> SESSION_CAPTURE_CALLBACK_OPTION = androidx.camera.core.impl.Config.Option.create("camera2.cameraCaptureSession.captureCallback", android.hardware.camera2.CameraCaptureSession.CaptureCallback.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.camera2.impl.CameraEventCallbacks> CAMERA_EVENT_CALLBACK_OPTION = androidx.camera.core.impl.Config.Option.create("camera2.cameraEvent.callback", androidx.camera.camera2.impl.CameraEventCallbacks.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Object> CAPTURE_REQUEST_TAG_OPTION = androidx.camera.core.impl.Config.Option.create("camera2.captureRequest.tag", java.lang.Object.class);

    public Camera2ImplConfig(androidx.camera.core.impl.Config config) {
        super(config);
    }

    public static androidx.camera.core.impl.Config.Option<java.lang.Object> createCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<?> key) {
        return androidx.camera.core.impl.Config.Option.create(CAPTURE_REQUEST_ID_STEM + key.getName(), java.lang.Object.class, key);
    }

    public androidx.camera.camera2.interop.CaptureRequestOptions getCaptureRequestOptions() {
        return androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(getConfig()).build();
    }

    public int getCaptureRequestTemplate(int valueIfMissing) {
        return ((java.lang.Integer) getConfig().retrieveOption(TEMPLATE_TYPE_OPTION, java.lang.Integer.valueOf(valueIfMissing))).intValue();
    }

    public android.hardware.camera2.CameraDevice.StateCallback getDeviceStateCallback(android.hardware.camera2.CameraDevice.StateCallback valueIfMissing) {
        return (android.hardware.camera2.CameraDevice.StateCallback) getConfig().retrieveOption(DEVICE_STATE_CALLBACK_OPTION, valueIfMissing);
    }

    public android.hardware.camera2.CameraCaptureSession.StateCallback getSessionStateCallback(android.hardware.camera2.CameraCaptureSession.StateCallback valueIfMissing) {
        return (android.hardware.camera2.CameraCaptureSession.StateCallback) getConfig().retrieveOption(SESSION_STATE_CALLBACK_OPTION, valueIfMissing);
    }

    public android.hardware.camera2.CameraCaptureSession.CaptureCallback getSessionCaptureCallback(android.hardware.camera2.CameraCaptureSession.CaptureCallback valueIfMissing) {
        return (android.hardware.camera2.CameraCaptureSession.CaptureCallback) getConfig().retrieveOption(SESSION_CAPTURE_CALLBACK_OPTION, valueIfMissing);
    }

    public androidx.camera.camera2.impl.CameraEventCallbacks getCameraEventCallback(androidx.camera.camera2.impl.CameraEventCallbacks valueIfMissing) {
        return (androidx.camera.camera2.impl.CameraEventCallbacks) getConfig().retrieveOption(CAMERA_EVENT_CALLBACK_OPTION, valueIfMissing);
    }

    public java.lang.Object getCaptureRequestTag(java.lang.Object valueIfMissing) {
        return getConfig().retrieveOption(CAPTURE_REQUEST_TAG_OPTION, valueIfMissing);
    }

    public static final class Builder implements androidx.camera.core.ExtendableBuilder<androidx.camera.camera2.impl.Camera2ImplConfig> {
        private final androidx.camera.core.impl.MutableOptionsBundle mMutableOptionsBundle = androidx.camera.core.impl.MutableOptionsBundle.create();

        @Override // androidx.camera.core.ExtendableBuilder
        public androidx.camera.core.impl.MutableConfig getMutableConfig() {
            return this.mMutableOptionsBundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> androidx.camera.camera2.impl.Camera2ImplConfig.Builder setCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT value) {
            this.mMutableOptionsBundle.insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(key), value);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> androidx.camera.camera2.impl.Camera2ImplConfig.Builder setCaptureRequestOptionWithPriority(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT value, androidx.camera.core.impl.Config.OptionPriority priority) {
            this.mMutableOptionsBundle.insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(key), priority, value);
            return this;
        }

        public androidx.camera.camera2.impl.Camera2ImplConfig.Builder insertAllOptions(androidx.camera.core.impl.Config config) {
            for (androidx.camera.core.impl.Config.Option<?> option : config.listOptions()) {
                this.mMutableOptionsBundle.insertOption(option, config.retrieveOption(option));
            }
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.ExtendableBuilder
        public androidx.camera.camera2.impl.Camera2ImplConfig build() {
            return new androidx.camera.camera2.impl.Camera2ImplConfig(androidx.camera.core.impl.OptionsBundle.from(this.mMutableOptionsBundle));
        }
    }

    public static final class Extender<T> {
        androidx.camera.core.ExtendableBuilder<T> mBaseBuilder;

        public Extender(androidx.camera.core.ExtendableBuilder<T> baseBuilder) {
            this.mBaseBuilder = baseBuilder;
        }

        public androidx.camera.camera2.impl.Camera2ImplConfig.Extender<T> setCameraEventCallback(androidx.camera.camera2.impl.CameraEventCallbacks cameraEventCallbacks) {
            this.mBaseBuilder.getMutableConfig().insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.CAMERA_EVENT_CALLBACK_OPTION, cameraEventCallbacks);
            return this;
        }
    }
}
