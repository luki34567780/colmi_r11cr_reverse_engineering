package com.qcwireless.qcwatch.ui.device.connect.bean;

/* compiled from: SmartWatch.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/connect/bean/SmartWatch;", "", "deviceName", "", "deviceAddress", "rssi", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getDeviceAddress", "()Ljava/lang/String;", "setDeviceAddress", "(Ljava/lang/String;)V", "getDeviceName", "setDeviceName", "getRssi", "()I", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class SmartWatch {
    private java.lang.String deviceAddress;
    private java.lang.String deviceName;
    private final int rssi;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch copy$default(com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch smartWatch, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = smartWatch.deviceName;
        }
        if ((i2 & 2) != 0) {
            str2 = smartWatch.deviceAddress;
        }
        if ((i2 & 4) != 0) {
            i = smartWatch.rssi;
        }
        return smartWatch.copy(str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDeviceAddress() {
        return this.deviceAddress;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRssi() {
        return this.rssi;
    }

    public final com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch copy(java.lang.String deviceName, java.lang.String deviceAddress, int rssi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        return new com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch(deviceName, deviceAddress, rssi);
    }

    public java.lang.String toString() {
        return "SmartWatch(deviceName=" + this.deviceName + ", deviceAddress=" + this.deviceAddress + ", rssi=" + this.rssi + ')';
    }

    public SmartWatch(java.lang.String str, java.lang.String str2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "deviceName");
        this.deviceName = str;
        this.deviceAddress = str2;
        this.rssi = i;
    }

    public /* synthetic */ SmartWatch(java.lang.String str, java.lang.String str2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, str2, i);
    }

    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    public final void setDeviceName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceName = str;
    }

    public final java.lang.String getDeviceAddress() {
        return this.deviceAddress;
    }

    public final void setDeviceAddress(java.lang.String str) {
        this.deviceAddress = str;
    }

    public final int getRssi() {
        return this.rssi;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        java.util.Objects.requireNonNull(other, "null cannot be cast to non-null type com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch");
        com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch smartWatch = (com.qcwireless.qcwatch.ui.device.connect.bean.SmartWatch) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceName, smartWatch.deviceName) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceAddress, smartWatch.deviceAddress);
    }

    public int hashCode() {
        int hashCode = this.deviceName.hashCode() * 31;
        java.lang.String str = this.deviceAddress;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
