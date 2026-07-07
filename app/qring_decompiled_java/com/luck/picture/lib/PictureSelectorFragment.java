package com.luck.picture.lib;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureSelectorFragment extends com.luck.picture.lib.basic.PictureCommonFragment implements com.luck.picture.lib.interfaces.OnRecyclerViewPreloadMoreListener, com.luck.picture.lib.basic.IPictureSelectorEvent {
    private static final java.lang.Object LOCK = new java.lang.Object();
    private static int SELECT_ANIM_DURATION = 135;
    public static final java.lang.String TAG = "PictureSelectorFragment";
    private com.luck.picture.lib.dialog.AlbumListPopWindow albumListPopWindow;
    private int allFolderSize;
    private com.luck.picture.lib.widget.BottomNavBar bottomNarBar;
    private com.luck.picture.lib.widget.CompleteSelectView completeSelectView;
    private boolean isCameraCallback;
    private boolean isDisplayCamera;
    private boolean isMemoryRecycling;
    private com.luck.picture.lib.adapter.PictureImageGridAdapter mAdapter;
    private com.luck.picture.lib.widget.SlideSelectTouchListener mDragSelectTouchListener;
    private com.luck.picture.lib.widget.RecyclerPreloadView mRecycler;
    private com.luck.picture.lib.widget.TitleBar titleBar;
    private android.widget.TextView tvCurrentDataTime;
    private android.widget.TextView tvDataEmpty;
    private long intervalClickTime = 0;
    private int currentPosition = -1;

    public static com.luck.picture.lib.PictureSelectorFragment newInstance() {
        com.luck.picture.lib.PictureSelectorFragment pictureSelectorFragment = new com.luck.picture.lib.PictureSelectorFragment();
        pictureSelectorFragment.setArguments(new android.os.Bundle());
        return pictureSelectorFragment;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public java.lang.String getFragmentTag() {
        return TAG;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public int getResourceId() {
        int layoutResource = com.luck.picture.lib.config.InjectResourceSource.getLayoutResource(getContext(), 1, this.selectorConfig);
        return layoutResource != 0 ? layoutResource : com.luck.picture.lib.R.layout.ps_fragment_selector;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onSelectedChange(boolean z, com.luck.picture.lib.entity.LocalMedia localMedia) {
        this.bottomNarBar.setSelectedChange();
        this.completeSelectView.setSelectedChange(false);
        if (checkNotifyStrategy(z)) {
            this.mAdapter.notifyItemPositionChanged(localMedia.position);
            this.mRecycler.postDelayed(new java.lang.Runnable() { // from class: com.luck.picture.lib.PictureSelectorFragment.1
                @Override // java.lang.Runnable
                public void run() {
                    com.luck.picture.lib.PictureSelectorFragment.this.mAdapter.notifyDataSetChanged();
                }
            }, SELECT_ANIM_DURATION);
        } else {
            this.mAdapter.notifyItemPositionChanged(localMedia.position);
        }
        if (z) {
            return;
        }
        sendChangeSubSelectPositionEvent(true);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onFixedSelectedChange(com.luck.picture.lib.entity.LocalMedia localMedia) {
        this.mAdapter.notifyItemPositionChanged(localMedia.position);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void sendChangeSubSelectPositionEvent(boolean z) {
        if (this.selectorConfig.selectorStyle.getSelectMainStyle().isSelectNumberStyle()) {
            int i = 0;
            while (i < this.selectorConfig.getSelectCount()) {
                com.luck.picture.lib.entity.LocalMedia localMedia = this.selectorConfig.getSelectedResult().get(i);
                i++;
                localMedia.setNum(i);
                if (z) {
                    this.mAdapter.notifyItemPositionChanged(localMedia.position);
                }
            }
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onCheckOriginalChange() {
        this.bottomNarBar.setOriginalCheck();
    }

    private boolean checkNotifyStrategy(boolean z) {
        if (!this.selectorConfig.isMaxSelectEnabledMask) {
            return false;
        }
        if (this.selectorConfig.isWithVideoImage) {
            if (this.selectorConfig.selectionMode == 1) {
                return false;
            }
            if (this.selectorConfig.getSelectCount() != this.selectorConfig.maxSelectNum && (z || this.selectorConfig.getSelectCount() != this.selectorConfig.maxSelectNum - 1)) {
                return false;
            }
        } else if (this.selectorConfig.getSelectCount() != 0 && (!z || this.selectorConfig.getSelectCount() != 1)) {
            if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(this.selectorConfig.getResultFirstMimeType())) {
                int i = this.selectorConfig.maxVideoSelectNum > 0 ? this.selectorConfig.maxVideoSelectNum : this.selectorConfig.maxSelectNum;
                if (this.selectorConfig.getSelectCount() != i && (z || this.selectorConfig.getSelectCount() != i - 1)) {
                    return false;
                }
            } else if (this.selectorConfig.getSelectCount() != this.selectorConfig.maxSelectNum && (z || this.selectorConfig.getSelectCount() != this.selectorConfig.maxSelectNum - 1)) {
                return false;
            }
        }
        return true;
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(com.luck.picture.lib.config.PictureConfig.EXTRA_ALL_FOLDER_SIZE, this.allFolderSize);
        bundle.putInt(com.luck.picture.lib.config.PictureConfig.EXTRA_CURRENT_PAGE, this.mPage);
        bundle.putInt(com.luck.picture.lib.config.PictureConfig.EXTRA_PREVIEW_CURRENT_POSITION, this.mRecycler.getLastVisiblePosition());
        bundle.putBoolean(com.luck.picture.lib.config.PictureConfig.EXTRA_DISPLAY_CAMERA, this.mAdapter.isDisplayCamera());
        this.selectorConfig.addAlbumDataSource(this.albumListPopWindow.getAlbumList());
        this.selectorConfig.addDataSource(this.mAdapter.getData());
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        reStartSavedInstance(bundle);
        this.isMemoryRecycling = bundle != null;
        this.tvDataEmpty = (android.widget.TextView) view.findViewById(com.luck.picture.lib.R.id.tv_data_empty);
        this.completeSelectView = (com.luck.picture.lib.widget.CompleteSelectView) view.findViewById(com.luck.picture.lib.R.id.ps_complete_select);
        this.titleBar = (com.luck.picture.lib.widget.TitleBar) view.findViewById(com.luck.picture.lib.R.id.title_bar);
        this.bottomNarBar = (com.luck.picture.lib.widget.BottomNavBar) view.findViewById(com.luck.picture.lib.R.id.bottom_nar_bar);
        this.tvCurrentDataTime = (android.widget.TextView) view.findViewById(com.luck.picture.lib.R.id.tv_current_data_time);
        onCreateLoader();
        initAlbumListPopWindow();
        initTitleBar();
        initComplete();
        initRecycler(view);
        initBottomNavBar();
        if (this.isMemoryRecycling) {
            recoverSaveInstanceData();
        } else {
            requestLoadData();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onFragmentResume() {
        setRootViewKeyListener(requireView());
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void reStartSavedInstance(android.os.Bundle bundle) {
        if (bundle != null) {
            this.allFolderSize = bundle.getInt(com.luck.picture.lib.config.PictureConfig.EXTRA_ALL_FOLDER_SIZE);
            this.mPage = bundle.getInt(com.luck.picture.lib.config.PictureConfig.EXTRA_CURRENT_PAGE, this.mPage);
            this.currentPosition = bundle.getInt(com.luck.picture.lib.config.PictureConfig.EXTRA_PREVIEW_CURRENT_POSITION, this.currentPosition);
            this.isDisplayCamera = bundle.getBoolean(com.luck.picture.lib.config.PictureConfig.EXTRA_DISPLAY_CAMERA, this.selectorConfig.isDisplayCamera);
            return;
        }
        this.isDisplayCamera = this.selectorConfig.isDisplayCamera;
    }

    private void initComplete() {
        if (this.selectorConfig.selectionMode == 1 && this.selectorConfig.isDirectReturnSingle) {
            this.selectorConfig.selectorStyle.getTitleBarStyle().setHideCancelButton(false);
            this.titleBar.getTitleCancelView().setVisibility(0);
            this.completeSelectView.setVisibility(8);
            return;
        }
        this.completeSelectView.setCompleteSelectViewStyle();
        this.completeSelectView.setSelectedChange(false);
        if (this.selectorConfig.selectorStyle.getSelectMainStyle().isCompleteSelectRelativeTop()) {
            if (this.completeSelectView.getLayoutParams() instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                this.completeSelectView.getLayoutParams().topToTop = com.luck.picture.lib.R.id.title_bar;
                this.completeSelectView.getLayoutParams().bottomToBottom = com.luck.picture.lib.R.id.title_bar;
                if (this.selectorConfig.isPreviewFullScreenMode) {
                    this.completeSelectView.getLayoutParams().topMargin = com.luck.picture.lib.utils.DensityUtil.getStatusBarHeight(getContext());
                }
            } else if ((this.completeSelectView.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams) && this.selectorConfig.isPreviewFullScreenMode) {
                ((android.widget.RelativeLayout.LayoutParams) this.completeSelectView.getLayoutParams()).topMargin = com.luck.picture.lib.utils.DensityUtil.getStatusBarHeight(getContext());
            }
        }
        this.completeSelectView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (!com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.isEmptyResultReturn || com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.getSelectCount() != 0) {
                    com.luck.picture.lib.PictureSelectorFragment.this.dispatchTransformResult();
                } else {
                    com.luck.picture.lib.PictureSelectorFragment.this.onExitPictureSelector();
                }
            }
        });
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onCreateLoader() {
        com.luck.picture.lib.loader.IBridgeMediaLoader localMediaLoader;
        if (this.selectorConfig.loaderFactory != null) {
            this.mLoader = this.selectorConfig.loaderFactory.onCreateLoader();
            if (this.mLoader != null) {
                return;
            }
            throw new java.lang.NullPointerException("No available " + com.luck.picture.lib.loader.IBridgeMediaLoader.class + " loader found");
        }
        if (this.selectorConfig.isPageStrategy) {
            localMediaLoader = new com.luck.picture.lib.loader.LocalMediaPageLoader(getAppContext(), this.selectorConfig);
        } else {
            localMediaLoader = new com.luck.picture.lib.loader.LocalMediaLoader(getAppContext(), this.selectorConfig);
        }
        this.mLoader = localMediaLoader;
    }

    private void initTitleBar() {
        if (this.selectorConfig.selectorStyle.getTitleBarStyle().isHideTitleBar()) {
            this.titleBar.setVisibility(8);
        }
        this.titleBar.setTitleBarStyle();
        this.titleBar.setOnTitleBarListener(new com.luck.picture.lib.widget.TitleBar.OnTitleBarListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.3
            @Override // com.luck.picture.lib.widget.TitleBar.OnTitleBarListener
            public void onTitleDoubleClick() {
                if (com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.isAutomaticTitleRecyclerTop) {
                    if (android.os.SystemClock.uptimeMillis() - com.luck.picture.lib.PictureSelectorFragment.this.intervalClickTime < 500 && com.luck.picture.lib.PictureSelectorFragment.this.mAdapter.getItemCount() > 0) {
                        com.luck.picture.lib.PictureSelectorFragment.this.mRecycler.scrollToPosition(0);
                    } else {
                        com.luck.picture.lib.PictureSelectorFragment.this.intervalClickTime = android.os.SystemClock.uptimeMillis();
                    }
                }
            }

            @Override // com.luck.picture.lib.widget.TitleBar.OnTitleBarListener
            public void onBackPressed() {
                if (com.luck.picture.lib.PictureSelectorFragment.this.albumListPopWindow.isShowing()) {
                    com.luck.picture.lib.PictureSelectorFragment.this.albumListPopWindow.dismiss();
                } else {
                    com.luck.picture.lib.PictureSelectorFragment.this.onKeyBackFragmentFinish();
                }
            }

            @Override // com.luck.picture.lib.widget.TitleBar.OnTitleBarListener
            public void onShowAlbumPopWindow(android.view.View view) {
                com.luck.picture.lib.PictureSelectorFragment.this.albumListPopWindow.showAsDropDown(view);
            }
        });
    }

    private void initAlbumListPopWindow() {
        com.luck.picture.lib.dialog.AlbumListPopWindow buildPopWindow = com.luck.picture.lib.dialog.AlbumListPopWindow.buildPopWindow(getContext(), this.selectorConfig);
        this.albumListPopWindow = buildPopWindow;
        buildPopWindow.setOnPopupWindowStatusListener(new com.luck.picture.lib.dialog.AlbumListPopWindow.OnPopupWindowStatusListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.4
            @Override // com.luck.picture.lib.dialog.AlbumListPopWindow.OnPopupWindowStatusListener
            public void onShowPopupWindow() {
                if (com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.isOnlySandboxDir) {
                    return;
                }
                com.luck.picture.lib.utils.AnimUtils.rotateArrow(com.luck.picture.lib.PictureSelectorFragment.this.titleBar.getImageArrow(), true);
            }

            @Override // com.luck.picture.lib.dialog.AlbumListPopWindow.OnPopupWindowStatusListener
            public void onDismissPopupWindow() {
                if (com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.isOnlySandboxDir) {
                    return;
                }
                com.luck.picture.lib.utils.AnimUtils.rotateArrow(com.luck.picture.lib.PictureSelectorFragment.this.titleBar.getImageArrow(), false);
            }
        });
        addAlbumPopWindowAction();
    }

    private void recoverSaveInstanceData() {
        this.mAdapter.setDisplayCamera(this.isDisplayCamera);
        setEnterAnimationDuration(0L);
        if (this.selectorConfig.isOnlySandboxDir) {
            handleInAppDirAllMedia(this.selectorConfig.currentLocalMediaFolder);
        } else {
            handleRecoverAlbumData(new java.util.ArrayList(this.selectorConfig.albumDataSource));
        }
    }

    private void handleRecoverAlbumData(java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> list) {
        com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder;
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        if (list.size() > 0) {
            if (this.selectorConfig.currentLocalMediaFolder != null) {
                localMediaFolder = this.selectorConfig.currentLocalMediaFolder;
            } else {
                localMediaFolder = list.get(0);
                this.selectorConfig.currentLocalMediaFolder = localMediaFolder;
            }
            this.titleBar.setTitle(localMediaFolder.getFolderName());
            this.albumListPopWindow.bindAlbumData(list);
            if (this.selectorConfig.isPageStrategy) {
                handleFirstPageMedia(new java.util.ArrayList<>(this.selectorConfig.dataSource), true);
                return;
            } else {
                setAdapterData(localMediaFolder.getData());
                return;
            }
        }
        showDataNull();
    }

    private void requestLoadData() {
        this.mAdapter.setDisplayCamera(this.isDisplayCamera);
        if (com.luck.picture.lib.permissions.PermissionChecker.isCheckReadStorage(this.selectorConfig.chooseMode, getContext())) {
            beginLoadData();
            return;
        }
        final java.lang.String[] readPermissionArray = com.luck.picture.lib.permissions.PermissionConfig.getReadPermissionArray(getAppContext(), this.selectorConfig.chooseMode);
        onPermissionExplainEvent(true, readPermissionArray);
        if (this.selectorConfig.onPermissionsEventListener != null) {
            onApplyPermissionsEvent(-1, readPermissionArray);
        } else {
            com.luck.picture.lib.permissions.PermissionChecker.getInstance().requestPermissions(this, readPermissionArray, new com.luck.picture.lib.permissions.PermissionResultCallback() { // from class: com.luck.picture.lib.PictureSelectorFragment.5
                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onGranted() {
                    com.luck.picture.lib.PictureSelectorFragment.this.beginLoadData();
                }

                @Override // com.luck.picture.lib.permissions.PermissionResultCallback
                public void onDenied() {
                    com.luck.picture.lib.PictureSelectorFragment.this.handlePermissionDenied(readPermissionArray);
                }
            });
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onApplyPermissionsEvent(int i, java.lang.String[] strArr) {
        if (i != -1) {
            super.onApplyPermissionsEvent(i, strArr);
        } else {
            this.selectorConfig.onPermissionsEventListener.requestPermission(this, strArr, new com.luck.picture.lib.interfaces.OnRequestPermissionListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.6
                @Override // com.luck.picture.lib.interfaces.OnRequestPermissionListener
                public void onCall(java.lang.String[] strArr2, boolean z) {
                    if (z) {
                        com.luck.picture.lib.PictureSelectorFragment.this.beginLoadData();
                    } else {
                        com.luck.picture.lib.PictureSelectorFragment.this.handlePermissionDenied(strArr2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void beginLoadData() {
        onPermissionExplainEvent(false, null);
        if (this.selectorConfig.isOnlySandboxDir) {
            loadOnlyInAppDirectoryAllMediaData();
        } else {
            loadAllAlbumData();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void handlePermissionSettingResult(java.lang.String[] strArr) {
        boolean isCheckSelfPermission;
        if (strArr == null) {
            return;
        }
        onPermissionExplainEvent(false, null);
        boolean z = strArr.length > 0 && android.text.TextUtils.equals(strArr[0], com.luck.picture.lib.permissions.PermissionConfig.CAMERA[0]);
        if (this.selectorConfig.onPermissionsEventListener != null) {
            isCheckSelfPermission = this.selectorConfig.onPermissionsEventListener.hasPermissions(this, strArr);
        } else {
            isCheckSelfPermission = com.luck.picture.lib.permissions.PermissionChecker.isCheckSelfPermission(getContext(), strArr);
        }
        if (isCheckSelfPermission) {
            if (z) {
                openSelectedCamera();
            } else {
                beginLoadData();
            }
        } else if (z) {
            com.luck.picture.lib.utils.ToastUtils.showToast(getContext(), getString(com.luck.picture.lib.R.string.ps_camera));
        } else {
            com.luck.picture.lib.utils.ToastUtils.showToast(getContext(), getString(com.luck.picture.lib.R.string.ps_jurisdiction));
            onKeyBackFragmentFinish();
        }
        com.luck.picture.lib.permissions.PermissionConfig.CURRENT_REQUEST_PERMISSION = new java.lang.String[0];
    }

    private void addAlbumPopWindowAction() {
        this.albumListPopWindow.setOnIBridgeAlbumWidget(new com.luck.picture.lib.interfaces.OnAlbumItemClickListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.7
            @Override // com.luck.picture.lib.interfaces.OnAlbumItemClickListener
            public void onItemClick(int i, com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder) {
                com.luck.picture.lib.PictureSelectorFragment pictureSelectorFragment = com.luck.picture.lib.PictureSelectorFragment.this;
                pictureSelectorFragment.isDisplayCamera = pictureSelectorFragment.selectorConfig.isDisplayCamera && localMediaFolder.getBucketId() == -1;
                com.luck.picture.lib.PictureSelectorFragment.this.mAdapter.setDisplayCamera(com.luck.picture.lib.PictureSelectorFragment.this.isDisplayCamera);
                com.luck.picture.lib.PictureSelectorFragment.this.titleBar.setTitle(localMediaFolder.getFolderName());
                com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder2 = com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.currentLocalMediaFolder;
                long bucketId = localMediaFolder2.getBucketId();
                if (com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.isPageStrategy) {
                    if (localMediaFolder.getBucketId() != bucketId) {
                        localMediaFolder2.setData(com.luck.picture.lib.PictureSelectorFragment.this.mAdapter.getData());
                        localMediaFolder2.setCurrentDataPage(com.luck.picture.lib.PictureSelectorFragment.this.mPage);
                        localMediaFolder2.setHasMore(com.luck.picture.lib.PictureSelectorFragment.this.mRecycler.isEnabledLoadMore());
                        if (localMediaFolder.getData().size() <= 0 || localMediaFolder.isHasMore()) {
                            com.luck.picture.lib.PictureSelectorFragment.this.mPage = 1;
                            if (com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.loaderDataEngine == null) {
                                com.luck.picture.lib.PictureSelectorFragment.this.mLoader.loadPageMediaData(localMediaFolder.getBucketId(), com.luck.picture.lib.PictureSelectorFragment.this.mPage, com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.pageSize, new com.luck.picture.lib.interfaces.OnQueryDataResultListener<com.luck.picture.lib.entity.LocalMedia>() { // from class: com.luck.picture.lib.PictureSelectorFragment.7.2
                                    @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                                    public void onComplete(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList, boolean z) {
                                        com.luck.picture.lib.PictureSelectorFragment.this.handleSwitchAlbum(arrayList, z);
                                    }
                                });
                            } else {
                                com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.loaderDataEngine.loadFirstPageMediaData(com.luck.picture.lib.PictureSelectorFragment.this.getContext(), localMediaFolder.getBucketId(), com.luck.picture.lib.PictureSelectorFragment.this.mPage, com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.pageSize, new com.luck.picture.lib.interfaces.OnQueryDataResultListener<com.luck.picture.lib.entity.LocalMedia>() { // from class: com.luck.picture.lib.PictureSelectorFragment.7.1
                                    @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                                    public void onComplete(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList, boolean z) {
                                        com.luck.picture.lib.PictureSelectorFragment.this.handleSwitchAlbum(arrayList, z);
                                    }
                                });
                            }
                        } else {
                            com.luck.picture.lib.PictureSelectorFragment.this.setAdapterData(localMediaFolder.getData());
                            com.luck.picture.lib.PictureSelectorFragment.this.mPage = localMediaFolder.getCurrentDataPage();
                            com.luck.picture.lib.PictureSelectorFragment.this.mRecycler.setEnabledLoadMore(localMediaFolder.isHasMore());
                            com.luck.picture.lib.PictureSelectorFragment.this.mRecycler.smoothScrollToPosition(0);
                        }
                    }
                } else if (localMediaFolder.getBucketId() != bucketId) {
                    com.luck.picture.lib.PictureSelectorFragment.this.setAdapterData(localMediaFolder.getData());
                    com.luck.picture.lib.PictureSelectorFragment.this.mRecycler.smoothScrollToPosition(0);
                }
                com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.currentLocalMediaFolder = localMediaFolder;
                com.luck.picture.lib.PictureSelectorFragment.this.albumListPopWindow.dismiss();
                if (com.luck.picture.lib.PictureSelectorFragment.this.mDragSelectTouchListener == null || !com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.isFastSlidingSelect) {
                    return;
                }
                com.luck.picture.lib.PictureSelectorFragment.this.mDragSelectTouchListener.setRecyclerViewHeaderCount(com.luck.picture.lib.PictureSelectorFragment.this.mAdapter.isDisplayCamera() ? 1 : 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSwitchAlbum(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList, boolean z) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        this.mRecycler.setEnabledLoadMore(z);
        if (arrayList.size() == 0) {
            this.mAdapter.getData().clear();
        }
        setAdapterData(arrayList);
        this.mRecycler.onScrolled(0, 0);
        this.mRecycler.smoothScrollToPosition(0);
    }

    private void initBottomNavBar() {
        this.bottomNarBar.setBottomNavBarStyle();
        this.bottomNarBar.setOnBottomNavBarListener(new com.luck.picture.lib.widget.BottomNavBar.OnBottomNavBarListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.8
            @Override // com.luck.picture.lib.widget.BottomNavBar.OnBottomNavBarListener
            public void onPreview() {
                com.luck.picture.lib.PictureSelectorFragment.this.onStartPreview(0, true);
            }

            @Override // com.luck.picture.lib.widget.BottomNavBar.OnBottomNavBarListener
            public void onCheckOriginalChange() {
                com.luck.picture.lib.PictureSelectorFragment.this.sendSelectedOriginalChangeEvent();
            }
        });
        this.bottomNarBar.setSelectedChange();
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorEvent
    public void loadAllAlbumData() {
        if (this.selectorConfig.loaderDataEngine != null) {
            this.selectorConfig.loaderDataEngine.loadAllAlbumData(getContext(), new com.luck.picture.lib.interfaces.OnQueryAllAlbumListener<com.luck.picture.lib.entity.LocalMediaFolder>() { // from class: com.luck.picture.lib.PictureSelectorFragment.9
                @Override // com.luck.picture.lib.interfaces.OnQueryAllAlbumListener
                public void onComplete(java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> list) {
                    com.luck.picture.lib.PictureSelectorFragment.this.handleAllAlbumData(false, list);
                }
            });
        } else {
            final boolean preloadPageFirstData = preloadPageFirstData();
            this.mLoader.loadAllAlbum(new com.luck.picture.lib.interfaces.OnQueryAllAlbumListener<com.luck.picture.lib.entity.LocalMediaFolder>() { // from class: com.luck.picture.lib.PictureSelectorFragment.10
                @Override // com.luck.picture.lib.interfaces.OnQueryAllAlbumListener
                public void onComplete(java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> list) {
                    com.luck.picture.lib.PictureSelectorFragment.this.handleAllAlbumData(preloadPageFirstData, list);
                }
            });
        }
    }

    private boolean preloadPageFirstData() {
        android.content.Context requireContext;
        int i;
        if (!this.selectorConfig.isPageStrategy || !this.selectorConfig.isPreloadFirst) {
            return false;
        }
        com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder = new com.luck.picture.lib.entity.LocalMediaFolder();
        localMediaFolder.setBucketId(-1L);
        if (android.text.TextUtils.isEmpty(this.selectorConfig.defaultAlbumName)) {
            com.luck.picture.lib.widget.TitleBar titleBar = this.titleBar;
            if (this.selectorConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofAudio()) {
                requireContext = requireContext();
                i = com.luck.picture.lib.R.string.ps_all_audio;
            } else {
                requireContext = requireContext();
                i = com.luck.picture.lib.R.string.ps_camera_roll;
            }
            titleBar.setTitle(requireContext.getString(i));
        } else {
            this.titleBar.setTitle(this.selectorConfig.defaultAlbumName);
        }
        localMediaFolder.setFolderName(this.titleBar.getTitleText());
        this.selectorConfig.currentLocalMediaFolder = localMediaFolder;
        loadFirstPageMediaData(localMediaFolder.getBucketId());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAllAlbumData(boolean z, java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> list) {
        com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder;
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        if (list.size() > 0) {
            if (z) {
                localMediaFolder = list.get(0);
                this.selectorConfig.currentLocalMediaFolder = localMediaFolder;
            } else if (this.selectorConfig.currentLocalMediaFolder != null) {
                localMediaFolder = this.selectorConfig.currentLocalMediaFolder;
            } else {
                localMediaFolder = list.get(0);
                this.selectorConfig.currentLocalMediaFolder = localMediaFolder;
            }
            this.titleBar.setTitle(localMediaFolder.getFolderName());
            this.albumListPopWindow.bindAlbumData(list);
            if (this.selectorConfig.isPageStrategy) {
                if (this.selectorConfig.isPreloadFirst) {
                    this.mRecycler.setEnabledLoadMore(true);
                    return;
                } else {
                    loadFirstPageMediaData(localMediaFolder.getBucketId());
                    return;
                }
            }
            setAdapterData(localMediaFolder.getData());
            return;
        }
        showDataNull();
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorEvent
    public void loadFirstPageMediaData(long j) {
        this.mPage = 1;
        this.mRecycler.setEnabledLoadMore(true);
        if (this.selectorConfig.loaderDataEngine != null) {
            this.selectorConfig.loaderDataEngine.loadFirstPageMediaData(getContext(), j, this.mPage, this.mPage * this.selectorConfig.pageSize, new com.luck.picture.lib.interfaces.OnQueryDataResultListener<com.luck.picture.lib.entity.LocalMedia>() { // from class: com.luck.picture.lib.PictureSelectorFragment.11
                @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                public void onComplete(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList, boolean z) {
                    com.luck.picture.lib.PictureSelectorFragment.this.handleFirstPageMedia(arrayList, z);
                }
            });
        } else {
            this.mLoader.loadPageMediaData(j, this.mPage, this.mPage * this.selectorConfig.pageSize, new com.luck.picture.lib.interfaces.OnQueryDataResultListener<com.luck.picture.lib.entity.LocalMedia>() { // from class: com.luck.picture.lib.PictureSelectorFragment.12
                @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                public void onComplete(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList, boolean z) {
                    com.luck.picture.lib.PictureSelectorFragment.this.handleFirstPageMedia(arrayList, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFirstPageMedia(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList, boolean z) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        this.mRecycler.setEnabledLoadMore(z);
        if (this.mRecycler.isEnabledLoadMore() && arrayList.size() == 0) {
            onRecyclerViewPreloadMore();
        } else {
            setAdapterData(arrayList);
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorEvent
    public void loadOnlyInAppDirectoryAllMediaData() {
        if (this.selectorConfig.loaderDataEngine != null) {
            this.selectorConfig.loaderDataEngine.loadOnlyInAppDirAllMediaData(getContext(), new com.luck.picture.lib.interfaces.OnQueryAlbumListener<com.luck.picture.lib.entity.LocalMediaFolder>() { // from class: com.luck.picture.lib.PictureSelectorFragment.13
                @Override // com.luck.picture.lib.interfaces.OnQueryAlbumListener
                public void onComplete(com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder) {
                    com.luck.picture.lib.PictureSelectorFragment.this.handleInAppDirAllMedia(localMediaFolder);
                }
            });
        } else {
            this.mLoader.loadOnlyInAppDirAllMedia(new com.luck.picture.lib.interfaces.OnQueryAlbumListener<com.luck.picture.lib.entity.LocalMediaFolder>() { // from class: com.luck.picture.lib.PictureSelectorFragment.14
                @Override // com.luck.picture.lib.interfaces.OnQueryAlbumListener
                public void onComplete(com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder) {
                    com.luck.picture.lib.PictureSelectorFragment.this.handleInAppDirAllMedia(localMediaFolder);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleInAppDirAllMedia(com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        java.lang.String str = this.selectorConfig.sandboxDir;
        boolean z = localMediaFolder != null;
        this.titleBar.setTitle(z ? localMediaFolder.getFolderName() : new java.io.File(str).getName());
        if (z) {
            this.selectorConfig.currentLocalMediaFolder = localMediaFolder;
            setAdapterData(localMediaFolder.getData());
        } else {
            showDataNull();
        }
    }

    private void recoveryRecyclerPosition() {
        if (this.currentPosition > 0) {
            this.mRecycler.post(new java.lang.Runnable() { // from class: com.luck.picture.lib.PictureSelectorFragment.15
                @Override // java.lang.Runnable
                public void run() {
                    com.luck.picture.lib.PictureSelectorFragment.this.mRecycler.scrollToPosition(com.luck.picture.lib.PictureSelectorFragment.this.currentPosition);
                    com.luck.picture.lib.PictureSelectorFragment.this.mRecycler.setLastVisiblePosition(com.luck.picture.lib.PictureSelectorFragment.this.currentPosition);
                }
            });
        }
    }

    private void initRecycler(android.view.View view) {
        this.mRecycler = (com.luck.picture.lib.widget.RecyclerPreloadView) view.findViewById(com.luck.picture.lib.R.id.recycler);
        com.luck.picture.lib.style.SelectMainStyle selectMainStyle = this.selectorConfig.selectorStyle.getSelectMainStyle();
        int mainListBackgroundColor = selectMainStyle.getMainListBackgroundColor();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(mainListBackgroundColor)) {
            this.mRecycler.setBackgroundColor(mainListBackgroundColor);
        } else {
            this.mRecycler.setBackgroundColor(androidx.core.content.ContextCompat.getColor(getAppContext(), com.luck.picture.lib.R.color.ps_color_black));
        }
        int i = this.selectorConfig.imageSpanCount <= 0 ? 4 : this.selectorConfig.imageSpanCount;
        if (this.mRecycler.getItemDecorationCount() == 0) {
            if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(selectMainStyle.getAdapterItemSpacingSize())) {
                this.mRecycler.addItemDecoration(new com.luck.picture.lib.decoration.GridSpacingItemDecoration(i, selectMainStyle.getAdapterItemSpacingSize(), selectMainStyle.isAdapterItemIncludeEdge()));
            } else {
                this.mRecycler.addItemDecoration(new com.luck.picture.lib.decoration.GridSpacingItemDecoration(i, com.luck.picture.lib.utils.DensityUtil.dip2px(view.getContext(), 1.0f), selectMainStyle.isAdapterItemIncludeEdge()));
            }
        }
        this.mRecycler.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(getContext(), i));
        androidx.recyclerview.widget.SimpleItemAnimator itemAnimator = this.mRecycler.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setSupportsChangeAnimations(false);
            this.mRecycler.setItemAnimator(null);
        }
        if (this.selectorConfig.isPageStrategy) {
            this.mRecycler.setReachBottomRow(2);
            this.mRecycler.setOnRecyclerViewPreloadListener(this);
        } else {
            this.mRecycler.setHasFixedSize(true);
        }
        com.luck.picture.lib.adapter.PictureImageGridAdapter pictureImageGridAdapter = new com.luck.picture.lib.adapter.PictureImageGridAdapter(getContext(), this.selectorConfig);
        this.mAdapter = pictureImageGridAdapter;
        pictureImageGridAdapter.setDisplayCamera(this.isDisplayCamera);
        int i2 = this.selectorConfig.animationMode;
        if (i2 == 1) {
            this.mRecycler.setAdapter(new com.luck.picture.lib.animators.AlphaInAnimationAdapter(this.mAdapter));
        } else if (i2 == 2) {
            this.mRecycler.setAdapter(new com.luck.picture.lib.animators.SlideInBottomAnimationAdapter(this.mAdapter));
        } else {
            this.mRecycler.setAdapter(this.mAdapter);
        }
        addRecyclerAction();
    }

    private void addRecyclerAction() {
        this.mAdapter.setOnItemClickListener(new com.luck.picture.lib.adapter.PictureImageGridAdapter.OnItemClickListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.16
            @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.OnItemClickListener
            public void openCameraClick() {
                if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
                    return;
                }
                com.luck.picture.lib.PictureSelectorFragment.this.openSelectedCamera();
            }

            @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.OnItemClickListener
            public int onSelected(android.view.View view, int i, com.luck.picture.lib.entity.LocalMedia localMedia) {
                int confirmSelect = com.luck.picture.lib.PictureSelectorFragment.this.confirmSelect(localMedia, view.isSelected());
                if (confirmSelect == 0) {
                    if (com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.onSelectAnimListener != null) {
                        long onSelectAnim = com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.onSelectAnimListener.onSelectAnim(view);
                        if (onSelectAnim > 0) {
                            int unused = com.luck.picture.lib.PictureSelectorFragment.SELECT_ANIM_DURATION = (int) onSelectAnim;
                        }
                    } else {
                        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(com.luck.picture.lib.PictureSelectorFragment.this.getContext(), com.luck.picture.lib.R.anim.ps_anim_modal_in);
                        int unused2 = com.luck.picture.lib.PictureSelectorFragment.SELECT_ANIM_DURATION = (int) loadAnimation.getDuration();
                        view.startAnimation(loadAnimation);
                    }
                }
                return confirmSelect;
            }

            @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.OnItemClickListener
            public void onItemClick(android.view.View view, int i, com.luck.picture.lib.entity.LocalMedia localMedia) {
                if (com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.selectionMode == 1 && com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.isDirectReturnSingle) {
                    com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.selectedResult.clear();
                    if (com.luck.picture.lib.PictureSelectorFragment.this.confirmSelect(localMedia, false) == 0) {
                        com.luck.picture.lib.PictureSelectorFragment.this.dispatchTransformResult();
                        return;
                    }
                    return;
                }
                if (com.luck.picture.lib.utils.DoubleUtils.isFastDoubleClick()) {
                    return;
                }
                com.luck.picture.lib.PictureSelectorFragment.this.onStartPreview(i, false);
            }

            @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.OnItemClickListener
            public void onItemLongClick(android.view.View view, int i) {
                if (com.luck.picture.lib.PictureSelectorFragment.this.mDragSelectTouchListener == null || !com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.isFastSlidingSelect) {
                    return;
                }
                ((android.os.Vibrator) com.luck.picture.lib.PictureSelectorFragment.this.getActivity().getSystemService("vibrator")).vibrate(50L);
                com.luck.picture.lib.PictureSelectorFragment.this.mDragSelectTouchListener.startSlideSelection(i);
            }
        });
        this.mRecycler.setOnRecyclerViewScrollStateListener(new com.luck.picture.lib.interfaces.OnRecyclerViewScrollStateListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.17
            @Override // com.luck.picture.lib.interfaces.OnRecyclerViewScrollStateListener
            public void onScrollFast() {
                if (com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.imageEngine != null) {
                    com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.imageEngine.pauseRequests(com.luck.picture.lib.PictureSelectorFragment.this.getContext());
                }
            }

            @Override // com.luck.picture.lib.interfaces.OnRecyclerViewScrollStateListener
            public void onScrollSlow() {
                if (com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.imageEngine != null) {
                    com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.imageEngine.resumeRequests(com.luck.picture.lib.PictureSelectorFragment.this.getContext());
                }
            }
        });
        this.mRecycler.setOnRecyclerViewScrollListener(new com.luck.picture.lib.interfaces.OnRecyclerViewScrollListener() { // from class: com.luck.picture.lib.PictureSelectorFragment.18
            @Override // com.luck.picture.lib.interfaces.OnRecyclerViewScrollListener
            public void onScrolled(int i, int i2) {
                com.luck.picture.lib.PictureSelectorFragment.this.setCurrentMediaCreateTimeText();
            }

            @Override // com.luck.picture.lib.interfaces.OnRecyclerViewScrollListener
            public void onScrollStateChanged(int i) {
                if (i == 1) {
                    com.luck.picture.lib.PictureSelectorFragment.this.showCurrentMediaCreateTimeUI();
                } else if (i == 0) {
                    com.luck.picture.lib.PictureSelectorFragment.this.hideCurrentMediaCreateTimeUI();
                }
            }
        });
        if (this.selectorConfig.isFastSlidingSelect) {
            final java.util.HashSet hashSet = new java.util.HashSet();
            com.luck.picture.lib.widget.SlideSelectTouchListener withSelectListener = new com.luck.picture.lib.widget.SlideSelectTouchListener().setRecyclerViewHeaderCount(this.mAdapter.isDisplayCamera() ? 1 : 0).withSelectListener(new com.luck.picture.lib.widget.SlideSelectionHandler(new com.luck.picture.lib.widget.SlideSelectionHandler.ISelectionHandler() { // from class: com.luck.picture.lib.PictureSelectorFragment.19
                @Override // com.luck.picture.lib.widget.SlideSelectionHandler.ISelectionHandler
                public java.util.HashSet<java.lang.Integer> getSelection() {
                    for (int i = 0; i < com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.getSelectCount(); i++) {
                        hashSet.add(java.lang.Integer.valueOf(com.luck.picture.lib.PictureSelectorFragment.this.selectorConfig.getSelectedResult().get(i).position));
                    }
                    return hashSet;
                }

                @Override // com.luck.picture.lib.widget.SlideSelectionHandler.ISelectionHandler
                public void changeSelection(int i, int i2, boolean z, boolean z2) {
                    java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> data = com.luck.picture.lib.PictureSelectorFragment.this.mAdapter.getData();
                    if (data.size() == 0 || i > data.size()) {
                        return;
                    }
                    com.luck.picture.lib.entity.LocalMedia localMedia = data.get(i);
                    com.luck.picture.lib.PictureSelectorFragment pictureSelectorFragment = com.luck.picture.lib.PictureSelectorFragment.this;
                    com.luck.picture.lib.PictureSelectorFragment.this.mDragSelectTouchListener.setActive(pictureSelectorFragment.confirmSelect(localMedia, pictureSelectorFragment.selectorConfig.getSelectedResult().contains(localMedia)) != -1);
                }
            }));
            this.mDragSelectTouchListener = withSelectListener;
            this.mRecycler.addOnItemTouchListener(withSelectListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentMediaCreateTimeText() {
        int firstVisiblePosition;
        if (!this.selectorConfig.isDisplayTimeAxis || (firstVisiblePosition = this.mRecycler.getFirstVisiblePosition()) == -1) {
            return;
        }
        java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> data = this.mAdapter.getData();
        if (data.size() <= firstVisiblePosition || data.get(firstVisiblePosition).getDateAddedTime() <= 0) {
            return;
        }
        this.tvCurrentDataTime.setText(com.luck.picture.lib.utils.DateUtils.getDataFormat(getContext(), data.get(firstVisiblePosition).getDateAddedTime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCurrentMediaCreateTimeUI() {
        if (this.selectorConfig.isDisplayTimeAxis && this.mAdapter.getData().size() > 0 && this.tvCurrentDataTime.getAlpha() == 0.0f) {
            this.tvCurrentDataTime.animate().setDuration(150L).alphaBy(1.0f).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideCurrentMediaCreateTimeUI() {
        if (!this.selectorConfig.isDisplayTimeAxis || this.mAdapter.getData().size() <= 0) {
            return;
        }
        this.tvCurrentDataTime.animate().setDuration(250L).alpha(0.0f).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStartPreview(int i, boolean z) {
        java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList;
        int size;
        long bucketId;
        if (com.luck.picture.lib.utils.ActivityCompatHelper.checkFragmentNonExits(getActivity(), com.luck.picture.lib.PictureSelectorPreviewFragment.TAG)) {
            if (z) {
                java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList2 = new java.util.ArrayList<>(this.selectorConfig.getSelectedResult());
                bucketId = 0;
                arrayList = arrayList2;
                size = arrayList2.size();
            } else {
                java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList3 = new java.util.ArrayList<>(this.mAdapter.getData());
                com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder = this.selectorConfig.currentLocalMediaFolder;
                if (localMediaFolder != null) {
                    int folderTotalNum = localMediaFolder.getFolderTotalNum();
                    arrayList = arrayList3;
                    bucketId = localMediaFolder.getBucketId();
                    size = folderTotalNum;
                } else {
                    arrayList = arrayList3;
                    size = arrayList3.size();
                    bucketId = arrayList3.size() > 0 ? arrayList3.get(0).getBucketId() : -1L;
                }
            }
            if (!z && this.selectorConfig.isPreviewZoomEffect) {
                com.luck.picture.lib.magical.BuildRecycleItemViewParams.generateViewParams(this.mRecycler, this.selectorConfig.isPreviewFullScreenMode ? 0 : com.luck.picture.lib.utils.DensityUtil.getStatusBarHeight(getContext()));
            }
            if (this.selectorConfig.onPreviewInterceptListener != null) {
                this.selectorConfig.onPreviewInterceptListener.onPreview(getContext(), i, size, this.mPage, bucketId, this.titleBar.getTitleText(), this.mAdapter.isDisplayCamera(), arrayList, z);
            } else if (com.luck.picture.lib.utils.ActivityCompatHelper.checkFragmentNonExits(getActivity(), com.luck.picture.lib.PictureSelectorPreviewFragment.TAG)) {
                com.luck.picture.lib.PictureSelectorPreviewFragment newInstance = com.luck.picture.lib.PictureSelectorPreviewFragment.newInstance();
                newInstance.setInternalPreviewData(z, this.titleBar.getTitleText(), this.mAdapter.isDisplayCamera(), i, size, this.mPage, bucketId, arrayList);
                com.luck.picture.lib.basic.FragmentInjectManager.injectFragment(getActivity(), com.luck.picture.lib.PictureSelectorPreviewFragment.TAG, newInstance);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdapterData(final java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        long enterAnimationDuration = getEnterAnimationDuration();
        if (enterAnimationDuration > 0) {
            requireView().postDelayed(new java.lang.Runnable() { // from class: com.luck.picture.lib.PictureSelectorFragment.20
                @Override // java.lang.Runnable
                public void run() {
                    com.luck.picture.lib.PictureSelectorFragment.this.setAdapterDataComplete(arrayList);
                }
            }, enterAnimationDuration);
        } else {
            setAdapterDataComplete(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdapterDataComplete(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        setEnterAnimationDuration(0L);
        sendChangeSubSelectPositionEvent(false);
        this.mAdapter.setDataAndDataSetChanged(arrayList);
        this.selectorConfig.dataSource.clear();
        this.selectorConfig.albumDataSource.clear();
        recoveryRecyclerPosition();
        if (this.mAdapter.isDataEmpty()) {
            showDataNull();
        } else {
            hideDataNull();
        }
    }

    @Override // com.luck.picture.lib.interfaces.OnRecyclerViewPreloadMoreListener
    public void onRecyclerViewPreloadMore() {
        if (this.isMemoryRecycling) {
            requireView().postDelayed(new java.lang.Runnable() { // from class: com.luck.picture.lib.PictureSelectorFragment.21
                @Override // java.lang.Runnable
                public void run() {
                    com.luck.picture.lib.PictureSelectorFragment.this.loadMoreMediaData();
                }
            }, 350L);
        } else {
            loadMoreMediaData();
        }
    }

    @Override // com.luck.picture.lib.basic.IPictureSelectorEvent
    public void loadMoreMediaData() {
        if (this.mRecycler.isEnabledLoadMore()) {
            this.mPage++;
            com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder = this.selectorConfig.currentLocalMediaFolder;
            long bucketId = localMediaFolder != null ? localMediaFolder.getBucketId() : 0L;
            if (this.selectorConfig.loaderDataEngine != null) {
                this.selectorConfig.loaderDataEngine.loadMoreMediaData(getContext(), bucketId, this.mPage, this.selectorConfig.pageSize, this.selectorConfig.pageSize, new com.luck.picture.lib.interfaces.OnQueryDataResultListener<com.luck.picture.lib.entity.LocalMedia>() { // from class: com.luck.picture.lib.PictureSelectorFragment.22
                    @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                    public void onComplete(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList, boolean z) {
                        com.luck.picture.lib.PictureSelectorFragment.this.handleMoreMediaData(arrayList, z);
                    }
                });
            } else {
                this.mLoader.loadPageMediaData(bucketId, this.mPage, this.selectorConfig.pageSize, new com.luck.picture.lib.interfaces.OnQueryDataResultListener<com.luck.picture.lib.entity.LocalMedia>() { // from class: com.luck.picture.lib.PictureSelectorFragment.23
                    @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                    public void onComplete(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList, boolean z) {
                        com.luck.picture.lib.PictureSelectorFragment.this.handleMoreMediaData(arrayList, z);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMoreMediaData(java.util.List<com.luck.picture.lib.entity.LocalMedia> list, boolean z) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        this.mRecycler.setEnabledLoadMore(z);
        if (this.mRecycler.isEnabledLoadMore()) {
            removePageCameraRepeatData(list);
            if (list.size() > 0) {
                int size = this.mAdapter.getData().size();
                this.mAdapter.getData().addAll(list);
                com.luck.picture.lib.adapter.PictureImageGridAdapter pictureImageGridAdapter = this.mAdapter;
                pictureImageGridAdapter.notifyItemRangeChanged(size, pictureImageGridAdapter.getItemCount());
                hideDataNull();
            } else {
                onRecyclerViewPreloadMore();
            }
            if (list.size() < 10) {
                com.luck.picture.lib.widget.RecyclerPreloadView recyclerPreloadView = this.mRecycler;
                recyclerPreloadView.onScrolled(recyclerPreloadView.getScrollX(), this.mRecycler.getScrollY());
            }
        }
    }

    private void removePageCameraRepeatData(java.util.List<com.luck.picture.lib.entity.LocalMedia> list) {
        try {
            try {
                if (this.selectorConfig.isPageStrategy && this.isCameraCallback) {
                    synchronized (LOCK) {
                        java.util.Iterator<com.luck.picture.lib.entity.LocalMedia> it = list.iterator();
                        while (it.hasNext()) {
                            if (this.mAdapter.getData().contains(it.next())) {
                                it.remove();
                            }
                        }
                    }
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.isCameraCallback = false;
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void dispatchCameraMediaResult(com.luck.picture.lib.entity.LocalMedia localMedia) {
        if (!isAddSameImp(this.albumListPopWindow.getFirstAlbumImageCount())) {
            this.mAdapter.getData().add(0, localMedia);
            this.isCameraCallback = true;
        }
        if (this.selectorConfig.selectionMode == 1 && this.selectorConfig.isDirectReturnSingle) {
            this.selectorConfig.selectedResult.clear();
            if (confirmSelect(localMedia, false) == 0) {
                dispatchTransformResult();
            }
        } else {
            confirmSelect(localMedia, false);
        }
        this.mAdapter.notifyItemInserted(this.selectorConfig.isDisplayCamera ? 1 : 0);
        com.luck.picture.lib.adapter.PictureImageGridAdapter pictureImageGridAdapter = this.mAdapter;
        boolean z = this.selectorConfig.isDisplayCamera;
        pictureImageGridAdapter.notifyItemRangeChanged(z ? 1 : 0, this.mAdapter.getData().size());
        if (this.selectorConfig.isOnlySandboxDir) {
            com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder = this.selectorConfig.currentLocalMediaFolder;
            if (localMediaFolder == null) {
                localMediaFolder = new com.luck.picture.lib.entity.LocalMediaFolder();
            }
            localMediaFolder.setBucketId(com.luck.picture.lib.utils.ValueOf.toLong(java.lang.Integer.valueOf(localMedia.getParentFolderName().hashCode())));
            localMediaFolder.setFolderName(localMedia.getParentFolderName());
            localMediaFolder.setFirstMimeType(localMedia.getMimeType());
            localMediaFolder.setFirstImagePath(localMedia.getPath());
            localMediaFolder.setFolderTotalNum(this.mAdapter.getData().size());
            localMediaFolder.setCurrentDataPage(this.mPage);
            localMediaFolder.setHasMore(false);
            localMediaFolder.setData(this.mAdapter.getData());
            this.mRecycler.setEnabledLoadMore(false);
            this.selectorConfig.currentLocalMediaFolder = localMediaFolder;
        } else {
            mergeFolder(localMedia);
        }
        this.allFolderSize = 0;
        if (this.mAdapter.getData().size() > 0 || this.selectorConfig.isDirectReturnSingle) {
            hideDataNull();
        } else {
            showDataNull();
        }
    }

    private void mergeFolder(com.luck.picture.lib.entity.LocalMedia localMedia) {
        com.luck.picture.lib.entity.LocalMediaFolder folder;
        java.lang.String str;
        java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> albumList = this.albumListPopWindow.getAlbumList();
        if (this.albumListPopWindow.getFolderCount() == 0) {
            folder = new com.luck.picture.lib.entity.LocalMediaFolder();
            if (android.text.TextUtils.isEmpty(this.selectorConfig.defaultAlbumName)) {
                str = getString(this.selectorConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofAudio() ? com.luck.picture.lib.R.string.ps_all_audio : com.luck.picture.lib.R.string.ps_camera_roll);
            } else {
                str = this.selectorConfig.defaultAlbumName;
            }
            folder.setFolderName(str);
            folder.setFirstImagePath("");
            folder.setBucketId(-1L);
            albumList.add(0, folder);
        } else {
            folder = this.albumListPopWindow.getFolder(0);
        }
        folder.setFirstImagePath(localMedia.getPath());
        folder.setFirstMimeType(localMedia.getMimeType());
        folder.setData(this.mAdapter.getData());
        folder.setBucketId(-1L);
        folder.setFolderTotalNum(isAddSameImp(folder.getFolderTotalNum()) ? folder.getFolderTotalNum() : folder.getFolderTotalNum() + 1);
        com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder = this.selectorConfig.currentLocalMediaFolder;
        if (localMediaFolder == null || localMediaFolder.getFolderTotalNum() == 0) {
            this.selectorConfig.currentLocalMediaFolder = folder;
        }
        com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder2 = null;
        int i = 0;
        while (true) {
            if (i >= albumList.size()) {
                break;
            }
            com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder3 = albumList.get(i);
            if (android.text.TextUtils.equals(localMediaFolder3.getFolderName(), localMedia.getParentFolderName())) {
                localMediaFolder2 = localMediaFolder3;
                break;
            }
            i++;
        }
        if (localMediaFolder2 == null) {
            localMediaFolder2 = new com.luck.picture.lib.entity.LocalMediaFolder();
            albumList.add(localMediaFolder2);
        }
        localMediaFolder2.setFolderName(localMedia.getParentFolderName());
        if (localMediaFolder2.getBucketId() == -1 || localMediaFolder2.getBucketId() == 0) {
            localMediaFolder2.setBucketId(localMedia.getBucketId());
        }
        if (this.selectorConfig.isPageStrategy) {
            localMediaFolder2.setHasMore(true);
        } else if (!isAddSameImp(folder.getFolderTotalNum()) || !android.text.TextUtils.isEmpty(this.selectorConfig.outPutCameraDir) || !android.text.TextUtils.isEmpty(this.selectorConfig.outPutAudioDir)) {
            localMediaFolder2.getData().add(0, localMedia);
        }
        localMediaFolder2.setFolderTotalNum(isAddSameImp(folder.getFolderTotalNum()) ? localMediaFolder2.getFolderTotalNum() : localMediaFolder2.getFolderTotalNum() + 1);
        localMediaFolder2.setFirstImagePath(this.selectorConfig.cameraPath);
        localMediaFolder2.setFirstMimeType(localMedia.getMimeType());
        this.albumListPopWindow.bindAlbumData(albumList);
    }

    private boolean isAddSameImp(int i) {
        int i2;
        return i != 0 && (i2 = this.allFolderSize) > 0 && i2 < i;
    }

    public void onDestroyView() {
        super.onDestroyView();
        com.luck.picture.lib.widget.SlideSelectTouchListener slideSelectTouchListener = this.mDragSelectTouchListener;
        if (slideSelectTouchListener != null) {
            slideSelectTouchListener.stopAutoScroll();
        }
    }

    private void showDataNull() {
        if (this.selectorConfig.currentLocalMediaFolder == null || this.selectorConfig.currentLocalMediaFolder.getBucketId() == -1) {
            if (this.tvDataEmpty.getVisibility() == 8) {
                this.tvDataEmpty.setVisibility(0);
            }
            this.tvDataEmpty.setCompoundDrawablesRelativeWithIntrinsicBounds(0, com.luck.picture.lib.R.drawable.ps_ic_no_data, 0, 0);
            this.tvDataEmpty.setText(getString(this.selectorConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofAudio() ? com.luck.picture.lib.R.string.ps_audio_empty : com.luck.picture.lib.R.string.ps_empty));
        }
    }

    private void hideDataNull() {
        if (this.tvDataEmpty.getVisibility() == 0) {
            this.tvDataEmpty.setVisibility(8);
        }
    }
}
