package androidx.media;

/* loaded from: classes.dex */
interface AudioAttributesImpl extends androidx.versionedparcelable.VersionedParcelable {
    java.lang.Object getAudioAttributes();

    int getContentType();

    int getFlags();

    int getLegacyStreamType();

    int getRawLegacyStreamType();

    int getUsage();

    int getVolumeControlStream();

    android.os.Bundle toBundle();
}
