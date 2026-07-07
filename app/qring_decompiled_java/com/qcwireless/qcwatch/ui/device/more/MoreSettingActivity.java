package com.qcwireless.qcwatch.ui.device.more;

/* compiled from: MoreSettingActivity.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0014J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/more/MoreSettingActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityMoreSettingBinding;", "currNeedle", "", "moreSettingVm", "Lcom/qcwireless/qcwatch/ui/device/more/MoreSettingViewModel;", "getMoreSettingVm", "()Lcom/qcwireless/qcwatch/ui/device/more/MoreSettingViewModel;", "moreSettingVm$delegate", "Lkotlin/Lazy;", "screen", "totalNeedle", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "setupViews", "showFactoryDialog", "showRestartDialog", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MoreSettingActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityMoreSettingBinding binding;
    private int currNeedle;

    /* renamed from: moreSettingVm$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy moreSettingVm;
    private int screen = 5;
    private int totalNeedle = 1;

    public MoreSettingActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.moreSettingVm = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel m758invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel.class), qualifier, qualifier);
            }
        });
    }

    private final com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel getMoreSettingVm() {
        return (com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel) this.moreSettingVm.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityMoreSettingBinding inflate = com.qcwireless.qcwatch.databinding.ActivityMoreSettingBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        android.widget.LinearLayout root = inflate.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView(root);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        com.qcwireless.qcwatch.databinding.ActivityMoreSettingBinding activityMoreSettingBinding = null;
        try {
            java.lang.String oneKeySupport = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getOneKeySupport();
            if (oneKeySupport.length() > 0) {
                com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport>() { // from class: com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity$setupViews$$inlined$fromJson$1
                }.getType());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
                com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport oneKeySupport2 = (com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport) adapter.fromJson(oneKeySupport);
                if (oneKeySupport2 != null && oneKeySupport2.getSupportECard()) {
                    com.qcwireless.qcwatch.databinding.ActivityMoreSettingBinding activityMoreSettingBinding2 = this.binding;
                    if (activityMoreSettingBinding2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityMoreSettingBinding2 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) activityMoreSettingBinding2.qcMoreEcard);
                    com.qcwireless.qcwatch.databinding.ActivityMoreSettingBinding activityMoreSettingBinding3 = this.binding;
                    if (activityMoreSettingBinding3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityMoreSettingBinding3 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) activityMoreSettingBinding3.qcMoreScreen);
                    com.qcwireless.qcwatch.databinding.ActivityMoreSettingBinding activityMoreSettingBinding4 = this.binding;
                    if (activityMoreSettingBinding4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityMoreSettingBinding4 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone(activityMoreSettingBinding4.line1);
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        com.qcwireless.qcwatch.databinding.ActivityMoreSettingBinding activityMoreSettingBinding5 = this.binding;
        if (activityMoreSettingBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMoreSettingBinding = activityMoreSettingBinding5;
        }
        activityMoreSettingBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_20));
        activityMoreSettingBinding.qcMoreScreen.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity$setupViews$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
            }
        });
        activityMoreSettingBinding.qcMoreRestart.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity$setupViews$1$2
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity.this.showRestartDialog();
            }
        });
        activityMoreSettingBinding.qcMoreFactory.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity$setupViews$1$3
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity.this.showFactoryDialog();
            }
        });
        activityMoreSettingBinding.qcMoreEcard.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity$setupViews$1$4
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity.this;
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.more.ecard.ECardListActivity.class);
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
        getMoreSettingVm().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity$$ExternalSyntheticLambda4
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity.m753setupViews$lambda2(com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity.this, (com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel.MoreUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m753setupViews$lambda2(com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity moreSettingActivity, com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel.MoreUI moreUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moreSettingActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityMoreSettingBinding activityMoreSettingBinding = moreSettingActivity.binding;
        if (activityMoreSettingBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMoreSettingBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = activityMoreSettingBinding.qcMoreScreen;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(moreUI.getScreenSeconds());
        sb.append('s');
        qSettingItem.setRightText(sb.toString());
        moreSettingActivity.screen = moreUI.getScreenSeconds();
        moreSettingActivity.totalNeedle = moreUI.getTotalNeedle();
        moreSettingActivity.currNeedle = moreUI.getCurrNeedle();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if (!(messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) || ((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect()) {
            return;
        }
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        finish();
    }

    public final void showRestartDialog() {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_restart);
        objectRef.element = builder.create();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).show();
        android.view.View contentView = ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity.m756showRestartDialog$lambda3(objectRef, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity.m757showRestartDialog$lambda4(objectRef, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showRestartDialog$lambda-3, reason: not valid java name */
    public static final void m756showRestartDialog$lambda3(kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showRestartDialog$lambda-4, reason: not valid java name */
    public static final void m757showRestartDialog$lambda4(kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(new com.oudmon.ble.base.communication.req.SimpleKeyReq((byte) 8));
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    public final void showFactoryDialog() {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_factory);
        objectRef.element = builder.create();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).show();
        android.view.View contentView = ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity.m754showFactoryDialog$lambda5(objectRef, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity.m755showFactoryDialog$lambda6(com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity.this, objectRef, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showFactoryDialog$lambda-5, reason: not valid java name */
    public static final void m754showFactoryDialog$lambda5(kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showFactoryDialog$lambda-6, reason: not valid java name */
    public static final void m755showFactoryDialog$lambda6(com.qcwireless.qcwatch.ui.device.more.MoreSettingActivity moreSettingActivity, kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moreSettingActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(new com.oudmon.ble.base.communication.req.RestoreKeyReq((byte) -1));
        moreSettingActivity.getMoreSettingVm().cleanData();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }
}
