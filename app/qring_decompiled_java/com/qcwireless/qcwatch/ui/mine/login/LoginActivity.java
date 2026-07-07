package com.qcwireless.qcwatch.ui.mine.login;

/* compiled from: LoginActivity.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/login/LoginActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityLoginBinding;", com.google.android.gms.common.Scopes.EMAIL, "", "emptyInputFilter", "Landroid/text/InputFilter;", "getEmptyInputFilter", "()Landroid/text/InputFilter;", "setEmptyInputFilter", "(Landroid/text/InputFilter;)V", "inputFilter", "loginViewModel", "Lcom/qcwireless/qcwatch/ui/mine/login/LoginViewModel;", "getLoginViewModel", "()Lcom/qcwireless/qcwatch/ui/mine/login/LoginViewModel;", "loginViewModel$delegate", "Lkotlin/Lazy;", "password", "isValidEmail", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class LoginActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityLoginBinding binding;
    private java.lang.String email;
    private android.text.InputFilter emptyInputFilter = new android.text.InputFilter() { // from class: com.qcwireless.qcwatch.ui.mine.login.LoginActivity$$ExternalSyntheticLambda0
        @Override // android.text.InputFilter
        public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
            java.lang.CharSequence m1308emptyInputFilter$lambda6;
            m1308emptyInputFilter$lambda6 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.m1308emptyInputFilter$lambda6(com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this, charSequence, i, i2, spanned, i3, i4);
            return m1308emptyInputFilter$lambda6;
        }
    };
    private android.text.InputFilter inputFilter = new android.text.InputFilter() { // from class: com.qcwireless.qcwatch.ui.mine.login.LoginActivity$inputFilter$1
        private java.util.regex.Pattern emoji = java.util.regex.Pattern.compile("[^\\u0000-\\uFFFF]", 66);

        public final java.util.regex.Pattern getEmoji() {
            return this.emoji;
        }

        public final void setEmoji(java.util.regex.Pattern pattern) {
            this.emoji = pattern;
        }

        @Override // android.text.InputFilter
        public java.lang.CharSequence filter(java.lang.CharSequence source, int start, int end, android.text.Spanned dest, int dstart, int dend) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            return this.emoji.matcher(source).find() ? "" : source;
        }
    };

    /* renamed from: loginViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy loginViewModel;
    private java.lang.String password;

    public LoginActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.loginViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.mine.login.LoginViewModel>() { // from class: com.qcwireless.qcwatch.ui.mine.login.LoginActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.mine.login.LoginViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.mine.login.LoginViewModel m1311invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.login.LoginViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.mine.login.LoginViewModel getLoginViewModel() {
        return (com.qcwireless.qcwatch.ui.mine.login.LoginViewModel) this.loginViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityLoginBinding inflate = com.qcwireless.qcwatch.databinding.ActivityLoginBinding.inflate(getLayoutInflater());
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
        android.view.View[] viewArr = new android.view.View[4];
        com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding = this.binding;
        final com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding2 = null;
        if (activityLoginBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLoginBinding = null;
        }
        viewArr[0] = activityLoginBinding.btnLogin;
        com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding3 = this.binding;
        if (activityLoginBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLoginBinding3 = null;
        }
        viewArr[1] = activityLoginBinding3.tvForgetPws;
        com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding4 = this.binding;
        if (activityLoginBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLoginBinding4 = null;
        }
        viewArr[2] = activityLoginBinding4.tvRegister;
        com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding5 = this.binding;
        if (activityLoginBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLoginBinding5 = null;
        }
        viewArr[3] = activityLoginBinding5.userPrivacyEn;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.login.LoginActivity$setupViews$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding6;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding7;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding8;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding9;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding10;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding11;
                boolean isValidEmail;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding12;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding13;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding14;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding15;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding16;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding17;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding18;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding19;
                java.lang.String str;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding20;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding21;
                java.lang.String str2;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding22;
                com.qcwireless.qcwatch.ui.mine.login.LoginViewModel loginViewModel;
                java.lang.String str3;
                java.lang.String str4;
                com.qcwireless.qcwatch.ui.mine.login.LoginViewModel loginViewModel2;
                java.lang.String str5;
                java.lang.String str6;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding23;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding24;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding25;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding26;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding27;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityLoginBinding6 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding28 = null;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding29 = null;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding30 = null;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding31 = null;
                java.lang.String str7 = null;
                java.lang.String str8 = null;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding32 = null;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding33 = null;
                if (activityLoginBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityLoginBinding6 = null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityLoginBinding6.btnLogin)) {
                    activityLoginBinding7 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                    if (activityLoginBinding7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityLoginBinding7 = null;
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityLoginBinding7.tvForgetPws)) {
                        activityLoginBinding8 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                        if (activityLoginBinding8 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLoginBinding8 = null;
                        }
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityLoginBinding8.tvRegister)) {
                            activityLoginBinding9 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                            if (activityLoginBinding9 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityLoginBinding28 = activityLoginBinding9;
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityLoginBinding28.userPrivacyEn)) {
                                android.os.Bundle bundle = new android.os.Bundle();
                                bundle.putString("url", com.qcwireless.qcwatch.ui.mine.privacy.LanguagePPMURLKt.getLanguagePPMUrl());
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this;
                                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.privacy.WebActivity.class);
                                intent.setFlags(1);
                                intent.putExtras(bundle);
                                for (kotlin.Pair pair : arrayList) {
                                    if (pair != null) {
                                        java.lang.String str9 = (java.lang.String) pair.getFirst();
                                        java.lang.Object second = pair.getSecond();
                                        if (second instanceof java.lang.Integer) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                                        } else if (second instanceof java.lang.Byte) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                                        } else if (second instanceof java.lang.Character) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                                        } else if (second instanceof java.lang.Short) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                                        } else if (second instanceof java.lang.Boolean) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                                        } else if (second instanceof java.lang.Long) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                                        } else if (second instanceof java.lang.Float) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                                        } else if (second instanceof java.lang.Double) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                                        } else if (second instanceof java.lang.String) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, (java.lang.String) second), "putExtra(name, value)");
                                        } else if (second instanceof java.lang.CharSequence) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, (java.lang.CharSequence) second), "putExtra(name, value)");
                                        } else if (second instanceof android.os.Parcelable) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, (android.os.Parcelable) second), "putExtra(name, value)");
                                        } else if (second instanceof java.lang.Object[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, (java.io.Serializable) second), "putExtra(name, value)");
                                        } else if (second instanceof java.util.ArrayList) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, (java.io.Serializable) second), "putExtra(name, value)");
                                        } else if (second instanceof java.io.Serializable) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, (java.io.Serializable) second), "putExtra(name, value)");
                                        } else if (second instanceof boolean[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, (boolean[]) second), "putExtra(name, value)");
                                        } else if (second instanceof byte[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, (byte[]) second), "putExtra(name, value)");
                                        } else if (second instanceof short[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, (short[]) second), "putExtra(name, value)");
                                        } else if (second instanceof char[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, (char[]) second), "putExtra(name, value)");
                                        } else if (second instanceof int[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, (int[]) second), "putExtra(name, value)");
                                        } else if (second instanceof long[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, (long[]) second), "putExtra(name, value)");
                                        } else if (second instanceof float[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, (float[]) second), "putExtra(name, value)");
                                        } else if (second instanceof double[]) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, (double[]) second), "putExtra(name, value)");
                                        } else if (second instanceof android.os.Bundle) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, (android.os.Bundle) second), "putExtra(name, value)");
                                        } else if (second instanceof android.content.Intent) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str9, (android.os.Parcelable) second), "putExtra(name, value)");
                                        } else {
                                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                        }
                                    }
                                }
                                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                activity.startActivity(intent);
                                return;
                            }
                            return;
                        }
                        android.app.Activity activity2 = (android.app.Activity) com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this;
                        java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
                        android.content.Intent intent2 = new android.content.Intent(activity2, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.class);
                        for (kotlin.Pair pair2 : arrayList2) {
                            if (pair2 != null) {
                                java.lang.String str10 = (java.lang.String) pair2.getFirst();
                                java.lang.Object second2 = pair2.getSecond();
                                if (second2 instanceof java.lang.Integer) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, ((java.lang.Number) second2).intValue()), "putExtra(name, value)");
                                } else if (second2 instanceof java.lang.Byte) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, ((java.lang.Number) second2).byteValue()), "putExtra(name, value)");
                                } else if (second2 instanceof java.lang.Character) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, ((java.lang.Character) second2).charValue()), "putExtra(name, value)");
                                } else if (second2 instanceof java.lang.Short) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, ((java.lang.Number) second2).shortValue()), "putExtra(name, value)");
                                } else if (second2 instanceof java.lang.Boolean) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, ((java.lang.Boolean) second2).booleanValue()), "putExtra(name, value)");
                                } else if (second2 instanceof java.lang.Long) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, ((java.lang.Number) second2).longValue()), "putExtra(name, value)");
                                } else if (second2 instanceof java.lang.Float) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, ((java.lang.Number) second2).floatValue()), "putExtra(name, value)");
                                } else if (second2 instanceof java.lang.Double) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, ((java.lang.Number) second2).doubleValue()), "putExtra(name, value)");
                                } else if (second2 instanceof java.lang.String) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, (java.lang.String) second2), "putExtra(name, value)");
                                } else if (second2 instanceof java.lang.CharSequence) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, (java.lang.CharSequence) second2), "putExtra(name, value)");
                                } else if (second2 instanceof android.os.Parcelable) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, (android.os.Parcelable) second2), "putExtra(name, value)");
                                } else if (second2 instanceof java.lang.Object[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, (java.io.Serializable) second2), "putExtra(name, value)");
                                } else if (second2 instanceof java.util.ArrayList) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, (java.io.Serializable) second2), "putExtra(name, value)");
                                } else if (second2 instanceof java.io.Serializable) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, (java.io.Serializable) second2), "putExtra(name, value)");
                                } else if (second2 instanceof boolean[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, (boolean[]) second2), "putExtra(name, value)");
                                } else if (second2 instanceof byte[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, (byte[]) second2), "putExtra(name, value)");
                                } else if (second2 instanceof short[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, (short[]) second2), "putExtra(name, value)");
                                } else if (second2 instanceof char[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, (char[]) second2), "putExtra(name, value)");
                                } else if (second2 instanceof int[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, (int[]) second2), "putExtra(name, value)");
                                } else if (second2 instanceof long[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, (long[]) second2), "putExtra(name, value)");
                                } else if (second2 instanceof float[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, (float[]) second2), "putExtra(name, value)");
                                } else if (second2 instanceof double[]) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, (double[]) second2), "putExtra(name, value)");
                                } else if (second2 instanceof android.os.Bundle) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, (android.os.Bundle) second2), "putExtra(name, value)");
                                } else if (second2 instanceof android.content.Intent) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str10, (android.os.Parcelable) second2), "putExtra(name, value)");
                                } else {
                                    kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                                }
                            }
                        }
                        kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                        kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                        kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                        activity2.startActivity(intent2);
                        return;
                    }
                    android.app.Activity activity3 = (android.app.Activity) com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this;
                    java.util.ArrayList<kotlin.Pair> arrayList3 = new java.util.ArrayList();
                    android.content.Intent intent3 = new android.content.Intent(activity3, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.class);
                    for (kotlin.Pair pair3 : arrayList3) {
                        if (pair3 != null) {
                            java.lang.String str11 = (java.lang.String) pair3.getFirst();
                            java.lang.Object second3 = pair3.getSecond();
                            if (second3 instanceof java.lang.Integer) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, ((java.lang.Number) second3).intValue()), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.Byte) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, ((java.lang.Number) second3).byteValue()), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.Character) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, ((java.lang.Character) second3).charValue()), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.Short) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, ((java.lang.Number) second3).shortValue()), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.Boolean) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, ((java.lang.Boolean) second3).booleanValue()), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.Long) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, ((java.lang.Number) second3).longValue()), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.Float) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, ((java.lang.Number) second3).floatValue()), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.Double) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, ((java.lang.Number) second3).doubleValue()), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.String) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, (java.lang.String) second3), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.CharSequence) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, (java.lang.CharSequence) second3), "putExtra(name, value)");
                            } else if (second3 instanceof android.os.Parcelable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, (android.os.Parcelable) second3), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, (java.io.Serializable) second3), "putExtra(name, value)");
                            } else if (second3 instanceof java.util.ArrayList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, (java.io.Serializable) second3), "putExtra(name, value)");
                            } else if (second3 instanceof java.io.Serializable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, (java.io.Serializable) second3), "putExtra(name, value)");
                            } else if (second3 instanceof boolean[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, (boolean[]) second3), "putExtra(name, value)");
                            } else if (second3 instanceof byte[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, (byte[]) second3), "putExtra(name, value)");
                            } else if (second3 instanceof short[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, (short[]) second3), "putExtra(name, value)");
                            } else if (second3 instanceof char[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, (char[]) second3), "putExtra(name, value)");
                            } else if (second3 instanceof int[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, (int[]) second3), "putExtra(name, value)");
                            } else if (second3 instanceof long[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, (long[]) second3), "putExtra(name, value)");
                            } else if (second3 instanceof float[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, (float[]) second3), "putExtra(name, value)");
                            } else if (second3 instanceof double[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, (double[]) second3), "putExtra(name, value)");
                            } else if (second3 instanceof android.os.Bundle) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, (android.os.Bundle) second3), "putExtra(name, value)");
                            } else if (second3 instanceof android.content.Intent) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str11, (android.os.Parcelable) second3), "putExtra(name, value)");
                            } else {
                                kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit12 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit13 = kotlin.Unit.INSTANCE;
                    activity3.startActivity(intent3);
                    return;
                }
                if (!com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isNetworkAvailable((android.content.Context) com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this)) {
                    activityLoginBinding27 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                    if (activityLoginBinding27 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityLoginBinding29 = activityLoginBinding27;
                    }
                    activityLoginBinding29.tvError.setText(com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_223));
                    return;
                }
                final com.qcwireless.qcwatch.ui.mine.login.LoginActivity loginActivity = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(view, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.login.LoginActivity$setupViews$1.1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((android.view.View) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(android.view.View view2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "$this$ktxRunOnBgSingle");
                        if (com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isOnline()) {
                            return;
                        }
                        final com.qcwireless.qcwatch.ui.mine.login.LoginActivity loginActivity2 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this;
                        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(view2, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.login.LoginActivity.setupViews.1.1.1
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                invoke((android.view.View) obj);
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(android.view.View view3) {
                                com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding34;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view3, "$this$ktxRunOnUi");
                                activityLoginBinding34 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                                if (activityLoginBinding34 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    activityLoginBinding34 = null;
                                }
                                activityLoginBinding34.tvError.setText(com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_223));
                            }
                        });
                    }
                });
                activityLoginBinding10 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                if (activityLoginBinding10 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityLoginBinding10 = null;
                }
                android.text.Editable text = activityLoginBinding10.userEmail.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text, "binding.userEmail.text");
                if (!kotlin.text.StringsKt.contains$default(text, "@", false, 2, (java.lang.Object) null)) {
                    activityLoginBinding25 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                    if (activityLoginBinding25 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityLoginBinding25 = null;
                    }
                    activityLoginBinding25.tvError.setText(com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_219));
                    activityLoginBinding26 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                    if (activityLoginBinding26 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityLoginBinding30 = activityLoginBinding26;
                    }
                    activityLoginBinding30.btnLogin.setEnabled(false);
                    return;
                }
                com.qcwireless.qcwatch.ui.mine.login.LoginActivity loginActivity2 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this;
                activityLoginBinding11 = loginActivity2.binding;
                if (activityLoginBinding11 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityLoginBinding11 = null;
                }
                isValidEmail = loginActivity2.isValidEmail(activityLoginBinding11.userEmail.getText().toString());
                if (!isValidEmail) {
                    activityLoginBinding23 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                    if (activityLoginBinding23 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityLoginBinding23 = null;
                    }
                    activityLoginBinding23.tvError.setText(com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_219));
                    activityLoginBinding24 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                    if (activityLoginBinding24 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityLoginBinding31 = activityLoginBinding24;
                    }
                    activityLoginBinding31.btnLogin.setEnabled(false);
                    return;
                }
                activityLoginBinding12 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                if (activityLoginBinding12 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityLoginBinding12 = null;
                }
                android.text.Editable text2 = activityLoginBinding12.userEmail.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "binding.userEmail.text");
                android.text.Editable editable = text2;
                activityLoginBinding13 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                if (activityLoginBinding13 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityLoginBinding13 = null;
                }
                android.text.Editable text3 = activityLoginBinding13.userEmail.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text3, "binding.userEmail.text");
                java.lang.String obj = editable.subSequence(0, kotlin.text.StringsKt.indexOf$default(text3, "@", 0, false, 4, (java.lang.Object) null)).toString();
                if (!(obj.length() == 0) && obj.length() >= 2) {
                    activityLoginBinding16 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                    if (activityLoginBinding16 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityLoginBinding16 = null;
                    }
                    if (activityLoginBinding16.userEmail.getText().length() >= 3) {
                        activityLoginBinding17 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                        if (activityLoginBinding17 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLoginBinding17 = null;
                        }
                        activityLoginBinding17.tvError.setText("");
                        com.qcwireless.qcwatch.ui.mine.login.LoginActivity loginActivity3 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this;
                        activityLoginBinding18 = loginActivity3.binding;
                        if (activityLoginBinding18 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLoginBinding18 = null;
                        }
                        android.text.Editable text4 = activityLoginBinding18.userEmail.getText();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text4, "binding.userEmail.text");
                        loginActivity3.email = new kotlin.text.Regex("\\s").replace(text4, "");
                        com.qcwireless.qcwatch.ui.mine.login.LoginActivity loginActivity4 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this;
                        activityLoginBinding19 = loginActivity4.binding;
                        if (activityLoginBinding19 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLoginBinding19 = null;
                        }
                        android.text.Editable text5 = activityLoginBinding19.userPwd.getText();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text5, "binding.userPwd.text");
                        loginActivity4.password = new kotlin.text.Regex("\\s").replace(text5, "");
                        str = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.password;
                        if (str == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("password");
                            str = null;
                        }
                        if (str.length() >= 6) {
                            str2 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.password;
                            if (str2 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("password");
                                str2 = null;
                            }
                            if (str2.length() <= 12) {
                                activityLoginBinding22 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                                if (activityLoginBinding22 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    activityLoginBinding22 = null;
                                }
                                activityLoginBinding22.tvError.setText("");
                                com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.showLoadingDialog();
                                if (com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getPingHwServer()) {
                                    loginViewModel2 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.getLoginViewModel();
                                    str5 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.email;
                                    if (str5 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(com.google.android.gms.common.Scopes.EMAIL);
                                        str5 = null;
                                    }
                                    str6 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.password;
                                    if (str6 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("password");
                                    } else {
                                        str7 = str6;
                                    }
                                    loginViewModel2.login(str5, com.qcwireless.qcwatch.ui.base.util.MD5UtilKt.encode(str7), 2);
                                    return;
                                }
                                loginViewModel = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.getLoginViewModel();
                                str3 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.email;
                                if (str3 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(com.google.android.gms.common.Scopes.EMAIL);
                                    str3 = null;
                                }
                                str4 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.password;
                                if (str4 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("password");
                                } else {
                                    str8 = str4;
                                }
                                loginViewModel.loginChina(str3, com.qcwireless.qcwatch.ui.base.util.MD5UtilKt.encode(str8), 2);
                                return;
                            }
                        }
                        activityLoginBinding20 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                        if (activityLoginBinding20 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityLoginBinding20 = null;
                        }
                        activityLoginBinding20.tvError.setText(com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_220));
                        activityLoginBinding21 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                        if (activityLoginBinding21 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityLoginBinding32 = activityLoginBinding21;
                        }
                        activityLoginBinding32.btnLogin.setEnabled(false);
                        return;
                    }
                }
                activityLoginBinding14 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                if (activityLoginBinding14 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityLoginBinding14 = null;
                }
                activityLoginBinding14.tvError.setText(com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_219));
                activityLoginBinding15 = com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this.binding;
                if (activityLoginBinding15 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityLoginBinding33 = activityLoginBinding15;
                }
                activityLoginBinding33.btnLogin.setEnabled(false);
            }
        });
        getLoginViewModel().getLoginUI().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.mine.login.LoginActivity$$ExternalSyntheticLambda2
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.mine.login.LoginActivity.m1309setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.mine.login.LoginActivity.this, (com.qcwireless.qcwatch.ui.base.repository.mine.NetState) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding6 = this.binding;
        if (activityLoginBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityLoginBinding2 = activityLoginBinding6;
        }
        activityLoginBinding2.imgPwd.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.mine.login.LoginActivity$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.mine.login.LoginActivity.m1310setupViews$lambda5$lambda2(com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this, compoundButton, z);
            }
        });
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUserEmail().length() > 0) {
            activityLoginBinding2.userEmail.setText(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUserEmail());
        }
        activityLoginBinding2.userEmail.setFilters(new android.text.InputFilter[]{this.inputFilter, this.emptyInputFilter, new android.text.InputFilter.LengthFilter(60)});
        activityLoginBinding2.userPwd.setFilters(new android.text.InputFilter[]{this.inputFilter, this.emptyInputFilter, new android.text.InputFilter.LengthFilter(60)});
        android.widget.EditText editText = activityLoginBinding2.userEmail;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText, "userEmail");
        editText.addTextChangedListener(new android.text.TextWatcher() { // from class: com.qcwireless.qcwatch.ui.mine.login.LoginActivity$setupViews$lambda-5$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable s) {
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.userEmail.requestFocus();
                android.text.Editable text = com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.userEmail.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text, "userEmail.text");
                boolean z = false;
                if (!kotlin.text.StringsKt.contains$default(text, "@", false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.tvError.setText(this.getString(com.qcwireless.qcwatch.R.string.qc_text_219));
                    com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.btnLogin.setEnabled(false);
                    return;
                }
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.btnLogin.setEnabled(true);
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.tvError.setText("");
                android.text.Editable text2 = com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.userEmail.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "userEmail.text");
                android.text.Editable text3 = com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.userEmail.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text3, "userEmail.text");
                if (text2.subSequence(0, kotlin.text.StringsKt.indexOf$default(text3, "@", 0, false, 4, (java.lang.Object) null)).toString().length() == 0) {
                    com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.tvError.setText(this.getString(com.qcwireless.qcwatch.R.string.qc_text_219));
                    com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.btnLogin.setEnabled(false);
                    return;
                }
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.btnLogin.setEnabled(true);
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.tvError.setText("");
                android.widget.Button button = com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.btnLogin;
                android.text.Editable text4 = com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.userPwd.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text4, "userPwd.text");
                if (!(text4.length() == 0)) {
                    android.text.Editable text5 = com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.userEmail.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text5, "userEmail.text");
                    if (!(text5.length() == 0)) {
                        z = true;
                    }
                }
                button.setEnabled(z);
                com.qcwireless.qcwatch.ui.mine.login.LoginActivity loginActivity = this;
                android.text.Editable text6 = com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.userEmail.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text6, "userEmail.text");
                loginActivity.email = new kotlin.text.Regex("\\s").replace(text6, "");
            }
        });
        android.widget.EditText editText2 = activityLoginBinding2.userPwd;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText2, "userPwd");
        editText2.addTextChangedListener(new android.text.TextWatcher() { // from class: com.qcwireless.qcwatch.ui.mine.login.LoginActivity$setupViews$lambda-5$$inlined$doAfterTextChanged$2
            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable s) {
                java.lang.String str;
                java.lang.String str2;
                java.lang.String str3;
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.userPwd.requestFocus();
                com.qcwireless.qcwatch.ui.mine.login.LoginActivity loginActivity = this;
                android.text.Editable text = com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.userPwd.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text, "userPwd.text");
                loginActivity.password = new kotlin.text.Regex("\\s").replace(text, "");
                str = this.password;
                java.lang.String str4 = null;
                if (str == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("password");
                    str = null;
                }
                boolean z = false;
                if (str.length() >= 6) {
                    str2 = this.password;
                    if (str2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("password");
                        str2 = null;
                    }
                    if (str2.length() <= 12) {
                        com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.btnLogin.setEnabled(true);
                        com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.tvError.setText("");
                        android.widget.Button button = com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.btnLogin;
                        str3 = this.password;
                        if (str3 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("password");
                        } else {
                            str4 = str3;
                        }
                        if (!(str4.length() == 0)) {
                            android.text.Editable text2 = com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.userEmail.getText();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "userEmail.text");
                            if (!(text2.length() == 0)) {
                                z = true;
                            }
                        }
                        button.setEnabled(z);
                        return;
                    }
                }
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.tvError.setText(this.getString(com.qcwireless.qcwatch.R.string.qc_text_220));
                com.qcwireless.qcwatch.databinding.ActivityLoginBinding.this.btnLogin.setEnabled(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1$lambda-0, reason: not valid java name */
    public static final void m1309setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.mine.login.LoginActivity loginActivity, com.qcwireless.qcwatch.ui.base.repository.mine.NetState netState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginActivity, "this$0");
        if (netState.getIsLoading()) {
            loginActivity.showLoadingDialog();
        }
        int retCode = netState.getRetCode();
        if (retCode == 0) {
            loginActivity.dismissLoadingDialog();
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLoginStatus(true);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.LoginSuccessEvent());
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.RefreshEvent(com.qcwireless.qcwatch.ui.mine.MineFragment.class));
            loginActivity.finish();
            return;
        }
        if (retCode == 50003) {
            loginActivity.dismissLoadingDialog();
            com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding = loginActivity.binding;
            if (activityLoginBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityLoginBinding = null;
            }
            activityLoginBinding.tvError.setText(loginActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_222));
            java.lang.String string = loginActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_222);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_222)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        if (retCode == 50012) {
            loginActivity.dismissLoadingDialog();
            com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding2 = loginActivity.binding;
            if (activityLoginBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityLoginBinding2 = null;
            }
            activityLoginBinding2.tvError.setText(loginActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_272));
            java.lang.String string2 = loginActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_272);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_272)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
            return;
        }
        loginActivity.dismissLoadingDialog();
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(loginActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_288) + ':' + netState.getRetCode(), 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-5$lambda-2, reason: not valid java name */
    public static final void m1310setupViews$lambda5$lambda2(com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLoginBinding, "$this_run");
        if (z) {
            activityLoginBinding.userPwd.setTransformationMethod(android.text.method.HideReturnsTransformationMethod.getInstance());
            activityLoginBinding.userPwd.setSelection(activityLoginBinding.userPwd.length());
        } else {
            activityLoginBinding.userPwd.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
            activityLoginBinding.userPwd.setSelection(activityLoginBinding.userPwd.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValidEmail(java.lang.String email) {
        return java.util.regex.Pattern.matches("^(\\w+([-.][A-Za-z0-9]+)*){3,18}@\\w+([-.][A-Za-z0-9]+)*\\.\\w+([-.][A-Za-z0-9]+)*$", email);
    }

    public final android.text.InputFilter getEmptyInputFilter() {
        return this.emptyInputFilter;
    }

    public final void setEmptyInputFilter(android.text.InputFilter inputFilter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputFilter, "<set-?>");
        this.emptyInputFilter = inputFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: emptyInputFilter$lambda-6, reason: not valid java name */
    public static final java.lang.CharSequence m1308emptyInputFilter$lambda6(com.qcwireless.qcwatch.ui.mine.login.LoginActivity loginActivity, java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginActivity, "this$0");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(charSequence, " ") && !kotlin.jvm.internal.Intrinsics.areEqual(charSequence, "")) {
            return charSequence;
        }
        com.qcwireless.qcwatch.databinding.ActivityLoginBinding activityLoginBinding = loginActivity.binding;
        if (activityLoginBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLoginBinding = null;
        }
        activityLoginBinding.tvError.setText(loginActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_284));
        return "";
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if (messageEvent instanceof com.qcwireless.qcwatch.ui.base.bean.mine.MineActivityFinish) {
            finish();
        }
    }
}
