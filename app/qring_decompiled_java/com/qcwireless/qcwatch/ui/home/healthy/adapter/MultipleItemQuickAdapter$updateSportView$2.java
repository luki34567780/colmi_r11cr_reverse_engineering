package com.qcwireless.qcwatch.ui.home.healthy.adapter;

/* compiled from: MultipleItemQuickAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateSportView$2", f = "MultipleItemQuickAdapter.kt", i = {}, l = {841}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class MultipleItemQuickAdapter$updateSportView$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.widget.TextView $date;
    final /* synthetic */ android.widget.TextView $duration;
    final /* synthetic */ androidx.constraintlayout.widget.Group $group;
    final /* synthetic */ android.widget.TextView $homeDistance;
    final /* synthetic */ android.widget.TextView $homeHeart;
    final /* synthetic */ android.widget.TextView $homeKcal;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.bean.LastSportItem $item;
    final /* synthetic */ android.widget.TextView $noData;
    final /* synthetic */ android.widget.TextView $sportName;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView $sportView;
    final /* synthetic */ android.widget.TextView $tv1;
    final /* synthetic */ android.widget.TextView $unit;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipleItemQuickAdapter$updateSportView$2(com.qcwireless.qcwatch.ui.home.healthy.bean.LastSportItem lastSportItem, android.widget.TextView textView, androidx.constraintlayout.widget.Group group, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.TextView textView6, com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter multipleItemQuickAdapter, android.widget.TextView textView7, android.widget.TextView textView8, android.widget.TextView textView9, com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView pGHeartSportDetailLineChartView, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateSportView$2> continuation) {
        super(2, continuation);
        this.$item = lastSportItem;
        this.$date = textView;
        this.$group = group;
        this.$noData = textView2;
        this.$unit = textView3;
        this.$tv1 = textView4;
        this.$homeDistance = textView5;
        this.$sportName = textView6;
        this.this$0 = multipleItemQuickAdapter;
        this.$duration = textView7;
        this.$homeKcal = textView8;
        this.$homeHeart = textView9;
        this.$sportView = pGHeartSportDetailLineChartView;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> multipleItemQuickAdapter$updateSportView$2 = new com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateSportView$2(this.$item, this.$date, this.$group, this.$noData, this.$unit, this.$tv1, this.$homeDistance, this.$sportName, this.this$0, this.$duration, this.$homeKcal, this.$homeHeart, this.$sportView, continuation);
        multipleItemQuickAdapter$updateSportView$2.L$0 = obj;
        return multipleItemQuickAdapter$updateSportView$2;
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
            kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.home.sport.bean.HomeSportDetail> queryLastSport = this.$item.queryLastSport();
            final android.widget.TextView textView = this.$date;
            final androidx.constraintlayout.widget.Group group = this.$group;
            final android.widget.TextView textView2 = this.$noData;
            final android.widget.TextView textView3 = this.$unit;
            final android.widget.TextView textView4 = this.$tv1;
            final android.widget.TextView textView5 = this.$homeDistance;
            final android.widget.TextView textView6 = this.$sportName;
            final com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter multipleItemQuickAdapter = this.this$0;
            final android.widget.TextView textView7 = this.$duration;
            final android.widget.TextView textView8 = this.$homeKcal;
            final android.widget.TextView textView9 = this.$homeHeart;
            final com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView pGHeartSportDetailLineChartView = this.$sportView;
            this.label = 1;
            if (queryLastSport.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateSportView$2.1
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    return emit((com.qcwireless.qcwatch.ui.home.sport.bean.HomeSportDetail) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                }

                public final java.lang.Object emit(final com.qcwireless.qcwatch.ui.home.sport.bean.HomeSportDetail homeSportDetail, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                    final android.widget.TextView textView10 = textView;
                    final androidx.constraintlayout.widget.Group group2 = group;
                    final android.widget.TextView textView11 = textView2;
                    final android.widget.TextView textView12 = textView3;
                    final android.widget.TextView textView13 = textView4;
                    final android.widget.TextView textView14 = textView5;
                    final android.widget.TextView textView15 = textView6;
                    final com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter multipleItemQuickAdapter2 = multipleItemQuickAdapter;
                    final android.widget.TextView textView16 = textView7;
                    final android.widget.TextView textView17 = textView8;
                    final android.widget.TextView textView18 = textView9;
                    final com.qcwireless.qcwatch.ui.base.view.PGHeartSportDetailLineChartView pGHeartSportDetailLineChartView2 = pGHeartSportDetailLineChartView;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(coroutineScope2, new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter.updateSportView.2.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                            invoke((kotlinx.coroutines.CoroutineScope) obj2);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:22:0x0177 A[Catch: Exception -> 0x0329, TryCatch #0 {Exception -> 0x0329, blocks: (B:3:0x0016, B:6:0x002d, B:8:0x0036, B:11:0x0041, B:12:0x0104, B:15:0x0113, B:17:0x011d, B:20:0x0127, B:22:0x0177, B:24:0x0183, B:27:0x019b, B:29:0x01b3, B:31:0x01bf, B:33:0x01d7, B:63:0x0325, B:65:0x004a, B:67:0x0067, B:69:0x00a4, B:70:0x00ac, B:71:0x00b5, B:73:0x00e0, B:74:0x00f0, B:75:0x00e8, B:36:0x01ef, B:38:0x0229, B:39:0x0242, B:41:0x024c, B:42:0x0269, B:44:0x0271, B:45:0x028a, B:47:0x029f, B:49:0x02b7, B:51:0x02c2, B:52:0x02ea, B:54:0x02f6, B:56:0x030d, B:58:0x02df, B:59:0x0283, B:60:0x0261, B:61:0x023b), top: B:2:0x0016, inners: #1 }] */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x01b3 A[Catch: Exception -> 0x0329, TryCatch #0 {Exception -> 0x0329, blocks: (B:3:0x0016, B:6:0x002d, B:8:0x0036, B:11:0x0041, B:12:0x0104, B:15:0x0113, B:17:0x011d, B:20:0x0127, B:22:0x0177, B:24:0x0183, B:27:0x019b, B:29:0x01b3, B:31:0x01bf, B:33:0x01d7, B:63:0x0325, B:65:0x004a, B:67:0x0067, B:69:0x00a4, B:70:0x00ac, B:71:0x00b5, B:73:0x00e0, B:74:0x00f0, B:75:0x00e8, B:36:0x01ef, B:38:0x0229, B:39:0x0242, B:41:0x024c, B:42:0x0269, B:44:0x0271, B:45:0x028a, B:47:0x029f, B:49:0x02b7, B:51:0x02c2, B:52:0x02ea, B:54:0x02f6, B:56:0x030d, B:58:0x02df, B:59:0x0283, B:60:0x0261, B:61:0x023b), top: B:2:0x0016, inners: #1 }] */
                        /* JADX WARN: Removed duplicated region for block: B:38:0x0229 A[Catch: Exception -> 0x0324, TryCatch #1 {Exception -> 0x0324, blocks: (B:36:0x01ef, B:38:0x0229, B:39:0x0242, B:41:0x024c, B:42:0x0269, B:44:0x0271, B:45:0x028a, B:47:0x029f, B:49:0x02b7, B:51:0x02c2, B:52:0x02ea, B:54:0x02f6, B:56:0x030d, B:58:0x02df, B:59:0x0283, B:60:0x0261, B:61:0x023b), top: B:35:0x01ef, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:41:0x024c A[Catch: Exception -> 0x0324, TryCatch #1 {Exception -> 0x0324, blocks: (B:36:0x01ef, B:38:0x0229, B:39:0x0242, B:41:0x024c, B:42:0x0269, B:44:0x0271, B:45:0x028a, B:47:0x029f, B:49:0x02b7, B:51:0x02c2, B:52:0x02ea, B:54:0x02f6, B:56:0x030d, B:58:0x02df, B:59:0x0283, B:60:0x0261, B:61:0x023b), top: B:35:0x01ef, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:44:0x0271 A[Catch: Exception -> 0x0324, TryCatch #1 {Exception -> 0x0324, blocks: (B:36:0x01ef, B:38:0x0229, B:39:0x0242, B:41:0x024c, B:42:0x0269, B:44:0x0271, B:45:0x028a, B:47:0x029f, B:49:0x02b7, B:51:0x02c2, B:52:0x02ea, B:54:0x02f6, B:56:0x030d, B:58:0x02df, B:59:0x0283, B:60:0x0261, B:61:0x023b), top: B:35:0x01ef, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:47:0x029f A[Catch: Exception -> 0x0324, LOOP:0: B:46:0x029d->B:47:0x029f, LOOP_END, TryCatch #1 {Exception -> 0x0324, blocks: (B:36:0x01ef, B:38:0x0229, B:39:0x0242, B:41:0x024c, B:42:0x0269, B:44:0x0271, B:45:0x028a, B:47:0x029f, B:49:0x02b7, B:51:0x02c2, B:52:0x02ea, B:54:0x02f6, B:56:0x030d, B:58:0x02df, B:59:0x0283, B:60:0x0261, B:61:0x023b), top: B:35:0x01ef, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:51:0x02c2 A[Catch: Exception -> 0x0324, TryCatch #1 {Exception -> 0x0324, blocks: (B:36:0x01ef, B:38:0x0229, B:39:0x0242, B:41:0x024c, B:42:0x0269, B:44:0x0271, B:45:0x028a, B:47:0x029f, B:49:0x02b7, B:51:0x02c2, B:52:0x02ea, B:54:0x02f6, B:56:0x030d, B:58:0x02df, B:59:0x0283, B:60:0x0261, B:61:0x023b), top: B:35:0x01ef, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:54:0x02f6 A[Catch: Exception -> 0x0324, TryCatch #1 {Exception -> 0x0324, blocks: (B:36:0x01ef, B:38:0x0229, B:39:0x0242, B:41:0x024c, B:42:0x0269, B:44:0x0271, B:45:0x028a, B:47:0x029f, B:49:0x02b7, B:51:0x02c2, B:52:0x02ea, B:54:0x02f6, B:56:0x030d, B:58:0x02df, B:59:0x0283, B:60:0x0261, B:61:0x023b), top: B:35:0x01ef, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:56:0x030d A[Catch: Exception -> 0x0324, TRY_LEAVE, TryCatch #1 {Exception -> 0x0324, blocks: (B:36:0x01ef, B:38:0x0229, B:39:0x0242, B:41:0x024c, B:42:0x0269, B:44:0x0271, B:45:0x028a, B:47:0x029f, B:49:0x02b7, B:51:0x02c2, B:52:0x02ea, B:54:0x02f6, B:56:0x030d, B:58:0x02df, B:59:0x0283, B:60:0x0261, B:61:0x023b), top: B:35:0x01ef, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:58:0x02df A[Catch: Exception -> 0x0324, TryCatch #1 {Exception -> 0x0324, blocks: (B:36:0x01ef, B:38:0x0229, B:39:0x0242, B:41:0x024c, B:42:0x0269, B:44:0x0271, B:45:0x028a, B:47:0x029f, B:49:0x02b7, B:51:0x02c2, B:52:0x02ea, B:54:0x02f6, B:56:0x030d, B:58:0x02df, B:59:0x0283, B:60:0x0261, B:61:0x023b), top: B:35:0x01ef, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:59:0x0283 A[Catch: Exception -> 0x0324, TryCatch #1 {Exception -> 0x0324, blocks: (B:36:0x01ef, B:38:0x0229, B:39:0x0242, B:41:0x024c, B:42:0x0269, B:44:0x0271, B:45:0x028a, B:47:0x029f, B:49:0x02b7, B:51:0x02c2, B:52:0x02ea, B:54:0x02f6, B:56:0x030d, B:58:0x02df, B:59:0x0283, B:60:0x0261, B:61:0x023b), top: B:35:0x01ef, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:60:0x0261 A[Catch: Exception -> 0x0324, TryCatch #1 {Exception -> 0x0324, blocks: (B:36:0x01ef, B:38:0x0229, B:39:0x0242, B:41:0x024c, B:42:0x0269, B:44:0x0271, B:45:0x028a, B:47:0x029f, B:49:0x02b7, B:51:0x02c2, B:52:0x02ea, B:54:0x02f6, B:56:0x030d, B:58:0x02df, B:59:0x0283, B:60:0x0261, B:61:0x023b), top: B:35:0x01ef, outer: #0 }] */
                        /* JADX WARN: Removed duplicated region for block: B:61:0x023b A[Catch: Exception -> 0x0324, TryCatch #1 {Exception -> 0x0324, blocks: (B:36:0x01ef, B:38:0x0229, B:39:0x0242, B:41:0x024c, B:42:0x0269, B:44:0x0271, B:45:0x028a, B:47:0x029f, B:49:0x02b7, B:51:0x02c2, B:52:0x02ea, B:54:0x02f6, B:56:0x030d, B:58:0x02df, B:59:0x0283, B:60:0x0261, B:61:0x023b), top: B:35:0x01ef, outer: #0 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void invoke(kotlinx.coroutines.CoroutineScope r19) {
                            /*
                                Method dump skipped, instructions count: 814
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.home.healthy.adapter.MultipleItemQuickAdapter$updateSportView$2.AnonymousClass1.C00231.invoke(kotlinx.coroutines.CoroutineScope):void");
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
