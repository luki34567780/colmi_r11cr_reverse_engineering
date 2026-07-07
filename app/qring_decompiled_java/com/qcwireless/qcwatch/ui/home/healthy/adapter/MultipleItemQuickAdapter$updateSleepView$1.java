package com.qcwireless.qcwatch.ui.home.healthy.adapter;

/* compiled from: MultipleItemQuickAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateSleepView$1", f = "MultipleItemQuickAdapter.kt", i = {}, l = {1279}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class MultipleItemQuickAdapter$updateSleepView$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieView $chart;
    final /* synthetic */ android.widget.TextView $date;
    final /* synthetic */ android.widget.TextView $hour;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.bean.LastSleepItem $item;
    final /* synthetic */ android.widget.TextView $min;
    final /* synthetic */ android.widget.TextView $noData;
    final /* synthetic */ int[] $pieArray;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipleItemQuickAdapter$updateSleepView$1(com.qcwireless.qcwatch.ui.home.healthy.bean.LastSleepItem lastSleepItem, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, int[] iArr, com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieView qSleepCirclePieView, android.widget.TextView textView4, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateSleepView$1> continuation) {
        super(2, continuation);
        this.$item = lastSleepItem;
        this.$date = textView;
        this.$hour = textView2;
        this.$min = textView3;
        this.$pieArray = iArr;
        this.$chart = qSleepCirclePieView;
        this.$noData = textView4;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> multipleItemQuickAdapter$updateSleepView$1 = new com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateSleepView$1(this.$item, this.$date, this.$hour, this.$min, this.$pieArray, this.$chart, this.$noData, continuation);
        multipleItemQuickAdapter$updateSleepView$1.L$0 = obj;
        return multipleItemQuickAdapter$updateSleepView$1;
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
            kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean> calcLastSleep = this.$item.calcLastSleep();
            final android.widget.TextView textView = this.$date;
            final android.widget.TextView textView2 = this.$hour;
            final android.widget.TextView textView3 = this.$min;
            final int[] iArr = this.$pieArray;
            final com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieView qSleepCirclePieView = this.$chart;
            final android.widget.TextView textView4 = this.$noData;
            this.label = 1;
            if (calcLastSleep.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateSleepView$1.1
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    return emit((com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                }

                public final java.lang.Object emit(final com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean sleepViewBean, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                    final android.widget.TextView textView5 = textView;
                    final android.widget.TextView textView6 = textView2;
                    final android.widget.TextView textView7 = textView3;
                    final int[] iArr2 = iArr;
                    final com.qcwireless.qcwatch.ui.base.view.QSleepCirclePieView qSleepCirclePieView2 = qSleepCirclePieView;
                    final android.widget.TextView textView8 = textView4;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(coroutineScope2, new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter.updateSleepView.1.1.1
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
                            if (com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean.this.getTotalSleep() > 0) {
                                textView5.setText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean.this.getEndTime(), true)));
                                textView6.setText(java.lang.String.valueOf((com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean.this.getTotalSleep() / 60) / 60));
                                textView7.setText(java.lang.String.valueOf((com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean.this.getTotalSleep() / 60) % 60));
                                iArr2[0] = com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean.this.getDeepSleep() / 60;
                                iArr2[1] = com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean.this.getLightSleep() / 60;
                                iArr2[2] = com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean.this.getAwakeSleep() / 60;
                                qSleepCirclePieView2.dataInit(iArr2);
                                com.qcwireless.qcwatch.base.view.ViewKt.visible(qSleepCirclePieView2);
                                com.qcwireless.qcwatch.base.view.ViewKt.gone(textView8);
                                return;
                            }
                            textView5.setText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil()));
                            textView6.setText("--");
                            textView7.setText("--");
                            qSleepCirclePieView2.dataInit(iArr2);
                            com.qcwireless.qcwatch.base.view.ViewKt.invisible(qSleepCirclePieView2);
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(textView8);
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
