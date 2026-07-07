package com.qcwireless.qcwatch.ui.device.record;

/* compiled from: RecordListActivity.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\b\u0010\u0015\u001a\u00020\u000fH\u0014J\b\u0010\u0016\u001a\u00020\u000fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/record/RecordListActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/device/record/adapter/RecordListAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityRecordListBinding;", "deviceRecordList", "", "Lcom/oudmon/ble/base/communication/entity/RecordEntity;", "getDeviceRecordList", "()Ljava/util/List;", "setDeviceRecordList", "(Ljava/util/List;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class RecordListActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityRecordListBinding binding;
    private java.util.List<com.oudmon.ble.base.communication.entity.RecordEntity> deviceRecordList = new java.util.ArrayList();

    public final java.util.List<com.oudmon.ble.base.communication.entity.RecordEntity> getDeviceRecordList() {
        return this.deviceRecordList;
    }

    public final void setDeviceRecordList(java.util.List<com.oudmon.ble.base.communication.entity.RecordEntity> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.deviceRecordList = list;
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityRecordListBinding inflate = com.qcwireless.qcwatch.databinding.ActivityRecordListBinding.inflate(getLayoutInflater());
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
        android.content.Context context = (android.content.Context) this;
        com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter recordListAdapter = new com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter(context, this.deviceRecordList);
        this.adapter = recordListAdapter;
        recordListAdapter.setSelectMode(com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.SelectMode.SINGLE_SELECT);
        com.qcwireless.qcwatch.databinding.ActivityRecordListBinding activityRecordListBinding = this.binding;
        com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter recordListAdapter2 = null;
        if (activityRecordListBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityRecordListBinding = null;
        }
        activityRecordListBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_562));
        com.qcwireless.qcwatch.databinding.ActivityRecordListBinding activityRecordListBinding2 = this.binding;
        if (activityRecordListBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityRecordListBinding2 = null;
        }
        activityRecordListBinding2.rcvDeviceRecordList.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        com.qcwireless.qcwatch.databinding.ActivityRecordListBinding activityRecordListBinding3 = this.binding;
        if (activityRecordListBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityRecordListBinding3 = null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = activityRecordListBinding3.rcvDeviceRecordList;
        com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter recordListAdapter3 = this.adapter;
        if (recordListAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            recordListAdapter3 = null;
        }
        recyclerView.setAdapter(recordListAdapter3);
        com.oudmon.ble.base.communication.file.RecordHandle.getInstance().clearCallback();
        com.oudmon.ble.base.communication.file.RecordHandle.getInstance().initRegister();
        com.oudmon.ble.base.communication.file.RecordHandle.getInstance().registerCallback(new com.oudmon.ble.base.communication.file.IRecordCallback() { // from class: com.qcwireless.qcwatch.ui.device.record.RecordListActivity$setupViews$2
            @Override // com.oudmon.ble.base.communication.file.IRecordCallback
            public void onActionResult(int errCode) {
            }

            @Override // com.oudmon.ble.base.communication.file.IRecordCallback
            public void onComplete() {
            }

            @Override // com.oudmon.ble.base.communication.file.IRecordCallback
            public void onProgress(float percent) {
            }

            @Override // com.oudmon.ble.base.communication.file.IRecordCallback
            public void onReceiver(byte[] data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            }

            @Override // com.oudmon.ble.base.communication.file.IRecordCallback
            public void onFileNames(java.util.ArrayList<com.oudmon.ble.base.communication.entity.RecordEntity> fileNames) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileNames, "fileNames");
                com.qcwireless.qcwatch.ui.device.record.RecordListActivity.this.getDeviceRecordList().clear();
                com.qcwireless.qcwatch.ui.device.record.RecordListActivity.this.getDeviceRecordList().addAll(fileNames);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, fileNames);
                final com.qcwireless.qcwatch.ui.device.record.RecordListActivity recordListActivity = com.qcwireless.qcwatch.ui.device.record.RecordListActivity.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.record.RecordListActivity$setupViews$2, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.record.RecordListActivity$setupViews$2$onFileNames$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.record.RecordListActivity$setupViews$2) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.record.RecordListActivity$setupViews$2 recordListActivity$setupViews$2) {
                        com.qcwireless.qcwatch.databinding.ActivityRecordListBinding activityRecordListBinding4;
                        com.qcwireless.qcwatch.databinding.ActivityRecordListBinding activityRecordListBinding5;
                        com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter recordListAdapter4;
                        com.qcwireless.qcwatch.databinding.ActivityRecordListBinding activityRecordListBinding6;
                        com.qcwireless.qcwatch.databinding.ActivityRecordListBinding activityRecordListBinding7;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordListActivity$setupViews$2, "$this$ktxRunOnUi");
                        com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter recordListAdapter5 = null;
                        if (com.qcwireless.qcwatch.ui.device.record.RecordListActivity.this.getDeviceRecordList().size() == 0) {
                            activityRecordListBinding6 = com.qcwireless.qcwatch.ui.device.record.RecordListActivity.this.binding;
                            if (activityRecordListBinding6 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityRecordListBinding6 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityRecordListBinding6.noMusic);
                            activityRecordListBinding7 = com.qcwireless.qcwatch.ui.device.record.RecordListActivity.this.binding;
                            if (activityRecordListBinding7 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityRecordListBinding7 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityRecordListBinding7.cs2);
                        } else {
                            activityRecordListBinding4 = com.qcwireless.qcwatch.ui.device.record.RecordListActivity.this.binding;
                            if (activityRecordListBinding4 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityRecordListBinding4 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityRecordListBinding4.noMusic);
                            activityRecordListBinding5 = com.qcwireless.qcwatch.ui.device.record.RecordListActivity.this.binding;
                            if (activityRecordListBinding5 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityRecordListBinding5 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityRecordListBinding5.cs2);
                        }
                        recordListAdapter4 = com.qcwireless.qcwatch.ui.device.record.RecordListActivity.this.adapter;
                        if (recordListAdapter4 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        } else {
                            recordListAdapter5 = recordListAdapter4;
                        }
                        recordListAdapter5.notifyDataSetChanged();
                    }
                });
            }
        });
        com.oudmon.ble.base.communication.file.RecordHandle.getInstance().start(0);
        com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter recordListAdapter4 = this.adapter;
        if (recordListAdapter4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            recordListAdapter2 = recordListAdapter4;
        }
        recordListAdapter2.setOnItemSingleSelectListener(new com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemSingleSelectListener() { // from class: com.qcwireless.qcwatch.ui.device.record.RecordListActivity$$ExternalSyntheticLambda0
            @Override // com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter.OnItemSingleSelectListener
            public final void onSelected(int i, boolean z) {
                com.qcwireless.qcwatch.ui.device.record.RecordListActivity.m858setupViews$lambda2(com.qcwireless.qcwatch.ui.device.record.RecordListActivity.this, i, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setupViews$lambda-2, reason: not valid java name */
    public static final void m858setupViews$lambda2(com.qcwireless.qcwatch.ui.device.record.RecordListActivity recordListActivity, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordListActivity, "this$0");
        if (com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().getSync() || com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().getSyncSportPlus()) {
            java.lang.String string = recordListActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_236);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_236)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        com.oudmon.ble.base.communication.entity.RecordEntity recordEntity = recordListActivity.deviceRecordList.get(i);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, recordEntity);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("fileName", recordEntity.getFileName());
        bundle.putInt("size", recordEntity.getLength());
        android.app.Activity activity = (android.app.Activity) recordListActivity;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.record.PlayFileActivity.class);
        intent.setFlags(1);
        intent.putExtras(bundle);
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

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            return;
        }
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        finish();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if (!(messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) || ((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect()) {
            return;
        }
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        finish();
    }
}
