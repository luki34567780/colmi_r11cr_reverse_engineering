package com.qcwireless.qcwatch.ui.activity;

/* compiled from: MainActivity.kt */
@kotlin.Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 Q2\u00020\u0001:\u0006NOPQRSB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020&H\u0002J\b\u0010(\u001a\u00020&H\u0002J\b\u0010)\u001a\u00020&H\u0002J\u0010\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020&H\u0002J\u0010\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u000200H\u0002J\"\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\b\u00104\u001a\u0004\u0018\u000105H\u0014J\b\u00106\u001a\u00020&H\u0016J\u0012\u00107\u001a\u00020&2\b\u00108\u001a\u0004\u0018\u000109H\u0014J\u0010\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020<H\u0017J\b\u0010=\u001a\u00020&H\u0014J\u0010\u0010>\u001a\u00020&2\u0006\u00108\u001a\u000209H\u0014J\b\u0010?\u001a\u00020&H\u0014J\b\u0010@\u001a\u00020&H\u0002J\b\u0010A\u001a\u00020&H\u0002J\u0010\u0010B\u001a\u00020&2\u0006\u0010C\u001a\u000200H\u0002J\b\u0010D\u001a\u00020&H\u0014J\b\u0010E\u001a\u00020&H\u0002J\b\u0010F\u001a\u00020&H\u0002J\b\u0010G\u001a\u00020&H\u0002J\u0016\u0010H\u001a\u00020&2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020K0JH\u0002J\b\u0010L\u001a\u00020&H\u0002J\b\u0010M\u001a\u00020&H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u00060#R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/qcwireless/qcwatch/ui/activity/MainActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "backPressTime", "", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityMainBinding;", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothEnable", "", "centerDialog", "Lcom/qcwireless/qcwatch/base/dialog/CenterDialog;", "cnGpsDevice", "Lcom/qcwireless/qcwatch/ui/home/step/StepFragment;", "connectFailNumber", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager$delegate", "Lkotlin/Lazy;", "handler", "Landroid/os/Handler;", "homeDevice", "homeHealth", "Lcom/qcwireless/qcwatch/ui/home/healthy/HealthyFragment;", "homePlate", "Lcom/qcwireless/qcwatch/ui/home/sleep/SleepFragment;", "mineFragment", "Lcom/qcwireless/qcwatch/ui/mine/MineFragment;", "refuseDialog", "Lcom/qcwireless/qcwatch/base/dialog/BottomDialog;", "runnable", "Lcom/qcwireless/qcwatch/ui/activity/MainActivity$ReconnectRunnable;", "tabIndex", "checkBluetoothEnable", "", "clearAllSelected", "deviceScanConfig", "doServer", "hideFragments", "transaction", "Landroidx/fragment/app/FragmentTransaction;", "initDeviceRequestLocation", "notificationUiRefresh", "selectionIndex", "Landroid/view/View;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onPause", "onRestoreInstanceState", "onResume", "processBackPressed", "requestPermissions", "setTabSelection", "index", "setupViews", "showGPSDialog", "showLocationWarningDialog", "showPermissionInformationDialog", "showPermissionSettingDialog", "permissions", "", "", "showPermissionWarmingDialog", "upDataCollection", "AllPermissionCallback", "BluetoothPermissionCallback", "CameraPermissionCallback", "Companion", "PermissionCallback", "ReconnectRunnable", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MainActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.activity.MainActivity.Companion INSTANCE = new com.qcwireless.qcwatch.ui.activity.MainActivity.Companion(null);
    private long backPressTime;
    private com.qcwireless.qcwatch.databinding.ActivityMainBinding binding;
    private android.bluetooth.BluetoothAdapter bluetoothAdapter;
    private boolean bluetoothEnable;
    private com.qcwireless.qcwatch.base.dialog.CenterDialog centerDialog;
    private com.qcwireless.qcwatch.ui.home.step.StepFragment cnGpsDevice;
    private int connectFailNumber;
    private final android.os.Handler handler;
    private com.qcwireless.qcwatch.ui.home.step.StepFragment homeDevice;
    private com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment homeHealth;
    private com.qcwireless.qcwatch.ui.home.sleep.SleepFragment homePlate;
    private com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment;
    private com.qcwireless.qcwatch.base.dialog.BottomDialog refuseDialog;
    private int tabIndex;

    /* renamed from: fragmentManager$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy fragmentManager = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.fragment.app.FragmentManager>() { // from class: com.qcwireless.qcwatch.ui.activity.MainActivity$fragmentManager$2
        {
            super(0);
        }

        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.FragmentManager m500invoke() {
            androidx.fragment.app.FragmentManager supportFragmentManager = com.qcwireless.qcwatch.ui.activity.MainActivity.this.getSupportFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            return supportFragmentManager;
        }
    });
    private final com.qcwireless.qcwatch.ui.activity.MainActivity.ReconnectRunnable runnable = new com.qcwireless.qcwatch.ui.activity.MainActivity.ReconnectRunnable();

    public MainActivity() {
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.activity.MainActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
    }

    private final androidx.fragment.app.FragmentManager getFragmentManager() {
        return (androidx.fragment.app.FragmentManager) this.fragmentManager.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
        } catch (java.lang.Exception unused) {
        }
        com.qcwireless.qcwatch.databinding.ActivityMainBinding inflate = com.qcwireless.qcwatch.databinding.ActivityMainBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        android.widget.LinearLayout root = inflate.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView(root);
        if (com.qcwireless.qcwatch.base.permission.PermissionUtilKt.hasLocationPermission((androidx.fragment.app.FragmentActivity) this)) {
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getLocationOnce(com.qcwireless.qcwatch.QCApplication.INSTANCE.getApplication());
        }
        setStatusBarBackground(com.qcwireless.qcwatch.R.color.healthy_bg);
        com.qcwireless.qcwatch.base.pref.UserConfig companion = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance();
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
        companion.setLanguageCurr(language);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().trySetupNotifyService((android.content.Context) this);
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultAdapter, "getDefaultAdapter()");
        this.bluetoothAdapter = defaultAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        try {
            super.onRestoreInstanceState(savedInstanceState);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            android.content.Intent intent = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.activity.MainActivity.class);
            intent.addFlags(67108864);
            intent.addFlags(536870912);
            intent.addFlags(268435456);
            startActivity(intent);
        }
    }

    private final void showPermissionWarmingDialog() {
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getGpsPermission() >= new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp() || com.qcwireless.qcwatch.base.permission.PermissionUtilKt.hasLocationPermission((androidx.fragment.app.FragmentActivity) this) || !com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            return;
        }
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_permission_warming);
        final com.qcwireless.qcwatch.base.dialog.BottomDialog create = builder.create();
        kotlin.jvm.internal.Intrinsics.checkNotNull(create);
        create.show();
        android.view.View contentView = create.getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomWarmingDialog.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.activity.MainActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.activity.MainActivity.m498showPermissionWarmingDialog$lambda0(com.qcwireless.qcwatch.base.dialog.BottomDialog.this, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.activity.MainActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.activity.MainActivity.m499showPermissionWarmingDialog$lambda1(com.qcwireless.qcwatch.base.dialog.BottomDialog.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPermissionWarmingDialog$lambda-0, reason: not valid java name */
    public static final void m498showPermissionWarmingDialog$lambda0(com.qcwireless.qcwatch.base.dialog.BottomDialog bottomDialog, android.view.View view) {
        bottomDialog.dismiss();
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGpsPermission(new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp() + 1800);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPermissionWarmingDialog$lambda-1, reason: not valid java name */
    public static final void m499showPermissionWarmingDialog$lambda1(com.qcwireless.qcwatch.base.dialog.BottomDialog bottomDialog, com.qcwireless.qcwatch.ui.activity.MainActivity mainActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGpsPermission(new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp() + 21600);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        bottomDialog.dismiss();
        mainActivity.showGPSDialog();
    }

    private final void showGPSDialog() {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        java.util.Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestBgLocation(activity, new com.qcwireless.qcwatch.ui.activity.MainActivity.PermissionCallback());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        android.view.View[] viewArr = new android.view.View[4];
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding = this.binding;
        if (activityMainBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding = null;
        }
        viewArr[0] = activityMainBinding.btnHealth;
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding2 = this.binding;
        if (activityMainBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding2 = null;
        }
        viewArr[1] = activityMainBinding2.btnDevice;
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding3 = this.binding;
        if (activityMainBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding3 = null;
        }
        viewArr[2] = activityMainBinding3.btnPlate;
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding4 = this.binding;
        if (activityMainBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding4 = null;
        }
        viewArr[3] = activityMainBinding4.btnMine;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.activity.MainActivity$setupViews$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding5;
                com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding6;
                com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding7;
                com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding8;
                com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding9;
                com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding10;
                com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding11;
                com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding12;
                com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding13;
                com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding14;
                com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding15;
                com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding16;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityMainBinding5 = com.qcwireless.qcwatch.ui.activity.MainActivity.this.binding;
                com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding17 = null;
                if (activityMainBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityMainBinding5 = null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityMainBinding5.btnHealth)) {
                    activityMainBinding6 = com.qcwireless.qcwatch.ui.activity.MainActivity.this.binding;
                    if (activityMainBinding6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityMainBinding6 = null;
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityMainBinding6.btnDevice)) {
                        activityMainBinding7 = com.qcwireless.qcwatch.ui.activity.MainActivity.this.binding;
                        if (activityMainBinding7 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityMainBinding7 = null;
                        }
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityMainBinding7.btnPlate)) {
                            activityMainBinding8 = com.qcwireless.qcwatch.ui.activity.MainActivity.this.binding;
                            if (activityMainBinding8 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityMainBinding8 = null;
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityMainBinding8.btnMine)) {
                                com.qcwireless.qcwatch.ui.activity.MainActivity mainActivity = com.qcwireless.qcwatch.ui.activity.MainActivity.this;
                                activityMainBinding9 = mainActivity.binding;
                                if (activityMainBinding9 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    activityMainBinding9 = null;
                                }
                                android.view.View view2 = activityMainBinding9.btnMine;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view2, "binding.btnMine");
                                mainActivity.setTabSelection(view2);
                                com.qcwireless.qcwatch.ui.activity.MainActivity mainActivity2 = com.qcwireless.qcwatch.ui.activity.MainActivity.this;
                                activityMainBinding10 = mainActivity2.binding;
                                if (activityMainBinding10 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    activityMainBinding17 = activityMainBinding10;
                                }
                                android.view.View view3 = activityMainBinding17.btnMine;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view3, "binding.btnMine");
                                mainActivity2.notificationUiRefresh(view3);
                                return;
                            }
                            return;
                        }
                        com.qcwireless.qcwatch.ui.activity.MainActivity mainActivity3 = com.qcwireless.qcwatch.ui.activity.MainActivity.this;
                        activityMainBinding11 = mainActivity3.binding;
                        if (activityMainBinding11 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityMainBinding11 = null;
                        }
                        android.view.View view4 = activityMainBinding11.btnPlate;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view4, "binding.btnPlate");
                        mainActivity3.setTabSelection(view4);
                        com.qcwireless.qcwatch.ui.activity.MainActivity mainActivity4 = com.qcwireless.qcwatch.ui.activity.MainActivity.this;
                        activityMainBinding12 = mainActivity4.binding;
                        if (activityMainBinding12 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityMainBinding17 = activityMainBinding12;
                        }
                        android.view.View view5 = activityMainBinding17.btnPlate;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view5, "binding.btnPlate");
                        mainActivity4.notificationUiRefresh(view5);
                        return;
                    }
                    com.qcwireless.qcwatch.ui.activity.MainActivity mainActivity5 = com.qcwireless.qcwatch.ui.activity.MainActivity.this;
                    activityMainBinding13 = mainActivity5.binding;
                    if (activityMainBinding13 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityMainBinding13 = null;
                    }
                    android.view.View view6 = activityMainBinding13.btnDevice;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view6, "binding.btnDevice");
                    mainActivity5.setTabSelection(view6);
                    com.qcwireless.qcwatch.ui.activity.MainActivity mainActivity6 = com.qcwireless.qcwatch.ui.activity.MainActivity.this;
                    activityMainBinding14 = mainActivity6.binding;
                    if (activityMainBinding14 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityMainBinding17 = activityMainBinding14;
                    }
                    android.view.View view7 = activityMainBinding17.btnDevice;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view7, "binding.btnDevice");
                    mainActivity6.notificationUiRefresh(view7);
                    return;
                }
                com.qcwireless.qcwatch.ui.activity.MainActivity mainActivity7 = com.qcwireless.qcwatch.ui.activity.MainActivity.this;
                activityMainBinding15 = mainActivity7.binding;
                if (activityMainBinding15 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityMainBinding15 = null;
                }
                android.view.View view8 = activityMainBinding15.btnHealth;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view8, "binding.btnHealth");
                mainActivity7.setTabSelection(view8);
                com.qcwireless.qcwatch.ui.activity.MainActivity mainActivity8 = com.qcwireless.qcwatch.ui.activity.MainActivity.this;
                activityMainBinding16 = mainActivity8.binding;
                if (activityMainBinding16 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityMainBinding17 = activityMainBinding16;
                }
                android.view.View view9 = activityMainBinding17.btnHealth;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view9, "binding.btnHealth");
                mainActivity8.notificationUiRefresh(view9);
            }
        });
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding5 = this.binding;
        if (activityMainBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding5 = null;
        }
        android.view.View view = activityMainBinding5.btnHealth;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "binding.btnHealth");
        setTabSelection(view);
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getPermissionDescFlag()) {
            showPermissionWarmingDialog();
        } else {
            requestPermissions();
        }
        doServer();
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getGoogleFit()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "language");
            if (!kotlin.text.StringsKt.contains$default(language, "zh", false, 2, (java.lang.Object) null)) {
                com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync.INSTANCE.getGetInstance().connectGoogleFit((android.app.Activity) this);
            }
        }
        deviceScanConfig();
        try {
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().pingHwServer();
        } catch (java.lang.Exception unused) {
        }
        checkBluetoothEnable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkBluetoothEnable() {
        try {
            if (com.qcwireless.qc_utils.bluetooth.BluetoothUtils.isEnabledBluetooth((android.content.Context) this)) {
                return;
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "-----蓝牙关");
            android.content.Intent intent = new android.content.Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
            if (android.os.Build.VERSION.SDK_INT < 31 || androidx.core.app.ActivityCompat.checkSelfPermission((android.content.Context) this, com.hjq.permissions.Permission.BLUETOOTH_CONNECT) == 0) {
                startActivityForResult(intent, 1001);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private final void deviceScanConfig() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.activity.MainActivity$deviceScanConfig$1(null), 3, (java.lang.Object) null);
    }

    private final void initDeviceRequestLocation() {
        com.oudmon.ble.base.communication.LargeDataHandler.getInstance().deviceRequestLocation(new com.oudmon.ble.base.communication.ILargeDataResponse() { // from class: com.qcwireless.qcwatch.ui.activity.MainActivity$$ExternalSyntheticLambda8
            @Override // com.oudmon.ble.base.communication.ILargeDataResponse
            public final void parseData(int i, byte[] bArr) {
                com.qcwireless.qcwatch.ui.activity.MainActivity.m491initDeviceRequestLocation$lambda2(com.qcwireless.qcwatch.ui.activity.MainActivity.this, i, bArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initDeviceRequestLocation$lambda-2, reason: not valid java name */
    public static final void m491initDeviceRequestLocation$lambda2(com.qcwireless.qcwatch.ui.activity.MainActivity mainActivity, int i, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        if (i == 32) {
            kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.activity.MainActivity$initDeviceRequestLocation$1$1(mainActivity, null), 3, (java.lang.Object) null);
        }
    }

    private final void upDataCollection() {
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLastCollectionTime() < new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp()) {
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear().length() > 0) {
                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion().length() > 0) {
                    if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion().length() > 0) {
                        com.qcwireless.qcwatch.ui.base.service.NetService.INSTANCE.getGetInstance().upCollectionData();
                    }
                }
            }
        }
    }

    private final void doServer() {
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLastCollectionTime() < new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp()) {
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear().length() > 0) {
                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion().length() > 0) {
                    com.qcwireless.qcwatch.ui.base.service.NetService.INSTANCE.getGetInstance().upCollectionData();
                }
            }
        }
        com.oudmon.ble.base.util.ThreadUtils.postDelay(new com.oudmon.ble.base.util.ThreadUtils.TimeTask() { // from class: com.qcwireless.qcwatch.ui.activity.MainActivity$doServer$1
            @Override // com.oudmon.ble.base.util.ThreadUtils.TimeTask
            protected void task() {
                com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository.INSTANCE.getGetInstance().initData();
            }
        }, 0L);
        if (!com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLoginStatus() || com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLastSyncFromServerTime() >= new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp()) {
            return;
        }
        com.qcwireless.qcwatch.ui.base.service.NetService.INSTANCE.getGetInstance().downAll();
        com.qcwireless.qcwatch.ui.base.service.NetService.INSTANCE.getGetInstance().downUserProfile();
        com.qcwireless.qcwatch.ui.base.service.NetService.INSTANCE.getGetInstance().downGoalSetting();
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear().length() > 0) {
                com.qcwireless.qcwatch.ui.base.service.NetService.INSTANCE.getGetInstance().upAll();
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastSyncFromServerTime(new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp() + 43200);
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.OnThemeEvent) {
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getSkinType() == com.qcwireless.qcwatch.ui.mine.skin.util.SkinType.INSTANCE.getSkin_Black()) {
                com.gyf.immersionbar.ImmersionBar.with((android.app.Activity) this).statusBarDarkFont(false).transparentStatusBar().init();
                return;
            } else {
                com.gyf.immersionbar.ImmersionBar.with((android.app.Activity) this).statusBarDarkFont(true).transparentStatusBar().init();
                return;
            }
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.LoginSuccessEvent) {
            doServer();
            return;
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.FirmCheckEvent) {
            upDataCollection();
            return;
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.CameraToastEvent) {
            androidx.fragment.app.FragmentActivity activity = getActivity();
            java.util.Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestCameraPermission(activity, new com.qcwireless.qcwatch.ui.activity.MainActivity.CameraPermissionCallback());
        } else if (messageEvent instanceof com.qcwireless.qcwatch.base.event.DeviceConfigEvent) {
            kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.activity.MainActivity$onMessageEvent$1(messageEvent, null), 3, (java.lang.Object) null);
        }
    }

    /* compiled from: MainActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/activity/MainActivity$CameraPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/activity/MainActivity;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class CameraPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public CameraPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            if (!all) {
                java.lang.String string = com.qcwireless.qcwatch.ui.activity.MainActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                return;
            }
            android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.activity.MainActivity.this;
            java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.camera.CameraActivity.class);
            for (kotlin.Pair pair : arrayList) {
                if (pair != null) {
                    java.lang.String str = (java.lang.String) pair.getFirst();
                    java.lang.Object second = pair.getSecond();
                    if (second instanceof java.lang.Integer) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Byte) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Character) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Short) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Boolean) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Long) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Float) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Double) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.String) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                    } else if (second instanceof java.lang.CharSequence) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                    } else if (second instanceof android.os.Parcelable) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Object[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                    } else if (second instanceof java.util.ArrayList) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                    } else if (second instanceof java.io.Serializable) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                    } else if (second instanceof boolean[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                    } else if (second instanceof byte[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                    } else if (second instanceof short[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                    } else if (second instanceof char[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                    } else if (second instanceof int[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                    } else if (second instanceof long[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                    } else if (second instanceof float[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                    } else if (second instanceof double[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                    } else if (second instanceof android.os.Bundle) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                    } else if (second instanceof android.content.Intent) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                    } else {
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                }
            }
            activity.startActivity(intent);
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            if (never) {
                java.lang.String string = com.qcwireless.qcwatch.ui.activity.MainActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                com.hjq.permissions.XXPermissions.startPermissionActivity((android.app.Activity) com.qcwireless.qcwatch.ui.activity.MainActivity.this, permissions);
            }
        }
    }

    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
        } else {
            processBackPressed();
        }
    }

    private final void processBackPressed() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.backPressTime > com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_5);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_5)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{com.qcwireless.qcwatch.base.view.GlobalKt.getAppName()}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(format, 0, 1, null);
            this.backPressTime = currentTimeMillis;
            return;
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTabSelection(android.view.View index) {
        clearAllSelected();
        androidx.fragment.app.FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(beginTransaction, "this");
        hideFragments(beginTransaction);
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding2 = null;
        if (activityMainBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding = null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(index, activityMainBinding.btnHealth)) {
            this.tabIndex = 0;
            com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding3 = this.binding;
            if (activityMainBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMainBinding3 = null;
            }
            activityMainBinding3.ivHealth.setSelected(true);
            com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding4 = this.binding;
            if (activityMainBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityMainBinding2 = activityMainBinding4;
            }
            activityMainBinding2.tvHealth.setSelected(true);
            com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment = this.homeHealth;
            if (healthyFragment == null) {
                com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment newInstance = com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.INSTANCE.newInstance();
                this.homeHealth = newInstance;
                kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance);
                beginTransaction.add(com.qcwireless.qcwatch.R.id.homeContainer, newInstance);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(healthyFragment);
                beginTransaction.show(healthyFragment);
            }
        } else {
            com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding5 = this.binding;
            if (activityMainBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMainBinding5 = null;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(index, activityMainBinding5.btnDevice)) {
                this.tabIndex = 1;
                com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding6 = this.binding;
                if (activityMainBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityMainBinding6 = null;
                }
                activityMainBinding6.ivDevice.setSelected(true);
                com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding7 = this.binding;
                if (activityMainBinding7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityMainBinding2 = activityMainBinding7;
                }
                activityMainBinding2.tvDevice.setSelected(true);
                if (com.qcwireless.qc_utils.date.LanguageUtil.isChina()) {
                    com.qcwireless.qcwatch.ui.home.step.StepFragment stepFragment = this.cnGpsDevice;
                    if (stepFragment == null) {
                        com.qcwireless.qcwatch.ui.home.step.StepFragment newInstance2 = com.qcwireless.qcwatch.ui.home.step.StepFragment.INSTANCE.newInstance();
                        this.cnGpsDevice = newInstance2;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance2);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.homeContainer, newInstance2);
                    } else {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(stepFragment);
                        beginTransaction.show(stepFragment);
                    }
                } else {
                    com.qcwireless.qcwatch.ui.home.step.StepFragment stepFragment2 = this.homeDevice;
                    if (stepFragment2 == null) {
                        com.qcwireless.qcwatch.ui.home.step.StepFragment newInstance3 = com.qcwireless.qcwatch.ui.home.step.StepFragment.INSTANCE.newInstance();
                        this.homeDevice = newInstance3;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance3);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.homeContainer, newInstance3);
                    } else {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(stepFragment2);
                        beginTransaction.show(stepFragment2);
                    }
                }
            } else {
                com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding8 = this.binding;
                if (activityMainBinding8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityMainBinding8 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(index, activityMainBinding8.btnPlate)) {
                    this.tabIndex = 2;
                    com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding9 = this.binding;
                    if (activityMainBinding9 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityMainBinding9 = null;
                    }
                    activityMainBinding9.ivPlate.setSelected(true);
                    com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding10 = this.binding;
                    if (activityMainBinding10 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityMainBinding2 = activityMainBinding10;
                    }
                    activityMainBinding2.tvPlate.setSelected(true);
                    com.qcwireless.qcwatch.ui.home.sleep.SleepFragment sleepFragment = this.homePlate;
                    if (sleepFragment == null) {
                        com.qcwireless.qcwatch.ui.home.sleep.SleepFragment newInstance4 = com.qcwireless.qcwatch.ui.home.sleep.SleepFragment.INSTANCE.newInstance();
                        this.homePlate = newInstance4;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance4);
                        beginTransaction.add(com.qcwireless.qcwatch.R.id.homeContainer, newInstance4);
                    } else {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(sleepFragment);
                        beginTransaction.show(sleepFragment);
                    }
                } else {
                    com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding11 = this.binding;
                    if (activityMainBinding11 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityMainBinding11 = null;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(index, activityMainBinding11.btnMine)) {
                        this.tabIndex = 3;
                        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding12 = this.binding;
                        if (activityMainBinding12 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityMainBinding12 = null;
                        }
                        activityMainBinding12.ivMine.setSelected(true);
                        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding13 = this.binding;
                        if (activityMainBinding13 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityMainBinding2 = activityMainBinding13;
                        }
                        activityMainBinding2.tvMine.setSelected(true);
                        com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment = this.mineFragment;
                        if (mineFragment == null) {
                            com.qcwireless.qcwatch.ui.mine.MineFragment newInstance5 = com.qcwireless.qcwatch.ui.mine.MineFragment.INSTANCE.newInstance();
                            this.mineFragment = newInstance5;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance5);
                            beginTransaction.add(com.qcwireless.qcwatch.R.id.homeContainer, newInstance5);
                        } else {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(mineFragment);
                            beginTransaction.show(mineFragment);
                        }
                    } else {
                        this.tabIndex = 0;
                        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding14 = this.binding;
                        if (activityMainBinding14 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityMainBinding14 = null;
                        }
                        activityMainBinding14.ivHealth.setSelected(true);
                        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding15 = this.binding;
                        if (activityMainBinding15 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityMainBinding2 = activityMainBinding15;
                        }
                        activityMainBinding2.tvHealth.setSelected(true);
                        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment2 = this.homeHealth;
                        if (healthyFragment2 == null) {
                            com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment newInstance6 = com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.INSTANCE.newInstance();
                            this.homeHealth = newInstance6;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance6);
                            beginTransaction.add(com.qcwireless.qcwatch.R.id.homeContainer, newInstance6);
                        } else {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(healthyFragment2);
                            beginTransaction.show(healthyFragment2);
                        }
                    }
                }
            }
        }
        beginTransaction.commitAllowingStateLoss();
    }

    private final void clearAllSelected() {
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding2 = null;
        if (activityMainBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding = null;
        }
        activityMainBinding.ivHealth.setSelected(false);
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding3 = this.binding;
        if (activityMainBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding3 = null;
        }
        activityMainBinding3.tvHealth.setSelected(false);
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding4 = this.binding;
        if (activityMainBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding4 = null;
        }
        activityMainBinding4.ivDevice.setSelected(false);
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding5 = this.binding;
        if (activityMainBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding5 = null;
        }
        activityMainBinding5.tvDevice.setSelected(false);
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding6 = this.binding;
        if (activityMainBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding6 = null;
        }
        activityMainBinding6.ivPlate.setSelected(false);
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding7 = this.binding;
        if (activityMainBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding7 = null;
        }
        activityMainBinding7.tvPlate.setSelected(false);
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding8 = this.binding;
        if (activityMainBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding8 = null;
        }
        activityMainBinding8.ivMine.setSelected(false);
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding9 = this.binding;
        if (activityMainBinding9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMainBinding2 = activityMainBinding9;
        }
        activityMainBinding2.tvMine.setSelected(false);
    }

    private final void hideFragments(androidx.fragment.app.FragmentTransaction transaction) {
        com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment healthyFragment = this.homeHealth;
        if (healthyFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(healthyFragment);
            transaction.hide(healthyFragment);
        }
        com.qcwireless.qcwatch.ui.home.step.StepFragment stepFragment = this.homeDevice;
        if (stepFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(stepFragment);
            transaction.hide(stepFragment);
        }
        com.qcwireless.qcwatch.ui.home.step.StepFragment stepFragment2 = this.cnGpsDevice;
        if (stepFragment2 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(stepFragment2);
            transaction.hide(stepFragment2);
        }
        com.qcwireless.qcwatch.ui.home.sleep.SleepFragment sleepFragment = this.homePlate;
        if (sleepFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(sleepFragment);
            transaction.hide(sleepFragment);
        }
        com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment = this.mineFragment;
        if (mineFragment != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(mineFragment);
            transaction.hide(mineFragment);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            int updating = com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating();
            if (updating == 1) {
                java.lang.String language = java.util.Locale.getDefault().getLanguage();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "language");
                if (kotlin.text.StringsKt.startsWith$default(language, "zh", false, 2, (java.lang.Object) null)) {
                    android.app.Activity activity = (android.app.Activity) this;
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.dfu.ChinaDeviceFirmwareUpdateActivity.class);
                    for (kotlin.Pair pair : arrayList) {
                        if (pair != null) {
                            java.lang.String str = (java.lang.String) pair.getFirst();
                            java.lang.Object second = pair.getSecond();
                            if (second instanceof java.lang.Integer) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Byte) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Character) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Short) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Boolean) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Long) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Float) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Double) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.String) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.CharSequence) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Parcelable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.util.ArrayList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.io.Serializable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof boolean[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                            } else if (second instanceof byte[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                            } else if (second instanceof short[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                            } else if (second instanceof char[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                            } else if (second instanceof int[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                            } else if (second instanceof long[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                            } else if (second instanceof float[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                            } else if (second instanceof double[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Bundle) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                            } else if (second instanceof android.content.Intent) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                    activity.startActivity(intent);
                } else {
                    android.app.Activity activity2 = (android.app.Activity) this;
                    java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
                    android.content.Intent intent2 = new android.content.Intent(activity2, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity.class);
                    for (kotlin.Pair pair2 : arrayList2) {
                        if (pair2 != null) {
                            java.lang.String str2 = (java.lang.String) pair2.getFirst();
                            java.lang.Object second2 = pair2.getSecond();
                            if (second2 instanceof java.lang.Integer) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).intValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Byte) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).byteValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Character) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Character) second2).charValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Short) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).shortValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Boolean) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Boolean) second2).booleanValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Long) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).longValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Float) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).floatValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Double) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).doubleValue()), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.String) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.lang.String) second2), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.CharSequence) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.lang.CharSequence) second2), "putExtra(name, value)");
                            } else if (second2 instanceof android.os.Parcelable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Parcelable) second2), "putExtra(name, value)");
                            } else if (second2 instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                            } else if (second2 instanceof java.util.ArrayList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                            } else if (second2 instanceof java.io.Serializable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                            } else if (second2 instanceof boolean[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (boolean[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof byte[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (byte[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof short[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (short[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof char[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (char[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof int[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (int[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof long[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (long[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof float[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (float[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof double[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (double[]) second2), "putExtra(name, value)");
                            } else if (second2 instanceof android.os.Bundle) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Bundle) second2), "putExtra(name, value)");
                            } else if (second2 instanceof android.content.Intent) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Parcelable) second2), "putExtra(name, value)");
                            } else {
                                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                    activity2.startActivity(intent2);
                }
            } else if (updating == 2) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("background", 1);
                kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                android.app.Activity activity3 = (android.app.Activity) this;
                java.util.ArrayList<kotlin.Pair> arrayList3 = new java.util.ArrayList();
                android.content.Intent intent3 = new android.content.Intent(activity3, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.dfu.WatchFileDismissActivity.class);
                intent3.setFlags(1);
                intent3.putExtras(bundle);
                for (kotlin.Pair pair3 : arrayList3) {
                    if (pair3 != null) {
                        java.lang.String str3 = (java.lang.String) pair3.getFirst();
                        java.lang.Object second3 = pair3.getSecond();
                        if (second3 instanceof java.lang.Integer) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).intValue()), "putExtra(name, value)");
                        } else if (second3 instanceof java.lang.Byte) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).byteValue()), "putExtra(name, value)");
                        } else if (second3 instanceof java.lang.Character) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Character) second3).charValue()), "putExtra(name, value)");
                        } else if (second3 instanceof java.lang.Short) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).shortValue()), "putExtra(name, value)");
                        } else if (second3 instanceof java.lang.Boolean) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Boolean) second3).booleanValue()), "putExtra(name, value)");
                        } else if (second3 instanceof java.lang.Long) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).longValue()), "putExtra(name, value)");
                        } else if (second3 instanceof java.lang.Float) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).floatValue()), "putExtra(name, value)");
                        } else if (second3 instanceof java.lang.Double) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).doubleValue()), "putExtra(name, value)");
                        } else if (second3 instanceof java.lang.String) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (java.lang.String) second3), "putExtra(name, value)");
                        } else if (second3 instanceof java.lang.CharSequence) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (java.lang.CharSequence) second3), "putExtra(name, value)");
                        } else if (second3 instanceof android.os.Parcelable) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (android.os.Parcelable) second3), "putExtra(name, value)");
                        } else if (second3 instanceof java.lang.Object[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (java.io.Serializable) second3), "putExtra(name, value)");
                        } else if (second3 instanceof java.util.ArrayList) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (java.io.Serializable) second3), "putExtra(name, value)");
                        } else if (second3 instanceof java.io.Serializable) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (java.io.Serializable) second3), "putExtra(name, value)");
                        } else if (second3 instanceof boolean[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (boolean[]) second3), "putExtra(name, value)");
                        } else if (second3 instanceof byte[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (byte[]) second3), "putExtra(name, value)");
                        } else if (second3 instanceof short[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (short[]) second3), "putExtra(name, value)");
                        } else if (second3 instanceof char[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (char[]) second3), "putExtra(name, value)");
                        } else if (second3 instanceof int[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (int[]) second3), "putExtra(name, value)");
                        } else if (second3 instanceof long[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (long[]) second3), "putExtra(name, value)");
                        } else if (second3 instanceof float[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (float[]) second3), "putExtra(name, value)");
                        } else if (second3 instanceof double[]) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (double[]) second3), "putExtra(name, value)");
                        } else if (second3 instanceof android.os.Bundle) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (android.os.Bundle) second3), "putExtra(name, value)");
                        } else if (second3 instanceof android.content.Intent) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (android.os.Parcelable) second3), "putExtra(name, value)");
                        } else {
                            kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                        }
                    }
                }
                kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit12 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit13 = kotlin.Unit.INSTANCE;
                activity3.startActivity(intent3);
            }
        } else {
            this.handler.removeCallbacks(this.runnable);
            this.handler.postDelayed(this.runnable, 1000L);
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
        }
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLastLocationTime() >= new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp() || !com.qcwireless.qcwatch.base.permission.PermissionUtilKt.hasLocationPermission((androidx.fragment.app.FragmentActivity) this)) {
            return;
        }
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getLocationOnce(com.qcwireless.qcwatch.QCApplication.INSTANCE.getApplication());
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastLocationTime((int) (new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp() + 900));
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onPause() {
        super.onPause();
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLastLocationTime() >= new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp() || !com.qcwireless.qcwatch.base.permission.PermissionUtilKt.hasLocationPermission((androidx.fragment.app.FragmentActivity) this)) {
            return;
        }
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getLocationOnce(com.qcwireless.qcwatch.QCApplication.INSTANCE.getApplication());
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastLocationTime((int) (new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp() + 900));
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
    }

    protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1001) {
            if (resultCode == -1) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "打开蓝牙");
                return;
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "用户拒绝");
            if (this.bluetoothEnable) {
                return;
            }
            this.bluetoothEnable = true;
            checkBluetoothEnable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notificationUiRefresh(android.view.View selectionIndex) {
        this.handler.removeCallbacks(this.runnable);
        this.handler.postDelayed(this.runnable, 1000L);
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding2 = null;
        if (activityMainBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding = null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(selectionIndex, activityMainBinding.btnHealth)) {
            setStatusBarBackground(com.qcwireless.qcwatch.R.color.healthy_bg);
            com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding3 = this.binding;
            if (activityMainBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityMainBinding2 = activityMainBinding3;
            }
            if (activityMainBinding2.ivHealth.isSelected()) {
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.RefreshEvent(com.qcwireless.qcwatch.ui.home.healthy.HealthyFragment.class));
                return;
            }
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding4 = this.binding;
        if (activityMainBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding4 = null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(selectionIndex, activityMainBinding4.btnDevice)) {
            setStatusBarBackground(com.qcwireless.qcwatch.R.color.step_bg);
            com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding5 = this.binding;
            if (activityMainBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityMainBinding2 = activityMainBinding5;
            }
            if (activityMainBinding2.ivDevice.isSelected()) {
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.HomeStepRefreshEvent());
                return;
            }
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding6 = this.binding;
        if (activityMainBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding6 = null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(selectionIndex, activityMainBinding6.btnPlate)) {
            setStatusBarBackground(com.qcwireless.qcwatch.R.color.sleep_bg);
            com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding7 = this.binding;
            if (activityMainBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityMainBinding2 = activityMainBinding7;
            }
            if (activityMainBinding2.ivPlate.isSelected()) {
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.RefreshEvent(com.qcwireless.qcwatch.base.event.HomeStepRefreshEvent.class));
                return;
            }
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding8 = this.binding;
        if (activityMainBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding8 = null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(selectionIndex, activityMainBinding8.btnMine)) {
            setStatusBarBackground(com.qcwireless.qcwatch.R.color.mine_bg_1);
            com.qcwireless.qcwatch.databinding.ActivityMainBinding activityMainBinding9 = this.binding;
            if (activityMainBinding9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityMainBinding2 = activityMainBinding9;
            }
            if (activityMainBinding2.ivMine.isSelected()) {
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.RefreshEvent(com.qcwireless.qcwatch.ui.mine.MineFragment.class));
            }
        }
    }

    private final void requestPermissions() {
        androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) this;
        com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestAllPermission(fragmentActivity, new com.qcwireless.qcwatch.ui.activity.MainActivity.AllPermissionCallback());
        com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestBluetoothPermission(fragmentActivity, new com.qcwireless.qcwatch.ui.activity.MainActivity.BluetoothPermissionCallback());
    }

    /* compiled from: MainActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/activity/MainActivity$BluetoothPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/activity/MainActivity;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class BluetoothPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public BluetoothPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            if (all) {
                return;
            }
            java.lang.String string = com.qcwireless.qcwatch.ui.activity.MainActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            if (never) {
                com.hjq.permissions.XXPermissions.startPermissionActivity((android.app.Activity) com.qcwireless.qcwatch.ui.activity.MainActivity.this, permissions);
                java.lang.String string = com.qcwireless.qcwatch.ui.activity.MainActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_458);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_458)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            }
        }
    }

    /* compiled from: MainActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/activity/MainActivity$AllPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/activity/MainActivity;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class AllPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public AllPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            if (all) {
                return;
            }
            java.lang.String string = com.qcwireless.qcwatch.ui.activity.MainActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_44);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_44)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast(string, 1);
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            if (never) {
                com.hjq.permissions.XXPermissions.startPermissionActivity((android.app.Activity) com.qcwireless.qcwatch.ui.activity.MainActivity.this, permissions);
                java.lang.String string = com.qcwireless.qcwatch.ui.activity.MainActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_387);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_387)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast(string, 1);
            }
        }
    }

    /* compiled from: MainActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/activity/MainActivity$ReconnectRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/activity/MainActivity;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class ReconnectRunnable implements java.lang.Runnable {
        public ReconnectRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                com.qcwireless.qcwatch.ui.activity.MainActivity.this.handler.removeCallbacks(com.qcwireless.qcwatch.ui.activity.MainActivity.this.runnable);
            } else if (com.qcwireless.qcwatch.base.lifecycle.QcLifeCycle.INSTANCE.isForeground()) {
                com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUpNotWait();
                com.qcwireless.qcwatch.ui.activity.MainActivity.this.handler.postDelayed(com.qcwireless.qcwatch.ui.activity.MainActivity.this.runnable, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.LOCATION_UPDATE_INTERVAL);
            } else {
                com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUp();
                com.qcwireless.qcwatch.ui.activity.MainActivity.this.handler.postDelayed(com.qcwireless.qcwatch.ui.activity.MainActivity.this.runnable, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.LOCATION_UPDATE_INTERVAL);
            }
        }
    }

    /* compiled from: MainActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/activity/MainActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.activity.MainActivity.class));
        }
    }

    private final void showPermissionInformationDialog() {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_permission_information);
        objectRef.element = builder.create();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).show();
        android.view.View contentView = ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.activity.MainActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.activity.MainActivity.m494showPermissionInformationDialog$lambda6(com.qcwireless.qcwatch.ui.activity.MainActivity.this, objectRef, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.activity.MainActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.activity.MainActivity.m495showPermissionInformationDialog$lambda7(com.qcwireless.qcwatch.ui.activity.MainActivity.this, objectRef, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPermissionInformationDialog$lambda-6, reason: not valid java name */
    public static final void m494showPermissionInformationDialog$lambda6(com.qcwireless.qcwatch.ui.activity.MainActivity mainActivity, kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        mainActivity.requestPermissions();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPermissionInformationDialog$lambda-7, reason: not valid java name */
    public static final void m495showPermissionInformationDialog$lambda7(com.qcwireless.qcwatch.ui.activity.MainActivity mainActivity, kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        mainActivity.requestPermissions();
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setPermissionDescFlag(false);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    private final void showLocationWarningDialog() {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_location_warning);
        objectRef.element = builder.create();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).show();
        android.view.View contentView = ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.activity.MainActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.activity.MainActivity.m492showLocationWarningDialog$lambda8(com.qcwireless.qcwatch.ui.activity.MainActivity.this, objectRef, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.activity.MainActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.activity.MainActivity.m493showLocationWarningDialog$lambda9(com.qcwireless.qcwatch.ui.activity.MainActivity.this, objectRef, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLocationWarningDialog$lambda-8, reason: not valid java name */
    public static final void m492showLocationWarningDialog$lambda8(com.qcwireless.qcwatch.ui.activity.MainActivity mainActivity, kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        mainActivity.showPermissionInformationDialog();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLocationWarningDialog$lambda-9, reason: not valid java name */
    public static final void m493showLocationWarningDialog$lambda9(com.qcwireless.qcwatch.ui.activity.MainActivity mainActivity, kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        mainActivity.showPermissionInformationDialog();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* compiled from: MainActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/activity/MainActivity$PermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/activity/MainActivity;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class PermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public PermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            if (!all) {
                try {
                    com.qcwireless.qcwatch.ui.activity.MainActivity.this.showPermissionSettingDialog(permissions);
                    return;
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            com.iwown.awlog.AwLog.wtfJson(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.iwown.awlog.bean.AppLog(com.qcwireless.qcwatch.QJavaApplication.getInstance().getYMD(), "gps bg ok", "2")), com.qcwireless.qcwatch.QJavaApplication.getAppLogPath());
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            if (never) {
                try {
                    com.qcwireless.qcwatch.ui.activity.MainActivity.this.showPermissionSettingDialog(permissions);
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
                com.iwown.awlog.AwLog.wtfJson(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.iwown.awlog.bean.AppLog(com.qcwireless.qcwatch.QJavaApplication.getInstance().getYMD(), "gps bg ng", "2")), com.qcwireless.qcwatch.QJavaApplication.getAppLogPath());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPermissionSettingDialog(final java.util.List<java.lang.String> permissions) {
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_permission_warming_refuse);
        if (this.refuseDialog == null) {
            com.qcwireless.qcwatch.base.dialog.BottomDialog create = builder.create();
            this.refuseDialog = create;
            kotlin.jvm.internal.Intrinsics.checkNotNull(create);
            create.show();
            com.qcwireless.qcwatch.base.dialog.BottomDialog bottomDialog = this.refuseDialog;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bottomDialog);
            android.view.View contentView = bottomDialog.getContentView();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "refuseDialog!!.contentView");
            android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
            android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
            textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.activity.MainActivity$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.qcwireless.qcwatch.ui.activity.MainActivity.m496showPermissionSettingDialog$lambda10(com.qcwireless.qcwatch.ui.activity.MainActivity.this, permissions, view);
                }
            });
            textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.activity.MainActivity$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.qcwireless.qcwatch.ui.activity.MainActivity.m497showPermissionSettingDialog$lambda11(com.qcwireless.qcwatch.ui.activity.MainActivity.this, permissions, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: showPermissionSettingDialog$lambda-10, reason: not valid java name */
    public static final void m496showPermissionSettingDialog$lambda10(com.qcwireless.qcwatch.ui.activity.MainActivity mainActivity, java.util.List list, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "$permissions");
        com.qcwireless.qcwatch.base.dialog.BottomDialog bottomDialog = mainActivity.refuseDialog;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bottomDialog);
        bottomDialog.dismiss();
        com.hjq.permissions.XXPermissions.startPermissionActivity((android.app.Activity) mainActivity, (java.util.List<java.lang.String>) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: showPermissionSettingDialog$lambda-11, reason: not valid java name */
    public static final void m497showPermissionSettingDialog$lambda11(com.qcwireless.qcwatch.ui.activity.MainActivity mainActivity, java.util.List list, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "$permissions");
        com.qcwireless.qcwatch.base.dialog.BottomDialog bottomDialog = mainActivity.refuseDialog;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bottomDialog);
        bottomDialog.dismiss();
        com.hjq.permissions.XXPermissions.startPermissionActivity((android.app.Activity) mainActivity, (java.util.List<java.lang.String>) list);
    }
}
