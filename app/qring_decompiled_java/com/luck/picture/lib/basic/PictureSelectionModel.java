package com.luck.picture.lib.basic;

/* loaded from: /tmp/dex/classes2.dex */
public final class PictureSelectionModel {
    private final com.luck.picture.lib.config.SelectorConfig selectionConfig;
    private final com.luck.picture.lib.basic.PictureSelector selector;

    public PictureSelectionModel(com.luck.picture.lib.basic.PictureSelector pictureSelector, int i) {
        this.selector = pictureSelector;
        com.luck.picture.lib.config.SelectorConfig selectorConfig = new com.luck.picture.lib.config.SelectorConfig();
        this.selectionConfig = selectorConfig;
        com.luck.picture.lib.config.SelectorProviders.getInstance().addSelectorConfigQueue(selectorConfig);
        selectorConfig.chooseMode = i;
        setMaxVideoSelectNum(selectorConfig.maxVideoSelectNum);
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setSelectorUIStyle(com.luck.picture.lib.style.PictureSelectorStyle pictureSelectorStyle) {
        if (pictureSelectorStyle != null) {
            this.selectionConfig.selectorStyle = pictureSelectorStyle;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setLanguage(int i) {
        this.selectionConfig.language = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setDefaultLanguage(int i) {
        this.selectionConfig.defaultLanguage = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setImageEngine(com.luck.picture.lib.engine.ImageEngine imageEngine) {
        this.selectionConfig.imageEngine = imageEngine;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setVideoPlayerEngine(com.luck.picture.lib.engine.VideoPlayerEngine videoPlayerEngine) {
        this.selectionConfig.videoPlayerEngine = videoPlayerEngine;
        return this;
    }

    @java.lang.Deprecated
    public com.luck.picture.lib.basic.PictureSelectionModel setCompressEngine(com.luck.picture.lib.engine.CompressEngine compressEngine) {
        this.selectionConfig.compressEngine = compressEngine;
        this.selectionConfig.isCompressEngine = true;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setCompressEngine(com.luck.picture.lib.engine.CompressFileEngine compressFileEngine) {
        this.selectionConfig.compressFileEngine = compressFileEngine;
        this.selectionConfig.isCompressEngine = true;
        return this;
    }

    @java.lang.Deprecated
    public com.luck.picture.lib.basic.PictureSelectionModel setCropEngine(com.luck.picture.lib.engine.CropEngine cropEngine) {
        this.selectionConfig.cropEngine = cropEngine;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setCropEngine(com.luck.picture.lib.engine.CropFileEngine cropFileEngine) {
        this.selectionConfig.cropFileEngine = cropFileEngine;
        return this;
    }

    @java.lang.Deprecated
    public com.luck.picture.lib.basic.PictureSelectionModel setSandboxFileEngine(com.luck.picture.lib.engine.SandboxFileEngine sandboxFileEngine) {
        if (com.luck.picture.lib.utils.SdkVersionUtils.isQ()) {
            this.selectionConfig.sandboxFileEngine = sandboxFileEngine;
            this.selectionConfig.isSandboxFileEngine = true;
        } else {
            this.selectionConfig.isSandboxFileEngine = false;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setSandboxFileEngine(com.luck.picture.lib.engine.UriToFileTransformEngine uriToFileTransformEngine) {
        if (com.luck.picture.lib.utils.SdkVersionUtils.isQ()) {
            this.selectionConfig.uriToFileTransformEngine = uriToFileTransformEngine;
            this.selectionConfig.isSandboxFileEngine = true;
        } else {
            this.selectionConfig.isSandboxFileEngine = false;
        }
        return this;
    }

    @java.lang.Deprecated
    public com.luck.picture.lib.basic.PictureSelectionModel setExtendLoaderEngine(com.luck.picture.lib.engine.ExtendLoaderEngine extendLoaderEngine) {
        this.selectionConfig.loaderDataEngine = extendLoaderEngine;
        this.selectionConfig.isLoaderDataEngine = true;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setLoaderFactoryEngine(com.luck.picture.lib.basic.IBridgeLoaderFactory iBridgeLoaderFactory) {
        this.selectionConfig.loaderFactory = iBridgeLoaderFactory;
        this.selectionConfig.isLoaderFactoryEngine = true;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setMagicalEffectInterpolator(com.luck.picture.lib.basic.InterpolatorFactory interpolatorFactory) {
        this.selectionConfig.interpolatorFactory = interpolatorFactory;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setCameraInterceptListener(com.luck.picture.lib.interfaces.OnCameraInterceptListener onCameraInterceptListener) {
        this.selectionConfig.onCameraInterceptListener = onCameraInterceptListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setRecordAudioInterceptListener(com.luck.picture.lib.interfaces.OnRecordAudioInterceptListener onRecordAudioInterceptListener) {
        this.selectionConfig.onRecordAudioListener = onRecordAudioInterceptListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setPreviewInterceptListener(com.luck.picture.lib.interfaces.OnPreviewInterceptListener onPreviewInterceptListener) {
        this.selectionConfig.onPreviewInterceptListener = onPreviewInterceptListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setInjectLayoutResourceListener(com.luck.picture.lib.interfaces.OnInjectLayoutResourceListener onInjectLayoutResourceListener) {
        this.selectionConfig.isInjectLayoutResource = onInjectLayoutResourceListener != null;
        this.selectionConfig.onLayoutResourceListener = onInjectLayoutResourceListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setEditMediaInterceptListener(com.luck.picture.lib.interfaces.OnMediaEditInterceptListener onMediaEditInterceptListener) {
        this.selectionConfig.onEditMediaEventListener = onMediaEditInterceptListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setPermissionsInterceptListener(com.luck.picture.lib.interfaces.OnPermissionsInterceptListener onPermissionsInterceptListener) {
        this.selectionConfig.onPermissionsEventListener = onPermissionsInterceptListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setPermissionDescriptionListener(com.luck.picture.lib.interfaces.OnPermissionDescriptionListener onPermissionDescriptionListener) {
        this.selectionConfig.onPermissionDescriptionListener = onPermissionDescriptionListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setPermissionDeniedListener(com.luck.picture.lib.interfaces.OnPermissionDeniedListener onPermissionDeniedListener) {
        this.selectionConfig.onPermissionDeniedListener = onPermissionDeniedListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setSelectLimitTipsListener(com.luck.picture.lib.interfaces.OnSelectLimitTipsListener onSelectLimitTipsListener) {
        this.selectionConfig.onSelectLimitTipsListener = onSelectLimitTipsListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setSelectFilterListener(com.luck.picture.lib.interfaces.OnSelectFilterListener onSelectFilterListener) {
        this.selectionConfig.onSelectFilterListener = onSelectFilterListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setQueryFilterListener(com.luck.picture.lib.interfaces.OnQueryFilterListener onQueryFilterListener) {
        this.selectionConfig.onQueryFilterListener = onQueryFilterListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setGridItemSelectAnimListener(com.luck.picture.lib.interfaces.OnGridItemSelectAnimListener onGridItemSelectAnimListener) {
        this.selectionConfig.onItemSelectAnimListener = onGridItemSelectAnimListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setSelectAnimListener(com.luck.picture.lib.interfaces.OnSelectAnimListener onSelectAnimListener) {
        this.selectionConfig.onSelectAnimListener = onSelectAnimListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setAddBitmapWatermarkListener(com.luck.picture.lib.interfaces.OnBitmapWatermarkEventListener onBitmapWatermarkEventListener) {
        if (this.selectionConfig.chooseMode != com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
            this.selectionConfig.onBitmapWatermarkListener = onBitmapWatermarkEventListener;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setVideoThumbnailListener(com.luck.picture.lib.interfaces.OnVideoThumbnailEventListener onVideoThumbnailEventListener) {
        if (this.selectionConfig.chooseMode != com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
            this.selectionConfig.onVideoThumbnailEventListener = onVideoThumbnailEventListener;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setCustomLoadingListener(com.luck.picture.lib.interfaces.OnCustomLoadingListener onCustomLoadingListener) {
        this.selectionConfig.onCustomLoadingListener = onCustomLoadingListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isCameraForegroundService(boolean z) {
        this.selectionConfig.isCameraForegroundService = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isPreloadFirst(boolean z) {
        this.selectionConfig.isPreloadFirst = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isUseSystemVideoPlayer(boolean z) {
        this.selectionConfig.isUseSystemVideoPlayer = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setRequestedOrientation(int i) {
        this.selectionConfig.requestedOrientation = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setSelectionMode(int i) {
        this.selectionConfig.selectionMode = i;
        com.luck.picture.lib.config.SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.maxSelectNum = selectorConfig.selectionMode != 1 ? this.selectionConfig.maxSelectNum : 1;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isWithSelectVideoImage(boolean z) {
        com.luck.picture.lib.config.SelectorConfig selectorConfig = this.selectionConfig;
        selectorConfig.isWithVideoImage = selectorConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofAll() && z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setOfAllCameraType(int i) {
        this.selectionConfig.ofAllCameraType = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isMaxSelectEnabledMask(boolean z) {
        this.selectionConfig.isMaxSelectEnabledMask = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isOriginalControl(boolean z) {
        this.selectionConfig.isOriginalControl = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isSyncCover(boolean z) {
        this.selectionConfig.isSyncCover = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setMaxSelectNum(int i) {
        com.luck.picture.lib.config.SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.selectionMode == 1) {
            i = 1;
        }
        selectorConfig.maxSelectNum = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setMinSelectNum(int i) {
        this.selectionConfig.minSelectNum = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isAutomaticTitleRecyclerTop(boolean z) {
        this.selectionConfig.isAutomaticTitleRecyclerTop = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isDirectReturnSingle(boolean z) {
        boolean z2 = false;
        if (z) {
            this.selectionConfig.isFastSlidingSelect = false;
        }
        com.luck.picture.lib.config.SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.selectionMode == 1 && z) {
            z2 = true;
        }
        selectorConfig.isDirectReturnSingle = z2;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isPageStrategy(boolean z) {
        this.selectionConfig.isPageStrategy = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isPageStrategy(boolean z, int i) {
        this.selectionConfig.isPageStrategy = z;
        com.luck.picture.lib.config.SelectorConfig selectorConfig = this.selectionConfig;
        if (i < 10) {
            i = 60;
        }
        selectorConfig.pageSize = i;
        return this;
    }

    @java.lang.Deprecated
    public com.luck.picture.lib.basic.PictureSelectionModel isPageStrategy(boolean z, boolean z2) {
        this.selectionConfig.isPageStrategy = z;
        this.selectionConfig.isFilterInvalidFile = z2;
        return this;
    }

    @java.lang.Deprecated
    public com.luck.picture.lib.basic.PictureSelectionModel isPageStrategy(boolean z, int i, boolean z2) {
        this.selectionConfig.isPageStrategy = z;
        com.luck.picture.lib.config.SelectorConfig selectorConfig = this.selectionConfig;
        if (i < 10) {
            i = 60;
        }
        selectorConfig.pageSize = i;
        this.selectionConfig.isFilterInvalidFile = z2;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setAttachViewLifecycle(com.luck.picture.lib.basic.IBridgeViewLifecycle iBridgeViewLifecycle) {
        this.selectionConfig.viewLifecycle = iBridgeViewLifecycle;
        return this;
    }

    @java.lang.Deprecated
    public com.luck.picture.lib.basic.PictureSelectionModel setVideoQuality(int i) {
        this.selectionConfig.videoQuality = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setDefaultAlbumName(java.lang.String str) {
        this.selectionConfig.defaultAlbumName = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setCameraImageFormat(java.lang.String str) {
        this.selectionConfig.cameraImageFormat = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setCameraImageFormatForQ(java.lang.String str) {
        this.selectionConfig.cameraImageFormatForQ = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setCameraVideoFormat(java.lang.String str) {
        this.selectionConfig.cameraVideoFormat = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setCameraVideoFormatForQ(java.lang.String str) {
        this.selectionConfig.cameraVideoFormatForQ = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setFilterVideoMaxSecond(int i) {
        this.selectionConfig.filterVideoMaxSecond = i * 1000;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setFilterVideoMinSecond(int i) {
        this.selectionConfig.filterVideoMinSecond = i * 1000;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setSelectMaxDurationSecond(int i) {
        this.selectionConfig.selectMaxDurationSecond = i * 1000;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setSelectMinDurationSecond(int i) {
        this.selectionConfig.selectMinDurationSecond = i * 1000;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setRecordVideoMaxSecond(int i) {
        this.selectionConfig.recordVideoMaxSecond = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setMaxVideoSelectNum(int i) {
        com.luck.picture.lib.config.SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofVideo()) {
            i = 0;
        }
        selectorConfig.maxVideoSelectNum = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setMinVideoSelectNum(int i) {
        this.selectionConfig.minVideoSelectNum = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setMinAudioSelectNum(int i) {
        this.selectionConfig.minAudioSelectNum = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setRecordVideoMinSecond(int i) {
        this.selectionConfig.recordVideoMinSecond = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setImageSpanCount(int i) {
        this.selectionConfig.imageSpanCount = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isEmptyResultReturn(boolean z) {
        this.selectionConfig.isEmptyResultReturn = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isQuickCapture(boolean z) {
        this.selectionConfig.isQuickCapture = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isDisplayCamera(boolean z) {
        this.selectionConfig.isDisplayCamera = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setOutputCameraDir(java.lang.String str) {
        this.selectionConfig.outPutCameraDir = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setOutputAudioDir(java.lang.String str) {
        this.selectionConfig.outPutAudioDir = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setOutputCameraImageFileName(java.lang.String str) {
        this.selectionConfig.outPutCameraImageFileName = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setOutputCameraVideoFileName(java.lang.String str) {
        this.selectionConfig.outPutCameraVideoFileName = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setOutputAudioFileName(java.lang.String str) {
        this.selectionConfig.outPutAudioFileName = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setQuerySandboxDir(java.lang.String str) {
        this.selectionConfig.sandboxDir = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isOnlyObtainSandboxDir(boolean z) {
        this.selectionConfig.isOnlySandboxDir = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isDisplayTimeAxis(boolean z) {
        this.selectionConfig.isDisplayTimeAxis = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setFilterMaxFileSize(long j) {
        if (j >= com.luck.picture.lib.config.FileSizeUnit.MB) {
            this.selectionConfig.filterMaxFileSize = j;
        } else {
            this.selectionConfig.filterMaxFileSize = j * com.luck.picture.lib.config.FileSizeUnit.KB;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setFilterMinFileSize(long j) {
        if (j >= com.luck.picture.lib.config.FileSizeUnit.MB) {
            this.selectionConfig.filterMinFileSize = j;
        } else {
            this.selectionConfig.filterMinFileSize = j * com.luck.picture.lib.config.FileSizeUnit.KB;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setSelectMaxFileSize(long j) {
        if (j >= com.luck.picture.lib.config.FileSizeUnit.MB) {
            this.selectionConfig.selectMaxFileSize = j;
        } else {
            this.selectionConfig.selectMaxFileSize = j * com.luck.picture.lib.config.FileSizeUnit.KB;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setSelectMinFileSize(long j) {
        if (j >= com.luck.picture.lib.config.FileSizeUnit.MB) {
            this.selectionConfig.selectMinFileSize = j;
        } else {
            this.selectionConfig.selectMinFileSize = j * com.luck.picture.lib.config.FileSizeUnit.KB;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setQueryOnlyMimeType(java.lang.String... strArr) {
        if (strArr != null && strArr.length > 0) {
            this.selectionConfig.queryOnlyList.addAll(java.util.Arrays.asList(strArr));
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setSkipCropMimeType(java.lang.String... strArr) {
        if (strArr != null && strArr.length > 0) {
            this.selectionConfig.skipCropList.addAll(java.util.Arrays.asList(strArr));
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setQuerySortOrder(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.selectionConfig.sortOrder = str;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isGif(boolean z) {
        this.selectionConfig.isGif = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isWebp(boolean z) {
        this.selectionConfig.isWebp = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isBmp(boolean z) {
        this.selectionConfig.isBmp = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isPreviewFullScreenMode(boolean z) {
        this.selectionConfig.isPreviewFullScreenMode = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isPreviewZoomEffect(boolean z) {
        if (this.selectionConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
            this.selectionConfig.isPreviewZoomEffect = false;
        } else {
            this.selectionConfig.isPreviewZoomEffect = z;
        }
        return this;
    }

    @java.lang.Deprecated
    public com.luck.picture.lib.basic.PictureSelectionModel isEnableVideoSize(boolean z) {
        this.selectionConfig.isSyncWidthAndHeight = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isSyncWidthAndHeight(boolean z) {
        this.selectionConfig.isSyncWidthAndHeight = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isPreviewAudio(boolean z) {
        this.selectionConfig.isEnablePreviewAudio = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isPreviewImage(boolean z) {
        this.selectionConfig.isEnablePreviewImage = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isPreviewVideo(boolean z) {
        this.selectionConfig.isEnablePreviewVideo = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isAutoVideoPlay(boolean z) {
        this.selectionConfig.isAutoVideoPlay = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isLoopAutoVideoPlay(boolean z) {
        this.selectionConfig.isLoopAutoPlay = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isVideoPauseResumePlay(boolean z) {
        this.selectionConfig.isPauseResumePlay = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isPageSyncAlbumCount(boolean z) {
        this.selectionConfig.isPageSyncAsCount = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isOriginalSkipCompress(boolean z) {
        this.selectionConfig.isOriginalSkipCompress = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isFilterSizeDuration(boolean z) {
        this.selectionConfig.isFilterSizeDuration = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isFastSlidingSelect(boolean z) {
        if (this.selectionConfig.isDirectReturnSingle) {
            this.selectionConfig.isFastSlidingSelect = false;
        } else {
            this.selectionConfig.isFastSlidingSelect = z;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isOpenClickSound(boolean z) {
        this.selectionConfig.isOpenClickSound = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isCameraAroundState(boolean z) {
        this.selectionConfig.isCameraAroundState = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isCameraRotateImage(boolean z) {
        this.selectionConfig.isCameraRotateImage = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel isSelectZoomAnim(boolean z) {
        this.selectionConfig.isSelectZoomAnim = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setSelectedData(java.util.List<com.luck.picture.lib.entity.LocalMedia> list) {
        if (list == null) {
            return this;
        }
        if (this.selectionConfig.selectionMode == 1 && this.selectionConfig.isDirectReturnSingle) {
            this.selectionConfig.selectedResult.clear();
        } else {
            this.selectionConfig.addAllSelectResult(new java.util.ArrayList<>(list));
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionModel setRecyclerAnimationMode(int i) {
        this.selectionConfig.animationMode = i;
        return this;
    }

    public void forResult(com.luck.picture.lib.interfaces.OnResultCallbackListener<com.luck.picture.lib.entity.LocalMedia> onResultCallbackListener) {
        if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
            return;
        }
        android.app.Activity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        java.util.Objects.requireNonNull(onResultCallbackListener, "OnResultCallbackListener cannot be null");
        this.selectionConfig.isResultListenerBack = true;
        this.selectionConfig.isActivityResultBack = false;
        this.selectionConfig.onResultCallListener = onResultCallbackListener;
        if (this.selectionConfig.imageEngine == null && this.selectionConfig.chooseMode != com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
            throw new java.lang.NullPointerException("imageEngine is null,Please implement ImageEngine");
        }
        activity.startActivity(new android.content.Intent(activity, (java.lang.Class<?>) com.luck.picture.lib.basic.PictureSelectorSupporterActivity.class));
        activity.overridePendingTransition(this.selectionConfig.selectorStyle.getWindowAnimationStyle().activityEnterAnimation, com.luck.picture.lib.R.anim.ps_anim_fade_in);
    }

    public void forResult(int i) {
        if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
            return;
        }
        android.app.Activity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        this.selectionConfig.isResultListenerBack = false;
        this.selectionConfig.isActivityResultBack = true;
        if (this.selectionConfig.imageEngine == null && this.selectionConfig.chooseMode != com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
            throw new java.lang.NullPointerException("imageEngine is null,Please implement ImageEngine");
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.luck.picture.lib.basic.PictureSelectorSupporterActivity.class);
        androidx.fragment.app.Fragment fragment = this.selector.getFragment();
        if (fragment != null) {
            fragment.startActivityForResult(intent, i);
        } else {
            activity.startActivityForResult(intent, i);
        }
        activity.overridePendingTransition(this.selectionConfig.selectorStyle.getWindowAnimationStyle().activityEnterAnimation, com.luck.picture.lib.R.anim.ps_anim_fade_in);
    }

    public void forResult(androidx.activity.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
            return;
        }
        android.app.Activity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        java.util.Objects.requireNonNull(activityResultLauncher, "ActivityResultLauncher cannot be null");
        this.selectionConfig.isResultListenerBack = false;
        this.selectionConfig.isActivityResultBack = true;
        if (this.selectionConfig.imageEngine == null && this.selectionConfig.chooseMode != com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
            throw new java.lang.NullPointerException("imageEngine is null,Please implement ImageEngine");
        }
        activityResultLauncher.launch(new android.content.Intent(activity, (java.lang.Class<?>) com.luck.picture.lib.basic.PictureSelectorSupporterActivity.class));
        activity.overridePendingTransition(this.selectionConfig.selectorStyle.getWindowAnimationStyle().activityEnterAnimation, com.luck.picture.lib.R.anim.ps_anim_fade_in);
    }

    public com.luck.picture.lib.PictureSelectorFragment build() {
        android.app.Activity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        if (!(activity instanceof com.luck.picture.lib.basic.IBridgePictureBehavior)) {
            throw new java.lang.NullPointerException("Use only build PictureSelectorFragment,Activity or Fragment interface needs to be implemented " + com.luck.picture.lib.basic.IBridgePictureBehavior.class);
        }
        this.selectionConfig.isResultListenerBack = false;
        this.selectionConfig.isActivityResultBack = true;
        this.selectionConfig.onResultCallListener = null;
        return new com.luck.picture.lib.PictureSelectorFragment();
    }

    public com.luck.picture.lib.PictureSelectorFragment buildLaunch(int i, com.luck.picture.lib.interfaces.OnResultCallbackListener<com.luck.picture.lib.entity.LocalMedia> onResultCallbackListener) {
        androidx.fragment.app.FragmentActivity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        java.util.Objects.requireNonNull(onResultCallbackListener, "OnResultCallbackListener cannot be null");
        this.selectionConfig.isResultListenerBack = true;
        this.selectionConfig.isActivityResultBack = false;
        this.selectionConfig.onResultCallListener = onResultCallbackListener;
        androidx.fragment.app.FragmentManager supportFragmentManager = activity instanceof androidx.fragment.app.FragmentActivity ? activity.getSupportFragmentManager() : null;
        java.util.Objects.requireNonNull(supportFragmentManager, "FragmentManager cannot be null");
        com.luck.picture.lib.PictureSelectorFragment pictureSelectorFragment = new com.luck.picture.lib.PictureSelectorFragment();
        androidx.fragment.app.Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(pictureSelectorFragment.getFragmentTag());
        if (findFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        supportFragmentManager.beginTransaction().add(i, pictureSelectorFragment, pictureSelectorFragment.getFragmentTag()).addToBackStack(pictureSelectorFragment.getFragmentTag()).commitAllowingStateLoss();
        return pictureSelectorFragment;
    }
}
