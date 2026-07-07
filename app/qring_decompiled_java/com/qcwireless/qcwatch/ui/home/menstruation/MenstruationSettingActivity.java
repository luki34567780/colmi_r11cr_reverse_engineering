package com.qcwireless.qcwatch.ui.home.menstruation;

/* compiled from: MenstruationSettingActivity.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0017J\b\u0010\u0014\u001a\u00020\u000eH\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0014J\u0006\u0010\u0016\u001a\u00020\u000eJ\u0006\u0010\u0017\u001a\u00020\u000eJ\u0006\u0010\u0018\u001a\u00020\u000eJ\u0006\u0010\u0019\u001a\u00020\u000eJ\u0006\u0010\u001a\u001a\u00020\u000eJ\u0006\u0010\u001b\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/menstruation/MenstruationSettingActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityMenstruationSettingBinding;", "menstruationSettings", "Lcom/qcwireless/qcwatch/ui/home/menstruation/bean/MenstruationBean;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/menstruation/MenstruationViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/menstruation/MenstruationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "setupViews", "showAlert1Dialog", "showAlert2Dialog", "showCycleDialog", "showDateDialog", "showDuringDialog", "showTimeDialog", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MenstruationSettingActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding binding;
    private com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationSettings;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public MenstruationSettingActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel m1137invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.class), qualifier, qualifier);
            }
        });
    }

    private final com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding inflate = com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding.inflate(getLayoutInflater());
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
        getViewModel().initData();
        final com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding activityMenstruationSettingBinding = this.binding;
        if (activityMenstruationSettingBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMenstruationSettingBinding = null;
        }
        activityMenstruationSettingBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_191));
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMenstruationSettingBinding.titleBar.tvRightText);
        activityMenstruationSettingBinding.titleBar.tvRightText.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_79));
        activityMenstruationSettingBinding.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.m1127setupViews$lambda3$lambda0(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.this, view);
            }
        });
        activityMenstruationSettingBinding.qcMsSwitch.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.m1128setupViews$lambda3$lambda1(com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding.this, this, compoundButton, z);
            }
        });
        activityMenstruationSettingBinding.qcMsDuring.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$setupViews$1$3
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.this.showDuringDialog();
            }
        });
        activityMenstruationSettingBinding.qcMsCycle.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$setupViews$1$4
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.this.showCycleDialog();
            }
        });
        activityMenstruationSettingBinding.qcMsLast.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$setupViews$1$5
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.this.showDateDialog();
            }
        });
        activityMenstruationSettingBinding.qcMsAlarmSwitch.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$$ExternalSyntheticLambda2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.m1129setupViews$lambda3$lambda2(com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding.this, this, compoundButton, z);
            }
        });
        activityMenstruationSettingBinding.qcMsAlarm1.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$setupViews$1$7
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.this.showAlert1Dialog();
            }
        });
        activityMenstruationSettingBinding.qcMsAlarm2.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$setupViews$1$8
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.this.showAlert2Dialog();
            }
        });
        activityMenstruationSettingBinding.qcMsAlarm3.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$setupViews$1$9
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.this.showTimeDialog();
            }
        });
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$$ExternalSyntheticLambda3
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.m1130setupViews$lambda5(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.this, (com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationSettingUI) obj);
            }
        });
        getViewModel().queryMenstruationSetting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-3$lambda-0, reason: not valid java name */
    public static final void m1127setupViews$lambda3$lambda0(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity menstruationSettingActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationSettingActivity, "this$0");
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = null;
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            java.lang.String string = menstruationSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            menstruationSettingActivity.finish();
            return;
        }
        if (menstruationSettingActivity.menstruationSettings != null) {
            com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel viewModel = menstruationSettingActivity.getViewModel();
            com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean2 = menstruationSettingActivity.menstruationSettings;
            if (menstruationBean2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
                menstruationBean2 = null;
            }
            viewModel.saveMenstruationSetting(menstruationBean2);
            com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean3 = menstruationSettingActivity.menstruationSettings;
            if (menstruationBean3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
                menstruationBean3 = null;
            }
            com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(menstruationBean3.getLastTime(), true);
            com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(dateUtil.getUnixTimestamp(), true);
            com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean4 = menstruationSettingActivity.menstruationSettings;
            if (menstruationBean4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
                menstruationBean4 = null;
            }
            dateUtil2.addDay(-(menstruationBean4.getDuring() - 1));
            int daysBetweenMe = new com.qcwireless.qc_utils.date.DateUtil().daysBetweenMe(dateUtil2);
            int daysBetweenMe2 = new com.qcwireless.qc_utils.date.DateUtil().daysBetweenMe(dateUtil);
            com.oudmon.ble.base.communication.CommandHandle commandHandle = com.oudmon.ble.base.communication.CommandHandle.getInstance();
            com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean5 = menstruationSettingActivity.menstruationSettings;
            if (menstruationBean5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
                menstruationBean5 = null;
            }
            boolean menstruationSwitch = menstruationBean5.getMenstruationSwitch();
            com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean6 = menstruationSettingActivity.menstruationSettings;
            if (menstruationBean6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
                menstruationBean6 = null;
            }
            int during = menstruationBean6.getDuring();
            com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean7 = menstruationSettingActivity.menstruationSettings;
            if (menstruationBean7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
                menstruationBean7 = null;
            }
            int cycle = menstruationBean7.getCycle();
            com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean8 = menstruationSettingActivity.menstruationSettings;
            if (menstruationBean8 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
                menstruationBean8 = null;
            }
            boolean menstruationAlarm = menstruationBean8.getMenstruationAlarm();
            com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean9 = menstruationSettingActivity.menstruationSettings;
            if (menstruationBean9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
                menstruationBean9 = null;
            }
            int alarm1 = menstruationBean9.getAlarm1();
            com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean10 = menstruationSettingActivity.menstruationSettings;
            if (menstruationBean10 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
                menstruationBean10 = null;
            }
            int alarm2 = menstruationBean10.getAlarm2();
            com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean11 = menstruationSettingActivity.menstruationSettings;
            if (menstruationBean11 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
                menstruationBean11 = null;
            }
            int alarmMin = menstruationBean11.getAlarmMin() / 60;
            com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean12 = menstruationSettingActivity.menstruationSettings;
            if (menstruationBean12 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
            } else {
                menstruationBean = menstruationBean12;
            }
            commandHandle.executeReqCmdNoCallback(new com.oudmon.ble.base.communication.req.MenstruationReq(menstruationSwitch, during, cycle, daysBetweenMe, daysBetweenMe2, menstruationAlarm, alarm1, alarm2, alarmMin, menstruationBean.getAlarmMin() % 60));
            menstruationSettingActivity.finish();
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMenstruationSetting()) {
                return;
            }
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMenstruationSetting(true);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            android.app.Activity activity = (android.app.Activity) menstruationSettingActivity;
            java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.class);
            for (kotlin.Pair pair : arrayList) {
                if (pair != null) {
                    java.lang.String str = (java.lang.String) pair.getFirst();
                    java.lang.Object second = pair.getSecond();
                    if (second instanceof java.lang.Integer) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Byte) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Character) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Short) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Boolean) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Long) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Float) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Double) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.String) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                    } else if (second instanceof java.lang.CharSequence) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                    } else if (second instanceof android.os.Parcelable) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Object[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                    } else if (second instanceof java.util.ArrayList) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                    } else if (second instanceof java.io.Serializable) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                    } else if (second instanceof boolean[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                    } else if (second instanceof byte[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                    } else if (second instanceof short[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                    } else if (second instanceof char[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                    } else if (second instanceof int[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                    } else if (second instanceof long[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                    } else if (second instanceof float[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                    } else if (second instanceof double[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                    } else if (second instanceof android.os.Bundle) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                    } else if (second instanceof android.content.Intent) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                    } else {
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                }
            }
            activity.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3$lambda-1, reason: not valid java name */
    public static final void m1128setupViews$lambda3$lambda1(com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding activityMenstruationSettingBinding, com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity menstruationSettingActivity, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMenstruationSettingBinding, "$this_run");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationSettingActivity, "this$0");
        if (z) {
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMenstruationSettingBinding.menstruationGroup);
        } else {
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMenstruationSettingBinding.menstruationGroup);
        }
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = menstruationSettingActivity.menstruationSettings;
        if (menstruationBean == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
            menstruationBean = null;
        }
        menstruationBean.setMenstruationSwitch(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3$lambda-2, reason: not valid java name */
    public static final void m1129setupViews$lambda3$lambda2(com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding activityMenstruationSettingBinding, com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity menstruationSettingActivity, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMenstruationSettingBinding, "$this_run");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationSettingActivity, "this$0");
        if (z) {
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMenstruationSettingBinding.alarmGroup);
        } else {
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMenstruationSettingBinding.alarmGroup);
        }
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = menstruationSettingActivity.menstruationSettings;
        if (menstruationBean == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
            menstruationBean = null;
        }
        menstruationBean.setMenstruationAlarm(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-5, reason: not valid java name */
    public static final void m1130setupViews$lambda5(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity menstruationSettingActivity, com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationSettingUI menstruationSettingUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationSettingActivity, "this$0");
        if (menstruationSettingUI != null) {
            menstruationSettingActivity.menstruationSettings = menstruationSettingUI.getEntity();
            com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding activityMenstruationSettingBinding = menstruationSettingActivity.binding;
            if (activityMenstruationSettingBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMenstruationSettingBinding = null;
            }
            boolean menstruationSwitch = menstruationSettingUI.getEntity().getMenstruationSwitch();
            activityMenstruationSettingBinding.qcMsSwitch.setChecked(menstruationSwitch);
            activityMenstruationSettingBinding.qcMsDuring.setRightText(menstruationSettingUI.getEntity().getDuring() + menstruationSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_228));
            activityMenstruationSettingBinding.qcMsCycle.setRightText(menstruationSettingUI.getEntity().getCycle() + menstruationSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_228));
            activityMenstruationSettingBinding.qcMsLast.setRightText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(menstruationSettingUI.getEntity().getLastTime(), true)));
            activityMenstruationSettingBinding.qcMsAlarmSwitch.setChecked(menstruationSettingUI.getEntity().getMenstruationAlarm());
            com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = activityMenstruationSettingBinding.qcMsAlarm1;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string = menstruationSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_246);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_246)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(menstruationSettingUI.getEntity().getAlarm1())}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            qSettingItem.setRightText(format);
            com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem2 = activityMenstruationSettingBinding.qcMsAlarm2;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string2 = menstruationSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_246);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_246)");
            java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(menstruationSettingUI.getEntity().getAlarm2())}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
            qSettingItem2.setRightText(format2);
            activityMenstruationSettingBinding.qcMsAlarm3.setRightText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(menstruationSettingUI.getEntity().getAlarmMin()));
            if (menstruationSwitch) {
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMenstruationSettingBinding.menstruationGroup);
                return;
            } else {
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMenstruationSettingBinding.menstruationGroup);
                return;
            }
        }
        menstruationSettingActivity.getViewModel().queryMenstruationSetting();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            return;
        }
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        finish();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if (!(messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) || ((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect()) {
            return;
        }
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showDuringDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog create = new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.Builder(getActivity()).create();
        create.initData((android.content.Context) this, getViewModel().getDuringList());
        create.setDialogTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_195));
        create.setUnitText(getString(com.qcwireless.qcwatch.R.string.qc_text_228));
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$$ExternalSyntheticLambda7
            @Override // com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener
            public final void itemClick(int i) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.m1135showDuringDialog$lambda6(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.this, i);
            }
        });
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = this.menstruationSettings;
        if (menstruationBean == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
            menstruationBean = null;
        }
        create.setCurrItemText(java.lang.String.valueOf(menstruationBean.getDuring()));
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDuringDialog$lambda-6, reason: not valid java name */
    public static final void m1135showDuringDialog$lambda6(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity menstruationSettingActivity, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationSettingActivity, "this$0");
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = menstruationSettingActivity.menstruationSettings;
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean2 = null;
        if (menstruationBean == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
            menstruationBean = null;
        }
        menstruationBean.setDuring(java.lang.Integer.parseInt(menstruationSettingActivity.getViewModel().getDuringList().get(i)));
        com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding activityMenstruationSettingBinding = menstruationSettingActivity.binding;
        if (activityMenstruationSettingBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMenstruationSettingBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = activityMenstruationSettingBinding.qcMsDuring;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean3 = menstruationSettingActivity.menstruationSettings;
        if (menstruationBean3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
        } else {
            menstruationBean2 = menstruationBean3;
        }
        sb.append(menstruationBean2.getDuring());
        sb.append(menstruationSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_228));
        qSettingItem.setRightText(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showCycleDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog create = new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.Builder(getActivity()).create();
        create.initData((android.content.Context) this, getViewModel().getCycleList());
        create.setDialogTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_196));
        create.setUnitText(getString(com.qcwireless.qcwatch.R.string.qc_text_228));
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$$ExternalSyntheticLambda6
            @Override // com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener
            public final void itemClick(int i) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.m1133showCycleDialog$lambda7(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.this, i);
            }
        });
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = this.menstruationSettings;
        if (menstruationBean == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
            menstruationBean = null;
        }
        create.setCurrItemText(java.lang.String.valueOf(menstruationBean.getCycle()));
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showCycleDialog$lambda-7, reason: not valid java name */
    public static final void m1133showCycleDialog$lambda7(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity menstruationSettingActivity, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationSettingActivity, "this$0");
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = menstruationSettingActivity.menstruationSettings;
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean2 = null;
        if (menstruationBean == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
            menstruationBean = null;
        }
        menstruationBean.setCycle(java.lang.Integer.parseInt(menstruationSettingActivity.getViewModel().getCycleList().get(i)));
        com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding activityMenstruationSettingBinding = menstruationSettingActivity.binding;
        if (activityMenstruationSettingBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMenstruationSettingBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = activityMenstruationSettingBinding.qcMsCycle;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean3 = menstruationSettingActivity.menstruationSettings;
        if (menstruationBean3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
        } else {
            menstruationBean2 = menstruationBean3;
        }
        sb.append(menstruationBean2.getCycle());
        sb.append(menstruationSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_228));
        qSettingItem.setRightText(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showDateDialog() {
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = this.menstruationSettings;
        if (menstruationBean == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
            menstruationBean = null;
        }
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(menstruationBean.getLastTime(), true);
        com.qcwireless.qcwatch.base.dialog.BottomYMDDialog create = new com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.Builder(getActivity()).create();
        create.initData((android.content.Context) this);
        create.setDialogTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_197));
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.DialogSaveClickListener() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$$ExternalSyntheticLambda9
            @Override // com.qcwireless.qcwatch.base.dialog.BottomYMDDialog.DialogSaveClickListener
            public final void itemClick(int i, int i2, int i3) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.m1134showDateDialog$lambda8(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.this, i, i2, i3);
            }
        });
        create.setCurrItem(dateUtil.getYear(), dateUtil.getMonth(), dateUtil.getDay());
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDateDialog$lambda-8, reason: not valid java name */
    public static final void m1134showDateDialog$lambda8(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity menstruationSettingActivity, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationSettingActivity, "this$0");
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(i, i2, i3);
        com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding activityMenstruationSettingBinding = null;
        if (new com.qcwireless.qc_utils.date.DateUtil().daysBetweenMe(dateUtil) > 90) {
            java.lang.String string = menstruationSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_296);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_296)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        if (dateUtil.getUnixTimestamp() > new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp()) {
            java.lang.String string2 = menstruationSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_229);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_229)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
            return;
        }
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = menstruationSettingActivity.menstruationSettings;
        if (menstruationBean == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
            menstruationBean = null;
        }
        menstruationBean.setLastTime(dateUtil.getUnixTimestamp());
        com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding activityMenstruationSettingBinding2 = menstruationSettingActivity.binding;
        if (activityMenstruationSettingBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMenstruationSettingBinding = activityMenstruationSettingBinding2;
        }
        activityMenstruationSettingBinding.qcMsLast.setRightText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(dateUtil));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showAlert1Dialog() {
        com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog create = new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.Builder(getActivity()).create();
        create.initData((android.content.Context) this, getViewModel().getAlarmList());
        create.setDialogTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_199));
        create.setUnitText(getString(com.qcwireless.qcwatch.R.string.qc_text_228));
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$$ExternalSyntheticLambda8
            @Override // com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener
            public final void itemClick(int i) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.m1131showAlert1Dialog$lambda9(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.this, i);
            }
        });
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = this.menstruationSettings;
        if (menstruationBean == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
            menstruationBean = null;
        }
        create.setCurrItemText(java.lang.String.valueOf(menstruationBean.getAlarm1()));
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showAlert1Dialog$lambda-9, reason: not valid java name */
    public static final void m1131showAlert1Dialog$lambda9(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity menstruationSettingActivity, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationSettingActivity, "this$0");
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = menstruationSettingActivity.menstruationSettings;
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean2 = null;
        if (menstruationBean == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
            menstruationBean = null;
        }
        menstruationBean.setAlarm1(java.lang.Integer.parseInt(menstruationSettingActivity.getViewModel().getAlarmList().get(i)));
        com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding activityMenstruationSettingBinding = menstruationSettingActivity.binding;
        if (activityMenstruationSettingBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMenstruationSettingBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = activityMenstruationSettingBinding.qcMsAlarm1;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string = menstruationSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_246);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_246)");
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean3 = menstruationSettingActivity.menstruationSettings;
        if (menstruationBean3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
        } else {
            menstruationBean2 = menstruationBean3;
        }
        objArr[0] = java.lang.String.valueOf(menstruationBean2.getAlarm1());
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        qSettingItem.setRightText(format);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showAlert2Dialog() {
        com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog create = new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.Builder(getActivity()).create();
        create.initData((android.content.Context) this, getViewModel().getAlarmList());
        create.setDialogTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_200));
        create.setUnitText(getString(com.qcwireless.qcwatch.R.string.qc_text_228));
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$$ExternalSyntheticLambda5
            @Override // com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener
            public final void itemClick(int i) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.m1132showAlert2Dialog$lambda10(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.this, i);
            }
        });
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = this.menstruationSettings;
        if (menstruationBean == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
            menstruationBean = null;
        }
        create.setCurrItemText(java.lang.String.valueOf(menstruationBean.getAlarm2()));
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showAlert2Dialog$lambda-10, reason: not valid java name */
    public static final void m1132showAlert2Dialog$lambda10(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity menstruationSettingActivity, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationSettingActivity, "this$0");
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = menstruationSettingActivity.menstruationSettings;
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean2 = null;
        if (menstruationBean == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
            menstruationBean = null;
        }
        menstruationBean.setAlarm2(java.lang.Integer.parseInt(menstruationSettingActivity.getViewModel().getAlarmList().get(i)));
        com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding activityMenstruationSettingBinding = menstruationSettingActivity.binding;
        if (activityMenstruationSettingBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMenstruationSettingBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = activityMenstruationSettingBinding.qcMsAlarm2;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string = menstruationSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_246);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_246)");
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean3 = menstruationSettingActivity.menstruationSettings;
        if (menstruationBean3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
        } else {
            menstruationBean2 = menstruationBean3;
        }
        objArr[0] = java.lang.String.valueOf(menstruationBean2.getAlarm2());
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        qSettingItem.setRightText(format);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showTimeDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_time_selector);
        com.qcwireless.qcwatch.base.dialog.BottomTimeDialog create = builder.create();
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.TimeListener() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity$$ExternalSyntheticLambda4
            @Override // com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.TimeListener
            public final void min(int i) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.m1136showTimeDialog$lambda11(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.this, i);
            }
        });
        create.initData((android.content.Context) this);
        create.setTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_201));
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = this.menstruationSettings;
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean2 = null;
        if (menstruationBean == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
            menstruationBean = null;
        }
        int alarmMin = menstruationBean.getAlarmMin() / 60;
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean3 = this.menstruationSettings;
        if (menstruationBean3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
        } else {
            menstruationBean2 = menstruationBean3;
        }
        create.setCurrTime(alarmMin, menstruationBean2.getAlarmMin() % 60);
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showTimeDialog$lambda-11, reason: not valid java name */
    public static final void m1136showTimeDialog$lambda11(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity menstruationSettingActivity, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationSettingActivity, "this$0");
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = menstruationSettingActivity.menstruationSettings;
        com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding activityMenstruationSettingBinding = null;
        if (menstruationBean == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("menstruationSettings");
            menstruationBean = null;
        }
        menstruationBean.setAlarmMin(i);
        com.qcwireless.qcwatch.databinding.ActivityMenstruationSettingBinding activityMenstruationSettingBinding2 = menstruationSettingActivity.binding;
        if (activityMenstruationSettingBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMenstruationSettingBinding = activityMenstruationSettingBinding2;
        }
        activityMenstruationSettingBinding.qcMsAlarm3.setRightText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(i));
    }
}
