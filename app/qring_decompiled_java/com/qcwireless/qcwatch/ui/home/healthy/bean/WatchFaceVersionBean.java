package com.qcwireless.qcwatch.ui.home.healthy.bean;

/* compiled from: WatchFaceVersionBean.kt */
@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/bean/WatchFaceVersionBean;", "", "hardwareVersion", "", "version", "(Ljava/lang/String;Ljava/lang/String;)V", "getHardwareVersion", "()Ljava/lang/String;", "setHardwareVersion", "(Ljava/lang/String;)V", "getVersion", "setVersion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WatchFaceVersionBean {
    private java.lang.String hardwareVersion;
    private java.lang.String version;

    public WatchFaceVersionBean(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "hardwareVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "version");
        this.hardwareVersion = "";
        this.version = "0";
        this.hardwareVersion = str;
        this.version = str2;
    }

    public final java.lang.String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public final void setHardwareVersion(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.hardwareVersion = str;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final void setVersion(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }
}
