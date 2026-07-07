package com.qcwireless.qcwatch.ui.base.bean.response.healthy;

/* compiled from: TemperatureDownResp.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/response/healthy/TemperatureDownResp;", "", "()V", "dateStr", "", "getDateStr", "()Ljava/lang/String;", "setDateStr", "(Ljava/lang/String;)V", "deviceAddress", "getDeviceAddress", "setDeviceAddress", "deviceName", "getDeviceName", "setDeviceName", "temperatures", "", "", "getTemperatures", "()Ljava/util/List;", "setTemperatures", "(Ljava/util/List;)V", "uid", "", "getUid", "()J", "setUid", "(J)V", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class TemperatureDownResp {
    private java.lang.String deviceAddress;
    private java.lang.String deviceName;
    private long uid;
    private java.lang.String dateStr = "";
    private java.util.List<java.lang.Float> temperatures = new java.util.ArrayList();

    public final long getUid() {
        return this.uid;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    public final java.lang.String getDeviceAddress() {
        return this.deviceAddress;
    }

    public final void setDeviceAddress(java.lang.String str) {
        this.deviceAddress = str;
    }

    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    public final void setDeviceName(java.lang.String str) {
        this.deviceName = str;
    }

    public final java.lang.String getDateStr() {
        return this.dateStr;
    }

    public final void setDateStr(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateStr = str;
    }

    public final java.util.List<java.lang.Float> getTemperatures() {
        return this.temperatures;
    }

    public final void setTemperatures(java.util.List<java.lang.Float> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.temperatures = list;
    }
}
