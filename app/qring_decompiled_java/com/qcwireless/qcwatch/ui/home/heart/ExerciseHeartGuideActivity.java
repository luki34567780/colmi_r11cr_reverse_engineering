package com.qcwireless.qcwatch.ui.home.heart;

/* compiled from: ExerciseHeartGuideActivity.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/heart/ExerciseHeartGuideActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityExerciseHeartGuideBinding;", "maxHeart", "", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivityViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ExerciseHeartGuideActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityExerciseHeartGuideBinding binding;
    private int maxHeart = 200;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public ExerciseHeartGuideActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.heart.ExerciseHeartGuideActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel m1092invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.class), qualifier, qualifier);
            }
        });
    }

    private final com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityExerciseHeartGuideBinding inflate = com.qcwireless.qcwatch.databinding.ActivityExerciseHeartGuideBinding.inflate(getLayoutInflater());
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
        getViewModel().m1113getAge();
        getViewModel().getAge().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.heart.ExerciseHeartGuideActivity$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.heart.ExerciseHeartGuideActivity.m1091setupViews$lambda1(com.qcwireless.qcwatch.ui.home.heart.ExerciseHeartGuideActivity.this, (com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m1091setupViews$lambda1(com.qcwireless.qcwatch.ui.home.heart.ExerciseHeartGuideActivity exerciseHeartGuideActivity, com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge userAge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exerciseHeartGuideActivity, "this$0");
        exerciseHeartGuideActivity.maxHeart = 220 - userAge.getAge();
        com.qcwireless.qcwatch.databinding.ActivityExerciseHeartGuideBinding activityExerciseHeartGuideBinding = exerciseHeartGuideActivity.binding;
        if (activityExerciseHeartGuideBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityExerciseHeartGuideBinding = null;
        }
        activityExerciseHeartGuideBinding.titleBar.tvTitle.setText(exerciseHeartGuideActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_498));
        activityExerciseHeartGuideBinding.tv10.setText(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(exerciseHeartGuideActivity.maxHeart * 0.5d)));
        activityExerciseHeartGuideBinding.tv7.setText(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(exerciseHeartGuideActivity.maxHeart * 0.6d)));
        activityExerciseHeartGuideBinding.tv5.setText(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(exerciseHeartGuideActivity.maxHeart * 0.7d)));
        activityExerciseHeartGuideBinding.tv3.setText(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(exerciseHeartGuideActivity.maxHeart * 0.8d)));
        activityExerciseHeartGuideBinding.tv1.setText(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(exerciseHeartGuideActivity.maxHeart * 0.9d)));
    }
}
