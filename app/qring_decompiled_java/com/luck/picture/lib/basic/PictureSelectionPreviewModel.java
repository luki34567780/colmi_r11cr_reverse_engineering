package com.luck.picture.lib.basic;

/* loaded from: /tmp/dex/classes2.dex */
public final class PictureSelectionPreviewModel {
    private final com.luck.picture.lib.config.SelectorConfig selectionConfig;
    private final com.luck.picture.lib.basic.PictureSelector selector;

    public PictureSelectionPreviewModel(com.luck.picture.lib.basic.PictureSelector pictureSelector) {
        this.selector = pictureSelector;
        com.luck.picture.lib.config.SelectorConfig selectorConfig = new com.luck.picture.lib.config.SelectorConfig();
        this.selectionConfig = selectorConfig;
        com.luck.picture.lib.config.SelectorProviders.getInstance().addSelectorConfigQueue(selectorConfig);
        selectorConfig.isPreviewZoomEffect = false;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel setImageEngine(com.luck.picture.lib.engine.ImageEngine imageEngine) {
        this.selectionConfig.imageEngine = imageEngine;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel setVideoPlayerEngine(com.luck.picture.lib.engine.VideoPlayerEngine videoPlayerEngine) {
        this.selectionConfig.videoPlayerEngine = videoPlayerEngine;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel setSelectorUIStyle(com.luck.picture.lib.style.PictureSelectorStyle pictureSelectorStyle) {
        if (pictureSelectorStyle != null) {
            this.selectionConfig.selectorStyle = pictureSelectorStyle;
        }
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel setLanguage(int i) {
        this.selectionConfig.language = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel setDefaultLanguage(int i) {
        this.selectionConfig.defaultLanguage = i;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel setInjectLayoutResourceListener(com.luck.picture.lib.interfaces.OnInjectLayoutResourceListener onInjectLayoutResourceListener) {
        this.selectionConfig.isInjectLayoutResource = onInjectLayoutResourceListener != null;
        this.selectionConfig.onLayoutResourceListener = onInjectLayoutResourceListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel setAttachViewLifecycle(com.luck.picture.lib.basic.IBridgeViewLifecycle iBridgeViewLifecycle) {
        this.selectionConfig.viewLifecycle = iBridgeViewLifecycle;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel isUseSystemVideoPlayer(boolean z) {
        this.selectionConfig.isUseSystemVideoPlayer = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel isPreviewFullScreenMode(boolean z) {
        this.selectionConfig.isPreviewFullScreenMode = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel isPreviewZoomEffect(boolean z, android.view.ViewGroup viewGroup) {
        return isPreviewZoomEffect(z, this.selectionConfig.isPreviewFullScreenMode, viewGroup);
    }

    @java.lang.Deprecated
    public com.luck.picture.lib.basic.PictureSelectionPreviewModel isEnableVideoSize(boolean z) {
        this.selectionConfig.isSyncWidthAndHeight = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel isSyncWidthAndHeight(boolean z) {
        this.selectionConfig.isSyncWidthAndHeight = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel isPreviewZoomEffect(boolean z, boolean z2, android.view.ViewGroup viewGroup) {
        if ((viewGroup instanceof androidx.recyclerview.widget.RecyclerView) || (viewGroup instanceof android.widget.ListView)) {
            if (z) {
                if (z2) {
                    com.luck.picture.lib.magical.BuildRecycleItemViewParams.generateViewParams(viewGroup, 0);
                } else {
                    com.luck.picture.lib.magical.BuildRecycleItemViewParams.generateViewParams(viewGroup, com.luck.picture.lib.utils.DensityUtil.getStatusBarHeight(this.selector.getActivity()));
                }
            }
            this.selectionConfig.isPreviewZoomEffect = z;
            return this;
        }
        throw new java.lang.IllegalArgumentException(viewGroup.getClass().getCanonicalName() + " Must be " + androidx.recyclerview.widget.RecyclerView.class + " or " + android.widget.ListView.class);
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel isAutoVideoPlay(boolean z) {
        this.selectionConfig.isAutoVideoPlay = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel isLoopAutoVideoPlay(boolean z) {
        this.selectionConfig.isLoopAutoPlay = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel isVideoPauseResumePlay(boolean z) {
        this.selectionConfig.isPauseResumePlay = z;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel setExternalPreviewEventListener(com.luck.picture.lib.interfaces.OnExternalPreviewEventListener onExternalPreviewEventListener) {
        this.selectionConfig.onExternalPreviewEventListener = onExternalPreviewEventListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel setInjectActivityPreviewFragment(com.luck.picture.lib.interfaces.OnInjectActivityPreviewListener onInjectActivityPreviewListener) {
        this.selectionConfig.onInjectActivityPreviewListener = onInjectActivityPreviewListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel setCustomLoadingListener(com.luck.picture.lib.interfaces.OnCustomLoadingListener onCustomLoadingListener) {
        this.selectionConfig.onCustomLoadingListener = onCustomLoadingListener;
        return this;
    }

    public com.luck.picture.lib.basic.PictureSelectionPreviewModel isHidePreviewDownload(boolean z) {
        this.selectionConfig.isHidePreviewDownload = z;
        return this;
    }

    public void startFragmentPreview(int i, boolean z, java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        startFragmentPreview(null, i, z, arrayList);
    }

    public void startFragmentPreview(com.luck.picture.lib.PictureSelectorPreviewFragment pictureSelectorPreviewFragment, int i, boolean z, java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        java.lang.String str;
        if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
            return;
        }
        androidx.fragment.app.FragmentActivity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        if (this.selectionConfig.imageEngine == null && this.selectionConfig.chooseMode != com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
            throw new java.lang.NullPointerException("imageEngine is null,Please implement ImageEngine");
        }
        if (arrayList == null || arrayList.size() == 0) {
            throw new java.lang.NullPointerException("preview data is null");
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = activity instanceof androidx.fragment.app.FragmentActivity ? activity.getSupportFragmentManager() : null;
        java.util.Objects.requireNonNull(supportFragmentManager, "FragmentManager cannot be null");
        if (pictureSelectorPreviewFragment != null) {
            str = pictureSelectorPreviewFragment.getFragmentTag();
        } else {
            str = com.luck.picture.lib.PictureSelectorPreviewFragment.TAG;
            pictureSelectorPreviewFragment = com.luck.picture.lib.PictureSelectorPreviewFragment.newInstance();
        }
        if (com.luck.picture.lib.utils.ActivityCompatHelper.checkFragmentNonExits(activity, str)) {
            java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList2 = new java.util.ArrayList<>(arrayList);
            pictureSelectorPreviewFragment.setExternalPreviewData(i, arrayList2.size(), arrayList2, z);
            com.luck.picture.lib.basic.FragmentInjectManager.injectSystemRoomFragment(supportFragmentManager, str, pictureSelectorPreviewFragment);
        }
    }

    public void startActivityPreview(int i, boolean z, java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
            return;
        }
        android.app.Activity activity = this.selector.getActivity();
        java.util.Objects.requireNonNull(activity, "Activity cannot be null");
        if (this.selectionConfig.imageEngine == null && this.selectionConfig.chooseMode != com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
            throw new java.lang.NullPointerException("imageEngine is null,Please implement ImageEngine");
        }
        if (arrayList == null || arrayList.size() == 0) {
            throw new java.lang.NullPointerException("preview data is null");
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.luck.picture.lib.basic.PictureSelectorTransparentActivity.class);
        this.selectionConfig.addSelectedPreviewResult(arrayList);
        intent.putExtra(com.luck.picture.lib.config.PictureConfig.EXTRA_EXTERNAL_PREVIEW, true);
        intent.putExtra(com.luck.picture.lib.config.PictureConfig.EXTRA_MODE_TYPE_SOURCE, 2);
        intent.putExtra(com.luck.picture.lib.config.PictureConfig.EXTRA_PREVIEW_CURRENT_POSITION, i);
        intent.putExtra(com.luck.picture.lib.config.PictureConfig.EXTRA_EXTERNAL_PREVIEW_DISPLAY_DELETE, z);
        androidx.fragment.app.Fragment fragment = this.selector.getFragment();
        if (fragment != null) {
            fragment.startActivity(intent);
        } else {
            activity.startActivity(intent);
        }
        if (this.selectionConfig.isPreviewZoomEffect) {
            activity.overridePendingTransition(com.luck.picture.lib.R.anim.ps_anim_fade_in, com.luck.picture.lib.R.anim.ps_anim_fade_in);
        } else {
            activity.overridePendingTransition(this.selectionConfig.selectorStyle.getWindowAnimationStyle().activityEnterAnimation, com.luck.picture.lib.R.anim.ps_anim_fade_in);
        }
    }
}
