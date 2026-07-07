package androidx.media;

/* loaded from: classes.dex */
class MediaSessionManagerImplApi28 extends androidx.media.MediaSessionManagerImplApi21 {
    android.media.session.MediaSessionManager mObject;

    MediaSessionManagerImplApi28(android.content.Context context) {
        super(context);
        this.mObject = (android.media.session.MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.MediaSessionManagerImplApi21, androidx.media.MediaSessionManagerImplBase, androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(androidx.media.MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        if (remoteUserInfoImpl instanceof androidx.media.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28) {
            return this.mObject.isTrustedForMediaControl(((androidx.media.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28) remoteUserInfoImpl).mObject);
        }
        return false;
    }

    static final class RemoteUserInfoImplApi28 implements androidx.media.MediaSessionManager.RemoteUserInfoImpl {
        final android.media.session.MediaSessionManager.RemoteUserInfo mObject;

        RemoteUserInfoImplApi28(java.lang.String str, int i, int i2) {
            this.mObject = new android.media.session.MediaSessionManager.RemoteUserInfo(str, i, i2);
        }

        RemoteUserInfoImplApi28(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.mObject = remoteUserInfo;
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public java.lang.String getPackageName() {
            return this.mObject.getPackageName();
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getPid() {
            return this.mObject.getPid();
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getUid() {
            return this.mObject.getUid();
        }

        public int hashCode() {
            return androidx.core.util.ObjectsCompat.hash(this.mObject);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof androidx.media.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28) {
                return this.mObject.equals(((androidx.media.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28) obj).mObject);
            }
            return false;
        }
    }
}
