package com.qcwireless.qcwatch.ui.home.healthy;

/* compiled from: HealthyFragment.kt */
@kotlin.Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 b2\u00020\u0001:\u0007bcdefghB\u0005¢\u0006\u0002\u0010\u0002J\b\u00107\u001a\u00020\"H\u0002J \u00108\u001a\u0002092\u0006\u0010:\u001a\u00020$2\u0006\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020$H\u0002J\b\u0010=\u001a\u000209H\u0002J\u0010\u0010>\u001a\u0002092\u0006\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u000209H\u0002J\b\u0010B\u001a\u00020\"H\u0002J\b\u0010C\u001a\u000209H\u0016J\b\u0010D\u001a\u000209H\u0002J\"\u0010E\u001a\u0002092\u0006\u0010F\u001a\u00020$2\u0006\u0010G\u001a\u00020$2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J&\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010O2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\b\u0010R\u001a\u000209H\u0016J\u0010\u0010S\u001a\u0002092\u0006\u0010T\u001a\u00020\"H\u0016J\u0010\u0010U\u001a\u0002092\u0006\u0010V\u001a\u00020WH\u0007J\b\u0010X\u001a\u000209H\u0016J\b\u0010Y\u001a\u000209H\u0016J\b\u0010Z\u001a\u000209H\u0016J\b\u0010[\u001a\u000209H\u0002J\b\u0010\\\u001a\u000209H\u0002J\u0016\u0010]\u001a\u0002092\f\u0010^\u001a\b\u0012\u0004\u0012\u00020605H\u0002J\b\u0010_\u001a\u000209H\u0002J\b\u0010`\u001a\u000209H\u0002J\b\u0010a\u001a\u000209H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00060\u000eR\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00060\u001eR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010&\u001a\u00060'R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020)X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020)X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020)X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020)X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0014\u001a\u0004\b0\u00101R\u000e\u00103\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020605X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006i"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "barChart", "Lcom/qcwireless/qcwatch/ui/base/view/healthy/PubuProgressCircle;", "batteryDialog", "Lcom/qcwireless/qcwatch/base/dialog/CenterDialog;", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentHealthyBinding;", "bleStatus", "Landroid/widget/ImageView;", "btnAdd", "Landroid/widget/Button;", "deviceNotifyListener", "Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment$MyDeviceNotifyListener;", "deviceViewModel", "Lcom/qcwireless/qcwatch/ui/device/vm/DeviceViewModel;", "getDeviceViewModel", "()Lcom/qcwireless/qcwatch/ui/device/vm/DeviceViewModel;", "deviceViewModel$delegate", "Lkotlin/Lazy;", "handler", "Landroid/os/Handler;", "healthyAdapter", "Lcom/qcwireless/qcwatch/ui/home/healthy/adapter/MultipleItemQuickAdapter;", "marqueeView", "Lcom/qcwireless/qcwatch/ui/base/view/healthy/MarqueeView;", "myRunnable", "Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment$MyRunnable;", "mySportDeviceNotifyListener", "Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment$MySportDeviceNotifyListener;", "noBinding", "Landroidx/constraintlayout/widget/ConstraintLayout;", "sportRunning", "", "sportStatus", "", "sportType", "tenSecondsRefreshRunnable", "Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment$TenSecondsRefreshRunnable;", "todayCalorie", "Landroid/widget/TextView;", "todayDate", "todayDistance", "todayDistanceUnit", "todayStep", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/healthy/vm/HealthyViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/healthy/vm/HealthyViewModel;", "viewModel$delegate", "warmingLayout", "warmingList", "", "", "checkPermission", "deviceNotification", "", "step", "distance", "calorie", "healthyModule", "homePageRefreshTodayData", "it", "Lcom/qcwireless/qcwatch/ui/home/healthy/vm/HealthyViewModel$HealthUI;", "initWarming", "isNotificationListenerEnabled", "loadDataOnce", "observe", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onHiddenChanged", "hidden", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onPause", "onResume", "onStop", "showLocationWarningDialog", "showNotificationDialog", "showPermissionWarmingDialog", "permissions", "showRingBatteryLowDialog", "startSyncData", "tenSecondsRefresh", "Companion", "LocationPermissionCallback", "MyDeviceNotifyListener", "MyRunnable", "MySportDeviceNotifyListener", "ScanLocationPermissionCallback", "TenSecondsRefreshRunnable", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class HealthyFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.Companion(null);
    private com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle barChart;
    private com.qcwireless.qcwatch.base.dialog.CenterDialog batteryDialog;
    private com.qcwireless.qcwatch.databinding.FragmentHealthyBinding binding;
    private android.widget.ImageView bleStatus;
    private android.widget.Button btnAdd;
    private com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.MyDeviceNotifyListener deviceNotifyListener;

    /* renamed from: deviceViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy deviceViewModel;
    private final android.os.Handler handler;
    private com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter healthyAdapter;
    private com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView marqueeView;
    private androidx.constraintlayout.widget.ConstraintLayout noBinding;
    private boolean sportRunning;
    private int sportStatus;
    private int sportType;
    private android.widget.TextView todayCalorie;
    private android.widget.TextView todayDate;
    private android.widget.TextView todayDistance;
    private android.widget.TextView todayDistanceUnit;
    private android.widget.TextView todayStep;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private androidx.constraintlayout.widget.ConstraintLayout warmingLayout;
    private final com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.MyRunnable myRunnable = new com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.MyRunnable();
    private java.util.List<java.lang.String> warmingList = new java.util.ArrayList();
    private final com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.TenSecondsRefreshRunnable tenSecondsRefreshRunnable = new com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.TenSecondsRefreshRunnable();
    private final com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.MySportDeviceNotifyListener mySportDeviceNotifyListener = new com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.MySportDeviceNotifyListener();

    public HealthyFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel m1055invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.class), qualifier, qualifier);
            }
        });
        this.deviceViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel m1056invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel getDeviceViewModel() {
        return (com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel) this.deviceViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentHealthyBinding inflate = com.qcwireless.qcwatch.databinding.FragmentHealthyBinding.inflate(inflater, container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.binding = inflate;
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
        com.qcwireless.qcwatch.databinding.FragmentHealthyBinding fragmentHealthyBinding = this.binding;
        if (fragmentHealthyBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHealthyBinding = null;
        }
        return fragmentHealthyBinding.getRoot();
    }

    private final void observe() {
        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel viewModel = getViewModel();
        viewModel.getUiState().observe(getViewLifecycleOwner(), new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda4
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1046observe$lambda3$lambda0(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this, (com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI) obj);
            }
        });
        viewModel.getFileDismissStatue().observe(getViewLifecycleOwner(), new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda5
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1047observe$lambda3$lambda2(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this, (java.util.ArrayList) obj);
            }
        });
        viewModel.queryInitHealthData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observe$lambda-3$lambda-0, reason: not valid java name */
    public static final void m1046observe$lambda3$lambda0(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI healthUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        android.widget.TextView textView = null;
        android.widget.TextView textView2 = null;
        if (healthUI.getRefreshType() == 1) {
            com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().setSync(false);
            com.qcwireless.qcwatch.databinding.FragmentHealthyBinding fragmentHealthyBinding = healthyFragment.binding;
            if (fragmentHealthyBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentHealthyBinding = null;
            }
            fragmentHealthyBinding.syncRefresh.finishRefresh();
        }
        if (healthUI.getRefreshType() == 3) {
            if (healthUI.getTotalSteps() != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(healthUI, "it");
                healthyFragment.homePageRefreshTodayData(healthUI);
                return;
            }
            return;
        }
        if (healthUI.getRefreshType() == 4) {
            if (healthUI.getTotalSteps() != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(healthUI, "it");
                healthyFragment.homePageRefreshTodayData(healthUI);
            }
            healthUI.getStepHourData();
            if ((healthUI != null ? healthUI.getTotalSteps() : null) != null) {
                com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal totalSteps = healthUI.getTotalSteps();
                kotlin.jvm.internal.Intrinsics.checkNotNull(totalSteps);
                com.qcwireless.qcwatch.base.pref.PreUtil.putInt(com.qcwireless.qcwatch.base.pref.PreUtil.Action_Today_Steps, totalSteps.getStep());
            }
            new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
            return;
        }
        if (healthUI.getTotalSteps() != null) {
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear().length() > 0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(healthUI, "it");
                healthyFragment.homePageRefreshTodayData(healthUI);
                com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal totalSteps2 = healthUI.getTotalSteps();
                kotlin.jvm.internal.Intrinsics.checkNotNull(totalSteps2);
                com.qcwireless.qcwatch.base.pref.PreUtil.putInt(com.qcwireless.qcwatch.base.pref.PreUtil.Action_Today_Steps, totalSteps2.getStep());
                new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastSyncTodaySteps(new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp() + 180);
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                healthUI.getStepHourData();
                healthyFragment.healthyModule();
                healthyFragment.getViewModel().syncTodayStepNotification();
            }
        }
        android.widget.TextView textView3 = healthyFragment.todayStep;
        if (textView3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayStep");
            textView3 = null;
        }
        textView3.setText("--");
        android.widget.TextView textView4 = healthyFragment.todayDistance;
        if (textView4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayDistance");
            textView4 = null;
        }
        textView4.setText("--");
        android.widget.TextView textView5 = healthyFragment.todayCalorie;
        if (textView5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayCalorie");
            textView5 = null;
        }
        textView5.setText("--");
        android.widget.TextView textView6 = healthyFragment.todayDate;
        if (textView6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayDate");
            textView6 = null;
        }
        textView6.setText(new com.qcwireless.qc_utils.date.DateUtil().getY_M_D());
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
            android.widget.TextView textView7 = healthyFragment.todayDistanceUnit;
            if (textView7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayDistanceUnit");
            } else {
                textView2 = textView7;
            }
            textView2.setText(healthyFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_88));
        } else {
            android.widget.TextView textView8 = healthyFragment.todayDistanceUnit;
            if (textView8 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayDistanceUnit");
            } else {
                textView = textView8;
            }
            textView.setText(healthyFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_358));
        }
        healthUI.getStepHourData();
        healthyFragment.healthyModule();
        healthyFragment.getViewModel().syncTodayStepNotification();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observe$lambda-3$lambda-2, reason: not valid java name */
    public static final void m1047observe$lambda3$lambda2(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, java.util.ArrayList arrayList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        android.os.Bundle bundle = new android.os.Bundle();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrayList, "it");
        bundle.putString("fileNames", com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(arrayList));
        bundle.putInt("background", 0);
        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment2 = healthyFragment;
        android.content.Context activity = healthyFragment2.getActivity();
        if (activity != null) {
            java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity.class);
            intent.setFlags(1);
            intent.putExtras(bundle);
            for (kotlin.Pair pair : arrayList2) {
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
            healthyFragment2.startActivity(intent);
        }
    }

    private final void homePageRefreshTodayData(final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI it) {
        android.widget.TextView textView = null;
        try {
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress().length() == 0) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.noBinding;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("noBinding");
                    constraintLayout = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible((android.view.View) constraintLayout);
            } else {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.noBinding;
                if (constraintLayout2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("noBinding");
                    constraintLayout2 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) constraintLayout2);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        android.widget.TextView textView2 = this.todayDate;
        if (textView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayDate");
            textView2 = null;
        }
        com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal totalSteps = it.getTotalSteps();
        kotlin.jvm.internal.Intrinsics.checkNotNull(totalSteps);
        textView2.setText(totalSteps.getDateStr());
        android.widget.TextView textView3 = this.todayStep;
        if (textView3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayStep");
            textView3 = null;
        }
        com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal totalSteps2 = it.getTotalSteps();
        kotlin.jvm.internal.Intrinsics.checkNotNull(totalSteps2);
        textView3.setText(java.lang.String.valueOf(totalSteps2.getStep()));
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNull(it.getTotalSteps());
                java.lang.String valueOf = java.lang.String.valueOf(new java.math.BigDecimal(java.lang.String.valueOf((r7.getDistance() * 1.0f) / 1000)).setScale(2, java.math.RoundingMode.HALF_UP));
                android.widget.TextView textView4 = this.todayDistance;
                if (textView4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayDistance");
                    textView4 = null;
                }
                textView4.setText(valueOf);
                android.widget.TextView textView5 = this.todayDistanceUnit;
                if (textView5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayDistanceUnit");
                    textView5 = null;
                }
                textView5.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_88));
            } catch (java.lang.Exception unused) {
            }
        } else {
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNull(it.getTotalSteps());
                java.lang.String valueOf2 = java.lang.String.valueOf(new java.math.BigDecimal(java.lang.String.valueOf(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kmToIn((r7.getDistance() * 1.0f) / 1000))).setScale(2, java.math.RoundingMode.HALF_UP));
                android.widget.TextView textView6 = this.todayDistance;
                if (textView6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayDistance");
                    textView6 = null;
                }
                textView6.setText(valueOf2);
                android.widget.TextView textView7 = this.todayDistanceUnit;
                if (textView7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayDistanceUnit");
                    textView7 = null;
                }
                textView7.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_358));
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
            }
        }
        android.widget.TextView textView8 = this.todayCalorie;
        if (textView8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayCalorie");
        } else {
            textView = textView8;
        }
        com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal totalSteps3 = it.getTotalSteps();
        kotlin.jvm.internal.Intrinsics.checkNotNull(totalSteps3);
        textView.setText(java.lang.String.valueOf(totalSteps3.getCarolie() / 1000));
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$homePageRefreshTodayData$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "$this$ktxRunOnBgSingle");
                final com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity queryTarget = com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.INSTANCE.getGetInstance().queryTarget();
                if (queryTarget != null) {
                    final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI healthUI = com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(healthyFragment, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$homePageRefreshTodayData$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment2) {
                            com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle pubuProgressCircle;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment2, "$this$ktxRunOnUi");
                            pubuProgressCircle = healthyFragment2.barChart;
                            if (pubuProgressCircle == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("barChart");
                                pubuProgressCircle = null;
                            }
                            com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle pubuProgressCircle2 = pubuProgressCircle;
                            com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal totalSteps4 = com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI.this.getTotalSteps();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(totalSteps4);
                            int step = totalSteps4.getStep();
                            com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal totalSteps5 = com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI.this.getTotalSteps();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(totalSteps5);
                            int step2 = totalSteps5.getStep();
                            com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal totalSteps6 = com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI.this.getTotalSteps();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(totalSteps6);
                            pubuProgressCircle2.refreshView(step, step2, totalSteps6.getStep(), queryTarget.getGoalSteps(), queryTarget.getGoalSteps(), queryTarget.getGoalSteps());
                        }
                    });
                } else {
                    final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI healthUI2 = com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(healthyFragment, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$homePageRefreshTodayData$1.2
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment2) {
                            com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle pubuProgressCircle;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment2, "$this$ktxRunOnUi");
                            pubuProgressCircle = healthyFragment2.barChart;
                            if (pubuProgressCircle == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("barChart");
                                pubuProgressCircle = null;
                            }
                            com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle pubuProgressCircle2 = pubuProgressCircle;
                            com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal totalSteps4 = com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI.this.getTotalSteps();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(totalSteps4);
                            int step = totalSteps4.getStep();
                            com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal totalSteps5 = com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI.this.getTotalSteps();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(totalSteps5);
                            int step2 = totalSteps5.getStep();
                            com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal totalSteps6 = com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI.this.getTotalSteps();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(totalSteps6);
                            pubuProgressCircle2.refreshView(step, step2, totalSteps6.getStep(), 10000, 10000, 10000);
                        }
                    });
                }
            }
        });
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onResume() {
        super.onResume();
        boolean z = false;
        if (!com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLoginStatus()) {
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUserToken().length() == 0) {
                getViewModel().getTokenNotLogin();
            }
        }
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUpNotWait();
        }
        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.MyDeviceNotifyListener myDeviceNotifyListener = null;
        try {
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceName().length() == 0) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.noBinding;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("noBinding");
                    constraintLayout = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible((android.view.View) constraintLayout);
            } else {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.noBinding;
                if (constraintLayout2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("noBinding");
                    constraintLayout2 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) constraintLayout2);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.databinding.FragmentHealthyBinding fragmentHealthyBinding = this.binding;
            if (fragmentHealthyBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentHealthyBinding = null;
            }
            if (fragmentHealthyBinding.syncRefresh.isRefreshing()) {
                com.qcwireless.qcwatch.databinding.FragmentHealthyBinding fragmentHealthyBinding2 = this.binding;
                if (fragmentHealthyBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentHealthyBinding2 = null;
                }
                fragmentHealthyBinding2.syncRefresh.finishRefresh();
            }
            android.widget.ImageView imageView = this.bleStatus;
            if (imageView == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bleStatus");
                imageView = null;
            }
            imageView.setImageResource(com.qcwireless.qcwatch.R.mipmap.ble_disconnect);
        } else {
            android.widget.ImageView imageView2 = this.bleStatus;
            if (imageView2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bleStatus");
                imageView2 = null;
            }
            imageView2.setImageResource(com.qcwireless.qcwatch.R.mipmap.ble_connect);
        }
        initWarming();
        this.handler.removeCallbacks(this.tenSecondsRefreshRunnable);
        this.handler.postDelayed(this.tenSecondsRefreshRunnable, 10000L);
        try {
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("----前台同步数据状态：");
                sb.append(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLastTenMinSyncTime() < new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, sb.toString());
                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLastTenMinSyncTime() < new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp()) {
                    startSyncData();
                }
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "-----onResume--------");
        this.deviceNotifyListener = new com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.MyDeviceNotifyListener();
        com.oudmon.ble.base.bluetooth.BleOperateManager bleOperateManager = com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance();
        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.MyDeviceNotifyListener myDeviceNotifyListener2 = this.deviceNotifyListener;
        if (myDeviceNotifyListener2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceNotifyListener");
        } else {
            myDeviceNotifyListener = myDeviceNotifyListener2;
        }
        bleOperateManager.addOutDeviceListener(100, myDeviceNotifyListener);
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().addSportDeviceListener(120, this.mySportDeviceNotifyListener);
        if (kotlin.text.StringsKt.equals(android.os.Build.BRAND, "xiaomi", true) || kotlin.text.StringsKt.equals(android.os.Build.BRAND, "redmi", true)) {
            this.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1048onResume$lambda4(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this);
                }
            }, 10000L);
        }
        getViewModel().queryNotificationHealthData();
        healthyModule();
        java.lang.String battery = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getBattery();
        if (battery != null) {
            int parseInt = java.lang.Integer.parseInt(battery);
            if (1 <= parseInt && parseInt < 10) {
                z = true;
            }
            if (!z || com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getBatteryLow()) {
                return;
            }
            showRingBatteryLowDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onResume$lambda-4, reason: not valid java name */
    public static final void m1048onResume$lambda4(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        healthyFragment.initWarming();
    }

    /* compiled from: HealthyFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment$MySportDeviceNotifyListener;", "Lcom/oudmon/ble/base/communication/responseImpl/DeviceSportNotifyListener;", "(Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment;)V", "onDataResponse", "", "resultEntity", "Lcom/oudmon/ble/base/communication/rsp/DeviceNotifyRsp;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MySportDeviceNotifyListener extends com.oudmon.ble.base.communication.responseImpl.DeviceSportNotifyListener {
        public MySportDeviceNotifyListener() {
        }

        @Override // com.oudmon.ble.base.communication.responseImpl.DeviceSportNotifyListener, com.oudmon.ble.base.communication.ICommandResponse
        public void onDataResponse(com.oudmon.ble.base.communication.rsp.DeviceNotifyRsp resultEntity) {
            super.onDataResponse(resultEntity);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("--------------");
            kotlin.jvm.internal.Intrinsics.checkNotNull(resultEntity);
            sb.append(com.oudmon.ble.base.communication.utils.ByteUtil.bytesToString(resultEntity.getLoadData()));
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, sb.toString());
            if (resultEntity.getStatus() == 0) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.sportRunning = true;
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.sportType = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{resultEntity.getLoadData()[0]});
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.sportStatus = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{resultEntity.getLoadData()[1]});
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.sportType));
            }
        }
    }

    private final void initWarming() {
        try {
            this.warmingList.clear();
            if (!isNotificationListenerEnabled() || !com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().isNotificationServiceRunning(getActivity())) {
                java.util.List<java.lang.String> list = this.warmingList;
                java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_389);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_389)");
                list.add(string);
            }
            if (!checkPermission()) {
                java.util.List<java.lang.String> list2 = this.warmingList;
                java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_390);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_390)");
                list2.add(string2);
            }
            if (!com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getWarmingAutoStart()) {
                java.util.List<java.lang.String> list3 = this.warmingList;
                java.lang.String string3 = getString(com.qcwireless.qcwatch.R.string.qc_text_391);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_391)");
                list3.add(string3);
            }
            if (!com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getWarmingLock()) {
                java.util.List<java.lang.String> list4 = this.warmingList;
                java.lang.String string4 = getString(com.qcwireless.qcwatch.R.string.qc_text_392);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_392)");
                list4.add(string4);
            }
            if (!com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getWarmingBatteryAllow()) {
                java.util.List<java.lang.String> list5 = this.warmingList;
                java.lang.String string5 = getString(com.qcwireless.qcwatch.R.string.qc_text_393);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.qc_text_393)");
                list5.add(string5);
            }
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                if (!com.qcwireless.qcwatch.base.permission.PermissionUtilKt.hasCallPhonePermission(getActivity())) {
                    java.util.List<java.lang.String> list6 = this.warmingList;
                    java.lang.String string6 = getString(com.qcwireless.qcwatch.R.string.qc_text_451);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.qc_text_451)");
                    list6.add(string6);
                }
                if (!com.qcwireless.qcwatch.base.permission.PermissionUtilKt.hasSMSPermission(getActivity())) {
                    java.util.List<java.lang.String> list7 = this.warmingList;
                    java.lang.String string7 = getString(com.qcwireless.qcwatch.R.string.qc_text_452);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.qc_text_452)");
                    list7.add(string7);
                }
            }
            com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView marqueeView = null;
            if (this.warmingList.size() > 0) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.warmingLayout;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("warmingLayout");
                    constraintLayout = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) constraintLayout);
                com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView marqueeView2 = this.marqueeView;
                if (marqueeView2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marqueeView");
                } else {
                    marqueeView = marqueeView2;
                }
                marqueeView.startWithList(this.warmingList);
                return;
            }
            com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView marqueeView3 = this.warmingLayout;
            if (marqueeView3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("warmingLayout");
            } else {
                marqueeView = marqueeView3;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(marqueeView);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onStop() {
        super.onStop();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "----------onStop");
        com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView marqueeView = null;
        try {
            com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter multipleItemQuickAdapter = this.healthyAdapter;
            if (multipleItemQuickAdapter == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("healthyAdapter");
                multipleItemQuickAdapter = null;
            }
            multipleItemQuickAdapter.removeMeasure();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView marqueeView2 = this.marqueeView;
        if (marqueeView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marqueeView");
        } else {
            marqueeView = marqueeView2;
        }
        marqueeView.stopFlipping();
        this.handler.removeCallbacks(this.tenSecondsRefreshRunnable);
    }

    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "----hidden---");
            this.handler.removeCallbacks(this.tenSecondsRefreshRunnable);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onPause() {
        super.onPause();
        this.handler.removeCallbacks(this.tenSecondsRefreshRunnable);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void loadDataOnce() {
        super.loadDataOnce();
        this.healthyAdapter = new com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter(getActivity(), getViewModel().getItemList());
        androidx.recyclerview.widget.RecyclerView.LayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(getActivity(), 2);
        com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter multipleItemQuickAdapter = null;
        android.view.View inflate = android.view.LayoutInflater.from(getActivity()).inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_footer, (android.view.ViewGroup) null);
        android.view.View inflate2 = android.view.LayoutInflater.from(getActivity()).inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_header, (android.view.ViewGroup) null);
        androidx.constraintlayout.widget.ConstraintLayout findViewById = inflate2.findViewById(com.qcwireless.qcwatch.R.id.today_step_layout);
        android.view.View findViewById2 = inflate2.findViewById(com.qcwireless.qcwatch.R.id.tv_today_steps);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "headerView.findViewById(R.id.tv_today_steps)");
        this.todayStep = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate2.findViewById(com.qcwireless.qcwatch.R.id.tv_distance);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "headerView.findViewById(R.id.tv_distance)");
        this.todayDistance = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate2.findViewById(com.qcwireless.qcwatch.R.id.tv_distance_unit);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "headerView.findViewById(R.id.tv_distance_unit)");
        this.todayDistanceUnit = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate2.findViewById(com.qcwireless.qcwatch.R.id.tv_calorie);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById5, "headerView.findViewById(R.id.tv_calorie)");
        this.todayCalorie = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate2.findViewById(com.qcwireless.qcwatch.R.id.qc_step_chart);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById6, "headerView.findViewById(R.id.qc_step_chart)");
        this.barChart = (com.qcwireless.qcwatch.ui.base.view.healthy.PubuProgressCircle) findViewById6;
        android.view.View findViewById7 = inflate2.findViewById(com.qcwireless.qcwatch.R.id.image_ble_status);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById7, "headerView.findViewById(R.id.image_ble_status)");
        this.bleStatus = (android.widget.ImageView) findViewById7;
        android.view.View findViewById8 = inflate2.findViewById(com.qcwireless.qcwatch.R.id.marquee_view);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById8, "headerView.findViewById(R.id.marquee_view)");
        this.marqueeView = (com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView) findViewById8;
        androidx.constraintlayout.widget.ConstraintLayout findViewById9 = inflate2.findViewById(com.qcwireless.qcwatch.R.id.warming_info);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById9, "headerView.findViewById(R.id.warming_info)");
        this.warmingLayout = findViewById9;
        android.view.View findViewById10 = findViewById.findViewById(com.qcwireless.qcwatch.R.id.home_step_date);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById10, "headerClick.findViewById(R.id.home_step_date)");
        this.todayDate = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = inflate2.findViewById(com.qcwireless.qcwatch.R.id.btn_add_device);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById11, "headerView.findViewById(R.id.btn_add_device)");
        this.btnAdd = (android.widget.Button) findViewById11;
        androidx.constraintlayout.widget.ConstraintLayout findViewById12 = inflate2.findViewById(com.qcwireless.qcwatch.R.id.data_no_binding);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById12, "headerView.findViewById(R.id.data_no_binding)");
        this.noBinding = findViewById12;
        android.widget.TextView textView = this.todayDate;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayDate");
            textView = null;
        }
        textView.setText(new com.qcwireless.qc_utils.date.DateUtil().getY_M_D());
        android.widget.ImageView imageView = (android.widget.ImageView) inflate2.findViewById(com.qcwireless.qcwatch.R.id.image_right);
        try {
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceName().length() == 0) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.noBinding;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("noBinding");
                    constraintLayout = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible((android.view.View) constraintLayout);
            } else {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.noBinding;
                if (constraintLayout2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("noBinding");
                    constraintLayout2 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) constraintLayout2);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1041loadDataOnce$lambda5(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this, view);
            }
        });
        android.widget.Button button = this.btnAdd;
        if (button == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("btnAdd");
            button = null;
        }
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1042loadDataOnce$lambda6(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this, view);
            }
        });
        com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView marqueeView = this.marqueeView;
        if (marqueeView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marqueeView");
            marqueeView = null;
        }
        marqueeView.startFlipping();
        com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView marqueeView2 = this.marqueeView;
        if (marqueeView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marqueeView");
            marqueeView2 = null;
        }
        marqueeView2.setOnItemClickListener(new com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda8
            @Override // com.qcwireless.qcwatch.ui.base.view.healthy.MarqueeView.OnItemClickListener
            public final void onItemClick(int i, android.widget.TextView textView2) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1043loadDataOnce$lambda8(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this, i, textView2);
            }
        });
        findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda17
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1045loadDataOnce$lambda9(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this, view);
            }
        });
        android.widget.ImageView imageView2 = this.bleStatus;
        if (imageView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bleStatus");
            imageView2 = null;
        }
        imageView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1035loadDataOnce$lambda10(view);
            }
        });
        ((android.widget.TextView) inflate.findViewById(com.qcwireless.qcwatch.R.id.healthy_tv_bottom_edit)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda16
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1036loadDataOnce$lambda11(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this, view);
            }
        });
        com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter multipleItemQuickAdapter2 = this.healthyAdapter;
        if (multipleItemQuickAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("healthyAdapter");
            multipleItemQuickAdapter2 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "view");
        com.chad.library.adapter.base.BaseQuickAdapter.addFooterView$default(multipleItemQuickAdapter2, inflate, 0, 0, 6, null);
        com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter multipleItemQuickAdapter3 = this.healthyAdapter;
        if (multipleItemQuickAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("healthyAdapter");
            multipleItemQuickAdapter3 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate2, "headerView");
        com.chad.library.adapter.base.BaseQuickAdapter.addHeaderView$default(multipleItemQuickAdapter3, inflate2, 0, 0, 6, null);
        final com.qcwireless.qcwatch.databinding.FragmentHealthyBinding fragmentHealthyBinding = this.binding;
        if (fragmentHealthyBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHealthyBinding = null;
        }
        fragmentHealthyBinding.healthyCardRcv.setLayoutManager(gridLayoutManager);
        com.qcwireless.qcwatch.ui.base.view.MyRecycleView myRecycleView = fragmentHealthyBinding.healthyCardRcv;
        com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter multipleItemQuickAdapter4 = this.healthyAdapter;
        if (multipleItemQuickAdapter4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("healthyAdapter");
            multipleItemQuickAdapter4 = null;
        }
        myRecycleView.setAdapter(multipleItemQuickAdapter4);
        fragmentHealthyBinding.syncRefresh.setOnRefreshListener(new com.scwang.smart.refresh.layout.listener.OnRefreshListener() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda9
            public final void onRefresh(com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1037loadDataOnce$lambda13$lambda12(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this, fragmentHealthyBinding, refreshLayout);
            }
        });
        com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter multipleItemQuickAdapter5 = this.healthyAdapter;
        if (multipleItemQuickAdapter5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("healthyAdapter");
            multipleItemQuickAdapter5 = null;
        }
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        multipleItemQuickAdapter5.getClickType().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda3
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1038loadDataOnce$lambda15(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this, (com.qcwireless.qcwatch.ui.home.healthy.bean.MeasureBean) obj);
            }
        });
        com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter multipleItemQuickAdapter6 = this.healthyAdapter;
        if (multipleItemQuickAdapter6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("healthyAdapter");
        } else {
            multipleItemQuickAdapter = multipleItemQuickAdapter6;
        }
        multipleItemQuickAdapter.setOnItemClickListener(new com.chad.library.adapter.base.listener.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda6
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1039loadDataOnce$lambda16(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this, baseQuickAdapter, view, i);
            }
        });
        observe();
        getViewModel().syncTodayStepNotification();
        try {
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                startSyncData();
            }
        } catch (java.lang.Exception unused) {
        }
        this.handler.postDelayed(this.tenSecondsRefreshRunnable, 0L);
        com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel deviceViewModel = getDeviceViewModel();
        deviceViewModel.init();
        deviceViewModel.getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda2
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1040loadDataOnce$lambda18$lambda17(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this, (com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DeviceFragmentUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-5, reason: not valid java name */
    public static final void m1041loadDataOnce$lambda5(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment2 = healthyFragment;
        android.content.Context activity = healthyFragment2.getActivity();
        if (activity != null) {
            java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideOneActivity.class);
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
            healthyFragment2.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-6, reason: not valid java name */
    public static final void m1042loadDataOnce$lambda6(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        if (com.qcwireless.qcwatch.ui.base.util.LocationUtils.isGPSEnable(healthyFragment.getActivity())) {
            if (kotlin.text.StringsKt.equals(android.os.Build.BRAND, "oppo", true)) {
                if (com.qcwireless.qcwatch.base.utils.AndroidVersion.isAndroid12()) {
                    com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment2 = healthyFragment;
                    android.content.Context activity = healthyFragment2.getActivity();
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
                        healthyFragment2.startActivity(intent);
                        return;
                    }
                    return;
                }
                com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestLocationPermission(healthyFragment.getActivity(), healthyFragment.new ScanLocationPermissionCallback());
                return;
            }
            com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestLocationPermission(healthyFragment.getActivity(), healthyFragment.new ScanLocationPermissionCallback());
            return;
        }
        java.lang.String string = healthyFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_291);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_291)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        healthyFragment.startActivity(new android.content.Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-8, reason: not valid java name */
    public static final void m1043loadDataOnce$lambda8(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, int i, android.widget.TextView textView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        if (kotlin.text.StringsKt.equals(healthyFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_452), textView.getText().toString(), false)) {
            if (!healthyFragment.isNotificationListenerEnabled()) {
                healthyFragment.showNotificationDialog();
                return;
            }
            com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment2 = healthyFragment;
            android.content.Context activity = healthyFragment2.getActivity();
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
                healthyFragment2.startActivity(intent);
                return;
            }
            return;
        }
        if (kotlin.text.StringsKt.equals(healthyFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_451), textView.getText().toString(), false)) {
            com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestCallPhonePermission(healthyFragment.getActivity(), new com.hjq.permissions.OnPermissionCallback() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda7
                @Override // com.hjq.permissions.OnPermissionCallback
                public /* synthetic */ void onDenied(java.util.List list, boolean z) {
                    com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, list, z);
                }

                @Override // com.hjq.permissions.OnPermissionCallback
                public final void onGranted(java.util.List list, boolean z) {
                    com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1044loadDataOnce$lambda8$lambda7(list, z);
                }
            });
            return;
        }
        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment3 = healthyFragment;
        android.content.Context activity2 = healthyFragment3.getActivity();
        if (activity2 != null) {
            java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity2, "it");
            android.content.Intent intent2 = new android.content.Intent(activity2, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideOneActivity.class);
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
            healthyFragment3.startActivity(intent2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-8$lambda-7, reason: not valid java name */
    public static final void m1044loadDataOnce$lambda8$lambda7(java.util.List list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
        if (z) {
            kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$loadDataOnce$3$1$1(null), 3, (java.lang.Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-9, reason: not valid java name */
    public static final void m1045loadDataOnce$lambda9(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment2 = healthyFragment;
        android.content.Context activity = healthyFragment2.getActivity();
        if (activity != null) {
            java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.step.StepActivity.class);
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
            healthyFragment2.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-10, reason: not valid java name */
    public static final void m1035loadDataOnce$lambda10(android.view.View view) {
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            return;
        }
        com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().reSetLastConnectTime(0);
        com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUpNotWait();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-11, reason: not valid java name */
    public static final void m1036loadDataOnce$lambda11(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        com.qcwireless.qcwatch.ui.home.drag.DragSelectActivity.INSTANCE.start(healthyFragment.getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-13$lambda-12, reason: not valid java name */
    public static final void m1037loadDataOnce$lambda13$lambda12(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, com.qcwireless.qcwatch.databinding.FragmentHealthyBinding fragmentHealthyBinding, com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentHealthyBinding, "$this_run");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshLayout, "it");
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            java.lang.String string = healthyFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            fragmentHealthyBinding.syncRefresh.finishRefresh(false);
            return;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "下拉刷新,开始同步数据...");
        healthyFragment.getViewModel().syncWatchData();
        com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().setSync(true);
        healthyFragment.handler.removeCallbacks(healthyFragment.myRunnable);
        healthyFragment.handler.postDelayed(healthyFragment.myRunnable, 13000L);
        com.oudmon.ble.base.util.LogToFile.getInstance().wtf("开始同步所有数据");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-15, reason: not valid java name */
    public static final void m1038loadDataOnce$lambda15(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, com.qcwireless.qcwatch.ui.home.healthy.bean.MeasureBean measureBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        measureBean.getStart();
        if (measureBean.getType() == 3) {
            if (healthyFragment.sportRunning) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("sportType", healthyFragment.sportType);
                bundle.putInt("sportStatus", healthyFragment.sportStatus);
                bundle.putInt(com.google.android.gms.fitness.FitnessActivities.RUNNING, -1);
                healthyFragment.sportRunning = false;
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment2 = healthyFragment;
                android.content.Context activity = healthyFragment2.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.class);
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
                    healthyFragment2.startActivity(intent);
                    return;
                }
                return;
            }
            healthyFragment.sportRunning = false;
            com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment3 = healthyFragment;
            android.content.Context activity2 = healthyFragment3.getActivity();
            if (activity2 != null) {
                java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity2, "it");
                android.content.Intent intent2 = new android.content.Intent(activity2, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.sport.SportGoActivity.class);
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
                healthyFragment3.startActivity(intent2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-16, reason: not valid java name */
    public static final void m1039loadDataOnce$lambda16(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment2;
        android.content.Context activity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "<anonymous parameter 0>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        int itemType = healthyFragment.getViewModel().getItemList().get(i).getItemType();
        if (itemType == 1) {
            com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment3 = healthyFragment;
            android.content.Context activity2 = healthyFragment3.getActivity();
            if (activity2 != null) {
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity2, "it");
                android.content.Intent intent = new android.content.Intent(activity2, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.sleep.SleepActivity.class);
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
                healthyFragment3.startActivity(intent);
                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                return;
            }
            return;
        }
        if (itemType == 2) {
            com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment4 = healthyFragment;
            android.content.Context activity3 = healthyFragment4.getActivity();
            if (activity3 != null) {
                java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity3, "it");
                android.content.Intent intent2 = new android.content.Intent(activity3, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.heart.HeartActivity.class);
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
                healthyFragment4.startActivity(intent2);
                kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit12 = kotlin.Unit.INSTANCE;
                return;
            }
            return;
        }
        if (itemType == 3) {
            com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment5 = healthyFragment;
            android.content.Context activity4 = healthyFragment5.getActivity();
            if (activity4 != null) {
                java.util.ArrayList<kotlin.Pair> arrayList3 = new java.util.ArrayList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity4, "it");
                android.content.Intent intent3 = new android.content.Intent(activity4, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.sport.SportActivity.class);
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
                healthyFragment5.startActivity(intent3);
                kotlin.Unit unit17 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit18 = kotlin.Unit.INSTANCE;
                return;
            }
            return;
        }
        if (itemType == 4) {
            com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment6 = healthyFragment;
            android.content.Context activity5 = healthyFragment6.getActivity();
            if (activity5 != null) {
                java.util.ArrayList<kotlin.Pair> arrayList4 = new java.util.ArrayList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity5, "it");
                android.content.Intent intent4 = new android.content.Intent(activity5, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.class);
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
                healthyFragment6.startActivity(intent4);
                kotlin.Unit unit23 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit24 = kotlin.Unit.INSTANCE;
                return;
            }
            return;
        }
        if (itemType != 11) {
            if (itemType == 12 && (activity = (healthyFragment2 = healthyFragment).getActivity()) != null) {
                java.util.ArrayList<kotlin.Pair> arrayList5 = new java.util.ArrayList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                android.content.Intent intent5 = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.class);
                for (kotlin.Pair pair5 : arrayList5) {
                    if (pair5 != null) {
                        java.lang.String str5 = (java.lang.String) pair5.getFirst();
                        java.lang.Object second5 = pair5.getSecond();
                        if (second5 instanceof java.lang.Integer) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, ((java.lang.Number) second5).intValue()), "putExtra(name, value)");
                        } else if (second5 instanceof java.lang.Byte) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, ((java.lang.Number) second5).byteValue()), "putExtra(name, value)");
                        } else if (second5 instanceof java.lang.Character) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, ((java.lang.Character) second5).charValue()), "putExtra(name, value)");
                        } else if (second5 instanceof java.lang.Short) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, ((java.lang.Number) second5).shortValue()), "putExtra(name, value)");
                        } else if (second5 instanceof java.lang.Boolean) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, ((java.lang.Boolean) second5).booleanValue()), "putExtra(name, value)");
                        } else if (second5 instanceof java.lang.Long) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, ((java.lang.Number) second5).longValue()), "putExtra(name, value)");
                        } else if (second5 instanceof java.lang.Float) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, ((java.lang.Number) second5).floatValue()), "putExtra(name, value)");
                        } else if (second5 instanceof java.lang.Double) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, ((java.lang.Number) second5).doubleValue()), "putExtra(name, value)");
                        } else if (second5 instanceof java.lang.String) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, (java.lang.String) second5), "putExtra(name, value)");
                        } else if (second5 instanceof java.lang.CharSequence) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, (java.lang.CharSequence) second5), "putExtra(name, value)");
                        } else if (second5 instanceof android.os.Parcelable) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, (android.os.Parcelable) second5), "putExtra(name, value)");
                        } else if (second5 instanceof java.lang.Object[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, (java.io.Serializable) second5), "putExtra(name, value)");
                        } else if (second5 instanceof java.util.ArrayList) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, (java.io.Serializable) second5), "putExtra(name, value)");
                        } else if (second5 instanceof java.io.Serializable) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, (java.io.Serializable) second5), "putExtra(name, value)");
                        } else if (second5 instanceof boolean[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, (boolean[]) second5), "putExtra(name, value)");
                        } else if (second5 instanceof byte[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, (byte[]) second5), "putExtra(name, value)");
                        } else if (second5 instanceof short[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, (short[]) second5), "putExtra(name, value)");
                        } else if (second5 instanceof char[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, (char[]) second5), "putExtra(name, value)");
                        } else if (second5 instanceof int[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, (int[]) second5), "putExtra(name, value)");
                        } else if (second5 instanceof long[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, (long[]) second5), "putExtra(name, value)");
                        } else if (second5 instanceof float[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, (float[]) second5), "putExtra(name, value)");
                        } else if (second5 instanceof double[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, (double[]) second5), "putExtra(name, value)");
                        } else if (second5 instanceof android.os.Bundle) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, (android.os.Bundle) second5), "putExtra(name, value)");
                        } else if (second5 instanceof android.content.Intent) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5.putExtra(str5, (android.os.Parcelable) second5), "putExtra(name, value)");
                        } else {
                            kotlin.Unit unit25 = kotlin.Unit.INSTANCE;
                        }
                    }
                }
                kotlin.Unit unit26 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit27 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit28 = kotlin.Unit.INSTANCE;
                healthyFragment2.startActivity(intent5);
                kotlin.Unit unit29 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit30 = kotlin.Unit.INSTANCE;
                return;
            }
            return;
        }
        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment7 = healthyFragment;
        android.content.Context activity6 = healthyFragment7.getActivity();
        if (activity6 != null) {
            java.util.ArrayList<kotlin.Pair> arrayList6 = new java.util.ArrayList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity6, "it");
            android.content.Intent intent6 = new android.content.Intent(activity6, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.pressure.RingPressureActivity.class);
            for (kotlin.Pair pair6 : arrayList6) {
                if (pair6 != null) {
                    java.lang.String str6 = (java.lang.String) pair6.getFirst();
                    java.lang.Object second6 = pair6.getSecond();
                    if (second6 instanceof java.lang.Integer) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, ((java.lang.Number) second6).intValue()), "putExtra(name, value)");
                    } else if (second6 instanceof java.lang.Byte) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, ((java.lang.Number) second6).byteValue()), "putExtra(name, value)");
                    } else if (second6 instanceof java.lang.Character) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, ((java.lang.Character) second6).charValue()), "putExtra(name, value)");
                    } else if (second6 instanceof java.lang.Short) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, ((java.lang.Number) second6).shortValue()), "putExtra(name, value)");
                    } else if (second6 instanceof java.lang.Boolean) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, ((java.lang.Boolean) second6).booleanValue()), "putExtra(name, value)");
                    } else if (second6 instanceof java.lang.Long) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, ((java.lang.Number) second6).longValue()), "putExtra(name, value)");
                    } else if (second6 instanceof java.lang.Float) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, ((java.lang.Number) second6).floatValue()), "putExtra(name, value)");
                    } else if (second6 instanceof java.lang.Double) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, ((java.lang.Number) second6).doubleValue()), "putExtra(name, value)");
                    } else if (second6 instanceof java.lang.String) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, (java.lang.String) second6), "putExtra(name, value)");
                    } else if (second6 instanceof java.lang.CharSequence) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, (java.lang.CharSequence) second6), "putExtra(name, value)");
                    } else if (second6 instanceof android.os.Parcelable) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, (android.os.Parcelable) second6), "putExtra(name, value)");
                    } else if (second6 instanceof java.lang.Object[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, (java.io.Serializable) second6), "putExtra(name, value)");
                    } else if (second6 instanceof java.util.ArrayList) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, (java.io.Serializable) second6), "putExtra(name, value)");
                    } else if (second6 instanceof java.io.Serializable) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, (java.io.Serializable) second6), "putExtra(name, value)");
                    } else if (second6 instanceof boolean[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, (boolean[]) second6), "putExtra(name, value)");
                    } else if (second6 instanceof byte[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, (byte[]) second6), "putExtra(name, value)");
                    } else if (second6 instanceof short[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, (short[]) second6), "putExtra(name, value)");
                    } else if (second6 instanceof char[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, (char[]) second6), "putExtra(name, value)");
                    } else if (second6 instanceof int[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, (int[]) second6), "putExtra(name, value)");
                    } else if (second6 instanceof long[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, (long[]) second6), "putExtra(name, value)");
                    } else if (second6 instanceof float[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, (float[]) second6), "putExtra(name, value)");
                    } else if (second6 instanceof double[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, (double[]) second6), "putExtra(name, value)");
                    } else if (second6 instanceof android.os.Bundle) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, (android.os.Bundle) second6), "putExtra(name, value)");
                    } else if (second6 instanceof android.content.Intent) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6.putExtra(str6, (android.os.Parcelable) second6), "putExtra(name, value)");
                    } else {
                        kotlin.Unit unit31 = kotlin.Unit.INSTANCE;
                    }
                }
            }
            kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit33 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit34 = kotlin.Unit.INSTANCE;
            healthyFragment7.startActivity(intent6);
            kotlin.Unit unit35 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit36 = kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-18$lambda-17, reason: not valid java name */
    public static final void m1040loadDataOnce$lambda18$lambda17(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DeviceFragmentUI deviceFragmentUI) {
        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment2;
        android.content.Context activity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        if (deviceFragmentUI.getRefreshType() == 2) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, deviceFragmentUI);
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected() && deviceFragmentUI.getDfuType() == 2 && (activity = (healthyFragment2 = healthyFragment).getActivity()) != null) {
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
                healthyFragment2.startActivity(intent);
            }
        }
    }

    private final void startSyncData() {
        com.qcwireless.qcwatch.databinding.FragmentHealthyBinding fragmentHealthyBinding = null;
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        com.qcwireless.qcwatch.databinding.FragmentHealthyBinding fragmentHealthyBinding2 = this.binding;
        if (fragmentHealthyBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentHealthyBinding = fragmentHealthyBinding2;
        }
        if (fragmentHealthyBinding.syncRefresh.isRefreshing()) {
            return;
        }
        com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().setSync(true);
        fragmentHealthyBinding.syncRefresh.autoRefresh();
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        boolean z = messageEvent instanceof com.qcwireless.qcwatch.base.event.RefreshEvent;
        if (z && !kotlin.jvm.internal.Intrinsics.areEqual(getClass(), ((com.qcwireless.qcwatch.base.event.RefreshEvent) messageEvent).getActivityClass())) {
            this.handler.removeCallbacks(this.tenSecondsRefreshRunnable);
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = null;
        if (z && kotlin.jvm.internal.Intrinsics.areEqual(getClass(), ((com.qcwireless.qcwatch.base.event.RefreshEvent) messageEvent).getActivityClass())) {
            this.handler.removeCallbacks(this.tenSecondsRefreshRunnable);
            this.handler.postDelayed(this.tenSecondsRefreshRunnable, 10000L);
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                android.widget.ImageView imageView = this.bleStatus;
                if (imageView == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bleStatus");
                    imageView = null;
                }
                imageView.setImageResource(com.qcwireless.qcwatch.R.mipmap.ble_connect);
                healthyModule();
            } else {
                android.widget.ImageView imageView2 = this.bleStatus;
                if (imageView2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bleStatus");
                    imageView2 = null;
                }
                imageView2.setImageResource(com.qcwireless.qcwatch.R.mipmap.ble_disconnect);
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastSyncTodaySteps(0L);
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            }
            try {
                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceName().length() == 0) {
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.noBinding;
                    if (constraintLayout2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("noBinding");
                        constraintLayout2 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible((android.view.View) constraintLayout2);
                } else {
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = this.noBinding;
                    if (constraintLayout3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("noBinding");
                        constraintLayout3 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) constraintLayout3);
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.DeviceUnitEvent ? true : messageEvent instanceof com.qcwireless.qcwatch.ui.base.bean.event.HealthItemRefreshEvent) {
            getViewModel().queryNotificationHealthData();
            healthyModule();
            return;
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.BatteryLowEvent) {
            try {
                java.lang.String battery = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getBattery();
                if (battery != null) {
                    int parseInt = java.lang.Integer.parseInt(battery);
                    if (1 <= parseInt && parseInt < 10) {
                        r6 = true;
                    }
                    if (!r6 || com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getBatteryLow()) {
                        return;
                    }
                    showRingBatteryLowDialog();
                    return;
                }
                return;
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.FinishFirstSettingEvent) {
            try {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = this.barChart;
                if (constraintLayout4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("barChart");
                } else {
                    constraintLayout = constraintLayout4;
                }
                constraintLayout.setRefresh(true);
            } catch (java.lang.Exception e3) {
                e3.printStackTrace();
            }
            getViewModel().queryNotificationHealthData();
            healthyModule();
            return;
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothSyncEvent) {
            startSyncData();
            return;
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) {
            if (!((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect()) {
                com.oudmon.ble.base.communication.file.FileHandle.getInstance().clearCallback();
                com.qcwireless.qcwatch.databinding.FragmentHealthyBinding fragmentHealthyBinding = this.binding;
                if (fragmentHealthyBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentHealthyBinding = null;
                }
                fragmentHealthyBinding.syncRefresh.finishRefresh();
                android.widget.ImageView imageView3 = this.bleStatus;
                if (imageView3 != null) {
                    if (imageView3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bleStatus");
                        imageView3 = null;
                    }
                    imageView3.setImageResource(com.qcwireless.qcwatch.R.mipmap.ble_disconnect);
                    com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastSyncTodaySteps(0L);
                    com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                }
                try {
                    if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress().length() == 0) {
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout5 = this.noBinding;
                        if (constraintLayout5 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("noBinding");
                        } else {
                            constraintLayout = constraintLayout5;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible((android.view.View) constraintLayout);
                        return;
                    }
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout6 = this.noBinding;
                    if (constraintLayout6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("noBinding");
                    } else {
                        constraintLayout = constraintLayout6;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) constraintLayout);
                    return;
                } catch (java.lang.Exception e4) {
                    e4.printStackTrace();
                    return;
                }
            }
            try {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout7 = this.noBinding;
                if (constraintLayout7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("noBinding");
                    constraintLayout7 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) constraintLayout7);
            } catch (java.lang.Exception e5) {
                e5.printStackTrace();
            }
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout8 = this.bleStatus;
            if (constraintLayout8 != null) {
                if (constraintLayout8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bleStatus");
                } else {
                    constraintLayout = constraintLayout8;
                }
                constraintLayout.setImageResource(com.qcwireless.qcwatch.R.mipmap.ble_connect);
                return;
            }
            return;
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent ? true : messageEvent instanceof com.qcwireless.qcwatch.base.event.TodayDataSyncEvent) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---ManualRefreshEvent");
            healthyModule();
            return;
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.WatchFaceDownloadEvent) {
            if (!com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLoginStatus()) {
                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUserToken().length() == 0) {
                    getViewModel().getTokenNotLogin();
                }
            }
            getViewModel().checkWatchFaceDownload(((com.qcwireless.qcwatch.base.event.WatchFaceDownloadEvent) messageEvent).getHardwareVersion());
            return;
        }
        try {
            if (messageEvent instanceof com.qcwireless.qcwatch.base.event.DeviceSyncTodayStepsEvent) {
                if (getActivity() instanceof com.qcwireless.qcwatch.ui.activity.MainActivity) {
                    getViewModel().syncTodayStepNotification();
                    return;
                } else if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLastSyncTodaySteps() < new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp()) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "三分钟限制");
                    return;
                } else {
                    getViewModel().syncTodayStepNotification();
                    return;
                }
            }
            if (messageEvent instanceof com.qcwireless.qcwatch.base.event.DeviceSyncTodayStepsAndDetailEvent) {
                getViewModel().queryStepAndDetail();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* compiled from: HealthyFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment$TenSecondsRefreshRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class TenSecondsRefreshRunnable implements java.lang.Runnable {
        public TenSecondsRefreshRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.isVisible() && com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---10秒同步--");
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.handler.postDelayed(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.tenSecondsRefreshRunnable, 10000L);
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.tenSecondsRefresh();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tenSecondsRefresh() {
        try {
            getViewModel().syncTodayStepNotification();
        } catch (java.lang.Exception unused) {
        }
    }

    private final void healthyModule() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$healthyModule$1(this, null), 3, (java.lang.Object) null);
    }

    /* compiled from: HealthyFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment$MyRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyRunnable implements java.lang.Runnable {
        public MyRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().setSync(false);
            com.qcwireless.qcwatch.databinding.FragmentHealthyBinding fragmentHealthyBinding = com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.binding;
            com.qcwireless.qcwatch.databinding.FragmentHealthyBinding fragmentHealthyBinding2 = null;
            if (fragmentHealthyBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentHealthyBinding = null;
            }
            if (fragmentHealthyBinding.syncRefresh.isRefreshing()) {
                com.qcwireless.qcwatch.databinding.FragmentHealthyBinding fragmentHealthyBinding3 = com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.binding;
                if (fragmentHealthyBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentHealthyBinding2 = fragmentHealthyBinding3;
                }
                fragmentHealthyBinding2.syncRefresh.finishRefresh();
            }
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion().length() > 0) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.getDeviceViewModel().checkOta();
            }
        }
    }

    /* compiled from: HealthyFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment();
        }
    }

    /* compiled from: HealthyFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment$LocationPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class LocationPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public LocationPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            if (!all) {
                java.lang.String string = com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_269);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_269)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                return;
            }
            com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment = com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this;
            android.content.Context activity = healthyFragment.getActivity();
            if (activity != null) {
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.gps.GpsActivity.class);
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
                healthyFragment.startActivity(intent);
            }
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            if (never) {
                com.hjq.permissions.XXPermissions.startPermissionActivity(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.getActivity(), permissions);
            }
        }
    }

    /* compiled from: HealthyFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment$ScanLocationPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class ScanLocationPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public ScanLocationPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getLocationOnce(com.qcwireless.qcwatch.QCApplication.INSTANCE.getApplication());
            com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment = com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this;
            android.content.Context activity = healthyFragment.getActivity();
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
                healthyFragment.startActivity(intent);
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
                    com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.showPermissionWarmingDialog(permissions);
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
        }
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
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1052showPermissionWarmingDialog$lambda20(com.qcwireless.qcwatch.base.dialog.BottomDialog.this, this, permissions, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1053showPermissionWarmingDialog$lambda21(com.qcwireless.qcwatch.base.dialog.BottomDialog.this, this, permissions, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPermissionWarmingDialog$lambda-20, reason: not valid java name */
    public static final void m1052showPermissionWarmingDialog$lambda20(com.qcwireless.qcwatch.base.dialog.BottomDialog bottomDialog, com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, java.util.List list, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "$permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNull(bottomDialog);
        bottomDialog.dismiss();
        com.hjq.permissions.XXPermissions.startPermissionActivity(healthyFragment.getActivity(), (java.util.List<java.lang.String>) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPermissionWarmingDialog$lambda-21, reason: not valid java name */
    public static final void m1053showPermissionWarmingDialog$lambda21(com.qcwireless.qcwatch.base.dialog.BottomDialog bottomDialog, com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, java.util.List list, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "$permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNull(bottomDialog);
        bottomDialog.dismiss();
        com.hjq.permissions.XXPermissions.startPermissionActivity(healthyFragment.getActivity(), (java.util.List<java.lang.String>) list);
    }

    private final void showLocationWarningDialog() {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_location_warning);
        objectRef.element = builder.create();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).show();
        android.view.View contentView = ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda19
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1049showLocationWarningDialog$lambda22(objectRef, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda18
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1050showLocationWarningDialog$lambda23(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this, objectRef, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLocationWarningDialog$lambda-22, reason: not valid java name */
    public static final void m1049showLocationWarningDialog$lambda22(kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLocationWarningDialog$lambda-23, reason: not valid java name */
    public static final void m1050showLocationWarningDialog$lambda23(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        if (kotlin.text.StringsKt.equals(android.os.Build.BRAND, "oppo", true)) {
            if (!com.qcwireless.qcwatch.base.utils.AndroidVersion.isAndroid12()) {
                com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestLocationPermission(healthyFragment.getActivity(), healthyFragment.new LocationPermissionCallback());
            }
        } else {
            com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestLocationPermission(healthyFragment.getActivity(), healthyFragment.new LocationPermissionCallback());
        }
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    private final boolean checkPermission() {
        if (android.os.Build.VERSION.SDK_INT < 23) {
            return false;
        }
        java.lang.Object systemService = getActivity().getSystemService("power");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((android.os.PowerManager) systemService).isIgnoringBatteryOptimizations(getActivity().getPackageName());
    }

    private final void showNotificationDialog() {
        com.qcwireless.qcwatch.base.dialog.CenterDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.CenterDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_notification);
        final com.qcwireless.qcwatch.base.dialog.CenterDialog create = builder.create();
        create.show();
        android.view.View contentView = create.getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        ((android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_confirm)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1051showNotificationDialog$lambda24(com.qcwireless.qcwatch.base.dialog.CenterDialog.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showNotificationDialog$lambda-24, reason: not valid java name */
    public static final void m1051showNotificationDialog$lambda24(com.qcwireless.qcwatch.base.dialog.CenterDialog centerDialog, com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        centerDialog.dismiss();
        try {
            healthyFragment.startActivityForResult(new android.content.Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"), 100);
        } catch (android.content.ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    private final boolean isNotificationListenerEnabled() {
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
        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment;
        android.content.Context activity;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && isNotificationListenerEnabled() && (activity = (healthyFragment = this).getActivity()) != null) {
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
            healthyFragment.startActivity(intent);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().removeOutDeviceListener(100);
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deviceNotification(int step, int distance, int calorie) {
        android.widget.TextView textView = this.todayStep;
        android.widget.TextView textView2 = null;
        if (textView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayStep");
            textView = null;
        }
        textView.setText(java.lang.String.valueOf(step));
        try {
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
                java.lang.String valueOf = java.lang.String.valueOf(new java.math.BigDecimal(java.lang.String.valueOf((distance * 1.0f) / 1000)).setScale(2, java.math.RoundingMode.HALF_UP));
                android.widget.TextView textView3 = this.todayDistance;
                if (textView3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayDistance");
                    textView3 = null;
                }
                textView3.setText(valueOf);
                android.widget.TextView textView4 = this.todayDistanceUnit;
                if (textView4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayDistanceUnit");
                    textView4 = null;
                }
                textView4.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_88));
            } else {
                java.lang.String valueOf2 = java.lang.String.valueOf(new java.math.BigDecimal(java.lang.String.valueOf(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kmToIn((distance * 1.0f) / 1000))).setScale(2, java.math.RoundingMode.HALF_UP));
                android.widget.TextView textView5 = this.todayDistance;
                if (textView5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayDistance");
                    textView5 = null;
                }
                textView5.setText(valueOf2);
                android.widget.TextView textView6 = this.todayDistanceUnit;
                if (textView6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayDistanceUnit");
                    textView6 = null;
                }
                textView6.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_358));
            }
        } catch (java.lang.Exception unused) {
        }
        android.widget.TextView textView7 = this.todayCalorie;
        if (textView7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("todayCalorie");
        } else {
            textView2 = textView7;
        }
        textView2.setText(java.lang.String.valueOf(calorie / 1000));
        com.qcwireless.qcwatch.base.pref.PreUtil.putInt(com.qcwireless.qcwatch.base.pref.PreUtil.Action_Today_Steps, step);
        new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
    }

    /* compiled from: HealthyFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment$MyDeviceNotifyListener;", "Lcom/oudmon/ble/base/communication/responseImpl/DeviceNotifyListener;", "(Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment;)V", "onDataResponse", "", "resultEntity", "Lcom/oudmon/ble/base/communication/rsp/DeviceNotifyRsp;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyDeviceNotifyListener extends com.oudmon.ble.base.communication.responseImpl.DeviceNotifyListener {
        public MyDeviceNotifyListener() {
        }

        @Override // com.oudmon.ble.base.communication.responseImpl.DeviceNotifyListener, com.oudmon.ble.base.communication.ICommandResponse
        public void onDataResponse(com.oudmon.ble.base.communication.rsp.DeviceNotifyRsp resultEntity) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(resultEntity);
            if (resultEntity.getStatus() == 0) {
                if (com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().getSync() || com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().getSyncSportPlus() || com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() == 1 || com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() == 2 || com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() == 3) {
                    com.oudmon.ble.base.util.LogToFile.getInstance().wtf("设备刷新返回，没有同步");
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "正在数据同步或者固件升级...");
                }
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "设备触发刷新，数据类型:" + resultEntity.getDataType());
                com.oudmon.ble.base.util.LogToFile.getInstance().wtf("设备触发刷新，数据类型:" + resultEntity.getDataType());
                com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().removeOthersListener();
                switch (resultEntity.getDataType()) {
                    case 1:
                        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.getViewModel().syncTodayHeartSingleData();
                        break;
                    case 2:
                        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.getViewModel().syncBpSingle();
                        break;
                    case 3:
                        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.getViewModel().syncTodaySpo2Single(0);
                        break;
                    case 4:
                        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.getViewModel().syncTodayStepDetailSingle();
                        break;
                    case 5:
                        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.getViewModel().syncTodayTemperatureSingle();
                        break;
                    case 7:
                        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.sportRunning = false;
                        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.sportType = 0;
                        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.sportStatus = 0;
                        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.getViewModel().syncTodaySportPlusDetailSingle();
                        break;
                    case 9:
                    case 11:
                        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.DeviceToAppSyncEvent(resultEntity.getDataType()));
                        break;
                    case 12:
                        try {
                            com.oudmon.ble.base.communication.CommandHandle commandHandle = com.oudmon.ble.base.communication.CommandHandle.getInstance();
                            com.oudmon.ble.base.communication.req.SimpleKeyReq simpleKeyReq = new com.oudmon.ble.base.communication.req.SimpleKeyReq((byte) 3);
                            final com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment = com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this;
                            commandHandle.executeReqCmd(simpleKeyReq, new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$MyDeviceNotifyListener$$ExternalSyntheticLambda1
                                @Override // com.oudmon.ble.base.communication.ICommandResponse
                                public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                                    com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.MyDeviceNotifyListener.m1058onDataResponse$lambda0(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this, (com.oudmon.ble.base.communication.rsp.BatteryRsp) baseRspCmd);
                                }
                            });
                            break;
                        } catch (java.lang.Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    case 13:
                        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.getViewModel().syncTodayBloodSugar(0);
                        break;
                    case 16:
                        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.TargetSettingReq.getReadInstance(), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$MyDeviceNotifyListener$$ExternalSyntheticLambda0
                            @Override // com.oudmon.ble.base.communication.ICommandResponse
                            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.MyDeviceNotifyListener.m1059onDataResponse$lambda1(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.MyDeviceNotifyListener.this, (com.oudmon.ble.base.communication.rsp.TargetSettingRsp) baseRspCmd);
                            }
                        });
                        break;
                    case 18:
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.oudmon.ble.base.communication.utils.ByteUtil.bytesToString(resultEntity.getLoadData()));
                        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.deviceNotification(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{resultEntity.getLoadData()[1], resultEntity.getLoadData()[2], resultEntity.getLoadData()[3]}), com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{resultEntity.getLoadData()[7], resultEntity.getLoadData()[8], resultEntity.getLoadData()[9]}), com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{resultEntity.getLoadData()[4], resultEntity.getLoadData()[5], resultEntity.getLoadData()[6]}));
                        break;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onDataResponse$lambda-0, reason: not valid java name */
        public static final void m1058onDataResponse$lambda0(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, com.oudmon.ble.base.communication.rsp.BatteryRsp batteryRsp) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setBattery(java.lang.String.valueOf(batteryRsp.getBatteryValue()));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            if (batteryRsp.getBatteryValue() >= 10) {
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setBatteryLow(false);
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            }
            if (!com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getBatteryLow() && batteryRsp.getBatteryValue() < 10) {
                healthyFragment.showRingBatteryLowDialog();
            }
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.FirmUpdateEvent());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onDataResponse$lambda-1, reason: not valid java name */
        public static final void m1059onDataResponse$lambda1(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.MyDeviceNotifyListener myDeviceNotifyListener, final com.oudmon.ble.base.communication.rsp.TargetSettingRsp targetSettingRsp) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myDeviceNotifyListener, "this$0");
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, targetSettingRsp);
            if (targetSettingRsp.getAction() == 1) {
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(myDeviceNotifyListener, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.MyDeviceNotifyListener, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$MyDeviceNotifyListener$onDataResponse$2$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.MyDeviceNotifyListener) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.MyDeviceNotifyListener myDeviceNotifyListener2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myDeviceNotifyListener2, "$this$ktxRunOnBgSingle");
                        if (com.oudmon.ble.base.communication.rsp.TargetSettingRsp.this.getStep() > 0) {
                            com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.INSTANCE.getGetInstance().insertTarget(new com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.oudmon.ble.base.communication.rsp.TargetSettingRsp.this.getStep(), com.oudmon.ble.base.communication.rsp.TargetSettingRsp.this.getCalorie() / 1000.0f, com.oudmon.ble.base.communication.rsp.TargetSettingRsp.this.getDistance() / 1000.0f, 3.0f, 8.0f));
                            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.DeviceNotifyTypeEvent(16));
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRingBatteryLowDialog() {
        com.qcwireless.qcwatch.base.dialog.CenterDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.CenterDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_battery_low);
        com.qcwireless.qcwatch.base.dialog.CenterDialog centerDialog = this.batteryDialog;
        if (centerDialog != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(centerDialog);
            if (centerDialog.isShowing()) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "battery dialog dismiss");
                return;
            }
        }
        com.qcwireless.qcwatch.base.dialog.CenterDialog create = builder.create();
        this.batteryDialog = create;
        kotlin.jvm.internal.Intrinsics.checkNotNull(create);
        create.show();
        com.qcwireless.qcwatch.base.dialog.CenterDialog centerDialog2 = this.batteryDialog;
        kotlin.jvm.internal.Intrinsics.checkNotNull(centerDialog2);
        android.view.View contentView = centerDialog2.getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "batteryDialog!!.contentView");
        ((android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_confirm)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.m1054showRingBatteryLowDialog$lambda25(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showRingBatteryLowDialog$lambda-25, reason: not valid java name */
    public static final void m1054showRingBatteryLowDialog$lambda25(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyFragment, "this$0");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setBatteryLow(true);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        com.qcwireless.qcwatch.base.dialog.CenterDialog centerDialog = healthyFragment.batteryDialog;
        kotlin.jvm.internal.Intrinsics.checkNotNull(centerDialog);
        centerDialog.dismiss();
    }
}
