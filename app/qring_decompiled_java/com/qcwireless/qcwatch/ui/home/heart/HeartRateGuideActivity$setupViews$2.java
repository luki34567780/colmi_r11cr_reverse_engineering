package com.qcwireless.qcwatch.ui.home.heart;

/* compiled from: HeartRateGuideActivity.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.heart.HeartRateGuideActivity$setupViews$2", f = "HeartRateGuideActivity.kt", i = {0}, l = {32, 33}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class HeartRateGuideActivity$setupViews$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.heart.HeartRateGuideActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeartRateGuideActivity$setupViews$2(com.qcwireless.qcwatch.ui.home.heart.HeartRateGuideActivity heartRateGuideActivity, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.heart.HeartRateGuideActivity$setupViews$2> continuation) {
        super(2, continuation);
        this.this$0 = heartRateGuideActivity;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> heartRateGuideActivity$setupViews$2 = new com.qcwireless.qcwatch.ui.home.heart.HeartRateGuideActivity$setupViews$2(this.this$0, continuation);
        heartRateGuideActivity$setupViews$2.L$0 = obj;
        return heartRateGuideActivity$setupViews$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            this.L$0 = coroutineScope;
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
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        final com.qcwireless.qcwatch.ui.home.heart.HeartRateGuideActivity heartRateGuideActivity = this.this$0;
        this.L$0 = null;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartRateGuideActivity$setupViews$2.1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((java.lang.Integer) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(final java.lang.Integer num, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                final com.qcwireless.qcwatch.ui.home.heart.HeartRateGuideActivity heartRateGuideActivity2 = heartRateGuideActivity;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(coroutineScope2, new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartRateGuideActivity.setupViews.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                        invoke((kotlinx.coroutines.CoroutineScope) obj2);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(kotlinx.coroutines.CoroutineScope coroutineScope3) {
                        com.qcwireless.qcwatch.databinding.ActivityHeartGuideBinding activityHeartGuideBinding;
                        com.qcwireless.qcwatch.databinding.ActivityHeartGuideBinding activityHeartGuideBinding2;
                        com.qcwireless.qcwatch.databinding.ActivityHeartGuideBinding activityHeartGuideBinding3;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope3, "$this$ktxRunOnUi");
                        java.lang.Integer num2 = num;
                        com.qcwireless.qcwatch.databinding.ActivityHeartGuideBinding activityHeartGuideBinding4 = null;
                        if (num2 == null) {
                            activityHeartGuideBinding3 = heartRateGuideActivity2.binding;
                            if (activityHeartGuideBinding3 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityHeartGuideBinding4 = activityHeartGuideBinding3;
                            }
                            activityHeartGuideBinding4.watchDisplay.setBackground(skin.support.content.res.SkinCompatResources.getDrawable((android.content.Context) heartRateGuideActivity2, com.qcwireless.qcwatch.R.mipmap.device_checking_guide_y));
                            return;
                        }
                        if (num2 != null && num2.intValue() == 1) {
                            activityHeartGuideBinding2 = heartRateGuideActivity2.binding;
                            if (activityHeartGuideBinding2 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityHeartGuideBinding4 = activityHeartGuideBinding2;
                            }
                            activityHeartGuideBinding4.watchDisplay.setBackground(skin.support.content.res.SkinCompatResources.getDrawable((android.content.Context) heartRateGuideActivity2, com.qcwireless.qcwatch.R.mipmap.device_checking_guide_s));
                            return;
                        }
                        activityHeartGuideBinding = heartRateGuideActivity2.binding;
                        if (activityHeartGuideBinding == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityHeartGuideBinding4 = activityHeartGuideBinding;
                        }
                        activityHeartGuideBinding4.watchDisplay.setBackground(skin.support.content.res.SkinCompatResources.getDrawable((android.content.Context) heartRateGuideActivity2, com.qcwireless.qcwatch.R.mipmap.device_checking_guide_y));
                    }
                });
                return kotlin.Unit.INSTANCE;
            }
        }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
