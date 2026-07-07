package com.qcwireless.qcwatch.ui.device.bp;

/* compiled from: BloodPressureSettingActivity.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/bp/BloodPressureSettingActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityBloodPressureBinding;", "bpViewModel", "Lcom/qcwireless/qcwatch/ui/device/bp/BloodPressureViewModel;", "getBpViewModel", "()Lcom/qcwireless/qcwatch/ui/device/bp/BloodPressureViewModel;", "bpViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BloodPressureSettingActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding binding;

    /* renamed from: bpViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy bpViewModel;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1$lambda-0, reason: not valid java name */
    public static final void m652setupViews$lambda1$lambda0(com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel.BpUI bpUI) {
    }

    public BloodPressureSettingActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.bpViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.bp.BloodPressureSettingActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel m653invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel.class), qualifier, qualifier);
            }
        });
    }

    private final com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel getBpViewModel() {
        return (com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel) this.bpViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding inflate = com.qcwireless.qcwatch.databinding.ActivityBloodPressureBinding.inflate(getLayoutInflater());
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
        com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel bpViewModel = getBpViewModel();
        bpViewModel.getBpSetting("123");
        bpViewModel.saveBpSetting("123", true, 1, 23);
        bpViewModel.getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.bp.BloodPressureSettingActivity$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.bp.BloodPressureSettingActivity.m652setupViews$lambda1$lambda0((com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel.BpUI) obj);
            }
        });
    }
}
