package com.qcwireless.qcwatch.ui.home.healthy.adapter;

/* compiled from: MultipleItemQuickAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateGpsView$1", f = "MultipleItemQuickAdapter.kt", i = {}, l = {763}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class MultipleItemQuickAdapter$updateGpsView$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.widget.TextView $date;
    final /* synthetic */ android.widget.TextView $distance;
    final /* synthetic */ android.widget.ImageView $image;
    final /* synthetic */ android.widget.ImageView $imageGps;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.bean.LastGpsSportItem $item;
    final /* synthetic */ android.widget.TextView $tvUnit;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipleItemQuickAdapter$updateGpsView$1(com.qcwireless.qcwatch.ui.home.healthy.bean.LastGpsSportItem lastGpsSportItem, android.widget.TextView textView, android.widget.TextView textView2, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.TextView textView3, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateGpsView$1> continuation) {
        super(2, continuation);
        this.$item = lastGpsSportItem;
        this.$distance = textView;
        this.$date = textView2;
        this.$image = imageView;
        this.$imageGps = imageView2;
        this.$tvUnit = textView3;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> multipleItemQuickAdapter$updateGpsView$1 = new com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateGpsView$1(this.$item, this.$distance, this.$date, this.$image, this.$imageGps, this.$tvUnit, continuation);
        multipleItemQuickAdapter$updateGpsView$1.L$0 = obj;
        return multipleItemQuickAdapter$updateGpsView$1;
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
            kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.home.gps.bean.HomeGpsDetail> queryLastGpsDetail = this.$item.queryLastGpsDetail();
            final android.widget.TextView textView = this.$distance;
            final android.widget.TextView textView2 = this.$date;
            final android.widget.ImageView imageView = this.$image;
            final android.widget.ImageView imageView2 = this.$imageGps;
            final android.widget.TextView textView3 = this.$tvUnit;
            this.label = 1;
            if (queryLastGpsDetail.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateGpsView$1.1
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    return emit((com.qcwireless.qcwatch.ui.home.gps.bean.HomeGpsDetail) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                }

                public final java.lang.Object emit(final com.qcwireless.qcwatch.ui.home.gps.bean.HomeGpsDetail homeGpsDetail, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                    final android.widget.TextView textView4 = textView;
                    final android.widget.TextView textView5 = textView2;
                    final android.widget.ImageView imageView3 = imageView;
                    final android.widget.ImageView imageView4 = imageView2;
                    final android.widget.TextView textView6 = textView3;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(coroutineScope2, new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter.updateGpsView.1.1.1
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
                            textView4.setText(homeGpsDetail.getDistance());
                            if (homeGpsDetail.getDateTime() > 0) {
                                textView5.setText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormat(new com.qcwireless.qc_utils.date.DateUtil(homeGpsDetail.getDateTime(), true)));
                                com.qcwireless.qcwatch.base.view.ViewKt.gone(imageView3);
                                com.qcwireless.qcwatch.base.view.ViewKt.visible(imageView4);
                            } else {
                                com.qcwireless.qcwatch.base.view.ViewKt.visible(imageView3);
                                com.qcwireless.qcwatch.base.view.ViewKt.gone(imageView4);
                            }
                            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
                                textView6.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_88));
                            } else {
                                textView6.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_358));
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
