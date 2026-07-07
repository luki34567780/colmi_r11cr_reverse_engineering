package com.luck.picture.lib.basic;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class PictureCommonFragment extends androidx.fragment.app.Fragment implements com.luck.picture.lib.basic.IPictureSelectorCommonEvent {
    public static final java.lang.String TAG = "PictureCommonFragment";
    private android.content.Context context;
    private long enterAnimDuration;
    protected com.luck.picture.lib.basic.IBridgePictureBehavior iBridgePictureBehavior;
    protected com.luck.picture.lib.loader.IBridgeMediaLoader mLoader;
    private android.app.Dialog mLoadingDialog;
    protected int mPage = 1;
    private com.luck.picture.lib.permissions.PermissionResultCallback mPermissionResultCallback;
    protected com.luck.picture.lib.config.SelectorConfig selectorConfig;
    private int soundID;
    private android.media.SoundPool soundPool;
    protected android.app.Dialog tipsDialog;

    public void dispatchCameraMediaResult(com.luck.picture.lib.entity.LocalMedia localMedia) {
    }

    public int getResourceId() {
        return 0;
    }

    public void handlePermissionSettingResult(java.lang.String[] strArr) {
    }

    public void onCheckOriginalChange() {
    }

    public void onCreateLoader() {
    }

    public void onEditMedia(android.content.Intent intent) {
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onEnterFragment() {
    }

    public void onExitFragment() {
    }

    public void onFixedSelectedChange(com.luck.picture.lib.entity.LocalMedia localMedia) {
    }

    public void onFragmentResume() {
    }

    public void onSelectedChange(boolean z, com.luck.picture.lib.entity.LocalMedia localMedia) {
    }

    public void reStartSavedInstance(android.os.Bundle bundle) {
    }

    public void sendChangeSubSelectPositionEvent(boolean z) {
    }

    public java.lang.String getFragmentTag() {
        return TAG;
    }

    protected android.content.Context getAppContext() {
        android.content.Context context = getContext();
        if (context != null) {
            return context;
        }
        android.content.Context appContext = com.luck.picture.lib.app.PictureAppMaster.getInstance().getAppContext();
        return appContext != null ? appContext : this.context;
    }

    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.mPermissionResultCallback != null) {
            com.luck.picture.lib.permissions.PermissionChecker.getInstance().onRequestPermissionsResult(iArr, this.mPermissionResultCallback);
            this.mPermissionResultCallback = null;
        }
    }

    public void setPermissionsResultAction(com.luck.picture.lib.permissions.PermissionResultCallback permissionResultCallback) {
        this.mPermissionResultCallback = permissionResultCallback;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void handlePermissionDenied(java.lang.String[] strArr) {
        com.luck.picture.lib.permissions.PermissionConfig.CURRENT_REQUEST_PERMISSION = strArr;
        if (strArr != null && strArr.length > 0) {
            com.luck.picture.lib.utils.SpUtils.putBoolean(getAppContext(), strArr[0], true);
        }
        if (this.selectorConfig.onPermissionDeniedListener != null) {
            onPermissionExplainEvent(false, null);
            this.selectorConfig.onPermissionDeniedListener.onDenied(this, strArr, com.luck.picture.lib.config.PictureConfig.REQUEST_GO_SETTING, new com.luck.picture.lib.interfaces.OnCallbackListener<java.lang.Boolean>() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.1
                @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                public void onCall(java.lang.Boolean bool) {
                    if (bool.booleanValue()) {
                        com.luck.picture.lib.basic.PictureCommonFragment.this.handlePermissionSettingResult(com.luck.picture.lib.permissions.PermissionConfig.CURRENT_REQUEST_PERMISSION);
                    }
                }
            });
        } else {
            com.luck.picture.lib.permissions.PermissionUtil.goIntentSetting(this, com.luck.picture.lib.config.PictureConfig.REQUEST_GO_SETTING);
        }
    }

    protected boolean isNormalDefaultEnter() {
        return (getActivity() instanceof com.luck.picture.lib.basic.PictureSelectorSupporterActivity) || (getActivity() instanceof com.luck.picture.lib.basic.PictureSelectorTransparentActivity);
    }

    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        if (getResourceId() != 0) {
            return layoutInflater.inflate(getResourceId(), viewGroup, false);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.selectorConfig = com.luck.picture.lib.config.SelectorProviders.getInstance().getSelectorConfig();
        com.luck.picture.lib.utils.FileDirMap.init(view.getContext());
        if (this.selectorConfig.viewLifecycle != null) {
            this.selectorConfig.viewLifecycle.onViewCreated(this, view, bundle);
        }
        if (this.selectorConfig.onCustomLoadingListener != null) {
            this.mLoadingDialog = this.selectorConfig.onCustomLoadingListener.create(getAppContext());
        } else {
            this.mLoadingDialog = new com.luck.picture.lib.dialog.PictureLoadingDialog(getAppContext());
        }
        setRequestedOrientation();
        setTranslucentStatusBar();
        setRootViewKeyListener(requireView());
        if (!this.selectorConfig.isOpenClickSound || this.selectorConfig.isOnlyCamera) {
            return;
        }
        android.media.SoundPool soundPool = new android.media.SoundPool(1, 3, 0);
        this.soundPool = soundPool;
        this.soundID = soundPool.load(getAppContext(), com.luck.picture.lib.R.raw.ps_click_music, 1);
    }

    private void setTranslucentStatusBar() {
        if (this.selectorConfig.isPreviewFullScreenMode) {
            com.luck.picture.lib.immersive.ImmersiveManager.translucentStatusBar(requireActivity(), this.selectorConfig.selectorStyle.getSelectMainStyle().isDarkStatusBarBlack());
        }
    }

    public void setRootViewKeyListener(android.view.View view) {
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new android.view.View.OnKeyListener() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.2
            @Override // android.view.View.OnKeyListener
            public boolean onKey(android.view.View view2, int i, android.view.KeyEvent keyEvent) {
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                com.luck.picture.lib.basic.PictureCommonFragment.this.onKeyBackFragmentFinish();
                return true;
            }
        });
    }

    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        initAppLanguage();
    }

    public android.view.animation.Animation onCreateAnimation(int i, boolean z, int i2) {
        android.view.animation.Animation loadAnimation;
        com.luck.picture.lib.style.PictureWindowAnimationStyle windowAnimationStyle = this.selectorConfig.selectorStyle.getWindowAnimationStyle();
        if (z) {
            if (windowAnimationStyle.activityEnterAnimation != 0) {
                loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getAppContext(), windowAnimationStyle.activityEnterAnimation);
            } else {
                loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getAppContext(), com.luck.picture.lib.R.anim.ps_anim_alpha_enter);
            }
            setEnterAnimationDuration(loadAnimation.getDuration());
            onEnterFragment();
        } else {
            if (windowAnimationStyle.activityExitAnimation != 0) {
                loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getAppContext(), windowAnimationStyle.activityExitAnimation);
            } else {
                loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getAppContext(), com.luck.picture.lib.R.anim.ps_anim_alpha_exit);
            }
            onExitFragment();
        }
        return loadAnimation;
    }

    public void setEnterAnimationDuration(long j) {
        this.enterAnimDuration = j;
    }

    public long getEnterAnimationDuration() {
        long j = this.enterAnimDuration;
        if (j > 50) {
            j -= 50;
        }
        if (j >= 0) {
            return j;
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public int confirmSelect(com.luck.picture.lib.entity.LocalMedia localMedia, boolean z) {
        int i = 0;
        if (this.selectorConfig.onSelectFilterListener != null && this.selectorConfig.onSelectFilterListener.onSelectFilter(localMedia)) {
            if (!(this.selectorConfig.onSelectLimitTipsListener != null ? this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 13) : false)) {
                com.luck.picture.lib.utils.ToastUtils.showToast(getAppContext(), getString(com.luck.picture.lib.R.string.ps_select_no_support));
            }
            return -1;
        }
        if (isCheckSelectValidity(localMedia, z) != 200) {
            return -1;
        }
        java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> selectedResult = this.selectorConfig.getSelectedResult();
        if (z) {
            selectedResult.remove(localMedia);
            i = 1;
        } else {
            if (this.selectorConfig.selectionMode == 1 && selectedResult.size() > 0) {
                sendFixedSelectedChangeEvent(selectedResult.get(0));
                selectedResult.clear();
            }
            selectedResult.add(localMedia);
            localMedia.setNum(selectedResult.size());
            playClickEffect();
        }
        sendSelectedChangeEvent(i ^ 1, localMedia);
        return i;
    }

    protected int isCheckSelectValidity(com.luck.picture.lib.entity.LocalMedia localMedia, boolean z) {
        java.lang.String mimeType = localMedia.getMimeType();
        long duration = localMedia.getDuration();
        long size = localMedia.getSize();
        java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> selectedResult = this.selectorConfig.getSelectedResult();
        if (!this.selectorConfig.isWithVideoImage) {
            return checkOnlyMimeTypeValidity(localMedia, z, mimeType, this.selectorConfig.getResultFirstMimeType(), size, duration) ? -1 : 200;
        }
        int i = 0;
        for (int i2 = 0; i2 < selectedResult.size(); i2++) {
            if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(selectedResult.get(i2).getMimeType())) {
                i++;
            }
        }
        return checkWithMimeTypeValidity(localMedia, z, mimeType, i, size, duration) ? -1 : 200;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkWithMimeTypeValidity(com.luck.picture.lib.entity.LocalMedia localMedia, boolean z, java.lang.String str, int i, long j, long j2) {
        if (this.selectorConfig.selectMaxFileSize > 0 && j > this.selectorConfig.selectMaxFileSize) {
            if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 1)) {
                return true;
            }
            showTipsDialog(getString(com.luck.picture.lib.R.string.ps_select_max_size, new java.lang.Object[]{com.luck.picture.lib.utils.PictureFileUtils.formatFileSize(this.selectorConfig.selectMaxFileSize)}));
            return true;
        }
        if (this.selectorConfig.selectMinFileSize > 0 && j < this.selectorConfig.selectMinFileSize) {
            if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 2)) {
                return true;
            }
            showTipsDialog(getString(com.luck.picture.lib.R.string.ps_select_min_size, new java.lang.Object[]{com.luck.picture.lib.utils.PictureFileUtils.formatFileSize(this.selectorConfig.selectMinFileSize)}));
            return true;
        }
        if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(str)) {
            if (this.selectorConfig.selectionMode == 2) {
                if (this.selectorConfig.maxVideoSelectNum <= 0) {
                    if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 3)) {
                        return true;
                    }
                    showTipsDialog(getString(com.luck.picture.lib.R.string.ps_rule));
                    return true;
                }
                if (!z && this.selectorConfig.getSelectedResult().size() >= this.selectorConfig.maxSelectNum) {
                    if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 4)) {
                        return true;
                    }
                    showTipsDialog(getString(com.luck.picture.lib.R.string.ps_message_max_num, new java.lang.Object[]{java.lang.Integer.valueOf(this.selectorConfig.maxSelectNum)}));
                    return true;
                }
                if (!z && i >= this.selectorConfig.maxVideoSelectNum) {
                    if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 6)) {
                        return true;
                    }
                    showTipsDialog(getTipsMsg(getAppContext(), str, this.selectorConfig.maxVideoSelectNum));
                    return true;
                }
            }
            if (!z && this.selectorConfig.selectMinDurationSecond > 0 && com.luck.picture.lib.utils.DateUtils.millisecondToSecond(j2) < this.selectorConfig.selectMinDurationSecond) {
                if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 9)) {
                    return true;
                }
                showTipsDialog(getString(com.luck.picture.lib.R.string.ps_select_video_min_second, new java.lang.Object[]{java.lang.Integer.valueOf(this.selectorConfig.selectMinDurationSecond / 1000)}));
                return true;
            }
            if (!z && this.selectorConfig.selectMaxDurationSecond > 0 && com.luck.picture.lib.utils.DateUtils.millisecondToSecond(j2) > this.selectorConfig.selectMaxDurationSecond) {
                if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 8)) {
                    return true;
                }
                showTipsDialog(getString(com.luck.picture.lib.R.string.ps_select_video_max_second, new java.lang.Object[]{java.lang.Integer.valueOf(this.selectorConfig.selectMaxDurationSecond / 1000)}));
                return true;
            }
        } else if (this.selectorConfig.selectionMode == 2 && !z && this.selectorConfig.getSelectedResult().size() >= this.selectorConfig.maxSelectNum) {
            if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 4)) {
                return true;
            }
            showTipsDialog(getString(com.luck.picture.lib.R.string.ps_message_max_num, new java.lang.Object[]{java.lang.Integer.valueOf(this.selectorConfig.maxSelectNum)}));
            return true;
        }
        return false;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkOnlyMimeTypeValidity(com.luck.picture.lib.entity.LocalMedia localMedia, boolean z, java.lang.String str, java.lang.String str2, long j, long j2) {
        if (!com.luck.picture.lib.config.PictureMimeType.isMimeTypeSame(str2, str)) {
            if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 3)) {
                return true;
            }
            showTipsDialog(getString(com.luck.picture.lib.R.string.ps_rule));
            return true;
        }
        if (this.selectorConfig.selectMaxFileSize > 0 && j > this.selectorConfig.selectMaxFileSize) {
            if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 1)) {
                return true;
            }
            showTipsDialog(getString(com.luck.picture.lib.R.string.ps_select_max_size, new java.lang.Object[]{com.luck.picture.lib.utils.PictureFileUtils.formatFileSize(this.selectorConfig.selectMaxFileSize)}));
            return true;
        }
        if (this.selectorConfig.selectMinFileSize > 0 && j < this.selectorConfig.selectMinFileSize) {
            if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 2)) {
                return true;
            }
            showTipsDialog(getString(com.luck.picture.lib.R.string.ps_select_min_size, new java.lang.Object[]{com.luck.picture.lib.utils.PictureFileUtils.formatFileSize(this.selectorConfig.selectMinFileSize)}));
            return true;
        }
        if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(str)) {
            if (this.selectorConfig.selectionMode == 2) {
                com.luck.picture.lib.config.SelectorConfig selectorConfig = this.selectorConfig;
                selectorConfig.maxVideoSelectNum = selectorConfig.maxVideoSelectNum > 0 ? this.selectorConfig.maxVideoSelectNum : this.selectorConfig.maxSelectNum;
                if (!z && this.selectorConfig.getSelectCount() >= this.selectorConfig.maxVideoSelectNum) {
                    if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 6)) {
                        return true;
                    }
                    showTipsDialog(getTipsMsg(getAppContext(), str, this.selectorConfig.maxVideoSelectNum));
                    return true;
                }
            }
            if (!z && this.selectorConfig.selectMinDurationSecond > 0 && com.luck.picture.lib.utils.DateUtils.millisecondToSecond(j2) < this.selectorConfig.selectMinDurationSecond) {
                if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 9)) {
                    return true;
                }
                showTipsDialog(getString(com.luck.picture.lib.R.string.ps_select_video_min_second, new java.lang.Object[]{java.lang.Integer.valueOf(this.selectorConfig.selectMinDurationSecond / 1000)}));
                return true;
            }
            if (!z && this.selectorConfig.selectMaxDurationSecond > 0 && com.luck.picture.lib.utils.DateUtils.millisecondToSecond(j2) > this.selectorConfig.selectMaxDurationSecond) {
                if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 8)) {
                    return true;
                }
                showTipsDialog(getString(com.luck.picture.lib.R.string.ps_select_video_max_second, new java.lang.Object[]{java.lang.Integer.valueOf(this.selectorConfig.selectMaxDurationSecond / 1000)}));
                return true;
            }
        } else if (com.luck.picture.lib.config.PictureMimeType.isHasAudio(str)) {
            if (this.selectorConfig.selectionMode == 2 && !z && this.selectorConfig.getSelectedResult().size() >= this.selectorConfig.maxSelectNum) {
                if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 4)) {
                    return true;
                }
                showTipsDialog(getTipsMsg(getAppContext(), str, this.selectorConfig.maxSelectNum));
                return true;
            }
            if (!z && this.selectorConfig.selectMinDurationSecond > 0 && com.luck.picture.lib.utils.DateUtils.millisecondToSecond(j2) < this.selectorConfig.selectMinDurationSecond) {
                if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 11)) {
                    return true;
                }
                showTipsDialog(getString(com.luck.picture.lib.R.string.ps_select_audio_min_second, new java.lang.Object[]{java.lang.Integer.valueOf(this.selectorConfig.selectMinDurationSecond / 1000)}));
                return true;
            }
            if (!z && this.selectorConfig.selectMaxDurationSecond > 0 && com.luck.picture.lib.utils.DateUtils.millisecondToSecond(j2) > this.selectorConfig.selectMaxDurationSecond) {
                if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 10)) {
                    return true;
                }
                showTipsDialog(getString(com.luck.picture.lib.R.string.ps_select_audio_max_second, new java.lang.Object[]{java.lang.Integer.valueOf(this.selectorConfig.selectMaxDurationSecond / 1000)}));
                return true;
            }
        } else if (this.selectorConfig.selectionMode == 2 && !z && this.selectorConfig.getSelectedResult().size() >= this.selectorConfig.maxSelectNum) {
            if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), localMedia, this.selectorConfig, 4)) {
                return true;
            }
            showTipsDialog(getTipsMsg(getAppContext(), str, this.selectorConfig.maxSelectNum));
            return true;
        }
        return false;
    }

    private void showTipsDialog(java.lang.String str) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        try {
            android.app.Dialog dialog = this.tipsDialog;
            if (dialog == null || !dialog.isShowing()) {
                com.luck.picture.lib.dialog.RemindDialog buildDialog = com.luck.picture.lib.dialog.RemindDialog.buildDialog(getAppContext(), str);
                this.tipsDialog = buildDialog;
                buildDialog.show();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    private static java.lang.String getTipsMsg(android.content.Context context, java.lang.String str, int i) {
        return com.luck.picture.lib.config.PictureMimeType.isHasVideo(str) ? context.getString(com.luck.picture.lib.R.string.ps_message_video_max_num, java.lang.String.valueOf(i)) : com.luck.picture.lib.config.PictureMimeType.isHasAudio(str) ? context.getString(com.luck.picture.lib.R.string.ps_message_audio_max_num, java.lang.String.valueOf(i)) : context.getString(com.luck.picture.lib.R.string.ps_message_max_num, java.lang.String.valueOf(i));
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void sendSelectedChangeEvent(boolean z, com.luck.picture.lib.entity.LocalMedia localMedia) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        java.util.List fragments = getActivity().getSupportFragmentManager().getFragments();
        for (int i = 0; i < fragments.size(); i++) {
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) fragments.get(i);
            if (fragment instanceof com.luck.picture.lib.basic.PictureCommonFragment) {
                ((com.luck.picture.lib.basic.PictureCommonFragment) fragment).onSelectedChange(z, localMedia);
            }
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void sendFixedSelectedChangeEvent(com.luck.picture.lib.entity.LocalMedia localMedia) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        java.util.List fragments = getActivity().getSupportFragmentManager().getFragments();
        for (int i = 0; i < fragments.size(); i++) {
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) fragments.get(i);
            if (fragment instanceof com.luck.picture.lib.basic.PictureCommonFragment) {
                ((com.luck.picture.lib.basic.PictureCommonFragment) fragment).onFixedSelectedChange(localMedia);
            }
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void sendSelectedOriginalChangeEvent() {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        java.util.List fragments = getActivity().getSupportFragmentManager().getFragments();
        for (int i = 0; i < fragments.size(); i++) {
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) fragments.get(i);
            if (fragment instanceof com.luck.picture.lib.basic.PictureCommonFragment) {
                ((com.luck.picture.lib.basic.PictureCommonFragment) fragment).onCheckOriginalChange();
            }
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void openSelectedCamera() {
        int i = this.selectorConfig.chooseMode;
        if (i == 0) {
            if (this.selectorConfig.ofAllCameraType == com.luck.picture.lib.config.SelectMimeType.ofImage()) {
                openImageCamera();
                return;
            } else if (this.selectorConfig.ofAllCameraType == com.luck.picture.lib.config.SelectMimeType.ofVideo()) {
                openVideoCamera();
                return;
            } else {
                onSelectedOnlyCamera();
                return;
            }
        }
        if (i == 1) {
            openImageCamera();
        } else if (i == 2) {
            openVideoCamera();
        } else {
            if (i != 3) {
                return;
            }
            openSoundRecording();
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onSelectedOnlyCamera() {
        com.luck.picture.lib.dialog.PhotoItemSelectedDialog newInstance = com.luck.picture.lib.dialog.PhotoItemSelectedDialog.newInstance();
        newInstance.setOnItemClickListener(new com.luck.picture.lib.interfaces.OnItemClickListener() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.3
            @Override // com.luck.picture.lib.interfaces.OnItemClickListener
            public void onItemClick(android.view.View view, int i) {
                if (i == 0) {
                    if (com.luck.picture.lib.basic.PictureCommonFragment.this.selectorConfig.onCameraInterceptListener != null) {
                        com.luck.picture.lib.basic.PictureCommonFragment.this.onInterceptCameraEvent(1);
                        return;
                    } else {
                        com.luck.picture.lib.basic.PictureCommonFragment.this.openImageCamera();
                        return;
                    }
                }
                if (i != 1) {
                    return;
                }
                if (com.luck.picture.lib.basic.PictureCommonFragment.this.selectorConfig.onCameraInterceptListener != null) {
                    com.luck.picture.lib.basic.PictureCommonFragment.this.onInterceptCameraEvent(2);
                } else {
                    com.luck.picture.lib.basic.PictureCommonFragment.this.openVideoCamera();
                }
            }
        });
        newInstance.setOnDismissListener(new com.luck.picture.lib.dialog.PhotoItemSelectedDialog.OnDismissListener() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.4
            @Override // com.luck.picture.lib.dialog.PhotoItemSelectedDialog.OnDismissListener
            public void onDismiss(boolean z, android.content.DialogInterface dialogInterface) {
                if (com.luck.picture.lib.basic.PictureCommonFragment.this.selectorConfig.isOnlyCamera && z) {
                    com.luck.picture.lib.basic.PictureCommonFragment.this.onKeyBackFragmentFinish();
                }
            }
        });
        newInstance.show(getChildFragmentManager(), "PhotoItemSelectedDialog");
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void openImageCamera() {
        onPermissionExplainEvent(true, com.luck.picture.lib.permissions.PermissionConfig.CAMERA);
        if (this.selectorConfig.onPermissionsEventListener != null) {
            onApplyPermissionsEvent(com.luck.picture.lib.config.PermissionEvent.EVENT_IMAGE_CAMERA, com.luck.picture.lib.permissions.PermissionConfig.CAMERA);
        } else {
            com.luck.picture.lib.permissions.PermissionChecker.getInstance().requestPermissions(this, com.luck.picture.lib.permissions.PermissionConfig.CAMERA, new com.luck.picture.lib.permissions.PermissionResultCallback() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.5
                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onGranted() {
                    com.luck.picture.lib.basic.PictureCommonFragment.this.startCameraImageCapture();
                }

                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onDenied() {
                    com.luck.picture.lib.basic.PictureCommonFragment.this.handlePermissionDenied(com.luck.picture.lib.permissions.PermissionConfig.CAMERA);
                }
            });
        }
    }

    protected void startCameraImageCapture() {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        onPermissionExplainEvent(false, null);
        if (this.selectorConfig.onCameraInterceptListener != null) {
            onInterceptCameraEvent(1);
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            com.luck.picture.lib.service.ForegroundService.startForegroundService(getAppContext(), this.selectorConfig.isCameraForegroundService);
            android.net.Uri createCameraOutImageUri = com.luck.picture.lib.utils.MediaStoreUtils.createCameraOutImageUri(getAppContext(), this.selectorConfig);
            if (createCameraOutImageUri != null) {
                if (this.selectorConfig.isCameraAroundState) {
                    intent.putExtra(com.luck.picture.lib.config.PictureConfig.CAMERA_FACING, 1);
                }
                intent.putExtra("output", createCameraOutImageUri);
                startActivityForResult(intent, com.luck.picture.lib.config.PictureConfig.REQUEST_CAMERA);
            }
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void openVideoCamera() {
        onPermissionExplainEvent(true, com.luck.picture.lib.permissions.PermissionConfig.CAMERA);
        if (this.selectorConfig.onPermissionsEventListener != null) {
            onApplyPermissionsEvent(com.luck.picture.lib.config.PermissionEvent.EVENT_VIDEO_CAMERA, com.luck.picture.lib.permissions.PermissionConfig.CAMERA);
        } else {
            com.luck.picture.lib.permissions.PermissionChecker.getInstance().requestPermissions(this, com.luck.picture.lib.permissions.PermissionConfig.CAMERA, new com.luck.picture.lib.permissions.PermissionResultCallback() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.6
                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onGranted() {
                    com.luck.picture.lib.basic.PictureCommonFragment.this.startCameraVideoCapture();
                }

                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onDenied() {
                    com.luck.picture.lib.basic.PictureCommonFragment.this.handlePermissionDenied(com.luck.picture.lib.permissions.PermissionConfig.CAMERA);
                }
            });
        }
    }

    protected void startCameraVideoCapture() {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        onPermissionExplainEvent(false, null);
        if (this.selectorConfig.onCameraInterceptListener != null) {
            onInterceptCameraEvent(2);
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.media.action.VIDEO_CAPTURE");
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            com.luck.picture.lib.service.ForegroundService.startForegroundService(getAppContext(), this.selectorConfig.isCameraForegroundService);
            android.net.Uri createCameraOutVideoUri = com.luck.picture.lib.utils.MediaStoreUtils.createCameraOutVideoUri(getAppContext(), this.selectorConfig);
            if (createCameraOutVideoUri != null) {
                intent.putExtra("output", createCameraOutVideoUri);
                if (this.selectorConfig.isCameraAroundState) {
                    intent.putExtra(com.luck.picture.lib.config.PictureConfig.CAMERA_FACING, 1);
                }
                intent.putExtra(com.luck.picture.lib.config.PictureConfig.EXTRA_QUICK_CAPTURE, this.selectorConfig.isQuickCapture);
                intent.putExtra("android.intent.extra.durationLimit", this.selectorConfig.recordVideoMaxSecond);
                intent.putExtra("android.intent.extra.videoQuality", this.selectorConfig.videoQuality);
                startActivityForResult(intent, com.luck.picture.lib.config.PictureConfig.REQUEST_CAMERA);
            }
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void openSoundRecording() {
        if (this.selectorConfig.onRecordAudioListener != null) {
            com.luck.picture.lib.service.ForegroundService.startForegroundService(getAppContext(), this.selectorConfig.isCameraForegroundService);
            this.selectorConfig.onRecordAudioListener.onRecordAudio(this, com.luck.picture.lib.config.PictureConfig.REQUEST_CAMERA);
        } else {
            throw new java.lang.NullPointerException("OnRecordAudioInterceptListener interface needs to be implemented for recording");
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onInterceptCameraEvent(int i) {
        com.luck.picture.lib.service.ForegroundService.startForegroundService(getAppContext(), this.selectorConfig.isCameraForegroundService);
        this.selectorConfig.onCameraInterceptListener.openCamera(this, i, com.luck.picture.lib.config.PictureConfig.REQUEST_CAMERA);
    }

    public void onApplyPermissionsEvent(final int i, java.lang.String[] strArr) {
        this.selectorConfig.onPermissionsEventListener.requestPermission(this, strArr, new com.luck.picture.lib.interfaces.OnRequestPermissionListener() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.7
            @Override // com.luck.picture.lib.interfaces.OnRequestPermissionListener
            public void onCall(java.lang.String[] strArr2, boolean z) {
                if (z) {
                    if (i == com.luck.picture.lib.config.PermissionEvent.EVENT_VIDEO_CAMERA) {
                        com.luck.picture.lib.basic.PictureCommonFragment.this.startCameraVideoCapture();
                        return;
                    } else {
                        com.luck.picture.lib.basic.PictureCommonFragment.this.startCameraImageCapture();
                        return;
                    }
                }
                com.luck.picture.lib.basic.PictureCommonFragment.this.handlePermissionDenied(strArr2);
            }
        });
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onPermissionExplainEvent(boolean z, java.lang.String[] strArr) {
        if (this.selectorConfig.onPermissionDescriptionListener != null) {
            if (z) {
                if (com.luck.picture.lib.permissions.PermissionChecker.isCheckSelfPermission(getAppContext(), strArr)) {
                    com.luck.picture.lib.utils.SpUtils.putBoolean(getAppContext(), strArr[0], false);
                    return;
                } else {
                    if (com.luck.picture.lib.utils.SpUtils.getBoolean(getAppContext(), strArr[0], false)) {
                        return;
                    }
                    this.selectorConfig.onPermissionDescriptionListener.onPermissionDescription(this, strArr);
                    return;
                }
            }
            this.selectorConfig.onPermissionDescriptionListener.onDismiss(this);
        }
    }

    private void playClickEffect() {
        if (this.soundPool == null || !this.selectorConfig.isOpenClickSound) {
            return;
        }
        this.soundPool.play(this.soundID, 0.1f, 0.5f, 0, 1, 1.0f);
    }

    private void releaseSoundPool() {
        try {
            android.media.SoundPool soundPool = this.soundPool;
            if (soundPool != null) {
                soundPool.release();
                this.soundPool = null;
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        com.luck.picture.lib.service.ForegroundService.stopService(getAppContext());
        if (i2 != -1) {
            if (i2 == 96) {
                java.lang.Throwable error = intent != null ? com.luck.picture.lib.config.Crop.getError(intent) : new java.lang.Throwable("image crop error");
                if (error != null) {
                    com.luck.picture.lib.utils.ToastUtils.showToast(getAppContext(), error.getMessage());
                    return;
                }
                return;
            }
            if (i2 == 0) {
                if (i != 909) {
                    if (i == 1102) {
                        handlePermissionSettingResult(com.luck.picture.lib.permissions.PermissionConfig.CURRENT_REQUEST_PERMISSION);
                        return;
                    }
                    return;
                } else {
                    if (android.text.TextUtils.isEmpty(this.selectorConfig.cameraPath)) {
                        return;
                    }
                    com.luck.picture.lib.utils.MediaUtils.deleteUri(getAppContext(), this.selectorConfig.cameraPath);
                    this.selectorConfig.cameraPath = "";
                    return;
                }
            }
            return;
        }
        if (i == 909) {
            dispatchHandleCamera(intent);
            return;
        }
        if (i == 696) {
            onEditMedia(intent);
            return;
        }
        if (i == 69) {
            java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> selectedResult = this.selectorConfig.getSelectedResult();
            try {
                if (selectedResult.size() == 1) {
                    com.luck.picture.lib.entity.LocalMedia localMedia = selectedResult.get(0);
                    android.net.Uri output = com.luck.picture.lib.config.Crop.getOutput(intent);
                    localMedia.setCutPath(output != null ? output.getPath() : "");
                    localMedia.setCut(android.text.TextUtils.isEmpty(localMedia.getCutPath()) ? false : true);
                    localMedia.setCropImageWidth(com.luck.picture.lib.config.Crop.getOutputImageWidth(intent));
                    localMedia.setCropImageHeight(com.luck.picture.lib.config.Crop.getOutputImageHeight(intent));
                    localMedia.setCropOffsetX(com.luck.picture.lib.config.Crop.getOutputImageOffsetX(intent));
                    localMedia.setCropOffsetY(com.luck.picture.lib.config.Crop.getOutputImageOffsetY(intent));
                    localMedia.setCropResultAspectRatio(com.luck.picture.lib.config.Crop.getOutputCropAspectRatio(intent));
                    localMedia.setCustomData(com.luck.picture.lib.config.Crop.getOutputCustomExtraData(intent));
                    localMedia.setSandboxPath(localMedia.getCutPath());
                } else {
                    java.lang.String stringExtra = intent.getStringExtra("output");
                    if (android.text.TextUtils.isEmpty(stringExtra)) {
                        stringExtra = intent.getStringExtra(com.luck.picture.lib.config.CustomIntentKey.EXTRA_OUTPUT_URI);
                    }
                    org.json.JSONArray jSONArray = new org.json.JSONArray(stringExtra);
                    if (jSONArray.length() == selectedResult.size()) {
                        for (int i3 = 0; i3 < selectedResult.size(); i3++) {
                            com.luck.picture.lib.entity.LocalMedia localMedia2 = selectedResult.get(i3);
                            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i3);
                            localMedia2.setCutPath(optJSONObject.optString(com.luck.picture.lib.config.CustomIntentKey.EXTRA_OUT_PUT_PATH));
                            localMedia2.setCut(!android.text.TextUtils.isEmpty(localMedia2.getCutPath()));
                            localMedia2.setCropImageWidth(optJSONObject.optInt(com.luck.picture.lib.config.CustomIntentKey.EXTRA_IMAGE_WIDTH));
                            localMedia2.setCropImageHeight(optJSONObject.optInt(com.luck.picture.lib.config.CustomIntentKey.EXTRA_IMAGE_HEIGHT));
                            localMedia2.setCropOffsetX(optJSONObject.optInt(com.luck.picture.lib.config.CustomIntentKey.EXTRA_OFFSET_X));
                            localMedia2.setCropOffsetY(optJSONObject.optInt(com.luck.picture.lib.config.CustomIntentKey.EXTRA_OFFSET_Y));
                            localMedia2.setCropResultAspectRatio((float) optJSONObject.optDouble(com.luck.picture.lib.config.CustomIntentKey.EXTRA_ASPECT_RATIO));
                            localMedia2.setCustomData(optJSONObject.optString(com.luck.picture.lib.config.CustomIntentKey.EXTRA_CUSTOM_EXTRA_DATA));
                            localMedia2.setSandboxPath(localMedia2.getCutPath());
                        }
                    }
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                com.luck.picture.lib.utils.ToastUtils.showToast(getAppContext(), e.getMessage());
            }
            java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList = new java.util.ArrayList<>(selectedResult);
            if (checkCompressValidity()) {
                onCompress(arrayList);
            } else if (checkOldCompressValidity()) {
                onOldCompress(arrayList);
            } else {
                onResultEvent(arrayList);
            }
        }
    }

    private void dispatchHandleCamera(final android.content.Intent intent) {
        com.luck.picture.lib.thread.PictureThreadUtils.executeByIo(new com.luck.picture.lib.thread.PictureThreadUtils.SimpleTask<com.luck.picture.lib.entity.LocalMedia>() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.8
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public com.luck.picture.lib.entity.LocalMedia doInBackground() {
                java.lang.String outputPath = com.luck.picture.lib.basic.PictureCommonFragment.this.getOutputPath(intent);
                if (!android.text.TextUtils.isEmpty(outputPath)) {
                    com.luck.picture.lib.basic.PictureCommonFragment.this.selectorConfig.cameraPath = outputPath;
                }
                if (android.text.TextUtils.isEmpty(com.luck.picture.lib.basic.PictureCommonFragment.this.selectorConfig.cameraPath)) {
                    return null;
                }
                if (com.luck.picture.lib.basic.PictureCommonFragment.this.selectorConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
                    com.luck.picture.lib.basic.PictureCommonFragment.this.copyOutputAudioToDir();
                }
                com.luck.picture.lib.basic.PictureCommonFragment pictureCommonFragment = com.luck.picture.lib.basic.PictureCommonFragment.this;
                com.luck.picture.lib.entity.LocalMedia buildLocalMedia = pictureCommonFragment.buildLocalMedia(pictureCommonFragment.selectorConfig.cameraPath);
                buildLocalMedia.setCameraSource(true);
                return buildLocalMedia;
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(com.luck.picture.lib.entity.LocalMedia localMedia) {
                com.luck.picture.lib.thread.PictureThreadUtils.cancel(this);
                if (localMedia != null) {
                    com.luck.picture.lib.basic.PictureCommonFragment.this.onScannerScanFile(localMedia);
                    com.luck.picture.lib.basic.PictureCommonFragment.this.dispatchCameraMediaResult(localMedia);
                }
                com.luck.picture.lib.basic.PictureCommonFragment.this.selectorConfig.cameraPath = "";
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void copyOutputAudioToDir() {
        java.lang.String str;
        try {
            if (android.text.TextUtils.isEmpty(this.selectorConfig.outPutAudioDir)) {
                return;
            }
            java.io.InputStream openInputStream = com.luck.picture.lib.config.PictureMimeType.isContent(this.selectorConfig.cameraPath) ? com.luck.picture.lib.basic.PictureContentResolver.openInputStream(getAppContext(), android.net.Uri.parse(this.selectorConfig.cameraPath)) : new java.io.FileInputStream(this.selectorConfig.cameraPath);
            if (android.text.TextUtils.isEmpty(this.selectorConfig.outPutAudioFileName)) {
                str = "";
            } else if (this.selectorConfig.isOnlyCamera) {
                str = this.selectorConfig.outPutAudioFileName;
            } else {
                str = java.lang.System.currentTimeMillis() + "_" + this.selectorConfig.outPutAudioFileName;
            }
            java.io.File createCameraFile = com.luck.picture.lib.utils.PictureFileUtils.createCameraFile(getAppContext(), this.selectorConfig.chooseMode, str, "", this.selectorConfig.outPutAudioDir);
            if (com.luck.picture.lib.utils.PictureFileUtils.writeFileFromIS(openInputStream, new java.io.FileOutputStream(createCameraFile.getAbsolutePath()))) {
                com.luck.picture.lib.utils.MediaUtils.deleteUri(getAppContext(), this.selectorConfig.cameraPath);
                this.selectorConfig.cameraPath = createCameraFile.getAbsolutePath();
            }
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected java.lang.String getOutputPath(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        android.net.Uri uri = (android.net.Uri) intent.getParcelableExtra("output");
        java.lang.String str = this.selectorConfig.cameraPath;
        boolean z = android.text.TextUtils.isEmpty(str) || com.luck.picture.lib.config.PictureMimeType.isContent(str) || new java.io.File(str).exists();
        if ((this.selectorConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofAudio() || !z) && uri == null) {
            uri = intent.getData();
        }
        if (uri == null) {
            return null;
        }
        return com.luck.picture.lib.config.PictureMimeType.isContent(uri.toString()) ? uri.toString() : uri.getPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onScannerScanFile(com.luck.picture.lib.entity.LocalMedia localMedia) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        if (com.luck.picture.lib.utils.SdkVersionUtils.isQ()) {
            if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(localMedia.getMimeType()) && com.luck.picture.lib.config.PictureMimeType.isContent(localMedia.getPath())) {
                new com.luck.picture.lib.basic.PictureMediaScannerConnection(getActivity(), localMedia.getRealPath());
                return;
            }
            return;
        }
        java.lang.String realPath = com.luck.picture.lib.config.PictureMimeType.isContent(localMedia.getPath()) ? localMedia.getRealPath() : localMedia.getPath();
        new com.luck.picture.lib.basic.PictureMediaScannerConnection(getActivity(), realPath);
        if (com.luck.picture.lib.config.PictureMimeType.isHasImage(localMedia.getMimeType())) {
            int dCIMLastImageId = com.luck.picture.lib.utils.MediaUtils.getDCIMLastImageId(getAppContext(), new java.io.File(realPath).getParent());
            if (dCIMLastImageId != -1) {
                com.luck.picture.lib.utils.MediaUtils.removeMedia(getAppContext(), dCIMLastImageId);
            }
        }
    }

    protected com.luck.picture.lib.entity.LocalMedia buildLocalMedia(java.lang.String str) {
        com.luck.picture.lib.entity.LocalMedia generateLocalMedia = com.luck.picture.lib.entity.LocalMedia.generateLocalMedia(getAppContext(), str);
        generateLocalMedia.setChooseModel(this.selectorConfig.chooseMode);
        if (com.luck.picture.lib.utils.SdkVersionUtils.isQ() && !com.luck.picture.lib.config.PictureMimeType.isContent(str)) {
            generateLocalMedia.setSandboxPath(str);
        } else {
            generateLocalMedia.setSandboxPath(null);
        }
        if (this.selectorConfig.isCameraRotateImage && com.luck.picture.lib.config.PictureMimeType.isHasImage(generateLocalMedia.getMimeType())) {
            com.luck.picture.lib.utils.BitmapUtils.rotateImage(getAppContext(), str);
        }
        return generateLocalMedia;
    }

    private boolean checkCompleteSelectLimit() {
        if (this.selectorConfig.selectionMode == 2 && !this.selectorConfig.isOnlyCamera) {
            if (this.selectorConfig.isWithVideoImage) {
                java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> selectedResult = this.selectorConfig.getSelectedResult();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < selectedResult.size(); i3++) {
                    if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(selectedResult.get(i3).getMimeType())) {
                        i2++;
                    } else {
                        i++;
                    }
                }
                if (this.selectorConfig.minSelectNum > 0 && i < this.selectorConfig.minSelectNum) {
                    if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), null, this.selectorConfig, 5)) {
                        return true;
                    }
                    showTipsDialog(getString(com.luck.picture.lib.R.string.ps_min_img_num, new java.lang.Object[]{java.lang.String.valueOf(this.selectorConfig.minSelectNum)}));
                    return true;
                }
                if (this.selectorConfig.minVideoSelectNum > 0 && i2 < this.selectorConfig.minVideoSelectNum) {
                    if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), null, this.selectorConfig, 7)) {
                        return true;
                    }
                    showTipsDialog(getString(com.luck.picture.lib.R.string.ps_min_video_num, new java.lang.Object[]{java.lang.String.valueOf(this.selectorConfig.minVideoSelectNum)}));
                    return true;
                }
            } else {
                java.lang.String resultFirstMimeType = this.selectorConfig.getResultFirstMimeType();
                if (com.luck.picture.lib.config.PictureMimeType.isHasImage(resultFirstMimeType) && this.selectorConfig.minSelectNum > 0 && this.selectorConfig.getSelectCount() < this.selectorConfig.minSelectNum) {
                    if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), null, this.selectorConfig, 5)) {
                        return true;
                    }
                    showTipsDialog(getString(com.luck.picture.lib.R.string.ps_min_img_num, new java.lang.Object[]{java.lang.String.valueOf(this.selectorConfig.minSelectNum)}));
                    return true;
                }
                if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(resultFirstMimeType) && this.selectorConfig.minVideoSelectNum > 0 && this.selectorConfig.getSelectCount() < this.selectorConfig.minVideoSelectNum) {
                    if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), null, this.selectorConfig, 7)) {
                        return true;
                    }
                    showTipsDialog(getString(com.luck.picture.lib.R.string.ps_min_video_num, new java.lang.Object[]{java.lang.String.valueOf(this.selectorConfig.minVideoSelectNum)}));
                    return true;
                }
                if (com.luck.picture.lib.config.PictureMimeType.isHasAudio(resultFirstMimeType) && this.selectorConfig.minAudioSelectNum > 0 && this.selectorConfig.getSelectCount() < this.selectorConfig.minAudioSelectNum) {
                    if (this.selectorConfig.onSelectLimitTipsListener != null && this.selectorConfig.onSelectLimitTipsListener.onSelectLimitTips(getAppContext(), null, this.selectorConfig, 12)) {
                        return true;
                    }
                    showTipsDialog(getString(com.luck.picture.lib.R.string.ps_min_audio_num, new java.lang.Object[]{java.lang.String.valueOf(this.selectorConfig.minAudioSelectNum)}));
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void dispatchTransformResult() {
        if (!checkCompleteSelectLimit() && isAdded()) {
            java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList = new java.util.ArrayList<>(this.selectorConfig.getSelectedResult());
            if (checkCropValidity()) {
                onCrop(arrayList);
                return;
            }
            if (checkOldCropValidity()) {
                onOldCrop(arrayList);
                return;
            }
            if (checkCompressValidity()) {
                onCompress(arrayList);
            } else if (checkOldCompressValidity()) {
                onOldCompress(arrayList);
            } else {
                onResultEvent(arrayList);
            }
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onCrop(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        android.net.Uri parse;
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
        android.net.Uri uri = null;
        android.net.Uri uri2 = null;
        for (int i = 0; i < arrayList.size(); i++) {
            com.luck.picture.lib.entity.LocalMedia localMedia = arrayList.get(i);
            arrayList2.add(localMedia.getAvailablePath());
            if (uri == null && com.luck.picture.lib.config.PictureMimeType.isHasImage(localMedia.getMimeType())) {
                java.lang.String availablePath = localMedia.getAvailablePath();
                if (com.luck.picture.lib.config.PictureMimeType.isContent(availablePath) || com.luck.picture.lib.config.PictureMimeType.isHasHttp(availablePath)) {
                    parse = android.net.Uri.parse(availablePath);
                } else {
                    parse = android.net.Uri.fromFile(new java.io.File(availablePath));
                }
                uri = parse;
                uri2 = android.net.Uri.fromFile(new java.io.File(new java.io.File(com.luck.picture.lib.utils.FileDirMap.getFileDirPath(getAppContext(), 1)).getAbsolutePath(), com.luck.picture.lib.utils.DateUtils.getCreateFileName("CROP_") + com.luck.picture.lib.config.PictureMimeType.JPG));
            }
        }
        this.selectorConfig.cropFileEngine.onStartCrop(this, uri, uri2, arrayList2, 69);
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onOldCrop(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        com.luck.picture.lib.entity.LocalMedia localMedia;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                localMedia = null;
                break;
            }
            localMedia = arrayList.get(i);
            if (com.luck.picture.lib.config.PictureMimeType.isHasImage(arrayList.get(i).getMimeType())) {
                break;
            } else {
                i++;
            }
        }
        this.selectorConfig.cropEngine.onStartCrop(this, localMedia, arrayList, 69);
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onCompress(final java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        showLoading();
        final java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        java.util.ArrayList<android.net.Uri> arrayList2 = new java.util.ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            com.luck.picture.lib.entity.LocalMedia localMedia = arrayList.get(i);
            java.lang.String availablePath = localMedia.getAvailablePath();
            if (!com.luck.picture.lib.config.PictureMimeType.isHasHttp(availablePath) && ((!this.selectorConfig.isCheckOriginalImage || !this.selectorConfig.isOriginalSkipCompress) && com.luck.picture.lib.config.PictureMimeType.isHasImage(localMedia.getMimeType()))) {
                arrayList2.add(com.luck.picture.lib.config.PictureMimeType.isContent(availablePath) ? android.net.Uri.parse(availablePath) : android.net.Uri.fromFile(new java.io.File(availablePath)));
                concurrentHashMap.put(availablePath, localMedia);
            }
        }
        if (concurrentHashMap.size() == 0) {
            onResultEvent(arrayList);
        } else {
            this.selectorConfig.compressFileEngine.onStartCompress(getAppContext(), arrayList2, new com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.9
                @Override // com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener
                public void onCallback(java.lang.String str, java.lang.String str2) {
                    if (android.text.TextUtils.isEmpty(str)) {
                        com.luck.picture.lib.basic.PictureCommonFragment.this.onResultEvent(arrayList);
                        return;
                    }
                    com.luck.picture.lib.entity.LocalMedia localMedia2 = (com.luck.picture.lib.entity.LocalMedia) concurrentHashMap.get(str);
                    if (localMedia2 != null) {
                        if (com.luck.picture.lib.utils.SdkVersionUtils.isQ()) {
                            if (!android.text.TextUtils.isEmpty(str2) && (str2.contains("Android/data/") || str2.contains("data/user/"))) {
                                localMedia2.setCompressPath(str2);
                                localMedia2.setCompressed(!android.text.TextUtils.isEmpty(str2));
                                localMedia2.setSandboxPath(localMedia2.getCompressPath());
                            }
                        } else {
                            localMedia2.setCompressPath(str2);
                            localMedia2.setCompressed(!android.text.TextUtils.isEmpty(str2));
                        }
                        concurrentHashMap.remove(str);
                    }
                    if (concurrentHashMap.size() == 0) {
                        com.luck.picture.lib.basic.PictureCommonFragment.this.onResultEvent(arrayList);
                    }
                }
            });
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onOldCompress(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        showLoading();
        if (this.selectorConfig.isCheckOriginalImage && this.selectorConfig.isOriginalSkipCompress) {
            onResultEvent(arrayList);
        } else {
            this.selectorConfig.compressEngine.onStartCompress(getAppContext(), arrayList, new com.luck.picture.lib.interfaces.OnCallbackListener<java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia>>() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.10
                @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                public void onCall(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList2) {
                    com.luck.picture.lib.basic.PictureCommonFragment.this.onResultEvent(arrayList2);
                }
            });
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkCropValidity() {
        if (this.selectorConfig.cropFileEngine == null) {
            return false;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.List<java.lang.String> list = this.selectorConfig.skipCropList;
        if (list != null && list.size() > 0) {
            hashSet.addAll(list);
        }
        if (this.selectorConfig.getSelectCount() == 1) {
            java.lang.String resultFirstMimeType = this.selectorConfig.getResultFirstMimeType();
            boolean isHasImage = com.luck.picture.lib.config.PictureMimeType.isHasImage(resultFirstMimeType);
            if (isHasImage && hashSet.contains(resultFirstMimeType)) {
                return false;
            }
            return isHasImage;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.selectorConfig.getSelectCount(); i2++) {
            com.luck.picture.lib.entity.LocalMedia localMedia = this.selectorConfig.getSelectedResult().get(i2);
            if (com.luck.picture.lib.config.PictureMimeType.isHasImage(localMedia.getMimeType()) && hashSet.contains(localMedia.getMimeType())) {
                i++;
            }
        }
        return i != this.selectorConfig.getSelectCount();
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkOldCropValidity() {
        if (this.selectorConfig.cropEngine == null) {
            return false;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.List<java.lang.String> list = this.selectorConfig.skipCropList;
        if (list != null && list.size() > 0) {
            hashSet.addAll(list);
        }
        if (this.selectorConfig.getSelectCount() == 1) {
            java.lang.String resultFirstMimeType = this.selectorConfig.getResultFirstMimeType();
            boolean isHasImage = com.luck.picture.lib.config.PictureMimeType.isHasImage(resultFirstMimeType);
            if (isHasImage && hashSet.contains(resultFirstMimeType)) {
                return false;
            }
            return isHasImage;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.selectorConfig.getSelectCount(); i2++) {
            com.luck.picture.lib.entity.LocalMedia localMedia = this.selectorConfig.getSelectedResult().get(i2);
            if (com.luck.picture.lib.config.PictureMimeType.isHasImage(localMedia.getMimeType()) && hashSet.contains(localMedia.getMimeType())) {
                i++;
            }
        }
        return i != this.selectorConfig.getSelectCount();
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkCompressValidity() {
        if (this.selectorConfig.compressFileEngine != null) {
            for (int i = 0; i < this.selectorConfig.getSelectCount(); i++) {
                if (com.luck.picture.lib.config.PictureMimeType.isHasImage(this.selectorConfig.getSelectedResult().get(i).getMimeType())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkOldCompressValidity() {
        if (this.selectorConfig.compressEngine != null) {
            for (int i = 0; i < this.selectorConfig.getSelectCount(); i++) {
                if (com.luck.picture.lib.config.PictureMimeType.isHasImage(this.selectorConfig.getSelectedResult().get(i).getMimeType())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkTransformSandboxFile() {
        return com.luck.picture.lib.utils.SdkVersionUtils.isQ() && this.selectorConfig.uriToFileTransformEngine != null;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkOldTransformSandboxFile() {
        return com.luck.picture.lib.utils.SdkVersionUtils.isQ() && this.selectorConfig.sandboxFileEngine != null;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkAddBitmapWatermark() {
        return this.selectorConfig.onBitmapWatermarkListener != null;
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public boolean checkVideoThumbnail() {
        return this.selectorConfig.onVideoThumbnailEventListener != null;
    }

    private void videoThumbnail(final java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        final java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        for (int i = 0; i < arrayList.size(); i++) {
            com.luck.picture.lib.entity.LocalMedia localMedia = arrayList.get(i);
            java.lang.String availablePath = localMedia.getAvailablePath();
            if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(localMedia.getMimeType()) || com.luck.picture.lib.config.PictureMimeType.isUrlHasVideo(availablePath)) {
                concurrentHashMap.put(availablePath, localMedia);
            }
        }
        if (concurrentHashMap.size() == 0) {
            onCallBackResult(arrayList);
            return;
        }
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            this.selectorConfig.onVideoThumbnailEventListener.onVideoThumbnail(getAppContext(), (java.lang.String) ((java.util.Map.Entry) it.next()).getKey(), new com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.11
                @Override // com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener
                public void onCallback(java.lang.String str, java.lang.String str2) {
                    com.luck.picture.lib.entity.LocalMedia localMedia2 = (com.luck.picture.lib.entity.LocalMedia) concurrentHashMap.get(str);
                    if (localMedia2 != null) {
                        localMedia2.setVideoThumbnailPath(str2);
                        concurrentHashMap.remove(str);
                    }
                    if (concurrentHashMap.size() == 0) {
                        com.luck.picture.lib.basic.PictureCommonFragment.this.onCallBackResult(arrayList);
                    }
                }
            });
        }
    }

    private void addBitmapWatermark(final java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        final java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        for (int i = 0; i < arrayList.size(); i++) {
            com.luck.picture.lib.entity.LocalMedia localMedia = arrayList.get(i);
            if (!com.luck.picture.lib.config.PictureMimeType.isHasAudio(localMedia.getMimeType())) {
                concurrentHashMap.put(localMedia.getAvailablePath(), localMedia);
            }
        }
        if (concurrentHashMap.size() == 0) {
            dispatchWatermarkResult(arrayList);
            return;
        }
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            this.selectorConfig.onBitmapWatermarkListener.onAddBitmapWatermark(getAppContext(), (java.lang.String) entry.getKey(), ((com.luck.picture.lib.entity.LocalMedia) entry.getValue()).getMimeType(), new com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.12
                @Override // com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener
                public void onCallback(java.lang.String str, java.lang.String str2) {
                    if (android.text.TextUtils.isEmpty(str)) {
                        com.luck.picture.lib.basic.PictureCommonFragment.this.dispatchWatermarkResult(arrayList);
                        return;
                    }
                    com.luck.picture.lib.entity.LocalMedia localMedia2 = (com.luck.picture.lib.entity.LocalMedia) concurrentHashMap.get(str);
                    if (localMedia2 != null) {
                        localMedia2.setWatermarkPath(str2);
                        concurrentHashMap.remove(str);
                    }
                    if (concurrentHashMap.size() == 0) {
                        com.luck.picture.lib.basic.PictureCommonFragment.this.dispatchWatermarkResult(arrayList);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchUriToFileTransformResult(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        showLoading();
        if (checkAddBitmapWatermark()) {
            addBitmapWatermark(arrayList);
        } else if (checkVideoThumbnail()) {
            videoThumbnail(arrayList);
        } else {
            onCallBackResult(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchWatermarkResult(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        if (checkVideoThumbnail()) {
            videoThumbnail(arrayList);
        } else {
            onCallBackResult(arrayList);
        }
    }

    private void uriToFileTransform29(final java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        showLoading();
        final java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        for (int i = 0; i < arrayList.size(); i++) {
            com.luck.picture.lib.entity.LocalMedia localMedia = arrayList.get(i);
            concurrentHashMap.put(localMedia.getPath(), localMedia);
        }
        if (concurrentHashMap.size() == 0) {
            dispatchUriToFileTransformResult(arrayList);
        } else {
            com.luck.picture.lib.thread.PictureThreadUtils.executeByIo(new com.luck.picture.lib.thread.PictureThreadUtils.SimpleTask<java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia>>() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.13
                @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
                public java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> doInBackground() {
                    java.util.Iterator it = concurrentHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        com.luck.picture.lib.entity.LocalMedia localMedia2 = (com.luck.picture.lib.entity.LocalMedia) ((java.util.Map.Entry) it.next()).getValue();
                        if (com.luck.picture.lib.basic.PictureCommonFragment.this.selectorConfig.isCheckOriginalImage || android.text.TextUtils.isEmpty(localMedia2.getSandboxPath())) {
                            com.luck.picture.lib.basic.PictureCommonFragment.this.selectorConfig.uriToFileTransformEngine.onUriToFileAsyncTransform(com.luck.picture.lib.basic.PictureCommonFragment.this.getAppContext(), localMedia2.getPath(), localMedia2.getMimeType(), new com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.13.1
                                @Override // com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener
                                public void onCallback(java.lang.String str, java.lang.String str2) {
                                    com.luck.picture.lib.entity.LocalMedia localMedia3;
                                    if (android.text.TextUtils.isEmpty(str) || (localMedia3 = (com.luck.picture.lib.entity.LocalMedia) concurrentHashMap.get(str)) == null) {
                                        return;
                                    }
                                    if (android.text.TextUtils.isEmpty(localMedia3.getSandboxPath())) {
                                        localMedia3.setSandboxPath(str2);
                                    }
                                    if (com.luck.picture.lib.basic.PictureCommonFragment.this.selectorConfig.isCheckOriginalImage) {
                                        localMedia3.setOriginalPath(str2);
                                        localMedia3.setOriginal(!android.text.TextUtils.isEmpty(str2));
                                    }
                                    concurrentHashMap.remove(str);
                                }
                            });
                        }
                    }
                    return arrayList;
                }

                @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
                public void onSuccess(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList2) {
                    com.luck.picture.lib.thread.PictureThreadUtils.cancel(this);
                    com.luck.picture.lib.basic.PictureCommonFragment.this.dispatchUriToFileTransformResult(arrayList2);
                }
            });
        }
    }

    @java.lang.Deprecated
    private void copyExternalPathToAppInDirFor29(final java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        showLoading();
        com.luck.picture.lib.thread.PictureThreadUtils.executeByIo(new com.luck.picture.lib.thread.PictureThreadUtils.SimpleTask<java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia>>() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.14
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> doInBackground() {
                for (int i = 0; i < arrayList.size(); i++) {
                    int i2 = i;
                    com.luck.picture.lib.basic.PictureCommonFragment.this.selectorConfig.sandboxFileEngine.onStartSandboxFileTransform(com.luck.picture.lib.basic.PictureCommonFragment.this.getAppContext(), com.luck.picture.lib.basic.PictureCommonFragment.this.selectorConfig.isCheckOriginalImage, i2, (com.luck.picture.lib.entity.LocalMedia) arrayList.get(i), new com.luck.picture.lib.interfaces.OnCallbackIndexListener<com.luck.picture.lib.entity.LocalMedia>() { // from class: com.luck.picture.lib.basic.PictureCommonFragment.14.1
                        @Override // com.luck.picture.lib.interfaces.OnCallbackIndexListener
                        public void onCall(com.luck.picture.lib.entity.LocalMedia localMedia, int i3) {
                            com.luck.picture.lib.entity.LocalMedia localMedia2 = (com.luck.picture.lib.entity.LocalMedia) arrayList.get(i3);
                            localMedia2.setSandboxPath(localMedia.getSandboxPath());
                            if (com.luck.picture.lib.basic.PictureCommonFragment.this.selectorConfig.isCheckOriginalImage) {
                                localMedia2.setOriginalPath(localMedia.getOriginalPath());
                                localMedia2.setOriginal(!android.text.TextUtils.isEmpty(localMedia.getOriginalPath()));
                            }
                        }
                    });
                }
                return arrayList;
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList2) {
                com.luck.picture.lib.thread.PictureThreadUtils.cancel(this);
                com.luck.picture.lib.basic.PictureCommonFragment.this.dispatchUriToFileTransformResult(arrayList2);
            }
        });
    }

    private void mergeOriginalImage(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        if (this.selectorConfig.isCheckOriginalImage) {
            for (int i = 0; i < arrayList.size(); i++) {
                com.luck.picture.lib.entity.LocalMedia localMedia = arrayList.get(i);
                localMedia.setOriginal(true);
                localMedia.setOriginalPath(localMedia.getPath());
            }
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onResultEvent(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        if (checkTransformSandboxFile()) {
            uriToFileTransform29(arrayList);
        } else if (checkOldTransformSandboxFile()) {
            copyExternalPathToAppInDirFor29(arrayList);
        } else {
            mergeOriginalImage(arrayList);
            dispatchUriToFileTransformResult(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCallBackResult(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        dismissLoading();
        if (this.selectorConfig.isActivityResultBack) {
            getActivity().setResult(-1, com.luck.picture.lib.basic.PictureSelector.putIntentResult(arrayList));
            onSelectFinish(-1, arrayList);
        } else if (this.selectorConfig.onResultCallListener != null) {
            this.selectorConfig.onResultCallListener.onResult(arrayList);
        }
        onExitPictureSelector();
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void initAppLanguage() {
        if (this.selectorConfig == null) {
            this.selectorConfig = com.luck.picture.lib.config.SelectorProviders.getInstance().getSelectorConfig();
        }
        com.luck.picture.lib.config.SelectorConfig selectorConfig = this.selectorConfig;
        if (selectorConfig == null || selectorConfig.language == -2) {
            return;
        }
        com.luck.picture.lib.language.PictureLanguageUtils.setAppLanguage(getActivity(), this.selectorConfig.language, this.selectorConfig.defaultLanguage);
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onRecreateEngine() {
        createImageLoaderEngine();
        createVideoPlayerEngine();
        createCompressEngine();
        createSandboxFileEngine();
        createLoaderDataEngine();
        createResultCallbackListener();
        createLayoutResourceListener();
    }

    public void onKeyBackFragmentFinish() {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        if (this.selectorConfig.isActivityResultBack) {
            getActivity().setResult(0);
            onSelectFinish(0, null);
        } else if (this.selectorConfig.onResultCallListener != null) {
            this.selectorConfig.onResultCallListener.onCancel();
        }
        onExitPictureSelector();
    }

    public void onDestroy() {
        releaseSoundPool();
        super.onDestroy();
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void showLoading() {
        try {
            if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity()) || this.mLoadingDialog.isShowing()) {
                return;
            }
            this.mLoadingDialog.show();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void dismissLoading() {
        try {
            if (!com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity()) && this.mLoadingDialog.isShowing()) {
                this.mLoadingDialog.dismiss();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttach(android.content.Context context) {
        initAppLanguage();
        onRecreateEngine();
        super.onAttach(context);
        this.context = context;
        if (getParentFragment() instanceof com.luck.picture.lib.basic.IBridgePictureBehavior) {
            this.iBridgePictureBehavior = getParentFragment();
        } else if (context instanceof com.luck.picture.lib.basic.IBridgePictureBehavior) {
            this.iBridgePictureBehavior = (com.luck.picture.lib.basic.IBridgePictureBehavior) context;
        }
    }

    protected void setRequestedOrientation() {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        getActivity().setRequestedOrientation(this.selectorConfig.requestedOrientation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onBackCurrentFragment() {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        if (!isStateSaved()) {
            if (this.selectorConfig.viewLifecycle != null) {
                this.selectorConfig.viewLifecycle.onDestroy(this);
            }
            getActivity().getSupportFragmentManager().popBackStack();
        }
        java.util.List fragments = getActivity().getSupportFragmentManager().getFragments();
        for (int i = 0; i < fragments.size(); i++) {
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) fragments.get(i);
            if (fragment instanceof com.luck.picture.lib.basic.PictureCommonFragment) {
                ((com.luck.picture.lib.basic.PictureCommonFragment) fragment).onFragmentResume();
            }
        }
    }

    protected void onSelectFinish(int i, java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        if (this.iBridgePictureBehavior != null) {
            this.iBridgePictureBehavior.onSelectFinish(getResult(i, arrayList));
        }
    }

    protected void onExitPictureSelector() {
        if (!com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            if (isNormalDefaultEnter()) {
                if (this.selectorConfig.viewLifecycle != null) {
                    this.selectorConfig.viewLifecycle.onDestroy(this);
                }
                getActivity().finish();
            } else {
                java.util.List fragments = getActivity().getSupportFragmentManager().getFragments();
                for (int i = 0; i < fragments.size(); i++) {
                    if (((androidx.fragment.app.Fragment) fragments.get(i)) instanceof com.luck.picture.lib.basic.PictureCommonFragment) {
                        onBackCurrentFragment();
                    }
                }
            }
        }
        com.luck.picture.lib.config.SelectorProviders.getInstance().destroy();
    }

    private void createImageLoaderEngine() {
        com.luck.picture.lib.engine.PictureSelectorEngine pictureSelectorEngine;
        if (this.selectorConfig.imageEngine != null || (pictureSelectorEngine = com.luck.picture.lib.app.PictureAppMaster.getInstance().getPictureSelectorEngine()) == null) {
            return;
        }
        this.selectorConfig.imageEngine = pictureSelectorEngine.createImageLoaderEngine();
    }

    private void createVideoPlayerEngine() {
        com.luck.picture.lib.engine.PictureSelectorEngine pictureSelectorEngine;
        if (this.selectorConfig.videoPlayerEngine != null || (pictureSelectorEngine = com.luck.picture.lib.app.PictureAppMaster.getInstance().getPictureSelectorEngine()) == null) {
            return;
        }
        this.selectorConfig.videoPlayerEngine = pictureSelectorEngine.createVideoPlayerEngine();
    }

    private void createLoaderDataEngine() {
        com.luck.picture.lib.engine.PictureSelectorEngine pictureSelectorEngine;
        com.luck.picture.lib.engine.PictureSelectorEngine pictureSelectorEngine2;
        if (this.selectorConfig.isLoaderDataEngine && this.selectorConfig.loaderDataEngine == null && (pictureSelectorEngine2 = com.luck.picture.lib.app.PictureAppMaster.getInstance().getPictureSelectorEngine()) != null) {
            this.selectorConfig.loaderDataEngine = pictureSelectorEngine2.createLoaderDataEngine();
        }
        if (this.selectorConfig.isLoaderFactoryEngine && this.selectorConfig.loaderFactory == null && (pictureSelectorEngine = com.luck.picture.lib.app.PictureAppMaster.getInstance().getPictureSelectorEngine()) != null) {
            this.selectorConfig.loaderFactory = pictureSelectorEngine.onCreateLoader();
        }
    }

    private void createCompressEngine() {
        com.luck.picture.lib.engine.PictureSelectorEngine pictureSelectorEngine;
        com.luck.picture.lib.engine.PictureSelectorEngine pictureSelectorEngine2;
        if (this.selectorConfig.isCompressEngine) {
            if (this.selectorConfig.compressFileEngine == null && (pictureSelectorEngine2 = com.luck.picture.lib.app.PictureAppMaster.getInstance().getPictureSelectorEngine()) != null) {
                this.selectorConfig.compressFileEngine = pictureSelectorEngine2.createCompressFileEngine();
            }
            if (this.selectorConfig.compressEngine != null || (pictureSelectorEngine = com.luck.picture.lib.app.PictureAppMaster.getInstance().getPictureSelectorEngine()) == null) {
                return;
            }
            this.selectorConfig.compressEngine = pictureSelectorEngine.createCompressEngine();
        }
    }

    private void createSandboxFileEngine() {
        com.luck.picture.lib.engine.PictureSelectorEngine pictureSelectorEngine;
        com.luck.picture.lib.engine.PictureSelectorEngine pictureSelectorEngine2;
        if (this.selectorConfig.isSandboxFileEngine) {
            if (this.selectorConfig.uriToFileTransformEngine == null && (pictureSelectorEngine2 = com.luck.picture.lib.app.PictureAppMaster.getInstance().getPictureSelectorEngine()) != null) {
                this.selectorConfig.uriToFileTransformEngine = pictureSelectorEngine2.createUriToFileTransformEngine();
            }
            if (this.selectorConfig.sandboxFileEngine != null || (pictureSelectorEngine = com.luck.picture.lib.app.PictureAppMaster.getInstance().getPictureSelectorEngine()) == null) {
                return;
            }
            this.selectorConfig.sandboxFileEngine = pictureSelectorEngine.createSandboxFileEngine();
        }
    }

    private void createResultCallbackListener() {
        com.luck.picture.lib.engine.PictureSelectorEngine pictureSelectorEngine;
        if (this.selectorConfig.isResultListenerBack && this.selectorConfig.onResultCallListener == null && (pictureSelectorEngine = com.luck.picture.lib.app.PictureAppMaster.getInstance().getPictureSelectorEngine()) != null) {
            this.selectorConfig.onResultCallListener = pictureSelectorEngine.getResultCallbackListener();
        }
    }

    private void createLayoutResourceListener() {
        com.luck.picture.lib.engine.PictureSelectorEngine pictureSelectorEngine;
        if (this.selectorConfig.isInjectLayoutResource && this.selectorConfig.onLayoutResourceListener == null && (pictureSelectorEngine = com.luck.picture.lib.app.PictureAppMaster.getInstance().getPictureSelectorEngine()) != null) {
            this.selectorConfig.onLayoutResourceListener = pictureSelectorEngine.createLayoutResourceListener();
        }
    }

    protected com.luck.picture.lib.basic.PictureCommonFragment.SelectorResult getResult(int i, java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        return new com.luck.picture.lib.basic.PictureCommonFragment.SelectorResult(i, arrayList != null ? com.luck.picture.lib.basic.PictureSelector.putIntentResult(arrayList) : null);
    }

    public static class SelectorResult {
        public int mResultCode;
        public android.content.Intent mResultData;

        public SelectorResult(int i, android.content.Intent intent) {
            this.mResultCode = i;
            this.mResultData = intent;
        }
    }
}
