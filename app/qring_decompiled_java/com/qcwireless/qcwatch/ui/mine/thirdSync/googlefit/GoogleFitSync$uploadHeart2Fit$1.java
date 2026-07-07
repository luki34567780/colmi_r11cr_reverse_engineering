package com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit;

/* compiled from: GoogleFitSync.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/qcwireless/qcwatch/ui/mine/thirdSync/googlefit/GoogleFitSync;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
final class GoogleFitSync$uploadHeart2Fit$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync, kotlin.Unit> {
    final /* synthetic */ com.google.android.gms.fitness.data.DataSource $dataSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleFitSync$uploadHeart2Fit$1(com.google.android.gms.fitness.data.DataSource dataSource) {
        super(1);
        this.$dataSource = dataSource;
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync) obj);
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync googleFitSync) {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleAccount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleFitSync, "$this$ktxRunOnBgSingle");
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
        java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> queryHeartDetail = com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.INSTANCE.getGetInstance().queryHeartDetail(dateUtil);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> it = queryHeartDetail.iterator();
        while (it.hasNext()) {
            if (it.next().getValue() > 0) {
                com.google.android.gms.fitness.data.DataPoint build = com.google.android.gms.fitness.data.DataPoint.builder(this.$dataSource).setField(com.google.android.gms.fitness.data.Field.FIELD_BPM, r3.getValue()).setTimeInterval((r3.getMin() * 60) + dateUtil.getZeroTime(), 1 + dateUtil.getZeroTime() + (r3.getMin() * 60), java.util.concurrent.TimeUnit.SECONDS).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "builder(dataSource)\n    …                 .build()");
                arrayList.add(build);
            }
        }
        com.google.android.gms.fitness.data.DataSet build2 = com.google.android.gms.fitness.data.DataSet.builder(this.$dataSource).addAll(arrayList).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "builder(dataSource)\n    …\n                .build()");
        try {
            if (build2.isEmpty()) {
                return;
            }
            android.app.Application application = com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication();
            googleAccount = googleFitSync.getGoogleAccount();
            com.google.android.gms.fitness.Fitness.getHistoryClient(application, googleAccount).insertData(build2).addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadHeart2Fit$1$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(java.lang.Object obj) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "google Fit 心率插入成功--> ");
                }
            }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadHeart2Fit$1$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(java.lang.Exception exc) {
                    com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadHeart2Fit$1.m1326invoke$lambda1(exc);
                }
            });
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "google Fit 心率插入异常--> ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1, reason: not valid java name */
    public static final void m1326invoke$lambda1(java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "it");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("google Fit 心率插入失败--> ");
        exc.printStackTrace();
        sb.append(kotlin.Unit.INSTANCE);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, sb.toString());
    }
}
