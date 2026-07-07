package com.qcwireless.qcwatch.ui.mine.ucenter;

/* compiled from: FirstProfileActivity.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\bJ\b\u0010\u001b\u001a\u00020\u0013H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/ucenter/FirstProfileActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/mine/ucenter/adapter/TabPageAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityFirstProfileBinding;", "currItem", "", "fragments", "", "Landroidx/fragment/app/Fragment;", "viewModel", "Lcom/qcwireless/qcwatch/ui/mine/ucenter/FirstProfileViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/mine/ucenter/FirstProfileViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "setCurrItem", "position", "setupViews", "MyOnPageChangeListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class FirstProfileActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.mine.ucenter.adapter.TabPageAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding binding;
    private int currItem;
    private final java.util.List<androidx.fragment.app.Fragment> fragments = new java.util.ArrayList();

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public FirstProfileActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel>() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel m1341invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel.class), qualifier, qualifier);
            }
        });
    }

    public final com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding inflate = com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding.inflate(getLayoutInflater());
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
        getViewModel().initNotLoginUserEntity();
        this.fragments.add(new com.qcwireless.qcwatch.ui.mine.ucenter.fragment.NickNameFragment());
        this.fragments.add(new com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment());
        this.fragments.add(new com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment());
        this.fragments.add(new com.qcwireless.qcwatch.ui.mine.ucenter.fragment.HeightFragment());
        this.fragments.add(new com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment());
        com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding2 = null;
        if (activityFirstProfileBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityFirstProfileBinding = null;
        }
        activityFirstProfileBinding.progressBar.setMax(100);
        com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding3 = this.binding;
        if (activityFirstProfileBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityFirstProfileBinding3 = null;
        }
        activityFirstProfileBinding3.progressBar.setProgress(20);
        this.adapter = new com.qcwireless.qcwatch.ui.mine.ucenter.adapter.TabPageAdapter(getSupportFragmentManager(), this.fragments);
        com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding4 = this.binding;
        if (activityFirstProfileBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityFirstProfileBinding4 = null;
        }
        com.qcwireless.qcwatch.ui.base.view.ucenter.NoScrollViewPager noScrollViewPager = activityFirstProfileBinding4.vp2;
        com.qcwireless.qcwatch.ui.mine.ucenter.adapter.TabPageAdapter tabPageAdapter = this.adapter;
        if (tabPageAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            tabPageAdapter = null;
        }
        noScrollViewPager.setAdapter((androidx.viewpager.widget.PagerAdapter) tabPageAdapter);
        com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding5 = this.binding;
        if (activityFirstProfileBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityFirstProfileBinding5 = null;
        }
        activityFirstProfileBinding5.vp2.addOnPageChangeListener(new com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.MyOnPageChangeListener());
        com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding6 = this.binding;
        if (activityFirstProfileBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityFirstProfileBinding6 = null;
        }
        activityFirstProfileBinding6.vp2.setCurrentItem(0);
        com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding7 = this.binding;
        if (activityFirstProfileBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityFirstProfileBinding7 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityFirstProfileBinding7.titleBar.ivNavigateBefore);
        com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding8 = this.binding;
        if (activityFirstProfileBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityFirstProfileBinding8 = null;
        }
        activityFirstProfileBinding8.titleBar.ivNavigateBefore.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.m1339setupViews$lambda0(com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding9 = this.binding;
        if (activityFirstProfileBinding9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityFirstProfileBinding2 = activityFirstProfileBinding9;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityFirstProfileBinding2.titleBar.ivNavigateBefore);
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityFirstProfileBinding2.titleBar.tvRightText);
        activityFirstProfileBinding2.titleBar.tvRightText.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_511));
        activityFirstProfileBinding2.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_151));
        activityFirstProfileBinding2.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.m1340setupViews$lambda3$lambda2(com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-0, reason: not valid java name */
    public static final void m1339setupViews$lambda0(com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity firstProfileActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstProfileActivity, "this$0");
        int i = firstProfileActivity.currItem;
        com.qcwireless.qcwatch.ui.mine.ucenter.adapter.TabPageAdapter tabPageAdapter = null;
        if (i == 1) {
            com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding = firstProfileActivity.binding;
            if (activityFirstProfileBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityFirstProfileBinding = null;
            }
            activityFirstProfileBinding.vp2.setCurrentItem(0);
        } else if (i == 2) {
            com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding2 = firstProfileActivity.binding;
            if (activityFirstProfileBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityFirstProfileBinding2 = null;
            }
            activityFirstProfileBinding2.vp2.setCurrentItem(1);
        } else if (i == 3) {
            com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding3 = firstProfileActivity.binding;
            if (activityFirstProfileBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityFirstProfileBinding3 = null;
            }
            activityFirstProfileBinding3.vp2.setCurrentItem(2);
        } else if (i == 4) {
            com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding4 = firstProfileActivity.binding;
            if (activityFirstProfileBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityFirstProfileBinding4 = null;
            }
            activityFirstProfileBinding4.vp2.setCurrentItem(3);
        }
        com.qcwireless.qcwatch.ui.mine.ucenter.adapter.TabPageAdapter tabPageAdapter2 = firstProfileActivity.adapter;
        if (tabPageAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            tabPageAdapter = tabPageAdapter2;
        }
        tabPageAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-3$lambda-2, reason: not valid java name */
    public static final void m1340setupViews$lambda3$lambda2(com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity firstProfileActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstProfileActivity, "this$0");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("firstOrNot", 1);
        firstProfileActivity.getViewModel().execUserInfoToDevice(0, 26, 175, 60);
        com.oudmon.ble.base.communication.LargeDataHandler.getInstance().setDeviceNickName("");
        android.app.Activity activity = (android.app.Activity) firstProfileActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.class);
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

    public final void setCurrItem(int position) {
        com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding = this.binding;
        com.qcwireless.qcwatch.ui.mine.ucenter.adapter.TabPageAdapter tabPageAdapter = null;
        if (activityFirstProfileBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityFirstProfileBinding = null;
        }
        activityFirstProfileBinding.vp2.setCurrentItem(position);
        com.qcwireless.qcwatch.ui.mine.ucenter.adapter.TabPageAdapter tabPageAdapter2 = this.adapter;
        if (tabPageAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            tabPageAdapter = tabPageAdapter2;
        }
        tabPageAdapter.notifyDataSetChanged();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.FinishFirstSettingEvent) {
            finish();
        }
    }

    /* compiled from: FirstProfileActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/ucenter/FirstProfileActivity$MyOnPageChangeListener;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "(Lcom/qcwireless/qcwatch/ui/mine/ucenter/FirstProfileActivity;)V", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyOnPageChangeListener implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        public void onPageScrollStateChanged(int state) {
        }

        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        public MyOnPageChangeListener() {
        }

        public void onPageSelected(int position) {
            com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.this.currItem = position;
            if (position == 0) {
                final com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity firstProfileActivity = com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.MyOnPageChangeListener, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity$MyOnPageChangeListener$onPageSelected$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.MyOnPageChangeListener) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.MyOnPageChangeListener myOnPageChangeListener) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myOnPageChangeListener, "$this$ktxRunOnUi");
                        com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding = com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.this.binding;
                        com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding2 = null;
                        if (activityFirstProfileBinding == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityFirstProfileBinding = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.invisible(activityFirstProfileBinding.titleBar.ivNavigateBefore);
                        com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding3 = com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.this.binding;
                        if (activityFirstProfileBinding3 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityFirstProfileBinding2 = activityFirstProfileBinding3;
                        }
                        activityFirstProfileBinding2.progressBar.setProgress(20);
                    }
                });
                return;
            }
            com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding = null;
            if (position == 1) {
                com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding2 = com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.this.binding;
                if (activityFirstProfileBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityFirstProfileBinding = activityFirstProfileBinding2;
                }
                activityFirstProfileBinding.progressBar.setProgress(40);
                return;
            }
            if (position == 2) {
                com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding3 = com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.this.binding;
                if (activityFirstProfileBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityFirstProfileBinding = activityFirstProfileBinding3;
                }
                activityFirstProfileBinding.progressBar.setProgress(60);
                return;
            }
            if (position == 3) {
                com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding4 = com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.this.binding;
                if (activityFirstProfileBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityFirstProfileBinding = activityFirstProfileBinding4;
                }
                activityFirstProfileBinding.progressBar.setProgress(80);
                return;
            }
            if (position != 4) {
                return;
            }
            com.qcwireless.qcwatch.databinding.ActivityFirstProfileBinding activityFirstProfileBinding5 = com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.this.binding;
            if (activityFirstProfileBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityFirstProfileBinding = activityFirstProfileBinding5;
            }
            activityFirstProfileBinding.progressBar.setProgress(100);
        }
    }
}
