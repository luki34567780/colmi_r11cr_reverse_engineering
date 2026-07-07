package com.qcwireless.qcwatch.ui.home.healthy;

/* compiled from: HealthyFragment.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$healthyModule$1", f = "HealthyFragment.kt", i = {0}, l = {900, 901}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class HealthyFragment$healthyModule$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthyFragment$healthyModule$1(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$healthyModule$1> continuation) {
        super(2, continuation);
        this.this$0 = healthyFragment;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> healthyFragment$healthyModule$1 = new com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$healthyModule$1(this.this$0, continuation);
        healthyFragment$healthyModule$1.L$0 = obj;
        return healthyFragment$healthyModule$1;
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
            obj = com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository.INSTANCE.getGetInstance().getDeviceSupport(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), (kotlin.coroutines.Continuation) this);
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
        final com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment = this.this$0;
        this.L$0 = null;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment$healthyModule$1.1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(final java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                final com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment2 = healthyFragment;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(coroutineScope2, new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.healthyModule.1.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                        invoke((kotlinx.coroutines.CoroutineScope) obj2);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(kotlinx.coroutines.CoroutineScope coroutineScope3) {
                        com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter multipleItemQuickAdapter;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope3, "$this$ktxRunOnUi");
                        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.getViewModel().getItemList().clear();
                        java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> map2 = map;
                        if (map2 == null || map2.isEmpty()) {
                            com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel viewModel = com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.getViewModel();
                            viewModel.getItemList().clear();
                            viewModel.getItemList().add(new com.qcwireless.qcwatch.ui.home.healthy.bean.LastSleepItem());
                            viewModel.getItemList().add(new com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem());
                            viewModel.getItemList().add(new com.qcwireless.qcwatch.ui.home.healthy.bean.LastSportItem());
                        } else {
                            java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> map3 = map;
                            com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment3 = com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this;
                            for (java.util.Map.Entry<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> entry : map3.entrySet()) {
                                if (entry.getValue().isChecked()) {
                                    int modelType = entry.getValue().getModelType();
                                    if (modelType == 1) {
                                        healthyFragment3.getViewModel().getItemList().add(new com.qcwireless.qcwatch.ui.home.healthy.bean.LastSleepItem());
                                    } else if (modelType == 2) {
                                        healthyFragment3.getViewModel().getItemList().add(new com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem());
                                    } else if (modelType == 3) {
                                        healthyFragment3.getViewModel().getItemList().add(new com.qcwireless.qcwatch.ui.home.healthy.bean.LastSportItem());
                                    } else if (modelType == 4) {
                                        healthyFragment3.getViewModel().getItemList().add(new com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodOxygenItem());
                                    } else if (modelType == 11) {
                                        healthyFragment3.getViewModel().getItemList().add(new com.qcwireless.qcwatch.ui.home.healthy.bean.LastPressureItem());
                                    } else if (modelType == 12) {
                                        healthyFragment3.getViewModel().getItemList().add(new com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodSugarItem());
                                    }
                                }
                            }
                        }
                        multipleItemQuickAdapter = com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.this.healthyAdapter;
                        if (multipleItemQuickAdapter == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("healthyAdapter");
                            multipleItemQuickAdapter = null;
                        }
                        multipleItemQuickAdapter.notifyDataSetChanged();
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
