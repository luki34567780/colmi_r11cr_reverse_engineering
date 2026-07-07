package com.qcwireless.qcwatch.ui.home.healthy.adapter;

/* compiled from: MultipleItemQuickAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateBloodPressure$1", f = "MultipleItemQuickAdapter.kt", i = {}, l = {586}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class MultipleItemQuickAdapter$updateBloodPressure$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.view.PGBloodPressureView $bpChart;
    final /* synthetic */ android.widget.TextView $bpValue;
    final /* synthetic */ android.widget.TextView $date;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodPressureItem $item;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipleItemQuickAdapter$updateBloodPressure$1(com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodPressureItem lastBloodPressureItem, android.widget.TextView textView, android.widget.TextView textView2, com.qcwireless.qcwatch.ui.base.view.PGBloodPressureView pGBloodPressureView, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateBloodPressure$1> continuation) {
        super(2, continuation);
        this.$item = lastBloodPressureItem;
        this.$date = textView;
        this.$bpValue = textView2;
        this.$bpChart = pGBloodPressureView;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> multipleItemQuickAdapter$updateBloodPressure$1 = new com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateBloodPressure$1(this.$item, this.$date, this.$bpValue, this.$bpChart, continuation);
        multipleItemQuickAdapter$updateBloodPressure$1.L$0 = obj;
        return multipleItemQuickAdapter$updateBloodPressure$1;
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
            kotlinx.coroutines.flow.Flow<java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean>> queryLastBloodPressure = this.$item.queryLastBloodPressure();
            final android.widget.TextView textView = this.$date;
            final android.widget.TextView textView2 = this.$bpValue;
            final com.qcwireless.qcwatch.ui.base.view.PGBloodPressureView pGBloodPressureView = this.$bpChart;
            this.label = 1;
            if (queryLastBloodPressure.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateBloodPressure$1.1
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    return emit((java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                }

                public final java.lang.Object emit(final java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                    final android.widget.TextView textView3 = textView;
                    final android.widget.TextView textView4 = textView2;
                    final com.qcwireless.qcwatch.ui.base.view.PGBloodPressureView pGBloodPressureView2 = pGBloodPressureView;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(coroutineScope2, new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter.updateBloodPressure.1.1.1
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
                                textView3.setText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(list.get(0).getUnixTime(), true)));
                                android.widget.TextView textView5 = textView4;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(list.get(0).getSbp());
                                sb.append('/');
                                sb.append(list.get(0).getDbp());
                                textView5.setText(sb.toString());
                                pGBloodPressureView2.setBpValue(list.get(0).getSbp(), list.get(0).getDbp());
                                return;
                            }
                            textView4.setText("--");
                            textView3.setText("");
                            pGBloodPressureView2.setBpValue(0, 0);
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
