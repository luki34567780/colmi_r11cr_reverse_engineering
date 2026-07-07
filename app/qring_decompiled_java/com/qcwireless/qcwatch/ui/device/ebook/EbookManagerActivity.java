package com.qcwireless.qcwatch.ui.device.ebook;

/* compiled from: EbookManagerActivity.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0018H\u0014J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0017J\b\u0010\u001f\u001a\u00020\u0018H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/ebook/EbookManagerActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/device/ebook/adapter/EbookManagerListAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityEbookManagerBinding;", "currPosition", "", "deleteName", "", "editFlag", "", "handler", "Landroid/os/Handler;", "timeoutRunnable", "Lcom/qcwireless/qcwatch/ui/device/ebook/EbookManagerActivity$TimeoutRunnable;", "viewModel", "Lcom/qcwireless/qcwatch/ui/device/ebook/vm/EbookManagerViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/device/ebook/vm/EbookManagerViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "setupViews", "TimeoutRunnable", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class EbookManagerActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookManagerListAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding binding;
    private boolean editFlag;
    private final android.os.Handler handler;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private int currPosition = -1;
    private java.lang.String deleteName = "";
    private final com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.TimeoutRunnable timeoutRunnable = new com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.TimeoutRunnable();

    public EbookManagerActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.ebook.vm.EbookManagerViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.ebook.vm.EbookManagerViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.ebook.vm.EbookManagerViewModel m723invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.ebook.vm.EbookManagerViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.ebook.vm.EbookManagerViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.device.ebook.vm.EbookManagerViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding inflate = com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding.inflate(getLayoutInflater());
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
        android.view.View[] viewArr = new android.view.View[2];
        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding = this.binding;
        com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookManagerListAdapter ebookManagerListAdapter = null;
        if (activityEbookManagerBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookManagerBinding = null;
        }
        viewArr[0] = activityEbookManagerBinding.btnEbook;
        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding2 = this.binding;
        if (activityEbookManagerBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookManagerBinding2 = null;
        }
        viewArr[1] = activityEbookManagerBinding2.btnAddMusic;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding3;
                com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding4;
                boolean areEqual;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityEbookManagerBinding3 = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this.binding;
                com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding5 = null;
                if (activityEbookManagerBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityEbookManagerBinding3 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityEbookManagerBinding3.btnEbook)) {
                    areEqual = true;
                } else {
                    activityEbookManagerBinding4 = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this.binding;
                    if (activityEbookManagerBinding4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityEbookManagerBinding5 = activityEbookManagerBinding4;
                    }
                    areEqual = kotlin.jvm.internal.Intrinsics.areEqual(view, activityEbookManagerBinding5.btnAddMusic);
                }
                if (areEqual) {
                    android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this;
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.ebook.EbookSelectActivity.class);
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
        android.content.Context context = (android.content.Context) this;
        com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookManagerListAdapter ebookManagerListAdapter2 = new com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookManagerListAdapter(context, getViewModel().getDeviceEbookList());
        this.adapter = ebookManagerListAdapter2;
        ebookManagerListAdapter2.setSelectMode(com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.SelectMode.SINGLE_SELECT);
        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding3 = this.binding;
        if (activityEbookManagerBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookManagerBinding3 = null;
        }
        activityEbookManagerBinding3.rcvDeviceEbookList.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(context, 3));
        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding4 = this.binding;
        if (activityEbookManagerBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookManagerBinding4 = null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = activityEbookManagerBinding4.rcvDeviceEbookList;
        com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookManagerListAdapter ebookManagerListAdapter3 = this.adapter;
        if (ebookManagerListAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            ebookManagerListAdapter3 = null;
        }
        recyclerView.setAdapter(ebookManagerListAdapter3);
        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding5 = this.binding;
        if (activityEbookManagerBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookManagerBinding5 = null;
        }
        activityEbookManagerBinding5.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_554));
        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding6 = this.binding;
        if (activityEbookManagerBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookManagerBinding6 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityEbookManagerBinding6.titleBar.tvRightText);
        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding7 = this.binding;
        if (activityEbookManagerBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookManagerBinding7 = null;
        }
        activityEbookManagerBinding7.titleBar.tvRightText.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_542));
        com.oudmon.ble.base.communication.file.EbookHandle.getInstance().initRegister();
        com.oudmon.ble.base.communication.file.EbookHandle.getInstance().clearCallback();
        com.oudmon.ble.base.communication.file.EbookHandle.getInstance().registerCallback(new com.oudmon.ble.base.communication.file.IEbookCallback() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2
            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onFileNames(final java.util.ArrayList<java.lang.String> fileNames) {
                if (fileNames != null) {
                    final com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity ebookManagerActivity = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2$onFileNames$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2 ebookManagerActivity$setupViews$2) {
                            com.qcwireless.qcwatch.ui.device.ebook.vm.EbookManagerViewModel viewModel;
                            com.qcwireless.qcwatch.ui.device.ebook.vm.EbookManagerViewModel viewModel2;
                            com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding8;
                            com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookManagerListAdapter ebookManagerListAdapter4;
                            com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding9;
                            com.qcwireless.qcwatch.ui.device.ebook.vm.EbookManagerViewModel viewModel3;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookManagerActivity$setupViews$2, "$this$ktxRunOnUi");
                            viewModel = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this.getViewModel();
                            viewModel.getDeviceEbookList().clear();
                            java.util.ArrayList<java.lang.String> arrayList = fileNames;
                            com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity ebookManagerActivity2 = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this;
                            for (java.lang.String str : arrayList) {
                                com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook ebook = new com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook();
                                ebook.setEditEbook(false);
                                ebook.setName(str);
                                viewModel3 = ebookManagerActivity2.getViewModel();
                                viewModel3.getDeviceEbookList().add(ebook);
                            }
                            viewModel2 = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this.getViewModel();
                            com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookManagerListAdapter ebookManagerListAdapter5 = null;
                            if (viewModel2.getDeviceEbookList().size() == 0) {
                                activityEbookManagerBinding9 = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this.binding;
                                if (activityEbookManagerBinding9 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    activityEbookManagerBinding9 = null;
                                }
                                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityEbookManagerBinding9.noEbook);
                            } else {
                                activityEbookManagerBinding8 = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this.binding;
                                if (activityEbookManagerBinding8 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    activityEbookManagerBinding8 = null;
                                }
                                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityEbookManagerBinding8.noEbook);
                            }
                            ebookManagerListAdapter4 = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this.adapter;
                            if (ebookManagerListAdapter4 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            } else {
                                ebookManagerListAdapter5 = ebookManagerListAdapter4;
                            }
                            ebookManagerListAdapter5.notifyDataSetChanged();
                        }
                    });
                }
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onProgress(final float percent) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Float.valueOf(percent));
                final com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity ebookManagerActivity = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2$onProgress$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2 ebookManagerActivity$setupViews$2) {
                        android.os.Handler handler;
                        com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.TimeoutRunnable timeoutRunnable;
                        android.os.Handler handler2;
                        com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.TimeoutRunnable timeoutRunnable2;
                        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding8;
                        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding9;
                        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding10;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookManagerActivity$setupViews$2, "$this$ktxRunOnUi");
                        if (percent >= 0.0f) {
                            if (!ebookManagerActivity.isDialogShowing()) {
                                ebookManagerActivity.showLoadingDialogTimeoutNotCancel(80000);
                            }
                            handler = ebookManagerActivity.handler;
                            timeoutRunnable = ebookManagerActivity.timeoutRunnable;
                            handler.removeCallbacks(timeoutRunnable);
                            handler2 = ebookManagerActivity.handler;
                            timeoutRunnable2 = ebookManagerActivity.timeoutRunnable;
                            handler2.postDelayed(timeoutRunnable2, 10000L);
                            activityEbookManagerBinding8 = ebookManagerActivity.binding;
                            com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding11 = null;
                            if (activityEbookManagerBinding8 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityEbookManagerBinding8 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityEbookManagerBinding8.ctlProgress);
                            activityEbookManagerBinding9 = ebookManagerActivity.binding;
                            if (activityEbookManagerBinding9 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityEbookManagerBinding9 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.invisible(activityEbookManagerBinding9.tvTitle2);
                            activityEbookManagerBinding10 = ebookManagerActivity.binding;
                            if (activityEbookManagerBinding10 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityEbookManagerBinding11 = activityEbookManagerBinding10;
                            }
                            android.widget.TextView textView = activityEbookManagerBinding11.tvTextProgress;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(percent);
                            sb.append('%');
                            textView.setText(sb.toString());
                            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(4);
                        }
                    }
                });
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onComplete() {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onComplete");
                final com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity ebookManagerActivity = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2$onComplete$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2 ebookManagerActivity$setupViews$2) {
                        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding8;
                        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding9;
                        android.os.Handler handler;
                        com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.TimeoutRunnable timeoutRunnable;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookManagerActivity$setupViews$2, "$this$ktxRunOnUi");
                        com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this.dismissLoadingDialog();
                        activityEbookManagerBinding8 = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this.binding;
                        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding10 = null;
                        if (activityEbookManagerBinding8 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityEbookManagerBinding8 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityEbookManagerBinding8.ctlProgress);
                        activityEbookManagerBinding9 = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this.binding;
                        if (activityEbookManagerBinding9 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityEbookManagerBinding10 = activityEbookManagerBinding9;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityEbookManagerBinding10.tvTitle2);
                        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
                        handler = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this.handler;
                        timeoutRunnable = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this.timeoutRunnable;
                        handler.removeCallbacks(timeoutRunnable);
                        com.oudmon.ble.base.communication.file.EbookHandle.getInstance().start(0);
                    }
                });
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onDeleteSuccess(int code) {
                if (code == 0) {
                    com.oudmon.ble.base.communication.file.EbookHandle.getInstance().start(0);
                } else {
                    final com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity ebookManagerActivity = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2$onDeleteSuccess$1
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2 ebookManagerActivity$setupViews$2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookManagerActivity$setupViews$2, "$this$ktxRunOnUi");
                            java.lang.String string = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_556);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_556)");
                            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                        }
                    });
                }
            }

            @Override // com.oudmon.ble.base.communication.file.IEbookCallback
            public void onActionResult(int errCode) {
                if (errCode == 7) {
                    final com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity ebookManagerActivity = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2$onActionResult$1
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$setupViews$2 ebookManagerActivity$setupViews$2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookManagerActivity$setupViews$2, "$this$ktxRunOnUi");
                            java.lang.String string = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_559);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_559)");
                            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                        }
                    });
                }
            }
        });
        com.oudmon.ble.base.communication.file.EbookHandle.getInstance().start(0);
        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding8 = this.binding;
        if (activityEbookManagerBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookManagerBinding8 = null;
        }
        activityEbookManagerBinding8.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.m720setupViews$lambda0(com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding9 = this.binding;
        if (activityEbookManagerBinding9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookManagerBinding9 = null;
        }
        activityEbookManagerBinding9.tvEbookDelete.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.m721setupViews$lambda1(com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookManagerListAdapter ebookManagerListAdapter4 = this.adapter;
        if (ebookManagerListAdapter4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            ebookManagerListAdapter = ebookManagerListAdapter4;
        }
        ebookManagerListAdapter.setOnItemSingleSelectListener(new com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemSingleSelectListener() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$$ExternalSyntheticLambda2
            @Override // com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemSingleSelectListener
            public final void onSelected(int i, boolean z) {
                com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.m722setupViews$lambda2(com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this, i, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-0, reason: not valid java name */
    public static final void m720setupViews$lambda0(com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity ebookManagerActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookManagerActivity, "this$0");
        boolean z = !ebookManagerActivity.editFlag;
        ebookManagerActivity.editFlag = z;
        com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookManagerListAdapter ebookManagerListAdapter = null;
        if (z) {
            com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding = ebookManagerActivity.binding;
            if (activityEbookManagerBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityEbookManagerBinding = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityEbookManagerBinding.cs4);
            com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding2 = ebookManagerActivity.binding;
            if (activityEbookManagerBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityEbookManagerBinding2 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.invisible(activityEbookManagerBinding2.cs3);
            com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding3 = ebookManagerActivity.binding;
            if (activityEbookManagerBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityEbookManagerBinding3 = null;
            }
            activityEbookManagerBinding3.titleBar.tvRightText.setText(ebookManagerActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_543));
            for (com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook ebook : ebookManagerActivity.getViewModel().getDeviceEbookList()) {
                ebook.setSelect(false);
                ebook.setEditEbook(true);
            }
        } else {
            com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding4 = ebookManagerActivity.binding;
            if (activityEbookManagerBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityEbookManagerBinding4 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityEbookManagerBinding4.cs4);
            com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding5 = ebookManagerActivity.binding;
            if (activityEbookManagerBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityEbookManagerBinding5 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityEbookManagerBinding5.cs3);
            com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding6 = ebookManagerActivity.binding;
            if (activityEbookManagerBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityEbookManagerBinding6 = null;
            }
            activityEbookManagerBinding6.titleBar.tvRightText.setText(ebookManagerActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_542));
            java.util.Iterator<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> it = ebookManagerActivity.getViewModel().getDeviceEbookList().iterator();
            while (it.hasNext()) {
                it.next().setEditEbook(false);
            }
        }
        com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookManagerListAdapter ebookManagerListAdapter2 = ebookManagerActivity.adapter;
        if (ebookManagerListAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            ebookManagerListAdapter = ebookManagerListAdapter2;
        }
        ebookManagerListAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m721setupViews$lambda1(com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity ebookManagerActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookManagerActivity, "this$0");
        if (ebookManagerActivity.currPosition >= 0) {
            com.oudmon.ble.base.communication.file.EbookHandle.getInstance().deleteEbook(ebookManagerActivity.currPosition, ebookManagerActivity.deleteName);
        }
        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding = ebookManagerActivity.binding;
        if (activityEbookManagerBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityEbookManagerBinding = null;
        }
        activityEbookManagerBinding.titleBar.tvRightText.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m722setupViews$lambda2(com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity ebookManagerActivity, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookManagerActivity, "this$0");
        com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook ebook = ebookManagerActivity.getViewModel().getDeviceEbookList().get(i);
        int i2 = 0;
        for (com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook ebook2 : ebookManagerActivity.getViewModel().getDeviceEbookList()) {
            int i3 = i2 + 1;
            if (i2 == i) {
                ebook2.setSelect(!ebook2.getSelect());
            } else {
                ebook2.setSelect(false);
            }
            i2 = i3;
        }
        ebookManagerActivity.deleteName = ebook.getName();
        ebookManagerActivity.currPosition = i;
        com.qcwireless.qcwatch.ui.device.ebook.adapter.EbookManagerListAdapter ebookManagerListAdapter = ebookManagerActivity.adapter;
        if (ebookManagerListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            ebookManagerListAdapter = null;
        }
        ebookManagerListAdapter.notifyDataSetChanged();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding = null;
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.FinishEbookAddFirstEvent) {
            com.qcwireless.qcwatch.base.event.FinishEbookAddFirstEvent finishEbookAddFirstEvent = (com.qcwireless.qcwatch.base.event.FinishEbookAddFirstEvent) messageEvent;
            final java.lang.String path = finishEbookAddFirstEvent.getPath();
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef.element = finishEbookAddFirstEvent.getName();
            java.util.Iterator<com.qcwireless.qcwatch.ui.device.ebook.bean.Ebook> it = getViewModel().getDeviceEbookList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(objectRef.element, it.next().getName())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_557);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_557)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                return;
            }
            com.qcwireless.qcwatch.databinding.ActivityEbookManagerBinding activityEbookManagerBinding2 = this.binding;
            if (activityEbookManagerBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityEbookManagerBinding = activityEbookManagerBinding2;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityEbookManagerBinding.noEbook);
            if (((java.lang.String) objectRef.element).length() >= 40) {
                java.lang.String substring = ((java.lang.String) objectRef.element).substring(0, 40);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                objectRef.element = substring;
            }
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$onMessageEvent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity ebookManagerActivity) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookManagerActivity, "$this$ktxRunOnBgSingle");
                    com.oudmon.ble.base.communication.file.EbookHandle.getInstance().setCurrFileType(4);
                    boolean executeFilePrepare = com.oudmon.ble.base.communication.file.EbookHandle.getInstance().executeFilePrepare(path);
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, path + "-----" + ((java.lang.String) objectRef.element) + executeFilePrepare);
                    if (executeFilePrepare) {
                        com.oudmon.ble.base.communication.file.EbookHandle.getInstance().cmdFileInit((java.lang.String) objectRef.element);
                    } else {
                        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(ebookManagerActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$onMessageEvent$1.1
                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                invoke((com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity) obj);
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity ebookManagerActivity2) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ebookManagerActivity2, "$this$ktxRunOnUi");
                                java.lang.String string2 = ebookManagerActivity2.getString(com.qcwireless.qcwatch.R.string.qc_text_558);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_558)");
                                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
                            }
                        });
                    }
                }
            });
            return;
        }
        if (!(messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) || ((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect()) {
            return;
        }
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
        java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
        finish();
    }

    /* compiled from: EbookManagerActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/ebook/EbookManagerActivity$TimeoutRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/device/ebook/EbookManagerActivity;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class TimeoutRunnable implements java.lang.Runnable {
        public TimeoutRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this.dismissLoadingDialog();
            final com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity ebookManagerActivity = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this;
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.TimeoutRunnable, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity$TimeoutRunnable$run$1
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.TimeoutRunnable) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.TimeoutRunnable timeoutRunnable) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeoutRunnable, "$this$ktxRunOnUi");
                    java.lang.String string = com.qcwireless.qcwatch.ui.device.ebook.EbookManagerActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_561);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_561)");
                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                }
            });
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
    }
}
