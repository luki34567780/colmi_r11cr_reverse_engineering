package androidx.camera.core.impl;

/* loaded from: classes.dex */
public final class SessionConfig {
    private final java.util.List<android.hardware.camera2.CameraDevice.StateCallback> mDeviceStateCallbacks;
    private final java.util.List<androidx.camera.core.impl.SessionConfig.ErrorListener> mErrorListeners;
    private final androidx.camera.core.impl.CaptureConfig mRepeatingCaptureConfig;
    private final java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> mSessionStateCallbacks;
    private final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> mSingleCameraCaptureCallbacks;
    private final java.util.List<androidx.camera.core.impl.DeferrableSurface> mSurfaces;

    public interface ErrorListener {
        void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError error);
    }

    public interface OptionUnpacker {
        void unpack(androidx.camera.core.impl.UseCaseConfig<?> config, androidx.camera.core.impl.SessionConfig.Builder builder);
    }

    public enum SessionError {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    SessionConfig(java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces, java.util.List<android.hardware.camera2.CameraDevice.StateCallback> deviceStateCallbacks, java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> sessionStateCallbacks, java.util.List<androidx.camera.core.impl.CameraCaptureCallback> singleCameraCaptureCallbacks, java.util.List<androidx.camera.core.impl.SessionConfig.ErrorListener> errorListeners, androidx.camera.core.impl.CaptureConfig repeatingCaptureConfig) {
        this.mSurfaces = surfaces;
        this.mDeviceStateCallbacks = java.util.Collections.unmodifiableList(deviceStateCallbacks);
        this.mSessionStateCallbacks = java.util.Collections.unmodifiableList(sessionStateCallbacks);
        this.mSingleCameraCaptureCallbacks = java.util.Collections.unmodifiableList(singleCameraCaptureCallbacks);
        this.mErrorListeners = java.util.Collections.unmodifiableList(errorListeners);
        this.mRepeatingCaptureConfig = repeatingCaptureConfig;
    }

    public static androidx.camera.core.impl.SessionConfig defaultEmptySessionConfig() {
        return new androidx.camera.core.impl.SessionConfig(new java.util.ArrayList(), new java.util.ArrayList(0), new java.util.ArrayList(0), new java.util.ArrayList(0), new java.util.ArrayList(0), new androidx.camera.core.impl.CaptureConfig.Builder().build());
    }

    public java.util.List<androidx.camera.core.impl.DeferrableSurface> getSurfaces() {
        return java.util.Collections.unmodifiableList(this.mSurfaces);
    }

    public androidx.camera.core.impl.Config getImplementationOptions() {
        return this.mRepeatingCaptureConfig.getImplementationOptions();
    }

    public int getTemplateType() {
        return this.mRepeatingCaptureConfig.getTemplateType();
    }

    public java.util.List<android.hardware.camera2.CameraDevice.StateCallback> getDeviceStateCallbacks() {
        return this.mDeviceStateCallbacks;
    }

    public java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> getSessionStateCallbacks() {
        return this.mSessionStateCallbacks;
    }

    public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getRepeatingCameraCaptureCallbacks() {
        return this.mRepeatingCaptureConfig.getCameraCaptureCallbacks();
    }

    public java.util.List<androidx.camera.core.impl.SessionConfig.ErrorListener> getErrorListeners() {
        return this.mErrorListeners;
    }

    public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getSingleCameraCaptureCallbacks() {
        return this.mSingleCameraCaptureCallbacks;
    }

    public androidx.camera.core.impl.CaptureConfig getRepeatingCaptureConfig() {
        return this.mRepeatingCaptureConfig;
    }

    static class BaseBuilder {
        final java.util.Set<androidx.camera.core.impl.DeferrableSurface> mSurfaces = new java.util.HashSet();
        final androidx.camera.core.impl.CaptureConfig.Builder mCaptureConfigBuilder = new androidx.camera.core.impl.CaptureConfig.Builder();
        final java.util.List<android.hardware.camera2.CameraDevice.StateCallback> mDeviceStateCallbacks = new java.util.ArrayList();
        final java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> mSessionStateCallbacks = new java.util.ArrayList();
        final java.util.List<androidx.camera.core.impl.SessionConfig.ErrorListener> mErrorListeners = new java.util.ArrayList();
        final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> mSingleCameraCaptureCallbacks = new java.util.ArrayList();

        BaseBuilder() {
        }
    }

    public static class Builder extends androidx.camera.core.impl.SessionConfig.BaseBuilder {
        public static androidx.camera.core.impl.SessionConfig.Builder createFrom(androidx.camera.core.impl.UseCaseConfig<?> config) {
            androidx.camera.core.impl.SessionConfig.OptionUnpacker sessionOptionUnpacker = config.getSessionOptionUnpacker(null);
            if (sessionOptionUnpacker == null) {
                throw new java.lang.IllegalStateException("Implementation is missing option unpacker for " + config.getTargetName(config.toString()));
            }
            androidx.camera.core.impl.SessionConfig.Builder builder = new androidx.camera.core.impl.SessionConfig.Builder();
            sessionOptionUnpacker.unpack(config, builder);
            return builder;
        }

        public void setTemplateType(int templateType) {
            this.mCaptureConfigBuilder.setTemplateType(templateType);
        }

        public void addTag(java.lang.String key, java.lang.Integer tag) {
            this.mCaptureConfigBuilder.addTag(key, tag);
        }

        public void addDeviceStateCallback(android.hardware.camera2.CameraDevice.StateCallback deviceStateCallback) {
            if (this.mDeviceStateCallbacks.contains(deviceStateCallback)) {
                throw new java.lang.IllegalArgumentException("Duplicate device state callback.");
            }
            this.mDeviceStateCallbacks.add(deviceStateCallback);
        }

        public void addAllDeviceStateCallbacks(java.util.Collection<android.hardware.camera2.CameraDevice.StateCallback> deviceStateCallbacks) {
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = deviceStateCallbacks.iterator();
            while (it.hasNext()) {
                addDeviceStateCallback(it.next());
            }
        }

        public void addSessionStateCallback(android.hardware.camera2.CameraCaptureSession.StateCallback sessionStateCallback) {
            if (this.mSessionStateCallbacks.contains(sessionStateCallback)) {
                throw new java.lang.IllegalArgumentException("Duplicate session state callback.");
            }
            this.mSessionStateCallbacks.add(sessionStateCallback);
        }

        public void addAllSessionStateCallbacks(java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> sessionStateCallbacks) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = sessionStateCallbacks.iterator();
            while (it.hasNext()) {
                addSessionStateCallback(it.next());
            }
        }

        public void addRepeatingCameraCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
            this.mCaptureConfigBuilder.addCameraCaptureCallback(cameraCaptureCallback);
        }

        public void addAllRepeatingCameraCaptureCallbacks(java.util.Collection<androidx.camera.core.impl.CameraCaptureCallback> cameraCaptureCallbacks) {
            this.mCaptureConfigBuilder.addAllCameraCaptureCallbacks(cameraCaptureCallbacks);
        }

        public void addCameraCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
            this.mCaptureConfigBuilder.addCameraCaptureCallback(cameraCaptureCallback);
            this.mSingleCameraCaptureCallbacks.add(cameraCaptureCallback);
        }

        public void addAllCameraCaptureCallbacks(java.util.Collection<androidx.camera.core.impl.CameraCaptureCallback> cameraCaptureCallbacks) {
            this.mCaptureConfigBuilder.addAllCameraCaptureCallbacks(cameraCaptureCallbacks);
            this.mSingleCameraCaptureCallbacks.addAll(cameraCaptureCallbacks);
        }

        public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getSingleCameraCaptureCallbacks() {
            return java.util.Collections.unmodifiableList(this.mSingleCameraCaptureCallbacks);
        }

        public void addErrorListener(androidx.camera.core.impl.SessionConfig.ErrorListener errorListener) {
            this.mErrorListeners.add(errorListener);
        }

        public void addSurface(androidx.camera.core.impl.DeferrableSurface surface) {
            this.mSurfaces.add(surface);
            this.mCaptureConfigBuilder.addSurface(surface);
        }

        public void addNonRepeatingSurface(androidx.camera.core.impl.DeferrableSurface surface) {
            this.mSurfaces.add(surface);
        }

        public void removeSurface(androidx.camera.core.impl.DeferrableSurface surface) {
            this.mSurfaces.remove(surface);
            this.mCaptureConfigBuilder.removeSurface(surface);
        }

        public void clearSurfaces() {
            this.mSurfaces.clear();
            this.mCaptureConfigBuilder.clearSurfaces();
        }

        public void setImplementationOptions(androidx.camera.core.impl.Config config) {
            this.mCaptureConfigBuilder.setImplementationOptions(config);
        }

        public void addImplementationOptions(androidx.camera.core.impl.Config config) {
            this.mCaptureConfigBuilder.addImplementationOptions(config);
        }

        public androidx.camera.core.impl.SessionConfig build() {
            return new androidx.camera.core.impl.SessionConfig(new java.util.ArrayList(this.mSurfaces), this.mDeviceStateCallbacks, this.mSessionStateCallbacks, this.mSingleCameraCaptureCallbacks, this.mErrorListeners, this.mCaptureConfigBuilder.build());
        }
    }

    public static final class ValidatingBuilder extends androidx.camera.core.impl.SessionConfig.BaseBuilder {
        private static final java.lang.String TAG = "ValidatingBuilder";
        private boolean mValid = true;
        private boolean mTemplateSet = false;

        public void add(androidx.camera.core.impl.SessionConfig sessionConfig) {
            androidx.camera.core.impl.CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
            if (repeatingCaptureConfig.getTemplateType() != -1) {
                if (!this.mTemplateSet) {
                    this.mCaptureConfigBuilder.setTemplateType(repeatingCaptureConfig.getTemplateType());
                    this.mTemplateSet = true;
                } else if (this.mCaptureConfigBuilder.getTemplateType() != repeatingCaptureConfig.getTemplateType()) {
                    androidx.camera.core.Logger.d(TAG, "Invalid configuration due to template type: " + this.mCaptureConfigBuilder.getTemplateType() + " != " + repeatingCaptureConfig.getTemplateType());
                    this.mValid = false;
                }
            }
            this.mCaptureConfigBuilder.addAllTags(sessionConfig.getRepeatingCaptureConfig().getTagBundle());
            this.mDeviceStateCallbacks.addAll(sessionConfig.getDeviceStateCallbacks());
            this.mSessionStateCallbacks.addAll(sessionConfig.getSessionStateCallbacks());
            this.mCaptureConfigBuilder.addAllCameraCaptureCallbacks(sessionConfig.getRepeatingCameraCaptureCallbacks());
            this.mSingleCameraCaptureCallbacks.addAll(sessionConfig.getSingleCameraCaptureCallbacks());
            this.mErrorListeners.addAll(sessionConfig.getErrorListeners());
            this.mSurfaces.addAll(sessionConfig.getSurfaces());
            this.mCaptureConfigBuilder.getSurfaces().addAll(repeatingCaptureConfig.getSurfaces());
            if (!this.mSurfaces.containsAll(this.mCaptureConfigBuilder.getSurfaces())) {
                androidx.camera.core.Logger.d(TAG, "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.mValid = false;
            }
            this.mCaptureConfigBuilder.addImplementationOptions(repeatingCaptureConfig.getImplementationOptions());
        }

        public boolean isValid() {
            return this.mTemplateSet && this.mValid;
        }

        public androidx.camera.core.impl.SessionConfig build() {
            if (!this.mValid) {
                throw new java.lang.IllegalArgumentException("Unsupported session configuration combination");
            }
            return new androidx.camera.core.impl.SessionConfig(new java.util.ArrayList(this.mSurfaces), this.mDeviceStateCallbacks, this.mSessionStateCallbacks, this.mSingleCameraCaptureCallbacks, this.mErrorListeners, this.mCaptureConfigBuilder.build());
        }
    }
}
