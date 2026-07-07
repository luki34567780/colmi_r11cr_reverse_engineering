package com.luck.picture.lib.config;

/* loaded from: /tmp/dex/classes2.dex */
public final class SelectorConfig {
    public int animationMode;
    public java.lang.String cameraImageFormat;
    public java.lang.String cameraImageFormatForQ;
    public java.lang.String cameraPath;
    public java.lang.String cameraVideoFormat;
    public java.lang.String cameraVideoFormatForQ;
    public int chooseMode;
    public com.luck.picture.lib.engine.CompressEngine compressEngine;
    public com.luck.picture.lib.engine.CompressFileEngine compressFileEngine;
    public com.luck.picture.lib.engine.CropEngine cropEngine;
    public com.luck.picture.lib.engine.CropFileEngine cropFileEngine;
    public com.luck.picture.lib.entity.LocalMediaFolder currentLocalMediaFolder;
    public java.lang.String defaultAlbumName;
    public int defaultLanguage;
    public long filterMaxFileSize;
    public long filterMinFileSize;
    public int filterVideoMaxSecond;
    public int filterVideoMinSecond;
    public com.luck.picture.lib.engine.ImageEngine imageEngine;
    public int imageSpanCount;
    public com.luck.picture.lib.basic.InterpolatorFactory interpolatorFactory;
    public boolean isActivityResultBack;
    public boolean isAutoRotating;
    public boolean isAutoVideoPlay;
    public boolean isAutomaticTitleRecyclerTop;
    public boolean isBmp;
    public boolean isCameraAroundState;
    public boolean isCameraForegroundService;
    public boolean isCameraRotateImage;
    public boolean isCheckOriginalImage;
    public boolean isCompressEngine;
    public boolean isDirectReturnSingle;
    public boolean isDisplayCamera;
    public boolean isDisplayTimeAxis;
    public boolean isEmptyResultReturn;
    public boolean isEnablePreviewAudio;
    public boolean isEnablePreviewImage;
    public boolean isEnablePreviewVideo;
    public boolean isFastSlidingSelect;
    public boolean isFilterInvalidFile;
    public boolean isFilterSizeDuration;
    public boolean isGif;
    public boolean isHidePreviewDownload;
    public boolean isInjectLayoutResource;
    public boolean isLoaderDataEngine;
    public boolean isLoaderFactoryEngine;
    public boolean isLoopAutoPlay;
    public boolean isMaxSelectEnabledMask;
    public boolean isOnlyCamera;
    public boolean isOnlySandboxDir;
    public boolean isOpenClickSound;
    public boolean isOriginalControl;
    public boolean isOriginalSkipCompress;
    public boolean isPageStrategy;
    public boolean isPageSyncAsCount;
    public boolean isPauseResumePlay;
    public boolean isPreloadFirst;
    public boolean isPreviewFullScreenMode;
    public boolean isPreviewZoomEffect;
    public boolean isQuickCapture;
    public boolean isResultListenerBack;
    public boolean isSandboxFileEngine;
    public boolean isSelectZoomAnim;
    public boolean isSyncCover;
    public boolean isSyncWidthAndHeight;
    public boolean isUseSystemVideoPlayer;
    public boolean isWebp;
    public boolean isWithVideoImage;
    public int language;
    public com.luck.picture.lib.engine.ExtendLoaderEngine loaderDataEngine;
    public com.luck.picture.lib.basic.IBridgeLoaderFactory loaderFactory;
    public int maxSelectNum;
    public int maxVideoSelectNum;
    public int minAudioSelectNum;
    public int minSelectNum;
    public int minVideoSelectNum;
    public int ofAllCameraType;
    public com.luck.picture.lib.interfaces.OnBitmapWatermarkEventListener onBitmapWatermarkListener;
    public com.luck.picture.lib.interfaces.OnCameraInterceptListener onCameraInterceptListener;
    public com.luck.picture.lib.interfaces.OnCustomLoadingListener onCustomLoadingListener;
    public com.luck.picture.lib.interfaces.OnMediaEditInterceptListener onEditMediaEventListener;
    public com.luck.picture.lib.interfaces.OnExternalPreviewEventListener onExternalPreviewEventListener;
    public com.luck.picture.lib.interfaces.OnInjectActivityPreviewListener onInjectActivityPreviewListener;
    public com.luck.picture.lib.interfaces.OnGridItemSelectAnimListener onItemSelectAnimListener;
    public com.luck.picture.lib.interfaces.OnInjectLayoutResourceListener onLayoutResourceListener;
    public com.luck.picture.lib.interfaces.OnPermissionDeniedListener onPermissionDeniedListener;
    public com.luck.picture.lib.interfaces.OnPermissionDescriptionListener onPermissionDescriptionListener;
    public com.luck.picture.lib.interfaces.OnPermissionsInterceptListener onPermissionsEventListener;
    public com.luck.picture.lib.interfaces.OnPreviewInterceptListener onPreviewInterceptListener;
    public com.luck.picture.lib.interfaces.OnQueryFilterListener onQueryFilterListener;
    public com.luck.picture.lib.interfaces.OnRecordAudioInterceptListener onRecordAudioListener;
    public com.luck.picture.lib.interfaces.OnResultCallbackListener<com.luck.picture.lib.entity.LocalMedia> onResultCallListener;
    public com.luck.picture.lib.interfaces.OnSelectAnimListener onSelectAnimListener;
    public com.luck.picture.lib.interfaces.OnSelectFilterListener onSelectFilterListener;
    public com.luck.picture.lib.interfaces.OnSelectLimitTipsListener onSelectLimitTipsListener;
    public com.luck.picture.lib.interfaces.OnVideoThumbnailEventListener onVideoThumbnailEventListener;
    public java.lang.String originalPath;
    public java.lang.String outPutAudioDir;
    public java.lang.String outPutAudioFileName;
    public java.lang.String outPutCameraDir;
    public java.lang.String outPutCameraImageFileName;
    public java.lang.String outPutCameraVideoFileName;
    public int pageSize;
    public java.util.List<java.lang.String> queryOnlyList;
    public int recordVideoMaxSecond;
    public int recordVideoMinSecond;
    public int requestedOrientation;
    public java.lang.String sandboxDir;
    public com.luck.picture.lib.engine.SandboxFileEngine sandboxFileEngine;
    public int selectMaxDurationSecond;
    public long selectMaxFileSize;
    public int selectMinDurationSecond;
    public long selectMinFileSize;
    public int selectionMode;
    public com.luck.picture.lib.style.PictureSelectorStyle selectorStyle;
    public java.util.List<java.lang.String> skipCropList;
    public java.lang.String sortOrder;
    public com.luck.picture.lib.engine.UriToFileTransformEngine uriToFileTransformEngine;
    public com.luck.picture.lib.engine.VideoPlayerEngine videoPlayerEngine;
    public int videoQuality;
    public com.luck.picture.lib.basic.IBridgeViewLifecycle viewLifecycle;
    public final java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> selectedResult = new java.util.ArrayList<>();
    public final java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> selectedPreviewResult = new java.util.ArrayList<>();
    public final java.util.ArrayList<com.luck.picture.lib.entity.LocalMediaFolder> albumDataSource = new java.util.ArrayList<>();
    public final java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> dataSource = new java.util.ArrayList<>();

