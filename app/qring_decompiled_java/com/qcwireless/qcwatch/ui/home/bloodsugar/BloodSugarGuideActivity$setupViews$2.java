package com.qcwireless.qcwatch.ui.home.bloodsugar;

/* compiled from: BloodSugarGuideActivity.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarGuideActivity$setupViews$2", f = "BloodSugarGuideActivity.kt", i = {}, l = {28, 29}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class BloodSugarGuideActivity$setupViews$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarGuideActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BloodSugarGuideActivity$setupViews$2(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarGuideActivity bloodSugarGuideActivity, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarGuideActivity$setupViews$2> continuation) {
        super(2, continuation);
        this.this$0 = bloodSugarGuideActivity;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarGuideActivity$setupViews$2(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.INSTANCE.getGetInstance().getDeviceDisplay(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), (kotlin.coroutines.Continuation) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        final com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarGuideActivity bloodSugarGuideActivity = this.this$0;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarGuideActivity$setupViews$2.1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((java.lang.Integer) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(java.lang.Integer num, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.qcwireless.qcwatch.databinding.ActivityBloodSugarGuideBinding activityBloodSugarGuideBinding;
                com.qcwireless.qcwatch.databinding.ActivityBloodSugarGuideBinding activityBloodSugarGuideBinding2;
                com.qcwireless.qcwatch.databinding.ActivityBloodSugarGuideBinding activityBloodSugarGuideBinding3 = null;
                if (num != null && num.intValue() == 1) {
                    activityBloodSugarGuideBinding2 = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarGuideActivity.this.binding;
                    if (activityBloodSugarGuideBinding2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityBloodSugarGuideBinding3 = activityBloodSugarGuideBinding2;
                    }
                    activityBloodSugarGuideBinding3.watchDisplay.setBackground(skin.support.content.res.SkinCompatResources.getDrawable((android.content.Context) com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarGuideActivity.this, com.qcwireless.qcwatch.R.mipmap.device_checking_guide_s));
                } else {
                    activityBloodSugarGuideBinding = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarGuideActivity.this.binding;
                    if (activityBloodSugarGuideBinding == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityBloodSugarGuideBinding3 = activityBloodSugarGuideBinding;
                    }
                    activityBloodSugarGuideBinding3.watchDisplay.setBackground(skin.support.content.res.SkinCompatResources.getDrawable((android.content.Context) com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarGuideActivity.this, com.qcwireless.qcwatch.R.mipmap.device_checking_guide_y));
                }
                return kotlin.Unit.INSTANCE;
            }
        }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
