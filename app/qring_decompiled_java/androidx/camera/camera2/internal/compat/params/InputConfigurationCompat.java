package androidx.camera.camera2.internal.compat.params;

/* loaded from: classes.dex */
public final class InputConfigurationCompat {
    private final androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl mImpl;

    private interface InputConfigurationCompatImpl {
        int getFormat();

        int getHeight();

        java.lang.Object getInputConfiguration();

        int getWidth();
    }

    public InputConfigurationCompat(int width, int height, int format) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            this.mImpl = new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatApi23Impl(width, height, format);
        } else {
            this.mImpl = new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatBaseImpl(width, height, format);
        }
    }

    private InputConfigurationCompat(androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl impl) {
        this.mImpl = impl;
    }

    public static androidx.camera.camera2.internal.compat.params.InputConfigurationCompat wrap(java.lang.Object inputConfiguration) {
        if (inputConfiguration != null && android.os.Build.VERSION.SDK_INT >= 23) {
            return new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat(new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatApi23Impl(inputConfiguration));
        }
        return null;
    }

    public int getWidth() {
        return this.mImpl.getWidth();
    }

    public int getHeight() {
        return this.mImpl.getHeight();
    }

    public int getFormat() {
        return this.mImpl.getFormat();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.camera.camera2.internal.compat.params.InputConfigurationCompat) {
            return this.mImpl.equals(((androidx.camera.camera2.internal.compat.params.InputConfigurationCompat) obj).mImpl);
        }
        return false;
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public java.lang.String toString() {
        return this.mImpl.toString();
    }

    public java.lang.Object unwrap() {
        return this.mImpl.getInputConfiguration();
    }

    static final class InputConfigurationCompatBaseImpl implements androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl {
        private final int mFormat;
        private final int mHeight;
        private final int mWidth;

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public java.lang.Object getInputConfiguration() {
            return null;
        }

        InputConfigurationCompatBaseImpl(int width, int height, int format) {
            this.mWidth = width;
            this.mHeight = height;
            this.mFormat = format;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getWidth() {
            return this.mWidth;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getHeight() {
            return this.mHeight;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getFormat() {
            return this.mFormat;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatBaseImpl)) {
                return false;
            }
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatBaseImpl inputConfigurationCompatBaseImpl = (androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatBaseImpl) obj;
            return inputConfigurationCompatBaseImpl.getWidth() == this.mWidth && inputConfigurationCompatBaseImpl.getHeight() == this.mHeight && inputConfigurationCompatBaseImpl.getFormat() == this.mFormat;
        }

        public int hashCode() {
            int i = this.mWidth ^ 31;
            int i2 = this.mHeight ^ ((i << 5) - i);
            return this.mFormat ^ ((i2 << 5) - i2);
        }

        public java.lang.String toString() {
            return java.lang.String.format("InputConfiguration(w:%d, h:%d, format:%d)", java.lang.Integer.valueOf(this.mWidth), java.lang.Integer.valueOf(this.mHeight), java.lang.Integer.valueOf(this.mFormat));
        }
    }

    private static final class InputConfigurationCompatApi23Impl implements androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl {
        private final android.hardware.camera2.params.InputConfiguration mObject;

        InputConfigurationCompatApi23Impl(java.lang.Object inputConfiguration) {
            this.mObject = (android.hardware.camera2.params.InputConfiguration) inputConfiguration;
        }

        InputConfigurationCompatApi23Impl(int width, int height, int format) {
            this(new android.hardware.camera2.params.InputConfiguration(width, height, format));
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getWidth() {
            return this.mObject.getWidth();
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getHeight() {
            return this.mObject.getHeight();
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getFormat() {
            return this.mObject.getFormat();
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public java.lang.Object getInputConfiguration() {
            return this.mObject;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl) {
                return java.util.Objects.equals(this.mObject, ((androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl) obj).getInputConfiguration());
            }
            return false;
        }

        public int hashCode() {
            return this.mObject.hashCode();
        }

        public java.lang.String toString() {
            return this.mObject.toString();
        }
    }
}
