package com.qcwireless.qcwatch.ui.plate.bean;

/* compiled from: DeviceWatchFaceBean.kt */
@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/bean/DeviceWatchFaceBean;", "", "watchFace", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/WatchFace;", "delete", "", "(Lcom/qcwireless/qcwatch/ui/base/repository/entity/WatchFace;Z)V", "getDelete", "()Z", "getWatchFace", "()Lcom/qcwireless/qcwatch/ui/base/repository/entity/WatchFace;", "component1", "component2", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class DeviceWatchFaceBean {
    private final boolean delete;
    private final com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean copy$default(com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean deviceWatchFaceBean, com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            watchFace = deviceWatchFaceBean.watchFace;
        }
        if ((i & 2) != 0) {
            z = deviceWatchFaceBean.delete;
        }
        return deviceWatchFaceBean.copy(watchFace, z);
    }

    /* renamed from: component1, reason: from getter */
    public final com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace getWatchFace() {
        return this.watchFace;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDelete() {
        return this.delete;
    }

    public final com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean copy(com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace, boolean delete) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFace, "watchFace");
        return new com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean(watchFace, delete);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean deviceWatchFaceBean = (com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.watchFace, deviceWatchFaceBean.watchFace) && this.delete == deviceWatchFaceBean.delete;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.watchFace.hashCode() * 31;
        boolean z = this.delete;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public java.lang.String toString() {
        return "DeviceWatchFaceBean(watchFace=" + this.watchFace + ", delete=" + this.delete + ')';
    }

    public DeviceWatchFaceBean(com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFace, "watchFace");
        this.watchFace = watchFace;
        this.delete = z;
    }

    public final boolean getDelete() {
        return this.delete;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace getWatchFace() {
        return this.watchFace;
    }
}
