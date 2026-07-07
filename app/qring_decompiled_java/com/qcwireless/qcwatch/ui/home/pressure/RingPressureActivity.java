package com.qcwireless.qcwatch.ui.home.pressure;

/* compiled from: RingPressureActivity.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0016H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082.¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/pressure/RingPressureActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityRingPressureBinding;", "dayPressureFragment", "Lcom/qcwireless/qcwatch/ui/home/pressure/day/DayPressureFragment;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager$delegate", "Lkotlin/Lazy;", "monthPressureFragment", "Lcom/qcwireless/qcwatch/ui/home/pressure/month/MonthPressureFragment;", "titleList", "", "", "[Ljava/lang/String;", "weekPressureFragment", "Lcom/qcwireless/qcwatch/ui/home/pressure/week/WeekPressureFragment;", "hideFragments", "", "transaction", "Landroidx/fragment/app/FragmentTransaction;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class RingPressureActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityRingPressureBinding binding;
    private com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment;

    /* renamed from: fragmentManager$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy fragmentManager = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.fragment.app.FragmentManager>() { // from class: com.qcwireless.qcwatch.ui.home.pressure.RingPressureActivity$fragmentManager$2
        {
            super(0);
        }

        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.FragmentManager m1142invoke() {
            androidx.fragment.app.FragmentManager supportFragmentManager = com.qcwireless.qcwatch.ui.home.pressure.RingPressureActivity.this.getSupportFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            return supportFragmentManager;
        }
    });
    private com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment monthPressureFragment;
    private java.lang.String[] titleList;
    private com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment weekPressureFragment;

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.fragment.app.FragmentManager getFragmentManager() {
        return (androidx.fragment.app.FragmentManager) this.fragmentManager.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityRingPressureBinding inflate = com.qcwireless.qcwatch.databinding.ActivityRingPressureBinding.inflate(getLayoutInflater());
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
        setStatusBarBackground(com.qcwireless.qcwatch.R.color.pressure_bg);
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_117);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_117)");
        java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_105);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_105)");
        java.lang.String string3 = getString(com.qcwireless.qcwatch.R.string.qc_text_106);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_106)");
        this.titleList = new java.lang.String[]{string, string2, string3};
        com.qcwireless.qcwatch.databinding.ActivityRingPressureBinding activityRingPressureBinding = this.binding;
        java.lang.String[] strArr = null;
        if (activityRingPressureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityRingPressureBinding = null;
        }
        activityRingPressureBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_6666561));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityRingPressureBinding.titleBar.divider);
        com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView qSwitchButtonView = activityRingPressureBinding.stepQsvView;
        java.lang.String[] strArr2 = this.titleList;
        if (strArr2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("titleList");
        } else {
            strArr = strArr2;
        }
        qSwitchButtonView.setTitle(strArr);
        activityRingPressureBinding.stepQsvView.select(0, true);
        activityRingPressureBinding.stepQsvView.setActivity(this);
        activityRingPressureBinding.stepQsvView.setOnTabSelectedListener(new com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView.OnTabSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.pressure.RingPressureActivity$setupViews$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView.OnTabSelectedListener
            public void onTabSelected(int index) {
                androidx.fragment.app.FragmentManager fragmentManager;
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment;
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment2;
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment3;
                com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment weekPressureFragment;
                com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment weekPressureFragment2;
                com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment weekPressureFragment3;
                com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment monthPressureFragment;
                com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment monthPressureFragment2;
                com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment monthPressureFragment3;
                fragmentManager = com.qcwireless.qcwatch.ui.home.pressure.RingPressureActivity.this.getFragmentManager();
                androidx.fragment.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                com.qcwireless.qcwatch.ui.home.pressure.RingPressureActivity ringPressureActivity = com.qcwireless.qcwatch.ui.home.pressure.RingPressureActivity.this;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(beginTransaction, "this");
                ringPressureActivity.hideFragments(beginTransaction);
                if (index == 0) {
                    dayPressureFragment = ringPressureActivity.dayPressureFragment;
                    if (dayPressureFragment == null) {
                        ringPressureActivity.dayPressureFragment = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.INSTANCE.newInstance();
                        dayPressureFragment3 = ringPressureActivity.dayPressureFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(dayPressureFragment3);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.stepContainer, dayPressureFragment3);
                    } else {
                        dayPressureFragment2 = ringPressureActivity.dayPressureFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(dayPressureFragment2);
                        beginTransaction.show(dayPressureFragment2);
                    }
                } else if (index == 1) {
                    weekPressureFragment = ringPressureActivity.weekPressureFragment;
                    if (weekPressureFragment == null) {
                        ringPressureActivity.weekPressureFragment = com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment.INSTANCE.newInstance();
                        weekPressureFragment3 = ringPressureActivity.weekPressureFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(weekPressureFragment3);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.stepContainer, weekPressureFragment3);
                    } else {
                        weekPressureFragment2 = ringPressureActivity.weekPressureFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(weekPressureFragment2);
                        beginTransaction.show(weekPressureFragment2);
                    }
                } else if (index == 2) {
                    monthPressureFragment = ringPressureActivity.monthPressureFragment;
                    if (monthPressureFragment == null) {
                        ringPressureActivity.monthPressureFragment = com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment.INSTANCE.newInstance();
                        monthPressureFragment3 = ringPressureActivity.monthPressureFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(monthPressureFragment3);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.stepContainer, monthPressureFragment3);
                    } else {
                        monthPressureFragment2 = ringPressureActivity.monthPressureFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(monthPressureFragment2);
                        beginTransaction.show(monthPressureFragment2);
                    }
                }
                beginTransaction.commitAllowingStateLoss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideFragments(androidx.fragment.app.FragmentTransaction transaction) {
        com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment = this.dayPressureFragment;
        if (dayPressureFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(dayPressureFragment);
            transaction.hide(dayPressureFragment);
        }
        com.qcwireless.qcwatch.ui.home.pressure.week.WeekPressureFragment weekPressureFragment = this.weekPressureFragment;
        if (weekPressureFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(weekPressureFragment);
            transaction.hide(weekPressureFragment);
        }
        com.qcwireless.qcwatch.ui.home.pressure.month.MonthPressureFragment monthPressureFragment = this.monthPressureFragment;
        if (monthPressureFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(monthPressureFragment);
            transaction.hide(monthPressureFragment);
        }
    }
}
