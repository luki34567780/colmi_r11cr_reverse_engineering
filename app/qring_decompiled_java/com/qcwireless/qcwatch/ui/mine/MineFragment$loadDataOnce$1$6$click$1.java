package com.qcwireless.qcwatch.ui.mine;

/* compiled from: MineFragment.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$6$click$1", f = "MineFragment.kt", i = {0}, l = {190, 193}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u2d0"}, s = {"L$1"})
/* loaded from: /tmp/dex/classes2.dex */
final class MineFragment$loadDataOnce$1$6$click$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.mine.MineFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MineFragment$loadDataOnce$1$6$click$1(com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$6$click$1> continuation) {
        super(2, continuation);
        this.this$0 = mineFragment;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$6$click$1(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.qcwireless.qcwatch.ui.base.repository.device.OTARepository getInstance;
        final com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getInstance = com.qcwireless.qcwatch.ui.base.repository.device.OTARepository.INSTANCE.getGetInstance();
            com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment2 = this.this$0;
            java.lang.String hwVersion = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion();
            java.lang.String fmVersion = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion();
            this.L$0 = mineFragment2;
            this.L$1 = getInstance;
            this.label = 1;
            java.lang.Object checkOtaFromServer = getInstance.checkOtaFromServer(hwVersion, fmVersion, this);
            if (checkOtaFromServer == coroutine_suspended) {
                return coroutine_suspended;
            }
            mineFragment = mineFragment2;
            obj = checkOtaFromServer;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getInstance = (com.qcwireless.qcwatch.ui.base.repository.device.OTARepository) this.L$1;
            mineFragment = (com.qcwireless.qcwatch.ui.mine.MineFragment) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.flow.FlowCollector flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$6$click$1$1$1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                if (netState.getRetCode() == 60001) {
                    com.qcwireless.qcwatch.ui.base.repository.device.OTARepository oTARepository = com.qcwireless.qcwatch.ui.base.repository.device.OTARepository.this;
                    final com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment3 = mineFragment;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(oTARepository, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.device.OTARepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$6$click$1$1$1.1
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                            invoke((com.qcwireless.qcwatch.ui.base.repository.device.OTARepository) obj2);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.repository.device.OTARepository oTARepository2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oTARepository2, "$this$ktxRunOnUi");
                            java.lang.String string = com.qcwireless.qcwatch.ui.mine.MineFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_6666042);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_6666042)");
                            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                        }
                    });
                } else if (netState.getRetCode() == 0) {
                    java.lang.String battery = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getBattery();
                    kotlin.Unit unit = null;
                    java.lang.Integer boxInt = battery != null ? kotlin.coroutines.jvm.internal.Boxing.boxInt(java.lang.Integer.parseInt(battery)) : null;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(boxInt);
                    if (boxInt.intValue() < 10) {
                        com.qcwireless.qcwatch.ui.base.repository.device.OTARepository oTARepository2 = com.qcwireless.qcwatch.ui.base.repository.device.OTARepository.this;
                        final com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment4 = mineFragment;
                        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(oTARepository2, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.device.OTARepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$6$click$1$1$1.2
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                                invoke((com.qcwireless.qcwatch.ui.base.repository.device.OTARepository) obj2);
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.device.OTARepository oTARepository3) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oTARepository3, "$this$ktxRunOnUi");
                                java.lang.String string = com.qcwireless.qcwatch.ui.mine.MineFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_292);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_292)");
                                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                            }
                        });
                        return kotlin.Unit.INSTANCE;
                    }
                    com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment5 = mineFragment;
                    android.content.Context activity = mineFragment5.getActivity();
                    if (activity != null) {
                        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity.class);
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
                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                }
                            }
                        }
                        mineFragment5.startActivity(intent);
                        unit = kotlin.Unit.INSTANCE;
                    }
                    if (unit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return unit;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        };
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(flowCollector, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
