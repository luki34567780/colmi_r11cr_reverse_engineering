package com.qcwireless.qcwatch.ui.mine.findpwd;

/* compiled from: ForgetPwdActivity.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/findpwd/ForgetPwdActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityForgetPwdBinding;", "emptyInputFilter", "Landroid/text/InputFilter;", "handler", "Landroid/os/Handler;", "index", "", "inputFilter", "viewModel", "Lcom/qcwireless/qcwatch/ui/mine/findpwd/ForgetPwdViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/mine/findpwd/ForgetPwdViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "secondsDown", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ForgetPwdActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding binding;
    private android.text.InputFilter emptyInputFilter;
    private final android.os.Handler handler;
    private final int index = 60;
    private android.text.InputFilter inputFilter;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public ForgetPwdActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel>() { // from class: com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel m1295invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
        this.emptyInputFilter = new android.text.InputFilter() { // from class: com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity$$ExternalSyntheticLambda0
            @Override // android.text.InputFilter
            public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
                java.lang.CharSequence m1291emptyInputFilter$lambda7;
                m1291emptyInputFilter$lambda7 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.m1291emptyInputFilter$lambda7(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this, charSequence, i, i2, spanned, i3, i4);
                return m1291emptyInputFilter$lambda7;
            }
        };
        this.inputFilter = new android.text.InputFilter() { // from class: com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity$inputFilter$1
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding inflate = com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding.inflate(getLayoutInflater());
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
        final com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding2 = null;
        if (activityForgetPwdBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityForgetPwdBinding = null;
        }
        activityForgetPwdBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_179));
        activityForgetPwdBinding.userEmail.setText(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUserEmail());
        activityForgetPwdBinding.imgPwdNew.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.m1292setupViews$lambda5$lambda0(com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding.this, compoundButton, z);
            }
        });
        activityForgetPwdBinding.imgPwdConfirm.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity$$ExternalSyntheticLambda2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.m1293setupViews$lambda5$lambda1(com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding.this, compoundButton, z);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding3 = this.binding;
        if (activityForgetPwdBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityForgetPwdBinding3 = null;
        }
        activityForgetPwdBinding3.sendCode.setClickable(true);
        activityForgetPwdBinding.userEmail.setFilters(new android.text.InputFilter[]{this.inputFilter, this.emptyInputFilter, new android.text.InputFilter.LengthFilter(60)});
        activityForgetPwdBinding.userPwdNew.setFilters(new android.text.InputFilter[]{this.inputFilter, this.emptyInputFilter, new android.text.InputFilter.LengthFilter(60)});
        activityForgetPwdBinding.userPwdConfirm.setFilters(new android.text.InputFilter[]{this.inputFilter, this.emptyInputFilter, new android.text.InputFilter.LengthFilter(60)});
        android.widget.EditText editText = activityForgetPwdBinding.userEmail;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText, "userEmail");
        editText.addTextChangedListener(new android.text.TextWatcher() { // from class: com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity$setupViews$lambda-5$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable s) {
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding4;
                activityForgetPwdBinding4 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding4 = null;
                }
                activityForgetPwdBinding4.tvError.setText("");
            }
        });
        android.widget.EditText editText2 = activityForgetPwdBinding.userPwdNew;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText2, "userPwdNew");
        editText2.addTextChangedListener(new android.text.TextWatcher() { // from class: com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity$setupViews$lambda-5$$inlined$doAfterTextChanged$2
            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable s) {
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding4;
                activityForgetPwdBinding4 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding4 = null;
                }
                activityForgetPwdBinding4.tvError.setText("");
            }
        });
        android.widget.EditText editText3 = activityForgetPwdBinding.userPwdConfirm;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText3, "userPwdConfirm");
        editText3.addTextChangedListener(new android.text.TextWatcher() { // from class: com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity$setupViews$lambda-5$$inlined$doAfterTextChanged$3
            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable s) {
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding4;
                activityForgetPwdBinding4 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding4 = null;
                }
                activityForgetPwdBinding4.tvError.setText("");
            }
        });
        android.view.View[] viewArr = new android.view.View[2];
        com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding4 = this.binding;
        if (activityForgetPwdBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityForgetPwdBinding4 = null;
        }
        viewArr[0] = activityForgetPwdBinding4.sendCode;
        com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding5 = this.binding;
        if (activityForgetPwdBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityForgetPwdBinding2 = activityForgetPwdBinding5;
        }
        viewArr[1] = activityForgetPwdBinding2.btnConfirm;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity$setupViews$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding6;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding7;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding8;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding9;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding10;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding11;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding12;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding13;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding14;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding15;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding16;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding17;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding18;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding19;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding20;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding21;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding22;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding23;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding24;
                com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel viewModel;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding25;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding26;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding27;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding28;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding29;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding30;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding31;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding32;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding33;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding34;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding35;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding36;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding37;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding38;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding39;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding40;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding41;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding42;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding43;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding44;
                com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel viewModel2;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding45;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding46;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding47;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding48;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding49;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityForgetPwdBinding6 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding50 = null;
                if (activityForgetPwdBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding6 = null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityForgetPwdBinding6.sendCode)) {
                    activityForgetPwdBinding7 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                    if (activityForgetPwdBinding7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityForgetPwdBinding7 = null;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityForgetPwdBinding7.btnConfirm)) {
                        if (!com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isNetworkAvailable((android.content.Context) com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this)) {
                            activityForgetPwdBinding30 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                            if (activityForgetPwdBinding30 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityForgetPwdBinding50 = activityForgetPwdBinding30;
                            }
                            activityForgetPwdBinding50.tvError.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_223));
                            return;
                        }
                        final com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity forgetPwdActivity = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this;
                        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(view, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity$setupViews$2.2
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
                                final com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity forgetPwdActivity2 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this;
                                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(view2, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.setupViews.2.2.1
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                        invoke((android.view.View) obj);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(android.view.View view3) {
                                        com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding51;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view3, "$this$ktxRunOnUi");
                                        activityForgetPwdBinding51 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                                        if (activityForgetPwdBinding51 == null) {
                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                            activityForgetPwdBinding51 = null;
                                        }
                                        activityForgetPwdBinding51.tvError.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_223));
                                    }
                                });
                            }
                        });
                        activityForgetPwdBinding8 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                        if (activityForgetPwdBinding8 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityForgetPwdBinding8 = null;
                        }
                        java.lang.String obj = activityForgetPwdBinding8.userPwdNew.getText().toString();
                        activityForgetPwdBinding9 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                        if (activityForgetPwdBinding9 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityForgetPwdBinding9 = null;
                        }
                        java.lang.String obj2 = activityForgetPwdBinding9.userPwdConfirm.getText().toString();
                        activityForgetPwdBinding10 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                        if (activityForgetPwdBinding10 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityForgetPwdBinding10 = null;
                        }
                        java.lang.String obj3 = activityForgetPwdBinding10.etVerifyCode.getText().toString();
                        activityForgetPwdBinding11 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                        if (activityForgetPwdBinding11 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityForgetPwdBinding11 = null;
                        }
                        android.text.Editable text = activityForgetPwdBinding11.userEmail.getText();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text, "binding.userEmail.text");
                        java.lang.String replace = new kotlin.text.Regex("\\s").replace(text, "");
                        if (replace.length() == 0) {
                            activityForgetPwdBinding29 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                            if (activityForgetPwdBinding29 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityForgetPwdBinding29 = null;
                            }
                            activityForgetPwdBinding29.tvError.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_162));
                            java.lang.String string = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_162);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_162)");
                            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                            return;
                        }
                        activityForgetPwdBinding12 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                        if (activityForgetPwdBinding12 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityForgetPwdBinding12 = null;
                        }
                        activityForgetPwdBinding12.tvError.setText("");
                        if (obj3.length() == 0) {
                            activityForgetPwdBinding28 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                            if (activityForgetPwdBinding28 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityForgetPwdBinding28 = null;
                            }
                            activityForgetPwdBinding28.tvError.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_176));
                            java.lang.String string2 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_176);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_176)");
                            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
                            return;
                        }
                        activityForgetPwdBinding13 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                        if (activityForgetPwdBinding13 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityForgetPwdBinding13 = null;
                        }
                        activityForgetPwdBinding13.tvError.setText("");
                        java.lang.String str = obj;
                        if (str.length() == 0) {
                            activityForgetPwdBinding27 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                            if (activityForgetPwdBinding27 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityForgetPwdBinding27 = null;
                            }
                            activityForgetPwdBinding27.tvError.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_177));
                            java.lang.String string3 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_177);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_177)");
                            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string3, 0, 1, null);
                            return;
                        }
                        activityForgetPwdBinding14 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                        if (activityForgetPwdBinding14 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityForgetPwdBinding14 = null;
                        }
                        activityForgetPwdBinding14.tvError.setText("");
                        java.lang.String str2 = obj2;
                        if (str2.length() == 0) {
                            activityForgetPwdBinding26 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                            if (activityForgetPwdBinding26 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityForgetPwdBinding26 = null;
                            }
                            activityForgetPwdBinding26.tvError.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_178));
                            java.lang.String string4 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_177);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_177)");
                            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string4, 0, 1, null);
                            return;
                        }
                        activityForgetPwdBinding15 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                        if (activityForgetPwdBinding15 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityForgetPwdBinding15 = null;
                        }
                        activityForgetPwdBinding15.btnConfirm.setEnabled(true);
                        activityForgetPwdBinding16 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                        if (activityForgetPwdBinding16 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityForgetPwdBinding16 = null;
                        }
                        activityForgetPwdBinding16.tvError.setText("");
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2)) {
                            activityForgetPwdBinding25 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                            if (activityForgetPwdBinding25 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityForgetPwdBinding25 = null;
                            }
                            activityForgetPwdBinding25.tvError.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_234));
                            java.lang.String string5 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_234);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.qc_text_234)");
                            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string5, 0, 1, null);
                            return;
                        }
                        activityForgetPwdBinding17 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                        if (activityForgetPwdBinding17 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityForgetPwdBinding17 = null;
                        }
                        activityForgetPwdBinding17.btnConfirm.setEnabled(true);
                        activityForgetPwdBinding18 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                        if (activityForgetPwdBinding18 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityForgetPwdBinding18 = null;
                        }
                        activityForgetPwdBinding18.tvError.setText("");
                        java.lang.String replace2 = new kotlin.text.Regex("\\s").replace(str, "");
                        if (replace2.length() < 6 || replace2.length() > 12) {
                            activityForgetPwdBinding19 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                            if (activityForgetPwdBinding19 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityForgetPwdBinding50 = activityForgetPwdBinding19;
                            }
                            activityForgetPwdBinding50.tvError.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_220));
                            return;
                        }
                        activityForgetPwdBinding20 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                        if (activityForgetPwdBinding20 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityForgetPwdBinding20 = null;
                        }
                        activityForgetPwdBinding20.btnConfirm.setEnabled(true);
                        activityForgetPwdBinding21 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                        if (activityForgetPwdBinding21 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityForgetPwdBinding21 = null;
                        }
                        activityForgetPwdBinding21.tvError.setText("");
                        java.lang.String replace3 = new kotlin.text.Regex("\\s").replace(str2, "");
                        if (replace3.length() < 6 || replace3.length() > 12) {
                            activityForgetPwdBinding22 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                            if (activityForgetPwdBinding22 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityForgetPwdBinding50 = activityForgetPwdBinding22;
                            }
                            activityForgetPwdBinding50.tvError.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_220));
                            return;
                        }
                        activityForgetPwdBinding23 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                        if (activityForgetPwdBinding23 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityForgetPwdBinding23 = null;
                        }
                        activityForgetPwdBinding23.btnConfirm.setEnabled(true);
                        activityForgetPwdBinding24 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                        if (activityForgetPwdBinding24 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityForgetPwdBinding50 = activityForgetPwdBinding24;
                        }
                        activityForgetPwdBinding50.tvError.setText("");
                        viewModel = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getViewModel();
                        viewModel.resetPwd(obj3, replace, com.qcwireless.qcwatch.ui.base.util.MD5UtilKt.encode(replace3));
                        return;
                    }
                    return;
                }
                if (!com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isNetworkAvailable((android.content.Context) com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this)) {
                    activityForgetPwdBinding49 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                    if (activityForgetPwdBinding49 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityForgetPwdBinding50 = activityForgetPwdBinding49;
                    }
                    activityForgetPwdBinding50.tvError.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_223));
                    return;
                }
                final com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity forgetPwdActivity2 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(view, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity$setupViews$2.1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj4) {
                        invoke((android.view.View) obj4);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(android.view.View view2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "$this$ktxRunOnBgSingle");
                        if (com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isOnline()) {
                            return;
                        }
                        final com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity forgetPwdActivity3 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this;
                        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(view2, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.setupViews.2.1.1
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj4) {
                                invoke((android.view.View) obj4);
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(android.view.View view3) {
                                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding51;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view3, "$this$ktxRunOnUi");
                                activityForgetPwdBinding51 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                                if (activityForgetPwdBinding51 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    activityForgetPwdBinding51 = null;
                                }
                                activityForgetPwdBinding51.tvError.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_223));
                            }
                        });
                    }
                });
                activityForgetPwdBinding31 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding31 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding31 = null;
                }
                android.text.Editable text2 = activityForgetPwdBinding31.userEmail.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text2, "binding.userEmail.text");
                if (!kotlin.text.StringsKt.contains$default(text2, "@", false, 2, (java.lang.Object) null)) {
                    activityForgetPwdBinding48 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                    if (activityForgetPwdBinding48 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityForgetPwdBinding50 = activityForgetPwdBinding48;
                    }
                    activityForgetPwdBinding50.tvError.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_219));
                    return;
                }
                activityForgetPwdBinding32 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding32 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding32 = null;
                }
                activityForgetPwdBinding32.tvError.setText("");
                activityForgetPwdBinding33 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding33 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding33 = null;
                }
                android.text.Editable text3 = activityForgetPwdBinding33.userEmail.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text3, "binding.userEmail.text");
                android.text.Editable editable = text3;
                activityForgetPwdBinding34 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding34 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding34 = null;
                }
                android.text.Editable text4 = activityForgetPwdBinding34.userEmail.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text4, "binding.userEmail.text");
                java.lang.String obj4 = editable.subSequence(0, kotlin.text.StringsKt.indexOf$default(text4, "@", 0, false, 4, (java.lang.Object) null)).toString();
                if ((obj4.length() == 0) || obj4.length() < 2) {
                    activityForgetPwdBinding35 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                    if (activityForgetPwdBinding35 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityForgetPwdBinding50 = activityForgetPwdBinding35;
                    }
                    activityForgetPwdBinding50.tvError.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_219));
                    return;
                }
                activityForgetPwdBinding36 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding36 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding36 = null;
                }
                activityForgetPwdBinding36.tvError.setText("");
                activityForgetPwdBinding37 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding37 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding37 = null;
                }
                android.text.Editable text5 = activityForgetPwdBinding37.userEmail.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text5, "binding.userEmail.text");
                android.text.Editable editable2 = text5;
                activityForgetPwdBinding38 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding38 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding38 = null;
                }
                android.text.Editable text6 = activityForgetPwdBinding38.userEmail.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text6, "binding.userEmail.text");
                int indexOf$default = kotlin.text.StringsKt.indexOf$default(text6, "@", 0, false, 4, (java.lang.Object) null);
                activityForgetPwdBinding39 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding39 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding39 = null;
                }
                java.lang.String obj5 = editable2.subSequence(indexOf$default, activityForgetPwdBinding39.userEmail.getText().length()).toString();
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, obj5);
                if ((obj5.length() == 0) || obj5.length() <= 1) {
                    activityForgetPwdBinding40 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                    if (activityForgetPwdBinding40 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityForgetPwdBinding50 = activityForgetPwdBinding40;
                    }
                    activityForgetPwdBinding50.tvError.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_219));
                    return;
                }
                activityForgetPwdBinding41 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding41 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding41 = null;
                }
                activityForgetPwdBinding41.tvError.setText("");
                activityForgetPwdBinding42 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding42 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding42 = null;
                }
                android.text.Editable text7 = activityForgetPwdBinding42.userEmail.getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text7, "binding.userEmail.text");
                java.lang.String replace4 = new kotlin.text.Regex("\\s").replace(text7, "");
                if (replace4.length() == 0) {
                    activityForgetPwdBinding45 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                    if (activityForgetPwdBinding45 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityForgetPwdBinding45 = null;
                    }
                    activityForgetPwdBinding45.tvError.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_162));
                    java.lang.String string6 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_162);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.qc_text_162)");
                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string6, 0, 1, null);
                    activityForgetPwdBinding46 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                    if (activityForgetPwdBinding46 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityForgetPwdBinding46 = null;
                    }
                    activityForgetPwdBinding46.sendCode.setClickable(true);
                    activityForgetPwdBinding47 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                    if (activityForgetPwdBinding47 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityForgetPwdBinding50 = activityForgetPwdBinding47;
                    }
                    activityForgetPwdBinding50.sendCode.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_174));
                    return;
                }
                activityForgetPwdBinding43 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding43 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding43 = null;
                }
                activityForgetPwdBinding43.tvError.setText("");
                activityForgetPwdBinding44 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding44 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityForgetPwdBinding50 = activityForgetPwdBinding44;
                }
                activityForgetPwdBinding50.sendCode.setClickable(false);
                viewModel2 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getViewModel();
                viewModel2.sendVerifyCode(replace4);
            }
        });
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity$$ExternalSyntheticLambda3
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.m1294setupViews$lambda6(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this, (com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel.ForgetPwdUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-5$lambda-0, reason: not valid java name */
    public static final void m1292setupViews$lambda5$lambda0(com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityForgetPwdBinding, "$this_run");
        if (z) {
            activityForgetPwdBinding.userPwdNew.setTransformationMethod(android.text.method.HideReturnsTransformationMethod.getInstance());
            activityForgetPwdBinding.userPwdNew.setSelection(activityForgetPwdBinding.userPwdNew.length());
        } else {
            activityForgetPwdBinding.userPwdNew.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
            activityForgetPwdBinding.userPwdNew.setSelection(activityForgetPwdBinding.userPwdNew.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-5$lambda-1, reason: not valid java name */
    public static final void m1293setupViews$lambda5$lambda1(com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityForgetPwdBinding, "$this_run");
        if (z) {
            activityForgetPwdBinding.userPwdConfirm.setTransformationMethod(android.text.method.HideReturnsTransformationMethod.getInstance());
            activityForgetPwdBinding.userPwdConfirm.setSelection(activityForgetPwdBinding.userPwdConfirm.length());
        } else {
            activityForgetPwdBinding.userPwdConfirm.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
            activityForgetPwdBinding.userPwdConfirm.setSelection(activityForgetPwdBinding.userPwdConfirm.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-6, reason: not valid java name */
    public static final void m1294setupViews$lambda6(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity forgetPwdActivity, com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel.ForgetPwdUI forgetPwdUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(forgetPwdActivity, "this$0");
        if (forgetPwdUI.isLoading()) {
            forgetPwdActivity.showLoadingDialog();
        } else {
            forgetPwdActivity.dismissLoadingDialog();
        }
        int type = forgetPwdUI.getType();
        if (type == 1) {
            forgetPwdActivity.secondsDown();
            java.lang.String string = forgetPwdActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_233);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_233)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        if (type == 2) {
            java.lang.String string2 = forgetPwdActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_235);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_235)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
            forgetPwdActivity.finish();
            return;
        }
        if (type == 10002) {
            com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding = forgetPwdActivity.binding;
            if (activityForgetPwdBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityForgetPwdBinding = null;
            }
            activityForgetPwdBinding.sendCode.setClickable(true);
            java.lang.String string3 = forgetPwdActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_289);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_289)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string3, 0, 1, null);
            return;
        }
        if (type == 50005) {
            com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding2 = forgetPwdActivity.binding;
            if (activityForgetPwdBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityForgetPwdBinding2 = null;
            }
            activityForgetPwdBinding2.sendCode.setClickable(true);
            java.lang.String string4 = forgetPwdActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_273);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_273)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string4, 0, 1, null);
            return;
        }
        if (type == 50012) {
            com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding3 = forgetPwdActivity.binding;
            if (activityForgetPwdBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityForgetPwdBinding3 = null;
            }
            activityForgetPwdBinding3.sendCode.setClickable(true);
            java.lang.String string5 = forgetPwdActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_272);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.qc_text_272)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string5, 0, 1, null);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding4 = forgetPwdActivity.binding;
        if (activityForgetPwdBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityForgetPwdBinding4 = null;
        }
        activityForgetPwdBinding4.sendCode.setClickable(true);
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(forgetPwdActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_288) + ':' + forgetPwdUI.getType(), 0, 1, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity$secondsDown$1] */
    private final void secondsDown() {
        final long j = 60000;
        new android.os.CountDownTimer(j) { // from class: com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity$secondsDown$1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding2;
                activityForgetPwdBinding = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding3 = null;
                if (activityForgetPwdBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding = null;
                }
                activityForgetPwdBinding.sendCode.setClickable(true);
                activityForgetPwdBinding2 = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityForgetPwdBinding3 = activityForgetPwdBinding2;
                }
                activityForgetPwdBinding3.sendCode.setText(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_174));
            }

            @Override // android.os.CountDownTimer
            public void onTick(long p0) {
                com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding;
                activityForgetPwdBinding = com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity.this.binding;
                if (activityForgetPwdBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityForgetPwdBinding = null;
                }
                android.widget.TextView textView = activityForgetPwdBinding.sendCode;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(p0 / 1000);
                sb.append('s');
                textView.setText(sb.toString());
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: emptyInputFilter$lambda-7, reason: not valid java name */
    public static final java.lang.CharSequence m1291emptyInputFilter$lambda7(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdActivity forgetPwdActivity, java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(forgetPwdActivity, "this$0");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(charSequence, " ")) {
            return charSequence;
        }
        com.qcwireless.qcwatch.databinding.ActivityForgetPwdBinding activityForgetPwdBinding = forgetPwdActivity.binding;
        if (activityForgetPwdBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityForgetPwdBinding = null;
        }
        activityForgetPwdBinding.tvError.setText(forgetPwdActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_284));
        return "";
    }
}
