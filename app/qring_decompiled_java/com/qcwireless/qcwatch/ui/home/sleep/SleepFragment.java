package com.qcwireless.qcwatch.ui.home.sleep;

/* compiled from: SleepFragment.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sleep/SleepFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentSleepBinding;", "daySleepFragment", "Lcom/qcwireless/qcwatch/ui/home/sleep/day/DaySleepFragment;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "monthSleepFragment", "Lcom/qcwireless/qcwatch/ui/home/sleep/month/MonthSleepFragment;", "titleList", "", "", "[Ljava/lang/String;", "weekSleepFragment", "Lcom/qcwireless/qcwatch/ui/home/sleep/week/WeekSleepFragment;", "hideFragments", "", "transaction", "Landroidx/fragment/app/FragmentTransaction;", "loadDataOnce", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SleepFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.sleep.SleepFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.sleep.SleepFragment.Companion(null);
    private com.qcwireless.qcwatch.databinding.FragmentSleepBinding binding;
    private com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment daySleepFragment;
    private androidx.fragment.app.FragmentManager fragmentManager;
    private com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment monthSleepFragment;
    private java.lang.String[] titleList;
    private com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment weekSleepFragment;

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentSleepBinding inflate = com.qcwireless.qcwatch.databinding.FragmentSleepBinding.inflate(inflater, container, false);
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
        com.qcwireless.qcwatch.databinding.FragmentSleepBinding fragmentSleepBinding = this.binding;
        java.lang.String[] strArr = null;
        if (fragmentSleepBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentSleepBinding = null;
        }
        fragmentSleepBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_84));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentSleepBinding.titleBar.divider);
        com.qcwireless.qcwatch.base.view.ViewKt.invisible(fragmentSleepBinding.titleBar.ivNavigateBefore);
        com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView qSwitchButtonView = fragmentSleepBinding.sleepQsvView;
        java.lang.String[] strArr2 = this.titleList;
        if (strArr2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("titleList");
        } else {
            strArr = strArr2;
        }
        qSwitchButtonView.setTitle(strArr);
        fragmentSleepBinding.sleepQsvView.setActivity((com.qcwireless.qcwatch.ui.activity.MainActivity) getActivity());
        fragmentSleepBinding.sleepQsvView.select(0, true);
        fragmentSleepBinding.sleepQsvView.setOnTabSelectedListener(new com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView.OnTabSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.sleep.SleepFragment$loadDataOnce$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView.OnTabSelectedListener
            public void onTabSelected(int index) {
                androidx.fragment.app.FragmentManager fragmentManager;
                com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment daySleepFragment;
                com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment daySleepFragment2;
                com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment daySleepFragment3;
                com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment weekSleepFragment;
                com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment weekSleepFragment2;
                com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment weekSleepFragment3;
                com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment monthSleepFragment;
                com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment monthSleepFragment2;
                com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment monthSleepFragment3;
                fragmentManager = com.qcwireless.qcwatch.ui.home.sleep.SleepFragment.this.fragmentManager;
                kotlin.jvm.internal.Intrinsics.checkNotNull(fragmentManager);
                androidx.fragment.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                com.qcwireless.qcwatch.ui.home.sleep.SleepFragment sleepFragment = com.qcwireless.qcwatch.ui.home.sleep.SleepFragment.this;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(beginTransaction, "this");
                sleepFragment.hideFragments(beginTransaction);
                if (index == 0) {
                    daySleepFragment = sleepFragment.daySleepFragment;
                    if (daySleepFragment == null) {
                        sleepFragment.daySleepFragment = com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment.INSTANCE.newInstance();
                        daySleepFragment3 = sleepFragment.daySleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(daySleepFragment3);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.sleepContainer, daySleepFragment3);
                    } else {
                        daySleepFragment2 = sleepFragment.daySleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(daySleepFragment2);
                        beginTransaction.show(daySleepFragment2);
                    }
                } else if (index == 1) {
                    weekSleepFragment = sleepFragment.weekSleepFragment;
                    if (weekSleepFragment == null) {
                        sleepFragment.weekSleepFragment = com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment.INSTANCE.newInstance();
                        weekSleepFragment3 = sleepFragment.weekSleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(weekSleepFragment3);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.sleepContainer, weekSleepFragment3);
                    } else {
                        weekSleepFragment2 = sleepFragment.weekSleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(weekSleepFragment2);
                        beginTransaction.show(weekSleepFragment2);
                    }
                } else if (index == 2) {
                    monthSleepFragment = sleepFragment.monthSleepFragment;
                    if (monthSleepFragment == null) {
                        sleepFragment.monthSleepFragment = com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment.INSTANCE.newInstance();
                        monthSleepFragment3 = sleepFragment.monthSleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(monthSleepFragment3);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.sleepContainer, monthSleepFragment3);
                    } else {
                        monthSleepFragment2 = sleepFragment.monthSleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(monthSleepFragment2);
                        beginTransaction.show(monthSleepFragment2);
                    }
                }
                beginTransaction.commitAllowingStateLoss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideFragments(androidx.fragment.app.FragmentTransaction transaction) {
        com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment daySleepFragment = this.daySleepFragment;
        if (daySleepFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(daySleepFragment);
            transaction.hide(daySleepFragment);
        }
        com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment weekSleepFragment = this.weekSleepFragment;
        if (weekSleepFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(weekSleepFragment);
            transaction.hide(weekSleepFragment);
        }
        com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment monthSleepFragment = this.monthSleepFragment;
        if (monthSleepFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(monthSleepFragment);
            transaction.hide(monthSleepFragment);
        }
    }

    /* compiled from: SleepFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sleep/SleepFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/sleep/SleepFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.sleep.SleepFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.sleep.SleepFragment();
        }
    }
}
