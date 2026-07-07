package com.qcwireless.qcwatch.ui.home.bp;

/* compiled from: BloodPressureActivity.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0014J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\b\u0010\u0019\u001a\u00020\u0012H\u0014J\b\u0010\u001a\u001a\u00020\u0012H\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bp/BloodPressureActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityBloodPressureBinding;", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "deviceNotifyListener", "Lcom/qcwireless/qcwatch/ui/home/bp/BloodPressureActivity$MyDeviceNotifyListener;", "deviceSetting", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/bp/BloodPressureViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/bp/BloodPressureViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "setupViews", "MyDeviceNotifyListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BloodPressureActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding binding;
    private com.qcwireless.qc_utils.date.DateUtil date = new com.qcwireless.qc_utils.date.DateUtil();
    private com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.MyDeviceNotifyListener deviceNotifyListener;
    private com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public BloodPressureActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel m954invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding inflate = com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding.inflate(getLayoutInflater());
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
        getViewModel().initData(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        getViewModel().queryLastData();
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding2 = null;
        if (activityBloodPressureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodPressureBinding = null;
        }
        setStatusBarBackground(com.qcwireless.qcwatch.R.color.blood_pressure_bg);
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodPressureBinding.titleBar.divider);
        activityBloodPressureBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_86));
        final com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qDateSwitchView = activityBloodPressureBinding.qcDateChange;
        qDateSwitchView.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity$setupViews$1$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore
            public void clickBefore(boolean r1, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
                com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.this.date = dateUtil;
                qDateSwitchView.setDateUtil(dateUtil);
                com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.this.getViewModel().queryBloodPressureByDate(dateUtil);
            }
        });
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityBloodPressureBinding.titleBar.tvRightText);
        activityBloodPressureBinding.titleBar.tvRightText.setBackgroundResource(com.qcwireless.qcwatch.R.mipmap.app_warming);
        activityBloodPressureBinding.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.m947setupViews$lambda2$lambda1(com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.this, view);
            }
        });
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity$$ExternalSyntheticLambda5
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.m948setupViews$lambda3(com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.this, (com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureUI) obj);
            }
        });
        getViewModel().getLastDate().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity$$ExternalSyntheticLambda3
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.m949setupViews$lambda4(com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.this, (com.qcwireless.qc_utils.date.DateUtil) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding3 = this.binding;
        if (activityBloodPressureBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodPressureBinding3 = null;
        }
        activityBloodPressureBinding3.bloodPressureChatView.setSelectedListener(new com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartView.OnSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity$$ExternalSyntheticLambda6
            @Override // com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartView.OnSelectedListener
            public final void onSelected(com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartView.BpDataBean bpDataBean) {
                com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.m950setupViews$lambda5(com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.this, bpDataBean);
            }
        });
        getViewModel().getDeviceSetting().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity$$ExternalSyntheticLambda4
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.m951setupViews$lambda6(com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.this, (com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding4 = this.binding;
        if (activityBloodPressureBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodPressureBinding4 = null;
        }
        activityBloodPressureBinding4.qcSettingBloodPressure.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity$$ExternalSyntheticLambda2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.m952setupViews$lambda7(com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.this, compoundButton, z);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding5 = this.binding;
        if (activityBloodPressureBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodPressureBinding5 = null;
        }
        activityBloodPressureBinding5.bpValueDetail.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity$setupViews$7
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qc_utils.date.DateUtil dateUtil;
                android.os.Bundle bundle = new android.os.Bundle();
                dateUtil = com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.this.date;
                bundle.putInt("timestamp", (int) dateUtil.getUnixTimestamp());
                android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.this;
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.bp.BloodPressureDataDetailActivity.class);
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
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding6 = this.binding;
        if (activityBloodPressureBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityBloodPressureBinding2 = activityBloodPressureBinding6;
        }
        activityBloodPressureBinding2.qcSettingBloodPressure.setSubTitleClick(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.m953setupViews$lambda8(com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-2$lambda-1, reason: not valid java name */
    public static final void m947setupViews$lambda2$lambda1(com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity bloodPressureActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureActivity, "this$0");
        android.app.Activity activity = (android.app.Activity) bloodPressureActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.bp.BloodPressureGuideActivity.class);
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
    /* renamed from: setupViews$lambda-3, reason: not valid java name */
    public static final void m948setupViews$lambda3(com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity bloodPressureActivity, com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureUI bloodPressureUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureActivity, "this$0");
        if (bloodPressureUI != null) {
            com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding = bloodPressureActivity.binding;
            com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding2 = null;
            if (activityBloodPressureBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodPressureBinding = null;
            }
            activityBloodPressureBinding.bloodPressureChatView.setData(bloodPressureUI.getListData(), bloodPressureUI.getToday());
            if (bloodPressureUI.getListData().isEmpty()) {
                com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding3 = bloodPressureActivity.binding;
                if (activityBloodPressureBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityBloodPressureBinding2 = activityBloodPressureBinding3;
                }
                activityBloodPressureBinding2.bpValueDetail.setRightText("");
                return;
            }
            int min = bloodPressureUI.getListData().get(0).getMin();
            com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding4 = bloodPressureActivity.binding;
            if (activityBloodPressureBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityBloodPressureBinding2 = activityBloodPressureBinding4;
            }
            activityBloodPressureBinding2.bpValueDetail.setRightText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(min));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4, reason: not valid java name */
    public static final void m949setupViews$lambda4(com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity bloodPressureActivity, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dateUtil, "it");
        bloodPressureActivity.date = dateUtil;
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding = bloodPressureActivity.binding;
        if (activityBloodPressureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodPressureBinding = null;
        }
        activityBloodPressureBinding.qcDateChange.setDateUtil(dateUtil);
        bloodPressureActivity.getViewModel().queryBloodPressureByDate(dateUtil);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-5, reason: not valid java name */
    public static final void m950setupViews$lambda5(com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity bloodPressureActivity, final com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartView.BpDataBean bpDataBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureActivity, "this$0");
        if (bpDataBean != null) {
            if (bpDataBean.getSbp() == 0) {
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(bloodPressureActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity$setupViews$4$1
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity bloodPressureActivity2) {
                        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureActivity2, "$this$ktxRunOnUi");
                        activityBloodPressureBinding = bloodPressureActivity2.binding;
                        if (activityBloodPressureBinding == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityBloodPressureBinding = null;
                        }
                        activityBloodPressureBinding.bpValue.setText("--");
                    }
                });
            } else {
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(bloodPressureActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity$setupViews$4$2
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity bloodPressureActivity2) {
                        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureActivity2, "$this$ktxRunOnUi");
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartView.BpDataBean.this.getSbp());
                        sb.append('/');
                        sb.append(com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartView.BpDataBean.this.getDbp());
                        java.lang.String sb2 = sb.toString();
                        activityBloodPressureBinding = bloodPressureActivity2.binding;
                        if (activityBloodPressureBinding == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityBloodPressureBinding = null;
                        }
                        activityBloodPressureBinding.bpValue.setText(sb2);
                    }
                });
            }
            com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding = bloodPressureActivity.binding;
            if (activityBloodPressureBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodPressureBinding = null;
            }
            activityBloodPressureBinding.tvHM.setText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(bpDataBean.getMin()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-6, reason: not valid java name */
    public static final void m951setupViews$lambda6(com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity bloodPressureActivity, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceSetting, "it");
        bloodPressureActivity.deviceSetting = deviceSetting;
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding = bloodPressureActivity.binding;
        if (activityBloodPressureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodPressureBinding = null;
        }
        activityBloodPressureBinding.qcSettingBloodPressure.setChecked(deviceSetting.getBpSwitch());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-7, reason: not valid java name */
    public static final void m952setupViews$lambda7(com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity bloodPressureActivity, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureActivity, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = bloodPressureActivity.deviceSetting;
            if (deviceSetting2 != null) {
                if (deviceSetting2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                    deviceSetting2 = null;
                }
                deviceSetting2.setBpSwitch(z);
                com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel viewModel = bloodPressureActivity.getViewModel();
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = bloodPressureActivity.deviceSetting;
                if (deviceSetting3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                } else {
                    deviceSetting = deviceSetting3;
                }
                viewModel.saveDeviceSetting(deviceAddressNoClear, deviceSetting);
                return;
            }
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding = bloodPressureActivity.binding;
        if (activityBloodPressureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodPressureBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItemTitleSubTitleSystem qSettingItemTitleSubTitleSystem = activityBloodPressureBinding.qcSettingBloodPressure;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = bloodPressureActivity.deviceSetting;
        if (deviceSetting4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting4 = null;
        }
        qSettingItemTitleSubTitleSystem.setChecked(deviceSetting4.getBpSwitch());
        java.lang.String string = bloodPressureActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-8, reason: not valid java name */
    public static final void m953setupViews$lambda8(com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity bloodPressureActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding = bloodPressureActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding2 = null;
        if (activityBloodPressureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodPressureBinding = null;
        }
        if (activityBloodPressureBinding.qcSettingBloodPressure.getTextLines() == 2) {
            com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding3 = bloodPressureActivity.binding;
            if (activityBloodPressureBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodPressureBinding3 = null;
            }
            activityBloodPressureBinding3.qcSettingBloodPressure.startAnim(180.0f);
            com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding4 = bloodPressureActivity.binding;
            if (activityBloodPressureBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityBloodPressureBinding2 = activityBloodPressureBinding4;
            }
            activityBloodPressureBinding2.qcSettingBloodPressure.setTextLines(20);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding5 = bloodPressureActivity.binding;
        if (activityBloodPressureBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodPressureBinding5 = null;
        }
        activityBloodPressureBinding5.qcSettingBloodPressure.startAnim(360.0f);
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding activityBloodPressureBinding6 = bloodPressureActivity.binding;
        if (activityBloodPressureBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityBloodPressureBinding2 = activityBloodPressureBinding6;
        }
        activityBloodPressureBinding2.qcSettingBloodPressure.setTextLines(2);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        this.deviceNotifyListener = new com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.MyDeviceNotifyListener();
        com.oudmon.ble.base.bluetooth.BleOperateManager bleOperateManager = com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance();
        com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.MyDeviceNotifyListener myDeviceNotifyListener = this.deviceNotifyListener;
        if (myDeviceNotifyListener == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceNotifyListener");
            myDeviceNotifyListener = null;
        }
        bleOperateManager.addOutDeviceListener(2, myDeviceNotifyListener);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if ((messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent) && this.date.isToday()) {
            getViewModel().queryBloodPressureByDate(this.date);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().removeOutDeviceListener(2);
    }

    /* compiled from: BloodPressureActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bp/BloodPressureActivity$MyDeviceNotifyListener;", "Lcom/oudmon/ble/base/communication/responseImpl/DeviceNotifyListener;", "(Lcom/qcwireless/qcwatch/ui/home/bp/BloodPressureActivity;)V", "onDataResponse", "", "resultEntity", "Lcom/oudmon/ble/base/communication/rsp/DeviceNotifyRsp;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyDeviceNotifyListener extends com.oudmon.ble.base.communication.responseImpl.DeviceNotifyListener {
        public MyDeviceNotifyListener() {
        }

        @Override // com.oudmon.ble.base.communication.responseImpl.DeviceNotifyListener, com.oudmon.ble.base.communication.ICommandResponse
        public void onDataResponse(com.oudmon.ble.base.communication.rsp.DeviceNotifyRsp resultEntity) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(resultEntity);
            if (resultEntity.getStatus() == 0 && resultEntity.getDataType() == 2) {
                com.qcwireless.qcwatch.ui.home.bp.BloodPressureActivity.this.getViewModel().syncBp();
            }
        }
    }
}
