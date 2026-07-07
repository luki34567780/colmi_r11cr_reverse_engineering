package com.qcwireless.qcwatch.ui.base.repository.entity;

/* compiled from: SleepDetail.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003JO\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0006HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00060"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/entity/SleepDetail;", "", "deviceAddress", "", "dateStr", "intervar", "", "index_str", "quality", "sync", "", "lastSyncTime", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZJ)V", "getDateStr", "()Ljava/lang/String;", "setDateStr", "(Ljava/lang/String;)V", "getDeviceAddress", "setDeviceAddress", "getIndex_str", "setIndex_str", "getIntervar", "()I", "setIntervar", "(I)V", "getLastSyncTime", "()J", "setLastSyncTime", "(J)V", "getQuality", "setQuality", "getSync", "()Z", "setSync", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class SleepDetail {
    private java.lang.String dateStr;
    private java.lang.String deviceAddress;
    private java.lang.String index_str;
    private int intervar;
    private long lastSyncTime;
    private java.lang.String quality;
    private boolean sync;

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDeviceAddress() {
        return this.deviceAddress;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDateStr() {
        return this.dateStr;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIntervar() {
        return this.intervar;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getIndex_str() {
        return this.index_str;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getQuality() {
        return this.quality;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSync() {
        return this.sync;
    }

    /* renamed from: component7, reason: from getter */
    public final long getLastSyncTime() {
        return this.lastSyncTime;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail copy(java.lang.String deviceAddress, java.lang.String dateStr, int intervar, java.lang.String index_str, java.lang.String quality, boolean sync, long lastSyncTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateStr, "dateStr");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(index_str, "index_str");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quality, "quality");
        return new com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail(deviceAddress, dateStr, intervar, index_str, quality, sync, lastSyncTime);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail sleepDetail = (com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceAddress, sleepDetail.deviceAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateStr, sleepDetail.dateStr) && this.intervar == sleepDetail.intervar && kotlin.jvm.internal.Intrinsics.areEqual(this.index_str, sleepDetail.index_str) && kotlin.jvm.internal.Intrinsics.areEqual(this.quality, sleepDetail.quality) && this.sync == sleepDetail.sync && this.lastSyncTime == sleepDetail.lastSyncTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.deviceAddress.hashCode() * 31) + this.dateStr.hashCode()) * 31) + this.intervar) * 31) + this.index_str.hashCode()) * 31) + this.quality.hashCode()) * 31;
        boolean z = this.sync;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + com.qcwireless.qcwatch.ui.base.bean.request.collection.CollectionRequest$$ExternalSyntheticBackport0.m(this.lastSyncTime);
    }

    public java.lang.String toString() {
        return "SleepDetail(deviceAddress=" + this.deviceAddress + ", dateStr=" + this.dateStr + ", intervar=" + this.intervar + ", index_str=" + this.index_str + ", quality=" + this.quality + ", sync=" + this.sync + ", lastSyncTime=" + this.lastSyncTime + ')';
    }

    public SleepDetail(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, boolean z, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "deviceAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "dateStr");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "index_str");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "quality");
        this.deviceAddress = str;
        this.dateStr = str2;
        this.intervar = i;
        this.index_str = str3;
        this.quality = str4;
        this.sync = z;
        this.lastSyncTime = j;
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

    public final int getIntervar() {
        return this.intervar;
    }

    public final void setIntervar(int i) {
        this.intervar = i;
    }

    public final java.lang.String getIndex_str() {
        return this.index_str;
    }

    public final void setIndex_str(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.index_str = str;
    }

    public final java.lang.String getQuality() {
        return this.quality;
    }

    public final void setQuality(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.quality = str;
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
