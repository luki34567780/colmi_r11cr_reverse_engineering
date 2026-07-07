package androidx.media;

/* loaded from: classes.dex */
class MediaBrowserServiceCompatApi21 {

    public interface ServiceCompatProxy {
        androidx.media.MediaBrowserServiceCompatApi21.BrowserRoot onGetRoot(java.lang.String str, int i, android.os.Bundle bundle);

        void onLoadChildren(java.lang.String str, androidx.media.MediaBrowserServiceCompatApi21.ResultWrapper<java.util.List<android.os.Parcel>> resultWrapper);
    }

    public static java.lang.Object createService(android.content.Context context, androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy serviceCompatProxy) {
        return new androidx.media.MediaBrowserServiceCompatApi21.MediaBrowserServiceAdaptor(context, serviceCompatProxy);
    }

    public static void onCreate(java.lang.Object obj) {
        ((android.service.media.MediaBrowserService) obj).onCreate();
    }

    public static android.os.IBinder onBind(java.lang.Object obj, android.content.Intent intent) {
        return ((android.service.media.MediaBrowserService) obj).onBind(intent);
    }

    public static void setSessionToken(java.lang.Object obj, java.lang.Object obj2) {
        ((android.service.media.MediaBrowserService) obj).setSessionToken((android.media.session.MediaSession.Token) obj2);
    }

    public static void notifyChildrenChanged(java.lang.Object obj, java.lang.String str) {
        ((android.service.media.MediaBrowserService) obj).notifyChildrenChanged(str);
    }

    static class ResultWrapper<T> {
        android.service.media.MediaBrowserService.Result mResultObj;

        ResultWrapper(android.service.media.MediaBrowserService.Result result) {
            this.mResultObj = result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void sendResult(T t) {
            if (t instanceof java.util.List) {
                this.mResultObj.sendResult(parcelListToItemList((java.util.List) t));
                return;
            }
            if (t instanceof android.os.Parcel) {
                android.os.Parcel parcel = (android.os.Parcel) t;
                parcel.setDataPosition(0);
                this.mResultObj.sendResult(android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
                return;
            }
            this.mResultObj.sendResult(null);
        }

        public void detach() {
            this.mResultObj.detach();
        }

        java.util.List<android.media.browse.MediaBrowser.MediaItem> parcelListToItemList(java.util.List<android.os.Parcel> list) {
            if (list == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.os.Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add(android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }
    }

    static class BrowserRoot {
        final android.os.Bundle mExtras;
        final java.lang.String mRootId;

        BrowserRoot(java.lang.String str, android.os.Bundle bundle) {
            this.mRootId = str;
            this.mExtras = bundle;
        }
    }

    static class MediaBrowserServiceAdaptor extends android.service.media.MediaBrowserService {
        final androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy mServiceProxy;

        MediaBrowserServiceAdaptor(android.content.Context context, androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy serviceCompatProxy) {
            attachBaseContext(context);
            this.mServiceProxy = serviceCompatProxy;
        }

        @Override // android.service.media.MediaBrowserService
        public android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String str, int i, android.os.Bundle bundle) {
            android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
            androidx.media.MediaBrowserServiceCompatApi21.BrowserRoot onGetRoot = this.mServiceProxy.onGetRoot(str, i, bundle == null ? null : new android.os.Bundle(bundle));
            if (onGetRoot == null) {
                return null;
            }
            return new android.service.media.MediaBrowserService.BrowserRoot(onGetRoot.mRootId, onGetRoot.mExtras);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(java.lang.String str, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> result) {
            this.mServiceProxy.onLoadChildren(str, new androidx.media.MediaBrowserServiceCompatApi21.ResultWrapper<>(result));
        }
    }

    private MediaBrowserServiceCompatApi21() {
    }
}
