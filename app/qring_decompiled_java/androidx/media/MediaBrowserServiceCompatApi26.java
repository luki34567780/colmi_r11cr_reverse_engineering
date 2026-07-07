package androidx.media;

/* loaded from: classes.dex */
class MediaBrowserServiceCompatApi26 {
    private static final java.lang.String TAG = "MBSCompatApi26";
    static java.lang.reflect.Field sResultFlags;

    public interface ServiceCompatProxy extends androidx.media.MediaBrowserServiceCompatApi23.ServiceCompatProxy {
        void onLoadChildren(java.lang.String str, androidx.media.MediaBrowserServiceCompatApi26.ResultWrapper resultWrapper, android.os.Bundle bundle);
    }

    static {
        try {
            java.lang.reflect.Field declaredField = android.service.media.MediaBrowserService.Result.class.getDeclaredField("mFlags");
            sResultFlags = declaredField;
            declaredField.setAccessible(true);
        } catch (java.lang.NoSuchFieldException e) {
            android.util.Log.w(TAG, e);
        }
    }

    public static java.lang.Object createService(android.content.Context context, androidx.media.MediaBrowserServiceCompatApi26.ServiceCompatProxy serviceCompatProxy) {
        return new androidx.media.MediaBrowserServiceCompatApi26.MediaBrowserServiceAdaptor(context, serviceCompatProxy);
    }

    public static void notifyChildrenChanged(java.lang.Object obj, java.lang.String str, android.os.Bundle bundle) {
        ((android.service.media.MediaBrowserService) obj).notifyChildrenChanged(str, bundle);
    }

    public static android.os.Bundle getBrowserRootHints(java.lang.Object obj) {
        return ((android.service.media.MediaBrowserService) obj).getBrowserRootHints();
    }

    static class ResultWrapper {
        android.service.media.MediaBrowserService.Result mResultObj;

        ResultWrapper(android.service.media.MediaBrowserService.Result result) {
            this.mResultObj = result;
        }

        public void sendResult(java.util.List<android.os.Parcel> list, int i) {
            try {
                androidx.media.MediaBrowserServiceCompatApi26.sResultFlags.setInt(this.mResultObj, i);
            } catch (java.lang.IllegalAccessException e) {
                android.util.Log.w(androidx.media.MediaBrowserServiceCompatApi26.TAG, e);
            }
            this.mResultObj.sendResult(parcelListToItemList(list));
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

    static class MediaBrowserServiceAdaptor extends androidx.media.MediaBrowserServiceCompatApi23.MediaBrowserServiceAdaptor {
        MediaBrowserServiceAdaptor(android.content.Context context, androidx.media.MediaBrowserServiceCompatApi26.ServiceCompatProxy serviceCompatProxy) {
            super(context, serviceCompatProxy);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(java.lang.String str, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> result, android.os.Bundle bundle) {
            android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(bundle);
            ((androidx.media.MediaBrowserServiceCompatApi26.ServiceCompatProxy) this.mServiceProxy).onLoadChildren(str, new androidx.media.MediaBrowserServiceCompatApi26.ResultWrapper(result), bundle);
        }
    }

    private MediaBrowserServiceCompatApi26() {
    }
}
