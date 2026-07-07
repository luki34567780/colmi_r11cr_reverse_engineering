package com.qcwireless.qcwatch.ui.home.heart;

/* compiled from: HeartActivity.kt */
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002<=B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\b\u00101\u001a\u00020.H\u0014J\u0010\u00102\u001a\u00020.2\u0006\u00103\u001a\u000204H\u0017J\b\u00105\u001a\u00020.H\u0014J\b\u00106\u001a\u00020.H\u0014J\b\u00107\u001a\u00020.H\u0014J\u0010\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020\u0010H\u0002J\b\u0010:\u001a\u00020.H\u0002J\b\u0010;\u001a\u00020.H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*¨\u0006>"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/home/heart/adapter/ManualHeartRateDetailAdapter;", "alphaAnimation", "Landroid/view/animation/AlphaAnimation;", "animation", "Landroid/view/animation/ScaleAnimation;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityHeartBinding;", "callback", "Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivity$MyRunnable;", "countDownTimer", "Landroid/os/CountDownTimer;", "dateUtil", "Lcom/qcwireless/qc_utils/date/DateUtil;", "deviceNotifyListener", "Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivity$MyDeviceNotifyListener;", "deviceSetting", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "handler", "Landroid/os/Handler;", "heartRunnable", "Ljava/lang/Runnable;", "getHeartRunnable", "()Ljava/lang/Runnable;", "setHeartRunnable", "(Ljava/lang/Runnable;)V", "heartValue", "", "getHeartValue", "()I", "setHeartValue", "(I)V", "maxHeart", "startMeasure", "", "userAge", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivityViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onPause", "onResume", "onStop", "queryManualHeart", "date", "secondsDown", "setupViews", "MyDeviceNotifyListener", "MyRunnable", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class HeartActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.home.heart.adapter.ManualHeartRateDetailAdapter adapter;
    private android.view.animation.AlphaAnimation alphaAnimation;
    private android.view.animation.ScaleAnimation animation;
    private com.qcwireless.qcwatch.databinding.ActivityHeartBinding binding;
    private android.os.CountDownTimer countDownTimer;
    private com.qcwireless.qcwatch.ui.home.heart.HeartActivity.MyDeviceNotifyListener deviceNotifyListener;
    private com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;
    private final android.os.Handler handler;
    private java.lang.Runnable heartRunnable;
    private boolean startMeasure;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private int userAge = 27;
    private int maxHeart = 200;
    private final com.qcwireless.qcwatch.ui.home.heart.HeartActivity.MyRunnable callback = new com.qcwireless.qcwatch.ui.home.heart.HeartActivity.MyRunnable();
    private com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
    private int heartValue = 85;

    public HeartActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel m1110invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
        this.heartRunnable = new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.ui.home.heart.HeartActivity.m1098heartRunnable$lambda15(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel) this.viewModel.getValue();
    }

    public final int getHeartValue() {
        return this.heartValue;
    }

    public final void setHeartValue(int i) {
        this.heartValue = i;
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding inflate = com.qcwireless.qcwatch.databinding.ActivityHeartBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        androidx.core.widget.NestedScrollView root = inflate.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView((android.view.View) root);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        android.content.Context context = (android.content.Context) this;
        this.adapter = new com.qcwireless.qcwatch.ui.home.heart.adapter.ManualHeartRateDetailAdapter(context, getViewModel().getManualList());
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding2 = null;
        if (activityHeartBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding = null;
        }
        activityHeartBinding.rcvBloodOxygenDetail.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding3 = this.binding;
        if (activityHeartBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding3 = null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = activityHeartBinding3.rcvBloodOxygenDetail;
        com.qcwireless.qcwatch.ui.home.heart.adapter.ManualHeartRateDetailAdapter manualHeartRateDetailAdapter = this.adapter;
        if (manualHeartRateDetailAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            manualHeartRateDetailAdapter = null;
        }
        recyclerView.setAdapter(manualHeartRateDetailAdapter);
        getViewModel().initData(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        getViewModel().m1113getAge();
        final com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding4 = this.binding;
        if (activityHeartBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding4 = null;
        }
        setStatusBarBackground(com.qcwireless.qcwatch.R.color.heart_bg);
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityHeartBinding4.titleBar.divider);
        activityHeartBinding4.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_85));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityHeartBinding4.titleBar.tvRightText);
        activityHeartBinding4.titleBar.tvRightText.setBackgroundResource(com.qcwireless.qcwatch.R.mipmap.app_warming);
        activityHeartBinding4.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.heart.HeartActivity.m1103setupViews$lambda4$lambda0(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this, view);
            }
        });
        final com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qDateSwitchView = activityHeartBinding4.qcDateChange;
        qDateSwitchView.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$setupViews$1$2$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore
            public void clickBefore(boolean r3, com.qcwireless.qc_utils.date.DateUtil date) {
                com.qcwireless.qc_utils.date.DateUtil dateUtil;
                com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding5;
                com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding6;
                com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding7;
                com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding8;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
                com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.this.setDateUtil(date);
                this.dateUtil = date;
                dateUtil = this.dateUtil;
                com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding9 = null;
                if (dateUtil.isToday()) {
                    activityHeartBinding7 = this.binding;
                    if (activityHeartBinding7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityHeartBinding7 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(activityHeartBinding7.btnMeasure);
                    activityHeartBinding8 = this.binding;
                    if (activityHeartBinding8 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityHeartBinding9 = activityHeartBinding8;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(activityHeartBinding9.currHeartCtl);
                } else {
                    activityHeartBinding5 = this.binding;
                    if (activityHeartBinding5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityHeartBinding5 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone(activityHeartBinding5.btnMeasure);
                    activityHeartBinding6 = this.binding;
                    if (activityHeartBinding6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityHeartBinding9 = activityHeartBinding6;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone(activityHeartBinding9.currHeartCtl);
                }
                this.getViewModel().showHeartRateDetail(date);
                this.queryManualHeart(date);
            }
        });
        activityHeartBinding4.heartChatView.setSelectedListener(new com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.OnSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$$ExternalSyntheticLambda1
            @Override // com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.OnSelectedListener
            public final void onSelected(com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean) {
                com.qcwireless.qcwatch.ui.home.heart.HeartActivity.m1104setupViews$lambda4$lambda2(com.qcwireless.qcwatch.databinding.ActivityHeartBinding.this, heartDataBean);
            }
        });
        android.widget.TextView textView = activityHeartBinding4.tvValue1;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_100);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_100)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        textView.setText(format);
        android.widget.TextView textView2 = activityHeartBinding4.tvValue2;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_100);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_100)");
        java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
        textView2.setText(format2);
        android.widget.TextView textView3 = activityHeartBinding4.tvValue3;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string3 = getString(com.qcwireless.qcwatch.R.string.qc_text_100);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_100)");
        java.lang.String format3 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "format(format, *args)");
        textView3.setText(format3);
        android.widget.TextView textView4 = activityHeartBinding4.tvValue4;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject4 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string4 = getString(com.qcwireless.qcwatch.R.string.qc_text_100);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_100)");
        java.lang.String format4 = java.lang.String.format(string4, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format4, "format(format, *args)");
        textView4.setText(format4);
        android.widget.TextView textView5 = activityHeartBinding4.tvValue5;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject5 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string5 = getString(com.qcwireless.qcwatch.R.string.qc_text_100);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.qc_text_100)");
        java.lang.String format5 = java.lang.String.format(string5, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format5, "format(format, *args)");
        textView5.setText(format5);
        activityHeartBinding4.tvDesc.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.heart.HeartActivity.m1105setupViews$lambda4$lambda3(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this, view);
            }
        });
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getLastDate().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$$ExternalSyntheticLambda8
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.heart.HeartActivity.m1106setupViews$lambda5(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this, (com.qcwireless.qc_utils.date.DateUtil) obj);
            }
        });
        getViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$$ExternalSyntheticLambda10
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.heart.HeartActivity.m1107setupViews$lambda7(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this, (com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartDetailUI) obj);
            }
        });
        getViewModel().getAge().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$$ExternalSyntheticLambda11
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.heart.HeartActivity.m1108setupViews$lambda8(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this, (com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge) obj);
            }
        });
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 1.3f, 1.0f, 1.3f, 1, 0.5f, 1, 0.5f);
        this.animation = scaleAnimation;
        scaleAnimation.setDuration(1500L);
        android.view.animation.ScaleAnimation scaleAnimation2 = this.animation;
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
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding5 = this.binding;
        if (activityHeartBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding5 = null;
        }
        activityHeartBinding5.heartValueDetail.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$setupViews$5
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qc_utils.date.DateUtil dateUtil;
                android.os.Bundle bundle = new android.os.Bundle();
                dateUtil = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.dateUtil;
                bundle.putInt("timestamp", (int) dateUtil.getUnixTimestamp());
                android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this;
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.heart.HeartRateDataDetailActivity.class);
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
        getViewModel().getDeviceSetting().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$$ExternalSyntheticLambda9
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.heart.HeartActivity.m1109setupViews$lambda9(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this, (com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding6 = this.binding;
        if (activityHeartBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding6 = null;
        }
        activityHeartBinding6.qcSettingHeart.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$$ExternalSyntheticLambda7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.home.heart.HeartActivity.m1099setupViews$lambda10(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this, compoundButton, z);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding7 = this.binding;
        if (activityHeartBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding7 = null;
        }
        activityHeartBinding7.qcSettingHeart.setSubTitleClick(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.heart.HeartActivity.m1100setupViews$lambda11(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding8 = this.binding;
        if (activityHeartBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding8 = null;
        }
        activityHeartBinding8.tvListDetail.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.heart.HeartActivity.m1101setupViews$lambda13(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding9 = this.binding;
        if (activityHeartBinding9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityHeartBinding2 = activityHeartBinding9;
        }
        activityHeartBinding2.btnMeasure.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.heart.HeartActivity.m1102setupViews$lambda14(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-4$lambda-0, reason: not valid java name */
    public static final void m1103setupViews$lambda4$lambda0(com.qcwireless.qcwatch.ui.home.heart.HeartActivity heartActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivity, "this$0");
        android.app.Activity activity = (android.app.Activity) heartActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.heart.HeartRateGuideActivity.class);
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
    /* renamed from: setupViews$lambda-4$lambda-2, reason: not valid java name */
    public static final void m1104setupViews$lambda4$lambda2(com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding, final com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHeartBinding, "$this_run");
        if (heartDataBean != null) {
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(activityHeartBinding, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.databinding.ActivityHeartBinding, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$setupViews$1$3$1
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.databinding.ActivityHeartBinding) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHeartBinding2, "$this$ktxRunOnUi");
                    if (com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean.this.getValue() > 0) {
                        activityHeartBinding2.tvHeartValue.setText(java.lang.String.valueOf(com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean.this.getValue()));
                    } else {
                        activityHeartBinding2.tvHeartValue.setText("--");
                    }
                    activityHeartBinding2.tvHM.setText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean.this.getMin()));
                }
            });
        } else {
            activityHeartBinding.tvHeartValue.setText("--");
            activityHeartBinding.tvHM.setText("12:00");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-4$lambda-3, reason: not valid java name */
    public static final void m1105setupViews$lambda4$lambda3(com.qcwireless.qcwatch.ui.home.heart.HeartActivity heartActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivity, "this$0");
        android.app.Activity activity = (android.app.Activity) heartActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.heart.ExerciseHeartGuideActivity.class);
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
    /* renamed from: setupViews$lambda-5, reason: not valid java name */
    public static final void m1106setupViews$lambda5(com.qcwireless.qcwatch.ui.home.heart.HeartActivity heartActivity, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dateUtil, "it");
        heartActivity.dateUtil = dateUtil;
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding = null;
        if (dateUtil.isToday()) {
            com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding2 = heartActivity.binding;
            if (activityHeartBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHeartBinding2 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityHeartBinding2.btnMeasure);
            com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding3 = heartActivity.binding;
            if (activityHeartBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHeartBinding3 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityHeartBinding3.currHeartCtl);
        } else {
            com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding4 = heartActivity.binding;
            if (activityHeartBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHeartBinding4 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityHeartBinding4.btnMeasure);
            com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding5 = heartActivity.binding;
            if (activityHeartBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHeartBinding5 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityHeartBinding5.currHeartCtl);
        }
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding6 = heartActivity.binding;
        if (activityHeartBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityHeartBinding = activityHeartBinding6;
        }
        activityHeartBinding.qcDateChange.setDateUtil(dateUtil);
        heartActivity.getViewModel().showHeartRateDetail(dateUtil);
        heartActivity.queryManualHeart(dateUtil);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-7, reason: not valid java name */
    public static final void m1107setupViews$lambda7(com.qcwireless.qcwatch.ui.home.heart.HeartActivity heartActivity, com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartDetailUI heartDetailUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding = heartActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding2 = null;
        if (activityHeartBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding = null;
        }
        if (!heartDetailUI.getListData().isEmpty()) {
            activityHeartBinding.heartChatView.setData(heartDetailUI.getListData(), heartDetailUI.getToday());
            int i = 0;
            for (com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean : heartDetailUI.getListData()) {
                if (heartDataBean.getValue() > 0) {
                    i = heartDataBean.getMin();
                }
            }
            java.lang.String dayMinToStr = com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(i);
            com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding3 = heartActivity.binding;
            if (activityHeartBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityHeartBinding2 = activityHeartBinding3;
            }
            activityHeartBinding2.heartValueDetail.setRightText(dayMinToStr);
            int[] iArr = {0, 0, 0, 0, 0};
            for (com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean2 : heartDetailUI.getListData()) {
                float value = heartDataBean2.getValue();
                int i2 = heartActivity.maxHeart;
                if (value >= i2 * 0.9f) {
                    iArr[0] = iArr[0] + heartDataBean2.getRange();
                } else if (value >= i2 * 0.8f) {
                    iArr[1] = iArr[1] + heartDataBean2.getRange();
                } else if (value >= i2 * 0.7f) {
                    iArr[2] = iArr[2] + heartDataBean2.getRange();
                } else if (value >= i2 * 0.6f) {
                    iArr[3] = iArr[3] + heartDataBean2.getRange();
                } else if (value >= i2 * 0.5f) {
                    iArr[4] = iArr[4] + heartDataBean2.getRange();
                }
            }
            activityHeartBinding.heartCircleView.dataInit(iArr);
            if (iArr[0] > 0) {
                android.widget.TextView textView = activityHeartBinding.tvValue1;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_100)");
                java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(iArr[0])}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                textView.setText(format);
            } else {
                android.widget.TextView textView2 = activityHeartBinding.tvValue1;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string2 = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_100)");
                java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
                textView2.setText(format2);
            }
            if (iArr[1] > 0) {
                android.widget.TextView textView3 = activityHeartBinding.tvValue2;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string3 = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_100)");
                java.lang.String format3 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(iArr[1])}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "format(format, *args)");
                textView3.setText(format3);
            } else {
                android.widget.TextView textView4 = activityHeartBinding.tvValue2;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject4 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string4 = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_100)");
                java.lang.String format4 = java.lang.String.format(string4, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format4, "format(format, *args)");
                textView4.setText(format4);
            }
            if (iArr[2] > 0) {
                android.widget.TextView textView5 = activityHeartBinding.tvValue3;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject5 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string5 = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.qc_text_100)");
                java.lang.String format5 = java.lang.String.format(string5, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(iArr[2])}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format5, "format(format, *args)");
                textView5.setText(format5);
            } else {
                android.widget.TextView textView6 = activityHeartBinding.tvValue3;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject6 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string6 = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.qc_text_100)");
                java.lang.String format6 = java.lang.String.format(string6, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format6, "format(format, *args)");
                textView6.setText(format6);
            }
            if (iArr[3] > 0) {
                android.widget.TextView textView7 = activityHeartBinding.tvValue4;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject7 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string7 = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.qc_text_100)");
                java.lang.String format7 = java.lang.String.format(string7, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(iArr[3])}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format7, "format(format, *args)");
                textView7.setText(format7);
            } else {
                android.widget.TextView textView8 = activityHeartBinding.tvValue4;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject8 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string8 = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.qc_text_100)");
                java.lang.String format8 = java.lang.String.format(string8, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format8, "format(format, *args)");
                textView8.setText(format8);
            }
            if (iArr[4] > 0) {
                android.widget.TextView textView9 = activityHeartBinding.tvValue5;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject9 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string9 = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string9, "getString(R.string.qc_text_100)");
                java.lang.String format9 = java.lang.String.format(string9, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(iArr[4])}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format9, "format(format, *args)");
                textView9.setText(format9);
                return;
            }
            android.widget.TextView textView10 = activityHeartBinding.tvValue5;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject10 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string10 = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string10, "getString(R.string.qc_text_100)");
            java.lang.String format10 = java.lang.String.format(string10, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format10, "format(format, *args)");
            textView10.setText(format10);
            return;
        }
        activityHeartBinding.heartCircleView.dataInit(new int[]{0, 0, 0, 0, 0});
        activityHeartBinding.heartChatView.setData(new java.util.ArrayList(), heartDetailUI.getToday());
        android.widget.TextView textView11 = activityHeartBinding.tvValue1;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject11 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string11 = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string11, "getString(R.string.qc_text_100)");
        java.lang.String format11 = java.lang.String.format(string11, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format11, "format(format, *args)");
        textView11.setText(format11);
        android.widget.TextView textView12 = activityHeartBinding.tvValue2;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject12 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string12 = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string12, "getString(R.string.qc_text_100)");
        java.lang.String format12 = java.lang.String.format(string12, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format12, "format(format, *args)");
        textView12.setText(format12);
        android.widget.TextView textView13 = activityHeartBinding.tvValue3;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject13 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string13 = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string13, "getString(R.string.qc_text_100)");
        java.lang.String format13 = java.lang.String.format(string13, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format13, "format(format, *args)");
        textView13.setText(format13);
        android.widget.TextView textView14 = activityHeartBinding.tvValue4;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject14 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string14 = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string14, "getString(R.string.qc_text_100)");
        java.lang.String format14 = java.lang.String.format(string14, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format14, "format(format, *args)");
        textView14.setText(format14);
        android.widget.TextView textView15 = activityHeartBinding.tvValue5;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject15 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string15 = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_100);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string15, "getString(R.string.qc_text_100)");
        java.lang.String format15 = java.lang.String.format(string15, java.util.Arrays.copyOf(new java.lang.Object[]{"--"}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format15, "format(format, *args)");
        textView15.setText(format15);
        activityHeartBinding.tvHeartValue.setText("--");
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding4 = heartActivity.binding;
        if (activityHeartBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityHeartBinding2 = activityHeartBinding4;
        }
        activityHeartBinding2.heartValueDetail.setRightText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-8, reason: not valid java name */
    public static final void m1108setupViews$lambda8(com.qcwireless.qcwatch.ui.home.heart.HeartActivity heartActivity, com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge userAge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivity, "this$0");
        int age = userAge.getAge();
        heartActivity.userAge = age;
        heartActivity.maxHeart = 220 - age;
        heartActivity.getViewModel().queryLastData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-9, reason: not valid java name */
    public static final void m1109setupViews$lambda9(com.qcwireless.qcwatch.ui.home.heart.HeartActivity heartActivity, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceSetting, "it");
        heartActivity.deviceSetting = deviceSetting;
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding = heartActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding2 = null;
        if (activityHeartBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding = null;
        }
        activityHeartBinding.qcSettingHeart.setChecked(deviceSetting.getHrDetection());
        int hrInterval = deviceSetting.getHrInterval();
        if (hrInterval <= 5) {
            hrInterval = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHeartRateInterval() ? 30 : 5;
        }
        if (hrInterval == 99) {
            hrInterval = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHeartRateInterval() ? 30 : 5;
        }
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding3 = heartActivity.binding;
        if (activityHeartBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityHeartBinding2 = activityHeartBinding3;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItemTitleSubTitleSystem qSettingItemTitleSubTitleSystem = activityHeartBinding2.qcSettingHeart;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_6666056);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_6666056)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(hrInterval)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        qSettingItemTitleSubTitleSystem.setLeftSubText(format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-10, reason: not valid java name */
    public static final void m1099setupViews$lambda10(com.qcwireless.qcwatch.ui.home.heart.HeartActivity heartActivity, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivity, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = heartActivity.deviceSetting;
            if (deviceSetting2 != null) {
                if (deviceSetting2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                    deviceSetting2 = null;
                }
                deviceSetting2.setHrDetection(z);
                com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel viewModel = heartActivity.getViewModel();
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = heartActivity.deviceSetting;
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
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding = heartActivity.binding;
        if (activityHeartBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItemTitleSubTitleSystem qSettingItemTitleSubTitleSystem = activityHeartBinding.qcSettingHeart;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = heartActivity.deviceSetting;
        if (deviceSetting4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting4 = null;
        }
        qSettingItemTitleSubTitleSystem.setChecked(deviceSetting4.getHrDetection());
        java.lang.String string = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-11, reason: not valid java name */
    public static final void m1100setupViews$lambda11(com.qcwireless.qcwatch.ui.home.heart.HeartActivity heartActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding = heartActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding2 = null;
        if (activityHeartBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding = null;
        }
        if (activityHeartBinding.qcSettingHeart.getTextLines() == 2) {
            com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding3 = heartActivity.binding;
            if (activityHeartBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHeartBinding3 = null;
            }
            activityHeartBinding3.qcSettingHeart.startAnim(180.0f);
            com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding4 = heartActivity.binding;
            if (activityHeartBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityHeartBinding2 = activityHeartBinding4;
            }
            activityHeartBinding2.qcSettingHeart.setTextLines(20);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding5 = heartActivity.binding;
        if (activityHeartBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding5 = null;
        }
        activityHeartBinding5.qcSettingHeart.startAnim(360.0f);
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding6 = heartActivity.binding;
        if (activityHeartBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityHeartBinding2 = activityHeartBinding6;
        }
        activityHeartBinding2.qcSettingHeart.setTextLines(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-13, reason: not valid java name */
    public static final void m1101setupViews$lambda13(com.qcwireless.qcwatch.ui.home.heart.HeartActivity heartActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivity, "this$0");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("timestamp", (int) heartActivity.dateUtil.getUnixTimestamp());
        android.app.Activity activity = (android.app.Activity) heartActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.heart.AppHeartDetailActivity.class);
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
    /* renamed from: setupViews$lambda-14, reason: not valid java name */
    public static final void m1102setupViews$lambda14(final com.qcwireless.qcwatch.ui.home.heart.HeartActivity heartActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivity, "this$0");
        android.view.animation.AlphaAnimation alphaAnimation = null;
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            java.lang.String string = heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding = heartActivity.binding;
        if (activityHeartBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding = null;
        }
        activityHeartBinding.tvCurrHeart.setText("--");
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding2 = heartActivity.binding;
        if (activityHeartBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding2 = null;
        }
        activityHeartBinding2.tvHeartTime.setText("");
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding3 = heartActivity.binding;
        if (activityHeartBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding3 = null;
        }
        android.widget.ImageView imageView = activityHeartBinding3.imageHeart;
        android.view.animation.ScaleAnimation scaleAnimation = heartActivity.animation;
        if (scaleAnimation == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("animation");
            scaleAnimation = null;
        }
        imageView.startAnimation(scaleAnimation);
        if (!heartActivity.startMeasure) {
            heartActivity.startMeasure = true;
            com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding4 = heartActivity.binding;
            if (activityHeartBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHeartBinding4 = null;
            }
            activityHeartBinding4.btnMeasure.setText(heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_76660011));
            com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding5 = heartActivity.binding;
            if (activityHeartBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHeartBinding5 = null;
            }
            android.widget.TextView textView = activityHeartBinding5.tvCurrHeart;
            android.view.animation.AlphaAnimation alphaAnimation2 = heartActivity.alphaAnimation;
            if (alphaAnimation2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("alphaAnimation");
            } else {
                alphaAnimation = alphaAnimation2;
            }
            textView.startAnimation(alphaAnimation);
            heartActivity.secondsDown();
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StartHeartRateReq.getSimpleReq((byte) 1), new com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.StartHeartRateRsp>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$setupViews$10$1
                @Override // com.oudmon.ble.base.communication.ICommandResponse
                public void onDataResponse(com.oudmon.ble.base.communication.rsp.StartHeartRateRsp resultEntity) {
                    com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding6;
                    com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding7;
                    android.os.CountDownTimer countDownTimer;
                    com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding8;
                    android.os.Handler handler;
                    android.os.Handler handler2;
                    com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding9;
                    com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding10;
                    boolean z;
                    com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding11;
                    android.os.CountDownTimer countDownTimer2;
                    com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding12;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultEntity, "resultEntity");
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, resultEntity);
                    com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding13 = null;
                    if (resultEntity.getErrCode() == 0 && resultEntity.getType() == 1) {
                        if (resultEntity.getValue() > 0) {
                            z = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.startMeasure;
                            if (!z || com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.getHeartValue() <= 0) {
                                return;
                            }
                            com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.setHeartValue(resultEntity.getValue());
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.getHeartValue()));
                            activityHeartBinding11 = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.binding;
                            if (activityHeartBinding11 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityHeartBinding11 = null;
                            }
                            activityHeartBinding11.tvCurrHeart.setText(java.lang.String.valueOf(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.getHeartValue()));
                            countDownTimer2 = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.countDownTimer;
                            if (countDownTimer2 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
                                countDownTimer2 = null;
                            }
                            countDownTimer2.cancel();
                            activityHeartBinding12 = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.binding;
                            if (activityHeartBinding12 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityHeartBinding13 = activityHeartBinding12;
                            }
                            activityHeartBinding13.tvCurrHeart.clearAnimation();
                            return;
                        }
                        return;
                    }
                    if (resultEntity.getErrCode() == 1) {
                        java.lang.String string2 = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_6666064);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_6666064)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
                    }
                    activityHeartBinding6 = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.binding;
                    if (activityHeartBinding6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityHeartBinding6 = null;
                    }
                    activityHeartBinding6.imageHeart.clearAnimation();
                    activityHeartBinding7 = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.binding;
                    if (activityHeartBinding7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityHeartBinding7 = null;
                    }
                    activityHeartBinding7.tvCurrHeart.clearAnimation();
                    countDownTimer = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.countDownTimer;
                    if (countDownTimer == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
                        countDownTimer = null;
                    }
                    countDownTimer.cancel();
                    com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.startMeasure = false;
                    activityHeartBinding8 = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.binding;
                    if (activityHeartBinding8 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityHeartBinding8 = null;
                    }
                    activityHeartBinding8.btnMeasure.setText(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_76660010));
                    handler = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.handler;
                    handler.removeCallbacks(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.getHeartRunnable());
                    if (resultEntity.getErrCode() == 0 || resultEntity.getErrCode() == 2) {
                        return;
                    }
                    handler2 = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.handler;
                    handler2.removeCallbacks(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.getHeartRunnable());
                    activityHeartBinding9 = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.binding;
                    if (activityHeartBinding9 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityHeartBinding9 = null;
                    }
                    activityHeartBinding9.tvCurrHeart.setText("--");
                    activityHeartBinding10 = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.binding;
                    if (activityHeartBinding10 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityHeartBinding13 = activityHeartBinding10;
                    }
                    activityHeartBinding13.tvHeartTime.setText("");
                }
            });
            heartActivity.handler.removeCallbacks(heartActivity.heartRunnable);
            heartActivity.handler.postDelayed(heartActivity.heartRunnable, 30000L);
            return;
        }
        heartActivity.startMeasure = false;
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding6 = heartActivity.binding;
        if (activityHeartBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding6 = null;
        }
        activityHeartBinding6.btnMeasure.setText(heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_76660010));
        heartActivity.handler.removeCallbacks(heartActivity.heartRunnable);
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding7 = heartActivity.binding;
        if (activityHeartBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding7 = null;
        }
        activityHeartBinding7.imageHeart.clearAnimation();
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding8 = heartActivity.binding;
        if (activityHeartBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding8 = null;
        }
        activityHeartBinding8.tvCurrHeart.clearAnimation();
        android.os.CountDownTimer countDownTimer = heartActivity.countDownTimer;
        if (countDownTimer == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
            countDownTimer = null;
        }
        countDownTimer.cancel();
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StopHeartRateReq.stopHeartRate((byte) 0), null);
    }

    public final java.lang.Runnable getHeartRunnable() {
        return this.heartRunnable;
    }

    public final void setHeartRunnable(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "<set-?>");
        this.heartRunnable = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: heartRunnable$lambda-15, reason: not valid java name */
    public static final void m1098heartRunnable$lambda15(com.qcwireless.qcwatch.ui.home.heart.HeartActivity heartActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivity, "this$0");
        heartActivity.startMeasure = false;
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding = heartActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding2 = null;
        if (activityHeartBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding = null;
        }
        activityHeartBinding.btnMeasure.setText(heartActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_76660010));
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding3 = heartActivity.binding;
        if (activityHeartBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding3 = null;
        }
        activityHeartBinding3.tvCurrHeart.setText(java.lang.String.valueOf(heartActivity.heartValue));
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding4 = heartActivity.binding;
        if (activityHeartBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding4 = null;
        }
        activityHeartBinding4.tvCurrHeart.clearAnimation();
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding5 = heartActivity.binding;
        if (activityHeartBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding5 = null;
        }
        activityHeartBinding5.imageHeart.clearAnimation();
        android.os.CountDownTimer countDownTimer = heartActivity.countDownTimer;
        if (countDownTimer == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
            countDownTimer = null;
        }
        countDownTimer.cancel();
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StopHeartRateReq.stopHeartRate((byte) heartActivity.heartValue), null);
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding6 = heartActivity.binding;
        if (activityHeartBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityHeartBinding2 = activityHeartBinding6;
        }
        activityHeartBinding2.tvHeartTime.setText(dateUtil.getY_M_D_H_M_S());
        com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.INSTANCE.getGetInstance().saveManualHeartRate(dateUtil.getUnixTimestamp(), heartActivity.heartValue);
    }

    /* compiled from: HeartActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivity$MyRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivity;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyRunnable implements java.lang.Runnable {
        public MyRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            final com.qcwireless.qcwatch.ui.home.heart.HeartActivity heartActivity = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this;
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.heart.HeartActivity.MyRunnable, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$MyRunnable$run$1
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.home.heart.HeartActivity.MyRunnable) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.home.heart.HeartActivity.MyRunnable myRunnable) {
                    android.os.Handler handler;
                    com.qcwireless.qcwatch.ui.home.heart.HeartActivity.MyRunnable myRunnable2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myRunnable, "$this$ktxRunOnUi");
                    com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(new com.oudmon.ble.base.communication.req.RealTimeHeartRate(3));
                    handler = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.handler;
                    myRunnable2 = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.callback;
                    handler.postDelayed(myRunnable2, 20000L);
                }
            });
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding = this.binding;
        com.qcwireless.qcwatch.ui.home.heart.HeartActivity.MyDeviceNotifyListener myDeviceNotifyListener = null;
        if (activityHeartBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHeartBinding = null;
        }
        activityHeartBinding.btnMeasure.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_76660010));
        this.deviceNotifyListener = new com.qcwireless.qcwatch.ui.home.heart.HeartActivity.MyDeviceNotifyListener();
        com.oudmon.ble.base.bluetooth.BleOperateManager bleOperateManager = com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance();
        com.qcwireless.qcwatch.ui.home.heart.HeartActivity.MyDeviceNotifyListener myDeviceNotifyListener2 = this.deviceNotifyListener;
        if (myDeviceNotifyListener2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceNotifyListener");
        } else {
            myDeviceNotifyListener = myDeviceNotifyListener2;
        }
        bleOperateManager.addOutDeviceListener(1, myDeviceNotifyListener);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onPause() {
        super.onPause();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent) {
            if (this.dateUtil.isToday()) {
                getViewModel().showHeartRateDetail(this.dateUtil);
                queryManualHeart(this.dateUtil);
                return;
            }
            return;
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) {
            ((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryManualHeart(final com.qcwireless.qc_utils.date.DateUtil date) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgFix(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.heart.HeartActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$queryManualHeart$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.heart.HeartActivity) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.heart.HeartActivity heartActivity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivity, "$this$ktxRunOnBgFix");
                java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity> queryManualAppHeart = com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.INSTANCE.getGetInstance().queryManualAppHeart(com.qcwireless.qc_utils.date.DateUtil.this);
                heartActivity.getViewModel().getManualList().clear();
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(queryManualAppHeart.size()));
                java.util.Iterator<T> it = queryManualAppHeart.iterator();
                while (it.hasNext()) {
                    heartActivity.getViewModel().getManualList().add(new com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean(r1.getTimestamp(), ((com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity) it.next()).getHeart()));
                }
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(heartActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.heart.HeartActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$queryManualHeart$1.2
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.heart.HeartActivity) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.heart.HeartActivity heartActivity2) {
                        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding;
                        com.qcwireless.qcwatch.ui.home.heart.adapter.ManualHeartRateDetailAdapter manualHeartRateDetailAdapter;
                        com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivity2, "$this$ktxRunOnUi");
                        com.qcwireless.qcwatch.ui.home.heart.adapter.ManualHeartRateDetailAdapter manualHeartRateDetailAdapter2 = null;
                        if (heartActivity2.getViewModel().getManualList().size() == 0) {
                            activityHeartBinding2 = heartActivity2.binding;
                            if (activityHeartBinding2 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityHeartBinding2 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityHeartBinding2.rcvDetailLayout);
                        } else {
                            activityHeartBinding = heartActivity2.binding;
                            if (activityHeartBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityHeartBinding = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityHeartBinding.rcvDetailLayout);
                        }
                        manualHeartRateDetailAdapter = heartActivity2.adapter;
                        if (manualHeartRateDetailAdapter == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        } else {
                            manualHeartRateDetailAdapter2 = manualHeartRateDetailAdapter;
                        }
                        manualHeartRateDetailAdapter2.notifyDataSetChanged();
                    }
                });
            }
        });
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onStop() {
        super.onStop();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().removeOutDeviceListener(1);
        if (this.startMeasure) {
            this.startMeasure = false;
            android.os.CountDownTimer countDownTimer = this.countDownTimer;
            if (countDownTimer == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
                countDownTimer = null;
            }
            countDownTimer.cancel();
            com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding = this.binding;
            if (activityHeartBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHeartBinding = null;
            }
            activityHeartBinding.tvCurrHeart.setText("--");
            com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding2 = this.binding;
            if (activityHeartBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHeartBinding2 = null;
            }
            activityHeartBinding2.tvCurrHeart.clearAnimation();
            com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding3 = this.binding;
            if (activityHeartBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityHeartBinding3 = null;
            }
            activityHeartBinding3.imageHeart.clearAnimation();
            this.handler.removeCallbacks(this.heartRunnable);
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StopHeartRateReq.stopHeartRate((byte) 0), null);
        }
    }

    /* compiled from: HeartActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivity$MyDeviceNotifyListener;", "Lcom/oudmon/ble/base/communication/responseImpl/DeviceNotifyListener;", "(Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivity;)V", "onDataResponse", "", "resultEntity", "Lcom/oudmon/ble/base/communication/rsp/DeviceNotifyRsp;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyDeviceNotifyListener extends com.oudmon.ble.base.communication.responseImpl.DeviceNotifyListener {
        public MyDeviceNotifyListener() {
        }

        @Override // com.oudmon.ble.base.communication.responseImpl.DeviceNotifyListener, com.oudmon.ble.base.communication.ICommandResponse
        public void onDataResponse(com.oudmon.ble.base.communication.rsp.DeviceNotifyRsp resultEntity) {
            super.onDataResponse(resultEntity);
            kotlin.jvm.internal.Intrinsics.checkNotNull(resultEntity);
            if (resultEntity.getStatus() == 0 && resultEntity.getDataType() == 1) {
                com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.getViewModel().syncTodayData();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.qcwireless.qcwatch.ui.home.heart.HeartActivity$secondsDown$1] */
    private final void secondsDown() {
        final long j = 25000;
        android.os.CountDownTimer start = new android.os.CountDownTimer(j) { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$secondsDown$1
            @Override // android.os.CountDownTimer
            public void onFinish() {
            }

            @Override // android.os.CountDownTimer
            public void onTick(long p0) {
                int i = ((int) (p0 / 500)) % 2;
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(i));
                if (i == 0) {
                    final com.qcwireless.qcwatch.ui.home.heart.HeartActivity heartActivity = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.heart.HeartActivity$secondsDown$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$secondsDown$1$onTick$1
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.heart.HeartActivity$secondsDown$1) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.heart.HeartActivity$secondsDown$1 heartActivity$secondsDown$1) {
                            com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivity$secondsDown$1, "$this$ktxRunOnUi");
                            activityHeartBinding = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.binding;
                            if (activityHeartBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityHeartBinding = null;
                            }
                            activityHeartBinding.tvCurrHeart.setText("--");
                        }
                    });
                } else {
                    final com.qcwireless.qcwatch.ui.home.heart.HeartActivity heartActivity2 = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.heart.HeartActivity$secondsDown$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivity$secondsDown$1$onTick$2
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.heart.HeartActivity$secondsDown$1) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.heart.HeartActivity$secondsDown$1 heartActivity$secondsDown$1) {
                            com.qcwireless.qcwatch.databinding.ActivityHeartBinding activityHeartBinding;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivity$secondsDown$1, "$this$ktxRunOnUi");
                            activityHeartBinding = com.qcwireless.qcwatch.ui.home.heart.HeartActivity.this.binding;
                            if (activityHeartBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityHeartBinding = null;
                            }
                            activityHeartBinding.tvCurrHeart.setText("-");
                        }
                    });
                }
            }
        }.start();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(start, "private fun secondsDown(…\n\n        }.start()\n    }");
        this.countDownTimer = start;
    }
}
