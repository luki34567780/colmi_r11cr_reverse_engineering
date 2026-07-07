package com.qcwireless.qcwatch.ui.home.healthy.adapter;

/* compiled from: MultipleItemQuickAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateMenstruationView$1", f = "MultipleItemQuickAdapter.kt", i = {}, l = {792}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class MultipleItemQuickAdapter$updateMenstruationView$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.bean.LastMenstruationItem $item;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.view.QHomeMenstruationView $qHome;
    final /* synthetic */ android.widget.TextView $state;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipleItemQuickAdapter$updateMenstruationView$1(com.qcwireless.qcwatch.ui.home.healthy.bean.LastMenstruationItem lastMenstruationItem, com.qcwireless.qcwatch.ui.base.view.QHomeMenstruationView qHomeMenstruationView, android.widget.TextView textView, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateMenstruationView$1> continuation) {
        super(2, continuation);
        this.$item = lastMenstruationItem;
        this.$qHome = qHomeMenstruationView;
        this.$state = textView;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> multipleItemQuickAdapter$updateMenstruationView$1 = new com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateMenstruationView$1(this.$item, this.$qHome, this.$state, continuation);
        multipleItemQuickAdapter$updateMenstruationView$1.L$0 = obj;
        return multipleItemQuickAdapter$updateMenstruationView$1;
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
            kotlinx.coroutines.flow.Flow<java.lang.Integer> queryTodayStatus = this.$item.queryTodayStatus();
            final com.qcwireless.qcwatch.ui.base.view.QHomeMenstruationView qHomeMenstruationView = this.$qHome;
            final android.widget.TextView textView = this.$state;
            this.label = 1;
            if (queryTodayStatus.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateMenstruationView$1.1
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    return emit(((java.lang.Number) obj2).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                }

                public final java.lang.Object emit(final int i2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                    final com.qcwireless.qcwatch.ui.base.view.QHomeMenstruationView qHomeMenstruationView2 = qHomeMenstruationView;
                    final android.widget.TextView textView2 = textView;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(coroutineScope2, new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter.updateMenstruationView.1.1.1
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
                            com.qcwireless.qcwatch.ui.base.view.QHomeMenstruationView.this.setType(i2);
                            int i3 = i2;
                            if (i3 == 1) {
                                textView2.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_186));
                                return;
                            }
                            if (i3 == 2) {
                                textView2.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_185));
                            } else if (i3 == 3) {
                                textView2.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_185));
                            } else {
                                if (i3 != 4) {
                                    return;
                                }
                                textView2.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_184));
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
