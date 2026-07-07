package com.qcwireless.qcwatch.ui.device.connect;

/* compiled from: DeviceBindActivity.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004-./0B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0012\u0010 \u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u001bH\u0014J\b\u0010$\u001a\u00020\u001bH\u0014J\b\u0010%\u001a\u00020\u001bH\u0014J\b\u0010&\u001a\u00020\u001bH\u0002J\b\u0010'\u001a\u00020\u001bH\u0002J\b\u0010(\u001a\u00020\u001bH\u0014J\b\u0010)\u001a\u00020\u001bH\u0002J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020,H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00060\u0018R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/device/connect/adapter/DeviceListAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityDeviceBindBinding;", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "connectFailNumber", "", "deviceViewModel", "Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindViewModel;", "getDeviceViewModel", "()Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindViewModel;", "deviceViewModel$delegate", "Lkotlin/Lazy;", "myBleReceiver", "Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindActivity$MyReceiver;", "myHandler", "Landroid/os/Handler;", "popupWindow", "Landroid/widget/PopupWindow;", "runnable", "Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindActivity$MyRunnable;", "scanSize", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "setAnim1", "setAnim2", "setupViews", "showBluetoothRestartDialog", "showPopMenu", "view", "Landroid/view/View;", "BluetoothPermissionCallback", "MyReceiver", "MyRunnable", "PermissionCallback", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DeviceBindActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.device.connect.adapter.DeviceListAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding binding;
    private android.bluetooth.BluetoothAdapter bluetoothAdapter;
    private int connectFailNumber;

    /* renamed from: deviceViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy deviceViewModel;
    private final android.os.Handler myHandler;
    private android.widget.PopupWindow popupWindow;
    private int scanSize;
    private final com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.MyRunnable runnable = new com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.MyRunnable();
    private final com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.MyReceiver myBleReceiver = new com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.MyReceiver();

    public DeviceBindActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.deviceViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel>() { // from class: com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel m665invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.myHandler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity$myHandler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel getDeviceViewModel() {
        return (com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel) this.deviceViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding inflate = com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding.inflate(getLayoutInflater());
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
    protected void onResume() {
        super.onResume();
        try {
            if (!com.qcwireless.qc_utils.bluetooth.BluetoothUtils.isEnabledBluetooth((android.content.Context) this)) {
                android.content.Intent intent = new android.content.Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
                if (android.os.Build.VERSION.SDK_INT >= 31 && androidx.core.app.ActivityCompat.checkSelfPermission((android.content.Context) this, com.hjq.permissions.Permission.BLUETOOTH_CONNECT) != 0) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---------");
                    startActivityForResult(intent, 1001);
                    return;
                }
                startActivityForResult(intent, 1001);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) this;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(com.qcwireless.qcwatch.base.permission.PermissionUtilKt.hasBluetooth(fragmentActivity)));
        if (!com.qcwireless.qcwatch.base.permission.PermissionUtilKt.hasBluetooth(fragmentActivity)) {
            com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestBluetoothPermission(fragmentActivity, new com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.BluetoothPermissionCallback());
        } else {
            com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestLocationPermission(fragmentActivity, new com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.PermissionCallback());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultAdapter, "getDefaultAdapter()");
        this.bluetoothAdapter = defaultAdapter;
        android.content.IntentFilter intentFilter = com.oudmon.ble.base.bluetooth.BleAction.getIntentFilter();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intentFilter, "getIntentFilter()");
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).registerReceiver(this.myBleReceiver, intentFilter);
        setAnim1();
        setAnim2();
        android.content.Context context = (android.content.Context) this;
        this.adapter = new com.qcwireless.qcwatch.ui.device.connect.adapter.DeviceListAdapter(context, getDeviceViewModel().getDeviceList());
        com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding2 = null;
        if (activityDeviceBindBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDeviceBindBinding = null;
        }
        activityDeviceBindBinding.deviceRcv.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityDeviceBindBinding.deviceRcv;
        com.qcwireless.qcwatch.ui.device.connect.adapter.DeviceListAdapter deviceListAdapter = this.adapter;
        if (deviceListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            deviceListAdapter = null;
        }
        recyclerView.setAdapter(deviceListAdapter);
        activityDeviceBindBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_9));
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityDeviceBindBinding.titleBar.tvRightText);
        activityDeviceBindBinding.titleBar.tvRightText.setBackgroundResource(com.qcwireless.qcwatch.R.mipmap.device_warming);
        activityDeviceBindBinding.titleBar.ivNavigateBefore.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.m659setupViews$lambda2$lambda0(com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this, view);
            }
        });
        activityDeviceBindBinding.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.m660setupViews$lambda2$lambda1(com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this, view);
            }
        });
        com.qcwireless.qcwatch.ui.device.connect.adapter.DeviceListAdapter deviceListAdapter2 = this.adapter;
        if (deviceListAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            deviceListAdapter2 = null;
        }
        deviceListAdapter2.notifyDataSetChanged();
        final com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel deviceViewModel = getDeviceViewModel();
        deviceViewModel.getDeviceLiveData().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity$$ExternalSyntheticLambda4
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.m661setupViews$lambda5$lambda4(com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel.this, this, (com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch) obj);
            }
        });
        com.qcwireless.qcwatch.ui.device.connect.adapter.DeviceListAdapter deviceListAdapter3 = this.adapter;
        if (deviceListAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            deviceListAdapter3 = null;
        }
        deviceListAdapter3.setOnItemClickListener(new com.chad.library.adapter.base.listener.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity$$ExternalSyntheticLambda5
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.m662setupViews$lambda7$lambda6(com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this, baseQuickAdapter, view, i);
            }
        });
        android.view.View[] viewArr = new android.view.View[1];
        com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding3 = this.binding;
        if (activityDeviceBindBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDeviceBindBinding2 = activityDeviceBindBinding3;
        }
        viewArr[0] = activityDeviceBindBinding2.startScan;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity$setupViews$4
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel deviceViewModel2;
                com.qcwireless.qcwatch.ui.device.connect.adapter.DeviceListAdapter deviceListAdapter4;
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel deviceViewModel3;
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel deviceViewModel4;
                android.os.Handler handler;
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.MyRunnable myRunnable;
                android.os.Handler handler2;
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.MyRunnable myRunnable2;
                android.app.Activity activity;
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel deviceViewModel5;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                deviceViewModel2 = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.getDeviceViewModel();
                deviceViewModel2.getDeviceList().clear();
                deviceListAdapter4 = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.adapter;
                if (deviceListAdapter4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    deviceListAdapter4 = null;
                }
                deviceListAdapter4.notifyDataSetChanged();
                com.oudmon.ble.base.scan.BleScannerHelper.getInstance().reSetCallback();
                deviceViewModel3 = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.getDeviceViewModel();
                java.util.List<com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch> addSystemBondedDevice = deviceViewModel3.addSystemBondedDevice();
                if (addSystemBondedDevice.size() > 0) {
                    com.iwown.awlog.AwLog.wtfJson(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.iwown.awlog.bean.AppLog(com.qcwireless.qcwatch.QJavaApplication.getInstance().getYMD(), "sys bind", "1")), com.qcwireless.qcwatch.QJavaApplication.getAppLogPath());
                    deviceViewModel5 = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.getDeviceViewModel();
                    deviceViewModel5.getDeviceList().addAll(addSystemBondedDevice);
                }
                if (com.qcwireless.qc_utils.bluetooth.BluetoothUtils.isEnabledBluetooth((android.content.Context) com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this)) {
                    com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.scanSize = 0;
                    com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding4 = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.binding;
                    if (activityDeviceBindBinding4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityDeviceBindBinding4 = null;
                    }
                    activityDeviceBindBinding4.tvSearchStatus.setText(com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_31));
                    com.oudmon.ble.base.scan.BleScannerHelper.getInstance().setScanFilter(com.qcwireless.qcwatch.QJavaApplication.getInstance().getKeys());
                    com.oudmon.ble.base.scan.BleScannerHelper bleScannerHelper = com.oudmon.ble.base.scan.BleScannerHelper.getInstance();
                    android.content.Context context2 = com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT();
                    deviceViewModel4 = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.getDeviceViewModel();
                    bleScannerHelper.scanDevice(context2, null, deviceViewModel4.getBleScanCallback());
                    handler = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.myHandler;
                    myRunnable = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.runnable;
                    handler.removeCallbacks(myRunnable);
                    handler2 = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.myHandler;
                    myRunnable2 = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.runnable;
                    handler2.postDelayed(myRunnable2, 15000L);
                    com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.setAnim1();
                    com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.setAnim2();
                    return;
                }
                if (android.os.Build.VERSION.SDK_INT < 31 || androidx.core.app.ActivityCompat.checkSelfPermission((android.content.Context) com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this, com.hjq.permissions.Permission.BLUETOOTH_CONNECT) == 0) {
                    android.content.Intent intent = new android.content.Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
                    activity = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.getActivity();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(activity);
                    activity.startActivityForResult(intent, 1001);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2$lambda-0, reason: not valid java name */
    public static final void m659setupViews$lambda2$lambda0(com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity deviceBindActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindActivity, "this$0");
        deviceBindActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-2$lambda-1, reason: not valid java name */
    public static final void m660setupViews$lambda2$lambda1(com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity deviceBindActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindActivity, "this$0");
        android.app.Activity activity = (android.app.Activity) deviceBindActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.connect.DeviceConnectWarmingActivity.class);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-5$lambda-4, reason: not valid java name */
    public static final void m661setupViews$lambda5$lambda4(com.qcwireless.qcwatch.ui.device.connect.DeviceBindViewModel deviceBindViewModel, com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity deviceBindActivity, com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch smartWatch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindViewModel, "$this_apply");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindActivity, "this$0");
        if (deviceBindViewModel.getDeviceList().contains(smartWatch)) {
            return;
        }
        deviceBindActivity.scanSize++;
        java.util.List<com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch> deviceList = deviceBindViewModel.getDeviceList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(smartWatch, "it");
        deviceList.add(0, smartWatch);
        java.util.List<com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch> deviceList2 = deviceBindViewModel.getDeviceList();
        if (deviceList2.size() > 1) {
            kotlin.collections.CollectionsKt.sortWith(deviceList2, new java.util.Comparator() { // from class: com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity$setupViews$lambda-5$lambda-4$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch) t2).getRssi()), java.lang.Integer.valueOf(((com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch) t).getRssi()));
                }
            });
        }
        com.qcwireless.qcwatch.ui.device.connect.adapter.DeviceListAdapter deviceListAdapter = deviceBindActivity.adapter;
        com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding = null;
        if (deviceListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            deviceListAdapter = null;
        }
        deviceListAdapter.notifyDataSetChanged();
        if (deviceBindActivity.scanSize > 30) {
            com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding2 = deviceBindActivity.binding;
            if (activityDeviceBindBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDeviceBindBinding2 = null;
            }
            activityDeviceBindBinding2.tvSearchStatus.setText(deviceBindActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_32));
            com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding3 = deviceBindActivity.binding;
            if (activityDeviceBindBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDeviceBindBinding3 = null;
            }
            activityDeviceBindBinding3.ivWave1.clearAnimation();
            com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding4 = deviceBindActivity.binding;
            if (activityDeviceBindBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityDeviceBindBinding = activityDeviceBindBinding4;
            }
            activityDeviceBindBinding.ivWave2.clearAnimation();
            com.oudmon.ble.base.scan.BleScannerHelper.getInstance().stopScan(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-7$lambda-6, reason: not valid java name */
    public static final void m662setupViews$lambda7$lambda6(com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity deviceBindActivity, com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "<anonymous parameter 0>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        deviceBindActivity.myHandler.removeCallbacks(deviceBindActivity.runnable);
        com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch smartWatch = deviceBindActivity.getDeviceViewModel().getDeviceList().get(i);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, smartWatch);
        deviceBindActivity.showLoadingDialog();
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGpsPermission(new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp() + 300);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().connectDirectly(smartWatch.getDeviceAddress());
        com.iwown.awlog.AwLog.wtfJson(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.iwown.awlog.bean.AppLog(com.qcwireless.qcwatch.QJavaApplication.getInstance().getYMD(), smartWatch.getDeviceName() + '-' + smartWatch.getDeviceAddress(), "1")), com.qcwireless.qcwatch.QJavaApplication.getAppLogPath());
    }

    /* compiled from: DeviceBindActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindActivity$MyRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindActivity;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyRunnable implements java.lang.Runnable {
        public MyRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.binding;
            com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding2 = null;
            if (activityDeviceBindBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDeviceBindBinding = null;
            }
            activityDeviceBindBinding.tvSearchStatus.setText(com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_32));
            com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding3 = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.binding;
            if (activityDeviceBindBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDeviceBindBinding3 = null;
            }
            activityDeviceBindBinding3.ivWave1.clearAnimation();
            com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding4 = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.binding;
            if (activityDeviceBindBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityDeviceBindBinding4 = null;
            }
            activityDeviceBindBinding4.ivWave2.clearAnimation();
            com.oudmon.ble.base.scan.BleScannerHelper.getInstance().stopScan(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT());
            if (com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.scanSize <= 0) {
                try {
                    if (com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.isFinishing() || !(com.blankj.utilcode.util.ActivityUtils.getTopActivity() instanceof com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity)) {
                        return;
                    }
                    com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity deviceBindActivity = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this;
                    com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding5 = deviceBindActivity.binding;
                    if (activityDeviceBindBinding5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityDeviceBindBinding2 = activityDeviceBindBinding5;
                    }
                    android.widget.TextView textView = activityDeviceBindBinding2.titleBar.tvRightText;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "binding.titleBar.tvRightText");
                    deviceBindActivity.showPopMenu(textView);
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onPause() {
        super.onPause();
        android.widget.PopupWindow popupWindow = this.popupWindow;
        if (popupWindow != null) {
            android.widget.PopupWindow popupWindow2 = null;
            if (popupWindow == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
                popupWindow = null;
            }
            if (popupWindow.isShowing()) {
                android.widget.PopupWindow popupWindow3 = this.popupWindow;
                if (popupWindow3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
                } else {
                    popupWindow2 = popupWindow3;
                }
                popupWindow2.dismiss();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        this.myHandler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.m658onDestroy$lambda8();
            }
        }, 1000L);
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance((android.content.Context) this).unregisterReceiver(this.myBleReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onDestroy$lambda-8, reason: not valid java name */
    public static final void m658onDestroy$lambda8() {
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(new com.oudmon.ble.base.communication.req.SimpleKeyReq((byte) 16));
        com.oudmon.ble.base.scan.BleScannerHelper.getInstance().stopScan(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnim1() {
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(true);
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 1.3f, 1.0f, 1.3f, 1, 0.5f, 1, 0.5f);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.5f);
        scaleAnimation.setDuration(800L);
        scaleAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatCount(-1);
        animationSet.setDuration(800L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding = this.binding;
        if (activityDeviceBindBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDeviceBindBinding = null;
        }
        activityDeviceBindBinding.ivWave1.startAnimation(animationSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnim2() {
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(true);
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.3f, 1.5f, 1.3f, 1.5f, 1, 0.5f, 1, 0.5f);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.5f, 0.1f);
        scaleAnimation.setDuration(800L);
        scaleAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatCount(-1);
        animationSet.setDuration(800L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding = this.binding;
        if (activityDeviceBindBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDeviceBindBinding = null;
        }
        activityDeviceBindBinding.ivWave2.startAnimation(animationSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBluetoothRestartDialog() {
        com.qcwireless.qcwatch.base.dialog.CenterDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.CenterDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_bluetooth_warming);
        final com.qcwireless.qcwatch.base.dialog.CenterDialog create = builder.create();
        create.show();
        android.view.View contentView = create.getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        ((android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_confirm)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.m663showBluetoothRestartDialog$lambda9(com.qcwireless.qcwatch.base.dialog.CenterDialog.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: showBluetoothRestartDialog$lambda-9, reason: not valid java name */
    public static final void m663showBluetoothRestartDialog$lambda9(com.qcwireless.qcwatch.base.dialog.CenterDialog centerDialog, com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity deviceBindActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindActivity, "this$0");
        centerDialog.dismiss();
        if (android.os.Build.VERSION.SDK_INT < 31 || androidx.core.app.ActivityCompat.checkSelfPermission((android.content.Context) deviceBindActivity, com.hjq.permissions.Permission.BLUETOOTH_CONNECT) == 0) {
            android.bluetooth.BluetoothAdapter bluetoothAdapter = deviceBindActivity.bluetoothAdapter;
            if (bluetoothAdapter == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bluetoothAdapter");
                bluetoothAdapter = null;
            }
            bluetoothAdapter.disable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showPopMenu(android.view.View view) {
        android.content.Context context = (android.content.Context) this;
        com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding = null;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.qcwireless.qcwatch.R.layout.popwindow_layout_scan, (android.view.ViewGroup) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "from(this).inflate(\n    …yout_scan, null\n        )");
        this.popupWindow = new android.widget.PopupWindow(inflate, (int) com.qcwireless.qcwatch.base.view.GlobalKt.dp2px(context, 120.0f), -2, true);
        ((android.widget.TextView) inflate.findViewById(com.qcwireless.qcwatch.R.id.tv_add)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.m664showPopMenu$lambda10(com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this, view2);
            }
        });
        android.widget.PopupWindow popupWindow = this.popupWindow;
        if (popupWindow == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            popupWindow = null;
        }
        popupWindow.setTouchable(true);
        int width = view.getWidth();
        android.widget.PopupWindow popupWindow2 = this.popupWindow;
        if (popupWindow2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            popupWindow2 = null;
        }
        popupWindow2.dismiss();
        android.widget.PopupWindow popupWindow3 = this.popupWindow;
        if (popupWindow3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            popupWindow3 = null;
        }
        com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding2 = this.binding;
        if (activityDeviceBindBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDeviceBindBinding = activityDeviceBindBinding2;
        }
        popupWindow3.showAsDropDown(activityDeviceBindBinding.titleBar.tvRightText, (-((int) com.qcwireless.qcwatch.base.view.GlobalKt.dp2px(context, 120.0f))) + width, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: showPopMenu$lambda-10, reason: not valid java name */
    public static final void m664showPopMenu$lambda10(com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity deviceBindActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindActivity, "this$0");
        android.widget.PopupWindow popupWindow = deviceBindActivity.popupWindow;
        if (popupWindow == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("popupWindow");
            popupWindow = null;
        }
        popupWindow.dismiss();
        android.app.Activity activity = (android.app.Activity) deviceBindActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.connect.DeviceConnectWarmingActivity.class);
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

    /* compiled from: DeviceBindActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindActivity$MyReceiver;", "Lcom/oudmon/ble/base/bluetooth/QCBluetoothCallbackCloneReceiver;", "(Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindActivity;)V", "bleStatus", "", "status", "", "newState", "connectStatue", "device", "Landroid/bluetooth/BluetoothDevice;", "connected", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyReceiver extends com.oudmon.ble.base.bluetooth.QCBluetoothCallbackCloneReceiver {
        public MyReceiver() {
        }

        @Override // com.oudmon.ble.base.bluetooth.QCBluetoothCallbackCloneReceiver
        public void connectStatue(android.bluetooth.BluetoothDevice device, boolean connected) {
            if (connected) {
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.connectFailNumber = 0;
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.dismissLoadingDialog();
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.finish();
            }
        }

        @Override // com.oudmon.ble.base.bluetooth.QCBluetoothCallbackCloneReceiver
        public void bleStatus(int status, int newState) {
            super.bleStatus(status, newState);
            if (status > 0) {
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.connectFailNumber++;
                if (com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.connectFailNumber > 4) {
                    com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.showBluetoothRestartDialog();
                }
            }
        }
    }

    /* compiled from: DeviceBindActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindActivity$PermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindActivity;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class PermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public PermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding = null;
            if (all) {
                com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding2 = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.binding;
                if (activityDeviceBindBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityDeviceBindBinding = activityDeviceBindBinding2;
                }
                activityDeviceBindBinding.startScan.performClick();
                return;
            }
            java.lang.String string = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            if (never) {
                java.lang.String string = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_386);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_386)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                com.hjq.permissions.XXPermissions.startPermissionActivity((android.app.Activity) com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this, permissions);
            }
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1001) {
            if (resultCode == -1) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "打开蓝牙");
            } else {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "用户拒绝");
                finish();
            }
        }
    }

    /* compiled from: DeviceBindActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindActivity$BluetoothPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/device/connect/DeviceBindActivity;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class BluetoothPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public BluetoothPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding = null;
            if (all) {
                com.qcwireless.qcwatch.databinding.ActivityDeviceBindBinding activityDeviceBindBinding2 = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.binding;
                if (activityDeviceBindBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityDeviceBindBinding = activityDeviceBindBinding2;
                }
                activityDeviceBindBinding.startScan.performClick();
                return;
            }
            java.lang.String string = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            if (never) {
                com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.finish();
                com.hjq.permissions.XXPermissions.startPermissionActivity((android.app.Activity) com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this, permissions);
                java.lang.String string = com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_458);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_458)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            }
        }
    }
}
