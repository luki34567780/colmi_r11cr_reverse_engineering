package com.qcwireless.qcwatch.ui.base.repository.entity;

/* compiled from: PressureManualEntity.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/entity/PressureManualEntity;", "", "mac", "", "dateStr", "pressure", "", "timestamp", "(Ljava/lang/String;Ljava/lang/String;II)V", "getDateStr", "()Ljava/lang/String;", "setDateStr", "(Ljava/lang/String;)V", "getMac", "setMac", "getPressure", "()I", "setPressure", "(I)V", "getTimestamp", "setTimestamp", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class PressureManualEntity {
    private java.lang.String dateStr;
    private java.lang.String mac;
    private int pressure;
    private int timestamp;

    public PressureManualEntity(java.lang.String str, java.lang.String str2, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "dateStr");
        this.mac = str;
        this.dateStr = str2;
        this.pressure = i;
        this.timestamp = i2;
    }

    public final java.lang.String getMac() {
        return this.mac;
    }

    public final void setMac(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mac = str;
    }

    public final java.lang.String getDateStr() {
        return this.dateStr;
    }

    public final void setDateStr(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateStr = str;
    }

    public final int getPressure() {
        return this.pressure;
    }

    public final void setPressure(int i) {
        this.pressure = i;
    }

    public final int getTimestamp() {
        return this.timestamp;
    }

    public final void setTimestamp(int i) {
        this.timestamp = i;
    }
}
