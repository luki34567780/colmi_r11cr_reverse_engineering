package com.qcwireless.qcwatch.ui.home.bloodsugar;

/* compiled from: BloodSugarDataDetailActivity.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\b\u0010\u0018\u001a\u00020\u0012H\u0015J\b\u0010\u0019\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bloodsugar/BloodSugarDataDetailActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/home/bloodsugar/adapter/BloodSugarDetailAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityBloodSugarDataDetailBinding;", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "type", "", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/bloodsugar/BloodSugarActivityViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/bloodsugar/BloodSugarActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "setupViews", "startAnim", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BloodSugarDataDetailActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.home.bloodsugar.adapter.BloodSugarDetailAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityBloodSugarDataDetailBinding binding;
    private com.qcwireless.qc_utils.date.DateUtil date = new com.qcwireless.qc_utils.date.DateUtil();
    private int type;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public BloodSugarDataDetailActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarDataDetailActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel m944invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.class), qualifier, qualifier);
            }
        });
    }

    private final com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarDataDetailBinding inflate = com.qcwireless.qcwatch.databinding.ActivityBloodSugarDataDetailBinding.inflate(getLayoutInflater());
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
        android.os.Bundle extras = getIntent().getExtras();
        com.qcwireless.qcwatch.ui.home.bloodsugar.adapter.BloodSugarDetailAdapter bloodSugarDetailAdapter = null;
        java.lang.Integer valueOf = extras != null ? java.lang.Integer.valueOf(extras.getInt("timestamp")) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
        final int intValue = valueOf.intValue();
        android.os.Bundle extras2 = getIntent().getExtras();
        java.lang.Integer valueOf2 = extras2 != null ? java.lang.Integer.valueOf(extras2.getInt("type")) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf2);
        this.type = valueOf2.intValue();
        long j = intValue;
        this.date = new com.qcwireless.qc_utils.date.DateUtil(j, true);
        android.content.Context context = (android.content.Context) this;
        this.adapter = new com.qcwireless.qcwatch.ui.home.bloodsugar.adapter.BloodSugarDetailAdapter(context, getViewModel().getDetailList());
        if (this.type > 0) {
            getViewModel().queryAppBloodSugarByDateDetail(this.date);
            com.qcwireless.qcwatch.ui.home.bloodsugar.adapter.BloodSugarDetailAdapter bloodSugarDetailAdapter2 = this.adapter;
            if (bloodSugarDetailAdapter2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                bloodSugarDetailAdapter2 = null;
            }
            bloodSugarDetailAdapter2.setApp(true);
        } else {
            getViewModel().queryBloodSugarByDateDetail(this.date);
        }
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarDataDetailBinding activityBloodSugarDataDetailBinding = this.binding;
        if (activityBloodSugarDataDetailBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarDataDetailBinding = null;
        }
        activityBloodSugarDataDetailBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_480));
        activityBloodSugarDataDetailBinding.tvDataDate.setText(new com.qcwireless.qc_utils.date.DateUtil(j, true).getY_M_D());
        if (this.date.isToday()) {
            if (this.type > 0) {
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodSugarDataDetailBinding.titleBar.tvRightText);
                activityBloodSugarDataDetailBinding.titleBar.tvRightText.setBackgroundResource(com.qcwireless.qcwatch.R.mipmap.data_detail_refresh);
            } else {
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityBloodSugarDataDetailBinding.titleBar.tvRightText);
            }
        } else {
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodSugarDataDetailBinding.titleBar.tvRightText);
        }
        activityBloodSugarDataDetailBinding.rcvBloodOxygenDetail.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityBloodSugarDataDetailBinding.rcvBloodOxygenDetail;
        com.qcwireless.qcwatch.ui.home.bloodsugar.adapter.BloodSugarDetailAdapter bloodSugarDetailAdapter3 = this.adapter;
        if (bloodSugarDetailAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            bloodSugarDetailAdapter = bloodSugarDetailAdapter3;
        }
        recyclerView.setAdapter(bloodSugarDetailAdapter);
        activityBloodSugarDataDetailBinding.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarDataDetailActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarDataDetailActivity.m942setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarDataDetailActivity.this, view);
            }
        });
        getViewModel().getUiDetail().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarDataDetailActivity$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarDataDetailActivity.m943setupViews$lambda2(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarDataDetailActivity.this, intValue, (com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarDetail) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1$lambda-0, reason: not valid java name */
    public static final void m942setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarDataDetailActivity bloodSugarDataDetailActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarDataDetailActivity, "this$0");
        bloodSugarDataDetailActivity.startAnim();
        bloodSugarDataDetailActivity.getViewModel().syncTodayData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m943setupViews$lambda2(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarDataDetailActivity bloodSugarDataDetailActivity, int i, com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarDetail bloodSugarDetail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarDataDetailActivity, "this$0");
        bloodSugarDataDetailActivity.getViewModel().getDetailList().clear();
        bloodSugarDataDetailActivity.getViewModel().getDetailList().addAll(bloodSugarDetail.getData());
        com.qcwireless.qcwatch.ui.home.bloodsugar.adapter.BloodSugarDetailAdapter bloodSugarDetailAdapter = null;
        if (bloodSugarDataDetailActivity.getViewModel().getDetailList().size() == 0) {
            com.qcwireless.qcwatch.databinding.ActivityBloodSugarDataDetailBinding activityBloodSugarDataDetailBinding = bloodSugarDataDetailActivity.binding;
            if (activityBloodSugarDataDetailBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodSugarDataDetailBinding = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityBloodSugarDataDetailBinding.noDataView);
            if (new com.qcwireless.qc_utils.date.DateUtil(i, true).isToday()) {
                if (bloodSugarDataDetailActivity.type > 0) {
                    com.qcwireless.qcwatch.databinding.ActivityBloodSugarDataDetailBinding activityBloodSugarDataDetailBinding2 = bloodSugarDataDetailActivity.binding;
                    if (activityBloodSugarDataDetailBinding2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityBloodSugarDataDetailBinding2 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodSugarDataDetailBinding2.tvErrorText);
                } else {
                    com.qcwireless.qcwatch.databinding.ActivityBloodSugarDataDetailBinding activityBloodSugarDataDetailBinding3 = bloodSugarDataDetailActivity.binding;
                    if (activityBloodSugarDataDetailBinding3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityBloodSugarDataDetailBinding3 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(activityBloodSugarDataDetailBinding3.tvErrorText);
                }
            } else {
                com.qcwireless.qcwatch.databinding.ActivityBloodSugarDataDetailBinding activityBloodSugarDataDetailBinding4 = bloodSugarDataDetailActivity.binding;
                if (activityBloodSugarDataDetailBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityBloodSugarDataDetailBinding4 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodSugarDataDetailBinding4.tvErrorText);
            }
        } else {
            com.qcwireless.qcwatch.databinding.ActivityBloodSugarDataDetailBinding activityBloodSugarDataDetailBinding5 = bloodSugarDataDetailActivity.binding;
            if (activityBloodSugarDataDetailBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodSugarDataDetailBinding5 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodSugarDataDetailBinding5.noDataView);
        }
        com.qcwireless.qcwatch.ui.home.bloodsugar.adapter.BloodSugarDetailAdapter bloodSugarDetailAdapter2 = bloodSugarDataDetailActivity.adapter;
        if (bloodSugarDetailAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            bloodSugarDetailAdapter = bloodSugarDetailAdapter2;
        }
        bloodSugarDetailAdapter.notifyDataSetChanged();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if ((messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent) && this.date.isToday()) {
            getViewModel().queryBloodSugarByDateDetail(this.date);
        }
    }

    private final void startAnim() {
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarDataDetailBinding activityBloodSugarDataDetailBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarDataDetailBinding activityBloodSugarDataDetailBinding2 = null;
        if (activityBloodSugarDataDetailBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarDataDetailBinding = null;
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(activityBloodSugarDataDetailBinding.titleBar.tvRightText, "rotation", 0.0f, 360.0f);
        float f = getResources().getDisplayMetrics().density * 10000;
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarDataDetailBinding activityBloodSugarDataDetailBinding3 = this.binding;
        if (activityBloodSugarDataDetailBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityBloodSugarDataDetailBinding2 = activityBloodSugarDataDetailBinding3;
        }
        activityBloodSugarDataDetailBinding2.titleBar.tvRightText.setCameraDistance(f);
        ofFloat.setDuration(1500L);
        ofFloat.start();
    }
}
