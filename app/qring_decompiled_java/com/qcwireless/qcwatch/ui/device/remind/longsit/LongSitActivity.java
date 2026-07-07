package com.qcwireless.qcwatch.ui.device.remind.longsit;

/* compiled from: LongSitActivity.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0014J\u001e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJ\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/remind/longsit/LongSitActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/device/week/adapter/ModeAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityLongSitBinding;", "deviceSetting", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "longSitViewModel", "Lcom/qcwireless/qcwatch/ui/device/remind/longsit/LongSitViewModel;", "getLongSitViewModel", "()Lcom/qcwireless/qcwatch/ui/device/remind/longsit/LongSitViewModel;", "longSitViewModel$delegate", "Lkotlin/Lazy;", "modifyWeek", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "setupViews", "showTimeDialog", "title", "", "time", "", "type", "weekInit", "repeat", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class LongSitActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityLongSitBinding binding;
    private com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;

    /* renamed from: longSitViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy longSitViewModel;

    public LongSitActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.longSitViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel m889invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel getLongSitViewModel() {
        return (com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel) this.longSitViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityLongSitBinding inflate = com.qcwireless.qcwatch.databinding.ActivityLongSitBinding.inflate(getLayoutInflater());
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
        android.content.Context context = (android.content.Context) this;
        this.adapter = new com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter(context, getLongSitViewModel().getWeekList());
        com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel longSitViewModel = getLongSitViewModel();
        longSitViewModel.getLongSitSetting(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        longSitViewModel.getUiStatue().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.m885setupViews$lambda2$lambda1(com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this, (com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting) obj);
            }
        });
        com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter modeAdapter = this.adapter;
        com.qcwireless.qcwatch.databinding.ActivityLongSitBinding activityLongSitBinding = null;
        if (modeAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            modeAdapter = null;
        }
        modeAdapter.setSelectMode(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.SelectMode.MULTI_SELECT);
        final com.qcwireless.qcwatch.databinding.ActivityLongSitBinding activityLongSitBinding2 = this.binding;
        if (activityLongSitBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLongSitBinding2 = null;
        }
        activityLongSitBinding2.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_50));
        activityLongSitBinding2.titleBar.tvRightText.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_79));
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityLongSitBinding2.titleBar.tvRightText);
        activityLongSitBinding2.weekDayRecycler.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityLongSitBinding2.weekDayRecycler;
        com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter modeAdapter2 = this.adapter;
        if (modeAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            modeAdapter2 = null;
        }
        recyclerView.setAdapter(modeAdapter2);
        activityLongSitBinding2.weekDayRecycler.setNestedScrollingEnabled(false);
        activityLongSitBinding2.qcLongSwitch.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.m886setupViews$lambda4$lambda3(com.qcwireless.qcwatch.databinding.ActivityLongSitBinding.this, this, compoundButton, z);
            }
        });
        activityLongSitBinding2.qcLongSitStart.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity$setupViews$2$2
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;
                com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity longSitActivity = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this;
                java.lang.String string = longSitActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_39);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_39)");
                deviceSetting = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this.deviceSetting;
                if (deviceSetting == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                    deviceSetting = null;
                }
                longSitActivity.showTimeDialog(string, deviceSetting.getLongSitStart(), 1);
            }
        });
        activityLongSitBinding2.qcLongSitEnd.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity$setupViews$2$3
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;
                com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity longSitActivity = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this;
                java.lang.String string = longSitActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_40);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_40)");
                deviceSetting = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this.deviceSetting;
                if (deviceSetting == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                    deviceSetting = null;
                }
                longSitActivity.showTimeDialog(string, deviceSetting.getLongSitEnd(), 2);
            }
        });
        activityLongSitBinding2.longSitRadioGroup.setCheckedChangeListener(new com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity$setupViews$2$4
            @Override // com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(com.qcwireless.qcwatch.ui.base.view.ConstraintRadioGroup group, android.widget.CompoundButton checkedButton) {
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2;
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(group, "group");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkedButton, "checkedButton");
                int id = checkedButton.getId();
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = null;
                switch (id) {
                    case com.qcwireless.qcwatch.R.id.rb_text1 /* 2131297155 */:
                        deviceSetting = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this.deviceSetting;
                        if (deviceSetting == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                        } else {
                            deviceSetting4 = deviceSetting;
                        }
                        deviceSetting4.setLongSitDuring(30);
                        break;
                    case com.qcwireless.qcwatch.R.id.rb_text2 /* 2131297156 */:
                        deviceSetting2 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this.deviceSetting;
                        if (deviceSetting2 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                        } else {
                            deviceSetting4 = deviceSetting2;
                        }
                        deviceSetting4.setLongSitDuring(60);
                        break;
                    case com.qcwireless.qcwatch.R.id.rb_text3 /* 2131297157 */:
                        deviceSetting3 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this.deviceSetting;
                        if (deviceSetting3 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                        } else {
                            deviceSetting4 = deviceSetting3;
                        }
                        deviceSetting4.setLongSitDuring(90);
                        break;
                }
            }
        });
        com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter modeAdapter3 = this.adapter;
        if (modeAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            modeAdapter3 = null;
        }
        modeAdapter3.setOnItemMultiSelectListener(new com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemMultiSelectListener() { // from class: com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity$$ExternalSyntheticLambda3
            @Override // com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemMultiSelectListener
            public final void onSelected(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.Operation operation, int i, boolean z) {
                com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.m887setupViews$lambda6(com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this, operation, i, z);
            }
        });
        android.view.View[] viewArr = new android.view.View[1];
        com.qcwireless.qcwatch.databinding.ActivityLongSitBinding activityLongSitBinding3 = this.binding;
        if (activityLongSitBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityLongSitBinding = activityLongSitBinding3;
        }
        viewArr[0] = activityLongSitBinding.titleBar.tvRightText;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity$setupViews$4
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
            
                if (r6.getLongSitWeek() == 128) goto L25;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(android.view.View r6) {
                /*
                    r5 = this;
                    java.lang.String r0 = "$this$setOnClickListener"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                    com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity r0 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this
                    com.qcwireless.qcwatch.databinding.ActivityLongSitBinding r0 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.access$getBinding$p(r0)
                    r1 = 0
                    if (r0 != 0) goto L14
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                    r0 = r1
                L14:
                    com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding r0 = r0.titleBar
                    android.widget.TextView r0 = r0.tvRightText
                    boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)
                    if (r6 == 0) goto Le2
                    com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity r6 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this
                    com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting r6 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.access$getDeviceSetting$p(r6)
                    java.lang.String r0 = "deviceSetting"
                    if (r6 != 0) goto L2c
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                    r6 = r1
                L2c:
                    boolean r6 = r6.getLongSitSwitch()
                    r2 = 1
                    r3 = 0
                    if (r6 == 0) goto L87
                    com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity r6 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this
                    com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting r6 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.access$getDeviceSetting$p(r6)
                    if (r6 != 0) goto L40
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                    r6 = r1
                L40:
                    int r6 = r6.getLongSitWeek()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    java.lang.String r4 = "HeZhiYuan"
                    com.iwown.awlog.AwLog.i(r4, r6)
                    com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity r6 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this
                    com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting r6 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.access$getDeviceSetting$p(r6)
                    if (r6 != 0) goto L59
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                    r6 = r1
                L59:
                    int r6 = r6.getLongSitWeek()
                    if (r6 == 0) goto L73
                    com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity r6 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this
                    com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting r6 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.access$getDeviceSetting$p(r6)
                    if (r6 != 0) goto L6b
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                    r6 = r1
                L6b:
                    int r6 = r6.getLongSitWeek()
                    r4 = 128(0x80, float:1.8E-43)
                    if (r6 != r4) goto L87
                L73:
                    com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity r6 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this
                    r0 = 2131821109(0x7f110235, float:1.9274952E38)
                    java.lang.String r6 = r6.getString(r0)
                    java.lang.String r0 = "getString(R.string.qc_text_282)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
                    java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(r6, r3, r2, r1)
                    return
                L87:
                    com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity r6 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this
                    com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting r6 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.access$getDeviceSetting$p(r6)
                    if (r6 != 0) goto L93
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                    r6 = r1
                L93:
                    int r6 = r6.getLongSitStart()
                    com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity r4 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this
                    com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting r4 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.access$getDeviceSetting$p(r4)
                    if (r4 != 0) goto La3
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                    r4 = r1
                La3:
                    int r4 = r4.getLongSitEnd()
                    if (r6 < r4) goto Lbd
                    com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity r6 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this
                    r0 = 2131821121(0x7f110241, float:1.9274976E38)
                    java.lang.String r6 = r6.getString(r0)
                    java.lang.String r0 = "getString(R.string.qc_text_293)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
                    java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(r6, r3, r2, r1)
                    return
                Lbd:
                    com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity r6 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this
                    com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel r6 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.access$getLongSitViewModel(r6)
                    com.qcwireless.qcwatch.base.pref.UserConfig$Companion r2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
                    com.qcwireless.qcwatch.base.pref.UserConfig r2 = r2.getInstance()
                    java.lang.String r2 = r2.getDeviceAddressNoClear()
                    com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity r3 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this
                    com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting r3 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.access$getDeviceSetting$p(r3)
                    if (r3 != 0) goto Ld9
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                    goto Lda
                Ld9:
                    r1 = r3
                Lda:
                    r6.saveLongSitSetting(r2, r1)
                    com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity r6 = com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.this
                    r6.finish()
                Le2:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity$setupViews$4.invoke(android.view.View):void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2$lambda-1, reason: not valid java name */
    public static final void m885setupViews$lambda2$lambda1(com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity longSitActivity, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSitActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceSetting, "it");
        longSitActivity.deviceSetting = deviceSetting;
        com.qcwireless.qcwatch.databinding.ActivityLongSitBinding activityLongSitBinding = longSitActivity.binding;
        if (activityLongSitBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLongSitBinding = null;
        }
        if (deviceSetting.getLongSitSwitch()) {
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityLongSitBinding.longSitGroup);
        } else {
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityLongSitBinding.longSitGroup);
        }
        activityLongSitBinding.qcLongSwitch.setChecked(deviceSetting.getLongSitSwitch());
        activityLongSitBinding.qcLongSitStart.setRightText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(deviceSetting.getLongSitStart()));
        activityLongSitBinding.qcLongSitEnd.setRightText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(deviceSetting.getLongSitEnd()));
        int longSitDuring = deviceSetting.getLongSitDuring();
        if (longSitDuring == 30) {
            activityLongSitBinding.rbText1.setChecked(true);
        } else if (longSitDuring == 60) {
            activityLongSitBinding.rbText2.setChecked(true);
        } else if (longSitDuring == 90) {
            activityLongSitBinding.rbText3.setChecked(true);
        }
        int longSitWeek = deviceSetting.getLongSitWeek();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(longSitWeek));
        longSitActivity.weekInit(longSitWeek);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4$lambda-3, reason: not valid java name */
    public static final void m886setupViews$lambda4$lambda3(com.qcwireless.qcwatch.databinding.ActivityLongSitBinding activityLongSitBinding, com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity longSitActivity, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLongSitBinding, "$this_run");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSitActivity, "this$0");
        if (z) {
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityLongSitBinding.longSitGroup);
        } else {
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityLongSitBinding.longSitGroup);
        }
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = longSitActivity.deviceSetting;
        if (deviceSetting == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting = null;
        }
        deviceSetting.setLongSitSwitch(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-6, reason: not valid java name */
    public static final void m887setupViews$lambda6(com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity longSitActivity, com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.Operation operation, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSitActivity, "this$0");
        longSitActivity.getLongSitViewModel().getWeekList().get(i).setCheck(!longSitActivity.getLongSitViewModel().getWeekList().get(i).isCheck());
        com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter modeAdapter = longSitActivity.adapter;
        if (modeAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            modeAdapter = null;
        }
        modeAdapter.notifyDataSetChanged();
        longSitActivity.modifyWeek();
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

    private final void modifyWeek() {
        int i;
        java.util.List<com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat> weekList = getLongSitViewModel().getWeekList();
        int size = weekList.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            switch (i2) {
                case 0:
                    if (weekList.get(0).isCheck()) {
                        i = b | 1;
                        b = (byte) i;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (weekList.get(1).isCheck()) {
                        i = b | 2;
                        b = (byte) i;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (weekList.get(2).isCheck()) {
                        i = b | 4;
                        b = (byte) i;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (weekList.get(3).isCheck()) {
                        i = b | 8;
                        b = (byte) i;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (weekList.get(4).isCheck()) {
                        i = b | 16;
                        b = (byte) i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (weekList.get(5).isCheck()) {
                        i = b | 32;
                        b = (byte) i;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (weekList.get(6).isCheck()) {
                        i = b | 64;
                        b = (byte) i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = this.deviceSetting;
        if (deviceSetting == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting = null;
        }
        deviceSetting.setLongSitWeek(b);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(b));
    }

    private final void weekInit(int repeat) {
        com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel longSitViewModel = getLongSitViewModel();
        longSitViewModel.getWeekList().clear();
        if ((repeat & 1) != 0) {
            longSitViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_208), true));
        } else {
            longSitViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_208), false));
        }
        if ((repeat & 2) != 0) {
            longSitViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_202), true));
        } else {
            longSitViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_202), false));
        }
        if ((repeat & 4) != 0) {
            longSitViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_203), true));
        } else {
            longSitViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_203), false));
        }
        if ((repeat & 8) != 0) {
            longSitViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_204), true));
        } else {
            longSitViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_204), false));
        }
        if ((repeat & 16) != 0) {
            longSitViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_205), true));
        } else {
            longSitViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_205), false));
        }
        if ((repeat & 32) != 0) {
            longSitViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_206), true));
        } else {
            longSitViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_206), false));
        }
        if ((repeat & 64) != 0) {
            longSitViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_207), true));
        } else {
            longSitViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_207), false));
        }
        com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter modeAdapter = this.adapter;
        if (modeAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            modeAdapter = null;
        }
        modeAdapter.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showTimeDialog(java.lang.String title, int time, final int type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_time_selector);
        com.qcwireless.qcwatch.base.dialog.BottomTimeDialog create = builder.create();
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.TimeListener() { // from class: com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity$$ExternalSyntheticLambda2
            @Override // com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.TimeListener
            public final void min(int i) {
                com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity.m888showTimeDialog$lambda8(type, this, i);
            }
        });
        create.initData((android.content.Context) this);
        create.setTitle(title);
        create.setCurrTime(time / 60, time % 60);
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showTimeDialog$lambda-8, reason: not valid java name */
    public static final void m888showTimeDialog$lambda8(int i, com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitActivity longSitActivity, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longSitActivity, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (i == 1) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = longSitActivity.deviceSetting;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting2 = null;
            }
            deviceSetting2.setLongSitStart(i2);
        } else {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = longSitActivity.deviceSetting;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting3 = null;
            }
            deviceSetting3.setLongSitEnd(i2);
        }
        com.qcwireless.qcwatch.ui.device.remind.longsit.LongSitViewModel longSitViewModel = longSitActivity.getLongSitViewModel();
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = longSitActivity.deviceSetting;
        if (deviceSetting4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
        } else {
            deviceSetting = deviceSetting4;
        }
        longSitViewModel.saveLongSitSettingNotExecCmd(deviceAddressNoClear, deviceSetting);
    }
}
