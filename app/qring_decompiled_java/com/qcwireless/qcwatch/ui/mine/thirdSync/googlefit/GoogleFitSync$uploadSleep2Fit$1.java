package com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit;

/* compiled from: GoogleFitSync.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/qcwireless/qcwatch/ui/mine/thirdSync/googlefit/GoogleFitSync;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
final class GoogleFitSync$uploadSleep2Fit$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync, kotlin.Unit> {
    public static final com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadSleep2Fit$1 INSTANCE = new com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadSleep2Fit$1();

    GoogleFitSync$uploadSleep2Fit$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync) obj);
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync googleFitSync) {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleAccount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleFitSync, "$this$ktxRunOnBgSingle");
        try {
            com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
            com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean sleepViewBean = new com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean(null, 0, 0, 0, 0, 0L, 0L, com.google.android.gms.internal.fitness.zzab.zzh, null);
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getNewSleepProtocol()) {
                sleepViewBean = com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.INSTANCE.getGetInstance().querySleepNewProtocol(new com.qcwireless.qc_utils.date.DateUtil());
            } else {
                com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository getInstance = com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.INSTANCE.getGetInstance();
                java.lang.String y_m_d = dateUtil.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "sleepDate.y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail querySleepByDate = getInstance.querySleepByDate(y_m_d);
                com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(dateUtil.getUnixTimestamp(), true);
                dateUtil2.addDay(-1);
                com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository getInstance2 = com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.INSTANCE.getGetInstance();
                java.lang.String y_m_d2 = dateUtil2.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "yesDate.y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail querySleepByDate2 = getInstance2.querySleepByDate(y_m_d2);
                if (querySleepByDate2 == null) {
                    querySleepByDate2 = new com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), "", 900, "", "", false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                }
                if (querySleepByDate != null) {
                    sleepViewBean = com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.INSTANCE.getGetInstance().calcSleepViewData(querySleepByDate, querySleepByDate2);
                }
            }
            if (sleepViewBean.getTotalSleep() <= 0) {
                return;
            }
            com.google.android.gms.fitness.data.Session.Builder identifier = new com.google.android.gms.fitness.data.Session.Builder().setName(dateUtil.getY_M_D()).setIdentifier(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceNameNoClear());
            android.app.Application application = com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(application, "getInstance().application");
            com.google.android.gms.fitness.data.Session build = identifier.setDescription(com.qcwireless.qcwatch.base.view.GlobalKt.getAppName(application)).setStartTime(sleepViewBean.getStartTime(), java.util.concurrent.TimeUnit.SECONDS).setEndTime(sleepViewBean.getEndTime(), java.util.concurrent.TimeUnit.SECONDS).setActivity(com.google.android.gms.fitness.FitnessActivities.SLEEP).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "Builder().setName(sleepD…                 .build()");
            com.google.android.gms.fitness.data.DataSource build2 = new com.google.android.gms.fitness.data.DataSource.Builder().setDataType(com.google.android.gms.fitness.data.DataType.TYPE_SLEEP_SEGMENT).setType(0).setAppPackageName(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "Builder()\n              …                 .build()");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, sleepViewBean.getData());
            for (com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean sleepDataBean : sleepViewBean.getData()) {
                int type = sleepDataBean.getType();
                if (type == 1) {
                    com.google.android.gms.fitness.data.DataPoint build3 = com.google.android.gms.fitness.data.DataPoint.builder(build2).setTimeInterval(sleepDataBean.getSleepStart(), sleepDataBean.getSleepEnd(), java.util.concurrent.TimeUnit.SECONDS).setField(com.google.android.gms.fitness.data.Field.FIELD_SLEEP_SEGMENT_TYPE, 5).build();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build3, "builder(dataSource)\n    …                 .build()");
                    arrayList.add(build3);
                } else if (type == 2) {
                    com.google.android.gms.fitness.data.DataPoint build4 = com.google.android.gms.fitness.data.DataPoint.builder(build2).setTimeInterval(sleepDataBean.getSleepStart(), sleepDataBean.getSleepEnd(), java.util.concurrent.TimeUnit.SECONDS).setField(com.google.android.gms.fitness.data.Field.FIELD_SLEEP_SEGMENT_TYPE, 4).build();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build4, "builder(dataSource)\n    …                 .build()");
                    arrayList.add(build4);
                } else if (type == 3) {
                    com.google.android.gms.fitness.data.DataPoint build5 = com.google.android.gms.fitness.data.DataPoint.builder(build2).setTimeInterval(sleepDataBean.getSleepStart(), sleepDataBean.getSleepEnd(), java.util.concurrent.TimeUnit.SECONDS).setField(com.google.android.gms.fitness.data.Field.FIELD_SLEEP_SEGMENT_TYPE, 1).build();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build5, "builder(dataSource)\n    …                 .build()");
                    arrayList.add(build5);
                }
            }
            com.google.android.gms.fitness.data.DataSet build6 = com.google.android.gms.fitness.data.DataSet.builder(build2).addAll(arrayList).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build6, "builder(dataSource)\n    …                 .build()");
            com.google.android.gms.fitness.request.SessionInsertRequest.Builder builder = new com.google.android.gms.fitness.request.SessionInsertRequest.Builder();
            builder.addDataSet(build6);
            builder.setSession(build);
            com.google.android.gms.fitness.request.SessionInsertRequest build7 = builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build7, "builder.build()");
            android.app.Application application2 = com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication();
            googleAccount = googleFitSync.getGoogleAccount();
            com.google.android.gms.fitness.Fitness.getSessionsClient(application2, googleAccount).insertSession(build7).addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadSleep2Fit$1$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(java.lang.Object obj) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "google fit 睡眠成功");
                }
            }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadSleep2Fit$1$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(java.lang.Exception exc) {
                    com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadSleep2Fit$1.m1328invoke$lambda2(exc);
                }
            });
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2, reason: not valid java name */
    public static final void m1328invoke$lambda2(java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "e");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "google fit 睡眠失败: " + exc.getLocalizedMessage());
    }
}
