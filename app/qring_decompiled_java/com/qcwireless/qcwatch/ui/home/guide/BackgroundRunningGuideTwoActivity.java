package com.qcwireless.qcwatch.ui.home.guide;

/* compiled from: BackgroundRunningGuideTwoActivity.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\"\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\fH\u0014J\b\u0010\u0018\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\fH\u0014J\b\u0010\u001a\u001a\u00020\fH\u0002J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/guide/BackgroundRunningGuideTwoActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityBackgroundRunningGuideTwoBinding;", "handler", "Landroid/os/Handler;", "myRunnable", "Lcom/qcwireless/qcwatch/ui/home/guide/BackgroundRunningGuideTwoActivity$MyRunnable;", "checkPermission", "", "doRefresh", "", "isNotificationListenerEnabled", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "openBatteryWhiteList", "setupViews", "showNotificationDialog", "showSelectDialog", "type", "MyRunnable", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BackgroundRunningGuideTwoActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding binding;
    private final android.os.Handler handler;
    private final com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity.MyRunnable myRunnable = new com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity.MyRunnable();

    public BackgroundRunningGuideTwoActivity() {
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding inflate = com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding.inflate(getLayoutInflater());
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
        final com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding activityBackgroundRunningGuideTwoBinding = this.binding;
        if (activityBackgroundRunningGuideTwoBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBackgroundRunningGuideTwoBinding = null;
        }
        activityBackgroundRunningGuideTwoBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_247));
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(new android.view.View[]{activityBackgroundRunningGuideTwoBinding.tvStatusText1, activityBackgroundRunningGuideTwoBinding.tvStatusText2, activityBackgroundRunningGuideTwoBinding.tvStatusText3, activityBackgroundRunningGuideTwoBinding.tvStatusText4, activityBackgroundRunningGuideTwoBinding.tvStatusText5, activityBackgroundRunningGuideTwoBinding.image1Right, activityBackgroundRunningGuideTwoBinding.imageBatteryRight, activityBackgroundRunningGuideTwoBinding.image2Right, activityBackgroundRunningGuideTwoBinding.image3Right, activityBackgroundRunningGuideTwoBinding.image4Right}, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity$setupViews$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding.this.image1Right) ? true : kotlin.jvm.internal.Intrinsics.areEqual(view, com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding.this.tvStatusText1)) {
                    this.showNotificationDialog();
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding.this.tvStatusText2)) {
                    this.showSelectDialog(2);
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding.this.tvStatusText3)) {
                    this.showSelectDialog(3);
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding.this.tvStatusText4)) {
                    this.showSelectDialog(4);
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding.this.tvStatusText5) ? true : kotlin.jvm.internal.Intrinsics.areEqual(view, com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding.this.imageBatteryRight)) {
                    if (this.checkPermission()) {
                        return;
                    }
                    this.openBatteryWhiteList();
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding.this.image2Right) ? true : kotlin.jvm.internal.Intrinsics.areEqual(view, com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding.this.image3Right) ? true : kotlin.jvm.internal.Intrinsics.areEqual(view, com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding.this.image4Right)) {
                    android.app.Activity activity = (android.app.Activity) this;
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.guide.GuideActivity.class);
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
            }
        });
        doRefresh();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding activityBackgroundRunningGuideTwoBinding = null;
        if (isNotificationListenerEnabled()) {
            com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding activityBackgroundRunningGuideTwoBinding2 = this.binding;
            if (activityBackgroundRunningGuideTwoBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBackgroundRunningGuideTwoBinding2 = null;
            }
            activityBackgroundRunningGuideTwoBinding2.tvStatusText1.setText(com.qcwireless.qcwatch.R.string.qc_text_411);
            com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding activityBackgroundRunningGuideTwoBinding3 = this.binding;
            if (activityBackgroundRunningGuideTwoBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBackgroundRunningGuideTwoBinding3 = null;
            }
            activityBackgroundRunningGuideTwoBinding3.tvStatusText1.setBackgroundResource(com.qcwireless.qcwatch.R.drawable.bg_corners_bg_text_1);
        } else {
            com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding activityBackgroundRunningGuideTwoBinding4 = this.binding;
            if (activityBackgroundRunningGuideTwoBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBackgroundRunningGuideTwoBinding4 = null;
            }
            activityBackgroundRunningGuideTwoBinding4.tvStatusText1.setText(com.qcwireless.qcwatch.R.string.qc_text_410);
            com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding activityBackgroundRunningGuideTwoBinding5 = this.binding;
            if (activityBackgroundRunningGuideTwoBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBackgroundRunningGuideTwoBinding5 = null;
            }
            activityBackgroundRunningGuideTwoBinding5.tvStatusText1.setBackgroundResource(com.qcwireless.qcwatch.R.drawable.bg_corners_bg_text_2);
        }
        if (!checkPermission()) {
            com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding activityBackgroundRunningGuideTwoBinding6 = this.binding;
            if (activityBackgroundRunningGuideTwoBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBackgroundRunningGuideTwoBinding6 = null;
            }
            activityBackgroundRunningGuideTwoBinding6.tvStatusText5.setText(com.qcwireless.qcwatch.R.string.qc_text_410);
            com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding activityBackgroundRunningGuideTwoBinding7 = this.binding;
            if (activityBackgroundRunningGuideTwoBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityBackgroundRunningGuideTwoBinding = activityBackgroundRunningGuideTwoBinding7;
            }
            activityBackgroundRunningGuideTwoBinding.tvStatusText5.setBackgroundResource(com.qcwireless.qcwatch.R.drawable.bg_corners_bg_text_2);
        } else {
            com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding activityBackgroundRunningGuideTwoBinding8 = this.binding;
            if (activityBackgroundRunningGuideTwoBinding8 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBackgroundRunningGuideTwoBinding8 = null;
            }
            activityBackgroundRunningGuideTwoBinding8.tvStatusText5.setText(com.qcwireless.qcwatch.R.string.qc_text_411);
            com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding activityBackgroundRunningGuideTwoBinding9 = this.binding;
            if (activityBackgroundRunningGuideTwoBinding9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityBackgroundRunningGuideTwoBinding = activityBackgroundRunningGuideTwoBinding9;
            }
            activityBackgroundRunningGuideTwoBinding.tvStatusText5.setBackgroundResource(com.qcwireless.qcwatch.R.drawable.bg_corners_bg_text_1);
        }
        this.handler.removeCallbacks(this.myRunnable);
        this.handler.postDelayed(this.myRunnable, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.LOCATION_UPDATE_INTERVAL);
    }

    /* compiled from: BackgroundRunningGuideTwoActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/guide/BackgroundRunningGuideTwoActivity$MyRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/home/guide/BackgroundRunningGuideTwoActivity;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyRunnable implements java.lang.Runnable {
        public MyRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding activityBackgroundRunningGuideTwoBinding = null;
            if (!com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity.this.checkPermission()) {
                com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding activityBackgroundRunningGuideTwoBinding2 = com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity.this.binding;
                if (activityBackgroundRunningGuideTwoBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityBackgroundRunningGuideTwoBinding2 = null;
                }
                activityBackgroundRunningGuideTwoBinding2.tvStatusText5.setText(com.qcwireless.qcwatch.R.string.qc_text_410);
                com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding activityBackgroundRunningGuideTwoBinding3 = com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity.this.binding;
                if (activityBackgroundRunningGuideTwoBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityBackgroundRunningGuideTwoBinding = activityBackgroundRunningGuideTwoBinding3;
                }
                activityBackgroundRunningGuideTwoBinding.tvStatusText5.setBackgroundResource(com.qcwireless.qcwatch.R.drawable.bg_corners_bg_text_2);
                return;
            }
            com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding activityBackgroundRunningGuideTwoBinding4 = com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity.this.binding;
            if (activityBackgroundRunningGuideTwoBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityBackgroundRunningGuideTwoBinding4 = null;
            }
            activityBackgroundRunningGuideTwoBinding4.tvStatusText5.setText(com.qcwireless.qcwatch.R.string.qc_text_411);
            com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding activityBackgroundRunningGuideTwoBinding5 = com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity.this.binding;
            if (activityBackgroundRunningGuideTwoBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityBackgroundRunningGuideTwoBinding = activityBackgroundRunningGuideTwoBinding5;
            }
            activityBackgroundRunningGuideTwoBinding.tvStatusText5.setBackgroundResource(com.qcwireless.qcwatch.R.drawable.bg_corners_bg_text_1);
        }
    }

    private final void doRefresh() {
        com.qcwireless.qcwatch.databinding.ActivityBackgroundRunningGuideTwoBinding activityBackgroundRunningGuideTwoBinding = this.binding;
        if (activityBackgroundRunningGuideTwoBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityBackgroundRunningGuideTwoBinding = null;
        }
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getWarmingAutoStart()) {
            activityBackgroundRunningGuideTwoBinding.tvStatusText2.setText(com.qcwireless.qcwatch.R.string.qc_text_411);
            activityBackgroundRunningGuideTwoBinding.tvStatusText2.setBackgroundResource(com.qcwireless.qcwatch.R.drawable.bg_corners_bg_text_1);
        } else {
            activityBackgroundRunningGuideTwoBinding.tvStatusText2.setText(com.qcwireless.qcwatch.R.string.qc_text_410);
            activityBackgroundRunningGuideTwoBinding.tvStatusText2.setBackgroundResource(com.qcwireless.qcwatch.R.drawable.bg_corners_bg_text_2);
        }
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getWarmingLock()) {
            activityBackgroundRunningGuideTwoBinding.tvStatusText3.setText(com.qcwireless.qcwatch.R.string.qc_text_411);
            activityBackgroundRunningGuideTwoBinding.tvStatusText3.setBackgroundResource(com.qcwireless.qcwatch.R.drawable.bg_corners_bg_text_1);
        } else {
            activityBackgroundRunningGuideTwoBinding.tvStatusText3.setText(com.qcwireless.qcwatch.R.string.qc_text_410);
            activityBackgroundRunningGuideTwoBinding.tvStatusText3.setBackgroundResource(com.qcwireless.qcwatch.R.drawable.bg_corners_bg_text_2);
        }
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getWarmingBatteryAllow()) {
            activityBackgroundRunningGuideTwoBinding.tvStatusText4.setText(com.qcwireless.qcwatch.R.string.qc_text_411);
            activityBackgroundRunningGuideTwoBinding.tvStatusText4.setBackgroundResource(com.qcwireless.qcwatch.R.drawable.bg_corners_bg_text_1);
        } else {
            activityBackgroundRunningGuideTwoBinding.tvStatusText4.setText(com.qcwireless.qcwatch.R.string.qc_text_410);
            activityBackgroundRunningGuideTwoBinding.tvStatusText4.setBackgroundResource(com.qcwireless.qcwatch.R.drawable.bg_corners_bg_text_2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSelectDialog(final int type) {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_guide);
        objectRef.element = builder.create();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).show();
        android.view.View contentView = ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_take_photo);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_take_picture);
        ((android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_cancel)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity.m1025showSelectDialog$lambda2(objectRef, view);
            }
        });
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity.m1026showSelectDialog$lambda3(objectRef, type, this, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity.m1027showSelectDialog$lambda4(type, objectRef, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showSelectDialog$lambda-2, reason: not valid java name */
    public static final void m1025showSelectDialog$lambda2(kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showSelectDialog$lambda-3, reason: not valid java name */
    public static final void m1026showSelectDialog$lambda3(kotlin.jvm.internal.Ref.ObjectRef objectRef, int i, com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity backgroundRunningGuideTwoActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundRunningGuideTwoActivity, "this$0");
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
        if (i == 2) {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setWarmingAutoStart(false);
        } else if (i == 3) {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setWarmingLock(false);
        } else if (i == 4) {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setWarmingBatteryAllow(false);
        }
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        backgroundRunningGuideTwoActivity.doRefresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showSelectDialog$lambda-4, reason: not valid java name */
    public static final void m1027showSelectDialog$lambda4(int i, kotlin.jvm.internal.Ref.ObjectRef objectRef, com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity backgroundRunningGuideTwoActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundRunningGuideTwoActivity, "this$0");
        if (i == 2) {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setWarmingAutoStart(true);
        } else if (i == 3) {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setWarmingLock(true);
        } else if (i == 4) {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setWarmingBatteryAllow(true);
        }
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
        backgroundRunningGuideTwoActivity.doRefresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotificationDialog() {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.qcwireless.qcwatch.base.dialog.CenterDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.CenterDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_notification);
        objectRef.element = builder.create();
        ((com.qcwireless.qcwatch.base.dialog.CenterDialog) objectRef.element).show();
        android.view.View contentView = ((com.qcwireless.qcwatch.base.dialog.CenterDialog) objectRef.element).getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        ((android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_confirm)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity.m1024showNotificationDialog$lambda5(objectRef, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showNotificationDialog$lambda-5, reason: not valid java name */
    public static final void m1024showNotificationDialog$lambda5(kotlin.jvm.internal.Ref.ObjectRef objectRef, com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideTwoActivity backgroundRunningGuideTwoActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundRunningGuideTwoActivity, "this$0");
        ((com.qcwireless.qcwatch.base.dialog.CenterDialog) objectRef.element).dismiss();
        try {
            backgroundRunningGuideTwoActivity.startActivityForResult(new android.content.Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"), 100);
        } catch (android.content.ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    private final boolean isNotificationListenerEnabled() {
        java.lang.String packageName = com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getPackageName();
        java.lang.String string = android.provider.Settings.Secure.getString(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getContentResolver(), "enabled_notification_listeners");
        java.lang.String str = string;
        if (!android.text.TextUtils.isEmpty(str)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "flat");
            java.lang.Object[] array = new kotlin.text.Regex(":").split(str, 0).toArray(new java.lang.String[0]);
            java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            for (java.lang.String str2 : (java.lang.String[]) array) {
                android.content.ComponentName unflattenFromString = android.content.ComponentName.unflattenFromString(str2);
                if (unflattenFromString != null && android.text.TextUtils.equals(packageName, unflattenFromString.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openBatteryWhiteList() {
        try {
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                android.content.Intent intent = new android.content.Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                intent.setData(android.net.Uri.parse("package:" + getPackageName()));
                startActivityForResult(intent, com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.Type_Sync_TimeOut);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        this.handler.removeCallbacks(this.myRunnable);
        this.handler.postDelayed(this.myRunnable, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkPermission() {
        if (android.os.Build.VERSION.SDK_INT < 23) {
            return false;
        }
        java.lang.Object systemService = getSystemService("power");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((android.os.PowerManager) systemService).isIgnoringBatteryOptimizations(getPackageName());
    }
}
