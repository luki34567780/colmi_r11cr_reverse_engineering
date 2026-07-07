package com.luck.picture.lib.engine;

@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public interface ExtendLoaderEngine {
    void loadAllAlbumData(android.content.Context context, com.luck.picture.lib.interfaces.OnQueryAllAlbumListener<com.luck.picture.lib.entity.LocalMediaFolder> onQueryAllAlbumListener);

    void loadFirstPageMediaData(android.content.Context context, long j, int i, int i2, com.luck.picture.lib.interfaces.OnQueryDataResultListener<com.luck.picture.lib.entity.LocalMedia> onQueryDataResultListener);

    void loadMoreMediaData(android.content.Context context, long j, int i, int i2, int i3, com.luck.picture.lib.interfaces.OnQueryDataResultListener<com.luck.picture.lib.entity.LocalMedia> onQueryDataResultListener);

    void loadOnlyInAppDirAllMediaData(android.content.Context context, com.luck.picture.lib.interfaces.OnQueryAlbumListener<com.luck.picture.lib.entity.LocalMediaFolder> onQueryAlbumListener);
}
