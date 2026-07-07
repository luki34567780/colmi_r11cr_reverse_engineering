package com.qcwireless.qcwatch.ui.device.remind;

/* compiled from: AiReminderActivity.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0014J@\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0002J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/remind/AiReminderActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/device/remind/adapter/AlarmListAdapter;", "aiReminderViewModel", "Lcom/qcwireless/qcwatch/ui/device/remind/AiReminderViewModel;", "getAiReminderViewModel", "()Lcom/qcwireless/qcwatch/ui/device/remind/AiReminderViewModel;", "aiReminderViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityAiReminderBinding;", "settingDevice", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "setupViews", "showTimeDialog", "position", "", "title", "", "h", "m", "week", "alarmIndex", "addFlag", "", "showUnitDialog", "showWeatherDialog", "MyAdapterListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class AiReminderActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter adapter;

    /* renamed from: aiReminderViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy aiReminderViewModel;
    private com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding binding;
    private com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting settingDevice;

    public AiReminderActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.aiReminderViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel m867invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel getAiReminderViewModel() {
        return (com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel) this.aiReminderViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding inflate = com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding.inflate(getLayoutInflater());
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
        showLoadingDialogTimeout(com.google.android.gms.fitness.FitnessStatusCodes.NEEDS_OAUTH_PERMISSIONS);
        android.content.Context context = (android.content.Context) this;
        this.adapter = new com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter(context, getAiReminderViewModel().getAlarmList());
        com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding activityAiReminderBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding activityAiReminderBinding2 = null;
        if (activityAiReminderBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityAiReminderBinding = null;
        }
        activityAiReminderBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_12));
        activityAiReminderBinding.qcLongSit.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity$setupViews$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this;
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.class);
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
        });
        activityAiReminderBinding.qcDrink.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity$setupViews$1$2
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this;
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.class);
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
        });
        activityAiReminderBinding.rcvAlarm.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityAiReminderBinding.rcvAlarm;
        com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter alarmListAdapter = this.adapter;
        if (alarmListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            alarmListAdapter = null;
        }
        recyclerView.setAdapter(alarmListAdapter);
        activityAiReminderBinding.rcvAlarm.addOnItemTouchListener(new com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.OnSwipeItemTouchListener(context));
        activityAiReminderBinding.qcSettingWeather.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity$setupViews$1$3
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.showWeatherDialog();
            }
        });
        activityAiReminderBinding.qcSettingUnit.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity$setupViews$1$4
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.showUnitDialog();
            }
        });
        com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter alarmListAdapter2 = this.adapter;
        if (alarmListAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            alarmListAdapter2 = null;
        }
        alarmListAdapter2.initListener(new com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.MyAdapterListener());
        getAiReminderViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.m863setupViews$lambda2(com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this, (com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting) obj);
            }
        });
        android.view.View[] viewArr = new android.view.View[1];
        com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding activityAiReminderBinding3 = this.binding;
        if (activityAiReminderBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityAiReminderBinding2 = activityAiReminderBinding3;
        }
        viewArr[0] = activityAiReminderBinding2.addAlarm;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity$setupViews$3
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding activityAiReminderBinding4;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityAiReminderBinding4 = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.binding;
                if (activityAiReminderBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityAiReminderBinding4 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityAiReminderBinding4.addAlarm)) {
                    if (com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.getAiReminderViewModel().getAlarmList().size() >= com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.getAiReminderViewModel().getMax()) {
                        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                        java.lang.String string = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_81);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_81)");
                        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.getAiReminderViewModel().getMax())}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(format, 0, 1, null);
                        return;
                    }
                    com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
                    com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity aiReminderActivity = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this;
                    aiReminderActivity.showTimeDialog(aiReminderActivity.getAiReminderViewModel().getAlarmList().size(), "", dateUtil.getHour(), dateUtil.getMinute(), com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4, com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.getAiReminderViewModel().getAlarmList().size(), true);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m863setupViews$lambda2(final com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity aiReminderActivity, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aiReminderActivity, "this$0");
        com.oudmon.ble.base.util.ThreadUtils.postDelay(new com.oudmon.ble.base.util.ThreadUtils.TimeTask() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity$setupViews$2$1
            @Override // com.oudmon.ble.base.util.ThreadUtils.TimeTask
            protected void task() {
                com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.dismissLoadingDialog();
            }
        }, 1000L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceSetting, "it");
        aiReminderActivity.settingDevice = deviceSetting;
        aiReminderActivity.getAiReminderViewModel().getAlarmList().clear();
        for (com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean alarmBean : deviceSetting.getAlarmList()) {
            if (alarmBean.getDefault()) {
                aiReminderActivity.getAiReminderViewModel().getAlarmList().add(alarmBean);
            }
        }
        com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter alarmListAdapter = aiReminderActivity.adapter;
        com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding activityAiReminderBinding = null;
        if (alarmListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            alarmListAdapter = null;
        }
        alarmListAdapter.notifyDataSetChanged();
        com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding activityAiReminderBinding2 = aiReminderActivity.binding;
        if (activityAiReminderBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityAiReminderBinding = activityAiReminderBinding2;
        }
        if (deviceSetting.getLongSitSwitch()) {
            activityAiReminderBinding.qcLongSit.setRightText(aiReminderActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_22));
        } else {
            activityAiReminderBinding.qcLongSit.setRightText(aiReminderActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_21));
        }
        if (deviceSetting.getDrinkSwitch()) {
            activityAiReminderBinding.qcDrink.setRightText(aiReminderActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_22));
        } else {
            activityAiReminderBinding.qcDrink.setRightText(aiReminderActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_21));
        }
    }

    /* compiled from: AiReminderActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/remind/AiReminderActivity$MyAdapterListener;", "Lcom/qcwireless/qcwatch/ui/device/remind/adapter/AlarmListAdapter$InitListener;", "(Lcom/qcwireless/qcwatch/ui/device/remind/AiReminderActivity;)V", "onCheckChange", "", "position", "", "checked", "", "onDeleteItem", "onItemClickListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private final class MyAdapterListener implements com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter.InitListener {
        public MyAdapterListener() {
        }

        @Override // com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter.InitListener
        public void onItemClickListener(int position) {
            com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean alarmBean = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.getAiReminderViewModel().getAlarmList().get(position);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, alarmBean);
            com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.showTimeDialog(alarmBean.getIndex(), alarmBean.getTitle(), alarmBean.getTime() / 60, alarmBean.getTime() % 60, alarmBean.getWeek(), alarmBean.getIndex(), false);
        }

        @Override // com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter.InitListener
        public void onCheckChange(int position, boolean checked) {
            com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean alarmBean = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.getAiReminderViewModel().getAlarmList().get(position);
            com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.getAiReminderViewModel().getAlarmList().get(position).setSwitch(checked);
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.settingDevice;
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = null;
            if (deviceSetting == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
                deviceSetting = null;
            }
            deviceSetting.getAlarmList().set(position, alarmBean);
            com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel aiReminderViewModel = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.getAiReminderViewModel();
            java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.settingDevice;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
                deviceSetting3 = null;
            }
            aiReminderViewModel.saveReminder(deviceAddressNoClear, deviceSetting3);
            com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel aiReminderViewModel2 = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.getAiReminderViewModel();
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.settingDevice;
            if (deviceSetting4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
            } else {
                deviceSetting2 = deviceSetting4;
            }
            aiReminderViewModel2.execAlarm(deviceSetting2);
        }

        @Override // com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter.InitListener
        public void onDeleteItem(int position) {
            com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean alarmBean = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.getAiReminderViewModel().getAlarmList().get(position);
            com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.getAiReminderViewModel().getAlarmList().remove(position);
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.settingDevice;
            com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter alarmListAdapter = null;
            if (deviceSetting == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
                deviceSetting = null;
            }
            deviceSetting.getAlarmList().remove(position);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, alarmBean);
            com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel aiReminderViewModel = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.getAiReminderViewModel();
            java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.settingDevice;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
                deviceSetting2 = null;
            }
            aiReminderViewModel.saveReminder(deviceAddressNoClear, deviceSetting2);
            com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel aiReminderViewModel2 = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.getAiReminderViewModel();
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.settingDevice;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
                deviceSetting3 = null;
            }
            aiReminderViewModel2.execAlarm(deviceSetting3);
            com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter alarmListAdapter2 = com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this.adapter;
            if (alarmListAdapter2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                alarmListAdapter = alarmListAdapter2;
            }
            alarmListAdapter.notifyDataSetChanged();
        }
    }

    public final void showUnitDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomListDialog create = new com.qcwireless.qcwatch.base.dialog.BottomListDialog.Builder(getActivity()).create();
        create.show();
        create.initView();
        create.setSubTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_34));
        create.setData(getAiReminderViewModel().getUnitList());
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity$$ExternalSyntheticLambda2
            @Override // com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener
            public final void onSelected(int i) {
                com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.m865showUnitDialog$lambda4(com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showUnitDialog$lambda-4, reason: not valid java name */
    public static final void m865showUnitDialog$lambda4(com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity aiReminderActivity, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aiReminderActivity, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (i == 0) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = aiReminderActivity.settingDevice;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
                deviceSetting2 = null;
            }
            deviceSetting2.setMetricUnit(0);
            com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding activityAiReminderBinding = aiReminderActivity.binding;
            if (activityAiReminderBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityAiReminderBinding = null;
            }
            activityAiReminderBinding.qcSettingUnit.setRightText(aiReminderActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_23));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMetric(true);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        } else if (i == 1) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = aiReminderActivity.settingDevice;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
                deviceSetting3 = null;
            }
            deviceSetting3.setMetricUnit(1);
            com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding activityAiReminderBinding2 = aiReminderActivity.binding;
            if (activityAiReminderBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityAiReminderBinding2 = null;
            }
            activityAiReminderBinding2.qcSettingUnit.setRightText(aiReminderActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_24));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMetric(false);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        }
        com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel aiReminderViewModel = aiReminderActivity.getAiReminderViewModel();
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.DeviceUnitEvent());
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = aiReminderActivity.settingDevice;
        if (deviceSetting4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
            deviceSetting4 = null;
        }
        aiReminderViewModel.execUnit(deviceSetting4);
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting5 = aiReminderActivity.settingDevice;
        if (deviceSetting5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
            deviceSetting5 = null;
        }
        aiReminderViewModel.initDialogData(deviceSetting5);
        java.lang.String deviceAddress = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting6 = aiReminderActivity.settingDevice;
        if (deviceSetting6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
        } else {
            deviceSetting = deviceSetting6;
        }
        aiReminderViewModel.saveDeviceSetting(deviceAddress, deviceSetting);
    }

    public final void showWeatherDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomListDialog create = new com.qcwireless.qcwatch.base.dialog.BottomListDialog.Builder(getActivity()).create();
        create.show();
        create.initView();
        create.setSubTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_34));
        create.setData(getAiReminderViewModel().getWeatherUnitList());
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity$$ExternalSyntheticLambda1
            @Override // com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener
            public final void onSelected(int i) {
                com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.m866showWeatherDialog$lambda6(com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showWeatherDialog$lambda-6, reason: not valid java name */
    public static final void m866showWeatherDialog$lambda6(com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity aiReminderActivity, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aiReminderActivity, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (i == 0) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = aiReminderActivity.settingDevice;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
                deviceSetting2 = null;
            }
            deviceSetting2.setWeatherFormat(0);
            com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding activityAiReminderBinding = aiReminderActivity.binding;
            if (activityAiReminderBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityAiReminderBinding = null;
            }
            activityAiReminderBinding.qcSettingWeather.setRightText(aiReminderActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_27));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setTemperature(false);
        } else if (i == 1) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = aiReminderActivity.settingDevice;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
                deviceSetting3 = null;
            }
            deviceSetting3.setWeatherFormat(1);
            com.qcwireless.qcwatch.databinding.ActivityAiReminderBinding activityAiReminderBinding2 = aiReminderActivity.binding;
            if (activityAiReminderBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityAiReminderBinding2 = null;
            }
            activityAiReminderBinding2.qcSettingWeather.setRightText(aiReminderActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_28));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setTemperature(true);
        }
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel aiReminderViewModel = aiReminderActivity.getAiReminderViewModel();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = aiReminderActivity.settingDevice;
        if (deviceSetting4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
            deviceSetting4 = null;
        }
        aiReminderViewModel.execWeather(deviceSetting4);
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting5 = aiReminderActivity.settingDevice;
        if (deviceSetting5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
            deviceSetting5 = null;
        }
        aiReminderViewModel.initDialogData(deviceSetting5);
        java.lang.String deviceAddress = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting6 = aiReminderActivity.settingDevice;
        if (deviceSetting6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
        } else {
            deviceSetting = deviceSetting6;
        }
        aiReminderViewModel.saveDeviceSetting(deviceAddress, deviceSetting);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        getAiReminderViewModel().initData(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showTimeDialog(int position, java.lang.String title, int h, int m, int week, final int alarmIndex, final boolean addFlag) {
        com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_remind_selector);
        com.qcwireless.qcwatch.base.dialog.BottomRemindDialog create = builder.create();
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.RemindDialogListener() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity$$ExternalSyntheticLambda3
            @Override // com.qcwireless.qcwatch.base.dialog.BottomRemindDialog.RemindDialogListener
            public final void time(int i, int i2, java.lang.String str, int i3) {
                com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.m864showTimeDialog$lambda7(addFlag, alarmIndex, this, i, i2, str, i3);
            }
        });
        create.initData((android.content.Context) this, week);
        create.setTitle(title);
        create.setCurrTime(h, m);
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showTimeDialog$lambda-7, reason: not valid java name */
    public static final void m864showTimeDialog$lambda7(boolean z, int i, com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity aiReminderActivity, int i2, int i3, java.lang.String str, int i4) {
        boolean z2;
        com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter alarmListAdapter;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aiReminderActivity, "this$0");
        if (z) {
            try {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(i));
                java.util.Iterator<com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean> it = aiReminderActivity.getAiReminderViewModel().getAlarmList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean next = it.next();
                    if (next.getWeek() == i4 && next.getTime() == (i2 * 60) + i3) {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    java.lang.String string = aiReminderActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_362);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_362)");
                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                    return;
                } else {
                    aiReminderActivity.getAiReminderViewModel().getAlarmList().add(new com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean(i, com.king.zxing.util.CodeUtils.DEFAULT_REQ_WIDTH, "", true, 0, false));
                    com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = aiReminderActivity.settingDevice;
                    if (deviceSetting == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
                        deviceSetting = null;
                    }
                    deviceSetting.getAlarmList().add(new com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean(i, com.king.zxing.util.CodeUtils.DEFAULT_REQ_WIDTH, "", true, 0, false));
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(aiReminderActivity.getAiReminderViewModel().getAlarmList().size()));
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (i > aiReminderActivity.getAiReminderViewModel().getAlarmList().size()) {
            return;
        }
        com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean alarmBean = aiReminderActivity.getAiReminderViewModel().getAlarmList().get(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "title");
        alarmBean.setTitle(str);
        aiReminderActivity.getAiReminderViewModel().getAlarmList().get(i).setWeek(i4);
        aiReminderActivity.getAiReminderViewModel().getAlarmList().get(i).setTime((i2 * 60) + i3);
        aiReminderActivity.getAiReminderViewModel().getAlarmList().get(i).setDefault(true);
        aiReminderActivity.getAiReminderViewModel().getAlarmList().get(i).setIndex(i);
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = aiReminderActivity.settingDevice;
        if (deviceSetting2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
            deviceSetting2 = null;
        }
        deviceSetting2.getAlarmList().set(i, aiReminderActivity.getAiReminderViewModel().getAlarmList().get(i));
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, aiReminderActivity.getAiReminderViewModel().getAlarmList());
        com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel aiReminderViewModel = aiReminderActivity.getAiReminderViewModel();
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = aiReminderActivity.settingDevice;
        if (deviceSetting3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
            deviceSetting3 = null;
        }
        aiReminderViewModel.saveReminder(deviceAddressNoClear, deviceSetting3);
        com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel aiReminderViewModel2 = aiReminderActivity.getAiReminderViewModel();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = aiReminderActivity.settingDevice;
        if (deviceSetting4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("settingDevice");
            deviceSetting4 = null;
        }
        aiReminderViewModel2.execAlarm(deviceSetting4);
        com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter alarmListAdapter2 = aiReminderActivity.adapter;
        if (alarmListAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            alarmListAdapter = null;
        } else {
            alarmListAdapter = alarmListAdapter2;
        }
        alarmListAdapter.notifyDataSetChanged();
    }
}
