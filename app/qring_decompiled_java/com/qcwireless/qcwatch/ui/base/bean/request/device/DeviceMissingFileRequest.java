package com.qcwireless.qcwatch.ui.base.bean.request.device;

/* compiled from: DeviceMissingFileRequest.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/request/device/DeviceMissingFileRequest;", "", "fileNameList", "", "", "(Ljava/util/List;)V", "getFileNameList", "()Ljava/util/List;", "setFileNameList", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class DeviceMissingFileRequest {
    private java.util.List<java.lang.String> fileNameList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.bean.request.device.DeviceMissingFileRequest copy$default(com.qcwireless.qcwatch.ui.base.bean.request.device.DeviceMissingFileRequest deviceMissingFileRequest, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = deviceMissingFileRequest.fileNameList;
        }
        return deviceMissingFileRequest.copy(list);
    }

    public final java.util.List<java.lang.String> component1() {
        return this.fileNameList;
    }

    public final com.qcwireless.qcwatch.ui.base.bean.request.device.DeviceMissingFileRequest copy(java.util.List<java.lang.String> fileNameList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileNameList, "fileNameList");
        return new com.qcwireless.qcwatch.ui.base.bean.request.device.DeviceMissingFileRequest(fileNameList);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.qcwireless.qcwatch.ui.base.bean.request.device.DeviceMissingFileRequest) && kotlin.jvm.internal.Intrinsics.areEqual(this.fileNameList, ((com.qcwireless.qcwatch.ui.base.bean.request.device.DeviceMissingFileRequest) other).fileNameList);
    }

    public int hashCode() {
        return this.fileNameList.hashCode();
    }

    public java.lang.String toString() {
        return "DeviceMissingFileRequest(fileNameList=" + this.fileNameList + ')';
    }

    public DeviceMissingFileRequest(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "fileNameList");
        this.fileNameList = list;
    }

    public final java.util.List<java.lang.String> getFileNameList() {
        return this.fileNameList;
    }

    public final void setFileNameList(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.fileNameList = list;
    }
}
