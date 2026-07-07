package com.qcwireless.qcwatch.ui.device;

import com.qcwireless.qcwatch.ui.device.DeviceFragment.BluetoothPermissionCallback;
import com.qcwireless.qcwatch.ui.device.DeviceFragment.CameraPermissionCallback;
import com.qcwireless.qcwatch.ui.device.DeviceFragment.LocationPermissionCallback;

/* compiled from: DeviceFragment.kt */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 B2\u00020\u0001:\u0007?@ABCDEB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u001bH\u0016J\"\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\u001bH\u0016J\u0010\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u000202H\u0007J\b\u00103\u001a\u00020\u001bH\u0016J\b\u00104\u001a\u00020\u001bH\u0003J\b\u00105\u001a\u00020\u001bH\u0003J\b\u00106\u001a\u00020\u001bH\u0002J\u0016\u00107\u001a\u00020\u001b2\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0002J\u0006\u0010;\u001a\u00020\u001bJ\b\u0010<\u001a\u00020\u001bH\u0002J\u0006\u0010=\u001a\u00020\u001bJ\u0006\u0010>\u001a\u00020\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00060\u0017R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00060\u0019R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/DeviceFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentDeviceBinding;", "deviceSetting", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "deviceSettingVm", "Lcom/qcwireless/qcwatch/ui/device/vm/DeviceSettingViewModel;", "getDeviceSettingVm", "()Lcom/qcwireless/qcwatch/ui/device/vm/DeviceSettingViewModel;", "deviceSettingVm$delegate", "Lkotlin/Lazy;", "deviceViewModel", "Lcom/qcwireless/qcwatch/ui/device/vm/DeviceViewModel;", "getDeviceViewModel", "()Lcom/qcwireless/qcwatch/ui/device/vm/DeviceViewModel;", "deviceViewModel$delegate", "fwVersionCount", "", "handler", "Landroid/os/Handler;", "myFwRunnable", "Lcom/qcwireless/qcwatch/ui/device/DeviceFragment$MyFwRunnable;", "myRunnable", "Lcom/qcwireless/qcwatch/ui/device/DeviceFragment$MyRunnable;", "checkAppError", "", "initDeviceSetting", "it", "initSupportFunction", "isNotificationListenerEnabled", "", "loadDataOnce", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "readBattery", "refreshUI", "showNotificationDialog", "showPermissionWarmingDialog", "permissions", "", "", "showTimeFormatDialog", "showUnbindDialog", "showUnitDialog", "showWeatherDialog", "BluetoothPermissionCallback", "CallPermissionCallback", "CameraPermissionCallback", "Companion", "LocationPermissionCallback", "MyFwRunnable", "MyRunnable", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DeviceFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.device.DeviceFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.device.DeviceFragment.Companion(null);
    private com.qcwireless.qcwatch.databinding.FragmentDeviceBinding binding;
    private com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;

    /* renamed from: deviceSettingVm$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy deviceSettingVm;

    /* renamed from: deviceViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy deviceViewModel;
    private int fwVersionCount;
    private final android.os.Handler handler;
    private final com.qcwireless.qcwatch.ui.device.DeviceFragment.MyFwRunnable myFwRunnable = new com.qcwireless.qcwatch.ui.device.DeviceFragment.MyFwRunnable();
    private final com.qcwireless.qcwatch.ui.device.DeviceFragment.MyRunnable myRunnable = new com.qcwireless.qcwatch.ui.device.DeviceFragment.MyRunnable();

    public DeviceFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.deviceViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel m643invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.class), qualifier, qualifier);
            }
        });
        this.deviceSettingVm = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel m644invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
    }

    private final com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel getDeviceViewModel() {
        return (com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel) this.deviceViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel getDeviceSettingVm() {
        return (com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel) this.deviceSettingVm.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding inflate = com.qcwireless.qcwatch.databinding.FragmentDeviceBinding.inflate(inflater, container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.binding = inflate;
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = this.binding;
        if (fragmentDeviceBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDeviceBinding = null;
        }
        return fragmentDeviceBinding.getRoot();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onResume() {
        super.onResume();
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = null;
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            if (com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().getSync()) {
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding2 = this.binding;
                if (fragmentDeviceBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDeviceBinding2 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDeviceBinding2.disconnectView);
            } else {
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding3 = this.binding;
                if (fragmentDeviceBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDeviceBinding3 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding3.disconnectView);
            }
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding4 = this.binding;
            if (fragmentDeviceBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding4 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding4.imageWarming);
        } else {
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding5 = this.binding;
            if (fragmentDeviceBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding5 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDeviceBinding5.disconnectView);
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding6 = this.binding;
            if (fragmentDeviceBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding6 = null;
            }
            fragmentDeviceBinding6.tvDeviceBattery.setText("--");
            com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUp();
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding7 = this.binding;
            if (fragmentDeviceBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding7 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDeviceBinding7.imageWarming);
        }
        try {
            boolean isNotificationListenerEnabled = isNotificationListenerEnabled();
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMessagePushEnable() && isNotificationListenerEnabled) {
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding8 = this.binding;
                if (fragmentDeviceBinding8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDeviceBinding8 = null;
                }
                fragmentDeviceBinding8.qcSettingMessage.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_22));
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding9 = this.binding;
                if (fragmentDeviceBinding9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentDeviceBinding = fragmentDeviceBinding9;
                }
                fragmentDeviceBinding.qcSettingMessage.setErrorIcon(false);
                return;
            }
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding10 = this.binding;
            if (fragmentDeviceBinding10 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding10 = null;
            }
            fragmentDeviceBinding10.qcSettingMessage.setErrorIcon(true);
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding11 = this.binding;
            if (fragmentDeviceBinding11 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentDeviceBinding = fragmentDeviceBinding11;
            }
            fragmentDeviceBinding.qcSettingMessage.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_21));
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void loadDataOnce() {
        super.loadDataOnce();
        refreshUI();
        final com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = null;
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding2 = this.binding;
            if (fragmentDeviceBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding2 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDeviceBinding2.imageWarming);
        } else {
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding3 = this.binding;
            if (fragmentDeviceBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding3 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding3.imageWarming);
        }
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding4 = this.binding;
        if (fragmentDeviceBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDeviceBinding4 = null;
        }
        fragmentDeviceBinding4.syncDeviceRefresh.setOnRefreshListener(new com.scwang.smart.refresh.layout.listener.OnRefreshListener() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$$ExternalSyntheticLambda6
            public final void onRefresh(com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.m627loadDataOnce$lambda0(com.qcwireless.qcwatch.ui.device.DeviceFragment.this, refreshLayout);
            }
        });
        com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel deviceViewModel = getDeviceViewModel();
        deviceViewModel.init();
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        deviceViewModel.getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$$ExternalSyntheticLambda13
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.m628loadDataOnce$lambda2$lambda1(com.qcwireless.qcwatch.ui.device.DeviceFragment.this, (com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DeviceFragmentUI) obj);
            }
        });
        getDeviceSettingVm().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$$ExternalSyntheticLambda12
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.m629loadDataOnce$lambda3(com.qcwireless.qcwatch.ui.device.DeviceFragment.this, (com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting) obj);
            }
        });
        android.view.View[] viewArr = new android.view.View[6];
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding5 = this.binding;
        if (fragmentDeviceBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDeviceBinding5 = null;
        }
        viewArr[0] = fragmentDeviceBinding5.btnDeviceAdd;
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding6 = this.binding;
        if (fragmentDeviceBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDeviceBinding6 = null;
        }
        viewArr[1] = fragmentDeviceBinding6.tvDeviceUnbind;
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding7 = this.binding;
        if (fragmentDeviceBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDeviceBinding7 = null;
        }
        viewArr[2] = fragmentDeviceBinding7.disconnectView;
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding8 = this.binding;
        if (fragmentDeviceBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDeviceBinding8 = null;
        }
        viewArr[3] = fragmentDeviceBinding8.btnFirmwareUpdate;
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding9 = this.binding;
        if (fragmentDeviceBinding9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDeviceBinding9 = null;
        }
        viewArr[4] = fragmentDeviceBinding9.imageWarming;
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding10 = this.binding;
        if (fragmentDeviceBinding10 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDeviceBinding10 = null;
        }
        viewArr[5] = fragmentDeviceBinding10.btnAddDevice;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$4
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                boolean areEqual;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding11 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.binding;
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding12 = null;
                if (fragmentDeviceBinding11 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDeviceBinding11 = null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentDeviceBinding11.disconnectView)) {
                    com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding13 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.binding;
                    if (fragmentDeviceBinding13 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentDeviceBinding13 = null;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentDeviceBinding13.btnDeviceAdd)) {
                        areEqual = true;
                    } else {
                        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding14 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.binding;
                        if (fragmentDeviceBinding14 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            fragmentDeviceBinding14 = null;
                        }
                        areEqual = kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentDeviceBinding14.btnAddDevice);
                    }
                    if (!areEqual) {
                        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding15 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.binding;
                        if (fragmentDeviceBinding15 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            fragmentDeviceBinding15 = null;
                        }
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentDeviceBinding15.tvDeviceUnbind)) {
                            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding16 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.binding;
                            if (fragmentDeviceBinding16 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentDeviceBinding16 = null;
                            }
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentDeviceBinding16.imageWarming)) {
                                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding17 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.binding;
                                if (fragmentDeviceBinding17 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    fragmentDeviceBinding17 = null;
                                }
                                if (kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentDeviceBinding17.btnFirmwareUpdate)) {
                                    java.lang.String battery = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getBattery();
                                    java.lang.Integer valueOf = battery != null ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(battery)) : null;
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
                                    if (valueOf.intValue() < 10) {
                                        java.lang.String string = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_524);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_524)");
                                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                                        return;
                                    }
                                    if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                                        java.lang.String language = java.util.Locale.getDefault().getLanguage();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "language");
                                        if (kotlin.text.StringsKt.startsWith$default(language, "zh", false, 2, (java.lang.Object) null)) {
                                            if (!com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isNetworkAvailable(com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getActivity())) {
                                                java.lang.String string2 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_223);
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_223)");
                                                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
                                                return;
                                            }
                                            com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
                                            android.content.Context activity = deviceFragment.getActivity();
                                            if (activity != null) {
                                                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                                                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.class);
                                                for (kotlin.Pair pair : arrayList) {
                                                    if (pair != null) {
                                                        java.lang.String str = (java.lang.String) pair.getFirst();
                                                        java.lang.Object second = pair.getSecond();
                                                        if (second instanceof java.lang.Integer) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                                                        } else if (second instanceof java.lang.Byte) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                                                        } else if (second instanceof java.lang.Character) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                                                        } else if (second instanceof java.lang.Short) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                                                        } else if (second instanceof java.lang.Boolean) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                                                        } else if (second instanceof java.lang.Long) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                                                        } else if (second instanceof java.lang.Float) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                                                        } else if (second instanceof java.lang.Double) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                                                        } else if (second instanceof java.lang.String) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                                                        } else if (second instanceof java.lang.CharSequence) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                                                        } else if (second instanceof android.os.Parcelable) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                                                        } else if (second instanceof java.lang.Object[]) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                                                        } else if (second instanceof java.util.ArrayList) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                                                        } else if (second instanceof java.io.Serializable) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                                                        } else if (second instanceof boolean[]) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                                                        } else if (second instanceof byte[]) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                                                        } else if (second instanceof short[]) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                                                        } else if (second instanceof char[]) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                                                        } else if (second instanceof int[]) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                                                        } else if (second instanceof long[]) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                                                        } else if (second instanceof float[]) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                                                        } else if (second instanceof double[]) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                                                        } else if (second instanceof android.os.Bundle) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                                                        } else if (second instanceof android.content.Intent) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                                                        } else {
                                                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                                        }
                                                    }
                                                }
                                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                                deviceFragment.startActivity(intent);
                                                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                                kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                                                return;
                                            }
                                            return;
                                        }
                                        com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment2 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
                                        android.content.Context activity2 = deviceFragment2.getActivity();
                                        if (activity2 != null) {
                                            java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity2, "it");
                                            android.content.Intent intent2 = new android.content.Intent(activity2, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity.class);
                                            for (kotlin.Pair pair2 : arrayList2) {
                                                if (pair2 != null) {
                                                    java.lang.String str2 = (java.lang.String) pair2.getFirst();
                                                    java.lang.Object second2 = pair2.getSecond();
                                                    if (second2 instanceof java.lang.Integer) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).intValue()), "putExtra(name, value)");
                                                    } else if (second2 instanceof java.lang.Byte) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).byteValue()), "putExtra(name, value)");
                                                    } else if (second2 instanceof java.lang.Character) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Character) second2).charValue()), "putExtra(name, value)");
                                                    } else if (second2 instanceof java.lang.Short) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).shortValue()), "putExtra(name, value)");
                                                    } else if (second2 instanceof java.lang.Boolean) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Boolean) second2).booleanValue()), "putExtra(name, value)");
                                                    } else if (second2 instanceof java.lang.Long) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).longValue()), "putExtra(name, value)");
                                                    } else if (second2 instanceof java.lang.Float) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).floatValue()), "putExtra(name, value)");
                                                    } else if (second2 instanceof java.lang.Double) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).doubleValue()), "putExtra(name, value)");
                                                    } else if (second2 instanceof java.lang.String) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.lang.String) second2), "putExtra(name, value)");
                                                    } else if (second2 instanceof java.lang.CharSequence) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.lang.CharSequence) second2), "putExtra(name, value)");
                                                    } else if (second2 instanceof android.os.Parcelable) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Parcelable) second2), "putExtra(name, value)");
                                                    } else if (second2 instanceof java.lang.Object[]) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                                                    } else if (second2 instanceof java.util.ArrayList) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                                                    } else if (second2 instanceof java.io.Serializable) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                                                    } else if (second2 instanceof boolean[]) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (boolean[]) second2), "putExtra(name, value)");
                                                    } else if (second2 instanceof byte[]) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (byte[]) second2), "putExtra(name, value)");
                                                    } else if (second2 instanceof short[]) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (short[]) second2), "putExtra(name, value)");
                                                    } else if (second2 instanceof char[]) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (char[]) second2), "putExtra(name, value)");
                                                    } else if (second2 instanceof int[]) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (int[]) second2), "putExtra(name, value)");
                                                    } else if (second2 instanceof long[]) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (long[]) second2), "putExtra(name, value)");
                                                    } else if (second2 instanceof float[]) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (float[]) second2), "putExtra(name, value)");
                                                    } else if (second2 instanceof double[]) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (double[]) second2), "putExtra(name, value)");
                                                    } else if (second2 instanceof android.os.Bundle) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Bundle) second2), "putExtra(name, value)");
                                                    } else if (second2 instanceof android.content.Intent) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Parcelable) second2), "putExtra(name, value)");
                                                    } else {
                                                        kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                                                    }
                                                }
                                            }
                                            kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                                            kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                                            kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                                            deviceFragment2.startActivity(intent2);
                                            kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                                            kotlin.Unit unit12 = kotlin.Unit.INSTANCE;
                                            return;
                                        }
                                        return;
                                    }
                                    java.lang.String string3 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_75)");
                                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string3, 0, 1, null);
                                    return;
                                }
                                return;
                            }
                            com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment3 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
                            android.content.Context activity3 = deviceFragment3.getActivity();
                            if (activity3 != null) {
                                java.util.ArrayList<kotlin.Pair> arrayList3 = new java.util.ArrayList();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity3, "it");
                                android.content.Intent intent3 = new android.content.Intent(activity3, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.connect.DeviceConnectWarmingActivity.class);
                                for (kotlin.Pair pair3 : arrayList3) {
                                    if (pair3 != null) {
                                        java.lang.String str3 = (java.lang.String) pair3.getFirst();
                                        java.lang.Object second3 = pair3.getSecond();
                                        if (second3 instanceof java.lang.Integer) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).intValue()), "putExtra(name, value)");
                                        } else if (second3 instanceof java.lang.Byte) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).byteValue()), "putExtra(name, value)");
                                        } else if (second3 instanceof java.lang.Character) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Character) second3).charValue()), "putExtra(name, value)");
                                        } else if (second3 instanceof java.lang.Short) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).shortValue()), "putExtra(name, value)");
                                        } else if (second3 instanceof java.lang.Boolean) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Boolean) second3).booleanValue()), "putExtra(name, value)");
                                        } else if (second3 instanceof java.lang.Long) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).longValue()), "putExtra(name, value)");
                                        } else if (second3 instanceof java.lang.Float) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).floatValue()), "putExtra(name, value)");
                                        } else if (second3 instanceof java.lang.Double) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).doubleValue()), "putExtra(name, value)");
                                        } else if (second3 instanceof java.lang.String) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (java.lang.String) second3), "putExtra(name, value)");
                                        } else if (second3 instanceof java.lang.CharSequence) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (java.lang.CharSequence) second3), "putExtra(name, value)");
                                        } else if (second3 instanceof android.os.Parcelable) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (android.os.Parcelable) second3), "putExtra(name, value)");
                                        } else if (second3 instanceof java.lang.Object[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (java.io.Serializable) second3), "putExtra(name, value)");
                                        } else if (second3 instanceof java.util.ArrayList) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (java.io.Serializable) second3), "putExtra(name, value)");
                                        } else if (second3 instanceof java.io.Serializable) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (java.io.Serializable) second3), "putExtra(name, value)");
                                        } else if (second3 instanceof boolean[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (boolean[]) second3), "putExtra(name, value)");
                                        } else if (second3 instanceof byte[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (byte[]) second3), "putExtra(name, value)");
                                        } else if (second3 instanceof short[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (short[]) second3), "putExtra(name, value)");
                                        } else if (second3 instanceof char[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (char[]) second3), "putExtra(name, value)");
                                        } else if (second3 instanceof int[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (int[]) second3), "putExtra(name, value)");
                                        } else if (second3 instanceof long[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (long[]) second3), "putExtra(name, value)");
                                        } else if (second3 instanceof float[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (float[]) second3), "putExtra(name, value)");
                                        } else if (second3 instanceof double[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (double[]) second3), "putExtra(name, value)");
                                        } else if (second3 instanceof android.os.Bundle) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (android.os.Bundle) second3), "putExtra(name, value)");
                                        } else if (second3 instanceof android.content.Intent) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (android.os.Parcelable) second3), "putExtra(name, value)");
                                        } else {
                                            kotlin.Unit unit13 = kotlin.Unit.INSTANCE;
                                        }
                                    }
                                }
                                kotlin.Unit unit14 = kotlin.Unit.INSTANCE;
                                kotlin.Unit unit15 = kotlin.Unit.INSTANCE;
                                kotlin.Unit unit16 = kotlin.Unit.INSTANCE;
                                deviceFragment3.startActivity(intent3);
                                kotlin.Unit unit17 = kotlin.Unit.INSTANCE;
                                kotlin.Unit unit18 = kotlin.Unit.INSTANCE;
                                return;
                            }
                            return;
                        }
                        if (!com.qcwireless.qcwatch.base.utils.AndroidVersion.isAndroid12()) {
                            com.qcwireless.qcwatch.ui.device.DeviceFragment.this.showUnbindDialog();
                            return;
                        } else {
                            com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestBluetoothPermission(com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getActivity(), com.qcwireless.qcwatch.ui.device.DeviceFragment.this.new BluetoothPermissionCallback());
                            return;
                        }
                    }
                    if (com.qcwireless.qcwatch.ui.base.util.LocationUtils.isGPSEnable(com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getActivity())) {
                        if (kotlin.text.StringsKt.equals(android.os.Build.BRAND, "oppo", true)) {
                            if (com.qcwireless.qcwatch.base.utils.AndroidVersion.isAndroid12()) {
                                com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment4 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
                                android.content.Context activity4 = deviceFragment4.getActivity();
                                if (activity4 != null) {
                                    java.util.ArrayList<kotlin.Pair> arrayList4 = new java.util.ArrayList();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity4, "it");
                                    android.content.Intent intent4 = new android.content.Intent(activity4, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.class);
                                    for (kotlin.Pair pair4 : arrayList4) {
                                        if (pair4 != null) {
                                            java.lang.String str4 = (java.lang.String) pair4.getFirst();
                                            java.lang.Object second4 = pair4.getSecond();
                                            if (second4 instanceof java.lang.Integer) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, ((java.lang.Number) second4).intValue()), "putExtra(name, value)");
                                            } else if (second4 instanceof java.lang.Byte) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, ((java.lang.Number) second4).byteValue()), "putExtra(name, value)");
                                            } else if (second4 instanceof java.lang.Character) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, ((java.lang.Character) second4).charValue()), "putExtra(name, value)");
                                            } else if (second4 instanceof java.lang.Short) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, ((java.lang.Number) second4).shortValue()), "putExtra(name, value)");
                                            } else if (second4 instanceof java.lang.Boolean) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, ((java.lang.Boolean) second4).booleanValue()), "putExtra(name, value)");
                                            } else if (second4 instanceof java.lang.Long) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, ((java.lang.Number) second4).longValue()), "putExtra(name, value)");
                                            } else if (second4 instanceof java.lang.Float) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, ((java.lang.Number) second4).floatValue()), "putExtra(name, value)");
                                            } else if (second4 instanceof java.lang.Double) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, ((java.lang.Number) second4).doubleValue()), "putExtra(name, value)");
                                            } else if (second4 instanceof java.lang.String) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, (java.lang.String) second4), "putExtra(name, value)");
                                            } else if (second4 instanceof java.lang.CharSequence) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, (java.lang.CharSequence) second4), "putExtra(name, value)");
                                            } else if (second4 instanceof android.os.Parcelable) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, (android.os.Parcelable) second4), "putExtra(name, value)");
                                            } else if (second4 instanceof java.lang.Object[]) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, (java.io.Serializable) second4), "putExtra(name, value)");
                                            } else if (second4 instanceof java.util.ArrayList) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, (java.io.Serializable) second4), "putExtra(name, value)");
                                            } else if (second4 instanceof java.io.Serializable) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, (java.io.Serializable) second4), "putExtra(name, value)");
                                            } else if (second4 instanceof boolean[]) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, (boolean[]) second4), "putExtra(name, value)");
                                            } else if (second4 instanceof byte[]) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, (byte[]) second4), "putExtra(name, value)");
                                            } else if (second4 instanceof short[]) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, (short[]) second4), "putExtra(name, value)");
                                            } else if (second4 instanceof char[]) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, (char[]) second4), "putExtra(name, value)");
                                            } else if (second4 instanceof int[]) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, (int[]) second4), "putExtra(name, value)");
                                            } else if (second4 instanceof long[]) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, (long[]) second4), "putExtra(name, value)");
                                            } else if (second4 instanceof float[]) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, (float[]) second4), "putExtra(name, value)");
                                            } else if (second4 instanceof double[]) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, (double[]) second4), "putExtra(name, value)");
                                            } else if (second4 instanceof android.os.Bundle) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, (android.os.Bundle) second4), "putExtra(name, value)");
                                            } else if (second4 instanceof android.content.Intent) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4.putExtra(str4, (android.os.Parcelable) second4), "putExtra(name, value)");
                                            } else {
                                                kotlin.Unit unit19 = kotlin.Unit.INSTANCE;
                                            }
                                        }
                                    }
                                    kotlin.Unit unit20 = kotlin.Unit.INSTANCE;
                                    kotlin.Unit unit21 = kotlin.Unit.INSTANCE;
                                    kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                                    deviceFragment4.startActivity(intent4);
                                    kotlin.Unit unit23 = kotlin.Unit.INSTANCE;
                                    kotlin.Unit unit24 = kotlin.Unit.INSTANCE;
                                    return;
                                }
                                return;
                            }
                            com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestLocationPermission(com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getActivity(), com.qcwireless.qcwatch.ui.device.DeviceFragment.this.new LocationPermissionCallback());
                            return;
                        }
                        com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestLocationPermission(com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getActivity(), com.qcwireless.qcwatch.ui.device.DeviceFragment.this.new LocationPermissionCallback());
                        return;
                    }
                    java.lang.String string4 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_291);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_291)");
                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string4, 0, 1, null);
                    com.qcwireless.qcwatch.ui.device.DeviceFragment.this.startActivity(new android.content.Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                }
                if (com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().getSync()) {
                    java.lang.String string5 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_236);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.qc_text_236)");
                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string5, 0, 1, null);
                    return;
                }
                if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                    com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding18 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.binding;
                    if (fragmentDeviceBinding18 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentDeviceBinding12 = fragmentDeviceBinding18;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding12.disconnectView);
                    try {
                        if (com.qcwireless.qc_utils.bluetooth.BluetoothUtils.isEnabledBluetooth(com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getActivity())) {
                            return;
                        }
                        android.content.Intent intent5 = new android.content.Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
                        if (androidx.core.app.ActivityCompat.checkSelfPermission(com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getActivity(), com.hjq.permissions.Permission.BLUETOOTH_CONNECT) != 0) {
                            return;
                        }
                        com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getActivity().startActivityForResult(intent5, 300);
                        return;
                    } catch (java.lang.Exception unused) {
                        return;
                    }
                }
                java.lang.String string6 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.qc_text_75)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string6, 0, 1, null);
            }
        });
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding11 = this.binding;
        if (fragmentDeviceBinding11 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentDeviceBinding = fragmentDeviceBinding11;
        }
        fragmentDeviceBinding.qcSettingCall.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$$ExternalSyntheticLambda11
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.m630loadDataOnce$lambda6$lambda4(com.qcwireless.qcwatch.ui.device.DeviceFragment.this, fragmentDeviceBinding, compoundButton, z);
            }
        });
        fragmentDeviceBinding.qcSettingMessage.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$5$2
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                boolean isNotificationListenerEnabled;
                isNotificationListenerEnabled = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.isNotificationListenerEnabled();
                if (!isNotificationListenerEnabled) {
                    com.qcwireless.qcwatch.ui.device.DeviceFragment.this.showNotificationDialog();
                    return;
                }
                com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
                android.content.Context activity = deviceFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.class);
                    for (kotlin.Pair pair : arrayList) {
                        if (pair != null) {
                            java.lang.String str = (java.lang.String) pair.getFirst();
                            java.lang.Object second = pair.getSecond();
                            if (second instanceof java.lang.Integer) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Byte) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Character) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Short) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Boolean) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Long) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Float) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Double) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.String) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.CharSequence) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Parcelable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.util.ArrayList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.io.Serializable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof boolean[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                            } else if (second instanceof byte[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                            } else if (second instanceof short[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                            } else if (second instanceof char[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                            } else if (second instanceof int[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                            } else if (second instanceof long[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                            } else if (second instanceof float[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                            } else if (second instanceof double[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Bundle) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                            } else if (second instanceof android.content.Intent) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    deviceFragment.startActivity(intent);
                }
            }
        });
        fragmentDeviceBinding.qcSettingAiPush.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$5$3
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
                android.content.Context activity = deviceFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.class);
                    for (kotlin.Pair pair : arrayList) {
                        if (pair != null) {
                            java.lang.String str = (java.lang.String) pair.getFirst();
                            java.lang.Object second = pair.getSecond();
                            if (second instanceof java.lang.Integer) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Byte) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Character) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Short) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Boolean) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Long) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Float) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Double) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.String) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.CharSequence) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Parcelable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.util.ArrayList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.io.Serializable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof boolean[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                            } else if (second instanceof byte[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                            } else if (second instanceof short[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                            } else if (second instanceof char[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                            } else if (second instanceof int[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                            } else if (second instanceof long[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                            } else if (second instanceof float[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                            } else if (second instanceof double[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Bundle) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                            } else if (second instanceof android.content.Intent) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    deviceFragment.startActivity(intent);
                }
            }
        });
        fragmentDeviceBinding.qcSettingDisturb.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$5$4
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
                android.content.Context activity = deviceFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.disturb.DisturbActivity.class);
                    for (kotlin.Pair pair : arrayList) {
                        if (pair != null) {
                            java.lang.String str = (java.lang.String) pair.getFirst();
                            java.lang.Object second = pair.getSecond();
                            if (second instanceof java.lang.Integer) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Byte) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Character) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Short) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Boolean) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Long) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Float) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Double) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.String) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.CharSequence) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Parcelable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.util.ArrayList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.io.Serializable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof boolean[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                            } else if (second instanceof byte[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                            } else if (second instanceof short[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                            } else if (second instanceof char[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                            } else if (second instanceof int[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                            } else if (second instanceof long[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                            } else if (second instanceof float[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                            } else if (second instanceof double[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Bundle) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                            } else if (second instanceof android.content.Intent) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    deviceFragment.startActivity(intent);
                }
            }
        });
        fragmentDeviceBinding.qcSettingContact.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$5$5
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("type", 1);
                com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
                android.content.Context activity = deviceFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.contact.ContactActivity.class);
                    intent.setFlags(1);
                    intent.putExtras(bundle);
                    for (kotlin.Pair pair : arrayList) {
                        if (pair != null) {
                            java.lang.String str = (java.lang.String) pair.getFirst();
                            java.lang.Object second = pair.getSecond();
                            if (second instanceof java.lang.Integer) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Byte) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Character) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Short) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Boolean) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Long) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Float) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Double) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.String) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.CharSequence) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Parcelable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.util.ArrayList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.io.Serializable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof boolean[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                            } else if (second instanceof byte[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                            } else if (second instanceof short[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                            } else if (second instanceof char[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                            } else if (second instanceof int[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                            } else if (second instanceof long[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                            } else if (second instanceof float[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                            } else if (second instanceof double[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Bundle) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                            } else if (second instanceof android.content.Intent) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    deviceFragment.startActivity(intent);
                }
            }
        });
        fragmentDeviceBinding.qcSettingAlbum.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$5$6
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
                android.content.Context activity = deviceFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.album.AlbumActivity.class);
                    for (kotlin.Pair pair : arrayList) {
                        if (pair != null) {
                            java.lang.String str = (java.lang.String) pair.getFirst();
                            java.lang.Object second = pair.getSecond();
                            if (second instanceof java.lang.Integer) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Byte) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Character) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Short) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Boolean) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Long) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Float) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Double) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.String) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.CharSequence) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Parcelable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.util.ArrayList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.io.Serializable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof boolean[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                            } else if (second instanceof byte[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                            } else if (second instanceof short[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                            } else if (second instanceof char[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                            } else if (second instanceof int[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                            } else if (second instanceof long[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                            } else if (second instanceof float[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                            } else if (second instanceof double[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Bundle) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                            } else if (second instanceof android.content.Intent) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    deviceFragment.startActivity(intent);
                }
            }
        });
        fragmentDeviceBinding.qcSettingMusic.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$5$7
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getJieLiMusic()) {
                    com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
                    android.content.Context activity = deviceFragment.getActivity();
                    if (activity != null) {
                        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.music.JieLiMusicManagerActivity.class);
                        for (kotlin.Pair pair : arrayList) {
                            if (pair != null) {
                                java.lang.String str = (java.lang.String) pair.getFirst();
                                java.lang.Object second = pair.getSecond();
                                if (second instanceof java.lang.Integer) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                                } else if (second instanceof java.lang.Byte) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                                } else if (second instanceof java.lang.Character) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                                } else if (second instanceof java.lang.Short) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                                } else if (second instanceof java.lang.Boolean) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                                } else if (second instanceof java.lang.Long) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                                } else if (second instanceof java.lang.Float) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                                } else if (second instanceof java.lang.Double) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                                } else if (second instanceof java.lang.String) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                                } else if (second instanceof java.lang.CharSequence) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                                } else if (second instanceof android.os.Parcelable) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                                } else if (second instanceof java.lang.Object[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                                } else if (second instanceof java.util.ArrayList) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                                } else if (second instanceof java.io.Serializable) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                                } else if (second instanceof boolean[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                                } else if (second instanceof byte[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                                } else if (second instanceof short[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                                } else if (second instanceof char[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                                } else if (second instanceof int[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                                } else if (second instanceof long[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                                } else if (second instanceof float[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                                } else if (second instanceof double[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                                } else if (second instanceof android.os.Bundle) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                                } else if (second instanceof android.content.Intent) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                                } else {
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                }
                            }
                        }
                        deviceFragment.startActivity(intent);
                        return;
                    }
                    return;
                }
                com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment2 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
                android.content.Context activity2 = deviceFragment2.getActivity();
                if (activity2 != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity2, "it");
                    android.content.Intent intent2 = new android.content.Intent(activity2, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.music.MusicManagerActivity.class);
                    for (kotlin.Pair pair2 : arrayList2) {
                        if (pair2 != null) {
                            java.lang.String str2 = (java.lang.String) pair2.getFirst();
                            java.lang.Object second2 = pair2.getSecond();
                            if (second2 instanceof java.lang.Integer) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).intValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Byte) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).byteValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Character) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Character) second2).charValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Short) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).shortValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Boolean) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Boolean) second2).booleanValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Long) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).longValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Float) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).floatValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Double) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).doubleValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.String) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.lang.String) second2), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.CharSequence) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.lang.CharSequence) second2), "putExtra(name, value)");
                            } else if (second2 instanceof android.os.Parcelable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Parcelable) second2), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                            } else if (second2 instanceof java.util.ArrayList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                            } else if (second2 instanceof java.io.Serializable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                            } else if (second2 instanceof boolean[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (boolean[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof byte[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (byte[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof short[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (short[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof char[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (char[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof int[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (int[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof long[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (long[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof float[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (float[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof double[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (double[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof android.os.Bundle) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Bundle) second2), "putExtra(name, value)");
                            } else if (second2 instanceof android.content.Intent) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Parcelable) second2), "putExtra(name, value)");
                            } else {
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    deviceFragment2.startActivity(intent2);
                }
            }
        });
        fragmentDeviceBinding.qcSettingEbook.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$5$8
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
                android.content.Context activity = deviceFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.class);
                    for (kotlin.Pair pair : arrayList) {
                        if (pair != null) {
                            java.lang.String str = (java.lang.String) pair.getFirst();
                            java.lang.Object second = pair.getSecond();
                            if (second instanceof java.lang.Integer) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Byte) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Character) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Short) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Boolean) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Long) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Float) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Double) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.String) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.CharSequence) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Parcelable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.util.ArrayList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.io.Serializable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof boolean[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                            } else if (second instanceof byte[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                            } else if (second instanceof short[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                            } else if (second instanceof char[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                            } else if (second instanceof int[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                            } else if (second instanceof long[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                            } else if (second instanceof float[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                            } else if (second instanceof double[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Bundle) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                            } else if (second instanceof android.content.Intent) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    deviceFragment.startActivity(intent);
                }
            }
        });
        fragmentDeviceBinding.qcSettingRecord.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$5$9
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
                android.content.Context activity = deviceFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.record.RecordListActivity.class);
                    for (kotlin.Pair pair : arrayList) {
                        if (pair != null) {
                            java.lang.String str = (java.lang.String) pair.getFirst();
                            java.lang.Object second = pair.getSecond();
                            if (second instanceof java.lang.Integer) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Byte) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Character) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Short) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Boolean) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Long) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Float) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Double) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.String) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.CharSequence) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Parcelable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.util.ArrayList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.io.Serializable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof boolean[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                            } else if (second instanceof byte[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                            } else if (second instanceof short[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                            } else if (second instanceof char[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                            } else if (second instanceof int[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                            } else if (second instanceof long[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                            } else if (second instanceof float[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                            } else if (second instanceof double[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Bundle) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                            } else if (second instanceof android.content.Intent) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    deviceFragment.startActivity(intent);
                }
            }
        });
        fragmentDeviceBinding.qcSettingGesture.setQSettingItemCheckListener(new com.qcwireless.qcwatch.ui.base.view.QSwitchView.OnSwitchStateChangeListener() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$$ExternalSyntheticLambda5
            @Override // com.qcwireless.qcwatch.ui.base.view.QSwitchView.OnSwitchStateChangeListener
            public final void onSwitchStateChange(boolean z) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.m631loadDataOnce$lambda6$lambda5(com.qcwireless.qcwatch.ui.device.DeviceFragment.this, z);
            }
        });
        fragmentDeviceBinding.qcSettingFindWatch.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$5$11
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getDeviceSettingVm().findWatch();
                java.lang.String string = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_270);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_270)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            }
        });
        fragmentDeviceBinding.qcSettingCamera.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$5$12
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestCameraPermission(com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getActivity(), com.qcwireless.qcwatch.ui.device.DeviceFragment.this.new CameraPermissionCallback());
            }
        });
        fragmentDeviceBinding.qcSettingWeather.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$5$13
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.this.showWeatherDialog();
            }
        });
        fragmentDeviceBinding.qcSettingUnit.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$5$14
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.this.showUnitDialog();
            }
        });
        fragmentDeviceBinding.qcSettingTime.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$5$15
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.this.showTimeFormatDialog();
            }
        });
        fragmentDeviceBinding.qcSettingMore.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$5$16
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
                android.content.Context activity = deviceFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity.class);
                    for (kotlin.Pair pair : arrayList) {
                        if (pair != null) {
                            java.lang.String str = (java.lang.String) pair.getFirst();
                            java.lang.Object second = pair.getSecond();
                            if (second instanceof java.lang.Integer) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Byte) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Character) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Short) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Boolean) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Long) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Float) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Double) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.String) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.CharSequence) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Parcelable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.util.ArrayList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.io.Serializable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof boolean[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                            } else if (second instanceof byte[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                            } else if (second instanceof short[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                            } else if (second instanceof char[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                            } else if (second instanceof int[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                            } else if (second instanceof long[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                            } else if (second instanceof float[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                            } else if (second instanceof double[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Bundle) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                            } else if (second instanceof android.content.Intent) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    deviceFragment.startActivity(intent);
                }
            }
        });
        getDeviceSettingVm().initData(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        getDeviceViewModel().getPicUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$$ExternalSyntheticLambda14
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.m632loadDataOnce$lambda7(com.qcwireless.qcwatch.ui.device.DeviceFragment.this, (com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DevicePictureUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-0, reason: not valid java name */
    public static final void m627loadDataOnce$lambda0(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment, com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshLayout, "it");
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            deviceFragment.getDeviceSettingVm().syncDeviceSettings();
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion().length() > 0) {
                deviceFragment.getDeviceViewModel().checkOta();
            }
            deviceFragment.checkAppError();
            deviceFragment.handler.removeCallbacks(deviceFragment.myRunnable);
            deviceFragment.handler.postDelayed(deviceFragment.myRunnable, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.LOCATION_UPDATE_INTERVAL);
            return;
        }
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = deviceFragment.binding;
        if (fragmentDeviceBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDeviceBinding = null;
        }
        fragmentDeviceBinding.syncDeviceRefresh.finishRefresh();
        java.lang.String string = deviceFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-2$lambda-1, reason: not valid java name */
    public static final void m628loadDataOnce$lambda2$lambda1(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment, com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DeviceFragmentUI deviceFragmentUI) {
        com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment2;
        android.content.Context activity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment, "this$0");
        int refreshType = deviceFragmentUI.getRefreshType();
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = null;
        if (refreshType == 1) {
            if (deviceFragmentUI.getConnect()) {
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding2 = deviceFragment.binding;
                if (fragmentDeviceBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentDeviceBinding = fragmentDeviceBinding2;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding.disconnectView);
                return;
            }
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding3 = deviceFragment.binding;
            if (fragmentDeviceBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding3 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDeviceBinding3.disconnectView);
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding4 = deviceFragment.binding;
            if (fragmentDeviceBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentDeviceBinding = fragmentDeviceBinding4;
            }
            fragmentDeviceBinding.tvDeviceBattery.setText("--");
            return;
        }
        if (refreshType != 2) {
            return;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, deviceFragmentUI);
        if (deviceFragmentUI.getShowDfuButton()) {
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding5 = deviceFragment.binding;
            if (fragmentDeviceBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding5 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDeviceBinding5.appStatus4);
        } else {
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding6 = deviceFragment.binding;
            if (fragmentDeviceBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding6 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding6.appStatus4);
        }
        if (deviceFragmentUI.getRetCode() == 60001) {
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding7 = deviceFragment.binding;
            if (fragmentDeviceBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding7 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDeviceBinding7.appStatus5);
        } else {
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding8 = deviceFragment.binding;
            if (fragmentDeviceBinding8 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding8 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding8.appStatus5);
        }
        if (deviceFragmentUI.getShowDfuButton() && com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding9 = deviceFragment.binding;
            if (fragmentDeviceBinding9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding9 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDeviceBinding9.btnFirmwareUpdate);
        } else {
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding10 = deviceFragment.binding;
            if (fragmentDeviceBinding10 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding10 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding10.btnFirmwareUpdate);
        }
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDevelopment()) {
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding11 = deviceFragment.binding;
            if (fragmentDeviceBinding11 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentDeviceBinding = fragmentDeviceBinding11;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDeviceBinding.imageDebugBg);
        } else {
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding12 = deviceFragment.binding;
            if (fragmentDeviceBinding12 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentDeviceBinding = fragmentDeviceBinding12;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding.imageDebugBg);
        }
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected() && deviceFragmentUI.getDfuType() == 2 && (activity = (deviceFragment2 = deviceFragment).getActivity()) != null) {
            java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity.class);
            for (kotlin.Pair pair : arrayList) {
                if (pair != null) {
                    java.lang.String str = (java.lang.String) pair.getFirst();
                    java.lang.Object second = pair.getSecond();
                    if (second instanceof java.lang.Integer) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Byte) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Character) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Short) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Boolean) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Long) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Float) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Double) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.String) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                    } else if (second instanceof java.lang.CharSequence) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                    } else if (second instanceof android.os.Parcelable) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Object[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                    } else if (second instanceof java.util.ArrayList) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                    } else if (second instanceof java.io.Serializable) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                    } else if (second instanceof boolean[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                    } else if (second instanceof byte[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                    } else if (second instanceof short[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                    } else if (second instanceof char[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                    } else if (second instanceof int[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                    } else if (second instanceof long[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                    } else if (second instanceof float[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                    } else if (second instanceof double[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                    } else if (second instanceof android.os.Bundle) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                    } else if (second instanceof android.content.Intent) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                    } else {
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                }
            }
            deviceFragment2.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-3, reason: not valid java name */
    public static final void m629loadDataOnce$lambda3(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceSetting, "it");
        deviceFragment.deviceSetting = deviceSetting;
        deviceFragment.initSupportFunction();
        deviceFragment.initDeviceSetting(deviceSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-6$lambda-4, reason: not valid java name */
    public static final void m630loadDataOnce$lambda6$lambda4(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment, com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentDeviceBinding, "$this_run");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (z) {
            com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestCallPhonePermission(deviceFragment.getActivity(), deviceFragment.new CallPermissionCallback());
        } else {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = deviceFragment.deviceSetting;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting2 = null;
            }
            deviceSetting2.setCallSwitch(false);
            fragmentDeviceBinding.qcSettingCall.setChecked(false);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setCallPushEnable(false);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        }
        com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingVm = deviceFragment.getDeviceSettingVm();
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = deviceFragment.deviceSetting;
        if (deviceSetting3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
        } else {
            deviceSetting = deviceSetting3;
        }
        deviceSettingVm.saveDeviceSetting(deviceAddressNoClear, deviceSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-6$lambda-5, reason: not valid java name */
    public static final void m631loadDataOnce$lambda6$lambda5(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = deviceFragment.deviceSetting;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = null;
        if (deviceSetting == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting = null;
        }
        deviceSetting.setWristSense(z);
        com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingVm = deviceFragment.getDeviceSettingVm();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = deviceFragment.deviceSetting;
        if (deviceSetting3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
        } else {
            deviceSetting2 = deviceSetting3;
        }
        deviceSettingVm.execGesture(deviceSetting2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-7, reason: not valid java name */
    public static final void m632loadDataOnce$lambda7(final com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment, final com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DevicePictureUI devicePictureUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment, "this$0");
        if (devicePictureUI.getLocalUrl().length() > 0) {
            com.qcwireless.qcwatch.base.glide.GlideApp.with(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).asBitmap().m164load("file://" + devicePictureUI.getLocalUrl()).into(new com.bumptech.glide.request.target.CustomTarget<android.graphics.Bitmap>() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$6$1
                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(android.graphics.drawable.Drawable placeholder) {
                }

                @Override // com.bumptech.glide.request.target.Target
                public /* bridge */ /* synthetic */ void onResourceReady(java.lang.Object obj, com.bumptech.glide.request.transition.Transition transition) {
                    onResourceReady((android.graphics.Bitmap) obj, (com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap>) transition);
                }

                public void onResourceReady(android.graphics.Bitmap resource, com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap> transition) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "resource");
                    com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.binding;
                    if (fragmentDeviceBinding == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentDeviceBinding = null;
                    }
                    fragmentDeviceBinding.imageWatch.setImageBitmap(resource);
                }

                @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                public void onLoadFailed(android.graphics.drawable.Drawable errorDrawable) {
                    super.onLoadFailed(errorDrawable);
                    final com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DevicePictureUI devicePictureUI2 = devicePictureUI;
                    final com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment2 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$6$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$6$1$onLoadFailed$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$6$1) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.DeviceFragment$loadDataOnce$6$1 deviceFragment$loadDataOnce$6$1) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment$loadDataOnce$6$1, "$this$ktxRunOnUi");
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DevicePictureUI.this.getUrl());
                            com.bumptech.glide.RequestBuilder load = com.bumptech.glide.Glide.with(deviceFragment2.getActivity()).load(com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DevicePictureUI.this.getUrl());
                            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = deviceFragment2.binding;
                            if (fragmentDeviceBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentDeviceBinding = null;
                            }
                            load.into(fragmentDeviceBinding.imageWatch);
                        }
                    });
                }
            });
            return;
        }
        com.bumptech.glide.RequestBuilder load = com.bumptech.glide.Glide.with(deviceFragment).load(devicePictureUI.getUrl());
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = deviceFragment.binding;
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding2 = null;
        if (fragmentDeviceBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDeviceBinding = null;
        }
        com.bumptech.glide.RequestBuilder error = load.placeholder(fragmentDeviceBinding.imageWatch.getDrawable()).dontAnimate().error(com.qcwireless.qcwatch.R.mipmap.device_icon_1);
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding3 = deviceFragment.binding;
        if (fragmentDeviceBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentDeviceBinding2 = fragmentDeviceBinding3;
        }
        error.into(fragmentDeviceBinding2.imageWatch);
    }

    /* compiled from: DeviceFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/DeviceFragment$BluetoothPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/device/DeviceFragment;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class BluetoothPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public BluetoothPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            if (all) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.this.showUnbindDialog();
                return;
            }
            java.lang.String string = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            if (never) {
                com.hjq.permissions.XXPermissions.startPermissionActivity(com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getActivity(), permissions);
                java.lang.String string = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_458);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_458)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            }
        }
    }

    private final void checkAppError() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.DeviceFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$checkAppError$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.DeviceFragment) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment, "$this$ktxRunOnBgSingle");
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(deviceFragment, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.DeviceFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$checkAppError$1.1
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.DeviceFragment) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment2, "$this$ktxRunOnUi");
                        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = null;
                        if (com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getPingHwServer()) {
                            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding2 = deviceFragment2.binding;
                            if (fragmentDeviceBinding2 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                fragmentDeviceBinding = fragmentDeviceBinding2;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding.appStatus1);
                            return;
                        }
                        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding3 = deviceFragment2.binding;
                        if (fragmentDeviceBinding3 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            fragmentDeviceBinding = fragmentDeviceBinding3;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDeviceBinding.appStatus1);
                    }
                });
                if (!com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isOnline()) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(deviceFragment, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.DeviceFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$checkAppError$1.2
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.DeviceFragment) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment2, "$this$ktxRunOnUi");
                            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = deviceFragment2.binding;
                            if (fragmentDeviceBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentDeviceBinding = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDeviceBinding.appStatus3);
                        }
                    });
                } else {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(deviceFragment, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.DeviceFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$checkAppError$1.3
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.DeviceFragment) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment2, "$this$ktxRunOnUi");
                            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = deviceFragment2.binding;
                            if (fragmentDeviceBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentDeviceBinding = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding.appStatus3);
                        }
                    });
                }
                if (com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getPingHwServer()) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(deviceFragment, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.DeviceFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$checkAppError$1.4
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.DeviceFragment) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment2, "$this$ktxRunOnUi");
                            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = deviceFragment2.binding;
                            if (fragmentDeviceBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentDeviceBinding = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding.appStatus6);
                        }
                    });
                } else {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(deviceFragment, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.DeviceFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$checkAppError$1.5
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.DeviceFragment) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment2, "$this$ktxRunOnUi");
                            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = deviceFragment2.binding;
                            if (fragmentDeviceBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentDeviceBinding = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDeviceBinding.appStatus6);
                        }
                    });
                }
                if (!com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isNetworkAvailable(deviceFragment.getActivity())) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(deviceFragment, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.DeviceFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$checkAppError$1.6
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.DeviceFragment) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment2, "$this$ktxRunOnUi");
                            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = deviceFragment2.binding;
                            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding2 = null;
                            if (fragmentDeviceBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentDeviceBinding = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDeviceBinding.appStatus2);
                            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding3 = deviceFragment2.binding;
                            if (fragmentDeviceBinding3 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentDeviceBinding3 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding3.appStatus6);
                            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding4 = deviceFragment2.binding;
                            if (fragmentDeviceBinding4 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                fragmentDeviceBinding2 = fragmentDeviceBinding4;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding2.appStatus5);
                        }
                    });
                } else {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(deviceFragment, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.DeviceFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$checkAppError$1.7
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.DeviceFragment) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment2, "$this$ktxRunOnUi");
                            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = deviceFragment2.binding;
                            if (fragmentDeviceBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentDeviceBinding = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding.appStatus2);
                        }
                    });
                }
            }
        });
    }

    private final void initDeviceSetting(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting it) {
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding2 = null;
        if (fragmentDeviceBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDeviceBinding = null;
        }
        if (it.getMetricUnit() == 0) {
            fragmentDeviceBinding.qcSettingUnit.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_23));
        } else {
            fragmentDeviceBinding.qcSettingUnit.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_24));
        }
        if (it.getTimeFormat() == 0) {
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding3 = this.binding;
            if (fragmentDeviceBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding3 = null;
            }
            fragmentDeviceBinding3.qcSettingTime.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_26));
        } else {
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding4 = this.binding;
            if (fragmentDeviceBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding4 = null;
            }
            fragmentDeviceBinding4.qcSettingTime.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_25));
        }
        if (it.getWeatherFormat() == 0) {
            fragmentDeviceBinding.qcSettingWeather.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_27));
        } else {
            fragmentDeviceBinding.qcSettingWeather.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_28));
        }
        if (it.getDisturbSwitch()) {
            if (it.getDisturbManualSwitch()) {
                fragmentDeviceBinding.qcSettingDisturb.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_567));
            } else {
                fragmentDeviceBinding.qcSettingDisturb.setRightText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(it.getDisturbStart()) + '~' + com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(it.getDisturbEnd()));
            }
        } else if (it.getDisturbManualSwitch()) {
            fragmentDeviceBinding.qcSettingDisturb.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_567));
        } else {
            fragmentDeviceBinding.qcSettingDisturb.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_21));
        }
        try {
            boolean isNotificationListenerEnabled = isNotificationListenerEnabled();
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMessagePushEnable() && isNotificationListenerEnabled) {
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding5 = this.binding;
                if (fragmentDeviceBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDeviceBinding5 = null;
                }
                fragmentDeviceBinding5.qcSettingMessage.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_22));
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding6 = this.binding;
                if (fragmentDeviceBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentDeviceBinding2 = fragmentDeviceBinding6;
                }
                fragmentDeviceBinding2.qcSettingMessage.setErrorIcon(false);
            } else {
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding7 = this.binding;
                if (fragmentDeviceBinding7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDeviceBinding7 = null;
                }
                fragmentDeviceBinding7.qcSettingMessage.setErrorIcon(true);
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding8 = this.binding;
                if (fragmentDeviceBinding8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentDeviceBinding2 = fragmentDeviceBinding8;
                }
                fragmentDeviceBinding2.qcSettingMessage.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_21));
            }
        } catch (java.lang.Exception unused) {
        }
        fragmentDeviceBinding.qcSettingGesture.setChecked(it.getWristSense());
        if (!com.qcwireless.qcwatch.base.permission.PermissionUtilKt.hasCallPhonePermission(getActivity())) {
            fragmentDeviceBinding.qcSettingCall.setChecked(false);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setCallPushEnable(false);
        } else {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setCallPushEnable(it.getCallSwitch());
            fragmentDeviceBinding.qcSettingCall.setChecked(it.getCallSwitch());
        }
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            fragmentDeviceBinding.tvDeviceBattery.setText(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getString(com.qcwireless.qcwatch.R.string.qc_text_33, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getBattery()) + '%');
            return;
        }
        fragmentDeviceBinding.tvDeviceBattery.setText("--");
    }

    private final void initSupportFunction() {
        java.lang.String deviceAddress = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = null;
        if (deviceAddress == null || deviceAddress.length() == 0) {
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding2 = this.binding;
            if (fragmentDeviceBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentDeviceBinding = fragmentDeviceBinding2;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) fragmentDeviceBinding.qcSettingContact);
            return;
        }
        try {
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getSupportContact()) {
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding3 = this.binding;
                if (fragmentDeviceBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDeviceBinding3 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible((android.view.View) fragmentDeviceBinding3.qcSettingContact);
                return;
            }
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding4 = this.binding;
            if (fragmentDeviceBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding4 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) fragmentDeviceBinding4.qcSettingContact);
        } catch (java.lang.Exception unused) {
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding5 = this.binding;
            if (fragmentDeviceBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentDeviceBinding = fragmentDeviceBinding5;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) fragmentDeviceBinding.qcSettingContact);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotificationDialog() {
        com.qcwireless.qcwatch.base.dialog.CenterDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.CenterDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_notification);
        final com.qcwireless.qcwatch.base.dialog.CenterDialog create = builder.create();
        create.show();
        android.view.View contentView = create.getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        ((android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_confirm)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.m635showNotificationDialog$lambda9(com.qcwireless.qcwatch.base.dialog.CenterDialog.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showNotificationDialog$lambda-9, reason: not valid java name */
    public static final void m635showNotificationDialog$lambda9(com.qcwireless.qcwatch.base.dialog.CenterDialog centerDialog, com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment, "this$0");
        centerDialog.dismiss();
        try {
            deviceFragment.startActivityForResult(new android.content.Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"), 100);
        } catch (android.content.ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void refreshUI() {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.DeviceFragment.refreshUI():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: refreshUI$lambda-11$lambda-10, reason: not valid java name */
    public static final void m634refreshUI$lambda11$lambda10(com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding, com.oudmon.ble.base.communication.rsp.BatteryRsp batteryRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentDeviceBinding, "$this_run");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setBattery(java.lang.String.valueOf(batteryRsp.getBatteryValue()));
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        fragmentDeviceBinding.tvDeviceBattery.setText(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getString(com.qcwireless.qcwatch.R.string.qc_text_33, java.lang.String.valueOf(batteryRsp.getBatteryValue())) + '%');
    }

    /* compiled from: DeviceFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/DeviceFragment$MyFwRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/device/DeviceFragment;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyFwRunnable implements java.lang.Runnable {
        public MyFwRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.ui.device.DeviceFragment.this.fwVersionCount++;
            if (com.qcwireless.qcwatch.ui.device.DeviceFragment.this.fwVersionCount < 5) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "获取固件件版本号");
                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion().length() == 0) {
                    com.oudmon.ble.base.communication.CommandHandle.getInstance().execReadCmd(com.oudmon.ble.base.communication.CommandHandle.getInstance().getReadFmRequest());
                }
            }
        }
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if ((messageEvent instanceof com.qcwireless.qcwatch.base.event.RefreshEvent) && kotlin.jvm.internal.Intrinsics.areEqual(getClass(), ((com.qcwireless.qcwatch.base.event.RefreshEvent) messageEvent).getActivityClass())) {
            readBattery();
            getDeviceSettingVm().initData(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "2");
            refreshUI();
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion().length() > 0) {
                getDeviceViewModel().checkOta();
            }
            checkAppError();
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, messageEvent.getClass().getName());
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.WatchFaceDownloadEvent ? true : messageEvent instanceof com.qcwireless.qcwatch.base.event.FirmUpdateEvent ? true : messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) {
            refreshUI();
            return;
        }
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = null;
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.MessagePermissionEvent) {
            try {
                boolean isNotificationListenerEnabled = isNotificationListenerEnabled();
                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMessagePushEnable() && isNotificationListenerEnabled) {
                    com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding2 = this.binding;
                    if (fragmentDeviceBinding2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentDeviceBinding2 = null;
                    }
                    fragmentDeviceBinding2.qcSettingMessage.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_22));
                    com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding3 = this.binding;
                    if (fragmentDeviceBinding3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentDeviceBinding = fragmentDeviceBinding3;
                    }
                    fragmentDeviceBinding.qcSettingMessage.setErrorIcon(false);
                    return;
                }
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding4 = this.binding;
                if (fragmentDeviceBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDeviceBinding4 = null;
                }
                fragmentDeviceBinding4.qcSettingMessage.setErrorIcon(true);
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding5 = this.binding;
                if (fragmentDeviceBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentDeviceBinding = fragmentDeviceBinding5;
                }
                fragmentDeviceBinding.qcSettingMessage.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_21));
                return;
            } catch (java.lang.Exception unused) {
                return;
            }
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.FirmCheckEvent ? true : messageEvent instanceof com.qcwireless.qcwatch.base.event.DevTestEvent) {
            if (com.oudmon.ble.base.util.AppUtil.isBackground(getContext()) && com.oudmon.ble.base.util.AppUtil.isApplicationBroughtToBackground(getContext())) {
                return;
            }
            java.lang.String fmVersion = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion();
            if (fmVersion.length() > 0) {
                getDeviceViewModel().checkOta();
                java.util.List split$default = kotlin.text.StringsKt.split$default(fmVersion, new java.lang.String[]{"_"}, false, 0, 6, (java.lang.Object) null);
                java.lang.String str = split$default.size() >= 2 ? (java.lang.String) split$default.get(1) : "";
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding6 = this.binding;
                if (fragmentDeviceBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentDeviceBinding = fragmentDeviceBinding6;
                }
                fragmentDeviceBinding.tvFirmwareVersion.setText(str);
                return;
            }
            return;
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.DataSyncEvent) {
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                if (((com.qcwireless.qcwatch.base.event.DataSyncEvent) messageEvent).getStatus()) {
                    com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding7 = this.binding;
                    if (fragmentDeviceBinding7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentDeviceBinding = fragmentDeviceBinding7;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDeviceBinding.disconnectView);
                    return;
                }
                getDeviceSettingVm().initData(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding8 = this.binding;
                if (fragmentDeviceBinding8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentDeviceBinding = fragmentDeviceBinding8;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding.disconnectView);
                return;
            }
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding9 = this.binding;
            if (fragmentDeviceBinding9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentDeviceBinding = fragmentDeviceBinding9;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDeviceBinding.disconnectView);
            return;
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.DeviceToAppSyncEvent) {
            getDeviceSettingVm().syncDeviceSettingsFromDevice(((com.qcwireless.qcwatch.base.event.DeviceToAppSyncEvent) messageEvent).getType());
        }
    }

    private final void readBattery() {
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.SimpleKeyReq((byte) 3), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$$ExternalSyntheticLambda1
                @Override // com.oudmon.ble.base.communication.ICommandResponse
                public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                    com.qcwireless.qcwatch.ui.device.DeviceFragment.m633readBattery$lambda12(com.qcwireless.qcwatch.ui.device.DeviceFragment.this, (com.oudmon.ble.base.communication.rsp.BatteryRsp) baseRspCmd);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: readBattery$lambda-12, reason: not valid java name */
    public static final void m633readBattery$lambda12(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment, com.oudmon.ble.base.communication.rsp.BatteryRsp batteryRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment, "this$0");
        try {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setBattery(java.lang.String.valueOf(batteryRsp.getBatteryValue()));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            if (deviceFragment.getActivity() == null) {
                return;
            }
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = deviceFragment.binding;
            if (fragmentDeviceBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding = null;
            }
            fragmentDeviceBinding.tvDeviceBattery.setText(deviceFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_33, new java.lang.Object[]{com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getBattery()}) + '%');
        } catch (java.lang.Exception unused) {
        }
    }

    public final void showUnitDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomListDialog create = new com.qcwireless.qcwatch.base.dialog.BottomListDialog.Builder(getActivity()).create();
        create.show();
        create.initView();
        create.setSubTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_34));
        create.setData(getDeviceSettingVm().getUnitList());
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$$ExternalSyntheticLambda3
            @Override // com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener
            public final void onSelected(int i) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.m641showUnitDialog$lambda14(com.qcwireless.qcwatch.ui.device.DeviceFragment.this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showUnitDialog$lambda-14, reason: not valid java name */
    public static final void m641showUnitDialog$lambda14(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (i == 0) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = deviceFragment.deviceSetting;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting2 = null;
            }
            deviceSetting2.setMetricUnit(0);
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = deviceFragment.binding;
            if (fragmentDeviceBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding = null;
            }
            fragmentDeviceBinding.qcSettingUnit.setRightText(deviceFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_23));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMetric(true);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        } else if (i == 1) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = deviceFragment.deviceSetting;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting3 = null;
            }
            deviceSetting3.setMetricUnit(1);
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding2 = deviceFragment.binding;
            if (fragmentDeviceBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding2 = null;
            }
            fragmentDeviceBinding2.qcSettingUnit.setRightText(deviceFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_24));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMetric(false);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        }
        com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingVm = deviceFragment.getDeviceSettingVm();
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.DeviceUnitEvent());
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = deviceFragment.deviceSetting;
        if (deviceSetting4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting4 = null;
        }
        deviceSettingVm.execUnit(deviceSetting4);
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting5 = deviceFragment.deviceSetting;
        if (deviceSetting5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting5 = null;
        }
        deviceSettingVm.initDialogData(deviceSetting5);
        java.lang.String deviceAddress = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
        kotlin.jvm.internal.Intrinsics.checkNotNull(deviceAddress);
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting6 = deviceFragment.deviceSetting;
        if (deviceSetting6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
        } else {
            deviceSetting = deviceSetting6;
        }
        deviceSettingVm.saveDeviceSetting(deviceAddress, deviceSetting);
    }

    public final void showWeatherDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomListDialog create = new com.qcwireless.qcwatch.base.dialog.BottomListDialog.Builder(getActivity()).create();
        create.show();
        create.initView();
        create.setSubTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_34));
        create.setData(getDeviceSettingVm().getWeatherUnitList());
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$$ExternalSyntheticLambda2
            @Override // com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener
            public final void onSelected(int i) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.m642showWeatherDialog$lambda16(com.qcwireless.qcwatch.ui.device.DeviceFragment.this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showWeatherDialog$lambda-16, reason: not valid java name */
    public static final void m642showWeatherDialog$lambda16(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (i == 0) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = deviceFragment.deviceSetting;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting2 = null;
            }
            deviceSetting2.setWeatherFormat(0);
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = deviceFragment.binding;
            if (fragmentDeviceBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding = null;
            }
            fragmentDeviceBinding.qcSettingWeather.setRightText(deviceFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_27));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setTemperature(false);
        } else if (i == 1) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = deviceFragment.deviceSetting;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting3 = null;
            }
            deviceSetting3.setWeatherFormat(1);
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding2 = deviceFragment.binding;
            if (fragmentDeviceBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding2 = null;
            }
            fragmentDeviceBinding2.qcSettingWeather.setRightText(deviceFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_28));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setTemperature(true);
        }
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingVm = deviceFragment.getDeviceSettingVm();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = deviceFragment.deviceSetting;
        if (deviceSetting4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting4 = null;
        }
        deviceSettingVm.execWeather(deviceSetting4);
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting5 = deviceFragment.deviceSetting;
        if (deviceSetting5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting5 = null;
        }
        deviceSettingVm.initDialogData(deviceSetting5);
        java.lang.String deviceAddress = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
        kotlin.jvm.internal.Intrinsics.checkNotNull(deviceAddress);
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting6 = deviceFragment.deviceSetting;
        if (deviceSetting6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
        } else {
            deviceSetting = deviceSetting6;
        }
        deviceSettingVm.saveDeviceSetting(deviceAddress, deviceSetting);
    }

    public final void showTimeFormatDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomListDialog create = new com.qcwireless.qcwatch.base.dialog.BottomListDialog.Builder(getActivity()).create();
        create.show();
        create.initView();
        create.setSubTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_38));
        create.setData(getDeviceSettingVm().getTimeList());
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$$ExternalSyntheticLambda4
            @Override // com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener
            public final void onSelected(int i) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.m638showTimeFormatDialog$lambda18(com.qcwireless.qcwatch.ui.device.DeviceFragment.this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showTimeFormatDialog$lambda-18, reason: not valid java name */
    public static final void m638showTimeFormatDialog$lambda18(com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (i == 0) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = deviceFragment.deviceSetting;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting2 = null;
            }
            deviceSetting2.setTimeFormat(0);
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = deviceFragment.binding;
            if (fragmentDeviceBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding = null;
            }
            fragmentDeviceBinding.qcSettingTime.setRightText(deviceFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_26));
        } else if (i == 1) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = deviceFragment.deviceSetting;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting3 = null;
            }
            deviceSetting3.setTimeFormat(1);
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding2 = deviceFragment.binding;
            if (fragmentDeviceBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding2 = null;
            }
            fragmentDeviceBinding2.qcSettingTime.setRightText(deviceFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_25));
        }
        com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingVm = deviceFragment.getDeviceSettingVm();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = deviceFragment.deviceSetting;
        if (deviceSetting4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting4 = null;
        }
        deviceSettingVm.execUnit(deviceSetting4);
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting5 = deviceFragment.deviceSetting;
        if (deviceSetting5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting5 = null;
        }
        deviceSettingVm.initDialogData(deviceSetting5);
        java.lang.String deviceAddress = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
        kotlin.jvm.internal.Intrinsics.checkNotNull(deviceAddress);
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting6 = deviceFragment.deviceSetting;
        if (deviceSetting6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
        } else {
            deviceSetting = deviceSetting6;
        }
        deviceSettingVm.saveDeviceSetting(deviceAddress, deviceSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showUnbindDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_unbind);
        final com.qcwireless.qcwatch.base.dialog.BottomDialog create = builder.create();
        create.show();
        android.view.View contentView = create.getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_cancel);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_confirm);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.base.dialog.BottomDialog.this.dismiss();
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.m640showUnbindDialog$lambda20(com.qcwireless.qcwatch.base.dialog.BottomDialog.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showUnbindDialog$lambda-20, reason: not valid java name */
    public static final void m640showUnbindDialog$lambda20(com.qcwireless.qcwatch.base.dialog.BottomDialog bottomDialog, com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment, "this$0");
        bottomDialog.dismiss();
        com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.INSTANCE.getGetInstance().saveSyncHistoryDataInfo(0L);
        deviceFragment.getDeviceViewModel().unBindDevice();
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = deviceFragment.binding;
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding2 = null;
        if (fragmentDeviceBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDeviceBinding = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding.deviceBind);
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding3 = deviceFragment.binding;
        if (fragmentDeviceBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDeviceBinding3 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDeviceBinding3.deviceNotBind);
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding4 = deviceFragment.binding;
        if (fragmentDeviceBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDeviceBinding4 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDeviceBinding4.btnFirmwareUpdate);
        com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding5 = deviceFragment.binding;
        if (fragmentDeviceBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentDeviceBinding2 = fragmentDeviceBinding5;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) fragmentDeviceBinding2.qcSettingContact);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNotificationListenerEnabled() {
        java.lang.String packageName = com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getPackageName();
        java.lang.String string = android.provider.Settings.Secure.getString(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getContentResolver(), "enabled_notification_listeners");
        java.lang.String str = string;
        if (!android.text.TextUtils.isEmpty(str)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "flat");
            java.lang.Object[] array = new kotlin.text.Regex(":").split(str, 0).toArray(new java.lang.String[0]);
            java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            for (java.lang.String str2 : (java.lang.String[]) array) {
                android.content.ComponentName unflattenFromString = android.content.ComponentName.unflattenFromString(str2);
                if (unflattenFromString != null && android.text.TextUtils.equals(packageName, unflattenFromString.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment;
        android.content.Context activity;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && isNotificationListenerEnabled() && (activity = (deviceFragment = this).getActivity()) != null) {
            java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.push.message.MessagePushActivity.class);
            for (kotlin.Pair pair : arrayList) {
                if (pair != null) {
                    java.lang.String str = (java.lang.String) pair.getFirst();
                    java.lang.Object second = pair.getSecond();
                    if (second instanceof java.lang.Integer) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Byte) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Character) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Short) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Boolean) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Long) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Float) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Double) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.String) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                    } else if (second instanceof java.lang.CharSequence) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                    } else if (second instanceof android.os.Parcelable) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Object[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                    } else if (second instanceof java.util.ArrayList) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                    } else if (second instanceof java.io.Serializable) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                    } else if (second instanceof boolean[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                    } else if (second instanceof byte[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                    } else if (second instanceof short[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                    } else if (second instanceof char[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                    } else if (second instanceof int[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                    } else if (second instanceof long[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                    } else if (second instanceof float[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                    } else if (second instanceof double[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                    } else if (second instanceof android.os.Bundle) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                    } else if (second instanceof android.content.Intent) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                    } else {
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                }
            }
            deviceFragment.startActivity(intent);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPermissionWarmingDialog(final java.util.List<java.lang.String> permissions) {
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_permission_warming);
        final com.qcwireless.qcwatch.base.dialog.BottomDialog create = builder.create();
        kotlin.jvm.internal.Intrinsics.checkNotNull(create);
        create.show();
        android.view.View contentView = create.getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomWarmingDialog!!.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.m636showPermissionWarmingDialog$lambda21(com.qcwireless.qcwatch.base.dialog.BottomDialog.this, this, permissions, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.DeviceFragment$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.DeviceFragment.m637showPermissionWarmingDialog$lambda22(com.qcwireless.qcwatch.base.dialog.BottomDialog.this, this, permissions, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPermissionWarmingDialog$lambda-21, reason: not valid java name */
    public static final void m636showPermissionWarmingDialog$lambda21(com.qcwireless.qcwatch.base.dialog.BottomDialog bottomDialog, com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment, java.util.List list, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "$permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNull(bottomDialog);
        bottomDialog.dismiss();
        com.hjq.permissions.XXPermissions.startPermissionActivity(deviceFragment.getActivity(), (java.util.List<java.lang.String>) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPermissionWarmingDialog$lambda-22, reason: not valid java name */
    public static final void m637showPermissionWarmingDialog$lambda22(com.qcwireless.qcwatch.base.dialog.BottomDialog bottomDialog, com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment, java.util.List list, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "$permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNull(bottomDialog);
        bottomDialog.dismiss();
        com.hjq.permissions.XXPermissions.startPermissionActivity(deviceFragment.getActivity(), (java.util.List<java.lang.String>) list);
    }

    /* compiled from: DeviceFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/DeviceFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/device/DeviceFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.device.DeviceFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.device.DeviceFragment();
        }
    }

    /* compiled from: DeviceFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/DeviceFragment$CameraPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/device/DeviceFragment;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class CameraPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public CameraPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            if (!all) {
                java.lang.String string = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                return;
            }
            com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
            android.content.Context activity = deviceFragment.getActivity();
            if (activity != null) {
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.camera.CameraActivity.class);
                for (kotlin.Pair pair : arrayList) {
                    if (pair != null) {
                        java.lang.String str = (java.lang.String) pair.getFirst();
                        java.lang.Object second = pair.getSecond();
                        if (second instanceof java.lang.Integer) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                        } else if (second instanceof java.lang.Byte) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                        } else if (second instanceof java.lang.Character) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                        } else if (second instanceof java.lang.Short) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                        } else if (second instanceof java.lang.Boolean) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                        } else if (second instanceof java.lang.Long) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                        } else if (second instanceof java.lang.Float) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                        } else if (second instanceof java.lang.Double) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                        } else if (second instanceof java.lang.String) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                        } else if (second instanceof java.lang.CharSequence) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                        } else if (second instanceof android.os.Parcelable) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                        } else if (second instanceof java.lang.Object[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                        } else if (second instanceof java.util.ArrayList) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                        } else if (second instanceof java.io.Serializable) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                        } else if (second instanceof boolean[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                        } else if (second instanceof byte[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                        } else if (second instanceof short[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                        } else if (second instanceof char[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                        } else if (second instanceof int[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                        } else if (second instanceof long[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                        } else if (second instanceof float[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                        } else if (second instanceof double[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                        } else if (second instanceof android.os.Bundle) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                        } else if (second instanceof android.content.Intent) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                        } else {
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        }
                    }
                }
                deviceFragment.startActivity(intent);
            }
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            if (never) {
                java.lang.String string = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                com.hjq.permissions.XXPermissions.startPermissionActivity(com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getActivity(), permissions);
            }
        }
    }

    /* compiled from: DeviceFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/DeviceFragment$LocationPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/device/DeviceFragment;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class LocationPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public LocationPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getLocationOnce(com.qcwireless.qcwatch.QCApplication.INSTANCE.getApplication());
            com.qcwireless.qcwatch.ui.device.DeviceFragment deviceFragment = com.qcwireless.qcwatch.ui.device.DeviceFragment.this;
            android.content.Context activity = deviceFragment.getActivity();
            if (activity != null) {
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.class);
                for (kotlin.Pair pair : arrayList) {
                    if (pair != null) {
                        java.lang.String str = (java.lang.String) pair.getFirst();
                        java.lang.Object second = pair.getSecond();
                        if (second instanceof java.lang.Integer) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                        } else if (second instanceof java.lang.Byte) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                        } else if (second instanceof java.lang.Character) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                        } else if (second instanceof java.lang.Short) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                        } else if (second instanceof java.lang.Boolean) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                        } else if (second instanceof java.lang.Long) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                        } else if (second instanceof java.lang.Float) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                        } else if (second instanceof java.lang.Double) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                        } else if (second instanceof java.lang.String) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                        } else if (second instanceof java.lang.CharSequence) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                        } else if (second instanceof android.os.Parcelable) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                        } else if (second instanceof java.lang.Object[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                        } else if (second instanceof java.util.ArrayList) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                        } else if (second instanceof java.io.Serializable) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                        } else if (second instanceof boolean[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                        } else if (second instanceof byte[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                        } else if (second instanceof short[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                        } else if (second instanceof char[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                        } else if (second instanceof int[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                        } else if (second instanceof long[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                        } else if (second instanceof float[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                        } else if (second instanceof double[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                        } else if (second instanceof android.os.Bundle) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                        } else if (second instanceof android.content.Intent) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                        } else {
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        }
                    }
                }
                deviceFragment.startActivity(intent);
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, permissions);
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, permissions);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(never));
            if (never) {
                try {
                    com.qcwireless.qcwatch.ui.device.DeviceFragment.this.showPermissionWarmingDialog(permissions);
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* compiled from: DeviceFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/DeviceFragment$MyRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/device/DeviceFragment;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyRunnable implements java.lang.Runnable {
        public MyRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.binding;
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding2 = null;
            if (fragmentDeviceBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding = null;
            }
            if (fragmentDeviceBinding.syncDeviceRefresh.isRefreshing()) {
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding3 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.binding;
                if (fragmentDeviceBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentDeviceBinding2 = fragmentDeviceBinding3;
                }
                fragmentDeviceBinding2.syncDeviceRefresh.finishRefresh();
                com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getDeviceSettingVm().initData(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
            }
        }
    }

    /* compiled from: DeviceFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/DeviceFragment$CallPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/device/DeviceFragment;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class CallPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public CallPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
            if (all) {
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.binding;
                if (fragmentDeviceBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDeviceBinding = null;
                }
                fragmentDeviceBinding.qcSettingCall.setChecked(true);
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.deviceSetting;
                if (deviceSetting2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                    deviceSetting2 = null;
                }
                deviceSetting2.setCallSwitch(true);
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setCallPushEnable(true);
            } else {
                com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding2 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.binding;
                if (fragmentDeviceBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDeviceBinding2 = null;
                }
                fragmentDeviceBinding2.qcSettingCall.setChecked(false);
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.deviceSetting;
                if (deviceSetting3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                    deviceSetting3 = null;
                }
                deviceSetting3.setCallSwitch(false);
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setCallPushEnable(false);
                java.lang.String string = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                com.iwown.awlog.AwLog.wtfJson(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.iwown.awlog.bean.AppLog(com.qcwireless.qcwatch.QJavaApplication.getInstance().getYMD(), "call ng", "2")), com.qcwireless.qcwatch.QJavaApplication.getAppLogPath());
            }
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingVm = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getDeviceSettingVm();
            java.lang.String deviceAddress = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.deviceSetting;
            if (deviceSetting4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            } else {
                deviceSetting = deviceSetting4;
            }
            deviceSettingVm.saveDeviceSetting(deviceAddress, deviceSetting);
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            com.qcwireless.qcwatch.databinding.FragmentDeviceBinding fragmentDeviceBinding = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.binding;
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
            if (fragmentDeviceBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDeviceBinding = null;
            }
            fragmentDeviceBinding.qcSettingCall.setChecked(false);
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.deviceSetting;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting2 = null;
            }
            deviceSetting2.setCallSwitch(false);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setCallPushEnable(false);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            java.lang.String string = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingVm = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getDeviceSettingVm();
            java.lang.String deviceAddress = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = com.qcwireless.qcwatch.ui.device.DeviceFragment.this.deviceSetting;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            } else {
                deviceSetting = deviceSetting3;
            }
            deviceSettingVm.saveDeviceSetting(deviceAddress, deviceSetting);
            com.iwown.awlog.AwLog.wtfJson(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.iwown.awlog.bean.AppLog(com.qcwireless.qcwatch.QJavaApplication.getInstance().getYMD(), "call ng", "2")), com.qcwireless.qcwatch.QJavaApplication.getAppLogPath());
            if (never) {
                com.hjq.permissions.XXPermissions.startPermissionActivity(com.qcwireless.qcwatch.ui.device.DeviceFragment.this.getActivity(), permissions);
            }
        }
    }
}
