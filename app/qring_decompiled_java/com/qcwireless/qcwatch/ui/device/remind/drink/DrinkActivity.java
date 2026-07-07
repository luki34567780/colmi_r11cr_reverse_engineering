package com.qcwireless.qcwatch.ui.device.remind.drink;

/* compiled from: DrinkActivity.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0014J\u001e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0014J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006$"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/remind/drink/DrinkActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/device/week/adapter/ModeAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityDrinkBinding;", "deviceSetting", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "drinkViewModel", "Lcom/qcwireless/qcwatch/ui/device/remind/drink/DrinkViewModel;", "getDrinkViewModel", "()Lcom/qcwireless/qcwatch/ui/device/remind/drink/DrinkViewModel;", "drinkViewModel$delegate", "Lkotlin/Lazy;", "drinkClickListener", "", "clickWith", "Lcom/qcwireless/qcwatch/ui/base/view/QSettingItemWithClick;", "drinkIndex", "", "modifyWeek", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "setupViews", "showTimeDialog", "title", "", "time", "index", "weekInit", "repeat", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DrinkActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityDrinkBinding binding;
    private com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;

    /* renamed from: drinkViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy drinkViewModel;

    public DrinkActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.drinkViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel m883invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel getDrinkViewModel() {
        return (com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel) this.drinkViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityDrinkBinding inflate = com.qcwireless.qcwatch.databinding.ActivityDrinkBinding.inflate(getLayoutInflater());
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
        com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter modeAdapter = new com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter(context, getDrinkViewModel().getWeekList());
        this.adapter = modeAdapter;
        modeAdapter.setSelectMode(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.SelectMode.MULTI_SELECT);
        getDrinkViewModel().getDrinkSetting(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        final com.qcwireless.qcwatch.databinding.ActivityDrinkBinding activityDrinkBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityDrinkBinding activityDrinkBinding2 = null;
        if (activityDrinkBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDrinkBinding = null;
        }
        activityDrinkBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_51));
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityDrinkBinding.titleBar.tvRightText);
        activityDrinkBinding.titleBar.tvRightText.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_79));
        activityDrinkBinding.drinkSwitch.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.m879setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.this, activityDrinkBinding, compoundButton, z);
            }
        });
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick = activityDrinkBinding.drink0;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qSettingItemWithClick, "drink0");
        drinkClickListener(qSettingItemWithClick, 0);
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick2 = activityDrinkBinding.drink1;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qSettingItemWithClick2, "drink1");
        drinkClickListener(qSettingItemWithClick2, 1);
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick3 = activityDrinkBinding.drink2;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qSettingItemWithClick3, "drink2");
        drinkClickListener(qSettingItemWithClick3, 2);
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick4 = activityDrinkBinding.drink3;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qSettingItemWithClick4, "drink3");
        drinkClickListener(qSettingItemWithClick4, 3);
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick5 = activityDrinkBinding.drink4;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qSettingItemWithClick5, "drink4");
        drinkClickListener(qSettingItemWithClick5, 4);
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick6 = activityDrinkBinding.drink5;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qSettingItemWithClick6, "drink5");
        drinkClickListener(qSettingItemWithClick6, 5);
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick7 = activityDrinkBinding.drink6;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qSettingItemWithClick7, "drink6");
        drinkClickListener(qSettingItemWithClick7, 6);
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick qSettingItemWithClick8 = activityDrinkBinding.drink7;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qSettingItemWithClick8, "drink7");
        drinkClickListener(qSettingItemWithClick8, 7);
        activityDrinkBinding.weekDayRecycler.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityDrinkBinding.weekDayRecycler;
        com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter modeAdapter2 = this.adapter;
        if (modeAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            modeAdapter2 = null;
        }
        recyclerView.setAdapter(modeAdapter2);
        getDrinkViewModel().getUiStatue().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.m880setupViews$lambda3(com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.this, (com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting) obj);
            }
        });
        com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter modeAdapter3 = this.adapter;
        if (modeAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            modeAdapter3 = null;
        }
        modeAdapter3.setOnItemMultiSelectListener(new com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemMultiSelectListener() { // from class: com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity$$ExternalSyntheticLambda4
            @Override // com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemMultiSelectListener
            public final void onSelected(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.Operation operation, int i, boolean z) {
                com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.m881setupViews$lambda5(com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.this, operation, i, z);
            }
        });
        android.view.View[] viewArr = new android.view.View[1];
        com.qcwireless.qcwatch.databinding.ActivityDrinkBinding activityDrinkBinding3 = this.binding;
        if (activityDrinkBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDrinkBinding2 = activityDrinkBinding3;
        }
        viewArr[0] = activityDrinkBinding2.titleBar.tvRightText;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity$setupViews$4
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
            
                if (r5.getDrinkWeek() == 128) goto L22;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(android.view.View r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = "$this$setOnClickListener"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity r0 = com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.this
                    com.qcwireless.qcwatch.databinding.ActivityDrinkBinding r0 = com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.access$getBinding$p(r0)
                    r1 = 0
                    if (r0 != 0) goto L14
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                    r0 = r1
                L14:
                    com.qcwireless.qcwatch.databinding.LayoutTitleBarBinding r0 = r0.titleBar
                    android.widget.TextView r0 = r0.tvRightText
                    boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
                    if (r5 == 0) goto L93
                    com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity r5 = com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.this
                    com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting r5 = com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.access$getDeviceSetting$p(r5)
                    java.lang.String r0 = "deviceSetting"
                    if (r5 != 0) goto L2c
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                    r5 = r1
                L2c:
                    boolean r5 = r5.getDrinkSwitch()
                    if (r5 == 0) goto L6e
                    com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity r5 = com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.this
                    com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting r5 = com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.access$getDeviceSetting$p(r5)
                    if (r5 != 0) goto L3e
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                    r5 = r1
                L3e:
                    int r5 = r5.getDrinkWeek()
                    if (r5 == 0) goto L58
                    com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity r5 = com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.this
                    com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting r5 = com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.access$getDeviceSetting$p(r5)
                    if (r5 != 0) goto L50
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                    r5 = r1
                L50:
                    int r5 = r5.getDrinkWeek()
                    r2 = 128(0x80, float:1.8E-43)
                    if (r5 != r2) goto L6e
                L58:
                    com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity r5 = com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.this
                    r0 = 2131821109(0x7f110235, float:1.9274952E38)
                    java.lang.String r5 = r5.getString(r0)
                    java.lang.String r0 = "getString(R.string.qc_text_282)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
                    java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                    r0 = 0
                    r2 = 1
                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(r5, r0, r2, r1)
                    return
                L6e:
                    com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity r5 = com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.this
                    com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel r5 = com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.access$getDrinkViewModel(r5)
                    com.qcwireless.qcwatch.base.pref.UserConfig$Companion r2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE
                    com.qcwireless.qcwatch.base.pref.UserConfig r2 = r2.getInstance()
                    java.lang.String r2 = r2.getDeviceAddressNoClear()
                    com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity r3 = com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.this
                    com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting r3 = com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.access$getDeviceSetting$p(r3)
                    if (r3 != 0) goto L8a
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                    goto L8b
                L8a:
                    r1 = r3
                L8b:
                    r5.saveDrinkSetting(r2, r1)
                    com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity r5 = com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.this
                    r5.finish()
                L93:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity$setupViews$4.invoke(android.view.View):void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1$lambda-0, reason: not valid java name */
    public static final void m879setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity drinkActivity, com.qcwireless.qcwatch.databinding.ActivityDrinkBinding activityDrinkBinding, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drinkActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDrinkBinding, "$this_run");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = drinkActivity.deviceSetting;
        if (deviceSetting == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting = null;
        }
        deviceSetting.setDrinkSwitch(z);
        if (z) {
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityDrinkBinding.drinkGroup);
            return;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityDrinkBinding.drinkGroup);
        for (int i = 0; i < 8; i++) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = drinkActivity.deviceSetting;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting2 = null;
            }
            deviceSetting2.getDrinkArray()[i].setSwitch(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3, reason: not valid java name */
    public static final void m880setupViews$lambda3(com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity drinkActivity, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drinkActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceSetting, "it");
        drinkActivity.deviceSetting = deviceSetting;
        com.qcwireless.qcwatch.databinding.ActivityDrinkBinding activityDrinkBinding = drinkActivity.binding;
        if (activityDrinkBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDrinkBinding = null;
        }
        activityDrinkBinding.drinkSwitch.setChecked(deviceSetting.getDrinkSwitch());
        com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[] drinkArray = deviceSetting.getDrinkArray();
        int length = drinkArray.length;
        for (int i = 0; i < length; i++) {
            com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean drinkBean = drinkArray[i];
            switch (i) {
                case 0:
                    activityDrinkBinding.drink0.setLeftText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(drinkBean.getTime()));
                    activityDrinkBinding.drink0.setChecked(drinkBean.getSwitch());
                    break;
                case 1:
                    activityDrinkBinding.drink1.setLeftText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(drinkBean.getTime()));
                    activityDrinkBinding.drink1.setChecked(drinkBean.getSwitch());
                    break;
                case 2:
                    activityDrinkBinding.drink2.setLeftText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(drinkBean.getTime()));
                    activityDrinkBinding.drink2.setChecked(drinkBean.getSwitch());
                    break;
                case 3:
                    activityDrinkBinding.drink3.setLeftText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(drinkBean.getTime()));
                    activityDrinkBinding.drink3.setChecked(drinkBean.getSwitch());
                    break;
                case 4:
                    activityDrinkBinding.drink4.setLeftText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(drinkBean.getTime()));
                    activityDrinkBinding.drink4.setChecked(drinkBean.getSwitch());
                    break;
                case 5:
                    activityDrinkBinding.drink5.setLeftText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(drinkBean.getTime()));
                    activityDrinkBinding.drink5.setChecked(drinkBean.getSwitch());
                    break;
                case 6:
                    activityDrinkBinding.drink6.setLeftText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(drinkBean.getTime()));
                    activityDrinkBinding.drink6.setChecked(drinkBean.getSwitch());
                    break;
                case 7:
                    activityDrinkBinding.drink7.setLeftText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(drinkBean.getTime()));
                    activityDrinkBinding.drink7.setChecked(drinkBean.getSwitch());
                    break;
            }
        }
        drinkActivity.weekInit(deviceSetting.getDrinkWeek());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-5, reason: not valid java name */
    public static final void m881setupViews$lambda5(com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity drinkActivity, com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.Operation operation, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drinkActivity, "this$0");
        drinkActivity.getDrinkViewModel().getWeekList().get(i).setCheck(!drinkActivity.getDrinkViewModel().getWeekList().get(i).isCheck());
        com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter modeAdapter = drinkActivity.adapter;
        if (modeAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            modeAdapter = null;
        }
        modeAdapter.notifyDataSetChanged();
        drinkActivity.modifyWeek();
    }

    private final void drinkClickListener(com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick clickWith, final int drinkIndex) {
        clickWith.setmOnLSettingItemWithClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick.OnLSettingItemWithClick() { // from class: com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity$drinkClickListener$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick.OnLSettingItemWithClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2;
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3;
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4;
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting5;
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting6;
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting7;
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting8;
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting9 = null;
                switch (drinkIndex) {
                    case 0:
                        com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity drinkActivity = this;
                        java.lang.String string = drinkActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_63);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_63)");
                        deviceSetting = this.deviceSetting;
                        if (deviceSetting == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                        } else {
                            deviceSetting9 = deviceSetting;
                        }
                        drinkActivity.showTimeDialog(string, deviceSetting9.getDrinkArray()[drinkIndex].getTime(), drinkIndex);
                        break;
                    case 1:
                        com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity drinkActivity2 = this;
                        java.lang.String string2 = drinkActivity2.getString(com.qcwireless.qcwatch.R.string.qc_text_64);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_64)");
                        deviceSetting2 = this.deviceSetting;
                        if (deviceSetting2 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                        } else {
                            deviceSetting9 = deviceSetting2;
                        }
                        drinkActivity2.showTimeDialog(string2, deviceSetting9.getDrinkArray()[drinkIndex].getTime(), drinkIndex);
                        break;
                    case 2:
                        com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity drinkActivity3 = this;
                        java.lang.String string3 = drinkActivity3.getString(com.qcwireless.qcwatch.R.string.qc_text_65);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_65)");
                        deviceSetting3 = this.deviceSetting;
                        if (deviceSetting3 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                        } else {
                            deviceSetting9 = deviceSetting3;
                        }
                        drinkActivity3.showTimeDialog(string3, deviceSetting9.getDrinkArray()[drinkIndex].getTime(), drinkIndex);
                        break;
                    case 3:
                        com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity drinkActivity4 = this;
                        java.lang.String string4 = drinkActivity4.getString(com.qcwireless.qcwatch.R.string.qc_text_66);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_66)");
                        deviceSetting4 = this.deviceSetting;
                        if (deviceSetting4 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                        } else {
                            deviceSetting9 = deviceSetting4;
                        }
                        drinkActivity4.showTimeDialog(string4, deviceSetting9.getDrinkArray()[drinkIndex].getTime(), drinkIndex);
                        break;
                    case 4:
                        com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity drinkActivity5 = this;
                        java.lang.String string5 = drinkActivity5.getString(com.qcwireless.qcwatch.R.string.qc_text_67);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.qc_text_67)");
                        deviceSetting5 = this.deviceSetting;
                        if (deviceSetting5 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                        } else {
                            deviceSetting9 = deviceSetting5;
                        }
                        drinkActivity5.showTimeDialog(string5, deviceSetting9.getDrinkArray()[drinkIndex].getTime(), drinkIndex);
                        break;
                    case 5:
                        com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity drinkActivity6 = this;
                        java.lang.String string6 = drinkActivity6.getString(com.qcwireless.qcwatch.R.string.qc_text_68);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.qc_text_68)");
                        deviceSetting6 = this.deviceSetting;
                        if (deviceSetting6 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                        } else {
                            deviceSetting9 = deviceSetting6;
                        }
                        drinkActivity6.showTimeDialog(string6, deviceSetting9.getDrinkArray()[drinkIndex].getTime(), drinkIndex);
                        break;
                    case 6:
                        com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity drinkActivity7 = this;
                        java.lang.String string7 = drinkActivity7.getString(com.qcwireless.qcwatch.R.string.qc_text_69);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.qc_text_69)");
                        deviceSetting7 = this.deviceSetting;
                        if (deviceSetting7 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                        } else {
                            deviceSetting9 = deviceSetting7;
                        }
                        drinkActivity7.showTimeDialog(string7, deviceSetting9.getDrinkArray()[drinkIndex].getTime(), drinkIndex);
                        break;
                    case 7:
                        com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity drinkActivity8 = this;
                        java.lang.String string8 = drinkActivity8.getString(com.qcwireless.qcwatch.R.string.qc_text_70);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.qc_text_70)");
                        deviceSetting8 = this.deviceSetting;
                        if (deviceSetting8 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                        } else {
                            deviceSetting9 = deviceSetting8;
                        }
                        drinkActivity8.showTimeDialog(string8, deviceSetting9.getDrinkArray()[drinkIndex].getTime(), drinkIndex);
                        break;
                }
            }
        });
        clickWith.setQSettingItemCheckListener(new com.qcwireless.qcwatch.ui.base.view.QSwitchView.OnSwitchStateChangeListener() { // from class: com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity$$ExternalSyntheticLambda3
            @Override // com.qcwireless.qcwatch.ui.base.view.QSwitchView.OnSwitchStateChangeListener
            public final void onSwitchStateChange(boolean z) {
                com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.m878drinkClickListener$lambda7$lambda6(com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.this, drinkIndex, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drinkClickListener$lambda-7$lambda-6, reason: not valid java name */
    public static final void m878drinkClickListener$lambda7$lambda6(com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity drinkActivity, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drinkActivity, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = drinkActivity.deviceSetting;
        if (deviceSetting == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting = null;
        }
        deviceSetting.getDrinkArray()[i].setSwitch(z);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void showTimeDialog(java.lang.String title, int time, final int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_time_selector);
        com.qcwireless.qcwatch.base.dialog.BottomTimeDialog create = builder.create();
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.TimeListener() { // from class: com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity$$ExternalSyntheticLambda2
            @Override // com.qcwireless.qcwatch.base.dialog.BottomTimeDialog.TimeListener
            public final void min(int i) {
                com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.m882showTimeDialog$lambda8(com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity.this, index, i);
            }
        });
        create.initData((android.content.Context) this);
        create.setTitle(title);
        create.setCurrTime(time / 60, time % 60);
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showTimeDialog$lambda-8, reason: not valid java name */
    public static final void m882showTimeDialog$lambda8(com.qcwireless.qcwatch.ui.device.remind.drink.DrinkActivity drinkActivity, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drinkActivity, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = drinkActivity.deviceSetting;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = null;
        if (deviceSetting == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting = null;
        }
        deviceSetting.getDrinkArray()[i].setTime(i2);
        com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel drinkViewModel = drinkActivity.getDrinkViewModel();
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = drinkActivity.deviceSetting;
        if (deviceSetting3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
        } else {
            deviceSetting2 = deviceSetting3;
        }
        drinkViewModel.saveDrinkSettingNotExecCmd(deviceAddressNoClear, deviceSetting2);
    }

    private final void modifyWeek() {
        int i;
        java.util.List<com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat> weekList = getDrinkViewModel().getWeekList();
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
        deviceSetting.setDrinkWeek(b);
    }

    private final void weekInit(int repeat) {
        com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel drinkViewModel = getDrinkViewModel();
        drinkViewModel.getWeekList().clear();
        if ((repeat & 1) != 0) {
            drinkViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_208), true));
        } else {
            drinkViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_208), false));
        }
        if ((repeat & 2) != 0) {
            drinkViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_202), true));
        } else {
            drinkViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_202), false));
        }
        if ((repeat & 4) != 0) {
            drinkViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_203), true));
        } else {
            drinkViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_203), false));
        }
        if ((repeat & 8) != 0) {
            drinkViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_204), true));
        } else {
            drinkViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_204), false));
        }
        if ((repeat & 16) != 0) {
            drinkViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_205), true));
        } else {
            drinkViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_205), false));
        }
        if ((repeat & 32) != 0) {
            drinkViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_206), true));
        } else {
            drinkViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_206), false));
        }
        if ((repeat & 64) != 0) {
            drinkViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_207), true));
        } else {
            drinkViewModel.getWeekList().add(new com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_207), false));
        }
        com.qcwireless.qcwatch.ui.device.week.adapter.ModeAdapter modeAdapter = this.adapter;
        if (modeAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            modeAdapter = null;
        }
        modeAdapter.notifyDataSetChanged();
    }
}
