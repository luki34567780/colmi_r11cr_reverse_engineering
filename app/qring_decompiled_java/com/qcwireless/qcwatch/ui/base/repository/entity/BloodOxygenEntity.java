package com.qcwireless.qcwatch.ui.base.repository.entity;

/* compiled from: BloodOxygenEntity.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016¨\u0006!"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/entity/BloodOxygenEntity;", "", "deviceAddress", "", "dateStr", "minArray", "maxArray", "unixTime", "", "sync", "", "lastSyncTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZJ)V", "getDateStr", "()Ljava/lang/String;", "setDateStr", "(Ljava/lang/String;)V", "getDeviceAddress", "setDeviceAddress", "getLastSyncTime", "()J", "setLastSyncTime", "(J)V", "getMaxArray", "setMaxArray", "getMinArray", "setMinArray", "getSync", "()Z", "setSync", "(Z)V", "getUnixTime", "setUnixTime", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BloodOxygenEntity {
    private java.lang.String dateStr;
    private java.lang.String deviceAddress;
    private long lastSyncTime;
    private java.lang.String maxArray;
    private java.lang.String minArray;
    private boolean sync;
    private long unixTime;

    public BloodOxygenEntity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, boolean z, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "deviceAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "dateStr");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "minArray");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "maxArray");
        this.deviceAddress = str;
        this.dateStr = str2;
        this.minArray = str3;
        this.maxArray = str4;
        this.unixTime = j;
        this.sync = z;
        this.lastSyncTime = j2;
    }

    public final java.lang.String getDeviceAddress() {
        return this.deviceAddress;
    }

    public final void setDeviceAddress(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceAddress = str;
    }

    public final java.lang.String getDateStr() {
        return this.dateStr;
    }

    public final void setDateStr(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateStr = str;
    }

    public final java.lang.String getMinArray() {
        return this.minArray;
    }

    public final void setMinArray(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.minArray = str;
    }

    public final java.lang.String getMaxArray() {
        return this.maxArray;
    }

    public final void setMaxArray(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.maxArray = str;
    }

    public final long getUnixTime() {
        return this.unixTime;
    }

    public final void setUnixTime(long j) {
        this.unixTime = j;
    }

    public final boolean getSync() {
        return this.sync;
    }

    public final void setSync(boolean z) {
        this.sync = z;
    }

    public final long getLastSyncTime() {
        return this.lastSyncTime;
    }

    public final void setLastSyncTime(long j) {
        this.lastSyncTime = j;
    }
}
