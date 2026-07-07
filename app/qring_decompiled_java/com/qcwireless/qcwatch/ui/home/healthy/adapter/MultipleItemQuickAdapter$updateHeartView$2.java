package com.qcwireless.qcwatch.ui.home.healthy.adapter;

/* compiled from: MultipleItemQuickAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateHeartView$2", f = "MultipleItemQuickAdapter.kt", i = {}, l = {1055}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class MultipleItemQuickAdapter$updateHeartView$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.view.QHomeHeartLineChartView $chart;
    final /* synthetic */ android.widget.TextView $date;
    final /* synthetic */ android.widget.TextView $image;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem $item;
    final /* synthetic */ android.widget.TextView $value;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipleItemQuickAdapter$updateHeartView$2(com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem lastHeartItem, android.widget.TextView textView, android.widget.TextView textView2, com.qcwireless.qcwatch.ui.base.view.QHomeHeartLineChartView qHomeHeartLineChartView, android.widget.TextView textView3, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateHeartView$2> continuation) {
        super(2, continuation);
        this.$item = lastHeartItem;
        this.$date = textView;
        this.$value = textView2;
        this.$chart = qHomeHeartLineChartView;
        this.$image = textView3;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> multipleItemQuickAdapter$updateHeartView$2 = new com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateHeartView$2(this.$item, this.$date, this.$value, this.$chart, this.$image, continuation);
        multipleItemQuickAdapter$updateHeartView$2.L$0 = obj;
        return multipleItemQuickAdapter$updateHeartView$2;
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
            kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem> queryLastHeartRate = this.$item.queryLastHeartRate();
            final android.widget.TextView textView = this.$date;
            final android.widget.TextView textView2 = this.$value;
            final com.qcwireless.qcwatch.ui.base.view.QHomeHeartLineChartView qHomeHeartLineChartView = this.$chart;
            final android.widget.TextView textView3 = this.$image;
            this.label = 1;
            if (queryLastHeartRate.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateHeartView$2.1
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    return emit((com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                }

                public final java.lang.Object emit(final com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem lastHeartItem, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                    final android.widget.TextView textView4 = textView;
                    final android.widget.TextView textView5 = textView2;
                    final com.qcwireless.qcwatch.ui.base.view.QHomeHeartLineChartView qHomeHeartLineChartView2 = qHomeHeartLineChartView;
                    final android.widget.TextView textView6 = textView3;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(coroutineScope2, new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter.updateHeartView.2.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                            invoke((kotlinx.coroutines.CoroutineScope) obj2);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(kotlinx.coroutines.CoroutineScope coroutineScope3) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope3, "$this$ktxRunOnUi");
                            if (com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem.this.getValue() == 0) {
                                textView4.setText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil()));
                                textView5.setText("--");
                                qHomeHeartLineChartView2.setData(new java.util.ArrayList());
                                com.qcwireless.qcwatch.base.view.ViewKt.visible(textView6);
                                return;
                            }
                            textView4.setText(com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem.this.getDateStr());
                            textView5.setText(java.lang.String.valueOf(com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem.this.getValue()));
                            if (com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem.this.getData() != null) {
                                java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> data = com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem.this.getData();
                                kotlin.jvm.internal.Intrinsics.checkNotNull(data);
                                if (!data.isEmpty()) {
                                    textView4.setText(com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem.this.getDateStr());
                                    textView5.setText(java.lang.String.valueOf(com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem.this.getValue()));
                                    qHomeHeartLineChartView2.setData(com.qcwireless.qcwatch.ui.home.healthy.bean.LastHeartItem.this.getData());
                                    com.qcwireless.qcwatch.base.view.ViewKt.gone(textView6);
                                    return;
                                }
                            }
                            qHomeHeartLineChartView2.setData(new java.util.ArrayList());
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(textView6);
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
