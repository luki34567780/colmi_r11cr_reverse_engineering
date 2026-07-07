package com.qcwireless.qcwatch.ui.home.bp;

/* compiled from: BloodPressureDataDetailActivity.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0010H\u0015J\b\u0010\u0017\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bp/BloodPressureDataDetailActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/home/bp/adapter/BloodPressureDetailAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityBloodPressureDataDetailBinding;", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/bp/BloodPressureViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/bp/BloodPressureViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "setupViews", "startAnim", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BloodPressureDataDetailActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.home.bp.adapter.BloodPressureDetailAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityBloodPressureDataDetailBinding binding;
    private com.qcwireless.qc_utils.date.DateUtil date = new com.qcwireless.qc_utils.date.DateUtil();

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public BloodPressureDataDetailActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureDataDetailActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel m958invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.class), qualifier, qualifier);
            }
        });
    }

    private final com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureDataDetailBinding inflate = com.qcwireless.qcwatch.databinding.ActivityBloodPressureDataDetailBinding.inflate(getLayoutInflater());
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
        com.qcwireless.qcwatch.ui.home.bp.adapter.BloodPressureDetailAdapter bloodPressureDetailAdapter = null;
        java.lang.Integer valueOf = extras != null ? java.lang.Integer.valueOf(extras.getInt("timestamp")) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
        final int intValue = valueOf.intValue();
        long j = intValue;
        this.date = new com.qcwireless.qc_utils.date.DateUtil(j, true);
        getViewModel().queryBloodPressureByDateDetail(this.date);
        android.content.Context context = (android.content.Context) this;
        this.adapter = new com.qcwireless.qcwatch.ui.home.bp.adapter.BloodPressureDetailAdapter(context, getViewModel().getDetailList());
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureDataDetailBinding activityBloodPressureDataDetailBinding = this.binding;
        if (activityBloodPressureDataDetailBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodPressureDataDetailBinding = null;
        }
        activityBloodPressureDataDetailBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_480));
        activityBloodPressureDataDetailBinding.tvDataDate.setText(new com.qcwireless.qc_utils.date.DateUtil(j, true).getY_M_D());
        if (this.date.isToday()) {
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityBloodPressureDataDetailBinding.titleBar.tvRightText);
            activityBloodPressureDataDetailBinding.titleBar.tvRightText.setBackgroundResource(com.qcwireless.qcwatch.R.mipmap.data_detail_refresh);
        } else {
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodPressureDataDetailBinding.titleBar.tvRightText);
        }
        activityBloodPressureDataDetailBinding.rcvBloodPressureDetail.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityBloodPressureDataDetailBinding.rcvBloodPressureDetail;
        com.qcwireless.qcwatch.ui.home.bp.adapter.BloodPressureDetailAdapter bloodPressureDetailAdapter2 = this.adapter;
        if (bloodPressureDetailAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            bloodPressureDetailAdapter = bloodPressureDetailAdapter2;
        }
        recyclerView.setAdapter(bloodPressureDetailAdapter);
        activityBloodPressureDataDetailBinding.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureDataDetailActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.bp.BloodPressureDataDetailActivity.m956setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.home.bp.BloodPressureDataDetailActivity.this, view);
            }
        });
        getViewModel().getUiDetail().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureDataDetailActivity$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.bp.BloodPressureDataDetailActivity.m957setupViews$lambda2(com.qcwireless.qcwatch.ui.home.bp.BloodPressureDataDetailActivity.this, intValue, (com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureDetail) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1$lambda-0, reason: not valid java name */
    public static final void m956setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.home.bp.BloodPressureDataDetailActivity bloodPressureDataDetailActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureDataDetailActivity, "this$0");
        bloodPressureDataDetailActivity.startAnim();
        bloodPressureDataDetailActivity.getViewModel().syncBp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m957setupViews$lambda2(com.qcwireless.qcwatch.ui.home.bp.BloodPressureDataDetailActivity bloodPressureDataDetailActivity, int i, com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureDetail bloodPressureDetail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureDataDetailActivity, "this$0");
        bloodPressureDataDetailActivity.getViewModel().getDetailList().clear();
        bloodPressureDataDetailActivity.getViewModel().getDetailList().addAll(bloodPressureDetail.getListData());
        com.qcwireless.qcwatch.ui.home.bp.adapter.BloodPressureDetailAdapter bloodPressureDetailAdapter = null;
        if (bloodPressureDataDetailActivity.getViewModel().getDetailList().size() == 0) {
            com.qcwireless.qcwatch.databinding.ActivityBloodPressureDataDetailBinding activityBloodPressureDataDetailBinding = bloodPressureDataDetailActivity.binding;
            if (activityBloodPressureDataDetailBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodPressureDataDetailBinding = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityBloodPressureDataDetailBinding.noDataView);
            if (new com.qcwireless.qc_utils.date.DateUtil(i, true).isToday()) {
                com.qcwireless.qcwatch.databinding.ActivityBloodPressureDataDetailBinding activityBloodPressureDataDetailBinding2 = bloodPressureDataDetailActivity.binding;
                if (activityBloodPressureDataDetailBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityBloodPressureDataDetailBinding2 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityBloodPressureDataDetailBinding2.tvErrorText);
            } else {
                com.qcwireless.qcwatch.databinding.ActivityBloodPressureDataDetailBinding activityBloodPressureDataDetailBinding3 = bloodPressureDataDetailActivity.binding;
                if (activityBloodPressureDataDetailBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityBloodPressureDataDetailBinding3 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodPressureDataDetailBinding3.tvErrorText);
            }
        } else {
            com.qcwireless.qcwatch.databinding.ActivityBloodPressureDataDetailBinding activityBloodPressureDataDetailBinding4 = bloodPressureDataDetailActivity.binding;
            if (activityBloodPressureDataDetailBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodPressureDataDetailBinding4 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodPressureDataDetailBinding4.noDataView);
        }
        com.qcwireless.qcwatch.ui.home.bp.adapter.BloodPressureDetailAdapter bloodPressureDetailAdapter2 = bloodPressureDataDetailActivity.adapter;
        if (bloodPressureDetailAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            bloodPressureDetailAdapter = bloodPressureDetailAdapter2;
        }
        bloodPressureDetailAdapter.notifyDataSetChanged();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if ((messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent) && this.date.isToday()) {
            getViewModel().queryBloodPressureByDateDetail(this.date);
        }
    }

    private final void startAnim() {
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureDataDetailBinding activityBloodPressureDataDetailBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureDataDetailBinding activityBloodPressureDataDetailBinding2 = null;
        if (activityBloodPressureDataDetailBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodPressureDataDetailBinding = null;
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(activityBloodPressureDataDetailBinding.titleBar.tvRightText, "rotation", 0.0f, 360.0f);
        float f = getResources().getDisplayMetrics().density * 10000;
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureDataDetailBinding activityBloodPressureDataDetailBinding3 = this.binding;
        if (activityBloodPressureDataDetailBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityBloodPressureDataDetailBinding2 = activityBloodPressureDataDetailBinding3;
        }
        activityBloodPressureDataDetailBinding2.titleBar.tvRightText.setCameraDistance(f);
        ofFloat.setDuration(1500L);
        ofFloat.start();
    }
}
