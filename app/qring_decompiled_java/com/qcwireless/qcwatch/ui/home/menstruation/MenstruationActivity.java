package com.qcwireless.qcwatch.ui.home.menstruation;

/* compiled from: MenstruationActivity.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\"\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0012\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0014H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/menstruation/MenstruationActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityMenstruationBinding;", "selectDate", "Lcom/qcwireless/qc_utils/date/DateUtil;", "getSelectDate", "()Lcom/qcwireless/qc_utils/date/DateUtil;", "setSelectDate", "(Lcom/qcwireless/qc_utils/date/DateUtil;)V", "settingBean", "Lcom/qcwireless/qcwatch/ui/home/menstruation/bean/MenstruationBean;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/menstruation/MenstruationViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/menstruation/MenstruationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addOrUpdate", "", "check", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "CalendarSelectListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MenstruationActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding binding;
    private com.qcwireless.qc_utils.date.DateUtil selectDate = new com.qcwireless.qc_utils.date.DateUtil();
    private com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean settingBean;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public MenstruationActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel m1124invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.class), qualifier, qualifier);
            }
        });
    }

    private final com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel) this.viewModel.getValue();
    }

    public final com.qcwireless.qc_utils.date.DateUtil getSelectDate() {
        return this.selectDate;
    }

    public final void setSelectDate(com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "<set-?>");
        this.selectDate = dateUtil;
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding inflate = com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding.inflate(getLayoutInflater());
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        setStatusBarBackground(com.qcwireless.qcwatch.R.color.menstruation_bg);
        this.settingBean = new com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean(false, 0, 0, 0L, false, 0, 0, 0, 255, null);
        getViewModel().queryMenstruationSetting();
        final com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding activityMenstruationBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding activityMenstruationBinding2 = null;
        if (activityMenstruationBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMenstruationBinding = null;
        }
        activityMenstruationBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_190));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMenstruationBinding.titleBar.divider);
        android.content.Context context = (android.content.Context) this;
        activityMenstruationBinding.titleBar.tvRightText.setTextColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_common_1));
        activityMenstruationBinding.titleBar.tvRightText.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_191));
        activityMenstruationBinding.titleBar.tvRightText.setTextColor(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.title_bar_center));
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityMenstruationBinding.titleBar.tvRightText);
        activityMenstruationBinding.qcDateChange.setShowFuture(true);
        activityMenstruationBinding.qcDateChange.setMonth(this.selectDate);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, this.selectDate.getY_M_D());
        activityMenstruationBinding.qcDateChange.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity$setupViews$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView.QDateBefore
            public void clickBefore(boolean r3, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
                com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding.this.calendarView.scrollToCalendar(dateUtil.getYear(), dateUtil.getMonth(), dateUtil.getDay());
            }
        });
        activityMenstruationBinding.qcMenstruationStatus.setQSettingItemCheckListener(new com.qcwireless.qcwatch.ui.base.view.QSwitchView.OnSwitchStateChangeListener() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity$$ExternalSyntheticLambda3
            @Override // com.qcwireless.qcwatch.ui.base.view.QSwitchView.OnSwitchStateChangeListener
            public final void onSwitchStateChange(boolean z) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.m1120setupViews$lambda2$lambda0(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this, z);
            }
        });
        activityMenstruationBinding.calendarView.setOnMonthChangeListener(new com.haibin.calendarview.CalendarView.OnMonthChangeListener() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity$$ExternalSyntheticLambda2
            @Override // com.haibin.calendarview.CalendarView.OnMonthChangeListener
            public final void onMonthChange(int i, int i2) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.m1121setupViews$lambda2$lambda1(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this, activityMenstruationBinding, i, i2);
            }
        });
        activityMenstruationBinding.calendarView.setOnCalendarSelectListener(new com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.CalendarSelectListener());
        activityMenstruationBinding.calendarView.setBackground(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_show_5), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_show_5), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_show_5));
        activityMenstruationBinding.calendarView.setSelectedColor(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_show_6), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_show_6), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_show_6));
        activityMenstruationBinding.calendarView.setTextColor(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_theme), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_common_1), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_show_4), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_common_1), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_common_1));
        android.view.View[] viewArr = new android.view.View[1];
        com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding activityMenstruationBinding3 = this.binding;
        if (activityMenstruationBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMenstruationBinding2 = activityMenstruationBinding3;
        }
        viewArr[0] = activityMenstruationBinding2.titleBar.tvRightText;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity$setupViews$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding activityMenstruationBinding4 = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this.binding;
                if (activityMenstruationBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityMenstruationBinding4 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityMenstruationBinding4.titleBar.tvRightText)) {
                    android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this;
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.menstruation.MenstruationSettingActivity.class);
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
                    activity.startActivityForResult(intent, 200);
                }
            }
        });
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.m1122setupViews$lambda3(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this, (com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationSettingUI) obj);
            }
        });
        getViewModel().getUiShowState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.m1123setupViews$lambda4(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this, (com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationShowUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2$lambda-0, reason: not valid java name */
    public static final void m1120setupViews$lambda2$lambda0(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity menstruationActivity, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationActivity, "this$0");
        menstruationActivity.addOrUpdate(z);
        menstruationActivity.getViewModel().execToDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-2$lambda-1, reason: not valid java name */
    public static final void m1121setupViews$lambda2$lambda1(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity menstruationActivity, com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding activityMenstruationBinding, int i, int i2) {
        com.qcwireless.qc_utils.date.DateUtil dateUtil;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMenstruationBinding, "$this_run");
        com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil();
        com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel viewModel = menstruationActivity.getViewModel();
        android.content.Context context = (android.content.Context) menstruationActivity;
        com.qcwireless.qc_utils.date.DateUtil dateUtil3 = new com.qcwireless.qc_utils.date.DateUtil(i, i2, dateUtil2.getDay());
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = menstruationActivity.settingBean;
        if (menstruationBean == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingBean");
            menstruationBean = null;
        }
        viewModel.addMenstruationData(context, dateUtil3, false, menstruationBean);
        if (i == dateUtil2.getYear() && i2 == dateUtil2.getMonth()) {
            dateUtil = new com.qcwireless.qc_utils.date.DateUtil(i, i2, dateUtil2.getDay());
        } else {
            dateUtil = new com.qcwireless.qc_utils.date.DateUtil(i, i2, 1);
        }
        menstruationActivity.selectDate = dateUtil;
        if (i == dateUtil2.getYear() && i2 == dateUtil2.getMonth()) {
            activityMenstruationBinding.qcDateChange.setMonth(new com.qcwireless.qc_utils.date.DateUtil(i, i2, dateUtil2.getDay()));
        } else {
            activityMenstruationBinding.qcDateChange.setMonth(new com.qcwireless.qc_utils.date.DateUtil(i, i2, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3, reason: not valid java name */
    public static final void m1122setupViews$lambda3(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity menstruationActivity, com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationSettingUI menstruationSettingUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationActivity, "this$0");
        menstruationActivity.settingBean = menstruationSettingUI.getEntity();
        menstruationActivity.addOrUpdate(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4, reason: not valid java name */
    public static final void m1123setupViews$lambda4(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity menstruationActivity, com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationShowUI menstruationShowUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding activityMenstruationBinding = menstruationActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding activityMenstruationBinding2 = null;
        if (activityMenstruationBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMenstruationBinding = null;
        }
        activityMenstruationBinding.calendarView.setSchemeDate(menstruationShowUI.getMap());
        com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding activityMenstruationBinding3 = menstruationActivity.binding;
        if (activityMenstruationBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMenstruationBinding2 = activityMenstruationBinding3;
        }
        activityMenstruationBinding2.calendarView.scrollToCalendar(menstruationActivity.selectDate.getYear(), menstruationActivity.selectDate.getMonth(), menstruationActivity.selectDate.getDay());
    }

    protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        setupViews();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addOrUpdate(boolean check) {
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(this.selectDate.getUnixTimestamp(), true);
        com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel viewModel = getViewModel();
        android.content.Context context = (android.content.Context) this;
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = this.settingBean;
        if (menstruationBean == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingBean");
            menstruationBean = null;
        }
        viewModel.addMenstruationData(context, dateUtil, check, menstruationBean);
    }

    /* compiled from: MenstruationActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/menstruation/MenstruationActivity$CalendarSelectListener;", "Lcom/haibin/calendarview/CalendarView$OnCalendarSelectListener;", "(Lcom/qcwireless/qcwatch/ui/home/menstruation/MenstruationActivity;)V", "onCalendarOutOfRange", "", "calendar", "Lcom/haibin/calendarview/Calendar;", "onCalendarSelect", "isClick", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class CalendarSelectListener implements com.haibin.calendarview.CalendarView.OnCalendarSelectListener {
        @Override // com.haibin.calendarview.CalendarView.OnCalendarSelectListener
        public void onCalendarOutOfRange(com.haibin.calendarview.Calendar calendar) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "calendar");
        }

        public CalendarSelectListener() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.haibin.calendarview.CalendarView.OnCalendarSelectListener
        public void onCalendarSelect(com.haibin.calendarview.Calendar calendar, boolean isClick) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "calendar");
            java.lang.String scheme = calendar.getScheme();
            com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding activityMenstruationBinding = null;
            if (scheme == null) {
                com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding activityMenstruationBinding2 = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this.binding;
                if (activityMenstruationBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityMenstruationBinding = activityMenstruationBinding2;
                }
                activityMenstruationBinding.tvNumberDay.setText(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_184));
                return;
            }
            if (scheme.length() == 0) {
                com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding activityMenstruationBinding3 = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this.binding;
                if (activityMenstruationBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityMenstruationBinding = activityMenstruationBinding3;
                }
                activityMenstruationBinding.tvNumberDay.setText(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_184));
                return;
            }
            switch (scheme.hashCode()) {
                case 49:
                    if (scheme.equals("1")) {
                        com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding activityMenstruationBinding4 = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this.binding;
                        if (activityMenstruationBinding4 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityMenstruationBinding = activityMenstruationBinding4;
                        }
                        activityMenstruationBinding.tvNumberDay.setText(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_186));
                        return;
                    }
                    break;
                case 50:
                    if (scheme.equals("2")) {
                        com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding activityMenstruationBinding5 = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this.binding;
                        if (activityMenstruationBinding5 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityMenstruationBinding = activityMenstruationBinding5;
                        }
                        activityMenstruationBinding.tvNumberDay.setText(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_187));
                        return;
                    }
                    break;
                case 51:
                    if (scheme.equals("3")) {
                        com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding activityMenstruationBinding6 = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this.binding;
                        if (activityMenstruationBinding6 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityMenstruationBinding = activityMenstruationBinding6;
                        }
                        activityMenstruationBinding.tvNumberDay.setText(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_185));
                        return;
                    }
                    break;
            }
            com.qcwireless.qcwatch.databinding.ActivityMenstruationBinding activityMenstruationBinding7 = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this.binding;
            if (activityMenstruationBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityMenstruationBinding = activityMenstruationBinding7;
            }
            activityMenstruationBinding.tvNumberDay.setText(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_184));
        }
    }
}
