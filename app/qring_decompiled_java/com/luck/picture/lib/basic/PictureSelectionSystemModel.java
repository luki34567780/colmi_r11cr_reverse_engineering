package com.luck.picture.lib.basic;

/* loaded from: /tmp/dex/classes2.dex */
public final class PictureSelectionSystemModel {
    private final com.luck.picture.lib.config.SelectorConfig selectionConfig;
    private final com.luck.picture.lib.basic.PictureSelector selector;

    public PictureSelectionSystemModel(com.luck.picture.lib.basic.PictureSelector pictureSelector, int i) {
        this.selector = pictureSelector;
        com.luck.picture.lib.config.SelectorConfig selectorConfig = new com.luck.picture.lib.config.SelectorConfig();
        this.selectionConfig = selectorConfig;
        com.luck.picture.lib.config.SelectorProviders.getInstance().addSelectorConfigQueue(selectorConfig);
        selectorConfig.chooseMode = i;
        selectorConfig.isPreviewFullScreenMode = false;
        selectorConfig.isPreviewZoomEffect = false;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setSelectionMode(int i) {
        this.selectionConfig.selectionMode = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel isOriginalControl(boolean z) {
        this.selectionConfig.isCheckOriginalImage = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setSkipCropMimeType(java.lang.String... strArr) {
        if (strArr != null && strArr.length > 0) {
            this.selectionConfig.skipCropList.addAll(java.util.Arrays.asList(strArr));
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel isOriginalSkipCompress(boolean z) {
        this.selectionConfig.isOriginalSkipCompress = z;
        return this;
    }

    @java.lang.Deprecated
    public com.luck.picture.lib.basic.PictureSelectionSystemModel setCompressEngine(com.luck.picture.lib.engine.CompressEngine compressEngine) {
        this.selectionConfig.compressEngine = compressEngine;
        this.selectionConfig.isCompressEngine = true;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setCompressEngine(com.luck.picture.lib.engine.CompressFileEngine compressFileEngine) {
        this.selectionConfig.compressFileEngine = compressFileEngine;
        this.selectionConfig.isCompressEngine = true;
        return this;
    }

    @java.lang.Deprecated
    public com.luck.picture.lib.basic.PictureSelectionSystemModel setCropEngine(com.luck.picture.lib.engine.CropEngine cropEngine) {
        this.selectionConfig.cropEngine = cropEngine;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setCropEngine(com.luck.picture.lib.engine.CropFileEngine cropFileEngine) {
        this.selectionConfig.cropFileEngine = cropFileEngine;
        return this;
    }

    @java.lang.Deprecated
    public com.luck.picture.lib.basic.PictureSelectionSystemModel setSandboxFileEngine(com.luck.picture.lib.engine.SandboxFileEngine sandboxFileEngine) {
        if (com.luck.picture.lib.utils.SdkVersionUtils.isQ()) {
            this.selectionConfig.sandboxFileEngine = sandboxFileEngine;
            this.selectionConfig.isSandboxFileEngine = true;
        } else {
            this.selectionConfig.isSandboxFileEngine = false;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setSandboxFileEngine(com.luck.picture.lib.engine.UriToFileTransformEngine uriToFileTransformEngine) {
        if (com.luck.picture.lib.utils.SdkVersionUtils.isQ()) {
            this.selectionConfig.uriToFileTransformEngine = uriToFileTransformEngine;
            this.selectionConfig.isSandboxFileEngine = true;
        } else {
            this.selectionConfig.isSandboxFileEngine = false;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setSelectMaxFileSize(long j) {
        if (j >= com.luck.picture.lib.config.FileSizeUnit.MB) {
            this.selectionConfig.selectMaxFileSize = j;
        } else {
            this.selectionConfig.selectMaxFileSize = j * com.luck.picture.lib.config.FileSizeUnit.KB;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setSelectMinFileSize(long j) {
        if (j >= com.luck.picture.lib.config.FileSizeUnit.MB) {
            this.selectionConfig.selectMinFileSize = j;
        } else {
            this.selectionConfig.selectMinFileSize = j * com.luck.picture.lib.config.FileSizeUnit.KB;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setSelectMaxDurationSecond(int i) {
        this.selectionConfig.selectMaxDurationSecond = i * 1000;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setSelectMinDurationSecond(int i) {
        this.selectionConfig.selectMinDurationSecond = i * 1000;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setPermissionsInterceptListener(com.luck.picture.lib.interfaces.OnPermissionsInterceptListener onPermissionsInterceptListener) {
        this.selectionConfig.onPermissionsEventListener = onPermissionsInterceptListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setPermissionDescriptionListener(com.luck.picture.lib.interfaces.OnPermissionDescriptionListener onPermissionDescriptionListener) {
        this.selectionConfig.onPermissionDescriptionListener = onPermissionDescriptionListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setPermissionDeniedListener(com.luck.picture.lib.interfaces.OnPermissionDeniedListener onPermissionDeniedListener) {
        this.selectionConfig.onPermissionDeniedListener = onPermissionDeniedListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setSelectLimitTipsListener(com.luck.picture.lib.interfaces.OnSelectLimitTipsListener onSelectLimitTipsListener) {
        this.selectionConfig.onSelectLimitTipsListener = onSelectLimitTipsListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setSelectFilterListener(com.luck.picture.lib.interfaces.OnSelectFilterListener onSelectFilterListener) {
        this.selectionConfig.onSelectFilterListener = onSelectFilterListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setAddBitmapWatermarkListener(com.luck.picture.lib.interfaces.OnBitmapWatermarkEventListener onBitmapWatermarkEventListener) {
        if (this.selectionConfig.chooseMode != com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
            this.selectionConfig.onBitmapWatermarkListener = onBitmapWatermarkEventListener;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setVideoThumbnailListener(com.luck.picture.lib.interfaces.OnVideoThumbnailEventListener onVideoThumbnailEventListener) {
        if (this.selectionConfig.chooseMode != com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
            this.selectionConfig.onVideoThumbnailEventListener = onVideoThumbnailEventListener;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionSystemModel setCustomLoadingListener(com.luck.picture.lib.interfaces.OnCustomLoadingListener onCustomLoadingListener) {
        this.selectionConfig.onCustomLoadingListener = onCustomLoadingListener;
        return this;
    }

    public void forSystemResult(com.luck.picture.lib.interfaces.OnResultCallbackListener<com.luck.picture.lib.entity.LocalMedia> onResultCallbackListener) {
        if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
            return;
        }
        androidx.fragment.app.FragmentActivity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        java.util.Objects.requireNonNull(onResultCallbackListener, "OnResultCallbackListener cannot be null");
        this.selectionConfig.onResultCallListener = onResultCallbackListener;
        this.selectionConfig.isResultListenerBack = true;
        this.selectionConfig.isActivityResultBack = false;
        androidx.fragment.app.FragmentManager supportFragmentManager = activity instanceof androidx.fragment.app.FragmentActivity ? activity.getSupportFragmentManager() : null;
        java.util.Objects.requireNonNull(supportFragmentManager, "FragmentManager cannot be null");
        androidx.fragment.app.Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(com.luck.picture.lib.PictureSelectorSystemFragment.TAG);
        if (findFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        com.luck.picture.lib.basic.FragmentInjectManager.injectSystemRoomFragment(supportFragmentManager, com.luck.picture.lib.PictureSelectorSystemFragment.TAG, com.luck.picture.lib.PictureSelectorSystemFragment.newInstance());
    }

    public void forSystemResult() {
        if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
            return;
        }
        androidx.fragment.app.FragmentActivity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        if (!(activity instanceof com.luck.picture.lib.basic.IBridgePictureBehavior)) {
            throw new java.lang.NullPointerException("Use only forSystemResult();,Activity or Fragment interface needs to be implemented " + com.luck.picture.lib.basic.IBridgePictureBehavior.class);
        }
        this.selectionConfig.isActivityResultBack = true;
        this.selectionConfig.onResultCallListener = null;
        this.selectionConfig.isResultListenerBack = false;
        androidx.fragment.app.FragmentManager supportFragmentManager = activity instanceof androidx.fragment.app.FragmentActivity ? activity.getSupportFragmentManager() : null;
        java.util.Objects.requireNonNull(supportFragmentManager, "FragmentManager cannot be null");
        androidx.fragment.app.Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(com.luck.picture.lib.PictureSelectorSystemFragment.TAG);
        if (findFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        com.luck.picture.lib.basic.FragmentInjectManager.injectSystemRoomFragment(supportFragmentManager, com.luck.picture.lib.PictureSelectorSystemFragment.TAG, com.luck.picture.lib.PictureSelectorSystemFragment.newInstance());
    }

    public void forSystemResultActivity(int i) {
        if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
            return;
        }
        android.app.Activity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        this.selectionConfig.isResultListenerBack = false;
        this.selectionConfig.isActivityResultBack = true;
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.luck.picture.lib.basic.PictureSelectorTransparentActivity.class);
        intent.putExtra(com.luck.picture.lib.config.PictureConfig.EXTRA_MODE_TYPE_SOURCE, 1);
        androidx.fragment.app.Fragment fragment = this.selector.getFragment();
        if (fragment != null) {
            fragment.startActivityForResult(intent, i);
        } else {
            activity.startActivityForResult(intent, i);
        }
        activity.overridePendingTransition(com.luck.picture.lib.R.anim.ps_anim_fade_in, 0);
    }

    public void forSystemResultActivity(androidx.activity.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
            return;
        }
        android.app.Activity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        java.util.Objects.requireNonNull(activityResultLauncher, "ActivityResultLauncher cannot be null");
        this.selectionConfig.isResultListenerBack = false;
        this.selectionConfig.isActivityResultBack = true;
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.luck.picture.lib.basic.PictureSelectorTransparentActivity.class);
        intent.putExtra(com.luck.picture.lib.config.PictureConfig.EXTRA_MODE_TYPE_SOURCE, 1);
        activityResultLauncher.launch(intent);
        activity.overridePendingTransition(com.luck.picture.lib.R.anim.ps_anim_fade_in, 0);
    }

    public void forSystemResultActivity(com.luck.picture.lib.interfaces.OnResultCallbackListener<com.luck.picture.lib.entity.LocalMedia> onResultCallbackListener) {
        if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
            return;
        }
        android.app.Activity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        java.util.Objects.requireNonNull(onResultCallbackListener, "OnResultCallbackListener cannot be null");
        this.selectionConfig.isResultListenerBack = true;
        this.selectionConfig.isActivityResultBack = false;
        this.selectionConfig.onResultCallListener = onResultCallbackListener;
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.luck.picture.lib.basic.PictureSelectorTransparentActivity.class);
        intent.putExtra(com.luck.picture.lib.config.PictureConfig.EXTRA_MODE_TYPE_SOURCE, 1);
        activity.startActivity(intent);
        activity.overridePendingTransition(com.luck.picture.lib.R.anim.ps_anim_fade_in, 0);
    }
}
