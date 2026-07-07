package com.qcwireless.qcwatch.ui.device.album;

/* compiled from: AlbumActivity.kt */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002-.B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000bH\u0002J \u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0002J\u0012\u0010\u001e\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u0013H\u0014J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0017J&\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020\u0013H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/album/AlbumActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/device/album/adapter/AlbumAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityAlbumBinding;", "currIndex", "", "data", "", "Lcom/qcwireless/qcwatch/ui/device/album/bean/AlbumBean;", "height", "queue", "Ljava/util/LinkedList;", "selectorStyle", "Lcom/luck/picture/lib/style/PictureSelectorStyle;", "width", "albumToDevice", "", "imageArray", "", "bitmapCompress", "bean", "compressBitmap", "bitmap", "Landroid/graphics/Bitmap;", "maxSizeBytes", "", "corner", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "scaleCropAndRoundImage", "imagePath", "", "targetWidth", "targetHeight", "cornerRadius", "", "setupViews", "ImageFileCompressEngine", "ImageFileCropEngine", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class AlbumActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.device.album.adapter.AlbumAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityAlbumBinding binding;
    private int currIndex;
    private com.luck.picture.lib.style.PictureSelectorStyle selectorStyle;
    private final java.util.List<com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean> data = new java.util.ArrayList();
    private final java.util.LinkedList<com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean> queue = new java.util.LinkedList<>();
    private int width = 368;
    private int height = 360;

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityAlbumBinding inflate = com.qcwireless.qcwatch.databinding.ActivityAlbumBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        androidx.constraintlayout.widget.ConstraintLayout root = inflate.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView((android.view.View) root);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(4);
        this.selectorStyle = new com.luck.picture.lib.style.PictureSelectorStyle();
        android.content.Context context = (android.content.Context) this;
        this.adapter = new com.qcwireless.qcwatch.ui.device.album.adapter.AlbumAdapter(context, this.data);
        com.qcwireless.qcwatch.databinding.ActivityAlbumBinding activityAlbumBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityAlbumBinding activityAlbumBinding2 = null;
        if (activityAlbumBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityAlbumBinding = null;
        }
        activityAlbumBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_574));
        activityAlbumBinding.rcvImage.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityAlbumBinding.rcvImage;
        com.qcwireless.qcwatch.ui.device.album.adapter.AlbumAdapter albumAdapter = this.adapter;
        if (albumAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            albumAdapter = null;
        }
        recyclerView.setAdapter(albumAdapter);
        com.qcwireless.qcwatch.databinding.ActivityAlbumBinding activityAlbumBinding3 = this.binding;
        if (activityAlbumBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityAlbumBinding2 = activityAlbumBinding3;
        }
        activityAlbumBinding2.btnSelectPic.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.album.AlbumActivity.m645setupViews$lambda1(com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this, view);
            }
        });
        com.oudmon.ble.base.communication.file.EbookHandle.getInstance().initRegister();
        com.oudmon.ble.base.communication.file.EbookHandle.getInstance().clearCallback();
        com.oudmon.ble.base.communication.file.EbookHandle.getInstance().registerCallback(new com.oudmon.ble.base.communication.file.IEbookCallback() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumActivity$setupViews$3
            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onDeleteSuccess(int code) {
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onFileNames(java.util.ArrayList<java.lang.String> fileNames) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileNames, "fileNames");
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, fileNames);
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onProgress(final float percent) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Float.valueOf(percent));
                final com.qcwireless.qcwatch.ui.device.album.AlbumActivity albumActivity = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.album.AlbumActivity$setupViews$3, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumActivity$setupViews$3$onProgress$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.album.AlbumActivity$setupViews$3) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.album.AlbumActivity$setupViews$3 albumActivity$setupViews$3) {
                        java.util.List list;
                        int i;
                        java.util.List list2;
                        int i2;
                        com.qcwireless.qcwatch.ui.device.album.adapter.AlbumAdapter albumAdapter2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(albumActivity$setupViews$3, "$this$ktxRunOnUi");
                        list = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.data;
                        i = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.currIndex;
                        com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean albumBean = (com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean) list.get(i);
                        if (((int) percent) == 100) {
                            albumBean.setType(100);
                        } else {
                            albumBean.setType(1);
                        }
                        albumBean.setProgress((int) percent);
                        list2 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.data;
                        i2 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.currIndex;
                        list2.set(i2, albumBean);
                        albumAdapter2 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.adapter;
                        if (albumAdapter2 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            albumAdapter2 = null;
                        }
                        albumAdapter2.notifyDataSetChanged();
                        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(4);
                    }
                });
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onComplete() {
                try {
                    final com.qcwireless.qcwatch.ui.device.album.AlbumActivity albumActivity = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.album.AlbumActivity$setupViews$3, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumActivity$setupViews$3$onComplete$1
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.album.AlbumActivity$setupViews$3) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.album.AlbumActivity$setupViews$3 albumActivity$setupViews$3) {
                            java.util.List list;
                            java.util.List list2;
                            com.qcwireless.qcwatch.ui.device.album.adapter.AlbumAdapter albumAdapter2;
                            java.util.LinkedList linkedList;
                            java.util.LinkedList linkedList2;
                            java.util.List list3;
                            java.util.List list4;
                            java.util.List list5;
                            com.qcwireless.qcwatch.ui.device.album.adapter.AlbumAdapter albumAdapter3;
                            java.util.List list6;
                            com.qcwireless.qcwatch.databinding.ActivityAlbumBinding activityAlbumBinding4;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(albumActivity$setupViews$3, "$this$ktxRunOnUi");
                            list = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.data;
                            com.qcwireless.qcwatch.ui.device.album.adapter.AlbumAdapter albumAdapter4 = null;
                            if (list.size() > 0) {
                                list3 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.data;
                                list3.remove(0);
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append("-----onComplete");
                                list4 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.data;
                                sb.append(list4.size());
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, sb.toString());
                                list5 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.data;
                                if (list5.size() == 0) {
                                    list6 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.data;
                                    list6.clear();
                                    activityAlbumBinding4 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.binding;
                                    if (activityAlbumBinding4 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        activityAlbumBinding4 = null;
                                    }
                                    com.qcwireless.qcwatch.base.view.ViewKt.visible(activityAlbumBinding4.imageNoData);
                                    com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.dismissLoadingDialog();
                                    com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
                                }
                                albumAdapter3 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.adapter;
                                if (albumAdapter3 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                } else {
                                    albumAdapter4 = albumAdapter3;
                                }
                                albumAdapter4.notifyDataSetChanged();
                            } else {
                                list2 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.data;
                                list2.clear();
                                com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.dismissLoadingDialog();
                                albumAdapter2 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.adapter;
                                if (albumAdapter2 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                } else {
                                    albumAdapter4 = albumAdapter2;
                                }
                                albumAdapter4.notifyDataSetChanged();
                            }
                            linkedList = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.queue;
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(linkedList.size()));
                            try {
                                com.qcwireless.qcwatch.ui.device.album.AlbumActivity albumActivity2 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this;
                                linkedList2 = albumActivity2.queue;
                                java.lang.Object removeFirst = linkedList2.removeFirst();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(removeFirst, "queue.removeFirst()");
                                albumActivity2.bitmapCompress((com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean) removeFirst);
                            } catch (java.lang.Exception unused) {
                            }
                        }
                    });
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onActionResult(int errCode) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(errCode));
            }
        });
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.SetTimeReq(1), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumActivity$$ExternalSyntheticLambda1
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.album.AlbumActivity.m646setupViews$lambda2(com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this, (com.oudmon.ble.base.communication.rsp.SetTimeRsp) baseRspCmd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m645setupViews$lambda1(final com.qcwireless.qcwatch.ui.device.album.AlbumActivity albumActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(albumActivity, "this$0");
        albumActivity.queue.clear();
        com.luck.picture.lib.style.SelectMainStyle selectMainStyle = new com.luck.picture.lib.style.SelectMainStyle();
        selectMainStyle.setSelectNumberStyle(true);
        selectMainStyle.setPreviewSelectNumberStyle(false);
        selectMainStyle.setPreviewDisplaySelectGallery(true);
        selectMainStyle.setSelectBackground(2131230984);
        selectMainStyle.setPreviewSelectBackground(2131231022);
        selectMainStyle.setSelectNormalBackgroundResources(2131231028);
        android.content.Context context = (android.content.Context) albumActivity;
        selectMainStyle.setSelectNormalTextColor(androidx.core.content.ContextCompat.getColor(context, 2131100123));
        selectMainStyle.setSelectNormalText(2131820740);
        selectMainStyle.setAdapterPreviewGalleryBackgroundResource(2131231023);
        selectMainStyle.setAdapterPreviewGalleryItemSize(com.luck.picture.lib.utils.DensityUtil.dip2px(context, 52.0f));
        selectMainStyle.setPreviewSelectText(2131820732);
        selectMainStyle.setPreviewSelectTextSize(14);
        selectMainStyle.setPreviewSelectTextColor(androidx.core.content.ContextCompat.getColor(context, 2131100157));
        selectMainStyle.setPreviewSelectMarginRight(com.luck.picture.lib.utils.DensityUtil.dip2px(context, 6.0f));
        selectMainStyle.setSelectBackgroundResources(2131231027);
        selectMainStyle.setSelectText(2131820741);
        selectMainStyle.setSelectTextColor(androidx.core.content.ContextCompat.getColor(context, 2131100157));
        selectMainStyle.setMainListBackgroundColor(androidx.core.content.ContextCompat.getColor(context, 2131100136));
        selectMainStyle.setCompleteSelectRelativeTop(true);
        selectMainStyle.setPreviewSelectRelativeBottom(true);
        selectMainStyle.setAdapterItemIncludeEdge(false);
        com.luck.picture.lib.style.TitleBarStyle titleBarStyle = new com.luck.picture.lib.style.TitleBarStyle();
        titleBarStyle.setHideCancelButton(true);
        titleBarStyle.setAlbumTitleRelativeLeft(true);
        titleBarStyle.setTitleAlbumBackgroundResource(2131230970);
        titleBarStyle.setTitleDrawableRightResource(2131231000);
        titleBarStyle.setPreviewTitleLeftBackResource(2131231003);
        com.luck.picture.lib.style.BottomNavBarStyle bottomNavBarStyle = new com.luck.picture.lib.style.BottomNavBarStyle();
        bottomNavBarStyle.setBottomPreviewNarBarBackgroundColor(androidx.core.content.ContextCompat.getColor(context, 2131100151));
        bottomNavBarStyle.setBottomPreviewNormalText(2131820718);
        bottomNavBarStyle.setBottomPreviewNormalTextColor(androidx.core.content.ContextCompat.getColor(context, 2131100129));
        bottomNavBarStyle.setBottomPreviewNormalTextSize(16);
        bottomNavBarStyle.setCompleteCountTips(false);
        bottomNavBarStyle.setBottomPreviewSelectText(2131820720);
        bottomNavBarStyle.setBottomPreviewSelectTextColor(androidx.core.content.ContextCompat.getColor(context, 2131100157));
        com.luck.picture.lib.style.PictureSelectorStyle pictureSelectorStyle = albumActivity.selectorStyle;
        com.luck.picture.lib.style.PictureSelectorStyle pictureSelectorStyle2 = null;
        if (pictureSelectorStyle == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("selectorStyle");
            pictureSelectorStyle = null;
        }
        pictureSelectorStyle.setTitleBarStyle(titleBarStyle);
        com.luck.picture.lib.style.PictureSelectorStyle pictureSelectorStyle3 = albumActivity.selectorStyle;
        if (pictureSelectorStyle3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("selectorStyle");
            pictureSelectorStyle3 = null;
        }
        pictureSelectorStyle3.setBottomBarStyle(bottomNavBarStyle);
        com.luck.picture.lib.style.PictureSelectorStyle pictureSelectorStyle4 = albumActivity.selectorStyle;
        if (pictureSelectorStyle4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("selectorStyle");
            pictureSelectorStyle4 = null;
        }
        pictureSelectorStyle4.setSelectMainStyle(selectMainStyle);
        com.luck.picture.lib.basic.PictureSelectionModel compressEngine = com.luck.picture.lib.basic.PictureSelector.create(albumActivity).openGallery(com.luck.picture.lib.config.SelectMimeType.ofImage()).setImageEngine(com.qcwireless.qcwatch.base.glide.GlideEngine.createGlideEngine()).setCompressEngine(new com.qcwireless.qcwatch.ui.device.album.AlbumActivity.ImageFileCompressEngine());
        com.luck.picture.lib.style.PictureSelectorStyle pictureSelectorStyle5 = albumActivity.selectorStyle;
        if (pictureSelectorStyle5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("selectorStyle");
        } else {
            pictureSelectorStyle2 = pictureSelectorStyle5;
        }
        compressEngine.setSelectorUIStyle(pictureSelectorStyle2).setMaxSelectNum(100).forResult(new com.luck.picture.lib.interfaces.OnResultCallbackListener<com.luck.picture.lib.entity.LocalMedia>() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumActivity$setupViews$2$1
            @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
            public void onResult(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> result) {
                java.util.List list;
                java.util.LinkedList linkedList;
                com.qcwireless.qcwatch.databinding.ActivityAlbumBinding activityAlbumBinding;
                java.util.LinkedList linkedList2;
                com.qcwireless.qcwatch.databinding.ActivityAlbumBinding activityAlbumBinding2;
                java.util.List list2;
                java.util.LinkedList linkedList3;
                com.qcwireless.qcwatch.ui.device.album.adapter.AlbumAdapter albumAdapter;
                java.util.List list3;
                java.util.LinkedList linkedList4;
                java.util.List list4;
                java.util.LinkedList linkedList5;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, result);
                com.qcwireless.qcwatch.databinding.ActivityAlbumBinding activityAlbumBinding3 = null;
                com.qcwireless.qcwatch.ui.device.album.adapter.AlbumAdapter albumAdapter2 = null;
                if (result.size() > 0) {
                    activityAlbumBinding2 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.binding;
                    if (activityAlbumBinding2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityAlbumBinding2 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone(activityAlbumBinding2.imageNoData);
                    list2 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.data;
                    list2.clear();
                    linkedList3 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.queue;
                    linkedList3.clear();
                    java.util.Iterator<com.luck.picture.lib.entity.LocalMedia> it = result.iterator();
                    while (it.hasNext()) {
                        com.luck.picture.lib.entity.LocalMedia next = it.next();
                        java.lang.String compressPath = next.getCompressPath();
                        if (compressPath == null || compressPath.length() == 0) {
                            java.lang.String realPath = next.getRealPath();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(realPath, "item.realPath");
                            com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean albumBean = new com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean(realPath, 0, 0);
                            list3 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.data;
                            list3.add(albumBean);
                            linkedList4 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.queue;
                            linkedList4.add(albumBean);
                        } else {
                            java.lang.String compressPath2 = next.getCompressPath();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compressPath2, "item.compressPath");
                            com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean albumBean2 = new com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean(compressPath2, 0, 0);
                            list4 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.data;
                            list4.add(albumBean2);
                            linkedList5 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.queue;
                            linkedList5.add(albumBean2);
                        }
                    }
                    albumAdapter = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.adapter;
                    if (albumAdapter == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        albumAdapter2 = albumAdapter;
                    }
                    albumAdapter2.notifyDataSetChanged();
                } else {
                    list = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.data;
                    list.clear();
                    linkedList = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.queue;
                    linkedList.clear();
                    activityAlbumBinding = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.binding;
                    if (activityAlbumBinding == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityAlbumBinding3 = activityAlbumBinding;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(activityAlbumBinding3.imageNoData);
                }
                try {
                    com.qcwireless.qcwatch.ui.device.album.AlbumActivity albumActivity2 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this;
                    linkedList2 = albumActivity2.queue;
                    java.lang.Object removeFirst = linkedList2.removeFirst();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(removeFirst, "queue.removeFirst()");
                    albumActivity2.bitmapCompress((com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean) removeFirst);
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
            public void onCancel() {
                java.util.List list;
                java.util.LinkedList linkedList;
                com.qcwireless.qcwatch.databinding.ActivityAlbumBinding activityAlbumBinding;
                list = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.data;
                list.clear();
                linkedList = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.queue;
                linkedList.clear();
                activityAlbumBinding = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.this.binding;
                if (activityAlbumBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityAlbumBinding = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityAlbumBinding.imageNoData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m646setupViews$lambda2(com.qcwireless.qcwatch.ui.device.album.AlbumActivity albumActivity, com.oudmon.ble.base.communication.rsp.SetTimeRsp setTimeRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(albumActivity, "this$0");
        albumActivity.width = setTimeRsp.width;
        albumActivity.height = setTimeRsp.height;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, setTimeRsp.width + "----" + setTimeRsp.height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bitmapCompress(com.qcwireless.qcwatch.ui.device.album.bean.AlbumBean bean) {
        if (!isDialogShowing()) {
            showLoadingDialogTimeoutNotCancel(60000);
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, bean.getPath());
        android.graphics.Bitmap scaleAndCropImage = com.qcwireless.qcwatch.ui.plate.util.ImageUtils.scaleAndCropImage(bean.getPath(), this.width, this.height);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(scaleAndCropImage, com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_IMAGE);
        albumToDevice(compressBitmap(scaleAndCropImage, 40960L, 60));
    }

    private final byte[] compressBitmap(android.graphics.Bitmap bitmap, long maxSizeBytes, int corner) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = 100;
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        long length = byteArray.length;
        for (int i2 = 0; length > maxSizeBytes && i2 < 10; i2++) {
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
            i -= 10;
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream2);
            byteArray = byteArrayOutputStream2.toByteArray();
            length = byteArray.length;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, (byteArray.length / com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2) + "kb");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "byteArray");
        return byteArray;
    }

    public final android.graphics.Bitmap scaleCropAndRoundImage(java.lang.String imagePath, int targetWidth, int targetHeight, float cornerRadius) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile(imagePath);
        float f = targetWidth;
        float width = decodeFile.getWidth();
        float f2 = targetHeight;
        float height = decodeFile.getHeight();
        float min = java.lang.Math.min(f / width, f2 / height);
        int i = (int) (width * min);
        int i2 = (int) (height * min);
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(decodeFile, i, i2, true);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(targetWidth, targetHeight, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        int i3 = (i - targetWidth) / 2;
        int i4 = (i2 - targetHeight) / 2;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, f, f2);
        android.graphics.Paint paint = new android.graphics.Paint(5);
        canvas.drawRoundRect(rectF, cornerRadius, cornerRadius, paint);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(createScaledBitmap, -i3, -i4, paint);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "croppedBitmap");
        return createBitmap;
    }

    private final void albumToDevice(byte[] imageArray) {
        com.oudmon.ble.base.communication.file.EbookHandle.getInstance().setCurrFileType(5);
        java.lang.String str = new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp() + com.luck.picture.lib.config.PictureMimeType.JPG;
        if (com.oudmon.ble.base.communication.file.EbookHandle.getInstance().executeFilePrepareAlbum(imageArray)) {
            com.oudmon.ble.base.communication.file.EbookHandle.getInstance().cmdFileInit(str);
        } else {
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.album.AlbumActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumActivity$albumToDevice$1
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.device.album.AlbumActivity) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.device.album.AlbumActivity albumActivity) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(albumActivity, "$this$ktxRunOnUi");
                    java.lang.String string = albumActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_558);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_558)");
                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AlbumActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/album/AlbumActivity$ImageFileCompressEngine;", "Lcom/luck/picture/lib/engine/CompressFileEngine;", "()V", "onStartCompress", "", "context", "Landroid/content/Context;", "source", "Ljava/util/ArrayList;", "Landroid/net/Uri;", "call", "Lcom/luck/picture/lib/interfaces/OnKeyValueResultCallbackListener;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    static final class ImageFileCompressEngine implements com.luck.picture.lib.engine.CompressFileEngine {
        @Override // com.luck.picture.lib.engine.CompressFileEngine
        public void onStartCompress(android.content.Context context, java.util.ArrayList<android.net.Uri> source, final com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener call) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
            top.zibin.luban.Luban.with(context).load(source).ignoreBy(100).setRenameListener(new top.zibin.luban.OnRenameListener() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumActivity$ImageFileCompressEngine$$ExternalSyntheticLambda1
                public final java.lang.String rename(java.lang.String str) {
                    java.lang.String m647onStartCompress$lambda0;
                    m647onStartCompress$lambda0 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.ImageFileCompressEngine.m647onStartCompress$lambda0(str);
                    return m647onStartCompress$lambda0;
                }
            }).filter(new top.zibin.luban.CompressionPredicate() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumActivity$ImageFileCompressEngine$$ExternalSyntheticLambda0
                public final boolean apply(java.lang.String str) {
                    boolean m648onStartCompress$lambda1;
                    m648onStartCompress$lambda1 = com.qcwireless.qcwatch.ui.device.album.AlbumActivity.ImageFileCompressEngine.m648onStartCompress$lambda1(str);
                    return m648onStartCompress$lambda1;
                }
            }).setCompressListener(new top.zibin.luban.OnNewCompressListener() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumActivity$ImageFileCompressEngine$onStartCompress$3
                public void onStart() {
                }

                public void onSuccess(java.lang.String source2, java.io.File compressFile) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source2, "source");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compressFile, "compressFile");
                    com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener onKeyValueResultCallbackListener = com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener.this;
                    if (onKeyValueResultCallbackListener != null) {
                        onKeyValueResultCallbackListener.onCallback(source2, compressFile.getAbsolutePath());
                    }
                }

                public void onError(java.lang.String source2, java.lang.Throwable e) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source2, "source");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
                    com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener onKeyValueResultCallbackListener = com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener.this;
                    if (onKeyValueResultCallbackListener != null) {
                        onKeyValueResultCallbackListener.onCallback(source2, null);
                    }
                }
            }).launch();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onStartCompress$lambda-0, reason: not valid java name */
        public static final java.lang.String m647onStartCompress$lambda0(java.lang.String str) {
            java.lang.String str2;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "filePath");
            int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default(str, ".", 0, false, 6, (java.lang.Object) null);
            if (lastIndexOf$default != -1) {
                str2 = str.substring(lastIndexOf$default);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).substring(startIndex)");
            } else {
                str2 = com.luck.picture.lib.config.PictureMimeType.JPG;
            }
            return com.luck.picture.lib.utils.DateUtils.getCreateFileName("CMP_") + str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onStartCompress$lambda-1, reason: not valid java name */
        public static final boolean m648onStartCompress$lambda1(java.lang.String str) {
            return (com.luck.picture.lib.config.PictureMimeType.isUrlHasImage(str) && !com.luck.picture.lib.config.PictureMimeType.isHasHttp(str)) || !com.luck.picture.lib.config.PictureMimeType.isUrlHasGif(str);
        }
    }

    /* compiled from: AlbumActivity.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J6\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/album/AlbumActivity$ImageFileCropEngine;", "Lcom/luck/picture/lib/engine/CropFileEngine;", "width", "", "height", "(II)V", "getHeight", "()I", "setHeight", "(I)V", "getWidth", "setWidth", "onStartCrop", "", "fragment", "Landroidx/fragment/app/Fragment;", "srcUri", "Landroid/net/Uri;", "destinationUri", "dataSource", "Ljava/util/ArrayList;", "", "requestCode", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class ImageFileCropEngine implements com.luck.picture.lib.engine.CropFileEngine {
        private int height;
        private int width;

        public ImageFileCropEngine(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public final void setHeight(int i) {
            this.height = i;
        }

        public final void setWidth(int i) {
            this.width = i;
        }

        @Override // com.luck.picture.lib.engine.CropFileEngine
        public void onStartCrop(androidx.fragment.app.Fragment fragment, android.net.Uri srcUri, android.net.Uri destinationUri, java.util.ArrayList<java.lang.String> dataSource, int requestCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(srcUri, "srcUri");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationUri, "destinationUri");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            com.yalantis.ucrop.UCrop.Options options = new com.yalantis.ucrop.UCrop.Options();
            options.setHideBottomControls(true);
            options.isCropDragSmoothToCenter(false);
            options.isForbidSkipMultipleCrop(true);
            options.setMaxScaleMultiplier(100.0f);
            options.withAspectRatio(this.width, this.height);
            com.yalantis.ucrop.UCrop of = com.yalantis.ucrop.UCrop.of(srcUri, destinationUri, dataSource);
            of.withOptions(options);
            of.setImageEngine(new com.yalantis.ucrop.UCropImageEngine() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumActivity$ImageFileCropEngine$onStartCrop$1
                public void loadImage(android.content.Context context, java.lang.String url, android.widget.ImageView imageView) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageView, "imageView");
                    com.bumptech.glide.Glide.with(context).load(url).override(180, 180).into(imageView);
                }

                public void loadImage(android.content.Context context, android.net.Uri url, int maxWidth, int maxHeight, final com.yalantis.ucrop.UCropImageEngine.OnCallbackListener<android.graphics.Bitmap> call) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
                    com.bumptech.glide.Glide.with(context).asBitmap().load(url).override(maxWidth, maxHeight).into(new com.bumptech.glide.request.target.CustomTarget<android.graphics.Bitmap>() { // from class: com.qcwireless.qcwatch.ui.device.album.AlbumActivity$ImageFileCropEngine$onStartCrop$1$loadImage$1
                        @Override // com.bumptech.glide.request.target.Target
                        public /* bridge */ /* synthetic */ void onResourceReady(java.lang.Object obj, com.bumptech.glide.request.transition.Transition transition) {
                            onResourceReady((android.graphics.Bitmap) obj, (com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap>) transition);
                        }

                        public void onResourceReady(android.graphics.Bitmap resource, com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap> transition) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "resource");
                            com.yalantis.ucrop.UCropImageEngine.OnCallbackListener<android.graphics.Bitmap> onCallbackListener = call;
                            if (onCallbackListener != null) {
                                onCallbackListener.onCall(resource);
                            }
                        }

                        @Override // com.bumptech.glide.request.target.Target
                        public void onLoadCleared(android.graphics.drawable.Drawable placeholder) {
                            com.yalantis.ucrop.UCropImageEngine.OnCallbackListener<android.graphics.Bitmap> onCallbackListener = call;
                            if (onCallbackListener != null) {
                                onCallbackListener.onCall((java.lang.Object) null);
                            }
                        }
                    });
                }
            });
            of.start(fragment.requireActivity(), fragment, requestCode);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if (!(messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) || ((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect()) {
            return;
        }
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        finish();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
    }
}
