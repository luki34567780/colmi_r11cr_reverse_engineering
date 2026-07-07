package com.qcwireless.qcwatch.ui.home.temperature;

/* compiled from: TemperatureDataDetailActivity.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0010H\u0015J\b\u0010\u0017\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/temperature/TemperatureDataDetailActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/home/temperature/adapter/TemperatureDetailAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityTemperatureDataDetailBinding;", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/temperature/vm/TemperatureViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/temperature/vm/TemperatureViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "setupViews", "startAnim", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class TemperatureDataDetailActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.home.temperature.adapter.TemperatureDetailAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityTemperatureDataDetailBinding binding;
    private com.qcwireless.qc_utils.date.DateUtil date = new com.qcwireless.qc_utils.date.DateUtil();

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public TemperatureDataDetailActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.temperature.TemperatureDataDetailActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel m1240invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel.class), qualifier, qualifier);
            }
        });
    }

    private final com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityTemperatureDataDetailBinding inflate = com.qcwireless.qcwatch.databinding.ActivityTemperatureDataDetailBinding.inflate(getLayoutInflater());
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
        setStatusBarBackground(com.qcwireless.qcwatch.R.color.color_F9F9F9);
        android.os.Bundle extras = getIntent().getExtras();
        com.qcwireless.qcwatch.ui.home.temperature.adapter.TemperatureDetailAdapter temperatureDetailAdapter = null;
        java.lang.Integer valueOf = extras != null ? java.lang.Integer.valueOf(extras.getInt("timestamp")) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
        long intValue = valueOf.intValue();
        this.date = new com.qcwireless.qc_utils.date.DateUtil(intValue, true);
        getViewModel().queryTemperatureByDateDetail(this.date);
        android.content.Context context = (android.content.Context) this;
        com.qcwireless.qcwatch.ui.home.temperature.adapter.TemperatureDetailAdapter temperatureDetailAdapter2 = new com.qcwireless.qcwatch.ui.home.temperature.adapter.TemperatureDetailAdapter(context, getViewModel().getDetailList());
        this.adapter = temperatureDetailAdapter2;
        temperatureDetailAdapter2.setEmptyView(com.qcwireless.qcwatch.R.layout.recycleview_heart_empty);
        com.qcwireless.qcwatch.databinding.ActivityTemperatureDataDetailBinding activityTemperatureDataDetailBinding = this.binding;
        if (activityTemperatureDataDetailBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTemperatureDataDetailBinding = null;
        }
        activityTemperatureDataDetailBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_480));
        activityTemperatureDataDetailBinding.tvDataDate.setText(new com.qcwireless.qc_utils.date.DateUtil(intValue, true).getY_M_D());
        if (this.date.isToday()) {
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityTemperatureDataDetailBinding.titleBar.tvRightText);
            activityTemperatureDataDetailBinding.titleBar.tvRightText.setBackgroundResource(com.qcwireless.qcwatch.R.mipmap.data_detail_refresh);
        } else {
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityTemperatureDataDetailBinding.titleBar.tvRightText);
        }
        activityTemperatureDataDetailBinding.rcvTemperatureDetail.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityTemperatureDataDetailBinding.rcvTemperatureDetail;
        com.qcwireless.qcwatch.ui.home.temperature.adapter.TemperatureDetailAdapter temperatureDetailAdapter3 = this.adapter;
        if (temperatureDetailAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            temperatureDetailAdapter = temperatureDetailAdapter3;
        }
        recyclerView.setAdapter(temperatureDetailAdapter);
        activityTemperatureDataDetailBinding.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.temperature.TemperatureDataDetailActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.temperature.TemperatureDataDetailActivity.m1238setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.home.temperature.TemperatureDataDetailActivity.this, view);
            }
        });
        getViewModel().getUiDetail().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.temperature.TemperatureDataDetailActivity$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.temperature.TemperatureDataDetailActivity.m1239setupViews$lambda2(com.qcwireless.qcwatch.ui.home.temperature.TemperatureDataDetailActivity.this, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1$lambda-0, reason: not valid java name */
    public static final void m1238setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.home.temperature.TemperatureDataDetailActivity temperatureDataDetailActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(temperatureDataDetailActivity, "this$0");
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            java.lang.String string = temperatureDataDetailActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        } else {
            temperatureDataDetailActivity.getViewModel().syncTemperatureSingleCheck();
            temperatureDataDetailActivity.startAnim();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m1239setupViews$lambda2(com.qcwireless.qcwatch.ui.home.temperature.TemperatureDataDetailActivity temperatureDataDetailActivity, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(temperatureDataDetailActivity, "this$0");
        temperatureDataDetailActivity.getViewModel().getDetailList().clear();
        java.util.List<com.qcwireless.qcwatch.ui.home.temperature.bean.TemperatureDetailBean> detailList = temperatureDataDetailActivity.getViewModel().getDetailList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "it");
        detailList.addAll(list);
        com.qcwireless.qcwatch.ui.home.temperature.adapter.TemperatureDetailAdapter temperatureDetailAdapter = null;
        if (temperatureDataDetailActivity.getViewModel().getDetailList().size() == 0) {
            com.qcwireless.qcwatch.databinding.ActivityTemperatureDataDetailBinding activityTemperatureDataDetailBinding = temperatureDataDetailActivity.binding;
            if (activityTemperatureDataDetailBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureDataDetailBinding = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityTemperatureDataDetailBinding.noDataView);
        } else {
            com.qcwireless.qcwatch.databinding.ActivityTemperatureDataDetailBinding activityTemperatureDataDetailBinding2 = temperatureDataDetailActivity.binding;
            if (activityTemperatureDataDetailBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureDataDetailBinding2 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityTemperatureDataDetailBinding2.noDataView);
        }
        com.qcwireless.qcwatch.ui.home.temperature.adapter.TemperatureDetailAdapter temperatureDetailAdapter2 = temperatureDataDetailActivity.adapter;
        if (temperatureDetailAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            temperatureDetailAdapter = temperatureDetailAdapter2;
        }
        temperatureDetailAdapter.notifyDataSetChanged();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if ((messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent) && this.date.isToday()) {
            getViewModel().queryTemperatureByDateDetail(this.date);
        }
    }

    private final void startAnim() {
        com.qcwireless.qcwatch.databinding.ActivityTemperatureDataDetailBinding activityTemperatureDataDetailBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityTemperatureDataDetailBinding activityTemperatureDataDetailBinding2 = null;
        if (activityTemperatureDataDetailBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTemperatureDataDetailBinding = null;
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(activityTemperatureDataDetailBinding.titleBar.tvRightText, "rotation", 0.0f, 360.0f);
        float f = getResources().getDisplayMetrics().density * 10000;
        com.qcwireless.qcwatch.databinding.ActivityTemperatureDataDetailBinding activityTemperatureDataDetailBinding3 = this.binding;
        if (activityTemperatureDataDetailBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityTemperatureDataDetailBinding2 = activityTemperatureDataDetailBinding3;
        }
        activityTemperatureDataDetailBinding2.titleBar.tvRightText.setCameraDistance(f);
        ofFloat.setDuration(1500L);
        ofFloat.start();
    }
}
