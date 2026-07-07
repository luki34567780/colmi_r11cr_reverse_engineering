package com.qcwireless.qcwatch.ui.device.bp;

/* compiled from: BloodPressureViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ&\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/bp/BloodPressureViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "deviceSettingRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/device/bp/BloodPressureViewModel$BpUI;", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "getBpSetting", "", "mac", "", "saveBpSetting", "switch", "", "start", "", "end", "BpUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BloodPressureViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel.BpUI> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;

    public BloodPressureViewModel(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingRepository, "deviceSettingRepository");
        this.deviceSettingRepository = deviceSettingRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel.BpUI> getUiState() {
        return this._uiState;
    }

    public final void getBpSetting(java.lang.String mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        launchOnUI(new com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel$getBpSetting$1(this, mac, null));
    }

    public final void saveBpSetting(java.lang.String mac, boolean r10, int start, int end) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        launchOnUI(new com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel$saveBpSetting$1(this, mac, r10, start, end, null));
    }

    /* compiled from: BloodPressureViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/bp/BloodPressureViewModel$BpUI;", "", "switch", "", "start", "", "end", "(ZII)V", "getEnd", "()I", "getStart", "getSwitch", "()Z", "component1", "component2", "component3", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class BpUI {
        private final int end;
        private final int start;
        private final boolean switch;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel.BpUI copy$default(com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel.BpUI bpUI, boolean z, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                z = bpUI.switch;
            }
            if ((i3 & 2) != 0) {
                i = bpUI.start;
            }
            if ((i3 & 4) != 0) {
                i2 = bpUI.end;
            }
            return bpUI.copy(z, i, i2);
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

        public final com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel.BpUI copy(boolean r2, int start, int end) {
            return new com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel.BpUI(r2, start, end);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel.BpUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel.BpUI bpUI = (com.qcwireless.qcwatch.ui.device.bp.BloodPressureViewModel.BpUI) other;
            return this.switch == bpUI.switch && this.start == bpUI.start && this.end == bpUI.end;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.switch;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((r0 * 31) + this.start) * 31) + this.end;
        }

        public java.lang.String toString() {
            return "BpUI(switch=" + this.switch + ", start=" + this.start + ", end=" + this.end + ')';
        }

        public BpUI(boolean z, int i, int i2) {
            this.switch = z;
            this.start = i;
            this.end = i2;
        }

        public final boolean getSwitch() {
            return this.switch;
        }

        public final int getStart() {
            return this.start;
        }

        public final int getEnd() {
            return this.end;
        }
    }
}
