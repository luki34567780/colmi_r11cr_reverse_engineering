package androidx.media;

/* loaded from: classes.dex */
class VolumeProviderCompatApi21 {

    public interface Delegate {
        void onAdjustVolume(int i);

        void onSetVolumeTo(int i);
    }

    public static java.lang.Object createVolumeProvider(int i, int i2, int i3, final androidx.media.VolumeProviderCompatApi21.Delegate delegate) {
        return new android.media.VolumeProvider(i, i2, i3) { // from class: androidx.media.VolumeProviderCompatApi21.1
            @Override // android.media.VolumeProvider
            public void onSetVolumeTo(int i4) {
                delegate.onSetVolumeTo(i4);
            }

            @Override // android.media.VolumeProvider
            public void onAdjustVolume(int i4) {
                delegate.onAdjustVolume(i4);
            }
        };
    }

    public static void setCurrentVolume(java.lang.Object obj, int i) {
        ((android.media.VolumeProvider) obj).setCurrentVolume(i);
    }

    private VolumeProviderCompatApi21() {
    }
}
