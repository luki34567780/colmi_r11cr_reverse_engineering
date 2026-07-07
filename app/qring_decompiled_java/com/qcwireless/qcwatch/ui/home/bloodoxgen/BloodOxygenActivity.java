package com.qcwireless.qcwatch.ui.home.bloodoxgen;

/* compiled from: BloodOxygenActivity.kt */
@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001AB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0014J\u0010\u00108\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0017J\b\u0010;\u001a\u000205H\u0014J\b\u0010<\u001a\u000205H\u0014J\u0010\u0010=\u001a\u0002052\u0006\u0010>\u001a\u00020\u0016H\u0002J\b\u0010?\u001a\u000205H\u0002J\b\u0010@\u001a\u000205H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00060\u0018R\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b0\u00101¨\u0006B"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/BloodOxygenActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/adapter/ManualBloodOxygenDetailAdapter;", "alphaAnimation", "Landroid/view/animation/AlphaAnimation;", "animation", "Landroid/view/animation/ScaleAnimation;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityBloodOxygenBinding;", "bloodOxygenValue", "", "getBloodOxygenValue", "()I", "setBloodOxygenValue", "(I)V", "calendarDialog", "Lcom/qcwireless/qcwatch/base/dialog/CenterDialog;", "countDownTimer", "Landroid/os/CountDownTimer;", "dateUtil", "Lcom/qcwireless/qc_utils/date/DateUtil;", "deviceNotifyListener", "Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/BloodOxygenActivity$MyDeviceNotifyListener;", "deviceSetting", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "handler", "Landroid/os/Handler;", "heartRunnable", "Ljava/lang/Runnable;", "getHeartRunnable", "()Ljava/lang/Runnable;", "setHeartRunnable", "(Ljava/lang/Runnable;)V", "map", "", "", "Lcom/haibin/calendarview/Calendar;", "getMap", "()Ljava/util/Map;", "setMap", "(Ljava/util/Map;)V", "selectDate", "startMeasure", "", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/BloodOxygenViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/BloodOxygenViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "onStop", "queryManualBloodOxygen", "date", "secondsDown", "setupViews", "MyDeviceNotifyListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BloodOxygenActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.home.bloodoxgen.adapter.ManualBloodOxygenDetailAdapter adapter;
    private android.view.animation.AlphaAnimation alphaAnimation;
    private android.view.animation.ScaleAnimation animation;
    private com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding binding;
    private com.qcwireless.qcwatch.base.dialog.CenterDialog calendarDialog;
    private android.os.CountDownTimer countDownTimer;
    private com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.MyDeviceNotifyListener deviceNotifyListener;
    private com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;
    private final android.os.Handler handler;
    private java.lang.Runnable heartRunnable;
    private boolean startMeasure;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
    private java.util.Map<java.lang.String, com.haibin.calendarview.Calendar> map = new java.util.HashMap();
    private com.qcwireless.qc_utils.date.DateUtil selectDate = new com.qcwireless.qc_utils.date.DateUtil();
    private int bloodOxygenValue = 98;

    public BloodOxygenActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel m928invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
        this.heartRunnable = new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.m918heartRunnable$lambda12(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel) this.viewModel.getValue();
    }

    public final java.util.Map<java.lang.String, com.haibin.calendarview.Calendar> getMap() {
        return this.map;
    }

    public final void setMap(java.util.Map<java.lang.String, com.haibin.calendarview.Calendar> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.map = map;
    }

    public final int getBloodOxygenValue() {
        return this.bloodOxygenValue;
    }

    public final void setBloodOxygenValue(int i) {
        this.bloodOxygenValue = i;
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding inflate = com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding.inflate(getLayoutInflater());
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
        this.adapter = new com.qcwireless.qcwatch.ui.home.bloodoxgen.adapter.ManualBloodOxygenDetailAdapter(context, getViewModel().getManualList());
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 1.3f, 1.0f, 1.3f, 1, 0.5f, 1, 0.5f);
        this.animation = scaleAnimation;
        scaleAnimation.setDuration(1500L);
        android.view.animation.ScaleAnimation scaleAnimation2 = this.animation;
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding = null;
        if (scaleAnimation2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("animation");
            scaleAnimation2 = null;
        }
        scaleAnimation2.setRepeatCount(-1);
        android.view.animation.ScaleAnimation scaleAnimation3 = this.animation;
        if (scaleAnimation3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("animation");
            scaleAnimation3 = null;
        }
        scaleAnimation3.setFillAfter(true);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        this.alphaAnimation = alphaAnimation;
        alphaAnimation.setDuration(500L);
        android.view.animation.AlphaAnimation alphaAnimation2 = this.alphaAnimation;
        if (alphaAnimation2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("alphaAnimation");
            alphaAnimation2 = null;
        }
        alphaAnimation2.setRepeatMode(2);
        android.view.animation.AlphaAnimation alphaAnimation3 = this.alphaAnimation;
        if (alphaAnimation3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("alphaAnimation");
            alphaAnimation3 = null;
        }
        alphaAnimation3.setRepeatCount(60);
        getViewModel().initData(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        getViewModel().queryLastData();
        final com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding2 = this.binding;
        if (activityBloodOxygenBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding2 = null;
        }
        setStatusBarBackground(com.qcwireless.qcwatch.R.color.blood_oxygen_bg);
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodOxygenBinding2.titleBar.divider);
        activityBloodOxygenBinding2.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_87));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodOxygenBinding2.titleBar.tvRightText);
        activityBloodOxygenBinding2.titleBar.tvRightText.setBackgroundResource(com.qcwireless.qcwatch.R.mipmap.app_warming);
        activityBloodOxygenBinding2.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.m921setupViews$lambda3$lambda0(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this, view);
            }
        });
        final com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qDateSwitchView = activityBloodOxygenBinding2.qcDateChange;
        qDateSwitchView.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$setupViews$1$2$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore
            public void clickBefore(boolean r2, com.qcwireless.qc_utils.date.DateUtil date) {
                com.qcwireless.qc_utils.date.DateUtil dateUtil;
                com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding3;
                com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding4;
                com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding5;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
                com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.dateUtil = date;
                qDateSwitchView.setDateUtil(date);
                com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.getViewModel().queryBloodOxygenByDate(date);
                com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity bloodOxygenActivity = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this;
                dateUtil = bloodOxygenActivity.dateUtil;
                bloodOxygenActivity.queryManualBloodOxygen(dateUtil);
                boolean isToday = date.isToday();
                com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding6 = null;
                if (isToday) {
                    activityBloodOxygenBinding4 = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.binding;
                    if (activityBloodOxygenBinding4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityBloodOxygenBinding4 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(activityBloodOxygenBinding4.btnMeasure);
                    activityBloodOxygenBinding5 = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.binding;
                    if (activityBloodOxygenBinding5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityBloodOxygenBinding6 = activityBloodOxygenBinding5;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(activityBloodOxygenBinding6.currHeartCtl);
                    return;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodOxygenBinding2.btnMeasure);
                activityBloodOxygenBinding3 = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.binding;
                if (activityBloodOxygenBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityBloodOxygenBinding6 = activityBloodOxygenBinding3;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodOxygenBinding6.currHeartCtl);
            }
        });
        activityBloodOxygenBinding2.bloodOxygenChatView.setSelectedListener(new com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.OnSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$$ExternalSyntheticLambda8
            @Override // com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.OnSelectedListener
            public final void onSelected(com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean dataBean) {
                com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.m922setupViews$lambda3$lambda2(com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding.this, dataBean);
            }
        });
        activityBloodOxygenBinding2.rcvBloodOxygenDetail.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityBloodOxygenBinding2.rcvBloodOxygenDetail;
        com.qcwireless.qcwatch.ui.home.bloodoxgen.adapter.ManualBloodOxygenDetailAdapter manualBloodOxygenDetailAdapter = this.adapter;
        if (manualBloodOxygenDetailAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            manualBloodOxygenDetailAdapter = null;
        }
        recyclerView.setAdapter(manualBloodOxygenDetailAdapter);
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getDeviceSetting().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$$ExternalSyntheticLambda6
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.m923setupViews$lambda4(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this, (com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding3 = this.binding;
        if (activityBloodOxygenBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding3 = null;
        }
        activityBloodOxygenBinding3.qcSettingBloodOxygen.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$$ExternalSyntheticLambda4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.m924setupViews$lambda5(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this, compoundButton, z);
            }
        });
        getViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$$ExternalSyntheticLambda7
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.m925setupViews$lambda6(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this, (com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenUI) obj);
            }
        });
        getViewModel().getLastDate().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$$ExternalSyntheticLambda5
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.m926setupViews$lambda7(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this, (com.qcwireless.qc_utils.date.DateUtil) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding4 = this.binding;
        if (activityBloodOxygenBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding4 = null;
        }
        activityBloodOxygenBinding4.boValueDetail.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$setupViews$6
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qc_utils.date.DateUtil dateUtil;
                android.os.Bundle bundle = new android.os.Bundle();
                dateUtil = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.dateUtil;
                bundle.putInt("timestamp", (int) dateUtil.getUnixTimestamp());
                android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this;
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenDataDetailActivity.class);
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
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding5 = this.binding;
        if (activityBloodOxygenBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding5 = null;
        }
        activityBloodOxygenBinding5.qcSettingBloodOxygen.setSubTitleClick(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.m927setupViews$lambda8(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding6 = this.binding;
        if (activityBloodOxygenBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding6 = null;
        }
        activityBloodOxygenBinding6.tvListDetail.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.m919setupViews$lambda10(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding7 = this.binding;
        if (activityBloodOxygenBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityBloodOxygenBinding = activityBloodOxygenBinding7;
        }
        activityBloodOxygenBinding.btnMeasure.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.m920setupViews$lambda11(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-3$lambda-0, reason: not valid java name */
    public static final void m921setupViews$lambda3$lambda0(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity bloodOxygenActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenActivity, "this$0");
        android.app.Activity activity = (android.app.Activity) bloodOxygenActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenGuideActivity.class);
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
    public static final void m922setupViews$lambda3$lambda2(com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding, final com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean dataBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityBloodOxygenBinding, "$this_run");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(activityBloodOxygenBinding, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$setupViews$1$3$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityBloodOxygenBinding2, "$this$ktxRunOnUi");
                if (com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean.this.getMinValue() == 0) {
                    activityBloodOxygenBinding2.tvBloodOxygenValue.setText("--");
                } else {
                    android.widget.TextView textView = activityBloodOxygenBinding2.tvBloodOxygenValue;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean.this.getMinValue());
                    sb.append('-');
                    sb.append(com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean.this.getMaxValue());
                    textView.setText(sb.toString());
                }
                activityBloodOxygenBinding2.tvHM.setText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean.this.getSeconds() / 60));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4, reason: not valid java name */
    public static final void m923setupViews$lambda4(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity bloodOxygenActivity, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceSetting, "it");
        bloodOxygenActivity.deviceSetting = deviceSetting;
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding = null;
        }
        activityBloodOxygenBinding.qcSettingBloodOxygen.setChecked(deviceSetting.getBo2Detection());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-5, reason: not valid java name */
    public static final void m924setupViews$lambda5(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity bloodOxygenActivity, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenActivity, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = bloodOxygenActivity.deviceSetting;
            if (deviceSetting2 != null) {
                if (deviceSetting2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                    deviceSetting2 = null;
                }
                deviceSetting2.setBo2Detection(z);
                com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel viewModel = bloodOxygenActivity.getViewModel();
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = bloodOxygenActivity.deviceSetting;
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
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItemTitleSubTitleSystem qSettingItemTitleSubTitleSystem = activityBloodOxygenBinding.qcSettingBloodOxygen;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = bloodOxygenActivity.deviceSetting;
        if (deviceSetting4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting4 = null;
        }
        qSettingItemTitleSubTitleSystem.setChecked(deviceSetting4.getBo2Detection());
        java.lang.String string = bloodOxygenActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-6, reason: not valid java name */
    public static final void m925setupViews$lambda6(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity bloodOxygenActivity, com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenUI bloodOxygenUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding = null;
        if (!bloodOxygenUI.getListData().isEmpty()) {
            com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding2 = bloodOxygenActivity.binding;
            if (activityBloodOxygenBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodOxygenBinding2 = null;
            }
            activityBloodOxygenBinding2.bloodOxygenChatView.setData(bloodOxygenUI.getListData(), bloodOxygenUI.getToday());
            int i = 0;
            for (com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean dataBean : bloodOxygenUI.getListData()) {
                if (dataBean.getMaxValue() > 0) {
                    i = dataBean.getSeconds();
                }
            }
            java.lang.String dayMinToStr = com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(i / 60);
            com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding3 = bloodOxygenActivity.binding;
            if (activityBloodOxygenBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodOxygenBinding3 = null;
            }
            activityBloodOxygenBinding3.boValueDetail.setRightText(dayMinToStr);
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean dataBean2 : bloodOxygenUI.getListData()) {
                if (dataBean2.getMaxValue() >= 98) {
                    i2++;
                } else {
                    int maxValue = dataBean2.getMaxValue();
                    if (95 <= maxValue && maxValue < 98) {
                        i3++;
                    } else {
                        int maxValue2 = dataBean2.getMaxValue();
                        if (1 <= maxValue2 && maxValue2 < 96) {
                            i4++;
                        }
                    }
                }
            }
            for (com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean dataBean3 : bloodOxygenUI.getListData()) {
                if (dataBean3.getMinValue() >= 98) {
                    i2++;
                } else {
                    int minValue = dataBean3.getMinValue();
                    if (95 <= minValue && minValue < 98) {
                        i3++;
                    } else {
                        int minValue2 = dataBean3.getMinValue();
                        if (1 <= minValue2 && minValue2 < 96) {
                            i4++;
                        }
                    }
                }
            }
            int[] iArr = {0, 0, 0, 0, 0};
            iArr[0] = i4;
            iArr[3] = i2;
            iArr[4] = i3;
            int i5 = i2 + i4 + i3;
            if (i5 > 0) {
                com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding4 = bloodOxygenActivity.binding;
                if (activityBloodOxygenBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityBloodOxygenBinding4 = null;
                }
                activityBloodOxygenBinding4.bloodOxygenCircleView.dataInit(iArr);
                com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding5 = bloodOxygenActivity.binding;
                if (activityBloodOxygenBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityBloodOxygenBinding5 = null;
                }
                android.widget.TextView textView = activityBloodOxygenBinding5.tvValue1;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                float f = i5;
                float f2 = (i2 * 1.0f) / f;
                float f3 = 100;
                sb.append(java.lang.Math.round(f2 * f3));
                sb.append('%');
                textView.setText(sb.toString());
                com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding6 = bloodOxygenActivity.binding;
                if (activityBloodOxygenBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityBloodOxygenBinding6 = null;
                }
                android.widget.TextView textView2 = activityBloodOxygenBinding6.tvValue2;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(java.lang.Math.round(((i4 * 1.0f) / f) * f3));
                sb2.append('%');
                textView2.setText(sb2.toString());
                com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding7 = bloodOxygenActivity.binding;
                if (activityBloodOxygenBinding7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityBloodOxygenBinding = activityBloodOxygenBinding7;
                }
                android.widget.TextView textView3 = activityBloodOxygenBinding.tvValue3;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(java.lang.Math.round(((i3 * 1.0f) / f) * f3));
                sb3.append('%');
                textView3.setText(sb3.toString());
                return;
            }
            int[] iArr2 = {0, 0, 0, 0, 0};
            com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding8 = bloodOxygenActivity.binding;
            if (activityBloodOxygenBinding8 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodOxygenBinding8 = null;
            }
            activityBloodOxygenBinding8.bloodOxygenCircleView.dataInit(iArr2);
            com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding9 = bloodOxygenActivity.binding;
            if (activityBloodOxygenBinding9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodOxygenBinding9 = null;
            }
            activityBloodOxygenBinding9.bloodOxygenChatView.setData(bloodOxygenUI.getListData(), bloodOxygenUI.getToday());
            com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding10 = bloodOxygenActivity.binding;
            if (activityBloodOxygenBinding10 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodOxygenBinding10 = null;
            }
            activityBloodOxygenBinding10.tvValue1.setText("--");
            com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding11 = bloodOxygenActivity.binding;
            if (activityBloodOxygenBinding11 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodOxygenBinding11 = null;
            }
            activityBloodOxygenBinding11.tvValue2.setText("--");
            com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding12 = bloodOxygenActivity.binding;
            if (activityBloodOxygenBinding12 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityBloodOxygenBinding = activityBloodOxygenBinding12;
            }
            activityBloodOxygenBinding.tvValue3.setText("--");
            return;
        }
        int[] iArr3 = {0, 0, 0, 0, 0};
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding13 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding13 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding13 = null;
        }
        activityBloodOxygenBinding13.bloodOxygenCircleView.dataInit(iArr3);
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding14 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding14 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding14 = null;
        }
        activityBloodOxygenBinding14.bloodOxygenChatView.setData(bloodOxygenUI.getListData(), bloodOxygenUI.getToday());
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding15 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding15 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding15 = null;
        }
        activityBloodOxygenBinding15.tvValue1.setText("--");
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding16 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding16 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding16 = null;
        }
        activityBloodOxygenBinding16.tvValue2.setText("--");
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding17 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding17 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding17 = null;
        }
        activityBloodOxygenBinding17.tvValue3.setText("--");
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding18 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding18 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityBloodOxygenBinding = activityBloodOxygenBinding18;
        }
        activityBloodOxygenBinding.boValueDetail.setRightText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-7, reason: not valid java name */
    public static final void m926setupViews$lambda7(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity bloodOxygenActivity, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dateUtil, "it");
        bloodOxygenActivity.dateUtil = dateUtil;
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding = bloodOxygenActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding2 = null;
        if (activityBloodOxygenBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding = null;
        }
        activityBloodOxygenBinding.qcDateChange.setDateUtil(dateUtil);
        bloodOxygenActivity.getViewModel().queryBloodOxygenByDate(dateUtil);
        bloodOxygenActivity.queryManualBloodOxygen(bloodOxygenActivity.dateUtil);
        if (bloodOxygenActivity.dateUtil.isToday()) {
            com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding3 = bloodOxygenActivity.binding;
            if (activityBloodOxygenBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodOxygenBinding3 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityBloodOxygenBinding3.btnMeasure);
            com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding4 = bloodOxygenActivity.binding;
            if (activityBloodOxygenBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityBloodOxygenBinding2 = activityBloodOxygenBinding4;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityBloodOxygenBinding2.currHeartCtl);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding5 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding5 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodOxygenBinding5.btnMeasure);
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding6 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityBloodOxygenBinding2 = activityBloodOxygenBinding6;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodOxygenBinding2.currHeartCtl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-8, reason: not valid java name */
    public static final void m927setupViews$lambda8(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity bloodOxygenActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding = bloodOxygenActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding2 = null;
        if (activityBloodOxygenBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding = null;
        }
        if (activityBloodOxygenBinding.qcSettingBloodOxygen.getTextLines() == 2) {
            com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding3 = bloodOxygenActivity.binding;
            if (activityBloodOxygenBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodOxygenBinding3 = null;
            }
            activityBloodOxygenBinding3.qcSettingBloodOxygen.startAnim(180.0f);
            com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding4 = bloodOxygenActivity.binding;
            if (activityBloodOxygenBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityBloodOxygenBinding2 = activityBloodOxygenBinding4;
            }
            activityBloodOxygenBinding2.qcSettingBloodOxygen.setTextLines(20);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding5 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding5 = null;
        }
        activityBloodOxygenBinding5.qcSettingBloodOxygen.startAnim(360.0f);
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding6 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityBloodOxygenBinding2 = activityBloodOxygenBinding6;
        }
        activityBloodOxygenBinding2.qcSettingBloodOxygen.setTextLines(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-10, reason: not valid java name */
    public static final void m919setupViews$lambda10(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity bloodOxygenActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenActivity, "this$0");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("timestamp", (int) bloodOxygenActivity.dateUtil.getUnixTimestamp());
        bundle.putInt("type", 1);
        android.app.Activity activity = (android.app.Activity) bloodOxygenActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenDataDetailActivity.class);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-11, reason: not valid java name */
    public static final void m920setupViews$lambda11(final com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity bloodOxygenActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding = null;
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            java.lang.String string = bloodOxygenActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding2 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding2 = null;
        }
        activityBloodOxygenBinding2.tvCurrHeart.setText("--");
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding3 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding3 = null;
        }
        activityBloodOxygenBinding3.tvHeartTime.setText("");
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding4 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding4 = null;
        }
        android.widget.ImageView imageView = activityBloodOxygenBinding4.imageHeart;
        android.view.animation.ScaleAnimation scaleAnimation = bloodOxygenActivity.animation;
        if (scaleAnimation == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("animation");
            scaleAnimation = null;
        }
        imageView.startAnimation(scaleAnimation);
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding5 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding5 = null;
        }
        android.widget.TextView textView = activityBloodOxygenBinding5.tvCurrHeart;
        android.view.animation.AlphaAnimation alphaAnimation = bloodOxygenActivity.alphaAnimation;
        if (alphaAnimation == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("alphaAnimation");
            alphaAnimation = null;
        }
        textView.startAnimation(alphaAnimation);
        if (!bloodOxygenActivity.startMeasure) {
            bloodOxygenActivity.secondsDown();
            bloodOxygenActivity.startMeasure = true;
            com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding6 = bloodOxygenActivity.binding;
            if (activityBloodOxygenBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityBloodOxygenBinding = activityBloodOxygenBinding6;
            }
            activityBloodOxygenBinding.btnMeasure.setText(bloodOxygenActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_76660011));
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StartHeartRateReq.getSimpleReq((byte) 3), new com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.StartHeartRateRsp>() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$setupViews$9$1
                @Override // com.oudmon.ble.base.communication.ICommandResponse
                public void onDataResponse(com.oudmon.ble.base.communication.rsp.StartHeartRateRsp resultEntity) {
                    com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding7;
                    com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding8;
                    android.os.CountDownTimer countDownTimer;
                    com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding9;
                    android.os.Handler handler;
                    android.os.Handler handler2;
                    com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding10;
                    com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding11;
                    boolean z;
                    com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding12;
                    android.os.CountDownTimer countDownTimer2;
                    com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding13;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultEntity, "resultEntity");
                    com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding14 = null;
                    if (resultEntity.getErrCode() == 0 && resultEntity.getType() == 3) {
                        if (resultEntity.getValue() > 0) {
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Byte.valueOf(resultEntity.getValue()));
                            com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.setBloodOxygenValue(new java.util.Random().nextInt(4) + 96);
                            z = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.startMeasure;
                            if (z) {
                                activityBloodOxygenBinding12 = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.binding;
                                if (activityBloodOxygenBinding12 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    activityBloodOxygenBinding12 = null;
                                }
                                activityBloodOxygenBinding12.tvCurrHeart.setText(java.lang.String.valueOf(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.getBloodOxygenValue()));
                                countDownTimer2 = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.countDownTimer;
                                if (countDownTimer2 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
                                    countDownTimer2 = null;
                                }
                                countDownTimer2.cancel();
                                activityBloodOxygenBinding13 = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.binding;
                                if (activityBloodOxygenBinding13 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    activityBloodOxygenBinding14 = activityBloodOxygenBinding13;
                                }
                                activityBloodOxygenBinding14.tvCurrHeart.clearAnimation();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (resultEntity.getErrCode() == 1) {
                        java.lang.String string2 = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_6666064);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_6666064)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
                    }
                    activityBloodOxygenBinding7 = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.binding;
                    if (activityBloodOxygenBinding7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityBloodOxygenBinding7 = null;
                    }
                    activityBloodOxygenBinding7.imageHeart.clearAnimation();
                    activityBloodOxygenBinding8 = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.binding;
                    if (activityBloodOxygenBinding8 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityBloodOxygenBinding8 = null;
                    }
                    activityBloodOxygenBinding8.tvCurrHeart.clearAnimation();
                    countDownTimer = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.countDownTimer;
                    if (countDownTimer == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
                        countDownTimer = null;
                    }
                    countDownTimer.cancel();
                    com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.startMeasure = false;
                    activityBloodOxygenBinding9 = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.binding;
                    if (activityBloodOxygenBinding9 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityBloodOxygenBinding9 = null;
                    }
                    activityBloodOxygenBinding9.btnMeasure.setText(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_76660010));
                    handler = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.handler;
                    handler.removeCallbacks(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.getHeartRunnable());
                    if (resultEntity.getErrCode() != 0) {
                        handler2 = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.handler;
                        handler2.removeCallbacks(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.getHeartRunnable());
                        activityBloodOxygenBinding10 = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.binding;
                        if (activityBloodOxygenBinding10 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityBloodOxygenBinding10 = null;
                        }
                        activityBloodOxygenBinding10.tvCurrHeart.setText("--");
                        activityBloodOxygenBinding11 = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.binding;
                        if (activityBloodOxygenBinding11 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityBloodOxygenBinding14 = activityBloodOxygenBinding11;
                        }
                        activityBloodOxygenBinding14.tvHeartTime.setText("");
                    }
                }
            });
            bloodOxygenActivity.handler.removeCallbacks(bloodOxygenActivity.heartRunnable);
            bloodOxygenActivity.handler.postDelayed(bloodOxygenActivity.heartRunnable, 30000L);
            return;
        }
        bloodOxygenActivity.startMeasure = false;
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding7 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding7 = null;
        }
        activityBloodOxygenBinding7.btnMeasure.setText(bloodOxygenActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_76660010));
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding8 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding8 = null;
        }
        activityBloodOxygenBinding8.imageHeart.clearAnimation();
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding9 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding9 = null;
        }
        activityBloodOxygenBinding9.tvCurrHeart.clearAnimation();
        android.os.CountDownTimer countDownTimer = bloodOxygenActivity.countDownTimer;
        if (countDownTimer == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
            countDownTimer = null;
        }
        countDownTimer.cancel();
        bloodOxygenActivity.handler.removeCallbacks(bloodOxygenActivity.heartRunnable);
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StopHeartRateReq.stopBloodOxygen((byte) 0), null);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if ((messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent) && this.dateUtil.isToday()) {
            getViewModel().queryBloodOxygenByDate(this.dateUtil);
            queryManualBloodOxygen(this.dateUtil);
        }
    }

    public final java.lang.Runnable getHeartRunnable() {
        return this.heartRunnable;
    }

    public final void setHeartRunnable(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "<set-?>");
        this.heartRunnable = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: heartRunnable$lambda-12, reason: not valid java name */
    public static final void m918heartRunnable$lambda12(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity bloodOxygenActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenActivity, "this$0");
        bloodOxygenActivity.startMeasure = false;
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding = null;
        }
        activityBloodOxygenBinding.btnMeasure.setText(bloodOxygenActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_76660010));
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding2 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding2 = null;
        }
        activityBloodOxygenBinding2.imageHeart.clearAnimation();
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding3 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding3 = null;
        }
        activityBloodOxygenBinding3.tvCurrHeart.clearAnimation();
        android.os.CountDownTimer countDownTimer = bloodOxygenActivity.countDownTimer;
        if (countDownTimer == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
            countDownTimer = null;
        }
        countDownTimer.cancel();
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding4 = bloodOxygenActivity.binding;
        if (activityBloodOxygenBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding4 = null;
        }
        activityBloodOxygenBinding4.tvHeartTime.setText(dateUtil.getY_M_D_H_M_S());
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StopHeartRateReq.stopBloodOxygen((byte) bloodOxygenActivity.bloodOxygenValue), null);
        com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository.INSTANCE.getGetInstance().saveManualBloodOxygen((int) dateUtil.getUnixTimestamp(), bloodOxygenActivity.bloodOxygenValue);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding = this.binding;
        com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.MyDeviceNotifyListener myDeviceNotifyListener = null;
        if (activityBloodOxygenBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodOxygenBinding = null;
        }
        activityBloodOxygenBinding.btnMeasure.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_76660010));
        this.deviceNotifyListener = new com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.MyDeviceNotifyListener();
        com.oudmon.ble.base.bluetooth.BleOperateManager bleOperateManager = com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance();
        com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.MyDeviceNotifyListener myDeviceNotifyListener2 = this.deviceNotifyListener;
        if (myDeviceNotifyListener2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceNotifyListener");
        } else {
            myDeviceNotifyListener = myDeviceNotifyListener2;
        }
        bleOperateManager.addOutDeviceListener(3, myDeviceNotifyListener);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onStop() {
        super.onStop();
        try {
            if (this.startMeasure) {
                this.startMeasure = false;
                this.handler.removeCallbacks(this.heartRunnable);
                android.os.CountDownTimer countDownTimer = this.countDownTimer;
                if (countDownTimer == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
                    countDownTimer = null;
                }
                countDownTimer.cancel();
                com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding = this.binding;
                if (activityBloodOxygenBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityBloodOxygenBinding = null;
                }
                activityBloodOxygenBinding.tvCurrHeart.setText("--");
                com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding2 = this.binding;
                if (activityBloodOxygenBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityBloodOxygenBinding2 = null;
                }
                activityBloodOxygenBinding2.tvCurrHeart.clearAnimation();
                com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding3 = this.binding;
                if (activityBloodOxygenBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityBloodOxygenBinding3 = null;
                }
                activityBloodOxygenBinding3.imageHeart.clearAnimation();
                com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StopHeartRateReq.stopBloodOxygen((byte) 0), null);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().removeOutDeviceListener(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryManualBloodOxygen(final com.qcwireless.qc_utils.date.DateUtil date) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$queryManualBloodOxygen$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity bloodOxygenActivity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenActivity, "$this$ktxRunOnBgSingle");
                java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity> queryManualBloodOxygen = com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository.INSTANCE.getGetInstance().queryManualBloodOxygen(com.qcwireless.qc_utils.date.DateUtil.this);
                bloodOxygenActivity.getViewModel().getManualList().clear();
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(queryManualBloodOxygen.size()));
                for (com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity bloodOxygenManualEntity : queryManualBloodOxygen) {
                    bloodOxygenActivity.getViewModel().getManualList().add(new com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean(bloodOxygenManualEntity.getTimestamp(), bloodOxygenManualEntity.getBloodOxygen(), bloodOxygenManualEntity.getBloodOxygen()));
                }
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(bloodOxygenActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$queryManualBloodOxygen$1.2
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity bloodOxygenActivity2) {
                        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding;
                        com.qcwireless.qcwatch.ui.home.bloodoxgen.adapter.ManualBloodOxygenDetailAdapter manualBloodOxygenDetailAdapter;
                        com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenActivity2, "$this$ktxRunOnUi");
                        com.qcwireless.qcwatch.ui.home.bloodoxgen.adapter.ManualBloodOxygenDetailAdapter manualBloodOxygenDetailAdapter2 = null;
                        if (bloodOxygenActivity2.getViewModel().getManualList().size() == 0) {
                            activityBloodOxygenBinding2 = bloodOxygenActivity2.binding;
                            if (activityBloodOxygenBinding2 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityBloodOxygenBinding2 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodOxygenBinding2.rcvDetailLayout);
                        } else {
                            activityBloodOxygenBinding = bloodOxygenActivity2.binding;
                            if (activityBloodOxygenBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityBloodOxygenBinding = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityBloodOxygenBinding.rcvDetailLayout);
                        }
                        manualBloodOxygenDetailAdapter = bloodOxygenActivity2.adapter;
                        if (manualBloodOxygenDetailAdapter == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        } else {
                            manualBloodOxygenDetailAdapter2 = manualBloodOxygenDetailAdapter;
                        }
                        manualBloodOxygenDetailAdapter2.notifyDataSetChanged();
                    }
                });
            }
        });
    }

    /* compiled from: BloodOxygenActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/BloodOxygenActivity$MyDeviceNotifyListener;", "Lcom/oudmon/ble/base/communication/responseImpl/DeviceNotifyListener;", "(Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/BloodOxygenActivity;)V", "onDataResponse", "", "resultEntity", "Lcom/oudmon/ble/base/communication/rsp/DeviceNotifyRsp;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyDeviceNotifyListener extends com.oudmon.ble.base.communication.responseImpl.DeviceNotifyListener {
        public MyDeviceNotifyListener() {
        }

        @Override // com.oudmon.ble.base.communication.responseImpl.DeviceNotifyListener, com.oudmon.ble.base.communication.ICommandResponse
        public void onDataResponse(com.oudmon.ble.base.communication.rsp.DeviceNotifyRsp resultEntity) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(resultEntity);
            if (resultEntity.getStatus() == 0 && resultEntity.getDataType() == 3) {
                com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.getViewModel().syncTodayData();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$secondsDown$1] */
    private final void secondsDown() {
        final long j = 25000;
        android.os.CountDownTimer start = new android.os.CountDownTimer(j) { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$secondsDown$1
            @Override // android.os.CountDownTimer
            public void onFinish() {
            }

            @Override // android.os.CountDownTimer
            public void onTick(long p0) {
                int i = ((int) (p0 / 500)) % 2;
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(i));
                if (i == 0) {
                    final com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity bloodOxygenActivity = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$secondsDown$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$secondsDown$1$onTick$1
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$secondsDown$1) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$secondsDown$1 bloodOxygenActivity$secondsDown$1) {
                            com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenActivity$secondsDown$1, "$this$ktxRunOnUi");
                            activityBloodOxygenBinding = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.binding;
                            if (activityBloodOxygenBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityBloodOxygenBinding = null;
                            }
                            activityBloodOxygenBinding.tvCurrHeart.setText("--");
                        }
                    });
                } else {
                    final com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity bloodOxygenActivity2 = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$secondsDown$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$secondsDown$1$onTick$2
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$secondsDown$1) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity$secondsDown$1 bloodOxygenActivity$secondsDown$1) {
                            com.qcwireless.qcwatch.databinding.ActivityBloodOxygenBinding activityBloodOxygenBinding;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenActivity$secondsDown$1, "$this$ktxRunOnUi");
                            activityBloodOxygenBinding = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenActivity.this.binding;
                            if (activityBloodOxygenBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityBloodOxygenBinding = null;
                            }
                            activityBloodOxygenBinding.tvCurrHeart.setText("-");
                        }
                    });
                }
            }
        }.start();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(start, "private fun secondsDown(…\n\n        }.start()\n    }");
        this.countDownTimer = start;
    }
}
