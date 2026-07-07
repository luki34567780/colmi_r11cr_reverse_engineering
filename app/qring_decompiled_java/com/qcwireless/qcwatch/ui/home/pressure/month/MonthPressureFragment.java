package com.qcwireless.qcwatch.ui.home.pressure.month;

/* compiled from: MonthPressureFragment.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/pressure/month/MonthPressureFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentMonthPressureBinding;", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "maxPressure", "", "minPressure", "totalIndex", "totalPressure", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/pressure/month/MonthPressureFragmentViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/pressure/month/MonthPressureFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "loadDataOnce", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MonthPressureFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment.Companion(null);
    private com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding binding;
    private int totalIndex;
    private int totalPressure;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private int minPressure = 100;
    private int maxPressure = 1;
    private com.qcwireless.qc_utils.date.DateUtil date = new com.qcwireless.qc_utils.date.DateUtil();

    public MonthPressureFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragmentViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragmentViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragmentViewModel m1162invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragmentViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragmentViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragmentViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding inflate = com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding.inflate(getLayoutInflater());
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
        com.qcwireless.qc_utils.date.DateUtil firstDayOfMonth = com.qcwireless.qc_utils.date.DateUtil.getFirstDayOfMonth(new com.qcwireless.qc_utils.date.DateUtil());
        com.qcwireless.qc_utils.date.DateUtil lastDayOfMonth = com.qcwireless.qc_utils.date.DateUtil.getLastDayOfMonth(new com.qcwireless.qc_utils.date.DateUtil());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfMonth, "firstDay");
        this.date = firstDayOfMonth;
        com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragmentViewModel viewModel = getViewModel();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lastDayOfMonth, "lastDay");
        viewModel.queryHistoryPressureByDate(firstDayOfMonth, lastDayOfMonth);
        com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding = this.binding;
        if (fragmentMonthPressureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMonthPressureBinding = null;
        }
        fragmentMonthPressureBinding.qcDateChange.setMonth(new com.qcwireless.qc_utils.date.DateUtil());
        fragmentMonthPressureBinding.qcDateChange.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment$loadDataOnce$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView.QDateBefore
            public void clickBefore(boolean r3, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
                com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragmentViewModel viewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
                com.qcwireless.qc_utils.date.DateUtil firstDayOfMonth2 = com.qcwireless.qc_utils.date.DateUtil.getFirstDayOfMonth(dateUtil);
                com.qcwireless.qc_utils.date.DateUtil lastDayOfMonth2 = com.qcwireless.qc_utils.date.DateUtil.getLastDayOfMonth(dateUtil);
                viewModel2 = com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment.this.getViewModel();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfMonth2, "first");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lastDayOfMonth2, "last");
                viewModel2.queryHistoryPressureByDate(firstDayOfMonth2, lastDayOfMonth2);
            }
        });
        fragmentMonthPressureBinding.qcPressureChart.setListener(new com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.OnSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment$$ExternalSyntheticLambda1
            @Override // com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.OnSelectedListener
            public final void onSelected(com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean stepDataBean) {
                com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment.m1160loadDataOnce$lambda2$lambda1(com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment.this, stepDataBean);
            }
        });
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment.m1161loadDataOnce$lambda4(com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment.this, (com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragmentViewModel.MonthPressureUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-2$lambda-1, reason: not valid java name */
    public static final void m1160loadDataOnce$lambda2$lambda1(com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment monthPressureFragment, com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean stepDataBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthPressureFragment, "this$0");
        if (stepDataBean != null) {
            com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding = monthPressureFragment.binding;
            com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding2 = null;
            if (fragmentMonthPressureBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthPressureBinding = null;
            }
            try {
                fragmentMonthPressureBinding.tvDayPressure.setText(java.lang.String.valueOf(stepDataBean.getSteps()));
                fragmentMonthPressureBinding.tvPressureRange.setText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(stepDataBean.getTimeStamp(), true)));
                if (stepDataBean.getSteps() > 0) {
                    com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding3 = monthPressureFragment.binding;
                    if (fragmentMonthPressureBinding3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentMonthPressureBinding3 = null;
                    }
                    fragmentMonthPressureBinding3.tvDayPressure.setText(java.lang.String.valueOf(stepDataBean.getSteps()));
                    com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding4 = monthPressureFragment.binding;
                    if (fragmentMonthPressureBinding4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentMonthPressureBinding2 = fragmentMonthPressureBinding4;
                    }
                    fragmentMonthPressureBinding2.tvDayPressureUnit.setText(monthPressureFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_6666562));
                    return;
                }
                com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding5 = monthPressureFragment.binding;
                if (fragmentMonthPressureBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthPressureBinding5 = null;
                }
                fragmentMonthPressureBinding5.tvDayPressure.setText("--");
                com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding6 = monthPressureFragment.binding;
                if (fragmentMonthPressureBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentMonthPressureBinding2 = fragmentMonthPressureBinding6;
                }
                fragmentMonthPressureBinding2.tvDayPressureUnit.setText("");
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-4, reason: not valid java name */
    public static final void m1161loadDataOnce$lambda4(com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment monthPressureFragment, com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragmentViewModel.MonthPressureUI monthPressureUI) {
        com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding;
        com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding2;
        com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthPressureFragment, "this$0");
        if (monthPressureUI != null) {
            com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding4 = monthPressureFragment.binding;
            if (fragmentMonthPressureBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthPressureBinding4 = null;
            }
            fragmentMonthPressureBinding4.qcPressureChart.setData(monthPressureUI.getData());
            monthPressureFragment.totalIndex = 0;
            monthPressureFragment.totalPressure = 0;
            monthPressureFragment.minPressure = 100;
            monthPressureFragment.maxPressure = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean stepDataBean : monthPressureUI.getData()) {
                int i5 = monthPressureFragment.minPressure;
                int steps = stepDataBean.getSteps();
                if (1 <= steps && steps < i5) {
                    monthPressureFragment.minPressure = stepDataBean.getSteps();
                }
                if (stepDataBean.getSteps() > monthPressureFragment.maxPressure) {
                    monthPressureFragment.maxPressure = stepDataBean.getSteps();
                }
                monthPressureFragment.totalPressure += stepDataBean.getSteps();
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
                    monthPressureFragment.totalIndex++;
                }
            }
            if (!monthPressureUI.getData().isEmpty()) {
                if (monthPressureFragment.totalIndex > 0) {
                    com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding5 = monthPressureFragment.binding;
                    if (fragmentMonthPressureBinding5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentMonthPressureBinding5 = null;
                    }
                    fragmentMonthPressureBinding5.pressureTotal.setTitleValue(java.lang.String.valueOf(monthPressureFragment.totalPressure / monthPressureFragment.totalIndex));
                } else {
                    com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding6 = monthPressureFragment.binding;
                    if (fragmentMonthPressureBinding6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentMonthPressureBinding6 = null;
                    }
                    fragmentMonthPressureBinding6.pressureTotal.setTitleValue("--");
                }
                com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding7 = monthPressureFragment.binding;
                if (fragmentMonthPressureBinding7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthPressureBinding7 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView = fragmentMonthPressureBinding7.pressureTotal;
                java.lang.String string = monthPressureFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_6666562);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_6666562)");
                qStepComponentView.setTitleUnit(string);
                com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding8 = monthPressureFragment.binding;
                if (fragmentMonthPressureBinding8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthPressureBinding8 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView2 = fragmentMonthPressureBinding8.pressureAvg;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(monthPressureFragment.minPressure);
                sb.append('-');
                sb.append(monthPressureFragment.maxPressure);
                qStepComponentView2.setTitleValue(sb.toString());
                com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding9 = monthPressureFragment.binding;
                if (fragmentMonthPressureBinding9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthPressureBinding9 = null;
                }
                com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView3 = fragmentMonthPressureBinding9.pressureAvg;
                java.lang.String string2 = monthPressureFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_6666562);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_6666562)");
                qStepComponentView3.setTitleUnit(string2);
                int[] iArr = {0, 0, 0, 0, 0};
                iArr[0] = i3;
                iArr[1] = i4;
                iArr[2] = i2;
                iArr[3] = i;
                int i6 = i3 + i4 + i2 + i;
                if (i6 > 0) {
                    com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding10 = monthPressureFragment.binding;
                    if (fragmentMonthPressureBinding10 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentMonthPressureBinding10 = null;
                    }
                    fragmentMonthPressureBinding10.heartCircleView.dataPressureInit(iArr);
                    com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding11 = monthPressureFragment.binding;
                    if (fragmentMonthPressureBinding11 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentMonthPressureBinding11 = null;
                    }
                    android.widget.TextView textView = fragmentMonthPressureBinding11.tvValue1;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    float f = i6;
                    float f2 = 100;
                    sb2.append(java.lang.Math.round(((i3 * 1.0f) / f) * f2));
                    sb2.append('%');
                    textView.setText(sb2.toString());
                    com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding12 = monthPressureFragment.binding;
                    if (fragmentMonthPressureBinding12 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentMonthPressureBinding12 = null;
                    }
                    android.widget.TextView textView2 = fragmentMonthPressureBinding12.tvValue2;
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(java.lang.Math.round(((i4 * 1.0f) / f) * f2));
                    sb3.append('%');
                    textView2.setText(sb3.toString());
                    com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding13 = monthPressureFragment.binding;
                    if (fragmentMonthPressureBinding13 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentMonthPressureBinding13 = null;
                    }
                    android.widget.TextView textView3 = fragmentMonthPressureBinding13.tvValue4;
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(java.lang.Math.round(((i2 * 1.0f) / f) * f2));
                    sb4.append('%');
                    textView3.setText(sb4.toString());
                    com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding14 = monthPressureFragment.binding;
                    if (fragmentMonthPressureBinding14 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentMonthPressureBinding3 = null;
                    } else {
                        fragmentMonthPressureBinding3 = fragmentMonthPressureBinding14;
                    }
                    android.widget.TextView textView4 = fragmentMonthPressureBinding3.tvValue5;
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    sb5.append(java.lang.Math.round(((i * 1.0f) / f) * f2));
                    sb5.append('%');
                    textView4.setText(sb5.toString());
                    return;
                }
                int[] iArr2 = {0, 0, 0, 0, 0};
                com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding15 = monthPressureFragment.binding;
                if (fragmentMonthPressureBinding15 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthPressureBinding15 = null;
                }
                fragmentMonthPressureBinding15.heartCircleView.dataPressureInit(iArr2);
                com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding16 = monthPressureFragment.binding;
                if (fragmentMonthPressureBinding16 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthPressureBinding16 = null;
                }
                fragmentMonthPressureBinding16.tvValue1.setText("--");
                com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding17 = monthPressureFragment.binding;
                if (fragmentMonthPressureBinding17 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthPressureBinding17 = null;
                }
                fragmentMonthPressureBinding17.tvValue2.setText("--");
                com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding18 = monthPressureFragment.binding;
                if (fragmentMonthPressureBinding18 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthPressureBinding18 = null;
                }
                fragmentMonthPressureBinding18.tvValue4.setText("--");
                com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding19 = monthPressureFragment.binding;
                if (fragmentMonthPressureBinding19 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthPressureBinding19 = null;
                }
                fragmentMonthPressureBinding19.tvValue5.setText("--");
                com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding20 = monthPressureFragment.binding;
                if (fragmentMonthPressureBinding20 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthPressureBinding20 = null;
                }
                fragmentMonthPressureBinding20.pressureTotal.setTitleValue("--");
                com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding21 = monthPressureFragment.binding;
                if (fragmentMonthPressureBinding21 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthPressureBinding21 = null;
                }
                fragmentMonthPressureBinding21.pressureTotal.setTitleUnit("--");
                com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding22 = monthPressureFragment.binding;
                if (fragmentMonthPressureBinding22 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthPressureBinding22 = null;
                }
                fragmentMonthPressureBinding22.pressureAvg.setTitleValue("--");
                com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding23 = monthPressureFragment.binding;
                if (fragmentMonthPressureBinding23 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMonthPressureBinding2 = null;
                } else {
                    fragmentMonthPressureBinding2 = fragmentMonthPressureBinding23;
                }
                fragmentMonthPressureBinding2.pressureAvg.setTitleUnit("--");
                return;
            }
            int[] iArr3 = {0, 0, 0, 0, 0};
            com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding24 = monthPressureFragment.binding;
            if (fragmentMonthPressureBinding24 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthPressureBinding24 = null;
            }
            fragmentMonthPressureBinding24.heartCircleView.dataPressureInit(iArr3);
            com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding25 = monthPressureFragment.binding;
            if (fragmentMonthPressureBinding25 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthPressureBinding25 = null;
            }
            fragmentMonthPressureBinding25.qcPressureChart.setData(new java.util.ArrayList());
            com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding26 = monthPressureFragment.binding;
            if (fragmentMonthPressureBinding26 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthPressureBinding26 = null;
            }
            fragmentMonthPressureBinding26.tvValue1.setText("--");
            com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding27 = monthPressureFragment.binding;
            if (fragmentMonthPressureBinding27 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthPressureBinding27 = null;
            }
            fragmentMonthPressureBinding27.tvValue2.setText("--");
            com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding28 = monthPressureFragment.binding;
            if (fragmentMonthPressureBinding28 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthPressureBinding28 = null;
            }
            fragmentMonthPressureBinding28.tvValue4.setText("--");
            com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding29 = monthPressureFragment.binding;
            if (fragmentMonthPressureBinding29 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthPressureBinding29 = null;
            }
            fragmentMonthPressureBinding29.tvValue5.setText("--");
            com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding30 = monthPressureFragment.binding;
            if (fragmentMonthPressureBinding30 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthPressureBinding30 = null;
            }
            fragmentMonthPressureBinding30.pressureTotal.setTitleValue("--");
            com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding31 = monthPressureFragment.binding;
            if (fragmentMonthPressureBinding31 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthPressureBinding31 = null;
            }
            fragmentMonthPressureBinding31.pressureTotal.setTitleUnit("--");
            com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding32 = monthPressureFragment.binding;
            if (fragmentMonthPressureBinding32 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthPressureBinding32 = null;
            }
            fragmentMonthPressureBinding32.pressureAvg.setTitleValue("--");
            com.qcwireless.qcwatch.databinding.FragmentMonthPressureBinding fragmentMonthPressureBinding33 = monthPressureFragment.binding;
            if (fragmentMonthPressureBinding33 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthPressureBinding = null;
            } else {
                fragmentMonthPressureBinding = fragmentMonthPressureBinding33;
            }
            fragmentMonthPressureBinding.pressureAvg.setTitleUnit("--");
        }
    }

    /* compiled from: MonthPressureFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/pressure/month/MonthPressureFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/pressure/month/MonthPressureFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment();
        }
    }
}
