package com.qcwireless.qcwatch.ui.base.watch;

/* compiled from: DeviceCmdInit.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$init$1$1", f = "DeviceCmdInit.kt", i = {}, l = {115, 116}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class DeviceCmdInit$init$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.oudmon.ble.base.communication.rsp.SetTimeRsp $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceCmdInit$init$1$1(com.oudmon.ble.base.communication.rsp.SetTimeRsp setTimeRsp, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$init$1$1> continuation) {
        super(2, continuation);
        this.$it = setTimeRsp;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$init$1$1(this.$it, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.$it.mMaxWatchFace > 0) {
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMaxWatchFace(this.$it.mMaxWatchFace);
            } else {
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMaxWatchFace(6);
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, this.$it);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMusicSupport(this.$it.mMusicSupport);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMaxContacts(this.$it.mMaxContacts);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setSupportContact(this.$it.mSupportContact);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setNewSleepProtocol(this.$it.mNewSleepProtocol);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setDeviceFunctionList(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.qcwireless.qcwatch.ui.base.bean.device.DeviceFunctionList(this.$it.mSupportManualHeart)));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setRtkMcuSupport(this.$it.rtkMcu);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setDeviceAvatarSupport(this.$it.mSupportAvatar);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setEbookSupport(this.$it.mEbookSupport);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setWechatSupport(this.$it.mSupportWeChat);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setBloodSugarSupport(this.$it.mSupportBloodSugar);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGpsSupport(this.$it.mSupportGPS);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLyricsSupport(this.$it.mSupportLyrics);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setAlbumSupport(this.$it.mSupportAlbum);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setJieLiMusic(this.$it.mSupportJieLiMusic);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().setRtkBindTag(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.$it.rtkMcu));
            this.label = 1;
            obj = com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository.INSTANCE.getGetInstance().getDeviceSupport(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), (kotlin.coroutines.Continuation) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        final com.oudmon.ble.base.communication.rsp.SetTimeRsp setTimeRsp = this.$it;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.watch.DeviceCmdInit$init$1$1.1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                if (map != null) {
                    com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setOneKeySupport(com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(new com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.oudmon.ble.base.communication.rsp.SetTimeRsp.this.mSupportBloodOxygen, com.oudmon.ble.base.communication.rsp.SetTimeRsp.this.mSupportBloodPressure, com.oudmon.ble.base.communication.rsp.SetTimeRsp.this.mSupportFeature, com.oudmon.ble.base.communication.rsp.SetTimeRsp.this.mSupportTemperature, com.oudmon.ble.base.communication.rsp.SetTimeRsp.this.mSupportManualHeart, com.oudmon.ble.base.communication.rsp.SetTimeRsp.this.mSupportECard, com.oudmon.ble.base.communication.rsp.SetTimeRsp.this.mSupportLocation)));
                    com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                    if (com.oudmon.ble.base.communication.rsp.SetTimeRsp.this.mSupportBloodOxygen && map.get(kotlin.coroutines.jvm.internal.Boxing.boxInt(4)) == null) {
                        map.put(kotlin.coroutines.jvm.internal.Boxing.boxInt(4), new com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getString(com.qcwireless.qcwatch.R.string.qc_text_87), true, 4, false, 8, null));
                    }
                    if (map.get(kotlin.coroutines.jvm.internal.Boxing.boxInt(11)) == null) {
                        map.put(kotlin.coroutines.jvm.internal.Boxing.boxInt(11), new com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getString(com.qcwireless.qcwatch.R.string.qc_text_6666561), true, 11, false, 8, null));
                    }
                    if (com.oudmon.ble.base.communication.rsp.SetTimeRsp.this.mSupportBloodSugar && map.get(kotlin.coroutines.jvm.internal.Boxing.boxInt(12)) == null) {
                        map.put(kotlin.coroutines.jvm.internal.Boxing.boxInt(12), new com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getString(com.qcwireless.qcwatch.R.string.qc_text_569), true, 12, false, 8, null));
                    }
                    com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository.INSTANCE.getGetInstance().saveDeviceSupport(map);
                }
                return kotlin.Unit.INSTANCE;
            }
        }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
