package com.qcwireless.qcwatch.ui.device.disturb;

/* compiled from: DisturbActivity.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0014J\u001e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/disturb/DisturbActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityDisturbBinding;", "disturb", "Lcom/qcwireless/qcwatch/ui/device/disturb/DisturbViewModel$DisturbUI;", "disturbViewModel", "Lcom/qcwireless/qcwatch/ui/device/disturb/DisturbViewModel;", "getDisturbViewModel", "()Lcom/qcwireless/qcwatch/ui/device/disturb/DisturbViewModel;", "disturbViewModel$delegate", "Lkotlin/Lazy;", "manualDND", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "readDisturbFromDevice", "setupViews", "showTimeDialog", "title", "", "time", "", "type", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DisturbActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityDisturbBinding binding;
    private com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI disturb;

    /* renamed from: disturbViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy disturbViewModel;
    private boolean manualDND;

    public DisturbActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.disturbViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel m717invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel getDisturbViewModel() {
        return (com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel) this.disturbViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityDisturbBinding inflate = com.qcwireless.qcwatch.databinding.ActivityDisturbBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        android.widget.LinearLayout root = inflate.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView(root);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel disturbViewModel = getDisturbViewModel();
        java.lang.String deviceAddress = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
        kotlin.jvm.internal.Intrinsics.checkNotNull(deviceAddress);
        disturbViewModel.getDisturbSwitch(deviceAddress);
        com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding2 = null;
        if (activityDisturbBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDisturbBinding = null;
        }
        activityDisturbBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_13));
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityDisturbBinding.titleBar.tvRightText);
        activityDisturbBinding.titleBar.tvRightText.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_79));
        activityDisturbBinding.qcDisturbSwitch.setQSettingItemCheckListener(new com.qcwireless.qcwatch.ui.base.view.QSwitchView.OnSwitchStateChangeListener() { // from class: com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity$$ExternalSyntheticLambda2
            @Override // com.qcwireless.qcwatch.ui.base.view.QSwitchView.OnSwitchStateChangeListener
            public final void onSwitchStateChange(boolean z) {
                com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity.m714setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity.this, z);
            }
        });
        activityDisturbBinding.qcDisturbStart.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity$setupViews$1$2
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI disturbUI;
                com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity disturbActivity = com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity.this;
                java.lang.String string = disturbActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_39);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_39)");
                disturbUI = com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity.this.disturb;
                if (disturbUI == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("disturb");
                    disturbUI = null;
                }
                disturbActivity.showTimeDialog(string, disturbUI.getStart(), 1);
            }
        });
        activityDisturbBinding.qcDisturbEnd.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity$setupViews$1$3
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI disturbUI;
                com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity disturbActivity = com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity.this;
                java.lang.String string = disturbActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_40);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_40)");
                disturbUI = com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity.this.disturb;
                if (disturbUI == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("disturb");
                    disturbUI = null;
                }
                disturbActivity.showTimeDialog(string, disturbUI.getEnd(), 2);
            }
        });
        getDisturbViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity.m715setupViews$lambda3$lambda2(com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity.this, (com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI) obj);
            }
        });
        android.view.View[] viewArr = new android.view.View[1];
        com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding3 = this.binding;
        if (activityDisturbBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDisturbBinding2 = activityDisturbBinding3;
        }
        viewArr[0] = activityDisturbBinding2.titleBar.tvRightText;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity$setupViews$3
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding4;
                com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel disturbViewModel2;
                com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI disturbUI;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityDisturbBinding4 = com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity.this.binding;
                com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI disturbUI2 = null;
                if (activityDisturbBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityDisturbBinding4 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityDisturbBinding4.titleBar.tvRightText)) {
                    disturbViewModel2 = com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity.this.getDisturbViewModel();
                    java.lang.String deviceAddress2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(deviceAddress2);
                    disturbUI = com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity.this.disturb;
                    if (disturbUI == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("disturb");
                    } else {
                        disturbUI2 = disturbUI;
                    }
                    disturbViewModel2.saveDisturbSwitch(deviceAddress2, disturbUI2);
                    com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity.this.finish();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1$lambda-0, reason: not valid java name */
    public static final void m714setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity disturbActivity, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disturbActivity, "this$0");
        com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI disturbUI = disturbActivity.disturb;
        com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding = null;
        if (disturbUI == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("disturb");
            disturbUI = null;
        }
        disturbUI.setSwitch(z);
        if (z) {
            com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding2 = disturbActivity.binding;
            if (activityDisturbBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityDisturbBinding = activityDisturbBinding2;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityDisturbBinding.disturbGroup);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding3 = disturbActivity.binding;
        if (activityDisturbBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDisturbBinding = activityDisturbBinding3;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityDisturbBinding.disturbGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3$lambda-2, reason: not valid java name */
    public static final void m715setupViews$lambda3$lambda2(com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity disturbActivity, com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI disturbUI) {
        com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI disturbUI2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disturbActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(disturbUI, "it");
        disturbActivity.disturb = disturbUI;
        com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding = null;
        if (disturbUI == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("disturb");
            disturbUI2 = null;
        } else {
            disturbUI2 = disturbUI;
        }
        if (disturbUI2.getSwitch()) {
            com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding2 = disturbActivity.binding;
            if (activityDisturbBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDisturbBinding2 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityDisturbBinding2.disturbGroup);
        } else {
            com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding3 = disturbActivity.binding;
            if (activityDisturbBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDisturbBinding3 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityDisturbBinding3.disturbGroup);
        }
        com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding4 = disturbActivity.binding;
        if (activityDisturbBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDisturbBinding4 = null;
        }
        activityDisturbBinding4.qcDisturbSwitch.setChecked(disturbUI.getSwitch());
        com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding5 = disturbActivity.binding;
        if (activityDisturbBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDisturbBinding5 = null;
        }
        activityDisturbBinding5.qcDisturbStart.setRightText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(disturbUI.getStart()));
        com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding6 = disturbActivity.binding;
        if (activityDisturbBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDisturbBinding6 = null;
        }
        activityDisturbBinding6.qcDisturbEnd.setRightText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(disturbUI.getEnd()));
        if (disturbActivity.manualDND) {
            com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding7 = disturbActivity.binding;
            if (activityDisturbBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDisturbBinding7 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible((android.view.View) activityDisturbBinding7.qcSettingDisturbManual);
            com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding8 = disturbActivity.binding;
            if (activityDisturbBinding8 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDisturbBinding8 = null;
            }
            activityDisturbBinding8.qcSettingDisturbManual.setRightIconGone();
            if (disturbUI.getManualSwitch()) {
                com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding9 = disturbActivity.binding;
                if (activityDisturbBinding9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityDisturbBinding = activityDisturbBinding9;
                }
                activityDisturbBinding.qcSettingDisturbManual.setRightText(disturbActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_567));
                return;
            }
            com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding10 = disturbActivity.binding;
            if (activityDisturbBinding10 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityDisturbBinding = activityDisturbBinding10;
            }
            activityDisturbBinding.qcSettingDisturbManual.setRightText(disturbActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_21));
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) {
            if (((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect()) {
                return;
            }
            java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            finish();
            return;
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent) {
            this.manualDND = true;
            readDisturbFromDevice();
        }
    }

    private final void readDisturbFromDevice() {
        com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel disturbViewModel = getDisturbViewModel();
        java.lang.String deviceAddress = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
        kotlin.jvm.internal.Intrinsics.checkNotNull(deviceAddress);
        disturbViewModel.getDisturbSwitch(deviceAddress);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showTimeDialog(java.lang.String title, int time, final int type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_time_selector);
        com.qcwireless.qcwatch.base.dialog.BottomTimeDialog create = builder.create();
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.TimeListener() { // from class: com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity$$ExternalSyntheticLambda1
            @Override // com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.TimeListener
            public final void min(int i) {
                com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity.m716showTimeDialog$lambda4(type, this, i);
            }
        });
        create.initData((android.content.Context) this);
        create.setTitle(title);
        create.setCurrTime(time / 60, time % 60);
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showTimeDialog$lambda-4, reason: not valid java name */
    public static final void m716showTimeDialog$lambda4(int i, com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity disturbActivity, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disturbActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding = null;
        if (i == 1) {
            com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI disturbUI = disturbActivity.disturb;
            if (disturbUI == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("disturb");
                disturbUI = null;
            }
            disturbUI.setStart(i2);
            com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding2 = disturbActivity.binding;
            if (activityDisturbBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityDisturbBinding = activityDisturbBinding2;
            }
            activityDisturbBinding.qcDisturbStart.setRightText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(i2));
            return;
        }
        com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI disturbUI2 = disturbActivity.disturb;
        if (disturbUI2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("disturb");
            disturbUI2 = null;
        }
        disturbUI2.setEnd(i2);
        com.qcwireless.qcwatch.databinding.ActivityDisturbBinding activityDisturbBinding3 = disturbActivity.binding;
        if (activityDisturbBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDisturbBinding = activityDisturbBinding3;
        }
        activityDisturbBinding.qcDisturbEnd.setRightText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(i2));
    }
}
