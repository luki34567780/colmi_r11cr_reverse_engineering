package androidx.media;

/* loaded from: classes.dex */
public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private androidx.media.VolumeProviderCompat.Callback mCallback;
    private final int mControlType;
    private int mCurrentVolume;
    private final int mMaxVolume;
    private java.lang.Object mVolumeProviderObj;

    public static abstract class Callback {
        public abstract void onVolumeChanged(androidx.media.VolumeProviderCompat volumeProviderCompat);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ControlType {
    }

    public void onAdjustVolume(int i) {
    }

    public void onSetVolumeTo(int i) {
    }

    public VolumeProviderCompat(int i, int i2, int i3) {
        this.mControlType = i;
        this.mMaxVolume = i2;
        this.mCurrentVolume = i3;
    }

    public final int getCurrentVolume() {
        return this.mCurrentVolume;
    }

    public final int getVolumeControl() {
        return this.mControlType;
    }

    public final int getMaxVolume() {
        return this.mMaxVolume;
    }

    public final void setCurrentVolume(int i) {
        this.mCurrentVolume = i;
        java.lang.Object volumeProvider = getVolumeProvider();
        if (volumeProvider != null && android.os.Build.VERSION.SDK_INT >= 21) {
            androidx.media.VolumeProviderCompatApi21.setCurrentVolume(volumeProvider, i);
        }
        androidx.media.VolumeProviderCompat.Callback callback = this.mCallback;
        if (callback != null) {
            callback.onVolumeChanged(this);
        }
    }

    public void setCallback(androidx.media.VolumeProviderCompat.Callback callback) {
        this.mCallback = callback;
    }

    public java.lang.Object getVolumeProvider() {
        if (this.mVolumeProviderObj == null && android.os.Build.VERSION.SDK_INT >= 21) {
            this.mVolumeProviderObj = androidx.media.VolumeProviderCompatApi21.createVolumeProvider(this.mControlType, this.mMaxVolume, this.mCurrentVolume, new androidx.media.VolumeProviderCompatApi21.Delegate() { // from class: androidx.media.VolumeProviderCompat.1
                @Override // androidx.media.VolumeProviderCompatApi21.Delegate
                public void onSetVolumeTo(int i) {
                    androidx.media.VolumeProviderCompat.this.onSetVolumeTo(i);
                }

                @Override // androidx.media.VolumeProviderCompatApi21.Delegate
                public void onAdjustVolume(int i) {
                    androidx.media.VolumeProviderCompat.this.onAdjustVolume(i);
                }
            });
        }
        return this.mVolumeProviderObj;
    }
}
