package com.qcwireless.qcwatch.ui.home.healthy.adapter;

/* compiled from: MultipleItemQuickAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateBloodOxygen$2", f = "MultipleItemQuickAdapter.kt", i = {}, l = {697}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class MultipleItemQuickAdapter$updateBloodOxygen$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.view.PGBloodOxygenView $boChart;
    final /* synthetic */ android.widget.TextView $boValue;
    final /* synthetic */ android.widget.TextView $date;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodOxygenItem $item;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipleItemQuickAdapter$updateBloodOxygen$2(com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodOxygenItem lastBloodOxygenItem, android.widget.TextView textView, android.widget.TextView textView2, com.qcwireless.qcwatch.ui.base.view.PGBloodOxygenView pGBloodOxygenView, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateBloodOxygen$2> continuation) {
        super(2, continuation);
        this.$item = lastBloodOxygenItem;
        this.$date = textView;
        this.$boValue = textView2;
        this.$boChart = pGBloodOxygenView;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> multipleItemQuickAdapter$updateBloodOxygen$2 = new com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateBloodOxygen$2(this.$item, this.$date, this.$boValue, this.$boChart, continuation);
        multipleItemQuickAdapter$updateBloodOxygen$2.L$0 = obj;
        return multipleItemQuickAdapter$updateBloodOxygen$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlinx.coroutines.flow.Flow<java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartHomeView.DataBean>> queryLastBlood = this.$item.queryLastBlood();
            final android.widget.TextView textView = this.$date;
            final android.widget.TextView textView2 = this.$boValue;
            final com.qcwireless.qcwatch.ui.base.view.PGBloodOxygenView pGBloodOxygenView = this.$boChart;
            this.label = 1;
            if (queryLastBlood.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateBloodOxygen$2.1
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    return emit((java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartHomeView.DataBean>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                }

                public final java.lang.Object emit(final java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartHomeView.DataBean> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                    final android.widget.TextView textView3 = textView;
                    final android.widget.TextView textView4 = textView2;
                    final com.qcwireless.qcwatch.ui.base.view.PGBloodOxygenView pGBloodOxygenView2 = pGBloodOxygenView;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(coroutineScope2, new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter.updateBloodOxygen.2.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                            invoke((kotlinx.coroutines.CoroutineScope) obj2);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(kotlinx.coroutines.CoroutineScope coroutineScope3) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope3, "$this$ktxRunOnUi");
                            if (!list.isEmpty()) {
                                java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartHomeView.DataBean> list2 = list;
                                textView3.setText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(list2.get(list2.size() - 1).getUnixTime(), true)));
                                textView4.setText("");
                                for (int size = list.size() - 1; -1 < size; size--) {
                                    if (list.get(size).getMaxValue() > 0) {
                                        if (list.get(size).getMinValue() == 100) {
                                            textView4.setText(java.lang.String.valueOf(list.get(size).getMinValue()));
                                            pGBloodOxygenView2.setBloodOxygen(100);
                                            return;
                                        }
                                        if (list.get(size).getMinValue() == list.get(size).getMaxValue()) {
                                            textView4.setText(java.lang.String.valueOf(list.get(size).getMinValue()));
                                        } else {
                                            android.widget.TextView textView5 = textView4;
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            sb.append(list.get(size).getMinValue());
                                            sb.append('-');
                                            sb.append(list.get(size).getMaxValue());
                                            textView5.setText(sb.toString());
                                        }
                                        pGBloodOxygenView2.setBloodOxygen(list.get(size).getMaxValue());
                                        return;
                                    }
                                }
                                return;
                            }
                            textView3.setText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil()));
                            pGBloodOxygenView2.setBloodOxygen(0);
                            textView4.setText("--");
                        }
                    });
                    return kotlin.Unit.INSTANCE;
                }
            }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
