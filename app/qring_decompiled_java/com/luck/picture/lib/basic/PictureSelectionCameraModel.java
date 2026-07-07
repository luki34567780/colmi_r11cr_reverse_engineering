package com.luck.picture.lib.basic;

/* loaded from: /tmp/dex/classes2.dex */
public final class PictureSelectionCameraModel {
    private final com.luck.picture.lib.config.SelectorConfig selectionConfig;
    private final com.luck.picture.lib.basic.PictureSelector selector;

    public PictureSelectionCameraModel(com.luck.picture.lib.basic.PictureSelector pictureSelector, int i) {
        this.selector = pictureSelector;
        com.luck.picture.lib.config.SelectorConfig selectorConfig = new com.luck.picture.lib.config.SelectorConfig();
        this.selectionConfig = selectorConfig;
        com.luck.picture.lib.config.SelectorProviders.getInstance().addSelectorConfigQueue(selectorConfig);
        selectorConfig.chooseMode = i;
        selectorConfig.isOnlyCamera = true;
        selectorConfig.isDisplayTimeAxis = false;
        selectorConfig.isPreviewFullScreenMode = false;
        selectorConfig.isPreviewZoomEffect = false;
        selectorConfig.isOpenClickSound = false;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setLanguage(int i) {
        this.selectionConfig.language = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setDefaultLanguage(int i) {
        this.selectionConfig.defaultLanguage = i;
        return this;
    }

    @java.lang.Deprecated
    public com.luck.picture.lib.basic.PictureSelectionCameraModel setCompressEngine(com.luck.picture.lib.engine.CompressEngine compressEngine) {
        this.selectionConfig.compressEngine = compressEngine;
        this.selectionConfig.isCompressEngine = true;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setCompressEngine(com.luck.picture.lib.engine.CompressFileEngine compressFileEngine) {
        this.selectionConfig.compressFileEngine = compressFileEngine;
        this.selectionConfig.isCompressEngine = true;
        return this;
    }

    @java.lang.Deprecated
    public com.luck.picture.lib.basic.PictureSelectionCameraModel setCropEngine(com.luck.picture.lib.engine.CropEngine cropEngine) {
        this.selectionConfig.cropEngine = cropEngine;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setCropEngine(com.luck.picture.lib.engine.CropFileEngine cropFileEngine) {
        this.selectionConfig.cropFileEngine = cropFileEngine;
        return this;
    }

    @java.lang.Deprecated
    public com.luck.picture.lib.basic.PictureSelectionCameraModel setSandboxFileEngine(com.luck.picture.lib.engine.SandboxFileEngine sandboxFileEngine) {
        if (com.luck.picture.lib.utils.SdkVersionUtils.isQ()) {
            this.selectionConfig.sandboxFileEngine = sandboxFileEngine;
            this.selectionConfig.isSandboxFileEngine = true;
        } else {
            this.selectionConfig.isSandboxFileEngine = false;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setSandboxFileEngine(com.luck.picture.lib.engine.UriToFileTransformEngine uriToFileTransformEngine) {
        if (com.luck.picture.lib.utils.SdkVersionUtils.isQ()) {
            this.selectionConfig.uriToFileTransformEngine = uriToFileTransformEngine;
            this.selectionConfig.isSandboxFileEngine = true;
        } else {
            this.selectionConfig.isSandboxFileEngine = false;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setRequestedOrientation(int i) {
        this.selectionConfig.requestedOrientation = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setCameraInterceptListener(com.luck.picture.lib.interfaces.OnCameraInterceptListener onCameraInterceptListener) {
        this.selectionConfig.onCameraInterceptListener = onCameraInterceptListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setRecordAudioInterceptListener(com.luck.picture.lib.interfaces.OnRecordAudioInterceptListener onRecordAudioInterceptListener) {
        this.selectionConfig.onRecordAudioListener = onRecordAudioInterceptListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setPermissionsInterceptListener(com.luck.picture.lib.interfaces.OnPermissionsInterceptListener onPermissionsInterceptListener) {
        this.selectionConfig.onPermissionsEventListener = onPermissionsInterceptListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setPermissionDescriptionListener(com.luck.picture.lib.interfaces.OnPermissionDescriptionListener onPermissionDescriptionListener) {
        this.selectionConfig.onPermissionDescriptionListener = onPermissionDescriptionListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setPermissionDeniedListener(com.luck.picture.lib.interfaces.OnPermissionDeniedListener onPermissionDeniedListener) {
        this.selectionConfig.onPermissionDeniedListener = onPermissionDeniedListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setSelectLimitTipsListener(com.luck.picture.lib.interfaces.OnSelectLimitTipsListener onSelectLimitTipsListener) {
        this.selectionConfig.onSelectLimitTipsListener = onSelectLimitTipsListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setAddBitmapWatermarkListener(com.luck.picture.lib.interfaces.OnBitmapWatermarkEventListener onBitmapWatermarkEventListener) {
        if (this.selectionConfig.chooseMode != com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
            this.selectionConfig.onBitmapWatermarkListener = onBitmapWatermarkEventListener;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setVideoThumbnailListener(com.luck.picture.lib.interfaces.OnVideoThumbnailEventListener onVideoThumbnailEventListener) {
        if (this.selectionConfig.chooseMode != com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
            this.selectionConfig.onVideoThumbnailEventListener = onVideoThumbnailEventListener;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setCustomLoadingListener(com.luck.picture.lib.interfaces.OnCustomLoadingListener onCustomLoadingListener) {
        this.selectionConfig.onCustomLoadingListener = onCustomLoadingListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel isCameraForegroundService(boolean z) {
        this.selectionConfig.isCameraForegroundService = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setOfAllCameraType(int i) {
        this.selectionConfig.ofAllCameraType = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel isOriginalControl(boolean z) {
        this.selectionConfig.isOriginalControl = z;
        this.selectionConfig.isCheckOriginalImage = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel isOriginalSkipCompress(boolean z) {
        this.selectionConfig.isOriginalSkipCompress = z;
        return this;
    }

    @java.lang.Deprecated
    public com.luck.picture.lib.basic.PictureSelectionCameraModel setVideoQuality(int i) {
        this.selectionConfig.videoQuality = i;
        return this;
    }

    private com.luck.picture.lib.basic.PictureSelectionCameraModel setMaxSelectNum(int i) {
        com.luck.picture.lib.config.SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.selectionMode == 1) {
            i = 1;
        }
        selectorConfig.maxSelectNum = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setMaxVideoSelectNum(int i) {
        com.luck.picture.lib.config.SelectorConfig selectorConfig = this.selectionConfig;
        if (selectorConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofVideo()) {
            i = 0;
        }
        selectorConfig.maxVideoSelectNum = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setSelectMaxFileSize(long j) {
        if (j >= com.luck.picture.lib.config.FileSizeUnit.MB) {
            this.selectionConfig.selectMaxFileSize = j;
        } else {
            this.selectionConfig.selectMaxFileSize = j * com.luck.picture.lib.config.FileSizeUnit.KB;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setSelectMinFileSize(long j) {
        if (j >= com.luck.picture.lib.config.FileSizeUnit.MB) {
            this.selectionConfig.selectMinFileSize = j;
        } else {
            this.selectionConfig.selectMinFileSize = j * com.luck.picture.lib.config.FileSizeUnit.KB;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setCameraImageFormat(java.lang.String str) {
        this.selectionConfig.cameraImageFormat = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setCameraImageFormatForQ(java.lang.String str) {
        this.selectionConfig.cameraImageFormatForQ = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setCameraVideoFormat(java.lang.String str) {
        this.selectionConfig.cameraVideoFormat = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setCameraVideoFormatForQ(java.lang.String str) {
        this.selectionConfig.cameraVideoFormatForQ = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setRecordVideoMaxSecond(int i) {
        this.selectionConfig.recordVideoMaxSecond = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setRecordVideoMinSecond(int i) {
        this.selectionConfig.recordVideoMinSecond = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setSelectMaxDurationSecond(int i) {
        this.selectionConfig.selectMaxDurationSecond = i * 1000;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setSelectMinDurationSecond(int i) {
        this.selectionConfig.selectMinDurationSecond = i * 1000;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setOutputCameraDir(java.lang.String str) {
        this.selectionConfig.outPutCameraDir = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setOutputAudioDir(java.lang.String str) {
        this.selectionConfig.outPutAudioDir = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setOutputCameraImageFileName(java.lang.String str) {
        this.selectionConfig.outPutCameraImageFileName = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setOutputCameraVideoFileName(java.lang.String str) {
        this.selectionConfig.outPutCameraVideoFileName = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setOutputAudioFileName(java.lang.String str) {
        this.selectionConfig.outPutAudioFileName = str;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel setSelectedData(java.util.List<com.luck.picture.lib.entity.LocalMedia> list) {
        if (list == null) {
            return this;
        }
        setMaxSelectNum(list.size() + 1);
        setMaxVideoSelectNum(list.size() + 1);
        if (this.selectionConfig.selectionMode == 1 && this.selectionConfig.isDirectReturnSingle) {
            this.selectionConfig.selectedResult.clear();
        } else {
            this.selectionConfig.addAllSelectResult(new java.util.ArrayList<>(list));
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel isQuickCapture(boolean z) {
        this.selectionConfig.isQuickCapture = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel isCameraAroundState(boolean z) {
        this.selectionConfig.isCameraAroundState = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionCameraModel isCameraRotateImage(boolean z) {
        this.selectionConfig.isCameraRotateImage = z;
        return this;
    }

    public void forResult() {
        if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
            return;
        }
        androidx.fragment.app.FragmentActivity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        this.selectionConfig.isResultListenerBack = false;
        this.selectionConfig.isActivityResultBack = true;
        androidx.fragment.app.FragmentManager supportFragmentManager = activity instanceof androidx.fragment.app.FragmentActivity ? activity.getSupportFragmentManager() : null;
        java.util.Objects.requireNonNull(supportFragmentManager, "FragmentManager cannot be null");
        if (!(activity instanceof com.luck.picture.lib.basic.IBridgePictureBehavior)) {
            throw new java.lang.NullPointerException("Use only camera openCamera mode,Activity or Fragment interface needs to be implemented " + com.luck.picture.lib.basic.IBridgePictureBehavior.class);
        }
        androidx.fragment.app.Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(com.luck.picture.lib.PictureOnlyCameraFragment.TAG);
        if (findFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        com.luck.picture.lib.basic.FragmentInjectManager.injectSystemRoomFragment(supportFragmentManager, com.luck.picture.lib.PictureOnlyCameraFragment.TAG, com.luck.picture.lib.PictureOnlyCameraFragment.newInstance());
    }

    public void forResult(com.luck.picture.lib.interfaces.OnResultCallbackListener<com.luck.picture.lib.entity.LocalMedia> onResultCallbackListener) {
        if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
            return;
        }
        androidx.fragment.app.FragmentActivity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        java.util.Objects.requireNonNull(onResultCallbackListener, "OnResultCallbackListener cannot be null");
        this.selectionConfig.isResultListenerBack = true;
        this.selectionConfig.isActivityResultBack = false;
        this.selectionConfig.onResultCallListener = onResultCallbackListener;
        androidx.fragment.app.FragmentManager supportFragmentManager = activity instanceof androidx.fragment.app.FragmentActivity ? activity.getSupportFragmentManager() : null;
        java.util.Objects.requireNonNull(supportFragmentManager, "FragmentManager cannot be null");
        androidx.fragment.app.Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(com.luck.picture.lib.PictureOnlyCameraFragment.TAG);
        if (findFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        com.luck.picture.lib.basic.FragmentInjectManager.injectSystemRoomFragment(supportFragmentManager, com.luck.picture.lib.PictureOnlyCameraFragment.TAG, com.luck.picture.lib.PictureOnlyCameraFragment.newInstance());
    }

    public com.luck.picture.lib.PictureOnlyCameraFragment build() {
        android.app.Activity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        if (!(activity instanceof com.luck.picture.lib.basic.IBridgePictureBehavior)) {
            throw new java.lang.NullPointerException("Use only build PictureOnlyCameraFragment,Activity or Fragment interface needs to be implemented " + com.luck.picture.lib.basic.IBridgePictureBehavior.class);
        }
        this.selectionConfig.isResultListenerBack = false;
        this.selectionConfig.isActivityResultBack = true;
        this.selectionConfig.onResultCallListener = null;
        return new com.luck.picture.lib.PictureOnlyCameraFragment();
    }

    public com.luck.picture.lib.PictureOnlyCameraFragment buildLaunch(int i, com.luck.picture.lib.interfaces.OnResultCallbackListener<com.luck.picture.lib.entity.LocalMedia> onResultCallbackListener) {
        androidx.fragment.app.FragmentActivity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        java.util.Objects.requireNonNull(onResultCallbackListener, "OnResultCallbackListener cannot be null");
        this.selectionConfig.isResultListenerBack = true;
        this.selectionConfig.isActivityResultBack = false;
        this.selectionConfig.onResultCallListener = onResultCallbackListener;
        androidx.fragment.app.FragmentManager supportFragmentManager = activity instanceof androidx.fragment.app.FragmentActivity ? activity.getSupportFragmentManager() : null;
        java.util.Objects.requireNonNull(supportFragmentManager, "FragmentManager cannot be null");
        com.luck.picture.lib.PictureOnlyCameraFragment pictureOnlyCameraFragment = new com.luck.picture.lib.PictureOnlyCameraFragment();
        androidx.fragment.app.Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(pictureOnlyCameraFragment.getFragmentTag());
        if (findFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        supportFragmentManager.beginTransaction().add(i, pictureOnlyCameraFragment, pictureOnlyCameraFragment.getFragmentTag()).addToBackStack(pictureOnlyCameraFragment.getFragmentTag()).commitAllowingStateLoss();
        return pictureOnlyCameraFragment;
    }

    public void forResultActivity(int i) {
        if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
            return;
        }
        android.app.Activity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        this.selectionConfig.isResultListenerBack = false;
        this.selectionConfig.isActivityResultBack = true;
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.luck.picture.lib.basic.PictureSelectorTransparentActivity.class);
        androidx.fragment.app.Fragment fragment = this.selector.getFragment();
        if (fragment != null) {
            fragment.startActivityForResult(intent, i);
        } else {
            activity.startActivityForResult(intent, i);
        }
        activity.overridePendingTransition(com.luck.picture.lib.R.anim.ps_anim_fade_in, 0);
    }

    public void forResultActivity(androidx.activity.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
            return;
        }
        android.app.Activity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        java.util.Objects.requireNonNull(activityResultLauncher, "ActivityResultLauncher cannot be null");
        this.selectionConfig.isResultListenerBack = false;
        this.selectionConfig.isActivityResultBack = true;
        activityResultLauncher.launch(new android.content.Intent(activity, (java.lang.Class<?>) com.luck.picture.lib.basic.PictureSelectorTransparentActivity.class));
        activity.overridePendingTransition(com.luck.picture.lib.R.anim.ps_anim_fade_in, 0);
    }

    public void forResultActivity(com.luck.picture.lib.interfaces.OnResultCallbackListener<com.luck.picture.lib.entity.LocalMedia> onResultCallbackListener) {
        if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
            return;
        }
        android.app.Activity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        java.util.Objects.requireNonNull(onResultCallbackListener, "OnResultCallbackListener cannot be null");
        this.selectionConfig.isResultListenerBack = true;
        this.selectionConfig.isActivityResultBack = false;
        this.selectionConfig.onResultCallListener = onResultCallbackListener;
        activity.startActivity(new android.content.Intent(activity, (java.lang.Class<?>) com.luck.picture.lib.basic.PictureSelectorTransparentActivity.class));
        activity.overridePendingTransition(com.luck.picture.lib.R.anim.ps_anim_fade_in, 0);
    }
}