    public SelectorConfig() {
        initDefaultValue();
    }

    private void initDefaultValue() {
        this.chooseMode = com.luck.picture.lib.config.SelectMimeType.ofImage();
        this.isOnlyCamera = false;
        this.selectionMode = 2;
        this.selectorStyle = new com.luck.picture.lib.style.PictureSelectorStyle();
        this.maxSelectNum = 9;
        this.minSelectNum = 0;
        this.maxVideoSelectNum = 1;
        this.minVideoSelectNum = 0;
        this.minAudioSelectNum = 0;
        this.videoQuality = 1;
        this.language = -2;
        this.defaultLanguage = -1;
        this.filterVideoMaxSecond = 0;
        this.filterVideoMinSecond = 0;
        this.selectMaxDurationSecond = 0;
        this.selectMinDurationSecond = 0;
        this.filterMaxFileSize = 0L;
        this.filterMinFileSize = 0L;
        this.selectMaxFileSize = 0L;
        this.selectMinFileSize = 0L;
        this.recordVideoMaxSecond = 60;
        this.recordVideoMinSecond = 0;
        this.imageSpanCount = 4;
        this.isCameraAroundState = false;
        this.isWithVideoImage = false;
        this.isDisplayCamera = true;
        this.isGif = false;
        this.isWebp = true;
        this.isBmp = true;
        this.isCheckOriginalImage = false;
        this.isDirectReturnSingle = false;
        this.isEnablePreviewImage = true;
        this.isEnablePreviewVideo = true;
        this.isEnablePreviewAudio = true;
        this.isHidePreviewDownload = false;
        this.isOpenClickSound = false;
        this.isEmptyResultReturn = false;
        this.cameraImageFormat = com.luck.picture.lib.config.PictureMimeType.JPEG;
        this.cameraVideoFormat = com.luck.picture.lib.config.PictureMimeType.MP4;
        this.cameraImageFormatForQ = "image/jpeg";
        this.cameraVideoFormatForQ = "video/mp4";
        this.outPutCameraImageFileName = "";
        this.outPutCameraVideoFileName = "";
        this.outPutAudioFileName = "";
        this.queryOnlyList = new java.util.ArrayList();
        this.outPutCameraDir = "";
        this.outPutAudioDir = "";
        this.sandboxDir = "";
        this.originalPath = "";
        this.cameraPath = "";
        this.pageSize = 60;
        this.isPageStrategy = true;
        this.isFilterInvalidFile = false;
        this.isMaxSelectEnabledMask = false;
        this.animationMode = -1;
        this.isAutomaticTitleRecyclerTop = true;
        this.isQuickCapture = true;
        this.isCameraRotateImage = true;
        this.isAutoRotating = true;
        this.isSyncCover = !com.luck.picture.lib.utils.SdkVersionUtils.isQ();
        this.ofAllCameraType = com.luck.picture.lib.config.SelectMimeType.ofAll();
        this.isOnlySandboxDir = false;
        this.requestedOrientation = -1;
        this.isCameraForegroundService = false;
        this.isResultListenerBack = true;
        this.isActivityResultBack = false;
        this.isCompressEngine = false;
        this.isLoaderDataEngine = false;
        this.isLoaderFactoryEngine = false;
        this.isSandboxFileEngine = false;
        this.isPreviewFullScreenMode = true;
        this.isPreviewZoomEffect = this.chooseMode != com.luck.picture.lib.config.SelectMimeType.ofAudio();
        this.isOriginalControl = false;
        this.isInjectLayoutResource = false;
        this.isDisplayTimeAxis = true;
        this.isFastSlidingSelect = false;
        this.skipCropList = new java.util.ArrayList();
        this.sortOrder = "";
        this.isSelectZoomAnim = true;
        this.defaultAlbumName = "";
        this.isAutoVideoPlay = false;
        this.isLoopAutoPlay = false;
        this.isFilterSizeDuration = true;
        this.isPageSyncAsCount = false;
        this.isPauseResumePlay = false;
        this.isSyncWidthAndHeight = true;
        this.isOriginalSkipCompress = false;
        this.isPreloadFirst = true;
        this.isUseSystemVideoPlayer = false;
    }

