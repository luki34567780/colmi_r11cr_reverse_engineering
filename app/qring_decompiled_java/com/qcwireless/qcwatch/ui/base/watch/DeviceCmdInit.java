package com.qcwireless.qcwatch.ui.base.watch;

/* compiled from: DeviceCmdInit.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/watch/DeviceCmdInit;", "", "()V", "deviceSetting", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "init", "", "initDeviceSetting", "saveDeviceSetting", "syncDeviceSetting", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DeviceCmdInit {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit>() { // from class: com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit m617invoke() {
            return new com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit();
        }
    });
    private com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncDeviceSetting$lambda-7$lambda-6, reason: not valid java name */
    public static final void m615syncDeviceSetting$lambda7$lambda6(com.oudmon.ble.base.communication.rsp.TimeFormatRsp timeFormatRsp) {
    }

    public final void initDeviceSetting() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$initDeviceSetting$1(this, null), 3, (java.lang.Object) null);
    }

    public final void init() {
        com.iwown.awlog.AwLog.wtfJson(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.iwown.awlog.bean.AppLog(com.qcwireless.qcwatch.QJavaApplication.getInstance().getYMD(), "phone brand: " + android.os.Build.BRAND + "phone model: " + android.os.Build.MODEL + "android sdk: " + android.os.Build.VERSION.SDK_INT + "os version: " + android.os.Build.VERSION.RELEASE + '-' + com.qcwireless.qcwatch.base.view.GlobalKt.getAppName(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()) + '-' + com.qcwireless.qcwatch.base.view.GlobalKt.getVersionName(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()), "2")), com.qcwireless.qcwatch.QJavaApplication.getAppLogPath());
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().clearCallback();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().addNotifyListener(17, new com.qcwireless.qcwatch.ui.device.push.call.PhoneNotifyListener(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()));
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.DataSyncEvent(true));
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.SetTimeReq(1), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$$ExternalSyntheticLambda7
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.m608init$lambda0((com.oudmon.ble.base.communication.rsp.SetTimeRsp) baseRspCmd);
            }
        });
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.SetMessagePushReq(), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$$ExternalSyntheticLambda6
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.m609init$lambda1((com.oudmon.ble.base.communication.rsp.ReadMessagePushRsp) baseRspCmd);
            }
        });
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.SimpleKeyReq((byte) 3), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$$ExternalSyntheticLambda5
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.m610init$lambda2((com.oudmon.ble.base.communication.rsp.BatteryRsp) baseRspCmd);
            }
        });
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(new com.oudmon.ble.base.communication.req.BindAncsReq());
        syncDeviceSetting();
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getLocationOnce(com.qcwireless.qcwatch.QCApplication.INSTANCE.getApplication());
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.BluetoothSyncEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-0, reason: not valid java name */
    public static final void m608init$lambda0(com.oudmon.ble.base.communication.rsp.SetTimeRsp setTimeRsp) {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$init$1$1(setTimeRsp, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-1, reason: not valid java name */
    public static final void m609init$lambda1(com.oudmon.ble.base.communication.rsp.ReadMessagePushRsp readMessagePushRsp) {
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMessagePushSupport(readMessagePushRsp.getDeviceSupport1());
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-2, reason: not valid java name */
    public static final void m610init$lambda2(com.oudmon.ble.base.communication.rsp.BatteryRsp batteryRsp) {
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setBattery(java.lang.String.valueOf(batteryRsp.getBatteryValue()));
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.BatteryLowEvent());
    }

    private final void syncDeviceSetting() {
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.HeartRateSettingReq.getReadInstance(), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$$ExternalSyntheticLambda1
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.m611syncDeviceSetting$lambda3(com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.this, (com.oudmon.ble.base.communication.rsp.HeartRateSettingRsp) baseRspCmd);
            }
        });
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PressureSettingReq.getReadInstance(), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$$ExternalSyntheticLambda2
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.m612syncDeviceSetting$lambda4(com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.this, (com.oudmon.ble.base.communication.rsp.PressureSettingRsp) baseRspCmd);
            }
        });
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.BloodOxygenSettingReq.getReadInstance(), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.m613syncDeviceSetting$lambda5(com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.this, (com.oudmon.ble.base.communication.rsp.BloodOxygenSettingRsp) baseRspCmd);
            }
        });
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.TimeFormatReq.getReadInstance(), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$$ExternalSyntheticLambda4
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.m614syncDeviceSetting$lambda7(com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.this, (com.oudmon.ble.base.communication.rsp.TimeFormatRsp) baseRspCmd);
            }
        });
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.TargetSettingReq.getReadInstance(), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$$ExternalSyntheticLambda3
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.m616syncDeviceSetting$lambda8(com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.this, (com.oudmon.ble.base.communication.rsp.TargetSettingRsp) baseRspCmd);
            }
        });
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$syncDeviceSetting$6
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit deviceCmdInit) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCmdInit, "$this$ktxRunOnBgSingle");
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity queryUserByUid = com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.INSTANCE.getGetInstance().queryUserByUid(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid());
                if (queryUserByUid != null) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(deviceCmdInit, new com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$syncDeviceSetting$6.AnonymousClass1(queryUserByUid, com.qcwireless.qc_utils.date.DateUtil.getAgeByBirthday(com.qcwireless.qc_utils.date.DateUtil.String2Date("yyyy-MM-dd", queryUserByUid.getBirthday() + "-01"))));
                }
            }

            /* compiled from: DeviceCmdInit.kt */
            @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/qcwireless/qcwatch/ui/base/watch/DeviceCmdInit;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$syncDeviceSetting$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit, kotlin.Unit> {
                final /* synthetic */ int $age;
                final /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity $userEntity;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity, int i) {
                    super(1);
                    this.$userEntity = userEntity;
                    this.$age = i;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: invoke$lambda-0, reason: not valid java name */
                public static final void m618invoke$lambda0(com.oudmon.ble.base.communication.rsp.TimeFormatRsp timeFormatRsp) {
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit deviceCmdInit) {
                    com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;
                    com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCmdInit, "$this$ktxRunOnUi");
                    com.oudmon.ble.base.communication.CommandHandle commandHandle = com.oudmon.ble.base.communication.CommandHandle.getInstance();
                    deviceSetting = deviceCmdInit.deviceSetting;
                    com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = null;
                    if (deviceSetting == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                        deviceSetting = null;
                    }
                    boolean z = deviceSetting.getTimeFormat() == 0;
                    deviceSetting2 = deviceCmdInit.deviceSetting;
                    if (deviceSetting2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                    } else {
                        deviceSetting3 = deviceSetting2;
                    }
                    commandHandle.executeReqCmd(com.oudmon.ble.base.communication.req.TimeFormatReq.getWriteInstance(z, deviceSetting3.getMetricUnit(), this.$userEntity.getGender() - 1, this.$age, (int) this.$userEntity.getHeight(), (int) this.$userEntity.getWeight(), 120, 90, 0), com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$syncDeviceSetting$6$1$$ExternalSyntheticLambda0.INSTANCE);
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, this.$userEntity.getNickName());
                    com.oudmon.ble.base.communication.LargeDataHandler.getInstance().setDeviceNickName(this.$userEntity.getNickName());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncDeviceSetting$lambda-3, reason: not valid java name */
    public static final void m611syncDeviceSetting$lambda3(com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit deviceCmdInit, com.oudmon.ble.base.communication.rsp.HeartRateSettingRsp heartRateSettingRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCmdInit, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = deviceCmdInit.deviceSetting;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = null;
        if (deviceSetting == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting = null;
        }
        deviceSetting.setHrDetection(heartRateSettingRsp.isEnable());
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = deviceCmdInit.deviceSetting;
        if (deviceSetting3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting3 = null;
        }
        deviceSetting3.setHrInterval(heartRateSettingRsp.getHeartInterval());
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(heartRateSettingRsp.getHeartInterval()));
        if (heartRateSettingRsp.getHeartInterval() > 0) {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setHeartRateInterval(true);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        } else {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setHeartRateInterval(false);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        }
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = deviceCmdInit.deviceSetting;
        if (deviceSetting4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
        } else {
            deviceSetting2 = deviceSetting4;
        }
        deviceCmdInit.saveDeviceSetting(deviceSetting2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncDeviceSetting$lambda-4, reason: not valid java name */
    public static final void m612syncDeviceSetting$lambda4(com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit deviceCmdInit, com.oudmon.ble.base.communication.rsp.PressureSettingRsp pressureSettingRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCmdInit, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = deviceCmdInit.deviceSetting;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = null;
        if (deviceSetting == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting = null;
        }
        deviceSetting.setPressureDetection(pressureSettingRsp.isEnable());
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = deviceCmdInit.deviceSetting;
        if (deviceSetting3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
        } else {
            deviceSetting2 = deviceSetting3;
        }
        deviceCmdInit.saveDeviceSetting(deviceSetting2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncDeviceSetting$lambda-5, reason: not valid java name */
    public static final void m613syncDeviceSetting$lambda5(com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit deviceCmdInit, com.oudmon.ble.base.communication.rsp.BloodOxygenSettingRsp bloodOxygenSettingRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCmdInit, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = deviceCmdInit.deviceSetting;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = null;
        if (deviceSetting == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting = null;
        }
        deviceSetting.setBo2Detection(bloodOxygenSettingRsp.isEnable());
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = deviceCmdInit.deviceSetting;
        if (deviceSetting3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
        } else {
            deviceSetting2 = deviceSetting3;
        }
        deviceCmdInit.saveDeviceSetting(deviceSetting2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncDeviceSetting$lambda-7, reason: not valid java name */
    public static final void m614syncDeviceSetting$lambda7(com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit deviceCmdInit, com.oudmon.ble.base.communication.rsp.TimeFormatRsp timeFormatRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCmdInit, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (timeFormatRsp.is24()) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = deviceCmdInit.deviceSetting;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting2 = null;
            }
            deviceSetting2.setTimeFormat(0);
        } else {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = deviceCmdInit.deviceSetting;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting3 = null;
            }
            deviceSetting3.setTimeFormat(1);
        }
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = deviceCmdInit.deviceSetting;
            if (deviceSetting4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting4 = null;
            }
            deviceSetting4.setMetricUnit(0);
        } else {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting5 = deviceCmdInit.deviceSetting;
            if (deviceSetting5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting5 = null;
            }
            deviceSetting5.setMetricUnit(1);
        }
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting6 = deviceCmdInit.deviceSetting;
        if (deviceSetting6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting6 = null;
        }
        deviceCmdInit.saveDeviceSetting(deviceSetting6);
        com.oudmon.ble.base.communication.CommandHandle commandHandle = com.oudmon.ble.base.communication.CommandHandle.getInstance();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting7 = deviceCmdInit.deviceSetting;
        if (deviceSetting7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting7 = null;
        }
        boolean z = deviceSetting7.getTimeFormat() == 0;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting8 = deviceCmdInit.deviceSetting;
        if (deviceSetting8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
        } else {
            deviceSetting = deviceSetting8;
        }
        commandHandle.executeReqCmd(com.oudmon.ble.base.communication.req.TimeFormatReq.getWriteInstance(z, (byte) deviceSetting.getMetricUnit()), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$$ExternalSyntheticLambda8
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.m615syncDeviceSetting$lambda7$lambda6((com.oudmon.ble.base.communication.rsp.TimeFormatRsp) baseRspCmd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncDeviceSetting$lambda-8, reason: not valid java name */
    public static final void m616syncDeviceSetting$lambda8(com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit deviceCmdInit, final com.oudmon.ble.base.communication.rsp.TargetSettingRsp targetSettingRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCmdInit, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, targetSettingRsp);
        if (targetSettingRsp.getAction() == 1) {
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(deviceCmdInit, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$syncDeviceSetting$5$1
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit deviceCmdInit2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCmdInit2, "$this$ktxRunOnBgSingle");
                    if (com.oudmon.ble.base.communication.rsp.TargetSettingRsp.this.getStep() > 0) {
                        com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.INSTANCE.getGetInstance().insertTarget(new com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.oudmon.ble.base.communication.rsp.TargetSettingRsp.this.getStep(), com.oudmon.ble.base.communication.rsp.TargetSettingRsp.this.getCalorie() / 1000.0f, com.oudmon.ble.base.communication.rsp.TargetSettingRsp.this.getDistance() / 1000.0f, 3.0f, 8.0f));
                        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.DeviceNotifyTypeEvent(16));
                    }
                }
            });
        }
    }

    public final void saveDeviceSetting(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSetting, "deviceSetting");
        com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.INSTANCE.getGetInstance().saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(deviceSetting)));
    }

    /* compiled from: DeviceCmdInit.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/watch/DeviceCmdInit$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/watch/DeviceCmdInit;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/watch/DeviceCmdInit;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit) com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit.getInstance$delegate.getValue();
        }
    }
}
