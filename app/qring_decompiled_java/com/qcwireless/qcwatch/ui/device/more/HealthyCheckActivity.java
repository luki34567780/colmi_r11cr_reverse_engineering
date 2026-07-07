package com.qcwireless.qcwatch.ui.device.more;

/* compiled from: HealthyCheckActivity.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0014J\u0006\u0010\u0016\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/more/HealthyCheckActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityHealthyCheckBinding;", "deviceSetting", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "heartWarming", "", "moreSettingVm", "Lcom/qcwireless/qcwatch/ui/device/more/MoreSettingViewModel;", "getMoreSettingVm", "()Lcom/qcwireless/qcwatch/ui/device/more/MoreSettingViewModel;", "moreSettingVm$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "readFromDevice", "setupViews", "showHeartInterval", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class HealthyCheckActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding binding;
    private com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;
    private int heartWarming;

    /* renamed from: moreSettingVm$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy moreSettingVm;

    private final void readFromDevice() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-7$lambda-3$lambda-2, reason: not valid java name */
    public static final void m744setupViews$lambda7$lambda3$lambda2(com.oudmon.ble.base.communication.rsp.BloodOxygenSettingRsp bloodOxygenSettingRsp) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-7$lambda-6$lambda-5, reason: not valid java name */
    public static final void m747setupViews$lambda7$lambda6$lambda5(com.oudmon.ble.base.communication.rsp.PressureSettingRsp pressureSettingRsp) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showHeartInterval$lambda-9$lambda-8, reason: not valid java name */
    public static final void m749showHeartInterval$lambda9$lambda8(com.oudmon.ble.base.communication.rsp.HeartRateSettingRsp heartRateSettingRsp) {
    }

    public HealthyCheckActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.moreSettingVm = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel m750invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel.class), qualifier, qualifier);
            }
        });
    }

    private final com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel getMoreSettingVm() {
        return (com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel) this.moreSettingVm.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding inflate = com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding.inflate(getLayoutInflater());
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
        showLoadingDialogTimeout(com.google.android.gms.fitness.FitnessStatusCodes.NEEDS_OAUTH_PERMISSIONS);
        getMoreSettingVm().initData(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        getMoreSettingVm().getUiDeviceState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity$$ExternalSyntheticLambda4
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.m741setupViews$lambda0(com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.this, (com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding2 = null;
        if (activityHealthyCheckBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHealthyCheckBinding = null;
        }
        activityHealthyCheckBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_6666014));
        activityHealthyCheckBinding.qcSettingHeart.setmOnLSettingItemWithClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem.OnLSettingItemWithClickSystem() { // from class: com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity$setupViews$2$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem.OnLSettingItemWithClickSystem
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.this.showHeartInterval();
            }
        });
        activityHealthyCheckBinding.qcSettingHeart.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity$$ExternalSyntheticLambda3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.m742setupViews$lambda7$lambda1(com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.this, compoundButton, z);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding3 = this.binding;
        if (activityHealthyCheckBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHealthyCheckBinding3 = null;
        }
        activityHealthyCheckBinding3.qcSettingBloodOxygen.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.m743setupViews$lambda7$lambda3(com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.this, compoundButton, z);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding4 = this.binding;
        if (activityHealthyCheckBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHealthyCheckBinding4 = null;
        }
        activityHealthyCheckBinding4.qcSettingHeartNot.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity$$ExternalSyntheticLambda2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.m745setupViews$lambda7$lambda4(com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.this, compoundButton, z);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding5 = this.binding;
        if (activityHealthyCheckBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityHealthyCheckBinding2 = activityHealthyCheckBinding5;
        }
        activityHealthyCheckBinding2.qcSettingPressure.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.m746setupViews$lambda7$lambda6(com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.this, compoundButton, z);
            }
        });
        activityHealthyCheckBinding.qcMoreHeartWarmingUp.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity$setupViews$2$6
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-0, reason: not valid java name */
    public static final void m741setupViews$lambda0(com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity healthyCheckActivity, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyCheckActivity, "this$0");
        healthyCheckActivity.dismissLoadingDialog();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceSetting, "it");
        healthyCheckActivity.deviceSetting = deviceSetting;
        com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding = null;
        if (deviceSetting.getHrDetection() && deviceSetting.getHrInterval() != 99) {
            com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding2 = healthyCheckActivity.binding;
            if (activityHealthyCheckBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHealthyCheckBinding2 = null;
            }
            activityHealthyCheckBinding2.qcSettingHeart.setRightText(deviceSetting.getHrInterval() + healthyCheckActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_91));
        } else {
            com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding3 = healthyCheckActivity.binding;
            if (activityHealthyCheckBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHealthyCheckBinding3 = null;
            }
            activityHealthyCheckBinding3.qcSettingHeart.setRightText(healthyCheckActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_21));
        }
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHeartRateInterval()) {
            com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding4 = healthyCheckActivity.binding;
            if (activityHealthyCheckBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHealthyCheckBinding4 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible((android.view.View) activityHealthyCheckBinding4.qcSettingHeart);
            com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding5 = healthyCheckActivity.binding;
            if (activityHealthyCheckBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHealthyCheckBinding5 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) activityHealthyCheckBinding5.qcSettingHeartNot);
        } else {
            com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding6 = healthyCheckActivity.binding;
            if (activityHealthyCheckBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHealthyCheckBinding6 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible((android.view.View) activityHealthyCheckBinding6.qcSettingHeartNot);
            com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding7 = healthyCheckActivity.binding;
            if (activityHealthyCheckBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHealthyCheckBinding7 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) activityHealthyCheckBinding7.qcSettingHeart);
        }
        com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding8 = healthyCheckActivity.binding;
        if (activityHealthyCheckBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHealthyCheckBinding8 = null;
        }
        activityHealthyCheckBinding8.qcSettingHeartNot.setChecked(deviceSetting.getHrDetection());
        com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding9 = healthyCheckActivity.binding;
        if (activityHealthyCheckBinding9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHealthyCheckBinding9 = null;
        }
        activityHealthyCheckBinding9.qcSettingBloodOxygen.setChecked(deviceSetting.getBo2Detection());
        com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding10 = healthyCheckActivity.binding;
        if (activityHealthyCheckBinding10 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityHealthyCheckBinding = activityHealthyCheckBinding10;
        }
        activityHealthyCheckBinding.qcSettingPressure.setChecked(deviceSetting.getPressureDetection());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-7$lambda-1, reason: not valid java name */
    public static final void m742setupViews$lambda7$lambda1(com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity healthyCheckActivity, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyCheckActivity, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = healthyCheckActivity.deviceSetting;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting2 = null;
            }
            deviceSetting2.setHrDetection(z);
            com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel moreSettingVm = healthyCheckActivity.getMoreSettingVm();
            java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = healthyCheckActivity.deviceSetting;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            } else {
                deviceSetting = deviceSetting3;
            }
            moreSettingVm.saveReminder(deviceAddressNoClear, deviceSetting);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding = healthyCheckActivity.binding;
        if (activityHealthyCheckBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHealthyCheckBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem = activityHealthyCheckBinding.qcSettingHeart;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = healthyCheckActivity.deviceSetting;
        if (deviceSetting4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting4 = null;
        }
        qSettingItemWithClickSystem.setChecked(deviceSetting4.getHrDetection());
        java.lang.String string = healthyCheckActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-7$lambda-3, reason: not valid java name */
    public static final void m743setupViews$lambda7$lambda3(com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity healthyCheckActivity, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyCheckActivity, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = healthyCheckActivity.deviceSetting;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting2 = null;
            }
            deviceSetting2.setBo2Detection(z);
            com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel moreSettingVm = healthyCheckActivity.getMoreSettingVm();
            java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = healthyCheckActivity.deviceSetting;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting3 = null;
            }
            moreSettingVm.saveReminder(deviceAddressNoClear, deviceSetting3);
            com.oudmon.ble.base.communication.CommandHandle commandHandle = com.oudmon.ble.base.communication.CommandHandle.getInstance();
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = healthyCheckActivity.deviceSetting;
            if (deviceSetting4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            } else {
                deviceSetting = deviceSetting4;
            }
            commandHandle.executeReqCmd(com.oudmon.ble.base.communication.req.BloodOxygenSettingReq.getWriteInstance(deviceSetting.getBo2Detection()), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity$$ExternalSyntheticLambda5
                @Override // com.oudmon.ble.base.communication.ICommandResponse
                public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                    com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.m744setupViews$lambda7$lambda3$lambda2((com.oudmon.ble.base.communication.rsp.BloodOxygenSettingRsp) baseRspCmd);
                }
            });
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding = healthyCheckActivity.binding;
        if (activityHealthyCheckBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHealthyCheckBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem = activityHealthyCheckBinding.qcSettingBloodOxygen;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting5 = healthyCheckActivity.deviceSetting;
        if (deviceSetting5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting5 = null;
        }
        qSettingItemWithClickSystem.setChecked(deviceSetting5.getBo2Detection());
        java.lang.String string = healthyCheckActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-7$lambda-4, reason: not valid java name */
    public static final void m745setupViews$lambda7$lambda4(com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity healthyCheckActivity, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyCheckActivity, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = healthyCheckActivity.deviceSetting;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting2 = null;
            }
            deviceSetting2.setHrDetection(z);
            com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel moreSettingVm = healthyCheckActivity.getMoreSettingVm();
            java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = healthyCheckActivity.deviceSetting;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            } else {
                deviceSetting = deviceSetting3;
            }
            moreSettingVm.saveReminder(deviceAddressNoClear, deviceSetting);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding = healthyCheckActivity.binding;
        if (activityHealthyCheckBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHealthyCheckBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem = activityHealthyCheckBinding.qcSettingHeartNot;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = healthyCheckActivity.deviceSetting;
        if (deviceSetting4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting4 = null;
        }
        qSettingItemWithClickSystem.setChecked(deviceSetting4.getHrDetection());
        java.lang.String string = healthyCheckActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-7$lambda-6, reason: not valid java name */
    public static final void m746setupViews$lambda7$lambda6(com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity healthyCheckActivity, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyCheckActivity, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = healthyCheckActivity.deviceSetting;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting2 = null;
            }
            deviceSetting2.setPressureDetection(z);
            com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel moreSettingVm = healthyCheckActivity.getMoreSettingVm();
            java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = healthyCheckActivity.deviceSetting;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting3 = null;
            }
            moreSettingVm.saveReminder(deviceAddressNoClear, deviceSetting3);
            com.oudmon.ble.base.communication.CommandHandle commandHandle = com.oudmon.ble.base.communication.CommandHandle.getInstance();
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = healthyCheckActivity.deviceSetting;
            if (deviceSetting4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            } else {
                deviceSetting = deviceSetting4;
            }
            commandHandle.executeReqCmd(com.oudmon.ble.base.communication.req.PressureSettingReq.getWriteInstance(deviceSetting.getPressureDetection()), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity$$ExternalSyntheticLambda7
                @Override // com.oudmon.ble.base.communication.ICommandResponse
                public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                    com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.m747setupViews$lambda7$lambda6$lambda5((com.oudmon.ble.base.communication.rsp.PressureSettingRsp) baseRspCmd);
                }
            });
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding = healthyCheckActivity.binding;
        if (activityHealthyCheckBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHealthyCheckBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem = activityHealthyCheckBinding.qcSettingPressure;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting5 = healthyCheckActivity.deviceSetting;
        if (deviceSetting5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting5 = null;
        }
        qSettingItemWithClickSystem.setChecked(deviceSetting5.getPressureDetection());
        java.lang.String string = healthyCheckActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showHeartInterval() {
        com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_heart_interval);
        com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog create = builder.create();
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.SelectSecondListener() { // from class: com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity$$ExternalSyntheticLambda8
            @Override // com.qcwireless.qcwatch.base.dialog.BottomDeviceHeartDialog.SelectSecondListener
            public final void showSecond(java.lang.String str) {
                com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.m748showHeartInterval$lambda9(com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.this, str);
            }
        });
        create.initData((android.content.Context) this);
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = this.deviceSetting;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = null;
        if (deviceSetting == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting = null;
        }
        if (deviceSetting.getHrInterval() != 99) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = this.deviceSetting;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting3 = null;
            }
            if (deviceSetting3.getHrDetection()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = this.deviceSetting;
                if (deviceSetting4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                } else {
                    deviceSetting2 = deviceSetting4;
                }
                sb.append(deviceSetting2.getHrInterval());
                sb.append(getString(com.qcwireless.qcwatch.R.string.qc_text_91));
                create.setCurrItemText(sb.toString());
                create.show();
            }
        }
        create.setCurrItemText(getString(com.qcwireless.qcwatch.R.string.qc_text_6666063));
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showHeartInterval$lambda-9, reason: not valid java name */
    public static final void m748showHeartInterval$lambda9(com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity healthyCheckActivity, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyCheckActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "it");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
        int parseInt = java.lang.Integer.parseInt(str);
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (parseInt == 99) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = healthyCheckActivity.deviceSetting;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting2 = null;
            }
            deviceSetting2.setHrDetection(false);
            com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding = healthyCheckActivity.binding;
            if (activityHealthyCheckBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHealthyCheckBinding = null;
            }
            activityHealthyCheckBinding.qcSettingHeart.setRightText(healthyCheckActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_21));
        } else {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = healthyCheckActivity.deviceSetting;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting3 = null;
            }
            deviceSetting3.setHrDetection(true);
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = healthyCheckActivity.deviceSetting;
            if (deviceSetting4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting4 = null;
            }
            deviceSetting4.setHrInterval(parseInt);
            com.qcwireless.qcwatch.databinding.ActivityHealthyCheckBinding activityHealthyCheckBinding2 = healthyCheckActivity.binding;
            if (activityHealthyCheckBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHealthyCheckBinding2 = null;
            }
            activityHealthyCheckBinding2.qcSettingHeart.setRightText(str + healthyCheckActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_91));
        }
        boolean z = parseInt != 99;
        if (parseInt == 99) {
            parseInt = 5;
        }
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.HeartRateSettingReq.getWriteInstance(z, parseInt), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity$$ExternalSyntheticLambda6
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.m749showHeartInterval$lambda9$lambda8((com.oudmon.ble.base.communication.rsp.HeartRateSettingRsp) baseRspCmd);
            }
        });
        com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel moreSettingVm = healthyCheckActivity.getMoreSettingVm();
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting5 = healthyCheckActivity.deviceSetting;
        if (deviceSetting5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
        } else {
            deviceSetting = deviceSetting5;
        }
        moreSettingVm.saveReminder(deviceAddressNoClear, deviceSetting);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
    }
}
