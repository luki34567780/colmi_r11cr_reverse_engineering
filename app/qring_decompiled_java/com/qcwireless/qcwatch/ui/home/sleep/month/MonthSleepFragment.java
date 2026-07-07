package com.qcwireless.qcwatch.ui.home.sleep.month;

/* compiled from: MonthSleepFragment.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sleep/month/MonthSleepFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentMonthSleepBinding;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/sleep/month/MonthSleepFragmentViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/sleep/month/MonthSleepFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "loadDataOnce", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MonthSleepFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment.Companion(null);
    private com.qcwireless.qcwatch.databinding.FragmentMonthSleepBinding binding;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public MonthSleepFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragmentViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragmentViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragmentViewModel m1175invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragmentViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragmentViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragmentViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentMonthSleepBinding inflate = com.qcwireless.qcwatch.databinding.FragmentMonthSleepBinding.inflate(getLayoutInflater());
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
        com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragmentViewModel viewModel = getViewModel();
        com.qcwireless.qc_utils.date.DateUtil firstDayOfMonth = com.qcwireless.qc_utils.date.DateUtil.getFirstDayOfMonth(new com.qcwireless.qc_utils.date.DateUtil());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfMonth, "getFirstDayOfMonth(DateUtil())");
        viewModel.queryWeekSleepHistory(firstDayOfMonth);
        com.qcwireless.qcwatch.databinding.FragmentMonthSleepBinding fragmentMonthSleepBinding = this.binding;
        if (fragmentMonthSleepBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMonthSleepBinding = null;
        }
        fragmentMonthSleepBinding.qcDateChange.setMonth(new com.qcwireless.qc_utils.date.DateUtil());
        fragmentMonthSleepBinding.qcDateChange.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment$loadDataOnce$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView.QDateBefore
            public void clickBefore(boolean r2, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
                com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragmentViewModel viewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
                viewModel2 = com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment.this.getViewModel();
                com.qcwireless.qc_utils.date.DateUtil firstDayOfMonth2 = com.qcwireless.qc_utils.date.DateUtil.getFirstDayOfMonth(dateUtil);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfMonth2, "getFirstDayOfMonth(dateUtil)");
                viewModel2.queryWeekSleepHistory(firstDayOfMonth2);
            }
        });
        fragmentMonthSleepBinding.monthSleepBarView.setListener(new com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.OnSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment$$ExternalSyntheticLambda1
            @Override // com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.OnSelectedListener
            public final void onSelected(com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean sleepDataBean) {
                com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment.m1174loadDataOnce$lambda2$lambda1(com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment.this, sleepDataBean);
            }
        });
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment.m1173loadDataOnce$lambda14(com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment.this, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-2$lambda-1, reason: not valid java name */
    public static final void m1174loadDataOnce$lambda2$lambda1(com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment monthSleepFragment, com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean sleepDataBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthSleepFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentMonthSleepBinding fragmentMonthSleepBinding = monthSleepFragment.binding;
        if (fragmentMonthSleepBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMonthSleepBinding = null;
        }
        if (sleepDataBean == null) {
            fragmentMonthSleepBinding.tvSleepH.setText("--");
            fragmentMonthSleepBinding.tvSleepMin.setText("--");
            return;
        }
        fragmentMonthSleepBinding.tvSleepRange.setText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(sleepDataBean.getUnixTime(), true)));
        if (sleepDataBean.getTotalTime() > 0) {
            fragmentMonthSleepBinding.tvSleepH.setText(java.lang.String.valueOf(sleepDataBean.getTotalTime() / 60));
            fragmentMonthSleepBinding.tvSleepMin.setText(java.lang.String.valueOf(sleepDataBean.getTotalTime() % 60));
        } else {
            fragmentMonthSleepBinding.tvSleepH.setText("--");
            fragmentMonthSleepBinding.tvSleepMin.setText("--");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-14, reason: not valid java name */
    public static final void m1173loadDataOnce$lambda14(com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment monthSleepFragment, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthSleepFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentMonthSleepBinding fragmentMonthSleepBinding = null;
        if (list != null && (!list.isEmpty())) {
            com.qcwireless.qcwatch.databinding.FragmentMonthSleepBinding fragmentMonthSleepBinding2 = monthSleepFragment.binding;
            if (fragmentMonthSleepBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthSleepBinding2 = null;
            }
            fragmentMonthSleepBinding2.monthSleepBarView.setData(list);
            java.util.Iterator it = list.iterator();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (it.hasNext()) {
                com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean sleepDataBean = (com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean) it.next();
                if (sleepDataBean.getTotalTime() > 0) {
                    i += sleepDataBean.getTotalTime();
                    i3 += sleepDataBean.getDeepTime();
                    i4 += sleepDataBean.getAwake();
                    i2++;
                }
            }
            if (i > 0 && i2 > 0) {
                int i5 = i / i2;
                fragmentMonthSleepBinding2.qcSleep1.setTitleValue(java.lang.String.valueOf(i5 / 60));
                fragmentMonthSleepBinding2.qcSleep1.setValue2(java.lang.String.valueOf(i5 % 60));
                float f = ((r14 * 100) * 1.0f) / i5;
                int i6 = ((i4 / i2) * 100) / i5;
                fragmentMonthSleepBinding2.qcSleep3.setTitleValue(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(f)));
                fragmentMonthSleepBinding2.qcSleep4.setTitleValue(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(((r8 * 100) * 1.0f) / i)));
                int calcSleepScore = com.qcwireless.qcwatch.ui.home.sleep.aigo.AlSleepUtil.calcSleepScore(i5 * 60, (i3 / i2) * 60, (((i - i3) - i4) / i2) * 60, 0);
                fragmentMonthSleepBinding2.qcSleep2.setTitleValue(java.lang.String.valueOf(calcSleepScore));
                if (i5 >= 360) {
                    android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(monthSleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep);
                    if (drawable != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView = fragmentMonthSleepBinding2.qcSleep1;
                        java.lang.String string = monthSleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_126);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_126)");
                        qSleepAnalysisView.setStatus(string, drawable);
                    }
                } else {
                    android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(monthSleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep_1);
                    if (drawable2 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView2 = fragmentMonthSleepBinding2.qcSleep1;
                        java.lang.String string2 = monthSleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_127);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_127)");
                        qSleepAnalysisView2.setStatus(string2, drawable2);
                    }
                }
                if (calcSleepScore < 70) {
                    android.graphics.drawable.Drawable drawable3 = androidx.core.content.ContextCompat.getDrawable(monthSleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep_1);
                    if (drawable3 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView3 = fragmentMonthSleepBinding2.qcSleep2;
                        java.lang.String string3 = monthSleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_127);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_127)");
                        qSleepAnalysisView3.setStatus(string3, drawable3);
                    }
                } else {
                    android.graphics.drawable.Drawable drawable4 = androidx.core.content.ContextCompat.getDrawable(monthSleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep);
                    if (drawable4 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView4 = fragmentMonthSleepBinding2.qcSleep2;
                        java.lang.String string4 = monthSleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_126);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_126)");
                        qSleepAnalysisView4.setStatus(string4, drawable4);
                    }
                }
                if (f < 20.0f) {
                    android.graphics.drawable.Drawable drawable5 = androidx.core.content.ContextCompat.getDrawable(monthSleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep_1);
                    if (drawable5 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView5 = fragmentMonthSleepBinding2.qcSleep3;
                        java.lang.String string5 = monthSleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_127);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.qc_text_127)");
                        qSleepAnalysisView5.setStatus(string5, drawable5);
                    }
                } else {
                    android.graphics.drawable.Drawable drawable6 = androidx.core.content.ContextCompat.getDrawable(monthSleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep);
                    if (drawable6 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView6 = fragmentMonthSleepBinding2.qcSleep3;
                        java.lang.String string6 = monthSleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_126);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.qc_text_126)");
                        qSleepAnalysisView6.setStatus(string6, drawable6);
                    }
                }
                if ((100 - f) - i6 < 70.0f) {
                    android.graphics.drawable.Drawable drawable7 = androidx.core.content.ContextCompat.getDrawable(monthSleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep);
                    if (drawable7 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView7 = fragmentMonthSleepBinding2.qcSleep4;
                        java.lang.String string7 = monthSleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_126);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.qc_text_126)");
                        qSleepAnalysisView7.setStatus(string7, drawable7);
                        return;
                    }
                    return;
                }
                android.graphics.drawable.Drawable drawable8 = androidx.core.content.ContextCompat.getDrawable(monthSleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep);
                if (drawable8 != null) {
                    com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView8 = fragmentMonthSleepBinding2.qcSleep4;
                    java.lang.String string8 = monthSleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_514);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.qc_text_514)");
                    qSleepAnalysisView8.setStatus(string8, drawable8);
                    return;
                }
                return;
            }
            com.qcwireless.qcwatch.databinding.FragmentMonthSleepBinding fragmentMonthSleepBinding3 = monthSleepFragment.binding;
            if (fragmentMonthSleepBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentMonthSleepBinding = fragmentMonthSleepBinding3;
            }
            fragmentMonthSleepBinding.monthSleepBarView.setData(list);
            fragmentMonthSleepBinding.qcSleep1.setTitleValue("--");
            fragmentMonthSleepBinding.qcSleep1.setValue2("--");
            fragmentMonthSleepBinding.qcSleep3.setTitleValue("--");
            fragmentMonthSleepBinding.qcSleep4.setTitleValue("--");
            fragmentMonthSleepBinding.qcSleep2.setTitleValue("--");
            fragmentMonthSleepBinding.qcSleep1.setStatusNull("");
            fragmentMonthSleepBinding.qcSleep2.setStatusNull("");
            fragmentMonthSleepBinding.qcSleep3.setStatusNull("");
            fragmentMonthSleepBinding.qcSleep4.setStatusNull("");
            return;
        }
        com.qcwireless.qcwatch.databinding.FragmentMonthSleepBinding fragmentMonthSleepBinding4 = monthSleepFragment.binding;
        if (fragmentMonthSleepBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentMonthSleepBinding = fragmentMonthSleepBinding4;
        }
        fragmentMonthSleepBinding.monthSleepBarView.setData(list);
        fragmentMonthSleepBinding.qcSleep1.setTitleValue("--");
        fragmentMonthSleepBinding.qcSleep1.setValue2("--");
        fragmentMonthSleepBinding.qcSleep3.setTitleValue("--");
        fragmentMonthSleepBinding.qcSleep4.setTitleValue("--");
        fragmentMonthSleepBinding.qcSleep2.setTitleValue("--");
    }

    /* compiled from: MonthSleepFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sleep/month/MonthSleepFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/sleep/month/MonthSleepFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment();
        }
    }
}
