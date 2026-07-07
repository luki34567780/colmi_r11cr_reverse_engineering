package com.qcwireless.qcwatch.ui.home.bloodsugar;

/* compiled from: BloodSugarActivity.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\u0010\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+H\u0017J\b\u0010,\u001a\u00020&H\u0014J\u0010\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020\u000eH\u0002J\b\u0010/\u001a\u00020&H\u0002J\b\u00100\u001a\u00020&H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u00061"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bloodsugar/BloodSugarActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/home/bloodsugar/adapter/ManualSugarDetailAdapter;", "alphaAnimation", "Landroid/view/animation/AlphaAnimation;", "animation", "Landroid/view/animation/ScaleAnimation;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityBloodSugarBinding;", "countDownTimer", "Landroid/os/CountDownTimer;", "dateUtil", "Lcom/qcwireless/qc_utils/date/DateUtil;", "handler", "Landroid/os/Handler;", "startMeasure", "", "sugarRunnable", "Ljava/lang/Runnable;", "getSugarRunnable", "()Ljava/lang/Runnable;", "setSugarRunnable", "(Ljava/lang/Runnable;)V", "sugarValue", "", "getSugarValue", "()I", "setSugarValue", "(I)V", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/bloodsugar/BloodSugarActivityViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/bloodsugar/BloodSugarActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onStop", "queryManualSugar", "date", "secondsDown", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BloodSugarActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.home.bloodsugar.adapter.ManualSugarDetailAdapter adapter;
    private android.view.animation.AlphaAnimation alphaAnimation;
    private android.view.animation.ScaleAnimation animation;
    private com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding binding;
    private android.os.CountDownTimer countDownTimer;
    private final android.os.Handler handler;
    private boolean startMeasure;
    private java.lang.Runnable sugarRunnable;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
    private int sugarValue = 42;

    public BloodSugarActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel m941invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
        this.sugarRunnable = new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.m940sugarRunnable$lambda9(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel) this.viewModel.getValue();
    }

    public final int getSugarValue() {
        return this.sugarValue;
    }

    public final void setSugarValue(int i) {
        this.sugarValue = i;
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding inflate = com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding.inflate(getLayoutInflater());
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
        setStatusBarBackground(com.qcwireless.qcwatch.R.color.heart_bg);
        android.content.Context context = (android.content.Context) this;
        this.adapter = new com.qcwireless.qcwatch.ui.home.bloodsugar.adapter.ManualSugarDetailAdapter(context, getViewModel().getManualList());
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 1.3f, 1.0f, 1.3f, 1, 0.5f, 1, 0.5f);
        this.animation = scaleAnimation;
        scaleAnimation.setDuration(1500L);
        android.view.animation.ScaleAnimation scaleAnimation2 = this.animation;
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding = null;
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
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding2 = this.binding;
        if (activityBloodSugarBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding2 = null;
        }
        activityBloodSugarBinding2.rcvSugarDetail.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding3 = this.binding;
        if (activityBloodSugarBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding3 = null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = activityBloodSugarBinding3.rcvSugarDetail;
        com.qcwireless.qcwatch.ui.home.bloodsugar.adapter.ManualSugarDetailAdapter manualSugarDetailAdapter = this.adapter;
        if (manualSugarDetailAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            manualSugarDetailAdapter = null;
        }
        recyclerView.setAdapter(manualSugarDetailAdapter);
        getViewModel().queryLastData();
        final com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding4 = this.binding;
        if (activityBloodSugarBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding4 = null;
        }
        activityBloodSugarBinding4.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_569));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodSugarBinding4.titleBar.tvRightText);
        activityBloodSugarBinding4.titleBar.tvRightText.setBackgroundResource(com.qcwireless.qcwatch.R.mipmap.app_warming);
        activityBloodSugarBinding4.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.m934setupViews$lambda3$lambda0(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this, view);
            }
        });
        final com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qDateSwitchView = activityBloodSugarBinding4.qcDateChange;
        qDateSwitchView.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$setupViews$1$2$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore
            public void clickBefore(boolean r3, com.qcwireless.qc_utils.date.DateUtil date) {
                com.qcwireless.qc_utils.date.DateUtil dateUtil;
                com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding5;
                com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding6;
                com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel viewModel;
                com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding7;
                com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding8;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
                com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.this.setDateUtil(date);
                this.dateUtil = date;
                dateUtil = this.dateUtil;
                com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding9 = null;
                if (dateUtil.isToday()) {
                    activityBloodSugarBinding7 = this.binding;
                    if (activityBloodSugarBinding7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityBloodSugarBinding7 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(activityBloodSugarBinding7.btnMeasure);
                    activityBloodSugarBinding8 = this.binding;
                    if (activityBloodSugarBinding8 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityBloodSugarBinding9 = activityBloodSugarBinding8;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(activityBloodSugarBinding9.currHeartCtl);
                } else {
                    activityBloodSugarBinding5 = this.binding;
                    if (activityBloodSugarBinding5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityBloodSugarBinding5 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodSugarBinding5.btnMeasure);
                    activityBloodSugarBinding6 = this.binding;
                    if (activityBloodSugarBinding6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityBloodSugarBinding9 = activityBloodSugarBinding6;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodSugarBinding9.currHeartCtl);
                }
                viewModel = this.getViewModel();
                viewModel.queryBloodSugarByDate(date);
                this.queryManualSugar(date);
            }
        });
        activityBloodSugarBinding4.bloodSugarView.setSelectedListener(new com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.OnSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$$ExternalSyntheticLambda5
            @Override // com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.OnSelectedListener
            public final void onSelected(com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean dataBean) {
                com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.m935setupViews$lambda3$lambda2(com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding.this, dataBean);
            }
        });
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$$ExternalSyntheticLambda4
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.m936setupViews$lambda4(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this, (com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarUI) obj);
            }
        });
        getViewModel().getLastDate().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$$ExternalSyntheticLambda3
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.m937setupViews$lambda5(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this, (com.qcwireless.qc_utils.date.DateUtil) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding5 = this.binding;
        if (activityBloodSugarBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding5 = null;
        }
        activityBloodSugarBinding5.bloodSugarValueDetail.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$setupViews$4
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qc_utils.date.DateUtil dateUtil;
                android.os.Bundle bundle = new android.os.Bundle();
                dateUtil = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.dateUtil;
                bundle.putInt("timestamp", (int) dateUtil.getUnixTimestamp());
                android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this;
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarDataDetailActivity.class);
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
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding6 = this.binding;
        if (activityBloodSugarBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding6 = null;
        }
        activityBloodSugarBinding6.tvListDetail.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.m938setupViews$lambda7(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding7 = this.binding;
        if (activityBloodSugarBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityBloodSugarBinding = activityBloodSugarBinding7;
        }
        activityBloodSugarBinding.btnMeasure.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.m939setupViews$lambda8(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-3$lambda-0, reason: not valid java name */
    public static final void m934setupViews$lambda3$lambda0(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity bloodSugarActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarActivity, "this$0");
        android.app.Activity activity = (android.app.Activity) bloodSugarActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarGuideActivity.class);
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
    public static final void m935setupViews$lambda3$lambda2(com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding, final com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean dataBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityBloodSugarBinding, "$this_run");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(activityBloodSugarBinding, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$setupViews$1$3$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityBloodSugarBinding2, "$this$ktxRunOnUi");
                if (com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean.this.getMinValue() == 0.0f) {
                    activityBloodSugarBinding2.tvSugarValue.setText("--");
                } else {
                    android.widget.TextView textView = activityBloodSugarBinding2.tvSugarValue;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean.this.getMinValue());
                    sb.append('-');
                    sb.append(com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean.this.getMaxValue());
                    textView.setText(sb.toString());
                }
                activityBloodSugarBinding2.tvHM.setText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean.this.getSeconds() / 60));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4, reason: not valid java name */
    public static final void m936setupViews$lambda4(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity bloodSugarActivity, com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarUI bloodSugarUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding = null;
        if (!bloodSugarUI.getListData().isEmpty()) {
            com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding2 = bloodSugarActivity.binding;
            if (activityBloodSugarBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodSugarBinding2 = null;
            }
            activityBloodSugarBinding2.bloodSugarView.setData(bloodSugarUI.getListData(), bloodSugarUI.getToday());
            int i = -1;
            for (com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean dataBean : bloodSugarUI.getListData()) {
                if (dataBean.getMaxValue() > 0.0f) {
                    i = dataBean.getSeconds();
                }
            }
            java.lang.String dayMinToStr = com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(i / 60);
            if (i == -1) {
                com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding3 = bloodSugarActivity.binding;
                if (activityBloodSugarBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityBloodSugarBinding = activityBloodSugarBinding3;
                }
                activityBloodSugarBinding.bloodSugarValueDetail.setRightText("");
                return;
            }
            com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding4 = bloodSugarActivity.binding;
            if (activityBloodSugarBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityBloodSugarBinding = activityBloodSugarBinding4;
            }
            activityBloodSugarBinding.bloodSugarValueDetail.setRightText(dayMinToStr);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding5 = bloodSugarActivity.binding;
        if (activityBloodSugarBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding5 = null;
        }
        activityBloodSugarBinding5.bloodSugarView.setData(bloodSugarUI.getListData(), bloodSugarUI.getToday());
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding6 = bloodSugarActivity.binding;
        if (activityBloodSugarBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityBloodSugarBinding = activityBloodSugarBinding6;
        }
        activityBloodSugarBinding.bloodSugarValueDetail.setRightText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-5, reason: not valid java name */
    public static final void m937setupViews$lambda5(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity bloodSugarActivity, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dateUtil, "it");
        bloodSugarActivity.dateUtil = dateUtil;
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding = bloodSugarActivity.binding;
        if (activityBloodSugarBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding = null;
        }
        activityBloodSugarBinding.qcDateChange.setDateUtil(dateUtil);
        bloodSugarActivity.getViewModel().queryBloodSugarByDate(dateUtil);
        bloodSugarActivity.queryManualSugar(dateUtil);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-7, reason: not valid java name */
    public static final void m938setupViews$lambda7(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity bloodSugarActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarActivity, "this$0");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("timestamp", (int) bloodSugarActivity.dateUtil.getUnixTimestamp());
        bundle.putInt("type", 1);
        android.app.Activity activity = (android.app.Activity) bloodSugarActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarDataDetailActivity.class);
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
    /* renamed from: setupViews$lambda-8, reason: not valid java name */
    public static final void m939setupViews$lambda8(final com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity bloodSugarActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding = null;
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            java.lang.String string = bloodSugarActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding2 = bloodSugarActivity.binding;
        if (activityBloodSugarBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding2 = null;
        }
        activityBloodSugarBinding2.tvCurrHeart.setText("--");
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding3 = bloodSugarActivity.binding;
        if (activityBloodSugarBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding3 = null;
        }
        activityBloodSugarBinding3.tvHeartTime.setText("");
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding4 = bloodSugarActivity.binding;
        if (activityBloodSugarBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding4 = null;
        }
        android.widget.ImageView imageView = activityBloodSugarBinding4.imageHeart;
        android.view.animation.ScaleAnimation scaleAnimation = bloodSugarActivity.animation;
        if (scaleAnimation == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("animation");
            scaleAnimation = null;
        }
        imageView.startAnimation(scaleAnimation);
        if (!bloodSugarActivity.startMeasure) {
            bloodSugarActivity.startMeasure = true;
            com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding5 = bloodSugarActivity.binding;
            if (activityBloodSugarBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodSugarBinding5 = null;
            }
            android.widget.TextView textView = activityBloodSugarBinding5.tvCurrHeart;
            android.view.animation.AlphaAnimation alphaAnimation = bloodSugarActivity.alphaAnimation;
            if (alphaAnimation == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("alphaAnimation");
                alphaAnimation = null;
            }
            textView.startAnimation(alphaAnimation);
            bloodSugarActivity.secondsDown();
            com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding6 = bloodSugarActivity.binding;
            if (activityBloodSugarBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityBloodSugarBinding = activityBloodSugarBinding6;
            }
            activityBloodSugarBinding.btnMeasure.setText(bloodSugarActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_76660011));
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StartHeartRateReq.getSimpleReq((byte) 9), new com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.StartHeartRateRsp>() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$setupViews$6$1
                @Override // com.oudmon.ble.base.communication.ICommandResponse
                public void onDataResponse(com.oudmon.ble.base.communication.rsp.StartHeartRateRsp resultEntity) {
                    com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding7;
                    com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding8;
                    android.os.CountDownTimer countDownTimer;
                    com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding9;
                    android.os.Handler handler;
                    android.os.Handler handler2;
                    com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding10;
                    com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding11;
                    boolean z;
                    com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding12;
                    android.os.CountDownTimer countDownTimer2;
                    com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding13;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultEntity, "resultEntity");
                    com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding14 = null;
                    if (resultEntity.getErrCode() == 0 && resultEntity.getType() == 9) {
                        if (resultEntity.getValue() > 0) {
                            z = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.startMeasure;
                            if (z) {
                                com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.setSugarValue(resultEntity.getValue());
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.getSugarValue()));
                                activityBloodSugarBinding12 = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.binding;
                                if (activityBloodSugarBinding12 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    activityBloodSugarBinding12 = null;
                                }
                                activityBloodSugarBinding12.tvCurrHeart.setText(java.lang.String.valueOf((com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.getSugarValue() * 1.0f) / 10));
                                countDownTimer2 = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.countDownTimer;
                                if (countDownTimer2 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
                                    countDownTimer2 = null;
                                }
                                countDownTimer2.cancel();
                                activityBloodSugarBinding13 = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.binding;
                                if (activityBloodSugarBinding13 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    activityBloodSugarBinding14 = activityBloodSugarBinding13;
                                }
                                activityBloodSugarBinding14.tvCurrHeart.clearAnimation();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (resultEntity.getErrCode() == 1) {
                        java.lang.String string2 = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_6666064);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_6666064)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
                    }
                    com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.startMeasure = false;
                    activityBloodSugarBinding7 = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.binding;
                    if (activityBloodSugarBinding7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityBloodSugarBinding7 = null;
                    }
                    activityBloodSugarBinding7.imageHeart.clearAnimation();
                    activityBloodSugarBinding8 = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.binding;
                    if (activityBloodSugarBinding8 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityBloodSugarBinding8 = null;
                    }
                    activityBloodSugarBinding8.tvCurrHeart.clearAnimation();
                    countDownTimer = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.countDownTimer;
                    if (countDownTimer == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
                        countDownTimer = null;
                    }
                    countDownTimer.cancel();
                    activityBloodSugarBinding9 = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.binding;
                    if (activityBloodSugarBinding9 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityBloodSugarBinding9 = null;
                    }
                    activityBloodSugarBinding9.btnMeasure.setText(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_76660010));
                    handler = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.handler;
                    handler.removeCallbacks(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.getSugarRunnable());
                    if (resultEntity.getErrCode() == 0 || resultEntity.getErrCode() == 2) {
                        return;
                    }
                    handler2 = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.handler;
                    handler2.removeCallbacks(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.getSugarRunnable());
                    activityBloodSugarBinding10 = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.binding;
                    if (activityBloodSugarBinding10 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityBloodSugarBinding10 = null;
                    }
                    activityBloodSugarBinding10.tvCurrHeart.setText("--");
                    activityBloodSugarBinding11 = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.binding;
                    if (activityBloodSugarBinding11 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityBloodSugarBinding14 = activityBloodSugarBinding11;
                    }
                    activityBloodSugarBinding14.tvHeartTime.setText("");
                }
            });
            bloodSugarActivity.handler.removeCallbacks(bloodSugarActivity.sugarRunnable);
            bloodSugarActivity.handler.postDelayed(bloodSugarActivity.sugarRunnable, 30000L);
            return;
        }
        bloodSugarActivity.startMeasure = false;
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding7 = bloodSugarActivity.binding;
        if (activityBloodSugarBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding7 = null;
        }
        activityBloodSugarBinding7.imageHeart.clearAnimation();
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding8 = bloodSugarActivity.binding;
        if (activityBloodSugarBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding8 = null;
        }
        activityBloodSugarBinding8.tvCurrHeart.clearAnimation();
        android.os.CountDownTimer countDownTimer = bloodSugarActivity.countDownTimer;
        if (countDownTimer == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
            countDownTimer = null;
        }
        countDownTimer.cancel();
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding9 = bloodSugarActivity.binding;
        if (activityBloodSugarBinding9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding9 = null;
        }
        activityBloodSugarBinding9.btnMeasure.setText(bloodSugarActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_76660010));
        bloodSugarActivity.handler.removeCallbacks(bloodSugarActivity.sugarRunnable);
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StopHeartRateReq.stopHeartRate((byte) 0), null);
    }

    public final java.lang.Runnable getSugarRunnable() {
        return this.sugarRunnable;
    }

    public final void setSugarRunnable(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "<set-?>");
        this.sugarRunnable = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sugarRunnable$lambda-9, reason: not valid java name */
    public static final void m940sugarRunnable$lambda9(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity bloodSugarActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarActivity, "this$0");
        bloodSugarActivity.startMeasure = false;
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding = bloodSugarActivity.binding;
        if (activityBloodSugarBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding = null;
        }
        activityBloodSugarBinding.btnMeasure.setText(bloodSugarActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_76660010));
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding2 = bloodSugarActivity.binding;
        if (activityBloodSugarBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding2 = null;
        }
        activityBloodSugarBinding2.imageHeart.clearAnimation();
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding3 = bloodSugarActivity.binding;
        if (activityBloodSugarBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding3 = null;
        }
        activityBloodSugarBinding3.tvCurrHeart.clearAnimation();
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding4 = bloodSugarActivity.binding;
        if (activityBloodSugarBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding4 = null;
        }
        activityBloodSugarBinding4.tvCurrHeart.setText(java.lang.String.valueOf((bloodSugarActivity.sugarValue * 1.0f) / 10));
        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding5 = bloodSugarActivity.binding;
        if (activityBloodSugarBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBloodSugarBinding5 = null;
        }
        activityBloodSugarBinding5.tvHeartTime.setText(dateUtil.getY_M_D_H_M_S());
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StopHeartRateReq.stopBloodSugar((byte) bloodSugarActivity.sugarValue), null);
        com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository.INSTANCE.getGetInstance().saveManualSugar(dateUtil.getUnixTimestamp(), bloodSugarActivity.sugarValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryManualSugar(final com.qcwireless.qc_utils.date.DateUtil date) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgFix(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$queryManualSugar$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity bloodSugarActivity) {
                com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel viewModel;
                com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel viewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarActivity, "$this$ktxRunOnBgFix");
                java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity> queryManualAppSugar = com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository.INSTANCE.getGetInstance().queryManualAppSugar(com.qcwireless.qc_utils.date.DateUtil.this);
                viewModel = bloodSugarActivity.getViewModel();
                viewModel.getManualList().clear();
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(queryManualAppSugar.size()));
                for (com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity appBloodSugarEntity : queryManualAppSugar) {
                    viewModel2 = bloodSugarActivity.getViewModel();
                    viewModel2.getManualList().add(new com.qcwireless.qcwatch.ui.home.bloodsugar.bean.AppSugarDetailBean(appBloodSugarEntity.getTimestamp(), appBloodSugarEntity.getSugar()));
                }
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(bloodSugarActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$queryManualSugar$1.2
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity bloodSugarActivity2) {
                        com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel viewModel3;
                        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding;
                        com.qcwireless.qcwatch.ui.home.bloodsugar.adapter.ManualSugarDetailAdapter manualSugarDetailAdapter;
                        com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarActivity2, "$this$ktxRunOnUi");
                        viewModel3 = bloodSugarActivity2.getViewModel();
                        com.qcwireless.qcwatch.ui.home.bloodsugar.adapter.ManualSugarDetailAdapter manualSugarDetailAdapter2 = null;
                        if (viewModel3.getManualList().size() == 0) {
                            activityBloodSugarBinding2 = bloodSugarActivity2.binding;
                            if (activityBloodSugarBinding2 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityBloodSugarBinding2 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityBloodSugarBinding2.rcvDetailLayout);
                        } else {
                            activityBloodSugarBinding = bloodSugarActivity2.binding;
                            if (activityBloodSugarBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityBloodSugarBinding = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityBloodSugarBinding.rcvDetailLayout);
                        }
                        manualSugarDetailAdapter = bloodSugarActivity2.adapter;
                        if (manualSugarDetailAdapter == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        } else {
                            manualSugarDetailAdapter2 = manualSugarDetailAdapter;
                        }
                        manualSugarDetailAdapter2.notifyDataSetChanged();
                    }
                });
            }
        });
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onStop() {
        super.onStop();
        if (this.startMeasure) {
            this.startMeasure = false;
            this.handler.removeCallbacks(this.sugarRunnable);
            android.os.CountDownTimer countDownTimer = this.countDownTimer;
            if (countDownTimer == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
                countDownTimer = null;
            }
            countDownTimer.cancel();
            com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding = this.binding;
            if (activityBloodSugarBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodSugarBinding = null;
            }
            activityBloodSugarBinding.tvCurrHeart.setText("--");
            com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding2 = this.binding;
            if (activityBloodSugarBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodSugarBinding2 = null;
            }
            activityBloodSugarBinding2.btnMeasure.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_76660010));
            com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding3 = this.binding;
            if (activityBloodSugarBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodSugarBinding3 = null;
            }
            activityBloodSugarBinding3.tvCurrHeart.clearAnimation();
            com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding4 = this.binding;
            if (activityBloodSugarBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBloodSugarBinding4 = null;
            }
            activityBloodSugarBinding4.imageHeart.clearAnimation();
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StopHeartRateReq.stopBloodSugar((byte) 0), null);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent) {
            if (this.dateUtil.isToday()) {
                getViewModel().queryBloodSugarByDate(this.dateUtil);
                queryManualSugar(this.dateUtil);
                return;
            }
            return;
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) {
            ((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$secondsDown$1] */
    private final void secondsDown() {
        final long j = 25000;
        android.os.CountDownTimer start = new android.os.CountDownTimer(j) { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$secondsDown$1
            @Override // android.os.CountDownTimer
            public void onFinish() {
            }

            @Override // android.os.CountDownTimer
            public void onTick(long p0) {
                int i = ((int) (p0 / 500)) % 2;
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(i));
                if (i == 0) {
                    final com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity bloodSugarActivity = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$secondsDown$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$secondsDown$1$onTick$1
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$secondsDown$1) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$secondsDown$1 bloodSugarActivity$secondsDown$1) {
                            com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarActivity$secondsDown$1, "$this$ktxRunOnUi");
                            activityBloodSugarBinding = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.binding;
                            if (activityBloodSugarBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityBloodSugarBinding = null;
                            }
                            activityBloodSugarBinding.tvCurrHeart.setText("--");
                        }
                    });
                } else {
                    final com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity bloodSugarActivity2 = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$secondsDown$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$secondsDown$1$onTick$2
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$secondsDown$1) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity$secondsDown$1 bloodSugarActivity$secondsDown$1) {
                            com.qcwireless.qcwatch.databinding.ActivityBloodSugarBinding activityBloodSugarBinding;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarActivity$secondsDown$1, "$this$ktxRunOnUi");
                            activityBloodSugarBinding = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivity.this.binding;
                            if (activityBloodSugarBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityBloodSugarBinding = null;
                            }
                            activityBloodSugarBinding.tvCurrHeart.setText("-");
                        }
                    });
                }
            }
        }.start();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(start, "private fun secondsDown(…\n\n        }.start()\n    }");
        this.countDownTimer = start;
    }
}
