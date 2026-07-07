package com.qcwireless.qcwatch.ui.device.push.message;

/* compiled from: OtherSoftwareActivity.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/message/OtherSoftwareActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/device/push/adapter/PushSoftwareAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityOtherSoftwareBinding;", "otherViewModel", "Lcom/qcwireless/qcwatch/ui/device/push/message/OtherSoftwareViewModel;", "getOtherViewModel", "()Lcom/qcwireless/qcwatch/ui/device/push/message/OtherSoftwareViewModel;", "otherViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class OtherSoftwareActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.device.push.adapter.PushSoftwareAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityOtherSoftwareBinding binding;

    /* renamed from: otherViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy otherViewModel;

    public OtherSoftwareActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.otherViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel m854invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel.class), qualifier, qualifier);
            }
        });
    }

    private final com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel getOtherViewModel() {
        return (com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel) this.otherViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityOtherSoftwareBinding inflate = com.qcwireless.qcwatch.databinding.ActivityOtherSoftwareBinding.inflate(getLayoutInflater());
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
        showLoadingDialog();
        android.content.Context context = (android.content.Context) this;
        this.adapter = new com.qcwireless.qcwatch.ui.device.push.adapter.PushSoftwareAdapter(context, getOtherViewModel().getSoftList());
        com.qcwireless.qcwatch.databinding.ActivityOtherSoftwareBinding activityOtherSoftwareBinding = this.binding;
        com.qcwireless.qcwatch.ui.device.push.adapter.PushSoftwareAdapter pushSoftwareAdapter = null;
        if (activityOtherSoftwareBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityOtherSoftwareBinding = null;
        }
        com.qcwireless.qcwatch.databinding.ActivityOtherSoftwareBinding activityOtherSoftwareBinding2 = this.binding;
        if (activityOtherSoftwareBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityOtherSoftwareBinding2 = null;
        }
        activityOtherSoftwareBinding2.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_243));
        activityOtherSoftwareBinding.otherPushRcv.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityOtherSoftwareBinding.otherPushRcv;
        com.qcwireless.qcwatch.ui.device.push.adapter.PushSoftwareAdapter pushSoftwareAdapter2 = this.adapter;
        if (pushSoftwareAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            pushSoftwareAdapter2 = null;
        }
        recyclerView.setAdapter(pushSoftwareAdapter2);
        getOtherViewModel().queryOpenSoftWare((android.app.Activity) this);
        getOtherViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareActivity$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareActivity.m852setupViews$lambda2(com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareActivity.this, (com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI) obj);
            }
        });
        com.qcwireless.qcwatch.ui.device.push.adapter.PushSoftwareAdapter pushSoftwareAdapter3 = this.adapter;
        if (pushSoftwareAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            pushSoftwareAdapter = pushSoftwareAdapter3;
        }
        pushSoftwareAdapter.setOnItemClickListener(new com.chad.library.adapter.base.listener.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareActivity$$ExternalSyntheticLambda1
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
                com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareActivity.m853setupViews$lambda3(com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareActivity.this, baseQuickAdapter, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m852setupViews$lambda2(com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareActivity otherSoftwareActivity, com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI messagePushUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otherSoftwareActivity, "this$0");
        otherSoftwareActivity.dismissLoadingDialog();
        java.util.List<com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush> data = messagePushUI.getData();
        if (data != null) {
            otherSoftwareActivity.getOtherViewModel().getSoftList().clear();
            otherSoftwareActivity.getOtherViewModel().getSoftList().addAll(data);
        }
        com.qcwireless.qcwatch.ui.device.push.adapter.PushSoftwareAdapter pushSoftwareAdapter = otherSoftwareActivity.adapter;
        if (pushSoftwareAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            pushSoftwareAdapter = null;
        }
        pushSoftwareAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3, reason: not valid java name */
    public static final void m853setupViews$lambda3(com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareActivity otherSoftwareActivity, com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otherSoftwareActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "<anonymous parameter 0>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush softwarePush = otherSoftwareActivity.getOtherViewModel().getSoftList().get(i);
        softwarePush.setSwitch(!softwarePush.getSwitch());
        otherSoftwareActivity.getOtherViewModel().saveBean(softwarePush);
        com.qcwireless.qcwatch.ui.device.push.adapter.PushSoftwareAdapter pushSoftwareAdapter = otherSoftwareActivity.adapter;
        if (pushSoftwareAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            pushSoftwareAdapter = null;
        }
        pushSoftwareAdapter.notifyDataSetChanged();
    }
}
