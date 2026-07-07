package com.qcwireless.qcwatch.ui.device.dfu;

/* compiled from: ChinaDeviceFirmwareUpdateActivity.kt */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/qcwireless/qcwatch/ui/device/dfu/ChinaDeviceFirmwareUpdateActivity$dfuOpResult$1", "Lcom/oudmon/ble/base/communication/DfuHandle$IOpResult;", "onActionResult", "", "type", "", "errCode", "onProgress", "percent", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ChinaDeviceFirmwareUpdateActivity$dfuOpResult$1 implements com.oudmon.ble.base.communication.DfuHandle.IOpResult {
    final /* synthetic */ com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity this$0;

    ChinaDeviceFirmwareUpdateActivity$dfuOpResult$1(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity chinaDeviceFirmwareUpdateActivity) {
        this.this$0 = chinaDeviceFirmwareUpdateActivity;
    }

    @Override // com.oudmon.ble.base.communication.DfuHandle.IOpResult
    public void onActionResult(int type, int errCode) {
        com.oudmon.ble.base.communication.DfuHandle dfuHandle;
        com.oudmon.ble.base.communication.DfuHandle dfuHandle2;
        com.oudmon.ble.base.communication.DfuHandle dfuHandle3;
        com.oudmon.ble.base.communication.DfuHandle dfuHandle4;
        android.os.Handler handler;
        com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.MyRunnable myRunnable;
        android.os.Handler handler2;
        if (errCode == 0) {
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(1);
            com.oudmon.ble.base.communication.DfuHandle dfuHandle5 = null;
            if (type == 1) {
                dfuHandle = this.this$0.dfuHandle;
                if (dfuHandle == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("dfuHandle");
                } else {
                    dfuHandle5 = dfuHandle;
                }
                dfuHandle5.init();
                return;
            }
            if (type == 2) {
                dfuHandle2 = this.this$0.dfuHandle;
                if (dfuHandle2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("dfuHandle");
                } else {
                    dfuHandle5 = dfuHandle2;
                }
                dfuHandle5.sendPacket();
                return;
            }
            if (type == 3) {
                dfuHandle3 = this.this$0.dfuHandle;
                if (dfuHandle3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("dfuHandle");
                } else {
                    dfuHandle5 = dfuHandle3;
                }
                dfuHandle5.check();
                return;
            }
            if (type != 4) {
                return;
            }
            dfuHandle4 = this.this$0.dfuHandle;
            if (dfuHandle4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("dfuHandle");
            } else {
                dfuHandle5 = dfuHandle4;
            }
            dfuHandle5.endAndRelease();
            handler = this.this$0.handler;
            myRunnable = this.this$0.runnable;
            handler.removeCallbacks(myRunnable);
            final com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity chinaDeviceFirmwareUpdateActivity = this.this$0;
            chinaDeviceFirmwareUpdateActivity.runOnUiThread(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$dfuOpResult$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$dfuOpResult$1.m697onActionResult$lambda0(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.this);
                }
            });
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setFmVersion("");
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            handler2 = this.this$0.handler;
            final com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity chinaDeviceFirmwareUpdateActivity2 = this.this$0;
            handler2.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$dfuOpResult$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$dfuOpResult$1.m698onActionResult$lambda1(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.this);
                }
            }, 1000L);
            return;
        }
        final com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity chinaDeviceFirmwareUpdateActivity3 = this.this$0;
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$dfuOpResult$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$dfuOpResult$1$onActionResult$3
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$dfuOpResult$1) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$dfuOpResult$1 chinaDeviceFirmwareUpdateActivity$dfuOpResult$1) {
                com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel viewModel;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chinaDeviceFirmwareUpdateActivity$dfuOpResult$1, "$this$ktxRunOnUi");
                com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
                java.lang.String string = com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_238);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_238)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                viewModel = com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.this.getViewModel();
                viewModel.cancelTask();
                com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.this.finish();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActionResult$lambda-0, reason: not valid java name */
    public static final void m697onActionResult$lambda0(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity chinaDeviceFirmwareUpdateActivity) {
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding;
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chinaDeviceFirmwareUpdateActivity, "this$0");
        activityDeviceFirmwareUpdateChinaBinding = chinaDeviceFirmwareUpdateActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding3 = null;
        if (activityDeviceFirmwareUpdateChinaBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDeviceFirmwareUpdateChinaBinding = null;
        }
        activityDeviceFirmwareUpdateChinaBinding.tvProgressValue.setText("100");
        activityDeviceFirmwareUpdateChinaBinding2 = chinaDeviceFirmwareUpdateActivity.binding;
        if (activityDeviceFirmwareUpdateChinaBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDeviceFirmwareUpdateChinaBinding3 = activityDeviceFirmwareUpdateChinaBinding2;
        }
        activityDeviceFirmwareUpdateChinaBinding3.progressValue.setPercentage(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onActionResult$lambda-1, reason: not valid java name */
    public static final void m698onActionResult$lambda1(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity chinaDeviceFirmwareUpdateActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chinaDeviceFirmwareUpdateActivity, "this$0");
        chinaDeviceFirmwareUpdateActivity.appDisconnect();
    }

    @Override // com.oudmon.ble.base.communication.DfuHandle.IOpResult
    public void onProgress(final int percent) {
        final com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity chinaDeviceFirmwareUpdateActivity = this.this$0;
        chinaDeviceFirmwareUpdateActivity.runOnUiThread(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$dfuOpResult$1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity$dfuOpResult$1.m699onProgress$lambda2(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.this, percent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onProgress$lambda-2, reason: not valid java name */
    public static final void m699onProgress$lambda2(com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity chinaDeviceFirmwareUpdateActivity, int i) {
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding;
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding2;
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding3;
        android.os.Handler handler;
        com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.MyRunnable myRunnable;
        android.os.Handler handler2;
        com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.MyRunnable myRunnable2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chinaDeviceFirmwareUpdateActivity, "this$0");
        activityDeviceFirmwareUpdateChinaBinding = chinaDeviceFirmwareUpdateActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityDeviceFirmwareUpdateChinaBinding activityDeviceFirmwareUpdateChinaBinding4 = null;
        if (activityDeviceFirmwareUpdateChinaBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDeviceFirmwareUpdateChinaBinding = null;
        }
        activityDeviceFirmwareUpdateChinaBinding.tvError.setText(chinaDeviceFirmwareUpdateActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_360));
        activityDeviceFirmwareUpdateChinaBinding2 = chinaDeviceFirmwareUpdateActivity.binding;
        if (activityDeviceFirmwareUpdateChinaBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDeviceFirmwareUpdateChinaBinding2 = null;
        }
        activityDeviceFirmwareUpdateChinaBinding2.tvProgressValue.setText(java.lang.String.valueOf(i));
        activityDeviceFirmwareUpdateChinaBinding3 = chinaDeviceFirmwareUpdateActivity.binding;
        if (activityDeviceFirmwareUpdateChinaBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDeviceFirmwareUpdateChinaBinding4 = activityDeviceFirmwareUpdateChinaBinding3;
        }
        activityDeviceFirmwareUpdateChinaBinding4.progressValue.setPercentage(i);
        handler = chinaDeviceFirmwareUpdateActivity.handler;
        myRunnable = chinaDeviceFirmwareUpdateActivity.runnable;
        handler.removeCallbacks(myRunnable);
        handler2 = chinaDeviceFirmwareUpdateActivity.handler;
        myRunnable2 = chinaDeviceFirmwareUpdateActivity.runnable;
        handler2.postDelayed(myRunnable2, 10000L);
    }
}
