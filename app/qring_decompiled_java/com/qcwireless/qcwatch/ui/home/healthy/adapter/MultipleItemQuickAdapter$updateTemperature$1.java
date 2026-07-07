package com.qcwireless.qcwatch.ui.home.healthy.adapter;

/* compiled from: MultipleItemQuickAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateTemperature$1", f = "MultipleItemQuickAdapter.kt", i = {}, l = {522}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class MultipleItemQuickAdapter$updateTemperature$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.view.QTemperatureLineHomeChartView $chart;
    final /* synthetic */ android.widget.TextView $date;
    final /* synthetic */ android.widget.ImageView $image;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem $item;
    final /* synthetic */ android.widget.TextView $lastValue;
    final /* synthetic */ android.widget.TextView $unit;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipleItemQuickAdapter$updateTemperature$1(com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem lastBodyTemperatureItem, com.qcwireless.qcwatch.ui.base.view.QTemperatureLineHomeChartView qTemperatureLineHomeChartView, android.widget.TextView textView, android.widget.ImageView imageView, android.widget.TextView textView2, android.widget.TextView textView3, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateTemperature$1> continuation) {
        super(2, continuation);
        this.$item = lastBodyTemperatureItem;
        this.$chart = qTemperatureLineHomeChartView;
        this.$date = textView;
        this.$image = imageView;
        this.$unit = textView2;
        this.$lastValue = textView3;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> multipleItemQuickAdapter$updateTemperature$1 = new com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateTemperature$1(this.$item, this.$chart, this.$date, this.$image, this.$unit, this.$lastValue, continuation);
        multipleItemQuickAdapter$updateTemperature$1.L$0 = obj;
        return multipleItemQuickAdapter$updateTemperature$1;
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
            kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem> lastTemperature = this.$item.lastTemperature();
            final com.qcwireless.qcwatch.ui.base.view.QTemperatureLineHomeChartView qTemperatureLineHomeChartView = this.$chart;
            final android.widget.TextView textView = this.$date;
            final android.widget.ImageView imageView = this.$image;
            final android.widget.TextView textView2 = this.$unit;
            final android.widget.TextView textView3 = this.$lastValue;
            this.label = 1;
            if (lastTemperature.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateTemperature$1.1
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    return emit((com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                }

                public final java.lang.Object emit(final com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem lastBodyTemperatureItem, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                    final com.qcwireless.qcwatch.ui.base.view.QTemperatureLineHomeChartView qTemperatureLineHomeChartView2 = qTemperatureLineHomeChartView;
                    final android.widget.TextView textView4 = textView;
                    final android.widget.ImageView imageView2 = imageView;
                    final android.widget.TextView textView5 = textView2;
                    final android.widget.TextView textView6 = textView3;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(coroutineScope2, new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter.updateTemperature.1.1.1
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
                            if (com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem.this.getData() != null) {
                                com.qcwireless.qcwatch.base.view.ViewKt.visible(qTemperatureLineHomeChartView2);
                                qTemperatureLineHomeChartView2.setData(com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem.this.getData());
                                textView4.setText(com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem.this.getDateStr());
                                com.qcwireless.qcwatch.base.view.ViewKt.visible(textView4);
                                com.qcwireless.qcwatch.base.view.ViewKt.gone(imageView2);
                                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getTemperature()) {
                                    textView5.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_28));
                                    android.widget.TextView textView7 = textView6;
                                    java.lang.String format = java.lang.String.format("%.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf((com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem.this.getValue() * 1.8f) + 32)}, 1));
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
                                    textView7.setText(format);
                                    return;
                                }
                                textView6.setText(java.lang.String.valueOf(com.qcwireless.qcwatch.ui.home.healthy.bean.LastBodyTemperatureItem.this.getValue()));
                                textView5.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_27));
                                return;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(imageView2);
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(textView4);
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(qTemperatureLineHomeChartView2);
                            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getTemperature()) {
                                textView6.setText("--");
                                textView5.setText("°F");
                            } else {
                                textView6.setText("--");
                                textView5.setText("°C");
                            }
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
