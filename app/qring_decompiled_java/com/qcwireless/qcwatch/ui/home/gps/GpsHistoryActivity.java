package com.qcwireless.qcwatch.ui.home.gps;

/* compiled from: GpsHistoryActivity.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0014J\b\u0010\u0016\u001a\u00020\u0012H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082.¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/GpsHistoryActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityGpsHistoryBinding;", "dayGpsFragment", "Lcom/qcwireless/qcwatch/ui/home/gps/day/DayGpsFragment;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager$delegate", "Lkotlin/Lazy;", "titleList", "", "", "[Ljava/lang/String;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GpsHistoryActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityGpsHistoryBinding binding;
    private com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment dayGpsFragment;

    /* renamed from: fragmentManager$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy fragmentManager = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.fragment.app.FragmentManager>() { // from class: com.qcwireless.qcwatch.ui.home.gps.GpsHistoryActivity$fragmentManager$2
        {
            super(0);
        }

        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.FragmentManager m993invoke() {
            androidx.fragment.app.FragmentManager supportFragmentManager = com.qcwireless.qcwatch.ui.home.gps.GpsHistoryActivity.this.getSupportFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            return supportFragmentManager;
        }
    });
    private java.lang.String[] titleList;

    private final androidx.fragment.app.FragmentManager getFragmentManager() {
        return (androidx.fragment.app.FragmentManager) this.fragmentManager.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityGpsHistoryBinding inflate = com.qcwireless.qcwatch.databinding.ActivityGpsHistoryBinding.inflate(getLayoutInflater());
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
        setStatusBarBackground(com.qcwireless.qcwatch.R.color.gps_bg);
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_117);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_117)");
        java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_105);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_105)");
        java.lang.String string3 = getString(com.qcwireless.qcwatch.R.string.qc_text_106);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_106)");
        this.titleList = new java.lang.String[]{string, string2, string3};
        com.qcwireless.qcwatch.databinding.ActivityGpsHistoryBinding activityGpsHistoryBinding = this.binding;
        if (activityGpsHistoryBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGpsHistoryBinding = null;
        }
        activityGpsHistoryBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_6666557));
        androidx.fragment.app.FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment dayGpsFragment = this.dayGpsFragment;
        if (dayGpsFragment == null) {
            com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment newInstance = com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment.INSTANCE.newInstance();
            this.dayGpsFragment = newInstance;
            kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance);
            beginTransaction.add(com.qcwireless.qcwatch.R.id.gpsContainer, newInstance);
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(dayGpsFragment);
            beginTransaction.show(dayGpsFragment);
        }
        beginTransaction.commitAllowingStateLoss();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.RefreshEvent(com.qcwireless.qcwatch.ui.home.gps.GPSFragment.class));
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.RefreshEvent(com.qcwireless.qcwatch.ui.home.gps.GPSCNFragment.class));
    }
}
