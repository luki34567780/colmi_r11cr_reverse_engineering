package com.qcwireless.qcwatch.ui.home.sleep;

/* compiled from: SleepActivity.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001bH\u0015J\b\u0010\u001e\u001a\u00020\u0016H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082.¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sleep/SleepActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivitySleepBinding;", "daySleepFragment", "Lcom/qcwireless/qcwatch/ui/home/sleep/day/DaySleepFragment;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager$delegate", "Lkotlin/Lazy;", "monthSleepFragment", "Lcom/qcwireless/qcwatch/ui/home/sleep/month/MonthSleepFragment;", "titleList", "", "", "[Ljava/lang/String;", "weekSleepFragment", "Lcom/qcwireless/qcwatch/ui/home/sleep/week/WeekSleepFragment;", "hideFragments", "", "transaction", "Landroidx/fragment/app/FragmentTransaction;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SleepActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivitySleepBinding binding;
    private com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment daySleepFragment;

    /* renamed from: fragmentManager$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy fragmentManager = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.fragment.app.FragmentManager>() { // from class: com.qcwireless.qcwatch.ui.home.sleep.SleepActivity$fragmentManager$2
        {
            super(0);
        }

        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.FragmentManager m1166invoke() {
            androidx.fragment.app.FragmentManager supportFragmentManager = com.qcwireless.qcwatch.ui.home.sleep.SleepActivity.this.getSupportFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            return supportFragmentManager;
        }
    });
    private com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment monthSleepFragment;
    private java.lang.String[] titleList;
    private com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment weekSleepFragment;

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.fragment.app.FragmentManager getFragmentManager() {
        return (androidx.fragment.app.FragmentManager) this.fragmentManager.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivitySleepBinding inflate = com.qcwireless.qcwatch.databinding.ActivitySleepBinding.inflate(getLayoutInflater());
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

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        setStatusBarBackground(com.qcwireless.qcwatch.R.color.sleep_bg);
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_117);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_117)");
        java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_105);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_105)");
        java.lang.String string3 = getString(com.qcwireless.qcwatch.R.string.qc_text_106);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_106)");
        this.titleList = new java.lang.String[]{string, string2, string3};
        com.qcwireless.qcwatch.databinding.ActivitySleepBinding activitySleepBinding = this.binding;
        java.lang.String[] strArr = null;
        if (activitySleepBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySleepBinding = null;
        }
        activitySleepBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_84));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activitySleepBinding.titleBar.divider);
        com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView qSwitchButtonView = activitySleepBinding.sleepQsvView;
        java.lang.String[] strArr2 = this.titleList;
        if (strArr2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("titleList");
        } else {
            strArr = strArr2;
        }
        qSwitchButtonView.setTitle(strArr);
        activitySleepBinding.sleepQsvView.setActivity(this);
        activitySleepBinding.sleepQsvView.select(0, true);
        activitySleepBinding.sleepQsvView.setOnTabSelectedListener(new com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView.OnTabSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.sleep.SleepActivity$setupViews$1$1
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
                fragmentManager = com.qcwireless.qcwatch.ui.home.sleep.SleepActivity.this.getFragmentManager();
                androidx.fragment.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                com.qcwireless.qcwatch.ui.home.sleep.SleepActivity sleepActivity = com.qcwireless.qcwatch.ui.home.sleep.SleepActivity.this;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(beginTransaction, "this");
                sleepActivity.hideFragments(beginTransaction);
                if (index == 0) {
                    daySleepFragment = sleepActivity.daySleepFragment;
                    if (daySleepFragment == null) {
                        sleepActivity.daySleepFragment = com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragment.INSTANCE.newInstance();
                        daySleepFragment3 = sleepActivity.daySleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(daySleepFragment3);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.sleepContainer, daySleepFragment3);
                    } else {
                        daySleepFragment2 = sleepActivity.daySleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(daySleepFragment2);
                        beginTransaction.show(daySleepFragment2);
                    }
                } else if (index == 1) {
                    weekSleepFragment = sleepActivity.weekSleepFragment;
                    if (weekSleepFragment == null) {
                        sleepActivity.weekSleepFragment = com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragment.INSTANCE.newInstance();
                        weekSleepFragment3 = sleepActivity.weekSleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(weekSleepFragment3);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.sleepContainer, weekSleepFragment3);
                    } else {
                        weekSleepFragment2 = sleepActivity.weekSleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(weekSleepFragment2);
                        beginTransaction.show(weekSleepFragment2);
                    }
                } else if (index == 2) {
                    monthSleepFragment = sleepActivity.monthSleepFragment;
                    if (monthSleepFragment == null) {
                        sleepActivity.monthSleepFragment = com.qcwireless.qcwatch.ui.home.sleep.month.MonthSleepFragment.INSTANCE.newInstance();
                        monthSleepFragment3 = sleepActivity.monthSleepFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(monthSleepFragment3);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.sleepContainer, monthSleepFragment3);
                    } else {
                        monthSleepFragment2 = sleepActivity.monthSleepFragment;
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
}
