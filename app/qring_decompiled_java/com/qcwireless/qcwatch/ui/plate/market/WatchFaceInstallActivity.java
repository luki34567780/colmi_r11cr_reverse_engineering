package com.qcwireless.qcwatch.ui.plate.market;

/* compiled from: WatchFaceInstallActivity.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0017J\b\u0010\u001d\u001a\u00020\u0017H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/market/WatchFaceInstallActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "CNBASEPATH", "", "HWBASEPATH", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityWatchFaceInstallBinding;", "handler", "Landroid/os/Handler;", "name", "parentFile", "timeOutRunnable", "Lcom/qcwireless/qcwatch/ui/plate/market/WatchFaceInstallActivity$TimeOutRunnable;", "viewModel", "Lcom/qcwireless/qcwatch/ui/plate/market/WatchFaceInstallViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/plate/market/WatchFaceInstallViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "watchFace", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/WatchFace;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "setupViews", "TimeOutRunnable", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WatchFaceInstallActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private java.lang.String CNBASEPATH;
    private java.lang.String HWBASEPATH;
    private com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding binding;
    private final android.os.Handler handler;
    private java.lang.String name;
    private final java.lang.String parentFile;
    private final com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.TimeOutRunnable timeOutRunnable;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace;

    public WatchFaceInstallActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel>() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel m1399invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel.class), qualifier, qualifier);
            }
        });
        java.lang.String absolutePath = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getWatchFaceDirFile().getAbsolutePath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "FileUtils.getWatchFaceDirFile().absolutePath");
        this.parentFile = absolutePath;
        this.timeOutRunnable = new com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.TimeOutRunnable();
        this.CNBASEPATH = "https://qcwxwatchface.oss-cn-hangzhou.aliyuncs.com";
        this.HWBASEPATH = "http://api2.qcwxkjvip.com/download/watchface";
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding inflate = com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding.inflate(getLayoutInflater());
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

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        android.os.Bundle extras = getIntent().getExtras();
        com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding activityWatchFaceInstallBinding = null;
        java.lang.String string = extras != null ? extras.getString("dialName") : null;
        this.name = string;
        if (string != null) {
            com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel viewModel = getViewModel();
            java.lang.String str = this.name;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            viewModel.queryByName(str);
            getViewModel().cleanWatchFaceCallback();
        }
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().pingHwServer();
        com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding activityWatchFaceInstallBinding2 = this.binding;
        if (activityWatchFaceInstallBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityWatchFaceInstallBinding2 = null;
        }
        activityWatchFaceInstallBinding2.btnDialSave.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_2486));
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getMarketUI().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.m1396setupViews$lambda0(com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this, (com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace) obj);
            }
        });
        android.view.View[] viewArr = new android.view.View[1];
        com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding activityWatchFaceInstallBinding3 = this.binding;
        if (activityWatchFaceInstallBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityWatchFaceInstallBinding = activityWatchFaceInstallBinding3;
        }
        viewArr[0] = (android.view.View) activityWatchFaceInstallBinding.btnDialSave;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity$setupViews$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding activityWatchFaceInstallBinding4;
                com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.TimeOutRunnable timeOutRunnable;
                com.qcwireless.qcwatch.base.utils.FileUtils fileUtils;
                java.lang.StringBuilder sb;
                java.lang.String str2;
                java.lang.String str3;
                com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel viewModel2;
                java.lang.String str4;
                java.lang.String str5;
                java.lang.String str6;
                com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel viewModel3;
                com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityWatchFaceInstallBinding4 = com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.binding;
                com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace2 = null;
                if (activityWatchFaceInstallBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityWatchFaceInstallBinding4 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityWatchFaceInstallBinding4.btnDialSave)) {
                    if (!com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isNetworkAvailable((android.content.Context) com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this) || !com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getPingHwServer()) {
                        java.lang.String string2 = com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_223);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_223)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
                        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().pingHwServer();
                        return;
                    }
                    if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                        java.lang.String string3 = com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_75)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string3, 0, 1, null);
                        return;
                    }
                    if (com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().getSync() || com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().getSyncSportPlus()) {
                        java.lang.String string4 = com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_236);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_236)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string4, 0, 1, null);
                        return;
                    }
                    try {
                        fileUtils = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE;
                        sb = new java.lang.StringBuilder();
                        str2 = com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.parentFile;
                        sb.append(str2);
                        sb.append('/');
                        str3 = com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.name;
                        sb.append(str3);
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                    if (!fileUtils.fileExists(sb.toString())) {
                        viewModel3 = com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.getViewModel();
                        watchFace = com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.watchFace;
                        if (watchFace == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("watchFace");
                        } else {
                            watchFace2 = watchFace;
                        }
                        viewModel3.downloadWatchFaceNotExists(new com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean(watchFace2, 0));
                        com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.showLoadingDialogTimeoutNotCancel(60000);
                        return;
                    }
                    viewModel2 = com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.getViewModel();
                    str4 = com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.name;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str4);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    str5 = com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.parentFile;
                    sb2.append(str5);
                    sb2.append('/');
                    str6 = com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.name;
                    sb2.append(str6);
                    viewModel2.execWatchFaceToDevice(str4, sb2.toString());
                    android.os.Handler handler = view.getHandler();
                    timeOutRunnable = com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.timeOutRunnable;
                    handler.postDelayed(timeOutRunnable, 90000L);
                    com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.showLoadingDialogTimeoutNotCancel(60000);
                }
            }
        });
        getViewModel().getFileDownloadSuccess().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.m1397setupViews$lambda1(com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this, (com.qcwireless.qcwatch.ui.base.repository.watchface.ListenerBean) obj);
            }
        });
        getViewModel().getProgressValue().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity$$ExternalSyntheticLambda2
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.m1398setupViews$lambda2(com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this, (com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel.ProgressUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-0, reason: not valid java name */
    public static final void m1396setupViews$lambda0(final com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity watchFaceInstallActivity, com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace) {
        com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFaceInstallActivity, "this$0");
        if (watchFace != null) {
            watchFaceInstallActivity.watchFace = watchFace;
            com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding activityWatchFaceInstallBinding = null;
            if (watchFace == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("watchFace");
                watchFace2 = null;
            } else {
                watchFace2 = watchFace;
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, watchFace2);
            java.lang.String preImageUrl = watchFace.getPreImageUrl();
            java.lang.String str = com.luck.picture.lib.config.PictureMimeType.PNG;
            if (!kotlin.text.StringsKt.endsWith$default(preImageUrl, com.luck.picture.lib.config.PictureMimeType.PNG, false, 2, (java.lang.Object) null)) {
                str = com.luck.picture.lib.config.PictureMimeType.GIF;
            }
            java.lang.String str2 = ((java.lang.String) kotlin.text.StringsKt.split$default(watchFace.getName(), new char[]{'.'}, false, 0, 6, (java.lang.Object) null).get(0)) + str;
            if (com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.fileExists(watchFaceInstallActivity.parentFile + '/' + str2)) {
                java.lang.String str3 = "file://" + watchFaceInstallActivity.parentFile + '/' + str2;
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, str3);
                com.bumptech.glide.Glide.with((androidx.fragment.app.FragmentActivity) watchFaceInstallActivity).load(str3).fitCenter().skipMemoryCache(true).diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.NONE).signature(new com.bumptech.glide.signature.ObjectKey(str2)).into(new com.bumptech.glide.request.target.CustomTarget<android.graphics.drawable.Drawable>() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity$setupViews$1$1
                    @Override // com.bumptech.glide.request.target.Target
                    public void onLoadCleared(android.graphics.drawable.Drawable placeholder) {
                    }

                    @Override // com.bumptech.glide.request.target.Target
                    public /* bridge */ /* synthetic */ void onResourceReady(java.lang.Object obj, com.bumptech.glide.request.transition.Transition transition) {
                        onResourceReady((android.graphics.drawable.Drawable) obj, (com.bumptech.glide.request.transition.Transition<? super android.graphics.drawable.Drawable>) transition);
                    }

                    public void onResourceReady(android.graphics.drawable.Drawable resource, com.bumptech.glide.request.transition.Transition<? super android.graphics.drawable.Drawable> transition) {
                        com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding activityWatchFaceInstallBinding2;
                        com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding activityWatchFaceInstallBinding3;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "resource");
                        com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding activityWatchFaceInstallBinding4 = null;
                        if (resource instanceof com.bumptech.glide.load.resource.gif.GifDrawable) {
                            activityWatchFaceInstallBinding3 = com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.binding;
                            if (activityWatchFaceInstallBinding3 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityWatchFaceInstallBinding4 = activityWatchFaceInstallBinding3;
                            }
                            activityWatchFaceInstallBinding4.imageWatchFace.setImageDrawable(resource);
                            ((com.bumptech.glide.load.resource.gif.GifDrawable) resource).start();
                            return;
                        }
                        activityWatchFaceInstallBinding2 = com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.this.binding;
                        if (activityWatchFaceInstallBinding2 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityWatchFaceInstallBinding4 = activityWatchFaceInstallBinding2;
                        }
                        activityWatchFaceInstallBinding4.imageWatchFace.setImageDrawable(resource);
                    }

                    @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                    public void onLoadFailed(android.graphics.drawable.Drawable errorDrawable) {
                        super.onLoadFailed(errorDrawable);
                    }
                });
                return;
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, watchFace.getPreImageUrl());
            com.bumptech.glide.RequestBuilder signature = com.bumptech.glide.Glide.with((androidx.fragment.app.FragmentActivity) watchFaceInstallActivity).load(watchFace.getPreImageUrl()).fitCenter().signature(new com.bumptech.glide.signature.ObjectKey(watchFace.getName()));
            com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding activityWatchFaceInstallBinding2 = watchFaceInstallActivity.binding;
            if (activityWatchFaceInstallBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityWatchFaceInstallBinding = activityWatchFaceInstallBinding2;
            }
            signature.into(activityWatchFaceInstallBinding.imageWatchFace);
            return;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "此处应该不能为空才对");
        watchFaceInstallActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m1397setupViews$lambda1(com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity watchFaceInstallActivity, com.qcwireless.qcwatch.ui.base.repository.watchface.ListenerBean listenerBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFaceInstallActivity, "this$0");
        if (listenerBean.getSuccess()) {
            watchFaceInstallActivity.dismissLoadingDialog();
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, watchFaceInstallActivity.parentFile + '/' + watchFaceInstallActivity.name);
            com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel viewModel = watchFaceInstallActivity.getViewModel();
            java.lang.String str = watchFaceInstallActivity.name;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            viewModel.execWatchFaceToDevice(str, watchFaceInstallActivity.parentFile + '/' + watchFaceInstallActivity.name);
            return;
        }
        int progress = listenerBean.getProgress();
        com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace = null;
        com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding activityWatchFaceInstallBinding = null;
        if (1 <= progress && progress < 100) {
            if (!watchFaceInstallActivity.isDialogShowing()) {
                watchFaceInstallActivity.showLoadingDialogTimeoutNotCancel(60000);
            }
            com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding activityWatchFaceInstallBinding2 = watchFaceInstallActivity.binding;
            if (activityWatchFaceInstallBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityWatchFaceInstallBinding2 = null;
            }
            activityWatchFaceInstallBinding2.btnDialSave.reset();
            com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding activityWatchFaceInstallBinding3 = watchFaceInstallActivity.binding;
            if (activityWatchFaceInstallBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityWatchFaceInstallBinding3 = null;
            }
            activityWatchFaceInstallBinding3.btnDialSave.setProgress(listenerBean.getProgress());
            com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding activityWatchFaceInstallBinding4 = watchFaceInstallActivity.binding;
            if (activityWatchFaceInstallBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityWatchFaceInstallBinding = activityWatchFaceInstallBinding4;
            }
            com.qcwireless.qcwatch.ui.base.view.ProgressButton progressButton = activityWatchFaceInstallBinding.btnDialSave;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(listenerBean.getProgress());
            sb.append('%');
            progressButton.setText(watchFaceInstallActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_3530, new java.lang.Object[]{sb.toString()}));
            return;
        }
        if (listenerBean.getProgress() == -1) {
            com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace2 = watchFaceInstallActivity.watchFace;
            if (watchFace2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("watchFace");
                watchFace2 = null;
            }
            java.lang.String replace$default = kotlin.text.StringsKt.replace$default(watchFace2.getBinUrl(), watchFaceInstallActivity.HWBASEPATH, watchFaceInstallActivity.CNBASEPATH, false, 4, (java.lang.Object) null);
            com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace3 = watchFaceInstallActivity.watchFace;
            if (watchFace3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("watchFace");
                watchFace3 = null;
            }
            watchFace3.setBinUrl(replace$default);
            com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel viewModel2 = watchFaceInstallActivity.getViewModel();
            com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace4 = watchFaceInstallActivity.watchFace;
            if (watchFace4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("watchFace");
            } else {
                watchFace = watchFace4;
            }
            viewModel2.downloadWatchFaceNotExists(new com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean(watchFace, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m1398setupViews$lambda2(com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity watchFaceInstallActivity, com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallViewModel.ProgressUI progressUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFaceInstallActivity, "this$0");
        if (progressUI != null && !progressUI.isDelete()) {
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(3);
            if (!watchFaceInstallActivity.isDialogShowing()) {
                watchFaceInstallActivity.showLoadingDialogTimeoutNotCancel(80000);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "show dialog");
            }
            com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding activityWatchFaceInstallBinding = watchFaceInstallActivity.binding;
            if (activityWatchFaceInstallBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityWatchFaceInstallBinding = null;
            }
            activityWatchFaceInstallBinding.btnDialSave.reset();
            com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding activityWatchFaceInstallBinding2 = watchFaceInstallActivity.binding;
            if (activityWatchFaceInstallBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityWatchFaceInstallBinding2 = null;
            }
            activityWatchFaceInstallBinding2.btnDialSave.setProgress(progressUI.getProgress());
            com.qcwireless.qcwatch.databinding.ActivityWatchFaceInstallBinding activityWatchFaceInstallBinding3 = watchFaceInstallActivity.binding;
            if (activityWatchFaceInstallBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityWatchFaceInstallBinding3 = null;
            }
            com.qcwireless.qcwatch.ui.base.view.ProgressButton progressButton = activityWatchFaceInstallBinding3.btnDialSave;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(progressUI.getProgress());
            sb.append('%');
            progressButton.setText(watchFaceInstallActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_331, new java.lang.Object[]{sb.toString()}));
            if (progressUI.getProgress() == 100 && progressUI.getSuccess()) {
                com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
                watchFaceInstallActivity.handler.removeCallbacks(watchFaceInstallActivity.timeOutRunnable);
                watchFaceInstallActivity.dismissLoadingDialog();
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.WatchFaceInstallSuccessEvent());
                java.lang.String string = watchFaceInstallActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_3532);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_3532)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                watchFaceInstallActivity.finish();
            }
        }
        if (progressUI == null || !progressUI.getError()) {
            return;
        }
        try {
            watchFaceInstallActivity.dismissLoadingDialog();
            java.lang.String string2 = watchFaceInstallActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_3531);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_3531)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.WatchFaceInstallSuccessEvent());
            watchFaceInstallActivity.finish();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /* compiled from: WatchFaceInstallActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/market/WatchFaceInstallActivity$TimeOutRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/plate/market/WatchFaceInstallActivity;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class TimeOutRunnable implements java.lang.Runnable {
        public TimeOutRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if (!(messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) || ((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect()) {
            return;
        }
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        finish();
    }
}
