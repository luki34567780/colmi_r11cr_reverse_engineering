package com.qcwireless.qcwatch.ui.home.heart;

/* compiled from: AppHeartDetailActivity.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/heart/AppHeartDetailActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/home/heart/adapter/HeartRateDetailAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityAppHeartDetailBinding;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivityViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class AppHeartDetailActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.home.heart.adapter.HeartRateDetailAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityAppHeartDetailBinding binding;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public AppHeartDetailActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.heart.AppHeartDetailActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel m1089invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.class), qualifier, qualifier);
            }
        });
    }

    private final com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityAppHeartDetailBinding inflate = com.qcwireless.qcwatch.databinding.ActivityAppHeartDetailBinding.inflate(getLayoutInflater());
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
        com.qcwireless.qcwatch.ui.home.heart.adapter.HeartRateDetailAdapter heartRateDetailAdapter = null;
        java.lang.Integer valueOf = extras != null ? java.lang.Integer.valueOf(extras.getInt("timestamp")) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
        final int intValue = valueOf.intValue();
        long j = intValue;
        getViewModel().queryAppHeartRateByDateDetail(new com.qcwireless.qc_utils.date.DateUtil(j, true));
        android.content.Context context = (android.content.Context) this;
        com.qcwireless.qcwatch.ui.home.heart.adapter.HeartRateDetailAdapter heartRateDetailAdapter2 = new com.qcwireless.qcwatch.ui.home.heart.adapter.HeartRateDetailAdapter(context, getViewModel().getDetailList());
        this.adapter = heartRateDetailAdapter2;
        heartRateDetailAdapter2.setEmptyView(com.qcwireless.qcwatch.R.layout.recycleview_heart_empty);
        com.qcwireless.qcwatch.databinding.ActivityAppHeartDetailBinding activityAppHeartDetailBinding = this.binding;
        if (activityAppHeartDetailBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityAppHeartDetailBinding = null;
        }
        activityAppHeartDetailBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_480));
        activityAppHeartDetailBinding.tvDataDate.setText(new com.qcwireless.qc_utils.date.DateUtil(j, true).getY_M_D());
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityAppHeartDetailBinding.titleBar.tvRightText);
        activityAppHeartDetailBinding.rcvHeartRateDetail.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityAppHeartDetailBinding.rcvHeartRateDetail;
        com.qcwireless.qcwatch.ui.home.heart.adapter.HeartRateDetailAdapter heartRateDetailAdapter3 = this.adapter;
        if (heartRateDetailAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            heartRateDetailAdapter = heartRateDetailAdapter3;
        }
        recyclerView.setAdapter(heartRateDetailAdapter);
        getViewModel().getUiDetail().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.heart.AppHeartDetailActivity$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.heart.AppHeartDetailActivity.m1088setupViews$lambda1(com.qcwireless.qcwatch.ui.home.heart.AppHeartDetailActivity.this, intValue, (com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartRateDetail) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m1088setupViews$lambda1(com.qcwireless.qcwatch.ui.home.heart.AppHeartDetailActivity appHeartDetailActivity, int i, com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartRateDetail heartRateDetail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appHeartDetailActivity, "this$0");
        appHeartDetailActivity.getViewModel().getDetailList().clear();
        appHeartDetailActivity.getViewModel().getDetailList().addAll(heartRateDetail.getData());
        com.qcwireless.qcwatch.ui.home.heart.adapter.HeartRateDetailAdapter heartRateDetailAdapter = null;
        if (appHeartDetailActivity.getViewModel().getDetailList().size() == 0) {
            com.qcwireless.qcwatch.databinding.ActivityAppHeartDetailBinding activityAppHeartDetailBinding = appHeartDetailActivity.binding;
            if (activityAppHeartDetailBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityAppHeartDetailBinding = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityAppHeartDetailBinding.noDataView);
            if (new com.qcwireless.qc_utils.date.DateUtil(i, true).isToday()) {
                com.qcwireless.qcwatch.databinding.ActivityAppHeartDetailBinding activityAppHeartDetailBinding2 = appHeartDetailActivity.binding;
                if (activityAppHeartDetailBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityAppHeartDetailBinding2 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityAppHeartDetailBinding2.tvErrorText);
            } else {
                com.qcwireless.qcwatch.databinding.ActivityAppHeartDetailBinding activityAppHeartDetailBinding3 = appHeartDetailActivity.binding;
                if (activityAppHeartDetailBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityAppHeartDetailBinding3 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityAppHeartDetailBinding3.tvErrorText);
            }
        } else {
            com.qcwireless.qcwatch.databinding.ActivityAppHeartDetailBinding activityAppHeartDetailBinding4 = appHeartDetailActivity.binding;
            if (activityAppHeartDetailBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityAppHeartDetailBinding4 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityAppHeartDetailBinding4.noDataView);
        }
        com.qcwireless.qcwatch.ui.home.heart.adapter.HeartRateDetailAdapter heartRateDetailAdapter2 = appHeartDetailActivity.adapter;
        if (heartRateDetailAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            heartRateDetailAdapter = heartRateDetailAdapter2;
        }
        heartRateDetailAdapter.notifyDataSetChanged();
    }
}
