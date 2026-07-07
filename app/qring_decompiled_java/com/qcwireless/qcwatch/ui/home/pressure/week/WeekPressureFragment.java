package com.qcwireless.qcwatch.ui.home.pressure.week;

/* compiled from: WeekPressureFragment.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082.¢\u0006\u0004\n\u0002\u0010\u0015¨\u0006\""}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/pressure/week/WeekPressureFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentWeekPressureBinding;", "firstDay", "Lcom/qcwireless/qc_utils/date/DateUtil;", "maxPressure", "", "minPressure", "totalIndex", "totalPressure", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/pressure/week/WeekPressureFragmentViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/pressure/week/WeekPressureFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "weeks", "", "", "[Ljava/lang/String;", "loadDataOnce", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WeekPressureFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment.Companion(null);
    private com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding binding;
    private com.qcwireless.qc_utils.date.DateUtil firstDay;
    private int totalIndex;
    private int totalPressure;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private java.lang.String[] weeks;
    private int minPressure = 100;
    private int maxPressure = 1;

    public WeekPressureFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragmentViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragmentViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragmentViewModel m1165invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragmentViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragmentViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragmentViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding inflate = com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding.inflate(getLayoutInflater());
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
        firstDayOfWeek.addDay(7);
        com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragmentViewModel viewModel = getViewModel();
        com.qcwireless.qc_utils.date.DateUtil firstDayOfWeek2 = com.qcwireless.qc_utils.date.DateUtil.firstDayOfWeek();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfWeek2, "firstDayOfWeek()");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfWeek, "end");
        viewModel.queryHistoryPressureByDate(firstDayOfWeek2, firstDayOfWeek);
        com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding = this.binding;
        if (fragmentWeekPressureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekPressureBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView qDateWeekSwitchView = fragmentWeekPressureBinding.qcDateChange;
        com.qcwireless.qc_utils.date.DateUtil firstDayOfWeek3 = com.qcwireless.qc_utils.date.DateUtil.firstDayOfWeek();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfWeek3, "firstDayOfWeek()");
        qDateWeekSwitchView.setWeekDayStart(firstDayOfWeek3);
        fragmentWeekPressureBinding.qcDateChange.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment$loadDataOnce$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView.QDateBefore
            public void clickBefore(boolean r4, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
                com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragmentViewModel viewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
                com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(dateUtil.getUnixTimestamp(), true);
                dateUtil2.addDay(7);
                viewModel2 = com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment.this.getViewModel();
                viewModel2.queryHistoryPressureByDate(dateUtil, dateUtil2);
                com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment.this.firstDay = dateUtil;
            }
        });
        fragmentWeekPressureBinding.qcPressureChart.setListener(new com.qcwireless.qcwatch.ui.base.view.QPressureWeekHistoryBarChart.OnSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment$$ExternalSyntheticLambda1
            @Override // com.qcwireless.qcwatch.ui.base.view.QPressureWeekHistoryBarChart.OnSelectedListener
            public final void onSelected(com.qcwireless.qcwatch.ui.base.view.QPressureWeekHistoryBarChart.StepDataBean stepDataBean) {
                com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment.m1163loadDataOnce$lambda1$lambda0(com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment.this, stepDataBean);
            }
        });
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment.m1164loadDataOnce$lambda3(com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment.this, (com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragmentViewModel.WeekPressureUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-1$lambda-0, reason: not valid java name */
    public static final void m1163loadDataOnce$lambda1$lambda0(com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment weekPressureFragment, com.qcwireless.qcwatch.ui.base.view.QPressureWeekHistoryBarChart.StepDataBean stepDataBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weekPressureFragment, "this$0");
        if (stepDataBean != null) {
            try {
                com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding = weekPressureFragment.binding;
                com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding2 = null;
                if (fragmentWeekPressureBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentWeekPressureBinding = null;
                }
                fragmentWeekPressureBinding.tvDayPressure.setText(java.lang.String.valueOf(stepDataBean.getSteps()));
                int whatDay = com.qcwireless.qc_utils.date.DateUtil.getWhatDay(stepDataBean.getTimeStamp());
                com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding3 = weekPressureFragment.binding;
                if (fragmentWeekPressureBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentWeekPressureBinding3 = null;
                }
                android.widget.TextView textView = fragmentWeekPressureBinding3.tvPressureRange;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(stepDataBean.getTimeStamp(), true)));
                sb.append(' ');
                java.lang.String[] strArr = weekPressureFragment.weeks;
                if (strArr == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("weeks");
                    strArr = null;
                }
                sb.append(strArr[whatDay]);
                textView.setText(sb.toString());
                if (stepDataBean.getSteps() > 0) {
                    com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding4 = weekPressureFragment.binding;
                    if (fragmentWeekPressureBinding4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentWeekPressureBinding4 = null;
                    }
                    fragmentWeekPressureBinding4.tvDayPressure.setText(java.lang.String.valueOf(stepDataBean.getSteps()));
                    com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding5 = weekPressureFragment.binding;
                    if (fragmentWeekPressureBinding5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentWeekPressureBinding2 = fragmentWeekPressureBinding5;
                    }
                    fragmentWeekPressureBinding2.tvDayPressureUnit.setText(weekPressureFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_6666562));
                    return;
                }
                com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding6 = weekPressureFragment.binding;
                if (fragmentWeekPressureBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentWeekPressureBinding6 = null;
                }
                fragmentWeekPressureBinding6.tvDayPressure.setText("--");
                com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding7 = weekPressureFragment.binding;
                if (fragmentWeekPressureBinding7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentWeekPressureBinding2 = fragmentWeekPressureBinding7;
                }
                fragmentWeekPressureBinding2.tvDayPressureUnit.setText("");
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-3, reason: not valid java name */
    public static final void m1164loadDataOnce$lambda3(com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment weekPressureFragment, com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragmentViewModel.WeekPressureUI weekPressureUI) {
        com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding;
        com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding2;
        com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weekPressureFragment, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(weekPressureUI.getData().size()));
        com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding4 = weekPressureFragment.binding;
        if (fragmentWeekPressureBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekPressureBinding4 = null;
        }
        fragmentWeekPressureBinding4.qcPressureChart.setData(weekPressureUI.getData());
        weekPressureFragment.totalIndex = 0;
        weekPressureFragment.totalPressure = 0;
        weekPressureFragment.minPressure = 100;
        weekPressureFragment.maxPressure = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (com.qcwireless.qcwatch.ui.base.view.QPressureWeekHistoryBarChart.StepDataBean stepDataBean : weekPressureUI.getData()) {
            int i5 = weekPressureFragment.minPressure;
            int steps = stepDataBean.getSteps();
            if (1 <= steps && steps < i5) {
                weekPressureFragment.minPressure = stepDataBean.getSteps();
            }
            if (stepDataBean.getSteps() > weekPressureFragment.maxPressure) {
                weekPressureFragment.maxPressure = stepDataBean.getSteps();
            }
            weekPressureFragment.totalPressure += stepDataBean.getSteps();
            if (stepDataBean.getSteps() >= 80) {
                i++;
            } else {
                int steps2 = stepDataBean.getSteps();
                if (60 <= steps2 && steps2 < 80) {
                    i2++;
                } else {
                    int steps3 = stepDataBean.getSteps();
                    if (30 <= steps3 && steps3 < 60) {
                        i4++;
                    } else {
                        int steps4 = stepDataBean.getSteps();
                        if (1 <= steps4 && steps4 < 30) {
                            i3++;
                        }
                    }
                }
            }
            if (stepDataBean.getSteps() > 0) {
                weekPressureFragment.totalIndex++;
            }
        }
        if (!weekPressureUI.getData().isEmpty()) {
            if (weekPressureFragment.totalIndex > 0) {
                com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding5 = weekPressureFragment.binding;
                if (fragmentWeekPressureBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentWeekPressureBinding5 = null;
                }
                fragmentWeekPressureBinding5.pressureTotal.setTitleValue(java.lang.String.valueOf(weekPressureFragment.totalPressure / weekPressureFragment.totalIndex));
            } else {
                com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding6 = weekPressureFragment.binding;
                if (fragmentWeekPressureBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentWeekPressureBinding6 = null;
                }
                fragmentWeekPressureBinding6.pressureTotal.setTitleValue("--");
            }
            com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding7 = weekPressureFragment.binding;
            if (fragmentWeekPressureBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekPressureBinding7 = null;
            }
            com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView = fragmentWeekPressureBinding7.pressureTotal;
            java.lang.String string = weekPressureFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_6666562);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_6666562)");
            qStepComponentView.setTitleUnit(string);
            com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding8 = weekPressureFragment.binding;
            if (fragmentWeekPressureBinding8 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekPressureBinding8 = null;
            }
            com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView2 = fragmentWeekPressureBinding8.pressureAvg;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(weekPressureFragment.minPressure);
            sb.append('-');
            sb.append(weekPressureFragment.maxPressure);
            qStepComponentView2.setTitleValue(sb.toString());
            com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding9 = weekPressureFragment.binding;
            if (fragmentWeekPressureBinding9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekPressureBinding9 = null;
            }
            com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView3 = fragmentWeekPressureBinding9.pressureAvg;
            java.lang.String string2 = weekPressureFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_6666562);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_6666562)");
            qStepComponentView3.setTitleUnit(string2);
            int[] iArr = {0, 0, 0, 0, 0};
            iArr[0] = i3;
            iArr[1] = i4;
            iArr[2] = i2;
            iArr[3] = i;
            int i6 = i3 + i4 + i2 + i;
            if (i6 > 0) {
                com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding10 = weekPressureFragment.binding;
                if (fragmentWeekPressureBinding10 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentWeekPressureBinding10 = null;
                }
                fragmentWeekPressureBinding10.heartCircleView.dataPressureInit(iArr);
                com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding11 = weekPressureFragment.binding;
                if (fragmentWeekPressureBinding11 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentWeekPressureBinding11 = null;
                }
                android.widget.TextView textView = fragmentWeekPressureBinding11.tvValue1;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                float f = i6;
                float f2 = 100;
                sb2.append(java.lang.Math.round(((i3 * 1.0f) / f) * f2));
                sb2.append('%');
                textView.setText(sb2.toString());
                com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding12 = weekPressureFragment.binding;
                if (fragmentWeekPressureBinding12 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentWeekPressureBinding12 = null;
                }
                android.widget.TextView textView2 = fragmentWeekPressureBinding12.tvValue2;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(java.lang.Math.round(((i4 * 1.0f) / f) * f2));
                sb3.append('%');
                textView2.setText(sb3.toString());
                com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding13 = weekPressureFragment.binding;
                if (fragmentWeekPressureBinding13 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentWeekPressureBinding13 = null;
                }
                android.widget.TextView textView3 = fragmentWeekPressureBinding13.tvValue4;
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(java.lang.Math.round(((i2 * 1.0f) / f) * f2));
                sb4.append('%');
                textView3.setText(sb4.toString());
                com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding14 = weekPressureFragment.binding;
                if (fragmentWeekPressureBinding14 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentWeekPressureBinding3 = null;
                } else {
                    fragmentWeekPressureBinding3 = fragmentWeekPressureBinding14;
                }
                android.widget.TextView textView4 = fragmentWeekPressureBinding3.tvValue5;
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(java.lang.Math.round(((i * 1.0f) / f) * f2));
                sb5.append('%');
                textView4.setText(sb5.toString());
                return;
            }
            int[] iArr2 = {0, 0, 0, 0, 0};
            com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding15 = weekPressureFragment.binding;
            if (fragmentWeekPressureBinding15 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekPressureBinding15 = null;
            }
            fragmentWeekPressureBinding15.heartCircleView.dataPressureInit(iArr2);
            com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding16 = weekPressureFragment.binding;
            if (fragmentWeekPressureBinding16 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekPressureBinding16 = null;
            }
            fragmentWeekPressureBinding16.tvValue1.setText("--");
            com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding17 = weekPressureFragment.binding;
            if (fragmentWeekPressureBinding17 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekPressureBinding17 = null;
            }
            fragmentWeekPressureBinding17.tvValue2.setText("--");
            com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding18 = weekPressureFragment.binding;
            if (fragmentWeekPressureBinding18 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekPressureBinding18 = null;
            }
            fragmentWeekPressureBinding18.tvValue4.setText("--");
            com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding19 = weekPressureFragment.binding;
            if (fragmentWeekPressureBinding19 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekPressureBinding19 = null;
            }
            fragmentWeekPressureBinding19.tvValue5.setText("--");
            com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding20 = weekPressureFragment.binding;
            if (fragmentWeekPressureBinding20 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekPressureBinding20 = null;
            }
            fragmentWeekPressureBinding20.pressureTotal.setTitleValue("--");
            com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding21 = weekPressureFragment.binding;
            if (fragmentWeekPressureBinding21 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekPressureBinding21 = null;
            }
            fragmentWeekPressureBinding21.pressureTotal.setTitleUnit("--");
            com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding22 = weekPressureFragment.binding;
            if (fragmentWeekPressureBinding22 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekPressureBinding22 = null;
            }
            fragmentWeekPressureBinding22.pressureAvg.setTitleValue("--");
            com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding23 = weekPressureFragment.binding;
            if (fragmentWeekPressureBinding23 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekPressureBinding2 = null;
            } else {
                fragmentWeekPressureBinding2 = fragmentWeekPressureBinding23;
            }
            fragmentWeekPressureBinding2.pressureAvg.setTitleUnit("--");
            return;
        }
        int[] iArr3 = {0, 0, 0, 0, 0};
        com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding24 = weekPressureFragment.binding;
        if (fragmentWeekPressureBinding24 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekPressureBinding24 = null;
        }
        fragmentWeekPressureBinding24.heartCircleView.dataPressureInit(iArr3);
        com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding25 = weekPressureFragment.binding;
        if (fragmentWeekPressureBinding25 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekPressureBinding25 = null;
        }
        fragmentWeekPressureBinding25.qcPressureChart.setData(new java.util.ArrayList());
        com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding26 = weekPressureFragment.binding;
        if (fragmentWeekPressureBinding26 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekPressureBinding26 = null;
        }
        fragmentWeekPressureBinding26.tvValue1.setText("--");
        com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding27 = weekPressureFragment.binding;
        if (fragmentWeekPressureBinding27 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekPressureBinding27 = null;
        }
        fragmentWeekPressureBinding27.tvValue2.setText("--");
        com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding28 = weekPressureFragment.binding;
        if (fragmentWeekPressureBinding28 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekPressureBinding28 = null;
        }
        fragmentWeekPressureBinding28.tvValue4.setText("--");
        com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding29 = weekPressureFragment.binding;
        if (fragmentWeekPressureBinding29 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekPressureBinding29 = null;
        }
        fragmentWeekPressureBinding29.tvValue5.setText("--");
        com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding30 = weekPressureFragment.binding;
        if (fragmentWeekPressureBinding30 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekPressureBinding30 = null;
        }
        fragmentWeekPressureBinding30.pressureTotal.setTitleValue("--");
        com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding31 = weekPressureFragment.binding;
        if (fragmentWeekPressureBinding31 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekPressureBinding31 = null;
        }
        fragmentWeekPressureBinding31.pressureTotal.setTitleUnit("--");
        com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding32 = weekPressureFragment.binding;
        if (fragmentWeekPressureBinding32 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekPressureBinding32 = null;
        }
        fragmentWeekPressureBinding32.pressureAvg.setTitleValue("--");
        com.qcwireless.qcwatch.databinding.FragmentWeekPressureBinding fragmentWeekPressureBinding33 = weekPressureFragment.binding;
        if (fragmentWeekPressureBinding33 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekPressureBinding = null;
        } else {
            fragmentWeekPressureBinding = fragmentWeekPressureBinding33;
        }
        fragmentWeekPressureBinding.pressureAvg.setTitleUnit("--");
    }

    /* compiled from: WeekPressureFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/pressure/week/WeekPressureFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/pressure/week/WeekPressureFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment();
        }
    }
}
