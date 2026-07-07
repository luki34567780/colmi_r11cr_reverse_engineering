package com.qcwireless.qcwatch.ui.home.sport;

/* compiled from: SportRunningActivity.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0012\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0019H\u0014J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0017J\b\u0010\"\u001a\u00020\u0019H\u0014J\b\u0010#\u001a\u00020\u0019H\u0014J\u0006\u0010$\u001a\u00020\u0019J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002J\b\u0010'\u001a\u00020\u0019H\u0002J\b\u0010(\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/SportRunningActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivitySportRunningBinding;", "gpsResponse", "Lcom/oudmon/ble/base/communication/ICommandResponse;", "Lcom/oudmon/ble/base/communication/rsp/AppSportRsp;", "myDeviceSportNotifyListener", "Lcom/qcwireless/qcwatch/ui/home/sport/SportRunningActivity$MyDeviceNotifyListener;", com.google.android.gms.fitness.FitnessActivities.RUNNING, "", "sportDuration", "sportMap", "", "", "sportStatus", "sportType", "startAnim", "Landroid/view/animation/TranslateAnimation;", "startFlag", "", "startTime", "", "endViewAnim", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "setupViews", "showGpsEnd", "showGpsExitDialog", "startViewAnim", "stopGps", "stopRun", "MyDeviceNotifyListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SportRunningActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding binding;
    private com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.AppSportRsp> gpsResponse;
    private final com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.MyDeviceNotifyListener myDeviceSportNotifyListener = new com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.MyDeviceNotifyListener();
    private int running;
    private int sportDuration;
    private java.util.Map<java.lang.Integer, java.lang.Integer[]> sportMap;
    private int sportStatus;
    private int sportType;
    private android.view.animation.TranslateAnimation startAnim;
    private boolean startFlag;
    private long startTime;

    public SportRunningActivity() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.sportMap = linkedHashMap;
        linkedHashMap.put(4, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_213), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_buxing)});
        this.sportMap.put(5, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_271), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_tiaosheng)});
        this.sportMap.put(6, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_338), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_youyong)});
        this.sportMap.put(7, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_295), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_paobu)});
        java.util.Map<java.lang.Integer, java.lang.Integer[]> map = this.sportMap;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_tubu);
        map.put(8, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_214), valueOf});
        this.sportMap.put(9, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_216), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_qixing)});
        this.sportMap.put(10, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_215), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_duanlian)});
        this.sportMap.put(11, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_217), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_huipai)});
        this.sportMap.put(20, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_339), valueOf});
        this.sportMap.put(21, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_340), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_yumaoqiu)});
        this.sportMap.put(22, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_341), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_yujia)});
        this.sportMap.put(23, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_342), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_jianshencao)});
        this.sportMap.put(24, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_343), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_donggandanche)});
        this.sportMap.put(25, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_344), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_pihuating)});
        this.sportMap.put(26, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_345), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_tuoyuanji)});
        this.sportMap.put(27, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_346), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_huachuanji)});
        this.sportMap.put(28, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_347), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_pingpangq)});
        this.sportMap.put(29, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_348), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_wangqiu)});
        this.sportMap.put(30, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_349), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_gaoerfu)});
        this.sportMap.put(31, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_350), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_lanqiu)});
        this.sportMap.put(32, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_351), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_zuqiu)});
        this.sportMap.put(33, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_352), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_paiqiu)});
        this.sportMap.put(34, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_353), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_panyan)});
        this.sportMap.put(35, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_354), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_wudao)});
        this.sportMap.put(36, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_355), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.sport_lunhua)});
        this.sportMap.put(60, new java.lang.Integer[]{java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.string.qc_text_2558), java.lang.Integer.valueOf(com.qcwireless.qcwatch.R.mipmap.ic_sport_60)});
        this.gpsResponse = new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity$$ExternalSyntheticLambda3
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.m1195gpsResponse$lambda7(com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this, (com.oudmon.ble.base.communication.rsp.AppSportRsp) baseRspCmd);
            }
        };
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding inflate = com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        androidx.constraintlayout.widget.ConstraintLayout root = inflate.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView((android.view.View) root);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        android.os.Bundle extras = getIntent().getExtras();
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding = null;
        java.lang.Integer valueOf = extras != null ? java.lang.Integer.valueOf(extras.getInt("sportType")) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
        this.sportType = valueOf.intValue();
        android.os.Bundle extras2 = getIntent().getExtras();
        java.lang.Integer valueOf2 = extras2 != null ? java.lang.Integer.valueOf(extras2.getInt(com.google.android.gms.fitness.FitnessActivities.RUNNING)) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf2);
        this.running = valueOf2.intValue();
        android.os.Bundle extras3 = getIntent().getExtras();
        java.lang.Integer valueOf3 = extras3 != null ? java.lang.Integer.valueOf(extras3.getInt("sportStatus")) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf3);
        this.sportStatus = valueOf3.intValue();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(this.sportType));
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding2 = this.binding;
        if (activitySportRunningBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding2 = null;
        }
        android.widget.TextView textView = activitySportRunningBinding2.titleBar.tvTitle;
        java.lang.Integer[] numArr = this.sportMap.get(java.lang.Integer.valueOf(this.sportType));
        textView.setText(numArr != null ? getString(numArr[0].intValue()) : null);
        if (this.running >= 0) {
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PhoneSportReq.getSportStatus((byte) 1, (byte) this.sportType), this.gpsResponse);
        }
        int i = this.sportType;
        if (i == 4 || i == 7 || i == 8) {
            com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding3 = this.binding;
            if (activitySportRunningBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activitySportRunningBinding3 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible((android.view.View) activitySportRunningBinding3.gpsDistance);
            com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding4 = this.binding;
            if (activitySportRunningBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activitySportRunningBinding4 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible((android.view.View) activitySportRunningBinding4.gpsStep);
        } else {
            com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding5 = this.binding;
            if (activitySportRunningBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activitySportRunningBinding5 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) activitySportRunningBinding5.gpsDistance);
            com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding6 = this.binding;
            if (activitySportRunningBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activitySportRunningBinding6 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone((android.view.View) activitySportRunningBinding6.gpsStep);
        }
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding7 = this.binding;
        if (activitySportRunningBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding7 = null;
        }
        activitySportRunningBinding7.imageStop.setListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.m1196setupViews$lambda1(com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding8 = this.binding;
        if (activitySportRunningBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding8 = null;
        }
        activitySportRunningBinding8.imageEnd.setListener(new com.qcwireless.qcwatch.ui.base.view.gps.GpsEndView.GpsEndListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity$$ExternalSyntheticLambda5
            @Override // com.qcwireless.qcwatch.ui.base.view.gps.GpsEndView.GpsEndListener
            public final void gpsEnd() {
                com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.m1197setupViews$lambda2(com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding9 = this.binding;
        if (activitySportRunningBinding9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding9 = null;
        }
        activitySportRunningBinding9.imageStop.setEndListener(new com.qcwireless.qcwatch.ui.base.view.gps.LockView.EndListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity$$ExternalSyntheticLambda6
            @Override // com.qcwireless.qcwatch.ui.base.view.gps.LockView.EndListener
            public final void onEnd() {
                com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.m1198setupViews$lambda3(com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this);
            }
        });
        android.view.View[] viewArr = new android.view.View[4];
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding10 = this.binding;
        if (activitySportRunningBinding10 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding10 = null;
        }
        viewArr[0] = activitySportRunningBinding10.titleBar.ivNavigateBefore;
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding11 = this.binding;
        if (activitySportRunningBinding11 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding11 = null;
        }
        viewArr[1] = activitySportRunningBinding11.imageContinue;
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding12 = this.binding;
        if (activitySportRunningBinding12 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding12 = null;
        }
        viewArr[2] = activitySportRunningBinding12.imageScreenLock;
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding13 = this.binding;
        if (activitySportRunningBinding13 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding13 = null;
        }
        viewArr[3] = activitySportRunningBinding13.viewTopOfLayout;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity$setupViews$5
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding14;
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding15;
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding16;
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding17;
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding18;
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding19;
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding20;
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding21;
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding22;
                int i2;
                com.oudmon.ble.base.communication.ICommandResponse iCommandResponse;
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding23;
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding24;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activitySportRunningBinding14 = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.binding;
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding25 = null;
                if (activitySportRunningBinding14 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activitySportRunningBinding14 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activitySportRunningBinding14.titleBar.ivNavigateBefore)) {
                    com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.showGpsExitDialog();
                    return;
                }
                activitySportRunningBinding15 = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.binding;
                if (activitySportRunningBinding15 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activitySportRunningBinding15 = null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activitySportRunningBinding15.imageContinue)) {
                    activitySportRunningBinding16 = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.binding;
                    if (activitySportRunningBinding16 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activitySportRunningBinding16 = null;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(view, activitySportRunningBinding16.imageScreenLock)) {
                        activitySportRunningBinding18 = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.binding;
                        if (activitySportRunningBinding18 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activitySportRunningBinding18 = null;
                        }
                        activitySportRunningBinding18.imageStop.setLock(true);
                        activitySportRunningBinding19 = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.binding;
                        if (activitySportRunningBinding19 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activitySportRunningBinding19 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activitySportRunningBinding19.tvLabelUnlock);
                        activitySportRunningBinding20 = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.binding;
                        if (activitySportRunningBinding20 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activitySportRunningBinding20 = null;
                        }
                        activitySportRunningBinding20.imageStop.flipAnimator(1);
                        activitySportRunningBinding21 = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.binding;
                        if (activitySportRunningBinding21 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activitySportRunningBinding21 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.gone(activitySportRunningBinding21.imageScreenLock);
                        activitySportRunningBinding22 = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.binding;
                        if (activitySportRunningBinding22 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activitySportRunningBinding25 = activitySportRunningBinding22;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activitySportRunningBinding25.viewTopOfLayout);
                        return;
                    }
                    activitySportRunningBinding17 = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.binding;
                    if (activitySportRunningBinding17 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activitySportRunningBinding25 = activitySportRunningBinding17;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(view, activitySportRunningBinding25.viewTopOfLayout)) {
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---click--");
                        return;
                    }
                    return;
                }
                com.oudmon.ble.base.communication.CommandHandle commandHandle = com.oudmon.ble.base.communication.CommandHandle.getInstance();
                i2 = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.sportType;
                com.oudmon.ble.base.communication.req.PhoneSportReq sportStatus = com.oudmon.ble.base.communication.req.PhoneSportReq.getSportStatus((byte) 3, (byte) i2);
                iCommandResponse = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.gpsResponse;
                commandHandle.executeReqCmd(sportStatus, iCommandResponse);
                activitySportRunningBinding23 = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.binding;
                if (activitySportRunningBinding23 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activitySportRunningBinding23 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activitySportRunningBinding23.tvLabelEnd);
                activitySportRunningBinding24 = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.binding;
                if (activitySportRunningBinding24 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activitySportRunningBinding25 = activitySportRunningBinding24;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activitySportRunningBinding25.imageScreenLock);
                com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.startViewAnim();
            }
        });
        if (this.sportStatus == 2) {
            com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding14 = this.binding;
            if (activitySportRunningBinding14 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activitySportRunningBinding = activitySportRunningBinding14;
            }
            activitySportRunningBinding.imageContinue.performClick();
        }
        androidx.core.app.ActivityCompat.checkSelfPermission((android.content.Context) this, com.hjq.permissions.Permission.ACCESS_FINE_LOCATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m1196setupViews$lambda1(com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity sportRunningActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportRunningActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding = sportRunningActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding2 = null;
        if (activitySportRunningBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding = null;
        }
        activitySportRunningBinding.imageStop.setVisibility(4);
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding3 = sportRunningActivity.binding;
        if (activitySportRunningBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding3 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activitySportRunningBinding3.imageContinue);
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding4 = sportRunningActivity.binding;
        if (activitySportRunningBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding4 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activitySportRunningBinding4.imageEnd);
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding5 = sportRunningActivity.binding;
        if (activitySportRunningBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding5 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activitySportRunningBinding5.imageScreenLock);
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding6 = sportRunningActivity.binding;
        if (activitySportRunningBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activitySportRunningBinding2 = activitySportRunningBinding6;
        }
        activitySportRunningBinding2.imageStop.setEnabled(false);
        sportRunningActivity.endViewAnim();
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PhoneSportReq.getSportStatus((byte) 2, (byte) sportRunningActivity.sportType), sportRunningActivity.gpsResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m1197setupViews$lambda2(com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity sportRunningActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportRunningActivity, "this$0");
        if (sportRunningActivity.sportDuration / 60 < 1) {
            sportRunningActivity.showGpsExitDialog();
        } else {
            sportRunningActivity.stopRun();
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PhoneSportReq.getSportStatus((byte) 4, (byte) sportRunningActivity.sportType), sportRunningActivity.gpsResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-3, reason: not valid java name */
    public static final void m1198setupViews$lambda3(com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity sportRunningActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportRunningActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding = sportRunningActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding2 = null;
        if (activitySportRunningBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding = null;
        }
        activitySportRunningBinding.imageStop.setLock(false);
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding3 = sportRunningActivity.binding;
        if (activitySportRunningBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding3 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activitySportRunningBinding3.tvLabelUnlock);
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding4 = sportRunningActivity.binding;
        if (activitySportRunningBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding4 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activitySportRunningBinding4.imageScreenLock);
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding5 = sportRunningActivity.binding;
        if (activitySportRunningBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activitySportRunningBinding2 = activitySportRunningBinding5;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activitySportRunningBinding2.viewTopOfLayout);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().addSportDeviceListener(120, this.myDeviceSportNotifyListener);
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding = null;
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding2 = this.binding;
            if (activitySportRunningBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activitySportRunningBinding2 = null;
            }
            activitySportRunningBinding2.imageBleStatus.setImageResource(com.qcwireless.qcwatch.R.mipmap.ble_disconnect);
            java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding3 = this.binding;
        if (activitySportRunningBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activitySportRunningBinding = activitySportRunningBinding3;
        }
        activitySportRunningBinding.imageBleStatus.setImageResource(com.qcwireless.qcwatch.R.mipmap.ble_connect);
    }

    private final void stopRun() {
        finish();
    }

    /* compiled from: SportRunningActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/SportRunningActivity$MyDeviceNotifyListener;", "Lcom/oudmon/ble/base/communication/responseImpl/DeviceSportNotifyListener;", "(Lcom/qcwireless/qcwatch/ui/home/sport/SportRunningActivity;)V", "onDataResponse", "", "resultEntity", "Lcom/oudmon/ble/base/communication/rsp/DeviceNotifyRsp;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyDeviceNotifyListener extends com.oudmon.ble.base.communication.responseImpl.DeviceSportNotifyListener {
        public MyDeviceNotifyListener() {
        }

        @Override // com.oudmon.ble.base.communication.responseImpl.DeviceSportNotifyListener, com.oudmon.ble.base.communication.ICommandResponse
        public void onDataResponse(com.oudmon.ble.base.communication.rsp.DeviceNotifyRsp resultEntity) {
            super.onDataResponse(resultEntity);
            kotlin.jvm.internal.Intrinsics.checkNotNull(resultEntity);
            if (resultEntity.getStatus() == 0) {
                final int bytes2Int = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{resultEntity.getLoadData()[2], resultEntity.getLoadData()[3]});
                final int bytes2Int2 = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{resultEntity.getLoadData()[4]});
                final int bytes2Int3 = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{resultEntity.getLoadData()[5], resultEntity.getLoadData()[6], resultEntity.getLoadData()[7]});
                final int bytes2Int4 = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{resultEntity.getLoadData()[8], resultEntity.getLoadData()[9], resultEntity.getLoadData()[10]});
                final int bytes2Int5 = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{resultEntity.getLoadData()[11], resultEntity.getLoadData()[12], resultEntity.getLoadData()[13]});
                final int bytes2Int6 = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{resultEntity.getLoadData()[1]});
                if (bytes2Int6 == 3) {
                    final com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity sportRunningActivity = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.MyDeviceNotifyListener, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity$MyDeviceNotifyListener$onDataResponse$1
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.MyDeviceNotifyListener) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.MyDeviceNotifyListener myDeviceNotifyListener) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myDeviceNotifyListener, "$this$ktxRunOnUi");
                            java.lang.String string = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_6666064);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_6666064)");
                            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                            com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.finish();
                        }
                    });
                }
                final com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity sportRunningActivity2 = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.MyDeviceNotifyListener, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity$MyDeviceNotifyListener$onDataResponse$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.MyDeviceNotifyListener) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.MyDeviceNotifyListener myDeviceNotifyListener) {
                        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding;
                        boolean z;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(myDeviceNotifyListener, "$this$ktxRunOnUi");
                        activitySportRunningBinding = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.binding;
                        if (activitySportRunningBinding == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activitySportRunningBinding = null;
                        }
                        int i = bytes2Int6;
                        com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity sportRunningActivity3 = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this;
                        int i2 = bytes2Int;
                        int i3 = bytes2Int2;
                        int i4 = bytes2Int4;
                        int i5 = bytes2Int3;
                        int i6 = bytes2Int5;
                        if (i == 1) {
                            z = sportRunningActivity3.startFlag;
                            if (!z) {
                                sportRunningActivity3.startFlag = true;
                                activitySportRunningBinding.imageContinue.performClick();
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "imageContinue start");
                            }
                        }
                        activitySportRunningBinding.timeDuration.setText(com.qcwireless.qc_utils.date.DateUtil.minsToHHmmdd(i2));
                        sportRunningActivity3.sportDuration = i2;
                        activitySportRunningBinding.gpsHeart.setItemTitle(java.lang.String.valueOf(i3));
                        try {
                            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
                                java.lang.String valueOf = java.lang.String.valueOf(new java.math.BigDecimal(java.lang.String.valueOf((i4 * 1.0f) / 1000)).setScale(2, java.math.RoundingMode.HALF_UP));
                                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView = activitySportRunningBinding.gpsDistance;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "str");
                                qSportItemView.setItemTitle(valueOf);
                                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView2 = activitySportRunningBinding.gpsDistance;
                                java.lang.String string = sportRunningActivity3.getString(com.qcwireless.qcwatch.R.string.qc_text_88);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_88)");
                                qSportItemView2.setItemUnit(string);
                            } else {
                                java.lang.String valueOf2 = java.lang.String.valueOf(new java.math.BigDecimal(java.lang.String.valueOf(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kmToIn((i4 * 1.0f) / 1000))).setScale(2, java.math.RoundingMode.HALF_UP));
                                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView3 = activitySportRunningBinding.gpsDistance;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf2, "str");
                                qSportItemView3.setItemTitle(valueOf2);
                                com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView4 = activitySportRunningBinding.gpsDistance;
                                java.lang.String string2 = sportRunningActivity3.getString(com.qcwireless.qcwatch.R.string.qc_text_358);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_358)");
                                qSportItemView4.setItemUnit(string2);
                            }
                        } catch (java.lang.Exception unused) {
                        }
                        activitySportRunningBinding.gpsStep.setItemTitle(java.lang.String.valueOf(i5));
                        activitySportRunningBinding.gpsCalorie.setItemTitle(java.lang.String.valueOf(i6 / 1000));
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showGpsExitDialog() {
        java.lang.String string;
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        if (this.sportDuration / 60 < 1) {
            booleanRef.element = false;
            string = getString(com.qcwireless.qcwatch.R.string.qc_text_278);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_278)");
        } else {
            booleanRef.element = true;
            string = getString(com.qcwireless.qcwatch.R.string.qc_text_279);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_279)");
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_gps_exit);
        objectRef.element = builder.create();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).show();
        android.view.View contentView = ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_title);
        android.widget.TextView textView3 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        android.widget.TextView textView4 = (android.widget.TextView) contentView.findViewById(2131297477);
        textView2.setText("");
        textView4.setText(string);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.m1199showGpsExitDialog$lambda4(objectRef, view);
            }
        });
        textView3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.m1200showGpsExitDialog$lambda6(booleanRef, this, objectRef, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGpsExitDialog$lambda-4, reason: not valid java name */
    public static final void m1199showGpsExitDialog$lambda4(kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGpsExitDialog$lambda-6, reason: not valid java name */
    public static final void m1200showGpsExitDialog$lambda6(kotlin.jvm.internal.Ref.BooleanRef booleanRef, final com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity sportRunningActivity, kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanRef, "$exitSave");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportRunningActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        if (booleanRef.element) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "退出");
        }
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PhoneSportReq.getSportStatus((byte) 4, (byte) sportRunningActivity.sportType), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity$$ExternalSyntheticLambda4
                @Override // com.oudmon.ble.base.communication.ICommandResponse
                public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                    com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.m1201showGpsExitDialog$lambda6$lambda5(com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this, (com.oudmon.ble.base.communication.rsp.AppSportRsp) baseRspCmd);
                }
            });
        } else {
            sportRunningActivity.finish();
        }
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGpsExitDialog$lambda-6$lambda-5, reason: not valid java name */
    public static final void m1201showGpsExitDialog$lambda6$lambda5(com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity sportRunningActivity, com.oudmon.ble.base.communication.rsp.AppSportRsp appSportRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportRunningActivity, "this$0");
        sportRunningActivity.finish();
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.ui.base.bean.event.HealthItemRefreshEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gpsResponse$lambda-7, reason: not valid java name */
    public static final void m1195gpsResponse$lambda7(com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity sportRunningActivity, com.oudmon.ble.base.communication.rsp.AppSportRsp appSportRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportRunningActivity, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, appSportRsp);
        if (appSportRsp != null) {
            try {
                int gpsStatus = appSportRsp.getGpsStatus();
                if (gpsStatus == 2) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(sportRunningActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity$gpsResponse$1$1
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity sportRunningActivity2) {
                            com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding;
                            com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding2;
                            com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding3;
                            com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding4;
                            com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding5;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportRunningActivity2, "$this$ktxRunOnUi");
                            activitySportRunningBinding = sportRunningActivity2.binding;
                            com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding6 = null;
                            if (activitySportRunningBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activitySportRunningBinding = null;
                            }
                            activitySportRunningBinding.imageStop.setVisibility(4);
                            activitySportRunningBinding2 = sportRunningActivity2.binding;
                            if (activitySportRunningBinding2 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activitySportRunningBinding2 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activitySportRunningBinding2.imageContinue);
                            activitySportRunningBinding3 = sportRunningActivity2.binding;
                            if (activitySportRunningBinding3 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activitySportRunningBinding3 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activitySportRunningBinding3.imageEnd);
                            activitySportRunningBinding4 = sportRunningActivity2.binding;
                            if (activitySportRunningBinding4 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activitySportRunningBinding4 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(activitySportRunningBinding4.imageScreenLock);
                            activitySportRunningBinding5 = sportRunningActivity2.binding;
                            if (activitySportRunningBinding5 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activitySportRunningBinding6 = activitySportRunningBinding5;
                            }
                            activitySportRunningBinding6.imageStop.setEnabled(false);
                            sportRunningActivity2.endViewAnim();
                        }
                    });
                    return;
                }
                if (gpsStatus != 3) {
                    if (gpsStatus == 4) {
                        if (sportRunningActivity.sportDuration / 60 >= 1) {
                            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(sportRunningActivity, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity$gpsResponse$1$2
                                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                    invoke((com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity) obj);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity sportRunningActivity2) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportRunningActivity2, "$this$ktxRunOnUi");
                                    sportRunningActivity2.stopGps();
                                }
                            });
                            return;
                        }
                        return;
                    } else {
                        if (gpsStatus != 6) {
                            return;
                        }
                        sportRunningActivity.startTime = appSportRsp.getTimeStamp();
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(appSportRsp.getTimeStamp()));
                        return;
                    }
                }
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding = sportRunningActivity.binding;
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding2 = null;
                if (activitySportRunningBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activitySportRunningBinding = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activitySportRunningBinding.tvLabelEnd);
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding3 = sportRunningActivity.binding;
                if (activitySportRunningBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activitySportRunningBinding2 = activitySportRunningBinding3;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activitySportRunningBinding2.imageScreenLock);
                sportRunningActivity.startViewAnim();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopGps() {
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PhoneSportReq.getSportStatus((byte) 6, (byte) this.sportType), this.gpsResponse);
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PhoneSportReq.getSportStatus((byte) 4, (byte) this.sportType), this.gpsResponse);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) {
            try {
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding = null;
                if (!((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect()) {
                    this.startFlag = false;
                    com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding2 = this.binding;
                    if (activitySportRunningBinding2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activitySportRunningBinding2 = null;
                    }
                    activitySportRunningBinding2.imageBleStatus.setImageResource(com.qcwireless.qcwatch.R.mipmap.ble_disconnect);
                    java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                    return;
                }
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding3 = this.binding;
                if (activitySportRunningBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activitySportRunningBinding = activitySportRunningBinding3;
                }
                activitySportRunningBinding.imageBleStatus.setImageResource(com.qcwireless.qcwatch.R.mipmap.ble_connect);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endViewAnim() {
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding2 = null;
        if (activitySportRunningBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding = null;
        }
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(activitySportRunningBinding.imageStop.getMeasuredWidth(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(300L);
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding3 = this.binding;
        if (activitySportRunningBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding3 = null;
        }
        activitySportRunningBinding3.imageEnd.startAnimation(translateAnimation);
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding4 = this.binding;
        if (activitySportRunningBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding4 = null;
        }
        android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(-activitySportRunningBinding4.imageStop.getMeasuredWidth(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity$endViewAnim$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation) {
                com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding5;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
                activitySportRunningBinding5 = com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.binding;
                if (activitySportRunningBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activitySportRunningBinding5 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activitySportRunningBinding5.tvLabelEnd);
            }
        });
        translateAnimation2.setDuration(300L);
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding5 = this.binding;
        if (activitySportRunningBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activitySportRunningBinding2 = activitySportRunningBinding5;
        }
        activitySportRunningBinding2.imageContinue.startAnimation(translateAnimation2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startViewAnim() {
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding2 = null;
        if (activitySportRunningBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding = null;
        }
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, activitySportRunningBinding.imageStop.getMeasuredWidth(), 0.0f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity$startViewAnim$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
        if (this.startAnim == null) {
            com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding3 = this.binding;
            if (activitySportRunningBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activitySportRunningBinding3 = null;
            }
            android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(0.0f, -activitySportRunningBinding3.imageStop.getMeasuredWidth(), 0.0f, 0.0f);
            this.startAnim = translateAnimation2;
            kotlin.jvm.internal.Intrinsics.checkNotNull(translateAnimation2);
            translateAnimation2.setDuration(300L);
            android.view.animation.TranslateAnimation translateAnimation3 = this.startAnim;
            kotlin.jvm.internal.Intrinsics.checkNotNull(translateAnimation3);
            translateAnimation3.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity$startViewAnim$2
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(android.view.animation.Animation animation) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(android.view.animation.Animation animation) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(android.view.animation.Animation animation) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "animation");
                    com.qcwireless.qcwatch.ui.home.sport.SportRunningActivity.this.showGpsEnd();
                }
            });
        }
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding4 = this.binding;
        if (activitySportRunningBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding4 = null;
        }
        activitySportRunningBinding4.imageEnd.startAnimation(translateAnimation);
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding5 = this.binding;
        if (activitySportRunningBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activitySportRunningBinding2 = activitySportRunningBinding5;
        }
        activitySportRunningBinding2.imageContinue.startAnimation(this.startAnim);
    }

    public final void showGpsEnd() {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "showGpsEnd");
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding2 = null;
        if (activitySportRunningBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activitySportRunningBinding.imageEnd);
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding3 = this.binding;
        if (activitySportRunningBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding3 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activitySportRunningBinding3.imageContinue);
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding4 = this.binding;
        if (activitySportRunningBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding4 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activitySportRunningBinding4.imageStop);
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding5 = this.binding;
        if (activitySportRunningBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activitySportRunningBinding2 = activitySportRunningBinding5;
        }
        activitySportRunningBinding2.imageStop.setEnabled(true);
    }

    public void onBackPressed() {
        com.qcwireless.qcwatch.databinding.ActivitySportRunningBinding activitySportRunningBinding = this.binding;
        if (activitySportRunningBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activitySportRunningBinding = null;
        }
        if (activitySportRunningBinding.imageStop.isLock()) {
            java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_277);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_277)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        showGpsExitDialog();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().removeSportDeviceListener(120);
    }
}
