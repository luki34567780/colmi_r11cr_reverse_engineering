package com.qcwireless.qcwatch.ui.mine.ucenter;

/* compiled from: UserProfileViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002WXB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u0016H\u0002J\u000e\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0016J\u000e\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020\u000bJ\u0016\u0010<\u001a\u00020:2\u0006\u0010>\u001a\u00020#2\u0006\u0010=\u001a\u00020\u000bJ.\u0010?\u001a\u00020:2\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020#2\u0006\u0010B\u001a\u00020#2\u0006\u0010C\u001a\u00020#2\u0006\u0010D\u001a\u00020#J&\u0010?\u001a\u00020:2\u0006\u0010A\u001a\u00020#2\u0006\u0010B\u001a\u00020#2\u0006\u0010C\u001a\u00020#2\u0006\u0010D\u001a\u00020#J\u000e\u0010E\u001a\u00020:2\u0006\u0010F\u001a\u00020\u0016J\u0006\u0010G\u001a\u00020:J\u000e\u0010G\u001a\u00020:2\u0006\u0010H\u001a\u00020\u000bJ\u0006\u0010I\u001a\u00020:J\u000e\u0010J\u001a\u00020:2\u0006\u0010K\u001a\u00020LJ\u0006\u0010M\u001a\u00020:J\u0006\u0010N\u001a\u00020:J\u0016\u0010O\u001a\u00020:2\u0006\u0010F\u001a\u00020\u00162\u0006\u0010=\u001a\u00020\u000bJ\u000e\u0010P\u001a\u00020:2\u0006\u0010Q\u001a\u00020RJ\u000e\u0010S\u001a\u00020:2\u0006\u0010T\u001a\u00020UJ\u000e\u0010V\u001a\u00020:2\u0006\u0010Q\u001a\u00020RR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R\u000e\u0010\"\u001a\u00020#X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0+8F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\r0+8F¢\u0006\u0006\u001a\u0004\b1\u0010-R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0012\"\u0004\b4\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/ucenter/UserProfileViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "userProfileRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/UserProfileRepository;", "deviceSettingRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/mine/UserProfileRepository;Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;)V", "_picUiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/mine/ucenter/UserProfileViewModel$DevicePictureUI;", "_uiDeviceSettingState", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "_uiState", "Lcom/qcwireless/qcwatch/ui/mine/ucenter/UserProfileViewModel$ProfileUI;", "genderList", "", "Lcom/qcwireless/qcwatch/base/dialog/bean/ListDataBean;", "getGenderList", "()Ljava/util/List;", "setGenderList", "(Ljava/util/List;)V", "iHeightList", "", "getIHeightList", "setIHeightList", "iWeightList", "getIWeightList", "setIWeightList", "mHeightList", "getMHeightList", "setMHeightList", "mWeightList", "getMWeightList", "setMWeightList", "maxHeightImperial", "", "minHeightImperial", "noLoginId", "getNoLoginId", "()I", "setNoLoginId", "(I)V", "picUiState", "Landroidx/lifecycle/LiveData;", "getPicUiState", "()Landroidx/lifecycle/LiveData;", "uiDeviceSettingState", "getUiDeviceSettingState", "uiState", "getUiState", "unitList", "getUnitList", "setUnitList", "createGlideTask", "Lcom/liulishuo/okdownload/DownloadTask;", "url", "fileName", "devicePicture", "", "hardwareVersion", "execUnit", "setting", "type", "execUserInfoToDevice", "deviceSetting", "boy", "age", "height", "weight", "initData", "mac", "initDialogData", "it", "logOff", "queryUserByUid", "uid", "", "queryUserByUidUI", "queryUserByUidUILoginSuccess", "saveDeviceSetting", "saveUserEntity", "entity", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/UserEntity;", "upPhotoImage", "file", "Ljava/io/File;", "updateUserProfile", "DevicePictureUI", "ProfileUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class UserProfileViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.DevicePictureUI> _picUiState;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> _uiDeviceSettingState;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
    private java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> genderList;
    private java.util.List<java.lang.String> iHeightList;
    private java.util.List<java.lang.String> iWeightList;
    private java.util.List<java.lang.String> mHeightList;
    private java.util.List<java.lang.String> mWeightList;
    private final int maxHeightImperial;
    private final int minHeightImperial;
    private int noLoginId;
    private java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> unitList;
    private final com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: execUnit$lambda-0, reason: not valid java name */
    public static final void m1359execUnit$lambda0(com.oudmon.ble.base.communication.rsp.TimeFormatRsp timeFormatRsp) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: execUnit$lambda-2, reason: not valid java name */
    public static final void m1360execUnit$lambda2(com.oudmon.ble.base.communication.rsp.TimeFormatRsp timeFormatRsp) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: execUserInfoToDevice$lambda-1, reason: not valid java name */
    public static final void m1361execUserInfoToDevice$lambda1(com.oudmon.ble.base.communication.rsp.TimeFormatRsp timeFormatRsp) {
    }

    public UserProfileViewModel(com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository, com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileRepository, "userProfileRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingRepository, "deviceSettingRepository");
        this.userProfileRepository = userProfileRepository;
        this.deviceSettingRepository = deviceSettingRepository;
        this.minHeightImperial = 13;
        this.maxHeightImperial = 100;
        this.iHeightList = new java.util.ArrayList();
        this.mHeightList = new java.util.ArrayList();
        this.mWeightList = new java.util.ArrayList();
        this.iWeightList = new java.util.ArrayList();
        this.genderList = new java.util.ArrayList();
        this.noLoginId = 968888;
        this.unitList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._uiDeviceSettingState = new androidx.lifecycle.MutableLiveData<>();
        this._picUiState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<java.lang.String> getIHeightList() {
        return this.iHeightList;
    }

    public final void setIHeightList(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.iHeightList = list;
    }

    public final java.util.List<java.lang.String> getMHeightList() {
        return this.mHeightList;
    }

    public final void setMHeightList(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mHeightList = list;
    }

    public final java.util.List<java.lang.String> getMWeightList() {
        return this.mWeightList;
    }

    public final void setMWeightList(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mWeightList = list;
    }

    public final java.util.List<java.lang.String> getIWeightList() {
        return this.iWeightList;
    }

    public final void setIWeightList(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.iWeightList = list;
    }

    public final java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> getGenderList() {
        return this.genderList;
    }

    public final void setGenderList(java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.genderList = list;
    }

    public final int getNoLoginId() {
        return this.noLoginId;
    }

    public final void setNoLoginId(int i) {
        this.noLoginId = i;
    }

    public final java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> getUnitList() {
        return this.unitList;
    }

    public final void setUnitList(java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.unitList = list;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> getUiDeviceSettingState() {
        return this._uiDeviceSettingState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.DevicePictureUI> getPicUiState() {
        return this._picUiState;
    }

    public final void initData(java.lang.String mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, mac);
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$initData$1(this, mac, null), 3, (java.lang.Object) null);
    }

    public final void execUnit(int type, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.TimeFormatReq.getWriteInstance(setting.getTimeFormat() == 0, (byte) setting.getMetricUnit()), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.m1359execUnit$lambda0((com.oudmon.ble.base.communication.rsp.TimeFormatRsp) baseRspCmd);
            }
        });
        this.deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
    }

    public final void initDialogData() {
        int i = 33;
        while (true) {
            int i2 = i + 1;
            this.mHeightList.add(java.lang.String.valueOf(i));
            if (i2 > 255) {
                break;
            } else {
                i = i2;
            }
        }
        int i3 = this.minHeightImperial;
        int i4 = this.maxHeightImperial;
        if (i3 <= i4) {
            while (true) {
                java.util.List<java.lang.String> list = this.iHeightList;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String format = java.lang.String.format("%d'%d''", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i3 / 12), java.lang.Integer.valueOf(i3 % 12)}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                list.add(format);
                if (i3 == i4) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        int i5 = 30;
        while (true) {
            int i6 = i5 + 1;
            this.mWeightList.add(java.lang.String.valueOf(i5));
            if (i6 > 255) {
                break;
            } else {
                i5 = i6;
            }
        }
        int i7 = 60;
        while (true) {
            int i8 = i7 + 1;
            this.iWeightList.add(java.lang.String.valueOf(i7));
            if (i8 > 562) {
                return;
            } else {
                i7 = i8;
            }
        }
    }

    public final void initDialogData(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this.unitList.clear();
        if (it.getMetricUnit() == 0) {
            this.unitList.add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_35), true));
            this.unitList.add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_36), false));
        } else {
            this.unitList.add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_35), false));
            this.unitList.add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_36), true));
        }
    }

    public final void saveDeviceSetting(java.lang.String mac, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        this.deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(mac, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
    }

    public final void queryUserByUid(final long uid) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$queryUserByUid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel userProfileViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                androidx.lifecycle.MutableLiveData mutableLiveData2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileViewModel, "$this$ktxRunOnBgSingle");
                userProfileRepository = userProfileViewModel.userProfileRepository;
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity queryUserByUid = userProfileRepository.queryUserByUid(uid);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, queryUserByUid);
                if (queryUserByUid != null) {
                    mutableLiveData2 = userProfileViewModel._uiState;
                    mutableLiveData2.postValue(new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI(queryUserByUid.getNickName(), queryUserByUid.getGender(), queryUserByUid.getBirthday(), (int) queryUserByUid.getHeight(), (int) queryUserByUid.getWeight(), queryUserByUid.getWeightLbs(), queryUserByUid));
                    return;
                }
                long j = uid;
                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity(j, "", "", 1, 60.0f, 120, 175.0f, "1995-01", "", "", 10000, 200.0f, 5.0f, 1.5f, 8.0f, y_m_d, 0);
                mutableLiveData = userProfileViewModel._uiState;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI(userEntity.getNickName(), userEntity.getGender(), userEntity.getBirthday(), (int) userEntity.getHeight(), (int) userEntity.getWeight(), userEntity.getWeightLbs(), userEntity));
            }
        });
    }

    public final void devicePicture(java.lang.String hardwareVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$devicePicture$1(this, hardwareVersion, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.liulishuo.okdownload.DownloadTask createGlideTask(java.lang.String url, java.lang.String fileName) {
        com.liulishuo.okdownload.DownloadTask build = new com.liulishuo.okdownload.DownloadTask.Builder(url, com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getGuideDirFile()).setFilename(fileName).setMinIntervalMillisCallbackProcess(64).setPassIfAlreadyCompleted(false).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "Builder(url, parentFile)…lse)\n            .build()");
        return build;
    }

    public final void queryUserByUidUI() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$queryUserByUidUI$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel userProfileViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                androidx.lifecycle.MutableLiveData mutableLiveData2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileViewModel, "$this$ktxRunOnBgSingle");
                userProfileRepository = userProfileViewModel.userProfileRepository;
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity queryUserByUid = userProfileRepository.queryUserByUid(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid());
                if (queryUserByUid != null) {
                    mutableLiveData2 = userProfileViewModel._uiState;
                    mutableLiveData2.postValue(new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI(queryUserByUid.getNickName(), queryUserByUid.getGender(), queryUserByUid.getBirthday(), (int) queryUserByUid.getHeight(), (int) queryUserByUid.getWeight(), queryUserByUid.getWeightLbs(), queryUserByUid));
                    return;
                }
                long uid = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid();
                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity(uid, "", "", 1, 60.0f, 120, 175.0f, "1995-01", "", "", 10000, 200.0f, 5.0f, 1.5f, 8.0f, y_m_d, 0);
                mutableLiveData = userProfileViewModel._uiState;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI(userEntity.getNickName(), userEntity.getGender(), userEntity.getBirthday(), (int) userEntity.getHeight(), (int) userEntity.getWeight(), userEntity.getWeightLbs(), userEntity));
            }
        });
    }

    public final void queryUserByUidUILoginSuccess() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$queryUserByUidUILoginSuccess$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel userProfileViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileViewModel, "$this$ktxRunOnBgSingle");
                userProfileRepository = userProfileViewModel.userProfileRepository;
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity queryUserByUid = userProfileRepository.queryUserByUid(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid());
                if (queryUserByUid != null) {
                    int ageByBirthday = com.qcwireless.qc_utils.date.DateUtil.getAgeByBirthday(com.qcwireless.qc_utils.date.DateUtil.String2Date("yyyy-MM-dd", queryUserByUid.getBirthday() + "-01"));
                    if (queryUserByUid.getNickName().length() > 0) {
                        com.oudmon.ble.base.communication.LargeDataHandler.getInstance().setDeviceNickName(queryUserByUid.getNickName());
                    }
                    userProfileViewModel.execUserInfoToDevice(queryUserByUid.getGender() - 1, ageByBirthday, (int) queryUserByUid.getHeight(), (int) queryUserByUid.getWeight());
                    return;
                }
                com.oudmon.ble.base.communication.LargeDataHandler.getInstance().setDeviceNickName("");
                userProfileViewModel.execUserInfoToDevice(0, 26, 175, 60);
            }
        });
    }

    public final void execUserInfoToDevice(int boy, int age, int height, int weight) {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$execUserInfoToDevice$1(boy, age, height, weight, null), 3, (java.lang.Object) null);
    }

    public final void saveUserEntity(final com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$saveUserEntity$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel userProfileViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileViewModel, "$this$ktxRunOnBgSingle");
                userProfileRepository = userProfileViewModel.userProfileRepository;
                userProfileRepository.insertUser(com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity.this);
            }
        });
    }

    public final void updateUserProfile(com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$updateUserProfile$1(this, entity, null), 3, (java.lang.Object) null);
    }

    public final void upPhotoImage(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$upPhotoImage$1(this, file, null), 3, (java.lang.Object) null);
    }

    public final void execUserInfoToDevice(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, int boy, int age, int height, int weight) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSetting, "deviceSetting");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.TimeFormatReq.getWriteInstance(deviceSetting.getTimeFormat() == 0, deviceSetting.getMetricUnit(), boy, age, height, weight, 120, 90, 160), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$$ExternalSyntheticLambda2
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.m1361execUserInfoToDevice$lambda1((com.oudmon.ble.base.communication.rsp.TimeFormatRsp) baseRspCmd);
            }
        });
    }

    public final void execUnit(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.TimeFormatReq.getWriteInstance(setting.getTimeFormat() == 0, (byte) setting.getMetricUnit()), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$$ExternalSyntheticLambda1
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.m1360execUnit$lambda2((com.oudmon.ble.base.communication.rsp.TimeFormatRsp) baseRspCmd);
            }
        });
        this.deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
    }

    public final void logOff() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel$logOff$1(this, null), 3, (java.lang.Object) null);
    }

    /* compiled from: UserProfileViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/ucenter/UserProfileViewModel$DevicePictureUI;", "", "url", "", "localUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getLocalUrl", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class DevicePictureUI {
        private final java.lang.String localUrl;
        private final java.lang.String url;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.DevicePictureUI copy$default(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.DevicePictureUI devicePictureUI, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = devicePictureUI.url;
            }
            if ((i & 2) != 0) {
                str2 = devicePictureUI.localUrl;
            }
            return devicePictureUI.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLocalUrl() {
            return this.localUrl;
        }

        public final com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.DevicePictureUI copy(java.lang.String url, java.lang.String localUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localUrl, "localUrl");
            return new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.DevicePictureUI(url, localUrl);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.DevicePictureUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.DevicePictureUI devicePictureUI = (com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.DevicePictureUI) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, devicePictureUI.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.localUrl, devicePictureUI.localUrl);
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + this.localUrl.hashCode();
        }

        public java.lang.String toString() {
            return "DevicePictureUI(url=" + this.url + ", localUrl=" + this.localUrl + ')';
        }

        public DevicePictureUI(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "localUrl");
            this.url = str;
            this.localUrl = str2;
        }

        public final java.lang.String getLocalUrl() {
            return this.localUrl;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }
    }

    /* compiled from: UserProfileViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006$"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/ucenter/UserProfileViewModel$ProfileUI;", "", "nick", "", "gender", "", "birthday", "height", "weight", "weightLbs", "entity", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/UserEntity;", "(Ljava/lang/String;ILjava/lang/String;IIILcom/qcwireless/qcwatch/ui/base/repository/entity/UserEntity;)V", "getBirthday", "()Ljava/lang/String;", "getEntity", "()Lcom/qcwireless/qcwatch/ui/base/repository/entity/UserEntity;", "getGender", "()I", "getHeight", "getNick", "getWeight", "getWeightLbs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class ProfileUI {
        private final java.lang.String birthday;
        private final com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity entity;
        private final int gender;
        private final int height;
        private final java.lang.String nick;
        private final int weight;
        private final int weightLbs;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI copy$default(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI profileUI, java.lang.String str, int i, java.lang.String str2, int i2, int i3, int i4, com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity, int i5, java.lang.Object obj) {
            if ((i5 & 1) != 0) {
                str = profileUI.nick;
            }
            if ((i5 & 2) != 0) {
                i = profileUI.gender;
            }
            int i6 = i;
            if ((i5 & 4) != 0) {
                str2 = profileUI.birthday;
            }
            java.lang.String str3 = str2;
            if ((i5 & 8) != 0) {
                i2 = profileUI.height;
            }
            int i7 = i2;
            if ((i5 & 16) != 0) {
                i3 = profileUI.weight;
            }
            int i8 = i3;
            if ((i5 & 32) != 0) {
                i4 = profileUI.weightLbs;
            }
            int i9 = i4;
            if ((i5 & 64) != 0) {
                userEntity = profileUI.entity;
            }
            return profileUI.copy(str, i6, str3, i7, i8, i9, userEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNick() {
            return this.nick;
        }

        /* renamed from: component2, reason: from getter */
        public final int getGender() {
            return this.gender;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBirthday() {
            return this.birthday;
        }

        /* renamed from: component4, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* renamed from: component5, reason: from getter */
        public final int getWeight() {
            return this.weight;
        }

        /* renamed from: component6, reason: from getter */
        public final int getWeightLbs() {
            return this.weightLbs;
        }

        /* renamed from: component7, reason: from getter */
        public final com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity getEntity() {
            return this.entity;
        }

        public final com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI copy(java.lang.String nick, int gender, java.lang.String birthday, int height, int weight, int weightLbs, com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity entity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nick, "nick");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(birthday, "birthday");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
            return new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI(nick, gender, birthday, height, weight, weightLbs, entity);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI profileUI = (com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.nick, profileUI.nick) && this.gender == profileUI.gender && kotlin.jvm.internal.Intrinsics.areEqual(this.birthday, profileUI.birthday) && this.height == profileUI.height && this.weight == profileUI.weight && this.weightLbs == profileUI.weightLbs && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, profileUI.entity);
        }

        public int hashCode() {
            return (((((((((((this.nick.hashCode() * 31) + this.gender) * 31) + this.birthday.hashCode()) * 31) + this.height) * 31) + this.weight) * 31) + this.weightLbs) * 31) + this.entity.hashCode();
        }

        public java.lang.String toString() {
            return "ProfileUI(nick=" + this.nick + ", gender=" + this.gender + ", birthday=" + this.birthday + ", height=" + this.height + ", weight=" + this.weight + ", weightLbs=" + this.weightLbs + ", entity=" + this.entity + ')';
        }

        public ProfileUI(java.lang.String str, int i, java.lang.String str2, int i2, int i3, int i4, com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "nick");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "birthday");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEntity, "entity");
            this.nick = str;
            this.gender = i;
            this.birthday = str2;
            this.height = i2;
            this.weight = i3;
            this.weightLbs = i4;
            this.entity = userEntity;
        }

        public final java.lang.String getNick() {
            return this.nick;
        }

        public final int getGender() {
            return this.gender;
        }

        public final java.lang.String getBirthday() {
            return this.birthday;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWeight() {
            return this.weight;
        }

        public final int getWeightLbs() {
            return this.weightLbs;
        }

        public final com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity getEntity() {
            return this.entity;
        }
    }
}
