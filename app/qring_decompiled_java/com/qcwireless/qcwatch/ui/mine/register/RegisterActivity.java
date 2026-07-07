package com.qcwireless.qcwatch.ui.mine.register;

/* compiled from: RegisterActivity.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0019H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/register/RegisterActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityRegisterBinding;", com.google.android.gms.common.Scopes.EMAIL, "", "emptyInputFilter", "Landroid/text/InputFilter;", "getEmptyInputFilter", "()Landroid/text/InputFilter;", "setEmptyInputFilter", "(Landroid/text/InputFilter;)V", "inputFilter", "password", "passwordAgain", "registerViewModel", "Lcom/qcwireless/qcwatch/ui/mine/register/RegisterViewModel;", "getRegisterViewModel", "()Lcom/qcwireless/qcwatch/ui/mine/register/RegisterViewModel;", "registerViewModel$delegate", "Lkotlin/Lazy;", "isValidEmail", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class RegisterActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityRegisterBinding binding;

    /* renamed from: registerViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy registerViewModel;
    private java.lang.String email = "";
    private java.lang.String password = "";
    private java.lang.String passwordAgain = "";
    private android.text.InputFilter emptyInputFilter = new android.text.InputFilter() { // from class: com.qcwireless.qcwatch.ui.mine.register.RegisterActivity$$ExternalSyntheticLambda0
        @Override // android.text.InputFilter
        public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
            java.lang.CharSequence m1314emptyInputFilter$lambda7;
            m1314emptyInputFilter$lambda7 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.m1314emptyInputFilter$lambda7(com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this, charSequence, i, i2, spanned, i3, i4);
            return m1314emptyInputFilter$lambda7;
        }
    };
    private android.text.InputFilter inputFilter = new android.text.InputFilter() { // from class: com.qcwireless.qcwatch.ui.mine.register.RegisterActivity$inputFilter$1
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

    public RegisterActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.registerViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel>() { // from class: com.qcwireless.qcwatch.ui.mine.register.RegisterActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel m1318invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel getRegisterViewModel() {
        return (com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel) this.registerViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityRegisterBinding inflate = com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.inflate(getLayoutInflater());
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
        final com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding2 = null;
        if (activityRegisterBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityRegisterBinding = null;
        }
        activityRegisterBinding.imgPwd.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.mine.register.RegisterActivity$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.m1315setupViews$lambda6$lambda0(com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this, compoundButton, z);
            }
        });
        activityRegisterBinding.imgPwdEye.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.mine.register.RegisterActivity$$ExternalSyntheticLambda2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.m1316setupViews$lambda6$lambda1(com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this, compoundButton, z);
            }
        });
        activityRegisterBinding.userEmail.setFilters(new android.text.InputFilter[]{this.inputFilter, this.emptyInputFilter, new android.text.InputFilter.LengthFilter(60)});
        activityRegisterBinding.userPwd.setFilters(new android.text.InputFilter[]{this.inputFilter, this.emptyInputFilter, new android.text.InputFilter.LengthFilter(60)});
        activityRegisterBinding.userPwdAgain.setFilters(new android.text.InputFilter[]{this.inputFilter, this.emptyInputFilter, new android.text.InputFilter.LengthFilter(60)});
        android.widget.EditText editText = activityRegisterBinding.userEmail;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText, "userEmail");
        editText.addTextChangedListener(new android.text.TextWatcher() { // from class: com.qcwireless.qcwatch.ui.mine.register.RegisterActivity$setupViews$lambda-6$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable s) {
                boolean isValidEmail;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding3;
                android.text.Editable text = com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.userEmail.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text, "userEmail.text");
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding4 = null;
                if (!kotlin.text.StringsKt.contains$default(text, "@", false, 2, (java.lang.Object) null)) {
                    com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.tvError.setText(this.getString(com.qcwireless.qcwatch.R.string.qc_text_219));
                    com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.btnRegister.setEnabled(false);
                    return;
                }
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.btnRegister.setEnabled(true);
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.tvError.setText("");
                isValidEmail = this.isValidEmail(com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.userEmail.getText().toString());
                if (!isValidEmail) {
                    activityRegisterBinding3 = this.binding;
                    if (activityRegisterBinding3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityRegisterBinding4 = activityRegisterBinding3;
                    }
                    activityRegisterBinding4.tvError.setText(this.getString(com.qcwireless.qcwatch.R.string.qc_text_219));
                    return;
                }
                com.qcwireless.qcwatch.ui.mine.register.RegisterActivity registerActivity = this;
                android.text.Editable text2 = com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.userEmail.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "userEmail.text");
                registerActivity.email = new kotlin.text.Regex("\\s").replace(text2, "");
            }
        });
        android.widget.EditText editText2 = activityRegisterBinding.userPwd;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText2, "userPwd");
        editText2.addTextChangedListener(new android.text.TextWatcher() { // from class: com.qcwireless.qcwatch.ui.mine.register.RegisterActivity$setupViews$lambda-6$$inlined$doAfterTextChanged$2
            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable s) {
                if (com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.userPwd.getText().length() < 6 || com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.userPwd.getText().length() > 12) {
                    com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.tvError.setText(this.getString(com.qcwireless.qcwatch.R.string.qc_text_220));
                    com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.btnRegister.setEnabled(false);
                } else {
                    com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.btnRegister.setEnabled(true);
                    com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.tvError.setText("");
                    this.password = com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.userPwd.getText().toString();
                }
            }
        });
        android.widget.EditText editText3 = activityRegisterBinding.userPwdAgain;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText3, "userPwdAgain");
        editText3.addTextChangedListener(new android.text.TextWatcher() { // from class: com.qcwireless.qcwatch.ui.mine.register.RegisterActivity$setupViews$lambda-6$$inlined$doAfterTextChanged$3
            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable s) {
                if (com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.userPwdAgain.getText().length() < 6 || com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.userPwdAgain.getText().length() > 12) {
                    com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.tvError.setText(this.getString(com.qcwireless.qcwatch.R.string.qc_text_220));
                    com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.btnRegister.setEnabled(false);
                } else {
                    com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.btnRegister.setEnabled(true);
                    com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.tvError.setText("");
                    this.passwordAgain = com.qcwireless.qcwatch.databinding.ActivityRegisterBinding.this.userPwdAgain.getText().toString();
                }
            }
        });
        android.view.View[] viewArr = new android.view.View[1];
        com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding3 = this.binding;
        if (activityRegisterBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityRegisterBinding2 = activityRegisterBinding3;
        }
        viewArr[0] = activityRegisterBinding2.btnRegister;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.register.RegisterActivity$setupViews$1$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding4;
                java.lang.String str;
                boolean isValidEmail;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding5;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding6;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding7;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding8;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding9;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding10;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding11;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding12;
                java.lang.String str2;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding13;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding14;
                java.lang.String str3;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding15;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding16;
                java.lang.String str4;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding17;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding18;
                java.lang.String str5;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding19;
                java.lang.String str6;
                java.lang.String str7;
                java.lang.String str8;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding20;
                java.lang.String str9;
                java.lang.String str10;
                com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel registerViewModel;
                java.lang.String str11;
                java.lang.String str12;
                com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel registerViewModel2;
                java.lang.String str13;
                java.lang.String str14;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding21;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding22;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding23;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding24;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityRegisterBinding4 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding25 = null;
                if (activityRegisterBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityRegisterBinding4 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityRegisterBinding4.btnRegister)) {
                    if (!com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isNetworkAvailable((android.content.Context) com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this)) {
                        activityRegisterBinding24 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                        if (activityRegisterBinding24 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityRegisterBinding25 = activityRegisterBinding24;
                        }
                        activityRegisterBinding25.tvError.setText(com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_223));
                        return;
                    }
                    final com.qcwireless.qcwatch.ui.mine.register.RegisterActivity registerActivity = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(view, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.register.RegisterActivity$setupViews$1$6.1
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
                            final com.qcwireless.qcwatch.ui.mine.register.RegisterActivity registerActivity2 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this;
                            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(view2, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.setupViews.1.6.1.1
                                {
                                    super(1);
                                }

                                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                    invoke((android.view.View) obj);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(android.view.View view3) {
                                    com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding26;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view3, "$this$ktxRunOnUi");
                                    activityRegisterBinding26 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                                    if (activityRegisterBinding26 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        activityRegisterBinding26 = null;
                                    }
                                    activityRegisterBinding26.tvError.setText(com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_223));
                                }
                            });
                        }
                    });
                    android.text.Editable text = activityRegisterBinding.userEmail.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text, "userEmail.text");
                    if (!kotlin.text.StringsKt.contains$default(text, "@", false, 2, (java.lang.Object) null)) {
                        activityRegisterBinding.tvError.setText(com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_219));
                        activityRegisterBinding.btnRegister.setEnabled(false);
                        return;
                    }
                    activityRegisterBinding.btnRegister.setEnabled(true);
                    activityRegisterBinding.tvError.setText("");
                    com.qcwireless.qcwatch.ui.mine.register.RegisterActivity registerActivity2 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this;
                    str = registerActivity2.email;
                    isValidEmail = registerActivity2.isValidEmail(str);
                    if (!isValidEmail) {
                        activityRegisterBinding22 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                        if (activityRegisterBinding22 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityRegisterBinding22 = null;
                        }
                        activityRegisterBinding22.tvError.setText(com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_219));
                        activityRegisterBinding23 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                        if (activityRegisterBinding23 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityRegisterBinding25 = activityRegisterBinding23;
                        }
                        activityRegisterBinding25.btnRegister.setEnabled(false);
                        return;
                    }
                    activityRegisterBinding.btnRegister.setEnabled(true);
                    activityRegisterBinding.tvError.setText("");
                    activityRegisterBinding5 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                    if (activityRegisterBinding5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityRegisterBinding5 = null;
                    }
                    android.text.Editable text2 = activityRegisterBinding5.userEmail.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "binding.userEmail.text");
                    android.text.Editable editable = text2;
                    activityRegisterBinding6 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                    if (activityRegisterBinding6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityRegisterBinding6 = null;
                    }
                    android.text.Editable text3 = activityRegisterBinding6.userEmail.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text3, "binding.userEmail.text");
                    java.lang.String obj = editable.subSequence(0, kotlin.text.StringsKt.indexOf$default(text3, "@", 0, false, 4, (java.lang.Object) null)).toString();
                    activityRegisterBinding7 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                    if (activityRegisterBinding7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityRegisterBinding7 = null;
                    }
                    android.text.Editable text4 = activityRegisterBinding7.userEmail.getText();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text4, "binding.userEmail.text");
                    if (kotlin.text.StringsKt.contains$default(text4, "@", false, 2, (java.lang.Object) null)) {
                        if (!(obj.length() == 0) && obj.length() >= 2) {
                            activityRegisterBinding10 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                            if (activityRegisterBinding10 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityRegisterBinding10 = null;
                            }
                            if (activityRegisterBinding10.userEmail.getText().length() >= 3) {
                                activityRegisterBinding.btnRegister.setEnabled(true);
                                activityRegisterBinding11 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                                if (activityRegisterBinding11 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    activityRegisterBinding11 = null;
                                }
                                activityRegisterBinding11.tvError.setText("");
                                com.qcwireless.qcwatch.ui.mine.register.RegisterActivity registerActivity3 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this;
                                android.text.Editable text5 = activityRegisterBinding.userEmail.getText();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text5, "userEmail.text");
                                registerActivity3.email = new kotlin.text.Regex("\\s").replace(text5, "");
                                com.qcwireless.qcwatch.ui.mine.register.RegisterActivity registerActivity4 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this;
                                activityRegisterBinding12 = registerActivity4.binding;
                                if (activityRegisterBinding12 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    activityRegisterBinding12 = null;
                                }
                                android.text.Editable text6 = activityRegisterBinding12.userPwdAgain.getText();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text6, "binding.userPwdAgain.text");
                                registerActivity4.passwordAgain = new kotlin.text.Regex("\\s").replace(text6, "");
                                str2 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.passwordAgain;
                                if (str2.length() >= 6) {
                                    str3 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.passwordAgain;
                                    if (str3.length() <= 12) {
                                        activityRegisterBinding.btnRegister.setEnabled(true);
                                        activityRegisterBinding15 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                                        if (activityRegisterBinding15 == null) {
                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                            activityRegisterBinding15 = null;
                                        }
                                        activityRegisterBinding15.tvError.setText("");
                                        com.qcwireless.qcwatch.ui.mine.register.RegisterActivity registerActivity5 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this;
                                        activityRegisterBinding16 = registerActivity5.binding;
                                        if (activityRegisterBinding16 == null) {
                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                            activityRegisterBinding16 = null;
                                        }
                                        android.text.Editable text7 = activityRegisterBinding16.userPwd.getText();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text7, "binding.userPwd.text");
                                        registerActivity5.password = new kotlin.text.Regex("\\s").replace(text7, "");
                                        str4 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.password;
                                        if (str4.length() >= 6) {
                                            str5 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.password;
                                            if (str5.length() <= 12) {
                                                activityRegisterBinding.btnRegister.setEnabled(true);
                                                activityRegisterBinding19 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                                                if (activityRegisterBinding19 == null) {
                                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                    activityRegisterBinding19 = null;
                                                }
                                                activityRegisterBinding19.tvError.setText("");
                                                str6 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.password;
                                                str7 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.passwordAgain;
                                                if (!kotlin.jvm.internal.Intrinsics.areEqual(str6, str7)) {
                                                    activityRegisterBinding21 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                                                    if (activityRegisterBinding21 == null) {
                                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                    } else {
                                                        activityRegisterBinding25 = activityRegisterBinding21;
                                                    }
                                                    activityRegisterBinding25.tvError.setText(com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_224));
                                                    return;
                                                }
                                                str8 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.email;
                                                if (!(str8.length() == 0)) {
                                                    str9 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.password;
                                                    if (!(str9.length() == 0)) {
                                                        str10 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.passwordAgain;
                                                        if (!(str10.length() == 0)) {
                                                            if (com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getPingHwServer()) {
                                                                registerViewModel2 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.getRegisterViewModel();
                                                                str13 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.email;
                                                                str14 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.passwordAgain;
                                                                registerViewModel2.register(str13, com.qcwireless.qcwatch.ui.base.util.MD5UtilKt.encode(str14), 2);
                                                                return;
                                                            }
                                                            registerViewModel = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.getRegisterViewModel();
                                                            str11 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.email;
                                                            str12 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.passwordAgain;
                                                            registerViewModel.registerChina(str11, com.qcwireless.qcwatch.ui.base.util.MD5UtilKt.encode(str12), 2);
                                                            return;
                                                        }
                                                    }
                                                }
                                                activityRegisterBinding20 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                                                if (activityRegisterBinding20 == null) {
                                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                                } else {
                                                    activityRegisterBinding25 = activityRegisterBinding20;
                                                }
                                                activityRegisterBinding25.tvError.setText(com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_225));
                                                return;
                                            }
                                        }
                                        activityRegisterBinding17 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                                        if (activityRegisterBinding17 == null) {
                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                            activityRegisterBinding17 = null;
                                        }
                                        activityRegisterBinding17.tvError.setText(com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_220));
                                        activityRegisterBinding18 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                                        if (activityRegisterBinding18 == null) {
                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        } else {
                                            activityRegisterBinding25 = activityRegisterBinding18;
                                        }
                                        activityRegisterBinding25.btnRegister.setEnabled(false);
                                        return;
                                    }
                                }
                                activityRegisterBinding13 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                                if (activityRegisterBinding13 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    activityRegisterBinding13 = null;
                                }
                                activityRegisterBinding13.tvError.setText(com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_220));
                                activityRegisterBinding14 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                                if (activityRegisterBinding14 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    activityRegisterBinding25 = activityRegisterBinding14;
                                }
                                activityRegisterBinding25.btnRegister.setEnabled(false);
                                return;
                            }
                        }
                    }
                    activityRegisterBinding8 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                    if (activityRegisterBinding8 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityRegisterBinding8 = null;
                    }
                    activityRegisterBinding8.tvError.setText(com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_219));
                    activityRegisterBinding9 = com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this.binding;
                    if (activityRegisterBinding9 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityRegisterBinding25 = activityRegisterBinding9;
                    }
                    activityRegisterBinding25.btnRegister.setEnabled(false);
                }
            }
        });
        getRegisterViewModel().getRegisterUI().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.mine.register.RegisterActivity$$ExternalSyntheticLambda3
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.m1317setupViews$lambda6$lambda5(com.qcwireless.qcwatch.ui.mine.register.RegisterActivity.this, (com.qcwireless.qcwatch.ui.base.repository.mine.NetState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-6$lambda-0, reason: not valid java name */
    public static final void m1315setupViews$lambda6$lambda0(com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityRegisterBinding, "$this_run");
        if (z) {
            activityRegisterBinding.userPwd.setTransformationMethod(android.text.method.HideReturnsTransformationMethod.getInstance());
            activityRegisterBinding.userPwd.setSelection(activityRegisterBinding.userPwd.length());
        } else {
            activityRegisterBinding.userPwd.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
            activityRegisterBinding.userPwd.setSelection(activityRegisterBinding.userPwd.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-6$lambda-1, reason: not valid java name */
    public static final void m1316setupViews$lambda6$lambda1(com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityRegisterBinding, "$this_run");
        if (z) {
            activityRegisterBinding.userPwdAgain.setTransformationMethod(android.text.method.HideReturnsTransformationMethod.getInstance());
            activityRegisterBinding.userPwdAgain.setSelection(activityRegisterBinding.userPwdAgain.length());
        } else {
            activityRegisterBinding.userPwdAgain.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
            activityRegisterBinding.userPwdAgain.setSelection(activityRegisterBinding.userPwdAgain.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-6$lambda-5, reason: not valid java name */
    public static final void m1317setupViews$lambda6$lambda5(com.qcwireless.qcwatch.ui.mine.register.RegisterActivity registerActivity, com.qcwireless.qcwatch.ui.base.repository.mine.NetState netState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registerActivity, "this$0");
        if (netState.getIsLoading()) {
            registerActivity.showLoadingDialog();
        } else {
            registerActivity.dismissLoadingDialog();
        }
        int retCode = netState.getRetCode();
        if (retCode != 0) {
            if (retCode != 50004) {
                return;
            }
            com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding = registerActivity.binding;
            if (activityRegisterBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityRegisterBinding = null;
            }
            activityRegisterBinding.tvError.setText(registerActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_226));
            java.lang.String string = registerActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_226);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_226)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLoginStatus(true);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.ui.base.bean.mine.MineActivityFinish(1));
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.LoginSuccessEvent());
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.RefreshEvent(com.qcwireless.qcwatch.ui.mine.MineFragment.class));
        java.lang.String string2 = registerActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_510);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_510)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
        android.app.Activity activity = (android.app.Activity) registerActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.class);
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
        registerActivity.finish();
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
    /* renamed from: emptyInputFilter$lambda-7, reason: not valid java name */
    public static final java.lang.CharSequence m1314emptyInputFilter$lambda7(com.qcwireless.qcwatch.ui.mine.register.RegisterActivity registerActivity, java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registerActivity, "this$0");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(charSequence, " ")) {
            return charSequence;
        }
        com.qcwireless.qcwatch.databinding.ActivityRegisterBinding activityRegisterBinding = registerActivity.binding;
        if (activityRegisterBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityRegisterBinding = null;
        }
        activityRegisterBinding.tvError.setText(registerActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_284));
        return "";
    }
}
