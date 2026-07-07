package com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit;

/* compiled from: GoogleFitSync.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u0012\u001a\u00020\nJ\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u0015\u001a\u00020\u000eJ\b\u0010\u0016\u001a\u00020\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/thirdSync/googlefit/GoogleFitSync;", "", "()V", "fitnessOptions", "Lcom/google/android/gms/fitness/FitnessOptions;", "getFitnessOptions", "()Lcom/google/android/gms/fitness/FitnessOptions;", "fitnessOptions$delegate", "Lkotlin/Lazy;", "connectGoogleFit", "", "activity", "Landroid/app/Activity;", "disconnectGoogleFit", "", "getGoogleAccount", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "getLastSignIn", "hasGoogleFitPermissions", "isGooglePlayAvailable", "supportGoogleFit", "syncGoogleFit", "uploadHeart2Fit", "uploadSleep2Fit", "uploadStepAndCalorie2Fit", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GoogleFitSync {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync.Companion INSTANCE = new com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync>() { // from class: com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync m1322invoke() {
            return new com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync();
        }
    });

    /* renamed from: fitnessOptions$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy fitnessOptions = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.google.android.gms.fitness.FitnessOptions>() { // from class: com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$fitnessOptions$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.google.android.gms.fitness.FitnessOptions m1323invoke() {
            com.google.android.gms.fitness.FitnessOptions build = com.google.android.gms.fitness.FitnessOptions.builder().addDataType(com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_DELTA, 1).addDataType(com.google.android.gms.fitness.data.DataType.AGGREGATE_STEP_COUNT_DELTA, 1).addDataType(com.google.android.gms.fitness.data.DataType.TYPE_CALORIES_EXPENDED, 1).addDataType(com.google.android.gms.fitness.data.DataType.TYPE_SLEEP_SEGMENT, 1).addDataType(com.google.android.gms.fitness.data.DataType.TYPE_HEART_RATE_BPM, 1).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "builder()\n            .a…ITE)\n            .build()");
            return build;
        }
    });

    private final com.google.android.gms.fitness.FitnessOptions getFitnessOptions() {
        return (com.google.android.gms.fitness.FitnessOptions) this.fitnessOptions.getValue();
    }

    public final boolean supportGoogleFit(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        if (isGooglePlayAvailable(activity)) {
            return true;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "GooglePlayAvailable");
        return false;
    }

    public final boolean connectGoogleFit(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity.isDestroyed()) {
            return false;
        }
        if (!isGooglePlayAvailable(activity)) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "GooglePlayAvailable");
            return false;
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleAccount = getGoogleAccount();
        com.google.android.gms.auth.api.signin.GoogleSignIn.requestPermissions(activity, 2000, googleAccount, getFitnessOptions());
        if (com.google.android.gms.auth.api.signin.GoogleSignIn.hasPermissions(googleAccount, getFitnessOptions())) {
            return true;
        }
        com.google.android.gms.auth.api.signin.GoogleSignIn.requestPermissions(activity, 2000, googleAccount, getFitnessOptions());
        com.iwown.awlog.AwLog.e(com.iwown.awlog.Author.HeZhiYuan, "权限没有授权");
        return false;
    }

    public final boolean hasGoogleFitPermissions() {
        return com.google.android.gms.auth.api.signin.GoogleSignIn.hasPermissions(getGoogleAccount(), getFitnessOptions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleAccount() {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount accountForExtension = com.google.android.gms.auth.api.signin.GoogleSignIn.getAccountForExtension(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication(), getFitnessOptions());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(accountForExtension, "getAccountForExtension(\n…     fitnessOptions\n    )");
        return accountForExtension;
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount getLastSignIn() {
        return com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication());
    }

    private final boolean isGooglePlayAvailable(android.app.Activity activity) {
        android.app.Dialog errorDialog;
        com.google.android.gms.common.GoogleApiAvailability googleApiAvailability = com.google.android.gms.common.GoogleApiAvailability.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(googleApiAvailability, "getInstance()");
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(activity.getApplicationContext());
        if (isGooglePlayServicesAvailable == 0) {
            return true;
        }
        if (googleApiAvailability.isUserResolvableError(isGooglePlayServicesAvailable) && (errorDialog = googleApiAvailability.getErrorDialog(activity, isGooglePlayServicesAvailable, 2404)) != null) {
            errorDialog.show();
        }
        return false;
    }

    public final void disconnectGoogleFit() {
        com.google.android.gms.fitness.Fitness.getConfigClient(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication(), getGoogleAccount()).disableFit();
    }

    public final void syncGoogleFit() {
        try {
            uploadStepAndCalorie2Fit();
            uploadSleep2Fit();
            uploadHeart2Fit();
        } catch (java.lang.Exception unused) {
        }
    }

    private final void uploadStepAndCalorie2Fit() {
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
        java.lang.String googleFitLastInfo = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getGoogleFitLastInfo();
        if (googleFitLastInfo.length() == 0) {
            com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean googleFitDataBean = new com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean();
            googleFitDataBean.setStep(0);
            googleFitDataBean.setCalorie(0);
            googleFitDataBean.setTime((int) dateUtil.getZeroTime());
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGoogleFitLastInfo(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(googleFitDataBean));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            googleFitLastInfo = com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(googleFitDataBean);
        } else {
            com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean>() { // from class: com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadStepAndCalorie2Fit$$inlined$fromJson$1
            }.getType());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
            if (((com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean) adapter.fromJson(googleFitLastInfo)) != null && !new com.qcwireless.qc_utils.date.DateUtil(r2.getTime(), true).isToday()) {
                com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean googleFitDataBean2 = new com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean();
                googleFitDataBean2.setStep(0);
                googleFitDataBean2.setCalorie(0);
                googleFitDataBean2.setTime((int) dateUtil.getZeroTime());
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGoogleFitLastInfo(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(googleFitDataBean2));
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                googleFitLastInfo = com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(googleFitDataBean2);
            }
        }
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.squareup.moshi.JsonAdapter adapter2 = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean>() { // from class: com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadStepAndCalorie2Fit$$inlined$fromJson$2
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter2, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
        objectRef.element = adapter2.fromJson(googleFitLastInfo);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, objectRef.element);
        if (objectRef.element == null) {
            com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean googleFitDataBean3 = new com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean();
            googleFitDataBean3.setStep(0);
            googleFitDataBean3.setCalorie(0);
            googleFitDataBean3.setTime((int) dateUtil.getZeroTime());
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGoogleFitLastInfo(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(googleFitDataBean3));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            objectRef.element = googleFitDataBean3;
        } else if (dateUtil.getUnixTimestamp() - ((com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean) objectRef.element).getTime() < 120) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "Google Fit 两分钟内不同步");
            return;
        }
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadStepAndCalorie2Fit$1(dateUtil, objectRef));
    }

    private final void uploadSleep2Fit() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadSleep2Fit$1.INSTANCE);
    }

    private final void uploadHeart2Fit() {
        com.google.android.gms.fitness.data.DataSource.Builder dataType = new com.google.android.gms.fitness.data.DataSource.Builder().setType(0).setDataType(com.google.android.gms.fitness.data.DataType.TYPE_HEART_RATE_BPM);
        android.app.Application application = com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(application, "getInstance().application");
        com.google.android.gms.fitness.data.DataSource build = dataType.setAppPackageName(com.qcwireless.qcwatch.base.view.GlobalKt.getPackageName(application)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "Builder().setType(DataSo…on))\n            .build()");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync$uploadHeart2Fit$1(build));
    }

    /* compiled from: GoogleFitSync.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/thirdSync/googlefit/GoogleFitSync$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/mine/thirdSync/googlefit/GoogleFitSync;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/mine/thirdSync/googlefit/GoogleFitSync;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync getGetInstance() {
            return (com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync) com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync.getInstance$delegate.getValue();
        }
    }
}
