package com.qcwireless.qcwatch.ui.device.disturb;

/* compiled from: DisturbViewModel.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/disturb/DisturbViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "deviceSettingRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/device/disturb/DisturbViewModel$DisturbUI;", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "getDisturbSwitch", "", "mac", "", "saveDisturbSwitch", "disturb", "DisturbUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DisturbViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;

    public DisturbViewModel(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingRepository, "deviceSettingRepository");
        this.deviceSettingRepository = deviceSettingRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI> getUiState() {
        return this._uiState;
    }

    public final void getDisturbSwitch(java.lang.String mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        launchOnUI(new com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel$getDisturbSwitch$1(this, mac, null));
    }

    public final void saveDisturbSwitch(java.lang.String mac, com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI disturb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disturb, "disturb");
        launchOnUI(new com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel$saveDisturbSwitch$1(this, mac, disturb, null));
    }

    /* compiled from: DisturbViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/disturb/DisturbViewModel$DisturbUI;", "", "switch", "", "start", "", "end", "manualSwitch", "(ZIIZ)V", "getEnd", "()I", "setEnd", "(I)V", "getManualSwitch", "()Z", "setManualSwitch", "(Z)V", "getStart", "setStart", "getSwitch", "setSwitch", "component1", "component2", "component3", "component4", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class DisturbUI {
        private int end;
        private boolean manualSwitch;
        private int start;
        private boolean switch;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI copy$default(com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI disturbUI, boolean z, int i, int i2, boolean z2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                z = disturbUI.switch;
            }
            if ((i3 & 2) != 0) {
                i = disturbUI.start;
            }
            if ((i3 & 4) != 0) {
                i2 = disturbUI.end;
            }
            if ((i3 & 8) != 0) {
                z2 = disturbUI.manualSwitch;
            }
            return disturbUI.copy(z, i, i2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSwitch() {
            return this.switch;
        }

        /* renamed from: component2, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* renamed from: component3, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getManualSwitch() {
            return this.manualSwitch;
        }

        public final com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI copy(boolean r2, int start, int end, boolean manualSwitch) {
            return new com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI(r2, start, end, manualSwitch);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI disturbUI = (com.qcwireless.qcwatch.ui.device.disturb.DisturbViewModel.DisturbUI) other;
            return this.switch == disturbUI.switch && this.start == disturbUI.start && this.end == disturbUI.end && this.manualSwitch == disturbUI.manualSwitch;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public int hashCode() {
            boolean z = this.switch;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = ((((r0 * 31) + this.start) * 31) + this.end) * 31;
            boolean z2 = this.manualSwitch;
            return i + (z2 ? 1 : z2 ? 1 : 0);
        }

        public java.lang.String toString() {
            return "DisturbUI(switch=" + this.switch + ", start=" + this.start + ", end=" + this.end + ", manualSwitch=" + this.manualSwitch + ')';
        }

        public DisturbUI(boolean z, int i, int i2, boolean z2) {
            this.switch = z;
            this.start = i;
            this.end = i2;
            this.manualSwitch = z2;
        }

        public final boolean getSwitch() {
            return this.switch;
        }

        public final void setSwitch(boolean z) {
            this.switch = z;
        }

        public final int getStart() {
            return this.start;
        }

        public final void setStart(int i) {
            this.start = i;
        }

        public final int getEnd() {
            return this.end;
        }

        public final void setEnd(int i) {
            this.end = i;
        }

        public final boolean getManualSwitch() {
            return this.manualSwitch;
        }

        public final void setManualSwitch(boolean z) {
            this.manualSwitch = z;
        }
    }
}
