package com.qcwireless.qcwatch.ui.home.healthy.adapter;

/* compiled from: MultipleItemQuickAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateOneKeyView$1", f = "MultipleItemQuickAdapter.kt", i = {}, l = {561}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class MultipleItemQuickAdapter$updateOneKeyView$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.widget.ImageView $dataImage;
    final /* synthetic */ android.widget.TextView $date;
    final /* synthetic */ android.widget.ImageView $image;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyItem $item;
    final /* synthetic */ android.widget.TextView $score;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipleItemQuickAdapter$updateOneKeyView$1(com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyItem lastOneKeyItem, android.widget.TextView textView, android.widget.TextView textView2, android.widget.ImageView imageView, android.widget.ImageView imageView2, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateOneKeyView$1> continuation) {
        super(2, continuation);
        this.$item = lastOneKeyItem;
        this.$date = textView;
        this.$score = textView2;
        this.$dataImage = imageView;
        this.$image = imageView2;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> multipleItemQuickAdapter$updateOneKeyView$1 = new com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateOneKeyView$1(this.$item, this.$date, this.$score, this.$dataImage, this.$image, continuation);
        multipleItemQuickAdapter$updateOneKeyView$1.L$0 = obj;
        return multipleItemQuickAdapter$updateOneKeyView$1;
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
            kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean> lastOneKey = this.$item.lastOneKey();
            final android.widget.TextView textView = this.$date;
            final android.widget.TextView textView2 = this.$score;
            final android.widget.ImageView imageView = this.$dataImage;
            final android.widget.ImageView imageView2 = this.$image;
            this.label = 1;
            if (lastOneKey.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateOneKeyView$1.1
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    return emit((com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                }

                public final java.lang.Object emit(final com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean lastOneKeyBean, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                    final android.widget.TextView textView3 = textView;
                    final android.widget.TextView textView4 = textView2;
                    final android.widget.ImageView imageView3 = imageView;
                    final android.widget.ImageView imageView4 = imageView2;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(coroutineScope2, new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter.updateOneKeyView.1.1.1
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
                            com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean lastOneKeyBean2 = com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean.this;
                            if (lastOneKeyBean2 != null && lastOneKeyBean2.getHr() > 0) {
                                textView3.setText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean.this.getLastTime(), true)));
                                textView4.setText(java.lang.String.valueOf(com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean.this.getScore()));
                                com.qcwireless.qcwatch.base.view.ViewKt.visible(imageView3);
                                com.qcwireless.qcwatch.base.view.ViewKt.visible(textView3);
                                com.qcwireless.qcwatch.base.view.ViewKt.gone(imageView4);
                                return;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(imageView4);
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(imageView3);
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(textView3);
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
