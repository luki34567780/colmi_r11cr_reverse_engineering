package com.qcwireless.qcwatch.ui.home.step;

/* compiled from: StepFragment.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/step/StepFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentStepBinding;", "daySleepFragment", "Lcom/qcwireless/qcwatch/ui/home/step/day/DayStepFragment;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "monthSleepFragment", "Lcom/qcwireless/qcwatch/ui/home/step/month/MonthStepFragment;", "titleList", "", "", "[Ljava/lang/String;", "weekSleepFragment", "Lcom/qcwireless/qcwatch/ui/home/step/week/WeekStepFragment;", "hideFragments", "", "transaction", "Landroidx/fragment/app/FragmentTransaction;", "loadDataOnce", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class StepFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.step.StepFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.step.StepFragment.Companion(null);
    private com.qcwireless.qcwatch.databinding.FragmentStepBinding binding;
    private com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment daySleepFragment;
    private androidx.fragment.app.FragmentManager fragmentManager;
    private com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment monthSleepFragment;
    private java.lang.String[] titleList;
    private com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment weekSleepFragment;

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentStepBinding inflate = com.qcwireless.qcwatch.databinding.FragmentStepBinding.inflate(inflater, container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
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
        this.fragmentManager = getChildFragmentManager();
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_117);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_117)");
        java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_105);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_105)");
        java.lang.String string3 = getString(com.qcwireless.qcwatch.R.string.qc_text_106);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_106)");
        this.titleList = new java.lang.String[]{string, string2, string3};
        com.qcwireless.qcwatch.databinding.FragmentStepBinding fragmentStepBinding = this.binding;
        java.lang.String[] strArr = null;
        if (fragmentStepBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentStepBinding = null;
        }
        fragmentStepBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_6666066));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentStepBinding.titleBar.divider);
        com.qcwireless.qcwatch.base.view.ViewKt.invisible(fragmentStepBinding.titleBar.ivNavigateBefore);
        com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView qSwitchButtonView = fragmentStepBinding.stepQsvView;
        java.lang.String[] strArr2 = this.titleList;
        if (strArr2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("titleList");
        } else {
            strArr = strArr2;
        }
        qSwitchButtonView.setTitle(strArr);
        fragmentStepBinding.stepQsvView.setActivity((com.qcwireless.qcwatch.ui.activity.MainActivity) getActivity());
        fragmentStepBinding.stepQsvView.select(0, true);
        fragmentStepBinding.stepQsvView.setOnTabSelectedListener(new com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView.OnTabSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.step.StepFragment$loadDataOnce$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView.OnTabSelectedListener
            public void onTabSelected(int index) {
                androidx.fragment.app.FragmentManager fragmentManager;
                com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment dayStepFragment;
                com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment dayStepFragment2;
                com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment dayStepFragment3;
                com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment weekStepFragment;
                com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment weekStepFragment2;
                com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment weekStepFragment3;
                com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment monthStepFragment;
                com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment monthStepFragment2;
                com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment monthStepFragment3;
                fragmentManager = com.qcwireless.qcwatch.ui.home.step.StepFragment.this.fragmentManager;
                kotlin.jvm.internal.Intrinsics.checkNotNull(fragmentManager);
                androidx.fragment.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                com.qcwireless.qcwatch.ui.home.step.StepFragment stepFragment = com.qcwireless.qcwatch.ui.home.step.StepFragment.this;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(beginTransaction, "this");
                stepFragment.hideFragments(beginTransaction);
                if (index == 0) {
                    dayStepFragment = stepFragment.daySleepFragment;
                    if (dayStepFragment == null) {
                        stepFragment.daySleepFragment = com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment.INSTANCE.newInstance();
                        dayStepFragment3 = stepFragment.daySleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(dayStepFragment3);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.stepContainer, dayStepFragment3);
                    } else {
                        dayStepFragment2 = stepFragment.daySleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(dayStepFragment2);
                        beginTransaction.show(dayStepFragment2);
                    }
                    org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.HomeStepRefreshEvent());
                } else if (index == 1) {
                    weekStepFragment = stepFragment.weekSleepFragment;
                    if (weekStepFragment == null) {
                        stepFragment.weekSleepFragment = com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment.INSTANCE.newInstance();
                        weekStepFragment3 = stepFragment.weekSleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(weekStepFragment3);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.stepContainer, weekStepFragment3);
                    } else {
                        weekStepFragment2 = stepFragment.weekSleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(weekStepFragment2);
                        beginTransaction.show(weekStepFragment2);
                    }
                    org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.HomeStepRefreshEvent());
                } else if (index == 2) {
                    monthStepFragment = stepFragment.monthSleepFragment;
                    if (monthStepFragment == null) {
                        stepFragment.monthSleepFragment = com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment.INSTANCE.newInstance();
                        monthStepFragment3 = stepFragment.monthSleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(monthStepFragment3);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.stepContainer, monthStepFragment3);
                    } else {
                        monthStepFragment2 = stepFragment.monthSleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(monthStepFragment2);
                        beginTransaction.show(monthStepFragment2);
                    }
                    org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.HomeStepRefreshEvent());
                }
                beginTransaction.commitAllowingStateLoss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideFragments(androidx.fragment.app.FragmentTransaction transaction) {
        com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment dayStepFragment = this.daySleepFragment;
        if (dayStepFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(dayStepFragment);
            transaction.hide(dayStepFragment);
        }
        com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragment weekStepFragment = this.weekSleepFragment;
        if (weekStepFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(weekStepFragment);
            transaction.hide(weekStepFragment);
        }
        com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragment monthStepFragment = this.monthSleepFragment;
        if (monthStepFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(monthStepFragment);
            transaction.hide(monthStepFragment);
        }
    }

    /* compiled from: StepFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/step/StepFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/step/StepFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.step.StepFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.step.StepFragment();
        }
    }
}
