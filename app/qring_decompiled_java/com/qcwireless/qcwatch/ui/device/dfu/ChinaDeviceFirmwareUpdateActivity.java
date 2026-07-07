package com.qcwireless.qcwatch.ui.device.dfu;

/* compiled from: ChinaDeviceFirmwareUpdateActivity.kt */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u0012\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001dH\u0014J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+H\u0017J\b\u0010,\u001a\u00020\u001dH\u0014J\u0006\u0010-\u001a\u00020\u001dJ\b\u0010.\u001a\u00020\u001dH\u0015J\u0010\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\b\u0018\u00010\u001aR\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/dfu/ChinaDeviceFirmwareUpdateActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "FLAG_HOMEKEY_DISPATCHED", "", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityDeviceFirmwareUpdateChinaBinding;", "dfuHandle", "Lcom/oudmon/ble/base/communication/DfuHandle;", "dfuOpResult", "Lcom/oudmon/ble/base/communication/DfuHandle$IOpResult;", "handler", "Landroid/os/Handler;", "progressValue", "", "resp", "Lcom/qcwireless/qcwatch/ui/base/bean/response/device/FirmwareOtaResp;", "runnable", "Lcom/qcwireless/qcwatch/ui/device/dfu/ChinaDeviceFirmwareUpdateActivity$MyRunnable;", "viewModel", "Lcom/qcwireless/qcwatch/ui/device/dfu/vm/DeviceFirmwareUpdateViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/device/dfu/vm/DeviceFirmwareUpdateViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "appDisconnect", "", "onAttachedToWindow", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "otaFail", "setupViews", "startOta", "name", "MyRunnable", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ChinaDeviceFirmwareUpdateActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding binding;
    private com.oudmon.ble.base.communication.DfuHandle dfuHandle;
    private final com.oudmon.ble.base.communication.DfuHandle.IOpResult dfuOpResult;
    private final android.os.Handler handler;
    private com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp resp;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private android.os.PowerManager.WakeLock wakeLock;
    private final long FLAG_HOMEKEY_DISPATCHED = 2147483648L;
    private com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.MyRunnable runnable = new com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.MyRunnable();
    private java.lang.String progressValue = "0";

    public ChinaDeviceFirmwareUpdateActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel m694invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
        this.dfuOpResult = new com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$dfuOpResult$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding inflate = com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        androidx.core.widget.NestedScrollView root = inflate.getRoot();
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
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding = null;
        if (dfuHandle == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("dfuHandle");
            dfuHandle = null;
        }
        dfuHandle.initCallback();
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding2 = this.binding;
        if (activityDeviceFirmwareUpdateChinaBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDeviceFirmwareUpdateChinaBinding2 = null;
        }
        activityDeviceFirmwareUpdateChinaBinding2.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_29));
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
        getViewModel().checkOtaChina();
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding3 = this.binding;
        if (activityDeviceFirmwareUpdateChinaBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDeviceFirmwareUpdateChinaBinding3 = null;
        }
        activityDeviceFirmwareUpdateChinaBinding3.btnGoTo.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.m690setupViews$lambda1(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding4 = this.binding;
        if (activityDeviceFirmwareUpdateChinaBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDeviceFirmwareUpdateChinaBinding = activityDeviceFirmwareUpdateChinaBinding4;
        }
        activityDeviceFirmwareUpdateChinaBinding.titleBar.ivNavigateBefore.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.m691setupViews$lambda2(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.this, view);
            }
        });
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getUpdateUiInfo().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$$ExternalSyntheticLambda2
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.m692setupViews$lambda3(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.this, (com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp) obj);
            }
        });
        getViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$$ExternalSyntheticLambda3
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.m693setupViews$lambda4(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.this, (com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.FirmwareUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m690setupViews$lambda1(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity chinaDeviceFirmwareUpdateActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chinaDeviceFirmwareUpdateActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding = null;
        if (!com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isNetworkAvailable((android.content.Context) chinaDeviceFirmwareUpdateActivity)) {
            java.lang.String string = chinaDeviceFirmwareUpdateActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_223);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_223)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding2 = chinaDeviceFirmwareUpdateActivity.binding;
        if (activityDeviceFirmwareUpdateChinaBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDeviceFirmwareUpdateChinaBinding2 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityDeviceFirmwareUpdateChinaBinding2.titleBar.ivNavigateBefore);
        com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel viewModel = chinaDeviceFirmwareUpdateActivity.getViewModel();
        com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp firmwareOtaResp = chinaDeviceFirmwareUpdateActivity.resp;
        if (firmwareOtaResp == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("resp");
            firmwareOtaResp = null;
        }
        viewModel.saveDeviceDfuInformation(firmwareOtaResp);
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding3 = chinaDeviceFirmwareUpdateActivity.binding;
        if (activityDeviceFirmwareUpdateChinaBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDeviceFirmwareUpdateChinaBinding = activityDeviceFirmwareUpdateChinaBinding3;
        }
        activityDeviceFirmwareUpdateChinaBinding.btnGoTo.setEnabled(false);
        chinaDeviceFirmwareUpdateActivity.handler.removeCallbacks(chinaDeviceFirmwareUpdateActivity.runnable);
        chinaDeviceFirmwareUpdateActivity.handler.postDelayed(chinaDeviceFirmwareUpdateActivity.runnable, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m691setupViews$lambda2(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity chinaDeviceFirmwareUpdateActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chinaDeviceFirmwareUpdateActivity, "this$0");
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
        chinaDeviceFirmwareUpdateActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3, reason: not valid java name */
    public static final void m692setupViews$lambda3(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity chinaDeviceFirmwareUpdateActivity, com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp firmwareOtaResp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chinaDeviceFirmwareUpdateActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firmwareOtaResp, "it");
        chinaDeviceFirmwareUpdateActivity.resp = firmwareOtaResp;
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding = chinaDeviceFirmwareUpdateActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding2 = null;
        if (activityDeviceFirmwareUpdateChinaBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDeviceFirmwareUpdateChinaBinding = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityDeviceFirmwareUpdateChinaBinding.btnGoTo);
        if (firmwareOtaResp.getUpdateDesc().length() > 0) {
            com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding3 = chinaDeviceFirmwareUpdateActivity.binding;
            if (activityDeviceFirmwareUpdateChinaBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDeviceFirmwareUpdateChinaBinding3 = null;
            }
            activityDeviceFirmwareUpdateChinaBinding3.tvUpdateDesc.setText(firmwareOtaResp.getUpdateDesc());
            com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding4 = chinaDeviceFirmwareUpdateActivity.binding;
            if (activityDeviceFirmwareUpdateChinaBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityDeviceFirmwareUpdateChinaBinding2 = activityDeviceFirmwareUpdateChinaBinding4;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityDeviceFirmwareUpdateChinaBinding2.tvUpdateDescTitle);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding5 = chinaDeviceFirmwareUpdateActivity.binding;
        if (activityDeviceFirmwareUpdateChinaBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDeviceFirmwareUpdateChinaBinding2 = activityDeviceFirmwareUpdateChinaBinding5;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityDeviceFirmwareUpdateChinaBinding2.tvUpdateDescTitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4, reason: not valid java name */
    public static final void m693setupViews$lambda4(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity chinaDeviceFirmwareUpdateActivity, com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.FirmwareUI firmwareUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chinaDeviceFirmwareUpdateActivity, "this$0");
        if (firmwareUI != null) {
            com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding = chinaDeviceFirmwareUpdateActivity.binding;
            com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding2 = null;
            if (activityDeviceFirmwareUpdateChinaBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDeviceFirmwareUpdateChinaBinding = null;
            }
            activityDeviceFirmwareUpdateChinaBinding.tvProgressValue.setText(java.lang.String.valueOf(firmwareUI.getProgressBar()));
            com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding3 = chinaDeviceFirmwareUpdateActivity.binding;
            if (activityDeviceFirmwareUpdateChinaBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDeviceFirmwareUpdateChinaBinding3 = null;
            }
            activityDeviceFirmwareUpdateChinaBinding3.progressValue.setPercentage((int) firmwareUI.getProgressBar());
            chinaDeviceFirmwareUpdateActivity.handler.removeCallbacks(chinaDeviceFirmwareUpdateActivity.runnable);
            chinaDeviceFirmwareUpdateActivity.handler.postDelayed(chinaDeviceFirmwareUpdateActivity.runnable, 10000L);
            com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding4 = chinaDeviceFirmwareUpdateActivity.binding;
            if (activityDeviceFirmwareUpdateChinaBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityDeviceFirmwareUpdateChinaBinding2 = activityDeviceFirmwareUpdateChinaBinding4;
            }
            activityDeviceFirmwareUpdateChinaBinding2.tvError.setText(chinaDeviceFirmwareUpdateActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_359));
            if (firmwareUI.getSuccess()) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, firmwareUI.getFileName());
                chinaDeviceFirmwareUpdateActivity.startOta(firmwareUI.getFileName());
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

    /* compiled from: ChinaDeviceFirmwareUpdateActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/dfu/ChinaDeviceFirmwareUpdateActivity$MyRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/device/dfu/ChinaDeviceFirmwareUpdateActivity;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyRunnable implements java.lang.Runnable {
        public MyRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.this.otaFail();
        }
    }

    public void onAttachedToWindow() {
        getWindow().addFlags((int) this.FLAG_HOMEKEY_DISPATCHED);
        super.onAttachedToWindow();
    }

    public final void otaFail() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$otaFail$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity chinaDeviceFirmwareUpdateActivity) {
                com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel viewModel;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chinaDeviceFirmwareUpdateActivity, "$this$ktxRunOnUi");
                java.lang.String string = chinaDeviceFirmwareUpdateActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_238);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_238)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
                viewModel = chinaDeviceFirmwareUpdateActivity.getViewModel();
                viewModel.cancelTask();
                chinaDeviceFirmwareUpdateActivity.finish();
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
