package com.qcwireless.qcwatch.ui.home.sport;

/* compiled from: SportPrepareActivity.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/SportPrepareActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "animation1", "Landroid/view/animation/TranslateAnimation;", "animation2", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivitySportPrepareBinding;", "gpsResponse", "Lcom/oudmon/ble/base/communication/ICommandResponse;", "Lcom/oudmon/ble/base/communication/rsp/AppSportRsp;", "number", "", "sportType", "startGps", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "startAnim1", "startAnim2", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SportPrepareActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private android.view.animation.TranslateAnimation animation1;
    private android.view.animation.TranslateAnimation animation2;
    private com.qcwireless.qcwatch.databinding.ActivitySportPrepareBinding binding;
    private int sportType;
    private int number = 3;
    private boolean startGps = true;
    private com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.AppSportRsp> gpsResponse = new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity$$ExternalSyntheticLambda0
        @Override // com.oudmon.ble.base.communication.ICommandResponse
        public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
            com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity.m1193gpsResponse$lambda0(com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity.this, (com.oudmon.ble.base.communication.rsp.AppSportRsp) baseRspCmd);
        }
    };

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivitySportPrepareBinding inflate = com.qcwireless.qcwatch.databinding.ActivitySportPrepareBinding.inflate(getLayoutInflater());
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
        android.os.Bundle extras = getIntent().getExtras();
        java.lang.Integer valueOf = extras != null ? java.lang.Integer.valueOf(extras.getInt("sportType")) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
        this.sportType = valueOf.intValue();
        startAnim1();
    }

    private final void startAnim1() {
        if (this.animation1 == null) {
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, -400.0f, 0.0f);
            this.animation1 = translateAnimation;
            kotlin.jvm.internal.Intrinsics.checkNotNull(translateAnimation);
            translateAnimation.setInterpolator(new android.view.animation.AnticipateOvershootInterpolator(4.0f));
            android.view.animation.TranslateAnimation translateAnimation2 = this.animation1;
            kotlin.jvm.internal.Intrinsics.checkNotNull(translateAnimation2);
            translateAnimation2.setDuration(800L);
            android.view.animation.TranslateAnimation translateAnimation3 = this.animation1;
            kotlin.jvm.internal.Intrinsics.checkNotNull(translateAnimation3);
            translateAnimation3.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity$startAnim1$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(android.view.animation.Animation animation) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(android.view.animation.Animation animation) {
                    com.qcwireless.qcwatch.databinding.ActivitySportPrepareBinding activitySportPrepareBinding;
                    int i;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
                    activitySportPrepareBinding = com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity.this.binding;
                    if (activitySportPrepareBinding == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activitySportPrepareBinding = null;
                    }
                    android.widget.TextView textView = activitySportPrepareBinding.tvNumber1;
                    i = com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity.this.number;
                    textView.setText(java.lang.String.valueOf(i));
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(android.view.animation.Animation animation) {
                    int i;
                    int i2;
                    boolean z;
                    int i3;
                    com.qcwireless.qcwatch.databinding.ActivitySportPrepareBinding activitySportPrepareBinding;
                    android.view.animation.TranslateAnimation translateAnimation4;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
                    android.os.SystemClock.sleep(100L);
                    com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity sportPrepareActivity = com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity.this;
                    i = sportPrepareActivity.number;
                    sportPrepareActivity.number = i - 1;
                    i2 = com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity.this.number;
                    if (i2 >= 1) {
                        activitySportPrepareBinding = com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity.this.binding;
                        if (activitySportPrepareBinding == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activitySportPrepareBinding = null;
                        }
                        android.widget.TextView textView = activitySportPrepareBinding.tvNumber1;
                        translateAnimation4 = com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity.this.animation1;
                        textView.startAnimation(translateAnimation4);
                        com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity.this.startAnim2();
                        return;
                    }
                    z = com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity.this.startGps;
                    if (z) {
                        com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity.this.finish();
                        android.os.Bundle bundle = new android.os.Bundle();
                        i3 = com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity.this.sportType;
                        bundle.putInt("sportType", i3);
                        android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity.this;
                        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.class);
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
                }
            });
        }
        com.qcwireless.qcwatch.databinding.ActivitySportPrepareBinding activitySportPrepareBinding = this.binding;
        if (activitySportPrepareBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportPrepareBinding = null;
        }
        activitySportPrepareBinding.tvNumber1.startAnimation(this.animation1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAnim2() {
        com.qcwireless.qcwatch.databinding.ActivitySportPrepareBinding activitySportPrepareBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivitySportPrepareBinding activitySportPrepareBinding2 = null;
        if (activitySportPrepareBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportPrepareBinding = null;
        }
        activitySportPrepareBinding.tvNumber2.setText(java.lang.String.valueOf(this.number + 1));
        if (this.animation2 == null) {
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, 300.0f);
            this.animation2 = translateAnimation;
            kotlin.jvm.internal.Intrinsics.checkNotNull(translateAnimation);
            translateAnimation.setDuration(300L);
            android.view.animation.TranslateAnimation translateAnimation2 = this.animation2;
            kotlin.jvm.internal.Intrinsics.checkNotNull(translateAnimation2);
            translateAnimation2.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity$startAnim2$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(android.view.animation.Animation animation) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(android.view.animation.Animation animation) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(android.view.animation.Animation animation) {
                    com.qcwireless.qcwatch.databinding.ActivitySportPrepareBinding activitySportPrepareBinding3;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
                    activitySportPrepareBinding3 = com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity.this.binding;
                    if (activitySportPrepareBinding3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activitySportPrepareBinding3 = null;
                    }
                    activitySportPrepareBinding3.tvNumber2.setText("");
                }
            });
        }
        com.qcwireless.qcwatch.databinding.ActivitySportPrepareBinding activitySportPrepareBinding3 = this.binding;
        if (activitySportPrepareBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activitySportPrepareBinding2 = activitySportPrepareBinding3;
        }
        activitySportPrepareBinding2.tvNumber2.startAnimation(this.animation2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gpsResponse$lambda-0, reason: not valid java name */
    public static final void m1193gpsResponse$lambda0(com.qcwireless.qcwatch.ui.home.sport.SportPrepareActivity sportPrepareActivity, com.oudmon.ble.base.communication.rsp.AppSportRsp appSportRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportPrepareActivity, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, appSportRsp);
        if (appSportRsp != null) {
            try {
                if (appSportRsp.getGpsStatus() == 4) {
                    sportPrepareActivity.startGps = false;
                    sportPrepareActivity.finish();
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
