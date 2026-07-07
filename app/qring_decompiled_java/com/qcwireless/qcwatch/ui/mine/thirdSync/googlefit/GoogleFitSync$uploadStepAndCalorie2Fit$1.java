package com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit;

/* compiled from: GoogleFitSync.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/qcwireless/qcwatch/ui/mine/thirdSync/googlefit/GoogleFitSync;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
final class GoogleFitSync$uploadStepAndCalorie2Fit$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean> $last;
    final /* synthetic */ com.qcwireless.qc_utils.date.DateUtil $todayDate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleFitSync$uploadStepAndCalorie2Fit$1(com.qcwireless.qc_utils.date.DateUtil dateUtil, kotlin.jvm.internal.Ref.ObjectRef<com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean> objectRef) {
        super(1);
        this.$todayDate = dateUtil;
        this.$last = objectRef;
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync) obj);
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync googleFitSync) {
        java.lang.String str;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleAccount;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleAccount2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleFitSync, "$this$ktxRunOnBgSingle");
        long unixTimestamp = this.$todayDate.getUnixTimestamp();
        com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository getInstance = com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.INSTANCE.getGetInstance();
        java.lang.String y_m_d = this.$todayDate.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "todayDate.y_M_D");
        final com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal queryStepTotal = getInstance.queryStepTotal(y_m_d);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, this.$last.element);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, queryStepTotal);
        com.google.android.gms.fitness.data.DataSource.Builder builder = new com.google.android.gms.fitness.data.DataSource.Builder();
        android.app.Application application = com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(application, "getInstance().application");
        com.google.android.gms.fitness.data.DataSource build = builder.setAppPackageName(com.qcwireless.qcwatch.base.view.GlobalKt.getPackageName(application)).setDataType(com.google.android.gms.fitness.data.DataType.AGGREGATE_STEP_COUNT_DELTA).setType(0).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (queryStepTotal == null) {
                str = "builder(stepDataSource)\n…                 .build()";
            } else {
                if (((com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean) this.$last.element).getStep() > queryStepTotal.getStep()) {
                    return;
                }
                if (((com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean) this.$last.element).getTime() == 0) {
                    ((com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean) this.$last.element).setTime((int) this.$todayDate.getZeroTime());
                }
                str = "builder(stepDataSource)\n…                 .build()";
                com.google.android.gms.fitness.data.DataPoint build2 = com.google.android.gms.fitness.data.DataPoint.builder(build).setField(com.google.android.gms.fitness.data.Field.FIELD_STEPS, queryStepTotal.getStep() - ((com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean) this.$last.element).getStep()).setTimeInterval(((com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean) this.$last.element).getTime(), unixTimestamp, java.util.concurrent.TimeUnit.SECONDS).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, str);
                arrayList.add(build2);
            }
            if (arrayList.size() <= 0) {
                return;
            }
            final com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean googleFitDataBean = new com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean();
            if (queryStepTotal != null) {
                googleFitDataBean.setStep(queryStepTotal.getStep());
            }
            if (queryStepTotal != null) {
                googleFitDataBean.setCalorie(queryStepTotal.getCarolie() / 1000);
            }
            googleFitDataBean.setTime((int) unixTimestamp);
            com.google.android.gms.fitness.data.DataSet build3 = com.google.android.gms.fitness.data.DataSet.builder(build).addAll(arrayList).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build3, str);
            android.app.Application application2 = com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication();
            googleAccount = googleFitSync.getGoogleAccount();
            com.google.android.gms.tasks.Task<java.lang.Void> insertData = com.google.android.gms.fitness.Fitness.getHistoryClient(application2, googleAccount).insertData(build3);
            final kotlin.jvm.internal.Ref.ObjectRef<com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean> objectRef = this.$last;
            insertData.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadStepAndCalorie2Fit$1$$ExternalSyntheticLambda3
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(java.lang.Object obj) {
                    com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadStepAndCalorie2Fit$1.m1332invoke$lambda0(com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal.this, objectRef, googleFitDataBean, (java.lang.Void) obj);
                }
            }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadStepAndCalorie2Fit$1$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(java.lang.Exception exc) {
                    com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadStepAndCalorie2Fit$1.m1333invoke$lambda1(exc);
                }
            });
            com.google.android.gms.fitness.data.DataSource.Builder builder2 = new com.google.android.gms.fitness.data.DataSource.Builder();
            android.app.Application application3 = com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(application3, "getInstance().application");
            com.google.android.gms.fitness.data.DataSource build4 = builder2.setAppPackageName(com.qcwireless.qcwatch.base.view.GlobalKt.getPackageName(application3)).setDataType(com.google.android.gms.fitness.data.DataType.TYPE_CALORIES_EXPENDED).setType(0).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build4, "Builder()\n              …                 .build()");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            com.google.android.gms.fitness.data.DataPoint.Builder builder3 = com.google.android.gms.fitness.data.DataPoint.builder(build4);
            com.google.android.gms.fitness.data.Field field = com.google.android.gms.fitness.data.Field.FIELD_CALORIES;
            kotlin.jvm.internal.Intrinsics.checkNotNull(queryStepTotal);
            com.google.android.gms.fitness.data.DataPoint build5 = builder3.setField(field, (queryStepTotal.getCarolie() / 1000) - ((com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean) this.$last.element).getCalorie()).setTimeInterval(((com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean) this.$last.element).getTime(), unixTimestamp, java.util.concurrent.TimeUnit.SECONDS).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build5, "builder(calorieDataSourc…                 .build()");
            arrayList2.add(build5);
            com.google.android.gms.fitness.data.DataSet build6 = com.google.android.gms.fitness.data.DataSet.builder(build4).addAll(arrayList2).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build6, "builder(calorieDataSourc…                 .build()");
            android.app.Application application4 = com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication();
            googleAccount2 = googleFitSync.getGoogleAccount();
            com.google.android.gms.tasks.Task<java.lang.Void> insertData2 = com.google.android.gms.fitness.Fitness.getHistoryClient(application4, googleAccount2).insertData(build6);
            final kotlin.jvm.internal.Ref.ObjectRef<com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean> objectRef2 = this.$last;
            insertData2.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadStepAndCalorie2Fit$1$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(java.lang.Object obj) {
                    com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadStepAndCalorie2Fit$1.m1334invoke$lambda2(com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal.this, objectRef2, (java.lang.Void) obj);
                }
            }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadStepAndCalorie2Fit$1$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(java.lang.Exception exc) {
                    com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadStepAndCalorie2Fit$1.m1335invoke$lambda3(exc);
                }
            });
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m1332invoke$lambda0(com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal stepTotal, kotlin.jvm.internal.Ref.ObjectRef objectRef, com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean googleFitDataBean, java.lang.Void r5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$last");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleFitDataBean, "$googleFitBean");
        if (stepTotal != null) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "google fit 步数同步成功" + (stepTotal.getStep() - ((com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean) objectRef.element).getStep()));
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(stepTotal.getStep()));
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(((com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean) objectRef.element).getStep()));
            com.iwown.awlog.AwLog.wtf(new com.qcwireless.qc_utils.date.DateUtil().getY_M_D_H_M_S() + ":google fit 步数同步成功" + (stepTotal.getStep() - ((com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean) objectRef.element).getStep()) + '\n', com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getExternalFilesDir("") + "/log/" + new com.oudmon.ble.base.util.DateUtil().getY_M_D() + "ble_status.txt");
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGoogleFitLastInfo(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(googleFitDataBean));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1, reason: not valid java name */
    public static final void m1333invoke$lambda1(java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "it");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("googleFit: 步数同步失败");
        exc.printStackTrace();
        sb.append(kotlin.Unit.INSTANCE);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2, reason: not valid java name */
    public static final void m1334invoke$lambda2(com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal stepTotal, kotlin.jvm.internal.Ref.ObjectRef objectRef, java.lang.Void r3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$last");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("google fit 卡路里同步成功");
        kotlin.jvm.internal.Intrinsics.checkNotNull(stepTotal);
        sb.append((stepTotal.getCarolie() / 1000) - ((com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean) objectRef.element).getCalorie());
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-3, reason: not valid java name */
    public static final void m1335invoke$lambda3(java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "it");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("google Fit: 卡路里同步失败");
        exc.printStackTrace();
        sb.append(kotlin.Unit.INSTANCE);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, sb.toString());
    }
}
