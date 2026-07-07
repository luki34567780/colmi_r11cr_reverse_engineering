package com.qcwireless.qcwatch.ui.home.healthy.adapter;

/* compiled from: MultipleItemQuickAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateBloodSugar$2", f = "MultipleItemQuickAdapter.kt", i = {}, l = {498}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class MultipleItemQuickAdapter$updateBloodSugar$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.widget.TextView $date;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodSugarItem $item;
    final /* synthetic */ android.widget.TextView $sugarValue;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.view.PGBloodSugarView $sugarView;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipleItemQuickAdapter$updateBloodSugar$2(com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodSugarItem lastBloodSugarItem, android.widget.TextView textView, com.qcwireless.qcwatch.ui.base.view.PGBloodSugarView pGBloodSugarView, android.widget.TextView textView2, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateBloodSugar$2> continuation) {
        super(2, continuation);
        this.$item = lastBloodSugarItem;
        this.$sugarValue = textView;
        this.$sugarView = pGBloodSugarView;
        this.$date = textView2;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> multipleItemQuickAdapter$updateBloodSugar$2 = new com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateBloodSugar$2(this.$item, this.$sugarValue, this.$sugarView, this.$date, continuation);
        multipleItemQuickAdapter$updateBloodSugar$2.L$0 = obj;
        return multipleItemQuickAdapter$updateBloodSugar$2;
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
            kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity> queryLastBloodSugar = this.$item.queryLastBloodSugar();
            final android.widget.TextView textView = this.$sugarValue;
            final com.qcwireless.qcwatch.ui.base.view.PGBloodSugarView pGBloodSugarView = this.$sugarView;
            final android.widget.TextView textView2 = this.$date;
            this.label = 1;
            if (queryLastBloodSugar.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateBloodSugar$2.1
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    return emit((com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                }

                public final java.lang.Object emit(final com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity appBloodSugarEntity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                    final android.widget.TextView textView3 = textView;
                    final com.qcwireless.qcwatch.ui.base.view.PGBloodSugarView pGBloodSugarView2 = pGBloodSugarView;
                    final android.widget.TextView textView4 = textView2;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(coroutineScope2, new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter.updateBloodSugar.2.1.1
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
                            if (com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity.this.getTimestamp() > 0) {
                                textView3.setText(java.lang.String.valueOf((com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity.this.getSugar() * 1.0f) / 10));
                                pGBloodSugarView2.setBloodSugar(com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity.this.getSugar());
                                com.qcwireless.qcwatch.base.view.ViewKt.visible(textView4);
                                textView4.setText(new com.qcwireless.qc_utils.date.DateUtil(com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity.this.getTimestamp(), true).getY_M_D());
                                return;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(textView4);
                            pGBloodSugarView2.setBloodSugar(0);
                            textView3.setText("--");
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
