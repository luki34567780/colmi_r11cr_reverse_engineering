package androidx.camera.camera2.internal.compat.params;

/* loaded from: classes.dex */
public final class SessionConfigurationCompat {
    public static final int SESSION_HIGH_SPEED = 1;
    public static final int SESSION_REGULAR = 0;
    private final androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl mImpl;

    private interface SessionConfigurationCompatImpl {
        java.util.concurrent.Executor getExecutor();

        androidx.camera.camera2.internal.compat.params.InputConfigurationCompat getInputConfiguration();

        java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> getOutputConfigurations();

        java.lang.Object getSessionConfiguration();

        android.hardware.camera2.CaptureRequest getSessionParameters();

        int getSessionType();

        android.hardware.camera2.CameraCaptureSession.StateCallback getStateCallback();

        void setInputConfiguration(androidx.camera.camera2.internal.compat.params.InputConfigurationCompat input);

        void setSessionParameters(android.hardware.camera2.CaptureRequest params);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SessionMode {
    }

    public SessionConfigurationCompat(int sessionType, java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> outputsCompat, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.StateCallback cb) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            this.mImpl = new androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatBaseImpl(sessionType, outputsCompat, executor, cb);
        } else {
            this.mImpl = new androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatApi28Impl(sessionType, outputsCompat, executor, cb);
        }
    }

    private SessionConfigurationCompat(androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl impl) {
        this.mImpl = impl;
    }

    public static androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat wrap(java.lang.Object sessionConfiguration) {
        if (sessionConfiguration != null && android.os.Build.VERSION.SDK_INT >= 28) {
            return new androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat(new androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatApi28Impl(sessionConfiguration));
        }
        return null;
    }

    static java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> transformToCompat(java.util.List<android.hardware.camera2.params.OutputConfiguration> outputConfigurations) {
        java.util.ArrayList arrayList = new java.util.ArrayList(outputConfigurations.size());
        java.util.Iterator<android.hardware.camera2.params.OutputConfiguration> it = outputConfigurations.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.wrap(it.next()));
        }
        return arrayList;
    }

    public static java.util.List<android.hardware.camera2.params.OutputConfiguration> transformFromCompat(java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> outputConfigurations) {
        java.util.ArrayList arrayList = new java.util.ArrayList(outputConfigurations.size());
        java.util.Iterator<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> it = outputConfigurations.iterator();
        while (it.hasNext()) {
            arrayList.add((android.hardware.camera2.params.OutputConfiguration) it.next().unwrap());
        }
        return arrayList;
    }

    public int getSessionType() {
        return this.mImpl.getSessionType();
    }

    public java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> getOutputConfigurations() {
        return this.mImpl.getOutputConfigurations();
    }

    public android.hardware.camera2.CameraCaptureSession.StateCallback getStateCallback() {
        return this.mImpl.getStateCallback();
    }

    public java.util.concurrent.Executor getExecutor() {
        return this.mImpl.getExecutor();
    }

    public androidx.camera.camera2.internal.compat.params.InputConfigurationCompat getInputConfiguration() {
        return this.mImpl.getInputConfiguration();
    }

    public void setInputConfiguration(androidx.camera.camera2.internal.compat.params.InputConfigurationCompat input) {
        this.mImpl.setInputConfiguration(input);
    }

    public android.hardware.camera2.CaptureRequest getSessionParameters() {
        return this.mImpl.getSessionParameters();
    }

    public void setSessionParameters(android.hardware.camera2.CaptureRequest params) {
        this.mImpl.setSessionParameters(params);
    }

    public java.lang.Object unwrap() {
        return this.mImpl.getSessionConfiguration();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat) {
            return this.mImpl.equals(((androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat) obj).mImpl);
        }
        return false;
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    private static final class SessionConfigurationCompatBaseImpl implements androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl {
        private final java.util.concurrent.Executor mExecutor;
        private final java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> mOutputConfigurations;
        private int mSessionType;
        private final android.hardware.camera2.CameraCaptureSession.StateCallback mStateCallback;
        private androidx.camera.camera2.internal.compat.params.InputConfigurationCompat mInputConfig = null;
        private android.hardware.camera2.CaptureRequest mSessionParameters = null;

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public java.lang.Object getSessionConfiguration() {
            return null;
        }

        SessionConfigurationCompatBaseImpl(int sessionType, java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> outputs, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.StateCallback cb) {
            this.mSessionType = sessionType;
            this.mOutputConfigurations = java.util.Collections.unmodifiableList(new java.util.ArrayList(outputs));
            this.mStateCallback = cb;
            this.mExecutor = executor;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public int getSessionType() {
            return this.mSessionType;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> getOutputConfigurations() {
            return this.mOutputConfigurations;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public android.hardware.camera2.CameraCaptureSession.StateCallback getStateCallback() {
            return this.mStateCallback;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public java.util.concurrent.Executor getExecutor() {
            return this.mExecutor;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public androidx.camera.camera2.internal.compat.params.InputConfigurationCompat getInputConfiguration() {
            return this.mInputConfig;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public void setInputConfiguration(androidx.camera.camera2.internal.compat.params.InputConfigurationCompat input) {
            if (this.mSessionType != 1) {
                this.mInputConfig = input;
                return;
            }
            throw new java.lang.UnsupportedOperationException("Method not supported for high speed session types");
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public android.hardware.camera2.CaptureRequest getSessionParameters() {
            return this.mSessionParameters;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public void setSessionParameters(android.hardware.camera2.CaptureRequest params) {
            this.mSessionParameters = params;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatBaseImpl) {
                androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatBaseImpl sessionConfigurationCompatBaseImpl = (androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatBaseImpl) obj;
                if (java.util.Objects.equals(this.mInputConfig, sessionConfigurationCompatBaseImpl.mInputConfig) && this.mSessionType == sessionConfigurationCompatBaseImpl.mSessionType && this.mOutputConfigurations.size() == sessionConfigurationCompatBaseImpl.mOutputConfigurations.size()) {
                    for (int i = 0; i < this.mOutputConfigurations.size(); i++) {
                        if (!this.mOutputConfigurations.get(i).equals(sessionConfigurationCompatBaseImpl.mOutputConfigurations.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.mOutputConfigurations.hashCode() ^ 31;
            int i = (hashCode << 5) - hashCode;
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat inputConfigurationCompat = this.mInputConfig;
            int hashCode2 = (inputConfigurationCompat == null ? 0 : inputConfigurationCompat.hashCode()) ^ i;
            return this.mSessionType ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    private static final class SessionConfigurationCompatApi28Impl implements androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl {
        private final android.hardware.camera2.params.SessionConfiguration mObject;
        private final java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> mOutputConfigurations;

        SessionConfigurationCompatApi28Impl(java.lang.Object sessionConfiguration) {
            android.hardware.camera2.params.SessionConfiguration sessionConfiguration2 = (android.hardware.camera2.params.SessionConfiguration) sessionConfiguration;
            this.mObject = sessionConfiguration2;
            this.mOutputConfigurations = java.util.Collections.unmodifiableList(androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.transformToCompat(sessionConfiguration2.getOutputConfigurations()));
        }

        SessionConfigurationCompatApi28Impl(int sessionType, java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> outputs, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.StateCallback cb) {
            this(new android.hardware.camera2.params.SessionConfiguration(sessionType, androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.transformFromCompat(outputs), executor, cb));
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public int getSessionType() {
            return this.mObject.getSessionType();
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> getOutputConfigurations() {
            return this.mOutputConfigurations;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public android.hardware.camera2.CameraCaptureSession.StateCallback getStateCallback() {
            return this.mObject.getStateCallback();
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public java.util.concurrent.Executor getExecutor() {
            return this.mObject.getExecutor();
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public androidx.camera.camera2.internal.compat.params.InputConfigurationCompat getInputConfiguration() {
            return androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.wrap(this.mObject.getInputConfiguration());
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public void setInputConfiguration(androidx.camera.camera2.internal.compat.params.InputConfigurationCompat input) {
            this.mObject.setInputConfiguration((android.hardware.camera2.params.InputConfiguration) input.unwrap());
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public android.hardware.camera2.CaptureRequest getSessionParameters() {
            return this.mObject.getSessionParameters();
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public void setSessionParameters(android.hardware.camera2.CaptureRequest params) {
            this.mObject.setSessionParameters(params);
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public java.lang.Object getSessionConfiguration() {
            return this.mObject;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatApi28Impl) {
                return java.util.Objects.equals(this.mObject, ((androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatApi28Impl) obj).mObject);
            }
            return false;
        }

        public int hashCode() {
            return this.mObject.hashCode();
        }
    }
}
