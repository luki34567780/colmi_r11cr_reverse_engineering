package com.qcwireless.qcwatch.ui.home.sleep.day;

/* compiled from: DaySleepFragment.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sleep/day/DaySleepFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentDaySleepBinding;", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/sleep/day/DaySleepFragmentViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/sleep/day/DaySleepFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "loadDataOnce", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DaySleepFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment.Companion(null);
    private com.qcwireless.qcwatch.databinding.FragmentDaySleepBinding binding;
    private com.qcwireless.qc_utils.date.DateUtil date = new com.qcwireless.qc_utils.date.DateUtil();

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public DaySleepFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragmentViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragmentViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragmentViewModel m1171invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragmentViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragmentViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragmentViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentDaySleepBinding inflate = com.qcwireless.qcwatch.databinding.FragmentDaySleepBinding.inflate(getLayoutInflater());
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
        getViewModel().queryLastData();
        final com.qcwireless.qcwatch.databinding.FragmentDaySleepBinding fragmentDaySleepBinding = this.binding;
        if (fragmentDaySleepBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDaySleepBinding = null;
        }
        fragmentDaySleepBinding.qcDateChange.setDateUtil(new com.qcwireless.qc_utils.date.DateUtil());
        fragmentDaySleepBinding.qcDateChange.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment$loadDataOnce$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore
            public void clickBefore(boolean r1, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
                com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragmentViewModel viewModel;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
                com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment.this.date = dateUtil;
                fragmentDaySleepBinding.qcDateChange.setDateUtil(dateUtil);
                viewModel = com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment.this.getViewModel();
                viewModel.showDaySleepView(dateUtil);
            }
        });
        fragmentDaySleepBinding.daySleepBarView.setListener(new com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.OnSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment$$ExternalSyntheticLambda2
            @Override // com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.OnSelectedListener
            public final void onSelected(com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean sleepDataBean) {
                com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment.m1168loadDataOnce$lambda1$lambda0(com.qcwireless.qcwatch.databinding.FragmentDaySleepBinding.this, this, sleepDataBean);
            }
        });
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getLastDate().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment.m1170loadDataOnce$lambda2(com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment.this, (com.qcwireless.qc_utils.date.DateUtil) obj);
            }
        });
        getViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment.m1169loadDataOnce$lambda12(com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment.this, (com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-1$lambda-0, reason: not valid java name */
    public static final void m1168loadDataOnce$lambda1$lambda0(com.qcwireless.qcwatch.databinding.FragmentDaySleepBinding fragmentDaySleepBinding, com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment daySleepFragment, com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean sleepDataBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentDaySleepBinding, "$this_run");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daySleepFragment, "this$0");
        if (sleepDataBean != null) {
            com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(sleepDataBean.getSleepStart(), true);
            com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(sleepDataBean.getSleepEnd(), true);
            fragmentDaySleepBinding.tvSleepRange.setText(dateUtil.getHHmmDate() + '~' + dateUtil2.getHHmmDate());
            fragmentDaySleepBinding.tvSleepMin.setText(java.lang.String.valueOf((sleepDataBean.getSleepEnd() - sleepDataBean.getSleepStart()) / ((long) 60)));
            int type = sleepDataBean.getType();
            if (type == 1) {
                fragmentDaySleepBinding.tvSleepType.setText(daySleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_114));
                fragmentDaySleepBinding.tvSleepMin.setTextColor(androidx.core.content.ContextCompat.getColor(daySleepFragment.getActivity(), com.qcwireless.qcwatch.R.color.q_view_sleep_1));
                return;
            }
            if (type == 2) {
                fragmentDaySleepBinding.tvSleepType.setText(daySleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_115));
                fragmentDaySleepBinding.tvSleepMin.setTextColor(androidx.core.content.ContextCompat.getColor(daySleepFragment.getActivity(), com.qcwireless.qcwatch.R.color.q_view_sleep_2));
            } else if (type == 3) {
                fragmentDaySleepBinding.tvSleepType.setText(daySleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_116));
                fragmentDaySleepBinding.tvSleepMin.setTextColor(androidx.core.content.ContextCompat.getColor(daySleepFragment.getActivity(), com.qcwireless.qcwatch.R.color.q_view_sleep_3));
            } else {
                if (type != 4) {
                    return;
                }
                fragmentDaySleepBinding.tvSleepType.setText("");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-2, reason: not valid java name */
    public static final void m1170loadDataOnce$lambda2(com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment daySleepFragment, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daySleepFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dateUtil, "it");
        daySleepFragment.date = dateUtil;
        com.qcwireless.qcwatch.databinding.FragmentDaySleepBinding fragmentDaySleepBinding = daySleepFragment.binding;
        if (fragmentDaySleepBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDaySleepBinding = null;
        }
        fragmentDaySleepBinding.qcDateChange.setDateUtil(dateUtil);
        daySleepFragment.getViewModel().showDaySleepView(dateUtil);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-12, reason: not valid java name */
    public static final void m1169loadDataOnce$lambda12(com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment daySleepFragment, final com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean sleepViewBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daySleepFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentDaySleepBinding fragmentDaySleepBinding = daySleepFragment.binding;
        if (fragmentDaySleepBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDaySleepBinding = null;
        }
        int[] iArr = {0, 0, 0, 0, 0};
        if ((sleepViewBean != null ? sleepViewBean.getData() : null) != null) {
            if (!(sleepViewBean != null ? sleepViewBean.getData() : null).isEmpty()) {
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUiDelay(fragmentDaySleepBinding, 100L, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.databinding.FragmentDaySleepBinding, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment$loadDataOnce$3$1$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.databinding.FragmentDaySleepBinding) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.databinding.FragmentDaySleepBinding fragmentDaySleepBinding2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentDaySleepBinding2, "$this$ktxRunOnUiDelay");
                        fragmentDaySleepBinding2.daySleepBarView.setData(com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean.this.getStartTime(), com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean.this.getEndTime(), com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean.this.getData());
                    }
                });
                fragmentDaySleepBinding.qcSleep1.setTitleValue(java.lang.String.valueOf((sleepViewBean.getTotalSleep() / 60) / 60));
                fragmentDaySleepBinding.qcSleep1.setValue2(java.lang.String.valueOf((sleepViewBean.getTotalSleep() / 60) % 60));
                float deepSleep = ((sleepViewBean.getDeepSleep() * 100) * 1.0f) / sleepViewBean.getTotalSleep();
                float awakeSleep = ((sleepViewBean.getAwakeSleep() * 100) * 1.0f) / sleepViewBean.getTotalSleep();
                int calcSleepScore = com.qcwireless.qcwatch.ui.home.sleep.aigo.AlSleepUtil.calcSleepScore(sleepViewBean.getTotalSleep(), sleepViewBean.getDeepSleep(), sleepViewBean.getLightSleep(), 0);
                fragmentDaySleepBinding.qcSleep2.setTitleValue(java.lang.String.valueOf(calcSleepScore));
                fragmentDaySleepBinding.qcSleep3.setTitleValue(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(deepSleep)));
                fragmentDaySleepBinding.qcSleep4.setTitleValue(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(((sleepViewBean.getLightSleep() * 100) * 1.0f) / sleepViewBean.getTotalSleep())));
                fragmentDaySleepBinding.tvSleepDeep2.setText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStrShow(sleepViewBean.getDeepSleep() / 60));
                fragmentDaySleepBinding.tvSleepLight2.setText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStrShow(sleepViewBean.getLightSleep() / 60));
                fragmentDaySleepBinding.tvSleepAwake2.setText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStrShow(sleepViewBean.getAwakeSleep() / 60));
                if (sleepViewBean.getTotalSleep() / 60 >= 360) {
                    android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(daySleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep);
                    if (drawable != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView = fragmentDaySleepBinding.qcSleep1;
                        java.lang.String string = daySleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_126);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_126)");
                        qSleepAnalysisView.setStatus(string, drawable);
                    }
                } else {
                    android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(daySleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep_1);
                    if (drawable2 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView2 = fragmentDaySleepBinding.qcSleep1;
                        java.lang.String string2 = daySleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_127);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_127)");
                        qSleepAnalysisView2.setStatus(string2, drawable2);
                    }
                }
                if (calcSleepScore < 70) {
                    android.graphics.drawable.Drawable drawable3 = androidx.core.content.ContextCompat.getDrawable(daySleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep_1);
                    if (drawable3 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView3 = fragmentDaySleepBinding.qcSleep2;
                        java.lang.String string3 = daySleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_127);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_127)");
                        qSleepAnalysisView3.setStatus(string3, drawable3);
                    }
                } else {
                    android.graphics.drawable.Drawable drawable4 = androidx.core.content.ContextCompat.getDrawable(daySleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep);
                    if (drawable4 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView4 = fragmentDaySleepBinding.qcSleep2;
                        java.lang.String string4 = daySleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_126);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_126)");
                        qSleepAnalysisView4.setStatus(string4, drawable4);
                    }
                }
                if (deepSleep < 20.0f) {
                    android.graphics.drawable.Drawable drawable5 = androidx.core.content.ContextCompat.getDrawable(daySleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep_1);
                    if (drawable5 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView5 = fragmentDaySleepBinding.qcSleep3;
                        java.lang.String string5 = daySleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_127);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.qc_text_127)");
                        qSleepAnalysisView5.setStatus(string5, drawable5);
                    }
                } else {
                    android.graphics.drawable.Drawable drawable6 = androidx.core.content.ContextCompat.getDrawable(daySleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep);
                    if (drawable6 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView6 = fragmentDaySleepBinding.qcSleep3;
                        java.lang.String string6 = daySleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_126);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.qc_text_126)");
                        qSleepAnalysisView6.setStatus(string6, drawable6);
                    }
                }
                if ((100 - deepSleep) - awakeSleep < 70.0f) {
                    android.graphics.drawable.Drawable drawable7 = androidx.core.content.ContextCompat.getDrawable(daySleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep);
                    if (drawable7 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView7 = fragmentDaySleepBinding.qcSleep4;
                        java.lang.String string7 = daySleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_126);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.qc_text_126)");
                        qSleepAnalysisView7.setStatus(string7, drawable7);
                    }
                } else {
                    android.graphics.drawable.Drawable drawable8 = androidx.core.content.ContextCompat.getDrawable(daySleepFragment.getActivity(), com.qcwireless.qcwatch.R.drawable.bg_rect_corner_8_sleep);
                    if (drawable8 != null) {
                        com.qcwireless.qcwatch.ui.base.view.QSleepAnalysisView qSleepAnalysisView8 = fragmentDaySleepBinding.qcSleep4;
                        java.lang.String string8 = daySleepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_514);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.qc_text_514)");
                        qSleepAnalysisView8.setStatus(string8, drawable8);
                    }
                }
                iArr[0] = sleepViewBean.getDeepSleep() / 60;
                iArr[1] = sleepViewBean.getLightSleep() / 60;
                iArr[2] = sleepViewBean.getAwakeSleep() / 60;
                fragmentDaySleepBinding.homeSleepView.dataInit(iArr);
                return;
            }
        }
        fragmentDaySleepBinding.homeSleepView.dataInit(iArr);
        fragmentDaySleepBinding.daySleepBarView.setData(1612886400L, 1612886400L, sleepViewBean.getData());
        fragmentDaySleepBinding.qcSleep1.setTitleValue("--");
        fragmentDaySleepBinding.qcSleep1.setValue2("--");
        fragmentDaySleepBinding.qcSleep3.setTitleValue("--");
        fragmentDaySleepBinding.qcSleep4.setTitleValue("--");
        fragmentDaySleepBinding.qcSleep2.setTitleValue("--");
        fragmentDaySleepBinding.tvSleepType.setText("");
        fragmentDaySleepBinding.tvSleepRange.setText("");
        fragmentDaySleepBinding.tvSleepMin.setText("--");
        fragmentDaySleepBinding.qcSleep1.setStatusNull("");
        fragmentDaySleepBinding.qcSleep2.setStatusNull("");
        fragmentDaySleepBinding.qcSleep3.setStatusNull("");
        fragmentDaySleepBinding.qcSleep4.setStatusNull("");
        fragmentDaySleepBinding.tvSleepDeep2.setText("--");
        fragmentDaySleepBinding.tvSleepLight2.setText("--");
        fragmentDaySleepBinding.tvSleepAwake2.setText("--");
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.HomeStepRefreshEvent) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "-----HomeStepRefreshEvent");
            getViewModel().queryLastData();
        }
    }

    /* compiled from: DaySleepFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sleep/day/DaySleepFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/sleep/day/DaySleepFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment();
        }
    }
}
