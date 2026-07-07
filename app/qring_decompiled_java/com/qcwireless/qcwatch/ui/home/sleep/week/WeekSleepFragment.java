package com.qcwireless.qcwatch.ui.home.sleep.week;

/* compiled from: WeekSleepFragment.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sleep/week/WeekSleepFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentWeekSleepBinding;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/sleep/week/WeekSleepFragmentViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/sleep/week/WeekSleepFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "weeks", "", "", "[Ljava/lang/String;", "loadDataOnce", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WeekSleepFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment.Companion(null);
    private com.qcwireless.qcwatch.databinding.FragmentWeekSleepBinding binding;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private java.lang.String[] weeks;

    public WeekSleepFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel m1179invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentWeekSleepBinding inflate = com.qcwireless.qcwatch.databinding.FragmentWeekSleepBinding.inflate(getLayoutInflater());
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
        com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel viewModel = getViewModel();
        com.qcwireless.qc_utils.date.DateUtil firstDayOfWeek = com.qcwireless.qc_utils.date.DateUtil.firstDayOfWeek();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfWeek, "firstDayOfWeek()");
        viewModel.queryWeekSleepHistory(firstDayOfWeek);
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
        com.qcwireless.qcwatch.databinding.FragmentWeekSleepBinding fragmentWeekSleepBinding = this.binding;
        if (fragmentWeekSleepBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekSleepBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView qDateWeekSwitchView = fragmentWeekSleepBinding.qcDateChange;
        com.qcwireless.qc_utils.date.DateUtil firstDayOfWeek2 = com.qcwireless.qc_utils.date.DateUtil.firstDayOfWeek();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfWeek2, "firstDayOfWeek()");
        qDateWeekSwitchView.setWeekDayStart(firstDayOfWeek2);
        fragmentWeekSleepBinding.qcDateChange.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment$loadDataOnce$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView.QDateBefore
            public void clickBefore(boolean r1, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
                com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel viewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
                viewModel2 = com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment.this.getViewModel();
                viewModel2.queryWeekSleepHistory(dateUtil);
            }
        });
        fragmentWeekSleepBinding.weekSleepBarView.setListener(new com.qcwireless.qcwatch.ui.base.view.QSleepWeekBarView.OnSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment$$ExternalSyntheticLambda1
            @Override // com.qcwireless.qcwatch.ui.base.view.QSleepWeekBarView.OnSelectedListener
            public final void onSelected(com.qcwireless.qcwatch.ui.base.view.QSleepWeekBarView.SleepDataBean sleepDataBean) {
                com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment.m1178loadDataOnce$lambda2$lambda1(com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment.this, sleepDataBean);
            }
        });
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment.m1177loadDataOnce$lambda14(com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment.this, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-2$lambda-1, reason: not valid java name */
    public static final void m1178loadDataOnce$lambda2$lambda1(com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment weekSleepFragment, com.qcwireless.qcwatch.ui.base.view.QSleepWeekBarView.SleepDataBean sleepDataBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weekSleepFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentWeekSleepBinding fragmentWeekSleepBinding = weekSleepFragment.binding;
        java.lang.String[] strArr = null;
        if (fragmentWeekSleepBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekSleepBinding = null;
        }
        int whatDay = com.qcwireless.qc_utils.date.DateUtil.getWhatDay(sleepDataBean.getUnixTime());
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(sleepDataBean.getUnixTime(), true);
        android.widget.TextView textView = fragmentWeekSleepBinding.tvSleepRange;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(dateUtil));
        sb.append(' ');
        java.lang.String[] strArr2 = weekSleepFragment.weeks;
        if (strArr2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("weeks");
        } else {
            strArr = strArr2;
        }
        sb.append(strArr[whatDay]);
        textView.setText(sb.toString());
        if (sleepDataBean.getTotalTime() > 0) {
            fragmentWeekSleepBinding.tvSleepH.setText(java.lang.String.valueOf(sleepDataBean.getTotalTime() / 60));
            fragmentWeekSleepBinding.tvSleepMin.setText(java.lang.String.valueOf(sleepDataBean.getTotalTime() % 60));
        } else {
            fragmentWeekSleepBinding.tvSleepH.setText("--");
            fragmentWeekSleepBinding.tvSleepMin.setText("--");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-14, reason: not valid java name */
    public static final void m1177loadDataOnce$lambda14(com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment weekSleepFragment, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weekSleepFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentWeekSleepBinding fragmentWeekSleepBinding = null;
        if (list != null && (!list.isEmpty())) {
            com.qcwireless.qcwatch.databinding.FragmentWeekSleepBinding fragmentWeekSleepBinding2 = weekSleepFragment.binding;
            if (fragmentWeekSleepBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekSleepBinding2 = null;
            }
            fragmentWeekSleepBinding2.weekSleepBarView.setData(list);
            java.util.Iterator it = list.iterator();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (it.hasNext()) {
                com.qcwireless.qcwatch.ui.base.view.QSleepWeekBarView.SleepDataBean sleepDataBean = (com.qcwireless.qcwatch.ui.base.view.QSleepWeekBarView.SleepDataBean) it.next();
                if (sleepDataBean.getTotalTime() > 0) {
                    i += sleepDataBean.getTotalTime();
                    i3 += sleepDataBean.getDeepTime();
                    i4 += sleepDataBean.getAwake();
                    i2++;
                }
            }
            if (i > 0 && i2 > 0) {
                int i5 = i / i2;
                fragmentWeekSleepBinding2.qcSleep1.setTitleValue(java.lang.String.valueOf(i5 / 60));
                fragmentWeekSleepBinding2.qcSleep1.setValue2(java.lang.String.valueOf(i5 % 60));
                float f = ((r14 * 100) * 1.0f) / i5;
                int i6 = ((i4 / i2) * 100) / i5;
                fragmentWeekSleepBinding2.qcSleep3.setTitleValue(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(f)));
                fragmentWeekSleepBinding2.qcSleep4.setTitleValue(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(((r8 * 100) * 1.0f) / i)));
                int calcSleepScore = com.qcwireless.qcwatch.ui.home.sleep.aigo.AlSleepUtil.calcSleepScore(i5 * 60, (i3 / i2) * 60, (((i - i3) - i4) / i2) * 60, 0);
                fragmentWeekSleepBinding2.qcSleep2.setTitleValue(java.lang.String.valueOf(calcSleepScore));
                if (i5 >= 360) {
                    android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(weekSleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep);
                    if (drawable != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView = fragmentWeekSleepBinding2.qcSleep1;
                        java.lang.String string = weekSleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_126);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_126)");
                        qSleepAnalysisView.setStatus(string, drawable);
                    }
                } else {
                    android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(weekSleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep_1);
                    if (drawable2 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView2 = fragmentWeekSleepBinding2.qcSleep1;
                        java.lang.String string2 = weekSleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_127);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_127)");
                        qSleepAnalysisView2.setStatus(string2, drawable2);
                    }
                }
                if (calcSleepScore < 70) {
                    android.graphics.drawable.Drawable drawable3 = androidx.core.content.ContextCompat.getDrawable(weekSleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep_1);
                    if (drawable3 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView3 = fragmentWeekSleepBinding2.qcSleep2;
                        java.lang.String string3 = weekSleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_127);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_127)");
                        qSleepAnalysisView3.setStatus(string3, drawable3);
                    }
                } else {
                    android.graphics.drawable.Drawable drawable4 = androidx.core.content.ContextCompat.getDrawable(weekSleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep);
                    if (drawable4 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView4 = fragmentWeekSleepBinding2.qcSleep2;
                        java.lang.String string4 = weekSleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_126);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_126)");
                        qSleepAnalysisView4.setStatus(string4, drawable4);
                    }
                }
                if (f < 20.0f) {
                    android.graphics.drawable.Drawable drawable5 = androidx.core.content.ContextCompat.getDrawable(weekSleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep_1);
                    if (drawable5 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView5 = fragmentWeekSleepBinding2.qcSleep3;
                        java.lang.String string5 = weekSleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_127);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.qc_text_127)");
                        qSleepAnalysisView5.setStatus(string5, drawable5);
                    }
                } else {
                    android.graphics.drawable.Drawable drawable6 = androidx.core.content.ContextCompat.getDrawable(weekSleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep);
                    if (drawable6 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView6 = fragmentWeekSleepBinding2.qcSleep3;
                        java.lang.String string6 = weekSleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_126);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.qc_text_126)");
                        qSleepAnalysisView6.setStatus(string6, drawable6);
                    }
                }
                if ((100 - f) - i6 < 70.0f) {
                    android.graphics.drawable.Drawable drawable7 = androidx.core.content.ContextCompat.getDrawable(weekSleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep);
                    if (drawable7 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView7 = fragmentWeekSleepBinding2.qcSleep4;
                        java.lang.String string7 = weekSleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_126);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.qc_text_126)");
                        qSleepAnalysisView7.setStatus(string7, drawable7);
                        return;
                    }
                    return;
                }
                android.graphics.drawable.Drawable drawable8 = androidx.core.content.ContextCompat.getDrawable(weekSleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep);
                if (drawable8 != null) {
                    com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView8 = fragmentWeekSleepBinding2.qcSleep4;
                    java.lang.String string8 = weekSleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_514);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.qc_text_514)");
                    qSleepAnalysisView8.setStatus(string8, drawable8);
                    return;
                }
                return;
            }
            com.qcwireless.qcwatch.databinding.FragmentWeekSleepBinding fragmentWeekSleepBinding3 = weekSleepFragment.binding;
            if (fragmentWeekSleepBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentWeekSleepBinding = fragmentWeekSleepBinding3;
            }
            fragmentWeekSleepBinding.weekSleepBarView.setData(list);
            fragmentWeekSleepBinding.qcSleep1.setTitleValue("--");
            fragmentWeekSleepBinding.qcSleep1.setValue2("--");
            fragmentWeekSleepBinding.qcSleep3.setTitleValue("--");
            fragmentWeekSleepBinding.qcSleep4.setTitleValue("--");
            fragmentWeekSleepBinding.qcSleep2.setTitleValue("--");
            fragmentWeekSleepBinding.qcSleep1.setStatusNull("");
            fragmentWeekSleepBinding.qcSleep2.setStatusNull("");
            fragmentWeekSleepBinding.qcSleep3.setStatusNull("");
            fragmentWeekSleepBinding.qcSleep4.setStatusNull("");
            return;
        }
        com.qcwireless.qcwatch.databinding.FragmentWeekSleepBinding fragmentWeekSleepBinding4 = weekSleepFragment.binding;
        if (fragmentWeekSleepBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentWeekSleepBinding = fragmentWeekSleepBinding4;
        }
        fragmentWeekSleepBinding.weekSleepBarView.setData(list);
        fragmentWeekSleepBinding.qcSleep1.setTitleValue("--");
        fragmentWeekSleepBinding.qcSleep1.setValue2("--");
        fragmentWeekSleepBinding.qcSleep3.setTitleValue("--");
        fragmentWeekSleepBinding.qcSleep4.setTitleValue("--");
        fragmentWeekSleepBinding.qcSleep2.setTitleValue("--");
    }

    /* compiled from: WeekSleepFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sleep/week/WeekSleepFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/sleep/week/WeekSleepFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment();
        }
    }
}
