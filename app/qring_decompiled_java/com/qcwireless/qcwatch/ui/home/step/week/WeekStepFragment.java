package com.qcwireless.qcwatch.ui.home.step.week;

/* compiled from: WeekStepFragment.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082.¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006#"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/step/week/WeekStepFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentWeekStepBinding;", "df", "Ljava/text/DecimalFormat;", "firstDay", "Lcom/qcwireless/qc_utils/date/DateUtil;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/step/week/WeekStepFragmentViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/step/week/WeekStepFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "weeks", "", "", "[Ljava/lang/String;", "loadDataOnce", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WeekStepFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment.Companion(null);
    private com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding binding;
    private java.text.DecimalFormat df;
    private com.qcwireless.qc_utils.date.DateUtil firstDay;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private java.lang.String[] weeks;

    public WeekStepFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel m1230invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding inflate = com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        return inflate.getRoot();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void loadDataOnce() {
        super.loadDataOnce();
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.00", new java.text.DecimalFormatSymbols(java.util.Locale.US));
        this.df = decimalFormat;
        decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_208);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_208)");
        java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_202);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_202)");
        java.lang.String string3 = getString(com.qcwireless.qcwatch.R.string.qc_text_203);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_203)");
        java.lang.String string4 = getString(com.qcwireless.qcwatch.R.string.qc_text_204);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_204)");
        java.lang.String string5 = getString(com.qcwireless.qcwatch.R.string.qc_text_205);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.qc_text_205)");
        java.lang.String string6 = getString(com.qcwireless.qcwatch.R.string.qc_text_206);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.qc_text_206)");
        java.lang.String string7 = getString(com.qcwireless.qcwatch.R.string.qc_text_207);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.qc_text_207)");
        this.weeks = new java.lang.String[]{string, string2, string3, string4, string5, string6, string7};
        com.qcwireless.qc_utils.date.DateUtil firstDayOfWeek = com.qcwireless.qc_utils.date.DateUtil.firstDayOfWeek();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfWeek, "firstDayOfWeek()");
        this.firstDay = firstDayOfWeek;
        com.qcwireless.qc_utils.date.DateUtil firstDayOfWeek2 = com.qcwireless.qc_utils.date.DateUtil.firstDayOfWeek();
        firstDayOfWeek2.addDay(7);
        com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel viewModel = getViewModel();
        com.qcwireless.qc_utils.date.DateUtil firstDayOfWeek3 = com.qcwireless.qc_utils.date.DateUtil.firstDayOfWeek();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfWeek3, "firstDayOfWeek()");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfWeek2, "end");
        viewModel.queryHistoryStepsByDate(firstDayOfWeek3, firstDayOfWeek2);
        com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding fragmentWeekStepBinding = this.binding;
        if (fragmentWeekStepBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekStepBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView qDateWeekSwitchView = fragmentWeekStepBinding.qcDateChange;
        com.qcwireless.qc_utils.date.DateUtil firstDayOfWeek4 = com.qcwireless.qc_utils.date.DateUtil.firstDayOfWeek();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfWeek4, "firstDayOfWeek()");
        qDateWeekSwitchView.setWeekDayStart(firstDayOfWeek4);
        fragmentWeekStepBinding.qcDateChange.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment$loadDataOnce$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView.QDateBefore
            public void clickBefore(boolean r4, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
                com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel viewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
                com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(dateUtil.getUnixTimestamp(), true);
                dateUtil2.addDay(7);
                viewModel2 = com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment.this.getViewModel();
                viewModel2.queryHistoryStepsByDate(dateUtil, dateUtil2);
                com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment.this.firstDay = dateUtil;
            }
        });
        fragmentWeekStepBinding.weekStepBarView.setListener(new com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart.OnSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment$$ExternalSyntheticLambda1
            @Override // com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart.OnSelectedListener
            public final void onSelected(com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart.StepDataBean stepDataBean) {
                com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment.m1228loadDataOnce$lambda1$lambda0(com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment.this, stepDataBean);
            }
        });
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment.m1229loadDataOnce$lambda2(com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment.this, (com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel.WeekStepUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-1$lambda-0, reason: not valid java name */
    public static final void m1228loadDataOnce$lambda1$lambda0(com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment weekStepFragment, com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart.StepDataBean stepDataBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weekStepFragment, "this$0");
        if (stepDataBean != null) {
            try {
                com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding fragmentWeekStepBinding = weekStepFragment.binding;
                java.lang.String[] strArr = null;
                if (fragmentWeekStepBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentWeekStepBinding = null;
                }
                fragmentWeekStepBinding.tvDayStep.setText(java.lang.String.valueOf(stepDataBean.getSteps()));
                int whatDay = com.qcwireless.qc_utils.date.DateUtil.getWhatDay(stepDataBean.getTimeStamp());
                com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding fragmentWeekStepBinding2 = weekStepFragment.binding;
                if (fragmentWeekStepBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentWeekStepBinding2 = null;
                }
                android.widget.TextView textView = fragmentWeekStepBinding2.tvStepRange;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(stepDataBean.getTimeStamp(), true)));
                sb.append(' ');
                java.lang.String[] strArr2 = weekStepFragment.weeks;
                if (strArr2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("weeks");
                } else {
                    strArr = strArr2;
                }
                sb.append(strArr[whatDay]);
                textView.setText(sb.toString());
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-2, reason: not valid java name */
    public static final void m1229loadDataOnce$lambda2(com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment weekStepFragment, com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel.WeekStepUI weekStepUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weekStepFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding fragmentWeekStepBinding = weekStepFragment.binding;
        com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding fragmentWeekStepBinding2 = null;
        if (fragmentWeekStepBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekStepBinding = null;
        }
        fragmentWeekStepBinding.weekStepBarView.setData(weekStepUI.getData());
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart.StepDataBean stepDataBean : weekStepUI.getData()) {
            if (stepDataBean.getSteps() > 0) {
                i2++;
            }
            i += stepDataBean.getSteps();
            f += new java.math.BigDecimal(java.lang.String.valueOf((stepDataBean.getDistance() * 1.0f) / 1000)).setScale(2, java.math.RoundingMode.HALF_UP).floatValue();
            i3 += stepDataBean.getCalorie() / 1000;
        }
        com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding fragmentWeekStepBinding3 = weekStepFragment.binding;
        if (fragmentWeekStepBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekStepBinding3 = null;
        }
        fragmentWeekStepBinding3.stepTotal.setTitleValue(java.lang.String.valueOf(i));
        if (i2 > 0) {
            com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding fragmentWeekStepBinding4 = weekStepFragment.binding;
            if (fragmentWeekStepBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekStepBinding4 = null;
            }
            fragmentWeekStepBinding4.stepAvg.setTitleValue(java.lang.String.valueOf(java.lang.Math.round(i / (i2 * 1.0f))));
        } else {
            com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding fragmentWeekStepBinding5 = weekStepFragment.binding;
            if (fragmentWeekStepBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekStepBinding5 = null;
            }
            fragmentWeekStepBinding5.stepAvg.setTitleValue("0");
        }
        com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding fragmentWeekStepBinding6 = weekStepFragment.binding;
        if (fragmentWeekStepBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekStepBinding6 = null;
        }
        fragmentWeekStepBinding6.stepCalorie.setTitleValue(java.lang.String.valueOf(i3));
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
            float floatValue = new java.math.BigDecimal(java.lang.String.valueOf(f)).setScale(2, java.math.RoundingMode.HALF_UP).floatValue();
            com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding fragmentWeekStepBinding7 = weekStepFragment.binding;
            if (fragmentWeekStepBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekStepBinding7 = null;
            }
            fragmentWeekStepBinding7.stepDistance.setTitleValue(java.lang.String.valueOf(floatValue));
            com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding fragmentWeekStepBinding8 = weekStepFragment.binding;
            if (fragmentWeekStepBinding8 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentWeekStepBinding2 = fragmentWeekStepBinding8;
            }
            com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView = fragmentWeekStepBinding2.stepDistance;
            java.lang.String string = weekStepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_88);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_88)");
            qStepComponentView.setTitleUnit(string);
            return;
        }
        float floatValue2 = new java.math.BigDecimal(java.lang.String.valueOf(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kmToIn(f)).toString()).setScale(2, java.math.RoundingMode.HALF_UP).floatValue();
        com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding fragmentWeekStepBinding9 = weekStepFragment.binding;
        if (fragmentWeekStepBinding9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekStepBinding9 = null;
        }
        fragmentWeekStepBinding9.stepDistance.setTitleValue(java.lang.String.valueOf(floatValue2));
        com.qcwireless.qcwatch.databinding.FragmentWeekStepBinding fragmentWeekStepBinding10 = weekStepFragment.binding;
        if (fragmentWeekStepBinding10 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentWeekStepBinding2 = fragmentWeekStepBinding10;
        }
        com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView2 = fragmentWeekStepBinding2.stepDistance;
        java.lang.String string2 = weekStepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_358);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_358)");
        qStepComponentView2.setTitleUnit(string2);
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent ? true : messageEvent instanceof com.qcwireless.qcwatch.base.event.HomeStepRefreshEvent) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "step week");
            com.qcwireless.qc_utils.date.DateUtil dateUtil = this.firstDay;
            com.qcwireless.qc_utils.date.DateUtil dateUtil2 = null;
            if (dateUtil == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("firstDay");
                dateUtil = null;
            }
            com.qcwireless.qc_utils.date.DateUtil dateUtil3 = new com.qcwireless.qc_utils.date.DateUtil(dateUtil.getUnixTimestamp(), true);
            dateUtil3.addDay(7);
            com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel viewModel = getViewModel();
            com.qcwireless.qc_utils.date.DateUtil dateUtil4 = this.firstDay;
            if (dateUtil4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("firstDay");
            } else {
                dateUtil2 = dateUtil4;
            }
            viewModel.queryHistoryStepsByDate(dateUtil2, dateUtil3);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }

    /* compiled from: WeekStepFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/step/week/WeekStepFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/step/week/WeekStepFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment();
        }
    }
}
