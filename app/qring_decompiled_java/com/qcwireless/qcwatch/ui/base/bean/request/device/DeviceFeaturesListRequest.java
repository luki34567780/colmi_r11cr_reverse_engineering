package com.qcwireless.qcwatch.ui.base.bean.request.device;

/* compiled from: DeviceFeaturesListRequest.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/request/device/DeviceFeaturesListRequest;", "", "hardwareVersion", "", "romVersion", "(Ljava/lang/String;Ljava/lang/String;)V", "getHardwareVersion", "()Ljava/lang/String;", "getRomVersion", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class DeviceFeaturesListRequest {
    private final java.lang.String hardwareVersion;
    private final java.lang.String romVersion;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.bean.request.device.DeviceFeaturesListRequest copy$default(com.qcwireless.qcwatch.ui.base.bean.request.device.DeviceFeaturesListRequest deviceFeaturesListRequest, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = deviceFeaturesListRequest.hardwareVersion;
        }
        if ((i & 2) != 0) {
            str2 = deviceFeaturesListRequest.romVersion;
        }
        return deviceFeaturesListRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getHardwareVersion() {
        return this.hardwareVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRomVersion() {
        return this.romVersion;
    }

    public final com.qcwireless.qcwatch.ui.base.bean.request.device.DeviceFeaturesListRequest copy(java.lang.String hardwareVersion, java.lang.String romVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(romVersion, "romVersion");
        return new com.qcwireless.qcwatch.ui.base.bean.request.device.DeviceFeaturesListRequest(hardwareVersion, romVersion);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.bean.request.device.DeviceFeaturesListRequest)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.bean.request.device.DeviceFeaturesListRequest deviceFeaturesListRequest = (com.qcwireless.qcwatch.ui.base.bean.request.device.DeviceFeaturesListRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.hardwareVersion, deviceFeaturesListRequest.hardwareVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.romVersion, deviceFeaturesListRequest.romVersion);
    }

    public int hashCode() {
        return (this.hardwareVersion.hashCode() * 31) + this.romVersion.hashCode();
    }

    public java.lang.String toString() {
        return "DeviceFeaturesListRequest(hardwareVersion=" + this.hardwareVersion + ", romVersion=" + this.romVersion + ')';
    }

    public DeviceFeaturesListRequest(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "hardwareVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "romVersion");
        this.hardwareVersion = str;
        this.romVersion = str2;
    }

    public final java.lang.String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public final java.lang.String getRomVersion() {
        return this.romVersion;
    }
}
