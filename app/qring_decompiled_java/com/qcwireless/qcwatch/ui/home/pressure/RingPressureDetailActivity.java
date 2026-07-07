package com.qcwireless.qcwatch.ui.home.pressure;

/* compiled from: RingPressureDetailActivity.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/pressure/RingPressureDetailActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/home/pressure/adapter/AppManualPressureDetailAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityRingPressureDetailBinding;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/pressure/day/DayPressureFragmentViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/pressure/day/DayPressureFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "queryManualPressure", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class RingPressureDetailActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.home.pressure.adapter.AppManualPressureDetailAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityRingPressureDetailBinding binding;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public RingPressureDetailActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.pressure.RingPressureDetailActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel m1143invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityRingPressureDetailBinding inflate = com.qcwireless.qcwatch.databinding.ActivityRingPressureDetailBinding.inflate(getLayoutInflater());
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
        com.qcwireless.qcwatch.ui.home.pressure.adapter.AppManualPressureDetailAdapter appManualPressureDetailAdapter = null;
        java.lang.Integer valueOf = extras != null ? java.lang.Integer.valueOf(extras.getInt("timestamp")) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
        long intValue = valueOf.intValue();
        queryManualPressure(new com.qcwireless.qc_utils.date.DateUtil(intValue, true));
        android.content.Context context = (android.content.Context) this;
        com.qcwireless.qcwatch.ui.home.pressure.adapter.AppManualPressureDetailAdapter appManualPressureDetailAdapter2 = new com.qcwireless.qcwatch.ui.home.pressure.adapter.AppManualPressureDetailAdapter(context, getViewModel().getManualList());
        this.adapter = appManualPressureDetailAdapter2;
        appManualPressureDetailAdapter2.setEmptyView(com.qcwireless.qcwatch.R.layout.recycleview_heart_empty);
        com.qcwireless.qcwatch.databinding.ActivityRingPressureDetailBinding activityRingPressureDetailBinding = this.binding;
        if (activityRingPressureDetailBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityRingPressureDetailBinding = null;
        }
        activityRingPressureDetailBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_480));
        activityRingPressureDetailBinding.tvDataDate.setText(new com.qcwireless.qc_utils.date.DateUtil(intValue, true).getY_M_D());
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityRingPressureDetailBinding.titleBar.tvRightText);
        activityRingPressureDetailBinding.rcvHeartRateDetail.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityRingPressureDetailBinding.rcvHeartRateDetail;
        com.qcwireless.qcwatch.ui.home.pressure.adapter.AppManualPressureDetailAdapter appManualPressureDetailAdapter3 = this.adapter;
        if (appManualPressureDetailAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            appManualPressureDetailAdapter = appManualPressureDetailAdapter3;
        }
        recyclerView.setAdapter(appManualPressureDetailAdapter);
    }

    private final void queryManualPressure(final com.qcwireless.qc_utils.date.DateUtil date) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgFix(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.pressure.RingPressureDetailActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.pressure.RingPressureDetailActivity$queryManualPressure$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.pressure.RingPressureDetailActivity) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.pressure.RingPressureDetailActivity ringPressureDetailActivity) {
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel viewModel;
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel viewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ringPressureDetailActivity, "$this$ktxRunOnBgFix");
                java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.PressureManualEntity> queryManualPressureAll = com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.INSTANCE.getGetInstance().queryManualPressureAll(com.qcwireless.qc_utils.date.DateUtil.this);
                viewModel = ringPressureDetailActivity.getViewModel();
                viewModel.getManualList().clear();
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(queryManualPressureAll.size()));
                for (com.qcwireless.qcwatch.ui.base.repository.entity.PressureManualEntity pressureManualEntity : queryManualPressureAll) {
                    viewModel2 = ringPressureDetailActivity.getViewModel();
                    viewModel2.getManualList().add(new com.qcwireless.qcwatch.ui.home.pressure.bean.PressureDetailBean(pressureManualEntity.getTimestamp(), pressureManualEntity.getPressure()));
                }
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(ringPressureDetailActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.pressure.RingPressureDetailActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.pressure.RingPressureDetailActivity$queryManualPressure$1.2
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.pressure.RingPressureDetailActivity) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.pressure.RingPressureDetailActivity ringPressureDetailActivity2) {
                        com.qcwireless.qcwatch.databinding.ActivityRingPressureDetailBinding activityRingPressureDetailBinding;
                        com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel viewModel3;
                        com.qcwireless.qcwatch.databinding.ActivityRingPressureDetailBinding activityRingPressureDetailBinding2;
                        com.qcwireless.qcwatch.ui.home.pressure.adapter.AppManualPressureDetailAdapter appManualPressureDetailAdapter;
                        com.qcwireless.qcwatch.databinding.ActivityRingPressureDetailBinding activityRingPressureDetailBinding3;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ringPressureDetailActivity2, "$this$ktxRunOnUi");
                        activityRingPressureDetailBinding = ringPressureDetailActivity2.binding;
                        com.qcwireless.qcwatch.ui.home.pressure.adapter.AppManualPressureDetailAdapter appManualPressureDetailAdapter2 = null;
                        if (activityRingPressureDetailBinding == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityRingPressureDetailBinding = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityRingPressureDetailBinding.tvErrorText);
                        viewModel3 = ringPressureDetailActivity2.getViewModel();
                        if (viewModel3.getManualList().size() == 0) {
                            activityRingPressureDetailBinding3 = ringPressureDetailActivity2.binding;
                            if (activityRingPressureDetailBinding3 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityRingPressureDetailBinding3 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityRingPressureDetailBinding3.noDataView);
                        } else {
                            activityRingPressureDetailBinding2 = ringPressureDetailActivity2.binding;
                            if (activityRingPressureDetailBinding2 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityRingPressureDetailBinding2 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityRingPressureDetailBinding2.noDataView);
                        }
                        appManualPressureDetailAdapter = ringPressureDetailActivity2.adapter;
                        if (appManualPressureDetailAdapter == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        } else {
                            appManualPressureDetailAdapter2 = appManualPressureDetailAdapter;
                        }
                        appManualPressureDetailAdapter2.notifyDataSetChanged();
                    }
                });
            }
        });
    }
}
