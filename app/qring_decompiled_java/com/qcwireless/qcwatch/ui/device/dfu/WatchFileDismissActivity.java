package com.qcwireless.qcwatch.ui.device.dfu;

/* compiled from: WatchFileDismissActivity.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u001a\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0017J\b\u0010\"\u001a\u00020\u0017H\u0014J\b\u0010#\u001a\u00020\u0017H\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\b\u0018\u00010\u0014R\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/dfu/WatchFileDismissActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityWatchFileDismissBinding;", "downloading", "", "handler", "Landroid/os/Handler;", "progressValue", "", "runnable", "Lcom/qcwireless/qcwatch/ui/device/dfu/WatchFileDismissActivity$MyRunnable;", "viewModel", "Lcom/qcwireless/qcwatch/ui/device/dfu/vm/WatchFileDismissViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/device/dfu/vm/WatchFileDismissViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onKeyDown", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "setupViews", "MyRunnable", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WatchFileDismissActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding binding;
    private boolean downloading;
    private final android.os.Handler handler;
    private java.lang.String progressValue = "0";
    private com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity.MyRunnable runnable = new com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity.MyRunnable();

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private android.os.PowerManager.WakeLock wakeLock;

    public WatchFileDismissActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel m711invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding inflate = com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        androidx.constraintlayout.widget.ConstraintLayout root = inflate.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView((android.view.View) root);
        getWindow().addFlags(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        java.util.ArrayList arrayList;
        super.setupViews();
        android.os.Bundle extras = getIntent().getExtras();
        com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding activityWatchFileDismissBinding = null;
        java.lang.String string = extras != null ? extras.getString("fileNames") : null;
        android.os.Bundle extras2 = getIntent().getExtras();
        java.lang.Integer valueOf = extras2 != null ? java.lang.Integer.valueOf(extras2.getInt("background")) : null;
        if (string != null) {
            com.qcwireless.qcwatch.base.utils.MoshiUtils moshiUtils = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE;
            java.lang.reflect.ParameterizedType newParameterizedType = com.squareup.moshi.Types.newParameterizedType(java.util.List.class, new java.lang.reflect.Type[]{java.lang.String.class});
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newParameterizedType, "newParameterizedType(Mut…lass.java, T::class.java)");
            arrayList = (java.util.List) moshiUtils.fromJson(string, newParameterizedType);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
        } else {
            arrayList = null;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, arrayList);
        if (arrayList != null && arrayList.size() > 0 && ((valueOf == null || valueOf.intValue() != 1) && !this.downloading)) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "--------下载UI文件数据");
            this.downloading = true;
            getViewModel().downloadFile((java.util.ArrayList) arrayList);
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            getViewModel().initFileHandler();
        }
        com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding activityWatchFileDismissBinding2 = this.binding;
        if (activityWatchFileDismissBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityWatchFileDismissBinding = activityWatchFileDismissBinding2;
        }
        activityWatchFileDismissBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_294));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityWatchFileDismissBinding.titleBar.ivNavigateBefore);
        android.content.Context context = (android.content.Context) this;
        if (com.qcwireless.qcwatch.base.ktx.SystemServiceExtKt.getPowerManager(context) != null) {
            android.os.PowerManager powerManager = com.qcwireless.qcwatch.base.ktx.SystemServiceExtKt.getPowerManager(context);
            kotlin.jvm.internal.Intrinsics.checkNotNull(powerManager);
            android.os.PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(536870913, "DeviceFirmwareUpdateActivity");
            this.wakeLock = newWakeLock;
            if (newWakeLock != null) {
                newWakeLock.acquire(600000L);
            }
        }
        this.handler.removeCallbacks(this.runnable);
        this.handler.postDelayed(this.runnable, 10000L);
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity.m708setupViews$lambda3(com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity.this, (com.qcwireless.qcwatch.ui.base.repository.device.OTAFileStatus) obj);
            }
        });
        getViewModel().getDismissFileState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity.m710setupViews$lambda4(com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity.this, (com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.DismissFileFirmwareUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3, reason: not valid java name */
    public static final void m708setupViews$lambda3(final com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity watchFileDismissActivity, com.qcwireless.qcwatch.ui.base.repository.device.OTAFileStatus oTAFileStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFileDismissActivity, "this$0");
        if (oTAFileStatus.getOtaSuccess()) {
            watchFileDismissActivity.handler.removeCallbacks(watchFileDismissActivity.runnable);
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
            java.lang.String string = watchFileDismissActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_239);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_239)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            watchFileDismissActivity.getViewModel().cancelTask();
            watchFileDismissActivity.finish();
        } else {
            watchFileDismissActivity.handler.removeCallbacks(watchFileDismissActivity.runnable);
            watchFileDismissActivity.handler.postDelayed(watchFileDismissActivity.runnable, 10000L);
            watchFileDismissActivity.progressValue = java.lang.String.valueOf(oTAFileStatus.getProgressBar());
            com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding activityWatchFileDismissBinding = watchFileDismissActivity.binding;
            if (activityWatchFileDismissBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityWatchFileDismissBinding = null;
            }
            activityWatchFileDismissBinding.tvProgressValue.setText(java.lang.String.valueOf(oTAFileStatus.getProgressBar()));
            com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding activityWatchFileDismissBinding2 = watchFileDismissActivity.binding;
            if (activityWatchFileDismissBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityWatchFileDismissBinding2 = null;
            }
            activityWatchFileDismissBinding2.progressValue.setPercentage(oTAFileStatus.getProgressBar());
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(2);
            com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding activityWatchFileDismissBinding3 = watchFileDismissActivity.binding;
            if (activityWatchFileDismissBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityWatchFileDismissBinding3 = null;
            }
            activityWatchFileDismissBinding3.tvError.setText(watchFileDismissActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_360));
        }
        if (oTAFileStatus.getFileExists()) {
            return;
        }
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
        java.lang.String string2 = watchFileDismissActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_240);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_240)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
        watchFileDismissActivity.handler.removeCallbacks(watchFileDismissActivity.runnable);
        watchFileDismissActivity.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity.m709setupViews$lambda3$lambda2(com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity.this);
            }
        }, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3$lambda-2, reason: not valid java name */
    public static final void m709setupViews$lambda3$lambda2(com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity watchFileDismissActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFileDismissActivity, "this$0");
        watchFileDismissActivity.getViewModel().cancelTask();
        watchFileDismissActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4, reason: not valid java name */
    public static final void m710setupViews$lambda4(com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity watchFileDismissActivity, com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.DismissFileFirmwareUI dismissFileFirmwareUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFileDismissActivity, "this$0");
        if (dismissFileFirmwareUI != null) {
            com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding activityWatchFileDismissBinding = watchFileDismissActivity.binding;
            com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding activityWatchFileDismissBinding2 = null;
            if (activityWatchFileDismissBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityWatchFileDismissBinding = null;
            }
            activityWatchFileDismissBinding.tvProgressValue.setText(java.lang.String.valueOf(dismissFileFirmwareUI.getProgressBar()));
            com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding activityWatchFileDismissBinding3 = watchFileDismissActivity.binding;
            if (activityWatchFileDismissBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityWatchFileDismissBinding3 = null;
            }
            activityWatchFileDismissBinding3.progressValue.setPercentage((int) dismissFileFirmwareUI.getProgressBar());
            watchFileDismissActivity.handler.removeCallbacks(watchFileDismissActivity.runnable);
            watchFileDismissActivity.handler.postDelayed(watchFileDismissActivity.runnable, 10000L);
            com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding activityWatchFileDismissBinding4 = watchFileDismissActivity.binding;
            if (activityWatchFileDismissBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityWatchFileDismissBinding2 = activityWatchFileDismissBinding4;
            }
            activityWatchFileDismissBinding2.tvError.setText(watchFileDismissActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_359));
            if (dismissFileFirmwareUI.getSuccess()) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, dismissFileFirmwareUI.getFileName());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(new com.qcwireless.qcwatch.ui.base.bean.response.device.DeviceMissFileResp(dismissFileFirmwareUI.getFileName(), "", "", "", null, 16, null));
                dismissFileFirmwareUI.getFileName();
                watchFileDismissActivity.getViewModel().startDismissFileOTA(arrayList);
            }
        }
    }

    public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (keyCode == 4 || keyCode == 3) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
            java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_238);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_238)");
            com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding activityWatchFileDismissBinding = null;
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding activityWatchFileDismissBinding2 = this.binding;
            if (activityWatchFileDismissBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityWatchFileDismissBinding = activityWatchFileDismissBinding2;
            }
            activityWatchFileDismissBinding.tvError.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_238));
            getViewModel().cancelTask();
            finish();
            return;
        }
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(2);
    }

    /* compiled from: WatchFileDismissActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/dfu/WatchFileDismissActivity$MyRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/device/dfu/WatchFileDismissActivity;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyRunnable implements java.lang.Runnable {
        public MyRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            java.lang.String string = com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_238);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_238)");
            com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding activityWatchFileDismissBinding = null;
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding activityWatchFileDismissBinding2 = com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity.this.binding;
            if (activityWatchFileDismissBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityWatchFileDismissBinding = activityWatchFileDismissBinding2;
            }
            activityWatchFileDismissBinding.tvError.setText(com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_238));
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
            com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity.this.getViewModel().cancelTask();
            com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity.this.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding activityWatchFileDismissBinding = null;
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) {
            if (((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect()) {
                return;
            }
            this.handler.removeCallbacks(this.runnable);
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
            java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_238);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_238)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            com.qcwireless.qcwatch.databinding.ActivityWatchFileDismissBinding activityWatchFileDismissBinding2 = this.binding;
            if (activityWatchFileDismissBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityWatchFileDismissBinding = activityWatchFileDismissBinding2;
            }
            activityWatchFileDismissBinding.tvError.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_238));
            getViewModel().cancelTask();
            finish();
            return;
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.OTAFileStatusEvent) {
            try {
                if (com.qcwireless.qc_utils.app.AppUtil.isBackground((android.content.Context) this) || com.qcwireless.qc_utils.app.AppUtil.isApplicationBroughtToBackground((android.content.Context) this)) {
                    this.handler.removeCallbacks(this.runnable);
                    this.handler.postDelayed(this.runnable, 10000L);
                    if (((com.qcwireless.qcwatch.base.event.OTAFileStatusEvent) messageEvent).getType() == 2 && ((com.qcwireless.qcwatch.base.event.OTAFileStatusEvent) messageEvent).getSuccess()) {
                        this.handler.removeCallbacks(this.runnable);
                        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
                        java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_239);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_239)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
                        getViewModel().cancelTask();
                        finish();
                    } else if (((com.qcwireless.qcwatch.base.event.OTAFileStatusEvent) messageEvent).getType() == 1 && ((com.qcwireless.qcwatch.base.event.OTAFileStatusEvent) messageEvent).getSuccess()) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(new com.qcwireless.qcwatch.ui.base.bean.response.device.DeviceMissFileResp(((com.qcwireless.qcwatch.base.event.OTAFileStatusEvent) messageEvent).getFileName(), "", "", "", null, 16, null));
                        ((com.qcwireless.qcwatch.base.event.OTAFileStatusEvent) messageEvent).getFileName();
                        getViewModel().startDismissFileOTA(arrayList);
                    }
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }
}
