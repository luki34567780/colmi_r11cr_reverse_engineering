package com.qcwireless.qcwatch.ui.device.push.message;

/* compiled from: MessagePushActivity.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0014J2\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u0010H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/message/MessagePushActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/device/push/adapter/PushSoftwareAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityMessagePushBinding;", "deviceSetting", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "pushViewModel", "Lcom/qcwireless/qcwatch/ui/device/push/message/MessagePushViewModel;", "getPushViewModel", "()Lcom/qcwireless/qcwatch/ui/device/push/message/MessagePushViewModel;", "pushViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setRichText", "textView", "Landroid/widget/TextView;", "content", "", "target", "color", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "setupViews", "CallPermissionCallback", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MessagePushActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.device.push.adapter.PushSoftwareAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding binding;
    private com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;

    /* renamed from: pushViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy pushViewModel;

    public MessagePushActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.pushViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel m850invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel getPushViewModel() {
        return (com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel) this.pushViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding inflate = com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding.inflate(getLayoutInflater());
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
        showLoadingDialogTimeout(500);
        android.content.Context context = (android.content.Context) this;
        this.adapter = new com.qcwireless.qcwatch.ui.device.push.adapter.PushSoftwareAdapter(context, getPushViewModel().getSoftList());
        final com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding activityMessagePushBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding activityMessagePushBinding2 = null;
        if (activityMessagePushBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMessagePushBinding = null;
        }
        com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding activityMessagePushBinding3 = this.binding;
        if (activityMessagePushBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMessagePushBinding3 = null;
        }
        activityMessagePushBinding3.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_48));
        activityMessagePushBinding.pushRcv.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityMessagePushBinding.pushRcv;
        com.qcwireless.qcwatch.ui.device.push.adapter.PushSoftwareAdapter pushSoftwareAdapter = this.adapter;
        if (pushSoftwareAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            pushSoftwareAdapter = null;
        }
        recyclerView.setAdapter(pushSoftwareAdapter);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_msg_push_footer, (android.view.ViewGroup) null);
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) inflate.findViewById(com.qcwireless.qcwatch.R.id.qc_other_switch);
        qSettingItemWithClickSystem.setChecked(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getOtherSoftwarePush());
        qSettingItemWithClickSystem.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity$$ExternalSyntheticLambda3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.m843setupViews$lambda4$lambda0(compoundButton, z);
            }
        });
        com.qcwireless.qcwatch.ui.device.push.adapter.PushSoftwareAdapter pushSoftwareAdapter2 = this.adapter;
        if (pushSoftwareAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            pushSoftwareAdapter2 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "footerView");
        com.chad.library.adapter.base.BaseQuickAdapter.addFooterView$default(pushSoftwareAdapter2, inflate, 0, 0, 6, null);
        activityMessagePushBinding.qcMessageSwitch.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.m844setupViews$lambda4$lambda1(com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding.this, this, compoundButton, z);
            }
        });
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getPushViewModel().getDeviceSetting().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity$$ExternalSyntheticLambda4
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.m845setupViews$lambda4$lambda2(com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this, (com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting) obj);
            }
        });
        activityMessagePushBinding.qcSmsSwitch.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity$$ExternalSyntheticLambda2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.m846setupViews$lambda4$lambda3(com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this, compoundButton, z);
            }
        });
        getPushViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity$$ExternalSyntheticLambda5
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.m847setupViews$lambda5(com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this, (com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI) obj);
            }
        });
        com.qcwireless.qcwatch.ui.device.push.adapter.PushSoftwareAdapter pushSoftwareAdapter3 = this.adapter;
        if (pushSoftwareAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            pushSoftwareAdapter3 = null;
        }
        pushSoftwareAdapter3.setOnItemClickListener(new com.chad.library.adapter.base.listener.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity$$ExternalSyntheticLambda6
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
                com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.m848setupViews$lambda6(com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this, baseQuickAdapter, view, i);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding activityMessagePushBinding4 = this.binding;
        if (activityMessagePushBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMessagePushBinding2 = activityMessagePushBinding4;
        }
        android.widget.TextView textView = activityMessagePushBinding2.tvInfo1;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "binding.tvInfo1");
        setRichText(textView, getString(com.qcwireless.qcwatch.R.string.qc_text_336), getString(com.qcwireless.qcwatch.R.string.qc_text_337), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00), new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.m849setupViews$lambda7(com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this, view);
            }
        });
        getPushViewModel().initData();
        getPushViewModel().initDeviceSetting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4$lambda-0, reason: not valid java name */
    public static final void m843setupViews$lambda4$lambda0(android.widget.CompoundButton compoundButton, boolean z) {
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setOtherSoftwarePush(z);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4$lambda-1, reason: not valid java name */
    public static final void m844setupViews$lambda4$lambda1(com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding activityMessagePushBinding, com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity messagePushActivity, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMessagePushBinding, "$this_run");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messagePushActivity, "this$0");
        if (z) {
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMessagePushBinding.messagePushGroup);
        } else {
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMessagePushBinding.messagePushGroup);
        }
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMessagePushEnable(z);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = messagePushActivity.deviceSetting;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = null;
        if (deviceSetting == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting = null;
        }
        deviceSetting.setMessagePushSwitch(z);
        com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel pushViewModel = messagePushActivity.getPushViewModel();
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = messagePushActivity.deviceSetting;
        if (deviceSetting3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
        } else {
            deviceSetting2 = deviceSetting3;
        }
        pushViewModel.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(deviceAddressNoClear, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(deviceSetting2)));
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.MessagePermissionEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-4$lambda-2, reason: not valid java name */
    public static final void m845setupViews$lambda4$lambda2(com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity messagePushActivity, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messagePushActivity, "this$0");
        if (deviceSetting != null) {
            messagePushActivity.deviceSetting = deviceSetting;
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMessagePushEnable()));
            com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding activityMessagePushBinding = messagePushActivity.binding;
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = null;
            com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding activityMessagePushBinding2 = null;
            if (activityMessagePushBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMessagePushBinding = null;
            }
            activityMessagePushBinding.qcMessageSwitch.setChecked(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMessagePushEnable());
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMessagePushEnable()) {
                com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding activityMessagePushBinding3 = messagePushActivity.binding;
                if (activityMessagePushBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityMessagePushBinding3 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMessagePushBinding3.messagePushGroup);
            } else {
                com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding activityMessagePushBinding4 = messagePushActivity.binding;
                if (activityMessagePushBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityMessagePushBinding4 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMessagePushBinding4.messagePushGroup);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(com.hjq.permissions.Permission.READ_SMS);
            arrayList.add(com.hjq.permissions.Permission.RECEIVE_SMS);
            java.util.Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                if (androidx.core.content.PermissionChecker.checkSelfPermission((android.content.Context) messagePushActivity, (java.lang.String) it.next()) != 0) {
                    com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding activityMessagePushBinding5 = messagePushActivity.binding;
                    if (activityMessagePushBinding5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityMessagePushBinding2 = activityMessagePushBinding5;
                    }
                    activityMessagePushBinding2.qcSmsSwitch.setChecked(false);
                    com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setSmsPushEnable(false);
                    com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                    return;
                }
                com.qcwireless.qcwatch.base.pref.UserConfig companion = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance();
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = messagePushActivity.deviceSetting;
                if (deviceSetting3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                    deviceSetting3 = null;
                }
                companion.setSmsPushEnable(deviceSetting3.getSmsPushSwitch());
                com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding activityMessagePushBinding6 = messagePushActivity.binding;
                if (activityMessagePushBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityMessagePushBinding6 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem = activityMessagePushBinding6.qcSmsSwitch;
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = messagePushActivity.deviceSetting;
                if (deviceSetting4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                } else {
                    deviceSetting2 = deviceSetting4;
                }
                qSettingItemWithClickSystem.setChecked(deviceSetting2.getSmsPushSwitch());
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4$lambda-3, reason: not valid java name */
    public static final void m846setupViews$lambda4$lambda3(com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity messagePushActivity, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messagePushActivity, "this$0");
        if (z) {
            androidx.fragment.app.FragmentActivity activity = messagePushActivity.getActivity();
            java.util.Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestSMSPermission(activity, messagePushActivity.new CallPermissionCallback());
            return;
        }
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = messagePushActivity.deviceSetting;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = null;
        if (deviceSetting == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting = null;
        }
        deviceSetting.setSmsPushSwitch(z);
        com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel pushViewModel = messagePushActivity.getPushViewModel();
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = messagePushActivity.deviceSetting;
        if (deviceSetting3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
        } else {
            deviceSetting2 = deviceSetting3;
        }
        pushViewModel.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(deviceAddressNoClear, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(deviceSetting2)));
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setSmsPushEnable(z);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.MessagePermissionEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-5, reason: not valid java name */
    public static final void m847setupViews$lambda5(com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity messagePushActivity, com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI messagePushUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messagePushActivity, "this$0");
        if (!messagePushUI.getInitFlag()) {
            messagePushActivity.getPushViewModel().queryOpenSoftWare((android.app.Activity) messagePushActivity);
            return;
        }
        if (messagePushUI.getData() != null) {
            messagePushActivity.getPushViewModel().getSoftList().clear();
            java.util.List<com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush> softList = messagePushActivity.getPushViewModel().getSoftList();
            java.util.List<com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush> data = messagePushUI.getData();
            kotlin.jvm.internal.Intrinsics.checkNotNull(data);
            softList.addAll(data);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "消息推送列表长度:" + messagePushActivity.getPushViewModel().getSoftList().size());
            com.qcwireless.qcwatch.ui.device.push.adapter.PushSoftwareAdapter pushSoftwareAdapter = messagePushActivity.adapter;
            if (pushSoftwareAdapter == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                pushSoftwareAdapter = null;
            }
            pushSoftwareAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-6, reason: not valid java name */
    public static final void m848setupViews$lambda6(com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity messagePushActivity, com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messagePushActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "<anonymous parameter 0>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush softwarePush = messagePushActivity.getPushViewModel().getSoftList().get(i);
        softwarePush.setSwitch(!softwarePush.getSwitch());
        messagePushActivity.getPushViewModel().saveBean(softwarePush);
        com.qcwireless.qcwatch.ui.device.push.adapter.PushSoftwareAdapter pushSoftwareAdapter = messagePushActivity.adapter;
        if (pushSoftwareAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            pushSoftwareAdapter = null;
        }
        pushSoftwareAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-7, reason: not valid java name */
    public static final void m849setupViews$lambda7(com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity messagePushActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messagePushActivity, "this$0");
        try {
            messagePushActivity.startActivityForResult(new android.content.Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"), 100);
        } catch (android.content.ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        com.oudmon.ble.base.util.ThreadUtils.postDelay(new com.oudmon.ble.base.util.ThreadUtils.TimeTask() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity$onResume$1
            @Override // com.oudmon.ble.base.util.ThreadUtils.TimeTask
            protected void task() {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(com.hjq.permissions.Permission.READ_SMS);
                arrayList.add(com.hjq.permissions.Permission.RECEIVE_SMS);
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    androidx.core.content.PermissionChecker.checkSelfPermission((android.content.Context) com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this, (java.lang.String) it.next());
                }
            }
        }, 100L);
    }

    public final void setRichText(android.widget.TextView textView, java.lang.String content, java.lang.String target, final int color, final android.view.View.OnClickListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "textView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        java.lang.String str = content;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(target).matcher(str);
        while (matcher.find()) {
            spannableStringBuilder.setSpan(new android.text.style.ClickableSpan() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity$setRichText$1
                @Override // android.text.style.ClickableSpan
                public void onClick(android.view.View view) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                    listener.onClick(view);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(android.text.TextPaint ds) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ds, "ds");
                    super.updateDrawState(ds);
                    ds.setUnderlineText(true);
                    ds.setColor(color);
                }
            }, matcher.start(), matcher.end(), 33);
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    /* compiled from: MessagePushActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/message/MessagePushActivity$CallPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/device/push/message/MessagePushActivity;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class CallPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public CallPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(all));
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, permissions);
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
            if (all) {
                com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding activityMessagePushBinding = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this.binding;
                if (activityMessagePushBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityMessagePushBinding = null;
                }
                activityMessagePushBinding.qcSmsSwitch.setChecked(true);
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this.deviceSetting;
                if (deviceSetting2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                    deviceSetting2 = null;
                }
                deviceSetting2.setSmsPushSwitch(true);
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setSmsPushEnable(true);
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                final com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity messagePushActivity = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.CallPermissionCallback, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity$CallPermissionCallback$onGranted$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.CallPermissionCallback) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.CallPermissionCallback callPermissionCallback) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callPermissionCallback, "$this$ktxRunOnBgSingle");
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(com.hjq.permissions.Permission.READ_SMS);
                        arrayList.add(com.hjq.permissions.Permission.RECEIVE_SMS);
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (androidx.core.content.PermissionChecker.checkSelfPermission(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT(), (java.lang.String) it.next()) != 0) {
                                final com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity messagePushActivity2 = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this;
                                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(callPermissionCallback, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.CallPermissionCallback, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity$CallPermissionCallback$onGranted$1.1
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                        invoke((com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.CallPermissionCallback) obj);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.CallPermissionCallback callPermissionCallback2) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callPermissionCallback2, "$this$ktxRunOnUi");
                                        com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding activityMessagePushBinding2 = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this.binding;
                                        if (activityMessagePushBinding2 == null) {
                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                            activityMessagePushBinding2 = null;
                                        }
                                        activityMessagePushBinding2.qcSmsSwitch.setChecked(false);
                                        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this.deviceSetting;
                                        if (deviceSetting3 == null) {
                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                                            deviceSetting3 = null;
                                        }
                                        deviceSetting3.setSmsPushSwitch(false);
                                        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setSmsPushEnable(false);
                                        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                                        java.lang.String string = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
                                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                                    }
                                });
                                com.hjq.permissions.XXPermissions.startPermissionActivity((android.app.Activity) com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this, (java.util.List<java.lang.String>) arrayList);
                                return;
                            }
                        }
                    }
                });
            } else {
                com.iwown.awlog.AwLog.wtfJson(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.iwown.awlog.bean.AppLog(com.qcwireless.qcwatch.QJavaApplication.getInstance().getYMD(), "sms ng", "2")), com.qcwireless.qcwatch.QJavaApplication.getAppLogPath());
                com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding activityMessagePushBinding2 = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this.binding;
                if (activityMessagePushBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityMessagePushBinding2 = null;
                }
                activityMessagePushBinding2.qcSmsSwitch.setChecked(false);
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this.deviceSetting;
                if (deviceSetting3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                    deviceSetting3 = null;
                }
                deviceSetting3.setSmsPushSwitch(false);
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setSmsPushEnable(false);
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                java.lang.String string = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            }
            com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel pushViewModel = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this.getPushViewModel();
            java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this.deviceSetting;
            if (deviceSetting4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            } else {
                deviceSetting = deviceSetting4;
            }
            pushViewModel.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(deviceAddressNoClear, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(deviceSetting)));
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.MessagePermissionEvent());
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setSmsPushEnable(false);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this.deviceSetting;
            com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding activityMessagePushBinding = null;
            if (deviceSetting == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting = null;
            }
            deviceSetting.setSmsPushSwitch(false);
            com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel pushViewModel = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this.getPushViewModel();
            java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this.deviceSetting;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting2 = null;
            }
            pushViewModel.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(deviceAddressNoClear, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(deviceSetting2)));
            java.lang.String string = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            com.qcwireless.qcwatch.databinding.ActivityMessagePushBinding activityMessagePushBinding2 = com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this.binding;
            if (activityMessagePushBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityMessagePushBinding = activityMessagePushBinding2;
            }
            activityMessagePushBinding.qcSmsSwitch.setChecked(false);
            com.iwown.awlog.AwLog.wtfJson(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.iwown.awlog.bean.AppLog(com.qcwireless.qcwatch.QJavaApplication.getInstance().getYMD(), "sms ng", "2")), com.qcwireless.qcwatch.QJavaApplication.getAppLogPath());
            if (never) {
                com.hjq.permissions.XXPermissions.startPermissionActivity((android.app.Activity) com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.this, permissions);
            }
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.MessagePermissionEvent());
        }
    }
}
