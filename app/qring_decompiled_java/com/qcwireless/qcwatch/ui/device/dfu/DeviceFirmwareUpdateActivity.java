package com.qcwireless.qcwatch.ui.device.dfu;

/* compiled from: DeviceFirmwareUpdateActivity.kt */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u001bH\u0016J\u0012\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u001bH\u0014J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)H\u0017J\b\u0010*\u001a\u00020\u001bH\u0014J\u0006\u0010+\u001a\u00020\u001bJ\b\u0010,\u001a\u00020\u001bH\u0015J\u0010\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\b\u0018\u00010\u0018R\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/dfu/DeviceFirmwareUpdateActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "FLAG_HOMEKEY_DISPATCHED", "", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityDeviceFirmwareUpdateBinding;", "dfuHandle", "Lcom/oudmon/ble/base/communication/DfuHandle;", "dfuOpResult", "Lcom/oudmon/ble/base/communication/DfuHandle$IOpResult;", "handler", "Landroid/os/Handler;", "progressValue", "", "runnable", "Lcom/qcwireless/qcwatch/ui/device/dfu/DeviceFirmwareUpdateActivity$MyRunnable;", "viewModel", "Lcom/qcwireless/qcwatch/ui/device/dfu/vm/DeviceFirmwareUpdateViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/device/dfu/vm/DeviceFirmwareUpdateViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "appDisconnect", "", "onAttachedToWindow", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "otaFail", "setupViews", "startOta", "name", "MyRunnable", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DeviceFirmwareUpdateActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateBinding binding;
    private com.oudmon.ble.base.communication.DfuHandle dfuHandle;
    private final com.oudmon.ble.base.communication.DfuHandle.IOpResult dfuOpResult;
    private final android.os.Handler handler;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private android.os.PowerManager.WakeLock wakeLock;
    private final long FLAG_HOMEKEY_DISPATCHED = 2147483648L;
    private com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity.MyRunnable runnable = new com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity.MyRunnable();
    private java.lang.String progressValue = "0";

    public DeviceFirmwareUpdateActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel m702invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
        this.dfuOpResult = new com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity$dfuOpResult$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateBinding inflate = com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateBinding.inflate(getLayoutInflater());
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
        super.setupViews();
        com.oudmon.ble.base.communication.DfuHandle dfuHandle = com.oudmon.ble.base.communication.DfuHandle.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dfuHandle, "getInstance()");
        this.dfuHandle = dfuHandle;
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateBinding activityDeviceFirmwareUpdateBinding = null;
        if (dfuHandle == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("dfuHandle");
            dfuHandle = null;
        }
        dfuHandle.initCallback();
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateBinding activityDeviceFirmwareUpdateBinding2 = this.binding;
        if (activityDeviceFirmwareUpdateBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDeviceFirmwareUpdateBinding = activityDeviceFirmwareUpdateBinding2;
        }
        activityDeviceFirmwareUpdateBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_29));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityDeviceFirmwareUpdateBinding.titleBar.ivNavigateBefore);
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
        this.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity.m700setupViews$lambda1(com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity.this);
            }
        }, 200L);
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity.m701setupViews$lambda2(com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity.this, (com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.FirmwareUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m700setupViews$lambda1(com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity deviceFirmwareUpdateActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFirmwareUpdateActivity, "this$0");
        deviceFirmwareUpdateActivity.getViewModel().checkOta();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m701setupViews$lambda2(com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity deviceFirmwareUpdateActivity, com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.FirmwareUI firmwareUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFirmwareUpdateActivity, "this$0");
        if (firmwareUI != null) {
            com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateBinding activityDeviceFirmwareUpdateBinding = deviceFirmwareUpdateActivity.binding;
            com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateBinding activityDeviceFirmwareUpdateBinding2 = null;
            if (activityDeviceFirmwareUpdateBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDeviceFirmwareUpdateBinding = null;
            }
            activityDeviceFirmwareUpdateBinding.tvProgressValue.setText(java.lang.String.valueOf(firmwareUI.getProgressBar()));
            com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateBinding activityDeviceFirmwareUpdateBinding3 = deviceFirmwareUpdateActivity.binding;
            if (activityDeviceFirmwareUpdateBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDeviceFirmwareUpdateBinding3 = null;
            }
            activityDeviceFirmwareUpdateBinding3.progressValue.setPercentage((int) firmwareUI.getProgressBar());
            deviceFirmwareUpdateActivity.handler.removeCallbacks(deviceFirmwareUpdateActivity.runnable);
            deviceFirmwareUpdateActivity.handler.postDelayed(deviceFirmwareUpdateActivity.runnable, 10000L);
            com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateBinding activityDeviceFirmwareUpdateBinding4 = deviceFirmwareUpdateActivity.binding;
            if (activityDeviceFirmwareUpdateBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityDeviceFirmwareUpdateBinding2 = activityDeviceFirmwareUpdateBinding4;
            }
            activityDeviceFirmwareUpdateBinding2.tvError.setText(deviceFirmwareUpdateActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_359));
            if (firmwareUI.getSuccess()) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, firmwareUI.getFileName());
                deviceFirmwareUpdateActivity.startOta(firmwareUI.getFileName());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) {
            if (((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect()) {
                return;
            }
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
            this.progressValue = "0";
            this.handler.removeCallbacks(this.runnable);
            getViewModel().cancelTask();
            finish();
            return;
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.OTAFileStatusEvent) {
            try {
                if (com.qcwireless.qc_utils.app.AppUtil.isBackground((android.content.Context) this) || com.qcwireless.qc_utils.app.AppUtil.isApplicationBroughtToBackground((android.content.Context) this)) {
                    this.handler.removeCallbacks(this.runnable);
                    this.handler.postDelayed(this.runnable, 10000L);
                    if (((com.qcwireless.qcwatch.base.event.OTAFileStatusEvent) messageEvent).getType() == 3 && ((com.qcwireless.qcwatch.base.event.OTAFileStatusEvent) messageEvent).getSuccess()) {
                        startOta(((com.qcwireless.qcwatch.base.event.OTAFileStatusEvent) messageEvent).getFileName());
                    }
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
            this.progressValue = "0";
            this.handler.removeCallbacks(this.runnable);
            getViewModel().cancelTask();
            finish();
        } else {
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(1);
        }
        if (com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isNetworkAvailable((android.content.Context) this)) {
            return;
        }
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_223);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_223)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
    }

    /* compiled from: DeviceFirmwareUpdateActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/dfu/DeviceFirmwareUpdateActivity$MyRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/device/dfu/DeviceFirmwareUpdateActivity;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyRunnable implements java.lang.Runnable {
        public MyRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity.this.otaFail();
        }
    }

    public void onAttachedToWindow() {
        getWindow().addFlags((int) this.FLAG_HOMEKEY_DISPATCHED);
        super.onAttachedToWindow();
    }

    public final void otaFail() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity$otaFail$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity deviceFirmwareUpdateActivity) {
                com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel viewModel;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFirmwareUpdateActivity, "$this$ktxRunOnUi");
                java.lang.String string = deviceFirmwareUpdateActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_238);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_238)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
                viewModel = deviceFirmwareUpdateActivity.getViewModel();
                viewModel.cancelTask();
                deviceFirmwareUpdateActivity.finish();
            }
        });
    }

    private final void startOta(java.lang.String name) {
        java.io.File file = new java.io.File(com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getBinDirFile(), name);
        if (file.exists()) {
            java.lang.String absolutePath = file.getAbsolutePath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
            if (absolutePath.length() == 0) {
                otaFail();
            }
            java.lang.String absolutePath2 = file.getAbsolutePath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath2, "file.absolutePath");
            com.oudmon.ble.base.communication.DfuHandle dfuHandle = null;
            if (!kotlin.text.StringsKt.contains$default(absolutePath2, "bin", false, 2, (java.lang.Object) null)) {
                otaFail();
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(file.getAbsolutePath(), "")) {
                com.oudmon.ble.base.communication.DfuHandle dfuHandle2 = this.dfuHandle;
                if (dfuHandle2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("dfuHandle");
                    dfuHandle2 = null;
                }
                if (dfuHandle2.checkFile(file.getAbsolutePath())) {
                    com.oudmon.ble.base.communication.DfuHandle dfuHandle3 = this.dfuHandle;
                    if (dfuHandle3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("dfuHandle");
                    } else {
                        dfuHandle = dfuHandle3;
                    }
                    dfuHandle.start(this.dfuOpResult);
                    return;
                }
                return;
            }
            otaFail();
        }
    }

    public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (keyCode == 4 || keyCode == 3) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public final void appDisconnect() {
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.FirmUpdateEvent());
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().disconnect();
        }
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_239);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_239)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        this.progressValue = "0";
        getViewModel().cancelTask();
        finish();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        getWindow().clearFlags((int) this.FLAG_HOMEKEY_DISPATCHED);
        getViewModel().cancelTask();
        android.os.PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock != null) {
            wakeLock.release();
        }
        this.handler.removeCallbacks(this.runnable);
    }
}
