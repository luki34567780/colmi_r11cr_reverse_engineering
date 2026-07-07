package com.qcwireless.qcwatch.ui.base.bean.response.device;

/* compiled from: DevicePictureResp.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/response/device/DevicePictureResp;", "", "hardVersion", "", "pictureUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getHardVersion", "()Ljava/lang/String;", "getPictureUrl", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class DevicePictureResp {
    private final java.lang.String hardVersion;
    private final java.lang.String pictureUrl;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.bean.response.device.DevicePictureResp copy$default(com.qcwireless.qcwatch.ui.base.bean.response.device.DevicePictureResp devicePictureResp, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = devicePictureResp.hardVersion;
        }
        if ((i & 2) != 0) {
            str2 = devicePictureResp.pictureUrl;
        }
        return devicePictureResp.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getHardVersion() {
        return this.hardVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPictureUrl() {
        return this.pictureUrl;
    }

    public final com.qcwireless.qcwatch.ui.base.bean.response.device.DevicePictureResp copy(java.lang.String hardVersion, java.lang.String pictureUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hardVersion, "hardVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pictureUrl, "pictureUrl");
        return new com.qcwireless.qcwatch.ui.base.bean.response.device.DevicePictureResp(hardVersion, pictureUrl);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.bean.response.device.DevicePictureResp)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.bean.response.device.DevicePictureResp devicePictureResp = (com.qcwireless.qcwatch.ui.base.bean.response.device.DevicePictureResp) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.hardVersion, devicePictureResp.hardVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.pictureUrl, devicePictureResp.pictureUrl);
    }

    public int hashCode() {
        return (this.hardVersion.hashCode() * 31) + this.pictureUrl.hashCode();
    }

    public java.lang.String toString() {
        return "DevicePictureResp(hardVersion=" + this.hardVersion + ", pictureUrl=" + this.pictureUrl + ')';
    }

    public DevicePictureResp(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "hardVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "pictureUrl");
        this.hardVersion = str;
        this.pictureUrl = str2;
    }

    public final java.lang.String getHardVersion() {
        return this.hardVersion;
    }

    public final java.lang.String getPictureUrl() {
        return this.pictureUrl;
    }
}
