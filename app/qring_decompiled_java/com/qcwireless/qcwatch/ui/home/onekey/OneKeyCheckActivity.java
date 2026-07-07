package com.qcwireless.qcwatch.ui.home.onekey;

/* compiled from: OneKeyCheckActivity.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\fJ\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u001dH\u0014J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0017J\b\u0010$\u001a\u00020\u001dH\u0014J\b\u0010%\u001a\u00020\u001dH\u0002J\b\u0010&\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/onekey/OneKeyCheckActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "animatorSet", "Landroid/animation/AnimatorSet;", "bindBinding", "Lcom/qcwireless/qcwatch/databinding/ActivityOneKeyCheckBinding;", "lastBean", "Lcom/qcwireless/qcwatch/ui/home/healthy/bean/LastOneKeyBean;", "lastData", "Lcom/oudmon/ble/base/communication/rsp/StartHeartRateRsp;", "mCountDown", "", "mHandler", "Landroid/os/Handler;", "mOxygenArray", "", "runnable", "Lcom/qcwireless/qcwatch/ui/home/onekey/OneKeyCheckActivity$CountDownRunnable;", "startOneKey", "", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/onekey/OneKeyCheckViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/onekey/OneKeyCheckViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "createFatigueValue", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "setupViews", "startAnimator", "stopAnimator", "CountDownRunnable", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class OneKeyCheckActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding bindBinding;
    private boolean startOneKey;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private final android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private int mCountDown = 30;
    private com.oudmon.ble.base.communication.rsp.StartHeartRateRsp lastData = new com.oudmon.ble.base.communication.rsp.StartHeartRateRsp();
    private android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
    private final int[] mOxygenArray = {96, 97, 98, 99};
    private com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean lastBean = new com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean();
    private final com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.CountDownRunnable runnable = new com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.CountDownRunnable();

    public OneKeyCheckActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel m1141invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding inflate = com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.bindBinding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
            inflate = null;
        }
        androidx.constraintlayout.widget.ConstraintLayout root = inflate.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "bindBinding.root");
        setContentView((android.view.View) root);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        setStatusBarBackground(com.qcwireless.qcwatch.R.color.one_key_bg);
        com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding = this.bindBinding;
        com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding2 = null;
        if (activityOneKeyCheckBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
            activityOneKeyCheckBinding = null;
        }
        activityOneKeyCheckBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_309));
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityOneKeyCheckBinding.titleBar.divider);
        try {
            java.lang.String oneKeySupport = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getOneKeySupport();
            com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport>() { // from class: com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity$setupViews$lambda-0$$inlined$fromJson$1
            }.getType());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
            com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport oneKeySupport2 = (com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport) adapter.fromJson(oneKeySupport);
            if (oneKeySupport2 != null) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, oneKeySupport2);
                if (oneKeySupport2.getSupportBloodOxygen()) {
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(activityOneKeyCheckBinding.csl2);
                }
                if (oneKeySupport2.getSupportBloodPressure()) {
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(activityOneKeyCheckBinding.csl4);
                }
                if (oneKeySupport2.getSupportFeature()) {
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(activityOneKeyCheckBinding.csl3);
                }
            }
        } catch (java.lang.Exception unused) {
        }
        getViewModel().getLastOneKeyCheck(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        android.view.View[] viewArr = new android.view.View[1];
        com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding3 = this.bindBinding;
        if (activityOneKeyCheckBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
        } else {
            activityOneKeyCheckBinding2 = activityOneKeyCheckBinding3;
        }
        viewArr[0] = activityOneKeyCheckBinding2.btnOnekey;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity$setupViews$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding4 = null;
                if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                    com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding5 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
                    if (activityOneKeyCheckBinding5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                        activityOneKeyCheckBinding5 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(activityOneKeyCheckBinding5.tvTestTime);
                    com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.mCountDown = 30;
                    com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.mHandler.removeCallbacks(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.runnable);
                    com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.mHandler.post(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.runnable);
                    com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.getViewModel().startOnKey();
                    com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.startOneKey = true;
                    com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.startAnimator();
                    com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding6 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
                    if (activityOneKeyCheckBinding6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                        activityOneKeyCheckBinding6 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(activityOneKeyCheckBinding6.imageLine);
                    com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding7 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
                    if (activityOneKeyCheckBinding7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                    } else {
                        activityOneKeyCheckBinding4 = activityOneKeyCheckBinding7;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone(activityOneKeyCheckBinding4.btnOnekey);
                    return;
                }
                java.lang.String string = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding8 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
                if (activityOneKeyCheckBinding8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                } else {
                    activityOneKeyCheckBinding4 = activityOneKeyCheckBinding8;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityOneKeyCheckBinding4.btnOnekey);
                com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.startOneKey = false;
            }
        });
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.m1139setupViews$lambda1(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this, (com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyUI) obj);
            }
        });
        getViewModel().getLastBean().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.m1140setupViews$lambda3(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this, (com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m1139setupViews$lambda1(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity oneKeyCheckActivity, com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyUI oneKeyUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneKeyCheckActivity, "this$0");
        if (oneKeyUI.getError() > 0) {
            java.lang.String string = oneKeyCheckActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_312);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_312)");
            com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding = null;
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            oneKeyCheckActivity.mHandler.removeCallbacks(oneKeyCheckActivity.runnable);
            com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding2 = oneKeyCheckActivity.bindBinding;
            if (activityOneKeyCheckBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                activityOneKeyCheckBinding2 = null;
            }
            activityOneKeyCheckBinding2.tvTestTime.setText("");
            com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding3 = oneKeyCheckActivity.bindBinding;
            if (activityOneKeyCheckBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                activityOneKeyCheckBinding3 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.invisible(activityOneKeyCheckBinding3.tvTestTime);
            oneKeyCheckActivity.stopAnimator();
            oneKeyCheckActivity.mCountDown = 30;
            com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding4 = oneKeyCheckActivity.bindBinding;
            if (activityOneKeyCheckBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                activityOneKeyCheckBinding4 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityOneKeyCheckBinding4.imageLine);
            com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding5 = oneKeyCheckActivity.bindBinding;
            if (activityOneKeyCheckBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
            } else {
                activityOneKeyCheckBinding = activityOneKeyCheckBinding5;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityOneKeyCheckBinding.btnOnekey);
            oneKeyCheckActivity.startOneKey = false;
            return;
        }
        oneKeyCheckActivity.lastData = oneKeyUI.getResp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3, reason: not valid java name */
    public static final void m1140setupViews$lambda3(final com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity oneKeyCheckActivity, final com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean oneKeyLastBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneKeyCheckActivity, "this$0");
        oneKeyCheckActivity.lastBean = oneKeyLastBean.getLast();
        com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding = oneKeyCheckActivity.bindBinding;
        if (activityOneKeyCheckBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
            activityOneKeyCheckBinding = null;
        }
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(activityOneKeyCheckBinding, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity$setupViews$4$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityOneKeyCheckBinding2, "$this$ktxRunOnUi");
                if (com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean.this.getLast().getHr() > 0) {
                    activityOneKeyCheckBinding2.tvHrValue.setText(java.lang.String.valueOf(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean.this.getLast().getHr()));
                    android.widget.TextView textView = activityOneKeyCheckBinding2.tvBpValue;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(java.lang.Math.abs(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean.this.getLast().getSbp()));
                    sb.append('/');
                    sb.append(java.lang.Math.abs(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean.this.getLast().getDbp()));
                    textView.setText(sb.toString());
                    activityOneKeyCheckBinding2.tvBoValue.setText(java.lang.String.valueOf(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean.this.getLast().getBo()));
                    if (com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean.this.getLast().getFatigue() >= 80) {
                        activityOneKeyCheckBinding2.tvFatigueValue.setText(oneKeyCheckActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_314));
                    } else {
                        activityOneKeyCheckBinding2.tvFatigueValue.setText(oneKeyCheckActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_315));
                    }
                    com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding3 = oneKeyCheckActivity.bindBinding;
                    if (activityOneKeyCheckBinding3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                        activityOneKeyCheckBinding3 = null;
                    }
                    android.widget.TextView textView2 = activityOneKeyCheckBinding3.tvTestTime;
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    java.lang.String string = oneKeyCheckActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_335);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_335)");
                    java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean.this.getLast().getScore())}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                    textView2.setText(format);
                    return;
                }
                activityOneKeyCheckBinding2.tvHrValue.setText("--");
                activityOneKeyCheckBinding2.tvBpValue.setText("--");
                activityOneKeyCheckBinding2.tvBoValue.setText("--");
                activityOneKeyCheckBinding2.tvFatigueValue.setText("--");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OneKeyCheckActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/onekey/OneKeyCheckActivity$CountDownRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/home/onekey/OneKeyCheckActivity;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    final class CountDownRunnable implements java.lang.Runnable {
        public CountDownRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding = null;
            if (com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.mCountDown <= 0) {
                com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding2 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
                if (activityOneKeyCheckBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                } else {
                    activityOneKeyCheckBinding = activityOneKeyCheckBinding2;
                }
                final com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity oneKeyCheckActivity = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(activityOneKeyCheckBinding, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity$CountDownRunnable$run$1$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding3) {
                        com.oudmon.ble.base.communication.rsp.StartHeartRateRsp startHeartRateRsp;
                        int[] iArr;
                        com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean lastOneKeyBean;
                        com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean lastOneKeyBean2;
                        com.oudmon.ble.base.communication.rsp.StartHeartRateRsp startHeartRateRsp2;
                        com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean lastOneKeyBean3;
                        com.oudmon.ble.base.communication.rsp.StartHeartRateRsp startHeartRateRsp3;
                        com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean lastOneKeyBean4;
                        com.oudmon.ble.base.communication.rsp.StartHeartRateRsp startHeartRateRsp4;
                        com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean lastOneKeyBean5;
                        com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean lastOneKeyBean6;
                        com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean lastOneKeyBean7;
                        com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean lastOneKeyBean8;
                        com.oudmon.ble.base.communication.rsp.StartHeartRateRsp startHeartRateRsp5;
                        com.oudmon.ble.base.communication.rsp.StartHeartRateRsp startHeartRateRsp6;
                        com.oudmon.ble.base.communication.rsp.StartHeartRateRsp startHeartRateRsp7;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityOneKeyCheckBinding3, "$this$ktxRunOnUi");
                        com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding4 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
                        com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding5 = null;
                        if (activityOneKeyCheckBinding4 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                            activityOneKeyCheckBinding4 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityOneKeyCheckBinding4.btnOnekey);
                        com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.mHandler.removeCallbacks(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.runnable);
                        com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding6 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
                        if (activityOneKeyCheckBinding6 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                            activityOneKeyCheckBinding6 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.invisible(activityOneKeyCheckBinding6.tvTestTime);
                        com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.stopAnimator();
                        com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.mCountDown = 30;
                        com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding7 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
                        if (activityOneKeyCheckBinding7 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                            activityOneKeyCheckBinding7 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityOneKeyCheckBinding7.imageLine);
                        com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.getViewModel().stopOnKey();
                        startHeartRateRsp = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.lastData;
                        if (startHeartRateRsp.getValue() > 0) {
                            com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding8 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
                            if (activityOneKeyCheckBinding8 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                                activityOneKeyCheckBinding8 = null;
                            }
                            activityOneKeyCheckBinding8.tvTestTime.setText("");
                            com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding9 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
                            if (activityOneKeyCheckBinding9 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                                activityOneKeyCheckBinding9 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityOneKeyCheckBinding9.imageLine);
                            iArr = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.mOxygenArray;
                            int i = iArr[new java.util.Random().nextInt(4)];
                            int createFatigueValue = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.createFatigueValue();
                            if (createFatigueValue >= 80) {
                                activityOneKeyCheckBinding3.tvFatigueValue.setText(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_314));
                            } else {
                                activityOneKeyCheckBinding3.tvFatigueValue.setText(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_315));
                            }
                            activityOneKeyCheckBinding3.tvBoValue.setText(java.lang.String.valueOf(i));
                            lastOneKeyBean = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.lastBean;
                            lastOneKeyBean.setLastTime(new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                            lastOneKeyBean2 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.lastBean;
                            startHeartRateRsp2 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.lastData;
                            lastOneKeyBean2.setHr(startHeartRateRsp2.getValue());
                            lastOneKeyBean3 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.lastBean;
                            startHeartRateRsp3 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.lastData;
                            lastOneKeyBean3.setSbp(java.lang.Math.abs(startHeartRateRsp3.getSbp()));
                            lastOneKeyBean4 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.lastBean;
                            startHeartRateRsp4 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.lastData;
                            lastOneKeyBean4.setDbp(java.lang.Math.abs(startHeartRateRsp4.getDbp()));
                            lastOneKeyBean5 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.lastBean;
                            lastOneKeyBean5.setBo(i);
                            lastOneKeyBean6 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.lastBean;
                            lastOneKeyBean6.setFatigue(createFatigueValue);
                            int nextInt = new java.util.Random().nextInt(4) + 96;
                            lastOneKeyBean7 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.lastBean;
                            lastOneKeyBean7.setScore(nextInt);
                            com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel viewModel = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.getViewModel();
                            lastOneKeyBean8 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.lastBean;
                            viewModel.saveLastOneKeyCheck(lastOneKeyBean8);
                            com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding10 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
                            if (activityOneKeyCheckBinding10 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                                activityOneKeyCheckBinding10 = null;
                            }
                            android.widget.TextView textView = activityOneKeyCheckBinding10.tvTestTime;
                            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                            java.lang.String string = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_335);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_335)");
                            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(nextInt)}, 1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                            textView.setText(format);
                            com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding11 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
                            if (activityOneKeyCheckBinding11 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                                activityOneKeyCheckBinding11 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityOneKeyCheckBinding11.tvTestTime);
                            com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding12 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
                            if (activityOneKeyCheckBinding12 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                            } else {
                                activityOneKeyCheckBinding5 = activityOneKeyCheckBinding12;
                            }
                            android.widget.TextView textView2 = activityOneKeyCheckBinding5.tvTestTime;
                            kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                            java.lang.String string2 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_335);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_335)");
                            java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(nextInt)}, 1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
                            textView2.setText(format2);
                            android.widget.TextView textView3 = activityOneKeyCheckBinding3.tvHrValue;
                            startHeartRateRsp5 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.lastData;
                            textView3.setText(java.lang.String.valueOf((int) startHeartRateRsp5.getValue()));
                            android.widget.TextView textView4 = activityOneKeyCheckBinding3.tvBpValue;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            startHeartRateRsp6 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.lastData;
                            sb.append(startHeartRateRsp6.getSbp());
                            sb.append('/');
                            startHeartRateRsp7 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.lastData;
                            sb.append(startHeartRateRsp7.getDbp());
                            textView4.setText(sb.toString());
                            return;
                        }
                        activityOneKeyCheckBinding3.tvHrValue.setText("--");
                        activityOneKeyCheckBinding3.tvBpValue.setText("--");
                        activityOneKeyCheckBinding3.tvBoValue.setText("--");
                        activityOneKeyCheckBinding3.tvFatigueValue.setText("--");
                    }
                });
                return;
            }
            if (com.oudmon.ble.base.util.AppUtil.isBackground(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()) || com.oudmon.ble.base.util.AppUtil.isApplicationBroughtToBackground(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT())) {
                com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding3 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
                if (activityOneKeyCheckBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                    activityOneKeyCheckBinding3 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityOneKeyCheckBinding3.btnOnekey);
                java.lang.String string = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_312);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_312)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.mHandler.removeCallbacks(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.runnable);
                com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding4 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
                if (activityOneKeyCheckBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                    activityOneKeyCheckBinding4 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.invisible(activityOneKeyCheckBinding4.tvTestTime);
                com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.stopAnimator();
                com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.mCountDown = 30;
                com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding5 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
                if (activityOneKeyCheckBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                } else {
                    activityOneKeyCheckBinding = activityOneKeyCheckBinding5;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityOneKeyCheckBinding.imageLine);
                com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.getViewModel().stopOnKey();
                return;
            }
            com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.mHandler.postDelayed(this, 1000L);
            com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding6 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.bindBinding;
            if (activityOneKeyCheckBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
            } else {
                activityOneKeyCheckBinding = activityOneKeyCheckBinding6;
            }
            android.widget.TextView textView = activityOneKeyCheckBinding.tvTestTime;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string2 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_311);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_311)");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.mCountDown);
            sb.append('s');
            java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{sb.toString()}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            textView.setText(format);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this.mCountDown));
            com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity oneKeyCheckActivity2 = com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckActivity.this;
            oneKeyCheckActivity2.mCountDown--;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void startAnimator() {
        try {
            stopAnimator();
            com.qcwireless.qcwatch.databinding.ActivityOneKeyCheckBinding activityOneKeyCheckBinding = this.bindBinding;
            if (activityOneKeyCheckBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bindBinding");
                activityOneKeyCheckBinding = null;
            }
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(activityOneKeyCheckBinding.imageLine, "translationY", 0.0f, com.qcwireless.qcwatch.base.view.GlobalKt.dp2px((android.content.Context) this, 140.0f), 0.0f);
            ofFloat.setRepeatCount(10);
            this.animatorSet.playTogether(ofFloat, ofFloat);
            this.animatorSet.setDuration(com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.LOCATION_UPDATE_INTERVAL);
            this.animatorSet.start();
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopAnimator() {
        this.animatorSet.end();
    }

    public final int createFatigueValue() {
        int nextInt;
        int i;
        int nextInt2;
        int i2 = java.util.Calendar.getInstance().get(11);
        int fatigue = this.lastBean.getFatigue();
        if (new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp() - this.lastBean.getLastTime() > 1800) {
            if (5 <= i2 && i2 < 11) {
                nextInt2 = new java.util.Random().nextInt(20);
            } else {
                if (i2 >= 22 || i2 < 5) {
                    nextInt = new java.util.Random().nextInt(20);
                } else {
                    if (12 <= i2 && i2 < 14) {
                        if (new java.util.Random().nextInt(10) < 7) {
                            nextInt = new java.util.Random().nextInt(20);
                        } else {
                            nextInt2 = new java.util.Random().nextInt(20);
                        }
                    } else if (new java.util.Random().nextBoolean()) {
                        nextInt = new java.util.Random().nextInt(20);
                    } else {
                        nextInt2 = new java.util.Random().nextInt(20);
                    }
                    fatigue = i;
                    this.lastBean.setLastTime(java.lang.System.currentTimeMillis());
                    this.lastBean.setFatigue(fatigue);
                }
                i = nextInt + 40;
                fatigue = i;
                this.lastBean.setLastTime(java.lang.System.currentTimeMillis());
                this.lastBean.setFatigue(fatigue);
            }
            i = nextInt2 + 80;
            fatigue = i;
            this.lastBean.setLastTime(java.lang.System.currentTimeMillis());
            this.lastBean.setFatigue(fatigue);
        }
        return fatigue;
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if (!(messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) || ((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect()) {
            return;
        }
        this.startOneKey = false;
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        finish();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        this.mHandler.removeCallbacks(this.runnable);
        if (this.startOneKey) {
            getViewModel().stopOnKey();
        }
    }
}
