package com.qcwireless.qcwatch.ui.home.onekey;

/* compiled from: OneKeyCheckViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u001e\u001f B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0015J\u0006\u0010\u001d\u001a\u00020\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00060\u0011R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/onekey/OneKeyCheckViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "oneKeyCheckRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/OneKeyCheckRepository;", "deviceSettingRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/OneKeyCheckRepository;Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;)V", "_lastState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/home/onekey/OneKeyCheckViewModel$OneKeyLastBean;", "_uiState", "Lcom/qcwireless/qcwatch/ui/home/onekey/OneKeyCheckViewModel$OneKeyUI;", "lastBean", "Landroidx/lifecycle/LiveData;", "getLastBean", "()Landroidx/lifecycle/LiveData;", "oneKeyCallback", "Lcom/qcwireless/qcwatch/ui/home/onekey/OneKeyCheckViewModel$OneKeyResp;", "uiState", "getUiState", "getLastOneKeyCheck", "", "mac", "", "querySupportItems", "saveLastOneKeyCheck", "oneKey", "Lcom/qcwireless/qcwatch/ui/home/healthy/bean/LastOneKeyBean;", "startOnKey", "stopOnKey", "OneKeyLastBean", "OneKeyResp", "OneKeyUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class OneKeyCheckViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean> _lastState;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyUI> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
    private final com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyResp oneKeyCallback;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository oneKeyCheckRepository;

    public OneKeyCheckViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.OneKeyCheckRepository oneKeyCheckRepository, com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneKeyCheckRepository, "oneKeyCheckRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingRepository, "deviceSettingRepository");
        this.oneKeyCheckRepository = oneKeyCheckRepository;
        this.deviceSettingRepository = deviceSettingRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._lastState = new androidx.lifecycle.MutableLiveData<>();
        this.oneKeyCallback = new com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyResp();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean> getLastBean() {
        return this._lastState;
    }

    public final void startOnKey() {
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StartHeartRateReq.getSimpleReq((byte) 5), this.oneKeyCallback);
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().addNotifyListener(105, this.oneKeyCallback);
    }

    public final void stopOnKey() {
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StopHeartRateReq.stopHealthCheck(), this.oneKeyCallback);
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().removeNotifyListener(105);
    }

    public final void getLastOneKeyCheck(java.lang.String mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        launchOnUI(new com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel$getLastOneKeyCheck$1(this, mac, null));
    }

    public final void querySupportItems() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel$querySupportItems$1(null), 3, (java.lang.Object) null);
    }

    public final void saveLastOneKeyCheck(com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean oneKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneKey, "oneKey");
        this.deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.LastOneKeyCheck, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(oneKey)));
    }

    /* compiled from: OneKeyCheckViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/onekey/OneKeyCheckViewModel$OneKeyResp;", "Lcom/oudmon/ble/base/communication/ICommandResponse;", "Lcom/oudmon/ble/base/communication/rsp/StartHeartRateRsp;", "(Lcom/qcwireless/qcwatch/ui/home/onekey/OneKeyCheckViewModel;)V", "onDataResponse", "", "resultEntity", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class OneKeyResp implements com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.StartHeartRateRsp> {
        public OneKeyResp() {
        }

        @Override // com.oudmon.ble.base.communication.ICommandResponse
        public void onDataResponse(com.oudmon.ble.base.communication.rsp.StartHeartRateRsp resultEntity) {
            if (resultEntity != null) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, resultEntity);
                com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.this._uiState.postValue(new com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyUI(resultEntity.getErrCode(), resultEntity));
            }
        }
    }

    /* compiled from: OneKeyCheckViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/onekey/OneKeyCheckViewModel$OneKeyUI;", "", "error", "", "resp", "Lcom/oudmon/ble/base/communication/rsp/StartHeartRateRsp;", "(ILcom/oudmon/ble/base/communication/rsp/StartHeartRateRsp;)V", "getError", "()I", "getResp", "()Lcom/oudmon/ble/base/communication/rsp/StartHeartRateRsp;", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class OneKeyUI {
        private final int error;
        private final com.oudmon.ble.base.communication.rsp.StartHeartRateRsp resp;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyUI copy$default(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyUI oneKeyUI, int i, com.oudmon.ble.base.communication.rsp.StartHeartRateRsp startHeartRateRsp, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = oneKeyUI.error;
            }
            if ((i2 & 2) != 0) {
                startHeartRateRsp = oneKeyUI.resp;
            }
            return oneKeyUI.copy(i, startHeartRateRsp);
        }

        /* renamed from: component1, reason: from getter */
        public final int getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final com.oudmon.ble.base.communication.rsp.StartHeartRateRsp getResp() {
            return this.resp;
        }

        public final com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyUI copy(int error, com.oudmon.ble.base.communication.rsp.StartHeartRateRsp resp) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resp, "resp");
            return new com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyUI(error, resp);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyUI oneKeyUI = (com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyUI) other;
            return this.error == oneKeyUI.error && kotlin.jvm.internal.Intrinsics.areEqual(this.resp, oneKeyUI.resp);
        }

        public int hashCode() {
            return (this.error * 31) + this.resp.hashCode();
        }

        public java.lang.String toString() {
            return "OneKeyUI(error=" + this.error + ", resp=" + this.resp + ')';
        }

        public OneKeyUI(int i, com.oudmon.ble.base.communication.rsp.StartHeartRateRsp startHeartRateRsp) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startHeartRateRsp, "resp");
            this.error = i;
            this.resp = startHeartRateRsp;
        }

        public final int getError() {
            return this.error;
        }

        public final com.oudmon.ble.base.communication.rsp.StartHeartRateRsp getResp() {
            return this.resp;
        }
    }

    /* compiled from: OneKeyCheckViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/onekey/OneKeyCheckViewModel$OneKeyLastBean;", "", "last", "Lcom/qcwireless/qcwatch/ui/home/healthy/bean/LastOneKeyBean;", "(Lcom/qcwireless/qcwatch/ui/home/healthy/bean/LastOneKeyBean;)V", "getLast", "()Lcom/qcwireless/qcwatch/ui/home/healthy/bean/LastOneKeyBean;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class OneKeyLastBean {
        private final com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean last;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean copy$default(com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean oneKeyLastBean, com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean lastOneKeyBean, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                lastOneKeyBean = oneKeyLastBean.last;
            }
            return oneKeyLastBean.copy(lastOneKeyBean);
        }

        /* renamed from: component1, reason: from getter */
        public final com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean getLast() {
            return this.last;
        }

        public final com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean copy(com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean last) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(last, "last");
            return new com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean(last);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean) && kotlin.jvm.internal.Intrinsics.areEqual(this.last, ((com.qcwireless.qcwatch.ui.home.onekey.OneKeyCheckViewModel.OneKeyLastBean) other).last);
        }

        public int hashCode() {
            return this.last.hashCode();
        }

        public java.lang.String toString() {
            return "OneKeyLastBean(last=" + this.last + ')';
        }

        public OneKeyLastBean(com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean lastOneKeyBean) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastOneKeyBean, "last");
            this.last = lastOneKeyBean;
        }

        public final com.qcwireless.qcwatch.ui.home.healthy.bean.LastOneKeyBean getLast() {
            return this.last;
        }
    }
}
