package com.luck.picture.lib;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureSelectorPreviewFragment extends com.luck.picture.lib.basic.PictureCommonFragment {
    public static final java.lang.String TAG = "PictureSelectorPreviewFragment";
    protected com.luck.picture.lib.widget.PreviewBottomNavBar bottomNarBar;
    protected com.luck.picture.lib.widget.CompleteSelectView completeSelectView;
    protected int curPosition;
    protected java.lang.String currentAlbum;
    protected boolean isAnimationStart;
    protected boolean isDisplayDelete;
    protected boolean isExternalPreview;
    protected boolean isInternalBottomPreview;
    protected boolean isSaveInstanceState;
    protected boolean isShowCamera;
    protected com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter mGalleryAdapter;
    protected androidx.recyclerview.widget.RecyclerView mGalleryRecycle;
    protected com.luck.picture.lib.magical.MagicalView magicalView;
    protected int screenHeight;
    protected int screenWidth;
    protected android.view.View selectClickArea;
    protected com.luck.picture.lib.widget.PreviewTitleBar titleBar;
    protected int totalNum;
    protected android.widget.TextView tvSelected;
    protected android.widget.TextView tvSelectedWord;
    protected com.luck.picture.lib.adapter.PicturePreviewAdapter viewPageAdapter;
    protected androidx.viewpager2.widget.ViewPager2 viewPager;
    protected java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> mData = new java.util.ArrayList<>();
    protected boolean isHasMore = true;
    protected long mBucketId = -1;
    protected boolean needScaleBig = true;
    protected boolean needScaleSmall = false;
    protected java.util.List<android.view.View> mAnimViews = new java.util.ArrayList();
    private boolean isPause = false;
    private final androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback pageChangeCallback = new androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.22
        public void onPageScrolled(int i, float f, int i2) {
            java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList;
            if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.mData.size() > i) {
                if (i2 < com.luck.picture.lib.PictureSelectorPreviewFragment.this.screenWidth / 2) {
                    arrayList = com.luck.picture.lib.PictureSelectorPreviewFragment.this.mData;
                } else {
                    arrayList = com.luck.picture.lib.PictureSelectorPreviewFragment.this.mData;
                    i++;
                }
                com.luck.picture.lib.entity.LocalMedia localMedia = arrayList.get(i);
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.tvSelected.setSelected(com.luck.picture.lib.PictureSelectorPreviewFragment.this.isSelected(localMedia));
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.notifyGallerySelectMedia(localMedia);
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.notifySelectNumberStyle(localMedia);
            }
        }

        public void onPageSelected(int i) {
            com.luck.picture.lib.PictureSelectorPreviewFragment.this.curPosition = i;
            com.luck.picture.lib.PictureSelectorPreviewFragment.this.titleBar.setTitle((com.luck.picture.lib.PictureSelectorPreviewFragment.this.curPosition + 1) + "/" + com.luck.picture.lib.PictureSelectorPreviewFragment.this.totalNum);
            if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.mData.size() > i) {
                com.luck.picture.lib.entity.LocalMedia localMedia = com.luck.picture.lib.PictureSelectorPreviewFragment.this.mData.get(i);
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.notifySelectNumberStyle(localMedia);
                if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.isHasMagicalEffect()) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.changeMagicalViewParams(i);
                }
                if (!com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.isPreviewZoomEffect) {
                    if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.isAutoVideoPlay) {
                        com.luck.picture.lib.PictureSelectorPreviewFragment.this.startAutoVideoPlay(i);
                    }
                } else if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.isInternalBottomPreview && com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.isAutoVideoPlay) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.startAutoVideoPlay(i);
                } else {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPageAdapter.setVideoPlayButtonUI(i);
                }
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.notifyGallerySelectMedia(localMedia);
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.bottomNarBar.isDisplayEditor(com.luck.picture.lib.config.PictureMimeType.isHasVideo(localMedia.getMimeType()) || com.luck.picture.lib.config.PictureMimeType.isHasAudio(localMedia.getMimeType()));
                if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.isExternalPreview || com.luck.picture.lib.PictureSelectorPreviewFragment.this.isInternalBottomPreview || com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.isOnlySandboxDir || !com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.isPageStrategy || !com.luck.picture.lib.PictureSelectorPreviewFragment.this.isHasMore) {
                    return;
                }
                if (i == (com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPageAdapter.getItemCount() - 1) - 10 || i == com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPageAdapter.getItemCount() - 1) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.loadMoreData();
                }
            }
        }
    };

    public static com.luck.picture.lib.PictureSelectorPreviewFragment newInstance() {
        com.luck.picture.lib.PictureSelectorPreviewFragment pictureSelectorPreviewFragment = new com.luck.picture.lib.PictureSelectorPreviewFragment();
        pictureSelectorPreviewFragment.setArguments(new android.os.Bundle());
        return pictureSelectorPreviewFragment;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public java.lang.String getFragmentTag() {
        return TAG;
    }

    public void setInternalPreviewData(boolean z, java.lang.String str, boolean z2, int i, int i2, int i3, long j, java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        this.mPage = i3;
        this.mBucketId = j;
        this.mData = arrayList;
        this.totalNum = i2;
        this.curPosition = i;
        this.currentAlbum = str;
        this.isShowCamera = z2;
        this.isInternalBottomPreview = z;
    }

    public void setExternalPreviewData(int i, int i2, java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList, boolean z) {
        this.mData = arrayList;
        this.totalNum = i2;
        this.curPosition = i;
        this.isDisplayDelete = z;
        this.isExternalPreview = true;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public int getResourceId() {
        int layoutResource = com.luck.picture.lib.config.InjectResourceSource.getLayoutResource(getContext(), 2, this.selectorConfig);
        return layoutResource != 0 ? layoutResource : com.luck.picture.lib.R.layout.ps_fragment_preview;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onSelectedChange(boolean z, com.luck.picture.lib.entity.LocalMedia localMedia) {
        this.tvSelected.setSelected(this.selectorConfig.getSelectedResult().contains(localMedia));
        this.bottomNarBar.setSelectedChange();
        this.completeSelectView.setSelectedChange(true);
        notifySelectNumberStyle(localMedia);
        notifyPreviewGalleryData(z, localMedia);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onCheckOriginalChange() {
        this.bottomNarBar.setOriginalCheck();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        reStartSavedInstance(bundle);
        this.isSaveInstanceState = bundle != null;
        this.screenWidth = com.luck.picture.lib.utils.DensityUtil.getRealScreenWidth(getContext());
        this.screenHeight = com.luck.picture.lib.utils.DensityUtil.getScreenHeight(getContext());
        this.titleBar = (com.luck.picture.lib.widget.PreviewTitleBar) view.findViewById(com.luck.picture.lib.R.id.title_bar);
        this.tvSelected = (android.widget.TextView) view.findViewById(com.luck.picture.lib.R.id.ps_tv_selected);
        this.tvSelectedWord = (android.widget.TextView) view.findViewById(com.luck.picture.lib.R.id.ps_tv_selected_word);
        this.selectClickArea = view.findViewById(com.luck.picture.lib.R.id.select_click_area);
        this.completeSelectView = (com.luck.picture.lib.widget.CompleteSelectView) view.findViewById(com.luck.picture.lib.R.id.ps_complete_select);
        this.magicalView = (com.luck.picture.lib.magical.MagicalView) view.findViewById(com.luck.picture.lib.R.id.magical);
        this.viewPager = new androidx.viewpager2.widget.ViewPager2(getContext());
        this.bottomNarBar = (com.luck.picture.lib.widget.PreviewBottomNavBar) view.findViewById(com.luck.picture.lib.R.id.bottom_nar_bar);
        this.magicalView.setMagicalContent(this.viewPager);
        setMagicalViewBackgroundColor();
        setMagicalViewAction();
        addAminViews(this.titleBar, this.tvSelected, this.tvSelectedWord, this.selectClickArea, this.completeSelectView, this.bottomNarBar);
        onCreateLoader();
        initTitleBar();
        initViewPagerData(this.mData);
        if (this.isExternalPreview) {
            externalPreviewStyle();
        } else {
            initBottomNavBar();
            initPreviewSelectGallery((android.view.ViewGroup) view);
            initComplete();
        }
        iniMagicalView();
    }

    public void addAminViews(android.view.View... viewArr) {
        java.util.Collections.addAll(this.mAnimViews, viewArr);
    }

    private void setMagicalViewBackgroundColor() {
        java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList;
        com.luck.picture.lib.style.SelectMainStyle selectMainStyle = this.selectorConfig.selectorStyle.getSelectMainStyle();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectMainStyle.getPreviewBackgroundColor())) {
            this.magicalView.setBackgroundColor(selectMainStyle.getPreviewBackgroundColor());
            return;
        }
        if (this.selectorConfig.chooseMode == com.luck.picture.lib.config.SelectMimeType.ofAudio() || ((arrayList = this.mData) != null && arrayList.size() > 0 && com.luck.picture.lib.config.PictureMimeType.isHasAudio(this.mData.get(0).getMimeType()))) {
            this.magicalView.setBackgroundColor(androidx.core.content.ContextCompat.getColor(getContext(), com.luck.picture.lib.R.color.ps_color_white));
        } else {
            this.magicalView.setBackgroundColor(androidx.core.content.ContextCompat.getColor(getContext(), com.luck.picture.lib.R.color.ps_color_black));
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void reStartSavedInstance(android.os.Bundle bundle) {
        if (bundle != null) {
            this.mPage = bundle.getInt(com.luck.picture.lib.config.PictureConfig.EXTRA_CURRENT_PAGE, 1);
            this.mBucketId = bundle.getLong(com.luck.picture.lib.config.PictureConfig.EXTRA_CURRENT_BUCKET_ID, -1L);
            this.curPosition = bundle.getInt(com.luck.picture.lib.config.PictureConfig.EXTRA_PREVIEW_CURRENT_POSITION, this.curPosition);
            this.isShowCamera = bundle.getBoolean(com.luck.picture.lib.config.PictureConfig.EXTRA_DISPLAY_CAMERA, this.isShowCamera);
            this.totalNum = bundle.getInt(com.luck.picture.lib.config.PictureConfig.EXTRA_PREVIEW_CURRENT_ALBUM_TOTAL, this.totalNum);
            this.isExternalPreview = bundle.getBoolean(com.luck.picture.lib.config.PictureConfig.EXTRA_EXTERNAL_PREVIEW, this.isExternalPreview);
            this.isDisplayDelete = bundle.getBoolean(com.luck.picture.lib.config.PictureConfig.EXTRA_EXTERNAL_PREVIEW_DISPLAY_DELETE, this.isDisplayDelete);
            this.isInternalBottomPreview = bundle.getBoolean(com.luck.picture.lib.config.PictureConfig.EXTRA_BOTTOM_PREVIEW, this.isInternalBottomPreview);
            this.currentAlbum = bundle.getString(com.luck.picture.lib.config.PictureConfig.EXTRA_CURRENT_ALBUM_NAME, "");
            if (this.mData.size() == 0) {
                this.mData.addAll(new java.util.ArrayList(this.selectorConfig.selectedPreviewResult));
            }
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onKeyBackFragmentFinish() {
        onKeyDownBackToMin();
    }

    private void iniMagicalView() {
        if (isHasMagicalEffect()) {
            float f = this.isSaveInstanceState ? 1.0f : 0.0f;
            this.magicalView.setBackgroundAlpha(f);
            for (int i = 0; i < this.mAnimViews.size(); i++) {
                if (!(this.mAnimViews.get(i) instanceof com.luck.picture.lib.widget.TitleBar)) {
                    this.mAnimViews.get(i).setAlpha(f);
                }
            }
            return;
        }
        this.magicalView.setBackgroundAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isHasMagicalEffect() {
        return !this.isInternalBottomPreview && this.selectorConfig.isPreviewZoomEffect;
    }

    protected void setMagicalViewAction() {
        if (isHasMagicalEffect()) {
            this.magicalView.setOnMojitoViewCallback(new com.luck.picture.lib.magical.OnMagicalViewCallback() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.1
                @Override // com.luck.picture.lib.magical.OnMagicalViewCallback
                public void onBeginBackMinAnim() {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.onMojitoBeginBackMinAnim();
                }

                @Override // com.luck.picture.lib.magical.OnMagicalViewCallback
                public void onBeginMagicalAnimComplete(com.luck.picture.lib.magical.MagicalView magicalView, boolean z) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.onMojitoBeginAnimComplete(magicalView, z);
                }

                @Override // com.luck.picture.lib.magical.OnMagicalViewCallback
                public void onBackgroundAlpha(float f) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.onMojitoBackgroundAlpha(f);
                }

                @Override // com.luck.picture.lib.magical.OnMagicalViewCallback
                public void onMagicalViewFinish() {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.onMojitoMagicalViewFinish();
                }

                @Override // com.luck.picture.lib.magical.OnMagicalViewCallback
                public void onBeginBackMinMagicalFinish(boolean z) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.onMojitoBeginBackMinFinish(z);
                }
            });
        }
    }

    protected void onMojitoBeginBackMinAnim() {
        com.luck.picture.lib.adapter.holder.BasePreviewHolder currentHolder = this.viewPageAdapter.getCurrentHolder(this.viewPager.getCurrentItem());
        if (currentHolder == null) {
            return;
        }
        if (currentHolder.coverImageView.getVisibility() == 8) {
            currentHolder.coverImageView.setVisibility(0);
        }
        if (currentHolder instanceof com.luck.picture.lib.adapter.holder.PreviewVideoHolder) {
            com.luck.picture.lib.adapter.holder.PreviewVideoHolder previewVideoHolder = (com.luck.picture.lib.adapter.holder.PreviewVideoHolder) currentHolder;
            if (previewVideoHolder.ivPlayButton.getVisibility() == 0) {
                previewVideoHolder.ivPlayButton.setVisibility(8);
            }
        }
    }

    protected void onMojitoMagicalViewFinish() {
        if (this.isExternalPreview && isNormalDefaultEnter() && isHasMagicalEffect()) {
            onExitPictureSelector();
        } else {
            onBackCurrentFragment();
        }
    }

    protected void onMojitoBackgroundAlpha(float f) {
        for (int i = 0; i < this.mAnimViews.size(); i++) {
            if (!(this.mAnimViews.get(i) instanceof com.luck.picture.lib.widget.TitleBar)) {
                this.mAnimViews.get(i).setAlpha(f);
            }
        }
    }

    protected void onMojitoBeginBackMinFinish(boolean z) {
        com.luck.picture.lib.adapter.holder.BasePreviewHolder currentHolder;
        com.luck.picture.lib.magical.ViewParams itemViewParams = com.luck.picture.lib.magical.BuildRecycleItemViewParams.getItemViewParams(this.isShowCamera ? this.curPosition + 1 : this.curPosition);
        if (itemViewParams == null || (currentHolder = this.viewPageAdapter.getCurrentHolder(this.viewPager.getCurrentItem())) == null) {
            return;
        }
        currentHolder.coverImageView.getLayoutParams().width = itemViewParams.width;
        currentHolder.coverImageView.getLayoutParams().height = itemViewParams.height;
        currentHolder.coverImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
    }

    protected void onMojitoBeginAnimComplete(com.luck.picture.lib.magical.MagicalView magicalView, boolean z) {
        int width;
        int height;
        com.luck.picture.lib.adapter.holder.BasePreviewHolder currentHolder = this.viewPageAdapter.getCurrentHolder(this.viewPager.getCurrentItem());
        if (currentHolder == null) {
            return;
        }
        com.luck.picture.lib.entity.LocalMedia localMedia = this.mData.get(this.viewPager.getCurrentItem());
        if (localMedia.isCut() && localMedia.getCropImageWidth() > 0 && localMedia.getCropImageHeight() > 0) {
            width = localMedia.getCropImageWidth();
            height = localMedia.getCropImageHeight();
        } else {
            width = localMedia.getWidth();
            height = localMedia.getHeight();
        }
        if (com.luck.picture.lib.utils.MediaUtils.isLongImage(width, height)) {
            currentHolder.coverImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        } else {
            currentHolder.coverImageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        }
        if (currentHolder instanceof com.luck.picture.lib.adapter.holder.PreviewVideoHolder) {
            com.luck.picture.lib.adapter.holder.PreviewVideoHolder previewVideoHolder = (com.luck.picture.lib.adapter.holder.PreviewVideoHolder) currentHolder;
            if (this.selectorConfig.isAutoVideoPlay) {
                startAutoVideoPlay(this.viewPager.getCurrentItem());
            } else {
                if (previewVideoHolder.ivPlayButton.getVisibility() != 8 || isPlaying()) {
                    return;
                }
                previewVideoHolder.ivPlayButton.setVisibility(0);
            }
        }
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(com.luck.picture.lib.config.PictureConfig.EXTRA_CURRENT_PAGE, this.mPage);
        bundle.putLong(com.luck.picture.lib.config.PictureConfig.EXTRA_CURRENT_BUCKET_ID, this.mBucketId);
        bundle.putInt(com.luck.picture.lib.config.PictureConfig.EXTRA_PREVIEW_CURRENT_POSITION, this.curPosition);
        bundle.putInt(com.luck.picture.lib.config.PictureConfig.EXTRA_PREVIEW_CURRENT_ALBUM_TOTAL, this.totalNum);
        bundle.putBoolean(com.luck.picture.lib.config.PictureConfig.EXTRA_EXTERNAL_PREVIEW, this.isExternalPreview);
        bundle.putBoolean(com.luck.picture.lib.config.PictureConfig.EXTRA_EXTERNAL_PREVIEW_DISPLAY_DELETE, this.isDisplayDelete);
        bundle.putBoolean(com.luck.picture.lib.config.PictureConfig.EXTRA_DISPLAY_CAMERA, this.isShowCamera);
        bundle.putBoolean(com.luck.picture.lib.config.PictureConfig.EXTRA_BOTTOM_PREVIEW, this.isInternalBottomPreview);
        bundle.putString(com.luck.picture.lib.config.PictureConfig.EXTRA_CURRENT_ALBUM_NAME, this.currentAlbum);
        this.selectorConfig.addSelectedPreviewResult(this.mData);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public android.view.animation.Animation onCreateAnimation(int i, boolean z, int i2) {
        if (isHasMagicalEffect()) {
            return null;
        }
        com.luck.picture.lib.style.PictureWindowAnimationStyle windowAnimationStyle = this.selectorConfig.selectorStyle.getWindowAnimationStyle();
        if (windowAnimationStyle.activityPreviewEnterAnimation != 0 && windowAnimationStyle.activityPreviewExitAnimation != 0) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getActivity(), z ? windowAnimationStyle.activityPreviewEnterAnimation : windowAnimationStyle.activityPreviewExitAnimation);
            if (z) {
                onEnterFragment();
            } else {
                onExitFragment();
            }
            return loadAnimation;
        }
        return super.onCreateAnimation(i, z, i2);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void sendChangeSubSelectPositionEvent(boolean z) {
        if (this.selectorConfig.selectorStyle.getSelectMainStyle().isPreviewSelectNumberStyle() && this.selectorConfig.selectorStyle.getSelectMainStyle().isSelectNumberStyle()) {
            int i = 0;
            while (i < this.selectorConfig.getSelectCount()) {
                com.luck.picture.lib.entity.LocalMedia localMedia = this.selectorConfig.getSelectedResult().get(i);
                i++;
                localMedia.setNum(i);
            }
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (isHasMagicalEffect()) {
            int size = this.mData.size();
            int i = this.curPosition;
            if (size > i) {
                com.luck.picture.lib.entity.LocalMedia localMedia = this.mData.get(i);
                if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(localMedia.getMimeType())) {
                    getVideoRealSizeFromMedia(localMedia, false, new com.luck.picture.lib.interfaces.OnCallbackListener<int[]>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.2
                        @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                        public void onCall(int[] iArr) {
                            com.luck.picture.lib.PictureSelectorPreviewFragment.this.changeViewParams(iArr);
                        }
                    });
                } else {
                    getImageRealSizeFromMedia(localMedia, false, new com.luck.picture.lib.interfaces.OnCallbackListener<int[]>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.3
                        @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                        public void onCall(int[] iArr) {
                            com.luck.picture.lib.PictureSelectorPreviewFragment.this.changeViewParams(iArr);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeViewParams(int[] iArr) {
        com.luck.picture.lib.magical.ViewParams itemViewParams = com.luck.picture.lib.magical.BuildRecycleItemViewParams.getItemViewParams(this.isShowCamera ? this.curPosition + 1 : this.curPosition);
        if (itemViewParams == null || iArr[0] == 0 || iArr[1] == 0) {
            this.magicalView.setViewParams(0, 0, 0, 0, iArr[0], iArr[1]);
            this.magicalView.resetStartNormal(iArr[0], iArr[1], false);
        } else {
            this.magicalView.setViewParams(itemViewParams.left, itemViewParams.top, itemViewParams.width, itemViewParams.height, iArr[0], iArr[1]);
            this.magicalView.resetStart();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onCreateLoader() {
        com.luck.picture.lib.loader.IBridgeMediaLoader localMediaLoader;
        if (this.isExternalPreview) {
            return;
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public void loadMoreData() {
        this.mPage++;
        if (this.selectorConfig.loaderDataEngine != null) {
            this.selectorConfig.loaderDataEngine.loadMoreMediaData(getContext(), this.mBucketId, this.mPage, this.selectorConfig.pageSize, this.selectorConfig.pageSize, new com.luck.picture.lib.interfaces.OnQueryDataResultListener<com.luck.picture.lib.entity.LocalMedia>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.4
                @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                public void onComplete(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList, boolean z) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.handleMoreData(arrayList, z);
                }
            });
        } else {
            this.mLoader.loadPageMediaData(this.mBucketId, this.mPage, this.selectorConfig.pageSize, new com.luck.picture.lib.interfaces.OnQueryDataResultListener<com.luck.picture.lib.entity.LocalMedia>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.5
                @Override // com.luck.picture.lib.interfaces.OnQueryDataResultListener
                public void onComplete(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList, boolean z) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.handleMoreData(arrayList, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMoreData(java.util.List<com.luck.picture.lib.entity.LocalMedia> list, boolean z) {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        this.isHasMore = z;
        if (z) {
            if (list.size() > 0) {
                int size = this.mData.size();
                this.mData.addAll(list);
                this.viewPageAdapter.notifyItemRangeChanged(size, this.mData.size());
                return;
            }
            loadMoreData();
        }
    }

    private void initComplete() {
        final com.luck.picture.lib.style.SelectMainStyle selectMainStyle = this.selectorConfig.selectorStyle.getSelectMainStyle();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectMainStyle.getPreviewSelectBackground())) {
            this.tvSelected.setBackgroundResource(selectMainStyle.getPreviewSelectBackground());
        } else if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectMainStyle.getSelectBackground())) {
            this.tvSelected.setBackgroundResource(selectMainStyle.getSelectBackground());
        }
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectMainStyle.getPreviewSelectTextResId())) {
            this.tvSelectedWord.setText(getString(selectMainStyle.getPreviewSelectTextResId()));
        } else if (com.luck.picture.lib.utils.StyleUtils.checkTextValidity(selectMainStyle.getPreviewSelectText())) {
            this.tvSelectedWord.setText(selectMainStyle.getPreviewSelectText());
        } else {
            this.tvSelectedWord.setText("");
        }
        if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(selectMainStyle.getPreviewSelectTextSize())) {
            this.tvSelectedWord.setTextSize(selectMainStyle.getPreviewSelectTextSize());
        }
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectMainStyle.getPreviewSelectTextColor())) {
            this.tvSelectedWord.setTextColor(selectMainStyle.getPreviewSelectTextColor());
        }
        if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(selectMainStyle.getPreviewSelectMarginRight())) {
            if (this.tvSelected.getLayoutParams() instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                if (this.tvSelected.getLayoutParams() instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                    this.tvSelected.getLayoutParams().rightMargin = selectMainStyle.getPreviewSelectMarginRight();
                }
            } else if (this.tvSelected.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams) {
                ((android.widget.RelativeLayout.LayoutParams) this.tvSelected.getLayoutParams()).rightMargin = selectMainStyle.getPreviewSelectMarginRight();
            }
        }
        this.completeSelectView.setCompleteSelectViewStyle();
        this.completeSelectView.setSelectedChange(true);
        if (selectMainStyle.isCompleteSelectRelativeTop()) {
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
        if (selectMainStyle.isPreviewSelectRelativeBottom()) {
            if (this.tvSelected.getLayoutParams() instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                this.tvSelected.getLayoutParams().topToTop = com.luck.picture.lib.R.id.bottom_nar_bar;
                this.tvSelected.getLayoutParams().bottomToBottom = com.luck.picture.lib.R.id.bottom_nar_bar;
                this.tvSelectedWord.getLayoutParams().topToTop = com.luck.picture.lib.R.id.bottom_nar_bar;
                this.tvSelectedWord.getLayoutParams().bottomToBottom = com.luck.picture.lib.R.id.bottom_nar_bar;
                this.selectClickArea.getLayoutParams().topToTop = com.luck.picture.lib.R.id.bottom_nar_bar;
                this.selectClickArea.getLayoutParams().bottomToBottom = com.luck.picture.lib.R.id.bottom_nar_bar;
            }
        } else if (this.selectorConfig.isPreviewFullScreenMode) {
            if (this.tvSelectedWord.getLayoutParams() instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                this.tvSelectedWord.getLayoutParams().topMargin = com.luck.picture.lib.utils.DensityUtil.getStatusBarHeight(getContext());
            } else if (this.tvSelectedWord.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams) {
                ((android.widget.RelativeLayout.LayoutParams) this.tvSelectedWord.getLayoutParams()).topMargin = com.luck.picture.lib.utils.DensityUtil.getStatusBarHeight(getContext());
            }
        }
        this.completeSelectView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.6
            /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
            
                if (r4.this$0.selectorConfig.getSelectCount() > 0) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
            
                if (r5.confirmSelect(r5.mData.get(r4.this$0.viewPager.getCurrentItem()), false) == 0) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
            
                r0 = false;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.view.View r5) {
                /*
                    r4 = this;
                    com.luck.picture.lib.style.SelectMainStyle r5 = r2
                    boolean r5 = r5.isCompleteSelectRelativeTop()
                    r0 = 1
                    r1 = 0
                    if (r5 == 0) goto L31
                    com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                    com.luck.picture.lib.config.SelectorConfig r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.access$200(r5)
                    int r5 = r5.getSelectCount()
                    if (r5 != 0) goto L31
                    com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                    java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> r2 = r5.mData
                    com.luck.picture.lib.PictureSelectorPreviewFragment r3 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                    androidx.viewpager2.widget.ViewPager2 r3 = r3.viewPager
                    int r3 = r3.getCurrentItem()
                    java.lang.Object r2 = r2.get(r3)
                    com.luck.picture.lib.entity.LocalMedia r2 = (com.luck.picture.lib.entity.LocalMedia) r2
                    int r5 = r5.confirmSelect(r2, r1)
                    if (r5 != 0) goto L2f
                    goto L3d
                L2f:
                    r0 = 0
                    goto L3d
                L31:
                    com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                    com.luck.picture.lib.config.SelectorConfig r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.access$300(r5)
                    int r5 = r5.getSelectCount()
                    if (r5 <= 0) goto L2f
                L3d:
                    com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                    com.luck.picture.lib.config.SelectorConfig r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.access$400(r5)
                    boolean r5 = r5.isEmptyResultReturn
                    if (r5 == 0) goto L59
                    com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                    com.luck.picture.lib.config.SelectorConfig r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.access$500(r5)
                    int r5 = r5.getSelectCount()
                    if (r5 != 0) goto L59
                    com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                    r5.onExitPictureSelector()
                    goto L60
                L59:
                    if (r0 == 0) goto L60
                    com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                    com.luck.picture.lib.PictureSelectorPreviewFragment.access$600(r5)
                L60:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.PictureSelectorPreviewFragment.AnonymousClass6.onClick(android.view.View):void");
            }
        });
    }

    private void initTitleBar() {
        if (this.selectorConfig.selectorStyle.getTitleBarStyle().isHideTitleBar()) {
            this.titleBar.setVisibility(8);
        }
        this.titleBar.setTitleBarStyle();
        this.titleBar.setOnTitleBarListener(new com.luck.picture.lib.widget.TitleBar.OnTitleBarListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.7
            @Override // com.luck.picture.lib.widget.TitleBar.OnTitleBarListener
            public void onBackPressed() {
                if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.isExternalPreview) {
                    if (!com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.isPreviewZoomEffect) {
                        com.luck.picture.lib.PictureSelectorPreviewFragment.this.handleExternalPreviewBack();
                        return;
                    } else {
                        com.luck.picture.lib.PictureSelectorPreviewFragment.this.magicalView.backToMin();
                        return;
                    }
                }
                if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.isInternalBottomPreview || !com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.isPreviewZoomEffect) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.onBackCurrentFragment();
                } else {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.magicalView.backToMin();
                }
            }
        });
        this.titleBar.setTitle((this.curPosition + 1) + "/" + this.totalNum);
        this.titleBar.getImageDelete().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.8
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.deletePreview();
            }
        });
        this.selectClickArea.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.9
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.isExternalPreview) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.deletePreview();
                    return;
                }
                com.luck.picture.lib.entity.LocalMedia localMedia = com.luck.picture.lib.PictureSelectorPreviewFragment.this.mData.get(com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPager.getCurrentItem());
                com.luck.picture.lib.PictureSelectorPreviewFragment pictureSelectorPreviewFragment = com.luck.picture.lib.PictureSelectorPreviewFragment.this;
                if (pictureSelectorPreviewFragment.confirmSelect(localMedia, pictureSelectorPreviewFragment.tvSelected.isSelected()) == 0) {
                    if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.onSelectAnimListener != null) {
                        com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.onSelectAnimListener.onSelectAnim(com.luck.picture.lib.PictureSelectorPreviewFragment.this.tvSelected);
                    } else {
                        com.luck.picture.lib.PictureSelectorPreviewFragment.this.tvSelected.startAnimation(android.view.animation.AnimationUtils.loadAnimation(com.luck.picture.lib.PictureSelectorPreviewFragment.this.getContext(), com.luck.picture.lib.R.anim.ps_anim_modal_in));
                    }
                }
            }
        });
        this.tvSelected.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.10
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectClickArea.performClick();
            }
        });
    }

    protected void initPreviewSelectGallery(android.view.ViewGroup viewGroup) {
        com.luck.picture.lib.style.SelectMainStyle selectMainStyle = this.selectorConfig.selectorStyle.getSelectMainStyle();
        if (selectMainStyle.isPreviewDisplaySelectGallery()) {
            this.mGalleryRecycle = new androidx.recyclerview.widget.RecyclerView(getContext());
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectMainStyle.getAdapterPreviewGalleryBackgroundResource())) {
                this.mGalleryRecycle.setBackgroundResource(selectMainStyle.getAdapterPreviewGalleryBackgroundResource());
            } else {
                this.mGalleryRecycle.setBackgroundResource(com.luck.picture.lib.R.drawable.ps_preview_gallery_bg);
            }
            viewGroup.addView(this.mGalleryRecycle);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = this.mGalleryRecycle.getLayoutParams();
            if (layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = layoutParams;
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                layoutParams2.bottomToTop = com.luck.picture.lib.R.id.bottom_nar_bar;
                layoutParams2.startToStart = 0;
                layoutParams2.endToEnd = 0;
            }
            com.luck.picture.lib.decoration.WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new com.luck.picture.lib.decoration.WrapContentLinearLayoutManager(getContext()) { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.11
                public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state, int i) {
                    super.smoothScrollToPosition(recyclerView, state, i);
                    androidx.recyclerview.widget.LinearSmoothScroller linearSmoothScroller = new androidx.recyclerview.widget.LinearSmoothScroller(recyclerView.getContext()) { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.11.1
                        protected float calculateSpeedPerPixel(android.util.DisplayMetrics displayMetrics) {
                            return 300.0f / displayMetrics.densityDpi;
                        }
                    };
                    linearSmoothScroller.setTargetPosition(i);
                    startSmoothScroll(linearSmoothScroller);
                }
            };
            androidx.recyclerview.widget.SimpleItemAnimator itemAnimator = this.mGalleryRecycle.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.setSupportsChangeAnimations(false);
            }
            if (this.mGalleryRecycle.getItemDecorationCount() == 0) {
                this.mGalleryRecycle.addItemDecoration(new com.luck.picture.lib.decoration.HorizontalItemDecoration(com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER, com.luck.picture.lib.utils.DensityUtil.dip2px(getContext(), 6.0f)));
            }
            wrapContentLinearLayoutManager.setOrientation(0);
            this.mGalleryRecycle.setLayoutManager(wrapContentLinearLayoutManager);
            if (this.selectorConfig.getSelectCount() > 0) {
                this.mGalleryRecycle.setLayoutAnimation(android.view.animation.AnimationUtils.loadLayoutAnimation(getContext(), com.luck.picture.lib.R.anim.ps_anim_layout_fall_enter));
            }
            this.mGalleryAdapter = new com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter(this.selectorConfig, this.isInternalBottomPreview);
            notifyGallerySelectMedia(this.mData.get(this.curPosition));
            this.mGalleryRecycle.setAdapter(this.mGalleryAdapter);
            this.mGalleryAdapter.setItemClickListener(new com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.OnItemClickListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.12
                @Override // com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.OnItemClickListener
                public void onItemClick(final int i, com.luck.picture.lib.entity.LocalMedia localMedia, android.view.View view) {
                    if (i == -1) {
                        return;
                    }
                    java.lang.String string = android.text.TextUtils.isEmpty(com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.defaultAlbumName) ? com.luck.picture.lib.PictureSelectorPreviewFragment.this.getString(com.luck.picture.lib.R.string.ps_camera_roll) : com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.defaultAlbumName;
                    if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.isInternalBottomPreview || android.text.TextUtils.equals(com.luck.picture.lib.PictureSelectorPreviewFragment.this.currentAlbum, string) || android.text.TextUtils.equals(localMedia.getParentFolderName(), com.luck.picture.lib.PictureSelectorPreviewFragment.this.currentAlbum)) {
                        if (!com.luck.picture.lib.PictureSelectorPreviewFragment.this.isInternalBottomPreview) {
                            i = com.luck.picture.lib.PictureSelectorPreviewFragment.this.isShowCamera ? localMedia.position - 1 : localMedia.position;
                        }
                        if (i == com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPager.getCurrentItem() && localMedia.isChecked()) {
                            return;
                        }
                        com.luck.picture.lib.entity.LocalMedia item = com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPageAdapter.getItem(i);
                        if (item == null || (android.text.TextUtils.equals(localMedia.getPath(), item.getPath()) && localMedia.getId() == item.getId())) {
                            if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPager.getAdapter() != null) {
                                com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPager.setAdapter((androidx.recyclerview.widget.RecyclerView.Adapter) null);
                                com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPager.setAdapter(com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPageAdapter);
                            }
                            com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPager.setCurrentItem(i, false);
                            com.luck.picture.lib.PictureSelectorPreviewFragment.this.notifyGallerySelectMedia(localMedia);
                            com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPager.post(new java.lang.Runnable() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.12.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.isPreviewZoomEffect) {
                                        com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPageAdapter.setVideoPlayButtonUI(i);
                                    }
                                }
                            });
                        }
                    }
                }
            });
            if (this.selectorConfig.getSelectCount() > 0) {
                this.mGalleryRecycle.setVisibility(0);
            } else {
                this.mGalleryRecycle.setVisibility(4);
            }
            addAminViews(this.mGalleryRecycle);
            final androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = new androidx.recyclerview.widget.ItemTouchHelper(new androidx.recyclerview.widget.ItemTouchHelper.Callback() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.13
                public boolean isLongPressDragEnabled() {
                    return true;
                }

                public void onSwiped(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
                }

                public int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
                    viewHolder.itemView.setAlpha(0.7f);
                    return makeMovementFlags(12, 0);
                }

                public boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2) {
                    try {
                        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                        int absoluteAdapterPosition2 = viewHolder2.getAbsoluteAdapterPosition();
                        if (absoluteAdapterPosition < absoluteAdapterPosition2) {
                            int i = absoluteAdapterPosition;
                            while (i < absoluteAdapterPosition2) {
                                int i2 = i + 1;
                                java.util.Collections.swap(com.luck.picture.lib.PictureSelectorPreviewFragment.this.mGalleryAdapter.getData(), i, i2);
                                java.util.Collections.swap(com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.getSelectedResult(), i, i2);
                                if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.isInternalBottomPreview) {
                                    java.util.Collections.swap(com.luck.picture.lib.PictureSelectorPreviewFragment.this.mData, i, i2);
                                }
                                i = i2;
                            }
                        } else {
                            for (int i3 = absoluteAdapterPosition; i3 > absoluteAdapterPosition2; i3--) {
                                int i4 = i3 - 1;
                                java.util.Collections.swap(com.luck.picture.lib.PictureSelectorPreviewFragment.this.mGalleryAdapter.getData(), i3, i4);
                                java.util.Collections.swap(com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.getSelectedResult(), i3, i4);
                                if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.isInternalBottomPreview) {
                                    java.util.Collections.swap(com.luck.picture.lib.PictureSelectorPreviewFragment.this.mData, i3, i4);
                                }
                            }
                        }
                        com.luck.picture.lib.PictureSelectorPreviewFragment.this.mGalleryAdapter.notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
                        return true;
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                        return true;
                    }
                }

                public void onChildDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
                    if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.needScaleBig) {
                        com.luck.picture.lib.PictureSelectorPreviewFragment.this.needScaleBig = false;
                        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                        animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(viewHolder.itemView, "scaleX", 1.0f, 1.1f), android.animation.ObjectAnimator.ofFloat(viewHolder.itemView, "scaleY", 1.0f, 1.1f));
                        animatorSet.setDuration(50L);
                        animatorSet.setInterpolator(new android.view.animation.LinearInterpolator());
                        animatorSet.start();
                        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.13.1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(android.animation.Animator animator) {
                                com.luck.picture.lib.PictureSelectorPreviewFragment.this.needScaleSmall = true;
                            }
                        });
                    }
                    super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
                }

                public void onSelectedChanged(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
                    super.onSelectedChanged(viewHolder, i);
                }

                public long getAnimationDuration(androidx.recyclerview.widget.RecyclerView recyclerView, int i, float f, float f2) {
                    return super.getAnimationDuration(recyclerView, i, f, f2);
                }

                public void clearView(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
                    int lastCheckPosition;
                    viewHolder.itemView.setAlpha(1.0f);
                    if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.needScaleSmall) {
                        com.luck.picture.lib.PictureSelectorPreviewFragment.this.needScaleSmall = false;
                        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                        animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(viewHolder.itemView, "scaleX", 1.1f, 1.0f), android.animation.ObjectAnimator.ofFloat(viewHolder.itemView, "scaleY", 1.1f, 1.0f));
                        animatorSet.setInterpolator(new android.view.animation.LinearInterpolator());
                        animatorSet.setDuration(50L);
                        animatorSet.start();
                        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.13.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(android.animation.Animator animator) {
                                com.luck.picture.lib.PictureSelectorPreviewFragment.this.needScaleBig = true;
                            }
                        });
                    }
                    super.clearView(recyclerView, viewHolder);
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.mGalleryAdapter.notifyItemChanged(viewHolder.getAbsoluteAdapterPosition());
                    if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.isInternalBottomPreview && com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPager.getCurrentItem() != (lastCheckPosition = com.luck.picture.lib.PictureSelectorPreviewFragment.this.mGalleryAdapter.getLastCheckPosition()) && lastCheckPosition != -1) {
                        if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPager.getAdapter() != null) {
                            com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPager.setAdapter((androidx.recyclerview.widget.RecyclerView.Adapter) null);
                            com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPager.setAdapter(com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPageAdapter);
                        }
                        com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPager.setCurrentItem(lastCheckPosition, false);
                    }
                    if (!com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.selectorStyle.getSelectMainStyle().isSelectNumberStyle() || com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(com.luck.picture.lib.PictureSelectorPreviewFragment.this.getActivity())) {
                        return;
                    }
                    java.util.List fragments = com.luck.picture.lib.PictureSelectorPreviewFragment.this.getActivity().getSupportFragmentManager().getFragments();
                    for (int i = 0; i < fragments.size(); i++) {
                        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) fragments.get(i);
                        if (fragment instanceof com.luck.picture.lib.basic.PictureCommonFragment) {
                            ((com.luck.picture.lib.basic.PictureCommonFragment) fragment).sendChangeSubSelectPositionEvent(true);
                        }
                    }
                }
            });
            itemTouchHelper.attachToRecyclerView(this.mGalleryRecycle);
            this.mGalleryAdapter.setItemLongClickListener(new com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.OnItemLongClickListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.14
                @Override // com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.OnItemLongClickListener
                public void onItemLongClick(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, android.view.View view) {
                    ((android.os.Vibrator) com.luck.picture.lib.PictureSelectorPreviewFragment.this.getActivity().getSystemService("vibrator")).vibrate(50L);
                    if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.mGalleryAdapter.getItemCount() != com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.maxSelectNum) {
                        itemTouchHelper.startDrag(viewHolder);
                    } else if (viewHolder.getLayoutPosition() != com.luck.picture.lib.PictureSelectorPreviewFragment.this.mGalleryAdapter.getItemCount() - 1) {
                        itemTouchHelper.startDrag(viewHolder);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyGallerySelectMedia(com.luck.picture.lib.entity.LocalMedia localMedia) {
        if (this.mGalleryAdapter == null || !this.selectorConfig.selectorStyle.getSelectMainStyle().isPreviewDisplaySelectGallery()) {
            return;
        }
        this.mGalleryAdapter.isSelectMedia(localMedia);
    }

    private void notifyPreviewGalleryData(boolean z, com.luck.picture.lib.entity.LocalMedia localMedia) {
        if (this.mGalleryAdapter == null || !this.selectorConfig.selectorStyle.getSelectMainStyle().isPreviewDisplaySelectGallery()) {
            return;
        }
        if (this.mGalleryRecycle.getVisibility() == 4) {
            this.mGalleryRecycle.setVisibility(0);
        }
        if (z) {
            if (this.selectorConfig.selectionMode == 1) {
                this.mGalleryAdapter.clear();
            }
            this.mGalleryAdapter.addGalleryData(localMedia);
            this.mGalleryRecycle.smoothScrollToPosition(this.mGalleryAdapter.getItemCount() - 1);
            return;
        }
        this.mGalleryAdapter.removeGalleryData(localMedia);
        if (this.selectorConfig.getSelectCount() == 0) {
            this.mGalleryRecycle.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deletePreview() {
        if (!this.isDisplayDelete || this.selectorConfig.onExternalPreviewEventListener == null) {
            return;
        }
        this.selectorConfig.onExternalPreviewEventListener.onPreviewDelete(this.viewPager.getCurrentItem());
        int currentItem = this.viewPager.getCurrentItem();
        this.mData.remove(currentItem);
        if (this.mData.size() == 0) {
            handleExternalPreviewBack();
            return;
        }
        this.titleBar.setTitle(getString(com.luck.picture.lib.R.string.ps_preview_image_num, new java.lang.Object[]{java.lang.Integer.valueOf(this.curPosition + 1), java.lang.Integer.valueOf(this.mData.size())}));
        this.totalNum = this.mData.size();
        this.curPosition = currentItem;
        if (this.viewPager.getAdapter() != null) {
            this.viewPager.setAdapter((androidx.recyclerview.widget.RecyclerView.Adapter) null);
            this.viewPager.setAdapter(this.viewPageAdapter);
        }
        this.viewPager.setCurrentItem(this.curPosition, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleExternalPreviewBack() {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        if (this.selectorConfig.isPreviewFullScreenMode) {
            hideFullScreenStatusBar();
        }
        onExitPictureSelector();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onExitFragment() {
        if (this.selectorConfig.isPreviewFullScreenMode) {
            hideFullScreenStatusBar();
        }
    }

    private void initBottomNavBar() {
        this.bottomNarBar.setBottomNavBarStyle();
        this.bottomNarBar.setSelectedChange();
        this.bottomNarBar.setOnBottomNavBarListener(new com.luck.picture.lib.widget.BottomNavBar.OnBottomNavBarListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.15
            @Override // com.luck.picture.lib.widget.BottomNavBar.OnBottomNavBarListener
            public void onEditImage() {
                if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.onEditMediaEventListener != null) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.onEditMediaEventListener.onStartMediaEdit(com.luck.picture.lib.PictureSelectorPreviewFragment.this, com.luck.picture.lib.PictureSelectorPreviewFragment.this.mData.get(com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPager.getCurrentItem()), com.luck.picture.lib.config.Crop.REQUEST_EDIT_CROP);
                }
            }

            @Override // com.luck.picture.lib.widget.BottomNavBar.OnBottomNavBarListener
            public void onCheckOriginalChange() {
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.sendSelectedOriginalChangeEvent();
            }

            @Override // com.luck.picture.lib.widget.BottomNavBar.OnBottomNavBarListener
            public void onFirstCheckOriginalSelectedChange() {
                int currentItem = com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPager.getCurrentItem();
                if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.mData.size() > currentItem) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.confirmSelect(com.luck.picture.lib.PictureSelectorPreviewFragment.this.mData.get(currentItem), false);
                }
            }
        });
    }

    private void externalPreviewStyle() {
        this.titleBar.getImageDelete().setVisibility(this.isDisplayDelete ? 0 : 8);
        this.tvSelected.setVisibility(8);
        this.bottomNarBar.setVisibility(8);
        this.completeSelectView.setVisibility(8);
    }

    protected com.luck.picture.lib.adapter.PicturePreviewAdapter createAdapter() {
        return new com.luck.picture.lib.adapter.PicturePreviewAdapter(this.selectorConfig);
    }

    public com.luck.picture.lib.adapter.PicturePreviewAdapter getAdapter() {
        return this.viewPageAdapter;
    }

    public androidx.viewpager2.widget.ViewPager2 getViewPager2() {
        return this.viewPager;
    }

    private void initViewPagerData(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        int i;
        com.luck.picture.lib.adapter.PicturePreviewAdapter createAdapter = createAdapter();
        this.viewPageAdapter = createAdapter;
        createAdapter.setData(arrayList);
        this.viewPageAdapter.setOnPreviewEventListener(new com.luck.picture.lib.PictureSelectorPreviewFragment.MyOnPreviewEventListener());
        this.viewPager.setOrientation(0);
        this.viewPager.setAdapter(this.viewPageAdapter);
        this.selectorConfig.selectedPreviewResult.clear();
        if (arrayList.size() == 0 || this.curPosition >= arrayList.size() || (i = this.curPosition) < 0) {
            onKeyBackFragmentFinish();
            return;
        }
        com.luck.picture.lib.entity.LocalMedia localMedia = arrayList.get(i);
        this.bottomNarBar.isDisplayEditor(com.luck.picture.lib.config.PictureMimeType.isHasVideo(localMedia.getMimeType()) || com.luck.picture.lib.config.PictureMimeType.isHasAudio(localMedia.getMimeType()));
        this.tvSelected.setSelected(this.selectorConfig.getSelectedResult().contains(arrayList.get(this.viewPager.getCurrentItem())));
        this.viewPager.registerOnPageChangeCallback(this.pageChangeCallback);
        this.viewPager.setPageTransformer(new androidx.viewpager2.widget.MarginPageTransformer(com.luck.picture.lib.utils.DensityUtil.dip2px(getAppContext(), 3.0f)));
        this.viewPager.setCurrentItem(this.curPosition, false);
        sendChangeSubSelectPositionEvent(false);
        notifySelectNumberStyle(arrayList.get(this.curPosition));
        startZoomEffect(localMedia);
    }

    protected void startZoomEffect(com.luck.picture.lib.entity.LocalMedia localMedia) {
        if (this.isSaveInstanceState || this.isInternalBottomPreview || !this.selectorConfig.isPreviewZoomEffect) {
            return;
        }
        this.viewPager.post(new java.lang.Runnable() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.16
            @Override // java.lang.Runnable
            public void run() {
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPageAdapter.setCoverScaleType(com.luck.picture.lib.PictureSelectorPreviewFragment.this.curPosition);
            }
        });
        if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(localMedia.getMimeType())) {
            getVideoRealSizeFromMedia(localMedia, !com.luck.picture.lib.config.PictureMimeType.isHasHttp(localMedia.getAvailablePath()), new com.luck.picture.lib.interfaces.OnCallbackListener<int[]>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.17
                @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                public void onCall(int[] iArr) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.start(iArr);
                }
            });
        } else {
            getImageRealSizeFromMedia(localMedia, !com.luck.picture.lib.config.PictureMimeType.isHasHttp(localMedia.getAvailablePath()), new com.luck.picture.lib.interfaces.OnCallbackListener<int[]>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.18
                @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                public void onCall(int[] iArr) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.start(iArr);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void start(final int[] iArr) {
        this.magicalView.changeRealScreenHeight(iArr[0], iArr[1], false);
        com.luck.picture.lib.magical.ViewParams itemViewParams = com.luck.picture.lib.magical.BuildRecycleItemViewParams.getItemViewParams(this.isShowCamera ? this.curPosition + 1 : this.curPosition);
        if (itemViewParams == null || (iArr[0] == 0 && iArr[1] == 0)) {
            this.viewPager.post(new java.lang.Runnable() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.19
                @Override // java.lang.Runnable
                public void run() {
                    com.luck.picture.lib.magical.MagicalView magicalView = com.luck.picture.lib.PictureSelectorPreviewFragment.this.magicalView;
                    int[] iArr2 = iArr;
                    magicalView.startNormal(iArr2[0], iArr2[1], false);
                }
            });
            this.magicalView.setBackgroundAlpha(1.0f);
            for (int i = 0; i < this.mAnimViews.size(); i++) {
                this.mAnimViews.get(i).setAlpha(1.0f);
            }
        } else {
            this.magicalView.setViewParams(itemViewParams.left, itemViewParams.top, itemViewParams.width, itemViewParams.height, iArr[0], iArr[1]);
            this.magicalView.start(false);
        }
        android.animation.ObjectAnimator.ofFloat(this.viewPager, "alpha", 0.0f, 1.0f).setDuration(50L).start();
    }

    private class MyOnPreviewEventListener implements com.luck.picture.lib.adapter.holder.BasePreviewHolder.OnPreviewEventListener {
        private MyOnPreviewEventListener() {
        }

        @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder.OnPreviewEventListener
        public void onBackPressed() {
            if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.isPreviewFullScreenMode) {
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.previewFullScreenMode();
                return;
            }
            if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.isExternalPreview) {
                if (!com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.isPreviewZoomEffect) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.handleExternalPreviewBack();
                    return;
                } else {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.magicalView.backToMin();
                    return;
                }
            }
            if (com.luck.picture.lib.PictureSelectorPreviewFragment.this.isInternalBottomPreview || !com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.isPreviewZoomEffect) {
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.onBackCurrentFragment();
            } else {
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.magicalView.backToMin();
            }
        }

        @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder.OnPreviewEventListener
        public void onPreviewVideoTitle(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.titleBar.setTitle((com.luck.picture.lib.PictureSelectorPreviewFragment.this.curPosition + 1) + "/" + com.luck.picture.lib.PictureSelectorPreviewFragment.this.totalNum);
                return;
            }
            com.luck.picture.lib.PictureSelectorPreviewFragment.this.titleBar.setTitle(str);
        }

        @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder.OnPreviewEventListener
        public void onLongPressDownload(com.luck.picture.lib.entity.LocalMedia localMedia) {
            if (!com.luck.picture.lib.PictureSelectorPreviewFragment.this.selectorConfig.isHidePreviewDownload && com.luck.picture.lib.PictureSelectorPreviewFragment.this.isExternalPreview) {
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.onExternalLongPressDownload(localMedia);
            }
        }
    }

    private void onKeyDownBackToMin() {
        if (com.luck.picture.lib.utils.ActivityCompatHelper.isDestroy(getActivity())) {
            return;
        }
        if (this.isExternalPreview) {
            if (this.selectorConfig.isPreviewZoomEffect) {
                this.magicalView.backToMin();
                return;
            } else {
                onExitPictureSelector();
                return;
            }
        }
        if (this.isInternalBottomPreview) {
            onBackCurrentFragment();
        } else if (this.selectorConfig.isPreviewZoomEffect) {
            this.magicalView.backToMin();
        } else {
            onBackCurrentFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void previewFullScreenMode() {
        if (this.isAnimationStart) {
            return;
        }
        final boolean z = this.titleBar.getTranslationY() == 0.0f;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        float f = z ? 0.0f : -this.titleBar.getHeight();
        float f2 = z ? -this.titleBar.getHeight() : 0.0f;
        float f3 = z ? 1.0f : 0.0f;
        float f4 = z ? 0.0f : 1.0f;
        for (int i = 0; i < this.mAnimViews.size(); i++) {
            android.view.View view = this.mAnimViews.get(i);
            animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(view, "alpha", f3, f4));
            if (view instanceof com.luck.picture.lib.widget.TitleBar) {
                animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(view, "translationY", f, f2));
            }
        }
        animatorSet.setDuration(350L);
        animatorSet.start();
        this.isAnimationStart = true;
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.20
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.isAnimationStart = false;
                if (com.luck.picture.lib.utils.SdkVersionUtils.isP() && com.luck.picture.lib.PictureSelectorPreviewFragment.this.isAdded()) {
                    android.view.Window window = com.luck.picture.lib.PictureSelectorPreviewFragment.this.requireActivity().getWindow();
                    android.view.WindowManager.LayoutParams attributes = window.getAttributes();
                    if (z) {
                        attributes.flags |= com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2;
                        attributes.layoutInDisplayCutoutMode = 1;
                        window.setAttributes(attributes);
                        window.addFlags(512);
                        return;
                    }
                    attributes.flags &= -1025;
                    window.setAttributes(attributes);
                    window.clearFlags(512);
                }
            }
        });
        if (z) {
            showFullScreenStatusBar();
        } else {
            hideFullScreenStatusBar();
        }
    }

    private void showFullScreenStatusBar() {
        for (int i = 0; i < this.mAnimViews.size(); i++) {
            this.mAnimViews.get(i).setEnabled(false);
        }
        this.bottomNarBar.getEditor().setEnabled(false);
    }

    private void hideFullScreenStatusBar() {
        for (int i = 0; i < this.mAnimViews.size(); i++) {
            this.mAnimViews.get(i).setEnabled(true);
        }
        this.bottomNarBar.getEditor().setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExternalLongPressDownload(final com.luck.picture.lib.entity.LocalMedia localMedia) {
        java.lang.String string;
        if (this.selectorConfig.onExternalPreviewEventListener == null || this.selectorConfig.onExternalPreviewEventListener.onLongPressDownload(getContext(), localMedia)) {
            return;
        }
        if (com.luck.picture.lib.config.PictureMimeType.isHasAudio(localMedia.getMimeType()) || com.luck.picture.lib.config.PictureMimeType.isUrlHasAudio(localMedia.getAvailablePath())) {
            string = getString(com.luck.picture.lib.R.string.ps_prompt_audio_content);
        } else if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(localMedia.getMimeType()) || com.luck.picture.lib.config.PictureMimeType.isUrlHasVideo(localMedia.getAvailablePath())) {
            string = getString(com.luck.picture.lib.R.string.ps_prompt_video_content);
        } else {
            string = getString(com.luck.picture.lib.R.string.ps_prompt_image_content);
        }
        com.luck.picture.lib.dialog.PictureCommonDialog.showDialog(getContext(), getString(com.luck.picture.lib.R.string.ps_prompt), string).setOnDialogEventListener(new com.luck.picture.lib.dialog.PictureCommonDialog.OnDialogEventListener() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.21
            @Override // com.luck.picture.lib.dialog.PictureCommonDialog.OnDialogEventListener
            public void onConfirm() {
                java.lang.String availablePath = localMedia.getAvailablePath();
                if (com.luck.picture.lib.config.PictureMimeType.isHasHttp(availablePath)) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.showLoading();
                }
                com.luck.picture.lib.utils.DownloadFileUtils.saveLocalFile(com.luck.picture.lib.PictureSelectorPreviewFragment.this.getContext(), availablePath, localMedia.getMimeType(), new com.luck.picture.lib.interfaces.OnCallbackListener<java.lang.String>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.21.1
                    @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                    public void onCall(java.lang.String str) {
                        java.lang.String string2;
                        com.luck.picture.lib.PictureSelectorPreviewFragment.this.dismissLoading();
                        if (android.text.TextUtils.isEmpty(str)) {
                            if (com.luck.picture.lib.config.PictureMimeType.isHasAudio(localMedia.getMimeType())) {
                                string2 = com.luck.picture.lib.PictureSelectorPreviewFragment.this.getString(com.luck.picture.lib.R.string.ps_save_audio_error);
                            } else if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(localMedia.getMimeType())) {
                                string2 = com.luck.picture.lib.PictureSelectorPreviewFragment.this.getString(com.luck.picture.lib.R.string.ps_save_video_error);
                            } else {
                                string2 = com.luck.picture.lib.PictureSelectorPreviewFragment.this.getString(com.luck.picture.lib.R.string.ps_save_image_error);
                            }
                            com.luck.picture.lib.utils.ToastUtils.showToast(com.luck.picture.lib.PictureSelectorPreviewFragment.this.getContext(), string2);
                            return;
                        }
                        new com.luck.picture.lib.basic.PictureMediaScannerConnection(com.luck.picture.lib.PictureSelectorPreviewFragment.this.getActivity(), str);
                        com.luck.picture.lib.utils.ToastUtils.showToast(com.luck.picture.lib.PictureSelectorPreviewFragment.this.getContext(), com.luck.picture.lib.PictureSelectorPreviewFragment.this.getString(com.luck.picture.lib.R.string.ps_save_success) + "\n" + str);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startAutoVideoPlay(final int i) {
        this.viewPager.post(new java.lang.Runnable() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.23
            @Override // java.lang.Runnable
            public void run() {
                com.luck.picture.lib.PictureSelectorPreviewFragment.this.viewPageAdapter.startAutoVideoPlay(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeMagicalViewParams(final int i) {
        com.luck.picture.lib.entity.LocalMedia localMedia = this.mData.get(i);
        if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(localMedia.getMimeType())) {
            getVideoRealSizeFromMedia(localMedia, false, new com.luck.picture.lib.interfaces.OnCallbackListener<int[]>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.24
                @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                public void onCall(int[] iArr) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.setMagicalViewParams(iArr[0], iArr[1], i);
                }
            });
        } else {
            getImageRealSizeFromMedia(localMedia, false, new com.luck.picture.lib.interfaces.OnCallbackListener<int[]>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.25
                @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                public void onCall(int[] iArr) {
                    com.luck.picture.lib.PictureSelectorPreviewFragment.this.setMagicalViewParams(iArr[0], iArr[1], i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMagicalViewParams(int i, int i2, int i3) {
        this.magicalView.changeRealScreenHeight(i, i2, true);
        if (this.isShowCamera) {
            i3++;
        }
        com.luck.picture.lib.magical.ViewParams itemViewParams = com.luck.picture.lib.magical.BuildRecycleItemViewParams.getItemViewParams(i3);
        if (itemViewParams == null || i == 0 || i2 == 0) {
            this.magicalView.setViewParams(0, 0, 0, 0, i, i2);
        } else {
            this.magicalView.setViewParams(itemViewParams.left, itemViewParams.top, itemViewParams.width, itemViewParams.height, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getImageRealSizeFromMedia(final com.luck.picture.lib.entity.LocalMedia r7, boolean r8, final com.luck.picture.lib.interfaces.OnCallbackListener<int[]> r9) {
        /*
            r6 = this;
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            boolean r0 = com.luck.picture.lib.utils.MediaUtils.isLongImage(r0, r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            int r8 = r6.screenWidth
            int r0 = r6.screenHeight
            goto L47
        L15:
            int r0 = r7.getWidth()
            int r3 = r7.getHeight()
            if (r8 == 0) goto L45
            if (r0 <= 0) goto L25
            if (r3 <= 0) goto L25
            if (r0 <= r3) goto L45
        L25:
            com.luck.picture.lib.config.SelectorConfig r8 = r6.selectorConfig
            boolean r8 = r8.isSyncWidthAndHeight
            if (r8 == 0) goto L45
            androidx.viewpager2.widget.ViewPager2 r8 = r6.viewPager
            r4 = 0
            r8.setAlpha(r4)
            android.content.Context r8 = r6.getContext()
            java.lang.String r4 = r7.getAvailablePath()
            com.luck.picture.lib.PictureSelectorPreviewFragment$26 r5 = new com.luck.picture.lib.PictureSelectorPreviewFragment$26
            r5.<init>()
            com.luck.picture.lib.utils.MediaUtils.getImageSize(r8, r4, r5)
            r8 = r0
            r0 = r3
            r3 = 0
            goto L48
        L45:
            r8 = r0
            r0 = r3
        L47:
            r3 = 1
        L48:
            boolean r4 = r7.isCut()
            if (r4 == 0) goto L62
            int r4 = r7.getCropImageWidth()
            if (r4 <= 0) goto L62
            int r4 = r7.getCropImageHeight()
            if (r4 <= 0) goto L62
            int r8 = r7.getCropImageWidth()
            int r0 = r7.getCropImageHeight()
        L62:
            if (r3 == 0) goto L6e
            r7 = 2
            int[] r7 = new int[r7]
            r7[r1] = r8
            r7[r2] = r0
            r9.onCall(r7)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.PictureSelectorPreviewFragment.getImageRealSizeFromMedia(com.luck.picture.lib.entity.LocalMedia, boolean, com.luck.picture.lib.interfaces.OnCallbackListener):void");
    }

    private void getVideoRealSizeFromMedia(final com.luck.picture.lib.entity.LocalMedia localMedia, boolean z, final com.luck.picture.lib.interfaces.OnCallbackListener<int[]> onCallbackListener) {
        boolean z2;
        if (!z || ((localMedia.getWidth() > 0 && localMedia.getHeight() > 0 && localMedia.getWidth() <= localMedia.getHeight()) || !this.selectorConfig.isSyncWidthAndHeight)) {
            z2 = true;
        } else {
            this.viewPager.setAlpha(0.0f);
            com.luck.picture.lib.utils.MediaUtils.getVideoSize(getContext(), localMedia.getAvailablePath(), new com.luck.picture.lib.interfaces.OnCallbackListener<com.luck.picture.lib.entity.MediaExtraInfo>() { // from class: com.luck.picture.lib.PictureSelectorPreviewFragment.27
                @Override // com.luck.picture.lib.interfaces.OnCallbackListener
                public void onCall(com.luck.picture.lib.entity.MediaExtraInfo mediaExtraInfo) {
                    if (mediaExtraInfo.getWidth() > 0) {
                        localMedia.setWidth(mediaExtraInfo.getWidth());
                    }
                    if (mediaExtraInfo.getHeight() > 0) {
                        localMedia.setHeight(mediaExtraInfo.getHeight());
                    }
                    com.luck.picture.lib.interfaces.OnCallbackListener onCallbackListener2 = onCallbackListener;
                    if (onCallbackListener2 != null) {
                        onCallbackListener2.onCall(new int[]{localMedia.getWidth(), localMedia.getHeight()});
                    }
                }
            });
            z2 = false;
        }
        if (z2) {
            onCallbackListener.onCall(new int[]{localMedia.getWidth(), localMedia.getHeight()});
        }
    }

    public void notifySelectNumberStyle(com.luck.picture.lib.entity.LocalMedia localMedia) {
        if (this.selectorConfig.selectorStyle.getSelectMainStyle().isPreviewSelectNumberStyle() && this.selectorConfig.selectorStyle.getSelectMainStyle().isSelectNumberStyle()) {
            this.tvSelected.setText("");
            for (int i = 0; i < this.selectorConfig.getSelectCount(); i++) {
                com.luck.picture.lib.entity.LocalMedia localMedia2 = this.selectorConfig.getSelectedResult().get(i);
                if (android.text.TextUtils.equals(localMedia2.getPath(), localMedia.getPath()) || localMedia2.getId() == localMedia.getId()) {
                    localMedia.setNum(localMedia2.getNum());
                    localMedia2.setPosition(localMedia.getPosition());
                    this.tvSelected.setText(com.luck.picture.lib.utils.ValueOf.toString(java.lang.Integer.valueOf(localMedia.getNum())));
                }
            }
        }
    }

    protected boolean isSelected(com.luck.picture.lib.entity.LocalMedia localMedia) {
        return this.selectorConfig.getSelectedResult().contains(localMedia);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, com.luck.picture.lib.basic.IPictureSelectorCommonEvent
    public void onEditMedia(android.content.Intent intent) {
        if (this.mData.size() > this.viewPager.getCurrentItem()) {
            com.luck.picture.lib.entity.LocalMedia localMedia = this.mData.get(this.viewPager.getCurrentItem());
            android.net.Uri output = com.luck.picture.lib.config.Crop.getOutput(intent);
            localMedia.setCutPath(output != null ? output.getPath() : "");
            localMedia.setCropImageWidth(com.luck.picture.lib.config.Crop.getOutputImageWidth(intent));
            localMedia.setCropImageHeight(com.luck.picture.lib.config.Crop.getOutputImageHeight(intent));
            localMedia.setCropOffsetX(com.luck.picture.lib.config.Crop.getOutputImageOffsetX(intent));
            localMedia.setCropOffsetY(com.luck.picture.lib.config.Crop.getOutputImageOffsetY(intent));
            localMedia.setCropResultAspectRatio(com.luck.picture.lib.config.Crop.getOutputCropAspectRatio(intent));
            localMedia.setCut(!android.text.TextUtils.isEmpty(localMedia.getCutPath()));
            localMedia.setCustomData(com.luck.picture.lib.config.Crop.getOutputCustomExtraData(intent));
            localMedia.setEditorImage(localMedia.isCut());
            localMedia.setSandboxPath(localMedia.getCutPath());
            if (this.selectorConfig.getSelectedResult().contains(localMedia)) {
                com.luck.picture.lib.entity.LocalMedia compareLocalMedia = localMedia.getCompareLocalMedia();
                if (compareLocalMedia != null) {
                    compareLocalMedia.setCutPath(localMedia.getCutPath());
                    compareLocalMedia.setCut(localMedia.isCut());
                    compareLocalMedia.setEditorImage(localMedia.isEditorImage());
                    compareLocalMedia.setCustomData(localMedia.getCustomData());
                    compareLocalMedia.setSandboxPath(localMedia.getCutPath());
                    compareLocalMedia.setCropImageWidth(com.luck.picture.lib.config.Crop.getOutputImageWidth(intent));
                    compareLocalMedia.setCropImageHeight(com.luck.picture.lib.config.Crop.getOutputImageHeight(intent));
                    compareLocalMedia.setCropOffsetX(com.luck.picture.lib.config.Crop.getOutputImageOffsetX(intent));
                    compareLocalMedia.setCropOffsetY(com.luck.picture.lib.config.Crop.getOutputImageOffsetY(intent));
                    compareLocalMedia.setCropResultAspectRatio(com.luck.picture.lib.config.Crop.getOutputCropAspectRatio(intent));
                }
                sendFixedSelectedChangeEvent(localMedia);
            } else {
                confirmSelect(localMedia, false);
            }
            this.viewPageAdapter.notifyItemChanged(this.viewPager.getCurrentItem());
            notifyGallerySelectMedia(localMedia);
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    protected void onExitPictureSelector() {
        com.luck.picture.lib.adapter.PicturePreviewAdapter picturePreviewAdapter = this.viewPageAdapter;
        if (picturePreviewAdapter != null) {
            picturePreviewAdapter.destroy();
        }
        super.onExitPictureSelector();
    }

    public void onResume() {
        super.onResume();
        if (this.isPause) {
            resumePausePlay();
            this.isPause = false;
        }
    }

    public void onPause() {
        super.onPause();
        if (isPlaying()) {
            resumePausePlay();
            this.isPause = true;
        }
    }

    private void resumePausePlay() {
        com.luck.picture.lib.adapter.holder.BasePreviewHolder currentHolder;
        com.luck.picture.lib.adapter.PicturePreviewAdapter picturePreviewAdapter = this.viewPageAdapter;
        if (picturePreviewAdapter == null || (currentHolder = picturePreviewAdapter.getCurrentHolder(this.viewPager.getCurrentItem())) == null) {
            return;
        }
        currentHolder.resumePausePlay();
    }

    private boolean isPlaying() {
        com.luck.picture.lib.adapter.PicturePreviewAdapter picturePreviewAdapter = this.viewPageAdapter;
        return picturePreviewAdapter != null && picturePreviewAdapter.isPlaying(this.viewPager.getCurrentItem());
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void onDestroy() {
        com.luck.picture.lib.adapter.PicturePreviewAdapter picturePreviewAdapter = this.viewPageAdapter;
        if (picturePreviewAdapter != null) {
            picturePreviewAdapter.destroy();
        }
        androidx.viewpager2.widget.ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.unregisterOnPageChangeCallback(this.pageChangeCallback);
        }
        super.onDestroy();
    }
}
