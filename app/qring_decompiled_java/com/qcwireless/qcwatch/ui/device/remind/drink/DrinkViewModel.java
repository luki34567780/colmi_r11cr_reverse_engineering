package com.qcwireless.qcwatch.ui.device.remind.drink;

/* compiled from: DrinkViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007J\u0016\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/remind/drink/DrinkViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "deviceSettingRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "uiStatue", "Landroidx/lifecycle/LiveData;", "getUiStatue", "()Landroidx/lifecycle/LiveData;", "weekList", "", "Lcom/qcwireless/qcwatch/base/dialog/bean/WeekRepeat;", "getWeekList", "()Ljava/util/List;", "getDrinkSetting", "", "mac", "", "saveDrinkSetting", "setting", "saveDrinkSettingNotExecCmd", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DrinkViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
    private final java.util.List<com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat> weekList;

    public DrinkViewModel(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingRepository, "deviceSettingRepository");
        this.deviceSettingRepository = deviceSettingRepository;
        this.weekList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<com.qcwireless.qcwatch.base.dialog.bean.WeekRepeat> getWeekList() {
        return this.weekList;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> getUiStatue() {
        return this._uiState;
    }

    public final void getDrinkSetting(java.lang.String mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        launchOnUI(new com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel$getDrinkSetting$1(this, mac, null));
    }

    public final void saveDrinkSettingNotExecCmd(java.lang.String mac, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        launchOnUI(new com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel$saveDrinkSettingNotExecCmd$1(this, setting, null));
    }

    public final void saveDrinkSetting(java.lang.String mac, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        launchOnUI(new com.qcwireless.qcwatch.ui.device.remind.drink.DrinkViewModel$saveDrinkSetting$1(setting, this, mac, null));
    }
}