    public synchronized java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> getSelectedResult() {
        return this.selectedResult;
    }

    public int getSelectCount() {
        return this.selectedResult.size();
    }

    public void addSelectResult(com.luck.picture.lib.entity.LocalMedia localMedia) {
        this.selectedResult.add(localMedia);
    }

    public void addAllSelectResult(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        this.selectedResult.addAll(arrayList);
    }

    public java.lang.String getResultFirstMimeType() {
        return this.selectedResult.size() > 0 ? this.selectedResult.get(0).getMimeType() : "";
    }

    public void addSelectedPreviewResult(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        if (arrayList != null) {
            this.selectedPreviewResult.clear();
            this.selectedPreviewResult.addAll(arrayList);
        }
    }

    public void addAlbumDataSource(java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> list) {
        if (list != null) {
            this.albumDataSource.clear();
            this.albumDataSource.addAll(list);
        }
    }

    public void addDataSource(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        if (arrayList != null) {
            this.dataSource.clear();
            this.dataSource.addAll(arrayList);
        }
    }

    public void destroy() {
        this.imageEngine = null;
        this.compressEngine = null;
        this.compressFileEngine = null;
        this.cropEngine = null;
        this.cropFileEngine = null;
        this.sandboxFileEngine = null;
        this.uriToFileTransformEngine = null;
        this.loaderDataEngine = null;
        this.onResultCallListener = null;
        this.onCameraInterceptListener = null;
        this.onExternalPreviewEventListener = null;
        this.onInjectActivityPreviewListener = null;
        this.onEditMediaEventListener = null;
        this.onPermissionsEventListener = null;
        this.onLayoutResourceListener = null;
        this.onPreviewInterceptListener = null;
        this.onSelectLimitTipsListener = null;
        this.onSelectFilterListener = null;
        this.onPermissionDescriptionListener = null;
        this.onPermissionDeniedListener = null;
        this.onRecordAudioListener = null;
        this.onQueryFilterListener = null;
        this.onBitmapWatermarkListener = null;
        this.onVideoThumbnailEventListener = null;
        this.viewLifecycle = null;
        this.loaderFactory = null;
        this.interpolatorFactory = null;
        this.onItemSelectAnimListener = null;
        this.onSelectAnimListener = null;
        this.videoPlayerEngine = null;
        this.onCustomLoadingListener = null;
        this.currentLocalMediaFolder = null;
        this.dataSource.clear();
        this.selectedResult.clear();
        this.albumDataSource.clear();
        this.selectedPreviewResult.clear();
        com.luck.picture.lib.thread.PictureThreadUtils.cancel(com.luck.picture.lib.thread.PictureThreadUtils.getIoPool());
        com.luck.picture.lib.magical.BuildRecycleItemViewParams.clear();
        com.luck.picture.lib.utils.FileDirMap.clear();
        com.luck.picture.lib.entity.LocalMedia.destroyPool();
    }
}
