package com.qcwireless.qcwatch.ui.home.temperature;

/* compiled from: TemperatureActivity.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\b\u0010\u0017\u001a\u00020\u0010H\u0014J\b\u0010\u0018\u001a\u00020\u0010H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/temperature/TemperatureActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityTemperatureBinding;", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "deviceNotifyListener", "Lcom/qcwireless/qcwatch/ui/home/temperature/TemperatureActivity$MyDeviceNotifyListener;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/temperature/vm/TemperatureViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/temperature/vm/TemperatureViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "setupViews", "MyDeviceNotifyListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class TemperatureActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding binding;
    private com.qcwireless.qc_utils.date.DateUtil date = new com.qcwireless.qc_utils.date.DateUtil();
    private com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity.MyDeviceNotifyListener deviceNotifyListener;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public TemperatureActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel m1237invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding inflate = com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding.inflate(getLayoutInflater());
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
        setStatusBarBackground(com.qcwireless.qcwatch.R.color.temperature_bg);
        getViewModel().queryLastDate();
        final com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding2 = null;
        if (activityTemperatureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTemperatureBinding = null;
        }
        activityTemperatureBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_93));
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityTemperatureBinding.titleBar.tvRightText);
        activityTemperatureBinding.titleBar.tvRightText.setBackgroundResource(com.qcwireless.qcwatch.R.mipmap.app_warming);
        activityTemperatureBinding.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity.m1233setupViews$lambda3$lambda0(com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity.this, view);
            }
        });
        final com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qDateSwitchView = activityTemperatureBinding.qcDateChange;
        qDateSwitchView.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity$setupViews$1$2$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore
            public void clickBefore(boolean r1, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
                com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.this.setDateUtil(dateUtil);
                this.date = dateUtil;
                this.getViewModel().getTemperatureByDate(dateUtil);
            }
        });
        activityTemperatureBinding.temperatureChatView.setSelectedListener(new com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.OnSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity$$ExternalSyntheticLambda3
            @Override // com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.OnSelectedListener
            public final void onSelected(com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean temperatureDataBean) {
                com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity.m1234setupViews$lambda3$lambda2(com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding.this, this, temperatureDataBean);
            }
        });
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getTemperature()) {
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding3 = this.binding;
            if (activityTemperatureBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureBinding3 = null;
            }
            android.widget.TextView textView = activityTemperatureBinding3.tvInfo1;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_334);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_334)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{"96.8~98.6°F", "99.14°F", "99.14-100.4℉", "100.58-104℉", "104°F"}, 5));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            textView.setText(format);
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding4 = this.binding;
            if (activityTemperatureBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityTemperatureBinding2 = activityTemperatureBinding4;
            }
            android.widget.TextView textView2 = activityTemperatureBinding2.tvInfo2;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_333);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_333)");
            java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{"97.3~99.0°F", "32.4~33.0°F", "33.4°F", "32.6°F"}, 4));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
            textView2.setText(format2);
        } else {
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding5 = this.binding;
            if (activityTemperatureBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureBinding5 = null;
            }
            android.widget.TextView textView3 = activityTemperatureBinding5.tvInfo1;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string3 = getString(com.qcwireless.qcwatch.R.string.qc_text_334);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_334)");
            java.lang.String format3 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{"36～37℃", "37.3℃", "37.3～38℃", "38.1～40℃", "40°C"}, 5));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "format(format, *args)");
            textView3.setText(format3);
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding6 = this.binding;
            if (activityTemperatureBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityTemperatureBinding2 = activityTemperatureBinding6;
            }
            android.widget.TextView textView4 = activityTemperatureBinding2.tvInfo2;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject4 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string4 = getString(com.qcwireless.qcwatch.R.string.qc_text_333);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_333)");
            java.lang.String format4 = java.lang.String.format(string4, java.util.Arrays.copyOf(new java.lang.Object[]{"36.3℃～37.2℃", "0.2℃～0.5℃", "0.8°C", "0.4°C"}, 4));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format4, "format(format, *args)");
            textView4.setText(format4);
        }
        activityTemperatureBinding.temperatureValueDetail.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity$setupViews$1$4
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qc_utils.date.DateUtil dateUtil;
                android.os.Bundle bundle = new android.os.Bundle();
                dateUtil = com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity.this.date;
                bundle.putInt("timestamp", (int) dateUtil.getUnixTimestamp());
                android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity.this;
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.temperature.TemperatureDataDetailActivity.class);
                intent.setFlags(1);
                intent.putExtras(bundle);
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
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getLastDate().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity.m1235setupViews$lambda4(com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity.this, (com.qcwireless.qc_utils.date.DateUtil) obj);
            }
        });
        getViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity$$ExternalSyntheticLambda2
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity.m1236setupViews$lambda5(com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity.this, (com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel.TemperatureUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-3$lambda-0, reason: not valid java name */
    public static final void m1233setupViews$lambda3$lambda0(com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity temperatureActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(temperatureActivity, "this$0");
        android.app.Activity activity = (android.app.Activity) temperatureActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.temperature.TemperatureGuideActivity.class);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3$lambda-2, reason: not valid java name */
    public static final void m1234setupViews$lambda3$lambda2(com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding, com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity temperatureActivity, final com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean temperatureDataBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTemperatureBinding, "$this_run");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(temperatureActivity, "this$0");
        if (temperatureDataBean.getValue() > 0.0f) {
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(activityTemperatureBinding, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity$setupViews$1$3$1
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTemperatureBinding2, "$this$ktxRunOnUi");
                    if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getTemperature()) {
                        android.widget.TextView textView = activityTemperatureBinding2.tvTemperatureValue;
                        java.lang.String format = java.lang.String.format("%.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf((com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean.this.getValue() * 1.8f) + 32)}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
                        textView.setText(format);
                    } else {
                        activityTemperatureBinding2.tvTemperatureValue.setText(java.lang.String.valueOf(com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean.this.getValue()));
                    }
                    activityTemperatureBinding2.tvHM.setText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean.this.getMin()));
                }
            });
        } else {
            activityTemperatureBinding.tvTemperatureValue.setText("--");
            activityTemperatureBinding.tvHM.setText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(temperatureDataBean.getMin()));
        }
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getTemperature()) {
            activityTemperatureBinding.tvTemperatureUnit.setText(temperatureActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_28));
        } else {
            activityTemperatureBinding.tvTemperatureUnit.setText(temperatureActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_27));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4, reason: not valid java name */
    public static final void m1235setupViews$lambda4(com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity temperatureActivity, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(temperatureActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dateUtil, "it");
        temperatureActivity.date = dateUtil;
        com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding = temperatureActivity.binding;
        if (activityTemperatureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTemperatureBinding = null;
        }
        activityTemperatureBinding.qcDateChange.setDateUtil(dateUtil);
        temperatureActivity.getViewModel().getTemperatureByDate(dateUtil);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-5, reason: not valid java name */
    public static final void m1236setupViews$lambda5(com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity temperatureActivity, com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel.TemperatureUI temperatureUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(temperatureActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding = temperatureActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding2 = null;
        if (activityTemperatureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTemperatureBinding = null;
        }
        activityTemperatureBinding.temperatureChatView.setData(temperatureUI.getData(), temperatureActivity.date.isToday(), com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getTemperature());
        if (!temperatureUI.getData().isEmpty()) {
            int i = 0;
            for (com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean temperatureDataBean : temperatureUI.getData()) {
                if (temperatureDataBean.getValue() > 0.0f) {
                    i = temperatureDataBean.getMin();
                }
            }
            java.lang.String dayMinToStr = com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(i);
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding3 = temperatureActivity.binding;
            if (activityTemperatureBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureBinding3 = null;
            }
            activityTemperatureBinding3.temperatureValueDetail.setRightText(dayMinToStr);
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean temperatureDataBean2 : temperatureUI.getData()) {
                if (temperatureDataBean2.getValue() >= 37.299d) {
                    i2++;
                } else {
                    double value = temperatureDataBean2.getValue();
                    if (35.9999999d <= value && value <= 37.298d) {
                        i3++;
                    } else if (temperatureDataBean2.getValue() <= 35.9999998d) {
                        i4++;
                    }
                }
            }
            int[] iArr = {0, 0, 0, 0, 0};
            iArr[0] = i2;
            iArr[3] = i3;
            iArr[4] = i4;
            int i5 = i2 + i4 + i3;
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding4 = temperatureActivity.binding;
            if (activityTemperatureBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureBinding4 = null;
            }
            activityTemperatureBinding4.temperatureCircleView.dataInit(iArr);
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding5 = temperatureActivity.binding;
            if (activityTemperatureBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureBinding5 = null;
            }
            android.widget.TextView textView = activityTemperatureBinding5.tvValue1;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            float f = 100;
            float f2 = i5;
            sb.append(java.lang.Math.round(((i4 * 1.0f) * f) / f2));
            sb.append('%');
            textView.setText(sb.toString());
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding6 = temperatureActivity.binding;
            if (activityTemperatureBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureBinding6 = null;
            }
            android.widget.TextView textView2 = activityTemperatureBinding6.tvValue2;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(java.lang.Math.round(((i2 * 1.0f) * f) / f2));
            sb2.append('%');
            textView2.setText(sb2.toString());
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding7 = temperatureActivity.binding;
            if (activityTemperatureBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureBinding7 = null;
            }
            android.widget.TextView textView3 = activityTemperatureBinding7.tvValue3;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(java.lang.Math.round(((i3 * 1.0f) * f) / f2));
            sb3.append('%');
            textView3.setText(sb3.toString());
        } else {
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding8 = temperatureActivity.binding;
            if (activityTemperatureBinding8 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureBinding8 = null;
            }
            activityTemperatureBinding8.temperatureValueDetail.setRightText("");
            int[] iArr2 = {0, 0, 0, 0, 0};
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding9 = temperatureActivity.binding;
            if (activityTemperatureBinding9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureBinding9 = null;
            }
            activityTemperatureBinding9.temperatureCircleView.dataInit(iArr2);
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding10 = temperatureActivity.binding;
            if (activityTemperatureBinding10 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureBinding10 = null;
            }
            activityTemperatureBinding10.tvValue1.setText("--");
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding11 = temperatureActivity.binding;
            if (activityTemperatureBinding11 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureBinding11 = null;
            }
            activityTemperatureBinding11.tvValue2.setText("--");
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding12 = temperatureActivity.binding;
            if (activityTemperatureBinding12 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureBinding12 = null;
            }
            activityTemperatureBinding12.tvValue3.setText("--");
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding13 = temperatureActivity.binding;
            if (activityTemperatureBinding13 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureBinding13 = null;
            }
            activityTemperatureBinding13.tvTemperatureValue.setText("--");
        }
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getTemperature()) {
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding14 = temperatureActivity.binding;
            if (activityTemperatureBinding14 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureBinding14 = null;
            }
            activityTemperatureBinding14.tv1.setText(">=99.1°F");
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding15 = temperatureActivity.binding;
            if (activityTemperatureBinding15 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityTemperatureBinding15 = null;
            }
            activityTemperatureBinding15.tv4.setText("96.8~99.0°F");
            com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding16 = temperatureActivity.binding;
            if (activityTemperatureBinding16 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityTemperatureBinding2 = activityTemperatureBinding16;
            }
            activityTemperatureBinding2.tv5.setText("≤96.6°F");
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding17 = temperatureActivity.binding;
        if (activityTemperatureBinding17 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTemperatureBinding17 = null;
        }
        activityTemperatureBinding17.tv1.setText(">=37.3℃");
        com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding18 = temperatureActivity.binding;
        if (activityTemperatureBinding18 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTemperatureBinding18 = null;
        }
        activityTemperatureBinding18.tv4.setText("36~37.2℃");
        com.qcwireless.qcwatch.databinding.ActivityTemperatureBinding activityTemperatureBinding19 = temperatureActivity.binding;
        if (activityTemperatureBinding19 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityTemperatureBinding2 = activityTemperatureBinding19;
        }
        activityTemperatureBinding2.tv5.setText("≤35.9℃");
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        this.deviceNotifyListener = new com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity.MyDeviceNotifyListener();
        com.oudmon.ble.base.bluetooth.BleOperateManager bleOperateManager = com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance();
        com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity.MyDeviceNotifyListener myDeviceNotifyListener = this.deviceNotifyListener;
        if (myDeviceNotifyListener == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceNotifyListener");
            myDeviceNotifyListener = null;
        }
        bleOperateManager.addOutDeviceListener(5, myDeviceNotifyListener);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if ((messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent) && this.date.isToday()) {
            getViewModel().queryLastDate();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().removeNotifyListener(5);
    }

    /* compiled from: TemperatureActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/temperature/TemperatureActivity$MyDeviceNotifyListener;", "Lcom/oudmon/ble/base/communication/responseImpl/DeviceNotifyListener;", "(Lcom/qcwireless/qcwatch/ui/home/temperature/TemperatureActivity;)V", "onDataResponse", "", "resultEntity", "Lcom/oudmon/ble/base/communication/rsp/DeviceNotifyRsp;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyDeviceNotifyListener extends com.oudmon.ble.base.communication.responseImpl.DeviceNotifyListener {
        public MyDeviceNotifyListener() {
        }

        @Override // com.oudmon.ble.base.communication.responseImpl.DeviceNotifyListener, com.oudmon.ble.base.communication.ICommandResponse
        public void onDataResponse(com.oudmon.ble.base.communication.rsp.DeviceNotifyRsp resultEntity) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(resultEntity);
            if (resultEntity.getStatus() == 0 && resultEntity.getDataType() == 5) {
                com.qcwireless.qcwatch.ui.home.temperature.TemperatureActivity.this.getViewModel().syncTemperatureSingleCheck();
            }
        }
    }
}
