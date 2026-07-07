package com.qcwireless.qcwatch.ui.mine.ucenter;

/* compiled from: FirstProfileViewModel.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J&\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u000eJ\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/ucenter/FirstProfileViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "userProfileRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/UserProfileRepository;", "deviceSettingRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/mine/UserProfileRepository;Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;)V", "userEntity", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/UserEntity;", "getUserEntity", "()Lcom/qcwireless/qcwatch/ui/base/repository/entity/UserEntity;", "setUserEntity", "(Lcom/qcwireless/qcwatch/ui/base/repository/entity/UserEntity;)V", "execUnit", "", "setting", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "execUserInfoToDevice", "boy", "", "age", "height", "weight", "initNotLoginUserEntity", "saveUserEntity", "entity", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class FirstProfileViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
    public com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity;
    private final com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;

    public FirstProfileViewModel(com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository, com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileRepository, "userProfileRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingRepository, "deviceSettingRepository");
        this.userProfileRepository = userProfileRepository;
        this.deviceSettingRepository = deviceSettingRepository;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity getUserEntity() {
        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = this.userEntity;
        if (userEntity != null) {
            return userEntity;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
        return null;
    }

    public final void setUserEntity(com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEntity, "<set-?>");
        this.userEntity = userEntity;
    }

    public final void saveUserEntity(final com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel$saveUserEntity$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel firstProfileViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstProfileViewModel, "$this$ktxRunOnBgSingle");
                userProfileRepository = firstProfileViewModel.userProfileRepository;
                userProfileRepository.insertUser(com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity.this);
            }
        });
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel$saveUserEntity$2(this, entity, null), 3, (java.lang.Object) null);
    }

    public final void execUserInfoToDevice(int boy, int age, int height, int weight) {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileViewModel$execUserInfoToDevice$1(boy, age, height, weight, null), 3, (java.lang.Object) null);
    }

    public final void execUnit(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.TimeFormatReq.getWriteInstance(setting.getTimeFormat() == 0, (byte) setting.getMetricUnit()), null);
        this.deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
    }

    public final void initNotLoginUserEntity() {
        long uid = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid();
        java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
        setUserEntity(new com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity(uid, "", "", 1, 70.0f, 140, 175.0f, "1995-01", "", "", 10000, 200.0f, 5.0f, 1.5f, 8.0f, y_m_d, 0));
    }
}
