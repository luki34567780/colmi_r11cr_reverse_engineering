package com.qcwireless.qcwatch.ui.base.bean.request.healthy;

/* compiled from: HealthyDataDownRequest.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/request/healthy/HealthyDataDownRequest;", "", "uid", "", "from", "size", "", "(JJI)V", "getFrom", "()J", "getSize", "()I", "getUid", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class HealthyDataDownRequest {
    private final long from;
    private final int size;
    private final long uid;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.bean.request.healthy.HealthyDataDownRequest copy$default(com.qcwireless.qcwatch.ui.base.bean.request.healthy.HealthyDataDownRequest healthyDataDownRequest, long j, long j2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j = healthyDataDownRequest.uid;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = healthyDataDownRequest.from;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = healthyDataDownRequest.size;
        }
        return healthyDataDownRequest.copy(j3, j4, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final long getFrom() {
        return this.from;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final com.qcwireless.qcwatch.ui.base.bean.request.healthy.HealthyDataDownRequest copy(long uid, long from, int size) {
        return new com.qcwireless.qcwatch.ui.base.bean.request.healthy.HealthyDataDownRequest(uid, from, size);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.bean.request.healthy.HealthyDataDownRequest)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.bean.request.healthy.HealthyDataDownRequest healthyDataDownRequest = (com.qcwireless.qcwatch.ui.base.bean.request.healthy.HealthyDataDownRequest) other;
        return this.uid == healthyDataDownRequest.uid && this.from == healthyDataDownRequest.from && this.size == healthyDataDownRequest.size;
    }

    public int hashCode() {
        return (((com.qcwireless.qcwatch.ui.base.bean.request.collection.CollectionRequest$$ExternalSyntheticBackport0.m(this.uid) * 31) + com.qcwireless.qcwatch.ui.base.bean.request.collection.CollectionRequest$$ExternalSyntheticBackport0.m(this.from)) * 31) + this.size;
    }

    public java.lang.String toString() {
        return "HealthyDataDownRequest(uid=" + this.uid + ", from=" + this.from + ", size=" + this.size + ')';
    }

    public HealthyDataDownRequest(long j, long j2, int i) {
        this.uid = j;
        this.from = j2;
        this.size = i;
    }

    public final long getFrom() {
        return this.from;
    }

    public final int getSize() {
        return this.size;
    }

    public final long getUid() {
        return this.uid;
    }
}
