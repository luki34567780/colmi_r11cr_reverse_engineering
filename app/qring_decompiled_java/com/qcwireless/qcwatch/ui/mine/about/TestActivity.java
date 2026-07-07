package com.qcwireless.qcwatch.ui.mine.about;

/* compiled from: TestActivity.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/about/TestActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityTestBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class TestActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityTestBinding binding;

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityTestBinding inflate = com.qcwireless.qcwatch.databinding.ActivityTestBinding.inflate(getLayoutInflater());
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
        com.qcwireless.qcwatch.databinding.ActivityTestBinding activityTestBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityTestBinding activityTestBinding2 = null;
        if (activityTestBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityTestBinding = null;
        }
        activityTestBinding.btn1.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.about.TestActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.about.TestActivity.m1269setupViews$lambda0(com.qcwireless.qcwatch.ui.mine.about.TestActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityTestBinding activityTestBinding3 = this.binding;
        if (activityTestBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityTestBinding2 = activityTestBinding3;
        }
        activityTestBinding2.btn2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.about.TestActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.about.TestActivity.m1270setupViews$lambda1(com.qcwireless.qcwatch.ui.mine.about.TestActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-0, reason: not valid java name */
    public static final void m1269setupViews$lambda0(com.qcwireless.qcwatch.ui.mine.about.TestActivity testActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testActivity, "this$0");
        android.media.AudioManager audioManager = com.qcwireless.qcwatch.base.ktx.SystemServiceExtKt.getAudioManager((android.content.Context) testActivity);
        kotlin.jvm.internal.Intrinsics.checkNotNull(audioManager);
        audioManager.adjustStreamVolume(3, 1, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m1270setupViews$lambda1(com.qcwireless.qcwatch.ui.mine.about.TestActivity testActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testActivity, "this$0");
        android.media.AudioManager audioManager = com.qcwireless.qcwatch.base.ktx.SystemServiceExtKt.getAudioManager((android.content.Context) testActivity);
        kotlin.jvm.internal.Intrinsics.checkNotNull(audioManager);
        audioManager.adjustStreamVolume(3, -1, 1);
    }
}
