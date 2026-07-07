package com.qcwireless.qcwatch.ui.home.sport;

/* compiled from: SportActivity.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001bH\u0015J\b\u0010\u001e\u001a\u00020\u0016H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082.¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/SportActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivitySportBinding;", "dayFragment", "Lcom/qcwireless/qcwatch/ui/home/sport/day/DaySportFragment;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager$delegate", "Lkotlin/Lazy;", "monthFragment", "Lcom/qcwireless/qcwatch/ui/home/sport/month/MonthSportFragment;", "titleList", "", "", "[Ljava/lang/String;", "weekFragment", "Lcom/qcwireless/qcwatch/ui/home/sport/week/WeekSportFragment;", "hideFragments", "", "transaction", "Landroidx/fragment/app/FragmentTransaction;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SportActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivitySportBinding binding;
    private com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment dayFragment;

    /* renamed from: fragmentManager$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy fragmentManager = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.fragment.app.FragmentManager>() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportActivity$fragmentManager$2
        {
            super(0);
        }

        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.FragmentManager m1180invoke() {
            androidx.fragment.app.FragmentManager supportFragmentManager = com.qcwireless.qcwatch.ui.home.sport.SportActivity.this.getSupportFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            return supportFragmentManager;
        }
    });
    private com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment monthFragment;
    private java.lang.String[] titleList;
    private com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment weekFragment;

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
        com.qcwireless.qcwatch.databinding.ActivitySportBinding inflate = com.qcwireless.qcwatch.databinding.ActivitySportBinding.inflate(getLayoutInflater());
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
        setStatusBarBackground(com.qcwireless.qcwatch.R.color.sport_bg);
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_117);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_117)");
        java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_105);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_105)");
        java.lang.String string3 = getString(com.qcwireless.qcwatch.R.string.qc_text_106);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_106)");
        this.titleList = new java.lang.String[]{string, string2, string3};
        com.qcwireless.qcwatch.databinding.ActivitySportBinding activitySportBinding = this.binding;
        java.lang.String[] strArr = null;
        if (activitySportBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportBinding = null;
        }
        activitySportBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_83));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activitySportBinding.titleBar.divider);
        com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView qSwitchButtonView = activitySportBinding.qsvView;
        java.lang.String[] strArr2 = this.titleList;
        if (strArr2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("titleList");
        } else {
            strArr = strArr2;
        }
        qSwitchButtonView.setTitle(strArr);
        activitySportBinding.qsvView.select(0, true);
        activitySportBinding.qsvView.setActivity(this);
        activitySportBinding.qsvView.setOnTabSelectedListener(new com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView.OnTabSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportActivity$setupViews$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QSwitchButtonView.OnTabSelectedListener
            public void onTabSelected(int index) {
                androidx.fragment.app.FragmentManager fragmentManager;
                com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment daySportFragment;
                com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment daySportFragment2;
                com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment daySportFragment3;
                com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment weekSportFragment;
                com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment weekSportFragment2;
                com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment weekSportFragment3;
                com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment monthSportFragment;
                com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment monthSportFragment2;
                com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment monthSportFragment3;
                fragmentManager = com.qcwireless.qcwatch.ui.home.sport.SportActivity.this.getFragmentManager();
                androidx.fragment.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                com.qcwireless.qcwatch.ui.home.sport.SportActivity sportActivity = com.qcwireless.qcwatch.ui.home.sport.SportActivity.this;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(beginTransaction, "this");
                sportActivity.hideFragments(beginTransaction);
                if (index == 0) {
                    daySportFragment = sportActivity.dayFragment;
                    if (daySportFragment == null) {
                        sportActivity.dayFragment = com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment.INSTANCE.newInstance();
                        daySportFragment3 = sportActivity.dayFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(daySportFragment3);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.sportContainer, daySportFragment3);
                    } else {
                        daySportFragment2 = sportActivity.dayFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(daySportFragment2);
                        beginTransaction.show(daySportFragment2);
                    }
                } else if (index == 1) {
                    weekSportFragment = sportActivity.weekFragment;
                    if (weekSportFragment == null) {
                        sportActivity.weekFragment = com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment.INSTANCE.newInstance();
                        weekSportFragment3 = sportActivity.weekFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(weekSportFragment3);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.sportContainer, weekSportFragment3);
                    } else {
                        weekSportFragment2 = sportActivity.weekFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(weekSportFragment2);
                        beginTransaction.show(weekSportFragment2);
                    }
                } else if (index == 2) {
                    monthSportFragment = sportActivity.monthFragment;
                    if (monthSportFragment == null) {
                        sportActivity.monthFragment = com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment.INSTANCE.newInstance();
                        monthSportFragment3 = sportActivity.monthFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(monthSportFragment3);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.sportContainer, monthSportFragment3);
                    } else {
                        monthSportFragment2 = sportActivity.monthFragment;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(monthSportFragment2);
                        beginTransaction.show(monthSportFragment2);
                    }
                }
                beginTransaction.commitAllowingStateLoss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideFragments(androidx.fragment.app.FragmentTransaction transaction) {
        com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment daySportFragment = this.dayFragment;
        if (daySportFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(daySportFragment);
            transaction.hide(daySportFragment);
        }
        com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment weekSportFragment = this.weekFragment;
        if (weekSportFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(weekSportFragment);
            transaction.hide(weekSportFragment);
        }
        com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment monthSportFragment = this.monthFragment;
        if (monthSportFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(monthSportFragment);
            transaction.hide(monthSportFragment);
        }
    }
}
