package com.qcwireless.qcwatch.ui.device.heart;

/* compiled from: HeartDetectionViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/heart/HeartDetectionViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "deviceSettingRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/device/heart/HeartDetectionViewModel$HeartDetectionUI;", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "getHeartDetectionSwitch", "", "mac", "", "saveHeartDetectionSwitch", "switch", "", "HeartDetectionUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class HeartDetectionViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.heart.HeartDetectionViewModel.HeartDetectionUI> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;

    public HeartDetectionViewModel(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingRepository, "deviceSettingRepository");
        this.deviceSettingRepository = deviceSettingRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.heart.HeartDetectionViewModel.HeartDetectionUI> getUiState() {
        return this._uiState;
    }

    public final void getHeartDetectionSwitch(java.lang.String mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        launchOnUI(new com.qcwireless.qcwatch.ui.device.heart.HeartDetectionViewModel$getHeartDetectionSwitch$1(this, mac, null));
    }

    public final void saveHeartDetectionSwitch(java.lang.String mac, boolean r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        launchOnUI(new com.qcwireless.qcwatch.ui.device.heart.HeartDetectionViewModel$saveHeartDetectionSwitch$1(this, mac, r4, null));
    }

    /* compiled from: HeartDetectionViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/heart/HeartDetectionViewModel$HeartDetectionUI;", "", "switch", "", "(Z)V", "getSwitch", "()Z", "component1", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class HeartDetectionUI {
        private final boolean switch;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.device.heart.HeartDetectionViewModel.HeartDetectionUI copy$default(com.qcwireless.qcwatch.ui.device.heart.HeartDetectionViewModel.HeartDetectionUI heartDetectionUI, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = heartDetectionUI.switch;
            }
            return heartDetectionUI.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSwitch() {
            return this.switch;
        }

        public final com.qcwireless.qcwatch.ui.device.heart.HeartDetectionViewModel.HeartDetectionUI copy(boolean r2) {
            return new com.qcwireless.qcwatch.ui.device.heart.HeartDetectionViewModel.HeartDetectionUI(r2);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.qcwireless.qcwatch.ui.device.heart.HeartDetectionViewModel.HeartDetectionUI) && this.switch == ((com.qcwireless.qcwatch.ui.device.heart.HeartDetectionViewModel.HeartDetectionUI) other).switch;
        }

        public int hashCode() {
            boolean z = this.switch;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public java.lang.String toString() {
            return "HeartDetectionUI(switch=" + this.switch + ')';
        }

        public HeartDetectionUI(boolean z) {
            this.switch = z;
        }

        public final boolean getSwitch() {
            return this.switch;
        }
    }
}
