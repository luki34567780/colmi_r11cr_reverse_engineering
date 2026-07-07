package com.qcwireless.qcwatch.ui.home.step.month;

/* compiled from: MonthStepFragment.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/step/month/MonthStepFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentMonthStepBinding;", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "df", "Ljava/text/DecimalFormat;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/step/month/MonthStepFragmentViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/step/month/MonthStepFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "loadDataOnce", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MonthStepFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment.Companion(null);
    private com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding binding;
    private com.qcwireless.qc_utils.date.DateUtil date = new com.qcwireless.qc_utils.date.DateUtil();
    private java.text.DecimalFormat df;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public MonthStepFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel m1226invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding inflate = com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
        com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding fragmentMonthStepBinding = this.binding;
        if (fragmentMonthStepBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMonthStepBinding = null;
        }
        return fragmentMonthStepBinding.getRoot();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void loadDataOnce() {
        super.loadDataOnce();
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.00");
        this.df = decimalFormat;
        decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
        com.qcwireless.qc_utils.date.DateUtil firstDayOfMonth = com.qcwireless.qc_utils.date.DateUtil.getFirstDayOfMonth(new com.qcwireless.qc_utils.date.DateUtil());
        com.qcwireless.qc_utils.date.DateUtil lastDayOfMonth = com.qcwireless.qc_utils.date.DateUtil.getLastDayOfMonth(new com.qcwireless.qc_utils.date.DateUtil());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfMonth, "firstDay");
        this.date = firstDayOfMonth;
        com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel viewModel = getViewModel();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lastDayOfMonth, "lastDay");
        viewModel.queryHistoryStepsByDate(firstDayOfMonth, lastDayOfMonth);
        final com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding fragmentMonthStepBinding = this.binding;
        if (fragmentMonthStepBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMonthStepBinding = null;
        }
        fragmentMonthStepBinding.qcDateChange.setMonth(this.date);
        fragmentMonthStepBinding.qcDateChange.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment$loadDataOnce$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView.QDateBefore
            public void clickBefore(boolean r3, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
                com.qcwireless.qc_utils.date.DateUtil dateUtil2;
                com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel viewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
                com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment.this.date = dateUtil;
                com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView qDateMonthSwitchView = fragmentMonthStepBinding.qcDateChange;
                dateUtil2 = com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment.this.date;
                qDateMonthSwitchView.setMonth(dateUtil2);
                com.qcwireless.qc_utils.date.DateUtil firstDayOfMonth2 = com.qcwireless.qc_utils.date.DateUtil.getFirstDayOfMonth(dateUtil);
                com.qcwireless.qc_utils.date.DateUtil lastDayOfMonth2 = com.qcwireless.qc_utils.date.DateUtil.getLastDayOfMonth(dateUtil);
                viewModel2 = com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment.this.getViewModel();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfMonth2, "first");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lastDayOfMonth2, "last");
                viewModel2.queryHistoryStepsByDate(firstDayOfMonth2, lastDayOfMonth2);
            }
        });
        fragmentMonthStepBinding.monthStepBarView.setListener(new com.qcwireless.qcwatch.ui.base.view.QStepMonthHistoryBarChart.OnSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment$$ExternalSyntheticLambda1
            @Override // com.qcwireless.qcwatch.ui.base.view.QStepMonthHistoryBarChart.OnSelectedListener
            public final void onSelected(com.qcwireless.qcwatch.ui.base.view.QStepMonthHistoryBarChart.StepDataBean stepDataBean) {
                com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment.m1224loadDataOnce$lambda2$lambda1(com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment.this, stepDataBean);
            }
        });
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment.m1225loadDataOnce$lambda3(com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment.this, (com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel.MonthStepUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-2$lambda-1, reason: not valid java name */
    public static final void m1224loadDataOnce$lambda2$lambda1(com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment monthStepFragment, com.qcwireless.qcwatch.ui.base.view.QStepMonthHistoryBarChart.StepDataBean stepDataBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthStepFragment, "this$0");
        if (stepDataBean != null) {
            com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding fragmentMonthStepBinding = monthStepFragment.binding;
            if (fragmentMonthStepBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthStepBinding = null;
            }
            try {
                fragmentMonthStepBinding.tvDayStep.setText(java.lang.String.valueOf(stepDataBean.getSteps()));
                fragmentMonthStepBinding.tvStepRange.setText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(stepDataBean.getTimeStamp(), true)));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-3, reason: not valid java name */
    public static final void m1225loadDataOnce$lambda3(com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment monthStepFragment, com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel.MonthStepUI monthStepUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthStepFragment, "this$0");
        if (monthStepUI != null) {
            com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding fragmentMonthStepBinding = monthStepFragment.binding;
            com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding fragmentMonthStepBinding2 = null;
            if (fragmentMonthStepBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthStepBinding = null;
            }
            fragmentMonthStepBinding.monthStepBarView.setData(monthStepUI.getData());
            float f = 0.0f;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (com.qcwireless.qcwatch.ui.base.view.QStepMonthHistoryBarChart.StepDataBean stepDataBean : monthStepUI.getData()) {
                if (stepDataBean.getSteps() > 0) {
                    i2++;
                }
                i += stepDataBean.getSteps();
                f += new java.math.BigDecimal(java.lang.String.valueOf((stepDataBean.getDistance() * 1.0f) / 1000)).setScale(2, java.math.RoundingMode.HALF_UP).floatValue();
                i3 += stepDataBean.getCalorie() / 1000;
            }
            com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding fragmentMonthStepBinding3 = monthStepFragment.binding;
            if (fragmentMonthStepBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthStepBinding3 = null;
            }
            fragmentMonthStepBinding3.stepTotal.setTitleValue(java.lang.String.valueOf(i));
            if (i2 > 0) {
                com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding fragmentMonthStepBinding4 = monthStepFragment.binding;
                if (fragmentMonthStepBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthStepBinding4 = null;
                }
                fragmentMonthStepBinding4.stepAvg.setTitleValue(java.lang.String.valueOf(java.lang.Math.round(i / (i2 * 1.0f))));
            } else {
                com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding fragmentMonthStepBinding5 = monthStepFragment.binding;
                if (fragmentMonthStepBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthStepBinding5 = null;
                }
                fragmentMonthStepBinding5.stepAvg.setTitleValue("0");
            }
            com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding fragmentMonthStepBinding6 = monthStepFragment.binding;
            if (fragmentMonthStepBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthStepBinding6 = null;
            }
            fragmentMonthStepBinding6.stepCalorie.setTitleValue(java.lang.String.valueOf(i3));
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
                float floatValue = new java.math.BigDecimal(java.lang.String.valueOf(f)).setScale(2, java.math.RoundingMode.HALF_UP).floatValue();
                com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding fragmentMonthStepBinding7 = monthStepFragment.binding;
                if (fragmentMonthStepBinding7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthStepBinding7 = null;
                }
                fragmentMonthStepBinding7.stepDistance.setTitleValue(java.lang.String.valueOf(floatValue));
                com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding fragmentMonthStepBinding8 = monthStepFragment.binding;
                if (fragmentMonthStepBinding8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentMonthStepBinding2 = fragmentMonthStepBinding8;
                }
                com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView = fragmentMonthStepBinding2.stepDistance;
                java.lang.String string = monthStepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_88);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_88)");
                qStepComponentView.setTitleUnit(string);
                return;
            }
            float floatValue2 = new java.math.BigDecimal(java.lang.String.valueOf(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kmToIn(f))).setScale(2, java.math.RoundingMode.HALF_UP).floatValue();
            com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding fragmentMonthStepBinding9 = monthStepFragment.binding;
            if (fragmentMonthStepBinding9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthStepBinding9 = null;
            }
            fragmentMonthStepBinding9.stepDistance.setTitleValue(java.lang.String.valueOf(floatValue2));
            com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding fragmentMonthStepBinding10 = monthStepFragment.binding;
            if (fragmentMonthStepBinding10 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentMonthStepBinding2 = fragmentMonthStepBinding10;
            }
            com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView2 = fragmentMonthStepBinding2.stepDistance;
            java.lang.String string2 = monthStepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_358);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_358)");
            qStepComponentView2.setTitleUnit(string2);
        }
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent ? true : messageEvent instanceof com.qcwireless.qcwatch.base.event.HomeStepRefreshEvent) {
            try {
                com.qcwireless.qc_utils.date.DateUtil firstDayOfMonth = com.qcwireless.qc_utils.date.DateUtil.getFirstDayOfMonth(this.date);
                com.qcwireless.qc_utils.date.DateUtil lastDayOfMonth = com.qcwireless.qc_utils.date.DateUtil.getLastDayOfMonth(this.date);
                com.qcwireless.qcwatch.databinding.FragmentMonthStepBinding fragmentMonthStepBinding = this.binding;
                if (fragmentMonthStepBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthStepBinding = null;
                }
                fragmentMonthStepBinding.qcDateChange.setMonth(this.date);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, this.date.getY_M_D());
                com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel viewModel = getViewModel();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfMonth, "first");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lastDayOfMonth, "last");
                viewModel.queryHistoryStepsByDate(firstDayOfMonth, lastDayOfMonth);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }

    /* compiled from: MonthStepFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/step/month/MonthStepFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/step/month/MonthStepFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment();
        }
    }
}
