package com.luck.picture.lib.basic;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureSelectionQueryModel {
    private final com.luck.picture.lib.config.SelectorConfig selectionConfig;
    private final com.luck.picture.lib.basic.PictureSelector selector;

    public PictureSelectionQueryModel(com.luck.picture.lib.basic.PictureSelector pictureSelector, int i) {
        this.selector = pictureSelector;
        com.luck.picture.lib.config.SelectorConfig selectorConfig = new com.luck.picture.lib.config.SelectorConfig();
        this.selectionConfig = selectorConfig;
        com.luck.picture.lib.config.SelectorProviders.getInstance().addSelectorConfigQueue(selectorConfig);
        selectorConfig.chooseMode = i;
    }

    public com.luck.picture.lib.basic.PictureSelectionQueryModel isPageStrategy(boolean z) {
        this.selectionConfig.isPageStrategy = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionQueryModel isPageStrategy(boolean z, int i) {
        this.selectionConfig.isPageStrategy = z;
        com.luck.picture.lib.config.SelectorConfig selectorConfig = this.selectionConfig;
        if (i < 10) {
            i = 60;
        }
        selectorConfig.pageSize = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionQueryModel isPageStrategy(boolean z, int i, boolean z2) {
        this.selectionConfig.isPageStrategy = z;
        com.luck.picture.lib.config.SelectorConfig selectorConfig = this.selectionConfig;
        if (i < 10) {
            i = 60;
        }
        selectorConfig.pageSize = i;
        this.selectionConfig.isFilterInvalidFile = z2;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionQueryModel setQueryFilterListener(com.luck.picture.lib.interfaces.OnQueryFilterListener onQueryFilterListener) {
        this.selectionConfig.onQueryFilterListener = onQueryFilterListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionQueryModel setQuerySortOrder(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.selectionConfig.sortOrder = str;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionQueryModel isGif(boolean z) {
        this.selectionConfig.isGif = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionQueryModel isWebp(boolean z) {
        this.selectionConfig.isWebp = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionQueryModel isBmp(boolean z) {
        this.selectionConfig.isBmp = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionQueryModel setFilterMaxFileSize(long j) {
        if (j >= com.luck.picture.lib.config.FileSizeUnit.MB) {
            this.selectionConfig.filterMaxFileSize = j;
        } else {
            this.selectionConfig.filterMaxFileSize = j * com.luck.picture.lib.config.FileSizeUnit.KB;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionQueryModel setFilterMinFileSize(long j) {
        if (j >= com.luck.picture.lib.config.FileSizeUnit.MB) {
            this.selectionConfig.filterMinFileSize = j;
        } else {
            this.selectionConfig.filterMinFileSize = j * com.luck.picture.lib.config.FileSizeUnit.KB;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionQueryModel setFilterVideoMaxSecond(int i) {
        this.selectionConfig.filterVideoMaxSecond = i * 1000;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionQueryModel setFilterVideoMinSecond(int i) {
        this.selectionConfig.filterVideoMinSecond = i * 1000;
        return this;
    }

    public com.luck.picture.lib.loader.IBridgeMediaLoader buildMediaLoader() {
        android.app.Activity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        if (this.selectionConfig.isPageStrategy) {
            return new com.luck.picture.lib.loader.LocalMediaPageLoader(activity, this.selectionConfig);
        }
        return new com.luck.picture.lib.loader.LocalMediaLoader(activity, this.selectionConfig);
    }

    public void obtainAlbumData(final com.luck.picture.lib.interfaces.OnQueryDataSourceListener<com.luck.picture.lib.entity.LocalMediaFolder> onQueryDataSourceListener) {
        com.luck.picture.lib.loader.IBridgeMediaLoader localMediaLoader;
        android.app.Activity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        java.util.Objects.requireNonNull(onQueryDataSourceListener, "OnQueryDataSourceListener cannot be null");
        if (this.selectionConfig.isPageStrategy) {
            localMediaLoader = new com.luck.picture.lib.loader.LocalMediaPageLoader(activity, this.selectionConfig);
        } else {
            localMediaLoader = new com.luck.picture.lib.loader.LocalMediaLoader(activity, this.selectionConfig);
        }
        localMediaLoader.loadAllAlbum(new com.luck.picture.lib.interfaces.OnQueryAllAlbumListener<com.luck.picture.lib.entity.LocalMediaFolder>() { // from class: com.luck.picture.lib.basic.PictureSelectionQueryModel.1
            @Override // com.luck.picture.lib.interfaces.OnQueryAllAlbumListener
            public void onComplete(java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> list) {
                onQueryDataSourceListener.onComplete(list);
            }
        });
    }

    public void obtainMediaData(final com.luck.picture.lib.interfaces.OnQueryDataSourceListener<com.luck.picture.lib.entity.LocalMedia> onQueryDataSourceListener) {
        final com.luck.picture.lib.loader.IBridgeMediaLoader localMediaLoader;
        android.app.Activity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        java.util.Objects.requireNonNull(onQueryDataSourceListener, "OnQueryDataSourceListener cannot be null");
        if (this.selectionConfig.isPageStrategy) {
            localMediaLoader = new com.luck.picture.lib.loader.LocalMediaPageLoader(activity, this.selectionConfig);
        } else {
            localMediaLoader = new com.luck.picture.lib.loader.LocalMediaLoader(activity, this.selectionConfig);
        }
        localMediaLoader.loadAllAlbum(new com.luck.picture.lib.interfaces.OnQueryAllAlbumListener<com.luck.picture.lib.entity.LocalMediaFolder>() { // from class: com.luck.picture.lib.basic.PictureSelectionQueryModel.2
            @Override // com.luck.picture.lib.interfaces.OnQueryAllAlbumListener
            public void onComplete(java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> list) {
                if (list == null || list.size() <= 0) {
                    return;
                }
                com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder = list.get(0);
                if (com.luck.picture.lib.basic.PictureSelectionQueryModel.this.selectionConfig.isPageStrategy) {
                    localMediaLoader.loadPageMediaData(localMediaFolder.getBucketId(), 1, com.luck.picture.lib.basic.PictureSelectionQueryModel.this.selectionConfig.pageSize, new com.luck.picture.lib.interfaces.OnQueryDataResultListener<com.luck.picture.lib.entity.LocalMedia>() { // from class: com.luck.picture.lib.basic.PictureSelectionQueryModel.2.1
                        @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                        public void onComplete(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList, boolean z) {
                            onQueryDataSourceListener.onComplete(arrayList);
                        }
                    });
                } else {
                    onQueryDataSourceListener.onComplete(localMediaFolder.getData());
                }
            }
        });
    }
}
