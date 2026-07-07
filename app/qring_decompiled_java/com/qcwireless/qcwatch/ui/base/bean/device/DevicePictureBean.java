package com.qcwireless.qcwatch.ui.base.bean.device;

/* compiled from: DevicePictureBean.kt */
@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/device/DevicePictureBean;", "", "hardVersion", "", "pictureUrl", "localUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHardVersion", "()Ljava/lang/String;", "getLocalUrl", "getPictureUrl", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class DevicePictureBean {
    private final java.lang.String hardVersion;
    private final java.lang.String localUrl;
    private final java.lang.String pictureUrl;

    public static /* synthetic */ com.qcwireless.qcwatch.ui.base.bean.device.DevicePictureBean copy$default(com.qcwireless.qcwatch.ui.base.bean.device.DevicePictureBean devicePictureBean, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = devicePictureBean.hardVersion;
        }
        if ((i & 2) != 0) {
            str2 = devicePictureBean.pictureUrl;
        }
        if ((i & 4) != 0) {
            str3 = devicePictureBean.localUrl;
        }
        return devicePictureBean.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getHardVersion() {
        return this.hardVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPictureUrl() {
        return this.pictureUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLocalUrl() {
        return this.localUrl;
    }

    public final com.qcwireless.qcwatch.ui.base.bean.device.DevicePictureBean copy(java.lang.String hardVersion, java.lang.String pictureUrl, java.lang.String localUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hardVersion, "hardVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pictureUrl, "pictureUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localUrl, "localUrl");
        return new com.qcwireless.qcwatch.ui.base.bean.device.DevicePictureBean(hardVersion, pictureUrl, localUrl);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.qcwireless.qcwatch.ui.base.bean.device.DevicePictureBean)) {
            return false;
        }
        com.qcwireless.qcwatch.ui.base.bean.device.DevicePictureBean devicePictureBean = (com.qcwireless.qcwatch.ui.base.bean.device.DevicePictureBean) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.hardVersion, devicePictureBean.hardVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.pictureUrl, devicePictureBean.pictureUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.localUrl, devicePictureBean.localUrl);
    }

    public int hashCode() {
        return (((this.hardVersion.hashCode() * 31) + this.pictureUrl.hashCode()) * 31) + this.localUrl.hashCode();
    }

    public java.lang.String toString() {
        return "DevicePictureBean(hardVersion=" + this.hardVersion + ", pictureUrl=" + this.pictureUrl + ", localUrl=" + this.localUrl + ')';
    }

    public DevicePictureBean(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "hardVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "pictureUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "localUrl");
        this.hardVersion = str;
        this.pictureUrl = str2;
        this.localUrl = str3;
    }

    public final java.lang.String getHardVersion() {
        return this.hardVersion;
    }

    public final java.lang.String getLocalUrl() {
        return this.localUrl;
    }

    public final java.lang.String getPictureUrl() {
        return this.pictureUrl;
    }
}
