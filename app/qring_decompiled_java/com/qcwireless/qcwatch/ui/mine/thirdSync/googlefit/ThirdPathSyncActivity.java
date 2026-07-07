package com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit;

/* compiled from: ThirdPathSyncActivity.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0014J\b\u0010\u0011\u001a\u00020\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/thirdSync/googlefit/ThirdPathSyncActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityThirdPathSyncBinding;", "checkPermissions", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ThirdPathSyncActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding binding;

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding inflate = com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding.inflate(getLayoutInflater());
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
        com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding activityThirdPathSyncBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding activityThirdPathSyncBinding2 = null;
        if (activityThirdPathSyncBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityThirdPathSyncBinding = null;
        }
        activityThirdPathSyncBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_454));
        android.content.Context context = (android.content.Context) this;
        activityThirdPathSyncBinding.tvGoogleFit.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_455, new java.lang.Object[]{com.qcwireless.qcwatch.base.view.GlobalKt.getAppName(context), com.qcwireless.qcwatch.base.view.GlobalKt.getAppName(context)}));
        activityThirdPathSyncBinding.qcGoogleFitSync.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.ThirdPathSyncActivity$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.ThirdPathSyncActivity.m1336setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.ThirdPathSyncActivity.this, compoundButton, z);
            }
        });
        android.view.View[] viewArr = new android.view.View[2];
        com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding activityThirdPathSyncBinding3 = this.binding;
        if (activityThirdPathSyncBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityThirdPathSyncBinding3 = null;
        }
        viewArr[0] = activityThirdPathSyncBinding3.userPrivacy;
        com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding activityThirdPathSyncBinding4 = this.binding;
        if (activityThirdPathSyncBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityThirdPathSyncBinding2 = activityThirdPathSyncBinding4;
        }
        viewArr[1] = activityThirdPathSyncBinding2.btnAuthor;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.ThirdPathSyncActivity$setupViews$1$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding activityThirdPathSyncBinding5;
                com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding activityThirdPathSyncBinding6;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityThirdPathSyncBinding5 = com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.ThirdPathSyncActivity.this.binding;
                com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding activityThirdPathSyncBinding7 = null;
                if (activityThirdPathSyncBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityThirdPathSyncBinding5 = null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityThirdPathSyncBinding5.userPrivacy)) {
                    activityThirdPathSyncBinding6 = com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.ThirdPathSyncActivity.this.binding;
                    if (activityThirdPathSyncBinding6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityThirdPathSyncBinding7 = activityThirdPathSyncBinding6;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityThirdPathSyncBinding7.btnAuthor)) {
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync.INSTANCE.getGetInstance().connectGoogleFit((android.app.Activity) com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.ThirdPathSyncActivity.this)));
                        return;
                    }
                    return;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("url", com.qcwireless.qcwatch.ui.mine.privacy.LanguagePPMURLKt.getLanguagePPMUrl());
                android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.ThirdPathSyncActivity.this;
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.privacy.WebActivity.class);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-1$lambda-0, reason: not valid java name */
    public static final void m1336setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.ThirdPathSyncActivity thirdPathSyncActivity, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thirdPathSyncActivity, "this$0");
        try {
            if (z) {
                if (!com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync.INSTANCE.getGetInstance().connectGoogleFit((android.app.Activity) thirdPathSyncActivity)) {
                    thirdPathSyncActivity.checkPermissions();
                }
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGoogleFit(true);
            } else {
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGoogleFit(false);
                com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync.INSTANCE.getGetInstance().disconnectGoogleFit();
            }
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        android.content.Context context = (android.content.Context) this;
        if (androidx.core.content.ContextCompat.checkSelfPermission(context, com.hjq.permissions.Permission.ACTIVITY_RECOGNITION) != 0) {
            androidx.core.content.ContextCompat.checkSelfPermission(context, com.hjq.permissions.Permission.ACTIVITY_RECOGNITION);
        }
        checkPermissions();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkPermissions() {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync.INSTANCE.getGetInstance().hasGoogleFitPermissions()));
        com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding activityThirdPathSyncBinding = null;
        if (com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync.INSTANCE.getGetInstance().hasGoogleFitPermissions() && com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync.INSTANCE.getGetInstance().supportGoogleFit((android.app.Activity) this)) {
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getGoogleFit()) {
                com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding activityThirdPathSyncBinding2 = this.binding;
                if (activityThirdPathSyncBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityThirdPathSyncBinding = activityThirdPathSyncBinding2;
                }
                activityThirdPathSyncBinding.qcGoogleFitSync.setChecked(true);
                return;
            }
            com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding activityThirdPathSyncBinding3 = this.binding;
            if (activityThirdPathSyncBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityThirdPathSyncBinding = activityThirdPathSyncBinding3;
            }
            activityThirdPathSyncBinding.qcGoogleFitSync.setChecked(false);
            return;
        }
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGoogleFit(false);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        com.qcwireless.qcwatch.databinding.ActivityThirdPathSyncBinding activityThirdPathSyncBinding4 = this.binding;
        if (activityThirdPathSyncBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityThirdPathSyncBinding = activityThirdPathSyncBinding4;
        }
        activityThirdPathSyncBinding.qcGoogleFitSync.setChecked(false);
    }

    protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2000) {
            com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync.INSTANCE.getGetInstance().syncGoogleFit();
        }
    }
}
