package com.qcwireless.qcwatch.ui.device.more;

/* compiled from: MoreSettingViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/more/MoreSettingViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "deviceSettingRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;)V", "_uiDeviceState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "_uiState", "Lcom/qcwireless/qcwatch/ui/device/more/MoreSettingViewModel$MoreUI;", "max", "", "getMax", "()I", "setMax", "(I)V", "uiDeviceState", "Landroidx/lifecycle/LiveData;", "getUiDeviceState", "()Landroidx/lifecycle/LiveData;", "uiState", "getUiState", "cleanContact", "", "cleanData", "initData", "mac", "", "saveReminder", "setting", "MoreUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MoreSettingViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> _uiDeviceState;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel.MoreUI> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
    private int max;

    public MoreSettingViewModel(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingRepository, "deviceSettingRepository");
        this.deviceSettingRepository = deviceSettingRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._uiDeviceState = new androidx.lifecycle.MutableLiveData<>();
        this.max = 10;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel.MoreUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> getUiDeviceState() {
        return this._uiDeviceState;
    }

    public final int getMax() {
        return this.max;
    }

    public final void setMax(int i) {
        this.max = i;
    }

    public final void cleanContact() {
        launchOnUI(new com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel$cleanContact$1(this, null));
    }

    public final void cleanData() {
        launchOnUI(new com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel$cleanData$1(null));
    }

    public final void initData(java.lang.String mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        launchOnUI(new com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel$initData$1(this, mac, null));
    }

    public final void saveReminder(final java.lang.String mac, final com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel$saveReminder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel moreSettingViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moreSettingViewModel, "$this$ktxRunOnBgSingle");
                deviceSettingRepository = moreSettingViewModel.deviceSettingRepository;
                deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(mac, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
            }
        });
    }

    /* compiled from: MoreSettingViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/more/MoreSettingViewModel$MoreUI;", "", "screenSeconds", "", "totalNeedle", "currNeedle", "(III)V", "getCurrNeedle", "()I", "setCurrNeedle", "(I)V", "getScreenSeconds", "getTotalNeedle", "setTotalNeedle", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class MoreUI {
        private int currNeedle;
        private final int screenSeconds;
        private int totalNeedle;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel.MoreUI copy$default(com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel.MoreUI moreUI, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = moreUI.screenSeconds;
            }
            if ((i4 & 2) != 0) {
                i2 = moreUI.totalNeedle;
            }
            if ((i4 & 4) != 0) {
                i3 = moreUI.currNeedle;
            }
            return moreUI.copy(i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getScreenSeconds() {
            return this.screenSeconds;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTotalNeedle() {
            return this.totalNeedle;
        }

        /* renamed from: component3, reason: from getter */
        public final int getCurrNeedle() {
            return this.currNeedle;
        }

        public final com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel.MoreUI copy(int screenSeconds, int totalNeedle, int currNeedle) {
            return new com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel.MoreUI(screenSeconds, totalNeedle, currNeedle);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel.MoreUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel.MoreUI moreUI = (com.qcwireless.qcwatch.ui.device.more.MoreSettingViewModel.MoreUI) other;
            return this.screenSeconds == moreUI.screenSeconds && this.totalNeedle == moreUI.totalNeedle && this.currNeedle == moreUI.currNeedle;
        }

        public int hashCode() {
            return (((this.screenSeconds * 31) + this.totalNeedle) * 31) + this.currNeedle;
        }

        public java.lang.String toString() {
            return "MoreUI(screenSeconds=" + this.screenSeconds + ", totalNeedle=" + this.totalNeedle + ", currNeedle=" + this.currNeedle + ')';
        }

        public MoreUI(int i, int i2, int i3) {
            this.screenSeconds = i;
            this.totalNeedle = i2;
            this.currNeedle = i3;
        }

        public final int getScreenSeconds() {
            return this.screenSeconds;
        }

        public final int getTotalNeedle() {
            return this.totalNeedle;
        }

        public final void setTotalNeedle(int i) {
            this.totalNeedle = i;
        }

        public final int getCurrNeedle() {
            return this.currNeedle;
        }

        public final void setCurrNeedle(int i) {
            this.currNeedle = i;
        }
    }
}
